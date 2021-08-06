package jope015.mdsd2021.reexam.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.validation.Check
import jope015.mdsd2021.reexam.cMSdsl.Entity

@ExtendWith(InjectionExtension)
@InjectWith(CMSdslInjectorProvider)

class EntityValidatorTest {

	@Check
	def testEntityHasEntityModel(Entity e) {
//		if(e.model === null) error()
	}
}