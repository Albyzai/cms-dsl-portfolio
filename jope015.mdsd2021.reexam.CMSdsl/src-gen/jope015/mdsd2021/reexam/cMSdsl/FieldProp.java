/**
 * generated by Xtext 2.22.0
 */
package jope015.mdsd2021.reexam.cMSdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Prop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.FieldProp#getType <em>Type</em>}</li>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.FieldProp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage#getFieldProp()
 * @model
 * @generated
 */
public interface FieldProp extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage#getFieldProp_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link jope015.mdsd2021.reexam.cMSdsl.FieldProp#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage#getFieldProp_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link jope015.mdsd2021.reexam.cMSdsl.FieldProp#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // FieldProp