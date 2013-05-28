/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This file specifies the OntoUMLPrime metamodel.
 * 
 * The purpose of this is to reimplement a metamodel for OntoUML that is independent of the UML.
 * The previous OntoUML metamodel implementation by Carraretto was based on the UML 2.0 implementation
 * in Eclipse. This means that it is too polluted with UML constraints. Strictly speaking this is not
 * UML anymore (so OntoUMLPrime is strictly speaking a misnomer).
 * 
 * We have used the Xcore syntax. If you want to export a genmodel and ecore model from it, this can be done by following the steps in:
 * http://wiki.eclipse.org/Xcore#Converting_an_Xcore_Model_to_a_GenModel
 * This is not necessary if you just want to create dynamic instances of the model, and if you want to generate code, as it is generated
 * automatically when you save the xcore file. However, this is necessary to use the OCL constraints in ontoumlprime.ocl, as that refers
 * to the ecore and not the xcore file, and also to use tools that depend on ecore (diagramming tool, xtext).
 * 
 * If you create a genmodel/ecore, make sure you do not generate code from the genmodel. The code is already produced at src-gen
 * when the xcore file is saved.
 * 
 * History:
 * created by Jo��o Paulo A. Almeida
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#getModel_Elements()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<PackageableElement> getElements();

} // Model
