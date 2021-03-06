package jope015.mdsd2021.reexam.typing

import jope015.mdsd2021.reexam.cMSdsl.Expression
import jope015.mdsd2021.reexam.cMSdsl.Str
import jope015.mdsd2021.reexam.cMSdsl.Integ
import jope015.mdsd2021.reexam.cMSdsl.Bool
import jope015.mdsd2021.reexam.cMSdsl.Minus
import jope015.mdsd2021.reexam.cMSdsl.Comparison
import jope015.mdsd2021.reexam.cMSdsl.Or
import jope015.mdsd2021.reexam.cMSdsl.And
import jope015.mdsd2021.reexam.cMSdsl.Equality
import jope015.mdsd2021.reexam.cMSdsl.Plus
import jope015.mdsd2021.reexam.cMSdsl.Num
import jope015.mdsd2021.reexam.cMSdsl.Mul
import jope015.mdsd2021.reexam.cMSdsl.Div
import jope015.mdsd2021.reexam.cMSdsl.ParamOrArgUse
import jope015.mdsd2021.reexam.cMSdsl.Parameter

class TypeComputer {

	public static val STRING_TYPE = new StringType
	public static val BOOL_TYPE = new BooleanType
	public static val NUMBER_TYPE = new NumberType
	public static val DATE_TYPE = new DateType

	def isStringType(ExpressionsType type) { type === STRING_TYPE }

	def isBoolType(ExpressionsType type) { type === BOOL_TYPE }

	def isNumberType(ExpressionsType type) { type === NUMBER_TYPE }

	def typeForDataType(String dt) {

		switch dt {
			case 'bool': BOOL_TYPE
			case 'float': NUMBER_TYPE
			case 'int': NUMBER_TYPE
			case 'string': STRING_TYPE
			case 'date': DATE_TYPE
			case 'long': NUMBER_TYPE
		}
	}

	def dispatch typeFor(Expression e) {
		switch e {
			Str:
				STRING_TYPE
			Integ:
				NUMBER_TYPE
			Bool:
				BOOL_TYPE
			Num:
				NUMBER_TYPE
			Mul:
				NUMBER_TYPE
			Div:
				NUMBER_TYPE
			Minus:
				NUMBER_TYPE
			Comparison:
				BOOL_TYPE
			Or:
				BOOL_TYPE
			And:
				BOOL_TYPE
			Equality:
				BOOL_TYPE
			ParamOrArgUse: {
				if (e.ref instanceof Parameter) {
					switch e.ref.type {
						Str: STRING_TYPE
						Integ: NUMBER_TYPE
						Bool: BOOL_TYPE
					}
				} else {
					System.out.println('is arg use')
				}
			}
		}
	}

	def dispatch ExpressionsType typeFor(Plus e) {
		val leftType = e.left.typeFor
		val rightType = e.right?.typeFor

		if(leftType.isStringType || rightType.isStringType) STRING_TYPE else NUMBER_TYPE
	}

//	def dispatch ExpressionsType typeFor(ParameterUse paramUse) {
//		
//		switch paramUse.ref.type {
//			Str: STRING_TYPE
//			Integ: NUMBER_TYPE
//			Bool: BOOL_TYPE
//		}
//	}
}
