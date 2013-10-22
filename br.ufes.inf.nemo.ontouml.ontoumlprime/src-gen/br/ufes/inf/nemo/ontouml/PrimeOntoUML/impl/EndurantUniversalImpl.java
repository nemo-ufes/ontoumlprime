/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endurant Universal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EndurantUniversalImpl#getCharacterizedBy <em>Characterized By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EndurantUniversalImpl extends UniversalImpl implements EndurantUniversal
{
  /**
   * The cached value of the '{@link #getCharacterizedBy() <em>Characterized By</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacterizedBy()
   * @generated
   * @ordered
   */
  protected EList<Characterization> characterizedBy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EndurantUniversalImpl()
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
    return PrimeOntoUMLPackage.Literals.ENDURANT_UNIVERSAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Characterization> getCharacterizedBy()
  {
    if (characterizedBy == null)
    {
      characterizedBy = new EObjectContainmentWithInverseEList<Characterization>(Characterization.class, this, PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY, PrimeOntoUMLPackage.CHARACTERIZATION__SOURCE);
    }
    return characterizedBy;
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
      case PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharacterizedBy()).basicAdd(otherEnd, msgs);
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
      case PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY:
        return ((InternalEList<?>)getCharacterizedBy()).basicRemove(otherEnd, msgs);
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
      case PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY:
        return getCharacterizedBy();
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
      case PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY:
        getCharacterizedBy().clear();
        getCharacterizedBy().addAll((Collection<? extends Characterization>)newValue);
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
      case PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY:
        getCharacterizedBy().clear();
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
      case PrimeOntoUMLPackage.ENDURANT_UNIVERSAL__CHARACTERIZED_BY:
        return characterizedBy != null && !characterizedBy.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EndurantUniversalImpl
