/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intrinsic Moment Universal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal#getCharacterization <em>Characterization</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getIntrinsicMomentUniversal()
 * @model abstract="true"
 * @generated
 */
public interface IntrinsicMomentUniversal extends MomentUniversal
{
  /**
   * Returns the value of the '<em><b>Characterization</b></em>' reference.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Characterization</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characterization</em>' reference.
   * @see #setCharacterization(Characterization)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getIntrinsicMomentUniversal_Characterization()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getTarget
   * @model opposite="target" required="true"
   * @generated
   */
  Characterization getCharacterization();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal#getCharacterization <em>Characterization</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Characterization</em>' reference.
   * @see #getCharacterization()
   * @generated
   */
  void setCharacterization(Characterization value);

} // IntrinsicMomentUniversal
