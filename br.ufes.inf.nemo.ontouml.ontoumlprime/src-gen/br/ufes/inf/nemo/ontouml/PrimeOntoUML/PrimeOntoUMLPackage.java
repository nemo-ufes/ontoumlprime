/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='br.ufes.inf.nemo.ontouml' testsDirectory='/br.ufes.inf.nemo.ontouml.ontoumlprime.tests/src-gen' editDirectory='/br.ufes.inf.nemo.ontouml.ontoumlprime.edit/src-gen' editorDirectory='/br.ufes.inf.nemo.ontouml.ontoumlprime.editor/src-gen' fileExtensions='pouml'"
 * @generated
 */
public interface PrimeOntoUMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "PrimeOntoUML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://nemo.inf.ufes.br/ontouml/ontoumlprime";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ontouml-prime";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PrimeOntoUMLPackage eINSTANCE = br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl.init();

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModelImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ElementImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PackageableElementImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPackageableElement()
   * @generated
   */
  int PACKAGEABLE_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Packageable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGEABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Packageable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGEABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.NamedElementImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PackageImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UniversalImpl <em>Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getUniversal()
   * @generated
   */
  int UNIVERSAL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL__IS_SPECIALIZED_VIA = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL__SPECIALIZES_VIA = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIVERSAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.GeneralizationSetImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getGeneralizationSet()
   * @generated
   */
  int GENERALIZATION_SET = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_SET__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Is Covering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_SET__IS_COVERING = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Specialized Universal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_SET__SPECIALIZED_UNIVERSAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Specializing Universals</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_SET__SPECIALIZING_UNIVERSALS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Generalization Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_SET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Generalization Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_SET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimitiveDataTypeImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPrimitiveDataType()
   * @generated
   */
  int PRIMITIVE_DATA_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Primitive Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UserDefinedDataTypeImpl <em>User Defined Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UserDefinedDataTypeImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getUserDefinedDataType()
   * @generated
   */
  int USER_DEFINED_DATA_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_DATA_TYPE__NAME = DATA_TYPE__NAME;

  /**
   * The number of structural features of the '<em>User Defined Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>User Defined Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComplexDataTypeImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getComplexDataType()
   * @generated
   */
  int COMPLEX_DATA_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_DATA_TYPE__NAME = USER_DEFINED_DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_DATA_TYPE__ATTRIBUTES = USER_DEFINED_DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_DATA_TYPE_FEATURE_COUNT = USER_DEFINED_DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Complex Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_DATA_TYPE_OPERATION_COUNT = USER_DEFINED_DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeAttributeImpl <em>Data Type Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeAttributeImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getDataTypeAttribute()
   * @generated
   */
  int DATA_TYPE_ATTRIBUTE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Is Of Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_ATTRIBUTE__IS_OF_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Complex Data Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Data Type Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EnumerationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = USER_DEFINED_DATA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Enumeration Literals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ENUMERATION_LITERALS = USER_DEFINED_DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = USER_DEFINED_DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_OPERATION_COUNT = USER_DEFINED_DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl <em>Meronymic Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMeronymicRelation()
   * @generated
   */
  int MERONYMIC_RELATION = 13;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__SOURCE_END_NAME = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__TARGET_END_NAME = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__SOURCE_LOWER_BOUND = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__SOURCE_UPPER_BOUND = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__TARGET_LOWER_BOUND = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__TARGET_UPPER_BOUND = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Whole</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__WHOLE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__PART = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Part Is Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__PART_IS_ESSENTIAL = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Part Is Inseparable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__PART_IS_INSEPARABLE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Part Is Shareable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__PART_IS_SHAREABLE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Part Is Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION__PART_IS_IMMUTABLE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Meronymic Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The number of operations of the '<em>Meronymic Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERONYMIC_RELATION_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComponentOfRelationImpl <em>Component Of Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComponentOfRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getComponentOfRelation()
   * @generated
   */
  int COMPONENT_OF_RELATION = 14;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__SOURCE_END_NAME = MERONYMIC_RELATION__SOURCE_END_NAME;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__TARGET_END_NAME = MERONYMIC_RELATION__TARGET_END_NAME;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__SOURCE_LOWER_BOUND = MERONYMIC_RELATION__SOURCE_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__SOURCE_UPPER_BOUND = MERONYMIC_RELATION__SOURCE_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__TARGET_LOWER_BOUND = MERONYMIC_RELATION__TARGET_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__TARGET_UPPER_BOUND = MERONYMIC_RELATION__TARGET_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Whole</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__WHOLE = MERONYMIC_RELATION__WHOLE;

  /**
   * The feature id for the '<em><b>Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__PART = MERONYMIC_RELATION__PART;

  /**
   * The feature id for the '<em><b>Part Is Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__PART_IS_ESSENTIAL = MERONYMIC_RELATION__PART_IS_ESSENTIAL;

  /**
   * The feature id for the '<em><b>Part Is Inseparable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__PART_IS_INSEPARABLE = MERONYMIC_RELATION__PART_IS_INSEPARABLE;

  /**
   * The feature id for the '<em><b>Part Is Shareable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__PART_IS_SHAREABLE = MERONYMIC_RELATION__PART_IS_SHAREABLE;

  /**
   * The feature id for the '<em><b>Part Is Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION__PART_IS_IMMUTABLE = MERONYMIC_RELATION__PART_IS_IMMUTABLE;

  /**
   * The number of structural features of the '<em>Component Of Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION_FEATURE_COUNT = MERONYMIC_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Component Of Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_OF_RELATION_OPERATION_COUNT = MERONYMIC_RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MembershipRelationImpl <em>Membership Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MembershipRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMembershipRelation()
   * @generated
   */
  int MEMBERSHIP_RELATION = 15;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__SOURCE_END_NAME = MERONYMIC_RELATION__SOURCE_END_NAME;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__TARGET_END_NAME = MERONYMIC_RELATION__TARGET_END_NAME;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__SOURCE_LOWER_BOUND = MERONYMIC_RELATION__SOURCE_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__SOURCE_UPPER_BOUND = MERONYMIC_RELATION__SOURCE_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__TARGET_LOWER_BOUND = MERONYMIC_RELATION__TARGET_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__TARGET_UPPER_BOUND = MERONYMIC_RELATION__TARGET_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Whole</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__WHOLE = MERONYMIC_RELATION__WHOLE;

  /**
   * The feature id for the '<em><b>Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__PART = MERONYMIC_RELATION__PART;

  /**
   * The feature id for the '<em><b>Part Is Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__PART_IS_ESSENTIAL = MERONYMIC_RELATION__PART_IS_ESSENTIAL;

  /**
   * The feature id for the '<em><b>Part Is Inseparable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__PART_IS_INSEPARABLE = MERONYMIC_RELATION__PART_IS_INSEPARABLE;

  /**
   * The feature id for the '<em><b>Part Is Shareable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__PART_IS_SHAREABLE = MERONYMIC_RELATION__PART_IS_SHAREABLE;

  /**
   * The feature id for the '<em><b>Part Is Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION__PART_IS_IMMUTABLE = MERONYMIC_RELATION__PART_IS_IMMUTABLE;

  /**
   * The number of structural features of the '<em>Membership Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION_FEATURE_COUNT = MERONYMIC_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Membership Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBERSHIP_RELATION_OPERATION_COUNT = MERONYMIC_RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubCollectionRelationImpl <em>Sub Collection Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubCollectionRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubCollectionRelation()
   * @generated
   */
  int SUB_COLLECTION_RELATION = 16;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__SOURCE_END_NAME = MERONYMIC_RELATION__SOURCE_END_NAME;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__TARGET_END_NAME = MERONYMIC_RELATION__TARGET_END_NAME;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__SOURCE_LOWER_BOUND = MERONYMIC_RELATION__SOURCE_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__SOURCE_UPPER_BOUND = MERONYMIC_RELATION__SOURCE_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__TARGET_LOWER_BOUND = MERONYMIC_RELATION__TARGET_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__TARGET_UPPER_BOUND = MERONYMIC_RELATION__TARGET_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Whole</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__WHOLE = MERONYMIC_RELATION__WHOLE;

  /**
   * The feature id for the '<em><b>Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__PART = MERONYMIC_RELATION__PART;

  /**
   * The feature id for the '<em><b>Part Is Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__PART_IS_ESSENTIAL = MERONYMIC_RELATION__PART_IS_ESSENTIAL;

  /**
   * The feature id for the '<em><b>Part Is Inseparable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__PART_IS_INSEPARABLE = MERONYMIC_RELATION__PART_IS_INSEPARABLE;

  /**
   * The feature id for the '<em><b>Part Is Shareable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__PART_IS_SHAREABLE = MERONYMIC_RELATION__PART_IS_SHAREABLE;

  /**
   * The feature id for the '<em><b>Part Is Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION__PART_IS_IMMUTABLE = MERONYMIC_RELATION__PART_IS_IMMUTABLE;

  /**
   * The number of structural features of the '<em>Sub Collection Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION_FEATURE_COUNT = MERONYMIC_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Sub Collection Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COLLECTION_RELATION_OPERATION_COUNT = MERONYMIC_RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubQuantityRelationImpl <em>Sub Quantity Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubQuantityRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubQuantityRelation()
   * @generated
   */
  int SUB_QUANTITY_RELATION = 17;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__SOURCE_END_NAME = MERONYMIC_RELATION__SOURCE_END_NAME;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__TARGET_END_NAME = MERONYMIC_RELATION__TARGET_END_NAME;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__SOURCE_LOWER_BOUND = MERONYMIC_RELATION__SOURCE_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__SOURCE_UPPER_BOUND = MERONYMIC_RELATION__SOURCE_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__TARGET_LOWER_BOUND = MERONYMIC_RELATION__TARGET_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__TARGET_UPPER_BOUND = MERONYMIC_RELATION__TARGET_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Whole</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__WHOLE = MERONYMIC_RELATION__WHOLE;

  /**
   * The feature id for the '<em><b>Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__PART = MERONYMIC_RELATION__PART;

  /**
   * The feature id for the '<em><b>Part Is Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__PART_IS_ESSENTIAL = MERONYMIC_RELATION__PART_IS_ESSENTIAL;

  /**
   * The feature id for the '<em><b>Part Is Inseparable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__PART_IS_INSEPARABLE = MERONYMIC_RELATION__PART_IS_INSEPARABLE;

  /**
   * The feature id for the '<em><b>Part Is Shareable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__PART_IS_SHAREABLE = MERONYMIC_RELATION__PART_IS_SHAREABLE;

  /**
   * The feature id for the '<em><b>Part Is Immutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION__PART_IS_IMMUTABLE = MERONYMIC_RELATION__PART_IS_IMMUTABLE;

  /**
   * The number of structural features of the '<em>Sub Quantity Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION_FEATURE_COUNT = MERONYMIC_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Sub Quantity Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_QUANTITY_RELATION_OPERATION_COUNT = MERONYMIC_RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EndurantUniversalImpl <em>Endurant Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EndurantUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getEndurantUniversal()
   * @generated
   */
  int ENDURANT_UNIVERSAL = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENDURANT_UNIVERSAL__NAME = UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENDURANT_UNIVERSAL__IS_SPECIALIZED_VIA = UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENDURANT_UNIVERSAL__SPECIALIZES_VIA = UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENDURANT_UNIVERSAL__CHARACTERIZED_BY = UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Endurant Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENDURANT_UNIVERSAL_FEATURE_COUNT = UNIVERSAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Endurant Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENDURANT_UNIVERSAL_OPERATION_COUNT = UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubstantialUniversalImpl <em>Substantial Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubstantialUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubstantialUniversal()
   * @generated
   */
  int SUBSTANTIAL_UNIVERSAL = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANTIAL_UNIVERSAL__NAME = ENDURANT_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANTIAL_UNIVERSAL__IS_SPECIALIZED_VIA = ENDURANT_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANTIAL_UNIVERSAL__SPECIALIZES_VIA = ENDURANT_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANTIAL_UNIVERSAL__CHARACTERIZED_BY = ENDURANT_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Substantial Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANTIAL_UNIVERSAL_FEATURE_COUNT = ENDURANT_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Substantial Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANTIAL_UNIVERSAL_OPERATION_COUNT = ENDURANT_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SortalUniversalImpl <em>Sortal Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SortalUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSortalUniversal()
   * @generated
   */
  int SORTAL_UNIVERSAL = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORTAL_UNIVERSAL__NAME = SUBSTANTIAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA = SUBSTANTIAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORTAL_UNIVERSAL__SPECIALIZES_VIA = SUBSTANTIAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORTAL_UNIVERSAL__CHARACTERIZED_BY = SUBSTANTIAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Sortal Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORTAL_UNIVERSAL_FEATURE_COUNT = SUBSTANTIAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Sortal Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SORTAL_UNIVERSAL_OPERATION_COUNT = SUBSTANTIAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RigidSortalUniversalImpl <em>Rigid Sortal Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RigidSortalUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRigidSortalUniversal()
   * @generated
   */
  int RIGID_SORTAL_UNIVERSAL = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_SORTAL_UNIVERSAL__NAME = SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA = SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_SORTAL_UNIVERSAL__SPECIALIZES_VIA = SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_SORTAL_UNIVERSAL__CHARACTERIZED_BY = SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Rigid Sortal Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_SORTAL_UNIVERSAL_FEATURE_COUNT = SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Rigid Sortal Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_SORTAL_UNIVERSAL_OPERATION_COUNT = SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.AntiRigidSortalUniversalImpl <em>Anti Rigid Sortal Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.AntiRigidSortalUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getAntiRigidSortalUniversal()
   * @generated
   */
  int ANTI_RIGID_SORTAL_UNIVERSAL = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_SORTAL_UNIVERSAL__NAME = SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA = SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_SORTAL_UNIVERSAL__SPECIALIZES_VIA = SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_SORTAL_UNIVERSAL__CHARACTERIZED_BY = SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Anti Rigid Sortal Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_SORTAL_UNIVERSAL_FEATURE_COUNT = SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Anti Rigid Sortal Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_SORTAL_UNIVERSAL_OPERATION_COUNT = SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubstanceSortalUniversalImpl <em>Substance Sortal Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubstanceSortalUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubstanceSortalUniversal()
   * @generated
   */
  int SUBSTANCE_SORTAL_UNIVERSAL = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_SORTAL_UNIVERSAL__NAME = RIGID_SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA = RIGID_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_SORTAL_UNIVERSAL__SPECIALIZES_VIA = RIGID_SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_SORTAL_UNIVERSAL__CHARACTERIZED_BY = RIGID_SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Substance Sortal Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_SORTAL_UNIVERSAL_FEATURE_COUNT = RIGID_SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Substance Sortal Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTANCE_SORTAL_UNIVERSAL_OPERATION_COUNT = RIGID_SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.KindImpl <em>Kind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.KindImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getKind()
   * @generated
   */
  int KIND = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND__NAME = SUBSTANCE_SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND__IS_SPECIALIZED_VIA = SUBSTANCE_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND__SPECIALIZES_VIA = SUBSTANCE_SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND__CHARACTERIZED_BY = SUBSTANCE_SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Kind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_FEATURE_COUNT = SUBSTANCE_SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Kind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_OPERATION_COUNT = SUBSTANCE_SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QuantityUniversalImpl <em>Quantity Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QuantityUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getQuantityUniversal()
   * @generated
   */
  int QUANTITY_UNIVERSAL = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_UNIVERSAL__NAME = SUBSTANCE_SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_UNIVERSAL__IS_SPECIALIZED_VIA = SUBSTANCE_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_UNIVERSAL__SPECIALIZES_VIA = SUBSTANCE_SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_UNIVERSAL__CHARACTERIZED_BY = SUBSTANCE_SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Quantity Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_UNIVERSAL_FEATURE_COUNT = SUBSTANCE_SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Quantity Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_UNIVERSAL_OPERATION_COUNT = SUBSTANCE_SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CollectiveUniversalImpl <em>Collective Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CollectiveUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getCollectiveUniversal()
   * @generated
   */
  int COLLECTIVE_UNIVERSAL = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIVE_UNIVERSAL__NAME = SUBSTANCE_SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIVE_UNIVERSAL__IS_SPECIALIZED_VIA = SUBSTANCE_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIVE_UNIVERSAL__SPECIALIZES_VIA = SUBSTANCE_SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIVE_UNIVERSAL__CHARACTERIZED_BY = SUBSTANCE_SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The feature id for the '<em><b>Is Extensional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIVE_UNIVERSAL__IS_EXTENSIONAL = SUBSTANCE_SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collective Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIVE_UNIVERSAL_FEATURE_COUNT = SUBSTANCE_SORTAL_UNIVERSAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Collective Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIVE_UNIVERSAL_OPERATION_COUNT = SUBSTANCE_SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubKindImpl <em>Sub Kind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubKindImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubKind()
   * @generated
   */
  int SUB_KIND = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_KIND__NAME = RIGID_SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_KIND__IS_SPECIALIZED_VIA = RIGID_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_KIND__SPECIALIZES_VIA = RIGID_SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_KIND__CHARACTERIZED_BY = RIGID_SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Sub Kind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_KIND_FEATURE_COUNT = RIGID_SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Sub Kind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_KIND_OPERATION_COUNT = RIGID_SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRole()
   * @generated
   */
  int ROLE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = ANTI_RIGID_SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__IS_SPECIALIZED_VIA = ANTI_RIGID_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__SPECIALIZES_VIA = ANTI_RIGID_SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__CHARACTERIZED_BY = ANTI_RIGID_SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The feature id for the '<em><b>Mediation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__MEDIATION = ANTI_RIGID_SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = ANTI_RIGID_SORTAL_UNIVERSAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_OPERATION_COUNT = ANTI_RIGID_SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PhaseImpl <em>Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PhaseImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPhase()
   * @generated
   */
  int PHASE = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE__NAME = ANTI_RIGID_SORTAL_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE__IS_SPECIALIZED_VIA = ANTI_RIGID_SORTAL_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE__SPECIALIZES_VIA = ANTI_RIGID_SORTAL_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE__CHARACTERIZED_BY = ANTI_RIGID_SORTAL_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE_FEATURE_COUNT = ANTI_RIGID_SORTAL_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE_OPERATION_COUNT = ANTI_RIGID_SORTAL_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinUniversalImpl <em>Mixin Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMixinUniversal()
   * @generated
   */
  int MIXIN_UNIVERSAL = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN_UNIVERSAL__NAME = UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA = UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN_UNIVERSAL__SPECIALIZES_VIA = UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The number of structural features of the '<em>Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN_UNIVERSAL_FEATURE_COUNT = UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN_UNIVERSAL_OPERATION_COUNT = UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RigidMixinUniversalImpl <em>Rigid Mixin Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RigidMixinUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRigidMixinUniversal()
   * @generated
   */
  int RIGID_MIXIN_UNIVERSAL = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_MIXIN_UNIVERSAL__NAME = MIXIN_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA = MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA = MIXIN_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The number of structural features of the '<em>Rigid Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT = MIXIN_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Rigid Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT = MIXIN_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CategoryImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = RIGID_MIXIN_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__IS_SPECIALIZED_VIA = RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__SPECIALIZES_VIA = RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_OPERATION_COUNT = RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.NonRigidMixinUniversalImpl <em>Non Rigid Mixin Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.NonRigidMixinUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getNonRigidMixinUniversal()
   * @generated
   */
  int NON_RIGID_MIXIN_UNIVERSAL = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_RIGID_MIXIN_UNIVERSAL__NAME = MIXIN_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA = MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA = MIXIN_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The number of structural features of the '<em>Non Rigid Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT = MIXIN_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Non Rigid Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT = MIXIN_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SemiRigidMixinUniversalImpl <em>Semi Rigid Mixin Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SemiRigidMixinUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSemiRigidMixinUniversal()
   * @generated
   */
  int SEMI_RIGID_MIXIN_UNIVERSAL = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMI_RIGID_MIXIN_UNIVERSAL__NAME = NON_RIGID_MIXIN_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMI_RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA = NON_RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMI_RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA = NON_RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The number of structural features of the '<em>Semi Rigid Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMI_RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT = NON_RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Semi Rigid Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEMI_RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT = NON_RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinImpl <em>Mixin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMixin()
   * @generated
   */
  int MIXIN = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN__NAME = SEMI_RIGID_MIXIN_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN__IS_SPECIALIZED_VIA = SEMI_RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN__SPECIALIZES_VIA = SEMI_RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The number of structural features of the '<em>Mixin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN_FEATURE_COUNT = SEMI_RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Mixin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIXIN_OPERATION_COUNT = SEMI_RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.AntiRigidMixinUniversalImpl <em>Anti Rigid Mixin Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.AntiRigidMixinUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getAntiRigidMixinUniversal()
   * @generated
   */
  int ANTI_RIGID_MIXIN_UNIVERSAL = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_MIXIN_UNIVERSAL__NAME = NON_RIGID_MIXIN_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA = NON_RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA = NON_RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The number of structural features of the '<em>Anti Rigid Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT = NON_RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Anti Rigid Mixin Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT = NON_RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleMixinImpl <em>Role Mixin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleMixinImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRoleMixin()
   * @generated
   */
  int ROLE_MIXIN = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MIXIN__NAME = ANTI_RIGID_MIXIN_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MIXIN__IS_SPECIALIZED_VIA = ANTI_RIGID_MIXIN_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MIXIN__SPECIALIZES_VIA = ANTI_RIGID_MIXIN_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Mediation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MIXIN__MEDIATION = ANTI_RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Role Mixin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MIXIN_FEATURE_COUNT = ANTI_RIGID_MIXIN_UNIVERSAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Role Mixin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_MIXIN_OPERATION_COUNT = ANTI_RIGID_MIXIN_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ExternallyDependentUniversalImpl <em>Externally Dependent Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ExternallyDependentUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getExternallyDependentUniversal()
   * @generated
   */
  int EXTERNALLY_DEPENDENT_UNIVERSAL = 38;

  /**
   * The feature id for the '<em><b>Mediation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION = 0;

  /**
   * The number of structural features of the '<em>Externally Dependent Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNALLY_DEPENDENT_UNIVERSAL_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Externally Dependent Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNALLY_DEPENDENT_UNIVERSAL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MomentUniversalImpl <em>Moment Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MomentUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMomentUniversal()
   * @generated
   */
  int MOMENT_UNIVERSAL = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOMENT_UNIVERSAL__NAME = ENDURANT_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOMENT_UNIVERSAL__IS_SPECIALIZED_VIA = ENDURANT_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOMENT_UNIVERSAL__SPECIALIZES_VIA = ENDURANT_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOMENT_UNIVERSAL__CHARACTERIZED_BY = ENDURANT_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The number of structural features of the '<em>Moment Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOMENT_UNIVERSAL_FEATURE_COUNT = ENDURANT_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Moment Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOMENT_UNIVERSAL_OPERATION_COUNT = ENDURANT_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RelatorUniversalImpl <em>Relator Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RelatorUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRelatorUniversal()
   * @generated
   */
  int RELATOR_UNIVERSAL = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATOR_UNIVERSAL__NAME = MOMENT_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATOR_UNIVERSAL__IS_SPECIALIZED_VIA = MOMENT_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATOR_UNIVERSAL__SPECIALIZES_VIA = MOMENT_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATOR_UNIVERSAL__CHARACTERIZED_BY = MOMENT_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The feature id for the '<em><b>Mediations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATOR_UNIVERSAL__MEDIATIONS = MOMENT_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relator Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATOR_UNIVERSAL_FEATURE_COUNT = MOMENT_UNIVERSAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Relator Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATOR_UNIVERSAL_OPERATION_COUNT = MOMENT_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl <em>Binary Directed Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getBinaryDirectedRelationship()
   * @generated
   */
  int BINARY_DIRECTED_RELATIONSHIP = 41;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME = 0;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME = 1;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND = 2;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND = 3;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND = 4;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND = 5;

  /**
   * The number of structural features of the '<em>Binary Directed Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Binary Directed Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_DIRECTED_RELATIONSHIP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl <em>Binary Material Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getBinaryMaterialRelation()
   * @generated
   */
  int BINARY_MATERIAL_RELATION = 42;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__SOURCE_END_NAME = BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__TARGET_END_NAME = BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND = BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND = BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__TARGET_LOWER_BOUND = BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__TARGET_UPPER_BOUND = BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__NAME = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Derived From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__DERIVED_FROM = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__SOURCE = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION__TARGET = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Binary Material Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION_FEATURE_COUNT = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>Binary Material Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_MATERIAL_RELATION_OPERATION_COUNT = BINARY_DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryFormalRelationImpl <em>Binary Formal Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryFormalRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getBinaryFormalRelation()
   * @generated
   */
  int BINARY_FORMAL_RELATION = 43;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__SOURCE_END_NAME = BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__TARGET_END_NAME = BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__SOURCE_LOWER_BOUND = BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__SOURCE_UPPER_BOUND = BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__TARGET_LOWER_BOUND = BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__TARGET_UPPER_BOUND = BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__NAME = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__SOURCE = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION__TARGET = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Formal Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION_FEATURE_COUNT = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Binary Formal Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_FORMAL_RELATION_OPERATION_COUNT = BINARY_DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MediationImpl <em>Mediation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MediationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMediation()
   * @generated
   */
  int MEDIATION = 44;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION__SOURCE_END_NAME = BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION__TARGET_END_NAME = BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION__SOURCE_LOWER_BOUND = BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION__SOURCE_UPPER_BOUND = BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION__TARGET_LOWER_BOUND = BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION__TARGET_UPPER_BOUND = BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Source</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION__SOURCE = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION__TARGET = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mediation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION_FEATURE_COUNT = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Mediation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIATION_OPERATION_COUNT = BINARY_DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CharacterizationImpl <em>Characterization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CharacterizationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getCharacterization()
   * @generated
   */
  int CHARACTERIZATION = 45;

  /**
   * The feature id for the '<em><b>Source End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION__SOURCE_END_NAME = BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME;

  /**
   * The feature id for the '<em><b>Target End Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION__TARGET_END_NAME = BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION__SOURCE_LOWER_BOUND = BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION__SOURCE_UPPER_BOUND = BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION__TARGET_LOWER_BOUND = BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION__TARGET_UPPER_BOUND = BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Source</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION__SOURCE = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION__TARGET = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Characterization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION_FEATURE_COUNT = BINARY_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Characterization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTERIZATION_OPERATION_COUNT = BINARY_DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.IntrinsicMomentUniversalImpl <em>Intrinsic Moment Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.IntrinsicMomentUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getIntrinsicMomentUniversal()
   * @generated
   */
  int INTRINSIC_MOMENT_UNIVERSAL = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_MOMENT_UNIVERSAL__NAME = MOMENT_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_MOMENT_UNIVERSAL__IS_SPECIALIZED_VIA = MOMENT_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_MOMENT_UNIVERSAL__SPECIALIZES_VIA = MOMENT_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZED_BY = MOMENT_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The feature id for the '<em><b>Characterization</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION = MOMENT_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Intrinsic Moment Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_MOMENT_UNIVERSAL_FEATURE_COUNT = MOMENT_UNIVERSAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Intrinsic Moment Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_MOMENT_UNIVERSAL_OPERATION_COUNT = MOMENT_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModeUniversalImpl <em>Mode Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModeUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getModeUniversal()
   * @generated
   */
  int MODE_UNIVERSAL = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_UNIVERSAL__NAME = INTRINSIC_MOMENT_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_UNIVERSAL__IS_SPECIALIZED_VIA = INTRINSIC_MOMENT_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_UNIVERSAL__SPECIALIZES_VIA = INTRINSIC_MOMENT_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_UNIVERSAL__CHARACTERIZED_BY = INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The feature id for the '<em><b>Characterization</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_UNIVERSAL__CHARACTERIZATION = INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION;

  /**
   * The number of structural features of the '<em>Mode Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_UNIVERSAL_FEATURE_COUNT = INTRINSIC_MOMENT_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Mode Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_UNIVERSAL_OPERATION_COUNT = INTRINSIC_MOMENT_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QualityUniversalImpl <em>Quality Universal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QualityUniversalImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getQualityUniversal()
   * @generated
   */
  int QUALITY_UNIVERSAL = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_UNIVERSAL__NAME = INTRINSIC_MOMENT_UNIVERSAL__NAME;

  /**
   * The feature id for the '<em><b>Is Specialized Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_UNIVERSAL__IS_SPECIALIZED_VIA = INTRINSIC_MOMENT_UNIVERSAL__IS_SPECIALIZED_VIA;

  /**
   * The feature id for the '<em><b>Specializes Via</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_UNIVERSAL__SPECIALIZES_VIA = INTRINSIC_MOMENT_UNIVERSAL__SPECIALIZES_VIA;

  /**
   * The feature id for the '<em><b>Characterized By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_UNIVERSAL__CHARACTERIZED_BY = INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZED_BY;

  /**
   * The feature id for the '<em><b>Characterization</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_UNIVERSAL__CHARACTERIZATION = INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION;

  /**
   * The feature id for the '<em><b>Datatypes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_UNIVERSAL__DATATYPES = INTRINSIC_MOMENT_UNIVERSAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quality Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_UNIVERSAL_FEATURE_COUNT = INTRINSIC_MOMENT_UNIVERSAL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Quality Universal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITY_UNIVERSAL_OPERATION_COUNT = INTRINSIC_MOMENT_UNIVERSAL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl <em>nAry Material Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getnAryMaterialRelation()
   * @generated
   */
  int NARY_MATERIAL_RELATION = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_MATERIAL_RELATION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Derived From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_MATERIAL_RELATION__DERIVED_FROM = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Relata</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_MATERIAL_RELATION__TARGET_RELATA = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target End Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_MATERIAL_RELATION__TARGET_END_NAMES = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>nAry Material Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_MATERIAL_RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>nAry Material Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_MATERIAL_RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryFormalRelationImpl <em>nAry Formal Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryFormalRelationImpl
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getnAryFormalRelation()
   * @generated
   */
  int NARY_FORMAL_RELATION = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_FORMAL_RELATION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Target Relata</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_FORMAL_RELATION__TARGET_RELATA = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target End Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_FORMAL_RELATION__TARGET_END_NAMES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Lower Bound</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_FORMAL_RELATION__SOURCE_LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source Upper Bound</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_FORMAL_RELATION__SOURCE_UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>nAry Formal Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_FORMAL_RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>nAry Formal Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_FORMAL_RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType <em>Primitive Data Type Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPrimitiveDataTypeType()
   * @generated
   */
  int PRIMITIVE_DATA_TYPE_TYPE = 51;


  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement <em>Packageable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Packageable Element</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement
   * @generated
   */
  EClass getPackageableElement();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package#getElements()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Elements();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal <em>Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal
   * @generated
   */
  EClass getUniversal();

  /**
   * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getIsSpecializedVia <em>Is Specialized Via</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Is Specialized Via</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getIsSpecializedVia()
   * @see #getUniversal()
   * @generated
   */
  EReference getUniversal_IsSpecializedVia();

  /**
   * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getSpecializesVia <em>Specializes Via</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Specializes Via</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal#getSpecializesVia()
   * @see #getUniversal()
   * @generated
   */
  EReference getUniversal_SpecializesVia();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet <em>Generalization Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generalization Set</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet
   * @generated
   */
  EClass getGeneralizationSet();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#isIsCovering <em>Is Covering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Covering</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#isIsCovering()
   * @see #getGeneralizationSet()
   * @generated
   */
  EAttribute getGeneralizationSet_IsCovering();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializedUniversal <em>Specialized Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Specialized Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializedUniversal()
   * @see #getGeneralizationSet()
   * @generated
   */
  EReference getGeneralizationSet_SpecializedUniversal();

  /**
   * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializingUniversals <em>Specializing Universals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Specializing Universals</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet#getSpecializingUniversals()
   * @see #getGeneralizationSet()
   * @generated
   */
  EReference getGeneralizationSet_SpecializingUniversals();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType <em>Primitive Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Data Type</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType
   * @generated
   */
  EClass getPrimitiveDataType();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType#get_type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>type</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType#get_type()
   * @see #getPrimitiveDataType()
   * @generated
   */
  EAttribute getPrimitiveDataType__type();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.UserDefinedDataType <em>User Defined Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Defined Data Type</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.UserDefinedDataType
   * @generated
   */
  EClass getUserDefinedDataType();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType <em>Complex Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Data Type</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType
   * @generated
   */
  EClass getComplexDataType();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType#getAttributes()
   * @see #getComplexDataType()
   * @generated
   */
  EReference getComplexDataType_Attributes();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute <em>Data Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Attribute</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute
   * @generated
   */
  EClass getDataTypeAttribute();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getIsOfType <em>Is Of Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Is Of Type</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getIsOfType()
   * @see #getDataTypeAttribute()
   * @generated
   */
  EReference getDataTypeAttribute_IsOfType();

  /**
   * Returns the meta object for the container reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getComplexDataType <em>Complex Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Complex Data Type</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute#getComplexDataType()
   * @see #getDataTypeAttribute()
   * @generated
   */
  EReference getDataTypeAttribute_ComplexDataType();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration#getEnumerationLiterals <em>Enumeration Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Enumeration Literals</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration#getEnumerationLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_EnumerationLiterals();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation <em>Meronymic Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meronymic Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation
   * @generated
   */
  EClass getMeronymicRelation();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#getWhole <em>Whole</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Whole</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#getWhole()
   * @see #getMeronymicRelation()
   * @generated
   */
  EReference getMeronymicRelation_Whole();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#getPart <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#getPart()
   * @see #getMeronymicRelation()
   * @generated
   */
  EReference getMeronymicRelation_Part();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsEssential <em>Part Is Essential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part Is Essential</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsEssential()
   * @see #getMeronymicRelation()
   * @generated
   */
  EAttribute getMeronymicRelation_PartIsEssential();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsInseparable <em>Part Is Inseparable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part Is Inseparable</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsInseparable()
   * @see #getMeronymicRelation()
   * @generated
   */
  EAttribute getMeronymicRelation_PartIsInseparable();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsShareable <em>Part Is Shareable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part Is Shareable</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsShareable()
   * @see #getMeronymicRelation()
   * @generated
   */
  EAttribute getMeronymicRelation_PartIsShareable();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsImmutable <em>Part Is Immutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part Is Immutable</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation#isPartIsImmutable()
   * @see #getMeronymicRelation()
   * @generated
   */
  EAttribute getMeronymicRelation_PartIsImmutable();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation <em>Component Of Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Of Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation
   * @generated
   */
  EClass getComponentOfRelation();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation <em>Membership Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Membership Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation
   * @generated
   */
  EClass getMembershipRelation();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation <em>Sub Collection Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Collection Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation
   * @generated
   */
  EClass getSubCollectionRelation();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation <em>Sub Quantity Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Quantity Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation
   * @generated
   */
  EClass getSubQuantityRelation();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal <em>Endurant Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Endurant Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal
   * @generated
   */
  EClass getEndurantUniversal();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal#getCharacterizedBy <em>Characterized By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Characterized By</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal#getCharacterizedBy()
   * @see #getEndurantUniversal()
   * @generated
   */
  EReference getEndurantUniversal_CharacterizedBy();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstantialUniversal <em>Substantial Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substantial Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstantialUniversal
   * @generated
   */
  EClass getSubstantialUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SortalUniversal <em>Sortal Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sortal Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SortalUniversal
   * @generated
   */
  EClass getSortalUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidSortalUniversal <em>Rigid Sortal Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rigid Sortal Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidSortalUniversal
   * @generated
   */
  EClass getRigidSortalUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidSortalUniversal <em>Anti Rigid Sortal Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anti Rigid Sortal Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidSortalUniversal
   * @generated
   */
  EClass getAntiRigidSortalUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstanceSortalUniversal <em>Substance Sortal Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substance Sortal Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstanceSortalUniversal
   * @generated
   */
  EClass getSubstanceSortalUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kind</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind
   * @generated
   */
  EClass getKind();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal <em>Quantity Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantity Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal
   * @generated
   */
  EClass getQuantityUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal <em>Collective Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collective Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal
   * @generated
   */
  EClass getCollectiveUniversal();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal#isIsExtensional <em>Is Extensional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Extensional</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal#isIsExtensional()
   * @see #getCollectiveUniversal()
   * @generated
   */
  EAttribute getCollectiveUniversal_IsExtensional();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind <em>Sub Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Kind</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind
   * @generated
   */
  EClass getSubKind();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phase</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase
   * @generated
   */
  EClass getPhase();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MixinUniversal <em>Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mixin Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MixinUniversal
   * @generated
   */
  EClass getMixinUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidMixinUniversal <em>Rigid Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rigid Mixin Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidMixinUniversal
   * @generated
   */
  EClass getRigidMixinUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.NonRigidMixinUniversal <em>Non Rigid Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Rigid Mixin Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.NonRigidMixinUniversal
   * @generated
   */
  EClass getNonRigidMixinUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SemiRigidMixinUniversal <em>Semi Rigid Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Semi Rigid Mixin Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SemiRigidMixinUniversal
   * @generated
   */
  EClass getSemiRigidMixinUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin <em>Mixin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mixin</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin
   * @generated
   */
  EClass getMixin();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidMixinUniversal <em>Anti Rigid Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anti Rigid Mixin Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidMixinUniversal
   * @generated
   */
  EClass getAntiRigidMixinUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin <em>Role Mixin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Mixin</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin
   * @generated
   */
  EClass getRoleMixin();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal <em>Externally Dependent Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Externally Dependent Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal
   * @generated
   */
  EClass getExternallyDependentUniversal();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal#getMediation <em>Mediation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mediation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal#getMediation()
   * @see #getExternallyDependentUniversal()
   * @generated
   */
  EReference getExternallyDependentUniversal_Mediation();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MomentUniversal <em>Moment Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Moment Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MomentUniversal
   * @generated
   */
  EClass getMomentUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal <em>Relator Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relator Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal
   * @generated
   */
  EClass getRelatorUniversal();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal#getMediations <em>Mediations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mediations</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal#getMediations()
   * @see #getRelatorUniversal()
   * @generated
   */
  EReference getRelatorUniversal_Mediations();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship <em>Binary Directed Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Directed Relationship</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship
   * @generated
   */
  EClass getBinaryDirectedRelationship();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceEndName <em>Source End Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source End Name</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceEndName()
   * @see #getBinaryDirectedRelationship()
   * @generated
   */
  EAttribute getBinaryDirectedRelationship_SourceEndName();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetEndName <em>Target End Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target End Name</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetEndName()
   * @see #getBinaryDirectedRelationship()
   * @generated
   */
  EAttribute getBinaryDirectedRelationship_TargetEndName();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceLowerBound <em>Source Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Lower Bound</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceLowerBound()
   * @see #getBinaryDirectedRelationship()
   * @generated
   */
  EAttribute getBinaryDirectedRelationship_SourceLowerBound();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceUpperBound <em>Source Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Upper Bound</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getSourceUpperBound()
   * @see #getBinaryDirectedRelationship()
   * @generated
   */
  EAttribute getBinaryDirectedRelationship_SourceUpperBound();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetLowerBound <em>Target Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Lower Bound</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetLowerBound()
   * @see #getBinaryDirectedRelationship()
   * @generated
   */
  EAttribute getBinaryDirectedRelationship_TargetLowerBound();

  /**
   * Returns the meta object for the attribute '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetUpperBound <em>Target Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Upper Bound</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship#getTargetUpperBound()
   * @see #getBinaryDirectedRelationship()
   * @generated
   */
  EAttribute getBinaryDirectedRelationship_TargetUpperBound();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation <em>Binary Material Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Material Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation
   * @generated
   */
  EClass getBinaryMaterialRelation();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getDerivedFrom <em>Derived From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Derived From</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getDerivedFrom()
   * @see #getBinaryMaterialRelation()
   * @generated
   */
  EReference getBinaryMaterialRelation_DerivedFrom();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getSource()
   * @see #getBinaryMaterialRelation()
   * @generated
   */
  EReference getBinaryMaterialRelation_Source();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation#getTarget()
   * @see #getBinaryMaterialRelation()
   * @generated
   */
  EReference getBinaryMaterialRelation_Target();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation <em>Binary Formal Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Formal Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation
   * @generated
   */
  EClass getBinaryFormalRelation();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation#getSource()
   * @see #getBinaryFormalRelation()
   * @generated
   */
  EReference getBinaryFormalRelation_Source();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation#getTarget()
   * @see #getBinaryFormalRelation()
   * @generated
   */
  EReference getBinaryFormalRelation_Target();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation <em>Mediation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mediation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation
   * @generated
   */
  EClass getMediation();

  /**
   * Returns the meta object for the container reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Source</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getSource()
   * @see #getMediation()
   * @generated
   */
  EReference getMediation_Source();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation#getTarget()
   * @see #getMediation()
   * @generated
   */
  EReference getMediation_Target();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization <em>Characterization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Characterization</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization
   * @generated
   */
  EClass getCharacterization();

  /**
   * Returns the meta object for the container reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Source</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getSource()
   * @see #getCharacterization()
   * @generated
   */
  EReference getCharacterization_Source();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization#getTarget()
   * @see #getCharacterization()
   * @generated
   */
  EReference getCharacterization_Target();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal <em>Intrinsic Moment Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intrinsic Moment Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal
   * @generated
   */
  EClass getIntrinsicMomentUniversal();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal#getCharacterization <em>Characterization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Characterization</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal#getCharacterization()
   * @see #getIntrinsicMomentUniversal()
   * @generated
   */
  EReference getIntrinsicMomentUniversal_Characterization();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal <em>Mode Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal
   * @generated
   */
  EClass getModeUniversal();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal <em>Quality Universal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quality Universal</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal
   * @generated
   */
  EClass getQualityUniversal();

  /**
   * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal#getDatatypes <em>Datatypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Datatypes</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal#getDatatypes()
   * @see #getQualityUniversal()
   * @generated
   */
  EReference getQualityUniversal_Datatypes();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation <em>nAry Material Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nAry Material Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation
   * @generated
   */
  EClass getnAryMaterialRelation();

  /**
   * Returns the meta object for the reference '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getDerivedFrom <em>Derived From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Derived From</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getDerivedFrom()
   * @see #getnAryMaterialRelation()
   * @generated
   */
  EReference getnAryMaterialRelation_DerivedFrom();

  /**
   * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getTargetRelata <em>Target Relata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target Relata</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getTargetRelata()
   * @see #getnAryMaterialRelation()
   * @generated
   */
  EReference getnAryMaterialRelation_TargetRelata();

  /**
   * Returns the meta object for the attribute list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getTargetEndNames <em>Target End Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Target End Names</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getTargetEndNames()
   * @see #getnAryMaterialRelation()
   * @generated
   */
  EAttribute getnAryMaterialRelation_TargetEndNames();

  /**
   * Returns the meta object for the attribute list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getSourceLowerBound <em>Source Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Source Lower Bound</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getSourceLowerBound()
   * @see #getnAryMaterialRelation()
   * @generated
   */
  EAttribute getnAryMaterialRelation_SourceLowerBound();

  /**
   * Returns the meta object for the attribute list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getSourceUpperBound <em>Source Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Source Upper Bound</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation#getSourceUpperBound()
   * @see #getnAryMaterialRelation()
   * @generated
   */
  EAttribute getnAryMaterialRelation_SourceUpperBound();

  /**
   * Returns the meta object for class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation <em>nAry Formal Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nAry Formal Relation</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation
   * @generated
   */
  EClass getnAryFormalRelation();

  /**
   * Returns the meta object for the reference list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getTargetRelata <em>Target Relata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target Relata</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getTargetRelata()
   * @see #getnAryFormalRelation()
   * @generated
   */
  EReference getnAryFormalRelation_TargetRelata();

  /**
   * Returns the meta object for the attribute list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getTargetEndNames <em>Target End Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Target End Names</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getTargetEndNames()
   * @see #getnAryFormalRelation()
   * @generated
   */
  EAttribute getnAryFormalRelation_TargetEndNames();

  /**
   * Returns the meta object for the attribute list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getSourceLowerBound <em>Source Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Source Lower Bound</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getSourceLowerBound()
   * @see #getnAryFormalRelation()
   * @generated
   */
  EAttribute getnAryFormalRelation_SourceLowerBound();

  /**
   * Returns the meta object for the attribute list '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getSourceUpperBound <em>Source Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Source Upper Bound</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation#getSourceUpperBound()
   * @see #getnAryFormalRelation()
   * @generated
   */
  EAttribute getnAryFormalRelation_SourceUpperBound();

  /**
   * Returns the meta object for enum '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType <em>Primitive Data Type Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Data Type Type</em>'.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType
   * @generated
   */
  EEnum getPrimitiveDataTypeType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PrimeOntoUMLFactory getPrimeOntoUMLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModelImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ElementImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PackageableElementImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPackageableElement()
     * @generated
     */
    EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.NamedElementImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PackageImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UniversalImpl <em>Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getUniversal()
     * @generated
     */
    EClass UNIVERSAL = eINSTANCE.getUniversal();

    /**
     * The meta object literal for the '<em><b>Is Specialized Via</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIVERSAL__IS_SPECIALIZED_VIA = eINSTANCE.getUniversal_IsSpecializedVia();

    /**
     * The meta object literal for the '<em><b>Specializes Via</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIVERSAL__SPECIALIZES_VIA = eINSTANCE.getUniversal_SpecializesVia();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.GeneralizationSetImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getGeneralizationSet()
     * @generated
     */
    EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

    /**
     * The meta object literal for the '<em><b>Is Covering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERALIZATION_SET__IS_COVERING = eINSTANCE.getGeneralizationSet_IsCovering();

    /**
     * The meta object literal for the '<em><b>Specialized Universal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERALIZATION_SET__SPECIALIZED_UNIVERSAL = eINSTANCE.getGeneralizationSet_SpecializedUniversal();

    /**
     * The meta object literal for the '<em><b>Specializing Universals</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERALIZATION_SET__SPECIALIZING_UNIVERSALS = eINSTANCE.getGeneralizationSet_SpecializingUniversals();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimitiveDataTypeImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPrimitiveDataType()
     * @generated
     */
    EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

    /**
     * The meta object literal for the '<em><b>type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DATA_TYPE__TYPE = eINSTANCE.getPrimitiveDataType__type();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UserDefinedDataTypeImpl <em>User Defined Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.UserDefinedDataTypeImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getUserDefinedDataType()
     * @generated
     */
    EClass USER_DEFINED_DATA_TYPE = eINSTANCE.getUserDefinedDataType();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComplexDataTypeImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getComplexDataType()
     * @generated
     */
    EClass COMPLEX_DATA_TYPE = eINSTANCE.getComplexDataType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_DATA_TYPE__ATTRIBUTES = eINSTANCE.getComplexDataType_Attributes();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeAttributeImpl <em>Data Type Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.DataTypeAttributeImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getDataTypeAttribute()
     * @generated
     */
    EClass DATA_TYPE_ATTRIBUTE = eINSTANCE.getDataTypeAttribute();

    /**
     * The meta object literal for the '<em><b>Is Of Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_ATTRIBUTE__IS_OF_TYPE = eINSTANCE.getDataTypeAttribute_IsOfType();

    /**
     * The meta object literal for the '<em><b>Complex Data Type</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE = eINSTANCE.getDataTypeAttribute_ComplexDataType();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EnumerationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Enumeration Literals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__ENUMERATION_LITERALS = eINSTANCE.getEnumeration_EnumerationLiterals();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl <em>Meronymic Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MeronymicRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMeronymicRelation()
     * @generated
     */
    EClass MERONYMIC_RELATION = eINSTANCE.getMeronymicRelation();

    /**
     * The meta object literal for the '<em><b>Whole</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MERONYMIC_RELATION__WHOLE = eINSTANCE.getMeronymicRelation_Whole();

    /**
     * The meta object literal for the '<em><b>Part</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MERONYMIC_RELATION__PART = eINSTANCE.getMeronymicRelation_Part();

    /**
     * The meta object literal for the '<em><b>Part Is Essential</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MERONYMIC_RELATION__PART_IS_ESSENTIAL = eINSTANCE.getMeronymicRelation_PartIsEssential();

    /**
     * The meta object literal for the '<em><b>Part Is Inseparable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MERONYMIC_RELATION__PART_IS_INSEPARABLE = eINSTANCE.getMeronymicRelation_PartIsInseparable();

    /**
     * The meta object literal for the '<em><b>Part Is Shareable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MERONYMIC_RELATION__PART_IS_SHAREABLE = eINSTANCE.getMeronymicRelation_PartIsShareable();

    /**
     * The meta object literal for the '<em><b>Part Is Immutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MERONYMIC_RELATION__PART_IS_IMMUTABLE = eINSTANCE.getMeronymicRelation_PartIsImmutable();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComponentOfRelationImpl <em>Component Of Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ComponentOfRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getComponentOfRelation()
     * @generated
     */
    EClass COMPONENT_OF_RELATION = eINSTANCE.getComponentOfRelation();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MembershipRelationImpl <em>Membership Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MembershipRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMembershipRelation()
     * @generated
     */
    EClass MEMBERSHIP_RELATION = eINSTANCE.getMembershipRelation();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubCollectionRelationImpl <em>Sub Collection Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubCollectionRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubCollectionRelation()
     * @generated
     */
    EClass SUB_COLLECTION_RELATION = eINSTANCE.getSubCollectionRelation();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubQuantityRelationImpl <em>Sub Quantity Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubQuantityRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubQuantityRelation()
     * @generated
     */
    EClass SUB_QUANTITY_RELATION = eINSTANCE.getSubQuantityRelation();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EndurantUniversalImpl <em>Endurant Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.EndurantUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getEndurantUniversal()
     * @generated
     */
    EClass ENDURANT_UNIVERSAL = eINSTANCE.getEndurantUniversal();

    /**
     * The meta object literal for the '<em><b>Characterized By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENDURANT_UNIVERSAL__CHARACTERIZED_BY = eINSTANCE.getEndurantUniversal_CharacterizedBy();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubstantialUniversalImpl <em>Substantial Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubstantialUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubstantialUniversal()
     * @generated
     */
    EClass SUBSTANTIAL_UNIVERSAL = eINSTANCE.getSubstantialUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SortalUniversalImpl <em>Sortal Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SortalUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSortalUniversal()
     * @generated
     */
    EClass SORTAL_UNIVERSAL = eINSTANCE.getSortalUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RigidSortalUniversalImpl <em>Rigid Sortal Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RigidSortalUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRigidSortalUniversal()
     * @generated
     */
    EClass RIGID_SORTAL_UNIVERSAL = eINSTANCE.getRigidSortalUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.AntiRigidSortalUniversalImpl <em>Anti Rigid Sortal Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.AntiRigidSortalUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getAntiRigidSortalUniversal()
     * @generated
     */
    EClass ANTI_RIGID_SORTAL_UNIVERSAL = eINSTANCE.getAntiRigidSortalUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubstanceSortalUniversalImpl <em>Substance Sortal Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubstanceSortalUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubstanceSortalUniversal()
     * @generated
     */
    EClass SUBSTANCE_SORTAL_UNIVERSAL = eINSTANCE.getSubstanceSortalUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.KindImpl <em>Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.KindImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getKind()
     * @generated
     */
    EClass KIND = eINSTANCE.getKind();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QuantityUniversalImpl <em>Quantity Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QuantityUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getQuantityUniversal()
     * @generated
     */
    EClass QUANTITY_UNIVERSAL = eINSTANCE.getQuantityUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CollectiveUniversalImpl <em>Collective Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CollectiveUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getCollectiveUniversal()
     * @generated
     */
    EClass COLLECTIVE_UNIVERSAL = eINSTANCE.getCollectiveUniversal();

    /**
     * The meta object literal for the '<em><b>Is Extensional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTIVE_UNIVERSAL__IS_EXTENSIONAL = eINSTANCE.getCollectiveUniversal_IsExtensional();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubKindImpl <em>Sub Kind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SubKindImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSubKind()
     * @generated
     */
    EClass SUB_KIND = eINSTANCE.getSubKind();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PhaseImpl <em>Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PhaseImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPhase()
     * @generated
     */
    EClass PHASE = eINSTANCE.getPhase();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinUniversalImpl <em>Mixin Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMixinUniversal()
     * @generated
     */
    EClass MIXIN_UNIVERSAL = eINSTANCE.getMixinUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RigidMixinUniversalImpl <em>Rigid Mixin Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RigidMixinUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRigidMixinUniversal()
     * @generated
     */
    EClass RIGID_MIXIN_UNIVERSAL = eINSTANCE.getRigidMixinUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CategoryImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.NonRigidMixinUniversalImpl <em>Non Rigid Mixin Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.NonRigidMixinUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getNonRigidMixinUniversal()
     * @generated
     */
    EClass NON_RIGID_MIXIN_UNIVERSAL = eINSTANCE.getNonRigidMixinUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SemiRigidMixinUniversalImpl <em>Semi Rigid Mixin Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.SemiRigidMixinUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getSemiRigidMixinUniversal()
     * @generated
     */
    EClass SEMI_RIGID_MIXIN_UNIVERSAL = eINSTANCE.getSemiRigidMixinUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinImpl <em>Mixin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MixinImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMixin()
     * @generated
     */
    EClass MIXIN = eINSTANCE.getMixin();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.AntiRigidMixinUniversalImpl <em>Anti Rigid Mixin Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.AntiRigidMixinUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getAntiRigidMixinUniversal()
     * @generated
     */
    EClass ANTI_RIGID_MIXIN_UNIVERSAL = eINSTANCE.getAntiRigidMixinUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleMixinImpl <em>Role Mixin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RoleMixinImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRoleMixin()
     * @generated
     */
    EClass ROLE_MIXIN = eINSTANCE.getRoleMixin();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ExternallyDependentUniversalImpl <em>Externally Dependent Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ExternallyDependentUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getExternallyDependentUniversal()
     * @generated
     */
    EClass EXTERNALLY_DEPENDENT_UNIVERSAL = eINSTANCE.getExternallyDependentUniversal();

    /**
     * The meta object literal for the '<em><b>Mediation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION = eINSTANCE.getExternallyDependentUniversal_Mediation();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MomentUniversalImpl <em>Moment Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MomentUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMomentUniversal()
     * @generated
     */
    EClass MOMENT_UNIVERSAL = eINSTANCE.getMomentUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RelatorUniversalImpl <em>Relator Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.RelatorUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getRelatorUniversal()
     * @generated
     */
    EClass RELATOR_UNIVERSAL = eINSTANCE.getRelatorUniversal();

    /**
     * The meta object literal for the '<em><b>Mediations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATOR_UNIVERSAL__MEDIATIONS = eINSTANCE.getRelatorUniversal_Mediations();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl <em>Binary Directed Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryDirectedRelationshipImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getBinaryDirectedRelationship()
     * @generated
     */
    EClass BINARY_DIRECTED_RELATIONSHIP = eINSTANCE.getBinaryDirectedRelationship();

    /**
     * The meta object literal for the '<em><b>Source End Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME = eINSTANCE.getBinaryDirectedRelationship_SourceEndName();

    /**
     * The meta object literal for the '<em><b>Target End Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME = eINSTANCE.getBinaryDirectedRelationship_TargetEndName();

    /**
     * The meta object literal for the '<em><b>Source Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND = eINSTANCE.getBinaryDirectedRelationship_SourceLowerBound();

    /**
     * The meta object literal for the '<em><b>Source Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND = eINSTANCE.getBinaryDirectedRelationship_SourceUpperBound();

    /**
     * The meta object literal for the '<em><b>Target Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND = eINSTANCE.getBinaryDirectedRelationship_TargetLowerBound();

    /**
     * The meta object literal for the '<em><b>Target Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND = eINSTANCE.getBinaryDirectedRelationship_TargetUpperBound();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl <em>Binary Material Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryMaterialRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getBinaryMaterialRelation()
     * @generated
     */
    EClass BINARY_MATERIAL_RELATION = eINSTANCE.getBinaryMaterialRelation();

    /**
     * The meta object literal for the '<em><b>Derived From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_MATERIAL_RELATION__DERIVED_FROM = eINSTANCE.getBinaryMaterialRelation_DerivedFrom();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_MATERIAL_RELATION__SOURCE = eINSTANCE.getBinaryMaterialRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_MATERIAL_RELATION__TARGET = eINSTANCE.getBinaryMaterialRelation_Target();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryFormalRelationImpl <em>Binary Formal Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.BinaryFormalRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getBinaryFormalRelation()
     * @generated
     */
    EClass BINARY_FORMAL_RELATION = eINSTANCE.getBinaryFormalRelation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_FORMAL_RELATION__SOURCE = eINSTANCE.getBinaryFormalRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_FORMAL_RELATION__TARGET = eINSTANCE.getBinaryFormalRelation_Target();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MediationImpl <em>Mediation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.MediationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getMediation()
     * @generated
     */
    EClass MEDIATION = eINSTANCE.getMediation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIATION__SOURCE = eINSTANCE.getMediation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIATION__TARGET = eINSTANCE.getMediation_Target();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CharacterizationImpl <em>Characterization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.CharacterizationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getCharacterization()
     * @generated
     */
    EClass CHARACTERIZATION = eINSTANCE.getCharacterization();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTERIZATION__SOURCE = eINSTANCE.getCharacterization_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHARACTERIZATION__TARGET = eINSTANCE.getCharacterization_Target();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.IntrinsicMomentUniversalImpl <em>Intrinsic Moment Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.IntrinsicMomentUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getIntrinsicMomentUniversal()
     * @generated
     */
    EClass INTRINSIC_MOMENT_UNIVERSAL = eINSTANCE.getIntrinsicMomentUniversal();

    /**
     * The meta object literal for the '<em><b>Characterization</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION = eINSTANCE.getIntrinsicMomentUniversal_Characterization();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModeUniversalImpl <em>Mode Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.ModeUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getModeUniversal()
     * @generated
     */
    EClass MODE_UNIVERSAL = eINSTANCE.getModeUniversal();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QualityUniversalImpl <em>Quality Universal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.QualityUniversalImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getQualityUniversal()
     * @generated
     */
    EClass QUALITY_UNIVERSAL = eINSTANCE.getQualityUniversal();

    /**
     * The meta object literal for the '<em><b>Datatypes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALITY_UNIVERSAL__DATATYPES = eINSTANCE.getQualityUniversal_Datatypes();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl <em>nAry Material Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryMaterialRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getnAryMaterialRelation()
     * @generated
     */
    EClass NARY_MATERIAL_RELATION = eINSTANCE.getnAryMaterialRelation();

    /**
     * The meta object literal for the '<em><b>Derived From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NARY_MATERIAL_RELATION__DERIVED_FROM = eINSTANCE.getnAryMaterialRelation_DerivedFrom();

    /**
     * The meta object literal for the '<em><b>Target Relata</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NARY_MATERIAL_RELATION__TARGET_RELATA = eINSTANCE.getnAryMaterialRelation_TargetRelata();

    /**
     * The meta object literal for the '<em><b>Target End Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NARY_MATERIAL_RELATION__TARGET_END_NAMES = eINSTANCE.getnAryMaterialRelation_TargetEndNames();

    /**
     * The meta object literal for the '<em><b>Source Lower Bound</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND = eINSTANCE.getnAryMaterialRelation_SourceLowerBound();

    /**
     * The meta object literal for the '<em><b>Source Upper Bound</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND = eINSTANCE.getnAryMaterialRelation_SourceUpperBound();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryFormalRelationImpl <em>nAry Formal Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.nAryFormalRelationImpl
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getnAryFormalRelation()
     * @generated
     */
    EClass NARY_FORMAL_RELATION = eINSTANCE.getnAryFormalRelation();

    /**
     * The meta object literal for the '<em><b>Target Relata</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NARY_FORMAL_RELATION__TARGET_RELATA = eINSTANCE.getnAryFormalRelation_TargetRelata();

    /**
     * The meta object literal for the '<em><b>Target End Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NARY_FORMAL_RELATION__TARGET_END_NAMES = eINSTANCE.getnAryFormalRelation_TargetEndNames();

    /**
     * The meta object literal for the '<em><b>Source Lower Bound</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NARY_FORMAL_RELATION__SOURCE_LOWER_BOUND = eINSTANCE.getnAryFormalRelation_SourceLowerBound();

    /**
     * The meta object literal for the '<em><b>Source Upper Bound</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NARY_FORMAL_RELATION__SOURCE_UPPER_BOUND = eINSTANCE.getnAryFormalRelation_SourceUpperBound();

    /**
     * The meta object literal for the '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType <em>Primitive Data Type Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType
     * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl.PrimeOntoUMLPackageImpl#getPrimitiveDataTypeType()
     * @generated
     */
    EEnum PRIMITIVE_DATA_TYPE_TYPE = eINSTANCE.getPrimitiveDataTypeType();

  }

} //PrimeOntoUMLPackage
