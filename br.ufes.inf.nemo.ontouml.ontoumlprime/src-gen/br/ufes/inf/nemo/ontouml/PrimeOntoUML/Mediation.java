/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getSource <em>Source</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMediation()
 * @model
 * @generated
 */
public interface Mediation extends BinaryDirectedRelationship
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal#getMediations <em>Mediations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' container reference.
   * @see #setSource(RelatorUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMediation_Source()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal#getMediations
   * @model opposite="mediations" required="true" transient="false"
   * @generated
   */
  RelatorUniversal getSource();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getSource <em>Source</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' container reference.
   * @see #getSource()
   * @generated
   */
  void setSource(RelatorUniversal value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal#getMediation <em>Mediation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ExternallyDependentUniversal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getMediation_Target()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal#getMediation
   * @model opposite="mediation" required="true"
   * @generated
   */
  ExternallyDependentUniversal getTarget();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ExternallyDependentUniversal value);

} // Mediation
