/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UniversalImpl#getIsSpecializedVia <em>Is Specialized Via</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UniversalImpl#getSpecializesVia <em>Specializes Via</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UniversalImpl extends NamedElementImpl implements Universal
{
  /**
   * The cached value of the '{@link #getIsSpecializedVia() <em>Is Specialized Via</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsSpecializedVia()
   * @generated
   * @ordered
   */
  protected EList<GeneralizationSet> isSpecializedVia;

  /**
   * The cached value of the '{@link #getSpecializesVia() <em>Specializes Via</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecializesVia()
   * @generated
   * @ordered
   */
  protected EList<GeneralizationSet> specializesVia;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UniversalImpl()
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
    return PrimeOntoUMLPackage.Literals.UNIVERSAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GeneralizationSet> getIsSpecializedVia()
  {
    if (isSpecializedVia == null)
    {
      isSpecializedVia = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA, PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZED_UNIVERSAL);
    }
    return isSpecializedVia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GeneralizationSet> getSpecializesVia()
  {
    if (specializesVia == null)
    {
      specializesVia = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizationSet>(GeneralizationSet.class, this, PrimeOntoUMLPackage.UNIVERSAL__SPECIALIZES_VIA, PrimeOntoUMLPackage.GENERALIZATION_SET__SPECIALIZING_UNIVERSALS);
    }
    return specializesVia;
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
      case PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSpecializedVia()).basicAdd(otherEnd, msgs);
      case PrimeOntoUMLPackage.UNIVERSAL__SPECIALIZES_VIA:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializesVia()).basicAdd(otherEnd, msgs);
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
      case PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA:
        return ((InternalEList<?>)getIsSpecializedVia()).basicRemove(otherEnd, msgs);
      case PrimeOntoUMLPackage.UNIVERSAL__SPECIALIZES_VIA:
        return ((InternalEList<?>)getSpecializesVia()).basicRemove(otherEnd, msgs);
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
      case PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA:
        return getIsSpecializedVia();
      case PrimeOntoUMLPackage.UNIVERSAL__SPECIALIZES_VIA:
        return getSpecializesVia();
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
      case PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA:
        getIsSpecializedVia().clear();
        getIsSpecializedVia().addAll((Collection<? extends GeneralizationSet>)newValue);
        return;
      case PrimeOntoUMLPackage.UNIVERSAL__SPECIALIZES_VIA:
        getSpecializesVia().clear();
        getSpecializesVia().addAll((Collection<? extends GeneralizationSet>)newValue);
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
      case PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA:
        getIsSpecializedVia().clear();
        return;
      case PrimeOntoUMLPackage.UNIVERSAL__SPECIALIZES_VIA:
        getSpecializesVia().clear();
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
      case PrimeOntoUMLPackage.UNIVERSAL__IS_SPECIALIZED_VIA:
        return isSpecializedVia != null && !isSpecializedVia.isEmpty();
      case PrimeOntoUMLPackage.UNIVERSAL__SPECIALIZES_VIA:
        return specializesVia != null && !specializesVia.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UniversalImpl
