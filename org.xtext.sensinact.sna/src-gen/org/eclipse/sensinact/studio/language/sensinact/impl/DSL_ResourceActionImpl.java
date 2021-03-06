/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Resource Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceActionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceActionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceActionImpl#getActiontype <em>Actiontype</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ResourceActionImpl#getListParam <em>List Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_ResourceActionImpl extends MinimalEObjectImpl.Container implements DSL_ResourceAction
{
  /**
   * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected String variable = VARIABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected DSL_REF ref;

  /**
   * The default value of the '{@link #getActiontype() <em>Actiontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiontype()
   * @generated
   * @ordered
   */
  protected static final String ACTIONTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActiontype() <em>Actiontype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiontype()
   * @generated
   * @ordered
   */
  protected String actiontype = ACTIONTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getListParam() <em>List Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListParam()
   * @generated
   * @ordered
   */
  protected DSL_ListParam listParam;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_ResourceActionImpl()
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
    return SensinactPackage.Literals.DSL_RESOURCE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(String newVariable)
  {
    String oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE_ACTION__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (DSL_REF)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensinactPackage.DSL_RESOURCE_ACTION__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(DSL_REF newRef)
  {
    DSL_REF oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE_ACTION__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActiontype()
  {
    return actiontype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActiontype(String newActiontype)
  {
    String oldActiontype = actiontype;
    actiontype = newActiontype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE_ACTION__ACTIONTYPE, oldActiontype, actiontype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ListParam getListParam()
  {
    return listParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetListParam(DSL_ListParam newListParam, NotificationChain msgs)
  {
    DSL_ListParam oldListParam = listParam;
    listParam = newListParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM, oldListParam, newListParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListParam(DSL_ListParam newListParam)
  {
    if (newListParam != listParam)
    {
      NotificationChain msgs = null;
      if (listParam != null)
        msgs = ((InternalEObject)listParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM, null, msgs);
      if (newListParam != null)
        msgs = ((InternalEObject)newListParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM, null, msgs);
      msgs = basicSetListParam(newListParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM, newListParam, newListParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM:
        return basicSetListParam(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SensinactPackage.DSL_RESOURCE_ACTION__VARIABLE:
        return getVariable();
      case SensinactPackage.DSL_RESOURCE_ACTION__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case SensinactPackage.DSL_RESOURCE_ACTION__ACTIONTYPE:
        return getActiontype();
      case SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM:
        return getListParam();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SensinactPackage.DSL_RESOURCE_ACTION__VARIABLE:
        setVariable((String)newValue);
        return;
      case SensinactPackage.DSL_RESOURCE_ACTION__REF:
        setRef((DSL_REF)newValue);
        return;
      case SensinactPackage.DSL_RESOURCE_ACTION__ACTIONTYPE:
        setActiontype((String)newValue);
        return;
      case SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM:
        setListParam((DSL_ListParam)newValue);
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
      case SensinactPackage.DSL_RESOURCE_ACTION__VARIABLE:
        setVariable(VARIABLE_EDEFAULT);
        return;
      case SensinactPackage.DSL_RESOURCE_ACTION__REF:
        setRef((DSL_REF)null);
        return;
      case SensinactPackage.DSL_RESOURCE_ACTION__ACTIONTYPE:
        setActiontype(ACTIONTYPE_EDEFAULT);
        return;
      case SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM:
        setListParam((DSL_ListParam)null);
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
      case SensinactPackage.DSL_RESOURCE_ACTION__VARIABLE:
        return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
      case SensinactPackage.DSL_RESOURCE_ACTION__REF:
        return ref != null;
      case SensinactPackage.DSL_RESOURCE_ACTION__ACTIONTYPE:
        return ACTIONTYPE_EDEFAULT == null ? actiontype != null : !ACTIONTYPE_EDEFAULT.equals(actiontype);
      case SensinactPackage.DSL_RESOURCE_ACTION__LIST_PARAM:
        return listParam != null;
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
    result.append(" (variable: ");
    result.append(variable);
    result.append(", actiontype: ");
    result.append(actiontype);
    result.append(')');
    return result.toString();
  }

} //DSL_ResourceActionImpl
