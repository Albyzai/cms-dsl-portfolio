/*
 * generated by Xtext 2.22.0
 */
package jope015.mdsd2021.reexam.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage.Literals
import org.eclipse.xtext.EcoreUtil2
import java.util.ArrayList
import org.eclipse.xtext.scoping.Scopes
import jope015.mdsd2021.reexam.cMSdsl.Validator
import jope015.mdsd2021.reexam.cMSdsl.Parameter
import jope015.mdsd2021.reexam.cMSdsl.ParamOrArgUse

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class CMSdslScopeProvider extends AbstractCMSdslScopeProvider {
	
	override getScope(EObject context, EReference reference) {
		
//		System.out.println('getScope: ' + context.eClass.toString)
////			&& reference==Literals.Validator
//		
//		if(context instanceof ValidationCheck){
//			System.out.println('validationCheck')
//		}
//		
//		if(context instanceof Argument){
//			System.out.println('argument')
//		}
//
//		if(context instanceof ValidatorUse ) {
//			System.out.println('validatoruse REFERENCE ' + reference.eClass.toString)	
//			//	implement commented out code, if entity base class is implemented
//			// val seen = new HashSet<Entity>
//			var entity = EcoreUtil2.getContainerOfType(context, Entity)
//			val validatorUse = EcoreUtil2.getContainerOfType(context, ValidatorUse)
//			
//			
//			val parameters = validatorUse.validator.params
//			
//			val candidates = new ArrayList<Field>
//			while(entity !== null) {
//				//	if(seen.contains(entity) return super.getScope(context, reference)
////				System.out.println('entity model fields: ' + entity.model.fields)				
////				candidates.addAll(entity.model.fields)
////				entity = null
//				//	entity = entity.base
//			}
//			
////			return Scopes.scopeFor(candidates)
//		}
		
		if(context instanceof ParamOrArgUse && reference==Literals.PARAM_OR_ARG_USE__REF) {

			var validator = EcoreUtil2.getContainerOfType(context, Validator)
			
			val candidates = new ArrayList<Parameter>
			while(validator !== null) {
				candidates.addAll(validator.params)
				validator = null
			}
			
			return Scopes.scopeFor(candidates)
		}
			
		super.getScope(context, reference)
	}

}
