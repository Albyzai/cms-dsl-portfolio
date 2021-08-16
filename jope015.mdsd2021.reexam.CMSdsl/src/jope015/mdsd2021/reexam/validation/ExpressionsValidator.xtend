package jope015.mdsd2021.reexam.validation

import org.eclipse.xtext.validation.Check
import jope015.mdsd2021.reexam.typing.ExpressionsType
import jope015.mdsd2021.reexam.cMSdsl.Expression
import org.eclipse.emf.ecore.EReference
import javax.inject.Inject
import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage
import jope015.mdsd2021.reexam.cMSdsl.Comparison
import jope015.mdsd2021.reexam.cMSdsl.Equality
import jope015.mdsd2021.reexam.cMSdsl.Or
import jope015.mdsd2021.reexam.cMSdsl.And
import jope015.mdsd2021.reexam.cMSdsl.Validator
import jope015.mdsd2021.reexam.typing.TypeComputer

class ExpressionsValidator extends AbstractCMSdslValidator {

	@Inject extension TypeComputer

	protected static val ISSUE_CODE_PREFIX = "org.example.expressions."
	public static val FORWARD_REFERENCE = ISSUE_CODE_PREFIX + "ForwardReference"
	public static val TYPE_MISMATCH = ISSUE_CODE_PREFIX + "TypeMismatch"


	@Check def checkValidatorExpression(Validator v) {
		System.out.println('validator: ' + v)
		checkExpectedBoolean(v.comparison, CMSdslPackage.Literals.VALIDATOR__COMPARISON)
	}

	@Check def checkEquality(Equality e) {
		val left = getTypeAndCheckNotNull(e.left, CMSdslPackage.Literals.EQUALITY__LEFT)
		val right = getTypeAndCheckNotNull(e.right, CMSdslPackage.Literals.EQUALITY__RIGHT)
		val isComparable = left.isBoolType && right.isBoolType || left.isNumberType && right.isNumberType ||
			left.isStringType && right.isStringType

		if(!isComparable) error('cannot compare ' + left + ' to ' + right + ' with ' + e.op,
			CMSdslPackage.eINSTANCE.equality_Op)
	}

	@Check def checkComparison(Comparison c) {
		val left = getTypeAndCheckNotNull(c.left, CMSdslPackage.Literals.COMPARISON__LEFT)
		val right = getTypeAndCheckNotNull(c.right, CMSdslPackage.Literals.COMPARISON__RIGHT)
		val isComparable = left.isNumberType && right.isNumberType // maybe add support for comparing number to string
		// try to look through recursively c.left etc
		System.out.println('isComparable: ' + isComparable)

		if(!isComparable) error('cannot compare ' + left + ' to ' + right + ' with ' + c.op,
			CMSdslPackage.eINSTANCE.comparison_Op)

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
	}


	def private checkExpectedBoolean(Expression exp, EReference reference) {
		checkExpectedType(exp, TypeComputer.BOOL_TYPE, reference)
	}


	def private checkExpectedType(Expression exp, ExpressionsType expectedType, EReference reference) {
		val actualType = getTypeAndCheckNotNull(exp, reference)
		if (actualType != expectedType)
			error(
				"expected " + expectedType + " type, but was " + actualType,
				reference,
				TYPE_MISMATCH
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
