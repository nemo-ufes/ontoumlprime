/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>nAry Formal Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getTargetRelata <em>Target Relata</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getTargetEndNames <em>Target End Names</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryFormalRelation()
 * @model
 * @generated
 */
public interface nAryFormalRelation extends NamedElement, PackageableElement
{
  /**
   * Returns the value of the '<em><b>Target Relata</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Relata</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Relata</em>' reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryFormalRelation_TargetRelata()
   * @model
   * @generated
   */
  EList<Universal> getTargetRelata();

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
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryFormalRelation_TargetEndNames()
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
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryFormalRelation_SourceLowerBound()
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
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getnAryFormalRelation_SourceUpperBound()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getSourceUpperBound();

} // nAryFormalRelation
