/*
 * generated by Xtext 2.22.0
 */
package jope015.mdsd2021.reexam.tests

import com.google.inject.Inject
import jope015.mdsd2021.reexam.cMSdsl.Project
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import jope015.mdsd2021.reexam.cMSdsl.DBConfig
import jope015.mdsd2021.reexam.cMSdsl.Host
import jope015.mdsd2021.reexam.cMSdsl.Port
import jope015.mdsd2021.reexam.cMSdsl.Dialect
import jope015.mdsd2021.reexam.cMSdsl.Lib
import jope015.mdsd2021.reexam.cMSdsl.User
import jope015.mdsd2021.reexam.cMSdsl.Pass
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import jope015.mdsd2021.reexam.cMSdsl.Entity
import jope015.mdsd2021.reexam.cMSdsl.FieldProp
import jope015.mdsd2021.reexam.cMSdsl.PropTest
import jope015.mdsd2021.reexam.cMSdsl.Def

@ExtendWith(InjectionExtension)
@InjectWith(CMSdslInjectorProvider)
class CMSdslParsingTest {
	
	@Inject extension ParseHelper<Project>
	@Inject extension ValidationTestHelper
	
	val modelImpl = 
			'''
			project BookStore:
					database:
						hostname: 'localhost'
						port: 2542
						dialect: 'postgres'
						library: 'sequelize'
						username: 'root'
						password: 'password'
						
					entity Book:
						string ISBN:
							default: 'testISBN'
			'''
	
	@Test
	def void testParsing() {
		val model = modelImpl.parse
		val dbConfig = model.elements.get(0) as DBConfig
		val bookEntity = model.elements.get(1) as Entity
		
		val host = dbConfig.config.get(0) as Host
		val port= dbConfig.config.get(1) as Port
		val dialect = dbConfig.config.get(2) as Dialect
		val lib = dbConfig.config.get(3) as Lib
		val user = dbConfig.config.get(4) as User
		val pass = dbConfig.config.get(5) as Pass
		
		
		//	check project name
		Assertions.assertEquals("BookStore", model.name)
		
		//	check database configuration
		Assertions.assertEquals("localhost", host.value)
		Assertions.assertEquals(2542, port.value)
		Assertions.assertEquals("postgres", dialect.value)
		Assertions.assertEquals("sequelize", lib.value)
		Assertions.assertEquals("root", user.value)
		Assertions.assertEquals("password", pass.value)
		
		//	check entity
		Assertions.assertEquals("Book", bookEntity.name)
		
		//	check field of Entity
		Assertions.assertEquals("string", bookEntity.model.fields.get(0).type.type)
		Assertions.assertEquals("ISBN", bookEntity.model.fields.get(0).name.toString)
		Assertions.assertEquals("default", bookEntity.model.fields.get(0).properties.get(0).type)
		Assertions.assertEquals("testISBN", bookEntity.model.fields.get(0).properties.get(0).value)	
		
	}
	
	@Test
	def void testCorrectParsing() {
		modelImpl.parse => [assertNoErrors]
	}
	

	def value(FieldProp p) {
		switch p {
			PropTest: p.value
			Def: p.value
		}
	}
	


}
