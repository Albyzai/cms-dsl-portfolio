package jope015.mdsd2021.reexam.generator

import jope015.mdsd2021.reexam.cMSdsl.Entity
import org.eclipse.xtext.generator.IFileSystemAccess2
import javax.inject.Inject
import jope015.mdsd2021.reexam.util.CMSdslUtil
import jope015.mdsd2021.reexam.cMSdsl.ValidatorUse
import jope015.mdsd2021.reexam.cMSdsl.DataType
import jope015.mdsd2021.reexam.cMSdsl.Str
import jope015.mdsd2021.reexam.cMSdsl.Integ
import jope015.mdsd2021.reexam.cMSdsl.Bool
import jope015.mdsd2021.reexam.cMSdsl.Field
import jope015.mdsd2021.reexam.cMSdsl.ParameterUse

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
		«FOR f: e.fields»
			«FOR v: f.getValidators(e)»
				«v.compile»
			«ENDFOR»
		«ENDFOR»
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
	'''
	
	def compile(ValidatorUse usage) {
		val validator = usage.validator
		val params = validator.params
		val args = usage.args
		
		val expression = validator.comparison
		for(var i = 0; i < args.length; i++) {
			val arg = args.get(i)
			val param = params.get(i)
			
			if(arg.type == param.type) {
				
			}
		}
	}
	
	def compile(DataType type){
		switch type {
			Str: '''DataTypes.STRING'''
			Integ: '''DataTypes.INTEGER'''
			Bool: '''DataTypes.BOOLEAN'''
		}
	}
	
	def getValidators(Field f, Entity e) {
		//	should return validators
		//	that makes use of the specified field
		val check = e.members.filter(ValidatorUse)
		check.filter[ c | c.args.contains(f)]
	}
	
	def dispatch compute(ParameterUse paramUse){
		paramUse.ref.type 
	}
	
}
	
