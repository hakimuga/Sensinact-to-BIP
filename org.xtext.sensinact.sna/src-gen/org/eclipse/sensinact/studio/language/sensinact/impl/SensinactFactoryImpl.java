/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.sensinact.studio.language.sensinact.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensinactFactoryImpl extends EFactoryImpl implements SensinactFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SensinactFactory init()
  {
    try
    {
      SensinactFactory theSensinactFactory = (SensinactFactory)EPackage.Registry.INSTANCE.getEFactory(SensinactPackage.eNS_URI);
      if (theSensinactFactory != null)
      {
        return theSensinactFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SensinactFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensinactFactoryImpl()
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
      case SensinactPackage.SENSINACT: return createSensinact();
      case SensinactPackage.DSL_SENSINACT: return createDSL_SENSINACT();
      case SensinactPackage.DSL_CLOCK_STOCHASTIC: return createDSL_CLOCK_STOCHASTIC();
      case SensinactPackage.DSL_FLAG_AUTOSTART: return createDSL_FLAG_AUTOSTART();
      case SensinactPackage.DSL_RESOURCE: return createDSL_Resource();
      case SensinactPackage.DSL_ON: return createDSL_On();
      case SensinactPackage.DSL_ECA_STATEMENT: return createDSL_ECA_STATEMENT();
      case SensinactPackage.DSL_IF_DO: return createDSL_IfDo();
      case SensinactPackage.DSL_ELSE_IF_DO: return createDSL_ElseIfDo();
      case SensinactPackage.DSL_ELSE_DO: return createDSL_ElseDo();
      case SensinactPackage.DSL_REF: return createDSL_REF();
      case SensinactPackage.DSL_REF_CONDITION: return createDSL_REF_CONDITION();
      case SensinactPackage.DSL_CEP_STATEMENT: return createDSL_CEP_STATEMENT();
      case SensinactPackage.DSL_CEP_AFTER: return createDSL_CEP_AFTER();
      case SensinactPackage.DSL_CEP_BEFORE: return createDSL_CEP_BEFORE();
      case SensinactPackage.DSL_CEP_COINCIDE: return createDSL_CEP_COINCIDE();
      case SensinactPackage.DSL_CEP_MIN: return createDSL_CEP_MIN();
      case SensinactPackage.DSL_CEP_MAX: return createDSL_CEP_MAX();
      case SensinactPackage.DSL_CEP_AVG: return createDSL_CEP_AVG();
      case SensinactPackage.DSL_CEP_SUM: return createDSL_CEP_SUM();
      case SensinactPackage.DSL_CEP_COUNT: return createDSL_CEP_COUNT();
      case SensinactPackage.DSL_CEP_DURATION: return createDSL_CEP_DURATION();
      case SensinactPackage.DSL_CEP_DURATION_MIN: return createDSL_CEP_DURATION_MIN();
      case SensinactPackage.DSL_CEP_DURATION_SEC: return createDSL_CEP_DURATION_SEC();
      case SensinactPackage.DSL_LIST_ACTIONS: return createDSL_ListActions();
      case SensinactPackage.DSL_RESOURCE_ACTION: return createDSL_ResourceAction();
      case SensinactPackage.DSL_LIST_PARAM: return createDSL_ListParam();
      case SensinactPackage.DSL_EXPRESSION: return createDSL_Expression();
      case SensinactPackage.DSL_EXPRESSION_OR: return createDSL_Expression_Or();
      case SensinactPackage.DSL_EXPRESSION_AND: return createDSL_Expression_And();
      case SensinactPackage.DSL_EXPRESSION_DIFF: return createDSL_Expression_Diff();
      case SensinactPackage.DSL_EXPRESSION_EQUAL: return createDSL_Expression_Equal();
      case SensinactPackage.DSL_EXPRESSION_LARGER: return createDSL_Expression_Larger();
      case SensinactPackage.DSL_EXPRESSION_LARGER_EQUAL: return createDSL_Expression_Larger_Equal();
      case SensinactPackage.DSL_EXPRESSION_SMALLER: return createDSL_Expression_Smaller();
      case SensinactPackage.DSL_EXPRESSION_SMALLER_EQUAL: return createDSL_Expression_Smaller_Equal();
      case SensinactPackage.DSL_EXPRESSION_PLUS: return createDSL_Expression_Plus();
      case SensinactPackage.DSL_EXPRESSION_MINUS: return createDSL_Expression_Minus();
      case SensinactPackage.DSL_EXPRESSION_MULTIPLICATION: return createDSL_Expression_Multiplication();
      case SensinactPackage.DSL_EXPRESSION_DIVISION: return createDSL_Expression_Division();
      case SensinactPackage.DSL_EXPRESSION_MODULO: return createDSL_Expression_Modulo();
      case SensinactPackage.DSL_OBJECT_NUMBER: return createDSL_Object_Number();
      case SensinactPackage.DSL_OBJECT_STRING: return createDSL_Object_String();
      case SensinactPackage.DSL_OBJECT_BOOLEAN: return createDSL_Object_Boolean();
      case SensinactPackage.DSL_OBJECT_REF: return createDSL_Object_Ref();
      case SensinactPackage.DSL_EXPRESSION_NEGATE: return createDSL_Expression_Negate();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sensinact createSensinact()
  {
    SensinactImpl sensinact = new SensinactImpl();
    return sensinact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_SENSINACT createDSL_SENSINACT()
  {
    DSL_SENSINACTImpl dsL_SENSINACT = new DSL_SENSINACTImpl();
    return dsL_SENSINACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CLOCK_STOCHASTIC createDSL_CLOCK_STOCHASTIC()
  {
    DSL_CLOCK_STOCHASTICImpl dsL_CLOCK_STOCHASTIC = new DSL_CLOCK_STOCHASTICImpl();
    return dsL_CLOCK_STOCHASTIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_FLAG_AUTOSTART createDSL_FLAG_AUTOSTART()
  {
    DSL_FLAG_AUTOSTARTImpl dsL_FLAG_AUTOSTART = new DSL_FLAG_AUTOSTARTImpl();
    return dsL_FLAG_AUTOSTART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Resource createDSL_Resource()
  {
    DSL_ResourceImpl dsL_Resource = new DSL_ResourceImpl();
    return dsL_Resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_On createDSL_On()
  {
    DSL_OnImpl dsL_On = new DSL_OnImpl();
    return dsL_On;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ECA_STATEMENT createDSL_ECA_STATEMENT()
  {
    DSL_ECA_STATEMENTImpl dsL_ECA_STATEMENT = new DSL_ECA_STATEMENTImpl();
    return dsL_ECA_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_IfDo createDSL_IfDo()
  {
    DSL_IfDoImpl dsL_IfDo = new DSL_IfDoImpl();
    return dsL_IfDo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ElseIfDo createDSL_ElseIfDo()
  {
    DSL_ElseIfDoImpl dsL_ElseIfDo = new DSL_ElseIfDoImpl();
    return dsL_ElseIfDo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ElseDo createDSL_ElseDo()
  {
    DSL_ElseDoImpl dsL_ElseDo = new DSL_ElseDoImpl();
    return dsL_ElseDo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF createDSL_REF()
  {
    DSL_REFImpl dsL_REF = new DSL_REFImpl();
    return dsL_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF_CONDITION createDSL_REF_CONDITION()
  {
    DSL_REF_CONDITIONImpl dsL_REF_CONDITION = new DSL_REF_CONDITIONImpl();
    return dsL_REF_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_STATEMENT createDSL_CEP_STATEMENT()
  {
    DSL_CEP_STATEMENTImpl dsL_CEP_STATEMENT = new DSL_CEP_STATEMENTImpl();
    return dsL_CEP_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_AFTER createDSL_CEP_AFTER()
  {
    DSL_CEP_AFTERImpl dsL_CEP_AFTER = new DSL_CEP_AFTERImpl();
    return dsL_CEP_AFTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_BEFORE createDSL_CEP_BEFORE()
  {
    DSL_CEP_BEFOREImpl dsL_CEP_BEFORE = new DSL_CEP_BEFOREImpl();
    return dsL_CEP_BEFORE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_COINCIDE createDSL_CEP_COINCIDE()
  {
    DSL_CEP_COINCIDEImpl dsL_CEP_COINCIDE = new DSL_CEP_COINCIDEImpl();
    return dsL_CEP_COINCIDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_MIN createDSL_CEP_MIN()
  {
    DSL_CEP_MINImpl dsL_CEP_MIN = new DSL_CEP_MINImpl();
    return dsL_CEP_MIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_MAX createDSL_CEP_MAX()
  {
    DSL_CEP_MAXImpl dsL_CEP_MAX = new DSL_CEP_MAXImpl();
    return dsL_CEP_MAX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_AVG createDSL_CEP_AVG()
  {
    DSL_CEP_AVGImpl dsL_CEP_AVG = new DSL_CEP_AVGImpl();
    return dsL_CEP_AVG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_SUM createDSL_CEP_SUM()
  {
    DSL_CEP_SUMImpl dsL_CEP_SUM = new DSL_CEP_SUMImpl();
    return dsL_CEP_SUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_COUNT createDSL_CEP_COUNT()
  {
    DSL_CEP_COUNTImpl dsL_CEP_COUNT = new DSL_CEP_COUNTImpl();
    return dsL_CEP_COUNT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_DURATION createDSL_CEP_DURATION()
  {
    DSL_CEP_DURATIONImpl dsL_CEP_DURATION = new DSL_CEP_DURATIONImpl();
    return dsL_CEP_DURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_DURATION_MIN createDSL_CEP_DURATION_MIN()
  {
    DSL_CEP_DURATION_MINImpl dsL_CEP_DURATION_MIN = new DSL_CEP_DURATION_MINImpl();
    return dsL_CEP_DURATION_MIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_DURATION_SEC createDSL_CEP_DURATION_SEC()
  {
    DSL_CEP_DURATION_SECImpl dsL_CEP_DURATION_SEC = new DSL_CEP_DURATION_SECImpl();
    return dsL_CEP_DURATION_SEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ListActions createDSL_ListActions()
  {
    DSL_ListActionsImpl dsL_ListActions = new DSL_ListActionsImpl();
    return dsL_ListActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ResourceAction createDSL_ResourceAction()
  {
    DSL_ResourceActionImpl dsL_ResourceAction = new DSL_ResourceActionImpl();
    return dsL_ResourceAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ListParam createDSL_ListParam()
  {
    DSL_ListParamImpl dsL_ListParam = new DSL_ListParamImpl();
    return dsL_ListParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression createDSL_Expression()
  {
    DSL_ExpressionImpl dsL_Expression = new DSL_ExpressionImpl();
    return dsL_Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Or createDSL_Expression_Or()
  {
    DSL_Expression_OrImpl dsL_Expression_Or = new DSL_Expression_OrImpl();
    return dsL_Expression_Or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_And createDSL_Expression_And()
  {
    DSL_Expression_AndImpl dsL_Expression_And = new DSL_Expression_AndImpl();
    return dsL_Expression_And;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Diff createDSL_Expression_Diff()
  {
    DSL_Expression_DiffImpl dsL_Expression_Diff = new DSL_Expression_DiffImpl();
    return dsL_Expression_Diff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Equal createDSL_Expression_Equal()
  {
    DSL_Expression_EqualImpl dsL_Expression_Equal = new DSL_Expression_EqualImpl();
    return dsL_Expression_Equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Larger createDSL_Expression_Larger()
  {
    DSL_Expression_LargerImpl dsL_Expression_Larger = new DSL_Expression_LargerImpl();
    return dsL_Expression_Larger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Larger_Equal createDSL_Expression_Larger_Equal()
  {
    DSL_Expression_Larger_EqualImpl dsL_Expression_Larger_Equal = new DSL_Expression_Larger_EqualImpl();
    return dsL_Expression_Larger_Equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Smaller createDSL_Expression_Smaller()
  {
    DSL_Expression_SmallerImpl dsL_Expression_Smaller = new DSL_Expression_SmallerImpl();
    return dsL_Expression_Smaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Smaller_Equal createDSL_Expression_Smaller_Equal()
  {
    DSL_Expression_Smaller_EqualImpl dsL_Expression_Smaller_Equal = new DSL_Expression_Smaller_EqualImpl();
    return dsL_Expression_Smaller_Equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Plus createDSL_Expression_Plus()
  {
    DSL_Expression_PlusImpl dsL_Expression_Plus = new DSL_Expression_PlusImpl();
    return dsL_Expression_Plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Minus createDSL_Expression_Minus()
  {
    DSL_Expression_MinusImpl dsL_Expression_Minus = new DSL_Expression_MinusImpl();
    return dsL_Expression_Minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Multiplication createDSL_Expression_Multiplication()
  {
    DSL_Expression_MultiplicationImpl dsL_Expression_Multiplication = new DSL_Expression_MultiplicationImpl();
    return dsL_Expression_Multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Division createDSL_Expression_Division()
  {
    DSL_Expression_DivisionImpl dsL_Expression_Division = new DSL_Expression_DivisionImpl();
    return dsL_Expression_Division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Modulo createDSL_Expression_Modulo()
  {
    DSL_Expression_ModuloImpl dsL_Expression_Modulo = new DSL_Expression_ModuloImpl();
    return dsL_Expression_Modulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Object_Number createDSL_Object_Number()
  {
    DSL_Object_NumberImpl dsL_Object_Number = new DSL_Object_NumberImpl();
    return dsL_Object_Number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Object_String createDSL_Object_String()
  {
    DSL_Object_StringImpl dsL_Object_String = new DSL_Object_StringImpl();
    return dsL_Object_String;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Object_Boolean createDSL_Object_Boolean()
  {
    DSL_Object_BooleanImpl dsL_Object_Boolean = new DSL_Object_BooleanImpl();
    return dsL_Object_Boolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Object_Ref createDSL_Object_Ref()
  {
    DSL_Object_RefImpl dsL_Object_Ref = new DSL_Object_RefImpl();
    return dsL_Object_Ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression_Negate createDSL_Expression_Negate()
  {
    DSL_Expression_NegateImpl dsL_Expression_Negate = new DSL_Expression_NegateImpl();
    return dsL_Expression_Negate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensinactPackage getSensinactPackage()
  {
    return (SensinactPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SensinactPackage getPackage()
  {
    return SensinactPackage.eINSTANCE;
  }

} //SensinactFactoryImpl
