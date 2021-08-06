package jope015.mdsd2021.reexam.typing

import jope015.mdsd2021.reexam.cMSdsl.Expression
import jope015.mdsd2021.reexam.cMSdsl.Str
import jope015.mdsd2021.reexam.cMSdsl.Integ
import jope015.mdsd2021.reexam.cMSdsl.Bool
import jope015.mdsd2021.reexam.cMSdsl.MulDiv
import jope015.mdsd2021.reexam.cMSdsl.Minus
import jope015.mdsd2021.reexam.cMSdsl.Comparison
import jope015.mdsd2021.reexam.cMSdsl.Or
import jope015.mdsd2021.reexam.cMSdsl.And
import jope015.mdsd2021.reexam.cMSdsl.Equality
import jope015.mdsd2021.reexam.cMSdsl.Plus
import jope015.mdsd2021.reexam.cMSdsl.ParameterUse
import jope015.mdsd2021.reexam.cMSdsl.Num

class ExpressionsTypeComputer {
	
	public static val STRING_TYPE = new StringType
	public static val BOOL_TYPE = new BooleanType
	public static val NUMBER_TYPE = new NumberType
	
	
	def isStringType(ExpressionsType type) { type === STRING_TYPE }
	
	def isBoolType(ExpressionsType type) { type === BOOL_TYPE }
	
	def isNumberType(ExpressionsType type ) { type === NUMBER_TYPE }
	
	def dispatch typeFor(Expression e) {
		switch e {
			Str: STRING_TYPE
			Integ: NUMBER_TYPE
			Bool: BOOL_TYPE
			Num: NUMBER_TYPE
			MulDiv: NUMBER_TYPE
			Minus: NUMBER_TYPE
			Comparison: BOOL_TYPE
			Or: BOOL_TYPE
			And: BOOL_TYPE
			Equality: BOOL_TYPE
			ParameterUse: {
				System.out.println('paramUse: ' + e.toString)
				switch e.ref.type {
					Str: STRING_TYPE
					Integ: NUMBER_TYPE
					Bool: BOOL_TYPE
				}
			}
		}
	}
	
	def dispatch ExpressionsType typeFor(Plus e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor
		
		if(leftType.isStringType || rightType.isStringType) STRING_TYPE
		else NUMBER_TYPE
	}
	
	def dispatch ExpressionsType typeFor(ParameterUse paramUse) {
		
		switch paramUse.ref.type {
			Str: STRING_TYPE
			Integ: NUMBER_TYPE
			Bool: BOOL_TYPE
		}
	}
}