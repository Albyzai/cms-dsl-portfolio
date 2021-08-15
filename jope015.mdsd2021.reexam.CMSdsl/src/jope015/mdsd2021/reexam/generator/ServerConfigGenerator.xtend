package jope015.mdsd2021.reexam.generator


import org.eclipse.xtext.generator.IFileSystemAccess2
import jope015.mdsd2021.reexam.cMSdsl.DBConfig
import jope015.mdsd2021.reexam.cMSdsl.DBDecl
import jope015.mdsd2021.reexam.cMSdsl.Lib
import jope015.mdsd2021.reexam.cMSdsl.Host
import jope015.mdsd2021.reexam.cMSdsl.Port
import jope015.mdsd2021.reexam.cMSdsl.Dialect
import jope015.mdsd2021.reexam.cMSdsl.User
import jope015.mdsd2021.reexam.cMSdsl.Pass

class ServerConfigGenerator {
	val path = "config/"
	
	def generate(DBConfig dbConf, String basePath, IFileSystemAccess2 fsa){
		fsa.generateFile(basePath + path + 'config.json', dbConf.compileConf)
	}
	
	
	def compileConf(DBConfig dbConf)
	'''
		«IF dbConf !== null»
			{
				  "development": {
				  	«FOR decl: dbConf.config»
				  		«decl.compile»«IF dbConf.config.last !== decl»,«ENDIF»
				  	«ENDFOR»
				  },
				  "test": {
				    «FOR decl: dbConf.config»
				    	«decl.compile»«IF dbConf.config.last !== decl»,«ENDIF»
				    «ENDFOR»
				  },
				  "production": {
				    «FOR decl: dbConf.config»
				    	«decl.compile»«IF dbConf.config.last !== decl»,«ENDIF»
				    «ENDFOR»
				  }
			}
			«ENDIF»
		
	'''
		
	def dispatch compile(Lib lib)'''"«lib.type.toString»" : "«lib.value»"'''
	
	def dispatch compile(Host host)'''"«host.type.toString»": "«host.value»"'''
	
	def dispatch compile(Port port)'''"«port.type.toString»": «port.value»'''
	
	def dispatch compile(Dialect dial)'''"«dial.type.toString»": "«dial.value»"'''
	
	def dispatch compile(User user)'''"«user.type.toString»": "«user.value»"'''
	
	def dispatch compile(Pass pass)'''"«pass.type.toString»": "«pass.value»"'''
	

}
