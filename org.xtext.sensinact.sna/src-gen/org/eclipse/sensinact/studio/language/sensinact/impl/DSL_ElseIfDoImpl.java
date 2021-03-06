/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Else If Do</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseIfDoImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ElseIfDoImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_ElseIfDoImpl extends MinimalEObjectImpl.Container implements DSL_ElseIfDo
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected DSL_Expression condition;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected DSL_ListActions actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_ElseIfDoImpl()
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
    return SensinactPackage.Literals.DSL_ELSE_IF_DO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(DSL_Expression newCondition, NotificationChain msgs)
  {
    DSL_Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_ELSE_IF_DO__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(DSL_Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_ELSE_IF_DO__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_ELSE_IF_DO__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_ELSE_IF_DO__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ListActions getActions()
  {
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActions(DSL_ListActions newActions, NotificationChain msgs)
  {
    DSL_ListActions oldActions = actions;
    actions = newActions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_ELSE_IF_DO__ACTIONS, oldActions, newActions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActions(DSL_ListActions newActions)
  {
    if (newActions != actions)
    {
      NotificationChain msgs = null;
      if (actions != null)
        msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_ELSE_IF_DO__ACTIONS, null, msgs);
      if (newActions != null)
        msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_ELSE_IF_DO__ACTIONS, null, msgs);
      msgs = basicSetActions(newActions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_ELSE_IF_DO__ACTIONS, newActions, newActions));
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
      case SensinactPackage.DSL_ELSE_IF_DO__CONDITION:
        return basicSetCondition(null, msgs);
      case SensinactPackage.DSL_ELSE_IF_DO__ACTIONS:
        return basicSetActions(null, msgs);
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
      case SensinactPackage.DSL_ELSE_IF_DO__CONDITION:
        return getCondition();
      case SensinactPackage.DSL_ELSE_IF_DO__ACTIONS:
        return getActions();
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
      case SensinactPackage.DSL_ELSE_IF_DO__CONDITION:
        setCondition((DSL_Expression)newValue);
        return;
      case SensinactPackage.DSL_ELSE_IF_DO__ACTIONS:
        setActions((DSL_ListActions)newValue);
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
      case SensinactPackage.DSL_ELSE_IF_DO__CONDITION:
        setCondition((DSL_Expression)null);
        return;
      case SensinactPackage.DSL_ELSE_IF_DO__ACTIONS:
        setActions((DSL_ListActions)null);
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
      case SensinactPackage.DSL_ELSE_IF_DO__CONDITION:
        return condition != null;
      case SensinactPackage.DSL_ELSE_IF_DO__ACTIONS:
        return actions != null;
    }
    return super.eIsSet(featureID);
  }

} //DSL_ElseIfDoImpl
