/**
 * generated by Xtext 2.22.0
 */
package jope015.mdsd2021.reexam.cMSdsl.impl;

import jope015.mdsd2021.reexam.cMSdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CMSdslFactoryImpl extends EFactoryImpl implements CMSdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CMSdslFactory init()
  {
    try
    {
      CMSdslFactory theCMSdslFactory = (CMSdslFactory)EPackage.Registry.INSTANCE.getEFactory(CMSdslPackage.eNS_URI);
      if (theCMSdslFactory != null)
      {
        return theCMSdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CMSdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CMSdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CMSdslPackage.PROJECT: return createProject();
      case CMSdslPackage.PRIMARY_ELEMENT: return createPrimaryElement();
      case CMSdslPackage.DB_CONFIG: return createDBConfig();
      case CMSdslPackage.DB_DECL: return createDBDecl();
      case CMSdslPackage.ENTITY: return createEntity();
      case CMSdslPackage.ENTITY_DECL: return createEntityDecl();
      case CMSdslPackage.FIELD: return createField();
      case CMSdslPackage.VALIDATION_CHECK: return createValidationCheck();
      case CMSdslPackage.CHECK_BLOCK: return createCheckBlock();
      case CMSdslPackage.VALIDATION_STATUS: return createValidationStatus();
      case CMSdslPackage.FIELD_PROP: return createFieldProp();
      case CMSdslPackage.DATA_TYPE: return createDataType();
      case CMSdslPackage.VALIDATOR: return createValidator();
      case CMSdslPackage.PARAMETER: return createParameter();
      case CMSdslPackage.PARAMETER_USE: return createParameterUse();
      case CMSdslPackage.VALIDATOR_USE: return createValidatorUse();
      case CMSdslPackage.ARGUMENT: return createArgument();
      case CMSdslPackage.RELATIONSHIP: return createRelationship();
      case CMSdslPackage.RELATIONSHIP_TYPE: return createRelationshipType();
      case CMSdslPackage.EXPRESSION: return createExpression();
      case CMSdslPackage.EVAL: return createEval();
      case CMSdslPackage.LIB: return createLib();
      case CMSdslPackage.HOST: return createHost();
      case CMSdslPackage.PORT: return createPort();
      case CMSdslPackage.DIALECT: return createDialect();
      case CMSdslPackage.USER: return createUser();
      case CMSdslPackage.PASS: return createPass();
      case CMSdslPackage.ERR: return createErr();
      case CMSdslPackage.WARN: return createWarn();
      case CMSdslPackage.SUCC: return createSucc();
      case CMSdslPackage.DEF: return createDef();
      case CMSdslPackage.PROP_TEST: return createPropTest();
      case CMSdslPackage.STR: return createStr();
      case CMSdslPackage.DT: return createDt();
      case CMSdslPackage.INTEG: return createInteg();
      case CMSdslPackage.LNG: return createLng();
      case CMSdslPackage.BOOL: return createBool();
      case CMSdslPackage.FLT: return createFlt();
      case CMSdslPackage.BELONGS_TO: return createBelongsTo();
      case CMSdslPackage.BELONGS_TO_MANY: return createBelongsToMany();
      case CMSdslPackage.HAS_ONE: return createHasOne();
      case CMSdslPackage.HAS_MANY: return createHasMany();
      case CMSdslPackage.OR: return createOr();
      case CMSdslPackage.AND: return createAnd();
      case CMSdslPackage.EQUALITY: return createEquality();
      case CMSdslPackage.COMPARISON: return createComparison();
      case CMSdslPackage.PLUS: return createPlus();
      case CMSdslPackage.MINUS: return createMinus();
      case CMSdslPackage.MUL_DIV: return createMulDiv();
      case CMSdslPackage.NUM: return createNum();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryElement createPrimaryElement()
  {
    PrimaryElementImpl primaryElement = new PrimaryElementImpl();
    return primaryElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DBConfig createDBConfig()
  {
    DBConfigImpl dbConfig = new DBConfigImpl();
    return dbConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DBDecl createDBDecl()
  {
    DBDeclImpl dbDecl = new DBDeclImpl();
    return dbDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityDecl createEntityDecl()
  {
    EntityDeclImpl entityDecl = new EntityDeclImpl();
    return entityDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValidationCheck createValidationCheck()
  {
    ValidationCheckImpl validationCheck = new ValidationCheckImpl();
    return validationCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CheckBlock createCheckBlock()
  {
    CheckBlockImpl checkBlock = new CheckBlockImpl();
    return checkBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValidationStatus createValidationStatus()
  {
    ValidationStatusImpl validationStatus = new ValidationStatusImpl();
    return validationStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldProp createFieldProp()
  {
    FieldPropImpl fieldProp = new FieldPropImpl();
    return fieldProp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Validator createValidator()
  {
    ValidatorImpl validator = new ValidatorImpl();
    return validator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterUse createParameterUse()
  {
    ParameterUseImpl parameterUse = new ParameterUseImpl();
    return parameterUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValidatorUse createValidatorUse()
  {
    ValidatorUseImpl validatorUse = new ValidatorUseImpl();
    return validatorUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relationship createRelationship()
  {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationshipType createRelationshipType()
  {
    RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
    return relationshipType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Eval createEval()
  {
    EvalImpl eval = new EvalImpl();
    return eval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lib createLib()
  {
    LibImpl lib = new LibImpl();
    return lib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Host createHost()
  {
    HostImpl host = new HostImpl();
    return host;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dialect createDialect()
  {
    DialectImpl dialect = new DialectImpl();
    return dialect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pass createPass()
  {
    PassImpl pass = new PassImpl();
    return pass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Err createErr()
  {
    ErrImpl err = new ErrImpl();
    return err;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Warn createWarn()
  {
    WarnImpl warn = new WarnImpl();
    return warn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Succ createSucc()
  {
    SuccImpl succ = new SuccImpl();
    return succ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Def createDef()
  {
    DefImpl def = new DefImpl();
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropTest createPropTest()
  {
    PropTestImpl propTest = new PropTestImpl();
    return propTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Str createStr()
  {
    StrImpl str = new StrImpl();
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dt createDt()
  {
    DtImpl dt = new DtImpl();
    return dt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integ createInteg()
  {
    IntegImpl integ = new IntegImpl();
    return integ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lng createLng()
  {
    LngImpl lng = new LngImpl();
    return lng;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bool createBool()
  {
    BoolImpl bool = new BoolImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Flt createFlt()
  {
    FltImpl flt = new FltImpl();
    return flt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BelongsTo createBelongsTo()
  {
    BelongsToImpl belongsTo = new BelongsToImpl();
    return belongsTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BelongsToMany createBelongsToMany()
  {
    BelongsToManyImpl belongsToMany = new BelongsToManyImpl();
    return belongsToMany;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HasOne createHasOne()
  {
    HasOneImpl hasOne = new HasOneImpl();
    return hasOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HasMany createHasMany()
  {
    HasManyImpl hasMany = new HasManyImpl();
    return hasMany;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MulDiv createMulDiv()
  {
    MulDivImpl mulDiv = new MulDivImpl();
    return mulDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Num createNum()
  {
    NumImpl num = new NumImpl();
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CMSdslPackage getCMSdslPackage()
  {
    return (CMSdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CMSdslPackage getPackage()
  {
    return CMSdslPackage.eINSTANCE;
  }

} //CMSdslFactoryImpl
