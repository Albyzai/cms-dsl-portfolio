package jope015.mdsd2021.reexam.interpreter

import jope015.mdsd2021.reexam.cMSdsl.Expression
import jope015.mdsd2021.reexam.cMSdsl.Num
import jope015.mdsd2021.reexam.cMSdsl.Str
import jope015.mdsd2021.reexam.cMSdsl.Bool
import jope015.mdsd2021.reexam.cMSdsl.And
import jope015.mdsd2021.reexam.cMSdsl.Or
import jope015.mdsd2021.reexam.cMSdsl.MulDiv
import jope015.mdsd2021.reexam.cMSdsl.Plus
import jope015.mdsd2021.reexam.cMSdsl.Minus
import jope015.mdsd2021.reexam.cMSdsl.Comparison
import jope015.mdsd2021.reexam.cMSdsl.Equality
import javax.inject.Inject
import jope015.mdsd2021.reexam.util.CMSdslUtil

class ExpressionsInterpreter {
	
	
	@Inject extension CMSdslUtil
//	
//	def dispatch interpret(And and) {
//		(and.left.interpret as Boolean) && (and.right.interpret as Boolean)
//	}
//	
//	def dispatch interpret(Or or) {
//		(or.left.interpret as Boolean) || (or.right.interpret as Boolean)
//	}
//	
//	def dispatch interpret(Equality eq) {
//		val left = eq.left.interpret as Integer
//		val right = eq.right.interpret as Integer
//		
//		if(eq.op == '==') left == right
//		else left != right
//	}
//	
//	def dispatch interpret(Comparison comp){
//		val left = comp.left.interpret as Integer
//		val right = comp.left.interpret as Integer
//		
//		switch comp.op {
//			case '>=': left >= right
//			case '<=': left <= right
//			case '<': left < right
//			case '>': left > right
//		}
//	}
//	
//	
//	def dispatch interpret(Plus plus){
//		plus.left + (plus.right.interpret as Integer)
//	}
//	
//	def dispatch interpret(Minus min){
//		min.left. - min.right
//	}
//	
//	def dispatch interpret(MulDiv muldDiv) {
//		val left= muldDiv.left.interpret as Integer
//		val right = muldDiv.right.interpret as Integer
//		if(muldDiv.op =='*') left* right
//		else left / right
//	}
	
	
//	def dispatch interpret (Expression e){
//		switch(e) {
//			Num: e.value
//			Str: e.value
//			Bool: Boolean.parseBoolean(e.value)
////			Not: !(e.expression.interpret as Boolean)
//			MulDiv: {
//				val left= e.left.interpret as Integer
//				val right = e.right.interpret as Integer
//				if(e.op =='*') left* right
//				else left / right
//			}
//			Plus: e.left + e.right
//			Minus: e.left - e.right
//			Comparison: {
//				val left = e.left.interpret as Integer
//				val right = e.right.interpret as Integer
//				
//				switch e.op {
//					case '>=': left >= right
//					case '<=': left <= right
//					case '>': left > right
//					case '<': left < right 
//				}
//			}
//			Equality: {
//				val left = e.left interpret as Integer
//				val right = e.right interpret as Integer
//				if(e.op == '==') left == right
//				else left != right
//			}
//			And: {
//				(e.left.interpret as Boolean) && (e.right.interpret as Boolean)
//			}
//			Or: {
//				(e.left.interpret as Boolean) || (e.right.interpret as Boolean)
//			}
//		}
//	}
}