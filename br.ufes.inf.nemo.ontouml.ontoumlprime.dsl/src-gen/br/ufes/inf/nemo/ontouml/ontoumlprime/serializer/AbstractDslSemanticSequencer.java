package br.ufes.inf.nemo.ontouml.ontoumlprime.serializer;

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
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Mixin;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.ModeUniversal;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Model;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.Phase;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimitiveDataType;
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
import br.ufes.inf.nemo.ontouml.ontoumlprime.services.DslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PrimeOntoUMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PrimeOntoUMLPackage.BINARY_FORMAL_RELATION:
				if(context == grammarAccess.getBinaryFormalRelationRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_BinaryFormalRelation(context, (BinaryFormalRelation) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.BINARY_MATERIAL_RELATION:
				if(context == grammarAccess.getBinaryMaterialRelationRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_BinaryMaterialRelation(context, (BinaryMaterialRelation) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.CATEGORY:
				if(context == grammarAccess.getCategoryRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_Category(context, (Category) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.CHARACTERIZATION:
				if(context == grammarAccess.getCharacterizationRule()) {
					sequence_Characterization(context, (Characterization) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.COLLECTIVE_UNIVERSAL:
				if(context == grammarAccess.getCollectiveUniversalRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_CollectiveUniversal(context, (CollectiveUniversal) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.COMPLEX_DATA_TYPE:
				if(context == grammarAccess.getComplexDataTypeRule() ||
				   context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_ComplexDataType(context, (ComplexDataType) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.COMPONENT_OF_RELATION:
				if(context == grammarAccess.getComponentOfRelationRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMeronymicRelationRule()) {
					sequence_ComponentOfRelation(context, (ComponentOfRelation) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.DATA_TYPE_ATTRIBUTE:
				if(context == grammarAccess.getDataTypeAttributeRule()) {
					sequence_DataTypeAttribute(context, (DataTypeAttribute) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.ENUMERATION:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEnumerationRule()) {
					sequence_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.GENERALIZATION_SET:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getGeneralizationSetRule()) {
					sequence_AnonymousGeneralizationSet_CompleteGeneralizationSet_GeneralizationSet(context, (GeneralizationSet) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnonymousGeneralizationSetRule()) {
					sequence_AnonymousGeneralizationSet(context, (GeneralizationSet) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCompleteGeneralizationSetRule()) {
					sequence_CompleteGeneralizationSet(context, (GeneralizationSet) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMultipleAnonymousGeneralizationSetRule()) {
					sequence_MultipleAnonymousGeneralizationSet(context, (GeneralizationSet) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleAnonymousGeneralizationSetRule()) {
					sequence_SingleAnonymousGeneralizationSet(context, (GeneralizationSet) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.KIND:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getKindRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_Kind(context, (Kind) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.MEDIATION:
				if(context == grammarAccess.getMediationRule()) {
					sequence_Mediation(context, (Mediation) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.MEMBERSHIP_RELATION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMembershipRelationRule() ||
				   context == grammarAccess.getMeronymicRelationRule()) {
					sequence_MembershipRelation(context, (MembershipRelation) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.MIXIN:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMixinRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_Mixin(context, (Mixin) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.MODE_UNIVERSAL:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getIntrinsicMomentUniversalRule() ||
				   context == grammarAccess.getModeUniversalRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_ModeUniversal(context, (ModeUniversal) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.PACKAGE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.PHASE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getPhaseRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_Phase(context, (Phase) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.PRIMITIVE_DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPrimitiveDataTypeRule()) {
					sequence_PrimitiveDataType(context, (PrimitiveDataType) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.QUALITY_UNIVERSAL:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getIntrinsicMomentUniversalRule() ||
				   context == grammarAccess.getQualityUniversalRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_QualityUniversal(context, (QualityUniversal) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.QUANTITY_UNIVERSAL:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getQuantityUniversalRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_QuantityUniversal(context, (QuantityUniversal) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.RELATOR_UNIVERSAL:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getRelatorUniversalRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_RelatorUniversal(context, (RelatorUniversal) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.ROLE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getRoleRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.ROLE_MIXIN:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getRoleMixinRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_RoleMixin(context, (RoleMixin) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.SUB_COLLECTION_RELATION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMeronymicRelationRule() ||
				   context == grammarAccess.getSubCollectionRelationRule()) {
					sequence_SubCollectionRelation(context, (SubCollectionRelation) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.SUB_KIND:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEndurantUniversalRule() ||
				   context == grammarAccess.getSubKindRule() ||
				   context == grammarAccess.getUniversalRule()) {
					sequence_SubKind(context, (SubKind) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.SUB_QUANTITY_RELATION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMeronymicRelationRule() ||
				   context == grammarAccess.getSubQuantityRelationRule()) {
					sequence_SubQuantityRelation(context, (SubQuantityRelation) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.NARY_FORMAL_RELATION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getNAryFormalRelationRule()) {
					sequence_nAryFormalRelation(context, (nAryFormalRelation) semanticObject); 
					return; 
				}
				else break;
			case PrimeOntoUMLPackage.NARY_MATERIAL_RELATION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getNAryMaterialRelationRule()) {
					sequence_nAryMaterialRelation(context, (nAryMaterialRelation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             isCovering?='complete'? 
	 *             name=ID 
	 *             specializedUniversal=[Universal|ID] 
	 *             specializingUniversals+=[Universal|ID] 
	 *             specializingUniversals+=[Universal|ID]*
	 *         ) | 
	 *         (specializingUniversals+=[Universal|ID] specializingUniversals+=[Universal|ID]* specializedUniversal=[Universal|ID])
	 *     )
	 */
	protected void sequence_AnonymousGeneralizationSet_CompleteGeneralizationSet_GeneralizationSet(EObject context, GeneralizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (specializingUniversals+=[Universal|ID] specializingUniversals+=[Universal|ID]* specializedUniversal=[Universal|ID])
	 */
	protected void sequence_AnonymousGeneralizationSet(EObject context, GeneralizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         source=[Universal|ID] 
	 *         (sourceLowerBound=CardinalityBound sourceUpperBound=CardinalityUpperBound)? 
	 *         name=ID 
	 *         target=[Universal|ID] 
	 *         (targetLowerBound=CardinalityBound targetUpperBound=CardinalityUpperBound)?
	 *     )
	 */
	protected void sequence_BinaryFormalRelation(EObject context, BinaryFormalRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         source=[ExternallyDependentUniversal|ID] 
	 *         (sourceLowerBound=CardinalityBound sourceUpperBound=CardinalityUpperBound)? 
	 *         name=ID 
	 *         derivedFrom=[RelatorUniversal|ID]? 
	 *         target=[ExternallyDependentUniversal|ID] 
	 *         (targetLowerBound=CardinalityBound targetUpperBound=CardinalityUpperBound)?
	 *     )
	 */
	protected void sequence_BinaryMaterialRelation(EObject context, BinaryMaterialRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (sourceLowerBound=CardinalityBound sourceUpperBound=CardinalityUpperBound)? 
	 *         target=[IntrinsicMomentUniversal|ID] 
	 *         (targetLowerBound=CardinalityBound targetUpperBound=CardinalityUpperBound)?
	 *     )
	 */
	protected void sequence_Characterization(EObject context, Characterization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isExtensional?='extensional'? name=ID characterizedBy+=Characterization*)
	 */
	protected void sequence_CollectiveUniversal(EObject context, CollectiveUniversal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isCovering?='complete'? 
	 *         name=ID 
	 *         specializedUniversal=[Universal|ID] 
	 *         specializingUniversals+=[Universal|ID] 
	 *         specializingUniversals+=[Universal|ID]*
	 *     )
	 */
	protected void sequence_CompleteGeneralizationSet(EObject context, GeneralizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=DataTypeAttribute attributes+=DataTypeAttribute*)
	 */
	protected void sequence_ComplexDataType(EObject context, ComplexDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         partIsEssential?='essential' 
	 *         partIsInseparable?='inseparable' 
	 *         partIsShareable?='shareable' 
	 *         partIsImmutable?='immutable' 
	 *         part=[SubstantialUniversal|ID] 
	 *         (sourceLowerBound=CardinalityBound sourceUpperBound=CardinalityUpperBound)? 
	 *         whole=[SubstantialUniversal|ID] 
	 *         (targetLowerBound=CardinalityBound targetUpperBound=CardinalityUpperBound)?
	 *     )
	 */
	protected void sequence_ComponentOfRelation(EObject context, ComponentOfRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isOfType=[DataType|ID] name=ID)
	 */
	protected void sequence_DataTypeAttribute(EObject context, DataTypeAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID enumerationLiterals+=EString enumerationLiterals+=EString*)
	 */
	protected void sequence_Enumeration(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID characterizedBy+=Characterization*)
	 */
	protected void sequence_Kind(EObject context, Kind semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (sourceLowerBound=CardinalityBound sourceUpperBound=CardinalityUpperBound)? 
	 *         target=[ExternallyDependentUniversal|ID] 
	 *         (targetLowerBound=CardinalityBound targetUpperBound=CardinalityUpperBound)?
	 *     )
	 */
	protected void sequence_Mediation(EObject context, Mediation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         partIsEssential?='essential' 
	 *         partIsInseparable?='inseparable' 
	 *         partIsShareable?='shareable' 
	 *         partIsImmutable?='immutable' 
	 *         part=[SubstantialUniversal|ID] 
	 *         (sourceLowerBound=CardinalityBound sourceUpperBound=CardinalityUpperBound)? 
	 *         whole=[SubstantialUniversal|ID] 
	 *         (targetLowerBound=CardinalityBound targetUpperBound=CardinalityUpperBound)?
	 *     )
	 */
	protected void sequence_MembershipRelation(EObject context, MembershipRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Mixin(EObject context, Mixin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID characterizedBy+=Characterization*)
	 */
	protected void sequence_ModeUniversal(EObject context, ModeUniversal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=Element*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (specializingUniversals+=[Universal|ID] specializingUniversals+=[Universal|ID]+ specializedUniversal=[Universal|ID])
	 */
	protected void sequence_MultipleAnonymousGeneralizationSet(EObject context, GeneralizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID elements+=Element+)
	 */
	protected void sequence_Package(EObject context, br.ufes.inf.nemo.ontouml.PrimeOntoUML.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID characterizedBy+=Characterization*)
	 */
	protected void sequence_Phase(EObject context, Phase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID _type=PrimitiveDataTypeType)
	 */
	protected void sequence_PrimitiveDataType(EObject context, PrimitiveDataType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PrimeOntoUMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrimeOntoUMLPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PrimeOntoUMLPackage.Literals.PRIMITIVE_DATA_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrimeOntoUMLPackage.Literals.PRIMITIVE_DATA_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimitiveDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPrimitiveDataTypeAccess().get_typePrimitiveDataTypeTypeParserRuleCall_3_0(), semanticObject.get_type());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID characterization=[Characterization|ID] (datatypes+=[DataType|ID] datatypes+=[DataType|ID]*)? characterizedBy+=Characterization*)
	 */
	protected void sequence_QualityUniversal(EObject context, QualityUniversal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID characterizedBy+=Characterization*)
	 */
	protected void sequence_QuantityUniversal(EObject context, QuantityUniversal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID characterizedBy+=Characterization* mediations+=Mediation*)
	 */
	protected void sequence_RelatorUniversal(EObject context, RelatorUniversal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RoleMixin(EObject context, RoleMixin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID characterizedBy+=Characterization*)
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (specializingUniversals+=[Universal|ID] specializedUniversal=[Universal|ID])
	 */
	protected void sequence_SingleAnonymousGeneralizationSet(EObject context, GeneralizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         partIsEssential?='essential' 
	 *         partIsInseparable?='inseparable' 
	 *         partIsShareable?='shareable' 
	 *         partIsImmutable?='immutable' 
	 *         part=[SubstantialUniversal|ID] 
	 *         (sourceLowerBound=CardinalityBound sourceUpperBound=CardinalityUpperBound)? 
	 *         whole=[SubstantialUniversal|ID] 
	 *         (targetLowerBound=CardinalityBound targetUpperBound=CardinalityUpperBound)?
	 *     )
	 */
	protected void sequence_SubCollectionRelation(EObject context, SubCollectionRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID characterizedBy+=Characterization*)
	 */
	protected void sequence_SubKind(EObject context, SubKind semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         partIsEssential?='essential' 
	 *         partIsInseparable?='inseparable' 
	 *         partIsImmutable?='immutable' 
	 *         part=[SubstantialUniversal|ID] 
	 *         (sourceLowerBound=CardinalityBound sourceUpperBound=CardinalityUpperBound)? 
	 *         whole=[SubstantialUniversal|ID] 
	 *         (targetLowerBound=CardinalityBound targetUpperBound=CardinalityUpperBound)?
	 *     )
	 */
	protected void sequence_SubQuantityRelation(EObject context, SubQuantityRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             targetRelata+=[Universal|ID] 
	 *             sourceLowerBound+=CardinalityBound 
	 *             sourceUpperBound+=CardinalityUpperBound 
	 *             targetRelata+=[Universal|ID]* 
	 *             sourceLowerBound+=CardinalityBound 
	 *             sourceUpperBound+=CardinalityUpperBound
	 *         )?
	 *     )
	 */
	protected void sequence_nAryFormalRelation(EObject context, nAryFormalRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         derivedFrom=[RelatorUniversal|ID] 
	 *         name=ID 
	 *         (
	 *             targetRelata+=[ExternallyDependentUniversal|ID] 
	 *             sourceLowerBound+=CardinalityBound 
	 *             sourceUpperBound+=CardinalityUpperBound 
	 *             targetRelata+=[ExternallyDependentUniversal|ID]* 
	 *             sourceLowerBound+=CardinalityBound 
	 *             sourceUpperBound+=CardinalityUpperBound
	 *         )?
	 *     )
	 */
	protected void sequence_nAryMaterialRelation(EObject context, nAryMaterialRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
