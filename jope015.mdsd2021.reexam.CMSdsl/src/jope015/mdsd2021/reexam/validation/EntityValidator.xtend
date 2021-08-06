package jope015.mdsd2021.reexam.validation

import org.eclipse.xtext.validation.Check
import jope015.mdsd2021.reexam.cMSdsl.Entity
import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage
import jope015.mdsd2021.reexam.cMSdsl.Field
import jope015.mdsd2021.reexam.cMSdsl.ValidatorUse

class EntityValidator extends AbstractCMSdslValidator {
	
	
	@Check
	def checkEntityHasModel(Entity e) {
//		if(e.declarations === null) error('no datamodel defined for entity ' + e.name, CMSdslPackage.eINSTANCE.entity_Name)
		val fields = e.members.filter(Field)
//		if(fields.length == 0) error('no fields declared on entity ' + e.name, CMSdslPackage.eINSTANCE.entity_Name)
	}
	
	@Check
	def checkValidatorArgsAreCorrectType(ValidatorUse v) {
		val params = v.validator.params
		val args = v.args
		
		if(params.length != args.length) error('Number of arguments does not match number of parameters', CMSdslPackage.eINSTANCE.validatorUse_Args)
		else {
			for(var i = 0; i < params.length; i++){
				val param = params.get(i)
				val arg = args.get(i)
				val sameType = param.type.type == arg.type.type
				
				if(!sameType) {
					error(param.type.type + ' type is required, got: ' + arg.type.type, CMSdslPackage.eINSTANCE.validatorUse_Args)
				}
			}

		}
		System.out.println('checkValidatorArgs')
	}
	
}
