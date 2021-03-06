/**
 */
package org.eclipse.sensinact.studio.language.sensinact.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL CEP AFTER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AFTERImpl#getRef1 <em>Ref1</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AFTERImpl#getRef2 <em>Ref2</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AFTERImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.sensinact.studio.language.sensinact.impl.DSL_CEP_AFTERImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSL_CEP_AFTERImpl extends MinimalEObjectImpl.Container implements DSL_CEP_AFTER
{
  /**
   * The cached value of the '{@link #getRef1() <em>Ref1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef1()
   * @generated
   * @ordered
   */
  protected DSL_REF_CONDITION ref1;

  /**
   * The cached value of the '{@link #getRef2() <em>Ref2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef2()
   * @generated
   * @ordered
   */
  protected DSL_REF_CONDITION ref2;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected DSL_CEP_DURATION start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected DSL_CEP_DURATION end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSL_CEP_AFTERImpl()
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
    return SensinactPackage.Literals.DSL_CEP_AFTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF_CONDITION getRef1()
  {
    return ref1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef1(DSL_REF_CONDITION newRef1, NotificationChain msgs)
  {
    DSL_REF_CONDITION oldRef1 = ref1;
    ref1 = newRef1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_AFTER__REF1, oldRef1, newRef1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef1(DSL_REF_CONDITION newRef1)
  {
    if (newRef1 != ref1)
    {
      NotificationChain msgs = null;
      if (ref1 != null)
        msgs = ((InternalEObject)ref1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_AFTER__REF1, null, msgs);
      if (newRef1 != null)
        msgs = ((InternalEObject)newRef1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_AFTER__REF1, null, msgs);
      msgs = basicSetRef1(newRef1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_AFTER__REF1, newRef1, newRef1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_REF_CONDITION getRef2()
  {
    return ref2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef2(DSL_REF_CONDITION newRef2, NotificationChain msgs)
  {
    DSL_REF_CONDITION oldRef2 = ref2;
    ref2 = newRef2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_AFTER__REF2, oldRef2, newRef2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef2(DSL_REF_CONDITION newRef2)
  {
    if (newRef2 != ref2)
    {
      NotificationChain msgs = null;
      if (ref2 != null)
        msgs = ((InternalEObject)ref2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_AFTER__REF2, null, msgs);
      if (newRef2 != null)
        msgs = ((InternalEObject)newRef2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_AFTER__REF2, null, msgs);
      msgs = basicSetRef2(newRef2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_AFTER__REF2, newRef2, newRef2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_DURATION getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(DSL_CEP_DURATION newStart, NotificationChain msgs)
  {
    DSL_CEP_DURATION oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_AFTER__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(DSL_CEP_DURATION newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_AFTER__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_AFTER__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_AFTER__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSL_CEP_DURATION getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(DSL_CEP_DURATION newEnd, NotificationChain msgs)
  {
    DSL_CEP_DURATION oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_AFTER__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(DSL_CEP_DURATION newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_AFTER__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SensinactPackage.DSL_CEP_AFTER__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensinactPackage.DSL_CEP_AFTER__END, newEnd, newEnd));
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
      case SensinactPackage.DSL_CEP_AFTER__REF1:
        return basicSetRef1(null, msgs);
      case SensinactPackage.DSL_CEP_AFTER__REF2:
        return basicSetRef2(null, msgs);
      case SensinactPackage.DSL_CEP_AFTER__START:
        return basicSetStart(null, msgs);
      case SensinactPackage.DSL_CEP_AFTER__END:
        return basicSetEnd(null, msgs);
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
      case SensinactPackage.DSL_CEP_AFTER__REF1:
        return getRef1();
      case SensinactPackage.DSL_CEP_AFTER__REF2:
        return getRef2();
      case SensinactPackage.DSL_CEP_AFTER__START:
        return getStart();
      case SensinactPackage.DSL_CEP_AFTER__END:
        return getEnd();
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
      case SensinactPackage.DSL_CEP_AFTER__REF1:
        setRef1((DSL_REF_CONDITION)newValue);
        return;
      case SensinactPackage.DSL_CEP_AFTER__REF2:
        setRef2((DSL_REF_CONDITION)newValue);
        return;
      case SensinactPackage.DSL_CEP_AFTER__START:
        setStart((DSL_CEP_DURATION)newValue);
        return;
      case SensinactPackage.DSL_CEP_AFTER__END:
        setEnd((DSL_CEP_DURATION)newValue);
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
      case SensinactPackage.DSL_CEP_AFTER__REF1:
        setRef1((DSL_REF_CONDITION)null);
        return;
      case SensinactPackage.DSL_CEP_AFTER__REF2:
        setRef2((DSL_REF_CONDITION)null);
        return;
      case SensinactPackage.DSL_CEP_AFTER__START:
        setStart((DSL_CEP_DURATION)null);
        return;
      case SensinactPackage.DSL_CEP_AFTER__END:
        setEnd((DSL_CEP_DURATION)null);
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
      case SensinactPackage.DSL_CEP_AFTER__REF1:
        return ref1 != null;
      case SensinactPackage.DSL_CEP_AFTER__REF2:
        return ref2 != null;
      case SensinactPackage.DSL_CEP_AFTER__START:
        return start != null;
      case SensinactPackage.DSL_CEP_AFTER__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //DSL_CEP_AFTERImpl
