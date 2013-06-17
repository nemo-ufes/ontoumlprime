package br.ufes.inf.nemo.ontouml.ontoumlprime.serializer;

import br.ufes.inf.nemo.ontouml.ontoumlprime.services.DslGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_0_1_1_or_SpecializeKeyword_1_0_1_0;
	protected AbstractElementAlias match_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_1_or_SpecializesKeyword_1_1_0;
	protected AbstractElementAlias match_MultipleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_2_1_or_SpecializeKeyword_2_0;
	protected AbstractElementAlias match_SingleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_or_SpecializesKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DslGrammarAccess) access;
		match_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_0_1_1_or_SpecializeKeyword_1_0_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_0_1_1()), new TokenAlias(false, false, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializeKeyword_1_0_1_0()));
		match_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_1_or_SpecializesKeyword_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getAnonymousGeneralizationSetAccess().getSpecializesKeyword_1_1_0()));
		match_MultipleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_2_1_or_SpecializeKeyword_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultipleAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getMultipleAnonymousGeneralizationSetAccess().getSpecializeKeyword_2_0()));
		match_SingleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_or_SpecializesKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSingleAnonymousGeneralizationSetAccess().getEqualsSignGreaterThanSignKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSingleAnonymousGeneralizationSetAccess().getSpecializesKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_0_1_1_or_SpecializeKeyword_1_0_1_0.equals(syntax))
				emit_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_0_1_1_or_SpecializeKeyword_1_0_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_1_or_SpecializesKeyword_1_1_0.equals(syntax))
				emit_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_1_or_SpecializesKeyword_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultipleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_2_1_or_SpecializeKeyword_2_0.equals(syntax))
				emit_MultipleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_2_1_or_SpecializeKeyword_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SingleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_or_SpecializesKeyword_1_0.equals(syntax))
				emit_SingleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_or_SpecializesKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '=>' | 'specialize'
	 */
	protected void emit_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_0_1_1_or_SpecializeKeyword_1_0_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '=>' | 'specializes'
	 */
	protected void emit_AnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_1_or_SpecializesKeyword_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '=>' | 'specialize'
	 */
	protected void emit_MultipleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_2_1_or_SpecializeKeyword_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'specializes' | '=>'
	 */
	protected void emit_SingleAnonymousGeneralizationSet_EqualsSignGreaterThanSignKeyword_1_1_or_SpecializesKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
