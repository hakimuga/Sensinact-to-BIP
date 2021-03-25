/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL CLOCK STOCHASTIC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CLOCK_STOCHASTICImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CLOCK_STOCHASTICImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CLOCK_STOCHASTICImpl#getParam1 <em>Param1</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CLOCK_STOCHASTICImpl#getParam2 <em>Param2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_CLOCK_STOCHASTICImpl extends MinimalEObjectImpl.Container implements DSL_CLOCK_STOCHASTIC
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected EList<DSL_Resource> ref;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final BigDecimal VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected BigDecimal value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getParam1() <em>Param1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam1()
   * @generated
   * @ordered
   */
  protected static final BigDecimal PARAM1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParam1() <em>Param1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam1()
   * @generated
   * @ordered
   */
  protected BigDecimal param1 = PARAM1_EDEFAULT;

  /**
   * The default value of the '{@link #getParam2() <em>Param2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam2()
   * @generated
   * @ordered
   */
  protected static final BigDecimal PARAM2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParam2() <em>Param2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam2()
   * @generated
   * @ordered
   */
  protected BigDecimal param2 = PARAM2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_CLOCK_STOCHASTICImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SensinactPackage.Literals.DSL_CLOCK_STOCHASTIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSL_Resource> getRef()
  {
    if (ref == null)
    {
      ref = new EObjectResolvingEList<DSL_Resource>(DSL_Resource.class, this, SensinactPackage.DSL_CLOCK_STOCHASTIC__REF);
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(BigDecimal newValue)
  {
    BigDecimal oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CLOCK_STOCHASTIC__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getParam1()
  {
    return param1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam1(BigDecimal newParam1)
  {
    BigDecimal oldParam1 = param1;
    param1 = newParam1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM1, oldParam1, param1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getParam2()
  {
    return param2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam2(BigDecimal newParam2)
  {
    BigDecimal oldParam2 = param2;
    param2 = newParam2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM2, oldParam2, param2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__REF:
        return getRef();
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__VALUE:
        return getValue();
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM1:
        return getParam1();
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM2:
        return getParam2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__REF:
        getRef().clear();
        getRef().addAll((Collection<? extends DSL_Resource>)newValue);
        return;
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__VALUE:
        setValue((BigDecimal)newValue);
        return;
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM1:
        setParam1((BigDecimal)newValue);
        return;
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM2:
        setParam2((BigDecimal)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__REF:
        getRef().clear();
        return;
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM1:
        setParam1(PARAM1_EDEFAULT);
        return;
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM2:
        setParam2(PARAM2_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__REF:
        return ref != null && !ref.isEmpty();
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM1:
        return PARAM1_EDEFAULT == null ? param1 != null : !PARAM1_EDEFAULT.equals(param1);
      case SensinactPackage.DSL_CLOCK_STOCHASTIC__PARAM2:
        return PARAM2_EDEFAULT == null ? param2 != null : !PARAM2_EDEFAULT.equals(param2);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", param1: ");
    result.append(param1);
    result.append(", param2: ");
    result.append(param2);
    result.append(')');
    return result.toString();
  }

} //DSL_CLOCK_STOCHASTICImpl
