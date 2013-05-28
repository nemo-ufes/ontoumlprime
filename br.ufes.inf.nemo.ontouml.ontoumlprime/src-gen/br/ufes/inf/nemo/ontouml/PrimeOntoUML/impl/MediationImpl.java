/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MediationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MediationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediationImpl extends BinaryDirectedRelationshipImpl implements Mediation
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ExternallyDependentUniversal target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MediationImpl()
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
    return PrimeOntoUMLPackage.Literals.MEDIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelatorUniversal getSource()
  {
    if (eContainerFeatureID() != PrimeOntoUMLPackage.MEDIATION__SOURCE) return null;
    return (RelatorUniversal)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(RelatorUniversal newSource, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newSource, PrimeOntoUMLPackage.MEDIATION__SOURCE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(RelatorUniversal newSource)
  {
    if (newSource != eInternalContainer() || (eContainerFeatureID() != PrimeOntoUMLPackage.MEDIATION__SOURCE && newSource != null))
    {
      if (EcoreUtil.isAncestor(this, newSource))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, PrimeOntoUMLPackage.RELATOR_UNIVERSAL__MEDIATIONS, RelatorUniversal.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MEDIATION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternallyDependentUniversal getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (ExternallyDependentUniversal)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.MEDIATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternallyDependentUniversal basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(ExternallyDependentUniversal newTarget, NotificationChain msgs)
  {
    ExternallyDependentUniversal oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MEDIATION__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ExternallyDependentUniversal newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION, ExternallyDependentUniversal.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION, ExternallyDependentUniversal.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.MEDIATION__TARGET, newTarget, newTarget));
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
      case PrimeOntoUMLPackage.MEDIATION__SOURCE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSource((RelatorUniversal)otherEnd, msgs);
      case PrimeOntoUMLPackage.MEDIATION__TARGET:
        if (target != null)
          msgs = ((InternalEObject)target).eInverseRemove(this, PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION, ExternallyDependentUniversal.class, msgs);
        return basicSetTarget((ExternallyDependentUniversal)otherEnd, msgs);
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
      case PrimeOntoUMLPackage.MEDIATION__SOURCE:
        return basicSetSource(null, msgs);
      case PrimeOntoUMLPackage.MEDIATION__TARGET:
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
      case PrimeOntoUMLPackage.MEDIATION__SOURCE:
        return eInternalContainer().eInverseRemove(this, PrimeOntoUMLPackage.RELATOR_UNIVERSAL__MEDIATIONS, RelatorUniversal.class, msgs);
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
      case PrimeOntoUMLPackage.MEDIATION__SOURCE:
        return getSource();
      case PrimeOntoUMLPackage.MEDIATION__TARGET:
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
      case PrimeOntoUMLPackage.MEDIATION__SOURCE:
        setSource((RelatorUniversal)newValue);
        return;
      case PrimeOntoUMLPackage.MEDIATION__TARGET:
        setTarget((ExternallyDependentUniversal)newValue);
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
      case PrimeOntoUMLPackage.MEDIATION__SOURCE:
        setSource((RelatorUniversal)null);
        return;
      case PrimeOntoUMLPackage.MEDIATION__TARGET:
        setTarget((ExternallyDependentUniversal)null);
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
      case PrimeOntoUMLPackage.MEDIATION__SOURCE:
        return getSource() != null;
      case PrimeOntoUMLPackage.MEDIATION__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //MediationImpl
