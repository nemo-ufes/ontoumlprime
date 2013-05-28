/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characterization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CharacterizationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CharacterizationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterizationImpl extends BinaryDirectedRelationshipImpl implements Characterization
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected IntrinsicMomentUniversal target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacterizationImpl()
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
    return PrimeOntoUMLPackage.Literals.CHARACTERIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndurantUniversal getSource()
  {
    if (eContainerFeatureID() != PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE) return null;
    return (EndurantUniversal)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(EndurantUniversal newSource, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newSource, PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(EndurantUniversal newSource)
  {
    if (newSource != eInternalContainer() || (eContainerFeatureID() != PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE && newSource != null))
    {
      if (EcoreUtil.isAncestor(this, newSource))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY, EndurantUniversal.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntrinsicMomentUniversal getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (IntrinsicMomentUniversal)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.CHARACTERIZATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntrinsicMomentUniversal basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(IntrinsicMomentUniversal newTarget, NotificationChain msgs)
  {
    IntrinsicMomentUniversal oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.CHARACTERIZATION__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(IntrinsicMomentUniversal newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION, IntrinsicMomentUniversal.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION, IntrinsicMomentUniversal.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.CHARACTERIZATION__TARGET, newTarget, newTarget));
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
      case PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSource((EndurantUniversal)otherEnd, msgs);
      case PrimeOntoUMLPackage.CHARACTERIZATION__TARGET:
        if (target != null)
          msgs = ((InternalEObject)target).eInverseRemove(this, PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION, IntrinsicMomentUniversal.class, msgs);
        return basicSetTarget((IntrinsicMomentUniversal)otherEnd, msgs);
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
      case PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE:
        return basicSetSource(null, msgs);
      case PrimeOntoUMLPackage.CHARACTERIZATION__TARGET:
        return basicSetTarget(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE:
        return eInternalContainer().eInverseRemove(this, PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY, EndurantUniversal.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE:
        return getSource();
      case PrimeOntoUMLPackage.CHARACTERIZATION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE:
        setSource((EndurantUniversal)newValue);
        return;
      case PrimeOntoUMLPackage.CHARACTERIZATION__TARGET:
        setTarget((IntrinsicMomentUniversal)newValue);
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
      case PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE:
        setSource((EndurantUniversal)null);
        return;
      case PrimeOntoUMLPackage.CHARACTERIZATION__TARGET:
        setTarget((IntrinsicMomentUniversal)null);
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
      case PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE:
        return getSource() != null;
      case PrimeOntoUMLPackage.CHARACTERIZATION__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //CharacterizationImpl
