/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL CEP COINCIDE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getRef1 <em>Ref1</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getRef2 <em>Ref2</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getWindow <em>Window</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CEP_COINCIDE()
 * @model
 * @generated
 */
public interface DSL_CEP_COINCIDE extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref1</em>' containment reference.
   * @see #setRef1(DSL_REF_CONDITION)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CEP_COINCIDE_Ref1()
   * @model containment="true"
   * @generated
   */
  DSL_REF_CONDITION getRef1();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getRef1 <em>Ref1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref1</em>' containment reference.
   * @see #getRef1()
   * @generated
   */
  void setRef1(DSL_REF_CONDITION value);

  /**
   * Returns the value of the '<em><b>Ref2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref2</em>' containment reference.
   * @see #setRef2(DSL_REF_CONDITION)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CEP_COINCIDE_Ref2()
   * @model containment="true"
   * @generated
   */
  DSL_REF_CONDITION getRef2();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getRef2 <em>Ref2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref2</em>' containment reference.
   * @see #getRef2()
   * @generated
   */
  void setRef2(DSL_REF_CONDITION value);

  /**
   * Returns the value of the '<em><b>Window</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Window</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Window</em>' containment reference.
   * @see #setWindow(DSL_CEP_DURATION)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CEP_COINCIDE_Window()
   * @model containment="true"
   * @generated
   */
  DSL_CEP_DURATION getWindow();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE#getWindow <em>Window</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Window</em>' containment reference.
   * @see #getWindow()
   * @generated
   */
  void setWindow(DSL_CEP_DURATION value);

} // DSL_CEP_COINCIDE
