/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getIsSpecializedVia <em>Is Specialized Via</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getSpecializesVia <em>Specializes Via</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getUniversal()
 * @model abstract="true"
 * @generated
 */
public interface Universal extends NamedElement, PackageableElement
{
  /**
   * Returns the value of the '<em><b>Is Specialized Via</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet}.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializedUniversal <em>Specialized Universal</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Specialized Via</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Specialized Via</em>' reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getUniversal_IsSpecializedVia()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializedUniversal
   * @model opposite="specializedUniversal" transient="true" ordered="false"
   * @generated
   */
  EList<GeneralizationSet> getIsSpecializedVia();

  /**
   * Returns the value of the '<em><b>Specializes Via</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet}.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializingUniversals <em>Specializing Universals</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specializes Via</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specializes Via</em>' reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getUniversal_SpecializesVia()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializingUniversals
   * @model opposite="specializingUniversals" transient="true" ordered="false"
   * @generated
   */
  EList<GeneralizationSet> getSpecializesVia();

} // Universal
