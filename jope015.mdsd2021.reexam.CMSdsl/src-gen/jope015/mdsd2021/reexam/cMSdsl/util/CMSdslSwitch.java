/**
 * generated by Xtext 2.22.0
 */
package jope015.mdsd2021.reexam.cMSdsl.util;

import jope015.mdsd2021.reexam.cMSdsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jope015.mdsd2021.reexam.cMSdsl.CMSdslPackage
 * @generated
 */
public class CMSdslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CMSdslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CMSdslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CMSdslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CMSdslPackage.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.PRIMARY_ELEMENT:
      {
        PrimaryElement primaryElement = (PrimaryElement)theEObject;
        T result = casePrimaryElement(primaryElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.DB_CONFIG:
      {
        DBConfig dbConfig = (DBConfig)theEObject;
        T result = caseDBConfig(dbConfig);
        if (result == null) result = casePrimaryElement(dbConfig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.DB_DECL:
      {
        DBDecl dbDecl = (DBDecl)theEObject;
        T result = caseDBDecl(dbDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = casePrimaryElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.ENTITY_MODEL:
      {
        EntityModel entityModel = (EntityModel)theEObject;
        T result = caseEntityModel(entityModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.ENTITY_SERVICE:
      {
        EntityService entityService = (EntityService)theEObject;
        T result = caseEntityService(entityService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.FIELD_PROP:
      {
        FieldProp fieldProp = (FieldProp)theEObject;
        T result = caseFieldProp(fieldProp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.LIB:
      {
        Lib lib = (Lib)theEObject;
        T result = caseLib(lib);
        if (result == null) result = caseDBDecl(lib);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.HOST:
      {
        Host host = (Host)theEObject;
        T result = caseHost(host);
        if (result == null) result = caseDBDecl(host);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = caseDBDecl(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.DIALECT:
      {
        Dialect dialect = (Dialect)theEObject;
        T result = caseDialect(dialect);
        if (result == null) result = caseDBDecl(dialect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.USER:
      {
        User user = (User)theEObject;
        T result = caseUser(user);
        if (result == null) result = caseDBDecl(user);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.PASS:
      {
        Pass pass = (Pass)theEObject;
        T result = casePass(pass);
        if (result == null) result = caseDBDecl(pass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.DEF:
      {
        Def def = (Def)theEObject;
        T result = caseDef(def);
        if (result == null) result = caseFieldProp(def);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.PROP_TEST:
      {
        PropTest propTest = (PropTest)theEObject;
        T result = casePropTest(propTest);
        if (result == null) result = caseFieldProp(propTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.STR:
      {
        Str str = (Str)theEObject;
        T result = caseStr(str);
        if (result == null) result = caseDataType(str);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.DT:
      {
        Dt dt = (Dt)theEObject;
        T result = caseDt(dt);
        if (result == null) result = caseDataType(dt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.INTEG:
      {
        Integ integ = (Integ)theEObject;
        T result = caseInteg(integ);
        if (result == null) result = caseDataType(integ);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.LNG:
      {
        Lng lng = (Lng)theEObject;
        T result = caseLng(lng);
        if (result == null) result = caseDataType(lng);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.BOOL:
      {
        Bool bool = (Bool)theEObject;
        T result = caseBool(bool);
        if (result == null) result = caseDataType(bool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CMSdslPackage.FLT:
      {
        Flt flt = (Flt)theEObject;
        T result = caseFlt(flt);
        if (result == null) result = caseDataType(flt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryElement(PrimaryElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DB Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DB Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDBConfig(DBConfig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DB Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DB Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDBDecl(DBDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityModel(EntityModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityService(EntityService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Prop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Prop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldProp(FieldProp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lib</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lib</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLib(Lib object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Host</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Host</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHost(Host object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialect(Dialect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUser(User object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePass(Pass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDef(Def object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prop Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prop Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropTest(PropTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Str</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Str</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStr(Str object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDt(Dt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integ</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integ</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteg(Integ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lng</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lng</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLng(Lng object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBool(Bool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlt(Flt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CMSdslSwitch