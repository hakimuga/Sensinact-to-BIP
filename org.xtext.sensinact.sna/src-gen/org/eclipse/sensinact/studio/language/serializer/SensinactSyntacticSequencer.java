package org.eclipse.sensinact.studio.language.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sensinact.studio.language.services.SensinactGrammarAccess;
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
public class SensinactSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SensinactGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DSL_CLOCK_STOCHASTIC_EKeyword_1_4_2_or_NKeyword_1_4_1_or_UKeyword_1_4_3_or_WKeyword_1_4_0;
	protected AbstractElementAlias match_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_a;
	protected AbstractElementAlias match_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SensinactGrammarAccess) access;
		match_DSL_CLOCK_STOCHASTIC_EKeyword_1_4_2_or_NKeyword_1_4_1_or_UKeyword_1_4_3_or_WKeyword_1_4_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getEKeyword_1_4_2()), new TokenAlias(false, false, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getNKeyword_1_4_1()), new TokenAlias(false, false, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getUKeyword_1_4_3()), new TokenAlias(false, false, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getWKeyword_1_4_0()));
		match_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_a = new TokenAlias(true, true, grammarAccess.getDSL_Expression_UnaryAccess().getLeftParenthesisKeyword_4_0());
		match_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_p = new TokenAlias(true, false, grammarAccess.getDSL_Expression_UnaryAccess().getLeftParenthesisKeyword_4_0());
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
			if(match_DSL_CLOCK_STOCHASTIC_EKeyword_1_4_2_or_NKeyword_1_4_1_or_UKeyword_1_4_3_or_WKeyword_1_4_0.equals(syntax))
				emit_DSL_CLOCK_STOCHASTIC_EKeyword_1_4_2_or_NKeyword_1_4_1_or_UKeyword_1_4_3_or_WKeyword_1_4_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_a.equals(syntax))
				emit_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_p.equals(syntax))
				emit_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'W' | 'N' | 'U' | 'E'
	 */
	protected void emit_DSL_CLOCK_STOCHASTIC_EKeyword_1_4_2_or_NKeyword_1_4_1_or_UKeyword_1_4_3_or_WKeyword_1_4_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_DSL_Expression_Unary_LeftParenthesisKeyword_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
