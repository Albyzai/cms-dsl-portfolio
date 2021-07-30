package jope015.mdsd2021.reexam.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import jope015.mdsd2021.reexam.cMSdsl.Project
import org.junit.jupiter.api.Test
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import jope015.mdsd2021.reexam.validation.CMSdslValidator
import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage

@ExtendWith(InjectionExtension)
@InjectWith(CMSdslInjectorProvider)

class CMSdslValidatorTest {
	
	@Inject extension ParseHelper<Project>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testWarningWhenProjectNameNotStartWithCapital() {
		'''
			project blogexample:
				
			
			
		'''.parse => [
			assertWarning(CMSdslPackage.eINSTANCE.project, CMSdslValidator.INVALID_NAME)
			
		]
	}
	
	
	@Test
	def void testNoWarningWhenProjectNameNotStartWithCapital() {
		'''
			project Blogexample {
				
			}
			
		'''.parse => [
			assertNoWarnings(CMSdslPackage.eINSTANCE.project, CMSdslValidator.INVALID_NAME)
		]
	}
	

	
	

	
}