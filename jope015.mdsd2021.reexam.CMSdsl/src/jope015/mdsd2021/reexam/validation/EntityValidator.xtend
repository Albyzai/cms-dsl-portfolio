package jope015.mdsd2021.reexam.validation

import org.eclipse.xtext.validation.Check
import jope015.mdsd2021.reexam.cMSdsl.Entity
import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage
import jope015.mdsd2021.reexam.cMSdsl.Field
import jope015.mdsd2021.reexam.cMSdsl.ValidatorUse
import jope015.mdsd2021.reexam.cMSdsl.ValidationCheck
import jope015.mdsd2021.reexam.cMSdsl.Def
import javax.inject.Inject
import jope015.mdsd2021.reexam.typing.TypeComputer
import org.eclipse.xtext.EcoreUtil2
import jope015.mdsd2021.reexam.cMSdsl.Expression

class EntityValidator extends AbstractCMSdslValidator {
	
	@Inject extension TypeComputer
	
	@Check
	def checkEntityHasModel(Entity e) {
		val fields = e.members.filter(Field)
		if(fields.isEmpty) error('no fields are declared on entity ' + e.name, CMSdslPackage.eINSTANCE.entity_Name)
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
	}
	
	@Check
	def checkValidatorLocationNotMultipleSame(ValidationCheck v){
		System.out.println('validation: ' + v.toString)
		if(v.locations.size != 2){ return }
		if(v.locations.get(0).location != v.locations.get(1).location) { return }
		if(v.locations.get(1).location == 'client'){
			error('You cannot define validation for ´client´ more than once, consider removing, or replacing with ´client´', v , CMSdslPackage.eINSTANCE.validationCheck_Locations)
		} else {
			error('You cannot define validation check for ´server´ more than once, consider removing, or replacing with ´client´ ', v, CMSdslPackage.eINSTANCE.validationCheck_Locations)
		}
	}
	
	@Check
	def checkDefaultValueIsCorrectType(Def value){
		val type = value.value.typeFor
		System.out.println('type: ' + type)
		
		val container = EcoreUtil2::getContainerOfType(value, Field)
		System.out.println('container ' + container.type.type.typeForDataType)
		val containerType = container.type.type.typeForDataType
		
		if(type != containerType) error('default value is not of same type as its field, which has type ' + containerType.toString, value, CMSdslPackage.eINSTANCE.def_Value)
	}

}
