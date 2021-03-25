package org.eclipse.sensinact.studio.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AFTER;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_AVG;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_BEFORE;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COINCIDE;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_COUNT;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_MIN;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_DURATION_SEC;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MAX;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_MIN;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_STATEMENT;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CEP_SUM;
import org.eclipse.sensinact.studio.language.sensinact.DSL_CLOCK_STOCHASTIC;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ECA_STATEMENT;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Negate;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_FLAG_AUTOSTART;
import org.eclipse.sensinact.studio.language.sensinact.DSL_IfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ListParam;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_String;
import org.eclipse.sensinact.studio.language.sensinact.DSL_On;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction;
import org.eclipse.sensinact.studio.language.sensinact.DSL_SENSINACT;
import org.eclipse.sensinact.studio.language.sensinact.Sensinact;
import org.eclipse.sensinact.studio.language.sensinact.SensinactPackage;
import org.eclipse.sensinact.studio.language.services.SensinactGrammarAccess;
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
public class SensinactSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SensinactGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SensinactPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SensinactPackage.DSL_CEP_AFTER:
				if(context == grammarAccess.getDSL_CEP_AFTERRule()) {
					sequence_DSL_CEP_AFTER(context, (DSL_CEP_AFTER) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_AVG:
				if(context == grammarAccess.getDSL_CEP_AVGRule()) {
					sequence_DSL_CEP_AVG(context, (DSL_CEP_AVG) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_BEFORE:
				if(context == grammarAccess.getDSL_CEP_BEFORERule()) {
					sequence_DSL_CEP_BEFORE(context, (DSL_CEP_BEFORE) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_COINCIDE:
				if(context == grammarAccess.getDSL_CEP_COINCIDERule()) {
					sequence_DSL_CEP_COINCIDE(context, (DSL_CEP_COINCIDE) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_COUNT:
				if(context == grammarAccess.getDSL_CEP_COUNTRule()) {
					sequence_DSL_CEP_COUNT(context, (DSL_CEP_COUNT) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_DURATION:
				if(context == grammarAccess.getDSL_CEP_DURATIONRule()) {
					sequence_DSL_CEP_DURATION(context, (DSL_CEP_DURATION) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_DURATION_MIN:
				if(context == grammarAccess.getDSL_CEP_DURATION_MINRule()) {
					sequence_DSL_CEP_DURATION_MIN(context, (DSL_CEP_DURATION_MIN) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_DURATION_SEC:
				if(context == grammarAccess.getDSL_CEP_DURATION_SECRule()) {
					sequence_DSL_CEP_DURATION_SEC(context, (DSL_CEP_DURATION_SEC) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_MAX:
				if(context == grammarAccess.getDSL_CEP_MAXRule()) {
					sequence_DSL_CEP_MAX(context, (DSL_CEP_MAX) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_MIN:
				if(context == grammarAccess.getDSL_CEP_MINRule()) {
					sequence_DSL_CEP_MIN(context, (DSL_CEP_MIN) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_STATEMENT:
				if(context == grammarAccess.getDSL_CEP_STATEMENTRule() ||
				   context == grammarAccess.getDSL_REFRule()) {
					sequence_DSL_CEP_STATEMENT(context, (DSL_CEP_STATEMENT) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CEP_SUM:
				if(context == grammarAccess.getDSL_CEP_SUMRule()) {
					sequence_DSL_CEP_SUM(context, (DSL_CEP_SUM) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_CLOCK_STOCHASTIC:
				if(context == grammarAccess.getDSL_CLOCK_STOCHASTICRule()) {
					sequence_DSL_CLOCK_STOCHASTIC(context, (DSL_CLOCK_STOCHASTIC) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_ECA_STATEMENT:
				if(context == grammarAccess.getDSL_ECA_STATEMENTRule()) {
					sequence_DSL_ECA_STATEMENT(context, (DSL_ECA_STATEMENT) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_ELSE_DO:
				if(context == grammarAccess.getDSL_ElseDoRule()) {
					sequence_DSL_ElseDo(context, (DSL_ElseDo) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_ELSE_IF_DO:
				if(context == grammarAccess.getDSL_ElseIfDoRule()) {
					sequence_DSL_ElseIfDo(context, (DSL_ElseIfDo) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_AND:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_And(context, (DSL_Expression_And) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_DIFF:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_DiffEqual(context, (DSL_Expression_Diff) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_DIVISION:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_MultiplicationDivision(context, (DSL_Expression_Division) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_EQUAL:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_DiffEqual(context, (DSL_Expression_Equal) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_LARGER:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Compare(context, (DSL_Expression_Larger) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_LARGER_EQUAL:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Compare(context, (DSL_Expression_Larger_Equal) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_MINUS:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_PlusMinus(context, (DSL_Expression_Minus) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_MODULO:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_MultiplicationDivision(context, (DSL_Expression_Modulo) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_MULTIPLICATION:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_MultiplicationDivision(context, (DSL_Expression_Multiplication) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_NEGATE:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Unary(context, (DSL_Expression_Negate) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_OR:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Or(context, (DSL_Expression_Or) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_PLUS:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_PlusMinus(context, (DSL_Expression_Plus) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_SMALLER:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Compare(context, (DSL_Expression_Smaller) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_EXPRESSION_SMALLER_EQUAL:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Compare(context, (DSL_Expression_Smaller_Equal) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_FLAG_AUTOSTART:
				if(context == grammarAccess.getDSL_FLAG_AUTOSTARTRule()) {
					sequence_DSL_FLAG_AUTOSTART(context, (DSL_FLAG_AUTOSTART) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_IF_DO:
				if(context == grammarAccess.getDSL_IfDoRule()) {
					sequence_DSL_IfDo(context, (DSL_IfDo) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_LIST_ACTIONS:
				if(context == grammarAccess.getDSL_ListActionsRule()) {
					sequence_DSL_ListActions(context, (DSL_ListActions) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_LIST_PARAM:
				if(context == grammarAccess.getDSL_ListParamRule()) {
					sequence_DSL_ListParam(context, (DSL_ListParam) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_OBJECT_BOOLEAN:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Unary(context, (DSL_Object_Boolean) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_OBJECT_NUMBER:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Unary(context, (DSL_Object_Number) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_OBJECT_REF:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Unary(context, (DSL_Object_Ref) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_OBJECT_STRING:
				if(context == grammarAccess.getDSL_Expression_AndRule() ||
				   context == grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareRule() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualRule() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionRule() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_OrRule() ||
				   context == grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusRule() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getDSL_Expression_UnaryRule()) {
					sequence_DSL_Expression_Unary(context, (DSL_Object_String) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_ON:
				if(context == grammarAccess.getDSL_OnRule()) {
					sequence_DSL_On(context, (DSL_On) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_REF_CONDITION:
				if(context == grammarAccess.getDSL_REF_CONDITIONRule()) {
					sequence_DSL_REF_CONDITION(context, (DSL_REF_CONDITION) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_RESOURCE:
				if(context == grammarAccess.getDSL_REFRule() ||
				   context == grammarAccess.getDSL_ResourceRule()) {
					sequence_DSL_Resource(context, (DSL_Resource) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_RESOURCE_ACTION:
				if(context == grammarAccess.getDSL_ResourceActionRule()) {
					sequence_DSL_ResourceAction(context, (DSL_ResourceAction) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.DSL_SENSINACT:
				if(context == grammarAccess.getDSL_SENSINACTRule()) {
					sequence_DSL_SENSINACT(context, (DSL_SENSINACT) semanticObject); 
					return; 
				}
				else break;
			case SensinactPackage.SENSINACT:
				if(context == grammarAccess.getSensinactRule()) {
					sequence_Sensinact(context, (Sensinact) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (ref1=DSL_REF_CONDITION ref2=DSL_REF_CONDITION start=DSL_CEP_DURATION? end=DSL_CEP_DURATION)
	 */
	protected void sequence_DSL_CEP_AFTER(EObject context, DSL_CEP_AFTER semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=DSL_REF_CONDITION window=DSL_CEP_DURATION)
	 */
	protected void sequence_DSL_CEP_AVG(EObject context, DSL_CEP_AVG semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_AVG__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_AVG__REF));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_AVG__WINDOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_AVG__WINDOW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_CEP_AVGAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getDSL_CEP_AVGAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0(), semanticObject.getWindow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref1=DSL_REF_CONDITION ref2=DSL_REF_CONDITION start=DSL_CEP_DURATION? end=DSL_CEP_DURATION)
	 */
	protected void sequence_DSL_CEP_BEFORE(EObject context, DSL_CEP_BEFORE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref1=DSL_REF_CONDITION ref2=DSL_REF_CONDITION window=DSL_CEP_DURATION)
	 */
	protected void sequence_DSL_CEP_COINCIDE(EObject context, DSL_CEP_COINCIDE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_COINCIDE__REF1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_COINCIDE__REF1));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_COINCIDE__REF2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_COINCIDE__REF2));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_COINCIDE__WINDOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_COINCIDE__WINDOW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_CEP_COINCIDEAccess().getRef1DSL_REF_CONDITIONParserRuleCall_2_0(), semanticObject.getRef1());
		feeder.accept(grammarAccess.getDSL_CEP_COINCIDEAccess().getRef2DSL_REF_CONDITIONParserRuleCall_4_0(), semanticObject.getRef2());
		feeder.accept(grammarAccess.getDSL_CEP_COINCIDEAccess().getWindowDSL_CEP_DURATIONParserRuleCall_6_0(), semanticObject.getWindow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=DSL_REF_CONDITION window=DSL_CEP_DURATION)
	 */
	protected void sequence_DSL_CEP_COUNT(EObject context, DSL_CEP_COUNT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_COUNT__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_COUNT__REF));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_COUNT__WINDOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_COUNT__WINDOW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_CEP_COUNTAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getDSL_CEP_COUNTAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0(), semanticObject.getWindow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (units+=DSL_CEP_DURATION_MIN | units+=DSL_CEP_DURATION_SEC)+
	 */
	protected void sequence_DSL_CEP_DURATION(EObject context, DSL_CEP_DURATION semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     min=NUMBER
	 */
	protected void sequence_DSL_CEP_DURATION_MIN(EObject context, DSL_CEP_DURATION_MIN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_DURATION_MIN__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_DURATION_MIN__MIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_CEP_DURATION_MINAccess().getMinNUMBERParserRuleCall_0_0(), semanticObject.getMin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     sec=NUMBER
	 */
	protected void sequence_DSL_CEP_DURATION_SEC(EObject context, DSL_CEP_DURATION_SEC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_DURATION_SEC__SEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_DURATION_SEC__SEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_CEP_DURATION_SECAccess().getSecNUMBERParserRuleCall_0_0(), semanticObject.getSec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=DSL_REF_CONDITION window=DSL_CEP_DURATION)
	 */
	protected void sequence_DSL_CEP_MAX(EObject context, DSL_CEP_MAX semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_MAX__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_MAX__REF));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_MAX__WINDOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_MAX__WINDOW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_CEP_MAXAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getDSL_CEP_MAXAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0(), semanticObject.getWindow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=DSL_REF_CONDITION window=DSL_CEP_DURATION)
	 */
	protected void sequence_DSL_CEP_MIN(EObject context, DSL_CEP_MIN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_MIN__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_MIN__REF));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_MIN__WINDOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_MIN__WINDOW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_CEP_MINAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getDSL_CEP_MINAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0(), semanticObject.getWindow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             operation=DSL_CEP_AFTER | 
	 *             operation=DSL_CEP_BEFORE | 
	 *             operation=DSL_CEP_COINCIDE | 
	 *             operation=DSL_CEP_MIN | 
	 *             operation=DSL_CEP_MAX | 
	 *             operation=DSL_CEP_AVG | 
	 *             operation=DSL_CEP_SUM | 
	 *             operation=DSL_CEP_COUNT
	 *         )
	 *     )
	 */
	protected void sequence_DSL_CEP_STATEMENT(EObject context, DSL_CEP_STATEMENT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=DSL_REF_CONDITION window=DSL_CEP_DURATION)
	 */
	protected void sequence_DSL_CEP_SUM(EObject context, DSL_CEP_SUM semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_SUM__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_SUM__REF));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_CEP_SUM__WINDOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_CEP_SUM__WINDOW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_CEP_SUMAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getDSL_CEP_SUMAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0(), semanticObject.getWindow());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((ref+=[DSL_Resource|ID] ref+=[DSL_Resource|ID]* value=NUMBER) | (ref+=[DSL_Resource|ID] ref+=[DSL_Resource|ID]* param1=NUMBER param2=NUMBER))
	 */
	protected void sequence_DSL_CLOCK_STOCHASTIC(EObject context, DSL_CLOCK_STOCHASTIC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ifdo=DSL_IfDo elseIfdo+=DSL_ElseIfDo* elsedo=DSL_ElseDo?)
	 */
	protected void sequence_DSL_ECA_STATEMENT(EObject context, DSL_ECA_STATEMENT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     actions=DSL_ListActions
	 */
	protected void sequence_DSL_ElseDo(EObject context, DSL_ElseDo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_ELSE_DO__ACTIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_ELSE_DO__ACTIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_ElseDoAccess().getActionsDSL_ListActionsParserRuleCall_1_0(), semanticObject.getActions());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=DSL_Expression_Or actions=DSL_ListActions)
	 */
	protected void sequence_DSL_ElseIfDo(EObject context, DSL_ElseIfDo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_ELSE_IF_DO__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_ELSE_IF_DO__CONDITION));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_ELSE_IF_DO__ACTIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_ELSE_IF_DO__ACTIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_ElseIfDoAccess().getConditionDSL_Expression_OrParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getDSL_ElseIfDoAccess().getActionsDSL_ListActionsParserRuleCall_3_0(), semanticObject.getActions());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_And_DSL_Expression_And_1_1 right=DSL_Expression_DiffEqual)
	 */
	protected void sequence_DSL_Expression_And(EObject context, DSL_Expression_And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_AndAccess().getRightDSL_Expression_DiffEqualParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_Compare_DSL_Expression_Larger_1_0_1 right=DSL_Expression_PlusMinus)
	 */
	protected void sequence_DSL_Expression_Compare(EObject context, DSL_Expression_Larger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_LARGER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_LARGER__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_LARGER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_LARGER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_CompareAccess().getRightDSL_Expression_PlusMinusParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_Compare_DSL_Expression_Larger_Equal_1_1_1 right=DSL_Expression_PlusMinus)
	 */
	protected void sequence_DSL_Expression_Compare(EObject context, DSL_Expression_Larger_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_LARGER_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_LARGER_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_LARGER_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_LARGER_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_CompareAccess().getRightDSL_Expression_PlusMinusParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_Compare_DSL_Expression_Smaller_1_2_1 right=DSL_Expression_PlusMinus)
	 */
	protected void sequence_DSL_Expression_Compare(EObject context, DSL_Expression_Smaller semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_SMALLER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_SMALLER__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_SMALLER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_SMALLER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_CompareAccess().getRightDSL_Expression_PlusMinusParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_Compare_DSL_Expression_Smaller_Equal_1_3_1 right=DSL_Expression_PlusMinus)
	 */
	protected void sequence_DSL_Expression_Compare(EObject context, DSL_Expression_Smaller_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_SMALLER_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_SMALLER_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_SMALLER_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_SMALLER_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_CompareAccess().getRightDSL_Expression_PlusMinusParserRuleCall_1_3_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_DiffEqual_DSL_Expression_Diff_1_0_1 right=DSL_Expression_Compare)
	 */
	protected void sequence_DSL_Expression_DiffEqual(EObject context, DSL_Expression_Diff semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_DIFF__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_DIFF__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_DIFF__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_DIFF__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_DiffEqualAccess().getRightDSL_Expression_CompareParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_DiffEqual_DSL_Expression_Equal_1_1_1 right=DSL_Expression_Compare)
	 */
	protected void sequence_DSL_Expression_DiffEqual(EObject context, DSL_Expression_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_DiffEqualAccess().getRightDSL_Expression_CompareParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_MultiplicationDivision_DSL_Expression_Division_1_1_1 right=DSL_Expression_Unary)
	 */
	protected void sequence_DSL_Expression_MultiplicationDivision(EObject context, DSL_Expression_Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getRightDSL_Expression_UnaryParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_MultiplicationDivision_DSL_Expression_Modulo_1_2_1 right=DSL_Expression_Unary)
	 */
	protected void sequence_DSL_Expression_MultiplicationDivision(EObject context, DSL_Expression_Modulo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MODULO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MODULO__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MODULO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MODULO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getRightDSL_Expression_UnaryParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_MultiplicationDivision_DSL_Expression_Multiplication_1_0_1 right=DSL_Expression_Unary)
	 */
	protected void sequence_DSL_Expression_MultiplicationDivision(EObject context, DSL_Expression_Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getRightDSL_Expression_UnaryParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_Or_DSL_Expression_Or_1_1 right=DSL_Expression_And)
	 */
	protected void sequence_DSL_Expression_Or(EObject context, DSL_Expression_Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_OrAccess().getRightDSL_Expression_AndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_PlusMinus_DSL_Expression_Minus_1_1_1 right=DSL_Expression_MultiplicationDivision)
	 */
	protected void sequence_DSL_Expression_PlusMinus(EObject context, DSL_Expression_Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_PlusMinusAccess().getRightDSL_Expression_MultiplicationDivisionParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DSL_Expression_PlusMinus_DSL_Expression_Plus_1_0_1 right=DSL_Expression_MultiplicationDivision)
	 */
	protected void sequence_DSL_Expression_PlusMinus(EObject context, DSL_Expression_Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDSL_Expression_PlusMinusAccess().getRightDSL_Expression_MultiplicationDivisionParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=DSL_Expression_Unary
	 */
	protected void sequence_DSL_Expression_Unary(EObject context, DSL_Expression_Negate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_NEGATE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_EXPRESSION_NEGATE__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_UnaryAccess().getExpDSL_Expression_UnaryParserRuleCall_5_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_DSL_Expression_Unary(EObject context, DSL_Object_Boolean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_OBJECT_BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_OBJECT_BOOLEAN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_UnaryAccess().getValueBOOLEANTerminalRuleCall_2_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_DSL_Expression_Unary(EObject context, DSL_Object_Number semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_OBJECT_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_OBJECT_NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_UnaryAccess().getValueNUMBERParserRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[DSL_REF|ID]
	 */
	protected void sequence_DSL_Expression_Unary(EObject context, DSL_Object_Ref semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_OBJECT_REF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_OBJECT_REF__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_UnaryAccess().getValueDSL_REFIDTerminalRuleCall_3_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_DSL_Expression_Unary(EObject context, DSL_Object_String semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_OBJECT_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_OBJECT_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_Expression_UnaryAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     activated=BOOLEAN
	 */
	protected void sequence_DSL_FLAG_AUTOSTART(EObject context, DSL_FLAG_AUTOSTART semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_FLAG_AUTOSTART__ACTIVATED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_FLAG_AUTOSTART__ACTIVATED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_FLAG_AUTOSTARTAccess().getActivatedBOOLEANTerminalRuleCall_3_0(), semanticObject.isActivated());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=DSL_Expression_Or actions=DSL_ListActions)
	 */
	protected void sequence_DSL_IfDo(EObject context, DSL_IfDo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_IF_DO__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_IF_DO__CONDITION));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_IF_DO__ACTIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_IF_DO__ACTIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_IfDoAccess().getConditionDSL_Expression_OrParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getDSL_IfDoAccess().getActionsDSL_ListActionsParserRuleCall_3_0(), semanticObject.getActions());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (actionList+=DSL_ResourceAction actionList+=DSL_ResourceAction*)
	 */
	protected void sequence_DSL_ListActions(EObject context, DSL_ListActions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (param+=DSL_Expression_Or param+=DSL_Expression_Or*)
	 */
	protected void sequence_DSL_ListParam(EObject context, DSL_ListParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (triggers+=DSL_REF_CONDITION triggers+=DSL_REF_CONDITION*)
	 */
	protected void sequence_DSL_On(EObject context, DSL_On semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[DSL_REF|ID]
	 */
	protected void sequence_DSL_REF_CONDITION(EObject context, DSL_REF_CONDITION semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_REF_CONDITION__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_REF_CONDITION__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_REF_CONDITIONAccess().getRefDSL_REFIDTerminalRuleCall_0_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=ID? ref=[DSL_REF|ID] (actiontype='act' | actiontype='set') listParam=DSL_ListParam?)
	 */
	protected void sequence_DSL_ResourceAction(EObject context, DSL_ResourceAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID gatewayID=EXTENDED_ID deviceID=EXTENDED_ID serviceID=EXTENDED_ID resourceID=EXTENDED_ID)
	 */
	protected void sequence_DSL_Resource(EObject context, DSL_Resource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_REF__NAME));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_RESOURCE__GATEWAY_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_RESOURCE__GATEWAY_ID));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_RESOURCE__DEVICE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_RESOURCE__DEVICE_ID));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_RESOURCE__SERVICE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_RESOURCE__SERVICE_ID));
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.DSL_RESOURCE__RESOURCE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.DSL_RESOURCE__RESOURCE_ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDSL_ResourceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDSL_ResourceAccess().getGatewayIDEXTENDED_IDParserRuleCall_4_0(), semanticObject.getGatewayID());
		feeder.accept(grammarAccess.getDSL_ResourceAccess().getDeviceIDEXTENDED_IDParserRuleCall_6_0(), semanticObject.getDeviceID());
		feeder.accept(grammarAccess.getDSL_ResourceAccess().getServiceIDEXTENDED_IDParserRuleCall_8_0(), semanticObject.getServiceID());
		feeder.accept(grammarAccess.getDSL_ResourceAccess().getResourceIDEXTENDED_IDParserRuleCall_10_0(), semanticObject.getResourceID());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         autostart=DSL_FLAG_AUTOSTART? 
	 *         resources+=DSL_Resource+ 
	 *         prob+=DSL_CLOCK_STOCHASTIC* 
	 *         cep+=DSL_CEP_STATEMENT* 
	 *         on=DSL_On 
	 *         eca=DSL_ECA_STATEMENT
	 *     )
	 */
	protected void sequence_DSL_SENSINACT(EObject context, DSL_SENSINACT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     eca=DSL_SENSINACT
	 */
	protected void sequence_Sensinact(EObject context, Sensinact semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SensinactPackage.Literals.SENSINACT__ECA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SensinactPackage.Literals.SENSINACT__ECA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSensinactAccess().getEcaDSL_SENSINACTParserRuleCall_1_0(), semanticObject.getEca());
		feeder.finish();
	}
}
