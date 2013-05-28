/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.impl;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidMixinUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidSortalUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MixinUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.MomentUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.NonRigidMixinUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLFactory;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataTypeType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidMixinUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidSortalUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SemiRigidMixinUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SortalUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstanceSortalUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstantialUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.UserDefinedDataType;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimeOntoUMLPackageImpl extends EPackageImpl implements PrimeOntoUMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass universalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalizationSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userDefinedDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexDataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass meronymicRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentOfRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass membershipRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subCollectionRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subQuantityRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endurantUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass substantialUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sortalUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rigidSortalUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass antiRigidSortalUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass substanceSortalUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantityUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectiveUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subKindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mixinUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rigidMixinUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonRigidMixinUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass semiRigidMixinUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mixinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass antiRigidMixinUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleMixinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externallyDependentUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass momentUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relatorUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryDirectedRelationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryMaterialRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryFormalRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mediationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characterizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intrinsicMomentUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modeUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualityUniversalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nAryMaterialRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nAryFormalRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum primitiveDataTypeTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PrimeOntoUMLPackageImpl()
  {
    super(eNS_URI, PrimeOntoUMLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PrimeOntoUMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PrimeOntoUMLPackage init()
  {
    if (isInited) return (PrimeOntoUMLPackage)EPackage.Registry.INSTANCE.getEPackage(PrimeOntoUMLPackage.eNS_URI);

    // Obtain or create and register package
    PrimeOntoUMLPackageImpl thePrimeOntoUMLPackage = (PrimeOntoUMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrimeOntoUMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrimeOntoUMLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    thePrimeOntoUMLPackage.createPackageContents();

    // Initialize created meta-data
    thePrimeOntoUMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePrimeOntoUMLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PrimeOntoUMLPackage.eNS_URI, thePrimeOntoUMLPackage);
    return thePrimeOntoUMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageableElement()
  {
    return packageableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Elements()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniversal()
  {
    return universalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniversal_IsSpecializedVia()
  {
    return (EReference)universalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniversal_SpecializesVia()
  {
    return (EReference)universalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralizationSet()
  {
    return generalizationSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralizationSet_IsCovering()
  {
    return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralizationSet_SpecializedUniversal()
  {
    return (EReference)generalizationSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralizationSet_SpecializingUniversals()
  {
    return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveDataType()
  {
    return primitiveDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveDataType__type()
  {
    return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserDefinedDataType()
  {
    return userDefinedDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexDataType()
  {
    return complexDataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexDataType_Attributes()
  {
    return (EReference)complexDataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeAttribute()
  {
    return dataTypeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeAttribute_IsOfType()
  {
    return (EReference)dataTypeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeAttribute_ComplexDataType()
  {
    return (EReference)dataTypeAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeration()
  {
    return enumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumeration_EnumerationLiterals()
  {
    return (EAttribute)enumerationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeronymicRelation()
  {
    return meronymicRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeronymicRelation_Whole()
  {
    return (EReference)meronymicRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeronymicRelation_Part()
  {
    return (EReference)meronymicRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeronymicRelation_PartIsEssential()
  {
    return (EAttribute)meronymicRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeronymicRelation_PartIsInseparable()
  {
    return (EAttribute)meronymicRelationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeronymicRelation_PartIsShareable()
  {
    return (EAttribute)meronymicRelationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeronymicRelation_PartIsImmutable()
  {
    return (EAttribute)meronymicRelationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentOfRelation()
  {
    return componentOfRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMembershipRelation()
  {
    return membershipRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubCollectionRelation()
  {
    return subCollectionRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubQuantityRelation()
  {
    return subQuantityRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndurantUniversal()
  {
    return endurantUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEndurantUniversal_CharacterizedBy()
  {
    return (EReference)endurantUniversalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubstantialUniversal()
  {
    return substantialUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSortalUniversal()
  {
    return sortalUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRigidSortalUniversal()
  {
    return rigidSortalUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAntiRigidSortalUniversal()
  {
    return antiRigidSortalUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubstanceSortalUniversal()
  {
    return substanceSortalUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKind()
  {
    return kindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantityUniversal()
  {
    return quantityUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectiveUniversal()
  {
    return collectiveUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollectiveUniversal_IsExtensional()
  {
    return (EAttribute)collectiveUniversalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubKind()
  {
    return subKindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPhase()
  {
    return phaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMixinUniversal()
  {
    return mixinUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRigidMixinUniversal()
  {
    return rigidMixinUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategory()
  {
    return categoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonRigidMixinUniversal()
  {
    return nonRigidMixinUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSemiRigidMixinUniversal()
  {
    return semiRigidMixinUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMixin()
  {
    return mixinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAntiRigidMixinUniversal()
  {
    return antiRigidMixinUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleMixin()
  {
    return roleMixinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternallyDependentUniversal()
  {
    return externallyDependentUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternallyDependentUniversal_Mediation()
  {
    return (EReference)externallyDependentUniversalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMomentUniversal()
  {
    return momentUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelatorUniversal()
  {
    return relatorUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelatorUniversal_Mediations()
  {
    return (EReference)relatorUniversalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryDirectedRelationship()
  {
    return binaryDirectedRelationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryDirectedRelationship_SourceEndName()
  {
    return (EAttribute)binaryDirectedRelationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryDirectedRelationship_TargetEndName()
  {
    return (EAttribute)binaryDirectedRelationshipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryDirectedRelationship_SourceLowerBound()
  {
    return (EAttribute)binaryDirectedRelationshipEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryDirectedRelationship_SourceUpperBound()
  {
    return (EAttribute)binaryDirectedRelationshipEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryDirectedRelationship_TargetLowerBound()
  {
    return (EAttribute)binaryDirectedRelationshipEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryDirectedRelationship_TargetUpperBound()
  {
    return (EAttribute)binaryDirectedRelationshipEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryMaterialRelation()
  {
    return binaryMaterialRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryMaterialRelation_DerivedFrom()
  {
    return (EReference)binaryMaterialRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryMaterialRelation_Source()
  {
    return (EReference)binaryMaterialRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryMaterialRelation_Target()
  {
    return (EReference)binaryMaterialRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryFormalRelation()
  {
    return binaryFormalRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryFormalRelation_Source()
  {
    return (EReference)binaryFormalRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryFormalRelation_Target()
  {
    return (EReference)binaryFormalRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMediation()
  {
    return mediationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMediation_Source()
  {
    return (EReference)mediationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMediation_Target()
  {
    return (EReference)mediationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacterization()
  {
    return characterizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacterization_Source()
  {
    return (EReference)characterizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCharacterization_Target()
  {
    return (EReference)characterizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntrinsicMomentUniversal()
  {
    return intrinsicMomentUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntrinsicMomentUniversal_Characterization()
  {
    return (EReference)intrinsicMomentUniversalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModeUniversal()
  {
    return modeUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualityUniversal()
  {
    return qualityUniversalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualityUniversal_Datatypes()
  {
    return (EReference)qualityUniversalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnAryMaterialRelation()
  {
    return nAryMaterialRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnAryMaterialRelation_DerivedFrom()
  {
    return (EReference)nAryMaterialRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnAryMaterialRelation_TargetRelata()
  {
    return (EReference)nAryMaterialRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAryMaterialRelation_TargetEndNames()
  {
    return (EAttribute)nAryMaterialRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAryMaterialRelation_SourceLowerBound()
  {
    return (EAttribute)nAryMaterialRelationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAryMaterialRelation_SourceUpperBound()
  {
    return (EAttribute)nAryMaterialRelationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnAryFormalRelation()
  {
    return nAryFormalRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnAryFormalRelation_TargetRelata()
  {
    return (EReference)nAryFormalRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAryFormalRelation_TargetEndNames()
  {
    return (EAttribute)nAryFormalRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAryFormalRelation_SourceLowerBound()
  {
    return (EAttribute)nAryFormalRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnAryFormalRelation_SourceUpperBound()
  {
    return (EAttribute)nAryFormalRelationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPrimitiveDataTypeType()
  {
    return primitiveDataTypeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimeOntoUMLFactory getPrimeOntoUMLFactory()
  {
    return (PrimeOntoUMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    elementEClass = createEClass(ELEMENT);

    packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    packageEClass = createEClass(PACKAGE);
    createEReference(packageEClass, PACKAGE__ELEMENTS);

    universalEClass = createEClass(UNIVERSAL);
    createEReference(universalEClass, UNIVERSAL__IS_SPECIALIZED_VIA);
    createEReference(universalEClass, UNIVERSAL__SPECIALIZES_VIA);

    generalizationSetEClass = createEClass(GENERALIZATION_SET);
    createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COVERING);
    createEReference(generalizationSetEClass, GENERALIZATION_SET__SPECIALIZED_UNIVERSAL);
    createEReference(generalizationSetEClass, GENERALIZATION_SET__SPECIALIZING_UNIVERSALS);

    dataTypeEClass = createEClass(DATA_TYPE);

    primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
    createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__TYPE);

    userDefinedDataTypeEClass = createEClass(USER_DEFINED_DATA_TYPE);

    complexDataTypeEClass = createEClass(COMPLEX_DATA_TYPE);
    createEReference(complexDataTypeEClass, COMPLEX_DATA_TYPE__ATTRIBUTES);

    dataTypeAttributeEClass = createEClass(DATA_TYPE_ATTRIBUTE);
    createEReference(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__IS_OF_TYPE);
    createEReference(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__COMPLEX_DATA_TYPE);

    enumerationEClass = createEClass(ENUMERATION);
    createEAttribute(enumerationEClass, ENUMERATION__ENUMERATION_LITERALS);

    meronymicRelationEClass = createEClass(MERONYMIC_RELATION);
    createEReference(meronymicRelationEClass, MERONYMIC_RELATION__WHOLE);
    createEReference(meronymicRelationEClass, MERONYMIC_RELATION__PART);
    createEAttribute(meronymicRelationEClass, MERONYMIC_RELATION__PART_IS_ESSENTIAL);
    createEAttribute(meronymicRelationEClass, MERONYMIC_RELATION__PART_IS_INSEPARABLE);
    createEAttribute(meronymicRelationEClass, MERONYMIC_RELATION__PART_IS_SHAREABLE);
    createEAttribute(meronymicRelationEClass, MERONYMIC_RELATION__PART_IS_IMMUTABLE);

    componentOfRelationEClass = createEClass(COMPONENT_OF_RELATION);

    membershipRelationEClass = createEClass(MEMBERSHIP_RELATION);

    subCollectionRelationEClass = createEClass(SUB_COLLECTION_RELATION);

    subQuantityRelationEClass = createEClass(SUB_QUANTITY_RELATION);

    endurantUniversalEClass = createEClass(ENDURANT_UNIVERSAL);
    createEReference(endurantUniversalEClass, ENDURANT_UNIVERSAL__CHARACTERIZED_BY);

    substantialUniversalEClass = createEClass(SUBSTANTIAL_UNIVERSAL);

    sortalUniversalEClass = createEClass(SORTAL_UNIVERSAL);

    rigidSortalUniversalEClass = createEClass(RIGID_SORTAL_UNIVERSAL);

    antiRigidSortalUniversalEClass = createEClass(ANTI_RIGID_SORTAL_UNIVERSAL);

    substanceSortalUniversalEClass = createEClass(SUBSTANCE_SORTAL_UNIVERSAL);

    kindEClass = createEClass(KIND);

    quantityUniversalEClass = createEClass(QUANTITY_UNIVERSAL);

    collectiveUniversalEClass = createEClass(COLLECTIVE_UNIVERSAL);
    createEAttribute(collectiveUniversalEClass, COLLECTIVE_UNIVERSAL__IS_EXTENSIONAL);

    subKindEClass = createEClass(SUB_KIND);

    roleEClass = createEClass(ROLE);

    phaseEClass = createEClass(PHASE);

    mixinUniversalEClass = createEClass(MIXIN_UNIVERSAL);

    rigidMixinUniversalEClass = createEClass(RIGID_MIXIN_UNIVERSAL);

    categoryEClass = createEClass(CATEGORY);

    nonRigidMixinUniversalEClass = createEClass(NON_RIGID_MIXIN_UNIVERSAL);

    semiRigidMixinUniversalEClass = createEClass(SEMI_RIGID_MIXIN_UNIVERSAL);

    mixinEClass = createEClass(MIXIN);

    antiRigidMixinUniversalEClass = createEClass(ANTI_RIGID_MIXIN_UNIVERSAL);

    roleMixinEClass = createEClass(ROLE_MIXIN);

    externallyDependentUniversalEClass = createEClass(EXTERNALLY_DEPENDENT_UNIVERSAL);
    createEReference(externallyDependentUniversalEClass, EXTERNALLY_DEPENDENT_UNIVERSAL__MEDIATION);

    momentUniversalEClass = createEClass(MOMENT_UNIVERSAL);

    relatorUniversalEClass = createEClass(RELATOR_UNIVERSAL);
    createEReference(relatorUniversalEClass, RELATOR_UNIVERSAL__MEDIATIONS);

    binaryDirectedRelationshipEClass = createEClass(BINARY_DIRECTED_RELATIONSHIP);
    createEAttribute(binaryDirectedRelationshipEClass, BINARY_DIRECTED_RELATIONSHIP__SOURCE_END_NAME);
    createEAttribute(binaryDirectedRelationshipEClass, BINARY_DIRECTED_RELATIONSHIP__TARGET_END_NAME);
    createEAttribute(binaryDirectedRelationshipEClass, BINARY_DIRECTED_RELATIONSHIP__SOURCE_LOWER_BOUND);
    createEAttribute(binaryDirectedRelationshipEClass, BINARY_DIRECTED_RELATIONSHIP__SOURCE_UPPER_BOUND);
    createEAttribute(binaryDirectedRelationshipEClass, BINARY_DIRECTED_RELATIONSHIP__TARGET_LOWER_BOUND);
    createEAttribute(binaryDirectedRelationshipEClass, BINARY_DIRECTED_RELATIONSHIP__TARGET_UPPER_BOUND);

    binaryMaterialRelationEClass = createEClass(BINARY_MATERIAL_RELATION);
    createEReference(binaryMaterialRelationEClass, BINARY_MATERIAL_RELATION__DERIVED_FROM);
    createEReference(binaryMaterialRelationEClass, BINARY_MATERIAL_RELATION__SOURCE);
    createEReference(binaryMaterialRelationEClass, BINARY_MATERIAL_RELATION__TARGET);

    binaryFormalRelationEClass = createEClass(BINARY_FORMAL_RELATION);
    createEReference(binaryFormalRelationEClass, BINARY_FORMAL_RELATION__SOURCE);
    createEReference(binaryFormalRelationEClass, BINARY_FORMAL_RELATION__TARGET);

    mediationEClass = createEClass(MEDIATION);
    createEReference(mediationEClass, MEDIATION__SOURCE);
    createEReference(mediationEClass, MEDIATION__TARGET);

    characterizationEClass = createEClass(CHARACTERIZATION);
    createEReference(characterizationEClass, CHARACTERIZATION__SOURCE);
    createEReference(characterizationEClass, CHARACTERIZATION__TARGET);

    intrinsicMomentUniversalEClass = createEClass(INTRINSIC_MOMENT_UNIVERSAL);
    createEReference(intrinsicMomentUniversalEClass, INTRINSIC_MOMENT_UNIVERSAL__CHARACTERIZATION);

    modeUniversalEClass = createEClass(MODE_UNIVERSAL);

    qualityUniversalEClass = createEClass(QUALITY_UNIVERSAL);
    createEReference(qualityUniversalEClass, QUALITY_UNIVERSAL__DATATYPES);

    nAryMaterialRelationEClass = createEClass(NARY_MATERIAL_RELATION);
    createEReference(nAryMaterialRelationEClass, NARY_MATERIAL_RELATION__DERIVED_FROM);
    createEReference(nAryMaterialRelationEClass, NARY_MATERIAL_RELATION__TARGET_RELATA);
    createEAttribute(nAryMaterialRelationEClass, NARY_MATERIAL_RELATION__TARGET_END_NAMES);
    createEAttribute(nAryMaterialRelationEClass, NARY_MATERIAL_RELATION__SOURCE_LOWER_BOUND);
    createEAttribute(nAryMaterialRelationEClass, NARY_MATERIAL_RELATION__SOURCE_UPPER_BOUND);

    nAryFormalRelationEClass = createEClass(NARY_FORMAL_RELATION);
    createEReference(nAryFormalRelationEClass, NARY_FORMAL_RELATION__TARGET_RELATA);
    createEAttribute(nAryFormalRelationEClass, NARY_FORMAL_RELATION__TARGET_END_NAMES);
    createEAttribute(nAryFormalRelationEClass, NARY_FORMAL_RELATION__SOURCE_LOWER_BOUND);
    createEAttribute(nAryFormalRelationEClass, NARY_FORMAL_RELATION__SOURCE_UPPER_BOUND);

    // Create enums
    primitiveDataTypeTypeEEnum = createEEnum(PRIMITIVE_DATA_TYPE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageableElementEClass.getESuperTypes().add(this.getElement());
    namedElementEClass.getESuperTypes().add(this.getElement());
    packageEClass.getESuperTypes().add(this.getNamedElement());
    packageEClass.getESuperTypes().add(this.getPackageableElement());
    universalEClass.getESuperTypes().add(this.getNamedElement());
    universalEClass.getESuperTypes().add(this.getPackageableElement());
    generalizationSetEClass.getESuperTypes().add(this.getNamedElement());
    generalizationSetEClass.getESuperTypes().add(this.getPackageableElement());
    dataTypeEClass.getESuperTypes().add(this.getNamedElement());
    dataTypeEClass.getESuperTypes().add(this.getPackageableElement());
    primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
    userDefinedDataTypeEClass.getESuperTypes().add(this.getDataType());
    userDefinedDataTypeEClass.getESuperTypes().add(this.getNamedElement());
    complexDataTypeEClass.getESuperTypes().add(this.getUserDefinedDataType());
    dataTypeAttributeEClass.getESuperTypes().add(this.getNamedElement());
    enumerationEClass.getESuperTypes().add(this.getUserDefinedDataType());
    meronymicRelationEClass.getESuperTypes().add(this.getPackageableElement());
    meronymicRelationEClass.getESuperTypes().add(this.getBinaryDirectedRelationship());
    componentOfRelationEClass.getESuperTypes().add(this.getMeronymicRelation());
    membershipRelationEClass.getESuperTypes().add(this.getMeronymicRelation());
    subCollectionRelationEClass.getESuperTypes().add(this.getMeronymicRelation());
    subQuantityRelationEClass.getESuperTypes().add(this.getMeronymicRelation());
    endurantUniversalEClass.getESuperTypes().add(this.getUniversal());
    substantialUniversalEClass.getESuperTypes().add(this.getEndurantUniversal());
    sortalUniversalEClass.getESuperTypes().add(this.getSubstantialUniversal());
    rigidSortalUniversalEClass.getESuperTypes().add(this.getSortalUniversal());
    antiRigidSortalUniversalEClass.getESuperTypes().add(this.getSortalUniversal());
    substanceSortalUniversalEClass.getESuperTypes().add(this.getRigidSortalUniversal());
    kindEClass.getESuperTypes().add(this.getSubstanceSortalUniversal());
    quantityUniversalEClass.getESuperTypes().add(this.getSubstanceSortalUniversal());
    collectiveUniversalEClass.getESuperTypes().add(this.getSubstanceSortalUniversal());
    subKindEClass.getESuperTypes().add(this.getRigidSortalUniversal());
    roleEClass.getESuperTypes().add(this.getAntiRigidSortalUniversal());
    roleEClass.getESuperTypes().add(this.getExternallyDependentUniversal());
    phaseEClass.getESuperTypes().add(this.getAntiRigidSortalUniversal());
    mixinUniversalEClass.getESuperTypes().add(this.getUniversal());
    rigidMixinUniversalEClass.getESuperTypes().add(this.getMixinUniversal());
    categoryEClass.getESuperTypes().add(this.getRigidMixinUniversal());
    nonRigidMixinUniversalEClass.getESuperTypes().add(this.getMixinUniversal());
    semiRigidMixinUniversalEClass.getESuperTypes().add(this.getNonRigidMixinUniversal());
    mixinEClass.getESuperTypes().add(this.getSemiRigidMixinUniversal());
    antiRigidMixinUniversalEClass.getESuperTypes().add(this.getNonRigidMixinUniversal());
    roleMixinEClass.getESuperTypes().add(this.getAntiRigidMixinUniversal());
    roleMixinEClass.getESuperTypes().add(this.getExternallyDependentUniversal());
    momentUniversalEClass.getESuperTypes().add(this.getEndurantUniversal());
    relatorUniversalEClass.getESuperTypes().add(this.getMomentUniversal());
    binaryMaterialRelationEClass.getESuperTypes().add(this.getBinaryDirectedRelationship());
    binaryMaterialRelationEClass.getESuperTypes().add(this.getNamedElement());
    binaryMaterialRelationEClass.getESuperTypes().add(this.getPackageableElement());
    binaryFormalRelationEClass.getESuperTypes().add(this.getBinaryDirectedRelationship());
    binaryFormalRelationEClass.getESuperTypes().add(this.getNamedElement());
    binaryFormalRelationEClass.getESuperTypes().add(this.getPackageableElement());
    mediationEClass.getESuperTypes().add(this.getBinaryDirectedRelationship());
    characterizationEClass.getESuperTypes().add(this.getBinaryDirectedRelationship());
    intrinsicMomentUniversalEClass.getESuperTypes().add(this.getMomentUniversal());
    modeUniversalEClass.getESuperTypes().add(this.getIntrinsicMomentUniversal());
    qualityUniversalEClass.getESuperTypes().add(this.getIntrinsicMomentUniversal());
    nAryMaterialRelationEClass.getESuperTypes().add(this.getNamedElement());
    nAryMaterialRelationEClass.getESuperTypes().add(this.getPackageableElement());
    nAryFormalRelationEClass.getESuperTypes().add(this.getNamedElement());
    nAryFormalRelationEClass.getESuperTypes().add(this.getPackageableElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getPackageableElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackage_Elements(), this.getPackageableElement(), null, "elements", null, 0, -1, br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(universalEClass, Universal.class, "Universal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUniversal_IsSpecializedVia(), this.getGeneralizationSet(), this.getGeneralizationSet_SpecializedUniversal(), "isSpecializedVia", null, 0, -1, Universal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getUniversal_SpecializesVia(), this.getGeneralizationSet(), this.getGeneralizationSet_SpecializingUniversals(), "specializesVia", null, 0, -1, Universal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralizationSet_IsCovering(), theEcorePackage.getEBoolean(), "isCovering", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralizationSet_SpecializedUniversal(), this.getUniversal(), this.getUniversal_IsSpecializedVia(), "specializedUniversal", null, 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralizationSet_SpecializingUniversals(), this.getUniversal(), this.getUniversal_SpecializesVia(), "specializingUniversals", null, 1, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveDataType__type(), this.getPrimitiveDataTypeType(), "_type", null, 1, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userDefinedDataTypeEClass, UserDefinedDataType.class, "UserDefinedDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(complexDataTypeEClass, ComplexDataType.class, "ComplexDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexDataType_Attributes(), this.getDataTypeAttribute(), this.getDataTypeAttribute_ComplexDataType(), "attributes", null, 2, -1, ComplexDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataTypeAttributeEClass, DataTypeAttribute.class, "DataTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeAttribute_IsOfType(), this.getDataType(), null, "isOfType", null, 1, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeAttribute_ComplexDataType(), this.getComplexDataType(), this.getComplexDataType_Attributes(), "complexDataType", null, 1, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumeration_EnumerationLiterals(), theEcorePackage.getEString(), "enumerationLiterals", null, 2, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(meronymicRelationEClass, MeronymicRelation.class, "MeronymicRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMeronymicRelation_Whole(), this.getSubstantialUniversal(), null, "whole", null, 1, 1, MeronymicRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeronymicRelation_Part(), this.getSubstantialUniversal(), null, "part", null, 1, 1, MeronymicRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeronymicRelation_PartIsEssential(), theEcorePackage.getEBoolean(), "partIsEssential", null, 1, 1, MeronymicRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeronymicRelation_PartIsInseparable(), theEcorePackage.getEBoolean(), "partIsInseparable", null, 1, 1, MeronymicRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeronymicRelation_PartIsShareable(), theEcorePackage.getEBoolean(), "partIsShareable", null, 1, 1, MeronymicRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeronymicRelation_PartIsImmutable(), theEcorePackage.getEBoolean(), "partIsImmutable", null, 1, 1, MeronymicRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentOfRelationEClass, ComponentOfRelation.class, "ComponentOfRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(membershipRelationEClass, MembershipRelation.class, "MembershipRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subCollectionRelationEClass, SubCollectionRelation.class, "SubCollectionRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subQuantityRelationEClass, SubQuantityRelation.class, "SubQuantityRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(endurantUniversalEClass, EndurantUniversal.class, "EndurantUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEndurantUniversal_CharacterizedBy(), this.getCharacterization(), this.getCharacterization_Source(), "characterizedBy", null, 0, -1, EndurantUniversal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(substantialUniversalEClass, SubstantialUniversal.class, "SubstantialUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sortalUniversalEClass, SortalUniversal.class, "SortalUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rigidSortalUniversalEClass, RigidSortalUniversal.class, "RigidSortalUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(antiRigidSortalUniversalEClass, AntiRigidSortalUniversal.class, "AntiRigidSortalUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(substanceSortalUniversalEClass, SubstanceSortalUniversal.class, "SubstanceSortalUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(kindEClass, Kind.class, "Kind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quantityUniversalEClass, QuantityUniversal.class, "QuantityUniversal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectiveUniversalEClass, CollectiveUniversal.class, "CollectiveUniversal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollectiveUniversal_IsExtensional(), theEcorePackage.getEBoolean(), "isExtensional", null, 1, 1, CollectiveUniversal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subKindEClass, SubKind.class, "SubKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(phaseEClass, Phase.class, "Phase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mixinUniversalEClass, MixinUniversal.class, "MixinUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rigidMixinUniversalEClass, RigidMixinUniversal.class, "RigidMixinUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nonRigidMixinUniversalEClass, NonRigidMixinUniversal.class, "NonRigidMixinUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(semiRigidMixinUniversalEClass, SemiRigidMixinUniversal.class, "SemiRigidMixinUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mixinEClass, Mixin.class, "Mixin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(antiRigidMixinUniversalEClass, AntiRigidMixinUniversal.class, "AntiRigidMixinUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleMixinEClass, RoleMixin.class, "RoleMixin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externallyDependentUniversalEClass, ExternallyDependentUniversal.class, "ExternallyDependentUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternallyDependentUniversal_Mediation(), this.getMediation(), this.getMediation_Target(), "mediation", null, 1, 1, ExternallyDependentUniversal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(momentUniversalEClass, MomentUniversal.class, "MomentUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relatorUniversalEClass, RelatorUniversal.class, "RelatorUniversal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelatorUniversal_Mediations(), this.getMediation(), this.getMediation_Source(), "mediations", null, 2, -1, RelatorUniversal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(binaryDirectedRelationshipEClass, BinaryDirectedRelationship.class, "BinaryDirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinaryDirectedRelationship_SourceEndName(), theEcorePackage.getEString(), "sourceEndName", null, 0, 1, BinaryDirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryDirectedRelationship_TargetEndName(), theEcorePackage.getEString(), "targetEndName", null, 0, 1, BinaryDirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryDirectedRelationship_SourceLowerBound(), theEcorePackage.getEInt(), "sourceLowerBound", null, 1, 1, BinaryDirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryDirectedRelationship_SourceUpperBound(), theEcorePackage.getEInt(), "sourceUpperBound", null, 1, 1, BinaryDirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryDirectedRelationship_TargetLowerBound(), theEcorePackage.getEInt(), "targetLowerBound", null, 1, 1, BinaryDirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinaryDirectedRelationship_TargetUpperBound(), theEcorePackage.getEInt(), "targetUpperBound", null, 1, 1, BinaryDirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryMaterialRelationEClass, BinaryMaterialRelation.class, "BinaryMaterialRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryMaterialRelation_DerivedFrom(), this.getRelatorUniversal(), null, "derivedFrom", null, 1, 1, BinaryMaterialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryMaterialRelation_Source(), this.getExternallyDependentUniversal(), null, "source", null, 1, 1, BinaryMaterialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryMaterialRelation_Target(), this.getExternallyDependentUniversal(), null, "target", null, 1, 1, BinaryMaterialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryFormalRelationEClass, BinaryFormalRelation.class, "BinaryFormalRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryFormalRelation_Source(), this.getUniversal(), null, "source", null, 1, 1, BinaryFormalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryFormalRelation_Target(), this.getUniversal(), null, "target", null, 1, 1, BinaryFormalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mediationEClass, Mediation.class, "Mediation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMediation_Source(), this.getRelatorUniversal(), this.getRelatorUniversal_Mediations(), "source", null, 1, 1, Mediation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMediation_Target(), this.getExternallyDependentUniversal(), this.getExternallyDependentUniversal_Mediation(), "target", null, 1, 1, Mediation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characterizationEClass, Characterization.class, "Characterization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharacterization_Source(), this.getEndurantUniversal(), this.getEndurantUniversal_CharacterizedBy(), "source", null, 1, 1, Characterization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCharacterization_Target(), this.getIntrinsicMomentUniversal(), this.getIntrinsicMomentUniversal_Characterization(), "target", null, 1, 1, Characterization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intrinsicMomentUniversalEClass, IntrinsicMomentUniversal.class, "IntrinsicMomentUniversal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntrinsicMomentUniversal_Characterization(), this.getCharacterization(), this.getCharacterization_Target(), "characterization", null, 1, 1, IntrinsicMomentUniversal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modeUniversalEClass, ModeUniversal.class, "ModeUniversal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qualityUniversalEClass, QualityUniversal.class, "QualityUniversal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualityUniversal_Datatypes(), this.getDataType(), null, "datatypes", null, 0, -1, QualityUniversal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(nAryMaterialRelationEClass, nAryMaterialRelation.class, "nAryMaterialRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getnAryMaterialRelation_DerivedFrom(), this.getRelatorUniversal(), null, "derivedFrom", null, 1, 1, nAryMaterialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnAryMaterialRelation_TargetRelata(), this.getExternallyDependentUniversal(), null, "targetRelata", null, 0, -1, nAryMaterialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAryMaterialRelation_TargetEndNames(), theEcorePackage.getEString(), "targetEndNames", null, 0, -1, nAryMaterialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAryMaterialRelation_SourceLowerBound(), theEcorePackage.getEInt(), "sourceLowerBound", null, 0, -1, nAryMaterialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAryMaterialRelation_SourceUpperBound(), theEcorePackage.getEInt(), "sourceUpperBound", null, 0, -1, nAryMaterialRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nAryFormalRelationEClass, nAryFormalRelation.class, "nAryFormalRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getnAryFormalRelation_TargetRelata(), this.getUniversal(), null, "targetRelata", null, 0, -1, nAryFormalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAryFormalRelation_TargetEndNames(), theEcorePackage.getEString(), "targetEndNames", null, 0, -1, nAryFormalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAryFormalRelation_SourceLowerBound(), theEcorePackage.getEInt(), "sourceLowerBound", null, 0, -1, nAryFormalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnAryFormalRelation_SourceUpperBound(), theEcorePackage.getEInt(), "sourceUpperBound", null, 0, -1, nAryFormalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(primitiveDataTypeTypeEEnum, PrimitiveDataTypeType.class, "PrimitiveDataTypeType");
    addEEnumLiteral(primitiveDataTypeTypeEEnum, PrimitiveDataTypeType.BOOLEAN);
    addEEnumLiteral(primitiveDataTypeTypeEEnum, PrimitiveDataTypeType.STRING);
    addEEnumLiteral(primitiveDataTypeTypeEEnum, PrimitiveDataTypeType.REAL);
    addEEnumLiteral(primitiveDataTypeTypeEEnum, PrimitiveDataTypeType.UNLIMITED_NATURAL);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";				
    addAnnotation
      (modelEClass, 
       source, 
       new String[] 
       {
       "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
       });
  }

} //PrimeOntoUMLPackageImpl
