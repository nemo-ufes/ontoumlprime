/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>nAry Formal Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryFormalRelationImpl#getTargetRelata <em>Target Relata</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryFormalRelationImpl#getTargetEndNames <em>Target End Names</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryFormalRelationImpl#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryFormalRelationImpl#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class nAryFormalRelationImpl extends NamedElementImpl implements nAryFormalRelation
{
  /**
   * The cached value of the '{@link #getTargetRelata() <em>Target Relata</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetRelata()
   * @generated
   * @ordered
   */
  protected EList<Universal> targetRelata;

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
  protected nAryFormalRelationImpl()
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
    return PrimeOntoUMLPackage.Literals.NARY_FORMAL_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Universal> getTargetRelata()
  {
    if (targetRelata == null)
    {
      targetRelata = new EObjectResolvingEList<Universal>(Universal.class, this, PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_RELATA);
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
      targetEndNames = new EDataTypeEList<String>(String.class, this, PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_END_NAMES);
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
      sourceLowerBound = new EDataTypeEList<Integer>(Integer.class, this, PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_LOWER_BOUND);
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
      sourceUpperBound = new EDataTypeEList<Integer>(Integer.class, this, PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_UPPER_BOUND);
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
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_RELATA:
        return getTargetRelata();
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_END_NAMES:
        return getTargetEndNames();
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_LOWER_BOUND:
        return getSourceLowerBound();
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_UPPER_BOUND:
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
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_RELATA:
        getTargetRelata().clear();
        getTargetRelata().addAll((Collection<? extends Universal>)newValue);
        return;
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_END_NAMES:
        getTargetEndNames().clear();
        getTargetEndNames().addAll((Collection<? extends String>)newValue);
        return;
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_LOWER_BOUND:
        getSourceLowerBound().clear();
        getSourceLowerBound().addAll((Collection<? extends Integer>)newValue);
        return;
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_UPPER_BOUND:
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
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_RELATA:
        getTargetRelata().clear();
        return;
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_END_NAMES:
        getTargetEndNames().clear();
        return;
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_LOWER_BOUND:
        getSourceLowerBound().clear();
        return;
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_UPPER_BOUND:
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
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_RELATA:
        return targetRelata != null && !targetRelata.isEmpty();
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__TARGET_END_NAMES:
        return targetEndNames != null && !targetEndNames.isEmpty();
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_LOWER_BOUND:
        return sourceLowerBound != null && !sourceLowerBound.isEmpty();
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION__SOURCE_UPPER_BOUND:
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

} //nAryFormalRelationImpl
