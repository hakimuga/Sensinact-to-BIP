package org.eclipse.sensinact.studio.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.sensinact.studio.language.services.SensinactGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensinactParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "','", "'with'", "'W'", "'N'", "'E'", "'U'", "'('", "')'", "'option'", "'autostart'", "'='", "'resource'", "'['", "'/'", "']'", "'on'", "'end if'", "'if'", "'do'", "'else if'", "'else do'", "'.'", "'subscribe'", "'define'", "'after'", "'before'", "'coincide'", "'min'", "'max'", "'avg'", "'sum'", "'count'", "'sec'", "'act'", "'set'", "'or'", "'and'", "'!='", "'=='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'%'", "'.get()'", "'not'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSensinactParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSensinactParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSensinactParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g"; }



     	private SensinactGrammarAccess grammarAccess;
     	
        public InternalSensinactParser(TokenStream input, SensinactGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Sensinact";	
       	}
       	
       	@Override
       	protected SensinactGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSensinact"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:67:1: entryRuleSensinact returns [EObject current=null] : iv_ruleSensinact= ruleSensinact EOF ;
    public final EObject entryRuleSensinact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensinact = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:68:2: (iv_ruleSensinact= ruleSensinact EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:69:2: iv_ruleSensinact= ruleSensinact EOF
            {
             newCompositeNode(grammarAccess.getSensinactRule()); 
            pushFollow(FOLLOW_ruleSensinact_in_entryRuleSensinact75);
            iv_ruleSensinact=ruleSensinact();

            state._fsp--;

             current =iv_ruleSensinact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensinact85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensinact"


    // $ANTLR start "ruleSensinact"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:76:1: ruleSensinact returns [EObject current=null] : ( () ( (lv_eca_1_0= ruleDSL_SENSINACT ) ) ) ;
    public final EObject ruleSensinact() throws RecognitionException {
        EObject current = null;

        EObject lv_eca_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:79:28: ( ( () ( (lv_eca_1_0= ruleDSL_SENSINACT ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:80:1: ( () ( (lv_eca_1_0= ruleDSL_SENSINACT ) ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:80:1: ( () ( (lv_eca_1_0= ruleDSL_SENSINACT ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:80:2: () ( (lv_eca_1_0= ruleDSL_SENSINACT ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:80:2: ()
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensinactAccess().getSensinactAction_0(),
                        current);
                

            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:86:2: ( (lv_eca_1_0= ruleDSL_SENSINACT ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:87:1: (lv_eca_1_0= ruleDSL_SENSINACT )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:87:1: (lv_eca_1_0= ruleDSL_SENSINACT )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:88:3: lv_eca_1_0= ruleDSL_SENSINACT
            {
             
            	        newCompositeNode(grammarAccess.getSensinactAccess().getEcaDSL_SENSINACTParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_SENSINACT_in_ruleSensinact140);
            lv_eca_1_0=ruleDSL_SENSINACT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensinactRule());
            	        }
                   		set(
                   			current, 
                   			"eca",
                    		lv_eca_1_0, 
                    		"DSL_SENSINACT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensinact"


    // $ANTLR start "entryRuleDSL_SENSINACT"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:112:1: entryRuleDSL_SENSINACT returns [EObject current=null] : iv_ruleDSL_SENSINACT= ruleDSL_SENSINACT EOF ;
    public final EObject entryRuleDSL_SENSINACT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_SENSINACT = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:113:2: (iv_ruleDSL_SENSINACT= ruleDSL_SENSINACT EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:114:2: iv_ruleDSL_SENSINACT= ruleDSL_SENSINACT EOF
            {
             newCompositeNode(grammarAccess.getDSL_SENSINACTRule()); 
            pushFollow(FOLLOW_ruleDSL_SENSINACT_in_entryRuleDSL_SENSINACT176);
            iv_ruleDSL_SENSINACT=ruleDSL_SENSINACT();

            state._fsp--;

             current =iv_ruleDSL_SENSINACT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_SENSINACT186); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_SENSINACT"


    // $ANTLR start "ruleDSL_SENSINACT"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:121:1: ruleDSL_SENSINACT returns [EObject current=null] : ( ( (lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART ) )? ( (lv_resources_1_0= ruleDSL_Resource ) )+ ( (lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC ) )* ( (lv_cep_3_0= ruleDSL_CEP_STATEMENT ) )* ( (lv_on_4_0= ruleDSL_On ) ) ( (lv_eca_5_0= ruleDSL_ECA_STATEMENT ) ) ) ;
    public final EObject ruleDSL_SENSINACT() throws RecognitionException {
        EObject current = null;

        EObject lv_autostart_0_0 = null;

        EObject lv_resources_1_0 = null;

        EObject lv_prob_2_0 = null;

        EObject lv_cep_3_0 = null;

        EObject lv_on_4_0 = null;

        EObject lv_eca_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:124:28: ( ( ( (lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART ) )? ( (lv_resources_1_0= ruleDSL_Resource ) )+ ( (lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC ) )* ( (lv_cep_3_0= ruleDSL_CEP_STATEMENT ) )* ( (lv_on_4_0= ruleDSL_On ) ) ( (lv_eca_5_0= ruleDSL_ECA_STATEMENT ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:125:1: ( ( (lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART ) )? ( (lv_resources_1_0= ruleDSL_Resource ) )+ ( (lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC ) )* ( (lv_cep_3_0= ruleDSL_CEP_STATEMENT ) )* ( (lv_on_4_0= ruleDSL_On ) ) ( (lv_eca_5_0= ruleDSL_ECA_STATEMENT ) ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:125:1: ( ( (lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART ) )? ( (lv_resources_1_0= ruleDSL_Resource ) )+ ( (lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC ) )* ( (lv_cep_3_0= ruleDSL_CEP_STATEMENT ) )* ( (lv_on_4_0= ruleDSL_On ) ) ( (lv_eca_5_0= ruleDSL_ECA_STATEMENT ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:125:2: ( (lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART ) )? ( (lv_resources_1_0= ruleDSL_Resource ) )+ ( (lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC ) )* ( (lv_cep_3_0= ruleDSL_CEP_STATEMENT ) )* ( (lv_on_4_0= ruleDSL_On ) ) ( (lv_eca_5_0= ruleDSL_ECA_STATEMENT ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:125:2: ( (lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:126:1: (lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:126:1: (lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:127:3: lv_autostart_0_0= ruleDSL_FLAG_AUTOSTART
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_SENSINACTAccess().getAutostartDSL_FLAG_AUTOSTARTParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_FLAG_AUTOSTART_in_ruleDSL_SENSINACT232);
                    lv_autostart_0_0=ruleDSL_FLAG_AUTOSTART();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_SENSINACTRule());
                    	        }
                           		set(
                           			current, 
                           			"autostart",
                            		lv_autostart_0_0, 
                            		"DSL_FLAG_AUTOSTART");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:143:3: ( (lv_resources_1_0= ruleDSL_Resource ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:144:1: (lv_resources_1_0= ruleDSL_Resource )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:144:1: (lv_resources_1_0= ruleDSL_Resource )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:145:3: lv_resources_1_0= ruleDSL_Resource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_SENSINACTAccess().getResourcesDSL_ResourceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Resource_in_ruleDSL_SENSINACT254);
            	    lv_resources_1_0=ruleDSL_Resource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_SENSINACTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_1_0, 
            	            		"DSL_Resource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:161:3: ( (lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:162:1: (lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:162:1: (lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:163:3: lv_prob_2_0= ruleDSL_CLOCK_STOCHASTIC
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_SENSINACTAccess().getProbDSL_CLOCK_STOCHASTICParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_CLOCK_STOCHASTIC_in_ruleDSL_SENSINACT276);
            	    lv_prob_2_0=ruleDSL_CLOCK_STOCHASTIC();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_SENSINACTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prob",
            	            		lv_prob_2_0, 
            	            		"DSL_CLOCK_STOCHASTIC");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:179:3: ( (lv_cep_3_0= ruleDSL_CEP_STATEMENT ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:180:1: (lv_cep_3_0= ruleDSL_CEP_STATEMENT )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:180:1: (lv_cep_3_0= ruleDSL_CEP_STATEMENT )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:181:3: lv_cep_3_0= ruleDSL_CEP_STATEMENT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_SENSINACTAccess().getCepDSL_CEP_STATEMENTParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_CEP_STATEMENT_in_ruleDSL_SENSINACT298);
            	    lv_cep_3_0=ruleDSL_CEP_STATEMENT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_SENSINACTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cep",
            	            		lv_cep_3_0, 
            	            		"DSL_CEP_STATEMENT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:197:3: ( (lv_on_4_0= ruleDSL_On ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:198:1: (lv_on_4_0= ruleDSL_On )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:198:1: (lv_on_4_0= ruleDSL_On )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:199:3: lv_on_4_0= ruleDSL_On
            {
             
            	        newCompositeNode(grammarAccess.getDSL_SENSINACTAccess().getOnDSL_OnParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_On_in_ruleDSL_SENSINACT320);
            lv_on_4_0=ruleDSL_On();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_SENSINACTRule());
            	        }
                   		set(
                   			current, 
                   			"on",
                    		lv_on_4_0, 
                    		"DSL_On");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:215:2: ( (lv_eca_5_0= ruleDSL_ECA_STATEMENT ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:216:1: (lv_eca_5_0= ruleDSL_ECA_STATEMENT )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:216:1: (lv_eca_5_0= ruleDSL_ECA_STATEMENT )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:217:3: lv_eca_5_0= ruleDSL_ECA_STATEMENT
            {
             
            	        newCompositeNode(grammarAccess.getDSL_SENSINACTAccess().getEcaDSL_ECA_STATEMENTParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_ECA_STATEMENT_in_ruleDSL_SENSINACT341);
            lv_eca_5_0=ruleDSL_ECA_STATEMENT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_SENSINACTRule());
            	        }
                   		set(
                   			current, 
                   			"eca",
                    		lv_eca_5_0, 
                    		"DSL_ECA_STATEMENT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_SENSINACT"


    // $ANTLR start "entryRuleDSL_CLOCK_STOCHASTIC"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:241:1: entryRuleDSL_CLOCK_STOCHASTIC returns [EObject current=null] : iv_ruleDSL_CLOCK_STOCHASTIC= ruleDSL_CLOCK_STOCHASTIC EOF ;
    public final EObject entryRuleDSL_CLOCK_STOCHASTIC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CLOCK_STOCHASTIC = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:242:2: (iv_ruleDSL_CLOCK_STOCHASTIC= ruleDSL_CLOCK_STOCHASTIC EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:243:2: iv_ruleDSL_CLOCK_STOCHASTIC= ruleDSL_CLOCK_STOCHASTIC EOF
            {
             newCompositeNode(grammarAccess.getDSL_CLOCK_STOCHASTICRule()); 
            pushFollow(FOLLOW_ruleDSL_CLOCK_STOCHASTIC_in_entryRuleDSL_CLOCK_STOCHASTIC377);
            iv_ruleDSL_CLOCK_STOCHASTIC=ruleDSL_CLOCK_STOCHASTIC();

            state._fsp--;

             current =iv_ruleDSL_CLOCK_STOCHASTIC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CLOCK_STOCHASTIC387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CLOCK_STOCHASTIC"


    // $ANTLR start "ruleDSL_CLOCK_STOCHASTIC"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:250:1: ruleDSL_CLOCK_STOCHASTIC returns [EObject current=null] : ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (lv_value_5_0= ruleNUMBER ) ) ) | (otherlv_6= 'use' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'with' (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' ) otherlv_15= '(' ( (lv_param1_16_0= ruleNUMBER ) ) otherlv_17= ',' ( (lv_param2_18_0= ruleNUMBER ) ) otherlv_19= ')' ) ) ;
    public final EObject ruleDSL_CLOCK_STOCHASTIC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_param1_16_0 = null;

        AntlrDatatypeRuleToken lv_param2_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:253:28: ( ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (lv_value_5_0= ruleNUMBER ) ) ) | (otherlv_6= 'use' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'with' (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' ) otherlv_15= '(' ( (lv_param1_16_0= ruleNUMBER ) ) otherlv_17= ',' ( (lv_param2_18_0= ruleNUMBER ) ) otherlv_19= ')' ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:254:1: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (lv_value_5_0= ruleNUMBER ) ) ) | (otherlv_6= 'use' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'with' (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' ) otherlv_15= '(' ( (lv_param1_16_0= ruleNUMBER ) ) otherlv_17= ',' ( (lv_param2_18_0= ruleNUMBER ) ) otherlv_19= ')' ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:254:1: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (lv_value_5_0= ruleNUMBER ) ) ) | (otherlv_6= 'use' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'with' (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' ) otherlv_15= '(' ( (lv_param1_16_0= ruleNUMBER ) ) otherlv_17= ',' ( (lv_param2_18_0= ruleNUMBER ) ) otherlv_19= ')' ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:254:2: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (lv_value_5_0= ruleNUMBER ) ) )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:254:2: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (lv_value_5_0= ruleNUMBER ) ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:254:4: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (lv_value_5_0= ruleNUMBER ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleDSL_CLOCK_STOCHASTIC425); 

                        	newLeafNode(otherlv_0, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getUseKeyword_0_0());
                        
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:258:1: ( (otherlv_1= RULE_ID ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:259:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:259:1: (otherlv_1= RULE_ID )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:260:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSL_CLOCK_STOCHASTICRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_CLOCK_STOCHASTIC445); 

                    		newLeafNode(otherlv_1, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getRefDSL_ResourceCrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:271:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:271:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CLOCK_STOCHASTIC458); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getCommaKeyword_0_2_0());
                    	        
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:275:1: ( (otherlv_3= RULE_ID ) )
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:276:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:276:1: (otherlv_3= RULE_ID )
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:277:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDSL_CLOCK_STOCHASTICRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_CLOCK_STOCHASTIC478); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getRefDSL_ResourceCrossReference_0_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDSL_CLOCK_STOCHASTIC492); 

                        	newLeafNode(otherlv_4, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getWithKeyword_0_3());
                        
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:292:1: ( (lv_value_5_0= ruleNUMBER ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:293:1: (lv_value_5_0= ruleNUMBER )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:293:1: (lv_value_5_0= ruleNUMBER )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:294:3: lv_value_5_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getValueNUMBERParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleDSL_CLOCK_STOCHASTIC513);
                    lv_value_5_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CLOCK_STOCHASTICRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"NUMBER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:311:6: (otherlv_6= 'use' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'with' (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' ) otherlv_15= '(' ( (lv_param1_16_0= ruleNUMBER ) ) otherlv_17= ',' ( (lv_param2_18_0= ruleNUMBER ) ) otherlv_19= ')' )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:311:6: (otherlv_6= 'use' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'with' (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' ) otherlv_15= '(' ( (lv_param1_16_0= ruleNUMBER ) ) otherlv_17= ',' ( (lv_param2_18_0= ruleNUMBER ) ) otherlv_19= ')' )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:311:8: otherlv_6= 'use' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'with' (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' ) otherlv_15= '(' ( (lv_param1_16_0= ruleNUMBER ) ) otherlv_17= ',' ( (lv_param2_18_0= ruleNUMBER ) ) otherlv_19= ')'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleDSL_CLOCK_STOCHASTIC533); 

                        	newLeafNode(otherlv_6, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getUseKeyword_1_0());
                        
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:315:1: ( (otherlv_7= RULE_ID ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:316:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:316:1: (otherlv_7= RULE_ID )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:317:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSL_CLOCK_STOCHASTICRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_CLOCK_STOCHASTIC553); 

                    		newLeafNode(otherlv_7, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getRefDSL_ResourceCrossReference_1_1_0()); 
                    	

                    }


                    }

                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:328:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:328:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CLOCK_STOCHASTIC566); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:332:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:333:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:333:1: (otherlv_9= RULE_ID )
                    	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:334:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDSL_CLOCK_STOCHASTICRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_CLOCK_STOCHASTIC586); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getRefDSL_ResourceCrossReference_1_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleDSL_CLOCK_STOCHASTIC600); 

                        	newLeafNode(otherlv_10, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getWithKeyword_1_3());
                        
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:349:1: (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' )
                    int alt7=4;
                    switch ( input.LA(1) ) {
                    case 15:
                        {
                        alt7=1;
                        }
                        break;
                    case 16:
                        {
                        alt7=2;
                        }
                        break;
                    case 17:
                        {
                        alt7=3;
                        }
                        break;
                    case 18:
                        {
                        alt7=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }

                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:349:3: otherlv_11= 'W'
                            {
                            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleDSL_CLOCK_STOCHASTIC613); 

                                	newLeafNode(otherlv_11, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getWKeyword_1_4_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:354:7: otherlv_12= 'N'
                            {
                            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleDSL_CLOCK_STOCHASTIC631); 

                                	newLeafNode(otherlv_12, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getNKeyword_1_4_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:359:7: otherlv_13= 'E'
                            {
                            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleDSL_CLOCK_STOCHASTIC649); 

                                	newLeafNode(otherlv_13, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getEKeyword_1_4_2());
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:364:7: otherlv_14= 'U'
                            {
                            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleDSL_CLOCK_STOCHASTIC667); 

                                	newLeafNode(otherlv_14, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getUKeyword_1_4_3());
                                

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CLOCK_STOCHASTIC680); 

                        	newLeafNode(otherlv_15, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getLeftParenthesisKeyword_1_5());
                        
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:372:1: ( (lv_param1_16_0= ruleNUMBER ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:373:1: (lv_param1_16_0= ruleNUMBER )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:373:1: (lv_param1_16_0= ruleNUMBER )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:374:3: lv_param1_16_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getParam1NUMBERParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleDSL_CLOCK_STOCHASTIC701);
                    lv_param1_16_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CLOCK_STOCHASTICRule());
                    	        }
                           		set(
                           			current, 
                           			"param1",
                            		lv_param1_16_0, 
                            		"NUMBER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CLOCK_STOCHASTIC713); 

                        	newLeafNode(otherlv_17, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getCommaKeyword_1_7());
                        
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:394:1: ( (lv_param2_18_0= ruleNUMBER ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:395:1: (lv_param2_18_0= ruleNUMBER )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:395:1: (lv_param2_18_0= ruleNUMBER )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:396:3: lv_param2_18_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getParam2NUMBERParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleDSL_CLOCK_STOCHASTIC734);
                    lv_param2_18_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CLOCK_STOCHASTICRule());
                    	        }
                           		set(
                           			current, 
                           			"param2",
                            		lv_param2_18_0, 
                            		"NUMBER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CLOCK_STOCHASTIC746); 

                        	newLeafNode(otherlv_19, grammarAccess.getDSL_CLOCK_STOCHASTICAccess().getRightParenthesisKeyword_1_9());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CLOCK_STOCHASTIC"


    // $ANTLR start "entryRuleDSL_FLAG_AUTOSTART"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:424:1: entryRuleDSL_FLAG_AUTOSTART returns [EObject current=null] : iv_ruleDSL_FLAG_AUTOSTART= ruleDSL_FLAG_AUTOSTART EOF ;
    public final EObject entryRuleDSL_FLAG_AUTOSTART() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_FLAG_AUTOSTART = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:425:2: (iv_ruleDSL_FLAG_AUTOSTART= ruleDSL_FLAG_AUTOSTART EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:426:2: iv_ruleDSL_FLAG_AUTOSTART= ruleDSL_FLAG_AUTOSTART EOF
            {
             newCompositeNode(grammarAccess.getDSL_FLAG_AUTOSTARTRule()); 
            pushFollow(FOLLOW_ruleDSL_FLAG_AUTOSTART_in_entryRuleDSL_FLAG_AUTOSTART783);
            iv_ruleDSL_FLAG_AUTOSTART=ruleDSL_FLAG_AUTOSTART();

            state._fsp--;

             current =iv_ruleDSL_FLAG_AUTOSTART; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_FLAG_AUTOSTART793); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_FLAG_AUTOSTART"


    // $ANTLR start "ruleDSL_FLAG_AUTOSTART"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:433:1: ruleDSL_FLAG_AUTOSTART returns [EObject current=null] : (otherlv_0= 'option' otherlv_1= 'autostart' otherlv_2= '=' ( (lv_activated_3_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleDSL_FLAG_AUTOSTART() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_activated_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:436:28: ( (otherlv_0= 'option' otherlv_1= 'autostart' otherlv_2= '=' ( (lv_activated_3_0= RULE_BOOLEAN ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:437:1: (otherlv_0= 'option' otherlv_1= 'autostart' otherlv_2= '=' ( (lv_activated_3_0= RULE_BOOLEAN ) ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:437:1: (otherlv_0= 'option' otherlv_1= 'autostart' otherlv_2= '=' ( (lv_activated_3_0= RULE_BOOLEAN ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:437:3: otherlv_0= 'option' otherlv_1= 'autostart' otherlv_2= '=' ( (lv_activated_3_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDSL_FLAG_AUTOSTART830); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_FLAG_AUTOSTARTAccess().getOptionKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleDSL_FLAG_AUTOSTART842); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_FLAG_AUTOSTARTAccess().getAutostartKeyword_1());
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleDSL_FLAG_AUTOSTART854); 

                	newLeafNode(otherlv_2, grammarAccess.getDSL_FLAG_AUTOSTARTAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:449:1: ( (lv_activated_3_0= RULE_BOOLEAN ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:450:1: (lv_activated_3_0= RULE_BOOLEAN )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:450:1: (lv_activated_3_0= RULE_BOOLEAN )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:451:3: lv_activated_3_0= RULE_BOOLEAN
            {
            lv_activated_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleDSL_FLAG_AUTOSTART871); 

            			newLeafNode(lv_activated_3_0, grammarAccess.getDSL_FLAG_AUTOSTARTAccess().getActivatedBOOLEANTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDSL_FLAG_AUTOSTARTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"activated",
                    		lv_activated_3_0, 
                    		"BOOLEAN");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_FLAG_AUTOSTART"


    // $ANTLR start "entryRuleDSL_Resource"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:475:1: entryRuleDSL_Resource returns [EObject current=null] : iv_ruleDSL_Resource= ruleDSL_Resource EOF ;
    public final EObject entryRuleDSL_Resource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Resource = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:476:2: (iv_ruleDSL_Resource= ruleDSL_Resource EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:477:2: iv_ruleDSL_Resource= ruleDSL_Resource EOF
            {
             newCompositeNode(grammarAccess.getDSL_ResourceRule()); 
            pushFollow(FOLLOW_ruleDSL_Resource_in_entryRuleDSL_Resource912);
            iv_ruleDSL_Resource=ruleDSL_Resource();

            state._fsp--;

             current =iv_ruleDSL_Resource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_Resource922); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_Resource"


    // $ANTLR start "ruleDSL_Resource"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:484:1: ruleDSL_Resource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_gatewayID_4_0= ruleEXTENDED_ID ) ) otherlv_5= '/' ( (lv_deviceID_6_0= ruleEXTENDED_ID ) ) otherlv_7= '/' ( (lv_serviceID_8_0= ruleEXTENDED_ID ) ) otherlv_9= '/' ( (lv_resourceID_10_0= ruleEXTENDED_ID ) ) otherlv_11= ']' ) ;
    public final EObject ruleDSL_Resource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_gatewayID_4_0 = null;

        AntlrDatatypeRuleToken lv_deviceID_6_0 = null;

        AntlrDatatypeRuleToken lv_serviceID_8_0 = null;

        AntlrDatatypeRuleToken lv_resourceID_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:487:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_gatewayID_4_0= ruleEXTENDED_ID ) ) otherlv_5= '/' ( (lv_deviceID_6_0= ruleEXTENDED_ID ) ) otherlv_7= '/' ( (lv_serviceID_8_0= ruleEXTENDED_ID ) ) otherlv_9= '/' ( (lv_resourceID_10_0= ruleEXTENDED_ID ) ) otherlv_11= ']' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:488:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_gatewayID_4_0= ruleEXTENDED_ID ) ) otherlv_5= '/' ( (lv_deviceID_6_0= ruleEXTENDED_ID ) ) otherlv_7= '/' ( (lv_serviceID_8_0= ruleEXTENDED_ID ) ) otherlv_9= '/' ( (lv_resourceID_10_0= ruleEXTENDED_ID ) ) otherlv_11= ']' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:488:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_gatewayID_4_0= ruleEXTENDED_ID ) ) otherlv_5= '/' ( (lv_deviceID_6_0= ruleEXTENDED_ID ) ) otherlv_7= '/' ( (lv_serviceID_8_0= ruleEXTENDED_ID ) ) otherlv_9= '/' ( (lv_resourceID_10_0= ruleEXTENDED_ID ) ) otherlv_11= ']' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:488:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_gatewayID_4_0= ruleEXTENDED_ID ) ) otherlv_5= '/' ( (lv_deviceID_6_0= ruleEXTENDED_ID ) ) otherlv_7= '/' ( (lv_serviceID_8_0= ruleEXTENDED_ID ) ) otherlv_9= '/' ( (lv_resourceID_10_0= ruleEXTENDED_ID ) ) otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleDSL_Resource959); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_ResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:492:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:493:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:493:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:494:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_Resource976); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDSL_ResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDSL_ResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleDSL_Resource993); 

                	newLeafNode(otherlv_2, grammarAccess.getDSL_ResourceAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleDSL_Resource1005); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_ResourceAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:518:1: ( (lv_gatewayID_4_0= ruleEXTENDED_ID ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:519:1: (lv_gatewayID_4_0= ruleEXTENDED_ID )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:519:1: (lv_gatewayID_4_0= ruleEXTENDED_ID )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:520:3: lv_gatewayID_4_0= ruleEXTENDED_ID
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ResourceAccess().getGatewayIDEXTENDED_IDParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEXTENDED_ID_in_ruleDSL_Resource1026);
            lv_gatewayID_4_0=ruleEXTENDED_ID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ResourceRule());
            	        }
                   		set(
                   			current, 
                   			"gatewayID",
                    		lv_gatewayID_4_0, 
                    		"EXTENDED_ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleDSL_Resource1038); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_ResourceAccess().getSolidusKeyword_5());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:540:1: ( (lv_deviceID_6_0= ruleEXTENDED_ID ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:541:1: (lv_deviceID_6_0= ruleEXTENDED_ID )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:541:1: (lv_deviceID_6_0= ruleEXTENDED_ID )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:542:3: lv_deviceID_6_0= ruleEXTENDED_ID
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ResourceAccess().getDeviceIDEXTENDED_IDParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEXTENDED_ID_in_ruleDSL_Resource1059);
            lv_deviceID_6_0=ruleEXTENDED_ID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ResourceRule());
            	        }
                   		set(
                   			current, 
                   			"deviceID",
                    		lv_deviceID_6_0, 
                    		"EXTENDED_ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleDSL_Resource1071); 

                	newLeafNode(otherlv_7, grammarAccess.getDSL_ResourceAccess().getSolidusKeyword_7());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:562:1: ( (lv_serviceID_8_0= ruleEXTENDED_ID ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:563:1: (lv_serviceID_8_0= ruleEXTENDED_ID )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:563:1: (lv_serviceID_8_0= ruleEXTENDED_ID )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:564:3: lv_serviceID_8_0= ruleEXTENDED_ID
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ResourceAccess().getServiceIDEXTENDED_IDParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleEXTENDED_ID_in_ruleDSL_Resource1092);
            lv_serviceID_8_0=ruleEXTENDED_ID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ResourceRule());
            	        }
                   		set(
                   			current, 
                   			"serviceID",
                    		lv_serviceID_8_0, 
                    		"EXTENDED_ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleDSL_Resource1104); 

                	newLeafNode(otherlv_9, grammarAccess.getDSL_ResourceAccess().getSolidusKeyword_9());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:584:1: ( (lv_resourceID_10_0= ruleEXTENDED_ID ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:585:1: (lv_resourceID_10_0= ruleEXTENDED_ID )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:585:1: (lv_resourceID_10_0= ruleEXTENDED_ID )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:586:3: lv_resourceID_10_0= ruleEXTENDED_ID
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ResourceAccess().getResourceIDEXTENDED_IDParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleEXTENDED_ID_in_ruleDSL_Resource1125);
            lv_resourceID_10_0=ruleEXTENDED_ID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ResourceRule());
            	        }
                   		set(
                   			current, 
                   			"resourceID",
                    		lv_resourceID_10_0, 
                    		"EXTENDED_ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleDSL_Resource1137); 

                	newLeafNode(otherlv_11, grammarAccess.getDSL_ResourceAccess().getRightSquareBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_Resource"


    // $ANTLR start "entryRuleDSL_On"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:614:1: entryRuleDSL_On returns [EObject current=null] : iv_ruleDSL_On= ruleDSL_On EOF ;
    public final EObject entryRuleDSL_On() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_On = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:615:2: (iv_ruleDSL_On= ruleDSL_On EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:616:2: iv_ruleDSL_On= ruleDSL_On EOF
            {
             newCompositeNode(grammarAccess.getDSL_OnRule()); 
            pushFollow(FOLLOW_ruleDSL_On_in_entryRuleDSL_On1173);
            iv_ruleDSL_On=ruleDSL_On();

            state._fsp--;

             current =iv_ruleDSL_On; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_On1183); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_On"


    // $ANTLR start "ruleDSL_On"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:623:1: ruleDSL_On returns [EObject current=null] : (otherlv_0= 'on' ( (lv_triggers_1_0= ruleDSL_REF_CONDITION ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleDSL_REF_CONDITION ) ) )* ) ;
    public final EObject ruleDSL_On() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_triggers_1_0 = null;

        EObject lv_triggers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:626:28: ( (otherlv_0= 'on' ( (lv_triggers_1_0= ruleDSL_REF_CONDITION ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleDSL_REF_CONDITION ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:627:1: (otherlv_0= 'on' ( (lv_triggers_1_0= ruleDSL_REF_CONDITION ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleDSL_REF_CONDITION ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:627:1: (otherlv_0= 'on' ( (lv_triggers_1_0= ruleDSL_REF_CONDITION ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleDSL_REF_CONDITION ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:627:3: otherlv_0= 'on' ( (lv_triggers_1_0= ruleDSL_REF_CONDITION ) ) (otherlv_2= ',' ( (lv_triggers_3_0= ruleDSL_REF_CONDITION ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleDSL_On1220); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_OnAccess().getOnKeyword_0());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:631:1: ( (lv_triggers_1_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:632:1: (lv_triggers_1_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:632:1: (lv_triggers_1_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:633:3: lv_triggers_1_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_OnAccess().getTriggersDSL_REF_CONDITIONParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_On1241);
            lv_triggers_1_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_OnRule());
            	        }
                   		add(
                   			current, 
                   			"triggers",
                    		lv_triggers_1_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:649:2: (otherlv_2= ',' ( (lv_triggers_3_0= ruleDSL_REF_CONDITION ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:649:4: otherlv_2= ',' ( (lv_triggers_3_0= ruleDSL_REF_CONDITION ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDSL_On1254); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDSL_OnAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:653:1: ( (lv_triggers_3_0= ruleDSL_REF_CONDITION ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:654:1: (lv_triggers_3_0= ruleDSL_REF_CONDITION )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:654:1: (lv_triggers_3_0= ruleDSL_REF_CONDITION )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:655:3: lv_triggers_3_0= ruleDSL_REF_CONDITION
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_OnAccess().getTriggersDSL_REF_CONDITIONParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_On1275);
            	    lv_triggers_3_0=ruleDSL_REF_CONDITION();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_OnRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"triggers",
            	            		lv_triggers_3_0, 
            	            		"DSL_REF_CONDITION");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_On"


    // $ANTLR start "entryRuleDSL_ECA_STATEMENT"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:679:1: entryRuleDSL_ECA_STATEMENT returns [EObject current=null] : iv_ruleDSL_ECA_STATEMENT= ruleDSL_ECA_STATEMENT EOF ;
    public final EObject entryRuleDSL_ECA_STATEMENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_ECA_STATEMENT = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:680:2: (iv_ruleDSL_ECA_STATEMENT= ruleDSL_ECA_STATEMENT EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:681:2: iv_ruleDSL_ECA_STATEMENT= ruleDSL_ECA_STATEMENT EOF
            {
             newCompositeNode(grammarAccess.getDSL_ECA_STATEMENTRule()); 
            pushFollow(FOLLOW_ruleDSL_ECA_STATEMENT_in_entryRuleDSL_ECA_STATEMENT1313);
            iv_ruleDSL_ECA_STATEMENT=ruleDSL_ECA_STATEMENT();

            state._fsp--;

             current =iv_ruleDSL_ECA_STATEMENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_ECA_STATEMENT1323); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_ECA_STATEMENT"


    // $ANTLR start "ruleDSL_ECA_STATEMENT"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:688:1: ruleDSL_ECA_STATEMENT returns [EObject current=null] : ( ( (lv_ifdo_0_0= ruleDSL_IfDo ) ) ( (lv_elseIfdo_1_0= ruleDSL_ElseIfDo ) )* ( (lv_elsedo_2_0= ruleDSL_ElseDo ) )? otherlv_3= 'end if' ) ;
    public final EObject ruleDSL_ECA_STATEMENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_ifdo_0_0 = null;

        EObject lv_elseIfdo_1_0 = null;

        EObject lv_elsedo_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:691:28: ( ( ( (lv_ifdo_0_0= ruleDSL_IfDo ) ) ( (lv_elseIfdo_1_0= ruleDSL_ElseIfDo ) )* ( (lv_elsedo_2_0= ruleDSL_ElseDo ) )? otherlv_3= 'end if' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:692:1: ( ( (lv_ifdo_0_0= ruleDSL_IfDo ) ) ( (lv_elseIfdo_1_0= ruleDSL_ElseIfDo ) )* ( (lv_elsedo_2_0= ruleDSL_ElseDo ) )? otherlv_3= 'end if' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:692:1: ( ( (lv_ifdo_0_0= ruleDSL_IfDo ) ) ( (lv_elseIfdo_1_0= ruleDSL_ElseIfDo ) )* ( (lv_elsedo_2_0= ruleDSL_ElseDo ) )? otherlv_3= 'end if' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:692:2: ( (lv_ifdo_0_0= ruleDSL_IfDo ) ) ( (lv_elseIfdo_1_0= ruleDSL_ElseIfDo ) )* ( (lv_elsedo_2_0= ruleDSL_ElseDo ) )? otherlv_3= 'end if'
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:692:2: ( (lv_ifdo_0_0= ruleDSL_IfDo ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:693:1: (lv_ifdo_0_0= ruleDSL_IfDo )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:693:1: (lv_ifdo_0_0= ruleDSL_IfDo )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:694:3: lv_ifdo_0_0= ruleDSL_IfDo
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ECA_STATEMENTAccess().getIfdoDSL_IfDoParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_IfDo_in_ruleDSL_ECA_STATEMENT1369);
            lv_ifdo_0_0=ruleDSL_IfDo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ECA_STATEMENTRule());
            	        }
                   		set(
                   			current, 
                   			"ifdo",
                    		lv_ifdo_0_0, 
                    		"DSL_IfDo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:710:2: ( (lv_elseIfdo_1_0= ruleDSL_ElseIfDo ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:711:1: (lv_elseIfdo_1_0= ruleDSL_ElseIfDo )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:711:1: (lv_elseIfdo_1_0= ruleDSL_ElseIfDo )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:712:3: lv_elseIfdo_1_0= ruleDSL_ElseIfDo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_ECA_STATEMENTAccess().getElseIfdoDSL_ElseIfDoParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_ElseIfDo_in_ruleDSL_ECA_STATEMENT1390);
            	    lv_elseIfdo_1_0=ruleDSL_ElseIfDo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_ECA_STATEMENTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elseIfdo",
            	            		lv_elseIfdo_1_0, 
            	            		"DSL_ElseIfDo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:728:3: ( (lv_elsedo_2_0= ruleDSL_ElseDo ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:729:1: (lv_elsedo_2_0= ruleDSL_ElseDo )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:729:1: (lv_elsedo_2_0= ruleDSL_ElseDo )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:730:3: lv_elsedo_2_0= ruleDSL_ElseDo
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_ECA_STATEMENTAccess().getElsedoDSL_ElseDoParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_ElseDo_in_ruleDSL_ECA_STATEMENT1412);
                    lv_elsedo_2_0=ruleDSL_ElseDo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_ECA_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"elsedo",
                            		lv_elsedo_2_0, 
                            		"DSL_ElseDo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDSL_ECA_STATEMENT1425); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_ECA_STATEMENTAccess().getEndIfKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_ECA_STATEMENT"


    // $ANTLR start "entryRuleDSL_IfDo"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:758:1: entryRuleDSL_IfDo returns [EObject current=null] : iv_ruleDSL_IfDo= ruleDSL_IfDo EOF ;
    public final EObject entryRuleDSL_IfDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_IfDo = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:759:2: (iv_ruleDSL_IfDo= ruleDSL_IfDo EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:760:2: iv_ruleDSL_IfDo= ruleDSL_IfDo EOF
            {
             newCompositeNode(grammarAccess.getDSL_IfDoRule()); 
            pushFollow(FOLLOW_ruleDSL_IfDo_in_entryRuleDSL_IfDo1461);
            iv_ruleDSL_IfDo=ruleDSL_IfDo();

            state._fsp--;

             current =iv_ruleDSL_IfDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_IfDo1471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_IfDo"


    // $ANTLR start "ruleDSL_IfDo"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:767:1: ruleDSL_IfDo returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) ) ) ;
    public final EObject ruleDSL_IfDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:770:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:771:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:771:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:771:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDSL_IfDo1508); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_IfDoAccess().getIfKeyword_0());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:775:1: ( (lv_condition_1_0= ruleDSL_Expression_Or ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:776:1: (lv_condition_1_0= ruleDSL_Expression_Or )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:776:1: (lv_condition_1_0= ruleDSL_Expression_Or )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:777:3: lv_condition_1_0= ruleDSL_Expression_Or
            {
             
            	        newCompositeNode(grammarAccess.getDSL_IfDoAccess().getConditionDSL_Expression_OrParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_IfDo1529);
            lv_condition_1_0=ruleDSL_Expression_Or();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_IfDoRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"DSL_Expression_Or");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleDSL_IfDo1541); 

                	newLeafNode(otherlv_2, grammarAccess.getDSL_IfDoAccess().getDoKeyword_2());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:797:1: ( (lv_actions_3_0= ruleDSL_ListActions ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:798:1: (lv_actions_3_0= ruleDSL_ListActions )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:798:1: (lv_actions_3_0= ruleDSL_ListActions )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:799:3: lv_actions_3_0= ruleDSL_ListActions
            {
             
            	        newCompositeNode(grammarAccess.getDSL_IfDoAccess().getActionsDSL_ListActionsParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_ListActions_in_ruleDSL_IfDo1562);
            lv_actions_3_0=ruleDSL_ListActions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_IfDoRule());
            	        }
                   		set(
                   			current, 
                   			"actions",
                    		lv_actions_3_0, 
                    		"DSL_ListActions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_IfDo"


    // $ANTLR start "entryRuleDSL_ElseIfDo"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:823:1: entryRuleDSL_ElseIfDo returns [EObject current=null] : iv_ruleDSL_ElseIfDo= ruleDSL_ElseIfDo EOF ;
    public final EObject entryRuleDSL_ElseIfDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_ElseIfDo = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:824:2: (iv_ruleDSL_ElseIfDo= ruleDSL_ElseIfDo EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:825:2: iv_ruleDSL_ElseIfDo= ruleDSL_ElseIfDo EOF
            {
             newCompositeNode(grammarAccess.getDSL_ElseIfDoRule()); 
            pushFollow(FOLLOW_ruleDSL_ElseIfDo_in_entryRuleDSL_ElseIfDo1598);
            iv_ruleDSL_ElseIfDo=ruleDSL_ElseIfDo();

            state._fsp--;

             current =iv_ruleDSL_ElseIfDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_ElseIfDo1608); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_ElseIfDo"


    // $ANTLR start "ruleDSL_ElseIfDo"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:832:1: ruleDSL_ElseIfDo returns [EObject current=null] : (otherlv_0= 'else if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) ) ) ;
    public final EObject ruleDSL_ElseIfDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:835:28: ( (otherlv_0= 'else if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:836:1: (otherlv_0= 'else if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:836:1: (otherlv_0= 'else if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:836:3: otherlv_0= 'else if' ( (lv_condition_1_0= ruleDSL_Expression_Or ) ) otherlv_2= 'do' ( (lv_actions_3_0= ruleDSL_ListActions ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleDSL_ElseIfDo1645); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_ElseIfDoAccess().getElseIfKeyword_0());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:840:1: ( (lv_condition_1_0= ruleDSL_Expression_Or ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:841:1: (lv_condition_1_0= ruleDSL_Expression_Or )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:841:1: (lv_condition_1_0= ruleDSL_Expression_Or )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:842:3: lv_condition_1_0= ruleDSL_Expression_Or
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ElseIfDoAccess().getConditionDSL_Expression_OrParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_ElseIfDo1666);
            lv_condition_1_0=ruleDSL_Expression_Or();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ElseIfDoRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"DSL_Expression_Or");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleDSL_ElseIfDo1678); 

                	newLeafNode(otherlv_2, grammarAccess.getDSL_ElseIfDoAccess().getDoKeyword_2());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:862:1: ( (lv_actions_3_0= ruleDSL_ListActions ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:863:1: (lv_actions_3_0= ruleDSL_ListActions )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:863:1: (lv_actions_3_0= ruleDSL_ListActions )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:864:3: lv_actions_3_0= ruleDSL_ListActions
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ElseIfDoAccess().getActionsDSL_ListActionsParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_ListActions_in_ruleDSL_ElseIfDo1699);
            lv_actions_3_0=ruleDSL_ListActions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ElseIfDoRule());
            	        }
                   		set(
                   			current, 
                   			"actions",
                    		lv_actions_3_0, 
                    		"DSL_ListActions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_ElseIfDo"


    // $ANTLR start "entryRuleDSL_ElseDo"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:888:1: entryRuleDSL_ElseDo returns [EObject current=null] : iv_ruleDSL_ElseDo= ruleDSL_ElseDo EOF ;
    public final EObject entryRuleDSL_ElseDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_ElseDo = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:889:2: (iv_ruleDSL_ElseDo= ruleDSL_ElseDo EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:890:2: iv_ruleDSL_ElseDo= ruleDSL_ElseDo EOF
            {
             newCompositeNode(grammarAccess.getDSL_ElseDoRule()); 
            pushFollow(FOLLOW_ruleDSL_ElseDo_in_entryRuleDSL_ElseDo1735);
            iv_ruleDSL_ElseDo=ruleDSL_ElseDo();

            state._fsp--;

             current =iv_ruleDSL_ElseDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_ElseDo1745); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_ElseDo"


    // $ANTLR start "ruleDSL_ElseDo"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:897:1: ruleDSL_ElseDo returns [EObject current=null] : (otherlv_0= 'else do' ( (lv_actions_1_0= ruleDSL_ListActions ) ) ) ;
    public final EObject ruleDSL_ElseDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_actions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:900:28: ( (otherlv_0= 'else do' ( (lv_actions_1_0= ruleDSL_ListActions ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:901:1: (otherlv_0= 'else do' ( (lv_actions_1_0= ruleDSL_ListActions ) ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:901:1: (otherlv_0= 'else do' ( (lv_actions_1_0= ruleDSL_ListActions ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:901:3: otherlv_0= 'else do' ( (lv_actions_1_0= ruleDSL_ListActions ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleDSL_ElseDo1782); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_ElseDoAccess().getElseDoKeyword_0());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:905:1: ( (lv_actions_1_0= ruleDSL_ListActions ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:906:1: (lv_actions_1_0= ruleDSL_ListActions )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:906:1: (lv_actions_1_0= ruleDSL_ListActions )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:907:3: lv_actions_1_0= ruleDSL_ListActions
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ElseDoAccess().getActionsDSL_ListActionsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_ListActions_in_ruleDSL_ElseDo1803);
            lv_actions_1_0=ruleDSL_ListActions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ElseDoRule());
            	        }
                   		set(
                   			current, 
                   			"actions",
                    		lv_actions_1_0, 
                    		"DSL_ListActions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_ElseDo"


    // $ANTLR start "entryRuleNUMBER"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:931:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:932:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:933:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER1840);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER1851); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:940:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:943:28: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:944:1: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:944:1: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==34) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||(LA12_1>=12 && LA12_1<=13)||LA12_1==20||LA12_1==26||LA12_1==28||LA12_1==31||LA12_1==36||LA12_1==40||LA12_1==45||(LA12_1>=48 && LA12_1<=59)) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:944:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER1891); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:952:6: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:952:6: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:952:11: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER1918); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_0()); 
                        
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleNUMBER1936); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_1()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER1951); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleEXTENDED_ID"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:980:1: entryRuleEXTENDED_ID returns [String current=null] : iv_ruleEXTENDED_ID= ruleEXTENDED_ID EOF ;
    public final String entryRuleEXTENDED_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXTENDED_ID = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:981:2: (iv_ruleEXTENDED_ID= ruleEXTENDED_ID EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:982:2: iv_ruleEXTENDED_ID= ruleEXTENDED_ID EOF
            {
             newCompositeNode(grammarAccess.getEXTENDED_IDRule()); 
            pushFollow(FOLLOW_ruleEXTENDED_ID_in_entryRuleEXTENDED_ID1998);
            iv_ruleEXTENDED_ID=ruleEXTENDED_ID();

            state._fsp--;

             current =iv_ruleEXTENDED_ID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXTENDED_ID2009); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXTENDED_ID"


    // $ANTLR start "ruleEXTENDED_ID"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:989:1: ruleEXTENDED_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleEXTENDED_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:992:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:993:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:993:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:993:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEXTENDED_ID2049); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getEXTENDED_IDAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1000:1: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1001:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleEXTENDED_ID2068); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getEXTENDED_IDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEXTENDED_ID2083); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getEXTENDED_IDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXTENDED_ID"


    // $ANTLR start "entryRuleDSL_REF_CONDITION"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1023:1: entryRuleDSL_REF_CONDITION returns [EObject current=null] : iv_ruleDSL_REF_CONDITION= ruleDSL_REF_CONDITION EOF ;
    public final EObject entryRuleDSL_REF_CONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_REF_CONDITION = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1024:2: (iv_ruleDSL_REF_CONDITION= ruleDSL_REF_CONDITION EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1025:2: iv_ruleDSL_REF_CONDITION= ruleDSL_REF_CONDITION EOF
            {
             newCompositeNode(grammarAccess.getDSL_REF_CONDITIONRule()); 
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_entryRuleDSL_REF_CONDITION2132);
            iv_ruleDSL_REF_CONDITION=ruleDSL_REF_CONDITION();

            state._fsp--;

             current =iv_ruleDSL_REF_CONDITION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_REF_CONDITION2142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_REF_CONDITION"


    // $ANTLR start "ruleDSL_REF_CONDITION"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1032:1: ruleDSL_REF_CONDITION returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'subscribe' otherlv_3= '(' otherlv_4= ')' ) ;
    public final EObject ruleDSL_REF_CONDITION() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1035:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'subscribe' otherlv_3= '(' otherlv_4= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1036:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'subscribe' otherlv_3= '(' otherlv_4= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1036:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'subscribe' otherlv_3= '(' otherlv_4= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1036:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'subscribe' otherlv_3= '(' otherlv_4= ')'
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1036:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1037:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1037:1: (otherlv_0= RULE_ID )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1038:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSL_REF_CONDITIONRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_REF_CONDITION2187); 

            		newLeafNode(otherlv_0, grammarAccess.getDSL_REF_CONDITIONAccess().getRefDSL_REFCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDSL_REF_CONDITION2199); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_REF_CONDITIONAccess().getFullStopKeyword_1());
                
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDSL_REF_CONDITION2211); 

                	newLeafNode(otherlv_2, grammarAccess.getDSL_REF_CONDITIONAccess().getSubscribeKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDSL_REF_CONDITION2223); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_REF_CONDITIONAccess().getLeftParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleDSL_REF_CONDITION2235); 

                	newLeafNode(otherlv_4, grammarAccess.getDSL_REF_CONDITIONAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_REF_CONDITION"


    // $ANTLR start "entryRuleDSL_CEP_STATEMENT"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1073:1: entryRuleDSL_CEP_STATEMENT returns [EObject current=null] : iv_ruleDSL_CEP_STATEMENT= ruleDSL_CEP_STATEMENT EOF ;
    public final EObject entryRuleDSL_CEP_STATEMENT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_STATEMENT = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1074:2: (iv_ruleDSL_CEP_STATEMENT= ruleDSL_CEP_STATEMENT EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1075:2: iv_ruleDSL_CEP_STATEMENT= ruleDSL_CEP_STATEMENT EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_STATEMENT_in_entryRuleDSL_CEP_STATEMENT2271);
            iv_ruleDSL_CEP_STATEMENT=ruleDSL_CEP_STATEMENT();

            state._fsp--;

             current =iv_ruleDSL_CEP_STATEMENT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_STATEMENT2281); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_STATEMENT"


    // $ANTLR start "ruleDSL_CEP_STATEMENT"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1082:1: ruleDSL_CEP_STATEMENT returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT ) ) ) ) ;
    public final EObject ruleDSL_CEP_STATEMENT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_operation_3_1 = null;

        EObject lv_operation_3_2 = null;

        EObject lv_operation_3_3 = null;

        EObject lv_operation_3_4 = null;

        EObject lv_operation_3_5 = null;

        EObject lv_operation_3_6 = null;

        EObject lv_operation_3_7 = null;

        EObject lv_operation_3_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1085:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT ) ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1086:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT ) ) ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1086:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1086:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleDSL_CEP_STATEMENT2318); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_STATEMENTAccess().getDefineKeyword_0());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1090:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1091:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1091:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1092:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_CEP_STATEMENT2335); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDSL_CEP_STATEMENTAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDSL_CEP_STATEMENTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleDSL_CEP_STATEMENT2352); 

                	newLeafNode(otherlv_2, grammarAccess.getDSL_CEP_STATEMENTAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1112:1: ( ( (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1113:1: ( (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1113:1: ( (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1114:1: (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1114:1: (lv_operation_3_1= ruleDSL_CEP_AFTER | lv_operation_3_2= ruleDSL_CEP_BEFORE | lv_operation_3_3= ruleDSL_CEP_COINCIDE | lv_operation_3_4= ruleDSL_CEP_MIN | lv_operation_3_5= ruleDSL_CEP_MAX | lv_operation_3_6= ruleDSL_CEP_AVG | lv_operation_3_7= ruleDSL_CEP_SUM | lv_operation_3_8= ruleDSL_CEP_COUNT )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt14=1;
                }
                break;
            case 38:
                {
                alt14=2;
                }
                break;
            case 39:
                {
                alt14=3;
                }
                break;
            case 40:
                {
                alt14=4;
                }
                break;
            case 41:
                {
                alt14=5;
                }
                break;
            case 42:
                {
                alt14=6;
                }
                break;
            case 43:
                {
                alt14=7;
                }
                break;
            case 44:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1115:3: lv_operation_3_1= ruleDSL_CEP_AFTER
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTAccess().getOperationDSL_CEP_AFTERParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_AFTER_in_ruleDSL_CEP_STATEMENT2375);
                    lv_operation_3_1=ruleDSL_CEP_AFTER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_3_1, 
                            		"DSL_CEP_AFTER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1130:8: lv_operation_3_2= ruleDSL_CEP_BEFORE
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTAccess().getOperationDSL_CEP_BEFOREParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_BEFORE_in_ruleDSL_CEP_STATEMENT2394);
                    lv_operation_3_2=ruleDSL_CEP_BEFORE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_3_2, 
                            		"DSL_CEP_BEFORE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1145:8: lv_operation_3_3= ruleDSL_CEP_COINCIDE
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTAccess().getOperationDSL_CEP_COINCIDEParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_COINCIDE_in_ruleDSL_CEP_STATEMENT2413);
                    lv_operation_3_3=ruleDSL_CEP_COINCIDE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_3_3, 
                            		"DSL_CEP_COINCIDE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1160:8: lv_operation_3_4= ruleDSL_CEP_MIN
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTAccess().getOperationDSL_CEP_MINParserRuleCall_3_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_MIN_in_ruleDSL_CEP_STATEMENT2432);
                    lv_operation_3_4=ruleDSL_CEP_MIN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_3_4, 
                            		"DSL_CEP_MIN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1175:8: lv_operation_3_5= ruleDSL_CEP_MAX
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTAccess().getOperationDSL_CEP_MAXParserRuleCall_3_0_4()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_MAX_in_ruleDSL_CEP_STATEMENT2451);
                    lv_operation_3_5=ruleDSL_CEP_MAX();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_3_5, 
                            		"DSL_CEP_MAX");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 6 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1190:8: lv_operation_3_6= ruleDSL_CEP_AVG
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTAccess().getOperationDSL_CEP_AVGParserRuleCall_3_0_5()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_AVG_in_ruleDSL_CEP_STATEMENT2470);
                    lv_operation_3_6=ruleDSL_CEP_AVG();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_3_6, 
                            		"DSL_CEP_AVG");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 7 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1205:8: lv_operation_3_7= ruleDSL_CEP_SUM
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTAccess().getOperationDSL_CEP_SUMParserRuleCall_3_0_6()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_SUM_in_ruleDSL_CEP_STATEMENT2489);
                    lv_operation_3_7=ruleDSL_CEP_SUM();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_3_7, 
                            		"DSL_CEP_SUM");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 8 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1220:8: lv_operation_3_8= ruleDSL_CEP_COUNT
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_STATEMENTAccess().getOperationDSL_CEP_COUNTParserRuleCall_3_0_7()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_COUNT_in_ruleDSL_CEP_STATEMENT2508);
                    lv_operation_3_8=ruleDSL_CEP_COUNT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_STATEMENTRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_3_8, 
                            		"DSL_CEP_COUNT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_STATEMENT"


    // $ANTLR start "entryRuleDSL_CEP_AFTER"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1246:1: entryRuleDSL_CEP_AFTER returns [EObject current=null] : iv_ruleDSL_CEP_AFTER= ruleDSL_CEP_AFTER EOF ;
    public final EObject entryRuleDSL_CEP_AFTER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_AFTER = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1247:2: (iv_ruleDSL_CEP_AFTER= ruleDSL_CEP_AFTER EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1248:2: iv_ruleDSL_CEP_AFTER= ruleDSL_CEP_AFTER EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_AFTERRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_AFTER_in_entryRuleDSL_CEP_AFTER2547);
            iv_ruleDSL_CEP_AFTER=ruleDSL_CEP_AFTER();

            state._fsp--;

             current =iv_ruleDSL_CEP_AFTER; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_AFTER2557); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_AFTER"


    // $ANTLR start "ruleDSL_CEP_AFTER"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1255:1: ruleDSL_CEP_AFTER returns [EObject current=null] : (otherlv_0= 'after' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')' ) ;
    public final EObject ruleDSL_CEP_AFTER() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ref1_2_0 = null;

        EObject lv_ref2_4_0 = null;

        EObject lv_start_6_0 = null;

        EObject lv_end_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1258:28: ( (otherlv_0= 'after' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1259:1: (otherlv_0= 'after' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1259:1: (otherlv_0= 'after' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1259:3: otherlv_0= 'after' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleDSL_CEP_AFTER2594); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_AFTERAccess().getAfterKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CEP_AFTER2606); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_AFTERAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1267:1: ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1268:1: (lv_ref1_2_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1268:1: (lv_ref1_2_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1269:3: lv_ref1_2_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_AFTERAccess().getRef1DSL_REF_CONDITIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_AFTER2627);
            lv_ref1_2_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_AFTERRule());
            	        }
                   		set(
                   			current, 
                   			"ref1",
                    		lv_ref1_2_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_AFTER2639); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_CEP_AFTERAccess().getCommaKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1289:1: ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1290:1: (lv_ref2_4_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1290:1: (lv_ref2_4_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1291:3: lv_ref2_4_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_AFTERAccess().getRef2DSL_REF_CONDITIONParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_AFTER2660);
            lv_ref2_4_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_AFTERRule());
            	        }
                   		set(
                   			current, 
                   			"ref2",
                    		lv_ref2_4_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_AFTER2672); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_CEP_AFTERAccess().getCommaKeyword_5());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1311:1: ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1311:2: ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ','
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1311:2: ( (lv_start_6_0= ruleDSL_CEP_DURATION ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1312:1: (lv_start_6_0= ruleDSL_CEP_DURATION )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1312:1: (lv_start_6_0= ruleDSL_CEP_DURATION )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1313:3: lv_start_6_0= ruleDSL_CEP_DURATION
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_AFTERAccess().getStartDSL_CEP_DURATIONParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_AFTER2694);
                    lv_start_6_0=ruleDSL_CEP_DURATION();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_AFTERRule());
                    	        }
                           		set(
                           			current, 
                           			"start",
                            		lv_start_6_0, 
                            		"DSL_CEP_DURATION");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_AFTER2706); 

                        	newLeafNode(otherlv_7, grammarAccess.getDSL_CEP_AFTERAccess().getCommaKeyword_6_1());
                        

                    }
                    break;

            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1333:3: ( (lv_end_8_0= ruleDSL_CEP_DURATION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1334:1: (lv_end_8_0= ruleDSL_CEP_DURATION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1334:1: (lv_end_8_0= ruleDSL_CEP_DURATION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1335:3: lv_end_8_0= ruleDSL_CEP_DURATION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_AFTERAccess().getEndDSL_CEP_DURATIONParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_AFTER2729);
            lv_end_8_0=ruleDSL_CEP_DURATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_AFTERRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_8_0, 
                    		"DSL_CEP_DURATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CEP_AFTER2741); 

                	newLeafNode(otherlv_9, grammarAccess.getDSL_CEP_AFTERAccess().getRightParenthesisKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_AFTER"


    // $ANTLR start "entryRuleDSL_CEP_BEFORE"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1363:1: entryRuleDSL_CEP_BEFORE returns [EObject current=null] : iv_ruleDSL_CEP_BEFORE= ruleDSL_CEP_BEFORE EOF ;
    public final EObject entryRuleDSL_CEP_BEFORE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_BEFORE = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1364:2: (iv_ruleDSL_CEP_BEFORE= ruleDSL_CEP_BEFORE EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1365:2: iv_ruleDSL_CEP_BEFORE= ruleDSL_CEP_BEFORE EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_BEFORERule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_BEFORE_in_entryRuleDSL_CEP_BEFORE2777);
            iv_ruleDSL_CEP_BEFORE=ruleDSL_CEP_BEFORE();

            state._fsp--;

             current =iv_ruleDSL_CEP_BEFORE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_BEFORE2787); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_BEFORE"


    // $ANTLR start "ruleDSL_CEP_BEFORE"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1372:1: ruleDSL_CEP_BEFORE returns [EObject current=null] : (otherlv_0= 'before' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')' ) ;
    public final EObject ruleDSL_CEP_BEFORE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ref1_2_0 = null;

        EObject lv_ref2_4_0 = null;

        EObject lv_start_6_0 = null;

        EObject lv_end_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1375:28: ( (otherlv_0= 'before' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1376:1: (otherlv_0= 'before' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1376:1: (otherlv_0= 'before' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1376:3: otherlv_0= 'before' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )? ( (lv_end_8_0= ruleDSL_CEP_DURATION ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleDSL_CEP_BEFORE2824); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_BEFOREAccess().getBeforeKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CEP_BEFORE2836); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_BEFOREAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1384:1: ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1385:1: (lv_ref1_2_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1385:1: (lv_ref1_2_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1386:3: lv_ref1_2_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_BEFOREAccess().getRef1DSL_REF_CONDITIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_BEFORE2857);
            lv_ref1_2_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_BEFORERule());
            	        }
                   		set(
                   			current, 
                   			"ref1",
                    		lv_ref1_2_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_BEFORE2869); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_CEP_BEFOREAccess().getCommaKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1406:1: ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1407:1: (lv_ref2_4_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1407:1: (lv_ref2_4_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1408:3: lv_ref2_4_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_BEFOREAccess().getRef2DSL_REF_CONDITIONParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_BEFORE2890);
            lv_ref2_4_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_BEFORERule());
            	        }
                   		set(
                   			current, 
                   			"ref2",
                    		lv_ref2_4_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_BEFORE2902); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_CEP_BEFOREAccess().getCommaKeyword_5());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1428:1: ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1428:2: ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ','
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1428:2: ( (lv_start_6_0= ruleDSL_CEP_DURATION ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1429:1: (lv_start_6_0= ruleDSL_CEP_DURATION )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1429:1: (lv_start_6_0= ruleDSL_CEP_DURATION )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1430:3: lv_start_6_0= ruleDSL_CEP_DURATION
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_CEP_BEFOREAccess().getStartDSL_CEP_DURATIONParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_BEFORE2924);
                    lv_start_6_0=ruleDSL_CEP_DURATION();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_CEP_BEFORERule());
                    	        }
                           		set(
                           			current, 
                           			"start",
                            		lv_start_6_0, 
                            		"DSL_CEP_DURATION");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_BEFORE2936); 

                        	newLeafNode(otherlv_7, grammarAccess.getDSL_CEP_BEFOREAccess().getCommaKeyword_6_1());
                        

                    }
                    break;

            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1450:3: ( (lv_end_8_0= ruleDSL_CEP_DURATION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1451:1: (lv_end_8_0= ruleDSL_CEP_DURATION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1451:1: (lv_end_8_0= ruleDSL_CEP_DURATION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1452:3: lv_end_8_0= ruleDSL_CEP_DURATION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_BEFOREAccess().getEndDSL_CEP_DURATIONParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_BEFORE2959);
            lv_end_8_0=ruleDSL_CEP_DURATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_BEFORERule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_8_0, 
                    		"DSL_CEP_DURATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CEP_BEFORE2971); 

                	newLeafNode(otherlv_9, grammarAccess.getDSL_CEP_BEFOREAccess().getRightParenthesisKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_BEFORE"


    // $ANTLR start "entryRuleDSL_CEP_COINCIDE"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1480:1: entryRuleDSL_CEP_COINCIDE returns [EObject current=null] : iv_ruleDSL_CEP_COINCIDE= ruleDSL_CEP_COINCIDE EOF ;
    public final EObject entryRuleDSL_CEP_COINCIDE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_COINCIDE = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1481:2: (iv_ruleDSL_CEP_COINCIDE= ruleDSL_CEP_COINCIDE EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1482:2: iv_ruleDSL_CEP_COINCIDE= ruleDSL_CEP_COINCIDE EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_COINCIDERule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_COINCIDE_in_entryRuleDSL_CEP_COINCIDE3007);
            iv_ruleDSL_CEP_COINCIDE=ruleDSL_CEP_COINCIDE();

            state._fsp--;

             current =iv_ruleDSL_CEP_COINCIDE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_COINCIDE3017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_COINCIDE"


    // $ANTLR start "ruleDSL_CEP_COINCIDE"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1489:1: ruleDSL_CEP_COINCIDE returns [EObject current=null] : (otherlv_0= 'coincide' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( (lv_window_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ')' ) ;
    public final EObject ruleDSL_CEP_COINCIDE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ref1_2_0 = null;

        EObject lv_ref2_4_0 = null;

        EObject lv_window_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1492:28: ( (otherlv_0= 'coincide' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( (lv_window_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1493:1: (otherlv_0= 'coincide' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( (lv_window_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1493:1: (otherlv_0= 'coincide' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( (lv_window_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1493:3: otherlv_0= 'coincide' otherlv_1= '(' ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) ) otherlv_5= ',' ( (lv_window_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleDSL_CEP_COINCIDE3054); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_COINCIDEAccess().getCoincideKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CEP_COINCIDE3066); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_COINCIDEAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1501:1: ( (lv_ref1_2_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1502:1: (lv_ref1_2_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1502:1: (lv_ref1_2_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1503:3: lv_ref1_2_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_COINCIDEAccess().getRef1DSL_REF_CONDITIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_COINCIDE3087);
            lv_ref1_2_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_COINCIDERule());
            	        }
                   		set(
                   			current, 
                   			"ref1",
                    		lv_ref1_2_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_COINCIDE3099); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_CEP_COINCIDEAccess().getCommaKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1523:1: ( (lv_ref2_4_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1524:1: (lv_ref2_4_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1524:1: (lv_ref2_4_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1525:3: lv_ref2_4_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_COINCIDEAccess().getRef2DSL_REF_CONDITIONParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_COINCIDE3120);
            lv_ref2_4_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_COINCIDERule());
            	        }
                   		set(
                   			current, 
                   			"ref2",
                    		lv_ref2_4_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_COINCIDE3132); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_CEP_COINCIDEAccess().getCommaKeyword_5());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1545:1: ( (lv_window_6_0= ruleDSL_CEP_DURATION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1546:1: (lv_window_6_0= ruleDSL_CEP_DURATION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1546:1: (lv_window_6_0= ruleDSL_CEP_DURATION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1547:3: lv_window_6_0= ruleDSL_CEP_DURATION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_COINCIDEAccess().getWindowDSL_CEP_DURATIONParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_COINCIDE3153);
            lv_window_6_0=ruleDSL_CEP_DURATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_COINCIDERule());
            	        }
                   		set(
                   			current, 
                   			"window",
                    		lv_window_6_0, 
                    		"DSL_CEP_DURATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CEP_COINCIDE3165); 

                	newLeafNode(otherlv_7, grammarAccess.getDSL_CEP_COINCIDEAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_COINCIDE"


    // $ANTLR start "entryRuleDSL_CEP_MIN"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1575:1: entryRuleDSL_CEP_MIN returns [EObject current=null] : iv_ruleDSL_CEP_MIN= ruleDSL_CEP_MIN EOF ;
    public final EObject entryRuleDSL_CEP_MIN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_MIN = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1576:2: (iv_ruleDSL_CEP_MIN= ruleDSL_CEP_MIN EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1577:2: iv_ruleDSL_CEP_MIN= ruleDSL_CEP_MIN EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_MINRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_MIN_in_entryRuleDSL_CEP_MIN3201);
            iv_ruleDSL_CEP_MIN=ruleDSL_CEP_MIN();

            state._fsp--;

             current =iv_ruleDSL_CEP_MIN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_MIN3211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_MIN"


    // $ANTLR start "ruleDSL_CEP_MIN"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1584:1: ruleDSL_CEP_MIN returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) ;
    public final EObject ruleDSL_CEP_MIN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ref_2_0 = null;

        EObject lv_window_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1587:28: ( (otherlv_0= 'min' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1588:1: (otherlv_0= 'min' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1588:1: (otherlv_0= 'min' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1588:3: otherlv_0= 'min' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleDSL_CEP_MIN3248); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_MINAccess().getMinKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CEP_MIN3260); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_MINAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1596:1: ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1597:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1597:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1598:3: lv_ref_2_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_MINAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_MIN3281);
            lv_ref_2_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_MINRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_2_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_MIN3293); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_CEP_MINAccess().getCommaKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1618:1: ( (lv_window_4_0= ruleDSL_CEP_DURATION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1619:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1619:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1620:3: lv_window_4_0= ruleDSL_CEP_DURATION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_MINAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_MIN3314);
            lv_window_4_0=ruleDSL_CEP_DURATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_MINRule());
            	        }
                   		set(
                   			current, 
                   			"window",
                    		lv_window_4_0, 
                    		"DSL_CEP_DURATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CEP_MIN3326); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_CEP_MINAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_MIN"


    // $ANTLR start "entryRuleDSL_CEP_MAX"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1648:1: entryRuleDSL_CEP_MAX returns [EObject current=null] : iv_ruleDSL_CEP_MAX= ruleDSL_CEP_MAX EOF ;
    public final EObject entryRuleDSL_CEP_MAX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_MAX = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1649:2: (iv_ruleDSL_CEP_MAX= ruleDSL_CEP_MAX EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1650:2: iv_ruleDSL_CEP_MAX= ruleDSL_CEP_MAX EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_MAXRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_MAX_in_entryRuleDSL_CEP_MAX3362);
            iv_ruleDSL_CEP_MAX=ruleDSL_CEP_MAX();

            state._fsp--;

             current =iv_ruleDSL_CEP_MAX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_MAX3372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_MAX"


    // $ANTLR start "ruleDSL_CEP_MAX"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1657:1: ruleDSL_CEP_MAX returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) ;
    public final EObject ruleDSL_CEP_MAX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ref_2_0 = null;

        EObject lv_window_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1660:28: ( (otherlv_0= 'max' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1661:1: (otherlv_0= 'max' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1661:1: (otherlv_0= 'max' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1661:3: otherlv_0= 'max' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleDSL_CEP_MAX3409); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_MAXAccess().getMaxKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CEP_MAX3421); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_MAXAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1669:1: ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1670:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1670:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1671:3: lv_ref_2_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_MAXAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_MAX3442);
            lv_ref_2_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_MAXRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_2_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_MAX3454); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_CEP_MAXAccess().getCommaKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1691:1: ( (lv_window_4_0= ruleDSL_CEP_DURATION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1692:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1692:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1693:3: lv_window_4_0= ruleDSL_CEP_DURATION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_MAXAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_MAX3475);
            lv_window_4_0=ruleDSL_CEP_DURATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_MAXRule());
            	        }
                   		set(
                   			current, 
                   			"window",
                    		lv_window_4_0, 
                    		"DSL_CEP_DURATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CEP_MAX3487); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_CEP_MAXAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_MAX"


    // $ANTLR start "entryRuleDSL_CEP_AVG"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1721:1: entryRuleDSL_CEP_AVG returns [EObject current=null] : iv_ruleDSL_CEP_AVG= ruleDSL_CEP_AVG EOF ;
    public final EObject entryRuleDSL_CEP_AVG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_AVG = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1722:2: (iv_ruleDSL_CEP_AVG= ruleDSL_CEP_AVG EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1723:2: iv_ruleDSL_CEP_AVG= ruleDSL_CEP_AVG EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_AVGRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_AVG_in_entryRuleDSL_CEP_AVG3523);
            iv_ruleDSL_CEP_AVG=ruleDSL_CEP_AVG();

            state._fsp--;

             current =iv_ruleDSL_CEP_AVG; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_AVG3533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_AVG"


    // $ANTLR start "ruleDSL_CEP_AVG"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1730:1: ruleDSL_CEP_AVG returns [EObject current=null] : (otherlv_0= 'avg' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) ;
    public final EObject ruleDSL_CEP_AVG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ref_2_0 = null;

        EObject lv_window_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1733:28: ( (otherlv_0= 'avg' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1734:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1734:1: (otherlv_0= 'avg' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1734:3: otherlv_0= 'avg' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleDSL_CEP_AVG3570); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_AVGAccess().getAvgKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CEP_AVG3582); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_AVGAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1742:1: ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1743:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1743:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1744:3: lv_ref_2_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_AVGAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_AVG3603);
            lv_ref_2_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_AVGRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_2_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_AVG3615); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_CEP_AVGAccess().getCommaKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1764:1: ( (lv_window_4_0= ruleDSL_CEP_DURATION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1765:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1765:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1766:3: lv_window_4_0= ruleDSL_CEP_DURATION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_AVGAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_AVG3636);
            lv_window_4_0=ruleDSL_CEP_DURATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_AVGRule());
            	        }
                   		set(
                   			current, 
                   			"window",
                    		lv_window_4_0, 
                    		"DSL_CEP_DURATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CEP_AVG3648); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_CEP_AVGAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_AVG"


    // $ANTLR start "entryRuleDSL_CEP_SUM"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1794:1: entryRuleDSL_CEP_SUM returns [EObject current=null] : iv_ruleDSL_CEP_SUM= ruleDSL_CEP_SUM EOF ;
    public final EObject entryRuleDSL_CEP_SUM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_SUM = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1795:2: (iv_ruleDSL_CEP_SUM= ruleDSL_CEP_SUM EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1796:2: iv_ruleDSL_CEP_SUM= ruleDSL_CEP_SUM EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_SUMRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_SUM_in_entryRuleDSL_CEP_SUM3684);
            iv_ruleDSL_CEP_SUM=ruleDSL_CEP_SUM();

            state._fsp--;

             current =iv_ruleDSL_CEP_SUM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_SUM3694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_SUM"


    // $ANTLR start "ruleDSL_CEP_SUM"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1803:1: ruleDSL_CEP_SUM returns [EObject current=null] : (otherlv_0= 'sum' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) ;
    public final EObject ruleDSL_CEP_SUM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ref_2_0 = null;

        EObject lv_window_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1806:28: ( (otherlv_0= 'sum' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1807:1: (otherlv_0= 'sum' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1807:1: (otherlv_0= 'sum' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1807:3: otherlv_0= 'sum' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleDSL_CEP_SUM3731); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_SUMAccess().getSumKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CEP_SUM3743); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_SUMAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1815:1: ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1816:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1816:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1817:3: lv_ref_2_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_SUMAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_SUM3764);
            lv_ref_2_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_SUMRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_2_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_SUM3776); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_CEP_SUMAccess().getCommaKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1837:1: ( (lv_window_4_0= ruleDSL_CEP_DURATION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1838:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1838:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1839:3: lv_window_4_0= ruleDSL_CEP_DURATION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_SUMAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_SUM3797);
            lv_window_4_0=ruleDSL_CEP_DURATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_SUMRule());
            	        }
                   		set(
                   			current, 
                   			"window",
                    		lv_window_4_0, 
                    		"DSL_CEP_DURATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CEP_SUM3809); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_CEP_SUMAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_SUM"


    // $ANTLR start "entryRuleDSL_CEP_COUNT"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1867:1: entryRuleDSL_CEP_COUNT returns [EObject current=null] : iv_ruleDSL_CEP_COUNT= ruleDSL_CEP_COUNT EOF ;
    public final EObject entryRuleDSL_CEP_COUNT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_COUNT = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1868:2: (iv_ruleDSL_CEP_COUNT= ruleDSL_CEP_COUNT EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1869:2: iv_ruleDSL_CEP_COUNT= ruleDSL_CEP_COUNT EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_COUNTRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_COUNT_in_entryRuleDSL_CEP_COUNT3845);
            iv_ruleDSL_CEP_COUNT=ruleDSL_CEP_COUNT();

            state._fsp--;

             current =iv_ruleDSL_CEP_COUNT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_COUNT3855); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_COUNT"


    // $ANTLR start "ruleDSL_CEP_COUNT"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1876:1: ruleDSL_CEP_COUNT returns [EObject current=null] : (otherlv_0= 'count' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) ;
    public final EObject ruleDSL_CEP_COUNT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ref_2_0 = null;

        EObject lv_window_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1879:28: ( (otherlv_0= 'count' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1880:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1880:1: (otherlv_0= 'count' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1880:3: otherlv_0= 'count' otherlv_1= '(' ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) ) otherlv_3= ',' ( (lv_window_4_0= ruleDSL_CEP_DURATION ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleDSL_CEP_COUNT3892); 

                	newLeafNode(otherlv_0, grammarAccess.getDSL_CEP_COUNTAccess().getCountKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDSL_CEP_COUNT3904); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_COUNTAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1888:1: ( (lv_ref_2_0= ruleDSL_REF_CONDITION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1889:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1889:1: (lv_ref_2_0= ruleDSL_REF_CONDITION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1890:3: lv_ref_2_0= ruleDSL_REF_CONDITION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_COUNTAccess().getRefDSL_REF_CONDITIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_COUNT3925);
            lv_ref_2_0=ruleDSL_REF_CONDITION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_COUNTRule());
            	        }
                   		set(
                   			current, 
                   			"ref",
                    		lv_ref_2_0, 
                    		"DSL_REF_CONDITION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDSL_CEP_COUNT3937); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_CEP_COUNTAccess().getCommaKeyword_3());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1910:1: ( (lv_window_4_0= ruleDSL_CEP_DURATION ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1911:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1911:1: (lv_window_4_0= ruleDSL_CEP_DURATION )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1912:3: lv_window_4_0= ruleDSL_CEP_DURATION
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_COUNTAccess().getWindowDSL_CEP_DURATIONParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_COUNT3958);
            lv_window_4_0=ruleDSL_CEP_DURATION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_COUNTRule());
            	        }
                   		set(
                   			current, 
                   			"window",
                    		lv_window_4_0, 
                    		"DSL_CEP_DURATION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleDSL_CEP_COUNT3970); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_CEP_COUNTAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_COUNT"


    // $ANTLR start "entryRuleDSL_CEP_DURATION"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1940:1: entryRuleDSL_CEP_DURATION returns [EObject current=null] : iv_ruleDSL_CEP_DURATION= ruleDSL_CEP_DURATION EOF ;
    public final EObject entryRuleDSL_CEP_DURATION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_DURATION = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1941:2: (iv_ruleDSL_CEP_DURATION= ruleDSL_CEP_DURATION EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1942:2: iv_ruleDSL_CEP_DURATION= ruleDSL_CEP_DURATION EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_DURATIONRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_in_entryRuleDSL_CEP_DURATION4006);
            iv_ruleDSL_CEP_DURATION=ruleDSL_CEP_DURATION();

            state._fsp--;

             current =iv_ruleDSL_CEP_DURATION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_DURATION4016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_DURATION"


    // $ANTLR start "ruleDSL_CEP_DURATION"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1949:1: ruleDSL_CEP_DURATION returns [EObject current=null] : ( ( (lv_units_0_1= ruleDSL_CEP_DURATION_MIN | lv_units_0_2= ruleDSL_CEP_DURATION_SEC ) ) )+ ;
    public final EObject ruleDSL_CEP_DURATION() throws RecognitionException {
        EObject current = null;

        EObject lv_units_0_1 = null;

        EObject lv_units_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1952:28: ( ( ( (lv_units_0_1= ruleDSL_CEP_DURATION_MIN | lv_units_0_2= ruleDSL_CEP_DURATION_SEC ) ) )+ )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1953:1: ( ( (lv_units_0_1= ruleDSL_CEP_DURATION_MIN | lv_units_0_2= ruleDSL_CEP_DURATION_SEC ) ) )+
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1953:1: ( ( (lv_units_0_1= ruleDSL_CEP_DURATION_MIN | lv_units_0_2= ruleDSL_CEP_DURATION_SEC ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1954:1: ( (lv_units_0_1= ruleDSL_CEP_DURATION_MIN | lv_units_0_2= ruleDSL_CEP_DURATION_SEC ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1954:1: ( (lv_units_0_1= ruleDSL_CEP_DURATION_MIN | lv_units_0_2= ruleDSL_CEP_DURATION_SEC ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1955:1: (lv_units_0_1= ruleDSL_CEP_DURATION_MIN | lv_units_0_2= ruleDSL_CEP_DURATION_SEC )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1955:1: (lv_units_0_1= ruleDSL_CEP_DURATION_MIN | lv_units_0_2= ruleDSL_CEP_DURATION_SEC )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_INT) ) {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            alt17=1;
            	            }
            	            break;
            	        case 45:
            	            {
            	            alt17=2;
            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA17_4 = input.LA(3);

            	            if ( (LA17_4==RULE_INT) ) {
            	                int LA17_5 = input.LA(4);

            	                if ( (LA17_5==40) ) {
            	                    alt17=1;
            	                }
            	                else if ( (LA17_5==45) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 17, 5, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 17, 4, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 17, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1956:3: lv_units_0_1= ruleDSL_CEP_DURATION_MIN
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDSL_CEP_DURATIONAccess().getUnitsDSL_CEP_DURATION_MINParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_MIN_in_ruleDSL_CEP_DURATION4063);
            	            lv_units_0_1=ruleDSL_CEP_DURATION_MIN();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_DURATIONRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"units",
            	                    		lv_units_0_1, 
            	                    		"DSL_CEP_DURATION_MIN");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1971:8: lv_units_0_2= ruleDSL_CEP_DURATION_SEC
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getDSL_CEP_DURATIONAccess().getUnitsDSL_CEP_DURATION_SECParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_SEC_in_ruleDSL_CEP_DURATION4082);
            	            lv_units_0_2=ruleDSL_CEP_DURATION_SEC();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_DURATIONRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"units",
            	                    		lv_units_0_2, 
            	                    		"DSL_CEP_DURATION_SEC");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_DURATION"


    // $ANTLR start "entryRuleDSL_CEP_DURATION_MIN"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1997:1: entryRuleDSL_CEP_DURATION_MIN returns [EObject current=null] : iv_ruleDSL_CEP_DURATION_MIN= ruleDSL_CEP_DURATION_MIN EOF ;
    public final EObject entryRuleDSL_CEP_DURATION_MIN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_DURATION_MIN = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1998:2: (iv_ruleDSL_CEP_DURATION_MIN= ruleDSL_CEP_DURATION_MIN EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:1999:2: iv_ruleDSL_CEP_DURATION_MIN= ruleDSL_CEP_DURATION_MIN EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_DURATION_MINRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_MIN_in_entryRuleDSL_CEP_DURATION_MIN4121);
            iv_ruleDSL_CEP_DURATION_MIN=ruleDSL_CEP_DURATION_MIN();

            state._fsp--;

             current =iv_ruleDSL_CEP_DURATION_MIN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_DURATION_MIN4131); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_DURATION_MIN"


    // $ANTLR start "ruleDSL_CEP_DURATION_MIN"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2006:1: ruleDSL_CEP_DURATION_MIN returns [EObject current=null] : ( ( (lv_min_0_0= ruleNUMBER ) ) otherlv_1= 'min' ) ;
    public final EObject ruleDSL_CEP_DURATION_MIN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_min_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2009:28: ( ( ( (lv_min_0_0= ruleNUMBER ) ) otherlv_1= 'min' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2010:1: ( ( (lv_min_0_0= ruleNUMBER ) ) otherlv_1= 'min' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2010:1: ( ( (lv_min_0_0= ruleNUMBER ) ) otherlv_1= 'min' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2010:2: ( (lv_min_0_0= ruleNUMBER ) ) otherlv_1= 'min'
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2010:2: ( (lv_min_0_0= ruleNUMBER ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2011:1: (lv_min_0_0= ruleNUMBER )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2011:1: (lv_min_0_0= ruleNUMBER )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2012:3: lv_min_0_0= ruleNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_DURATION_MINAccess().getMinNUMBERParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNUMBER_in_ruleDSL_CEP_DURATION_MIN4177);
            lv_min_0_0=ruleNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_DURATION_MINRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_0_0, 
                    		"NUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleDSL_CEP_DURATION_MIN4189); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_DURATION_MINAccess().getMinKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_DURATION_MIN"


    // $ANTLR start "entryRuleDSL_CEP_DURATION_SEC"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2040:1: entryRuleDSL_CEP_DURATION_SEC returns [EObject current=null] : iv_ruleDSL_CEP_DURATION_SEC= ruleDSL_CEP_DURATION_SEC EOF ;
    public final EObject entryRuleDSL_CEP_DURATION_SEC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_CEP_DURATION_SEC = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2041:2: (iv_ruleDSL_CEP_DURATION_SEC= ruleDSL_CEP_DURATION_SEC EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2042:2: iv_ruleDSL_CEP_DURATION_SEC= ruleDSL_CEP_DURATION_SEC EOF
            {
             newCompositeNode(grammarAccess.getDSL_CEP_DURATION_SECRule()); 
            pushFollow(FOLLOW_ruleDSL_CEP_DURATION_SEC_in_entryRuleDSL_CEP_DURATION_SEC4225);
            iv_ruleDSL_CEP_DURATION_SEC=ruleDSL_CEP_DURATION_SEC();

            state._fsp--;

             current =iv_ruleDSL_CEP_DURATION_SEC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_CEP_DURATION_SEC4235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_CEP_DURATION_SEC"


    // $ANTLR start "ruleDSL_CEP_DURATION_SEC"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2049:1: ruleDSL_CEP_DURATION_SEC returns [EObject current=null] : ( ( (lv_sec_0_0= ruleNUMBER ) ) otherlv_1= 'sec' ) ;
    public final EObject ruleDSL_CEP_DURATION_SEC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sec_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2052:28: ( ( ( (lv_sec_0_0= ruleNUMBER ) ) otherlv_1= 'sec' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2053:1: ( ( (lv_sec_0_0= ruleNUMBER ) ) otherlv_1= 'sec' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2053:1: ( ( (lv_sec_0_0= ruleNUMBER ) ) otherlv_1= 'sec' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2053:2: ( (lv_sec_0_0= ruleNUMBER ) ) otherlv_1= 'sec'
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2053:2: ( (lv_sec_0_0= ruleNUMBER ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2054:1: (lv_sec_0_0= ruleNUMBER )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2054:1: (lv_sec_0_0= ruleNUMBER )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2055:3: lv_sec_0_0= ruleNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getDSL_CEP_DURATION_SECAccess().getSecNUMBERParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNUMBER_in_ruleDSL_CEP_DURATION_SEC4281);
            lv_sec_0_0=ruleNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_CEP_DURATION_SECRule());
            	        }
                   		set(
                   			current, 
                   			"sec",
                    		lv_sec_0_0, 
                    		"NUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleDSL_CEP_DURATION_SEC4293); 

                	newLeafNode(otherlv_1, grammarAccess.getDSL_CEP_DURATION_SECAccess().getSecKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_CEP_DURATION_SEC"


    // $ANTLR start "entryRuleDSL_ListActions"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2083:1: entryRuleDSL_ListActions returns [EObject current=null] : iv_ruleDSL_ListActions= ruleDSL_ListActions EOF ;
    public final EObject entryRuleDSL_ListActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_ListActions = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2084:2: (iv_ruleDSL_ListActions= ruleDSL_ListActions EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2085:2: iv_ruleDSL_ListActions= ruleDSL_ListActions EOF
            {
             newCompositeNode(grammarAccess.getDSL_ListActionsRule()); 
            pushFollow(FOLLOW_ruleDSL_ListActions_in_entryRuleDSL_ListActions4329);
            iv_ruleDSL_ListActions=ruleDSL_ListActions();

            state._fsp--;

             current =iv_ruleDSL_ListActions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_ListActions4339); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_ListActions"


    // $ANTLR start "ruleDSL_ListActions"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2092:1: ruleDSL_ListActions returns [EObject current=null] : ( ( (lv_actionList_0_0= ruleDSL_ResourceAction ) ) (otherlv_1= ',' ( (lv_actionList_2_0= ruleDSL_ResourceAction ) ) )* ) ;
    public final EObject ruleDSL_ListActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actionList_0_0 = null;

        EObject lv_actionList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2095:28: ( ( ( (lv_actionList_0_0= ruleDSL_ResourceAction ) ) (otherlv_1= ',' ( (lv_actionList_2_0= ruleDSL_ResourceAction ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2096:1: ( ( (lv_actionList_0_0= ruleDSL_ResourceAction ) ) (otherlv_1= ',' ( (lv_actionList_2_0= ruleDSL_ResourceAction ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2096:1: ( ( (lv_actionList_0_0= ruleDSL_ResourceAction ) ) (otherlv_1= ',' ( (lv_actionList_2_0= ruleDSL_ResourceAction ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2096:2: ( (lv_actionList_0_0= ruleDSL_ResourceAction ) ) (otherlv_1= ',' ( (lv_actionList_2_0= ruleDSL_ResourceAction ) ) )*
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2096:2: ( (lv_actionList_0_0= ruleDSL_ResourceAction ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2097:1: (lv_actionList_0_0= ruleDSL_ResourceAction )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2097:1: (lv_actionList_0_0= ruleDSL_ResourceAction )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2098:3: lv_actionList_0_0= ruleDSL_ResourceAction
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ListActionsAccess().getActionListDSL_ResourceActionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_ResourceAction_in_ruleDSL_ListActions4385);
            lv_actionList_0_0=ruleDSL_ResourceAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ListActionsRule());
            	        }
                   		add(
                   			current, 
                   			"actionList",
                    		lv_actionList_0_0, 
                    		"DSL_ResourceAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2114:2: (otherlv_1= ',' ( (lv_actionList_2_0= ruleDSL_ResourceAction ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2114:4: otherlv_1= ',' ( (lv_actionList_2_0= ruleDSL_ResourceAction ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDSL_ListActions4398); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDSL_ListActionsAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2118:1: ( (lv_actionList_2_0= ruleDSL_ResourceAction ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2119:1: (lv_actionList_2_0= ruleDSL_ResourceAction )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2119:1: (lv_actionList_2_0= ruleDSL_ResourceAction )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2120:3: lv_actionList_2_0= ruleDSL_ResourceAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_ListActionsAccess().getActionListDSL_ResourceActionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_ResourceAction_in_ruleDSL_ListActions4419);
            	    lv_actionList_2_0=ruleDSL_ResourceAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_ListActionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actionList",
            	            		lv_actionList_2_0, 
            	            		"DSL_ResourceAction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_ListActions"


    // $ANTLR start "entryRuleDSL_ResourceAction"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2144:1: entryRuleDSL_ResourceAction returns [EObject current=null] : iv_ruleDSL_ResourceAction= ruleDSL_ResourceAction EOF ;
    public final EObject entryRuleDSL_ResourceAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_ResourceAction = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2145:2: (iv_ruleDSL_ResourceAction= ruleDSL_ResourceAction EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2146:2: iv_ruleDSL_ResourceAction= ruleDSL_ResourceAction EOF
            {
             newCompositeNode(grammarAccess.getDSL_ResourceActionRule()); 
            pushFollow(FOLLOW_ruleDSL_ResourceAction_in_entryRuleDSL_ResourceAction4457);
            iv_ruleDSL_ResourceAction=ruleDSL_ResourceAction();

            state._fsp--;

             current =iv_ruleDSL_ResourceAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_ResourceAction4467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_ResourceAction"


    // $ANTLR start "ruleDSL_ResourceAction"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2153:1: ruleDSL_ResourceAction returns [EObject current=null] : ( ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( ( (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' ) ) ) otherlv_5= '(' ( (lv_listParam_6_0= ruleDSL_ListParam ) )? otherlv_7= ')' ) ;
    public final EObject ruleDSL_ResourceAction() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_actiontype_4_1=null;
        Token lv_actiontype_4_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_listParam_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2156:28: ( ( ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( ( (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' ) ) ) otherlv_5= '(' ( (lv_listParam_6_0= ruleDSL_ListParam ) )? otherlv_7= ')' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2157:1: ( ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( ( (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' ) ) ) otherlv_5= '(' ( (lv_listParam_6_0= ruleDSL_ListParam ) )? otherlv_7= ')' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2157:1: ( ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( ( (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' ) ) ) otherlv_5= '(' ( (lv_listParam_6_0= ruleDSL_ListParam ) )? otherlv_7= ')' )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2157:2: ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( ( (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' ) ) ) otherlv_5= '(' ( (lv_listParam_6_0= ruleDSL_ListParam ) )? otherlv_7= ')'
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2157:2: ( ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==23) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2157:3: ( (lv_variable_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2157:3: ( (lv_variable_0_0= RULE_ID ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2158:1: (lv_variable_0_0= RULE_ID )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2158:1: (lv_variable_0_0= RULE_ID )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2159:3: lv_variable_0_0= RULE_ID
                    {
                    lv_variable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_ResourceAction4510); 

                    			newLeafNode(lv_variable_0_0, grammarAccess.getDSL_ResourceActionAccess().getVariableIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSL_ResourceActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"variable",
                            		lv_variable_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleDSL_ResourceAction4527); 

                        	newLeafNode(otherlv_1, grammarAccess.getDSL_ResourceActionAccess().getEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2179:3: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2180:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2180:1: (otherlv_2= RULE_ID )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2181:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDSL_ResourceActionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_ResourceAction4549); 

            		newLeafNode(otherlv_2, grammarAccess.getDSL_ResourceActionAccess().getRefDSL_REFCrossReference_1_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleDSL_ResourceAction4561); 

                	newLeafNode(otherlv_3, grammarAccess.getDSL_ResourceActionAccess().getFullStopKeyword_2());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2196:1: ( ( (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2197:1: ( (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2197:1: ( (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2198:1: (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2198:1: (lv_actiontype_4_1= 'act' | lv_actiontype_4_2= 'set' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            else if ( (LA21_0==47) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2199:3: lv_actiontype_4_1= 'act'
                    {
                    lv_actiontype_4_1=(Token)match(input,46,FOLLOW_46_in_ruleDSL_ResourceAction4581); 

                            newLeafNode(lv_actiontype_4_1, grammarAccess.getDSL_ResourceActionAccess().getActiontypeActKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSL_ResourceActionRule());
                    	        }
                           		setWithLastConsumed(current, "actiontype", lv_actiontype_4_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2211:8: lv_actiontype_4_2= 'set'
                    {
                    lv_actiontype_4_2=(Token)match(input,47,FOLLOW_47_in_ruleDSL_ResourceAction4610); 

                            newLeafNode(lv_actiontype_4_2, grammarAccess.getDSL_ResourceActionAccess().getActiontypeSetKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSL_ResourceActionRule());
                    	        }
                           		setWithLastConsumed(current, "actiontype", lv_actiontype_4_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDSL_ResourceAction4638); 

                	newLeafNode(otherlv_5, grammarAccess.getDSL_ResourceActionAccess().getLeftParenthesisKeyword_4());
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2230:1: ( (lv_listParam_6_0= ruleDSL_ListParam ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==19||LA22_0==61) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2231:1: (lv_listParam_6_0= ruleDSL_ListParam )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2231:1: (lv_listParam_6_0= ruleDSL_ListParam )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2232:3: lv_listParam_6_0= ruleDSL_ListParam
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_ResourceActionAccess().getListParamDSL_ListParamParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_ListParam_in_ruleDSL_ResourceAction4659);
                    lv_listParam_6_0=ruleDSL_ListParam();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_ResourceActionRule());
                    	        }
                           		set(
                           			current, 
                           			"listParam",
                            		lv_listParam_6_0, 
                            		"DSL_ListParam");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleDSL_ResourceAction4672); 

                	newLeafNode(otherlv_7, grammarAccess.getDSL_ResourceActionAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_ResourceAction"


    // $ANTLR start "entryRuleDSL_ListParam"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2260:1: entryRuleDSL_ListParam returns [EObject current=null] : iv_ruleDSL_ListParam= ruleDSL_ListParam EOF ;
    public final EObject entryRuleDSL_ListParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_ListParam = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2261:2: (iv_ruleDSL_ListParam= ruleDSL_ListParam EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2262:2: iv_ruleDSL_ListParam= ruleDSL_ListParam EOF
            {
             newCompositeNode(grammarAccess.getDSL_ListParamRule()); 
            pushFollow(FOLLOW_ruleDSL_ListParam_in_entryRuleDSL_ListParam4708);
            iv_ruleDSL_ListParam=ruleDSL_ListParam();

            state._fsp--;

             current =iv_ruleDSL_ListParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_ListParam4718); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_ListParam"


    // $ANTLR start "ruleDSL_ListParam"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2269:1: ruleDSL_ListParam returns [EObject current=null] : ( ( (lv_param_0_0= ruleDSL_Expression_Or ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleDSL_Expression_Or ) ) )* ) ;
    public final EObject ruleDSL_ListParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_param_0_0 = null;

        EObject lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2272:28: ( ( ( (lv_param_0_0= ruleDSL_Expression_Or ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleDSL_Expression_Or ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2273:1: ( ( (lv_param_0_0= ruleDSL_Expression_Or ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleDSL_Expression_Or ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2273:1: ( ( (lv_param_0_0= ruleDSL_Expression_Or ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleDSL_Expression_Or ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2273:2: ( (lv_param_0_0= ruleDSL_Expression_Or ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleDSL_Expression_Or ) ) )*
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2273:2: ( (lv_param_0_0= ruleDSL_Expression_Or ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2274:1: (lv_param_0_0= ruleDSL_Expression_Or )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2274:1: (lv_param_0_0= ruleDSL_Expression_Or )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2275:3: lv_param_0_0= ruleDSL_Expression_Or
            {
             
            	        newCompositeNode(grammarAccess.getDSL_ListParamAccess().getParamDSL_Expression_OrParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_ListParam4764);
            lv_param_0_0=ruleDSL_Expression_Or();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDSL_ListParamRule());
            	        }
                   		add(
                   			current, 
                   			"param",
                    		lv_param_0_0, 
                    		"DSL_Expression_Or");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2291:2: (otherlv_1= ',' ( (lv_param_2_0= ruleDSL_Expression_Or ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2291:4: otherlv_1= ',' ( (lv_param_2_0= ruleDSL_Expression_Or ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDSL_ListParam4777); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDSL_ListParamAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2295:1: ( (lv_param_2_0= ruleDSL_Expression_Or ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2296:1: (lv_param_2_0= ruleDSL_Expression_Or )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2296:1: (lv_param_2_0= ruleDSL_Expression_Or )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2297:3: lv_param_2_0= ruleDSL_Expression_Or
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_ListParamAccess().getParamDSL_Expression_OrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_ListParam4798);
            	    lv_param_2_0=ruleDSL_Expression_Or();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_ListParamRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"param",
            	            		lv_param_2_0, 
            	            		"DSL_Expression_Or");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_ListParam"


    // $ANTLR start "entryRuleDSL_Expression_Or"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2321:1: entryRuleDSL_Expression_Or returns [EObject current=null] : iv_ruleDSL_Expression_Or= ruleDSL_Expression_Or EOF ;
    public final EObject entryRuleDSL_Expression_Or() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Expression_Or = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2322:2: (iv_ruleDSL_Expression_Or= ruleDSL_Expression_Or EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2323:2: iv_ruleDSL_Expression_Or= ruleDSL_Expression_Or EOF
            {
             newCompositeNode(grammarAccess.getDSL_Expression_OrRule()); 
            pushFollow(FOLLOW_ruleDSL_Expression_Or_in_entryRuleDSL_Expression_Or4836);
            iv_ruleDSL_Expression_Or=ruleDSL_Expression_Or();

            state._fsp--;

             current =iv_ruleDSL_Expression_Or; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_Expression_Or4846); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_Expression_Or"


    // $ANTLR start "ruleDSL_Expression_Or"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2330:1: ruleDSL_Expression_Or returns [EObject current=null] : (this_DSL_Expression_And_0= ruleDSL_Expression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleDSL_Expression_And ) ) )* ) ;
    public final EObject ruleDSL_Expression_Or() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DSL_Expression_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2333:28: ( (this_DSL_Expression_And_0= ruleDSL_Expression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleDSL_Expression_And ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2334:1: (this_DSL_Expression_And_0= ruleDSL_Expression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleDSL_Expression_And ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2334:1: (this_DSL_Expression_And_0= ruleDSL_Expression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleDSL_Expression_And ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2335:5: this_DSL_Expression_And_0= ruleDSL_Expression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleDSL_Expression_And ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_AndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDSL_Expression_And_in_ruleDSL_Expression_Or4893);
            this_DSL_Expression_And_0=ruleDSL_Expression_And();

            state._fsp--;

             
                    current = this_DSL_Expression_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2343:1: (otherlv_1= 'or' () ( (lv_right_3_0= ruleDSL_Expression_And ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2343:3: otherlv_1= 'or' () ( (lv_right_3_0= ruleDSL_Expression_And ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleDSL_Expression_Or4905); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDSL_Expression_OrAccess().getOrKeyword_1_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2347:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2348:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_OrAccess().getDSL_Expression_OrLeftAction_1_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2353:2: ( (lv_right_3_0= ruleDSL_Expression_And ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2354:1: (lv_right_3_0= ruleDSL_Expression_And )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2354:1: (lv_right_3_0= ruleDSL_Expression_And )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2355:3: lv_right_3_0= ruleDSL_Expression_And
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_OrAccess().getRightDSL_Expression_AndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_And_in_ruleDSL_Expression_Or4935);
            	    lv_right_3_0=ruleDSL_Expression_And();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_OrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"DSL_Expression_And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_Expression_Or"


    // $ANTLR start "entryRuleDSL_Expression_And"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2379:1: entryRuleDSL_Expression_And returns [EObject current=null] : iv_ruleDSL_Expression_And= ruleDSL_Expression_And EOF ;
    public final EObject entryRuleDSL_Expression_And() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Expression_And = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2380:2: (iv_ruleDSL_Expression_And= ruleDSL_Expression_And EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2381:2: iv_ruleDSL_Expression_And= ruleDSL_Expression_And EOF
            {
             newCompositeNode(grammarAccess.getDSL_Expression_AndRule()); 
            pushFollow(FOLLOW_ruleDSL_Expression_And_in_entryRuleDSL_Expression_And4973);
            iv_ruleDSL_Expression_And=ruleDSL_Expression_And();

            state._fsp--;

             current =iv_ruleDSL_Expression_And; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_Expression_And4983); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_Expression_And"


    // $ANTLR start "ruleDSL_Expression_And"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2388:1: ruleDSL_Expression_And returns [EObject current=null] : (this_DSL_Expression_DiffEqual_0= ruleDSL_Expression_DiffEqual (otherlv_1= 'and' () ( (lv_right_3_0= ruleDSL_Expression_DiffEqual ) ) )* ) ;
    public final EObject ruleDSL_Expression_And() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DSL_Expression_DiffEqual_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2391:28: ( (this_DSL_Expression_DiffEqual_0= ruleDSL_Expression_DiffEqual (otherlv_1= 'and' () ( (lv_right_3_0= ruleDSL_Expression_DiffEqual ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2392:1: (this_DSL_Expression_DiffEqual_0= ruleDSL_Expression_DiffEqual (otherlv_1= 'and' () ( (lv_right_3_0= ruleDSL_Expression_DiffEqual ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2392:1: (this_DSL_Expression_DiffEqual_0= ruleDSL_Expression_DiffEqual (otherlv_1= 'and' () ( (lv_right_3_0= ruleDSL_Expression_DiffEqual ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2393:5: this_DSL_Expression_DiffEqual_0= ruleDSL_Expression_DiffEqual (otherlv_1= 'and' () ( (lv_right_3_0= ruleDSL_Expression_DiffEqual ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_DiffEqualParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDSL_Expression_DiffEqual_in_ruleDSL_Expression_And5030);
            this_DSL_Expression_DiffEqual_0=ruleDSL_Expression_DiffEqual();

            state._fsp--;

             
                    current = this_DSL_Expression_DiffEqual_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2401:1: (otherlv_1= 'and' () ( (lv_right_3_0= ruleDSL_Expression_DiffEqual ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2401:3: otherlv_1= 'and' () ( (lv_right_3_0= ruleDSL_Expression_DiffEqual ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleDSL_Expression_And5042); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDSL_Expression_AndAccess().getAndKeyword_1_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2405:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2406:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_AndAccess().getDSL_Expression_AndLeftAction_1_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2411:2: ( (lv_right_3_0= ruleDSL_Expression_DiffEqual ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2412:1: (lv_right_3_0= ruleDSL_Expression_DiffEqual )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2412:1: (lv_right_3_0= ruleDSL_Expression_DiffEqual )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2413:3: lv_right_3_0= ruleDSL_Expression_DiffEqual
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_AndAccess().getRightDSL_Expression_DiffEqualParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_DiffEqual_in_ruleDSL_Expression_And5072);
            	    lv_right_3_0=ruleDSL_Expression_DiffEqual();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_AndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"DSL_Expression_DiffEqual");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_Expression_And"


    // $ANTLR start "entryRuleDSL_Expression_DiffEqual"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2437:1: entryRuleDSL_Expression_DiffEqual returns [EObject current=null] : iv_ruleDSL_Expression_DiffEqual= ruleDSL_Expression_DiffEqual EOF ;
    public final EObject entryRuleDSL_Expression_DiffEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Expression_DiffEqual = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2438:2: (iv_ruleDSL_Expression_DiffEqual= ruleDSL_Expression_DiffEqual EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2439:2: iv_ruleDSL_Expression_DiffEqual= ruleDSL_Expression_DiffEqual EOF
            {
             newCompositeNode(grammarAccess.getDSL_Expression_DiffEqualRule()); 
            pushFollow(FOLLOW_ruleDSL_Expression_DiffEqual_in_entryRuleDSL_Expression_DiffEqual5110);
            iv_ruleDSL_Expression_DiffEqual=ruleDSL_Expression_DiffEqual();

            state._fsp--;

             current =iv_ruleDSL_Expression_DiffEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_Expression_DiffEqual5120); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_Expression_DiffEqual"


    // $ANTLR start "ruleDSL_Expression_DiffEqual"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2446:1: ruleDSL_Expression_DiffEqual returns [EObject current=null] : (this_DSL_Expression_Compare_0= ruleDSL_Expression_Compare ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) ) ) )* ) ;
    public final EObject ruleDSL_Expression_DiffEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_DSL_Expression_Compare_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2449:28: ( (this_DSL_Expression_Compare_0= ruleDSL_Expression_Compare ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2450:1: (this_DSL_Expression_Compare_0= ruleDSL_Expression_Compare ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2450:1: (this_DSL_Expression_Compare_0= ruleDSL_Expression_Compare ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2451:5: this_DSL_Expression_Compare_0= ruleDSL_Expression_Compare ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_CompareParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDSL_Expression_Compare_in_ruleDSL_Expression_DiffEqual5167);
            this_DSL_Expression_Compare_0=ruleDSL_Expression_Compare();

            state._fsp--;

             
                    current = this_DSL_Expression_Compare_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2459:1: ( (otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) ) ) | (otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }
                else if ( (LA26_0==51) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2459:2: (otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2459:2: (otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2459:4: otherlv_1= '!=' () ( (lv_right_3_0= ruleDSL_Expression_Compare ) )
            	    {
            	    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleDSL_Expression_DiffEqual5180); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDSL_Expression_DiffEqualAccess().getExclamationMarkEqualsSignKeyword_1_0_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2463:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2464:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_DiffLeftAction_1_0_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2469:2: ( (lv_right_3_0= ruleDSL_Expression_Compare ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2470:1: (lv_right_3_0= ruleDSL_Expression_Compare )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2470:1: (lv_right_3_0= ruleDSL_Expression_Compare )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2471:3: lv_right_3_0= ruleDSL_Expression_Compare
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_DiffEqualAccess().getRightDSL_Expression_CompareParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_Compare_in_ruleDSL_Expression_DiffEqual5210);
            	    lv_right_3_0=ruleDSL_Expression_Compare();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_DiffEqualRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"DSL_Expression_Compare");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2488:6: (otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2488:6: (otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2488:8: otherlv_4= '==' () ( (lv_right_6_0= ruleDSL_Expression_Compare ) )
            	    {
            	    otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleDSL_Expression_DiffEqual5230); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDSL_Expression_DiffEqualAccess().getEqualsSignEqualsSignKeyword_1_1_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2492:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2493:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_DiffEqualAccess().getDSL_Expression_EqualLeftAction_1_1_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2498:2: ( (lv_right_6_0= ruleDSL_Expression_Compare ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2499:1: (lv_right_6_0= ruleDSL_Expression_Compare )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2499:1: (lv_right_6_0= ruleDSL_Expression_Compare )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2500:3: lv_right_6_0= ruleDSL_Expression_Compare
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_DiffEqualAccess().getRightDSL_Expression_CompareParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_Compare_in_ruleDSL_Expression_DiffEqual5260);
            	    lv_right_6_0=ruleDSL_Expression_Compare();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_DiffEqualRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_6_0, 
            	            		"DSL_Expression_Compare");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_Expression_DiffEqual"


    // $ANTLR start "entryRuleDSL_Expression_Compare"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2524:1: entryRuleDSL_Expression_Compare returns [EObject current=null] : iv_ruleDSL_Expression_Compare= ruleDSL_Expression_Compare EOF ;
    public final EObject entryRuleDSL_Expression_Compare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Expression_Compare = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2525:2: (iv_ruleDSL_Expression_Compare= ruleDSL_Expression_Compare EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2526:2: iv_ruleDSL_Expression_Compare= ruleDSL_Expression_Compare EOF
            {
             newCompositeNode(grammarAccess.getDSL_Expression_CompareRule()); 
            pushFollow(FOLLOW_ruleDSL_Expression_Compare_in_entryRuleDSL_Expression_Compare5299);
            iv_ruleDSL_Expression_Compare=ruleDSL_Expression_Compare();

            state._fsp--;

             current =iv_ruleDSL_Expression_Compare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_Expression_Compare5309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_Expression_Compare"


    // $ANTLR start "ruleDSL_Expression_Compare"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2533:1: ruleDSL_Expression_Compare returns [EObject current=null] : (this_DSL_Expression_PlusMinus_0= ruleDSL_Expression_PlusMinus ( (otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) ) ) )* ) ;
    public final EObject ruleDSL_Expression_Compare() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject this_DSL_Expression_PlusMinus_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2536:28: ( (this_DSL_Expression_PlusMinus_0= ruleDSL_Expression_PlusMinus ( (otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2537:1: (this_DSL_Expression_PlusMinus_0= ruleDSL_Expression_PlusMinus ( (otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2537:1: (this_DSL_Expression_PlusMinus_0= ruleDSL_Expression_PlusMinus ( (otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2538:5: this_DSL_Expression_PlusMinus_0= ruleDSL_Expression_PlusMinus ( (otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_PlusMinusParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5356);
            this_DSL_Expression_PlusMinus_0=ruleDSL_Expression_PlusMinus();

            state._fsp--;

             
                    current = this_DSL_Expression_PlusMinus_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2546:1: ( (otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) ) ) )*
            loop27:
            do {
                int alt27=5;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt27=1;
                    }
                    break;
                case 53:
                    {
                    alt27=2;
                    }
                    break;
                case 54:
                    {
                    alt27=3;
                    }
                    break;
                case 55:
                    {
                    alt27=4;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2546:2: (otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2546:2: (otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2546:4: otherlv_1= '>' () ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleDSL_Expression_Compare5369); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDSL_Expression_CompareAccess().getGreaterThanSignKeyword_1_0_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2550:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2551:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_LargerLeftAction_1_0_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2556:2: ( (lv_right_3_0= ruleDSL_Expression_PlusMinus ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2557:1: (lv_right_3_0= ruleDSL_Expression_PlusMinus )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2557:1: (lv_right_3_0= ruleDSL_Expression_PlusMinus )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2558:3: lv_right_3_0= ruleDSL_Expression_PlusMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_CompareAccess().getRightDSL_Expression_PlusMinusParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5399);
            	    lv_right_3_0=ruleDSL_Expression_PlusMinus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_CompareRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"DSL_Expression_PlusMinus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2575:6: (otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2575:6: (otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2575:8: otherlv_4= '>=' () ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) )
            	    {
            	    otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleDSL_Expression_Compare5419); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDSL_Expression_CompareAccess().getGreaterThanSignEqualsSignKeyword_1_1_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2579:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2580:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Larger_EqualLeftAction_1_1_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2585:2: ( (lv_right_6_0= ruleDSL_Expression_PlusMinus ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2586:1: (lv_right_6_0= ruleDSL_Expression_PlusMinus )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2586:1: (lv_right_6_0= ruleDSL_Expression_PlusMinus )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2587:3: lv_right_6_0= ruleDSL_Expression_PlusMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_CompareAccess().getRightDSL_Expression_PlusMinusParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5449);
            	    lv_right_6_0=ruleDSL_Expression_PlusMinus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_CompareRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_6_0, 
            	            		"DSL_Expression_PlusMinus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2604:6: (otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2604:6: (otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2604:8: otherlv_7= '<' () ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) )
            	    {
            	    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleDSL_Expression_Compare5469); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDSL_Expression_CompareAccess().getLessThanSignKeyword_1_2_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2608:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2609:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_SmallerLeftAction_1_2_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2614:2: ( (lv_right_9_0= ruleDSL_Expression_PlusMinus ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2615:1: (lv_right_9_0= ruleDSL_Expression_PlusMinus )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2615:1: (lv_right_9_0= ruleDSL_Expression_PlusMinus )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2616:3: lv_right_9_0= ruleDSL_Expression_PlusMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_CompareAccess().getRightDSL_Expression_PlusMinusParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5499);
            	    lv_right_9_0=ruleDSL_Expression_PlusMinus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_CompareRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_9_0, 
            	            		"DSL_Expression_PlusMinus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2633:6: (otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2633:6: (otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2633:8: otherlv_10= '<=' () ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) )
            	    {
            	    otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleDSL_Expression_Compare5519); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDSL_Expression_CompareAccess().getLessThanSignEqualsSignKeyword_1_3_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2637:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2638:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_CompareAccess().getDSL_Expression_Smaller_EqualLeftAction_1_3_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2643:2: ( (lv_right_12_0= ruleDSL_Expression_PlusMinus ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2644:1: (lv_right_12_0= ruleDSL_Expression_PlusMinus )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2644:1: (lv_right_12_0= ruleDSL_Expression_PlusMinus )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2645:3: lv_right_12_0= ruleDSL_Expression_PlusMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_CompareAccess().getRightDSL_Expression_PlusMinusParserRuleCall_1_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5549);
            	    lv_right_12_0=ruleDSL_Expression_PlusMinus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_CompareRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_12_0, 
            	            		"DSL_Expression_PlusMinus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_Expression_Compare"


    // $ANTLR start "entryRuleDSL_Expression_PlusMinus"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2669:1: entryRuleDSL_Expression_PlusMinus returns [EObject current=null] : iv_ruleDSL_Expression_PlusMinus= ruleDSL_Expression_PlusMinus EOF ;
    public final EObject entryRuleDSL_Expression_PlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Expression_PlusMinus = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2670:2: (iv_ruleDSL_Expression_PlusMinus= ruleDSL_Expression_PlusMinus EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2671:2: iv_ruleDSL_Expression_PlusMinus= ruleDSL_Expression_PlusMinus EOF
            {
             newCompositeNode(grammarAccess.getDSL_Expression_PlusMinusRule()); 
            pushFollow(FOLLOW_ruleDSL_Expression_PlusMinus_in_entryRuleDSL_Expression_PlusMinus5588);
            iv_ruleDSL_Expression_PlusMinus=ruleDSL_Expression_PlusMinus();

            state._fsp--;

             current =iv_ruleDSL_Expression_PlusMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_Expression_PlusMinus5598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_Expression_PlusMinus"


    // $ANTLR start "ruleDSL_Expression_PlusMinus"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2678:1: ruleDSL_Expression_PlusMinus returns [EObject current=null] : (this_DSL_Expression_MultiplicationDivision_0= ruleDSL_Expression_MultiplicationDivision ( (otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) ) ) )* ) ;
    public final EObject ruleDSL_Expression_PlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_DSL_Expression_MultiplicationDivision_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2681:28: ( (this_DSL_Expression_MultiplicationDivision_0= ruleDSL_Expression_MultiplicationDivision ( (otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2682:1: (this_DSL_Expression_MultiplicationDivision_0= ruleDSL_Expression_MultiplicationDivision ( (otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2682:1: (this_DSL_Expression_MultiplicationDivision_0= ruleDSL_Expression_MultiplicationDivision ( (otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2683:5: this_DSL_Expression_MultiplicationDivision_0= ruleDSL_Expression_MultiplicationDivision ( (otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MultiplicationDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDSL_Expression_MultiplicationDivision_in_ruleDSL_Expression_PlusMinus5645);
            this_DSL_Expression_MultiplicationDivision_0=ruleDSL_Expression_MultiplicationDivision();

            state._fsp--;

             
                    current = this_DSL_Expression_MultiplicationDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2691:1: ( (otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) ) ) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==56) ) {
                    alt28=1;
                }
                else if ( (LA28_0==57) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2691:2: (otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2691:2: (otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2691:4: otherlv_1= '+' () ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) )
            	    {
            	    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleDSL_Expression_PlusMinus5658); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDSL_Expression_PlusMinusAccess().getPlusSignKeyword_1_0_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2695:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2696:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_PlusLeftAction_1_0_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2701:2: ( (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2702:1: (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2702:1: (lv_right_3_0= ruleDSL_Expression_MultiplicationDivision )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2703:3: lv_right_3_0= ruleDSL_Expression_MultiplicationDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_PlusMinusAccess().getRightDSL_Expression_MultiplicationDivisionParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_MultiplicationDivision_in_ruleDSL_Expression_PlusMinus5688);
            	    lv_right_3_0=ruleDSL_Expression_MultiplicationDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_PlusMinusRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"DSL_Expression_MultiplicationDivision");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2720:6: (otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2720:6: (otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2720:8: otherlv_4= '-' () ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleDSL_Expression_PlusMinus5708); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDSL_Expression_PlusMinusAccess().getHyphenMinusKeyword_1_1_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2724:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2725:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_PlusMinusAccess().getDSL_Expression_MinusLeftAction_1_1_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2730:2: ( (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2731:1: (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2731:1: (lv_right_6_0= ruleDSL_Expression_MultiplicationDivision )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2732:3: lv_right_6_0= ruleDSL_Expression_MultiplicationDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_PlusMinusAccess().getRightDSL_Expression_MultiplicationDivisionParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_MultiplicationDivision_in_ruleDSL_Expression_PlusMinus5738);
            	    lv_right_6_0=ruleDSL_Expression_MultiplicationDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_PlusMinusRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_6_0, 
            	            		"DSL_Expression_MultiplicationDivision");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_Expression_PlusMinus"


    // $ANTLR start "entryRuleDSL_Expression_MultiplicationDivision"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2756:1: entryRuleDSL_Expression_MultiplicationDivision returns [EObject current=null] : iv_ruleDSL_Expression_MultiplicationDivision= ruleDSL_Expression_MultiplicationDivision EOF ;
    public final EObject entryRuleDSL_Expression_MultiplicationDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Expression_MultiplicationDivision = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2757:2: (iv_ruleDSL_Expression_MultiplicationDivision= ruleDSL_Expression_MultiplicationDivision EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2758:2: iv_ruleDSL_Expression_MultiplicationDivision= ruleDSL_Expression_MultiplicationDivision EOF
            {
             newCompositeNode(grammarAccess.getDSL_Expression_MultiplicationDivisionRule()); 
            pushFollow(FOLLOW_ruleDSL_Expression_MultiplicationDivision_in_entryRuleDSL_Expression_MultiplicationDivision5777);
            iv_ruleDSL_Expression_MultiplicationDivision=ruleDSL_Expression_MultiplicationDivision();

            state._fsp--;

             current =iv_ruleDSL_Expression_MultiplicationDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_Expression_MultiplicationDivision5787); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_Expression_MultiplicationDivision"


    // $ANTLR start "ruleDSL_Expression_MultiplicationDivision"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2765:1: ruleDSL_Expression_MultiplicationDivision returns [EObject current=null] : (this_DSL_Expression_Unary_0= ruleDSL_Expression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) ) ) )* ) ;
    public final EObject ruleDSL_Expression_MultiplicationDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_DSL_Expression_Unary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2768:28: ( (this_DSL_Expression_Unary_0= ruleDSL_Expression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) ) ) )* ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2769:1: (this_DSL_Expression_Unary_0= ruleDSL_Expression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) ) ) )* )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2769:1: (this_DSL_Expression_Unary_0= ruleDSL_Expression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) ) ) )* )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2770:5: this_DSL_Expression_Unary_0= ruleDSL_Expression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_UnaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_MultiplicationDivision5834);
            this_DSL_Expression_Unary_0=ruleDSL_Expression_Unary();

            state._fsp--;

             
                    current = this_DSL_Expression_Unary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2778:1: ( (otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) ) ) )*
            loop29:
            do {
                int alt29=4;
                switch ( input.LA(1) ) {
                case 58:
                    {
                    alt29=1;
                    }
                    break;
                case 26:
                    {
                    alt29=2;
                    }
                    break;
                case 59:
                    {
                    alt29=3;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2778:2: (otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2778:2: (otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2778:4: otherlv_1= '*' () ( (lv_right_3_0= ruleDSL_Expression_Unary ) )
            	    {
            	    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleDSL_Expression_MultiplicationDivision5847); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getAsteriskKeyword_1_0_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2782:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2783:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_MultiplicationLeftAction_1_0_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2788:2: ( (lv_right_3_0= ruleDSL_Expression_Unary ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2789:1: (lv_right_3_0= ruleDSL_Expression_Unary )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2789:1: (lv_right_3_0= ruleDSL_Expression_Unary )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2790:3: lv_right_3_0= ruleDSL_Expression_Unary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getRightDSL_Expression_UnaryParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_MultiplicationDivision5877);
            	    lv_right_3_0=ruleDSL_Expression_Unary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_MultiplicationDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"DSL_Expression_Unary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2807:6: (otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2807:6: (otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2807:8: otherlv_4= '/' () ( (lv_right_6_0= ruleDSL_Expression_Unary ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleDSL_Expression_MultiplicationDivision5897); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getSolidusKeyword_1_1_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2811:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2812:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_DivisionLeftAction_1_1_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2817:2: ( (lv_right_6_0= ruleDSL_Expression_Unary ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2818:1: (lv_right_6_0= ruleDSL_Expression_Unary )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2818:1: (lv_right_6_0= ruleDSL_Expression_Unary )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2819:3: lv_right_6_0= ruleDSL_Expression_Unary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getRightDSL_Expression_UnaryParserRuleCall_1_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_MultiplicationDivision5927);
            	    lv_right_6_0=ruleDSL_Expression_Unary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_MultiplicationDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_6_0, 
            	            		"DSL_Expression_Unary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2836:6: (otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) ) )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2836:6: (otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2836:8: otherlv_7= '%' () ( (lv_right_9_0= ruleDSL_Expression_Unary ) )
            	    {
            	    otherlv_7=(Token)match(input,59,FOLLOW_59_in_ruleDSL_Expression_MultiplicationDivision5947); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getPercentSignKeyword_1_2_0());
            	        
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2840:1: ()
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2841:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getDSL_Expression_ModuloLeftAction_1_2_1(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2846:2: ( (lv_right_9_0= ruleDSL_Expression_Unary ) )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2847:1: (lv_right_9_0= ruleDSL_Expression_Unary )
            	    {
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2847:1: (lv_right_9_0= ruleDSL_Expression_Unary )
            	    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2848:3: lv_right_9_0= ruleDSL_Expression_Unary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDSL_Expression_MultiplicationDivisionAccess().getRightDSL_Expression_UnaryParserRuleCall_1_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_MultiplicationDivision5977);
            	    lv_right_9_0=ruleDSL_Expression_Unary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_MultiplicationDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_9_0, 
            	            		"DSL_Expression_Unary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_Expression_MultiplicationDivision"


    // $ANTLR start "entryRuleDSL_Expression_Unary"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2872:1: entryRuleDSL_Expression_Unary returns [EObject current=null] : iv_ruleDSL_Expression_Unary= ruleDSL_Expression_Unary EOF ;
    public final EObject entryRuleDSL_Expression_Unary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSL_Expression_Unary = null;


        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2873:2: (iv_ruleDSL_Expression_Unary= ruleDSL_Expression_Unary EOF )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2874:2: iv_ruleDSL_Expression_Unary= ruleDSL_Expression_Unary EOF
            {
             newCompositeNode(grammarAccess.getDSL_Expression_UnaryRule()); 
            pushFollow(FOLLOW_ruleDSL_Expression_Unary_in_entryRuleDSL_Expression_Unary6016);
            iv_ruleDSL_Expression_Unary=ruleDSL_Expression_Unary();

            state._fsp--;

             current =iv_ruleDSL_Expression_Unary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDSL_Expression_Unary6026); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSL_Expression_Unary"


    // $ANTLR start "ruleDSL_Expression_Unary"
    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2881:1: ruleDSL_Expression_Unary returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '.get()' ) | (otherlv_9= '(' this_DSL_Expression_Or_10= ruleDSL_Expression_Or otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleDSL_Expression_Unary ) ) ) ) ;
    public final EObject ruleDSL_Expression_Unary() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject this_DSL_Expression_Or_10 = null;

        EObject lv_exp_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2884:28: ( ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '.get()' ) | (otherlv_9= '(' this_DSL_Expression_Or_10= ruleDSL_Expression_Or otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleDSL_Expression_Unary ) ) ) ) )
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2885:1: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '.get()' ) | (otherlv_9= '(' this_DSL_Expression_Or_10= ruleDSL_Expression_Or otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleDSL_Expression_Unary ) ) ) )
            {
            // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2885:1: ( ( () ( (lv_value_1_0= ruleNUMBER ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '.get()' ) | (otherlv_9= '(' this_DSL_Expression_Or_10= ruleDSL_Expression_Or otherlv_11= ')' ) | (otherlv_12= 'not' () ( (lv_exp_14_0= ruleDSL_Expression_Unary ) ) ) )
            int alt30=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt30=1;
                }
                break;
            case RULE_STRING:
                {
                alt30=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
                {
                alt30=4;
                }
                break;
            case 19:
                {
                alt30=5;
                }
                break;
            case 61:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2885:2: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2885:2: ( () ( (lv_value_1_0= ruleNUMBER ) ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2885:3: () ( (lv_value_1_0= ruleNUMBER ) )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2885:3: ()
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2886:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDSL_Expression_UnaryAccess().getDSL_Object_NumberAction_0_0(),
                                current);
                        

                    }

                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2891:2: ( (lv_value_1_0= ruleNUMBER ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2892:1: (lv_value_1_0= ruleNUMBER )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2892:1: (lv_value_1_0= ruleNUMBER )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2893:3: lv_value_1_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_Expression_UnaryAccess().getValueNUMBERParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleDSL_Expression_Unary6082);
                    lv_value_1_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_UnaryRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"NUMBER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2910:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2910:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2910:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2910:7: ()
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2911:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDSL_Expression_UnaryAccess().getDSL_Object_StringAction_1_0(),
                                current);
                        

                    }

                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2916:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2917:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2917:1: (lv_value_3_0= RULE_STRING )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2918:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDSL_Expression_Unary6116); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getDSL_Expression_UnaryAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSL_Expression_UnaryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2935:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2935:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2935:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2935:7: ()
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2936:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDSL_Expression_UnaryAccess().getDSL_Object_BooleanAction_2_0(),
                                current);
                        

                    }

                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2941:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2942:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2942:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2943:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleDSL_Expression_Unary6155); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getDSL_Expression_UnaryAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSL_Expression_UnaryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2960:6: ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '.get()' )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2960:6: ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '.get()' )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2960:7: () ( (otherlv_7= RULE_ID ) ) otherlv_8= '.get()'
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2960:7: ()
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2961:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDSL_Expression_UnaryAccess().getDSL_Object_RefAction_3_0(),
                                current);
                        

                    }

                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2966:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2967:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2967:1: (otherlv_7= RULE_ID )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2968:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDSL_Expression_UnaryRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDSL_Expression_Unary6197); 

                    		newLeafNode(otherlv_7, grammarAccess.getDSL_Expression_UnaryAccess().getValueDSL_REFCrossReference_3_1_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,60,FOLLOW_60_in_ruleDSL_Expression_Unary6209); 

                        	newLeafNode(otherlv_8, grammarAccess.getDSL_Expression_UnaryAccess().getGetKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2984:6: (otherlv_9= '(' this_DSL_Expression_Or_10= ruleDSL_Expression_Or otherlv_11= ')' )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2984:6: (otherlv_9= '(' this_DSL_Expression_Or_10= ruleDSL_Expression_Or otherlv_11= ')' )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:2984:8: otherlv_9= '(' this_DSL_Expression_Or_10= ruleDSL_Expression_Or otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleDSL_Expression_Unary6229); 

                        	newLeafNode(otherlv_9, grammarAccess.getDSL_Expression_UnaryAccess().getLeftParenthesisKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getDSL_Expression_UnaryAccess().getDSL_Expression_OrParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_Expression_Unary6251);
                    this_DSL_Expression_Or_10=ruleDSL_Expression_Or();

                    state._fsp--;

                     
                            current = this_DSL_Expression_Or_10; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleDSL_Expression_Unary6262); 

                        	newLeafNode(otherlv_11, grammarAccess.getDSL_Expression_UnaryAccess().getRightParenthesisKeyword_4_2());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3002:6: (otherlv_12= 'not' () ( (lv_exp_14_0= ruleDSL_Expression_Unary ) ) )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3002:6: (otherlv_12= 'not' () ( (lv_exp_14_0= ruleDSL_Expression_Unary ) ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3002:8: otherlv_12= 'not' () ( (lv_exp_14_0= ruleDSL_Expression_Unary ) )
                    {
                    otherlv_12=(Token)match(input,61,FOLLOW_61_in_ruleDSL_Expression_Unary6282); 

                        	newLeafNode(otherlv_12, grammarAccess.getDSL_Expression_UnaryAccess().getNotKeyword_5_0());
                        
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3006:1: ()
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3007:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDSL_Expression_UnaryAccess().getDSL_Expression_NegateAction_5_1(),
                                current);
                        

                    }

                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3012:2: ( (lv_exp_14_0= ruleDSL_Expression_Unary ) )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3013:1: (lv_exp_14_0= ruleDSL_Expression_Unary )
                    {
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3013:1: (lv_exp_14_0= ruleDSL_Expression_Unary )
                    // ../org.xtext.sensinact.sna/src-gen/org/eclipse/sensinact/studio/language/parser/antlr/internal/InternalSensinact.g:3014:3: lv_exp_14_0= ruleDSL_Expression_Unary
                    {
                     
                    	        newCompositeNode(grammarAccess.getDSL_Expression_UnaryAccess().getExpDSL_Expression_UnaryParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_Unary6312);
                    lv_exp_14_0=ruleDSL_Expression_Unary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDSL_Expression_UnaryRule());
                    	        }
                           		set(
                           			current, 
                           			"exp",
                            		lv_exp_14_0, 
                            		"DSL_Expression_Unary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSL_Expression_Unary"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA8_eotS =
        "\10\uffff";
    static final String DFA8_eofS =
        "\10\uffff";
    static final String DFA8_minS =
        "\1\14\1\4\1\15\1\4\1\6\1\15\2\uffff";
    static final String DFA8_maxS =
        "\1\14\1\4\1\16\1\4\1\22\1\16\2\uffff";
    static final String DFA8_acceptS =
        "\6\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\10\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4",
            "\1\5",
            "\1\6\10\uffff\4\7",
            "\1\3\1\4",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "254:1: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* otherlv_4= 'with' ( (lv_value_5_0= ruleNUMBER ) ) ) | (otherlv_6= 'use' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= 'with' (otherlv_11= 'W' | otherlv_12= 'N' | otherlv_13= 'E' | otherlv_14= 'U' ) otherlv_15= '(' ( (lv_param1_16_0= ruleNUMBER ) ) otherlv_17= ',' ( (lv_param2_18_0= ruleNUMBER ) ) otherlv_19= ')' ) )";
        }
    }
    static final String DFA15_eotS =
        "\10\uffff";
    static final String DFA15_eofS =
        "\10\uffff";
    static final String DFA15_minS =
        "\1\6\1\42\3\6\2\uffff\1\50";
    static final String DFA15_maxS =
        "\1\6\1\55\2\24\1\6\2\uffff\1\55";
    static final String DFA15_acceptS =
        "\5\uffff\1\1\1\2\1\uffff";
    static final String DFA15_specialS =
        "\10\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\4\5\uffff\1\3\4\uffff\1\2",
            "\1\1\6\uffff\1\5\6\uffff\1\6",
            "\1\1\6\uffff\1\5\6\uffff\1\6",
            "\1\7",
            "",
            "",
            "\1\3\4\uffff\1\2"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1311:1: ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )?";
        }
    }
    static final String DFA16_eotS =
        "\10\uffff";
    static final String DFA16_eofS =
        "\10\uffff";
    static final String DFA16_minS =
        "\1\6\1\42\3\6\2\uffff\1\50";
    static final String DFA16_maxS =
        "\1\6\1\55\1\24\1\6\1\24\2\uffff\1\55";
    static final String DFA16_acceptS =
        "\5\uffff\1\1\1\2\1\uffff";
    static final String DFA16_specialS =
        "\10\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\3\5\uffff\1\2\4\uffff\1\4",
            "\1\1\6\uffff\1\5\6\uffff\1\6",
            "\1\7",
            "\1\1\6\uffff\1\5\6\uffff\1\6",
            "",
            "",
            "\1\2\4\uffff\1\4"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1428:1: ( ( (lv_start_6_0= ruleDSL_CEP_DURATION ) ) otherlv_7= ',' )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleSensinact_in_entryRuleSensinact75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensinact85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_SENSINACT_in_ruleSensinact140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_SENSINACT_in_entryRuleDSL_SENSINACT176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_SENSINACT186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_FLAG_AUTOSTART_in_ruleDSL_SENSINACT232 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDSL_Resource_in_ruleDSL_SENSINACT254 = new BitSet(new long[]{0x0000001011001000L});
    public static final BitSet FOLLOW_ruleDSL_CLOCK_STOCHASTIC_in_ruleDSL_SENSINACT276 = new BitSet(new long[]{0x0000001010001000L});
    public static final BitSet FOLLOW_ruleDSL_CEP_STATEMENT_in_ruleDSL_SENSINACT298 = new BitSet(new long[]{0x0000001010001000L});
    public static final BitSet FOLLOW_ruleDSL_On_in_ruleDSL_SENSINACT320 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleDSL_ECA_STATEMENT_in_ruleDSL_SENSINACT341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CLOCK_STOCHASTIC_in_entryRuleDSL_CLOCK_STOCHASTIC377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CLOCK_STOCHASTIC387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDSL_CLOCK_STOCHASTIC425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_CLOCK_STOCHASTIC445 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CLOCK_STOCHASTIC458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_CLOCK_STOCHASTIC478 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleDSL_CLOCK_STOCHASTIC492 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleDSL_CLOCK_STOCHASTIC513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDSL_CLOCK_STOCHASTIC533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_CLOCK_STOCHASTIC553 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CLOCK_STOCHASTIC566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_CLOCK_STOCHASTIC586 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleDSL_CLOCK_STOCHASTIC600 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_15_in_ruleDSL_CLOCK_STOCHASTIC613 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16_in_ruleDSL_CLOCK_STOCHASTIC631 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17_in_ruleDSL_CLOCK_STOCHASTIC649 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18_in_ruleDSL_CLOCK_STOCHASTIC667 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CLOCK_STOCHASTIC680 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleDSL_CLOCK_STOCHASTIC701 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CLOCK_STOCHASTIC713 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleDSL_CLOCK_STOCHASTIC734 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CLOCK_STOCHASTIC746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_FLAG_AUTOSTART_in_entryRuleDSL_FLAG_AUTOSTART783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_FLAG_AUTOSTART793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDSL_FLAG_AUTOSTART830 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDSL_FLAG_AUTOSTART842 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDSL_FLAG_AUTOSTART854 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleDSL_FLAG_AUTOSTART871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Resource_in_entryRuleDSL_Resource912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_Resource922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDSL_Resource959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_Resource976 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDSL_Resource993 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDSL_Resource1005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEXTENDED_ID_in_ruleDSL_Resource1026 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDSL_Resource1038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEXTENDED_ID_in_ruleDSL_Resource1059 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDSL_Resource1071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEXTENDED_ID_in_ruleDSL_Resource1092 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDSL_Resource1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEXTENDED_ID_in_ruleDSL_Resource1125 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDSL_Resource1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_On_in_entryRuleDSL_On1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_On1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDSL_On1220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_On1241 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleDSL_On1254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_On1275 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleDSL_ECA_STATEMENT_in_entryRuleDSL_ECA_STATEMENT1313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_ECA_STATEMENT1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_IfDo_in_ruleDSL_ECA_STATEMENT1369 = new BitSet(new long[]{0x0000000320000000L});
    public static final BitSet FOLLOW_ruleDSL_ElseIfDo_in_ruleDSL_ECA_STATEMENT1390 = new BitSet(new long[]{0x0000000320000000L});
    public static final BitSet FOLLOW_ruleDSL_ElseDo_in_ruleDSL_ECA_STATEMENT1412 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDSL_ECA_STATEMENT1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_IfDo_in_entryRuleDSL_IfDo1461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_IfDo1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDSL_IfDo1508 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_IfDo1529 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDSL_IfDo1541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_ListActions_in_ruleDSL_IfDo1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_ElseIfDo_in_entryRuleDSL_ElseIfDo1598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_ElseIfDo1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDSL_ElseIfDo1645 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_ElseIfDo1666 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDSL_ElseIfDo1678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_ListActions_in_ruleDSL_ElseIfDo1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_ElseDo_in_entryRuleDSL_ElseDo1735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_ElseDo1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDSL_ElseDo1782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_ListActions_in_ruleDSL_ElseDo1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER1840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER1918 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleNUMBER1936 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXTENDED_ID_in_entryRuleEXTENDED_ID1998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXTENDED_ID2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEXTENDED_ID2049 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleEXTENDED_ID2068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEXTENDED_ID2083 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_entryRuleDSL_REF_CONDITION2132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_REF_CONDITION2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_REF_CONDITION2187 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDSL_REF_CONDITION2199 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDSL_REF_CONDITION2211 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_REF_CONDITION2223 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_REF_CONDITION2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_STATEMENT_in_entryRuleDSL_CEP_STATEMENT2271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_STATEMENT2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDSL_CEP_STATEMENT2318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_CEP_STATEMENT2335 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDSL_CEP_STATEMENT2352 = new BitSet(new long[]{0x00001FE000000000L});
    public static final BitSet FOLLOW_ruleDSL_CEP_AFTER_in_ruleDSL_CEP_STATEMENT2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_BEFORE_in_ruleDSL_CEP_STATEMENT2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_COINCIDE_in_ruleDSL_CEP_STATEMENT2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_MIN_in_ruleDSL_CEP_STATEMENT2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_MAX_in_ruleDSL_CEP_STATEMENT2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_AVG_in_ruleDSL_CEP_STATEMENT2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_SUM_in_ruleDSL_CEP_STATEMENT2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_COUNT_in_ruleDSL_CEP_STATEMENT2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_AFTER_in_entryRuleDSL_CEP_AFTER2547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_AFTER2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDSL_CEP_AFTER2594 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CEP_AFTER2606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_AFTER2627 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_AFTER2639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_AFTER2660 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_AFTER2672 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_AFTER2694 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_AFTER2706 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_AFTER2729 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CEP_AFTER2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_BEFORE_in_entryRuleDSL_CEP_BEFORE2777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_BEFORE2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDSL_CEP_BEFORE2824 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CEP_BEFORE2836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_BEFORE2857 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_BEFORE2869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_BEFORE2890 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_BEFORE2902 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_BEFORE2924 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_BEFORE2936 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_BEFORE2959 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CEP_BEFORE2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_COINCIDE_in_entryRuleDSL_CEP_COINCIDE3007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_COINCIDE3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDSL_CEP_COINCIDE3054 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CEP_COINCIDE3066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_COINCIDE3087 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_COINCIDE3099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_COINCIDE3120 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_COINCIDE3132 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_COINCIDE3153 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CEP_COINCIDE3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_MIN_in_entryRuleDSL_CEP_MIN3201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_MIN3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDSL_CEP_MIN3248 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CEP_MIN3260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_MIN3281 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_MIN3293 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_MIN3314 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CEP_MIN3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_MAX_in_entryRuleDSL_CEP_MAX3362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_MAX3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDSL_CEP_MAX3409 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CEP_MAX3421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_MAX3442 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_MAX3454 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_MAX3475 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CEP_MAX3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_AVG_in_entryRuleDSL_CEP_AVG3523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_AVG3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDSL_CEP_AVG3570 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CEP_AVG3582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_AVG3603 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_AVG3615 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_AVG3636 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CEP_AVG3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_SUM_in_entryRuleDSL_CEP_SUM3684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_SUM3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDSL_CEP_SUM3731 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CEP_SUM3743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_SUM3764 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_SUM3776 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_SUM3797 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CEP_SUM3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_COUNT_in_entryRuleDSL_CEP_COUNT3845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_COUNT3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDSL_CEP_COUNT3892 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_CEP_COUNT3904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_REF_CONDITION_in_ruleDSL_CEP_COUNT3925 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDSL_CEP_COUNT3937 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_ruleDSL_CEP_COUNT3958 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_CEP_COUNT3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_in_entryRuleDSL_CEP_DURATION4006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_DURATION4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_MIN_in_ruleDSL_CEP_DURATION4063 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_SEC_in_ruleDSL_CEP_DURATION4082 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_MIN_in_entryRuleDSL_CEP_DURATION_MIN4121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_DURATION_MIN4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleDSL_CEP_DURATION_MIN4177 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleDSL_CEP_DURATION_MIN4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_CEP_DURATION_SEC_in_entryRuleDSL_CEP_DURATION_SEC4225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_CEP_DURATION_SEC4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleDSL_CEP_DURATION_SEC4281 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDSL_CEP_DURATION_SEC4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_ListActions_in_entryRuleDSL_ListActions4329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_ListActions4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_ResourceAction_in_ruleDSL_ListActions4385 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleDSL_ListActions4398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDSL_ResourceAction_in_ruleDSL_ListActions4419 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleDSL_ResourceAction_in_entryRuleDSL_ResourceAction4457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_ResourceAction4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_ResourceAction4510 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDSL_ResourceAction4527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_ResourceAction4549 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDSL_ResourceAction4561 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleDSL_ResourceAction4581 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_47_in_ruleDSL_ResourceAction4610 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDSL_ResourceAction4638 = new BitSet(new long[]{0x20000000001800F0L});
    public static final BitSet FOLLOW_ruleDSL_ListParam_in_ruleDSL_ResourceAction4659 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_ResourceAction4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_ListParam_in_entryRuleDSL_ListParam4708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_ListParam4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_ListParam4764 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleDSL_ListParam4777 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_ListParam4798 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Or_in_entryRuleDSL_Expression_Or4836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_Expression_Or4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_And_in_ruleDSL_Expression_Or4893 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDSL_Expression_Or4905 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_And_in_ruleDSL_Expression_Or4935 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_And_in_entryRuleDSL_Expression_And4973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_Expression_And4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_DiffEqual_in_ruleDSL_Expression_And5030 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDSL_Expression_And5042 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_DiffEqual_in_ruleDSL_Expression_And5072 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_DiffEqual_in_entryRuleDSL_Expression_DiffEqual5110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_Expression_DiffEqual5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Compare_in_ruleDSL_Expression_DiffEqual5167 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDSL_Expression_DiffEqual5180 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Compare_in_ruleDSL_Expression_DiffEqual5210 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDSL_Expression_DiffEqual5230 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Compare_in_ruleDSL_Expression_DiffEqual5260 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Compare_in_entryRuleDSL_Expression_Compare5299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_Expression_Compare5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5356 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDSL_Expression_Compare5369 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5399 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDSL_Expression_Compare5419 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5449 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDSL_Expression_Compare5469 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5499 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDSL_Expression_Compare5519 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_PlusMinus_in_ruleDSL_Expression_Compare5549 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_PlusMinus_in_entryRuleDSL_Expression_PlusMinus5588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_Expression_PlusMinus5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_MultiplicationDivision_in_ruleDSL_Expression_PlusMinus5645 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDSL_Expression_PlusMinus5658 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_MultiplicationDivision_in_ruleDSL_Expression_PlusMinus5688 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDSL_Expression_PlusMinus5708 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_MultiplicationDivision_in_ruleDSL_Expression_PlusMinus5738 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_MultiplicationDivision_in_entryRuleDSL_Expression_MultiplicationDivision5777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_Expression_MultiplicationDivision5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_MultiplicationDivision5834 = new BitSet(new long[]{0x0C00000004000002L});
    public static final BitSet FOLLOW_58_in_ruleDSL_Expression_MultiplicationDivision5847 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_MultiplicationDivision5877 = new BitSet(new long[]{0x0C00000004000002L});
    public static final BitSet FOLLOW_26_in_ruleDSL_Expression_MultiplicationDivision5897 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_MultiplicationDivision5927 = new BitSet(new long[]{0x0C00000004000002L});
    public static final BitSet FOLLOW_59_in_ruleDSL_Expression_MultiplicationDivision5947 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_MultiplicationDivision5977 = new BitSet(new long[]{0x0C00000004000002L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Unary_in_entryRuleDSL_Expression_Unary6016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDSL_Expression_Unary6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleDSL_Expression_Unary6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDSL_Expression_Unary6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleDSL_Expression_Unary6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDSL_Expression_Unary6197 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleDSL_Expression_Unary6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDSL_Expression_Unary6229 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Or_in_ruleDSL_Expression_Unary6251 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDSL_Expression_Unary6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDSL_Expression_Unary6282 = new BitSet(new long[]{0x20000000000800F0L});
    public static final BitSet FOLLOW_ruleDSL_Expression_Unary_in_ruleDSL_Expression_Unary6312 = new BitSet(new long[]{0x0000000000000002L});

}