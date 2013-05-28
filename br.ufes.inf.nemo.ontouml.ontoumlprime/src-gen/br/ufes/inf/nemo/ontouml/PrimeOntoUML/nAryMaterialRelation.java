/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>nAry Material Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getTargetRelata <em>Target Relata</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getTargetEndNames <em>Target End Names</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryMaterialRelation()
 * @model
 * @generated
 */
public interface nAryMaterialRelation extends NamedElement, PackageableElement
{
  /**
   * Returns the value of the '<em><b>Derived From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Derived From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Derived From</em>' reference.
   * @see #setDerivedFrom(RelatorUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryMaterialRelation_DerivedFrom()
   * @model required="true"
   * @generated
   */
  RelatorUniversal getDerivedFrom();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getDerivedFrom <em>Derived From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Derived From</em>' reference.
   * @see #getDerivedFrom()
   * @generated
   */
  void setDerivedFrom(RelatorUniversal value);

  /**
   * Returns the value of the '<em><b>Target Relata</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Relata</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Relata</em>' reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryMaterialRelation_TargetRelata()
   * @model
   * @generated
   */
  EList<ExternallyDependentUniversal> getTargetRelata();

  /**
   * Returns the value of the '<em><b>Target End Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target End Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target End Names</em>' attribute list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryMaterialRelation_TargetEndNames()
   * @model unique="false"
   * @generated
   */
  EList<String> getTargetEndNames();

  /**
   * Returns the value of the '<em><b>Source Lower Bound</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Lower Bound</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Lower Bound</em>' attribute list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryMaterialRelation_SourceLowerBound()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getSourceLowerBound();

  /**
   * Returns the value of the '<em><b>Source Upper Bound</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Upper Bound</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Upper Bound</em>' attribute list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryMaterialRelation_SourceUpperBound()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getSourceUpperBound();

} // nAryMaterialRelation
