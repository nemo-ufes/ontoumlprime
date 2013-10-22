/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intrinsic Moment Universal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.IntrinsicMomentUniversalImpl#getCharacterization <em>Characterization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IntrinsicMomentUniversalImpl extends MomentUniversalImpl implements IntrinsicMomentUniversal
{
  /**
   * The cached value of the '{@link #getCharacterization() <em>Characterization</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacterization()
   * @generated
   * @ordered
   */
  protected Characterization characterization;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntrinsicMomentUniversalImpl()
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
    return PrimeOntoUMLPackage.Literals.INTRINSIC_MOMENT_UNIVERSAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Characterization getCharacterization()
  {
    if (characterization != null && characterization.eIsProxy())
    {
      InternalEObject oldCharacterization = (InternalEObject)characterization;
      characterization = (Characterization)eResolveProxy(oldCharacterization);
      if (characterization != oldCharacterization)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION, oldCharacterization, characterization));
      }
    }
    return characterization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Characterization basicGetCharacterization()
  {
    return characterization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCharacterization(Characterization newCharacterization, NotificationChain msgs)
  {
    Characterization oldCharacterization = characterization;
    characterization = newCharacterization;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION, oldCharacterization, newCharacterization);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharacterization(Characterization newCharacterization)
  {
    if (newCharacterization != characterization)
    {
      NotificationChain msgs = null;
      if (characterization != null)
        msgs = ((InternalEObject)characterization).eInverseRemove(this, PrimeOntoUMLPackage.CHARACTERIZATION__TARGET, Characterization.class, msgs);
      if (newCharacterization != null)
        msgs = ((InternalEObject)newCharacterization).eInverseAdd(this, PrimeOntoUMLPackage.CHARACTERIZATION__TARGET, Characterization.class, msgs);
      msgs = basicSetCharacterization(newCharacterization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION, newCharacterization, newCharacterization));
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
      case PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION:
        if (characterization != null)
          msgs = ((InternalEObject)characterization).eInverseRemove(this, PrimeOntoUMLPackage.CHARACTERIZATION__TARGET, Characterization.class, msgs);
        return basicSetCharacterization((Characterization)otherEnd, msgs);
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
      case PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION:
        return basicSetCharacterization(null, msgs);
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
      case PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION:
        if (resolve) return getCharacterization();
        return basicGetCharacterization();
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
      case PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION:
        setCharacterization((Characterization)newValue);
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
      case PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION:
        setCharacterization((Characterization)null);
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
      case PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION:
        return characterization != null;
    }
    return super.eIsSet(featureID);
  }

} //IntrinsicMomentUniversalImpl
