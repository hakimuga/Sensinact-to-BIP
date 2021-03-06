/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL ECA STATEMENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ECA_STATEMENTImpl#getIfdo <em>Ifdo</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ECA_STATEMENTImpl#getElseIfdo <em>Else Ifdo</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_ECA_STATEMENTImpl#getElsedo <em>Elsedo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_ECA_STATEMENTImpl extends MinimalEObjectImpl.Container implements DSL_ECA_STATEMENT
{
  /**
   * The cached value of the '{@link #getIfdo() <em>Ifdo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfdo()
   * @generated
   * @ordered
   */
  protected DSL_IfDo ifdo;

  /**
   * The cached value of the '{@link #getElseIfdo() <em>Else Ifdo</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseIfdo()
   * @generated
   * @ordered
   */
  protected EList<DSL_ElseIfDo> elseIfdo;

  /**
   * The cached value of the '{@link #getElsedo() <em>Elsedo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsedo()
   * @generated
   * @ordered
   */
  protected DSL_ElseDo elsedo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_ECA_STATEMENTImpl()
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
    return SensinactPackage.Literals.DSL_ECA_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_IfDo getIfdo()
  {
    return ifdo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfdo(DSL_IfDo newIfdo, NotificationChain msgs)
  {
    DSL_IfDo oldIfdo = ifdo;
    ifdo = newIfdo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_ECA_STATEMENT__IFDO, oldIfdo, newIfdo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfdo(DSL_IfDo newIfdo)
  {
    if (newIfdo != ifdo)
    {
      NotificationChain msgs = null;
      if (ifdo != null)
        msgs = ((InternalEObject)ifdo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_ECA_STATEMENT__IFDO, null, msgs);
      if (newIfdo != null)
        msgs = ((InternalEObject)newIfdo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_ECA_STATEMENT__IFDO, null, msgs);
      msgs = basicSetIfdo(newIfdo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_ECA_STATEMENT__IFDO, newIfdo, newIfdo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSL_ElseIfDo> getElseIfdo()
  {
    if (elseIfdo == null)
    {
      elseIfdo = new EObjectContainmentEList<DSL_ElseIfDo>(DSL_ElseIfDo.class, this, SensinactPackage.DSL_ECA_STATEMENT__ELSE_IFDO);
    }
    return elseIfdo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_ElseDo getElsedo()
  {
    return elsedo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsedo(DSL_ElseDo newElsedo, NotificationChain msgs)
  {
    DSL_ElseDo oldElsedo = elsedo;
    elsedo = newElsedo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_ECA_STATEMENT__ELSEDO, oldElsedo, newElsedo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsedo(DSL_ElseDo newElsedo)
  {
    if (newElsedo != elsedo)
    {
      NotificationChain msgs = null;
      if (elsedo != null)
        msgs = ((InternalEObject)elsedo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_ECA_STATEMENT__ELSEDO, null, msgs);
      if (newElsedo != null)
        msgs = ((InternalEObject)newElsedo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_ECA_STATEMENT__ELSEDO, null, msgs);
      msgs = basicSetElsedo(newElsedo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_ECA_STATEMENT__ELSEDO, newElsedo, newElsedo));
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
      case SensinactPackage.DSL_ECA_STATEMENT__IFDO:
        return basicSetIfdo(null, msgs);
      case SensinactPackage.DSL_ECA_STATEMENT__ELSE_IFDO:
        return ((InternalEList<?>)getElseIfdo()).basicRemove(otherEnd, msgs);
      case SensinactPackage.DSL_ECA_STATEMENT__ELSEDO:
        return basicSetElsedo(null, msgs);
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
      case SensinactPackage.DSL_ECA_STATEMENT__IFDO:
        return getIfdo();
      case SensinactPackage.DSL_ECA_STATEMENT__ELSE_IFDO:
        return getElseIfdo();
      case SensinactPackage.DSL_ECA_STATEMENT__ELSEDO:
        return getElsedo();
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
      case SensinactPackage.DSL_ECA_STATEMENT__IFDO:
        setIfdo((DSL_IfDo)newValue);
        return;
      case SensinactPackage.DSL_ECA_STATEMENT__ELSE_IFDO:
        getElseIfdo().clear();
        getElseIfdo().addAll((Collection<? extends DSL_ElseIfDo>)newValue);
        return;
      case SensinactPackage.DSL_ECA_STATEMENT__ELSEDO:
        setElsedo((DSL_ElseDo)newValue);
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
      case SensinactPackage.DSL_ECA_STATEMENT__IFDO:
        setIfdo((DSL_IfDo)null);
        return;
      case SensinactPackage.DSL_ECA_STATEMENT__ELSE_IFDO:
        getElseIfdo().clear();
        return;
      case SensinactPackage.DSL_ECA_STATEMENT__ELSEDO:
        setElsedo((DSL_ElseDo)null);
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
      case SensinactPackage.DSL_ECA_STATEMENT__IFDO:
        return ifdo != null;
      case SensinactPackage.DSL_ECA_STATEMENT__ELSE_IFDO:
        return elseIfdo != null && !elseIfdo.isEmpty();
      case SensinactPackage.DSL_ECA_STATEMENT__ELSEDO:
        return elsedo != null;
    }
    return super.eIsSet(featureID);
  }

} //DSL_ECA_STATEMENTImpl
