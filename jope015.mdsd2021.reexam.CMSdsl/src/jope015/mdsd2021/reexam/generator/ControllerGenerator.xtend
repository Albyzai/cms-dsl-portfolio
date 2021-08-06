package jope015.mdsd2021.reexam.generator

import jope015.mdsd2021.reexam.cMSdsl.Entity
import org.eclipse.xtext.generator.IFileSystemAccess2
import javax.inject.Inject
import jope015.mdsd2021.reexam.util.CMSdslUtil

class ControllerGenerator {
	
	@Inject extension CMSdslUtil
	
	val path = "controllers/"
	def generateControllers(Entity[] entities, String basePath, IFileSystemAccess2 fsa) {
		for(Entity e: entities) {
			fsa.generateFile(basePath + path + e.name.toFirstUpper + "Controller.js", e.compileController)
		}
			
	}

	def compileController(Entity e)
	'''
	const { «e.name.toFirstUpper» } = require('../models');
		
	module.exports.create = (req, res) => {
		«e.name.toFirstUpper».findAll()
			.then(«e.name.toFirstLower»s => res.json(«e.name.toFirstLower»s))
			.catch(err => console.log(err))
	}
		
	module.exports.create = (req, res) => {
		let {«FOR f: e.fields» «f.name»,«ENDFOR» } = req.body
		«e.name.toFirstUpper».create({
			«FOR f: e.fields»
				«f.name»,
			«ENDFOR»
		})
		.then(«e.name.toFirstLower» => console.log(«e.name.toFirstLower»))
		.catch(err => console.log(err))
	}
		
	module.exports.getById = (req, res) => {
		let { id } = req.params
			
		«e.name.toFirstUpper».findOne({
			where: { id: id }
		})
		.then(«e.name.toFirstLower» => res.json(«e.name.toFirstLower»))
		.catch(err => console.log(err))
		}
	'''
	
		def compileRoutes(Entity e)'''
		const express = require('express');
		const router = express.Router();
		
		const «e.name.toFirstUpper»Controller = require('../controllers/«e.name.toFirstLower»');
		
		router.get('/', «e.name.toFirstUpper»Controller.get);
		
		router.post('/', «e.name.toFirstUpper»Controller.post);
		
		router.get('/:id', «e.name.toFirstUpper»Controller.getById);
		
		module.exports = router;
	'''}