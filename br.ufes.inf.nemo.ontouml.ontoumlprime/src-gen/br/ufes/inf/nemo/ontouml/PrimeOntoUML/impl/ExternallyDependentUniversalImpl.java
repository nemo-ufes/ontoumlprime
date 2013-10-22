/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Externally Dependent Universal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ExternallyDependentUniversalImpl#getMediation <em>Mediation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExternallyDependentUniversalImpl extends NamedElementImpl implements ExternallyDependentUniversal
{
  /**
   * The cached value of the '{@link #getMediation() <em>Mediation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMediation()
   * @generated
   * @ordered
   */
  protected Mediation mediation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternallyDependentUniversalImpl()
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
    return PrimeOntoUMLPackage.Literals.EXTERNALLY_DEPENDENT_UNIVERSAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mediation getMediation()
  {
    if (mediation != null && mediation.eIsProxy())
    {
      InternalEObject oldMediation = (InternalEObject)mediation;
      mediation = (Mediation)eResolveProxy(oldMediation);
      if (mediation != oldMediation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION, oldMediation, mediation));
      }
    }
    return mediation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mediation basicGetMediation()
  {
    return mediation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMediation(Mediation newMediation, NotificationChain msgs)
  {
    Mediation oldMediation = mediation;
    mediation = newMediation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION, oldMediation, newMediation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMediation(Mediation newMediation)
  {
    if (newMediation != mediation)
    {
      NotificationChain msgs = null;
      if (mediation != null)
        msgs = ((InternalEObject)mediation).eInverseRemove(this, PrimeOntoUMLPackage.MEDIATION__TARGET, Mediation.class, msgs);
      if (newMediation != null)
        msgs = ((InternalEObject)newMediation).eInverseAdd(this, PrimeOntoUMLPackage.MEDIATION__TARGET, Mediation.class, msgs);
      msgs = basicSetMediation(newMediation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION, newMediation, newMediation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION:
        if (mediation != null)
          msgs = ((InternalEObject)mediation).eInverseRemove(this, PrimeOntoUMLPackage.MEDIATION__TARGET, Mediation.class, msgs);
        return basicSetMediation((Mediation)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION:
        return basicSetMediation(null, msgs);
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
      case PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION:
        if (resolve) return getMediation();
        return basicGetMediation();
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
      case PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION:
        setMediation((Mediation)newValue);
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
      case PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION:
        setMediation((Mediation)null);
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
      case PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION:
        return mediation != null;
    }
    return super.eIsSet(featureID);
  }

} //ExternallyDependentUniversalImpl
