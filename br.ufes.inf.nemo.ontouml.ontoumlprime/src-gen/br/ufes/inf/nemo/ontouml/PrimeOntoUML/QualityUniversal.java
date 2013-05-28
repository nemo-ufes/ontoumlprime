/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Universal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getQualityUniversal()
 * @model
 * @generated
 */
public interface QualityUniversal extends IntrinsicMomentUniversal
{
  /**
   * Returns the value of the '<em><b>Datatypes</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatypes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatypes</em>' reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getQualityUniversal_Datatypes()
   * @model ordered="false"
   * @generated
   */
  EList<DataType> getDatatypes();

} // QualityUniversal
