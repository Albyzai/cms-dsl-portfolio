package jope015.mdsd2021.reexam.util

import jope015.mdsd2021.reexam.cMSdsl.Project
import jope015.mdsd2021.reexam.cMSdsl.DBConfig
import jope015.mdsd2021.reexam.cMSdsl.Entity
import jope015.mdsd2021.reexam.cMSdsl.Validator
import jope015.mdsd2021.reexam.cMSdsl.Field
import jope015.mdsd2021.reexam.cMSdsl.ValidationCheck
import java.util.Date
import jope015.mdsd2021.reexam.cMSdsl.Str
import jope015.mdsd2021.reexam.cMSdsl.Dt
import jope015.mdsd2021.reexam.cMSdsl.Integ
import jope015.mdsd2021.reexam.cMSdsl.Flt
import jope015.mdsd2021.reexam.cMSdsl.Bool
import jope015.mdsd2021.reexam.cMSdsl.Parameter

class CMSdslUtil {
	
	def DBConfig databaseConfig (Project p) {
		p.elements.filter(DBConfig).head
	}
	
	def Iterable<Entity> entities(Project p) {
		 p.elements.filter(Entity)
	}
	
	def Iterable<Validator> validators(Project p) {
		p.elements.filter(Validator)
	}
	
	def Iterable<Field> fields(Entity e) {
		e.members.filter(Field)
	}
	
	def Iterable<ValidationCheck> validationChecks(Entity e) {
		e.members.filter(ValidationCheck)
	}
	
	def dataType(Field f) {
		switch f.type {
			case Str: String
			case Dt: Date
			case Integ: Integer
			case Flt: Float
			case Bool: Boolean
		}
	}
	
	def dataType(Parameter p) {
		switch p.type {
			case Str: String
			case Dt: Date
			case Integ: Integer
			case Flt: Float
			case Bool: Boolean
		}
	}
	

}