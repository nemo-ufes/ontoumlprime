/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializedUniversal <em>Specialized Universal</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializingUniversals <em>Specializing Universals</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet extends NamedElement, PackageableElement
{
  /**
   * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Covering</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Covering</em>' attribute.
   * @see #setIsCovering(boolean)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getGeneralizationSet_IsCovering()
   * @model unique="false"
   * @generated
   */
  boolean isIsCovering();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#isIsCovering <em>Is Covering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Covering</em>' attribute.
   * @see #isIsCovering()
   * @generated
   */
  void setIsCovering(boolean value);

  /**
   * Returns the value of the '<em><b>Specialized Universal</b></em>' reference.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getIsSpecializedVia <em>Is Specialized Via</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specialized Universal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specialized Universal</em>' reference.
   * @see #setSpecializedUniversal(Universal)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getGeneralizationSet_SpecializedUniversal()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getIsSpecializedVia
   * @model opposite="isSpecializedVia" resolveProxies="false" required="true"
   * @generated
   */
  Universal getSpecializedUniversal();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializedUniversal <em>Specialized Universal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specialized Universal</em>' reference.
   * @see #getSpecializedUniversal()
   * @generated
   */
  void setSpecializedUniversal(Universal value);

  /**
   * Returns the value of the '<em><b>Specializing Universals</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal}.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getSpecializesVia <em>Specializes Via</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specializing Universals</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specializing Universals</em>' reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getGeneralizationSet_SpecializingUniversals()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getSpecializesVia
   * @model opposite="specializesVia" resolveProxies="false" required="true" ordered="false"
   * @generated
   */
  EList<Universal> getSpecializingUniversals();

} // GeneralizationSet
