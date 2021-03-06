/**
 * generated by Xtext 2.22.0
 */
package jope015.mdsd2021.reexam.cMSdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.Entity#getName <em>Name</em>}</li>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.Entity#getRelations <em>Relations</em>}</li>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.Entity#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends PrimaryElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jope015.mdsd2021.reexam.cMSdsl.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link jope015.mdsd2021.reexam.cMSdsl.Relationship}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage#getEntity_Relations()
   * @model containment="true"
   * @generated
   */
  EList<Relationship> getRelations();

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link jope015.mdsd2021.reexam.cMSdsl.EntityDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage#getEntity_Members()
   * @model containment="true"
   * @generated
   */
  EList<EntityDecl> getMembers();

} // Entity
