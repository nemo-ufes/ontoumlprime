/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.GeneralizationSetImpl#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.GeneralizationSetImpl#getSpecializedUniversal <em>Specialized Universal</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.GeneralizationSetImpl#getSpecializingUniversals <em>Specializing Universals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationSetImpl extends NamedElementImpl implements GeneralizationSet
{
  /**
   * The default value of the '{@link #isIsCovering() <em>Is Covering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsCovering()
   * @generated
   * @ordered
   */
  protected static final boolean IS_COVERING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsCovering() <em>Is Covering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsCovering()
   * @generated
   * @ordered
   */
  protected boolean isCovering = IS_COVERING_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpecializedUniversal() <em>Specialized Universal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecializedUniversal()
   * @generated
   * @ordered
   */
  protected Universal specializedUniversal;

  /**
   * The cached value of the '{@link #getSpecializingUniversals() <em>Specializing Universals</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecializingUniversals()
   * @generated
   * @ordered
   */
  protected EList<Universal> specializingUniversals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralizationSetImpl()
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
    return PrimeOntoUMLPackage.Literals.GENERALIZATION_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsCovering()
  {
    return isCovering;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsCovering(boolean newIsCovering)
  {
    boolean oldIsCovering = isCovering;
    isCovering = newIsCovering;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.GENERALIZATION_SET__IS_COVERING, oldIsCovering, isCovering));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Universal getSpecializedUniversal()
  {
    if (specializedUniversal != null && specializedUniversal.eIsProxy())
    {
      InternalEObject oldSpecializedUniversal = (InternalEObject)specializedUniversal;
      specializedUniversal = (Universal)eResolveProxy(oldSpecializedUniversal);
      if (specializedUniversal != oldSpecializedUniversal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL, oldSpecializedUniversal, specializedUniversal));
      }
    }
    return specializedUniversal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Universal basicGetSpecializedUniversal()
  {
    return specializedUniversal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecializedUniversal(Universal newSpecializedUniversal, NotificationChain msgs)
  {
    Universal oldSpecializedUniversal = specializedUniversal;
    specializedUniversal = newSpecializedUniversal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL, oldSpecializedUniversal, newSpecializedUniversal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecializedUniversal(Universal newSpecializedUniversal)
  {
    if (newSpecializedUniversal != specializedUniversal)
    {
      NotificationChain msgs = null;
      if (specializedUniversal != null)
        msgs = ((InternalEObject)specializedUniversal).eInverseRemove(this, PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA, Universal.class, msgs);
      if (newSpecializedUniversal != null)
        msgs = ((InternalEObject)newSpecializedUniversal).eInverseAdd(this, PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA, Universal.class, msgs);
      msgs = basicSetSpecializedUniversal(newSpecializedUniversal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL, newSpecializedUniversal, newSpecializedUniversal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Universal> getSpecializingUniversals()
  {
    if (specializingUniversals == null)
    {
      specializingUniversals = new EObjectWithInverseResolvingEList.ManyInverse<Universal>(Universal.class, this, PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZING_UNIVERSALS, PrimeOntoUMLPackage.UNIVERSAL__SPECIALIZES_VIA);
    }
    return specializingUniversals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL:
        if (specializedUniversal != null)
          msgs = ((InternalEObject)specializedUniversal).eInverseRemove(this, PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA, Universal.class, msgs);
        return basicSetSpecializedUniversal((Universal)otherEnd, msgs);
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZING_UNIVERSALS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializingUniversals()).basicAdd(otherEnd, msgs);
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
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL:
        return basicSetSpecializedUniversal(null, msgs);
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZING_UNIVERSALS:
        return ((InternalEList<?>)getSpecializingUniversals()).basicRemove(otherEnd, msgs);
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
      case PrimeOntoUMLPackage.GENERALIZATION_SET__IS_COVERING:
        return isIsCovering();
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL:
        if (resolve) return getSpecializedUniversal();
        return basicGetSpecializedUniversal();
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZING_UNIVERSALS:
        return getSpecializingUniversals();
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
      case PrimeOntoUMLPackage.GENERALIZATION_SET__IS_COVERING:
        setIsCovering((Boolean)newValue);
        return;
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL:
        setSpecializedUniversal((Universal)newValue);
        return;
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZING_UNIVERSALS:
        getSpecializingUniversals().clear();
        getSpecializingUniversals().addAll((Collection<? extends Universal>)newValue);
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
      case PrimeOntoUMLPackage.GENERALIZATION_SET__IS_COVERING:
        setIsCovering(IS_COVERING_EDEFAULT);
        return;
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL:
        setSpecializedUniversal((Universal)null);
        return;
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZING_UNIVERSALS:
        getSpecializingUniversals().clear();
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
      case PrimeOntoUMLPackage.GENERALIZATION_SET__IS_COVERING:
        return isCovering != IS_COVERING_EDEFAULT;
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL:
        return specializedUniversal != null;
      case PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZING_UNIVERSALS:
        return specializingUniversals != null && !specializingUniversals.isEmpty();
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
    result.append(" (isCovering: ");
    result.append(isCovering);
    result.append(')');
    return result.toString();
  }

} //GeneralizationSetImpl
