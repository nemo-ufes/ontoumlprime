/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getComplexDataType()
 * @model
 * @generated
 */
public interface ComplexDataType extends UserDefinedDataType
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute}.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getComplexDataType <em>Complex Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getComplexDataType_Attributes()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getComplexDataType
   * @model opposite="complexDataType" containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<DataTypeAttribute> getAttributes();

} // ComplexDataType
