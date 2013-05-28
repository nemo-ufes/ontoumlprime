/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relator Universal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal#getMediations <em>Mediations</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getRelatorUniversal()
 * @model
 * @generated
 */
public interface RelatorUniversal extends MomentUniversal
{
  /**
   * Returns the value of the '<em><b>Mediations</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation}.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mediations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mediations</em>' containment reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getRelatorUniversal_Mediations()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getSource
   * @model opposite="source" containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<Mediation> getMediations();

} // RelatorUniversal
