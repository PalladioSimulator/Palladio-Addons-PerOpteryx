package org.palladiosimulator.qes.parser.antlr.internal;

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
import org.palladiosimulator.qes.services.QualityEffectSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQualityEffectSpecificationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_STRING", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'For'", "'{'", "'and'", "'}'", "'Do'", "'Component'", "'('", "')'", "'Name'", "'not'", "'Id'", "'Annotation'", "'Type'", "'Role'", "'with'", "'Assembly'", "'Resource'", "'NQA'", "'Reasoning'", "'='", "','", "'Rule'", "'Entry'", "'AnyComponentType'", "'Basic'", "'Composite'", "'AnyRoleType'", "'ComponentRequiredProvided'", "'ComponentRequired'", "'ComponentProvided'", "'InfrastructureRequiredProvided'", "'InfrastructureRequired'", "'InfrastructureProvided'", "'AnyAssembly'", "'Required'", "'Provided'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_NL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalQualityEffectSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQualityEffectSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQualityEffectSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQualityEffectSpecification.g"; }



     	private QualityEffectSpecificationGrammarAccess grammarAccess;

        public InternalQualityEffectSpecificationParser(TokenStream input, QualityEffectSpecificationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected QualityEffectSpecificationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalQualityEffectSpecification.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalQualityEffectSpecification.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalQualityEffectSpecification.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalQualityEffectSpecification.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_specifications_0_0= ruleQualityEffectSpecification ) ) ( (this_NL_1= RULE_NL )+ ( (lv_specifications_2_0= ruleQualityEffectSpecification ) ) )* (this_NL_3= RULE_NL )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_NL_1=null;
        Token this_NL_3=null;
        EObject lv_specifications_0_0 = null;

        EObject lv_specifications_2_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:78:2: ( ( ( (lv_specifications_0_0= ruleQualityEffectSpecification ) ) ( (this_NL_1= RULE_NL )+ ( (lv_specifications_2_0= ruleQualityEffectSpecification ) ) )* (this_NL_3= RULE_NL )+ ) )
            // InternalQualityEffectSpecification.g:79:2: ( ( (lv_specifications_0_0= ruleQualityEffectSpecification ) ) ( (this_NL_1= RULE_NL )+ ( (lv_specifications_2_0= ruleQualityEffectSpecification ) ) )* (this_NL_3= RULE_NL )+ )
            {
            // InternalQualityEffectSpecification.g:79:2: ( ( (lv_specifications_0_0= ruleQualityEffectSpecification ) ) ( (this_NL_1= RULE_NL )+ ( (lv_specifications_2_0= ruleQualityEffectSpecification ) ) )* (this_NL_3= RULE_NL )+ )
            // InternalQualityEffectSpecification.g:80:3: ( (lv_specifications_0_0= ruleQualityEffectSpecification ) ) ( (this_NL_1= RULE_NL )+ ( (lv_specifications_2_0= ruleQualityEffectSpecification ) ) )* (this_NL_3= RULE_NL )+
            {
            // InternalQualityEffectSpecification.g:80:3: ( (lv_specifications_0_0= ruleQualityEffectSpecification ) )
            // InternalQualityEffectSpecification.g:81:4: (lv_specifications_0_0= ruleQualityEffectSpecification )
            {
            // InternalQualityEffectSpecification.g:81:4: (lv_specifications_0_0= ruleQualityEffectSpecification )
            // InternalQualityEffectSpecification.g:82:5: lv_specifications_0_0= ruleQualityEffectSpecification
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSpecificationsQualityEffectSpecificationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_specifications_0_0=ruleQualityEffectSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"specifications",
            						lv_specifications_0_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.QualityEffectSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:99:3: ( (this_NL_1= RULE_NL )+ ( (lv_specifications_2_0= ruleQualityEffectSpecification ) ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:100:4: (this_NL_1= RULE_NL )+ ( (lv_specifications_2_0= ruleQualityEffectSpecification ) )
            	    {
            	    // InternalQualityEffectSpecification.g:100:4: (this_NL_1= RULE_NL )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_NL) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalQualityEffectSpecification.g:101:5: this_NL_1= RULE_NL
            	    	    {
            	    	    this_NL_1=(Token)match(input,RULE_NL,FOLLOW_4); 

            	    	    					newLeafNode(this_NL_1, grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	    // InternalQualityEffectSpecification.g:106:4: ( (lv_specifications_2_0= ruleQualityEffectSpecification ) )
            	    // InternalQualityEffectSpecification.g:107:5: (lv_specifications_2_0= ruleQualityEffectSpecification )
            	    {
            	    // InternalQualityEffectSpecification.g:107:5: (lv_specifications_2_0= ruleQualityEffectSpecification )
            	    // InternalQualityEffectSpecification.g:108:6: lv_specifications_2_0= ruleQualityEffectSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getSpecificationsQualityEffectSpecificationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_specifications_2_0=ruleQualityEffectSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"specifications",
            	    							lv_specifications_2_0,
            	    							"org.palladiosimulator.qes.QualityEffectSpecification.QualityEffectSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalQualityEffectSpecification.g:126:3: (this_NL_3= RULE_NL )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:127:4: this_NL_3= RULE_NL
            	    {
            	    this_NL_3=(Token)match(input,RULE_NL,FOLLOW_5); 

            	    				newLeafNode(this_NL_3, grammarAccess.getModelAccess().getNLTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualityEffectSpecification"
    // InternalQualityEffectSpecification.g:136:1: entryRuleQualityEffectSpecification returns [EObject current=null] : iv_ruleQualityEffectSpecification= ruleQualityEffectSpecification EOF ;
    public final EObject entryRuleQualityEffectSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityEffectSpecification = null;


        try {
            // InternalQualityEffectSpecification.g:136:67: (iv_ruleQualityEffectSpecification= ruleQualityEffectSpecification EOF )
            // InternalQualityEffectSpecification.g:137:2: iv_ruleQualityEffectSpecification= ruleQualityEffectSpecification EOF
            {
             newCompositeNode(grammarAccess.getQualityEffectSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityEffectSpecification=ruleQualityEffectSpecification();

            state._fsp--;

             current =iv_ruleQualityEffectSpecification; 
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
    // $ANTLR end "entryRuleQualityEffectSpecification"


    // $ANTLR start "ruleQualityEffectSpecification"
    // InternalQualityEffectSpecification.g:143:1: ruleQualityEffectSpecification returns [EObject current=null] : (otherlv_0= 'For' otherlv_1= '{' ( (lv_components_2_0= ruleComponentSpecification ) ) (otherlv_3= 'and' ( (lv_components_4_0= ruleComponentSpecification ) ) )* otherlv_5= '}' otherlv_6= 'Do' otherlv_7= '{' ( (lv_transformations_8_0= ruleTransformationSpecification ) ) (otherlv_9= 'and' ( (lv_transformations_10_0= ruleTransformationSpecification ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleQualityEffectSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_components_2_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_transformations_8_0 = null;

        EObject lv_transformations_10_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:149:2: ( (otherlv_0= 'For' otherlv_1= '{' ( (lv_components_2_0= ruleComponentSpecification ) ) (otherlv_3= 'and' ( (lv_components_4_0= ruleComponentSpecification ) ) )* otherlv_5= '}' otherlv_6= 'Do' otherlv_7= '{' ( (lv_transformations_8_0= ruleTransformationSpecification ) ) (otherlv_9= 'and' ( (lv_transformations_10_0= ruleTransformationSpecification ) ) )* otherlv_11= '}' ) )
            // InternalQualityEffectSpecification.g:150:2: (otherlv_0= 'For' otherlv_1= '{' ( (lv_components_2_0= ruleComponentSpecification ) ) (otherlv_3= 'and' ( (lv_components_4_0= ruleComponentSpecification ) ) )* otherlv_5= '}' otherlv_6= 'Do' otherlv_7= '{' ( (lv_transformations_8_0= ruleTransformationSpecification ) ) (otherlv_9= 'and' ( (lv_transformations_10_0= ruleTransformationSpecification ) ) )* otherlv_11= '}' )
            {
            // InternalQualityEffectSpecification.g:150:2: (otherlv_0= 'For' otherlv_1= '{' ( (lv_components_2_0= ruleComponentSpecification ) ) (otherlv_3= 'and' ( (lv_components_4_0= ruleComponentSpecification ) ) )* otherlv_5= '}' otherlv_6= 'Do' otherlv_7= '{' ( (lv_transformations_8_0= ruleTransformationSpecification ) ) (otherlv_9= 'and' ( (lv_transformations_10_0= ruleTransformationSpecification ) ) )* otherlv_11= '}' )
            // InternalQualityEffectSpecification.g:151:3: otherlv_0= 'For' otherlv_1= '{' ( (lv_components_2_0= ruleComponentSpecification ) ) (otherlv_3= 'and' ( (lv_components_4_0= ruleComponentSpecification ) ) )* otherlv_5= '}' otherlv_6= 'Do' otherlv_7= '{' ( (lv_transformations_8_0= ruleTransformationSpecification ) ) (otherlv_9= 'and' ( (lv_transformations_10_0= ruleTransformationSpecification ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getQualityEffectSpecificationAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getQualityEffectSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQualityEffectSpecification.g:159:3: ( (lv_components_2_0= ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:160:4: (lv_components_2_0= ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:160:4: (lv_components_2_0= ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:161:5: lv_components_2_0= ruleComponentSpecification
            {

            					newCompositeNode(grammarAccess.getQualityEffectSpecificationAccess().getComponentsComponentSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_components_2_0=ruleComponentSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityEffectSpecificationRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:178:3: (otherlv_3= 'and' ( (lv_components_4_0= ruleComponentSpecification ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:179:4: otherlv_3= 'and' ( (lv_components_4_0= ruleComponentSpecification ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_3, grammarAccess.getQualityEffectSpecificationAccess().getAndKeyword_3_0());
            	    			
            	    // InternalQualityEffectSpecification.g:183:4: ( (lv_components_4_0= ruleComponentSpecification ) )
            	    // InternalQualityEffectSpecification.g:184:5: (lv_components_4_0= ruleComponentSpecification )
            	    {
            	    // InternalQualityEffectSpecification.g:184:5: (lv_components_4_0= ruleComponentSpecification )
            	    // InternalQualityEffectSpecification.g:185:6: lv_components_4_0= ruleComponentSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getQualityEffectSpecificationAccess().getComponentsComponentSpecificationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_components_4_0=ruleComponentSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualityEffectSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_4_0,
            	    							"org.palladiosimulator.qes.QualityEffectSpecification.ComponentSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getQualityEffectSpecificationAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getQualityEffectSpecificationAccess().getDoKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getQualityEffectSpecificationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalQualityEffectSpecification.g:215:3: ( (lv_transformations_8_0= ruleTransformationSpecification ) )
            // InternalQualityEffectSpecification.g:216:4: (lv_transformations_8_0= ruleTransformationSpecification )
            {
            // InternalQualityEffectSpecification.g:216:4: (lv_transformations_8_0= ruleTransformationSpecification )
            // InternalQualityEffectSpecification.g:217:5: lv_transformations_8_0= ruleTransformationSpecification
            {

            					newCompositeNode(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsTransformationSpecificationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_transformations_8_0=ruleTransformationSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityEffectSpecificationRule());
            					}
            					add(
            						current,
            						"transformations",
            						lv_transformations_8_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.TransformationSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:234:3: (otherlv_9= 'and' ( (lv_transformations_10_0= ruleTransformationSpecification ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:235:4: otherlv_9= 'and' ( (lv_transformations_10_0= ruleTransformationSpecification ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getQualityEffectSpecificationAccess().getAndKeyword_8_0());
            	    			
            	    // InternalQualityEffectSpecification.g:239:4: ( (lv_transformations_10_0= ruleTransformationSpecification ) )
            	    // InternalQualityEffectSpecification.g:240:5: (lv_transformations_10_0= ruleTransformationSpecification )
            	    {
            	    // InternalQualityEffectSpecification.g:240:5: (lv_transformations_10_0= ruleTransformationSpecification )
            	    // InternalQualityEffectSpecification.g:241:6: lv_transformations_10_0= ruleTransformationSpecification
            	    {

            	    						newCompositeNode(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsTransformationSpecificationParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_transformations_10_0=ruleTransformationSpecification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualityEffectSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transformations",
            	    							lv_transformations_10_0,
            	    							"org.palladiosimulator.qes.QualityEffectSpecification.TransformationSpecification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getQualityEffectSpecificationAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleQualityEffectSpecification"


    // $ANTLR start "entryRuleComponentSpecification"
    // InternalQualityEffectSpecification.g:267:1: entryRuleComponentSpecification returns [EObject current=null] : iv_ruleComponentSpecification= ruleComponentSpecification EOF ;
    public final EObject entryRuleComponentSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSpecification = null;


        try {
            // InternalQualityEffectSpecification.g:267:63: (iv_ruleComponentSpecification= ruleComponentSpecification EOF )
            // InternalQualityEffectSpecification.g:268:2: iv_ruleComponentSpecification= ruleComponentSpecification EOF
            {
             newCompositeNode(grammarAccess.getComponentSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentSpecification=ruleComponentSpecification();

            state._fsp--;

             current =iv_ruleComponentSpecification; 
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
    // $ANTLR end "entryRuleComponentSpecification"


    // $ANTLR start "ruleComponentSpecification"
    // InternalQualityEffectSpecification.g:274:1: ruleComponentSpecification returns [EObject current=null] : (otherlv_0= 'Component' otherlv_1= '(' ( (lv_properties_2_0= ruleComponentProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleComponentProperty ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleComponentSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:280:2: ( (otherlv_0= 'Component' otherlv_1= '(' ( (lv_properties_2_0= ruleComponentProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleComponentProperty ) ) )* otherlv_5= ')' ) )
            // InternalQualityEffectSpecification.g:281:2: (otherlv_0= 'Component' otherlv_1= '(' ( (lv_properties_2_0= ruleComponentProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleComponentProperty ) ) )* otherlv_5= ')' )
            {
            // InternalQualityEffectSpecification.g:281:2: (otherlv_0= 'Component' otherlv_1= '(' ( (lv_properties_2_0= ruleComponentProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleComponentProperty ) ) )* otherlv_5= ')' )
            // InternalQualityEffectSpecification.g:282:3: otherlv_0= 'Component' otherlv_1= '(' ( (lv_properties_2_0= ruleComponentProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleComponentProperty ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentSpecificationAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentSpecificationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:290:3: ( (lv_properties_2_0= ruleComponentProperty ) )
            // InternalQualityEffectSpecification.g:291:4: (lv_properties_2_0= ruleComponentProperty )
            {
            // InternalQualityEffectSpecification.g:291:4: (lv_properties_2_0= ruleComponentProperty )
            // InternalQualityEffectSpecification.g:292:5: lv_properties_2_0= ruleComponentProperty
            {

            					newCompositeNode(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_properties_2_0=ruleComponentProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentSpecificationRule());
            					}
            					add(
            						current,
            						"properties",
            						lv_properties_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:309:3: (otherlv_3= 'and' ( (lv_properties_4_0= ruleComponentProperty ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:310:4: otherlv_3= 'and' ( (lv_properties_4_0= ruleComponentProperty ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_3, grammarAccess.getComponentSpecificationAccess().getAndKeyword_3_0());
            	    			
            	    // InternalQualityEffectSpecification.g:314:4: ( (lv_properties_4_0= ruleComponentProperty ) )
            	    // InternalQualityEffectSpecification.g:315:5: (lv_properties_4_0= ruleComponentProperty )
            	    {
            	    // InternalQualityEffectSpecification.g:315:5: (lv_properties_4_0= ruleComponentProperty )
            	    // InternalQualityEffectSpecification.g:316:6: lv_properties_4_0= ruleComponentProperty
            	    {

            	    						newCompositeNode(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_properties_4_0=ruleComponentProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"properties",
            	    							lv_properties_4_0,
            	    							"org.palladiosimulator.qes.QualityEffectSpecification.ComponentProperty");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentSpecificationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleComponentSpecification"


    // $ANTLR start "entryRuleComponentProperty"
    // InternalQualityEffectSpecification.g:342:1: entryRuleComponentProperty returns [EObject current=null] : iv_ruleComponentProperty= ruleComponentProperty EOF ;
    public final EObject entryRuleComponentProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentProperty = null;


        try {
            // InternalQualityEffectSpecification.g:342:58: (iv_ruleComponentProperty= ruleComponentProperty EOF )
            // InternalQualityEffectSpecification.g:343:2: iv_ruleComponentProperty= ruleComponentProperty EOF
            {
             newCompositeNode(grammarAccess.getComponentPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentProperty=ruleComponentProperty();

            state._fsp--;

             current =iv_ruleComponentProperty; 
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
    // $ANTLR end "entryRuleComponentProperty"


    // $ANTLR start "ruleComponentProperty"
    // InternalQualityEffectSpecification.g:349:1: ruleComponentProperty returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Annotation_2= ruleAnnotation | this_Type_3= ruleType | this_Role_4= ruleRole | this_Assembly_5= ruleAssembly | this_Resource_6= ruleResource ) ;
    public final EObject ruleComponentProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;

        EObject this_Annotation_2 = null;

        EObject this_Type_3 = null;

        EObject this_Role_4 = null;

        EObject this_Assembly_5 = null;

        EObject this_Resource_6 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:355:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Annotation_2= ruleAnnotation | this_Type_3= ruleType | this_Role_4= ruleRole | this_Assembly_5= ruleAssembly | this_Resource_6= ruleResource ) )
            // InternalQualityEffectSpecification.g:356:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Annotation_2= ruleAnnotation | this_Type_3= ruleType | this_Role_4= ruleRole | this_Assembly_5= ruleAssembly | this_Resource_6= ruleResource )
            {
            // InternalQualityEffectSpecification.g:356:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Annotation_2= ruleAnnotation | this_Type_3= ruleType | this_Role_4= ruleRole | this_Assembly_5= ruleAssembly | this_Resource_6= ruleResource )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 29:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQualityEffectSpecification.g:357:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current = this_Name_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:366:3: this_Identifier_1= ruleIdentifier
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;


                    			current = this_Identifier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:375:3: this_Annotation_2= ruleAnnotation
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getAnnotationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Annotation_2=ruleAnnotation();

                    state._fsp--;


                    			current = this_Annotation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:384:3: this_Type_3= ruleType
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_3=ruleType();

                    state._fsp--;


                    			current = this_Type_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:393:3: this_Role_4= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getRoleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_4=ruleRole();

                    state._fsp--;


                    			current = this_Role_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:402:3: this_Assembly_5= ruleAssembly
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getAssemblyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assembly_5=ruleAssembly();

                    state._fsp--;


                    			current = this_Assembly_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:411:3: this_Resource_6= ruleResource
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getResourceParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resource_6=ruleResource();

                    state._fsp--;


                    			current = this_Resource_6;
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
    // $ANTLR end "ruleComponentProperty"


    // $ANTLR start "entryRuleName"
    // InternalQualityEffectSpecification.g:423:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalQualityEffectSpecification.g:423:45: (iv_ruleName= ruleName EOF )
            // InternalQualityEffectSpecification.g:424:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalQualityEffectSpecification.g:430:1: ruleName returns [EObject current=null] : (otherlv_0= 'Name' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_autonym_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token lv_autonym_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:436:2: ( (otherlv_0= 'Name' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_autonym_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:437:2: (otherlv_0= 'Name' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_autonym_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:437:2: (otherlv_0= 'Name' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_autonym_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:438:3: otherlv_0= 'Name' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_autonym_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNameAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:446:3: ( (lv_not_2_0= 'not' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQualityEffectSpecification.g:447:4: (lv_not_2_0= 'not' )
                    {
                    // InternalQualityEffectSpecification.g:447:4: (lv_not_2_0= 'not' )
                    // InternalQualityEffectSpecification.g:448:5: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,22,FOLLOW_15); 

                    					newLeafNode(lv_not_2_0, grammarAccess.getNameAccess().getNotNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNameRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:460:3: ( (lv_autonym_3_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:461:4: (lv_autonym_3_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:461:4: (lv_autonym_3_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:462:5: lv_autonym_3_0= RULE_STRING
            {
            lv_autonym_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_autonym_3_0, grammarAccess.getNameAccess().getAutonymSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"autonym",
            						lv_autonym_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNameAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleIdentifier"
    // InternalQualityEffectSpecification.g:486:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalQualityEffectSpecification.g:486:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalQualityEffectSpecification.g:487:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalQualityEffectSpecification.g:493:1: ruleIdentifier returns [EObject current=null] : (otherlv_0= 'Id' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:499:2: ( (otherlv_0= 'Id' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:500:2: (otherlv_0= 'Id' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:500:2: (otherlv_0= 'Id' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:501:3: otherlv_0= 'Id' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIdentifierAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:509:3: ( (lv_not_2_0= 'not' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQualityEffectSpecification.g:510:4: (lv_not_2_0= 'not' )
                    {
                    // InternalQualityEffectSpecification.g:510:4: (lv_not_2_0= 'not' )
                    // InternalQualityEffectSpecification.g:511:5: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,22,FOLLOW_15); 

                    					newLeafNode(lv_not_2_0, grammarAccess.getIdentifierAccess().getNotNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:523:3: ( (lv_id_3_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:524:4: (lv_id_3_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:524:4: (lv_id_3_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:525:5: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_id_3_0, grammarAccess.getIdentifierAccess().getIdSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleAnnotation"
    // InternalQualityEffectSpecification.g:549:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalQualityEffectSpecification.g:549:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalQualityEffectSpecification.g:550:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalQualityEffectSpecification.g:556:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_annotation_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token lv_annotation_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:562:2: ( (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_annotation_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:563:2: (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_annotation_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:563:2: (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_annotation_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:564:3: otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_annotation_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:572:3: ( (lv_not_2_0= 'not' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQualityEffectSpecification.g:573:4: (lv_not_2_0= 'not' )
                    {
                    // InternalQualityEffectSpecification.g:573:4: (lv_not_2_0= 'not' )
                    // InternalQualityEffectSpecification.g:574:5: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,22,FOLLOW_15); 

                    					newLeafNode(lv_not_2_0, grammarAccess.getAnnotationAccess().getNotNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAnnotationRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:586:3: ( (lv_annotation_3_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:587:4: (lv_annotation_3_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:587:4: (lv_annotation_3_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:588:5: lv_annotation_3_0= RULE_STRING
            {
            lv_annotation_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_annotation_3_0, grammarAccess.getAnnotationAccess().getAnnotationSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"annotation",
            						lv_annotation_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleType"
    // InternalQualityEffectSpecification.g:612:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalQualityEffectSpecification.g:612:45: (iv_ruleType= ruleType EOF )
            // InternalQualityEffectSpecification.g:613:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalQualityEffectSpecification.g:619:1: ruleType returns [EObject current=null] : (otherlv_0= 'Type' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleComponentType ) ) otherlv_4= ')' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:625:2: ( (otherlv_0= 'Type' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleComponentType ) ) otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:626:2: (otherlv_0= 'Type' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleComponentType ) ) otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:626:2: (otherlv_0= 'Type' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleComponentType ) ) otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:627:3: otherlv_0= 'Type' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleComponentType ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:635:3: ( (lv_not_2_0= 'not' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQualityEffectSpecification.g:636:4: (lv_not_2_0= 'not' )
                    {
                    // InternalQualityEffectSpecification.g:636:4: (lv_not_2_0= 'not' )
                    // InternalQualityEffectSpecification.g:637:5: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,22,FOLLOW_17); 

                    					newLeafNode(lv_not_2_0, grammarAccess.getTypeAccess().getNotNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:649:3: ( (lv_type_3_0= ruleComponentType ) )
            // InternalQualityEffectSpecification.g:650:4: (lv_type_3_0= ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:650:4: (lv_type_3_0= ruleComponentType )
            // InternalQualityEffectSpecification.g:651:5: lv_type_3_0= ruleComponentType
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_3_0=ruleComponentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRole"
    // InternalQualityEffectSpecification.g:676:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalQualityEffectSpecification.g:676:45: (iv_ruleRole= ruleRole EOF )
            // InternalQualityEffectSpecification.g:677:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalQualityEffectSpecification.g:683:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleRoleType ) ) (otherlv_4= 'with' ( (lv_properties_5_0= ruleRoleProperty ) ) (otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_properties_7_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:689:2: ( (otherlv_0= 'Role' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleRoleType ) ) (otherlv_4= 'with' ( (lv_properties_5_0= ruleRoleProperty ) ) (otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) ) )* )? otherlv_8= ')' ) )
            // InternalQualityEffectSpecification.g:690:2: (otherlv_0= 'Role' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleRoleType ) ) (otherlv_4= 'with' ( (lv_properties_5_0= ruleRoleProperty ) ) (otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) ) )* )? otherlv_8= ')' )
            {
            // InternalQualityEffectSpecification.g:690:2: (otherlv_0= 'Role' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleRoleType ) ) (otherlv_4= 'with' ( (lv_properties_5_0= ruleRoleProperty ) ) (otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) ) )* )? otherlv_8= ')' )
            // InternalQualityEffectSpecification.g:691:3: otherlv_0= 'Role' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleRoleType ) ) (otherlv_4= 'with' ( (lv_properties_5_0= ruleRoleProperty ) ) (otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:699:3: ( (lv_not_2_0= 'not' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQualityEffectSpecification.g:700:4: (lv_not_2_0= 'not' )
                    {
                    // InternalQualityEffectSpecification.g:700:4: (lv_not_2_0= 'not' )
                    // InternalQualityEffectSpecification.g:701:5: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(lv_not_2_0, grammarAccess.getRoleAccess().getNotNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRoleRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:713:3: ( (lv_type_3_0= ruleRoleType ) )
            // InternalQualityEffectSpecification.g:714:4: (lv_type_3_0= ruleRoleType )
            {
            // InternalQualityEffectSpecification.g:714:4: (lv_type_3_0= ruleRoleType )
            // InternalQualityEffectSpecification.g:715:5: lv_type_3_0= ruleRoleType
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_3_0=ruleRoleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.RoleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:732:3: (otherlv_4= 'with' ( (lv_properties_5_0= ruleRoleProperty ) ) (otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQualityEffectSpecification.g:733:4: otherlv_4= 'with' ( (lv_properties_5_0= ruleRoleProperty ) ) (otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) ) )*
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getWithKeyword_4_0());
                    			
                    // InternalQualityEffectSpecification.g:737:4: ( (lv_properties_5_0= ruleRoleProperty ) )
                    // InternalQualityEffectSpecification.g:738:5: (lv_properties_5_0= ruleRoleProperty )
                    {
                    // InternalQualityEffectSpecification.g:738:5: (lv_properties_5_0= ruleRoleProperty )
                    // InternalQualityEffectSpecification.g:739:6: lv_properties_5_0= ruleRoleProperty
                    {

                    						newCompositeNode(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_properties_5_0=ruleRoleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_5_0,
                    							"org.palladiosimulator.qes.QualityEffectSpecification.RoleProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQualityEffectSpecification.g:756:4: (otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalQualityEffectSpecification.g:757:5: otherlv_6= 'and' ( (lv_properties_7_0= ruleRoleProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_20); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getAndKeyword_4_2_0());
                    	    				
                    	    // InternalQualityEffectSpecification.g:761:5: ( (lv_properties_7_0= ruleRoleProperty ) )
                    	    // InternalQualityEffectSpecification.g:762:6: (lv_properties_7_0= ruleRoleProperty )
                    	    {
                    	    // InternalQualityEffectSpecification.g:762:6: (lv_properties_7_0= ruleRoleProperty )
                    	    // InternalQualityEffectSpecification.g:763:7: lv_properties_7_0= ruleRoleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_properties_7_0=ruleRoleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_7_0,
                    	    								"org.palladiosimulator.qes.QualityEffectSpecification.RoleProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleRoleProperty"
    // InternalQualityEffectSpecification.g:790:1: entryRuleRoleProperty returns [EObject current=null] : iv_ruleRoleProperty= ruleRoleProperty EOF ;
    public final EObject entryRuleRoleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleProperty = null;


        try {
            // InternalQualityEffectSpecification.g:790:53: (iv_ruleRoleProperty= ruleRoleProperty EOF )
            // InternalQualityEffectSpecification.g:791:2: iv_ruleRoleProperty= ruleRoleProperty EOF
            {
             newCompositeNode(grammarAccess.getRolePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleProperty=ruleRoleProperty();

            state._fsp--;

             current =iv_ruleRoleProperty; 
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
    // $ANTLR end "entryRuleRoleProperty"


    // $ANTLR start "ruleRoleProperty"
    // InternalQualityEffectSpecification.g:797:1: ruleRoleProperty returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Annotation_2= ruleAnnotation ) ;
    public final EObject ruleRoleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;

        EObject this_Annotation_2 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:803:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Annotation_2= ruleAnnotation ) )
            // InternalQualityEffectSpecification.g:804:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Annotation_2= ruleAnnotation )
            {
            // InternalQualityEffectSpecification.g:804:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Annotation_2= ruleAnnotation )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt15=1;
                }
                break;
            case 23:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalQualityEffectSpecification.g:805:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getRolePropertyAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current = this_Name_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:814:3: this_Identifier_1= ruleIdentifier
                    {

                    			newCompositeNode(grammarAccess.getRolePropertyAccess().getIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;


                    			current = this_Identifier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:823:3: this_Annotation_2= ruleAnnotation
                    {

                    			newCompositeNode(grammarAccess.getRolePropertyAccess().getAnnotationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Annotation_2=ruleAnnotation();

                    state._fsp--;


                    			current = this_Annotation_2;
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
    // $ANTLR end "ruleRoleProperty"


    // $ANTLR start "entryRuleAssembly"
    // InternalQualityEffectSpecification.g:835:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalQualityEffectSpecification.g:835:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalQualityEffectSpecification.g:836:2: iv_ruleAssembly= ruleAssembly EOF
            {
             newCompositeNode(grammarAccess.getAssemblyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;

             current =iv_ruleAssembly; 
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
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // InternalQualityEffectSpecification.g:842:1: ruleAssembly returns [EObject current=null] : (otherlv_0= 'Assembly' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleAssemblyType ) ) (otherlv_4= 'with' ( (lv_component_5_0= ruleComponentSpecification ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_component_5_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:848:2: ( (otherlv_0= 'Assembly' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleAssemblyType ) ) (otherlv_4= 'with' ( (lv_component_5_0= ruleComponentSpecification ) ) )? otherlv_6= ')' ) )
            // InternalQualityEffectSpecification.g:849:2: (otherlv_0= 'Assembly' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleAssemblyType ) ) (otherlv_4= 'with' ( (lv_component_5_0= ruleComponentSpecification ) ) )? otherlv_6= ')' )
            {
            // InternalQualityEffectSpecification.g:849:2: (otherlv_0= 'Assembly' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleAssemblyType ) ) (otherlv_4= 'with' ( (lv_component_5_0= ruleComponentSpecification ) ) )? otherlv_6= ')' )
            // InternalQualityEffectSpecification.g:850:3: otherlv_0= 'Assembly' otherlv_1= '(' ( (lv_not_2_0= 'not' ) )? ( (lv_type_3_0= ruleAssemblyType ) ) (otherlv_4= 'with' ( (lv_component_5_0= ruleComponentSpecification ) ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyAccess().getAssemblyKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAssemblyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:858:3: ( (lv_not_2_0= 'not' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQualityEffectSpecification.g:859:4: (lv_not_2_0= 'not' )
                    {
                    // InternalQualityEffectSpecification.g:859:4: (lv_not_2_0= 'not' )
                    // InternalQualityEffectSpecification.g:860:5: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,22,FOLLOW_21); 

                    					newLeafNode(lv_not_2_0, grammarAccess.getAssemblyAccess().getNotNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssemblyRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:872:3: ( (lv_type_3_0= ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:873:4: (lv_type_3_0= ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:873:4: (lv_type_3_0= ruleAssemblyType )
            // InternalQualityEffectSpecification.g:874:5: lv_type_3_0= ruleAssemblyType
            {

            					newCompositeNode(grammarAccess.getAssemblyAccess().getTypeAssemblyTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_3_0=ruleAssemblyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.AssemblyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:891:3: (otherlv_4= 'with' ( (lv_component_5_0= ruleComponentSpecification ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQualityEffectSpecification.g:892:4: otherlv_4= 'with' ( (lv_component_5_0= ruleComponentSpecification ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getWithKeyword_4_0());
                    			
                    // InternalQualityEffectSpecification.g:896:4: ( (lv_component_5_0= ruleComponentSpecification ) )
                    // InternalQualityEffectSpecification.g:897:5: (lv_component_5_0= ruleComponentSpecification )
                    {
                    // InternalQualityEffectSpecification.g:897:5: (lv_component_5_0= ruleComponentSpecification )
                    // InternalQualityEffectSpecification.g:898:6: lv_component_5_0= ruleComponentSpecification
                    {

                    						newCompositeNode(grammarAccess.getAssemblyAccess().getComponentComponentSpecificationParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_component_5_0=ruleComponentSpecification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    						}
                    						set(
                    							current,
                    							"component",
                    							lv_component_5_0,
                    							"org.palladiosimulator.qes.QualityEffectSpecification.ComponentSpecification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleResource"
    // InternalQualityEffectSpecification.g:924:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalQualityEffectSpecification.g:924:49: (iv_ruleResource= ruleResource EOF )
            // InternalQualityEffectSpecification.g:925:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalQualityEffectSpecification.g:931:1: ruleResource returns [EObject current=null] : (otherlv_0= 'Resource' otherlv_1= '(' ( (lv_properties_2_0= ruleResourceProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleResourceProperty ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:937:2: ( (otherlv_0= 'Resource' otherlv_1= '(' ( (lv_properties_2_0= ruleResourceProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleResourceProperty ) ) )* otherlv_5= ')' ) )
            // InternalQualityEffectSpecification.g:938:2: (otherlv_0= 'Resource' otherlv_1= '(' ( (lv_properties_2_0= ruleResourceProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleResourceProperty ) ) )* otherlv_5= ')' )
            {
            // InternalQualityEffectSpecification.g:938:2: (otherlv_0= 'Resource' otherlv_1= '(' ( (lv_properties_2_0= ruleResourceProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleResourceProperty ) ) )* otherlv_5= ')' )
            // InternalQualityEffectSpecification.g:939:3: otherlv_0= 'Resource' otherlv_1= '(' ( (lv_properties_2_0= ruleResourceProperty ) ) (otherlv_3= 'and' ( (lv_properties_4_0= ruleResourceProperty ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:947:3: ( (lv_properties_2_0= ruleResourceProperty ) )
            // InternalQualityEffectSpecification.g:948:4: (lv_properties_2_0= ruleResourceProperty )
            {
            // InternalQualityEffectSpecification.g:948:4: (lv_properties_2_0= ruleResourceProperty )
            // InternalQualityEffectSpecification.g:949:5: lv_properties_2_0= ruleResourceProperty
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_properties_2_0=ruleResourceProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					add(
            						current,
            						"properties",
            						lv_properties_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.ResourceProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:966:3: (otherlv_3= 'and' ( (lv_properties_4_0= ruleResourceProperty ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:967:4: otherlv_3= 'and' ( (lv_properties_4_0= ruleResourceProperty ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_22); 

            	    				newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getAndKeyword_3_0());
            	    			
            	    // InternalQualityEffectSpecification.g:971:4: ( (lv_properties_4_0= ruleResourceProperty ) )
            	    // InternalQualityEffectSpecification.g:972:5: (lv_properties_4_0= ruleResourceProperty )
            	    {
            	    // InternalQualityEffectSpecification.g:972:5: (lv_properties_4_0= ruleResourceProperty )
            	    // InternalQualityEffectSpecification.g:973:6: lv_properties_4_0= ruleResourceProperty
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_properties_4_0=ruleResourceProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"properties",
            	    							lv_properties_4_0,
            	    							"org.palladiosimulator.qes.QualityEffectSpecification.ResourceProperty");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleResourceProperty"
    // InternalQualityEffectSpecification.g:999:1: entryRuleResourceProperty returns [EObject current=null] : iv_ruleResourceProperty= ruleResourceProperty EOF ;
    public final EObject entryRuleResourceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceProperty = null;


        try {
            // InternalQualityEffectSpecification.g:999:57: (iv_ruleResourceProperty= ruleResourceProperty EOF )
            // InternalQualityEffectSpecification.g:1000:2: iv_ruleResourceProperty= ruleResourceProperty EOF
            {
             newCompositeNode(grammarAccess.getResourcePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceProperty=ruleResourceProperty();

            state._fsp--;

             current =iv_ruleResourceProperty; 
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
    // $ANTLR end "entryRuleResourceProperty"


    // $ANTLR start "ruleResourceProperty"
    // InternalQualityEffectSpecification.g:1006:1: ruleResourceProperty returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier ) ;
    public final EObject ruleResourceProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1012:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier ) )
            // InternalQualityEffectSpecification.g:1013:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier )
            {
            // InternalQualityEffectSpecification.g:1013:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            else if ( (LA19_0==23) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1014:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getResourcePropertyAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current = this_Name_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1023:3: this_Identifier_1= ruleIdentifier
                    {

                    			newCompositeNode(grammarAccess.getResourcePropertyAccess().getIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;


                    			current = this_Identifier_1;
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
    // $ANTLR end "ruleResourceProperty"


    // $ANTLR start "entryRuleTransformationSpecification"
    // InternalQualityEffectSpecification.g:1035:1: entryRuleTransformationSpecification returns [EObject current=null] : iv_ruleTransformationSpecification= ruleTransformationSpecification EOF ;
    public final EObject entryRuleTransformationSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationSpecification = null;


        try {
            // InternalQualityEffectSpecification.g:1035:68: (iv_ruleTransformationSpecification= ruleTransformationSpecification EOF )
            // InternalQualityEffectSpecification.g:1036:2: iv_ruleTransformationSpecification= ruleTransformationSpecification EOF
            {
             newCompositeNode(grammarAccess.getTransformationSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformationSpecification=ruleTransformationSpecification();

            state._fsp--;

             current =iv_ruleTransformationSpecification; 
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
    // $ANTLR end "entryRuleTransformationSpecification"


    // $ANTLR start "ruleTransformationSpecification"
    // InternalQualityEffectSpecification.g:1042:1: ruleTransformationSpecification returns [EObject current=null] : (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning | this_NumericValue_2= ruleNumericValue ) ;
    public final EObject ruleTransformationSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_NQA_0 = null;

        EObject this_Reasoning_1 = null;

        EObject this_NumericValue_2 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1048:2: ( (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning | this_NumericValue_2= ruleNumericValue ) )
            // InternalQualityEffectSpecification.g:1049:2: (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning | this_NumericValue_2= ruleNumericValue )
            {
            // InternalQualityEffectSpecification.g:1049:2: (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning | this_NumericValue_2= ruleNumericValue )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1050:3: this_NQA_0= ruleNQA
                    {

                    			newCompositeNode(grammarAccess.getTransformationSpecificationAccess().getNQAParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NQA_0=ruleNQA();

                    state._fsp--;


                    			current = this_NQA_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1059:3: this_Reasoning_1= ruleReasoning
                    {

                    			newCompositeNode(grammarAccess.getTransformationSpecificationAccess().getReasoningParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reasoning_1=ruleReasoning();

                    state._fsp--;


                    			current = this_Reasoning_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1068:3: this_NumericValue_2= ruleNumericValue
                    {

                    			newCompositeNode(grammarAccess.getTransformationSpecificationAccess().getNumericValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericValue_2=ruleNumericValue();

                    state._fsp--;


                    			current = this_NumericValue_2;
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
    // $ANTLR end "ruleTransformationSpecification"


    // $ANTLR start "entryRuleNQA"
    // InternalQualityEffectSpecification.g:1080:1: entryRuleNQA returns [EObject current=null] : iv_ruleNQA= ruleNQA EOF ;
    public final EObject entryRuleNQA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNQA = null;


        try {
            // InternalQualityEffectSpecification.g:1080:44: (iv_ruleNQA= ruleNQA EOF )
            // InternalQualityEffectSpecification.g:1081:2: iv_ruleNQA= ruleNQA EOF
            {
             newCompositeNode(grammarAccess.getNQARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNQA=ruleNQA();

            state._fsp--;

             current =iv_ruleNQA; 
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
    // $ANTLR end "entryRuleNQA"


    // $ANTLR start "ruleNQA"
    // InternalQualityEffectSpecification.g:1087:1: ruleNQA returns [EObject current=null] : (otherlv_0= 'NQA' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) ( (lv_type_3_0= ruleTransformationType ) ) ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleNQA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_quality_2_0=null;
        Token lv_element_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1093:2: ( (otherlv_0= 'NQA' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) ( (lv_type_3_0= ruleTransformationType ) ) ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalQualityEffectSpecification.g:1094:2: (otherlv_0= 'NQA' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) ( (lv_type_3_0= ruleTransformationType ) ) ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalQualityEffectSpecification.g:1094:2: (otherlv_0= 'NQA' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) ( (lv_type_3_0= ruleTransformationType ) ) ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalQualityEffectSpecification.g:1095:3: otherlv_0= 'NQA' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) ( (lv_type_3_0= ruleTransformationType ) ) ( (lv_element_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNQAAccess().getNQAKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getNQAAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:1103:3: ( (lv_quality_2_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1104:4: (lv_quality_2_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1104:4: (lv_quality_2_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1105:5: lv_quality_2_0= RULE_STRING
            {
            lv_quality_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_quality_2_0, grammarAccess.getNQAAccess().getQualitySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNQARule());
            					}
            					setWithLastConsumed(
            						current,
            						"quality",
            						lv_quality_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQualityEffectSpecification.g:1121:3: ( (lv_type_3_0= ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:1122:4: (lv_type_3_0= ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:1122:4: (lv_type_3_0= ruleTransformationType )
            // InternalQualityEffectSpecification.g:1123:5: lv_type_3_0= ruleTransformationType
            {

            					newCompositeNode(grammarAccess.getNQAAccess().getTypeTransformationTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_3_0=ruleTransformationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNQARule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.TransformationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:1140:3: ( (lv_element_4_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1141:4: (lv_element_4_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1141:4: (lv_element_4_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1142:5: lv_element_4_0= RULE_STRING
            {
            lv_element_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_element_4_0, grammarAccess.getNQAAccess().getElementSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNQARule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNQAAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleNQA"


    // $ANTLR start "entryRuleReasoning"
    // InternalQualityEffectSpecification.g:1166:1: entryRuleReasoning returns [EObject current=null] : iv_ruleReasoning= ruleReasoning EOF ;
    public final EObject entryRuleReasoning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasoning = null;


        try {
            // InternalQualityEffectSpecification.g:1166:50: (iv_ruleReasoning= ruleReasoning EOF )
            // InternalQualityEffectSpecification.g:1167:2: iv_ruleReasoning= ruleReasoning EOF
            {
             newCompositeNode(grammarAccess.getReasoningRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReasoning=ruleReasoning();

            state._fsp--;

             current =iv_ruleReasoning; 
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
    // $ANTLR end "entryRuleReasoning"


    // $ANTLR start "ruleReasoning"
    // InternalQualityEffectSpecification.g:1173:1: ruleReasoning returns [EObject current=null] : (otherlv_0= 'Reasoning' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) otherlv_3= '=' ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleReasoning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_quality_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_rules_4_0 = null;

        EObject lv_rules_6_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1179:2: ( (otherlv_0= 'Reasoning' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) otherlv_3= '=' ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* otherlv_7= ')' ) )
            // InternalQualityEffectSpecification.g:1180:2: (otherlv_0= 'Reasoning' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) otherlv_3= '=' ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* otherlv_7= ')' )
            {
            // InternalQualityEffectSpecification.g:1180:2: (otherlv_0= 'Reasoning' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) otherlv_3= '=' ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* otherlv_7= ')' )
            // InternalQualityEffectSpecification.g:1181:3: otherlv_0= 'Reasoning' otherlv_1= '(' ( (lv_quality_2_0= RULE_STRING ) ) otherlv_3= '=' ( (lv_rules_4_0= ruleRule ) ) (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getReasoningAccess().getReasoningKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getReasoningAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:1189:3: ( (lv_quality_2_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1190:4: (lv_quality_2_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1190:4: (lv_quality_2_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1191:5: lv_quality_2_0= RULE_STRING
            {
            lv_quality_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_quality_2_0, grammarAccess.getReasoningAccess().getQualitySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReasoningRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quality",
            						lv_quality_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getReasoningAccess().getEqualsSignKeyword_3());
            		
            // InternalQualityEffectSpecification.g:1211:3: ( (lv_rules_4_0= ruleRule ) )
            // InternalQualityEffectSpecification.g:1212:4: (lv_rules_4_0= ruleRule )
            {
            // InternalQualityEffectSpecification.g:1212:4: (lv_rules_4_0= ruleRule )
            // InternalQualityEffectSpecification.g:1213:5: lv_rules_4_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_rules_4_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReasoningRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_4_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:1230:3: (otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1231:4: otherlv_5= ',' ( (lv_rules_6_0= ruleRule ) )
            	    {
            	    otherlv_5=(Token)match(input,33,FOLLOW_25); 

            	    				newLeafNode(otherlv_5, grammarAccess.getReasoningAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalQualityEffectSpecification.g:1235:4: ( (lv_rules_6_0= ruleRule ) )
            	    // InternalQualityEffectSpecification.g:1236:5: (lv_rules_6_0= ruleRule )
            	    {
            	    // InternalQualityEffectSpecification.g:1236:5: (lv_rules_6_0= ruleRule )
            	    // InternalQualityEffectSpecification.g:1237:6: lv_rules_6_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_rules_6_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReasoningRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_6_0,
            	    							"org.palladiosimulator.qes.QualityEffectSpecification.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getReasoningAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleReasoning"


    // $ANTLR start "entryRuleRule"
    // InternalQualityEffectSpecification.g:1263:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalQualityEffectSpecification.g:1263:45: (iv_ruleRule= ruleRule EOF )
            // InternalQualityEffectSpecification.g:1264:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalQualityEffectSpecification.g:1270:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' otherlv_1= '(' ( (lv_qualities_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_qualities_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_entries_6_0= ruleEntry ) ) (otherlv_7= ',' ( (lv_entries_8_0= ruleEntry ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_qualities_2_0=null;
        Token otherlv_3=null;
        Token lv_qualities_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_entries_6_0 = null;

        EObject lv_entries_8_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1276:2: ( (otherlv_0= 'Rule' otherlv_1= '(' ( (lv_qualities_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_qualities_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_entries_6_0= ruleEntry ) ) (otherlv_7= ',' ( (lv_entries_8_0= ruleEntry ) ) )* otherlv_9= ')' ) )
            // InternalQualityEffectSpecification.g:1277:2: (otherlv_0= 'Rule' otherlv_1= '(' ( (lv_qualities_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_qualities_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_entries_6_0= ruleEntry ) ) (otherlv_7= ',' ( (lv_entries_8_0= ruleEntry ) ) )* otherlv_9= ')' )
            {
            // InternalQualityEffectSpecification.g:1277:2: (otherlv_0= 'Rule' otherlv_1= '(' ( (lv_qualities_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_qualities_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_entries_6_0= ruleEntry ) ) (otherlv_7= ',' ( (lv_entries_8_0= ruleEntry ) ) )* otherlv_9= ')' )
            // InternalQualityEffectSpecification.g:1278:3: otherlv_0= 'Rule' otherlv_1= '(' ( (lv_qualities_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_qualities_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_entries_6_0= ruleEntry ) ) (otherlv_7= ',' ( (lv_entries_8_0= ruleEntry ) ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:1286:3: ( (lv_qualities_2_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1287:4: (lv_qualities_2_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1287:4: (lv_qualities_2_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1288:5: lv_qualities_2_0= RULE_STRING
            {
            lv_qualities_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_qualities_2_0, grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					addWithLastConsumed(
            						current,
            						"qualities",
            						lv_qualities_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQualityEffectSpecification.g:1304:3: (otherlv_3= ',' ( (lv_qualities_4_0= RULE_STRING ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1305:4: otherlv_3= ',' ( (lv_qualities_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalQualityEffectSpecification.g:1309:4: ( (lv_qualities_4_0= RULE_STRING ) )
            	    // InternalQualityEffectSpecification.g:1310:5: (lv_qualities_4_0= RULE_STRING )
            	    {
            	    // InternalQualityEffectSpecification.g:1310:5: (lv_qualities_4_0= RULE_STRING )
            	    // InternalQualityEffectSpecification.g:1311:6: lv_qualities_4_0= RULE_STRING
            	    {
            	    lv_qualities_4_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    						newLeafNode(lv_qualities_4_0, grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"qualities",
            	    							lv_qualities_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getEqualsSignKeyword_4());
            		
            // InternalQualityEffectSpecification.g:1332:3: ( (lv_entries_6_0= ruleEntry ) )
            // InternalQualityEffectSpecification.g:1333:4: (lv_entries_6_0= ruleEntry )
            {
            // InternalQualityEffectSpecification.g:1333:4: (lv_entries_6_0= ruleEntry )
            // InternalQualityEffectSpecification.g:1334:5: lv_entries_6_0= ruleEntry
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_entries_6_0=ruleEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"entries",
            						lv_entries_6_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.Entry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:1351:3: (otherlv_7= ',' ( (lv_entries_8_0= ruleEntry ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1352:4: otherlv_7= ',' ( (lv_entries_8_0= ruleEntry ) )
            	    {
            	    otherlv_7=(Token)match(input,33,FOLLOW_28); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalQualityEffectSpecification.g:1356:4: ( (lv_entries_8_0= ruleEntry ) )
            	    // InternalQualityEffectSpecification.g:1357:5: (lv_entries_8_0= ruleEntry )
            	    {
            	    // InternalQualityEffectSpecification.g:1357:5: (lv_entries_8_0= ruleEntry )
            	    // InternalQualityEffectSpecification.g:1358:6: lv_entries_8_0= ruleEntry
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_entries_8_0=ruleEntry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entries",
            	    							lv_entries_8_0,
            	    							"org.palladiosimulator.qes.QualityEffectSpecification.Entry");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEntry"
    // InternalQualityEffectSpecification.g:1384:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalQualityEffectSpecification.g:1384:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalQualityEffectSpecification.g:1385:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalQualityEffectSpecification.g:1391:1: ruleEntry returns [EObject current=null] : (otherlv_0= 'Entry' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_key_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token lv_key_4_0=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1397:2: ( (otherlv_0= 'Entry' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_key_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' ) )
            // InternalQualityEffectSpecification.g:1398:2: (otherlv_0= 'Entry' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_key_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' )
            {
            // InternalQualityEffectSpecification.g:1398:2: (otherlv_0= 'Entry' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_key_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')' )
            // InternalQualityEffectSpecification.g:1399:3: otherlv_0= 'Entry' otherlv_1= '(' ( (lv_key_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_key_4_0= RULE_STRING ) ) )* otherlv_5= '=' ( (lv_value_6_0= RULE_STRING ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEntryAccess().getEntryKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEntryAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:1407:3: ( (lv_key_2_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1408:4: (lv_key_2_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1408:4: (lv_key_2_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1409:5: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_key_2_0, grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					addWithLastConsumed(
            						current,
            						"key",
            						lv_key_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQualityEffectSpecification.g:1425:3: (otherlv_3= ',' ( (lv_key_4_0= RULE_STRING ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1426:4: otherlv_3= ',' ( (lv_key_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEntryAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalQualityEffectSpecification.g:1430:4: ( (lv_key_4_0= RULE_STRING ) )
            	    // InternalQualityEffectSpecification.g:1431:5: (lv_key_4_0= RULE_STRING )
            	    {
            	    // InternalQualityEffectSpecification.g:1431:5: (lv_key_4_0= RULE_STRING )
            	    // InternalQualityEffectSpecification.g:1432:6: lv_key_4_0= RULE_STRING
            	    {
            	    lv_key_4_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    						newLeafNode(lv_key_4_0, grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntryRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"key",
            	    							lv_key_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getEntryAccess().getEqualsSignKeyword_4());
            		
            // InternalQualityEffectSpecification.g:1453:3: ( (lv_value_6_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1454:4: (lv_value_6_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1454:4: (lv_value_6_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1455:5: lv_value_6_0= RULE_STRING
            {
            lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_value_6_0, grammarAccess.getEntryAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEntryAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleNumericValue"
    // InternalQualityEffectSpecification.g:1479:1: entryRuleNumericValue returns [EObject current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final EObject entryRuleNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericValue = null;


        try {
            // InternalQualityEffectSpecification.g:1479:53: (iv_ruleNumericValue= ruleNumericValue EOF )
            // InternalQualityEffectSpecification.g:1480:2: iv_ruleNumericValue= ruleNumericValue EOF
            {
             newCompositeNode(grammarAccess.getNumericValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericValue=ruleNumericValue();

            state._fsp--;

             current =iv_ruleNumericValue; 
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
    // $ANTLR end "entryRuleNumericValue"


    // $ANTLR start "ruleNumericValue"
    // InternalQualityEffectSpecification.g:1486:1: ruleNumericValue returns [EObject current=null] : ( ( (lv_valueType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_transformationType_2_0= ruleTransformationType ) ) ( (lv_transformationNumber_3_0= RULE_NUMBER ) ) otherlv_4= ')' ) ;
    public final EObject ruleNumericValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueType_0_0=null;
        Token otherlv_1=null;
        Token lv_transformationNumber_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_transformationType_2_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1492:2: ( ( ( (lv_valueType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_transformationType_2_0= ruleTransformationType ) ) ( (lv_transformationNumber_3_0= RULE_NUMBER ) ) otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:1493:2: ( ( (lv_valueType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_transformationType_2_0= ruleTransformationType ) ) ( (lv_transformationNumber_3_0= RULE_NUMBER ) ) otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:1493:2: ( ( (lv_valueType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_transformationType_2_0= ruleTransformationType ) ) ( (lv_transformationNumber_3_0= RULE_NUMBER ) ) otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:1494:3: ( (lv_valueType_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_transformationType_2_0= ruleTransformationType ) ) ( (lv_transformationNumber_3_0= RULE_NUMBER ) ) otherlv_4= ')'
            {
            // InternalQualityEffectSpecification.g:1494:3: ( (lv_valueType_0_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:1495:4: (lv_valueType_0_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:1495:4: (lv_valueType_0_0= RULE_ID )
            // InternalQualityEffectSpecification.g:1496:5: lv_valueType_0_0= RULE_ID
            {
            lv_valueType_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_valueType_0_0, grammarAccess.getNumericValueAccess().getValueTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumericValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valueType",
            						lv_valueType_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getNumericValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQualityEffectSpecification.g:1516:3: ( (lv_transformationType_2_0= ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:1517:4: (lv_transformationType_2_0= ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:1517:4: (lv_transformationType_2_0= ruleTransformationType )
            // InternalQualityEffectSpecification.g:1518:5: lv_transformationType_2_0= ruleTransformationType
            {

            					newCompositeNode(grammarAccess.getNumericValueAccess().getTransformationTypeTransformationTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_transformationType_2_0=ruleTransformationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericValueRule());
            					}
            					set(
            						current,
            						"transformationType",
            						lv_transformationType_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.TransformationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:1535:3: ( (lv_transformationNumber_3_0= RULE_NUMBER ) )
            // InternalQualityEffectSpecification.g:1536:4: (lv_transformationNumber_3_0= RULE_NUMBER )
            {
            // InternalQualityEffectSpecification.g:1536:4: (lv_transformationNumber_3_0= RULE_NUMBER )
            // InternalQualityEffectSpecification.g:1537:5: lv_transformationNumber_3_0= RULE_NUMBER
            {
            lv_transformationNumber_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_16); 

            					newLeafNode(lv_transformationNumber_3_0, grammarAccess.getNumericValueAccess().getTransformationNumberNUMBERTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumericValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"transformationNumber",
            						lv_transformationNumber_3_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.NUMBER");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNumericValueAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleNumericValue"


    // $ANTLR start "ruleComponentType"
    // InternalQualityEffectSpecification.g:1561:1: ruleComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'AnyComponentType' ) | (enumLiteral_1= 'Basic' ) | (enumLiteral_2= 'Composite' ) ) ;
    public final Enumerator ruleComponentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1567:2: ( ( (enumLiteral_0= 'AnyComponentType' ) | (enumLiteral_1= 'Basic' ) | (enumLiteral_2= 'Composite' ) ) )
            // InternalQualityEffectSpecification.g:1568:2: ( (enumLiteral_0= 'AnyComponentType' ) | (enumLiteral_1= 'Basic' ) | (enumLiteral_2= 'Composite' ) )
            {
            // InternalQualityEffectSpecification.g:1568:2: ( (enumLiteral_0= 'AnyComponentType' ) | (enumLiteral_1= 'Basic' ) | (enumLiteral_2= 'Composite' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1569:3: (enumLiteral_0= 'AnyComponentType' )
                    {
                    // InternalQualityEffectSpecification.g:1569:3: (enumLiteral_0= 'AnyComponentType' )
                    // InternalQualityEffectSpecification.g:1570:4: enumLiteral_0= 'AnyComponentType'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1577:3: (enumLiteral_1= 'Basic' )
                    {
                    // InternalQualityEffectSpecification.g:1577:3: (enumLiteral_1= 'Basic' )
                    // InternalQualityEffectSpecification.g:1578:4: enumLiteral_1= 'Basic'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1585:3: (enumLiteral_2= 'Composite' )
                    {
                    // InternalQualityEffectSpecification.g:1585:3: (enumLiteral_2= 'Composite' )
                    // InternalQualityEffectSpecification.g:1586:4: enumLiteral_2= 'Composite'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "ruleRoleType"
    // InternalQualityEffectSpecification.g:1596:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'AnyRoleType' ) | (enumLiteral_1= 'ComponentRequiredProvided' ) | (enumLiteral_2= 'ComponentRequired' ) | (enumLiteral_3= 'ComponentProvided' ) | (enumLiteral_4= 'InfrastructureRequiredProvided' ) | (enumLiteral_5= 'InfrastructureRequired' ) | (enumLiteral_6= 'InfrastructureProvided' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1602:2: ( ( (enumLiteral_0= 'AnyRoleType' ) | (enumLiteral_1= 'ComponentRequiredProvided' ) | (enumLiteral_2= 'ComponentRequired' ) | (enumLiteral_3= 'ComponentProvided' ) | (enumLiteral_4= 'InfrastructureRequiredProvided' ) | (enumLiteral_5= 'InfrastructureRequired' ) | (enumLiteral_6= 'InfrastructureProvided' ) ) )
            // InternalQualityEffectSpecification.g:1603:2: ( (enumLiteral_0= 'AnyRoleType' ) | (enumLiteral_1= 'ComponentRequiredProvided' ) | (enumLiteral_2= 'ComponentRequired' ) | (enumLiteral_3= 'ComponentProvided' ) | (enumLiteral_4= 'InfrastructureRequiredProvided' ) | (enumLiteral_5= 'InfrastructureRequired' ) | (enumLiteral_6= 'InfrastructureProvided' ) )
            {
            // InternalQualityEffectSpecification.g:1603:2: ( (enumLiteral_0= 'AnyRoleType' ) | (enumLiteral_1= 'ComponentRequiredProvided' ) | (enumLiteral_2= 'ComponentRequired' ) | (enumLiteral_3= 'ComponentProvided' ) | (enumLiteral_4= 'InfrastructureRequiredProvided' ) | (enumLiteral_5= 'InfrastructureRequired' ) | (enumLiteral_6= 'InfrastructureProvided' ) )
            int alt26=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt26=1;
                }
                break;
            case 40:
                {
                alt26=2;
                }
                break;
            case 41:
                {
                alt26=3;
                }
                break;
            case 42:
                {
                alt26=4;
                }
                break;
            case 43:
                {
                alt26=5;
                }
                break;
            case 44:
                {
                alt26=6;
                }
                break;
            case 45:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1604:3: (enumLiteral_0= 'AnyRoleType' )
                    {
                    // InternalQualityEffectSpecification.g:1604:3: (enumLiteral_0= 'AnyRoleType' )
                    // InternalQualityEffectSpecification.g:1605:4: enumLiteral_0= 'AnyRoleType'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1612:3: (enumLiteral_1= 'ComponentRequiredProvided' )
                    {
                    // InternalQualityEffectSpecification.g:1612:3: (enumLiteral_1= 'ComponentRequiredProvided' )
                    // InternalQualityEffectSpecification.g:1613:4: enumLiteral_1= 'ComponentRequiredProvided'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1620:3: (enumLiteral_2= 'ComponentRequired' )
                    {
                    // InternalQualityEffectSpecification.g:1620:3: (enumLiteral_2= 'ComponentRequired' )
                    // InternalQualityEffectSpecification.g:1621:4: enumLiteral_2= 'ComponentRequired'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:1628:3: (enumLiteral_3= 'ComponentProvided' )
                    {
                    // InternalQualityEffectSpecification.g:1628:3: (enumLiteral_3= 'ComponentProvided' )
                    // InternalQualityEffectSpecification.g:1629:4: enumLiteral_3= 'ComponentProvided'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:1636:3: (enumLiteral_4= 'InfrastructureRequiredProvided' )
                    {
                    // InternalQualityEffectSpecification.g:1636:3: (enumLiteral_4= 'InfrastructureRequiredProvided' )
                    // InternalQualityEffectSpecification.g:1637:4: enumLiteral_4= 'InfrastructureRequiredProvided'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:1644:3: (enumLiteral_5= 'InfrastructureRequired' )
                    {
                    // InternalQualityEffectSpecification.g:1644:3: (enumLiteral_5= 'InfrastructureRequired' )
                    // InternalQualityEffectSpecification.g:1645:4: enumLiteral_5= 'InfrastructureRequired'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:1652:3: (enumLiteral_6= 'InfrastructureProvided' )
                    {
                    // InternalQualityEffectSpecification.g:1652:3: (enumLiteral_6= 'InfrastructureProvided' )
                    // InternalQualityEffectSpecification.g:1653:4: enumLiteral_6= 'InfrastructureProvided'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_PROVIDEDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_PROVIDEDEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleRoleType"


    // $ANTLR start "ruleAssemblyType"
    // InternalQualityEffectSpecification.g:1663:1: ruleAssemblyType returns [Enumerator current=null] : ( (enumLiteral_0= 'AnyAssembly' ) | (enumLiteral_1= 'Required' ) | (enumLiteral_2= 'Provided' ) ) ;
    public final Enumerator ruleAssemblyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1669:2: ( ( (enumLiteral_0= 'AnyAssembly' ) | (enumLiteral_1= 'Required' ) | (enumLiteral_2= 'Provided' ) ) )
            // InternalQualityEffectSpecification.g:1670:2: ( (enumLiteral_0= 'AnyAssembly' ) | (enumLiteral_1= 'Required' ) | (enumLiteral_2= 'Provided' ) )
            {
            // InternalQualityEffectSpecification.g:1670:2: ( (enumLiteral_0= 'AnyAssembly' ) | (enumLiteral_1= 'Required' ) | (enumLiteral_2= 'Provided' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt27=1;
                }
                break;
            case 47:
                {
                alt27=2;
                }
                break;
            case 48:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1671:3: (enumLiteral_0= 'AnyAssembly' )
                    {
                    // InternalQualityEffectSpecification.g:1671:3: (enumLiteral_0= 'AnyAssembly' )
                    // InternalQualityEffectSpecification.g:1672:4: enumLiteral_0= 'AnyAssembly'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1679:3: (enumLiteral_1= 'Required' )
                    {
                    // InternalQualityEffectSpecification.g:1679:3: (enumLiteral_1= 'Required' )
                    // InternalQualityEffectSpecification.g:1680:4: enumLiteral_1= 'Required'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1687:3: (enumLiteral_2= 'Provided' )
                    {
                    // InternalQualityEffectSpecification.g:1687:3: (enumLiteral_2= 'Provided' )
                    // InternalQualityEffectSpecification.g:1688:4: enumLiteral_2= 'Provided'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAssemblyType"


    // $ANTLR start "ruleTransformationType"
    // InternalQualityEffectSpecification.g:1698:1: ruleTransformationType returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) ) ;
    public final Enumerator ruleTransformationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1704:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) ) )
            // InternalQualityEffectSpecification.g:1705:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) )
            {
            // InternalQualityEffectSpecification.g:1705:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt28=1;
                }
                break;
            case 49:
                {
                alt28=2;
                }
                break;
            case 50:
                {
                alt28=3;
                }
                break;
            case 51:
                {
                alt28=4;
                }
                break;
            case 52:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1706:3: (enumLiteral_0= '=' )
                    {
                    // InternalQualityEffectSpecification.g:1706:3: (enumLiteral_0= '=' )
                    // InternalQualityEffectSpecification.g:1707:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1714:3: (enumLiteral_1= '+' )
                    {
                    // InternalQualityEffectSpecification.g:1714:3: (enumLiteral_1= '+' )
                    // InternalQualityEffectSpecification.g:1715:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1722:3: (enumLiteral_2= '-' )
                    {
                    // InternalQualityEffectSpecification.g:1722:3: (enumLiteral_2= '-' )
                    // InternalQualityEffectSpecification.g:1723:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:1730:3: (enumLiteral_3= '*' )
                    {
                    // InternalQualityEffectSpecification.g:1730:3: (enumLiteral_3= '*' )
                    // InternalQualityEffectSpecification.g:1731:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:1738:3: (enumLiteral_4= '/' )
                    {
                    // InternalQualityEffectSpecification.g:1738:3: (enumLiteral_4= '/' )
                    // InternalQualityEffectSpecification.g:1739:4: enumLiteral_4= '/'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getDIVISIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTransformationTypeAccess().getDIVISIONEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleTransformationType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\1\4\1\15\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\1\10\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 99:3: ( (this_NL_1= RULE_NL )+ ( (lv_specifications_2_0= ruleQualityEffectSpecification ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000C0000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000037A00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00003F8000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001C00000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x001E000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});

}