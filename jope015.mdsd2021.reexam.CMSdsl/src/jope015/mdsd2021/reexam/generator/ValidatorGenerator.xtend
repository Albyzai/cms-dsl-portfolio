package jope015.mdsd2021.reexam.generator

import jope015.mdsd2021.reexam.cMSdsl.Entity
import org.eclipse.xtext.generator.IFileSystemAccess2
import javax.inject.Inject
import jope015.mdsd2021.reexam.util.CMSdslUtil

class ValidatorGenerator {
	
	@Inject extension ExpressionsGenerator
	@Inject extension CMSdslUtil
	
	val path = 'validators/'
	val fileExtension = '.validator.js'
	
	def generateValidator(Entity e, String basePath, IFileSystemAccess2 fsa){
		if(!e.getValidationChecksFor('server').isEmpty) {
			fsa.generateFile(basePath + path + e.name.toFirstLower + fileExtension, e.compileValidator)
		}
	} 
	
	private def compileValidator(Entity e){
		val validationChecks = e.getValidationChecksFor('server')
		
		val validators = validationChecks.map[check | check.validator]
		
		'''
		
		«FOR v: validators»
		const «v.validator.name.toFirstLower» = («FOR param: v.args» «param.name» «IF v.args.last !== param»,«ENDIF» «ENDFOR») => «FOR check: validationChecks.filter[c | c.validator.validator === v.validator]» «check.validator.validator.comparison.generate(check)»«ENDFOR»
		«ENDFOR»
		
		module.exports.validate = (body) => {
			const errors = []
		
			«FOR v: validationChecks»
				«v.validator.validator.name.toFirstLower»(«FOR arg: v.validator.args»body.«arg.name», «ENDFOR»)
					? null 
					: errors.push({ location: '«FOR arg: v.validator.args»«arg.name»«IF v.validator.args.last !== arg»,«ENDIF»«ENDFOR»', msg: '«v.errrorMsg»'})
			«ENDFOR»
		
			return errors
		}
		
		'''
	}
}