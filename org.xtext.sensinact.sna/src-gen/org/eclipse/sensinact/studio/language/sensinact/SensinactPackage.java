/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactFactory
 * @model kind="package"
 * @generated
 */
public interface SensinactPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sensinact";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/sensinact/studio/language/Sensinact";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sensinact";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SensinactPackage eINSTANCE = org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.SensinactImpl <em>Sensinact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getSensinact()
   * @generated
   */
  int SENSINACT = 0;

  /**
   * The feature id for the '<em><b>Eca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSINACT__ECA = 0;

  /**
   * The number of structural features of the '<em>Sensinact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSINACT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl <em>DSL SENSINACT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_SENSINACT()
   * @generated
   */
  int DSL_SENSINACT = 1;

  /**
   * The feature id for the '<em><b>Autostart</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_SENSINACT__AUTOSTART = 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_SENSINACT__RESOURCES = 1;

  /**
   * The feature id for the '<em><b>Prob</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_SENSINACT__PROB = 2;

  /**
   * The feature id for the '<em><b>Cep</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_SENSINACT__CEP = 3;

  /**
   * The feature id for the '<em><b>On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_SENSINACT__ON = 4;

  /**
   * The feature id for the '<em><b>Eca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_SENSINACT__ECA = 5;

  /**
   * The number of structural features of the '<em>DSL SENSINACT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_SENSINACT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CLOCK_STOCHASTICImpl <em>DSL CLOCK STOCHASTIC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CLOCK_STOCHASTICImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CLOCK_STOCHASTIC()
   * @generated
   */
  int DSL_CLOCK_STOCHASTIC = 2;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CLOCK_STOCHASTIC__REF = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CLOCK_STOCHASTIC__VALUE = 1;

  /**
   * The feature id for the '<em><b>Param1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CLOCK_STOCHASTIC__PARAM1 = 2;

  /**
   * The feature id for the '<em><b>Param2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CLOCK_STOCHASTIC__PARAM2 = 3;

  /**
   * The number of structural features of the '<em>DSL CLOCK STOCHASTIC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CLOCK_STOCHASTIC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_FLAG_AUTOSTARTImpl <em>DSL FLAG AUTOSTART</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_FLAG_AUTOSTARTImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_FLAG_AUTOSTART()
   * @generated
   */
  int DSL_FLAG_AUTOSTART = 3;

  /**
   * The feature id for the '<em><b>Activated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_FLAG_AUTOSTART__ACTIVATED = 0;

  /**
   * The number of structural features of the '<em>DSL FLAG AUTOSTART</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_FLAG_AUTOSTART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_REFImpl <em>DSL REF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_REFImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_REF()
   * @generated
   */
  int DSL_REF = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REF__NAME = 0;

  /**
   * The number of structural features of the '<em>DSL REF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceImpl <em>DSL Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Resource()
   * @generated
   */
  int DSL_RESOURCE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE__NAME = DSL_REF__NAME;

  /**
   * The feature id for the '<em><b>Gateway ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE__GATEWAY_ID = DSL_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Device ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE__DEVICE_ID = DSL_REF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Service ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE__SERVICE_ID = DSL_REF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Resource ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE__RESOURCE_ID = DSL_REF_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>DSL Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE_FEATURE_COUNT = DSL_REF_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_OnImpl <em>DSL On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_OnImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_On()
   * @generated
   */
  int DSL_ON = 5;

  /**
   * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ON__TRIGGERS = 0;

  /**
   * The number of structural features of the '<em>DSL On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ON_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ECA_STATEMENTImpl <em>DSL ECA STATEMENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ECA_STATEMENTImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ECA_STATEMENT()
   * @generated
   */
  int DSL_ECA_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Ifdo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ECA_STATEMENT__IFDO = 0;

  /**
   * The feature id for the '<em><b>Else Ifdo</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ECA_STATEMENT__ELSE_IFDO = 1;

  /**
   * The feature id for the '<em><b>Elsedo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ECA_STATEMENT__ELSEDO = 2;

  /**
   * The number of structural features of the '<em>DSL ECA STATEMENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ECA_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_IfDoImpl <em>DSL If Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_IfDoImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_IfDo()
   * @generated
   */
  int DSL_IF_DO = 7;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_IF_DO__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_IF_DO__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>DSL If Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_IF_DO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseIfDoImpl <em>DSL Else If Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseIfDoImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ElseIfDo()
   * @generated
   */
  int DSL_ELSE_IF_DO = 8;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ELSE_IF_DO__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ELSE_IF_DO__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>DSL Else If Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ELSE_IF_DO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseDoImpl <em>DSL Else Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseDoImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ElseDo()
   * @generated
   */
  int DSL_ELSE_DO = 9;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ELSE_DO__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>DSL Else Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ELSE_DO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_REF_CONDITIONImpl <em>DSL REF CONDITION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_REF_CONDITIONImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_REF_CONDITION()
   * @generated
   */
  int DSL_REF_CONDITION = 11;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REF_CONDITION__REF = 0;

  /**
   * The number of structural features of the '<em>DSL REF CONDITION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_REF_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_STATEMENTImpl <em>DSL CEP STATEMENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_STATEMENTImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_STATEMENT()
   * @generated
   */
  int DSL_CEP_STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_STATEMENT__NAME = DSL_REF__NAME;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_STATEMENT__OPERATION = DSL_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DSL CEP STATEMENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_STATEMENT_FEATURE_COUNT = DSL_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AFTERImpl <em>DSL CEP AFTER</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AFTERImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_AFTER()
   * @generated
   */
  int DSL_CEP_AFTER = 13;

  /**
   * The feature id for the '<em><b>Ref1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_AFTER__REF1 = 0;

  /**
   * The feature id for the '<em><b>Ref2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_AFTER__REF2 = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_AFTER__START = 2;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_AFTER__END = 3;

  /**
   * The number of structural features of the '<em>DSL CEP AFTER</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_AFTER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_BEFOREImpl <em>DSL CEP BEFORE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_BEFOREImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_BEFORE()
   * @generated
   */
  int DSL_CEP_BEFORE = 14;

  /**
   * The feature id for the '<em><b>Ref1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_BEFORE__REF1 = 0;

  /**
   * The feature id for the '<em><b>Ref2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_BEFORE__REF2 = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_BEFORE__START = 2;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_BEFORE__END = 3;

  /**
   * The number of structural features of the '<em>DSL CEP BEFORE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_BEFORE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COINCIDEImpl <em>DSL CEP COINCIDE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COINCIDEImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_COINCIDE()
   * @generated
   */
  int DSL_CEP_COINCIDE = 15;

  /**
   * The feature id for the '<em><b>Ref1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_COINCIDE__REF1 = 0;

  /**
   * The feature id for the '<em><b>Ref2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_COINCIDE__REF2 = 1;

  /**
   * The feature id for the '<em><b>Window</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_COINCIDE__WINDOW = 2;

  /**
   * The number of structural features of the '<em>DSL CEP COINCIDE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_COINCIDE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_MINImpl <em>DSL CEP MIN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_MINImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_MIN()
   * @generated
   */
  int DSL_CEP_MIN = 16;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_MIN__REF = 0;

  /**
   * The feature id for the '<em><b>Window</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_MIN__WINDOW = 1;

  /**
   * The number of structural features of the '<em>DSL CEP MIN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_MIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_MAXImpl <em>DSL CEP MAX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_MAXImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_MAX()
   * @generated
   */
  int DSL_CEP_MAX = 17;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_MAX__REF = 0;

  /**
   * The feature id for the '<em><b>Window</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_MAX__WINDOW = 1;

  /**
   * The number of structural features of the '<em>DSL CEP MAX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_MAX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AVGImpl <em>DSL CEP AVG</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AVGImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_AVG()
   * @generated
   */
  int DSL_CEP_AVG = 18;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_AVG__REF = 0;

  /**
   * The feature id for the '<em><b>Window</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_AVG__WINDOW = 1;

  /**
   * The number of structural features of the '<em>DSL CEP AVG</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_AVG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_SUMImpl <em>DSL CEP SUM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_SUMImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_SUM()
   * @generated
   */
  int DSL_CEP_SUM = 19;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_SUM__REF = 0;

  /**
   * The feature id for the '<em><b>Window</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_SUM__WINDOW = 1;

  /**
   * The number of structural features of the '<em>DSL CEP SUM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_SUM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COUNTImpl <em>DSL CEP COUNT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COUNTImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_COUNT()
   * @generated
   */
  int DSL_CEP_COUNT = 20;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_COUNT__REF = 0;

  /**
   * The feature id for the '<em><b>Window</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_COUNT__WINDOW = 1;

  /**
   * The number of structural features of the '<em>DSL CEP COUNT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_COUNT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATIONImpl <em>DSL CEP DURATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATIONImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_DURATION()
   * @generated
   */
  int DSL_CEP_DURATION = 21;

  /**
   * The feature id for the '<em><b>Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_DURATION__UNITS = 0;

  /**
   * The number of structural features of the '<em>DSL CEP DURATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_DURATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATION_MINImpl <em>DSL CEP DURATION MIN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATION_MINImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_DURATION_MIN()
   * @generated
   */
  int DSL_CEP_DURATION_MIN = 22;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_DURATION_MIN__MIN = 0;

  /**
   * The number of structural features of the '<em>DSL CEP DURATION MIN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_DURATION_MIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATION_SECImpl <em>DSL CEP DURATION SEC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATION_SECImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_DURATION_SEC()
   * @generated
   */
  int DSL_CEP_DURATION_SEC = 23;

  /**
   * The feature id for the '<em><b>Sec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_DURATION_SEC__SEC = 0;

  /**
   * The number of structural features of the '<em>DSL CEP DURATION SEC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_CEP_DURATION_SEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ListActionsImpl <em>DSL List Actions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ListActionsImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ListActions()
   * @generated
   */
  int DSL_LIST_ACTIONS = 24;

  /**
   * The feature id for the '<em><b>Action List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_LIST_ACTIONS__ACTION_LIST = 0;

  /**
   * The number of structural features of the '<em>DSL List Actions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_LIST_ACTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceActionImpl <em>DSL Resource Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceActionImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ResourceAction()
   * @generated
   */
  int DSL_RESOURCE_ACTION = 25;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE_ACTION__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE_ACTION__REF = 1;

  /**
   * The feature id for the '<em><b>Actiontype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE_ACTION__ACTIONTYPE = 2;

  /**
   * The feature id for the '<em><b>List Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE_ACTION__LIST_PARAM = 3;

  /**
   * The number of structural features of the '<em>DSL Resource Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_RESOURCE_ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ListParamImpl <em>DSL List Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ListParamImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ListParam()
   * @generated
   */
  int DSL_LIST_PARAM = 26;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_LIST_PARAM__PARAM = 0;

  /**
   * The number of structural features of the '<em>DSL List Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_LIST_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ExpressionImpl <em>DSL Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ExpressionImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression()
   * @generated
   */
  int DSL_EXPRESSION = 27;

  /**
   * The number of structural features of the '<em>DSL Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_OrImpl <em>DSL Expression Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_OrImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Or()
   * @generated
   */
  int DSL_EXPRESSION_OR = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_OR__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_OR__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_OR_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_AndImpl <em>DSL Expression And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_AndImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_And()
   * @generated
   */
  int DSL_EXPRESSION_AND = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_AND__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_AND__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_AND_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_DiffImpl <em>DSL Expression Diff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_DiffImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Diff()
   * @generated
   */
  int DSL_EXPRESSION_DIFF = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_DIFF__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_DIFF__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Diff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_DIFF_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_EqualImpl <em>DSL Expression Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_EqualImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Equal()
   * @generated
   */
  int DSL_EXPRESSION_EQUAL = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_EQUAL__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_EQUAL__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_EQUAL_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_LargerImpl <em>DSL Expression Larger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_LargerImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Larger()
   * @generated
   */
  int DSL_EXPRESSION_LARGER = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_LARGER__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_LARGER__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Larger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_LARGER_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_Larger_EqualImpl <em>DSL Expression Larger Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_Larger_EqualImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Larger_Equal()
   * @generated
   */
  int DSL_EXPRESSION_LARGER_EQUAL = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_LARGER_EQUAL__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_LARGER_EQUAL__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Larger Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_LARGER_EQUAL_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_SmallerImpl <em>DSL Expression Smaller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_SmallerImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Smaller()
   * @generated
   */
  int DSL_EXPRESSION_SMALLER = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_SMALLER__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_SMALLER__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Smaller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_SMALLER_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_Smaller_EqualImpl <em>DSL Expression Smaller Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_Smaller_EqualImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Smaller_Equal()
   * @generated
   */
  int DSL_EXPRESSION_SMALLER_EQUAL = 35;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_SMALLER_EQUAL__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_SMALLER_EQUAL__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Smaller Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_SMALLER_EQUAL_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_PlusImpl <em>DSL Expression Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_PlusImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Plus()
   * @generated
   */
  int DSL_EXPRESSION_PLUS = 36;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_PLUS__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_PLUS__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_PLUS_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_MinusImpl <em>DSL Expression Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_MinusImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Minus()
   * @generated
   */
  int DSL_EXPRESSION_MINUS = 37;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MINUS__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MINUS__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MINUS_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_MultiplicationImpl <em>DSL Expression Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_MultiplicationImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Multiplication()
   * @generated
   */
  int DSL_EXPRESSION_MULTIPLICATION = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MULTIPLICATION__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MULTIPLICATION__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MULTIPLICATION_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_DivisionImpl <em>DSL Expression Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_DivisionImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Division()
   * @generated
   */
  int DSL_EXPRESSION_DIVISION = 39;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_DIVISION__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_DIVISION__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_DIVISION_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_ModuloImpl <em>DSL Expression Modulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_ModuloImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Modulo()
   * @generated
   */
  int DSL_EXPRESSION_MODULO = 40;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MODULO__LEFT = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MODULO__RIGHT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DSL Expression Modulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_MODULO_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_NumberImpl <em>DSL Object Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_NumberImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Object_Number()
   * @generated
   */
  int DSL_OBJECT_NUMBER = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OBJECT_NUMBER__VALUE = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DSL Object Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OBJECT_NUMBER_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_StringImpl <em>DSL Object String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_StringImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Object_String()
   * @generated
   */
  int DSL_OBJECT_STRING = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OBJECT_STRING__VALUE = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DSL Object String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OBJECT_STRING_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_BooleanImpl <em>DSL Object Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_BooleanImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Object_Boolean()
   * @generated
   */
  int DSL_OBJECT_BOOLEAN = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OBJECT_BOOLEAN__VALUE = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DSL Object Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OBJECT_BOOLEAN_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_RefImpl <em>DSL Object Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_RefImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Object_Ref()
   * @generated
   */
  int DSL_OBJECT_REF = 44;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OBJECT_REF__VALUE = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DSL Object Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_OBJECT_REF_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_NegateImpl <em>DSL Expression Negate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_NegateImpl
   * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Negate()
   * @generated
   */
  int DSL_EXPRESSION_NEGATE = 45;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_NEGATE__EXP = DSL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DSL Expression Negate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_EXPRESSION_NEGATE_FEATURE_COUNT = DSL_EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.Sensinact <em>Sensinact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensinact</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.Sensinact
   * @generated
   */
  EClass getSensinact();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.Sensinact#getEca <em>Eca</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Eca</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.Sensinact#getEca()
   * @see #getSensinact()
   * @generated
   */
  EReference getSensinact_Eca();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT <em>DSL SENSINACT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL SENSINACT</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT
   * @generated
   */
  EClass getDSL_SENSINACT();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getAutostart <em>Autostart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Autostart</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getAutostart()
   * @see #getDSL_SENSINACT()
   * @generated
   */
  EReference getDSL_SENSINACT_Autostart();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getResources()
   * @see #getDSL_SENSINACT()
   * @generated
   */
  EReference getDSL_SENSINACT_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getProb <em>Prob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prob</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getProb()
   * @see #getDSL_SENSINACT()
   * @generated
   */
  EReference getDSL_SENSINACT_Prob();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getCep <em>Cep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cep</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getCep()
   * @see #getDSL_SENSINACT()
   * @generated
   */
  EReference getDSL_SENSINACT_Cep();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getOn <em>On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getOn()
   * @see #getDSL_SENSINACT()
   * @generated
   */
  EReference getDSL_SENSINACT_On();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getEca <em>Eca</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Eca</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT#getEca()
   * @see #getDSL_SENSINACT()
   * @generated
   */
  EReference getDSL_SENSINACT_Eca();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC <em>DSL CLOCK STOCHASTIC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CLOCK STOCHASTIC</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC
   * @generated
   */
  EClass getDSL_CLOCK_STOCHASTIC();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getRef()
   * @see #getDSL_CLOCK_STOCHASTIC()
   * @generated
   */
  EReference getDSL_CLOCK_STOCHASTIC_Ref();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getValue()
   * @see #getDSL_CLOCK_STOCHASTIC()
   * @generated
   */
  EAttribute getDSL_CLOCK_STOCHASTIC_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getParam1 <em>Param1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param1</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getParam1()
   * @see #getDSL_CLOCK_STOCHASTIC()
   * @generated
   */
  EAttribute getDSL_CLOCK_STOCHASTIC_Param1();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getParam2 <em>Param2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param2</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getParam2()
   * @see #getDSL_CLOCK_STOCHASTIC()
   * @generated
   */
  EAttribute getDSL_CLOCK_STOCHASTIC_Param2();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART <em>DSL FLAG AUTOSTART</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL FLAG AUTOSTART</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART
   * @generated
   */
  EClass getDSL_FLAG_AUTOSTART();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART#isActivated <em>Activated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Activated</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART#isActivated()
   * @see #getDSL_FLAG_AUTOSTART()
   * @generated
   */
  EAttribute getDSL_FLAG_AUTOSTART_Activated();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Resource <em>DSL Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Resource</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Resource
   * @generated
   */
  EClass getDSL_Resource();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Resource#getGatewayID <em>Gateway ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gateway ID</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Resource#getGatewayID()
   * @see #getDSL_Resource()
   * @generated
   */
  EAttribute getDSL_Resource_GatewayID();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Resource#getDeviceID <em>Device ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device ID</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Resource#getDeviceID()
   * @see #getDSL_Resource()
   * @generated
   */
  EAttribute getDSL_Resource_DeviceID();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Resource#getServiceID <em>Service ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service ID</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Resource#getServiceID()
   * @see #getDSL_Resource()
   * @generated
   */
  EAttribute getDSL_Resource_ServiceID();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Resource#getResourceID <em>Resource ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource ID</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Resource#getResourceID()
   * @see #getDSL_Resource()
   * @generated
   */
  EAttribute getDSL_Resource_ResourceID();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_On <em>DSL On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL On</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_On
   * @generated
   */
  EClass getDSL_On();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_On#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triggers</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_On#getTriggers()
   * @see #getDSL_On()
   * @generated
   */
  EReference getDSL_On_Triggers();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT <em>DSL ECA STATEMENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL ECA STATEMENT</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT
   * @generated
   */
  EClass getDSL_ECA_STATEMENT();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getIfdo <em>Ifdo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifdo</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getIfdo()
   * @see #getDSL_ECA_STATEMENT()
   * @generated
   */
  EReference getDSL_ECA_STATEMENT_Ifdo();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getElseIfdo <em>Else Ifdo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Ifdo</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getElseIfdo()
   * @see #getDSL_ECA_STATEMENT()
   * @generated
   */
  EReference getDSL_ECA_STATEMENT_ElseIfdo();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getElsedo <em>Elsedo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elsedo</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT#getElsedo()
   * @see #getDSL_ECA_STATEMENT()
   * @generated
   */
  EReference getDSL_ECA_STATEMENT_Elsedo();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo <em>DSL If Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL If Do</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo
   * @generated
   */
  EClass getDSL_IfDo();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo#getCondition()
   * @see #getDSL_IfDo()
   * @generated
   */
  EReference getDSL_IfDo_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actions</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo#getActions()
   * @see #getDSL_IfDo()
   * @generated
   */
  EReference getDSL_IfDo_Actions();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo <em>DSL Else If Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Else If Do</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo
   * @generated
   */
  EClass getDSL_ElseIfDo();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo#getCondition()
   * @see #getDSL_ElseIfDo()
   * @generated
   */
  EReference getDSL_ElseIfDo_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actions</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo#getActions()
   * @see #getDSL_ElseIfDo()
   * @generated
   */
  EReference getDSL_ElseIfDo_Actions();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo <em>DSL Else Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Else Do</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo
   * @generated
   */
  EClass getDSL_ElseDo();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actions</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo#getActions()
   * @see #getDSL_ElseDo()
   * @generated
   */
  EReference getDSL_ElseDo_Actions();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_REF <em>DSL REF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL REF</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_REF
   * @generated
   */
  EClass getDSL_REF();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_REF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_REF#getName()
   * @see #getDSL_REF()
   * @generated
   */
  EAttribute getDSL_REF_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION <em>DSL REF CONDITION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL REF CONDITION</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION
   * @generated
   */
  EClass getDSL_REF_CONDITION();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION#getRef()
   * @see #getDSL_REF_CONDITION()
   * @generated
   */
  EReference getDSL_REF_CONDITION_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT <em>DSL CEP STATEMENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP STATEMENT</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT
   * @generated
   */
  EClass getDSL_CEP_STATEMENT();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT#getOperation()
   * @see #getDSL_CEP_STATEMENT()
   * @generated
   */
  EReference getDSL_CEP_STATEMENT_Operation();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER <em>DSL CEP AFTER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP AFTER</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER
   * @generated
   */
  EClass getDSL_CEP_AFTER();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER#getRef1 <em>Ref1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref1</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER#getRef1()
   * @see #getDSL_CEP_AFTER()
   * @generated
   */
  EReference getDSL_CEP_AFTER_Ref1();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER#getRef2 <em>Ref2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref2</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER#getRef2()
   * @see #getDSL_CEP_AFTER()
   * @generated
   */
  EReference getDSL_CEP_AFTER_Ref2();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER#getStart()
   * @see #getDSL_CEP_AFTER()
   * @generated
   */
  EReference getDSL_CEP_AFTER_Start();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER#getEnd()
   * @see #getDSL_CEP_AFTER()
   * @generated
   */
  EReference getDSL_CEP_AFTER_End();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE <em>DSL CEP BEFORE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP BEFORE</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE
   * @generated
   */
  EClass getDSL_CEP_BEFORE();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE#getRef1 <em>Ref1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref1</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE#getRef1()
   * @see #getDSL_CEP_BEFORE()
   * @generated
   */
  EReference getDSL_CEP_BEFORE_Ref1();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE#getRef2 <em>Ref2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref2</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE#getRef2()
   * @see #getDSL_CEP_BEFORE()
   * @generated
   */
  EReference getDSL_CEP_BEFORE_Ref2();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE#getStart()
   * @see #getDSL_CEP_BEFORE()
   * @generated
   */
  EReference getDSL_CEP_BEFORE_Start();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE#getEnd()
   * @see #getDSL_CEP_BEFORE()
   * @generated
   */
  EReference getDSL_CEP_BEFORE_End();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE <em>DSL CEP COINCIDE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP COINCIDE</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE
   * @generated
   */
  EClass getDSL_CEP_COINCIDE();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getRef1 <em>Ref1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref1</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getRef1()
   * @see #getDSL_CEP_COINCIDE()
   * @generated
   */
  EReference getDSL_CEP_COINCIDE_Ref1();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getRef2 <em>Ref2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref2</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getRef2()
   * @see #getDSL_CEP_COINCIDE()
   * @generated
   */
  EReference getDSL_CEP_COINCIDE_Ref2();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getWindow <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Window</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getWindow()
   * @see #getDSL_CEP_COINCIDE()
   * @generated
   */
  EReference getDSL_CEP_COINCIDE_Window();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN <em>DSL CEP MIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP MIN</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN
   * @generated
   */
  EClass getDSL_CEP_MIN();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN#getRef()
   * @see #getDSL_CEP_MIN()
   * @generated
   */
  EReference getDSL_CEP_MIN_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN#getWindow <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Window</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN#getWindow()
   * @see #getDSL_CEP_MIN()
   * @generated
   */
  EReference getDSL_CEP_MIN_Window();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX <em>DSL CEP MAX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP MAX</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX
   * @generated
   */
  EClass getDSL_CEP_MAX();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX#getRef()
   * @see #getDSL_CEP_MAX()
   * @generated
   */
  EReference getDSL_CEP_MAX_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX#getWindow <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Window</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX#getWindow()
   * @see #getDSL_CEP_MAX()
   * @generated
   */
  EReference getDSL_CEP_MAX_Window();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG <em>DSL CEP AVG</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP AVG</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG
   * @generated
   */
  EClass getDSL_CEP_AVG();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG#getRef()
   * @see #getDSL_CEP_AVG()
   * @generated
   */
  EReference getDSL_CEP_AVG_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG#getWindow <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Window</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG#getWindow()
   * @see #getDSL_CEP_AVG()
   * @generated
   */
  EReference getDSL_CEP_AVG_Window();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM <em>DSL CEP SUM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP SUM</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM
   * @generated
   */
  EClass getDSL_CEP_SUM();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM#getRef()
   * @see #getDSL_CEP_SUM()
   * @generated
   */
  EReference getDSL_CEP_SUM_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM#getWindow <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Window</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM#getWindow()
   * @see #getDSL_CEP_SUM()
   * @generated
   */
  EReference getDSL_CEP_SUM_Window();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT <em>DSL CEP COUNT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP COUNT</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT
   * @generated
   */
  EClass getDSL_CEP_COUNT();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT#getRef()
   * @see #getDSL_CEP_COUNT()
   * @generated
   */
  EReference getDSL_CEP_COUNT_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT#getWindow <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Window</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT#getWindow()
   * @see #getDSL_CEP_COUNT()
   * @generated
   */
  EReference getDSL_CEP_COUNT_Window();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION <em>DSL CEP DURATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP DURATION</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION
   * @generated
   */
  EClass getDSL_CEP_DURATION();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Units</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION#getUnits()
   * @see #getDSL_CEP_DURATION()
   * @generated
   */
  EReference getDSL_CEP_DURATION_Units();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN <em>DSL CEP DURATION MIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP DURATION MIN</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN
   * @generated
   */
  EClass getDSL_CEP_DURATION_MIN();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN#getMin()
   * @see #getDSL_CEP_DURATION_MIN()
   * @generated
   */
  EAttribute getDSL_CEP_DURATION_MIN_Min();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC <em>DSL CEP DURATION SEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL CEP DURATION SEC</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC
   * @generated
   */
  EClass getDSL_CEP_DURATION_SEC();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC#getSec <em>Sec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sec</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC#getSec()
   * @see #getDSL_CEP_DURATION_SEC()
   * @generated
   */
  EAttribute getDSL_CEP_DURATION_SEC_Sec();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions <em>DSL List Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL List Actions</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions
   * @generated
   */
  EClass getDSL_ListActions();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions#getActionList <em>Action List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action List</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions#getActionList()
   * @see #getDSL_ListActions()
   * @generated
   */
  EReference getDSL_ListActions_ActionList();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction <em>DSL Resource Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Resource Action</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction
   * @generated
   */
  EClass getDSL_ResourceAction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getVariable()
   * @see #getDSL_ResourceAction()
   * @generated
   */
  EAttribute getDSL_ResourceAction_Variable();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getRef()
   * @see #getDSL_ResourceAction()
   * @generated
   */
  EReference getDSL_ResourceAction_Ref();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getActiontype <em>Actiontype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actiontype</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getActiontype()
   * @see #getDSL_ResourceAction()
   * @generated
   */
  EAttribute getDSL_ResourceAction_Actiontype();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getListParam <em>List Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List Param</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction#getListParam()
   * @see #getDSL_ResourceAction()
   * @generated
   */
  EReference getDSL_ResourceAction_ListParam();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam <em>DSL List Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL List Param</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam
   * @generated
   */
  EClass getDSL_ListParam();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam#getParam()
   * @see #getDSL_ListParam()
   * @generated
   */
  EReference getDSL_ListParam_Param();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression <em>DSL Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression
   * @generated
   */
  EClass getDSL_Expression();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or <em>DSL Expression Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Or</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or
   * @generated
   */
  EClass getDSL_Expression_Or();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or#getLeft()
   * @see #getDSL_Expression_Or()
   * @generated
   */
  EReference getDSL_Expression_Or_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or#getRight()
   * @see #getDSL_Expression_Or()
   * @generated
   */
  EReference getDSL_Expression_Or_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And <em>DSL Expression And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression And</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And
   * @generated
   */
  EClass getDSL_Expression_And();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And#getLeft()
   * @see #getDSL_Expression_And()
   * @generated
   */
  EReference getDSL_Expression_And_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And#getRight()
   * @see #getDSL_Expression_And()
   * @generated
   */
  EReference getDSL_Expression_And_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff <em>DSL Expression Diff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Diff</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff
   * @generated
   */
  EClass getDSL_Expression_Diff();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff#getLeft()
   * @see #getDSL_Expression_Diff()
   * @generated
   */
  EReference getDSL_Expression_Diff_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff#getRight()
   * @see #getDSL_Expression_Diff()
   * @generated
   */
  EReference getDSL_Expression_Diff_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal <em>DSL Expression Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Equal</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal
   * @generated
   */
  EClass getDSL_Expression_Equal();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal#getLeft()
   * @see #getDSL_Expression_Equal()
   * @generated
   */
  EReference getDSL_Expression_Equal_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal#getRight()
   * @see #getDSL_Expression_Equal()
   * @generated
   */
  EReference getDSL_Expression_Equal_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger <em>DSL Expression Larger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Larger</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger
   * @generated
   */
  EClass getDSL_Expression_Larger();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger#getLeft()
   * @see #getDSL_Expression_Larger()
   * @generated
   */
  EReference getDSL_Expression_Larger_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger#getRight()
   * @see #getDSL_Expression_Larger()
   * @generated
   */
  EReference getDSL_Expression_Larger_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal <em>DSL Expression Larger Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Larger Equal</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal
   * @generated
   */
  EClass getDSL_Expression_Larger_Equal();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal#getLeft()
   * @see #getDSL_Expression_Larger_Equal()
   * @generated
   */
  EReference getDSL_Expression_Larger_Equal_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal#getRight()
   * @see #getDSL_Expression_Larger_Equal()
   * @generated
   */
  EReference getDSL_Expression_Larger_Equal_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller <em>DSL Expression Smaller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Smaller</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller
   * @generated
   */
  EClass getDSL_Expression_Smaller();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller#getLeft()
   * @see #getDSL_Expression_Smaller()
   * @generated
   */
  EReference getDSL_Expression_Smaller_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller#getRight()
   * @see #getDSL_Expression_Smaller()
   * @generated
   */
  EReference getDSL_Expression_Smaller_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal <em>DSL Expression Smaller Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Smaller Equal</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal
   * @generated
   */
  EClass getDSL_Expression_Smaller_Equal();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal#getLeft()
   * @see #getDSL_Expression_Smaller_Equal()
   * @generated
   */
  EReference getDSL_Expression_Smaller_Equal_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal#getRight()
   * @see #getDSL_Expression_Smaller_Equal()
   * @generated
   */
  EReference getDSL_Expression_Smaller_Equal_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus <em>DSL Expression Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Plus</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus
   * @generated
   */
  EClass getDSL_Expression_Plus();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus#getLeft()
   * @see #getDSL_Expression_Plus()
   * @generated
   */
  EReference getDSL_Expression_Plus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus#getRight()
   * @see #getDSL_Expression_Plus()
   * @generated
   */
  EReference getDSL_Expression_Plus_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus <em>DSL Expression Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Minus</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus
   * @generated
   */
  EClass getDSL_Expression_Minus();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus#getLeft()
   * @see #getDSL_Expression_Minus()
   * @generated
   */
  EReference getDSL_Expression_Minus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus#getRight()
   * @see #getDSL_Expression_Minus()
   * @generated
   */
  EReference getDSL_Expression_Minus_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication <em>DSL Expression Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Multiplication</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication
   * @generated
   */
  EClass getDSL_Expression_Multiplication();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication#getLeft()
   * @see #getDSL_Expression_Multiplication()
   * @generated
   */
  EReference getDSL_Expression_Multiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication#getRight()
   * @see #getDSL_Expression_Multiplication()
   * @generated
   */
  EReference getDSL_Expression_Multiplication_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division <em>DSL Expression Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Division</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division
   * @generated
   */
  EClass getDSL_Expression_Division();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division#getLeft()
   * @see #getDSL_Expression_Division()
   * @generated
   */
  EReference getDSL_Expression_Division_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division#getRight()
   * @see #getDSL_Expression_Division()
   * @generated
   */
  EReference getDSL_Expression_Division_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo <em>DSL Expression Modulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Modulo</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo
   * @generated
   */
  EClass getDSL_Expression_Modulo();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo#getLeft()
   * @see #getDSL_Expression_Modulo()
   * @generated
   */
  EReference getDSL_Expression_Modulo_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo#getRight()
   * @see #getDSL_Expression_Modulo()
   * @generated
   */
  EReference getDSL_Expression_Modulo_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number <em>DSL Object Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Object Number</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number
   * @generated
   */
  EClass getDSL_Object_Number();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number#getValue()
   * @see #getDSL_Object_Number()
   * @generated
   */
  EAttribute getDSL_Object_Number_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String <em>DSL Object String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Object String</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String
   * @generated
   */
  EClass getDSL_Object_String();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String#getValue()
   * @see #getDSL_Object_String()
   * @generated
   */
  EAttribute getDSL_Object_String_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean <em>DSL Object Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Object Boolean</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean
   * @generated
   */
  EClass getDSL_Object_Boolean();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean#isValue()
   * @see #getDSL_Object_Boolean()
   * @generated
   */
  EAttribute getDSL_Object_Boolean_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref <em>DSL Object Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Object Ref</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref
   * @generated
   */
  EClass getDSL_Object_Ref();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref#getValue()
   * @see #getDSL_Object_Ref()
   * @generated
   */
  EReference getDSL_Object_Ref_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate <em>DSL Expression Negate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Expression Negate</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate
   * @generated
   */
  EClass getDSL_Expression_Negate();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate#getExp()
   * @see #getDSL_Expression_Negate()
   * @generated
   */
  EReference getDSL_Expression_Negate_Exp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SensinactFactory getSensinactFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.SensinactImpl <em>Sensinact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getSensinact()
     * @generated
     */
    EClass SENSINACT = eINSTANCE.getSensinact();

    /**
     * The meta object literal for the '<em><b>Eca</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSINACT__ECA = eINSTANCE.getSensinact_Eca();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl <em>DSL SENSINACT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_SENSINACTImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_SENSINACT()
     * @generated
     */
    EClass DSL_SENSINACT = eINSTANCE.getDSL_SENSINACT();

    /**
     * The meta object literal for the '<em><b>Autostart</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_SENSINACT__AUTOSTART = eINSTANCE.getDSL_SENSINACT_Autostart();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_SENSINACT__RESOURCES = eINSTANCE.getDSL_SENSINACT_Resources();

    /**
     * The meta object literal for the '<em><b>Prob</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_SENSINACT__PROB = eINSTANCE.getDSL_SENSINACT_Prob();

    /**
     * The meta object literal for the '<em><b>Cep</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_SENSINACT__CEP = eINSTANCE.getDSL_SENSINACT_Cep();

    /**
     * The meta object literal for the '<em><b>On</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_SENSINACT__ON = eINSTANCE.getDSL_SENSINACT_On();

    /**
     * The meta object literal for the '<em><b>Eca</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_SENSINACT__ECA = eINSTANCE.getDSL_SENSINACT_Eca();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CLOCK_STOCHASTICImpl <em>DSL CLOCK STOCHASTIC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CLOCK_STOCHASTICImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CLOCK_STOCHASTIC()
     * @generated
     */
    EClass DSL_CLOCK_STOCHASTIC = eINSTANCE.getDSL_CLOCK_STOCHASTIC();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CLOCK_STOCHASTIC__REF = eINSTANCE.getDSL_CLOCK_STOCHASTIC_Ref();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_CLOCK_STOCHASTIC__VALUE = eINSTANCE.getDSL_CLOCK_STOCHASTIC_Value();

    /**
     * The meta object literal for the '<em><b>Param1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_CLOCK_STOCHASTIC__PARAM1 = eINSTANCE.getDSL_CLOCK_STOCHASTIC_Param1();

    /**
     * The meta object literal for the '<em><b>Param2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_CLOCK_STOCHASTIC__PARAM2 = eINSTANCE.getDSL_CLOCK_STOCHASTIC_Param2();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_FLAG_AUTOSTARTImpl <em>DSL FLAG AUTOSTART</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_FLAG_AUTOSTARTImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_FLAG_AUTOSTART()
     * @generated
     */
    EClass DSL_FLAG_AUTOSTART = eINSTANCE.getDSL_FLAG_AUTOSTART();

    /**
     * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_FLAG_AUTOSTART__ACTIVATED = eINSTANCE.getDSL_FLAG_AUTOSTART_Activated();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceImpl <em>DSL Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Resource()
     * @generated
     */
    EClass DSL_RESOURCE = eINSTANCE.getDSL_Resource();

    /**
     * The meta object literal for the '<em><b>Gateway ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_RESOURCE__GATEWAY_ID = eINSTANCE.getDSL_Resource_GatewayID();

    /**
     * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_RESOURCE__DEVICE_ID = eINSTANCE.getDSL_Resource_DeviceID();

    /**
     * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_RESOURCE__SERVICE_ID = eINSTANCE.getDSL_Resource_ServiceID();

    /**
     * The meta object literal for the '<em><b>Resource ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_RESOURCE__RESOURCE_ID = eINSTANCE.getDSL_Resource_ResourceID();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_OnImpl <em>DSL On</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_OnImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_On()
     * @generated
     */
    EClass DSL_ON = eINSTANCE.getDSL_On();

    /**
     * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ON__TRIGGERS = eINSTANCE.getDSL_On_Triggers();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ECA_STATEMENTImpl <em>DSL ECA STATEMENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ECA_STATEMENTImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ECA_STATEMENT()
     * @generated
     */
    EClass DSL_ECA_STATEMENT = eINSTANCE.getDSL_ECA_STATEMENT();

    /**
     * The meta object literal for the '<em><b>Ifdo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ECA_STATEMENT__IFDO = eINSTANCE.getDSL_ECA_STATEMENT_Ifdo();

    /**
     * The meta object literal for the '<em><b>Else Ifdo</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ECA_STATEMENT__ELSE_IFDO = eINSTANCE.getDSL_ECA_STATEMENT_ElseIfdo();

    /**
     * The meta object literal for the '<em><b>Elsedo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ECA_STATEMENT__ELSEDO = eINSTANCE.getDSL_ECA_STATEMENT_Elsedo();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_IfDoImpl <em>DSL If Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_IfDoImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_IfDo()
     * @generated
     */
    EClass DSL_IF_DO = eINSTANCE.getDSL_IfDo();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_IF_DO__CONDITION = eINSTANCE.getDSL_IfDo_Condition();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_IF_DO__ACTIONS = eINSTANCE.getDSL_IfDo_Actions();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseIfDoImpl <em>DSL Else If Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseIfDoImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ElseIfDo()
     * @generated
     */
    EClass DSL_ELSE_IF_DO = eINSTANCE.getDSL_ElseIfDo();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ELSE_IF_DO__CONDITION = eINSTANCE.getDSL_ElseIfDo_Condition();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ELSE_IF_DO__ACTIONS = eINSTANCE.getDSL_ElseIfDo_Actions();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseDoImpl <em>DSL Else Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseDoImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ElseDo()
     * @generated
     */
    EClass DSL_ELSE_DO = eINSTANCE.getDSL_ElseDo();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_ELSE_DO__ACTIONS = eINSTANCE.getDSL_ElseDo_Actions();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_REFImpl <em>DSL REF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_REFImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_REF()
     * @generated
     */
    EClass DSL_REF = eINSTANCE.getDSL_REF();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_REF__NAME = eINSTANCE.getDSL_REF_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_REF_CONDITIONImpl <em>DSL REF CONDITION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_REF_CONDITIONImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_REF_CONDITION()
     * @generated
     */
    EClass DSL_REF_CONDITION = eINSTANCE.getDSL_REF_CONDITION();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_REF_CONDITION__REF = eINSTANCE.getDSL_REF_CONDITION_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_STATEMENTImpl <em>DSL CEP STATEMENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_STATEMENTImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_STATEMENT()
     * @generated
     */
    EClass DSL_CEP_STATEMENT = eINSTANCE.getDSL_CEP_STATEMENT();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_STATEMENT__OPERATION = eINSTANCE.getDSL_CEP_STATEMENT_Operation();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AFTERImpl <em>DSL CEP AFTER</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AFTERImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_AFTER()
     * @generated
     */
    EClass DSL_CEP_AFTER = eINSTANCE.getDSL_CEP_AFTER();

    /**
     * The meta object literal for the '<em><b>Ref1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_AFTER__REF1 = eINSTANCE.getDSL_CEP_AFTER_Ref1();

    /**
     * The meta object literal for the '<em><b>Ref2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_AFTER__REF2 = eINSTANCE.getDSL_CEP_AFTER_Ref2();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_AFTER__START = eINSTANCE.getDSL_CEP_AFTER_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_AFTER__END = eINSTANCE.getDSL_CEP_AFTER_End();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_BEFOREImpl <em>DSL CEP BEFORE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_BEFOREImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_BEFORE()
     * @generated
     */
    EClass DSL_CEP_BEFORE = eINSTANCE.getDSL_CEP_BEFORE();

    /**
     * The meta object literal for the '<em><b>Ref1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_BEFORE__REF1 = eINSTANCE.getDSL_CEP_BEFORE_Ref1();

    /**
     * The meta object literal for the '<em><b>Ref2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_BEFORE__REF2 = eINSTANCE.getDSL_CEP_BEFORE_Ref2();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_BEFORE__START = eINSTANCE.getDSL_CEP_BEFORE_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_BEFORE__END = eINSTANCE.getDSL_CEP_BEFORE_End();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COINCIDEImpl <em>DSL CEP COINCIDE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COINCIDEImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_COINCIDE()
     * @generated
     */
    EClass DSL_CEP_COINCIDE = eINSTANCE.getDSL_CEP_COINCIDE();

    /**
     * The meta object literal for the '<em><b>Ref1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_COINCIDE__REF1 = eINSTANCE.getDSL_CEP_COINCIDE_Ref1();

    /**
     * The meta object literal for the '<em><b>Ref2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_COINCIDE__REF2 = eINSTANCE.getDSL_CEP_COINCIDE_Ref2();

    /**
     * The meta object literal for the '<em><b>Window</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_COINCIDE__WINDOW = eINSTANCE.getDSL_CEP_COINCIDE_Window();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_MINImpl <em>DSL CEP MIN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_MINImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_MIN()
     * @generated
     */
    EClass DSL_CEP_MIN = eINSTANCE.getDSL_CEP_MIN();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_MIN__REF = eINSTANCE.getDSL_CEP_MIN_Ref();

    /**
     * The meta object literal for the '<em><b>Window</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_MIN__WINDOW = eINSTANCE.getDSL_CEP_MIN_Window();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_MAXImpl <em>DSL CEP MAX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_MAXImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_MAX()
     * @generated
     */
    EClass DSL_CEP_MAX = eINSTANCE.getDSL_CEP_MAX();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_MAX__REF = eINSTANCE.getDSL_CEP_MAX_Ref();

    /**
     * The meta object literal for the '<em><b>Window</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_MAX__WINDOW = eINSTANCE.getDSL_CEP_MAX_Window();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AVGImpl <em>DSL CEP AVG</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AVGImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_AVG()
     * @generated
     */
    EClass DSL_CEP_AVG = eINSTANCE.getDSL_CEP_AVG();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_AVG__REF = eINSTANCE.getDSL_CEP_AVG_Ref();

    /**
     * The meta object literal for the '<em><b>Window</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_AVG__WINDOW = eINSTANCE.getDSL_CEP_AVG_Window();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_SUMImpl <em>DSL CEP SUM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_SUMImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_SUM()
     * @generated
     */
    EClass DSL_CEP_SUM = eINSTANCE.getDSL_CEP_SUM();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_SUM__REF = eINSTANCE.getDSL_CEP_SUM_Ref();

    /**
     * The meta object literal for the '<em><b>Window</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_SUM__WINDOW = eINSTANCE.getDSL_CEP_SUM_Window();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COUNTImpl <em>DSL CEP COUNT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_COUNTImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_COUNT()
     * @generated
     */
    EClass DSL_CEP_COUNT = eINSTANCE.getDSL_CEP_COUNT();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_COUNT__REF = eINSTANCE.getDSL_CEP_COUNT_Ref();

    /**
     * The meta object literal for the '<em><b>Window</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_COUNT__WINDOW = eINSTANCE.getDSL_CEP_COUNT_Window();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATIONImpl <em>DSL CEP DURATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATIONImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_DURATION()
     * @generated
     */
    EClass DSL_CEP_DURATION = eINSTANCE.getDSL_CEP_DURATION();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_CEP_DURATION__UNITS = eINSTANCE.getDSL_CEP_DURATION_Units();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATION_MINImpl <em>DSL CEP DURATION MIN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATION_MINImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_DURATION_MIN()
     * @generated
     */
    EClass DSL_CEP_DURATION_MIN = eINSTANCE.getDSL_CEP_DURATION_MIN();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_CEP_DURATION_MIN__MIN = eINSTANCE.getDSL_CEP_DURATION_MIN_Min();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATION_SECImpl <em>DSL CEP DURATION SEC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_DURATION_SECImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_CEP_DURATION_SEC()
     * @generated
     */
    EClass DSL_CEP_DURATION_SEC = eINSTANCE.getDSL_CEP_DURATION_SEC();

    /**
     * The meta object literal for the '<em><b>Sec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_CEP_DURATION_SEC__SEC = eINSTANCE.getDSL_CEP_DURATION_SEC_Sec();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ListActionsImpl <em>DSL List Actions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ListActionsImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ListActions()
     * @generated
     */
    EClass DSL_LIST_ACTIONS = eINSTANCE.getDSL_ListActions();

    /**
     * The meta object literal for the '<em><b>Action List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_LIST_ACTIONS__ACTION_LIST = eINSTANCE.getDSL_ListActions_ActionList();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceActionImpl <em>DSL Resource Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceActionImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ResourceAction()
     * @generated
     */
    EClass DSL_RESOURCE_ACTION = eINSTANCE.getDSL_ResourceAction();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_RESOURCE_ACTION__VARIABLE = eINSTANCE.getDSL_ResourceAction_Variable();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_RESOURCE_ACTION__REF = eINSTANCE.getDSL_ResourceAction_Ref();

    /**
     * The meta object literal for the '<em><b>Actiontype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_RESOURCE_ACTION__ACTIONTYPE = eINSTANCE.getDSL_ResourceAction_Actiontype();

    /**
     * The meta object literal for the '<em><b>List Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_RESOURCE_ACTION__LIST_PARAM = eINSTANCE.getDSL_ResourceAction_ListParam();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ListParamImpl <em>DSL List Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ListParamImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_ListParam()
     * @generated
     */
    EClass DSL_LIST_PARAM = eINSTANCE.getDSL_ListParam();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_LIST_PARAM__PARAM = eINSTANCE.getDSL_ListParam_Param();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ExpressionImpl <em>DSL Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ExpressionImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression()
     * @generated
     */
    EClass DSL_EXPRESSION = eINSTANCE.getDSL_Expression();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_OrImpl <em>DSL Expression Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_OrImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Or()
     * @generated
     */
    EClass DSL_EXPRESSION_OR = eINSTANCE.getDSL_Expression_Or();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_OR__LEFT = eINSTANCE.getDSL_Expression_Or_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_OR__RIGHT = eINSTANCE.getDSL_Expression_Or_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_AndImpl <em>DSL Expression And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_AndImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_And()
     * @generated
     */
    EClass DSL_EXPRESSION_AND = eINSTANCE.getDSL_Expression_And();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_AND__LEFT = eINSTANCE.getDSL_Expression_And_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_AND__RIGHT = eINSTANCE.getDSL_Expression_And_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_DiffImpl <em>DSL Expression Diff</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_DiffImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Diff()
     * @generated
     */
    EClass DSL_EXPRESSION_DIFF = eINSTANCE.getDSL_Expression_Diff();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_DIFF__LEFT = eINSTANCE.getDSL_Expression_Diff_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_DIFF__RIGHT = eINSTANCE.getDSL_Expression_Diff_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_EqualImpl <em>DSL Expression Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_EqualImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Equal()
     * @generated
     */
    EClass DSL_EXPRESSION_EQUAL = eINSTANCE.getDSL_Expression_Equal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_EQUAL__LEFT = eINSTANCE.getDSL_Expression_Equal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_EQUAL__RIGHT = eINSTANCE.getDSL_Expression_Equal_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_LargerImpl <em>DSL Expression Larger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_LargerImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Larger()
     * @generated
     */
    EClass DSL_EXPRESSION_LARGER = eINSTANCE.getDSL_Expression_Larger();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_LARGER__LEFT = eINSTANCE.getDSL_Expression_Larger_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_LARGER__RIGHT = eINSTANCE.getDSL_Expression_Larger_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_Larger_EqualImpl <em>DSL Expression Larger Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_Larger_EqualImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Larger_Equal()
     * @generated
     */
    EClass DSL_EXPRESSION_LARGER_EQUAL = eINSTANCE.getDSL_Expression_Larger_Equal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_LARGER_EQUAL__LEFT = eINSTANCE.getDSL_Expression_Larger_Equal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_LARGER_EQUAL__RIGHT = eINSTANCE.getDSL_Expression_Larger_Equal_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_SmallerImpl <em>DSL Expression Smaller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_SmallerImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Smaller()
     * @generated
     */
    EClass DSL_EXPRESSION_SMALLER = eINSTANCE.getDSL_Expression_Smaller();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_SMALLER__LEFT = eINSTANCE.getDSL_Expression_Smaller_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_SMALLER__RIGHT = eINSTANCE.getDSL_Expression_Smaller_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_Smaller_EqualImpl <em>DSL Expression Smaller Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_Smaller_EqualImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Smaller_Equal()
     * @generated
     */
    EClass DSL_EXPRESSION_SMALLER_EQUAL = eINSTANCE.getDSL_Expression_Smaller_Equal();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_SMALLER_EQUAL__LEFT = eINSTANCE.getDSL_Expression_Smaller_Equal_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_SMALLER_EQUAL__RIGHT = eINSTANCE.getDSL_Expression_Smaller_Equal_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_PlusImpl <em>DSL Expression Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_PlusImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Plus()
     * @generated
     */
    EClass DSL_EXPRESSION_PLUS = eINSTANCE.getDSL_Expression_Plus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_PLUS__LEFT = eINSTANCE.getDSL_Expression_Plus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_PLUS__RIGHT = eINSTANCE.getDSL_Expression_Plus_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_MinusImpl <em>DSL Expression Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_MinusImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Minus()
     * @generated
     */
    EClass DSL_EXPRESSION_MINUS = eINSTANCE.getDSL_Expression_Minus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_MINUS__LEFT = eINSTANCE.getDSL_Expression_Minus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_MINUS__RIGHT = eINSTANCE.getDSL_Expression_Minus_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_MultiplicationImpl <em>DSL Expression Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_MultiplicationImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Multiplication()
     * @generated
     */
    EClass DSL_EXPRESSION_MULTIPLICATION = eINSTANCE.getDSL_Expression_Multiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_MULTIPLICATION__LEFT = eINSTANCE.getDSL_Expression_Multiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_MULTIPLICATION__RIGHT = eINSTANCE.getDSL_Expression_Multiplication_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_DivisionImpl <em>DSL Expression Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_DivisionImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Division()
     * @generated
     */
    EClass DSL_EXPRESSION_DIVISION = eINSTANCE.getDSL_Expression_Division();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_DIVISION__LEFT = eINSTANCE.getDSL_Expression_Division_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_DIVISION__RIGHT = eINSTANCE.getDSL_Expression_Division_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_ModuloImpl <em>DSL Expression Modulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_ModuloImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Modulo()
     * @generated
     */
    EClass DSL_EXPRESSION_MODULO = eINSTANCE.getDSL_Expression_Modulo();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_MODULO__LEFT = eINSTANCE.getDSL_Expression_Modulo_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_MODULO__RIGHT = eINSTANCE.getDSL_Expression_Modulo_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_NumberImpl <em>DSL Object Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_NumberImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Object_Number()
     * @generated
     */
    EClass DSL_OBJECT_NUMBER = eINSTANCE.getDSL_Object_Number();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_OBJECT_NUMBER__VALUE = eINSTANCE.getDSL_Object_Number_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_StringImpl <em>DSL Object String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_StringImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Object_String()
     * @generated
     */
    EClass DSL_OBJECT_STRING = eINSTANCE.getDSL_Object_String();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_OBJECT_STRING__VALUE = eINSTANCE.getDSL_Object_String_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_BooleanImpl <em>DSL Object Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_BooleanImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Object_Boolean()
     * @generated
     */
    EClass DSL_OBJECT_BOOLEAN = eINSTANCE.getDSL_Object_Boolean();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_OBJECT_BOOLEAN__VALUE = eINSTANCE.getDSL_Object_Boolean_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_RefImpl <em>DSL Object Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Object_RefImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Object_Ref()
     * @generated
     */
    EClass DSL_OBJECT_REF = eINSTANCE.getDSL_Object_Ref();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_OBJECT_REF__VALUE = eINSTANCE.getDSL_Object_Ref_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_NegateImpl <em>DSL Expression Negate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.DSL_Expression_NegateImpl
     * @see org.eclipse.sensinact.studio.language.sensinact.impl.SensinactPackageImpl#getDSL_Expression_Negate()
     * @generated
     */
    EClass DSL_EXPRESSION_NEGATE = eINSTANCE.getDSL_Expression_Negate();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DSL_EXPRESSION_NEGATE__EXP = eINSTANCE.getDSL_Expression_Negate_Exp();

  }

} //SensinactPackage
