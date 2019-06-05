package edu.kit.ipd.are.dsexplore.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.kit.ipd.are.dsexplore.services.FcDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFcDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'multiple'", "'BehaviourInclusion'", "'{'", "'description'", "'pointCut'", "','", "'}'", "'featureCompletion'", "'advice'", "'PointCut'", "'placementStrategy'", "'Advice'", "'appears'", "'placementPolicy'", "'('", "')'", "'optional'", "'import'", "'PlacementStrategy'", "'ExternalCallPlacementStrategy'", "'matchingSignature'", "'InternalActionPlacementStrategy'", "'forAllInternalActionsIn'", "'ControlFlowPlacementStrategy'", "'forAllControlFlowsIn'", "'BEFORE'", "'AFTER'", "'AROUND'", "'MANDATORY'", "'OPTIONAL'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFcDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFcDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFcDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFcDsl.g"; }



     	private FcDslGrammarAccess grammarAccess;

        public InternalFcDslParser(TokenStream input, FcDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BehaviourInclusion";
       	}

       	@Override
       	protected FcDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBehaviourInclusion"
    // InternalFcDsl.g:65:1: entryRuleBehaviourInclusion returns [EObject current=null] : iv_ruleBehaviourInclusion= ruleBehaviourInclusion EOF ;
    public final EObject entryRuleBehaviourInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourInclusion = null;


        try {
            // InternalFcDsl.g:65:59: (iv_ruleBehaviourInclusion= ruleBehaviourInclusion EOF )
            // InternalFcDsl.g:66:2: iv_ruleBehaviourInclusion= ruleBehaviourInclusion EOF
            {
             newCompositeNode(grammarAccess.getBehaviourInclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourInclusion=ruleBehaviourInclusion();

            state._fsp--;

             current =iv_ruleBehaviourInclusion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBehaviourInclusion"


    // $ANTLR start "ruleBehaviourInclusion"
    // InternalFcDsl.g:72:1: ruleBehaviourInclusion returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'BehaviourInclusion' ( (lv_name_3_0= ruleEString ) ) ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? otherlv_14= 'featureCompletion' ( (lv_featureCompletion_15_0= ruleFeatureSelection ) ) (otherlv_16= 'advice' otherlv_17= '{' ( (lv_advice_18_0= ruleAdvice ) ) (otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleBehaviourInclusion() throws RecognitionException {
        EObject current = null;

        Token lv_multiple_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_pointCut_10_0 = null;

        EObject lv_pointCut_12_0 = null;

        EObject lv_featureCompletion_15_0 = null;

        EObject lv_advice_18_0 = null;

        EObject lv_advice_20_0 = null;



        	enterRule();

        try {
            // InternalFcDsl.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'BehaviourInclusion' ( (lv_name_3_0= ruleEString ) ) ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? otherlv_14= 'featureCompletion' ( (lv_featureCompletion_15_0= ruleFeatureSelection ) ) (otherlv_16= 'advice' otherlv_17= '{' ( (lv_advice_18_0= ruleAdvice ) ) (otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalFcDsl.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'BehaviourInclusion' ( (lv_name_3_0= ruleEString ) ) ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? otherlv_14= 'featureCompletion' ( (lv_featureCompletion_15_0= ruleFeatureSelection ) ) (otherlv_16= 'advice' otherlv_17= '{' ( (lv_advice_18_0= ruleAdvice ) ) (otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalFcDsl.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'BehaviourInclusion' ( (lv_name_3_0= ruleEString ) ) ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? otherlv_14= 'featureCompletion' ( (lv_featureCompletion_15_0= ruleFeatureSelection ) ) (otherlv_16= 'advice' otherlv_17= '{' ( (lv_advice_18_0= ruleAdvice ) ) (otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalFcDsl.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_multiple_1_0= 'multiple' ) )? otherlv_2= 'BehaviourInclusion' ( (lv_name_3_0= ruleEString ) ) ( (lv_id_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )? otherlv_14= 'featureCompletion' ( (lv_featureCompletion_15_0= ruleFeatureSelection ) ) (otherlv_16= 'advice' otherlv_17= '{' ( (lv_advice_18_0= ruleAdvice ) ) (otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalFcDsl.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFcDsl.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalFcDsl.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalFcDsl.g:82:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"edu.kit.ipd.are.dsexplore.FcDsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFcDsl.g:99:3: ( (lv_multiple_1_0= 'multiple' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFcDsl.g:100:4: (lv_multiple_1_0= 'multiple' )
                    {
                    // InternalFcDsl.g:100:4: (lv_multiple_1_0= 'multiple' )
                    // InternalFcDsl.g:101:5: lv_multiple_1_0= 'multiple'
                    {
                    lv_multiple_1_0=(Token)match(input,11,FOLLOW_4); 

                    					newLeafNode(lv_multiple_1_0, grammarAccess.getBehaviourInclusionAccess().getMultipleMultipleKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBehaviourInclusionRule());
                    					}
                    					setWithLastConsumed(current, "multiple", true, "multiple");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourInclusionAccess().getBehaviourInclusionKeyword_2());
            		
            // InternalFcDsl.g:117:3: ( (lv_name_3_0= ruleEString ) )
            // InternalFcDsl.g:118:4: (lv_name_3_0= ruleEString )
            {
            // InternalFcDsl.g:118:4: (lv_name_3_0= ruleEString )
            // InternalFcDsl.g:119:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFcDsl.g:136:3: ( (lv_id_4_0= ruleEString ) )
            // InternalFcDsl.g:137:4: (lv_id_4_0= ruleEString )
            {
            // InternalFcDsl.g:137:4: (lv_id_4_0= ruleEString )
            // InternalFcDsl.g:138:5: lv_id_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getIdEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_id_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_4_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getBehaviourInclusionAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getBehaviourInclusionAccess().getDescriptionKeyword_6());
            		
            // InternalFcDsl.g:163:3: ( (lv_description_7_0= ruleEString ) )
            // InternalFcDsl.g:164:4: (lv_description_7_0= ruleEString )
            {
            // InternalFcDsl.g:164:4: (lv_description_7_0= ruleEString )
            // InternalFcDsl.g:165:5: lv_description_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getDescriptionEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_description_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_7_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFcDsl.g:182:3: (otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFcDsl.g:183:4: otherlv_8= 'pointCut' otherlv_9= '{' ( (lv_pointCut_10_0= rulePointCut ) ) (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourInclusionAccess().getPointCutKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviourInclusionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalFcDsl.g:191:4: ( (lv_pointCut_10_0= rulePointCut ) )
                    // InternalFcDsl.g:192:5: (lv_pointCut_10_0= rulePointCut )
                    {
                    // InternalFcDsl.g:192:5: (lv_pointCut_10_0= rulePointCut )
                    // InternalFcDsl.g:193:6: lv_pointCut_10_0= rulePointCut
                    {

                    						newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getPointCutPointCutParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_pointCut_10_0=rulePointCut();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
                    						}
                    						add(
                    							current,
                    							"pointCut",
                    							lv_pointCut_10_0,
                    							"edu.kit.ipd.are.dsexplore.FcDsl.PointCut");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFcDsl.g:210:4: (otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalFcDsl.g:211:5: otherlv_11= ',' ( (lv_pointCut_12_0= rulePointCut ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBehaviourInclusionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalFcDsl.g:215:5: ( (lv_pointCut_12_0= rulePointCut ) )
                    	    // InternalFcDsl.g:216:6: (lv_pointCut_12_0= rulePointCut )
                    	    {
                    	    // InternalFcDsl.g:216:6: (lv_pointCut_12_0= rulePointCut )
                    	    // InternalFcDsl.g:217:7: lv_pointCut_12_0= rulePointCut
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getPointCutPointCutParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_pointCut_12_0=rulePointCut();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pointCut",
                    	    								lv_pointCut_12_0,
                    	    								"edu.kit.ipd.are.dsexplore.FcDsl.PointCut");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getBehaviourInclusionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getBehaviourInclusionAccess().getFeatureCompletionKeyword_9());
            		
            // InternalFcDsl.g:244:3: ( (lv_featureCompletion_15_0= ruleFeatureSelection ) )
            // InternalFcDsl.g:245:4: (lv_featureCompletion_15_0= ruleFeatureSelection )
            {
            // InternalFcDsl.g:245:4: (lv_featureCompletion_15_0= ruleFeatureSelection )
            // InternalFcDsl.g:246:5: lv_featureCompletion_15_0= ruleFeatureSelection
            {

            					newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getFeatureCompletionFeatureSelectionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_12);
            lv_featureCompletion_15_0=ruleFeatureSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
            					}
            					set(
            						current,
            						"featureCompletion",
            						lv_featureCompletion_15_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.FeatureSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFcDsl.g:263:3: (otherlv_16= 'advice' otherlv_17= '{' ( (lv_advice_18_0= ruleAdvice ) ) (otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFcDsl.g:264:4: otherlv_16= 'advice' otherlv_17= '{' ( (lv_advice_18_0= ruleAdvice ) ) (otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getBehaviourInclusionAccess().getAdviceKeyword_11_0());
                    			
                    otherlv_17=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getBehaviourInclusionAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalFcDsl.g:272:4: ( (lv_advice_18_0= ruleAdvice ) )
                    // InternalFcDsl.g:273:5: (lv_advice_18_0= ruleAdvice )
                    {
                    // InternalFcDsl.g:273:5: (lv_advice_18_0= ruleAdvice )
                    // InternalFcDsl.g:274:6: lv_advice_18_0= ruleAdvice
                    {

                    						newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getAdviceAdviceParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_advice_18_0=ruleAdvice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
                    						}
                    						add(
                    							current,
                    							"advice",
                    							lv_advice_18_0,
                    							"edu.kit.ipd.are.dsexplore.FcDsl.Advice");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFcDsl.g:291:4: (otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalFcDsl.g:292:5: otherlv_19= ',' ( (lv_advice_20_0= ruleAdvice ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getBehaviourInclusionAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalFcDsl.g:296:5: ( (lv_advice_20_0= ruleAdvice ) )
                    	    // InternalFcDsl.g:297:6: (lv_advice_20_0= ruleAdvice )
                    	    {
                    	    // InternalFcDsl.g:297:6: (lv_advice_20_0= ruleAdvice )
                    	    // InternalFcDsl.g:298:7: lv_advice_20_0= ruleAdvice
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourInclusionAccess().getAdviceAdviceParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_advice_20_0=ruleAdvice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourInclusionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"advice",
                    	    								lv_advice_20_0,
                    	    								"edu.kit.ipd.are.dsexplore.FcDsl.Advice");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getBehaviourInclusionAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getBehaviourInclusionAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleBehaviourInclusion"


    // $ANTLR start "entryRulePlacementStrategy"
    // InternalFcDsl.g:329:1: entryRulePlacementStrategy returns [EObject current=null] : iv_rulePlacementStrategy= rulePlacementStrategy EOF ;
    public final EObject entryRulePlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacementStrategy = null;


        try {
            // InternalFcDsl.g:329:58: (iv_rulePlacementStrategy= rulePlacementStrategy EOF )
            // InternalFcDsl.g:330:2: iv_rulePlacementStrategy= rulePlacementStrategy EOF
            {
             newCompositeNode(grammarAccess.getPlacementStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlacementStrategy=rulePlacementStrategy();

            state._fsp--;

             current =iv_rulePlacementStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlacementStrategy"


    // $ANTLR start "rulePlacementStrategy"
    // InternalFcDsl.g:336:1: rulePlacementStrategy returns [EObject current=null] : (this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl | this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy | this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy | this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy ) ;
    public final EObject rulePlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_PlacementStrategy_Impl_0 = null;

        EObject this_ExternalCallPlacementStrategy_1 = null;

        EObject this_InternalActionPlacementStrategy_2 = null;

        EObject this_ControlFlowPlacementStrategy_3 = null;



        	enterRule();

        try {
            // InternalFcDsl.g:342:2: ( (this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl | this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy | this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy | this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy ) )
            // InternalFcDsl.g:343:2: (this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl | this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy | this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy | this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy )
            {
            // InternalFcDsl.g:343:2: (this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl | this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy | this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy | this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 34:
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
                    // InternalFcDsl.g:344:3: this_PlacementStrategy_Impl_0= rulePlacementStrategy_Impl
                    {

                    			newCompositeNode(grammarAccess.getPlacementStrategyAccess().getPlacementStrategy_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlacementStrategy_Impl_0=rulePlacementStrategy_Impl();

                    state._fsp--;


                    			current = this_PlacementStrategy_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFcDsl.g:353:3: this_ExternalCallPlacementStrategy_1= ruleExternalCallPlacementStrategy
                    {

                    			newCompositeNode(grammarAccess.getPlacementStrategyAccess().getExternalCallPlacementStrategyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCallPlacementStrategy_1=ruleExternalCallPlacementStrategy();

                    state._fsp--;


                    			current = this_ExternalCallPlacementStrategy_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFcDsl.g:362:3: this_InternalActionPlacementStrategy_2= ruleInternalActionPlacementStrategy
                    {

                    			newCompositeNode(grammarAccess.getPlacementStrategyAccess().getInternalActionPlacementStrategyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalActionPlacementStrategy_2=ruleInternalActionPlacementStrategy();

                    state._fsp--;


                    			current = this_InternalActionPlacementStrategy_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFcDsl.g:371:3: this_ControlFlowPlacementStrategy_3= ruleControlFlowPlacementStrategy
                    {

                    			newCompositeNode(grammarAccess.getPlacementStrategyAccess().getControlFlowPlacementStrategyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ControlFlowPlacementStrategy_3=ruleControlFlowPlacementStrategy();

                    state._fsp--;


                    			current = this_ControlFlowPlacementStrategy_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePlacementStrategy"


    // $ANTLR start "entryRuleEString"
    // InternalFcDsl.g:383:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFcDsl.g:383:47: (iv_ruleEString= ruleEString EOF )
            // InternalFcDsl.g:384:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFcDsl.g:390:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFcDsl.g:396:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFcDsl.g:397:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFcDsl.g:397:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFcDsl.g:398:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFcDsl.g:406:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePointCut"
    // InternalFcDsl.g:417:1: entryRulePointCut returns [EObject current=null] : iv_rulePointCut= rulePointCut EOF ;
    public final EObject entryRulePointCut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointCut = null;


        try {
            // InternalFcDsl.g:417:49: (iv_rulePointCut= rulePointCut EOF )
            // InternalFcDsl.g:418:2: iv_rulePointCut= rulePointCut EOF
            {
             newCompositeNode(grammarAccess.getPointCutRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointCut=rulePointCut();

            state._fsp--;

             current =iv_rulePointCut; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePointCut"


    // $ANTLR start "rulePointCut"
    // InternalFcDsl.g:424:1: rulePointCut returns [EObject current=null] : ( () otherlv_1= 'PointCut' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}' ) ;
    public final EObject rulePointCut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_placementStrategy_5_0 = null;



        	enterRule();

        try {
            // InternalFcDsl.g:430:2: ( ( () otherlv_1= 'PointCut' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}' ) )
            // InternalFcDsl.g:431:2: ( () otherlv_1= 'PointCut' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}' )
            {
            // InternalFcDsl.g:431:2: ( () otherlv_1= 'PointCut' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}' )
            // InternalFcDsl.g:432:3: () otherlv_1= 'PointCut' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )? otherlv_6= '}'
            {
            // InternalFcDsl.g:432:3: ()
            // InternalFcDsl.g:433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointCutAccess().getPointCutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPointCutAccess().getPointCutKeyword_1());
            		
            // InternalFcDsl.g:443:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFcDsl.g:444:4: (lv_name_2_0= ruleEString )
            {
            // InternalFcDsl.g:444:4: (lv_name_2_0= ruleEString )
            // InternalFcDsl.g:445:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPointCutAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointCutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getPointCutAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFcDsl.g:466:3: (otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFcDsl.g:467:4: otherlv_4= 'placementStrategy' ( (lv_placementStrategy_5_0= rulePlacementStrategy ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getPointCutAccess().getPlacementStrategyKeyword_4_0());
                    			
                    // InternalFcDsl.g:471:4: ( (lv_placementStrategy_5_0= rulePlacementStrategy ) )
                    // InternalFcDsl.g:472:5: (lv_placementStrategy_5_0= rulePlacementStrategy )
                    {
                    // InternalFcDsl.g:472:5: (lv_placementStrategy_5_0= rulePlacementStrategy )
                    // InternalFcDsl.g:473:6: lv_placementStrategy_5_0= rulePlacementStrategy
                    {

                    						newCompositeNode(grammarAccess.getPointCutAccess().getPlacementStrategyPlacementStrategyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_placementStrategy_5_0=rulePlacementStrategy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointCutRule());
                    						}
                    						set(
                    							current,
                    							"placementStrategy",
                    							lv_placementStrategy_5_0,
                    							"edu.kit.ipd.are.dsexplore.FcDsl.PlacementStrategy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPointCutAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePointCut"


    // $ANTLR start "entryRuleAdvice"
    // InternalFcDsl.g:499:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // InternalFcDsl.g:499:47: (iv_ruleAdvice= ruleAdvice EOF )
            // InternalFcDsl.g:500:2: iv_ruleAdvice= ruleAdvice EOF
            {
             newCompositeNode(grammarAccess.getAdviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdvice=ruleAdvice();

            state._fsp--;

             current =iv_ruleAdvice; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // InternalFcDsl.g:506:1: ruleAdvice returns [EObject current=null] : (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'appears' ( (lv_appears_3_0= ruleAppearance ) ) (otherlv_4= 'pointCut' ( ( ruleEString ) ) )? otherlv_6= 'placementPolicy' ( (lv_placementPolicy_7_0= rulePlacementPolicy ) ) otherlv_8= '}' ) ;
    public final EObject ruleAdvice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_appears_3_0 = null;

        Enumerator lv_placementPolicy_7_0 = null;



        	enterRule();

        try {
            // InternalFcDsl.g:512:2: ( (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'appears' ( (lv_appears_3_0= ruleAppearance ) ) (otherlv_4= 'pointCut' ( ( ruleEString ) ) )? otherlv_6= 'placementPolicy' ( (lv_placementPolicy_7_0= rulePlacementPolicy ) ) otherlv_8= '}' ) )
            // InternalFcDsl.g:513:2: (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'appears' ( (lv_appears_3_0= ruleAppearance ) ) (otherlv_4= 'pointCut' ( ( ruleEString ) ) )? otherlv_6= 'placementPolicy' ( (lv_placementPolicy_7_0= rulePlacementPolicy ) ) otherlv_8= '}' )
            {
            // InternalFcDsl.g:513:2: (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'appears' ( (lv_appears_3_0= ruleAppearance ) ) (otherlv_4= 'pointCut' ( ( ruleEString ) ) )? otherlv_6= 'placementPolicy' ( (lv_placementPolicy_7_0= rulePlacementPolicy ) ) otherlv_8= '}' )
            // InternalFcDsl.g:514:3: otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'appears' ( (lv_appears_3_0= ruleAppearance ) ) (otherlv_4= 'pointCut' ( ( ruleEString ) ) )? otherlv_6= 'placementPolicy' ( (lv_placementPolicy_7_0= rulePlacementPolicy ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAdviceAccess().getAdviceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAdviceAccess().getAppearsKeyword_2());
            		
            // InternalFcDsl.g:526:3: ( (lv_appears_3_0= ruleAppearance ) )
            // InternalFcDsl.g:527:4: (lv_appears_3_0= ruleAppearance )
            {
            // InternalFcDsl.g:527:4: (lv_appears_3_0= ruleAppearance )
            // InternalFcDsl.g:528:5: lv_appears_3_0= ruleAppearance
            {

            					newCompositeNode(grammarAccess.getAdviceAccess().getAppearsAppearanceEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_appears_3_0=ruleAppearance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdviceRule());
            					}
            					set(
            						current,
            						"appears",
            						lv_appears_3_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.Appearance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFcDsl.g:545:3: (otherlv_4= 'pointCut' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFcDsl.g:546:4: otherlv_4= 'pointCut' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAdviceAccess().getPointCutKeyword_4_0());
                    			
                    // InternalFcDsl.g:550:4: ( ( ruleEString ) )
                    // InternalFcDsl.g:551:5: ( ruleEString )
                    {
                    // InternalFcDsl.g:551:5: ( ruleEString )
                    // InternalFcDsl.g:552:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdviceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAdviceAccess().getPointCutPointCutCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getAdviceAccess().getPlacementPolicyKeyword_5());
            		
            // InternalFcDsl.g:571:3: ( (lv_placementPolicy_7_0= rulePlacementPolicy ) )
            // InternalFcDsl.g:572:4: (lv_placementPolicy_7_0= rulePlacementPolicy )
            {
            // InternalFcDsl.g:572:4: (lv_placementPolicy_7_0= rulePlacementPolicy )
            // InternalFcDsl.g:573:5: lv_placementPolicy_7_0= rulePlacementPolicy
            {

            					newCompositeNode(grammarAccess.getAdviceAccess().getPlacementPolicyPlacementPolicyEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_placementPolicy_7_0=rulePlacementPolicy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdviceRule());
            					}
            					set(
            						current,
            						"placementPolicy",
            						lv_placementPolicy_7_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.PlacementPolicy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAdviceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAdvice"


    // $ANTLR start "entryRuleFeatureSelection"
    // InternalFcDsl.g:598:1: entryRuleFeatureSelection returns [EObject current=null] : iv_ruleFeatureSelection= ruleFeatureSelection EOF ;
    public final EObject entryRuleFeatureSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureSelection = null;


        try {
            // InternalFcDsl.g:598:57: (iv_ruleFeatureSelection= ruleFeatureSelection EOF )
            // InternalFcDsl.g:599:2: iv_ruleFeatureSelection= ruleFeatureSelection EOF
            {
             newCompositeNode(grammarAccess.getFeatureSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureSelection=ruleFeatureSelection();

            state._fsp--;

             current =iv_ruleFeatureSelection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeatureSelection"


    // $ANTLR start "ruleFeatureSelection"
    // InternalFcDsl.g:605:1: ruleFeatureSelection returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_featureLists_2_0= ruleFeatureList ) ) (otherlv_3= ',' ( (lv_featureLists_4_0= ruleFeatureList ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFeatureSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_featureLists_2_0 = null;

        EObject lv_featureLists_4_0 = null;



        	enterRule();

        try {
            // InternalFcDsl.g:611:2: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_featureLists_2_0= ruleFeatureList ) ) (otherlv_3= ',' ( (lv_featureLists_4_0= ruleFeatureList ) ) )* otherlv_5= ')' ) )
            // InternalFcDsl.g:612:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_featureLists_2_0= ruleFeatureList ) ) (otherlv_3= ',' ( (lv_featureLists_4_0= ruleFeatureList ) ) )* otherlv_5= ')' )
            {
            // InternalFcDsl.g:612:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_featureLists_2_0= ruleFeatureList ) ) (otherlv_3= ',' ( (lv_featureLists_4_0= ruleFeatureList ) ) )* otherlv_5= ')' )
            // InternalFcDsl.g:613:3: ( ( ruleEString ) ) otherlv_1= '(' ( (lv_featureLists_2_0= ruleFeatureList ) ) (otherlv_3= ',' ( (lv_featureLists_4_0= ruleFeatureList ) ) )* otherlv_5= ')'
            {
            // InternalFcDsl.g:613:3: ( ( ruleEString ) )
            // InternalFcDsl.g:614:4: ( ruleEString )
            {
            // InternalFcDsl.g:614:4: ( ruleEString )
            // InternalFcDsl.g:615:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureSelectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFeatureSelectionAccess().getCompletionFeatureCompletionCrossReference_0_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureSelectionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFcDsl.g:633:3: ( (lv_featureLists_2_0= ruleFeatureList ) )
            // InternalFcDsl.g:634:4: (lv_featureLists_2_0= ruleFeatureList )
            {
            // InternalFcDsl.g:634:4: (lv_featureLists_2_0= ruleFeatureList )
            // InternalFcDsl.g:635:5: lv_featureLists_2_0= ruleFeatureList
            {

            					newCompositeNode(grammarAccess.getFeatureSelectionAccess().getFeatureListsFeatureListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_featureLists_2_0=ruleFeatureList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureSelectionRule());
            					}
            					add(
            						current,
            						"featureLists",
            						lv_featureLists_2_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.FeatureList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFcDsl.g:652:3: (otherlv_3= ',' ( (lv_featureLists_4_0= ruleFeatureList ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFcDsl.g:653:4: otherlv_3= ',' ( (lv_featureLists_4_0= ruleFeatureList ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFeatureSelectionAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalFcDsl.g:657:4: ( (lv_featureLists_4_0= ruleFeatureList ) )
            	    // InternalFcDsl.g:658:5: (lv_featureLists_4_0= ruleFeatureList )
            	    {
            	    // InternalFcDsl.g:658:5: (lv_featureLists_4_0= ruleFeatureList )
            	    // InternalFcDsl.g:659:6: lv_featureLists_4_0= ruleFeatureList
            	    {

            	    						newCompositeNode(grammarAccess.getFeatureSelectionAccess().getFeatureListsFeatureListParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_featureLists_4_0=ruleFeatureList();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFeatureSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"featureLists",
            	    							lv_featureLists_4_0,
            	    							"edu.kit.ipd.are.dsexplore.FcDsl.FeatureList");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFeatureSelectionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFeatureSelection"


    // $ANTLR start "entryRuleFeatureList"
    // InternalFcDsl.g:685:1: entryRuleFeatureList returns [EObject current=null] : iv_ruleFeatureList= ruleFeatureList EOF ;
    public final EObject entryRuleFeatureList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureList = null;


        try {
            // InternalFcDsl.g:685:52: (iv_ruleFeatureList= ruleFeatureList EOF )
            // InternalFcDsl.g:686:2: iv_ruleFeatureList= ruleFeatureList EOF
            {
             newCompositeNode(grammarAccess.getFeatureListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureList=ruleFeatureList();

            state._fsp--;

             current =iv_ruleFeatureList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeatureList"


    // $ANTLR start "ruleFeatureList"
    // InternalFcDsl.g:692:1: ruleFeatureList returns [EObject current=null] : (otherlv_0= '{' ( (lv_features_1_0= ruleSelectedCV ) ) (otherlv_2= ',' ( (lv_features_3_0= ruleSelectedCV ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleFeatureList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_1_0 = null;

        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalFcDsl.g:698:2: ( (otherlv_0= '{' ( (lv_features_1_0= ruleSelectedCV ) ) (otherlv_2= ',' ( (lv_features_3_0= ruleSelectedCV ) ) )* otherlv_4= '}' ) )
            // InternalFcDsl.g:699:2: (otherlv_0= '{' ( (lv_features_1_0= ruleSelectedCV ) ) (otherlv_2= ',' ( (lv_features_3_0= ruleSelectedCV ) ) )* otherlv_4= '}' )
            {
            // InternalFcDsl.g:699:2: (otherlv_0= '{' ( (lv_features_1_0= ruleSelectedCV ) ) (otherlv_2= ',' ( (lv_features_3_0= ruleSelectedCV ) ) )* otherlv_4= '}' )
            // InternalFcDsl.g:700:3: otherlv_0= '{' ( (lv_features_1_0= ruleSelectedCV ) ) (otherlv_2= ',' ( (lv_features_3_0= ruleSelectedCV ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalFcDsl.g:704:3: ( (lv_features_1_0= ruleSelectedCV ) )
            // InternalFcDsl.g:705:4: (lv_features_1_0= ruleSelectedCV )
            {
            // InternalFcDsl.g:705:4: (lv_features_1_0= ruleSelectedCV )
            // InternalFcDsl.g:706:5: lv_features_1_0= ruleSelectedCV
            {

            					newCompositeNode(grammarAccess.getFeatureListAccess().getFeaturesSelectedCVParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_features_1_0=ruleSelectedCV();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureListRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_1_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.SelectedCV");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFcDsl.g:723:3: (otherlv_2= ',' ( (lv_features_3_0= ruleSelectedCV ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFcDsl.g:724:4: otherlv_2= ',' ( (lv_features_3_0= ruleSelectedCV ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFeatureListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFcDsl.g:728:4: ( (lv_features_3_0= ruleSelectedCV ) )
            	    // InternalFcDsl.g:729:5: (lv_features_3_0= ruleSelectedCV )
            	    {
            	    // InternalFcDsl.g:729:5: (lv_features_3_0= ruleSelectedCV )
            	    // InternalFcDsl.g:730:6: lv_features_3_0= ruleSelectedCV
            	    {

            	    						newCompositeNode(grammarAccess.getFeatureListAccess().getFeaturesSelectedCVParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_features_3_0=ruleSelectedCV();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFeatureListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"features",
            	    							lv_features_3_0,
            	    							"edu.kit.ipd.are.dsexplore.FcDsl.SelectedCV");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFeatureListAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleFeatureList"


    // $ANTLR start "entryRuleSelectedCV"
    // InternalFcDsl.g:756:1: entryRuleSelectedCV returns [EObject current=null] : iv_ruleSelectedCV= ruleSelectedCV EOF ;
    public final EObject entryRuleSelectedCV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedCV = null;


        try {
            // InternalFcDsl.g:756:51: (iv_ruleSelectedCV= ruleSelectedCV EOF )
            // InternalFcDsl.g:757:2: iv_ruleSelectedCV= ruleSelectedCV EOF
            {
             newCompositeNode(grammarAccess.getSelectedCVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectedCV=ruleSelectedCV();

            state._fsp--;

             current =iv_ruleSelectedCV; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectedCV"


    // $ANTLR start "ruleSelectedCV"
    // InternalFcDsl.g:763:1: ruleSelectedCV returns [EObject current=null] : ( ( (lv_optional_0_0= 'optional' ) )? ( ( ruleEString ) ) ) ;
    public final EObject ruleSelectedCV() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;


        	enterRule();

        try {
            // InternalFcDsl.g:769:2: ( ( ( (lv_optional_0_0= 'optional' ) )? ( ( ruleEString ) ) ) )
            // InternalFcDsl.g:770:2: ( ( (lv_optional_0_0= 'optional' ) )? ( ( ruleEString ) ) )
            {
            // InternalFcDsl.g:770:2: ( ( (lv_optional_0_0= 'optional' ) )? ( ( ruleEString ) ) )
            // InternalFcDsl.g:771:3: ( (lv_optional_0_0= 'optional' ) )? ( ( ruleEString ) )
            {
            // InternalFcDsl.g:771:3: ( (lv_optional_0_0= 'optional' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFcDsl.g:772:4: (lv_optional_0_0= 'optional' )
                    {
                    // InternalFcDsl.g:772:4: (lv_optional_0_0= 'optional' )
                    // InternalFcDsl.g:773:5: lv_optional_0_0= 'optional'
                    {
                    lv_optional_0_0=(Token)match(input,27,FOLLOW_5); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getSelectedCVAccess().getOptionalOptionalKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSelectedCVRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "optional");
                    				

                    }


                    }
                    break;

            }

            // InternalFcDsl.g:785:3: ( ( ruleEString ) )
            // InternalFcDsl.g:786:4: ( ruleEString )
            {
            // InternalFcDsl.g:786:4: ( ruleEString )
            // InternalFcDsl.g:787:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectedCVRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSelectedCVAccess().getComplementumVisnetisComplementumVisnetisCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleSelectedCV"


    // $ANTLR start "entryRuleImport"
    // InternalFcDsl.g:805:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalFcDsl.g:805:47: (iv_ruleImport= ruleImport EOF )
            // InternalFcDsl.g:806:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalFcDsl.g:812:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importURI_1_0 = null;



        	enterRule();

        try {
            // InternalFcDsl.g:818:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) ) )
            // InternalFcDsl.g:819:2: (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) )
            {
            // InternalFcDsl.g:819:2: (otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) ) )
            // InternalFcDsl.g:820:3: otherlv_0= 'import' ( (lv_importURI_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalFcDsl.g:824:3: ( (lv_importURI_1_0= ruleEString ) )
            // InternalFcDsl.g:825:4: (lv_importURI_1_0= ruleEString )
            {
            // InternalFcDsl.g:825:4: (lv_importURI_1_0= ruleEString )
            // InternalFcDsl.g:826:5: lv_importURI_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportURIEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importURI_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"edu.kit.ipd.are.dsexplore.FcDsl.EString");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePlacementStrategy_Impl"
    // InternalFcDsl.g:847:1: entryRulePlacementStrategy_Impl returns [EObject current=null] : iv_rulePlacementStrategy_Impl= rulePlacementStrategy_Impl EOF ;
    public final EObject entryRulePlacementStrategy_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacementStrategy_Impl = null;


        try {
            // InternalFcDsl.g:847:63: (iv_rulePlacementStrategy_Impl= rulePlacementStrategy_Impl EOF )
            // InternalFcDsl.g:848:2: iv_rulePlacementStrategy_Impl= rulePlacementStrategy_Impl EOF
            {
             newCompositeNode(grammarAccess.getPlacementStrategy_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlacementStrategy_Impl=rulePlacementStrategy_Impl();

            state._fsp--;

             current =iv_rulePlacementStrategy_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlacementStrategy_Impl"


    // $ANTLR start "rulePlacementStrategy_Impl"
    // InternalFcDsl.g:854:1: rulePlacementStrategy_Impl returns [EObject current=null] : ( () otherlv_1= 'PlacementStrategy' ) ;
    public final EObject rulePlacementStrategy_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFcDsl.g:860:2: ( ( () otherlv_1= 'PlacementStrategy' ) )
            // InternalFcDsl.g:861:2: ( () otherlv_1= 'PlacementStrategy' )
            {
            // InternalFcDsl.g:861:2: ( () otherlv_1= 'PlacementStrategy' )
            // InternalFcDsl.g:862:3: () otherlv_1= 'PlacementStrategy'
            {
            // InternalFcDsl.g:862:3: ()
            // InternalFcDsl.g:863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlacementStrategy_ImplAccess().getPlacementStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPlacementStrategy_ImplAccess().getPlacementStrategyKeyword_1());
            		

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
    // $ANTLR end "rulePlacementStrategy_Impl"


    // $ANTLR start "entryRuleExternalCallPlacementStrategy"
    // InternalFcDsl.g:877:1: entryRuleExternalCallPlacementStrategy returns [EObject current=null] : iv_ruleExternalCallPlacementStrategy= ruleExternalCallPlacementStrategy EOF ;
    public final EObject entryRuleExternalCallPlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCallPlacementStrategy = null;


        try {
            // InternalFcDsl.g:877:70: (iv_ruleExternalCallPlacementStrategy= ruleExternalCallPlacementStrategy EOF )
            // InternalFcDsl.g:878:2: iv_ruleExternalCallPlacementStrategy= ruleExternalCallPlacementStrategy EOF
            {
             newCompositeNode(grammarAccess.getExternalCallPlacementStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCallPlacementStrategy=ruleExternalCallPlacementStrategy();

            state._fsp--;

             current =iv_ruleExternalCallPlacementStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalCallPlacementStrategy"


    // $ANTLR start "ruleExternalCallPlacementStrategy"
    // InternalFcDsl.g:884:1: ruleExternalCallPlacementStrategy returns [EObject current=null] : ( () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleExternalCallPlacementStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFcDsl.g:890:2: ( ( () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalFcDsl.g:891:2: ( () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalFcDsl.g:891:2: ( () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalFcDsl.g:892:3: () otherlv_1= 'ExternalCallPlacementStrategy' otherlv_2= '{' (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalFcDsl.g:892:3: ()
            // InternalFcDsl.g:893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallPlacementStrategyAccess().getExternalCallPlacementStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallPlacementStrategyAccess().getExternalCallPlacementStrategyKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalCallPlacementStrategyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFcDsl.g:907:3: (otherlv_3= 'matchingSignature' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFcDsl.g:908:4: otherlv_3= 'matchingSignature' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getExternalCallPlacementStrategyAccess().getMatchingSignatureKeyword_3_0());
                    			
                    // InternalFcDsl.g:912:4: ( ( ruleEString ) )
                    // InternalFcDsl.g:913:5: ( ruleEString )
                    {
                    // InternalFcDsl.g:913:5: ( ruleEString )
                    // InternalFcDsl.g:914:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalCallPlacementStrategyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExternalCallPlacementStrategyAccess().getMatchingSignatureSignatureCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalCallPlacementStrategyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleExternalCallPlacementStrategy"


    // $ANTLR start "entryRuleInternalActionPlacementStrategy"
    // InternalFcDsl.g:937:1: entryRuleInternalActionPlacementStrategy returns [EObject current=null] : iv_ruleInternalActionPlacementStrategy= ruleInternalActionPlacementStrategy EOF ;
    public final EObject entryRuleInternalActionPlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalActionPlacementStrategy = null;


        try {
            // InternalFcDsl.g:937:72: (iv_ruleInternalActionPlacementStrategy= ruleInternalActionPlacementStrategy EOF )
            // InternalFcDsl.g:938:2: iv_ruleInternalActionPlacementStrategy= ruleInternalActionPlacementStrategy EOF
            {
             newCompositeNode(grammarAccess.getInternalActionPlacementStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalActionPlacementStrategy=ruleInternalActionPlacementStrategy();

            state._fsp--;

             current =iv_ruleInternalActionPlacementStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInternalActionPlacementStrategy"


    // $ANTLR start "ruleInternalActionPlacementStrategy"
    // InternalFcDsl.g:944:1: ruleInternalActionPlacementStrategy returns [EObject current=null] : ( () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleInternalActionPlacementStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFcDsl.g:950:2: ( ( () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalFcDsl.g:951:2: ( () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalFcDsl.g:951:2: ( () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalFcDsl.g:952:3: () otherlv_1= 'InternalActionPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalFcDsl.g:952:3: ()
            // InternalFcDsl.g:953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionPlacementStrategyAccess().getInternalActionPlacementStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionPlacementStrategyAccess().getInternalActionPlacementStrategyKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getInternalActionPlacementStrategyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFcDsl.g:967:3: (otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFcDsl.g:968:4: otherlv_3= 'forAllInternalActionsIn' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getInternalActionPlacementStrategyAccess().getForAllInternalActionsInKeyword_3_0());
                    			
                    // InternalFcDsl.g:972:4: ( ( ruleEString ) )
                    // InternalFcDsl.g:973:5: ( ruleEString )
                    {
                    // InternalFcDsl.g:973:5: ( ruleEString )
                    // InternalFcDsl.g:974:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalActionPlacementStrategyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInternalActionPlacementStrategyAccess().getForAllInternalActionsInRepositoryComponentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInternalActionPlacementStrategyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInternalActionPlacementStrategy"


    // $ANTLR start "entryRuleControlFlowPlacementStrategy"
    // InternalFcDsl.g:997:1: entryRuleControlFlowPlacementStrategy returns [EObject current=null] : iv_ruleControlFlowPlacementStrategy= ruleControlFlowPlacementStrategy EOF ;
    public final EObject entryRuleControlFlowPlacementStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFlowPlacementStrategy = null;


        try {
            // InternalFcDsl.g:997:69: (iv_ruleControlFlowPlacementStrategy= ruleControlFlowPlacementStrategy EOF )
            // InternalFcDsl.g:998:2: iv_ruleControlFlowPlacementStrategy= ruleControlFlowPlacementStrategy EOF
            {
             newCompositeNode(grammarAccess.getControlFlowPlacementStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlFlowPlacementStrategy=ruleControlFlowPlacementStrategy();

            state._fsp--;

             current =iv_ruleControlFlowPlacementStrategy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleControlFlowPlacementStrategy"


    // $ANTLR start "ruleControlFlowPlacementStrategy"
    // InternalFcDsl.g:1004:1: ruleControlFlowPlacementStrategy returns [EObject current=null] : ( () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleControlFlowPlacementStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFcDsl.g:1010:2: ( ( () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalFcDsl.g:1011:2: ( () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalFcDsl.g:1011:2: ( () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalFcDsl.g:1012:3: () otherlv_1= 'ControlFlowPlacementStrategy' otherlv_2= '{' (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalFcDsl.g:1012:3: ()
            // InternalFcDsl.g:1013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getControlFlowPlacementStrategyAccess().getControlFlowPlacementStrategyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getControlFlowPlacementStrategyAccess().getControlFlowPlacementStrategyKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getControlFlowPlacementStrategyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFcDsl.g:1027:3: (otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFcDsl.g:1028:4: otherlv_3= 'forAllControlFlowsIn' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getControlFlowPlacementStrategyAccess().getForAllControlFlowsInKeyword_3_0());
                    			
                    // InternalFcDsl.g:1032:4: ( ( ruleEString ) )
                    // InternalFcDsl.g:1033:5: ( ruleEString )
                    {
                    // InternalFcDsl.g:1033:5: ( ruleEString )
                    // InternalFcDsl.g:1034:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControlFlowPlacementStrategyRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getControlFlowPlacementStrategyAccess().getForAllControlFlowsInRepositoryComponentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getControlFlowPlacementStrategyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleControlFlowPlacementStrategy"


    // $ANTLR start "ruleAppearance"
    // InternalFcDsl.g:1057:1: ruleAppearance returns [Enumerator current=null] : ( (enumLiteral_0= 'BEFORE' ) | (enumLiteral_1= 'AFTER' ) | (enumLiteral_2= 'AROUND' ) ) ;
    public final Enumerator ruleAppearance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFcDsl.g:1063:2: ( ( (enumLiteral_0= 'BEFORE' ) | (enumLiteral_1= 'AFTER' ) | (enumLiteral_2= 'AROUND' ) ) )
            // InternalFcDsl.g:1064:2: ( (enumLiteral_0= 'BEFORE' ) | (enumLiteral_1= 'AFTER' ) | (enumLiteral_2= 'AROUND' ) )
            {
            // InternalFcDsl.g:1064:2: ( (enumLiteral_0= 'BEFORE' ) | (enumLiteral_1= 'AFTER' ) | (enumLiteral_2= 'AROUND' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalFcDsl.g:1065:3: (enumLiteral_0= 'BEFORE' )
                    {
                    // InternalFcDsl.g:1065:3: (enumLiteral_0= 'BEFORE' )
                    // InternalFcDsl.g:1066:4: enumLiteral_0= 'BEFORE'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getAppearanceAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAppearanceAccess().getBEFOREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFcDsl.g:1073:3: (enumLiteral_1= 'AFTER' )
                    {
                    // InternalFcDsl.g:1073:3: (enumLiteral_1= 'AFTER' )
                    // InternalFcDsl.g:1074:4: enumLiteral_1= 'AFTER'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getAppearanceAccess().getAFTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAppearanceAccess().getAFTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFcDsl.g:1081:3: (enumLiteral_2= 'AROUND' )
                    {
                    // InternalFcDsl.g:1081:3: (enumLiteral_2= 'AROUND' )
                    // InternalFcDsl.g:1082:4: enumLiteral_2= 'AROUND'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getAppearanceAccess().getAROUNDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAppearanceAccess().getAROUNDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAppearance"


    // $ANTLR start "rulePlacementPolicy"
    // InternalFcDsl.g:1092:1: rulePlacementPolicy returns [Enumerator current=null] : ( (enumLiteral_0= 'MANDATORY' ) | (enumLiteral_1= 'OPTIONAL' ) ) ;
    public final Enumerator rulePlacementPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFcDsl.g:1098:2: ( ( (enumLiteral_0= 'MANDATORY' ) | (enumLiteral_1= 'OPTIONAL' ) ) )
            // InternalFcDsl.g:1099:2: ( (enumLiteral_0= 'MANDATORY' ) | (enumLiteral_1= 'OPTIONAL' ) )
            {
            // InternalFcDsl.g:1099:2: ( (enumLiteral_0= 'MANDATORY' ) | (enumLiteral_1= 'OPTIONAL' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            else if ( (LA18_0==40) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFcDsl.g:1100:3: (enumLiteral_0= 'MANDATORY' )
                    {
                    // InternalFcDsl.g:1100:3: (enumLiteral_0= 'MANDATORY' )
                    // InternalFcDsl.g:1101:4: enumLiteral_0= 'MANDATORY'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPlacementPolicyAccess().getMANDATORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPlacementPolicyAccess().getMANDATORYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFcDsl.g:1108:3: (enumLiteral_1= 'OPTIONAL' )
                    {
                    // InternalFcDsl.g:1108:3: (enumLiteral_1= 'OPTIONAL' )
                    // InternalFcDsl.g:1109:4: enumLiteral_1= 'OPTIONAL'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPlacementPolicyAccess().getOPTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPlacementPolicyAccess().getOPTIONALEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePlacementPolicy"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000560000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800020000L});

}