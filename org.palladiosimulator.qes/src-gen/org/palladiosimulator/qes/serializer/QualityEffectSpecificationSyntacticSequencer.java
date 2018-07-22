/*
 * generated by Xtext 2.14.0
 */
package org.palladiosimulator.qes.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.palladiosimulator.qes.services.QualityEffectSpecificationGrammarAccess;

@SuppressWarnings("all")
public class QualityEffectSpecificationSyntacticSequencer extends AbstractSyntacticSequencer {

	protected QualityEffectSpecificationGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Model_NLTerminalRuleCall_1_0_p;
	protected AbstractElementAlias match_Model_NLTerminalRuleCall_2_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QualityEffectSpecificationGrammarAccess) access;
		match_Model_NLTerminalRuleCall_1_0_p = new TokenAlias(true, false, grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0());
		match_Model_NLTerminalRuleCall_2_p = new TokenAlias(true, false, grammarAccess.getModelAccess().getNLTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NL:
	 *     ('\r'? '\n');
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Model_NLTerminalRuleCall_1_0_p.equals(syntax))
				emit_Model_NLTerminalRuleCall_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Model_NLTerminalRuleCall_2_p.equals(syntax))
				emit_Model_NLTerminalRuleCall_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     specifications+=QualityEffectSpecification (ambiguity) specifications+=QualityEffectSpecification
	 */
	protected void emit_Model_NLTerminalRuleCall_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     specifications+=QualityEffectSpecification (ambiguity) (rule end)
	 */
	protected void emit_Model_NLTerminalRuleCall_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
