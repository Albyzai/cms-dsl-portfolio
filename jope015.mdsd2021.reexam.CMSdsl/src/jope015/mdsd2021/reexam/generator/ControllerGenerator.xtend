package jope015.mdsd2021.reexam.generator

import jope015.mdsd2021.reexam.cMSdsl.Entity
import org.eclipse.xtext.generator.IFileSystemAccess2
import javax.inject.Inject
import jope015.mdsd2021.reexam.util.CMSdslUtil
import jope015.mdsd2021.reexam.cMSdsl.Relationship
class ControllerGenerator {
	
	@Inject extension CMSdslUtil
	
	public static val CONTROLLERS_PATH = "controllers/"
	public static val ROUTES_PATH = "routes/"
	public static val VALIDATORS_PATH = "validators/"
	
	def generateController(Entity e, String basePath, IFileSystemAccess2 fsa) {
		fsa.generateFile(basePath + CONTROLLERS_PATH + e.name.toFirstLower + '.controller.js', e.compileController)
		fsa.generateFile(basePath + ROUTES_PATH + e.name.toFirstLower + '.routes.js', e.compileRoutes)
	}
	

	private def compileController(Entity e)
		'''
		const { «e.name.toFirstUpper» «IF !e.relations.isEmpty», «ENDIF»«FOR r: e.relations»«r.entity.name.toFirstUpper» «IF e.relations.last !== r», «ENDIF»«ENDFOR» } = require('../models');
		«IF !e.getValidationChecksFor('server').isEmpty»
		const { validate } = require('../validators/«e.name.toFirstLower».validator')
		«ENDIF»
		
		module.exports.get = (req, res) => {
			«e.name.toFirstUpper».findAll()
				.then(«e.name.toFirstLower»s => res.json(«e.name.toFirstLower»s))
				.catch(err => console.log(err))
		}
			
		module.exports.create = (req, res) => {
			let {«FOR f: e.fields» «f.name»,«ENDFOR» } = req.body
			
		«IF !e.getValidationChecksFor('server').isEmpty»
			const errors = validate(req.body)
			if (errors.length > 0) {
				res.status(422).json({errors: errors})
				return	
			}
		«ENDIF»

			«e.name.toFirstUpper».create({
				«FOR f: e.fields»
					«f.name»,
				«ENDFOR»
			})
			.then(«e.name.toFirstLower» => res.json(«e.name.toFirstLower»))
			.catch(err => console.log(err))
		}
			
		module.exports.getById = (req, res) => {
			let { id } = req.params
				
			«e.name.toFirstUpper».findOne({
				where: { id: id },
				«e.relations.compileRel»
			})
			.then(data => {
				const «e.name.toFirstLower» = data.get({ plain: true })
				res.json(«e.name.toFirstLower»)
			})
			.catch(err => console.log(err))
		}
		'''
	
		def compileRoutes(Entity e)
			'''
			const express = require('express');
			const router = express.Router();
				
			const «e.name.toFirstUpper»Controller = require('../controllers/«e.name.toFirstLower».controller');
				
			router.get('/', «e.name.toFirstUpper»Controller.get);
				
			router.post('/', «e.name.toFirstUpper»Controller.create);
				
			router.get('/:id', «e.name.toFirstUpper»Controller.getById);
				
			module.exports = router;
			'''
	
		def  compileRel(Relationship[] rel){
			'''
			«IF !rel.isEmpty»
			include: [«FOR r: rel»«r.entity.name.toFirstUpper»«IF rel.last !== r»,«ENDIF»«ENDFOR»]
			«ENDIF»
			
			'''
		}
}
	
