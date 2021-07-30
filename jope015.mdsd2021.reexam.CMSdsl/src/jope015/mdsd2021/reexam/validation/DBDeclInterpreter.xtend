package jope015.mdsd2021.reexam.validation

import jope015.mdsd2021.reexam.cMSdsl.Lib
import jope015.mdsd2021.reexam.cMSdsl.Host
import jope015.mdsd2021.reexam.cMSdsl.Port
import jope015.mdsd2021.reexam.cMSdsl.Dialect
import jope015.mdsd2021.reexam.cMSdsl.User
import jope015.mdsd2021.reexam.cMSdsl.Pass
import jope015.mdsd2021.reexam.cMSdsl.DBDecl

class DBDeclInterpreter {
	
	def interpretType(DBDecl decl) {
		switch decl {
			Lib: decl as Lib
			Host: decl as Host
			Port: decl as Port
			Dialect: decl as Dialect
			User: decl as User
			Pass: decl as Pass
		}
	}
}
