/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getIsOfType <em>Is Of Type</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getComplexDataType <em>Complex Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getDataTypeAttribute()
 * @model
 * @generated
 */
public interface DataTypeAttribute extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Is Of Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Of Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Of Type</em>' reference.
   * @see #setIsOfType(DataType)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getDataTypeAttribute_IsOfType()
   * @model required="true"
   * @generated
   */
  DataType getIsOfType();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getIsOfType <em>Is Of Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Of Type</em>' reference.
   * @see #getIsOfType()
   * @generated
   */
  void setIsOfType(DataType value);

  /**
   * Returns the value of the '<em><b>Complex Data Type</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complex Data Type</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complex Data Type</em>' container reference.
   * @see #setComplexDataType(ComplexDataType)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getDataTypeAttribute_ComplexDataType()
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType#getAttributes
   * @model opposite="attributes" required="true" transient="false"
   * @generated
   */
  ComplexDataType getComplexDataType();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getComplexDataType <em>Complex Data Type</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Complex Data Type</em>' container reference.
   * @see #getComplexDataType()
   * @generated
   */
  void setComplexDataType(ComplexDataType value);

} // DataTypeAttribute
