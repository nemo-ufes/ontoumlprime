/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Externally Dependent Universal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal#getMediation <em>Mediation</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getExternallyDependentUniversal()
 * @model abstract="true"
 * @generated
 */
public interface ExternallyDependentUniversal extends EObject
{
  /**
   * Returns the value of the '<em><b>Mediation</b></em>' reference.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mediation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mediation</em>' reference.
   * @see #setMediation(Mediation)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getExternallyDependentUniversal_Mediation()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getTarget
   * @model opposite="target" required="true"
   * @generated
   */
  Mediation getMediation();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal#getMediation <em>Mediation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mediation</em>' reference.
   * @see #getMediation()
   * @generated
   */
  void setMediation(Mediation value);

} // ExternallyDependentUniversal
