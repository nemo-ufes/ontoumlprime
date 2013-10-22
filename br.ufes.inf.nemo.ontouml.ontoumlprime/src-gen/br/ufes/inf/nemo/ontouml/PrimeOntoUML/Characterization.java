/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characterization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getSource <em>Source</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getCharacterization()
 * @model
 * @generated
 */
public interface Characterization extends BinaryDirectedRelationship
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal#getCharacterizedBy <em>Characterized By</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' container reference.
   * @see #setSource(EndurantUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getCharacterization_Source()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal#getCharacterizedBy
   * @model opposite="characterizedBy" required="true" transient="false"
   * @generated
   */
  EndurantUniversal getSource();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getSource <em>Source</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' container reference.
   * @see #getSource()
   * @generated
   */
  void setSource(EndurantUniversal value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal#getCharacterization <em>Characterization</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(IntrinsicMomentUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getCharacterization_Target()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal#getCharacterization
   * @model opposite="characterization" required="true"
   * @generated
   */
  IntrinsicMomentUniversal getTarget();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(IntrinsicMomentUniversal value);

} // Characterization
