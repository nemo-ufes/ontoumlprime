/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimeOntoUMLFactoryImpl extends EFactoryImpl implements PrimeOntoUMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrimeOntoUMLFactory init()
  {
    try
    {
      PrimeOntoUMLFactory thePrimeOntoUMLFactory = (PrimeOntoUMLFactory)EPackage.Registry.INSTANCE.getEFactory("http://nemo.inf.ufes.br/ontouml/ontoumlprime"); 
      if (thePrimeOntoUMLFactory != null)
      {
        return thePrimeOntoUMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PrimeOntoUMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimeOntoUMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PrimeOntoUMLPackage.MODEL: return createModel();
      case PrimeOntoUMLPackage.PACKAGE: return createPackage();
      case PrimeOntoUMLPackage.GENERALIZATION_SET: return createGeneralizationSet();
      case PrimeOntoUMLPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
      case PrimeOntoUMLPackage.COMPLEX_DATA_TYPE: return createComplexDataType();
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE: return createDataTypeAttribute();
      case PrimeOntoUMLPackage.ENUMERATION: return createEnumeration();
      case PrimeOntoUMLPackage.MERONYMIC_RELATION: return createMeronymicRelation();
      case PrimeOntoUMLPackage.COMPONENT_OF_RELATION: return createComponentOfRelation();
      case PrimeOntoUMLPackage.MEMBERSHIP_RELATION: return createMembershipRelation();
      case PrimeOntoUMLPackage.SUB_COLLECTION_RELATION: return createSubCollectionRelation();
      case PrimeOntoUMLPackage.SUB_QUANTITY_RELATION: return createSubQuantityRelation();
      case PrimeOntoUMLPackage.KIND: return createKind();
      case PrimeOntoUMLPackage.QUANTITY_UNIVERSAL: return createQuantityUniversal();
      case PrimeOntoUMLPackage.COLLECTIVE_UNIVERSAL: return createCollectiveUniversal();
      case PrimeOntoUMLPackage.SUB_KIND: return createSubKind();
      case PrimeOntoUMLPackage.ROLE: return createRole();
      case PrimeOntoUMLPackage.PHASE: return createPhase();
      case PrimeOntoUMLPackage.CATEGORY: return createCategory();
      case PrimeOntoUMLPackage.MIXIN: return createMixin();
      case PrimeOntoUMLPackage.ROLE_MIXIN: return createRoleMixin();
      case PrimeOntoUMLPackage.RELATOR_UNIVERSAL: return createRelatorUniversal();
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION: return createBinaryMaterialRelation();
      case PrimeOntoUMLPackage.BINARY_FORMAL_RELATION: return createBinaryFormalRelation();
      case PrimeOntoUMLPackage.MEDIATION: return createMediation();
      case PrimeOntoUMLPackage.CHARACTERIZATION: return createCharacterization();
      case PrimeOntoUMLPackage.MODE_UNIVERSAL: return createModeUniversal();
      case PrimeOntoUMLPackage.QUALITY_UNIVERSAL: return createQualityUniversal();
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION: return createnAryMaterialRelation();
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION: return createnAryFormalRelation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PrimeOntoUMLPackage.PRIMITIVE_DATA_TYPE_TYPE:
        return createPrimitiveDataTypeTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PrimeOntoUMLPackage.PRIMITIVE_DATA_TYPE_TYPE:
        return convertPrimitiveDataTypeTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralizationSet createGeneralizationSet()
  {
    GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
    return generalizationSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveDataType createPrimitiveDataType()
  {
    PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
    return primitiveDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexDataType createComplexDataType()
  {
    ComplexDataTypeImpl complexDataType = new ComplexDataTypeImpl();
    return complexDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeAttribute createDataTypeAttribute()
  {
    DataTypeAttributeImpl dataTypeAttribute = new DataTypeAttributeImpl();
    return dataTypeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeronymicRelation createMeronymicRelation()
  {
    MeronymicRelationImpl meronymicRelation = new MeronymicRelationImpl();
    return meronymicRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentOfRelation createComponentOfRelation()
  {
    ComponentOfRelationImpl componentOfRelation = new ComponentOfRelationImpl();
    return componentOfRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MembershipRelation createMembershipRelation()
  {
    MembershipRelationImpl membershipRelation = new MembershipRelationImpl();
    return membershipRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubCollectionRelation createSubCollectionRelation()
  {
    SubCollectionRelationImpl subCollectionRelation = new SubCollectionRelationImpl();
    return subCollectionRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubQuantityRelation createSubQuantityRelation()
  {
    SubQuantityRelationImpl subQuantityRelation = new SubQuantityRelationImpl();
    return subQuantityRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kind createKind()
  {
    KindImpl kind = new KindImpl();
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantityUniversal createQuantityUniversal()
  {
    QuantityUniversalImpl quantityUniversal = new QuantityUniversalImpl();
    return quantityUniversal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectiveUniversal createCollectiveUniversal()
  {
    CollectiveUniversalImpl collectiveUniversal = new CollectiveUniversalImpl();
    return collectiveUniversal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubKind createSubKind()
  {
    SubKindImpl subKind = new SubKindImpl();
    return subKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phase createPhase()
  {
    PhaseImpl phase = new PhaseImpl();
    return phase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category createCategory()
  {
    CategoryImpl category = new CategoryImpl();
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mixin createMixin()
  {
    MixinImpl mixin = new MixinImpl();
    return mixin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleMixin createRoleMixin()
  {
    RoleMixinImpl roleMixin = new RoleMixinImpl();
    return roleMixin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelatorUniversal createRelatorUniversal()
  {
    RelatorUniversalImpl relatorUniversal = new RelatorUniversalImpl();
    return relatorUniversal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryMaterialRelation createBinaryMaterialRelation()
  {
    BinaryMaterialRelationImpl binaryMaterialRelation = new BinaryMaterialRelationImpl();
    return binaryMaterialRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryFormalRelation createBinaryFormalRelation()
  {
    BinaryFormalRelationImpl binaryFormalRelation = new BinaryFormalRelationImpl();
    return binaryFormalRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mediation createMediation()
  {
    MediationImpl mediation = new MediationImpl();
    return mediation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Characterization createCharacterization()
  {
    CharacterizationImpl characterization = new CharacterizationImpl();
    return characterization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeUniversal createModeUniversal()
  {
    ModeUniversalImpl modeUniversal = new ModeUniversalImpl();
    return modeUniversal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualityUniversal createQualityUniversal()
  {
    QualityUniversalImpl qualityUniversal = new QualityUniversalImpl();
    return qualityUniversal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAryMaterialRelation createnAryMaterialRelation()
  {
    nAryMaterialRelationImpl nAryMaterialRelation = new nAryMaterialRelationImpl();
    return nAryMaterialRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nAryFormalRelation createnAryFormalRelation()
  {
    nAryFormalRelationImpl nAryFormalRelation = new nAryFormalRelationImpl();
    return nAryFormalRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveDataTypeType createPrimitiveDataTypeTypeFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveDataTypeType result = PrimitiveDataTypeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveDataTypeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimeOntoUMLPackage getPrimeOntoUMLPackage()
  {
    return (PrimeOntoUMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PrimeOntoUMLPackage getPackage()
  {
    return PrimeOntoUMLPackage.eINSTANCE;
  }

} //PrimeOntoUMLFactoryImpl
