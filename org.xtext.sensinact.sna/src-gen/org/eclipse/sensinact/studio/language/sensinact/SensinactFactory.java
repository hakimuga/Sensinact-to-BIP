/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage
 * @generated
 */
public interface SensinactFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SensinactFactory eINSTANCE = org.eclipse.sensinact.studio.language.sensinact.impl.SensinactFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Sensinact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sensinact</em>'.
   * @generated
   */
  Sensinact createSensinact();

  /**
   * Returns a new object of class '<em>DSL SENSINACT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL SENSINACT</em>'.
   * @generated
   */
  DSL_SENSINACT createDSL_SENSINACT();

  /**
   * Returns a new object of class '<em>DSL CLOCK STOCHASTIC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CLOCK STOCHASTIC</em>'.
   * @generated
   */
  DSL_CLOCK_STOCHASTIC createDSL_CLOCK_STOCHASTIC();

  /**
   * Returns a new object of class '<em>DSL FLAG AUTOSTART</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL FLAG AUTOSTART</em>'.
   * @generated
   */
  DSL_FLAG_AUTOSTART createDSL_FLAG_AUTOSTART();

  /**
   * Returns a new object of class '<em>DSL Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Resource</em>'.
   * @generated
   */
  DSL_Resource createDSL_Resource();

  /**
   * Returns a new object of class '<em>DSL On</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL On</em>'.
   * @generated
   */
  DSL_On createDSL_On();

  /**
   * Returns a new object of class '<em>DSL ECA STATEMENT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL ECA STATEMENT</em>'.
   * @generated
   */
  DSL_ECA_STATEMENT createDSL_ECA_STATEMENT();

  /**
   * Returns a new object of class '<em>DSL If Do</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL If Do</em>'.
   * @generated
   */
  DSL_IfDo createDSL_IfDo();

  /**
   * Returns a new object of class '<em>DSL Else If Do</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Else If Do</em>'.
   * @generated
   */
  DSL_ElseIfDo createDSL_ElseIfDo();

  /**
   * Returns a new object of class '<em>DSL Else Do</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Else Do</em>'.
   * @generated
   */
  DSL_ElseDo createDSL_ElseDo();

  /**
   * Returns a new object of class '<em>DSL REF</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL REF</em>'.
   * @generated
   */
  DSL_REF createDSL_REF();

  /**
   * Returns a new object of class '<em>DSL REF CONDITION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL REF CONDITION</em>'.
   * @generated
   */
  DSL_REF_CONDITION createDSL_REF_CONDITION();

  /**
   * Returns a new object of class '<em>DSL CEP STATEMENT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP STATEMENT</em>'.
   * @generated
   */
  DSL_CEP_STATEMENT createDSL_CEP_STATEMENT();

  /**
   * Returns a new object of class '<em>DSL CEP AFTER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP AFTER</em>'.
   * @generated
   */
  DSL_CEP_AFTER createDSL_CEP_AFTER();

  /**
   * Returns a new object of class '<em>DSL CEP BEFORE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP BEFORE</em>'.
   * @generated
   */
  DSL_CEP_BEFORE createDSL_CEP_BEFORE();

  /**
   * Returns a new object of class '<em>DSL CEP COINCIDE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP COINCIDE</em>'.
   * @generated
   */
  DSL_CEP_COINCIDE createDSL_CEP_COINCIDE();

  /**
   * Returns a new object of class '<em>DSL CEP MIN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP MIN</em>'.
   * @generated
   */
  DSL_CEP_MIN createDSL_CEP_MIN();

  /**
   * Returns a new object of class '<em>DSL CEP MAX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP MAX</em>'.
   * @generated
   */
  DSL_CEP_MAX createDSL_CEP_MAX();

  /**
   * Returns a new object of class '<em>DSL CEP AVG</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP AVG</em>'.
   * @generated
   */
  DSL_CEP_AVG createDSL_CEP_AVG();

  /**
   * Returns a new object of class '<em>DSL CEP SUM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP SUM</em>'.
   * @generated
   */
  DSL_CEP_SUM createDSL_CEP_SUM();

  /**
   * Returns a new object of class '<em>DSL CEP COUNT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP COUNT</em>'.
   * @generated
   */
  DSL_CEP_COUNT createDSL_CEP_COUNT();

  /**
   * Returns a new object of class '<em>DSL CEP DURATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP DURATION</em>'.
   * @generated
   */
  DSL_CEP_DURATION createDSL_CEP_DURATION();

  /**
   * Returns a new object of class '<em>DSL CEP DURATION MIN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP DURATION MIN</em>'.
   * @generated
   */
  DSL_CEP_DURATION_MIN createDSL_CEP_DURATION_MIN();

  /**
   * Returns a new object of class '<em>DSL CEP DURATION SEC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL CEP DURATION SEC</em>'.
   * @generated
   */
  DSL_CEP_DURATION_SEC createDSL_CEP_DURATION_SEC();

  /**
   * Returns a new object of class '<em>DSL List Actions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL List Actions</em>'.
   * @generated
   */
  DSL_ListActions createDSL_ListActions();

  /**
   * Returns a new object of class '<em>DSL Resource Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Resource Action</em>'.
   * @generated
   */
  DSL_ResourceAction createDSL_ResourceAction();

  /**
   * Returns a new object of class '<em>DSL List Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL List Param</em>'.
   * @generated
   */
  DSL_ListParam createDSL_ListParam();

  /**
   * Returns a new object of class '<em>DSL Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression</em>'.
   * @generated
   */
  DSL_Expression createDSL_Expression();

  /**
   * Returns a new object of class '<em>DSL Expression Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Or</em>'.
   * @generated
   */
  DSL_Expression_Or createDSL_Expression_Or();

  /**
   * Returns a new object of class '<em>DSL Expression And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression And</em>'.
   * @generated
   */
  DSL_Expression_And createDSL_Expression_And();

  /**
   * Returns a new object of class '<em>DSL Expression Diff</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Diff</em>'.
   * @generated
   */
  DSL_Expression_Diff createDSL_Expression_Diff();

  /**
   * Returns a new object of class '<em>DSL Expression Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Equal</em>'.
   * @generated
   */
  DSL_Expression_Equal createDSL_Expression_Equal();

  /**
   * Returns a new object of class '<em>DSL Expression Larger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Larger</em>'.
   * @generated
   */
  DSL_Expression_Larger createDSL_Expression_Larger();

  /**
   * Returns a new object of class '<em>DSL Expression Larger Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Larger Equal</em>'.
   * @generated
   */
  DSL_Expression_Larger_Equal createDSL_Expression_Larger_Equal();

  /**
   * Returns a new object of class '<em>DSL Expression Smaller</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Smaller</em>'.
   * @generated
   */
  DSL_Expression_Smaller createDSL_Expression_Smaller();

  /**
   * Returns a new object of class '<em>DSL Expression Smaller Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Smaller Equal</em>'.
   * @generated
   */
  DSL_Expression_Smaller_Equal createDSL_Expression_Smaller_Equal();

  /**
   * Returns a new object of class '<em>DSL Expression Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Plus</em>'.
   * @generated
   */
  DSL_Expression_Plus createDSL_Expression_Plus();

  /**
   * Returns a new object of class '<em>DSL Expression Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Minus</em>'.
   * @generated
   */
  DSL_Expression_Minus createDSL_Expression_Minus();

  /**
   * Returns a new object of class '<em>DSL Expression Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Multiplication</em>'.
   * @generated
   */
  DSL_Expression_Multiplication createDSL_Expression_Multiplication();

  /**
   * Returns a new object of class '<em>DSL Expression Division</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Division</em>'.
   * @generated
   */
  DSL_Expression_Division createDSL_Expression_Division();

  /**
   * Returns a new object of class '<em>DSL Expression Modulo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Modulo</em>'.
   * @generated
   */
  DSL_Expression_Modulo createDSL_Expression_Modulo();

  /**
   * Returns a new object of class '<em>DSL Object Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Object Number</em>'.
   * @generated
   */
  DSL_Object_Number createDSL_Object_Number();

  /**
   * Returns a new object of class '<em>DSL Object String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Object String</em>'.
   * @generated
   */
  DSL_Object_String createDSL_Object_String();

  /**
   * Returns a new object of class '<em>DSL Object Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Object Boolean</em>'.
   * @generated
   */
  DSL_Object_Boolean createDSL_Object_Boolean();

  /**
   * Returns a new object of class '<em>DSL Object Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Object Ref</em>'.
   * @generated
   */
  DSL_Object_Ref createDSL_Object_Ref();

  /**
   * Returns a new object of class '<em>DSL Expression Negate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Expression Negate</em>'.
   * @generated
   */
  DSL_Expression_Negate createDSL_Expression_Negate();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SensinactPackage getSensinactPackage();

} //SensinactFactory
