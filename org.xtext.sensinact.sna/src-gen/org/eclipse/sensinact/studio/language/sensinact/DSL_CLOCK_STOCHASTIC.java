/**
 */
package org.eclipse.sensinact.studio.language.sensinact;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL CLOCK STOCHASTIC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getParam1 <em>Param1</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getParam2 <em>Param2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CLOCK_STOCHASTIC()
 * @model
 * @generated
 */
public interface DSL_CLOCK_STOCHASTIC extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.sensinact.studio.language.sensinact.DSL_Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference list.
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CLOCK_STOCHASTIC_Ref()
   * @model
   * @generated
   */
  EList<DSL_Resource> getRef();

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(BigDecimal)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CLOCK_STOCHASTIC_Value()
   * @model
   * @generated
   */
  BigDecimal getValue();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Param1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param1</em>' attribute.
   * @see #setParam1(BigDecimal)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CLOCK_STOCHASTIC_Param1()
   * @model
   * @generated
   */
  BigDecimal getParam1();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getParam1 <em>Param1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param1</em>' attribute.
   * @see #getParam1()
   * @generated
   */
  void setParam1(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Param2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param2</em>' attribute.
   * @see #setParam2(BigDecimal)
   * @see org.eclipse.sensinact.studio.language.sensinact.SensinactPackage#getDSL_CLOCK_STOCHASTIC_Param2()
   * @model
   * @generated
   */
  BigDecimal getParam2();

  /**
   * Sets the value of the '{@link org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC#getParam2 <em>Param2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param2</em>' attribute.
   * @see #getParam2()
   * @generated
   */
  void setParam2(BigDecimal value);

} // DSL_CLOCK_STOCHASTIC
