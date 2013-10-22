/**
 */
package br.ufes.inf.nemo.ontouml.PrimeOntoUML.util;

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
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage
 * @generated
 */
public class PrimeOntoUMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PrimeOntoUMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimeOntoUMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PrimeOntoUMLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimeOntoUMLSwitch<Adapter> modelSwitch =
    new PrimeOntoUMLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter casePackageableElement(PackageableElement object)
      {
        return createPackageableElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter casePackage(br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseUniversal(Universal object)
      {
        return createUniversalAdapter();
      }
      @Override
      public Adapter caseGeneralizationSet(GeneralizationSet object)
      {
        return createGeneralizationSetAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter casePrimitiveDataType(PrimitiveDataType object)
      {
        return createPrimitiveDataTypeAdapter();
      }
      @Override
      public Adapter caseUserDefinedDataType(UserDefinedDataType object)
      {
        return createUserDefinedDataTypeAdapter();
      }
      @Override
      public Adapter caseComplexDataType(ComplexDataType object)
      {
        return createComplexDataTypeAdapter();
      }
      @Override
      public Adapter caseDataTypeAttribute(DataTypeAttribute object)
      {
        return createDataTypeAttributeAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseMeronymicRelation(MeronymicRelation object)
      {
        return createMeronymicRelationAdapter();
      }
      @Override
      public Adapter caseComponentOfRelation(ComponentOfRelation object)
      {
        return createComponentOfRelationAdapter();
      }
      @Override
      public Adapter caseMembershipRelation(MembershipRelation object)
      {
        return createMembershipRelationAdapter();
      }
      @Override
      public Adapter caseSubCollectionRelation(SubCollectionRelation object)
      {
        return createSubCollectionRelationAdapter();
      }
      @Override
      public Adapter caseSubQuantityRelation(SubQuantityRelation object)
      {
        return createSubQuantityRelationAdapter();
      }
      @Override
      public Adapter caseEndurantUniversal(EndurantUniversal object)
      {
        return createEndurantUniversalAdapter();
      }
      @Override
      public Adapter caseExternallyDependentUniversal(ExternallyDependentUniversal object)
      {
        return createExternallyDependentUniversalAdapter();
      }
      @Override
      public Adapter caseSubstantialUniversal(SubstantialUniversal object)
      {
        return createSubstantialUniversalAdapter();
      }
      @Override
      public Adapter caseSortalUniversal(SortalUniversal object)
      {
        return createSortalUniversalAdapter();
      }
      @Override
      public Adapter caseRigidSortalUniversal(RigidSortalUniversal object)
      {
        return createRigidSortalUniversalAdapter();
      }
      @Override
      public Adapter caseAntiRigidSortalUniversal(AntiRigidSortalUniversal object)
      {
        return createAntiRigidSortalUniversalAdapter();
      }
      @Override
      public Adapter caseSubstanceSortalUniversal(SubstanceSortalUniversal object)
      {
        return createSubstanceSortalUniversalAdapter();
      }
      @Override
      public Adapter caseKind(Kind object)
      {
        return createKindAdapter();
      }
      @Override
      public Adapter caseQuantityUniversal(QuantityUniversal object)
      {
        return createQuantityUniversalAdapter();
      }
      @Override
      public Adapter caseCollectiveUniversal(CollectiveUniversal object)
      {
        return createCollectiveUniversalAdapter();
      }
      @Override
      public Adapter caseSubKind(SubKind object)
      {
        return createSubKindAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter casePhase(Phase object)
      {
        return createPhaseAdapter();
      }
      @Override
      public Adapter caseMixinUniversal(MixinUniversal object)
      {
        return createMixinUniversalAdapter();
      }
      @Override
      public Adapter caseRigidMixinUniversal(RigidMixinUniversal object)
      {
        return createRigidMixinUniversalAdapter();
      }
      @Override
      public Adapter caseCategory(Category object)
      {
        return createCategoryAdapter();
      }
      @Override
      public Adapter caseNonRigidMixinUniversal(NonRigidMixinUniversal object)
      {
        return createNonRigidMixinUniversalAdapter();
      }
      @Override
      public Adapter caseSemiRigidMixinUniversal(SemiRigidMixinUniversal object)
      {
        return createSemiRigidMixinUniversalAdapter();
      }
      @Override
      public Adapter caseMixin(Mixin object)
      {
        return createMixinAdapter();
      }
      @Override
      public Adapter caseAntiRigidMixinUniversal(AntiRigidMixinUniversal object)
      {
        return createAntiRigidMixinUniversalAdapter();
      }
      @Override
      public Adapter caseRoleMixin(RoleMixin object)
      {
        return createRoleMixinAdapter();
      }
      @Override
      public Adapter caseMomentUniversal(MomentUniversal object)
      {
        return createMomentUniversalAdapter();
      }
      @Override
      public Adapter caseRelatorUniversal(RelatorUniversal object)
      {
        return createRelatorUniversalAdapter();
      }
      @Override
      public Adapter caseBinaryDirectedRelationship(BinaryDirectedRelationship object)
      {
        return createBinaryDirectedRelationshipAdapter();
      }
      @Override
      public Adapter caseBinaryMaterialRelation(BinaryMaterialRelation object)
      {
        return createBinaryMaterialRelationAdapter();
      }
      @Override
      public Adapter caseBinaryFormalRelation(BinaryFormalRelation object)
      {
        return createBinaryFormalRelationAdapter();
      }
      @Override
      public Adapter caseMediation(Mediation object)
      {
        return createMediationAdapter();
      }
      @Override
      public Adapter caseCharacterization(Characterization object)
      {
        return createCharacterizationAdapter();
      }
      @Override
      public Adapter caseIntrinsicMomentUniversal(IntrinsicMomentUniversal object)
      {
        return createIntrinsicMomentUniversalAdapter();
      }
      @Override
      public Adapter caseModeUniversal(ModeUniversal object)
      {
        return createModeUniversalAdapter();
      }
      @Override
      public Adapter caseQualityUniversal(QualityUniversal object)
      {
        return createQualityUniversalAdapter();
      }
      @Override
      public Adapter casenAryMaterialRelation(nAryMaterialRelation object)
      {
        return createnAryMaterialRelationAdapter();
      }
      @Override
      public Adapter casenAryFormalRelation(nAryFormalRelation object)
      {
        return createnAryFormalRelationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement <em>Packageable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PackageableElement
   * @generated
   */
  public Adapter createPackageableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal <em>Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Universal
   * @generated
   */
  public Adapter createUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet <em>Generalization Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.GeneralizationSet
   * @generated
   */
  public Adapter createGeneralizationSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType <em>Primitive Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType
   * @generated
   */
  public Adapter createPrimitiveDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.UserDefinedDataType <em>User Defined Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.UserDefinedDataType
   * @generated
   */
  public Adapter createUserDefinedDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType <em>Complex Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComplexDataType
   * @generated
   */
  public Adapter createComplexDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute <em>Data Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.DataTypeAttribute
   * @generated
   */
  public Adapter createDataTypeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation <em>Meronymic Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MeronymicRelation
   * @generated
   */
  public Adapter createMeronymicRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation <em>Component Of Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ComponentOfRelation
   * @generated
   */
  public Adapter createComponentOfRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation <em>Membership Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MembershipRelation
   * @generated
   */
  public Adapter createMembershipRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation <em>Sub Collection Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubCollectionRelation
   * @generated
   */
  public Adapter createSubCollectionRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation <em>Sub Quantity Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubQuantityRelation
   * @generated
   */
  public Adapter createSubQuantityRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal <em>Endurant Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.EndurantUniversal
   * @generated
   */
  public Adapter createEndurantUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal <em>Externally Dependent Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ExternallyDependentUniversal
   * @generated
   */
  public Adapter createExternallyDependentUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstantialUniversal <em>Substantial Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstantialUniversal
   * @generated
   */
  public Adapter createSubstantialUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SortalUniversal <em>Sortal Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SortalUniversal
   * @generated
   */
  public Adapter createSortalUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidSortalUniversal <em>Rigid Sortal Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidSortalUniversal
   * @generated
   */
  public Adapter createRigidSortalUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidSortalUniversal <em>Anti Rigid Sortal Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidSortalUniversal
   * @generated
   */
  public Adapter createAntiRigidSortalUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstanceSortalUniversal <em>Substance Sortal Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubstanceSortalUniversal
   * @generated
   */
  public Adapter createSubstanceSortalUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Kind
   * @generated
   */
  public Adapter createKindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal <em>Quantity Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.QuantityUniversal
   * @generated
   */
  public Adapter createQuantityUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal <em>Collective Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.CollectiveUniversal
   * @generated
   */
  public Adapter createCollectiveUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind <em>Sub Kind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SubKind
   * @generated
   */
  public Adapter createSubKindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase
   * @generated
   */
  public Adapter createPhaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MixinUniversal <em>Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MixinUniversal
   * @generated
   */
  public Adapter createMixinUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidMixinUniversal <em>Rigid Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RigidMixinUniversal
   * @generated
   */
  public Adapter createRigidMixinUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Category
   * @generated
   */
  public Adapter createCategoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.NonRigidMixinUniversal <em>Non Rigid Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.NonRigidMixinUniversal
   * @generated
   */
  public Adapter createNonRigidMixinUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.SemiRigidMixinUniversal <em>Semi Rigid Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.SemiRigidMixinUniversal
   * @generated
   */
  public Adapter createSemiRigidMixinUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin <em>Mixin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin
   * @generated
   */
  public Adapter createMixinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidMixinUniversal <em>Anti Rigid Mixin Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.AntiRigidMixinUniversal
   * @generated
   */
  public Adapter createAntiRigidMixinUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin <em>Role Mixin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RoleMixin
   * @generated
   */
  public Adapter createRoleMixinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.MomentUniversal <em>Moment Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.MomentUniversal
   * @generated
   */
  public Adapter createMomentUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal <em>Relator Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.RelatorUniversal
   * @generated
   */
  public Adapter createRelatorUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship <em>Binary Directed Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryDirectedRelationship
   * @generated
   */
  public Adapter createBinaryDirectedRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation <em>Binary Material Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryMaterialRelation
   * @generated
   */
  public Adapter createBinaryMaterialRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation <em>Binary Formal Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.BinaryFormalRelation
   * @generated
   */
  public Adapter createBinaryFormalRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation <em>Mediation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mediation
   * @generated
   */
  public Adapter createMediationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization <em>Characterization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.Characterization
   * @generated
   */
  public Adapter createCharacterizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal <em>Intrinsic Moment Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.IntrinsicMomentUniversal
   * @generated
   */
  public Adapter createIntrinsicMomentUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal <em>Mode Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal
   * @generated
   */
  public Adapter createModeUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal <em>Quality Universal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.QualityUniversal
   * @generated
   */
  public Adapter createQualityUniversalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation <em>nAry Material Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryMaterialRelation
   * @generated
   */
  public Adapter createnAryMaterialRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation <em>nAry Formal Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.nAryFormalRelation
   * @generated
   */
  public Adapter createnAryFormalRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PrimeOntoUMLAdapterFactory
