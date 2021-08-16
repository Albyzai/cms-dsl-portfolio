package jope015.mdsd2021.reexam.generator

import jope015.mdsd2021.reexam.cMSdsl.Or
import jope015.mdsd2021.reexam.cMSdsl.And
import jope015.mdsd2021.reexam.cMSdsl.Equality
import jope015.mdsd2021.reexam.cMSdsl.Comparison
import jope015.mdsd2021.reexam.cMSdsl.Plus
import jope015.mdsd2021.reexam.cMSdsl.Minus
import jope015.mdsd2021.reexam.cMSdsl.Mul
import jope015.mdsd2021.reexam.cMSdsl.Div
import jope015.mdsd2021.reexam.cMSdsl.Num
import jope015.mdsd2021.reexam.cMSdsl.Str
import jope015.mdsd2021.reexam.cMSdsl.Bool
import jope015.mdsd2021.reexam.cMSdsl.ParamOrArgUse
import org.eclipse.xtext.EcoreUtil2
import jope015.mdsd2021.reexam.cMSdsl.ValidationCheck
import jope015.mdsd2021.reexam.cMSdsl.Validator

class ExpressionsGenerator {

	def dispatch CharSequence generate(Or exp, ValidationCheck check) { exp.left.generate(check) + '||' + exp.right.generate(check) }

	def dispatch CharSequence generate(And exp, ValidationCheck check) { exp.left.generate(check) + '&&' + exp.right.generate(check) }
	
	def dispatch CharSequence generate(Equality exp, ValidationCheck check) { exp.left.generate(check) + exp.op + exp.right.generate(check) }
	
	def dispatch CharSequence generate(Comparison exp, ValidationCheck check) { exp.left.generate(check) + exp.op + exp.right.generate(check) }
	
	def dispatch CharSequence generate(Plus exp, ValidationCheck check) { exp.left.generate(check) + '+' + exp.right.generate(check)}
	
	def dispatch CharSequence generate(Minus exp, ValidationCheck check) { exp.left.generate(check) + '-' + exp.right.generate(check)}
	
	def dispatch CharSequence generate(Mul exp, ValidationCheck check) { exp.left.generate(check) + '*' + exp.right.generate(check)}
	
	def dispatch CharSequence generate(Div exp, ValidationCheck check) { exp.left.generate(check) + '/' + exp.right.generate(check)}
	
	def dispatch CharSequence generate(Num exp, ValidationCheck check) { '''«exp.value»''' }
	
	def dispatch CharSequence generate(Str exp, ValidationCheck check) { '''"«exp.value»"'''}
	
	def dispatch CharSequence generate(Bool exp, ValidationCheck check) { '''«exp.value»'''}
	
	def dispatch CharSequence generate(ParamOrArgUse exp, ValidationCheck check) {
		val params = EcoreUtil2.getContainerOfType(exp, Validator).params
		val args = check.validator.args
		if((params.isEmpty || args.isEmpty) || args.size != params.size) return ''''''
		val index = params.indexOf((exp.ref))
		'''«args.get(index).name.toString»'''
		
	}
	
	
}