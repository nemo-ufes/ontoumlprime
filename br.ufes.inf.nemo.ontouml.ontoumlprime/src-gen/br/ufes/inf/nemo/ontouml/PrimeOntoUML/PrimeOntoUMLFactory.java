/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage
 * @generated
 */
public interface PrimeOntoUMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PrimeOntoUMLFactory eINSTANCE = br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Generalization Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generalization Set</em>'.
   * @generated
   */
  GeneralizationSet createGeneralizationSet();

  /**
   * Returns a new object of class '<em>Primitive Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Data Type</em>'.
   * @generated
   */
  PrimitiveDataType createPrimitiveDataType();

  /**
   * Returns a new object of class '<em>Complex Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Data Type</em>'.
   * @generated
   */
  ComplexDataType createComplexDataType();

  /**
   * Returns a new object of class '<em>Data Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Attribute</em>'.
   * @generated
   */
  DataTypeAttribute createDataTypeAttribute();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Component Of Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Of Relation</em>'.
   * @generated
   */
  ComponentOfRelation createComponentOfRelation();

  /**
   * Returns a new object of class '<em>Membership Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Membership Relation</em>'.
   * @generated
   */
  MembershipRelation createMembershipRelation();

  /**
   * Returns a new object of class '<em>Sub Collection Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Collection Relation</em>'.
   * @generated
   */
  SubCollectionRelation createSubCollectionRelation();

  /**
   * Returns a new object of class '<em>Sub Quantity Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Quantity Relation</em>'.
   * @generated
   */
  SubQuantityRelation createSubQuantityRelation();

  /**
   * Returns a new object of class '<em>Kind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kind</em>'.
   * @generated
   */
  Kind createKind();

  /**
   * Returns a new object of class '<em>Quantity Universal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantity Universal</em>'.
   * @generated
   */
  QuantityUniversal createQuantityUniversal();

  /**
   * Returns a new object of class '<em>Collective Universal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collective Universal</em>'.
   * @generated
   */
  CollectiveUniversal createCollectiveUniversal();

  /**
   * Returns a new object of class '<em>Sub Kind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Kind</em>'.
   * @generated
   */
  SubKind createSubKind();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phase</em>'.
   * @generated
   */
  Phase createPhase();

  /**
   * Returns a new object of class '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Category</em>'.
   * @generated
   */
  Category createCategory();

  /**
   * Returns a new object of class '<em>Mixin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mixin</em>'.
   * @generated
   */
  Mixin createMixin();

  /**
   * Returns a new object of class '<em>Role Mixin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Mixin</em>'.
   * @generated
   */
  RoleMixin createRoleMixin();

  /**
   * Returns a new object of class '<em>Relator Universal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relator Universal</em>'.
   * @generated
   */
  RelatorUniversal createRelatorUniversal();

  /**
   * Returns a new object of class '<em>Binary Material Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Material Relation</em>'.
   * @generated
   */
  BinaryMaterialRelation createBinaryMaterialRelation();

  /**
   * Returns a new object of class '<em>Binary Formal Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Formal Relation</em>'.
   * @generated
   */
  BinaryFormalRelation createBinaryFormalRelation();

  /**
   * Returns a new object of class '<em>Mediation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mediation</em>'.
   * @generated
   */
  Mediation createMediation();

  /**
   * Returns a new object of class '<em>Characterization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Characterization</em>'.
   * @generated
   */
  Characterization createCharacterization();

  /**
   * Returns a new object of class '<em>Mode Universal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mode Universal</em>'.
   * @generated
   */
  ModeUniversal createModeUniversal();

  /**
   * Returns a new object of class '<em>Quality Universal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quality Universal</em>'.
   * @generated
   */
  QualityUniversal createQualityUniversal();

  /**
   * Returns a new object of class '<em>nAry Material Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nAry Material Relation</em>'.
   * @generated
   */
  nAryMaterialRelation createnAryMaterialRelation();

  /**
   * Returns a new object of class '<em>nAry Formal Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nAry Formal Relation</em>'.
   * @generated
   */
  nAryFormalRelation createnAryFormalRelation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PrimeOntoUMLPackage getPrimeOntoUMLPackage();

} //PrimeOntoUMLFactory
