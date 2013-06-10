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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage
 * @generated
 */
public class PrimeOntoUMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PrimeOntoUMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimeOntoUMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PrimeOntoUMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PrimeOntoUMLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.PACKAGEABLE_ELEMENT:
      {
        PackageableElement packageableElement = (PackageableElement)theEObject;
        T result = casePackageableElement(packageableElement);
        if (result == null) result = caseElement(packageableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = caseElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.PACKAGE:
      {
        br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package package_ = (br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseNamedElement(package_);
        if (result == null) result = casePackageableElement(package_);
        if (result == null) result = caseElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.UNIVERSAL:
      {
        Universal universal = (Universal)theEObject;
        T result = caseUniversal(universal);
        if (result == null) result = caseNamedElement(universal);
        if (result == null) result = casePackageableElement(universal);
        if (result == null) result = caseElement(universal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.GENERALIZATION_SET:
      {
        GeneralizationSet generalizationSet = (GeneralizationSet)theEObject;
        T result = caseGeneralizationSet(generalizationSet);
        if (result == null) result = caseNamedElement(generalizationSet);
        if (result == null) result = casePackageableElement(generalizationSet);
        if (result == null) result = caseElement(generalizationSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseNamedElement(dataType);
        if (result == null) result = casePackageableElement(dataType);
        if (result == null) result = caseElement(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.PRIMITIVE_DATA_TYPE:
      {
        PrimitiveDataType primitiveDataType = (PrimitiveDataType)theEObject;
        T result = casePrimitiveDataType(primitiveDataType);
        if (result == null) result = caseDataType(primitiveDataType);
        if (result == null) result = caseNamedElement(primitiveDataType);
        if (result == null) result = casePackageableElement(primitiveDataType);
        if (result == null) result = caseElement(primitiveDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.USER_DEFINED_DATA_TYPE:
      {
        UserDefinedDataType userDefinedDataType = (UserDefinedDataType)theEObject;
        T result = caseUserDefinedDataType(userDefinedDataType);
        if (result == null) result = caseDataType(userDefinedDataType);
        if (result == null) result = caseNamedElement(userDefinedDataType);
        if (result == null) result = casePackageableElement(userDefinedDataType);
        if (result == null) result = caseElement(userDefinedDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.COMPLEX_DATA_TYPE:
      {
        ComplexDataType complexDataType = (ComplexDataType)theEObject;
        T result = caseComplexDataType(complexDataType);
        if (result == null) result = caseUserDefinedDataType(complexDataType);
        if (result == null) result = caseDataType(complexDataType);
        if (result == null) result = caseNamedElement(complexDataType);
        if (result == null) result = casePackageableElement(complexDataType);
        if (result == null) result = caseElement(complexDataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE:
      {
        DataTypeAttribute dataTypeAttribute = (DataTypeAttribute)theEObject;
        T result = caseDataTypeAttribute(dataTypeAttribute);
        if (result == null) result = caseNamedElement(dataTypeAttribute);
        if (result == null) result = caseElement(dataTypeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseUserDefinedDataType(enumeration);
        if (result == null) result = caseDataType(enumeration);
        if (result == null) result = caseNamedElement(enumeration);
        if (result == null) result = casePackageableElement(enumeration);
        if (result == null) result = caseElement(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.MERONYMIC_RELATION:
      {
        MeronymicRelation meronymicRelation = (MeronymicRelation)theEObject;
        T result = caseMeronymicRelation(meronymicRelation);
        if (result == null) result = casePackageableElement(meronymicRelation);
        if (result == null) result = caseBinaryDirectedRelationship(meronymicRelation);
        if (result == null) result = caseElement(meronymicRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.COMPONENT_OF_RELATION:
      {
        ComponentOfRelation componentOfRelation = (ComponentOfRelation)theEObject;
        T result = caseComponentOfRelation(componentOfRelation);
        if (result == null) result = caseMeronymicRelation(componentOfRelation);
        if (result == null) result = casePackageableElement(componentOfRelation);
        if (result == null) result = caseBinaryDirectedRelationship(componentOfRelation);
        if (result == null) result = caseElement(componentOfRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.MEMBERSHIP_RELATION:
      {
        MembershipRelation membershipRelation = (MembershipRelation)theEObject;
        T result = caseMembershipRelation(membershipRelation);
        if (result == null) result = caseMeronymicRelation(membershipRelation);
        if (result == null) result = casePackageableElement(membershipRelation);
        if (result == null) result = caseBinaryDirectedRelationship(membershipRelation);
        if (result == null) result = caseElement(membershipRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.SUB_COLLECTION_RELATION:
      {
        SubCollectionRelation subCollectionRelation = (SubCollectionRelation)theEObject;
        T result = caseSubCollectionRelation(subCollectionRelation);
        if (result == null) result = caseMeronymicRelation(subCollectionRelation);
        if (result == null) result = casePackageableElement(subCollectionRelation);
        if (result == null) result = caseBinaryDirectedRelationship(subCollectionRelation);
        if (result == null) result = caseElement(subCollectionRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.SUB_QUANTITY_RELATION:
      {
        SubQuantityRelation subQuantityRelation = (SubQuantityRelation)theEObject;
        T result = caseSubQuantityRelation(subQuantityRelation);
        if (result == null) result = caseMeronymicRelation(subQuantityRelation);
        if (result == null) result = casePackageableElement(subQuantityRelation);
        if (result == null) result = caseBinaryDirectedRelationship(subQuantityRelation);
        if (result == null) result = caseElement(subQuantityRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.ENDURANT_UNIVERSAL:
      {
        EndurantUniversal endurantUniversal = (EndurantUniversal)theEObject;
        T result = caseEndurantUniversal(endurantUniversal);
        if (result == null) result = caseUniversal(endurantUniversal);
        if (result == null) result = caseNamedElement(endurantUniversal);
        if (result == null) result = casePackageableElement(endurantUniversal);
        if (result == null) result = caseElement(endurantUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.EXTERNALLY_DEPENDENT_UNIVERSAL:
      {
        ExternallyDependentUniversal externallyDependentUniversal = (ExternallyDependentUniversal)theEObject;
        T result = caseExternallyDependentUniversal(externallyDependentUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.SUBSTANTIAL_UNIVERSAL:
      {
        SubstantialUniversal substantialUniversal = (SubstantialUniversal)theEObject;
        T result = caseSubstantialUniversal(substantialUniversal);
        if (result == null) result = caseEndurantUniversal(substantialUniversal);
        if (result == null) result = caseUniversal(substantialUniversal);
        if (result == null) result = caseNamedElement(substantialUniversal);
        if (result == null) result = casePackageableElement(substantialUniversal);
        if (result == null) result = caseElement(substantialUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.SORTAL_UNIVERSAL:
      {
        SortalUniversal sortalUniversal = (SortalUniversal)theEObject;
        T result = caseSortalUniversal(sortalUniversal);
        if (result == null) result = caseSubstantialUniversal(sortalUniversal);
        if (result == null) result = caseEndurantUniversal(sortalUniversal);
        if (result == null) result = caseUniversal(sortalUniversal);
        if (result == null) result = caseNamedElement(sortalUniversal);
        if (result == null) result = casePackageableElement(sortalUniversal);
        if (result == null) result = caseElement(sortalUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.RIGID_SORTAL_UNIVERSAL:
      {
        RigidSortalUniversal rigidSortalUniversal = (RigidSortalUniversal)theEObject;
        T result = caseRigidSortalUniversal(rigidSortalUniversal);
        if (result == null) result = caseSortalUniversal(rigidSortalUniversal);
        if (result == null) result = caseSubstantialUniversal(rigidSortalUniversal);
        if (result == null) result = caseEndurantUniversal(rigidSortalUniversal);
        if (result == null) result = caseUniversal(rigidSortalUniversal);
        if (result == null) result = caseNamedElement(rigidSortalUniversal);
        if (result == null) result = casePackageableElement(rigidSortalUniversal);
        if (result == null) result = caseElement(rigidSortalUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.ANTI_RIGID_SORTAL_UNIVERSAL:
      {
        AntiRigidSortalUniversal antiRigidSortalUniversal = (AntiRigidSortalUniversal)theEObject;
        T result = caseAntiRigidSortalUniversal(antiRigidSortalUniversal);
        if (result == null) result = caseSortalUniversal(antiRigidSortalUniversal);
        if (result == null) result = caseSubstantialUniversal(antiRigidSortalUniversal);
        if (result == null) result = caseEndurantUniversal(antiRigidSortalUniversal);
        if (result == null) result = caseUniversal(antiRigidSortalUniversal);
        if (result == null) result = caseNamedElement(antiRigidSortalUniversal);
        if (result == null) result = casePackageableElement(antiRigidSortalUniversal);
        if (result == null) result = caseElement(antiRigidSortalUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.SUBSTANCE_SORTAL_UNIVERSAL:
      {
        SubstanceSortalUniversal substanceSortalUniversal = (SubstanceSortalUniversal)theEObject;
        T result = caseSubstanceSortalUniversal(substanceSortalUniversal);
        if (result == null) result = caseRigidSortalUniversal(substanceSortalUniversal);
        if (result == null) result = caseSortalUniversal(substanceSortalUniversal);
        if (result == null) result = caseSubstantialUniversal(substanceSortalUniversal);
        if (result == null) result = caseEndurantUniversal(substanceSortalUniversal);
        if (result == null) result = caseUniversal(substanceSortalUniversal);
        if (result == null) result = caseNamedElement(substanceSortalUniversal);
        if (result == null) result = casePackageableElement(substanceSortalUniversal);
        if (result == null) result = caseElement(substanceSortalUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.KIND:
      {
        Kind kind = (Kind)theEObject;
        T result = caseKind(kind);
        if (result == null) result = caseSubstanceSortalUniversal(kind);
        if (result == null) result = caseRigidSortalUniversal(kind);
        if (result == null) result = caseSortalUniversal(kind);
        if (result == null) result = caseSubstantialUniversal(kind);
        if (result == null) result = caseEndurantUniversal(kind);
        if (result == null) result = caseUniversal(kind);
        if (result == null) result = caseNamedElement(kind);
        if (result == null) result = casePackageableElement(kind);
        if (result == null) result = caseElement(kind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.QUANTITY_UNIVERSAL:
      {
        QuantityUniversal quantityUniversal = (QuantityUniversal)theEObject;
        T result = caseQuantityUniversal(quantityUniversal);
        if (result == null) result = caseSubstanceSortalUniversal(quantityUniversal);
        if (result == null) result = caseRigidSortalUniversal(quantityUniversal);
        if (result == null) result = caseSortalUniversal(quantityUniversal);
        if (result == null) result = caseSubstantialUniversal(quantityUniversal);
        if (result == null) result = caseEndurantUniversal(quantityUniversal);
        if (result == null) result = caseUniversal(quantityUniversal);
        if (result == null) result = caseNamedElement(quantityUniversal);
        if (result == null) result = casePackageableElement(quantityUniversal);
        if (result == null) result = caseElement(quantityUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.COLLECTIVE_UNIVERSAL:
      {
        CollectiveUniversal collectiveUniversal = (CollectiveUniversal)theEObject;
        T result = caseCollectiveUniversal(collectiveUniversal);
        if (result == null) result = caseSubstanceSortalUniversal(collectiveUniversal);
        if (result == null) result = caseRigidSortalUniversal(collectiveUniversal);
        if (result == null) result = caseSortalUniversal(collectiveUniversal);
        if (result == null) result = caseSubstantialUniversal(collectiveUniversal);
        if (result == null) result = caseEndurantUniversal(collectiveUniversal);
        if (result == null) result = caseUniversal(collectiveUniversal);
        if (result == null) result = caseNamedElement(collectiveUniversal);
        if (result == null) result = casePackageableElement(collectiveUniversal);
        if (result == null) result = caseElement(collectiveUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.SUB_KIND:
      {
        SubKind subKind = (SubKind)theEObject;
        T result = caseSubKind(subKind);
        if (result == null) result = caseRigidSortalUniversal(subKind);
        if (result == null) result = caseSortalUniversal(subKind);
        if (result == null) result = caseSubstantialUniversal(subKind);
        if (result == null) result = caseEndurantUniversal(subKind);
        if (result == null) result = caseUniversal(subKind);
        if (result == null) result = caseNamedElement(subKind);
        if (result == null) result = casePackageableElement(subKind);
        if (result == null) result = caseElement(subKind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = caseAntiRigidSortalUniversal(role);
        if (result == null) result = caseExternallyDependentUniversal(role);
        if (result == null) result = caseSortalUniversal(role);
        if (result == null) result = caseSubstantialUniversal(role);
        if (result == null) result = caseEndurantUniversal(role);
        if (result == null) result = caseUniversal(role);
        if (result == null) result = caseNamedElement(role);
        if (result == null) result = casePackageableElement(role);
        if (result == null) result = caseElement(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.PHASE:
      {
        Phase phase = (Phase)theEObject;
        T result = casePhase(phase);
        if (result == null) result = caseAntiRigidSortalUniversal(phase);
        if (result == null) result = caseSortalUniversal(phase);
        if (result == null) result = caseSubstantialUniversal(phase);
        if (result == null) result = caseEndurantUniversal(phase);
        if (result == null) result = caseUniversal(phase);
        if (result == null) result = caseNamedElement(phase);
        if (result == null) result = casePackageableElement(phase);
        if (result == null) result = caseElement(phase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.MIXIN_UNIVERSAL:
      {
        MixinUniversal mixinUniversal = (MixinUniversal)theEObject;
        T result = caseMixinUniversal(mixinUniversal);
        if (result == null) result = caseUniversal(mixinUniversal);
        if (result == null) result = caseNamedElement(mixinUniversal);
        if (result == null) result = casePackageableElement(mixinUniversal);
        if (result == null) result = caseElement(mixinUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.RIGID_MIXIN_UNIVERSAL:
      {
        RigidMixinUniversal rigidMixinUniversal = (RigidMixinUniversal)theEObject;
        T result = caseRigidMixinUniversal(rigidMixinUniversal);
        if (result == null) result = caseMixinUniversal(rigidMixinUniversal);
        if (result == null) result = caseUniversal(rigidMixinUniversal);
        if (result == null) result = caseNamedElement(rigidMixinUniversal);
        if (result == null) result = casePackageableElement(rigidMixinUniversal);
        if (result == null) result = caseElement(rigidMixinUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.CATEGORY:
      {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = caseRigidMixinUniversal(category);
        if (result == null) result = caseMixinUniversal(category);
        if (result == null) result = caseUniversal(category);
        if (result == null) result = caseNamedElement(category);
        if (result == null) result = casePackageableElement(category);
        if (result == null) result = caseElement(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.NON_RIGID_MIXIN_UNIVERSAL:
      {
        NonRigidMixinUniversal nonRigidMixinUniversal = (NonRigidMixinUniversal)theEObject;
        T result = caseNonRigidMixinUniversal(nonRigidMixinUniversal);
        if (result == null) result = caseMixinUniversal(nonRigidMixinUniversal);
        if (result == null) result = caseUniversal(nonRigidMixinUniversal);
        if (result == null) result = caseNamedElement(nonRigidMixinUniversal);
        if (result == null) result = casePackageableElement(nonRigidMixinUniversal);
        if (result == null) result = caseElement(nonRigidMixinUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.SEMI_RIGID_MIXIN_UNIVERSAL:
      {
        SemiRigidMixinUniversal semiRigidMixinUniversal = (SemiRigidMixinUniversal)theEObject;
        T result = caseSemiRigidMixinUniversal(semiRigidMixinUniversal);
        if (result == null) result = caseNonRigidMixinUniversal(semiRigidMixinUniversal);
        if (result == null) result = caseMixinUniversal(semiRigidMixinUniversal);
        if (result == null) result = caseUniversal(semiRigidMixinUniversal);
        if (result == null) result = caseNamedElement(semiRigidMixinUniversal);
        if (result == null) result = casePackageableElement(semiRigidMixinUniversal);
        if (result == null) result = caseElement(semiRigidMixinUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.MIXIN:
      {
        Mixin mixin = (Mixin)theEObject;
        T result = caseMixin(mixin);
        if (result == null) result = caseSemiRigidMixinUniversal(mixin);
        if (result == null) result = caseNonRigidMixinUniversal(mixin);
        if (result == null) result = caseMixinUniversal(mixin);
        if (result == null) result = caseUniversal(mixin);
        if (result == null) result = caseNamedElement(mixin);
        if (result == null) result = casePackageableElement(mixin);
        if (result == null) result = caseElement(mixin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.ANTI_RIGID_MIXIN_UNIVERSAL:
      {
        AntiRigidMixinUniversal antiRigidMixinUniversal = (AntiRigidMixinUniversal)theEObject;
        T result = caseAntiRigidMixinUniversal(antiRigidMixinUniversal);
        if (result == null) result = caseNonRigidMixinUniversal(antiRigidMixinUniversal);
        if (result == null) result = caseMixinUniversal(antiRigidMixinUniversal);
        if (result == null) result = caseUniversal(antiRigidMixinUniversal);
        if (result == null) result = caseNamedElement(antiRigidMixinUniversal);
        if (result == null) result = casePackageableElement(antiRigidMixinUniversal);
        if (result == null) result = caseElement(antiRigidMixinUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.ROLE_MIXIN:
      {
        RoleMixin roleMixin = (RoleMixin)theEObject;
        T result = caseRoleMixin(roleMixin);
        if (result == null) result = caseAntiRigidMixinUniversal(roleMixin);
        if (result == null) result = caseExternallyDependentUniversal(roleMixin);
        if (result == null) result = caseNonRigidMixinUniversal(roleMixin);
        if (result == null) result = caseMixinUniversal(roleMixin);
        if (result == null) result = caseUniversal(roleMixin);
        if (result == null) result = caseNamedElement(roleMixin);
        if (result == null) result = casePackageableElement(roleMixin);
        if (result == null) result = caseElement(roleMixin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.MOMENT_UNIVERSAL:
      {
        MomentUniversal momentUniversal = (MomentUniversal)theEObject;
        T result = caseMomentUniversal(momentUniversal);
        if (result == null) result = caseEndurantUniversal(momentUniversal);
        if (result == null) result = caseUniversal(momentUniversal);
        if (result == null) result = caseNamedElement(momentUniversal);
        if (result == null) result = casePackageableElement(momentUniversal);
        if (result == null) result = caseElement(momentUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.RELATOR_UNIVERSAL:
      {
        RelatorUniversal relatorUniversal = (RelatorUniversal)theEObject;
        T result = caseRelatorUniversal(relatorUniversal);
        if (result == null) result = caseMomentUniversal(relatorUniversal);
        if (result == null) result = caseEndurantUniversal(relatorUniversal);
        if (result == null) result = caseUniversal(relatorUniversal);
        if (result == null) result = caseNamedElement(relatorUniversal);
        if (result == null) result = casePackageableElement(relatorUniversal);
        if (result == null) result = caseElement(relatorUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.BINARY_DIRECTED_RELATIONSHIP:
      {
        BinaryDirectedRelationship binaryDirectedRelationship = (BinaryDirectedRelationship)theEObject;
        T result = caseBinaryDirectedRelationship(binaryDirectedRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION:
      {
        BinaryMaterialRelation binaryMaterialRelation = (BinaryMaterialRelation)theEObject;
        T result = caseBinaryMaterialRelation(binaryMaterialRelation);
        if (result == null) result = caseBinaryDirectedRelationship(binaryMaterialRelation);
        if (result == null) result = caseNamedElement(binaryMaterialRelation);
        if (result == null) result = casePackageableElement(binaryMaterialRelation);
        if (result == null) result = caseElement(binaryMaterialRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.BINARY_FORMAL_RELATION:
      {
        BinaryFormalRelation binaryFormalRelation = (BinaryFormalRelation)theEObject;
        T result = caseBinaryFormalRelation(binaryFormalRelation);
        if (result == null) result = caseBinaryDirectedRelationship(binaryFormalRelation);
        if (result == null) result = caseNamedElement(binaryFormalRelation);
        if (result == null) result = casePackageableElement(binaryFormalRelation);
        if (result == null) result = caseElement(binaryFormalRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.MEDIATION:
      {
        Mediation mediation = (Mediation)theEObject;
        T result = caseMediation(mediation);
        if (result == null) result = caseBinaryDirectedRelationship(mediation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.CHARACTERIZATION:
      {
        Characterization characterization = (Characterization)theEObject;
        T result = caseCharacterization(characterization);
        if (result == null) result = caseBinaryDirectedRelationship(characterization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.INTRINSIC_MOMENT_UNIVERSAL:
      {
        IntrinsicMomentUniversal intrinsicMomentUniversal = (IntrinsicMomentUniversal)theEObject;
        T result = caseIntrinsicMomentUniversal(intrinsicMomentUniversal);
        if (result == null) result = caseMomentUniversal(intrinsicMomentUniversal);
        if (result == null) result = caseEndurantUniversal(intrinsicMomentUniversal);
        if (result == null) result = caseUniversal(intrinsicMomentUniversal);
        if (result == null) result = caseNamedElement(intrinsicMomentUniversal);
        if (result == null) result = casePackageableElement(intrinsicMomentUniversal);
        if (result == null) result = caseElement(intrinsicMomentUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.MODE_UNIVERSAL:
      {
        ModeUniversal modeUniversal = (ModeUniversal)theEObject;
        T result = caseModeUniversal(modeUniversal);
        if (result == null) result = caseIntrinsicMomentUniversal(modeUniversal);
        if (result == null) result = caseMomentUniversal(modeUniversal);
        if (result == null) result = caseEndurantUniversal(modeUniversal);
        if (result == null) result = caseUniversal(modeUniversal);
        if (result == null) result = caseNamedElement(modeUniversal);
        if (result == null) result = casePackageableElement(modeUniversal);
        if (result == null) result = caseElement(modeUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.QUALITY_UNIVERSAL:
      {
        QualityUniversal qualityUniversal = (QualityUniversal)theEObject;
        T result = caseQualityUniversal(qualityUniversal);
        if (result == null) result = caseIntrinsicMomentUniversal(qualityUniversal);
        if (result == null) result = caseMomentUniversal(qualityUniversal);
        if (result == null) result = caseEndurantUniversal(qualityUniversal);
        if (result == null) result = caseUniversal(qualityUniversal);
        if (result == null) result = caseNamedElement(qualityUniversal);
        if (result == null) result = casePackageableElement(qualityUniversal);
        if (result == null) result = caseElement(qualityUniversal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION:
      {
        nAryMaterialRelation nAryMaterialRelation = (nAryMaterialRelation)theEObject;
        T result = casenAryMaterialRelation(nAryMaterialRelation);
        if (result == null) result = caseNamedElement(nAryMaterialRelation);
        if (result == null) result = casePackageableElement(nAryMaterialRelation);
        if (result == null) result = caseElement(nAryMaterialRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PrimeOntoUMLPackage.NARY_FORMAL_RELATION:
      {
        nAryFormalRelation nAryFormalRelation = (nAryFormalRelation)theEObject;
        T result = casenAryFormalRelation(nAryFormalRelation);
        if (result == null) result = caseNamedElement(nAryFormalRelation);
        if (result == null) result = casePackageableElement(nAryFormalRelation);
        if (result == null) result = caseElement(nAryFormalRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageableElement(PackageableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniversal(Universal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralizationSet(GeneralizationSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveDataType(PrimitiveDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Defined Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Defined Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserDefinedDataType(UserDefinedDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexDataType(ComplexDataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeAttribute(DataTypeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meronymic Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meronymic Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeronymicRelation(MeronymicRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Of Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Of Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentOfRelation(ComponentOfRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Membership Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Membership Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMembershipRelation(MembershipRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Collection Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Collection Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubCollectionRelation(SubCollectionRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Quantity Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Quantity Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubQuantityRelation(SubQuantityRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Endurant Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Endurant Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndurantUniversal(EndurantUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substantial Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substantial Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstantialUniversal(SubstantialUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sortal Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sortal Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortalUniversal(SortalUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rigid Sortal Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rigid Sortal Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRigidSortalUniversal(RigidSortalUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anti Rigid Sortal Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anti Rigid Sortal Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAntiRigidSortalUniversal(AntiRigidSortalUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substance Sortal Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substance Sortal Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstanceSortalUniversal(SubstanceSortalUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKind(Kind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantity Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantity Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantityUniversal(QuantityUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collective Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collective Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectiveUniversal(CollectiveUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Kind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Kind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubKind(SubKind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhase(Phase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mixin Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mixin Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMixinUniversal(MixinUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rigid Mixin Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rigid Mixin Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRigidMixinUniversal(RigidMixinUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategory(Category object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Rigid Mixin Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Rigid Mixin Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonRigidMixinUniversal(NonRigidMixinUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semi Rigid Mixin Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semi Rigid Mixin Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemiRigidMixinUniversal(SemiRigidMixinUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mixin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mixin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMixin(Mixin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anti Rigid Mixin Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anti Rigid Mixin Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAntiRigidMixinUniversal(AntiRigidMixinUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Mixin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Mixin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleMixin(RoleMixin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Externally Dependent Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Externally Dependent Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternallyDependentUniversal(ExternallyDependentUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Moment Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Moment Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMomentUniversal(MomentUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relator Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relator Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelatorUniversal(RelatorUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Directed Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Directed Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryDirectedRelationship(BinaryDirectedRelationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Material Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Material Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryMaterialRelation(BinaryMaterialRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Formal Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Formal Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryFormalRelation(BinaryFormalRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mediation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mediation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMediation(Mediation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Characterization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Characterization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacterization(Characterization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intrinsic Moment Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intrinsic Moment Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntrinsicMomentUniversal(IntrinsicMomentUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mode Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mode Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModeUniversal(ModeUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quality Universal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quality Universal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualityUniversal(QualityUniversal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nAry Material Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nAry Material Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenAryMaterialRelation(nAryMaterialRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nAry Formal Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nAry Formal Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenAryFormalRelation(nAryFormalRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PrimeOntoUMLSwitch
