/**
 * generated by Xtext 2.22.0
 */
package jope015.mdsd2021.reexam.cMSdsl.impl;

import java.util.Collection;

import jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage;
import jope015.mdsd2021.reexam.cMSdsl.DataType;
import jope015.mdsd2021.reexam.cMSdsl.Field;
import jope015.mdsd2021.reexam.cMSdsl.FieldProp;
import jope015.mdsd2021.reexam.cMSdsl.ParamOrArg;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.impl.FieldImpl#isDontShow <em>Dont Show</em>}</li>
 *   <li>{@link jope015.mdsd2021.reexam.cMSdsl.impl.FieldImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends EntityDeclImpl implements Field
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type;

  /**
   * The default value of the '{@link #isDontShow() <em>Dont Show</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDontShow()
   * @generated
   * @ordered
   */
  protected static final boolean DONT_SHOW_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDontShow() <em>Dont Show</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDontShow()
   * @generated
   * @ordered
   */
  protected boolean dontShow = DONT_SHOW_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<FieldProp> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CMSdslPackage.Literals.FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CMSdslPackage.FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DataType newType, NotificationChain msgs)
  {
    DataType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CMSdslPackage.FIELD__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(DataType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CMSdslPackage.FIELD__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CMSdslPackage.FIELD__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CMSdslPackage.FIELD__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isDontShow()
  {
    return dontShow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDontShow(boolean newDontShow)
  {
    boolean oldDontShow = dontShow;
    dontShow = newDontShow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CMSdslPackage.FIELD__DONT_SHOW, oldDontShow, dontShow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FieldProp> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<FieldProp>(FieldProp.class, this, CMSdslPackage.FIELD__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CMSdslPackage.FIELD__TYPE:
        return basicSetType(null, msgs);
      case CMSdslPackage.FIELD__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CMSdslPackage.FIELD__NAME:
        return getName();
      case CMSdslPackage.FIELD__TYPE:
        return getType();
      case CMSdslPackage.FIELD__DONT_SHOW:
        return isDontShow();
      case CMSdslPackage.FIELD__PROPERTIES:
        return getProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CMSdslPackage.FIELD__NAME:
        setName((String)newValue);
        return;
      case CMSdslPackage.FIELD__TYPE:
        setType((DataType)newValue);
        return;
      case CMSdslPackage.FIELD__DONT_SHOW:
        setDontShow((Boolean)newValue);
        return;
      case CMSdslPackage.FIELD__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends FieldProp>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CMSdslPackage.FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CMSdslPackage.FIELD__TYPE:
        setType((DataType)null);
        return;
      case CMSdslPackage.FIELD__DONT_SHOW:
        setDontShow(DONT_SHOW_EDEFAULT);
        return;
      case CMSdslPackage.FIELD__PROPERTIES:
        getProperties().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CMSdslPackage.FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CMSdslPackage.FIELD__TYPE:
        return type != null;
      case CMSdslPackage.FIELD__DONT_SHOW:
        return dontShow != DONT_SHOW_EDEFAULT;
      case CMSdslPackage.FIELD__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ParamOrArg.class)
    {
      switch (derivedFeatureID)
      {
        case CMSdslPackage.FIELD__NAME: return CMSdslPackage.PARAM_OR_ARG__NAME;
        case CMSdslPackage.FIELD__TYPE: return CMSdslPackage.PARAM_OR_ARG__TYPE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ParamOrArg.class)
    {
      switch (baseFeatureID)
      {
        case CMSdslPackage.PARAM_OR_ARG__NAME: return CMSdslPackage.FIELD__NAME;
        case CMSdslPackage.PARAM_OR_ARG__TYPE: return CMSdslPackage.FIELD__TYPE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", dontShow: ");
    result.append(dontShow);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
