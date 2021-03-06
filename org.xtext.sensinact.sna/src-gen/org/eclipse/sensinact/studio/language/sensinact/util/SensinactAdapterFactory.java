/**
 */
package org.eclipse.sensinact.studio.language.sensinact.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sensinact.studio.language.sensinact.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage
 * @generated
 */
public class SensinactAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SensinactPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensinactAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SensinactPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SensinactSwitch<Adapter> modelSwitch =
    new SensinactSwitch<Adapter>()
    {
      @Override
      public Adapter caseSensinact(Sensinact object)
      {
        return createSensinactAdapter();
      }
      @Override
      public Adapter caseDSL_SENSINACT(DSL_SENSINACT object)
      {
        return createDSL_SENSINACTAdapter();
      }
      @Override
      public Adapter caseDSL_CLOCK_STOCHASTIC(DSL_CLOCK_STOCHASTIC object)
      {
        return createDSL_CLOCK_STOCHASTICAdapter();
      }
      @Override
      public Adapter caseDSL_FLAG_AUTOSTART(DSL_FLAG_AUTOSTART object)
      {
        return createDSL_FLAG_AUTOSTARTAdapter();
      }
      @Override
      public Adapter caseDSL_Resource(DSL_Resource object)
      {
        return createDSL_ResourceAdapter();
      }
      @Override
      public Adapter caseDSL_On(DSL_On object)
      {
        return createDSL_OnAdapter();
      }
      @Override
      public Adapter caseDSL_ECA_STATEMENT(DSL_ECA_STATEMENT object)
      {
        return createDSL_ECA_STATEMENTAdapter();
      }
      @Override
      public Adapter caseDSL_IfDo(DSL_IfDo object)
      {
        return createDSL_IfDoAdapter();
      }
      @Override
      public Adapter caseDSL_ElseIfDo(DSL_ElseIfDo object)
      {
        return createDSL_ElseIfDoAdapter();
      }
      @Override
      public Adapter caseDSL_ElseDo(DSL_ElseDo object)
      {
        return createDSL_ElseDoAdapter();
      }
      @Override
      public Adapter caseDSL_REF(DSL_REF object)
      {
        return createDSL_REFAdapter();
      }
      @Override
      public Adapter caseDSL_REF_CONDITION(DSL_REF_CONDITION object)
      {
        return createDSL_REF_CONDITIONAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_STATEMENT(DSL_CEP_STATEMENT object)
      {
        return createDSL_CEP_STATEMENTAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_AFTER(DSL_CEP_AFTER object)
      {
        return createDSL_CEP_AFTERAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_BEFORE(DSL_CEP_BEFORE object)
      {
        return createDSL_CEP_BEFOREAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_COINCIDE(DSL_CEP_COINCIDE object)
      {
        return createDSL_CEP_COINCIDEAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_MIN(DSL_CEP_MIN object)
      {
        return createDSL_CEP_MINAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_MAX(DSL_CEP_MAX object)
      {
        return createDSL_CEP_MAXAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_AVG(DSL_CEP_AVG object)
      {
        return createDSL_CEP_AVGAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_SUM(DSL_CEP_SUM object)
      {
        return createDSL_CEP_SUMAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_COUNT(DSL_CEP_COUNT object)
      {
        return createDSL_CEP_COUNTAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_DURATION(DSL_CEP_DURATION object)
      {
        return createDSL_CEP_DURATIONAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_DURATION_MIN(DSL_CEP_DURATION_MIN object)
      {
        return createDSL_CEP_DURATION_MINAdapter();
      }
      @Override
      public Adapter caseDSL_CEP_DURATION_SEC(DSL_CEP_DURATION_SEC object)
      {
        return createDSL_CEP_DURATION_SECAdapter();
      }
      @Override
      public Adapter caseDSL_ListActions(DSL_ListActions object)
      {
        return createDSL_ListActionsAdapter();
      }
      @Override
      public Adapter caseDSL_ResourceAction(DSL_ResourceAction object)
      {
        return createDSL_ResourceActionAdapter();
      }
      @Override
      public Adapter caseDSL_ListParam(DSL_ListParam object)
      {
        return createDSL_ListParamAdapter();
      }
      @Override
      public Adapter caseDSL_Expression(DSL_Expression object)
      {
        return createDSL_ExpressionAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Or(DSL_Expression_Or object)
      {
        return createDSL_Expression_OrAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_And(DSL_Expression_And object)
      {
        return createDSL_Expression_AndAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Diff(DSL_Expression_Diff object)
      {
        return createDSL_Expression_DiffAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Equal(DSL_Expression_Equal object)
      {
        return createDSL_Expression_EqualAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Larger(DSL_Expression_Larger object)
      {
        return createDSL_Expression_LargerAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Larger_Equal(DSL_Expression_Larger_Equal object)
      {
        return createDSL_Expression_Larger_EqualAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Smaller(DSL_Expression_Smaller object)
      {
        return createDSL_Expression_SmallerAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Smaller_Equal(DSL_Expression_Smaller_Equal object)
      {
        return createDSL_Expression_Smaller_EqualAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Plus(DSL_Expression_Plus object)
      {
        return createDSL_Expression_PlusAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Minus(DSL_Expression_Minus object)
      {
        return createDSL_Expression_MinusAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Multiplication(DSL_Expression_Multiplication object)
      {
        return createDSL_Expression_MultiplicationAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Division(DSL_Expression_Division object)
      {
        return createDSL_Expression_DivisionAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Modulo(DSL_Expression_Modulo object)
      {
        return createDSL_Expression_ModuloAdapter();
      }
      @Override
      public Adapter caseDSL_Object_Number(DSL_Object_Number object)
      {
        return createDSL_Object_NumberAdapter();
      }
      @Override
      public Adapter caseDSL_Object_String(DSL_Object_String object)
      {
        return createDSL_Object_StringAdapter();
      }
      @Override
      public Adapter caseDSL_Object_Boolean(DSL_Object_Boolean object)
      {
        return createDSL_Object_BooleanAdapter();
      }
      @Override
      public Adapter caseDSL_Object_Ref(DSL_Object_Ref object)
      {
        return createDSL_Object_RefAdapter();
      }
      @Override
      public Adapter caseDSL_Expression_Negate(DSL_Expression_Negate object)
      {
        return createDSL_Expression_NegateAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.Sensinact <em>Sensinact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.Sensinact
   * @generated
   */
  public Adapter createSensinactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT <em>DSL SENSINACT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT
   * @generated
   */
  public Adapter createDSL_SENSINACTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC <em>DSL CLOCK STOCHASTIC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC
   * @generated
   */
  public Adapter createDSL_CLOCK_STOCHASTICAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART <em>DSL FLAG AUTOSTART</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART
   * @generated
   */
  public Adapter createDSL_FLAG_AUTOSTARTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Resource <em>DSL Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Resource
   * @generated
   */
  public Adapter createDSL_ResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_On <em>DSL On</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_On
   * @generated
   */
  public Adapter createDSL_OnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT <em>DSL ECA STATEMENT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT
   * @generated
   */
  public Adapter createDSL_ECA_STATEMENTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo <em>DSL If Do</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo
   * @generated
   */
  public Adapter createDSL_IfDoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo <em>DSL Else If Do</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo
   * @generated
   */
  public Adapter createDSL_ElseIfDoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo <em>DSL Else Do</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo
   * @generated
   */
  public Adapter createDSL_ElseDoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_REF <em>DSL REF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_REF
   * @generated
   */
  public Adapter createDSL_REFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION <em>DSL REF CONDITION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION
   * @generated
   */
  public Adapter createDSL_REF_CONDITIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT <em>DSL CEP STATEMENT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT
   * @generated
   */
  public Adapter createDSL_CEP_STATEMENTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER <em>DSL CEP AFTER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER
   * @generated
   */
  public Adapter createDSL_CEP_AFTERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE <em>DSL CEP BEFORE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE
   * @generated
   */
  public Adapter createDSL_CEP_BEFOREAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE <em>DSL CEP COINCIDE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE
   * @generated
   */
  public Adapter createDSL_CEP_COINCIDEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN <em>DSL CEP MIN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN
   * @generated
   */
  public Adapter createDSL_CEP_MINAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX <em>DSL CEP MAX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX
   * @generated
   */
  public Adapter createDSL_CEP_MAXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG <em>DSL CEP AVG</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG
   * @generated
   */
  public Adapter createDSL_CEP_AVGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM <em>DSL CEP SUM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM
   * @generated
   */
  public Adapter createDSL_CEP_SUMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT <em>DSL CEP COUNT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT
   * @generated
   */
  public Adapter createDSL_CEP_COUNTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION <em>DSL CEP DURATION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION
   * @generated
   */
  public Adapter createDSL_CEP_DURATIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN <em>DSL CEP DURATION MIN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN
   * @generated
   */
  public Adapter createDSL_CEP_DURATION_MINAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC <em>DSL CEP DURATION SEC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC
   * @generated
   */
  public Adapter createDSL_CEP_DURATION_SECAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions <em>DSL List Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions
   * @generated
   */
  public Adapter createDSL_ListActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction <em>DSL Resource Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction
   * @generated
   */
  public Adapter createDSL_ResourceActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam <em>DSL List Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam
   * @generated
   */
  public Adapter createDSL_ListParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression <em>DSL Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression
   * @generated
   */
  public Adapter createDSL_ExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or <em>DSL Expression Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or
   * @generated
   */
  public Adapter createDSL_Expression_OrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And <em>DSL Expression And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And
   * @generated
   */
  public Adapter createDSL_Expression_AndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff <em>DSL Expression Diff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff
   * @generated
   */
  public Adapter createDSL_Expression_DiffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal <em>DSL Expression Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal
   * @generated
   */
  public Adapter createDSL_Expression_EqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger <em>DSL Expression Larger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger
   * @generated
   */
  public Adapter createDSL_Expression_LargerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal <em>DSL Expression Larger Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal
   * @generated
   */
  public Adapter createDSL_Expression_Larger_EqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller <em>DSL Expression Smaller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller
   * @generated
   */
  public Adapter createDSL_Expression_SmallerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal <em>DSL Expression Smaller Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal
   * @generated
   */
  public Adapter createDSL_Expression_Smaller_EqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus <em>DSL Expression Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus
   * @generated
   */
  public Adapter createDSL_Expression_PlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus <em>DSL Expression Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus
   * @generated
   */
  public Adapter createDSL_Expression_MinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication <em>DSL Expression Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication
   * @generated
   */
  public Adapter createDSL_Expression_MultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division <em>DSL Expression Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division
   * @generated
   */
  public Adapter createDSL_Expression_DivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo <em>DSL Expression Modulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo
   * @generated
   */
  public Adapter createDSL_Expression_ModuloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number <em>DSL Object Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number
   * @generated
   */
  public Adapter createDSL_Object_NumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String <em>DSL Object String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String
   * @generated
   */
  public Adapter createDSL_Object_StringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean <em>DSL Object Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean
   * @generated
   */
  public Adapter createDSL_Object_BooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref <em>DSL Object Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref
   * @generated
   */
  public Adapter createDSL_Object_RefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate <em>DSL Expression Negate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate
   * @generated
   */
  public Adapter createDSL_Expression_NegateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SensinactAdapterFactory
