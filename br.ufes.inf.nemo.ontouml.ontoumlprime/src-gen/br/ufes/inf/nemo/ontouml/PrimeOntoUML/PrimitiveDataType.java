/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType#get_type <em>type</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends DataType
{
  /**
   * Returns the value of the '<em><b>type</b></em>' attribute.
   * The literals are from the enumeration {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>type</em>' attribute.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType
   * @see #set_type(PrimitiveDataTypeType)
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getPrimitiveDataType__type()
   * @model unique="false" required="true"
   * @generated
   */
  PrimitiveDataTypeType get_type();

  /**
   * Sets the value of the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType#get_type <em>type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>type</em>' attribute.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType
   * @see #get_type()
   * @generated
   */
  void set_type(PrimitiveDataTypeType value);

} // PrimitiveDataType
