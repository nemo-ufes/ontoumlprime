/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Material Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getSource <em>Source</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryMaterialRelation()
 * @model
 * @generated
 */
public interface BinaryMaterialRelation extends BinaryDirectedRelationship, NamedElement, PackageableElement
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
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryMaterialRelation_DerivedFrom()
   * @model required="true"
   * @generated
   */
  RelatorUniversal getDerivedFrom();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getDerivedFrom <em>Derived From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Derived From</em>' reference.
   * @see #getDerivedFrom()
   * @generated
   */
  void setDerivedFrom(RelatorUniversal value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(ExternallyDependentUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryMaterialRelation_Source()
   * @model required="true"
   * @generated
   */
  ExternallyDependentUniversal getSource();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ExternallyDependentUniversal value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ExternallyDependentUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getBinaryMaterialRelation_Target()
   * @model required="true"
   * @generated
   */
  ExternallyDependentUniversal getTarget();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ExternallyDependentUniversal value);

} // BinaryMaterialRelation
