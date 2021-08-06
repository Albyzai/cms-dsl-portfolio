package jope015.mdsd2021.reexam.tests

import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import jope015.mdsd2021.reexam.typing.ExpressionsType
import jope015.mdsd2021.reexam.cMSdsl.Expression
import org.junit.jupiter.api.Assertions
import jope015.mdsd2021.reexam.typing.ExpressionsTypeComputer
import jope015.mdsd2021.reexam.cMSdsl.Validator
import jope015.mdsd2021.reexam.cMSdsl.Project
import jope015.mdsd2021.reexam.cMSdsl.Eval
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.InjectWith
import org.junit.jupiter.api.Test

@ExtendWith(InjectionExtension)
@InjectWith(CMSdslInjectorProvider)
class ExpressionsTypeComputerTest {
	@Inject extension ParseHelper<Project>
	@Inject extension ExpressionsTypeComputer
	
	@Test
	def testIntConstant() { 
		'''
		project BookStore:
			database:
				hostname: 'localhost'
				port: 2542
				dialect: 'postgres'
				library: 'sequelize'
				username: 'root'
				password: 'password'
			eval 2
			
		'''.assertType(ExpressionsTypeComputer.NUMBER_TYPE)
	
//		model.assertType(ExpressionsTypeComputer.NUMBER_TYPE)
	}
	
//	def assertEvalType(CharSequence input, ExpressionsType expectedType) {
//		("eval " + input).assertType(expectedType)
//	}
	
	def assertType(CharSequence input, ExpressionsType expectedType) {
		
		val ev = input.parse.elements.get(1) as Eval
		System.out.println('ev: ' + ev.toString)
	}
	
	def assertType(Expression e, ExpressionsType expectedType) {
		Assertions.assertSame(expectedType, e.typeFor)
	}

}