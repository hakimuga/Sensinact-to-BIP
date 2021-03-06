/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL CEP DURATION SEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC#getSec <em>Sec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CEP_DURATION_SEC()
 * @model
 * @generated
 */
public interface DSL_CEP_DURATION_SEC extends EObject
{
  /**
   * Returns the value of the '<em><b>Sec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sec</em>' attribute.
   * @see #setSec(BigDecimal)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CEP_DURATION_SEC_Sec()
   * @model
   * @generated
   */
  BigDecimal getSec();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC#getSec <em>Sec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sec</em>' attribute.
   * @see #getSec()
   * @generated
   */
  void setSec(BigDecimal value);

} // DSL_CEP_DURATION_SEC
