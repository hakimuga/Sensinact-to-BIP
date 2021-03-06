/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String;
import org.eclipse.sensinact.studio.language.sensinact.DSL_On;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction;
import org.eclipse.sensinact.studio.language.sensinact.Sensinact;
import org.eclipse.sensinact.studio.language.sensinact.SensinactFactory;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensinactPackageImpl extends EPackageImpl implements SensinactPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sensinactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_SENSINACTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CLOCK_STOCHASTICEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_FLAG_AUTOSTARTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_ResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_OnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_ECA_STATEMENTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_IfDoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_ElseIfDoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_ElseDoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_REFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_REF_CONDITIONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_STATEMENTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_AFTEREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_BEFOREEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_COINCIDEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_MINEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_MAXEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_AVGEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_SUMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_COUNTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_DURATIONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_DURATION_MINEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_CEP_DURATION_SECEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_ListActionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_ResourceActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_ListParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_ExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_OrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_AndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_DiffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_EqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_LargerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_Larger_EqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_SmallerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_Smaller_EqualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_PlusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_MinusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_MultiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_DivisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_ModuloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Object_NumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Object_StringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Object_BooleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Object_RefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dsL_Expression_NegateEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SensinactPackageImpl()
  {
    super(eNS_URI, SensinactFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SensinactPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SensinactPackage init()
  {
    if (isInited) return (SensinactPackage)EPackage.Registry.INSTANCE.getEPackage(SensinactPackage.eNS_URI);

    // Obtain or create and register package
    SensinactPackageImpl theSensinactPackage = (SensinactPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SensinactPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SensinactPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSensinactPackage.createPackageContents();

    // Initialize created meta-data
    theSensinactPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSensinactPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SensinactPackage.eNS_URI, theSensinactPackage);
    return theSensinactPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSensinact()
  {
    return sensinactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSensinact_Eca()
  {
    return (EReference)sensinactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_SENSINACT()
  {
    return dsL_SENSINACTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_SENSINACT_Autostart()
  {
    return (EReference)dsL_SENSINACTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_SENSINACT_Resources()
  {
    return (EReference)dsL_SENSINACTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_SENSINACT_Prob()
  {
    return (EReference)dsL_SENSINACTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_SENSINACT_Cep()
  {
    return (EReference)dsL_SENSINACTEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_SENSINACT_On()
  {
    return (EReference)dsL_SENSINACTEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_SENSINACT_Eca()
  {
    return (EReference)dsL_SENSINACTEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CLOCK_STOCHASTIC()
  {
    return dsL_CLOCK_STOCHASTICEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CLOCK_STOCHASTIC_Ref()
  {
    return (EReference)dsL_CLOCK_STOCHASTICEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_CLOCK_STOCHASTIC_Value()
  {
    return (EAttribute)dsL_CLOCK_STOCHASTICEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_CLOCK_STOCHASTIC_Param1()
  {
    return (EAttribute)dsL_CLOCK_STOCHASTICEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_CLOCK_STOCHASTIC_Param2()
  {
    return (EAttribute)dsL_CLOCK_STOCHASTICEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_FLAG_AUTOSTART()
  {
    return dsL_FLAG_AUTOSTARTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_FLAG_AUTOSTART_Activated()
  {
    return (EAttribute)dsL_FLAG_AUTOSTARTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Resource()
  {
    return dsL_ResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_Resource_GatewayID()
  {
    return (EAttribute)dsL_ResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_Resource_DeviceID()
  {
    return (EAttribute)dsL_ResourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_Resource_ServiceID()
  {
    return (EAttribute)dsL_ResourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_Resource_ResourceID()
  {
    return (EAttribute)dsL_ResourceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_On()
  {
    return dsL_OnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_On_Triggers()
  {
    return (EReference)dsL_OnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_ECA_STATEMENT()
  {
    return dsL_ECA_STATEMENTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ECA_STATEMENT_Ifdo()
  {
    return (EReference)dsL_ECA_STATEMENTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ECA_STATEMENT_ElseIfdo()
  {
    return (EReference)dsL_ECA_STATEMENTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ECA_STATEMENT_Elsedo()
  {
    return (EReference)dsL_ECA_STATEMENTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_IfDo()
  {
    return dsL_IfDoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_IfDo_Condition()
  {
    return (EReference)dsL_IfDoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_IfDo_Actions()
  {
    return (EReference)dsL_IfDoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_ElseIfDo()
  {
    return dsL_ElseIfDoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ElseIfDo_Condition()
  {
    return (EReference)dsL_ElseIfDoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ElseIfDo_Actions()
  {
    return (EReference)dsL_ElseIfDoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_ElseDo()
  {
    return dsL_ElseDoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ElseDo_Actions()
  {
    return (EReference)dsL_ElseDoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_REF()
  {
    return dsL_REFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_REF_Name()
  {
    return (EAttribute)dsL_REFEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_REF_CONDITION()
  {
    return dsL_REF_CONDITIONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_REF_CONDITION_Ref()
  {
    return (EReference)dsL_REF_CONDITIONEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_STATEMENT()
  {
    return dsL_CEP_STATEMENTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_STATEMENT_Operation()
  {
    return (EReference)dsL_CEP_STATEMENTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_AFTER()
  {
    return dsL_CEP_AFTEREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_AFTER_Ref1()
  {
    return (EReference)dsL_CEP_AFTEREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_AFTER_Ref2()
  {
    return (EReference)dsL_CEP_AFTEREClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_AFTER_Start()
  {
    return (EReference)dsL_CEP_AFTEREClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_AFTER_End()
  {
    return (EReference)dsL_CEP_AFTEREClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_BEFORE()
  {
    return dsL_CEP_BEFOREEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_BEFORE_Ref1()
  {
    return (EReference)dsL_CEP_BEFOREEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_BEFORE_Ref2()
  {
    return (EReference)dsL_CEP_BEFOREEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_BEFORE_Start()
  {
    return (EReference)dsL_CEP_BEFOREEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_BEFORE_End()
  {
    return (EReference)dsL_CEP_BEFOREEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_COINCIDE()
  {
    return dsL_CEP_COINCIDEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_COINCIDE_Ref1()
  {
    return (EReference)dsL_CEP_COINCIDEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_COINCIDE_Ref2()
  {
    return (EReference)dsL_CEP_COINCIDEEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_COINCIDE_Window()
  {
    return (EReference)dsL_CEP_COINCIDEEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_MIN()
  {
    return dsL_CEP_MINEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_MIN_Ref()
  {
    return (EReference)dsL_CEP_MINEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_MIN_Window()
  {
    return (EReference)dsL_CEP_MINEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_MAX()
  {
    return dsL_CEP_MAXEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_MAX_Ref()
  {
    return (EReference)dsL_CEP_MAXEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_MAX_Window()
  {
    return (EReference)dsL_CEP_MAXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_AVG()
  {
    return dsL_CEP_AVGEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_AVG_Ref()
  {
    return (EReference)dsL_CEP_AVGEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_AVG_Window()
  {
    return (EReference)dsL_CEP_AVGEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_SUM()
  {
    return dsL_CEP_SUMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_SUM_Ref()
  {
    return (EReference)dsL_CEP_SUMEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_SUM_Window()
  {
    return (EReference)dsL_CEP_SUMEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_COUNT()
  {
    return dsL_CEP_COUNTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_COUNT_Ref()
  {
    return (EReference)dsL_CEP_COUNTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_COUNT_Window()
  {
    return (EReference)dsL_CEP_COUNTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_DURATION()
  {
    return dsL_CEP_DURATIONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_CEP_DURATION_Units()
  {
    return (EReference)dsL_CEP_DURATIONEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_DURATION_MIN()
  {
    return dsL_CEP_DURATION_MINEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_CEP_DURATION_MIN_Min()
  {
    return (EAttribute)dsL_CEP_DURATION_MINEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_CEP_DURATION_SEC()
  {
    return dsL_CEP_DURATION_SECEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_CEP_DURATION_SEC_Sec()
  {
    return (EAttribute)dsL_CEP_DURATION_SECEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_ListActions()
  {
    return dsL_ListActionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ListActions_ActionList()
  {
    return (EReference)dsL_ListActionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_ResourceAction()
  {
    return dsL_ResourceActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_ResourceAction_Variable()
  {
    return (EAttribute)dsL_ResourceActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ResourceAction_Ref()
  {
    return (EReference)dsL_ResourceActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_ResourceAction_Actiontype()
  {
    return (EAttribute)dsL_ResourceActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ResourceAction_ListParam()
  {
    return (EReference)dsL_ResourceActionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_ListParam()
  {
    return dsL_ListParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_ListParam_Param()
  {
    return (EReference)dsL_ListParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression()
  {
    return dsL_ExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Or()
  {
    return dsL_Expression_OrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Or_Left()
  {
    return (EReference)dsL_Expression_OrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Or_Right()
  {
    return (EReference)dsL_Expression_OrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_And()
  {
    return dsL_Expression_AndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_And_Left()
  {
    return (EReference)dsL_Expression_AndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_And_Right()
  {
    return (EReference)dsL_Expression_AndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Diff()
  {
    return dsL_Expression_DiffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Diff_Left()
  {
    return (EReference)dsL_Expression_DiffEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Diff_Right()
  {
    return (EReference)dsL_Expression_DiffEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Equal()
  {
    return dsL_Expression_EqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Equal_Left()
  {
    return (EReference)dsL_Expression_EqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Equal_Right()
  {
    return (EReference)dsL_Expression_EqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Larger()
  {
    return dsL_Expression_LargerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Larger_Left()
  {
    return (EReference)dsL_Expression_LargerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Larger_Right()
  {
    return (EReference)dsL_Expression_LargerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Larger_Equal()
  {
    return dsL_Expression_Larger_EqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Larger_Equal_Left()
  {
    return (EReference)dsL_Expression_Larger_EqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Larger_Equal_Right()
  {
    return (EReference)dsL_Expression_Larger_EqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Smaller()
  {
    return dsL_Expression_SmallerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Smaller_Left()
  {
    return (EReference)dsL_Expression_SmallerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Smaller_Right()
  {
    return (EReference)dsL_Expression_SmallerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Smaller_Equal()
  {
    return dsL_Expression_Smaller_EqualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Smaller_Equal_Left()
  {
    return (EReference)dsL_Expression_Smaller_EqualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Smaller_Equal_Right()
  {
    return (EReference)dsL_Expression_Smaller_EqualEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Plus()
  {
    return dsL_Expression_PlusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Plus_Left()
  {
    return (EReference)dsL_Expression_PlusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Plus_Right()
  {
    return (EReference)dsL_Expression_PlusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Minus()
  {
    return dsL_Expression_MinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Minus_Left()
  {
    return (EReference)dsL_Expression_MinusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Minus_Right()
  {
    return (EReference)dsL_Expression_MinusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Multiplication()
  {
    return dsL_Expression_MultiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Multiplication_Left()
  {
    return (EReference)dsL_Expression_MultiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Multiplication_Right()
  {
    return (EReference)dsL_Expression_MultiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Division()
  {
    return dsL_Expression_DivisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Division_Left()
  {
    return (EReference)dsL_Expression_DivisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Division_Right()
  {
    return (EReference)dsL_Expression_DivisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Modulo()
  {
    return dsL_Expression_ModuloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Modulo_Left()
  {
    return (EReference)dsL_Expression_ModuloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Modulo_Right()
  {
    return (EReference)dsL_Expression_ModuloEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Object_Number()
  {
    return dsL_Object_NumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_Object_Number_Value()
  {
    return (EAttribute)dsL_Object_NumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Object_String()
  {
    return dsL_Object_StringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_Object_String_Value()
  {
    return (EAttribute)dsL_Object_StringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Object_Boolean()
  {
    return dsL_Object_BooleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSL_Object_Boolean_Value()
  {
    return (EAttribute)dsL_Object_BooleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Object_Ref()
  {
    return dsL_Object_RefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Object_Ref_Value()
  {
    return (EReference)dsL_Object_RefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSL_Expression_Negate()
  {
    return dsL_Expression_NegateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDSL_Expression_Negate_Exp()
  {
    return (EReference)dsL_Expression_NegateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SensinactFactory getSensinactFactory()
  {
    return (SensinactFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sensinactEClass = createEClass(SENSINACT);
    createEReference(sensinactEClass, SENSINACT__ECA);

    dsL_SENSINACTEClass = createEClass(DSL_SENSINACT);
    createEReference(dsL_SENSINACTEClass, DSL_SENSINACT__AUTOSTART);
    createEReference(dsL_SENSINACTEClass, DSL_SENSINACT__RESOURCES);
    createEReference(dsL_SENSINACTEClass, DSL_SENSINACT__PROB);
    createEReference(dsL_SENSINACTEClass, DSL_SENSINACT__CEP);
    createEReference(dsL_SENSINACTEClass, DSL_SENSINACT__ON);
    createEReference(dsL_SENSINACTEClass, DSL_SENSINACT__ECA);

    dsL_CLOCK_STOCHASTICEClass = createEClass(DSL_CLOCK_STOCHASTIC);
    createEReference(dsL_CLOCK_STOCHASTICEClass, DSL_CLOCK_STOCHASTIC__REF);
    createEAttribute(dsL_CLOCK_STOCHASTICEClass, DSL_CLOCK_STOCHASTIC__VALUE);
    createEAttribute(dsL_CLOCK_STOCHASTICEClass, DSL_CLOCK_STOCHASTIC__PARAM1);
    createEAttribute(dsL_CLOCK_STOCHASTICEClass, DSL_CLOCK_STOCHASTIC__PARAM2);

    dsL_FLAG_AUTOSTARTEClass = createEClass(DSL_FLAG_AUTOSTART);
    createEAttribute(dsL_FLAG_AUTOSTARTEClass, DSL_FLAG_AUTOSTART__ACTIVATED);

    dsL_ResourceEClass = createEClass(DSL_RESOURCE);
    createEAttribute(dsL_ResourceEClass, DSL_RESOURCE__GATEWAY_ID);
    createEAttribute(dsL_ResourceEClass, DSL_RESOURCE__DEVICE_ID);
    createEAttribute(dsL_ResourceEClass, DSL_RESOURCE__SERVICE_ID);
    createEAttribute(dsL_ResourceEClass, DSL_RESOURCE__RESOURCE_ID);

    dsL_OnEClass = createEClass(DSL_ON);
    createEReference(dsL_OnEClass, DSL_ON__TRIGGERS);

    dsL_ECA_STATEMENTEClass = createEClass(DSL_ECA_STATEMENT);
    createEReference(dsL_ECA_STATEMENTEClass, DSL_ECA_STATEMENT__IFDO);
    createEReference(dsL_ECA_STATEMENTEClass, DSL_ECA_STATEMENT__ELSE_IFDO);
    createEReference(dsL_ECA_STATEMENTEClass, DSL_ECA_STATEMENT__ELSEDO);

    dsL_IfDoEClass = createEClass(DSL_IF_DO);
    createEReference(dsL_IfDoEClass, DSL_IF_DO__CONDITION);
    createEReference(dsL_IfDoEClass, DSL_IF_DO__ACTIONS);

    dsL_ElseIfDoEClass = createEClass(DSL_ELSE_IF_DO);
    createEReference(dsL_ElseIfDoEClass, DSL_ELSE_IF_DO__CONDITION);
    createEReference(dsL_ElseIfDoEClass, DSL_ELSE_IF_DO__ACTIONS);

    dsL_ElseDoEClass = createEClass(DSL_ELSE_DO);
    createEReference(dsL_ElseDoEClass, DSL_ELSE_DO__ACTIONS);

    dsL_REFEClass = createEClass(DSL_REF);
    createEAttribute(dsL_REFEClass, DSL_REF__NAME);

    dsL_REF_CONDITIONEClass = createEClass(DSL_REF_CONDITION);
    createEReference(dsL_REF_CONDITIONEClass, DSL_REF_CONDITION__REF);

    dsL_CEP_STATEMENTEClass = createEClass(DSL_CEP_STATEMENT);
    createEReference(dsL_CEP_STATEMENTEClass, DSL_CEP_STATEMENT__OPERATION);

    dsL_CEP_AFTEREClass = createEClass(DSL_CEP_AFTER);
    createEReference(dsL_CEP_AFTEREClass, DSL_CEP_AFTER__REF1);
    createEReference(dsL_CEP_AFTEREClass, DSL_CEP_AFTER__REF2);
    createEReference(dsL_CEP_AFTEREClass, DSL_CEP_AFTER__START);
    createEReference(dsL_CEP_AFTEREClass, DSL_CEP_AFTER__END);

    dsL_CEP_BEFOREEClass = createEClass(DSL_CEP_BEFORE);
    createEReference(dsL_CEP_BEFOREEClass, DSL_CEP_BEFORE__REF1);
    createEReference(dsL_CEP_BEFOREEClass, DSL_CEP_BEFORE__REF2);
    createEReference(dsL_CEP_BEFOREEClass, DSL_CEP_BEFORE__START);
    createEReference(dsL_CEP_BEFOREEClass, DSL_CEP_BEFORE__END);

    dsL_CEP_COINCIDEEClass = createEClass(DSL_CEP_COINCIDE);
    createEReference(dsL_CEP_COINCIDEEClass, DSL_CEP_COINCIDE__REF1);
    createEReference(dsL_CEP_COINCIDEEClass, DSL_CEP_COINCIDE__REF2);
    createEReference(dsL_CEP_COINCIDEEClass, DSL_CEP_COINCIDE__WINDOW);

    dsL_CEP_MINEClass = createEClass(DSL_CEP_MIN);
    createEReference(dsL_CEP_MINEClass, DSL_CEP_MIN__REF);
    createEReference(dsL_CEP_MINEClass, DSL_CEP_MIN__WINDOW);

    dsL_CEP_MAXEClass = createEClass(DSL_CEP_MAX);
    createEReference(dsL_CEP_MAXEClass, DSL_CEP_MAX__REF);
    createEReference(dsL_CEP_MAXEClass, DSL_CEP_MAX__WINDOW);

    dsL_CEP_AVGEClass = createEClass(DSL_CEP_AVG);
    createEReference(dsL_CEP_AVGEClass, DSL_CEP_AVG__REF);
    createEReference(dsL_CEP_AVGEClass, DSL_CEP_AVG__WINDOW);

    dsL_CEP_SUMEClass = createEClass(DSL_CEP_SUM);
    createEReference(dsL_CEP_SUMEClass, DSL_CEP_SUM__REF);
    createEReference(dsL_CEP_SUMEClass, DSL_CEP_SUM__WINDOW);

    dsL_CEP_COUNTEClass = createEClass(DSL_CEP_COUNT);
    createEReference(dsL_CEP_COUNTEClass, DSL_CEP_COUNT__REF);
    createEReference(dsL_CEP_COUNTEClass, DSL_CEP_COUNT__WINDOW);

    dsL_CEP_DURATIONEClass = createEClass(DSL_CEP_DURATION);
    createEReference(dsL_CEP_DURATIONEClass, DSL_CEP_DURATION__UNITS);

    dsL_CEP_DURATION_MINEClass = createEClass(DSL_CEP_DURATION_MIN);
    createEAttribute(dsL_CEP_DURATION_MINEClass, DSL_CEP_DURATION_MIN__MIN);

    dsL_CEP_DURATION_SECEClass = createEClass(DSL_CEP_DURATION_SEC);
    createEAttribute(dsL_CEP_DURATION_SECEClass, DSL_CEP_DURATION_SEC__SEC);

    dsL_ListActionsEClass = createEClass(DSL_LIST_ACTIONS);
    createEReference(dsL_ListActionsEClass, DSL_LIST_ACTIONS__ACTION_LIST);

    dsL_ResourceActionEClass = createEClass(DSL_RESOURCE_ACTION);
    createEAttribute(dsL_ResourceActionEClass, DSL_RESOURCE_ACTION__VARIABLE);
    createEReference(dsL_ResourceActionEClass, DSL_RESOURCE_ACTION__REF);
    createEAttribute(dsL_ResourceActionEClass, DSL_RESOURCE_ACTION__ACTIONTYPE);
    createEReference(dsL_ResourceActionEClass, DSL_RESOURCE_ACTION__LIST_PARAM);

    dsL_ListParamEClass = createEClass(DSL_LIST_PARAM);
    createEReference(dsL_ListParamEClass, DSL_LIST_PARAM__PARAM);

    dsL_ExpressionEClass = createEClass(DSL_EXPRESSION);

    dsL_Expression_OrEClass = createEClass(DSL_EXPRESSION_OR);
    createEReference(dsL_Expression_OrEClass, DSL_EXPRESSION_OR__LEFT);
    createEReference(dsL_Expression_OrEClass, DSL_EXPRESSION_OR__RIGHT);

    dsL_Expression_AndEClass = createEClass(DSL_EXPRESSION_AND);
    createEReference(dsL_Expression_AndEClass, DSL_EXPRESSION_AND__LEFT);
    createEReference(dsL_Expression_AndEClass, DSL_EXPRESSION_AND__RIGHT);

    dsL_Expression_DiffEClass = createEClass(DSL_EXPRESSION_DIFF);
    createEReference(dsL_Expression_DiffEClass, DSL_EXPRESSION_DIFF__LEFT);
    createEReference(dsL_Expression_DiffEClass, DSL_EXPRESSION_DIFF__RIGHT);

    dsL_Expression_EqualEClass = createEClass(DSL_EXPRESSION_EQUAL);
    createEReference(dsL_Expression_EqualEClass, DSL_EXPRESSION_EQUAL__LEFT);
    createEReference(dsL_Expression_EqualEClass, DSL_EXPRESSION_EQUAL__RIGHT);

    dsL_Expression_LargerEClass = createEClass(DSL_EXPRESSION_LARGER);
    createEReference(dsL_Expression_LargerEClass, DSL_EXPRESSION_LARGER__LEFT);
    createEReference(dsL_Expression_LargerEClass, DSL_EXPRESSION_LARGER__RIGHT);

    dsL_Expression_Larger_EqualEClass = createEClass(DSL_EXPRESSION_LARGER_EQUAL);
    createEReference(dsL_Expression_Larger_EqualEClass, DSL_EXPRESSION_LARGER_EQUAL__LEFT);
    createEReference(dsL_Expression_Larger_EqualEClass, DSL_EXPRESSION_LARGER_EQUAL__RIGHT);

    dsL_Expression_SmallerEClass = createEClass(DSL_EXPRESSION_SMALLER);
    createEReference(dsL_Expression_SmallerEClass, DSL_EXPRESSION_SMALLER__LEFT);
    createEReference(dsL_Expression_SmallerEClass, DSL_EXPRESSION_SMALLER__RIGHT);

    dsL_Expression_Smaller_EqualEClass = createEClass(DSL_EXPRESSION_SMALLER_EQUAL);
    createEReference(dsL_Expression_Smaller_EqualEClass, DSL_EXPRESSION_SMALLER_EQUAL__LEFT);
    createEReference(dsL_Expression_Smaller_EqualEClass, DSL_EXPRESSION_SMALLER_EQUAL__RIGHT);

    dsL_Expression_PlusEClass = createEClass(DSL_EXPRESSION_PLUS);
    createEReference(dsL_Expression_PlusEClass, DSL_EXPRESSION_PLUS__LEFT);
    createEReference(dsL_Expression_PlusEClass, DSL_EXPRESSION_PLUS__RIGHT);

    dsL_Expression_MinusEClass = createEClass(DSL_EXPRESSION_MINUS);
    createEReference(dsL_Expression_MinusEClass, DSL_EXPRESSION_MINUS__LEFT);
    createEReference(dsL_Expression_MinusEClass, DSL_EXPRESSION_MINUS__RIGHT);

    dsL_Expression_MultiplicationEClass = createEClass(DSL_EXPRESSION_MULTIPLICATION);
    createEReference(dsL_Expression_MultiplicationEClass, DSL_EXPRESSION_MULTIPLICATION__LEFT);
    createEReference(dsL_Expression_MultiplicationEClass, DSL_EXPRESSION_MULTIPLICATION__RIGHT);

    dsL_Expression_DivisionEClass = createEClass(DSL_EXPRESSION_DIVISION);
    createEReference(dsL_Expression_DivisionEClass, DSL_EXPRESSION_DIVISION__LEFT);
    createEReference(dsL_Expression_DivisionEClass, DSL_EXPRESSION_DIVISION__RIGHT);

    dsL_Expression_ModuloEClass = createEClass(DSL_EXPRESSION_MODULO);
    createEReference(dsL_Expression_ModuloEClass, DSL_EXPRESSION_MODULO__LEFT);
    createEReference(dsL_Expression_ModuloEClass, DSL_EXPRESSION_MODULO__RIGHT);

    dsL_Object_NumberEClass = createEClass(DSL_OBJECT_NUMBER);
    createEAttribute(dsL_Object_NumberEClass, DSL_OBJECT_NUMBER__VALUE);

    dsL_Object_StringEClass = createEClass(DSL_OBJECT_STRING);
    createEAttribute(dsL_Object_StringEClass, DSL_OBJECT_STRING__VALUE);

    dsL_Object_BooleanEClass = createEClass(DSL_OBJECT_BOOLEAN);
    createEAttribute(dsL_Object_BooleanEClass, DSL_OBJECT_BOOLEAN__VALUE);

    dsL_Object_RefEClass = createEClass(DSL_OBJECT_REF);
    createEReference(dsL_Object_RefEClass, DSL_OBJECT_REF__VALUE);

    dsL_Expression_NegateEClass = createEClass(DSL_EXPRESSION_NEGATE);
    createEReference(dsL_Expression_NegateEClass, DSL_EXPRESSION_NEGATE__EXP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dsL_ResourceEClass.getESuperTypes().add(this.getDSL_REF());
    dsL_CEP_STATEMENTEClass.getESuperTypes().add(this.getDSL_REF());
    dsL_Expression_OrEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_AndEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_DiffEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_EqualEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_LargerEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_Larger_EqualEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_SmallerEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_Smaller_EqualEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_PlusEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_MinusEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_MultiplicationEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_DivisionEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_ModuloEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Object_NumberEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Object_StringEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Object_BooleanEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Object_RefEClass.getESuperTypes().add(this.getDSL_Expression());
    dsL_Expression_NegateEClass.getESuperTypes().add(this.getDSL_Expression());

    // Initialize classes and features; add operations and parameters
    initEClass(sensinactEClass, Sensinact.class, "Sensinact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSensinact_Eca(), this.getDSL_SENSINACT(), null, "eca", null, 0, 1, Sensinact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_SENSINACTEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT.class, "DSL_SENSINACT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_SENSINACT_Autostart(), this.getDSL_FLAG_AUTOSTART(), null, "autostart", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_SENSINACT_Resources(), this.getDSL_Resource(), null, "resources", null, 0, -1, org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_SENSINACT_Prob(), this.getDSL_CLOCK_STOCHASTIC(), null, "prob", null, 0, -1, org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_SENSINACT_Cep(), this.getDSL_CEP_STATEMENT(), null, "cep", null, 0, -1, org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_SENSINACT_On(), this.getDSL_On(), null, "on", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_SENSINACT_Eca(), this.getDSL_ECA_STATEMENT(), null, "eca", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CLOCK_STOCHASTICEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC.class, "DSL_CLOCK_STOCHASTIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CLOCK_STOCHASTIC_Ref(), this.getDSL_Resource(), null, "ref", null, 0, -1, org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSL_CLOCK_STOCHASTIC_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSL_CLOCK_STOCHASTIC_Param1(), ecorePackage.getEBigDecimal(), "param1", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSL_CLOCK_STOCHASTIC_Param2(), ecorePackage.getEBigDecimal(), "param2", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_FLAG_AUTOSTARTEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART.class, "DSL_FLAG_AUTOSTART", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_FLAG_AUTOSTART_Activated(), ecorePackage.getEBoolean(), "activated", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_ResourceEClass, DSL_Resource.class, "DSL_Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_Resource_GatewayID(), ecorePackage.getEString(), "gatewayID", null, 0, 1, DSL_Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSL_Resource_DeviceID(), ecorePackage.getEString(), "deviceID", null, 0, 1, DSL_Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSL_Resource_ServiceID(), ecorePackage.getEString(), "serviceID", null, 0, 1, DSL_Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSL_Resource_ResourceID(), ecorePackage.getEString(), "resourceID", null, 0, 1, DSL_Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_OnEClass, DSL_On.class, "DSL_On", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_On_Triggers(), this.getDSL_REF_CONDITION(), null, "triggers", null, 0, -1, DSL_On.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_ECA_STATEMENTEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT.class, "DSL_ECA_STATEMENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_ECA_STATEMENT_Ifdo(), this.getDSL_IfDo(), null, "ifdo", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_ECA_STATEMENT_ElseIfdo(), this.getDSL_ElseIfDo(), null, "elseIfdo", null, 0, -1, org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_ECA_STATEMENT_Elsedo(), this.getDSL_ElseDo(), null, "elsedo", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_IfDoEClass, DSL_IfDo.class, "DSL_IfDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_IfDo_Condition(), this.getDSL_Expression(), null, "condition", null, 0, 1, DSL_IfDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_IfDo_Actions(), this.getDSL_ListActions(), null, "actions", null, 0, 1, DSL_IfDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_ElseIfDoEClass, DSL_ElseIfDo.class, "DSL_ElseIfDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_ElseIfDo_Condition(), this.getDSL_Expression(), null, "condition", null, 0, 1, DSL_ElseIfDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_ElseIfDo_Actions(), this.getDSL_ListActions(), null, "actions", null, 0, 1, DSL_ElseIfDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_ElseDoEClass, DSL_ElseDo.class, "DSL_ElseDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_ElseDo_Actions(), this.getDSL_ListActions(), null, "actions", null, 0, 1, DSL_ElseDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_REFEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_REF.class, "DSL_REF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_REF_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_REF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_REF_CONDITIONEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION.class, "DSL_REF_CONDITION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_REF_CONDITION_Ref(), this.getDSL_REF(), null, "ref", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_STATEMENTEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT.class, "DSL_CEP_STATEMENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_STATEMENT_Operation(), ecorePackage.getEObject(), null, "operation", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_AFTEREClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER.class, "DSL_CEP_AFTER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_AFTER_Ref1(), this.getDSL_REF_CONDITION(), null, "ref1", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_AFTER_Ref2(), this.getDSL_REF_CONDITION(), null, "ref2", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_AFTER_Start(), this.getDSL_CEP_DURATION(), null, "start", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_AFTER_End(), this.getDSL_CEP_DURATION(), null, "end", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_BEFOREEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE.class, "DSL_CEP_BEFORE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_BEFORE_Ref1(), this.getDSL_REF_CONDITION(), null, "ref1", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_BEFORE_Ref2(), this.getDSL_REF_CONDITION(), null, "ref2", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_BEFORE_Start(), this.getDSL_CEP_DURATION(), null, "start", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_BEFORE_End(), this.getDSL_CEP_DURATION(), null, "end", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_COINCIDEEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE.class, "DSL_CEP_COINCIDE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_COINCIDE_Ref1(), this.getDSL_REF_CONDITION(), null, "ref1", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_COINCIDE_Ref2(), this.getDSL_REF_CONDITION(), null, "ref2", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_COINCIDE_Window(), this.getDSL_CEP_DURATION(), null, "window", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_MINEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN.class, "DSL_CEP_MIN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_MIN_Ref(), this.getDSL_REF_CONDITION(), null, "ref", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_MIN_Window(), this.getDSL_CEP_DURATION(), null, "window", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_MAXEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX.class, "DSL_CEP_MAX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_MAX_Ref(), this.getDSL_REF_CONDITION(), null, "ref", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_MAX_Window(), this.getDSL_CEP_DURATION(), null, "window", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_AVGEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG.class, "DSL_CEP_AVG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_AVG_Ref(), this.getDSL_REF_CONDITION(), null, "ref", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_AVG_Window(), this.getDSL_CEP_DURATION(), null, "window", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_SUMEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM.class, "DSL_CEP_SUM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_SUM_Ref(), this.getDSL_REF_CONDITION(), null, "ref", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_SUM_Window(), this.getDSL_CEP_DURATION(), null, "window", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_COUNTEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT.class, "DSL_CEP_COUNT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_COUNT_Ref(), this.getDSL_REF_CONDITION(), null, "ref", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_CEP_COUNT_Window(), this.getDSL_CEP_DURATION(), null, "window", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_DURATIONEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION.class, "DSL_CEP_DURATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_CEP_DURATION_Units(), ecorePackage.getEObject(), null, "units", null, 0, -1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_DURATION_MINEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN.class, "DSL_CEP_DURATION_MIN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_CEP_DURATION_MIN_Min(), ecorePackage.getEBigDecimal(), "min", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_CEP_DURATION_SECEClass, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC.class, "DSL_CEP_DURATION_SEC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_CEP_DURATION_SEC_Sec(), ecorePackage.getEBigDecimal(), "sec", null, 0, 1, org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_ListActionsEClass, DSL_ListActions.class, "DSL_ListActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_ListActions_ActionList(), this.getDSL_ResourceAction(), null, "actionList", null, 0, -1, DSL_ListActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_ResourceActionEClass, DSL_ResourceAction.class, "DSL_ResourceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_ResourceAction_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, DSL_ResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_ResourceAction_Ref(), this.getDSL_REF(), null, "ref", null, 0, 1, DSL_ResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDSL_ResourceAction_Actiontype(), ecorePackage.getEString(), "actiontype", null, 0, 1, DSL_ResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_ResourceAction_ListParam(), this.getDSL_ListParam(), null, "listParam", null, 0, 1, DSL_ResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_ListParamEClass, DSL_ListParam.class, "DSL_ListParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_ListParam_Param(), this.getDSL_Expression(), null, "param", null, 0, -1, DSL_ListParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_ExpressionEClass, DSL_Expression.class, "DSL_Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dsL_Expression_OrEClass, DSL_Expression_Or.class, "DSL_Expression_Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Or_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Or_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_AndEClass, DSL_Expression_And.class, "DSL_Expression_And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_And_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_And_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_DiffEClass, DSL_Expression_Diff.class, "DSL_Expression_Diff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Diff_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Diff_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_EqualEClass, DSL_Expression_Equal.class, "DSL_Expression_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Equal_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Equal_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_LargerEClass, DSL_Expression_Larger.class, "DSL_Expression_Larger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Larger_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Larger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Larger_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Larger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_Larger_EqualEClass, DSL_Expression_Larger_Equal.class, "DSL_Expression_Larger_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Larger_Equal_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Larger_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Larger_Equal_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Larger_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_SmallerEClass, DSL_Expression_Smaller.class, "DSL_Expression_Smaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Smaller_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Smaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Smaller_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Smaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_Smaller_EqualEClass, DSL_Expression_Smaller_Equal.class, "DSL_Expression_Smaller_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Smaller_Equal_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Smaller_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Smaller_Equal_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Smaller_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_PlusEClass, DSL_Expression_Plus.class, "DSL_Expression_Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Plus_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Plus_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_MinusEClass, DSL_Expression_Minus.class, "DSL_Expression_Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Minus_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Minus_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_MultiplicationEClass, DSL_Expression_Multiplication.class, "DSL_Expression_Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Multiplication_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Multiplication_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_DivisionEClass, DSL_Expression_Division.class, "DSL_Expression_Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Division_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Division_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_ModuloEClass, DSL_Expression_Modulo.class, "DSL_Expression_Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Modulo_Left(), this.getDSL_Expression(), null, "left", null, 0, 1, DSL_Expression_Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDSL_Expression_Modulo_Right(), this.getDSL_Expression(), null, "right", null, 0, 1, DSL_Expression_Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Object_NumberEClass, DSL_Object_Number.class, "DSL_Object_Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_Object_Number_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, DSL_Object_Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Object_StringEClass, DSL_Object_String.class, "DSL_Object_String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_Object_String_Value(), ecorePackage.getEString(), "value", null, 0, 1, DSL_Object_String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Object_BooleanEClass, DSL_Object_Boolean.class, "DSL_Object_Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSL_Object_Boolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, DSL_Object_Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Object_RefEClass, DSL_Object_Ref.class, "DSL_Object_Ref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Object_Ref_Value(), this.getDSL_REF(), null, "value", null, 0, 1, DSL_Object_Ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dsL_Expression_NegateEClass, DSL_Expression_Negate.class, "DSL_Expression_Negate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDSL_Expression_Negate_Exp(), this.getDSL_Expression(), null, "exp", null, 0, 1, DSL_Expression_Negate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SensinactPackageImpl
