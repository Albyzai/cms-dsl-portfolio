package jope015.mdsd2021.reexam.validation

import org.eclipse.xtext.validation.Check
import jope015.mdsd2021.reexam.cMSdsl.Project
import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage
import jope015.mdsd2021.reexam.cMSdsl.DBConfig
import jope015.mdsd2021.reexam.cMSdsl.DBDecl

class DBConfigValidator extends AbstractCMSdslValidator {
	
	public static val MISSING_DB_CONFIG = 'missingDatabaseConfig'
	public static val DUPLICATE_DB_DECL = 'duplicateDatabaseConfigDeclaration'
	public static val MISSING_DB_DECL = 'missingDatabaseConfigDeclaration'
			
			
	@Check
	def checkProjectContainsDBConfig(Project project) {
		System.out.println('project changed ' + project)
		val elements = project.elements;
		
		val dbConfig = elements.findFirst[ it instanceof DBConfig]
		System.out.println('dbConfig: ' + dbConfig)
		if(dbConfig === null){
			error('No database configuration is declared, database = ' + null,
				CMSdslPackage.eINSTANCE.project_Name,
				MISSING_DB_CONFIG
			)
		}
	}
	
	
	@Check()
	def checkNoDuplicatesInDBConfig(DBConfig dbConf){
		
		val declarations = dbConf.config

		for(d : declarations){
			val filtered = declarations.filter([DBDecl decl | decl.type == d.type])
			if(filtered.size > 1){
				error('database does only take one ' + filtered.last.type + ', remove any excess to fix the error', 
					filtered.last,
					CMSdslPackage.Literals.DB_DECL__TYPE,
					DUPLICATE_DB_DECL
				)
			}
		}
	}
	
	
	@Check()
	def checkRequiredInDBConfig(DBConfig dbConf) {
		
		val declarations = dbConf.config
		
		val host = declarations.filter([DBDecl decl | decl.type == 'hostname'])
		val lib = declarations.filter([DBDecl decl | decl.type == 'library'])
		val port = declarations.filter([DBDecl decl | decl.type == 'port'])
		val dialect = declarations.filter([DBDecl decl | decl.type == 'dialect'])
		val user = declarations.filter([DBDecl decl | decl.type == 'username'])
		
		if(host.isNullOrEmpty) {
			error("'hostname' field is required", dbConf , CMSdslPackage.Literals.DB_CONFIG__TYPE, MISSING_DB_DECL)
		}
		
		if(lib.isNullOrEmpty) {
			error("'library' field is required", dbConf ,CMSdslPackage.Literals.DB_CONFIG__TYPE, MISSING_DB_DECL)
		}
		
		if(port.isNullOrEmpty) {
			error("'port' field is required", dbConf, CMSdslPackage.Literals.DB_CONFIG__TYPE, MISSING_DB_DECL)
		}
		
		if(dialect.isNullOrEmpty) {
			error("'dialect' field is required", dbConf, CMSdslPackage.Literals.DB_CONFIG__TYPE, MISSING_DB_DECL)
		}
		
		if(user.isNullOrEmpty) {
			error("'username' field is required", dbConf, CMSdslPackage.Literals.DB_CONFIG__TYPE)
		}
	}
}