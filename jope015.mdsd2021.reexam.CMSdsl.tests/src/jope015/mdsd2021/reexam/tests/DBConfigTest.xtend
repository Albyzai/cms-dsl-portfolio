package jope015.mdsd2021.reexam.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.InjectWith
import org.junit.jupiter.api.Test
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import jope015.mdsd2021.reexam.cMSdsl.Project
import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage
import jope015.mdsd2021.reexam.validation.DBConfigValidator

@ExtendWith(InjectionExtension)
@InjectWith(CMSdslInjectorProvider)
class DBConfigTest {
	
	@Inject extension ParseHelper<Project>
	@Inject extension ValidationTestHelper



	

	/*********************
	* TESTS OF VALIDATOR *
	*********************/
 
 	@Test
	def void testErrorWhenProjectNotContainDBConfig() {
		
		'''
			project BlogExample:
				
				entity test:
					nameTest	
				
			
		'''.parse => [
			assertError(CMSdslPackage.eINSTANCE.project,
				DBConfigValidator.MISSING_DB_CONFIG,
				'No database configuration is declared, database = ' + null
			)	
		]
	}
	
	
	@Test
	def void testNoErrorWhenProjectContainDBConfig() {
		'''
		project BlogExample:
			database:
					
				
			
			
			
		'''.parse => [assertNoError(DBConfigValidator.MISSING_DB_CONFIG)]
	}
	
	
	@Test
	def void testErrorWhenDuplicateDBDecl() {
		'''
		project BlogExample:
			database:
				port: 5230
				port: 5230
			
		'''.parse => [
			assertError(CMSdslPackage.eINSTANCE.DBDecl,  DBConfigValidator.DUPLICATE_DB_DECL)
		]
	}
	
		
}