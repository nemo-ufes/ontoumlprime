/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceEndName <em>Source End Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetEndName <em>Target End Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetLowerBound <em>Target Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetUpperBound <em>Target Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface BinaryDirectedRelationship extends EObject
{
  /**
   * Returns the value of the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source End Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source End Name</em>' attribute.
   * @see #setSourceEndName(String)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryDirectedRelationship_SourceEndName()
   * @model unique="false"
   * @generated
   */
  String getSourceEndName();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceEndName <em>Source End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source End Name</em>' attribute.
   * @see #getSourceEndName()
   * @generated
   */
  void setSourceEndName(String value);

  /**
   * Returns the value of the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Lower Bound</em>' attribute.
   * @see #setSourceLowerBound(int)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryDirectedRelationship_SourceLowerBound()
   * @model unique="false" required="true"
   * @generated
   */
  int getSourceLowerBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceLowerBound <em>Source Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Lower Bound</em>' attribute.
   * @see #getSourceLowerBound()
   * @generated
   */
  void setSourceLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Upper Bound</em>' attribute.
   * @see #setSourceUpperBound(int)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryDirectedRelationship_SourceUpperBound()
   * @model unique="false" required="true"
   * @generated
   */
  int getSourceUpperBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceUpperBound <em>Source Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Upper Bound</em>' attribute.
   * @see #getSourceUpperBound()
   * @generated
   */
  void setSourceUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target End Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target End Name</em>' attribute.
   * @see #setTargetEndName(String)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryDirectedRelationship_TargetEndName()
   * @model unique="false"
   * @generated
   */
  String getTargetEndName();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetEndName <em>Target End Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target End Name</em>' attribute.
   * @see #getTargetEndName()
   * @generated
   */
  void setTargetEndName(String value);

  /**
   * Returns the value of the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Lower Bound</em>' attribute.
   * @see #setTargetLowerBound(int)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryDirectedRelationship_TargetLowerBound()
   * @model unique="false" required="true"
   * @generated
   */
  int getTargetLowerBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetLowerBound <em>Target Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Lower Bound</em>' attribute.
   * @see #getTargetLowerBound()
   * @generated
   */
  void setTargetLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Upper Bound</em>' attribute.
   * @see #setTargetUpperBound(int)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryDirectedRelationship_TargetUpperBound()
   * @model unique="false" required="true"
   * @generated
   */
  int getTargetUpperBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetUpperBound <em>Target Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Upper Bound</em>' attribute.
   * @see #getTargetUpperBound()
   * @generated
   */
  void setTargetUpperBound(int value);

} // BinaryDirectedRelationship
