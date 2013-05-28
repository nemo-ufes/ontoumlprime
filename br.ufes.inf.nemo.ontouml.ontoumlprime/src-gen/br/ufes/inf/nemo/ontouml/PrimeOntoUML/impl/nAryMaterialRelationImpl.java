/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>nAry Material Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl#getTargetRelata <em>Target Relata</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl#getTargetEndNames <em>Target End Names</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class nAryMaterialRelationImpl extends NamedElementImpl implements nAryMaterialRelation
{
  /**
   * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedFrom()
   * @generated
   * @ordered
   */
  protected RelatorUniversal derivedFrom;

  /**
   * The cached value of the '{@link #getTargetRelata() <em>Target Relata</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetRelata()
   * @generated
   * @ordered
   */
  protected EList<ExternallyDependentUniversal> targetRelata;

  /**
   * The cached value of the '{@link #getTargetEndNames() <em>Target End Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetEndNames()
   * @generated
   * @ordered
   */
  protected EList<String> targetEndNames;

  /**
   * The cached value of the '{@link #getSourceLowerBound() <em>Source Lower Bound</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLowerBound()
   * @generated
   * @ordered
   */
  protected EList<Integer> sourceLowerBound;

  /**
   * The cached value of the '{@link #getSourceUpperBound() <em>Source Upper Bound</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceUpperBound()
   * @generated
   * @ordered
   */
  protected EList<Integer> sourceUpperBound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected nAryMaterialRelationImpl()
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
    return PrimeOntoUMLPackage.Literals.NARY_MATERIAL_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelatorUniversal getDerivedFrom()
  {
    if (derivedFrom != null && derivedFrom.eIsProxy())
    {
      InternalEObject oldDerivedFrom = (InternalEObject)derivedFrom;
      derivedFrom = (RelatorUniversal)eResolveProxy(oldDerivedFrom);
      if (derivedFrom != oldDerivedFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__DERIVED_FROM, oldDerivedFrom, derivedFrom));
      }
    }
    return derivedFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelatorUniversal basicGetDerivedFrom()
  {
    return derivedFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDerivedFrom(RelatorUniversal newDerivedFrom)
  {
    RelatorUniversal oldDerivedFrom = derivedFrom;
    derivedFrom = newDerivedFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__DERIVED_FROM, oldDerivedFrom, derivedFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternallyDependentUniversal> getTargetRelata()
  {
    if (targetRelata == null)
    {
      targetRelata = new EObjectResolvingEList<ExternallyDependentUniversal>(ExternallyDependentUniversal.class, this, PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_RELATA);
    }
    return targetRelata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTargetEndNames()
  {
    if (targetEndNames == null)
    {
      targetEndNames = new EDataTypeEList<String>(String.class, this, PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_END_NAMES);
    }
    return targetEndNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getSourceLowerBound()
  {
    if (sourceLowerBound == null)
    {
      sourceLowerBound = new EDataTypeEList<Integer>(Integer.class, this, PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND);
    }
    return sourceLowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getSourceUpperBound()
  {
    if (sourceUpperBound == null)
    {
      sourceUpperBound = new EDataTypeEList<Integer>(Integer.class, this, PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND);
    }
    return sourceUpperBound;
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
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__DERIVED_FROM:
        if (resolve) return getDerivedFrom();
        return basicGetDerivedFrom();
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_RELATA:
        return getTargetRelata();
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_END_NAMES:
        return getTargetEndNames();
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND:
        return getSourceLowerBound();
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND:
        return getSourceUpperBound();
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
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__DERIVED_FROM:
        setDerivedFrom((RelatorUniversal)newValue);
        return;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_RELATA:
        getTargetRelata().clear();
        getTargetRelata().addAll((Collection<? extends ExternallyDependentUniversal>)newValue);
        return;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_END_NAMES:
        getTargetEndNames().clear();
        getTargetEndNames().addAll((Collection<? extends String>)newValue);
        return;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND:
        getSourceLowerBound().clear();
        getSourceLowerBound().addAll((Collection<? extends Integer>)newValue);
        return;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND:
        getSourceUpperBound().clear();
        getSourceUpperBound().addAll((Collection<? extends Integer>)newValue);
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
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__DERIVED_FROM:
        setDerivedFrom((RelatorUniversal)null);
        return;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_RELATA:
        getTargetRelata().clear();
        return;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_END_NAMES:
        getTargetEndNames().clear();
        return;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND:
        getSourceLowerBound().clear();
        return;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND:
        getSourceUpperBound().clear();
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
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__DERIVED_FROM:
        return derivedFrom != null;
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_RELATA:
        return targetRelata != null && !targetRelata.isEmpty();
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__TARGET_END_NAMES:
        return targetEndNames != null && !targetEndNames.isEmpty();
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND:
        return sourceLowerBound != null && !sourceLowerBound.isEmpty();
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND:
        return sourceUpperBound != null && !sourceUpperBound.isEmpty();
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
    result.append(" (targetEndNames: ");
    result.append(targetEndNames);
    result.append(", sourceLowerBound: ");
    result.append(sourceLowerBound);
    result.append(", sourceUpperBound: ");
    result.append(sourceUpperBound);
    result.append(')');
    return result.toString();
  }

} //nAryMaterialRelationImpl
