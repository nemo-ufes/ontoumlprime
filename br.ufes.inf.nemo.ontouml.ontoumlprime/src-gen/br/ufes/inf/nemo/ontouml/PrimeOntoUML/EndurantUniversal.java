/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endurant Universal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal#getCharacterizedBy <em>Characterized By</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getEndurantUniversal()
 * @model abstract="true"
 * @generated
 */
public interface EndurantUniversal extends Universal
{
  /**
   * Returns the value of the '<em><b>Characterized By</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization}.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Characterized By</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characterized By</em>' containment reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getEndurantUniversal_CharacterizedBy()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getSource
   * @model opposite="source" containment="true" ordered="false"
   * @generated
   */
  EList<Characterization> getCharacterizedBy();

} // EndurantUniversal
