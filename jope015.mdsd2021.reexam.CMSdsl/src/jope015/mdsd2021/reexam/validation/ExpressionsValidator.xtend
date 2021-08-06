package jope015.mdsd2021.reexam.validation

import org.eclipse.xtext.validation.Check
import jope015.mdsd2021.reexam.typing.ExpressionsType
import jope015.mdsd2021.reexam.cMSdsl.Expression
import org.eclipse.emf.ecore.EReference
import javax.inject.Inject
import jope015.mdsd2021.reexam.typing.ExpressionsTypeComputer
import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage
import jope015.mdsd2021.reexam.cMSdsl.Plus
import jope015.mdsd2021.reexam.cMSdsl.Comparison
import jope015.mdsd2021.reexam.cMSdsl.Equality
import jope015.mdsd2021.reexam.cMSdsl.Minus
import jope015.mdsd2021.reexam.cMSdsl.MulDiv
import jope015.mdsd2021.reexam.cMSdsl.Or
import jope015.mdsd2021.reexam.cMSdsl.And
import jope015.mdsd2021.reexam.cMSdsl.Validator

class ExpressionsValidator extends AbstractCMSdslValidator {
	
	@Inject extension ExpressionsTypeComputer
	
	
	protected static val ISSUE_CODE_PREFIX = "org.example.expressions."
	public static val FORWARD_REFERENCE = ISSUE_CODE_PREFIX + "ForwardReference"
	public static val TYPE_MISMATCH = ISSUE_CODE_PREFIX + "TypeMismatch"
//	
//	@Check
//	def void checkForwardReference(VariableRef varRef) {
//		val variable = varRef.getVariable()
//		if (!varRef.isVariableDefinedBefore)
//			error("variable forward reference not allowed: '" + variable.name + "'",
//				ExpressionsPackage.eINSTANCE.variableRef_Variable,
//				FORWARD_REFERENCE,
//				variable.name)
//	}

//	@Check def checkType(Not not) {
//		checkExpectedBoolean(not.expression,
//			CMSdslPackage.Literals.NOT__EXPRESSION)
//	}

	@Check def checkValidatorExpression(Validator v) {
		System.out.println('validator: ' + v)
		checkExpectedBoolean(v.comparison, CMSdslPackage.Literals.VALIDATOR__COMPARISON)
	}
	
	@Check def checkEquality(Equality e){
		val left = getTypeAndCheckNotNull(e.left, CMSdslPackage.Literals.EQUALITY__LEFT)
		val right = getTypeAndCheckNotNull(e.right, CMSdslPackage.Literals.EQUALITY__RIGHT)
		val isComparable = left.isBoolType && right.isBoolType || left.isNumberType && right.isNumberType || left.isStringType && right.isStringType
		
		if(!isComparable) error('cannot compare ' + left + ' to ' + right + ' with ' + e.op , CMSdslPackage.eINSTANCE.equality_Op)
	}
	
	@Check def checkComparison(Comparison c) {
		val left = getTypeAndCheckNotNull(c.left, CMSdslPackage.Literals.COMPARISON__LEFT)
		val right = getTypeAndCheckNotNull(c.right, CMSdslPackage.Literals.COMPARISON__RIGHT)
		val isComparable = left.isNumberType && right.isNumberType // maybe add support for comparing number to string
		System.out.println('isComparable: ' + isComparable)
		
		if(!isComparable) error('cannot compare ' + left + ' to ' + right + ' with ' + c.op , CMSdslPackage.eINSTANCE.comparison_Op)
		
	}
	
	@Check def checkAnd(And a) {
		val left = getTypeAndCheckNotNull(a.left, CMSdslPackage.Literals.AND__LEFT)
		val right = getTypeAndCheckNotNull(a.right, CMSdslPackage.Literals.AND__RIGHT)

		
		if(!left.isBoolType) error('expected boolean type, found: ' + left, CMSdslPackage.Literals.AND__LEFT)
		if(!right.isBoolType) error('expected boolean type, found: ' + right, CMSdslPackage.Literals.AND__RIGHT)
	}
	
	@Check def checkOr(Or o) {
		val left = getTypeAndCheckNotNull(o.left, CMSdslPackage.Literals.OR__LEFT)
		val right = getTypeAndCheckNotNull(o.right, CMSdslPackage.Literals.OR__RIGHT)

		
		if(!left.isBoolType) error('expected boolean type, found: ' + left, CMSdslPackage.Literals.OR__LEFT)
		if(!right.isBoolType) error('expected boolean type, found: ' + right, CMSdslPackage.Literals.OR__RIGHT)
//		if(!isComparable) error('cannot compare ' + left + ' to ' + right + ' with ' + c.op , CMSdslPackage.eINSTANCE.comparison_Op)
		
	}

//	@Check def checkType(Expression e) {
//	}
//
//	@Check def checkType(And and) {
//		checkExpectedBoolean(and.left, CMSdslPackage.Literals.AND__LEFT)
//		checkExpectedBoolean(and.right, CMSdslPackage.Literals.AND__RIGHT)
//	}
//
//	@Check
//	def checkType(Or or) {
//		checkExpectedBoolean(or.left, CMSdslPackage.Literals.OR__LEFT)
//		checkExpectedBoolean(or.right, CMSdslPackage.Literals.OR__RIGHT)
//	}
//
//	@Check
//	def checkType(MulDiv mulOrDiv) {
//		checkExpectedInt(mulOrDiv.left, CMSdslPackage.Literals.MUL_DIV__LEFT)
//		checkExpectedInt(mulOrDiv.right, CMSdslPackage.Literals.MUL_DIV__RIGHT)
//	}
//
//	@Check
//	def checkType(Minus minus) {
//		checkExpectedInt(minus.left, CMSdslPackage.Literals.MINUS__LEFT)
//		checkExpectedInt(minus.right, CMSdslPackage.Literals.MINUS__RIGHT)
//	}
//
//	@Check def checkType(Equality equality) {
//		val leftType = getTypeAndCheckNotNull(equality.left, CMSdslPackage.Literals.EQUALITY__LEFT)
//		val rightType = getTypeAndCheckNotNull(equality.right, CMSdslPackage.Literals.EQUALITY__RIGHT)
//		checkExpectedSame(leftType, rightType)
//	}
//
//	@Check def checkType(Comparison comparison) {
//		val leftType = getTypeAndCheckNotNull(comparison.left, CMSdslPackage.Literals.COMPARISON__LEFT)
//		val rightType = getTypeAndCheckNotNull(comparison.right, CMSdslPackage.Literals.COMPARISON__RIGHT)
//		checkExpectedSame(leftType, rightType)
//		checkNotBoolean(leftType, CMSdslPackage.Literals.COMPARISON__LEFT)
//		checkNotBoolean(rightType, CMSdslPackage.Literals.COMPARISON__RIGHT)
//	}
//
//	@Check def checkType(Plus plus) {
//		val leftType = getTypeAndCheckNotNull(plus.left, CMSdslPackage.Literals.PLUS__LEFT)
//		val rightType = getTypeAndCheckNotNull(plus.right, CMSdslPackage.Literals.PLUS__RIGHT)
//		if (leftType.isNumberType || rightType.isNumberType ||
//			(!leftType.isStringType && !rightType.isStringType)) {
//			checkNotBoolean(leftType, CMSdslPackage.Literals.PLUS__LEFT)
//			checkNotBoolean(rightType, CMSdslPackage.Literals.PLUS__RIGHT)
//		}
//	}

	def private checkExpectedSame(ExpressionsType left, ExpressionsType right) {
		if (right !== null && left !== null && right != left) {
			error("expected the same type, but was " + left + ", " + right,
				CMSdslPackage.Literals.EQUALITY.getEIDAttribute(), TYPE_MISMATCH)
		}
	}

	def private checkNotBoolean(ExpressionsType type, EReference reference) {
		if (type.isBoolType) {
			error("cannot be boolean", reference, TYPE_MISMATCH)
		}
	}

	def private checkExpectedBoolean(Expression exp, EReference reference) {
		checkExpectedType(exp, ExpressionsTypeComputer.BOOL_TYPE, reference)
	}

	def private checkExpectedInt(Expression exp, EReference reference) {
		checkExpectedType(exp, ExpressionsTypeComputer.NUMBER_TYPE, reference)
	}
	
	def private checkExpectedString(Expression exp, EReference reference) {
		checkExpectedType(exp, ExpressionsTypeComputer.STRING_TYPE, reference)
	}

	def private checkExpectedType(Expression exp, ExpressionsType expectedType, EReference reference) {
		val actualType = getTypeAndCheckNotNull(exp, reference)
		if (actualType != expectedType)
			error("expected " + expectedType + " type, but was " + actualType,
				reference, TYPE_MISMATCH
			)
	}

	def private ExpressionsType getTypeAndCheckNotNull(Expression exp, EReference reference) {
		System.out.println('exp ' + exp)
		System.out.println('ref ' + reference)
		val type = exp?.typeFor
		if (type === null)
			error("null type", reference, TYPE_MISMATCH)
		return type;
	}
}