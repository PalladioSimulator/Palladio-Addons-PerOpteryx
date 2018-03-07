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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'For{'", "'}'", "'Do{'", "'Component('", "')'", "'Name('", "'Not'", "'Id('", "'Type('", "'Role('", "'Interface('", "'Method('", "':'", "'Assembly('", "'Resource('", "'NQA('", "'Reasoning('", "'('", "'['", "']'", "'Cost('", "'AnyComponentType'", "'Basic'", "'Composite'", "'AnyRoleType'", "'ComponentRequiredProvided'", "'ComponentRequired'", "'ComponentProvided'", "'InfrastructureRequiredProvided'", "'InfrastructureRequired'", "'InfrastructureProvided'", "'AnyAssembly'", "'Required'", "'Provided'", "'='", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalQualityEffectSpecification.g:72:1: ruleModel returns [EObject current=null] : ( (lv_specifications_0_0= ruleQES ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_specifications_0_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:78:2: ( ( (lv_specifications_0_0= ruleQES ) )+ )
            // InternalQualityEffectSpecification.g:79:2: ( (lv_specifications_0_0= ruleQES ) )+
            {
            // InternalQualityEffectSpecification.g:79:2: ( (lv_specifications_0_0= ruleQES ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:80:3: (lv_specifications_0_0= ruleQES )
            	    {
            	    // InternalQualityEffectSpecification.g:80:3: (lv_specifications_0_0= ruleQES )
            	    // InternalQualityEffectSpecification.g:81:4: lv_specifications_0_0= ruleQES
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getSpecificationsQESParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_specifications_0_0=ruleQES();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"specifications",
            	    					lv_specifications_0_0,
            	    					"org.palladiosimulator.qes.QualityEffectSpecification.QES");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


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


    // $ANTLR start "entryRuleQES"
    // InternalQualityEffectSpecification.g:101:1: entryRuleQES returns [EObject current=null] : iv_ruleQES= ruleQES EOF ;
    public final EObject entryRuleQES() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQES = null;


        try {
            // InternalQualityEffectSpecification.g:101:44: (iv_ruleQES= ruleQES EOF )
            // InternalQualityEffectSpecification.g:102:2: iv_ruleQES= ruleQES EOF
            {
             newCompositeNode(grammarAccess.getQESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQES=ruleQES();

            state._fsp--;

             current =iv_ruleQES; 
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
    // $ANTLR end "entryRuleQES"


    // $ANTLR start "ruleQES"
    // InternalQualityEffectSpecification.g:108:1: ruleQES returns [EObject current=null] : (otherlv_0= 'For{' ( (lv_components_1_0= ruleComponentSpecification ) )+ otherlv_2= '}' otherlv_3= 'Do{' ( (lv_transformations_4_0= ruleTransformationSpecification ) )+ otherlv_5= '}' ) ;
    public final EObject ruleQES() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_components_1_0 = null;

        EObject lv_transformations_4_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:114:2: ( (otherlv_0= 'For{' ( (lv_components_1_0= ruleComponentSpecification ) )+ otherlv_2= '}' otherlv_3= 'Do{' ( (lv_transformations_4_0= ruleTransformationSpecification ) )+ otherlv_5= '}' ) )
            // InternalQualityEffectSpecification.g:115:2: (otherlv_0= 'For{' ( (lv_components_1_0= ruleComponentSpecification ) )+ otherlv_2= '}' otherlv_3= 'Do{' ( (lv_transformations_4_0= ruleTransformationSpecification ) )+ otherlv_5= '}' )
            {
            // InternalQualityEffectSpecification.g:115:2: (otherlv_0= 'For{' ( (lv_components_1_0= ruleComponentSpecification ) )+ otherlv_2= '}' otherlv_3= 'Do{' ( (lv_transformations_4_0= ruleTransformationSpecification ) )+ otherlv_5= '}' )
            // InternalQualityEffectSpecification.g:116:3: otherlv_0= 'For{' ( (lv_components_1_0= ruleComponentSpecification ) )+ otherlv_2= '}' otherlv_3= 'Do{' ( (lv_transformations_4_0= ruleTransformationSpecification ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQESAccess().getForKeyword_0());
            		
            // InternalQualityEffectSpecification.g:120:3: ( (lv_components_1_0= ruleComponentSpecification ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:121:4: (lv_components_1_0= ruleComponentSpecification )
            	    {
            	    // InternalQualityEffectSpecification.g:121:4: (lv_components_1_0= ruleComponentSpecification )
            	    // InternalQualityEffectSpecification.g:122:5: lv_components_1_0= ruleComponentSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getQESAccess().getComponentsComponentSpecificationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_components_1_0=ruleComponentSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQESRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_1_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentSpecification");
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getQESAccess().getRightCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getQESAccess().getDoKeyword_3());
            		
            // InternalQualityEffectSpecification.g:147:3: ( (lv_transformations_4_0= ruleTransformationSpecification ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=26 && LA3_0<=27)||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:148:4: (lv_transformations_4_0= ruleTransformationSpecification )
            	    {
            	    // InternalQualityEffectSpecification.g:148:4: (lv_transformations_4_0= ruleTransformationSpecification )
            	    // InternalQualityEffectSpecification.g:149:5: lv_transformations_4_0= ruleTransformationSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getQESAccess().getTransformationsTransformationSpecificationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_transformations_4_0=ruleTransformationSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQESRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transformations",
            	    						lv_transformations_4_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.TransformationSpecification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getQESAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleQES"


    // $ANTLR start "entryRuleComponentSpecification"
    // InternalQualityEffectSpecification.g:174:1: entryRuleComponentSpecification returns [EObject current=null] : iv_ruleComponentSpecification= ruleComponentSpecification EOF ;
    public final EObject entryRuleComponentSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentSpecification = null;


        try {
            // InternalQualityEffectSpecification.g:174:63: (iv_ruleComponentSpecification= ruleComponentSpecification EOF )
            // InternalQualityEffectSpecification.g:175:2: iv_ruleComponentSpecification= ruleComponentSpecification EOF
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
    // InternalQualityEffectSpecification.g:181:1: ruleComponentSpecification returns [EObject current=null] : (otherlv_0= 'Component(' ( (lv_properties_1_0= ruleComponentProperty ) )+ otherlv_2= ')' ) ;
    public final EObject ruleComponentSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:187:2: ( (otherlv_0= 'Component(' ( (lv_properties_1_0= ruleComponentProperty ) )+ otherlv_2= ')' ) )
            // InternalQualityEffectSpecification.g:188:2: (otherlv_0= 'Component(' ( (lv_properties_1_0= ruleComponentProperty ) )+ otherlv_2= ')' )
            {
            // InternalQualityEffectSpecification.g:188:2: (otherlv_0= 'Component(' ( (lv_properties_1_0= ruleComponentProperty ) )+ otherlv_2= ')' )
            // InternalQualityEffectSpecification.g:189:3: otherlv_0= 'Component(' ( (lv_properties_1_0= ruleComponentProperty ) )+ otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentSpecificationAccess().getComponentKeyword_0());
            		
            // InternalQualityEffectSpecification.g:193:3: ( (lv_properties_1_0= ruleComponentProperty ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||(LA4_0>=18 && LA4_0<=20)||(LA4_0>=24 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:194:4: (lv_properties_1_0= ruleComponentProperty )
            	    {
            	    // InternalQualityEffectSpecification.g:194:4: (lv_properties_1_0= ruleComponentProperty )
            	    // InternalQualityEffectSpecification.g:195:5: lv_properties_1_0= ruleComponentProperty
            	    {

            	    					newCompositeNode(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_properties_1_0=ruleComponentProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentSpecificationAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalQualityEffectSpecification.g:220:1: entryRuleComponentProperty returns [EObject current=null] : iv_ruleComponentProperty= ruleComponentProperty EOF ;
    public final EObject entryRuleComponentProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentProperty = null;


        try {
            // InternalQualityEffectSpecification.g:220:58: (iv_ruleComponentProperty= ruleComponentProperty EOF )
            // InternalQualityEffectSpecification.g:221:2: iv_ruleComponentProperty= ruleComponentProperty EOF
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
    // InternalQualityEffectSpecification.g:227:1: ruleComponentProperty returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Type_2= ruleType | this_Role_3= ruleRole | this_Assembly_4= ruleAssembly | this_Resource_5= ruleResource ) ;
    public final EObject ruleComponentProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;

        EObject this_Type_2 = null;

        EObject this_Role_3 = null;

        EObject this_Assembly_4 = null;

        EObject this_Resource_5 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:233:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Type_2= ruleType | this_Role_3= ruleRole | this_Assembly_4= ruleAssembly | this_Resource_5= ruleResource ) )
            // InternalQualityEffectSpecification.g:234:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Type_2= ruleType | this_Role_3= ruleRole | this_Assembly_4= ruleAssembly | this_Resource_5= ruleResource )
            {
            // InternalQualityEffectSpecification.g:234:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Type_2= ruleType | this_Role_3= ruleRole | this_Assembly_4= ruleAssembly | this_Resource_5= ruleResource )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQualityEffectSpecification.g:235:3: this_Name_0= ruleName
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
                    // InternalQualityEffectSpecification.g:244:3: this_Identifier_1= ruleIdentifier
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
                    // InternalQualityEffectSpecification.g:253:3: this_Type_2= ruleType
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_2=ruleType();

                    state._fsp--;


                    			current = this_Type_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:262:3: this_Role_3= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getRoleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_3=ruleRole();

                    state._fsp--;


                    			current = this_Role_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:271:3: this_Assembly_4= ruleAssembly
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getAssemblyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assembly_4=ruleAssembly();

                    state._fsp--;


                    			current = this_Assembly_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:280:3: this_Resource_5= ruleResource
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertyAccess().getResourceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resource_5=ruleResource();

                    state._fsp--;


                    			current = this_Resource_5;
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
    // InternalQualityEffectSpecification.g:292:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalQualityEffectSpecification.g:292:45: (iv_ruleName= ruleName EOF )
            // InternalQualityEffectSpecification.g:293:2: iv_ruleName= ruleName EOF
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
    // InternalQualityEffectSpecification.g:299:1: ruleName returns [EObject current=null] : (otherlv_0= 'Name(' ( (lv_not_1_0= 'Not' ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_not_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:305:2: ( (otherlv_0= 'Name(' ( (lv_not_1_0= 'Not' ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalQualityEffectSpecification.g:306:2: (otherlv_0= 'Name(' ( (lv_not_1_0= 'Not' ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalQualityEffectSpecification.g:306:2: (otherlv_0= 'Name(' ( (lv_not_1_0= 'Not' ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalQualityEffectSpecification.g:307:3: otherlv_0= 'Name(' ( (lv_not_1_0= 'Not' ) )? ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
            		
            // InternalQualityEffectSpecification.g:311:3: ( (lv_not_1_0= 'Not' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQualityEffectSpecification.g:312:4: (lv_not_1_0= 'Not' )
                    {
                    // InternalQualityEffectSpecification.g:312:4: (lv_not_1_0= 'Not' )
                    // InternalQualityEffectSpecification.g:313:5: lv_not_1_0= 'Not'
                    {
                    lv_not_1_0=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getNameAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNameRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "Not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:325:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:326:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:326:4: (lv_name_2_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:327:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNameAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNameAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalQualityEffectSpecification.g:351:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalQualityEffectSpecification.g:351:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalQualityEffectSpecification.g:352:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalQualityEffectSpecification.g:358:1: ruleIdentifier returns [EObject current=null] : (otherlv_0= 'Id(' ( (lv_not_1_0= 'Not' ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_not_1_0=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:364:2: ( (otherlv_0= 'Id(' ( (lv_not_1_0= 'Not' ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalQualityEffectSpecification.g:365:2: (otherlv_0= 'Id(' ( (lv_not_1_0= 'Not' ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalQualityEffectSpecification.g:365:2: (otherlv_0= 'Id(' ( (lv_not_1_0= 'Not' ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalQualityEffectSpecification.g:366:3: otherlv_0= 'Id(' ( (lv_not_1_0= 'Not' ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdKeyword_0());
            		
            // InternalQualityEffectSpecification.g:370:3: ( (lv_not_1_0= 'Not' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQualityEffectSpecification.g:371:4: (lv_not_1_0= 'Not' )
                    {
                    // InternalQualityEffectSpecification.g:371:4: (lv_not_1_0= 'Not' )
                    // InternalQualityEffectSpecification.g:372:5: lv_not_1_0= 'Not'
                    {
                    lv_not_1_0=(Token)match(input,17,FOLLOW_15); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "Not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:384:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:385:4: (lv_id_2_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:385:4: (lv_id_2_0= RULE_ID )
            // InternalQualityEffectSpecification.g:386:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_id_2_0, grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleType"
    // InternalQualityEffectSpecification.g:410:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalQualityEffectSpecification.g:410:45: (iv_ruleType= ruleType EOF )
            // InternalQualityEffectSpecification.g:411:2: iv_ruleType= ruleType EOF
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
    // InternalQualityEffectSpecification.g:417:1: ruleType returns [EObject current=null] : (otherlv_0= 'Type(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleComponentType ) ) otherlv_3= ')' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_not_1_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:423:2: ( (otherlv_0= 'Type(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleComponentType ) ) otherlv_3= ')' ) )
            // InternalQualityEffectSpecification.g:424:2: (otherlv_0= 'Type(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleComponentType ) ) otherlv_3= ')' )
            {
            // InternalQualityEffectSpecification.g:424:2: (otherlv_0= 'Type(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleComponentType ) ) otherlv_3= ')' )
            // InternalQualityEffectSpecification.g:425:3: otherlv_0= 'Type(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleComponentType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalQualityEffectSpecification.g:429:3: ( (lv_not_1_0= 'Not' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQualityEffectSpecification.g:430:4: (lv_not_1_0= 'Not' )
                    {
                    // InternalQualityEffectSpecification.g:430:4: (lv_not_1_0= 'Not' )
                    // InternalQualityEffectSpecification.g:431:5: lv_not_1_0= 'Not'
                    {
                    lv_not_1_0=(Token)match(input,17,FOLLOW_16); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getTypeAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "Not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:443:3: ( (lv_type_2_0= ruleComponentType ) )
            // InternalQualityEffectSpecification.g:444:4: (lv_type_2_0= ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:444:4: (lv_type_2_0= ruleComponentType )
            // InternalQualityEffectSpecification.g:445:5: lv_type_2_0= ruleComponentType
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_2_0=ruleComponentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalQualityEffectSpecification.g:470:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalQualityEffectSpecification.g:470:45: (iv_ruleRole= ruleRole EOF )
            // InternalQualityEffectSpecification.g:471:2: iv_ruleRole= ruleRole EOF
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
    // InternalQualityEffectSpecification.g:477:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleRoleType ) ) ( (lv_properties_3_0= ruleRoleProperty ) )+ otherlv_4= ')' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_not_1_0=null;
        Token otherlv_4=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:483:2: ( (otherlv_0= 'Role(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleRoleType ) ) ( (lv_properties_3_0= ruleRoleProperty ) )+ otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:484:2: (otherlv_0= 'Role(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleRoleType ) ) ( (lv_properties_3_0= ruleRoleProperty ) )+ otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:484:2: (otherlv_0= 'Role(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleRoleType ) ) ( (lv_properties_3_0= ruleRoleProperty ) )+ otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:485:3: otherlv_0= 'Role(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleRoleType ) ) ( (lv_properties_3_0= ruleRoleProperty ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalQualityEffectSpecification.g:489:3: ( (lv_not_1_0= 'Not' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQualityEffectSpecification.g:490:4: (lv_not_1_0= 'Not' )
                    {
                    // InternalQualityEffectSpecification.g:490:4: (lv_not_1_0= 'Not' )
                    // InternalQualityEffectSpecification.g:491:5: lv_not_1_0= 'Not'
                    {
                    lv_not_1_0=(Token)match(input,17,FOLLOW_17); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getRoleAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRoleRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "Not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:503:3: ( (lv_type_2_0= ruleRoleType ) )
            // InternalQualityEffectSpecification.g:504:4: (lv_type_2_0= ruleRoleType )
            {
            // InternalQualityEffectSpecification.g:504:4: (lv_type_2_0= ruleRoleType )
            // InternalQualityEffectSpecification.g:505:5: lv_type_2_0= ruleRoleType
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_2_0=ruleRoleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.RoleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:522:3: ( (lv_properties_3_0= ruleRoleProperty ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16||LA10_0==18||LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:523:4: (lv_properties_3_0= ruleRoleProperty )
            	    {
            	    // InternalQualityEffectSpecification.g:523:4: (lv_properties_3_0= ruleRoleProperty )
            	    // InternalQualityEffectSpecification.g:524:5: lv_properties_3_0= ruleRoleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_properties_3_0=ruleRoleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.RoleProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalQualityEffectSpecification.g:549:1: entryRuleRoleProperty returns [EObject current=null] : iv_ruleRoleProperty= ruleRoleProperty EOF ;
    public final EObject entryRuleRoleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleProperty = null;


        try {
            // InternalQualityEffectSpecification.g:549:53: (iv_ruleRoleProperty= ruleRoleProperty EOF )
            // InternalQualityEffectSpecification.g:550:2: iv_ruleRoleProperty= ruleRoleProperty EOF
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
    // InternalQualityEffectSpecification.g:556:1: ruleRoleProperty returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Interface_2= ruleInterface ) ;
    public final EObject ruleRoleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;

        EObject this_Interface_2 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:562:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Interface_2= ruleInterface ) )
            // InternalQualityEffectSpecification.g:563:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Interface_2= ruleInterface )
            {
            // InternalQualityEffectSpecification.g:563:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Interface_2= ruleInterface )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalQualityEffectSpecification.g:564:3: this_Name_0= ruleName
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
                    // InternalQualityEffectSpecification.g:573:3: this_Identifier_1= ruleIdentifier
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
                    // InternalQualityEffectSpecification.g:582:3: this_Interface_2= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getRolePropertyAccess().getInterfaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_2=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_2;
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


    // $ANTLR start "entryRuleInterface"
    // InternalQualityEffectSpecification.g:594:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalQualityEffectSpecification.g:594:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalQualityEffectSpecification.g:595:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalQualityEffectSpecification.g:601:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'Interface(' ( (lv_properties_1_0= ruleInterfaceProperty ) )+ otherlv_2= ')' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:607:2: ( (otherlv_0= 'Interface(' ( (lv_properties_1_0= ruleInterfaceProperty ) )+ otherlv_2= ')' ) )
            // InternalQualityEffectSpecification.g:608:2: (otherlv_0= 'Interface(' ( (lv_properties_1_0= ruleInterfaceProperty ) )+ otherlv_2= ')' )
            {
            // InternalQualityEffectSpecification.g:608:2: (otherlv_0= 'Interface(' ( (lv_properties_1_0= ruleInterfaceProperty ) )+ otherlv_2= ')' )
            // InternalQualityEffectSpecification.g:609:3: otherlv_0= 'Interface(' ( (lv_properties_1_0= ruleInterfaceProperty ) )+ otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalQualityEffectSpecification.g:613:3: ( (lv_properties_1_0= ruleInterfaceProperty ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16||LA12_0==18||LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:614:4: (lv_properties_1_0= ruleInterfaceProperty )
            	    {
            	    // InternalQualityEffectSpecification.g:614:4: (lv_properties_1_0= ruleInterfaceProperty )
            	    // InternalQualityEffectSpecification.g:615:5: lv_properties_1_0= ruleInterfaceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceAccess().getPropertiesInterfacePropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_properties_1_0=ruleInterfaceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.InterfaceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleInterfaceProperty"
    // InternalQualityEffectSpecification.g:640:1: entryRuleInterfaceProperty returns [EObject current=null] : iv_ruleInterfaceProperty= ruleInterfaceProperty EOF ;
    public final EObject entryRuleInterfaceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceProperty = null;


        try {
            // InternalQualityEffectSpecification.g:640:58: (iv_ruleInterfaceProperty= ruleInterfaceProperty EOF )
            // InternalQualityEffectSpecification.g:641:2: iv_ruleInterfaceProperty= ruleInterfaceProperty EOF
            {
             newCompositeNode(grammarAccess.getInterfacePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceProperty=ruleInterfaceProperty();

            state._fsp--;

             current =iv_ruleInterfaceProperty; 
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
    // $ANTLR end "entryRuleInterfaceProperty"


    // $ANTLR start "ruleInterfaceProperty"
    // InternalQualityEffectSpecification.g:647:1: ruleInterfaceProperty returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_MethodSignature_2= ruleMethodSignature ) ;
    public final EObject ruleInterfaceProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;

        EObject this_MethodSignature_2 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:653:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_MethodSignature_2= ruleMethodSignature ) )
            // InternalQualityEffectSpecification.g:654:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_MethodSignature_2= ruleMethodSignature )
            {
            // InternalQualityEffectSpecification.g:654:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_MethodSignature_2= ruleMethodSignature )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt13=1;
                }
                break;
            case 18:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalQualityEffectSpecification.g:655:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getInterfacePropertyAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current = this_Name_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:664:3: this_Identifier_1= ruleIdentifier
                    {

                    			newCompositeNode(grammarAccess.getInterfacePropertyAccess().getIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;


                    			current = this_Identifier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:673:3: this_MethodSignature_2= ruleMethodSignature
                    {

                    			newCompositeNode(grammarAccess.getInterfacePropertyAccess().getMethodSignatureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodSignature_2=ruleMethodSignature();

                    state._fsp--;


                    			current = this_MethodSignature_2;
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
    // $ANTLR end "ruleInterfaceProperty"


    // $ANTLR start "entryRuleMethodSignature"
    // InternalQualityEffectSpecification.g:685:1: entryRuleMethodSignature returns [EObject current=null] : iv_ruleMethodSignature= ruleMethodSignature EOF ;
    public final EObject entryRuleMethodSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodSignature = null;


        try {
            // InternalQualityEffectSpecification.g:685:56: (iv_ruleMethodSignature= ruleMethodSignature EOF )
            // InternalQualityEffectSpecification.g:686:2: iv_ruleMethodSignature= ruleMethodSignature EOF
            {
             newCompositeNode(grammarAccess.getMethodSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodSignature=ruleMethodSignature();

            state._fsp--;

             current =iv_ruleMethodSignature; 
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
    // $ANTLR end "entryRuleMethodSignature"


    // $ANTLR start "ruleMethodSignature"
    // InternalQualityEffectSpecification.g:692:1: ruleMethodSignature returns [EObject current=null] : (otherlv_0= 'Method(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_parameterTypes_3_0= RULE_STRING ) )* otherlv_4= ')' ) ;
    public final EObject ruleMethodSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_parameterTypes_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:698:2: ( (otherlv_0= 'Method(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_parameterTypes_3_0= RULE_STRING ) )* otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:699:2: (otherlv_0= 'Method(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_parameterTypes_3_0= RULE_STRING ) )* otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:699:2: (otherlv_0= 'Method(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_parameterTypes_3_0= RULE_STRING ) )* otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:700:3: otherlv_0= 'Method(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_parameterTypes_3_0= RULE_STRING ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodSignatureAccess().getMethodKeyword_0());
            		
            // InternalQualityEffectSpecification.g:704:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:705:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:705:4: (lv_name_1_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:706:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodSignatureAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodSignatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodSignatureAccess().getColonKeyword_2());
            		
            // InternalQualityEffectSpecification.g:726:3: ( (lv_parameterTypes_3_0= RULE_STRING ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:727:4: (lv_parameterTypes_3_0= RULE_STRING )
            	    {
            	    // InternalQualityEffectSpecification.g:727:4: (lv_parameterTypes_3_0= RULE_STRING )
            	    // InternalQualityEffectSpecification.g:728:5: lv_parameterTypes_3_0= RULE_STRING
            	    {
            	    lv_parameterTypes_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    					newLeafNode(lv_parameterTypes_3_0, grammarAccess.getMethodSignatureAccess().getParameterTypesSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMethodSignatureRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"parameterTypes",
            	    						lv_parameterTypes_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodSignatureAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleMethodSignature"


    // $ANTLR start "entryRuleAssembly"
    // InternalQualityEffectSpecification.g:752:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalQualityEffectSpecification.g:752:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalQualityEffectSpecification.g:753:2: iv_ruleAssembly= ruleAssembly EOF
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
    // InternalQualityEffectSpecification.g:759:1: ruleAssembly returns [EObject current=null] : (otherlv_0= 'Assembly(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleAssemblyType ) ) ( (lv_components_3_0= ruleComponentSpecification ) )+ otherlv_4= ')' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_not_1_0=null;
        Token otherlv_4=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_components_3_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:765:2: ( (otherlv_0= 'Assembly(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleAssemblyType ) ) ( (lv_components_3_0= ruleComponentSpecification ) )+ otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:766:2: (otherlv_0= 'Assembly(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleAssemblyType ) ) ( (lv_components_3_0= ruleComponentSpecification ) )+ otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:766:2: (otherlv_0= 'Assembly(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleAssemblyType ) ) ( (lv_components_3_0= ruleComponentSpecification ) )+ otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:767:3: otherlv_0= 'Assembly(' ( (lv_not_1_0= 'Not' ) )? ( (lv_type_2_0= ruleAssemblyType ) ) ( (lv_components_3_0= ruleComponentSpecification ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyAccess().getAssemblyKeyword_0());
            		
            // InternalQualityEffectSpecification.g:771:3: ( (lv_not_1_0= 'Not' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQualityEffectSpecification.g:772:4: (lv_not_1_0= 'Not' )
                    {
                    // InternalQualityEffectSpecification.g:772:4: (lv_not_1_0= 'Not' )
                    // InternalQualityEffectSpecification.g:773:5: lv_not_1_0= 'Not'
                    {
                    lv_not_1_0=(Token)match(input,17,FOLLOW_24); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssemblyRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "Not");
                    				

                    }


                    }
                    break;

            }

            // InternalQualityEffectSpecification.g:785:3: ( (lv_type_2_0= ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:786:4: (lv_type_2_0= ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:786:4: (lv_type_2_0= ruleAssemblyType )
            // InternalQualityEffectSpecification.g:787:5: lv_type_2_0= ruleAssemblyType
            {

            					newCompositeNode(grammarAccess.getAssemblyAccess().getTypeAssemblyTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_2_0=ruleAssemblyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.AssemblyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:804:3: ( (lv_components_3_0= ruleComponentSpecification ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:805:4: (lv_components_3_0= ruleComponentSpecification )
            	    {
            	    // InternalQualityEffectSpecification.g:805:4: (lv_components_3_0= ruleComponentSpecification )
            	    // InternalQualityEffectSpecification.g:806:5: lv_components_3_0= ruleComponentSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getAssemblyAccess().getComponentsComponentSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_components_3_0=ruleComponentSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_3_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentSpecification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalQualityEffectSpecification.g:831:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalQualityEffectSpecification.g:831:49: (iv_ruleResource= ruleResource EOF )
            // InternalQualityEffectSpecification.g:832:2: iv_ruleResource= ruleResource EOF
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
    // InternalQualityEffectSpecification.g:838:1: ruleResource returns [EObject current=null] : (otherlv_0= 'Resource(' ( (lv_properties_1_0= ruleResourceProperty ) )+ otherlv_2= ')' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:844:2: ( (otherlv_0= 'Resource(' ( (lv_properties_1_0= ruleResourceProperty ) )+ otherlv_2= ')' ) )
            // InternalQualityEffectSpecification.g:845:2: (otherlv_0= 'Resource(' ( (lv_properties_1_0= ruleResourceProperty ) )+ otherlv_2= ')' )
            {
            // InternalQualityEffectSpecification.g:845:2: (otherlv_0= 'Resource(' ( (lv_properties_1_0= ruleResourceProperty ) )+ otherlv_2= ')' )
            // InternalQualityEffectSpecification.g:846:3: otherlv_0= 'Resource(' ( (lv_properties_1_0= ruleResourceProperty ) )+ otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalQualityEffectSpecification.g:850:3: ( (lv_properties_1_0= ruleResourceProperty ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16||LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:851:4: (lv_properties_1_0= ruleResourceProperty )
            	    {
            	    // InternalQualityEffectSpecification.g:851:4: (lv_properties_1_0= ruleResourceProperty )
            	    // InternalQualityEffectSpecification.g:852:5: lv_properties_1_0= ruleResourceProperty
            	    {

            	    					newCompositeNode(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_properties_1_0=ruleResourceProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.ResourceProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalQualityEffectSpecification.g:877:1: entryRuleResourceProperty returns [EObject current=null] : iv_ruleResourceProperty= ruleResourceProperty EOF ;
    public final EObject entryRuleResourceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceProperty = null;


        try {
            // InternalQualityEffectSpecification.g:877:57: (iv_ruleResourceProperty= ruleResourceProperty EOF )
            // InternalQualityEffectSpecification.g:878:2: iv_ruleResourceProperty= ruleResourceProperty EOF
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
    // InternalQualityEffectSpecification.g:884:1: ruleResourceProperty returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier ) ;
    public final EObject ruleResourceProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:890:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier ) )
            // InternalQualityEffectSpecification.g:891:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier )
            {
            // InternalQualityEffectSpecification.g:891:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalQualityEffectSpecification.g:892:3: this_Name_0= ruleName
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
                    // InternalQualityEffectSpecification.g:901:3: this_Identifier_1= ruleIdentifier
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
    // InternalQualityEffectSpecification.g:913:1: entryRuleTransformationSpecification returns [EObject current=null] : iv_ruleTransformationSpecification= ruleTransformationSpecification EOF ;
    public final EObject entryRuleTransformationSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformationSpecification = null;


        try {
            // InternalQualityEffectSpecification.g:913:68: (iv_ruleTransformationSpecification= ruleTransformationSpecification EOF )
            // InternalQualityEffectSpecification.g:914:2: iv_ruleTransformationSpecification= ruleTransformationSpecification EOF
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
    // InternalQualityEffectSpecification.g:920:1: ruleTransformationSpecification returns [EObject current=null] : (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning | this_Cost_2= ruleCost ) ;
    public final EObject ruleTransformationSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_NQA_0 = null;

        EObject this_Reasoning_1 = null;

        EObject this_Cost_2 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:926:2: ( (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning | this_Cost_2= ruleCost ) )
            // InternalQualityEffectSpecification.g:927:2: (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning | this_Cost_2= ruleCost )
            {
            // InternalQualityEffectSpecification.g:927:2: (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning | this_Cost_2= ruleCost )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt19=1;
                }
                break;
            case 27:
                {
                alt19=2;
                }
                break;
            case 31:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalQualityEffectSpecification.g:928:3: this_NQA_0= ruleNQA
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
                    // InternalQualityEffectSpecification.g:937:3: this_Reasoning_1= ruleReasoning
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
                    // InternalQualityEffectSpecification.g:946:3: this_Cost_2= ruleCost
                    {

                    			newCompositeNode(grammarAccess.getTransformationSpecificationAccess().getCostParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cost_2=ruleCost();

                    state._fsp--;


                    			current = this_Cost_2;
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
    // InternalQualityEffectSpecification.g:958:1: entryRuleNQA returns [EObject current=null] : iv_ruleNQA= ruleNQA EOF ;
    public final EObject entryRuleNQA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNQA = null;


        try {
            // InternalQualityEffectSpecification.g:958:44: (iv_ruleNQA= ruleNQA EOF )
            // InternalQualityEffectSpecification.g:959:2: iv_ruleNQA= ruleNQA EOF
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
    // InternalQualityEffectSpecification.g:965:1: ruleNQA returns [EObject current=null] : (otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleTransformationType ) ) ( (lv_element_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleNQA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_quality_1_0=null;
        Token lv_element_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:971:2: ( (otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleTransformationType ) ) ( (lv_element_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:972:2: (otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleTransformationType ) ) ( (lv_element_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:972:2: (otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleTransformationType ) ) ( (lv_element_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:973:3: otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleTransformationType ) ) ( (lv_element_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNQAAccess().getNQAKeyword_0());
            		
            // InternalQualityEffectSpecification.g:977:3: ( (lv_quality_1_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:978:4: (lv_quality_1_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:978:4: (lv_quality_1_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:979:5: lv_quality_1_0= RULE_STRING
            {
            lv_quality_1_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_quality_1_0, grammarAccess.getNQAAccess().getQualitySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNQARule());
            					}
            					setWithLastConsumed(
            						current,
            						"quality",
            						lv_quality_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQualityEffectSpecification.g:995:3: ( (lv_type_2_0= ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:996:4: (lv_type_2_0= ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:996:4: (lv_type_2_0= ruleTransformationType )
            // InternalQualityEffectSpecification.g:997:5: lv_type_2_0= ruleTransformationType
            {

            					newCompositeNode(grammarAccess.getNQAAccess().getTypeTransformationTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_2_0=ruleTransformationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNQARule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.TransformationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:1014:3: ( (lv_element_3_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1015:4: (lv_element_3_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1015:4: (lv_element_3_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1016:5: lv_element_3_0= RULE_STRING
            {
            lv_element_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_element_3_0, grammarAccess.getNQAAccess().getElementSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNQARule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNQAAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalQualityEffectSpecification.g:1040:1: entryRuleReasoning returns [EObject current=null] : iv_ruleReasoning= ruleReasoning EOF ;
    public final EObject entryRuleReasoning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasoning = null;


        try {
            // InternalQualityEffectSpecification.g:1040:50: (iv_ruleReasoning= ruleReasoning EOF )
            // InternalQualityEffectSpecification.g:1041:2: iv_ruleReasoning= ruleReasoning EOF
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
    // InternalQualityEffectSpecification.g:1047:1: ruleReasoning returns [EObject current=null] : (otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= ')' ) ;
    public final EObject ruleReasoning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_quality_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1053:2: ( (otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:1054:2: (otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:1054:2: (otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:1055:3: otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getReasoningAccess().getReasoningKeyword_0());
            		
            // InternalQualityEffectSpecification.g:1059:3: ( (lv_quality_1_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1060:4: (lv_quality_1_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1060:4: (lv_quality_1_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1061:5: lv_quality_1_0= RULE_STRING
            {
            lv_quality_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_quality_1_0, grammarAccess.getReasoningAccess().getQualitySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReasoningRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quality",
            						lv_quality_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getReasoningAccess().getColonKeyword_2());
            		
            // InternalQualityEffectSpecification.g:1081:3: ( (lv_rules_3_0= ruleRule ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1082:4: (lv_rules_3_0= ruleRule )
            	    {
            	    // InternalQualityEffectSpecification.g:1082:4: (lv_rules_3_0= ruleRule )
            	    // InternalQualityEffectSpecification.g:1083:5: lv_rules_3_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReasoningRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReasoningAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalQualityEffectSpecification.g:1108:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalQualityEffectSpecification.g:1108:45: (iv_ruleRule= ruleRule EOF )
            // InternalQualityEffectSpecification.g:1109:2: iv_ruleRule= ruleRule EOF
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
    // InternalQualityEffectSpecification.g:1115:1: ruleRule returns [EObject current=null] : (otherlv_0= '(' ( (lv_qualities_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_entries_3_0= ruleEntry ) )+ otherlv_4= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_qualities_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1121:2: ( (otherlv_0= '(' ( (lv_qualities_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_entries_3_0= ruleEntry ) )+ otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:1122:2: (otherlv_0= '(' ( (lv_qualities_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_entries_3_0= ruleEntry ) )+ otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:1122:2: (otherlv_0= '(' ( (lv_qualities_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_entries_3_0= ruleEntry ) )+ otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:1123:3: otherlv_0= '(' ( (lv_qualities_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_entries_3_0= ruleEntry ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_0());
            		
            // InternalQualityEffectSpecification.g:1127:3: ( (lv_qualities_1_0= RULE_STRING ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1128:4: (lv_qualities_1_0= RULE_STRING )
            	    {
            	    // InternalQualityEffectSpecification.g:1128:4: (lv_qualities_1_0= RULE_STRING )
            	    // InternalQualityEffectSpecification.g:1129:5: lv_qualities_1_0= RULE_STRING
            	    {
            	    lv_qualities_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    					newLeafNode(lv_qualities_1_0, grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRuleRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"qualities",
            	    						lv_qualities_1_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_2=(Token)match(input,23,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
            		
            // InternalQualityEffectSpecification.g:1149:3: ( (lv_entries_3_0= ruleEntry ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1150:4: (lv_entries_3_0= ruleEntry )
            	    {
            	    // InternalQualityEffectSpecification.g:1150:4: (lv_entries_3_0= ruleEntry )
            	    // InternalQualityEffectSpecification.g:1151:5: lv_entries_3_0= ruleEntry
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_entries_3_0=ruleEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_3_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.Entry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalQualityEffectSpecification.g:1176:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalQualityEffectSpecification.g:1176:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalQualityEffectSpecification.g:1177:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalQualityEffectSpecification.g:1183:1: ruleEntry returns [EObject current=null] : (otherlv_0= '[' ( (lv_key_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ']' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1189:2: ( (otherlv_0= '[' ( (lv_key_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ']' ) )
            // InternalQualityEffectSpecification.g:1190:2: (otherlv_0= '[' ( (lv_key_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ']' )
            {
            // InternalQualityEffectSpecification.g:1190:2: (otherlv_0= '[' ( (lv_key_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ']' )
            // InternalQualityEffectSpecification.g:1191:3: otherlv_0= '[' ( (lv_key_1_0= RULE_STRING ) )+ otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEntryAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalQualityEffectSpecification.g:1195:3: ( (lv_key_1_0= RULE_STRING ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1196:4: (lv_key_1_0= RULE_STRING )
            	    {
            	    // InternalQualityEffectSpecification.g:1196:4: (lv_key_1_0= RULE_STRING )
            	    // InternalQualityEffectSpecification.g:1197:5: lv_key_1_0= RULE_STRING
            	    {
            	    lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    					newLeafNode(lv_key_1_0, grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEntryRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"key",
            	    						lv_key_1_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_2=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEntryAccess().getColonKeyword_2());
            		
            // InternalQualityEffectSpecification.g:1217:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalQualityEffectSpecification.g:1218:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:1218:4: (lv_value_3_0= RULE_STRING )
            // InternalQualityEffectSpecification.g:1219:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_value_3_0, grammarAccess.getEntryAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntryAccess().getRightSquareBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleCost"
    // InternalQualityEffectSpecification.g:1243:1: entryRuleCost returns [EObject current=null] : iv_ruleCost= ruleCost EOF ;
    public final EObject entryRuleCost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCost = null;


        try {
            // InternalQualityEffectSpecification.g:1243:45: (iv_ruleCost= ruleCost EOF )
            // InternalQualityEffectSpecification.g:1244:2: iv_ruleCost= ruleCost EOF
            {
             newCompositeNode(grammarAccess.getCostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCost=ruleCost();

            state._fsp--;

             current =iv_ruleCost; 
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
    // $ANTLR end "entryRuleCost"


    // $ANTLR start "ruleCost"
    // InternalQualityEffectSpecification.g:1250:1: ruleCost returns [EObject current=null] : (otherlv_0= 'Cost(' ( (lv_type_1_0= ruleTransformationType ) ) ( (lv_cost_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleCost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cost_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1256:2: ( (otherlv_0= 'Cost(' ( (lv_type_1_0= ruleTransformationType ) ) ( (lv_cost_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalQualityEffectSpecification.g:1257:2: (otherlv_0= 'Cost(' ( (lv_type_1_0= ruleTransformationType ) ) ( (lv_cost_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalQualityEffectSpecification.g:1257:2: (otherlv_0= 'Cost(' ( (lv_type_1_0= ruleTransformationType ) ) ( (lv_cost_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalQualityEffectSpecification.g:1258:3: otherlv_0= 'Cost(' ( (lv_type_1_0= ruleTransformationType ) ) ( (lv_cost_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getCostAccess().getCostKeyword_0());
            		
            // InternalQualityEffectSpecification.g:1262:3: ( (lv_type_1_0= ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:1263:4: (lv_type_1_0= ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:1263:4: (lv_type_1_0= ruleTransformationType )
            // InternalQualityEffectSpecification.g:1264:5: lv_type_1_0= ruleTransformationType
            {

            					newCompositeNode(grammarAccess.getCostAccess().getTypeTransformationTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_type_1_0=ruleTransformationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCostRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.TransformationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:1281:3: ( (lv_cost_2_0= RULE_INT ) )
            // InternalQualityEffectSpecification.g:1282:4: (lv_cost_2_0= RULE_INT )
            {
            // InternalQualityEffectSpecification.g:1282:4: (lv_cost_2_0= RULE_INT )
            // InternalQualityEffectSpecification.g:1283:5: lv_cost_2_0= RULE_INT
            {
            lv_cost_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_cost_2_0, grammarAccess.getCostAccess().getCostINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCostRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cost",
            						lv_cost_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCostAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleCost"


    // $ANTLR start "ruleComponentType"
    // InternalQualityEffectSpecification.g:1307:1: ruleComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'AnyComponentType' ) | (enumLiteral_1= 'Basic' ) | (enumLiteral_2= 'Composite' ) ) ;
    public final Enumerator ruleComponentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1313:2: ( ( (enumLiteral_0= 'AnyComponentType' ) | (enumLiteral_1= 'Basic' ) | (enumLiteral_2= 'Composite' ) ) )
            // InternalQualityEffectSpecification.g:1314:2: ( (enumLiteral_0= 'AnyComponentType' ) | (enumLiteral_1= 'Basic' ) | (enumLiteral_2= 'Composite' ) )
            {
            // InternalQualityEffectSpecification.g:1314:2: ( (enumLiteral_0= 'AnyComponentType' ) | (enumLiteral_1= 'Basic' ) | (enumLiteral_2= 'Composite' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt24=1;
                }
                break;
            case 33:
                {
                alt24=2;
                }
                break;
            case 34:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1315:3: (enumLiteral_0= 'AnyComponentType' )
                    {
                    // InternalQualityEffectSpecification.g:1315:3: (enumLiteral_0= 'AnyComponentType' )
                    // InternalQualityEffectSpecification.g:1316:4: enumLiteral_0= 'AnyComponentType'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1323:3: (enumLiteral_1= 'Basic' )
                    {
                    // InternalQualityEffectSpecification.g:1323:3: (enumLiteral_1= 'Basic' )
                    // InternalQualityEffectSpecification.g:1324:4: enumLiteral_1= 'Basic'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1331:3: (enumLiteral_2= 'Composite' )
                    {
                    // InternalQualityEffectSpecification.g:1331:3: (enumLiteral_2= 'Composite' )
                    // InternalQualityEffectSpecification.g:1332:4: enumLiteral_2= 'Composite'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:1342:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'AnyRoleType' ) | (enumLiteral_1= 'ComponentRequiredProvided' ) | (enumLiteral_2= 'ComponentRequired' ) | (enumLiteral_3= 'ComponentProvided' ) | (enumLiteral_4= 'InfrastructureRequiredProvided' ) | (enumLiteral_5= 'InfrastructureRequired' ) | (enumLiteral_6= 'InfrastructureProvided' ) ) ;
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
            // InternalQualityEffectSpecification.g:1348:2: ( ( (enumLiteral_0= 'AnyRoleType' ) | (enumLiteral_1= 'ComponentRequiredProvided' ) | (enumLiteral_2= 'ComponentRequired' ) | (enumLiteral_3= 'ComponentProvided' ) | (enumLiteral_4= 'InfrastructureRequiredProvided' ) | (enumLiteral_5= 'InfrastructureRequired' ) | (enumLiteral_6= 'InfrastructureProvided' ) ) )
            // InternalQualityEffectSpecification.g:1349:2: ( (enumLiteral_0= 'AnyRoleType' ) | (enumLiteral_1= 'ComponentRequiredProvided' ) | (enumLiteral_2= 'ComponentRequired' ) | (enumLiteral_3= 'ComponentProvided' ) | (enumLiteral_4= 'InfrastructureRequiredProvided' ) | (enumLiteral_5= 'InfrastructureRequired' ) | (enumLiteral_6= 'InfrastructureProvided' ) )
            {
            // InternalQualityEffectSpecification.g:1349:2: ( (enumLiteral_0= 'AnyRoleType' ) | (enumLiteral_1= 'ComponentRequiredProvided' ) | (enumLiteral_2= 'ComponentRequired' ) | (enumLiteral_3= 'ComponentProvided' ) | (enumLiteral_4= 'InfrastructureRequiredProvided' ) | (enumLiteral_5= 'InfrastructureRequired' ) | (enumLiteral_6= 'InfrastructureProvided' ) )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt25=1;
                }
                break;
            case 36:
                {
                alt25=2;
                }
                break;
            case 37:
                {
                alt25=3;
                }
                break;
            case 38:
                {
                alt25=4;
                }
                break;
            case 39:
                {
                alt25=5;
                }
                break;
            case 40:
                {
                alt25=6;
                }
                break;
            case 41:
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1350:3: (enumLiteral_0= 'AnyRoleType' )
                    {
                    // InternalQualityEffectSpecification.g:1350:3: (enumLiteral_0= 'AnyRoleType' )
                    // InternalQualityEffectSpecification.g:1351:4: enumLiteral_0= 'AnyRoleType'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1358:3: (enumLiteral_1= 'ComponentRequiredProvided' )
                    {
                    // InternalQualityEffectSpecification.g:1358:3: (enumLiteral_1= 'ComponentRequiredProvided' )
                    // InternalQualityEffectSpecification.g:1359:4: enumLiteral_1= 'ComponentRequiredProvided'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1366:3: (enumLiteral_2= 'ComponentRequired' )
                    {
                    // InternalQualityEffectSpecification.g:1366:3: (enumLiteral_2= 'ComponentRequired' )
                    // InternalQualityEffectSpecification.g:1367:4: enumLiteral_2= 'ComponentRequired'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:1374:3: (enumLiteral_3= 'ComponentProvided' )
                    {
                    // InternalQualityEffectSpecification.g:1374:3: (enumLiteral_3= 'ComponentProvided' )
                    // InternalQualityEffectSpecification.g:1375:4: enumLiteral_3= 'ComponentProvided'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:1382:3: (enumLiteral_4= 'InfrastructureRequiredProvided' )
                    {
                    // InternalQualityEffectSpecification.g:1382:3: (enumLiteral_4= 'InfrastructureRequiredProvided' )
                    // InternalQualityEffectSpecification.g:1383:4: enumLiteral_4= 'InfrastructureRequiredProvided'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:1390:3: (enumLiteral_5= 'InfrastructureRequired' )
                    {
                    // InternalQualityEffectSpecification.g:1390:3: (enumLiteral_5= 'InfrastructureRequired' )
                    // InternalQualityEffectSpecification.g:1391:4: enumLiteral_5= 'InfrastructureRequired'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:1398:3: (enumLiteral_6= 'InfrastructureProvided' )
                    {
                    // InternalQualityEffectSpecification.g:1398:3: (enumLiteral_6= 'InfrastructureProvided' )
                    // InternalQualityEffectSpecification.g:1399:4: enumLiteral_6= 'InfrastructureProvided'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:1409:1: ruleAssemblyType returns [Enumerator current=null] : ( (enumLiteral_0= 'AnyAssembly' ) | (enumLiteral_1= 'Required' ) | (enumLiteral_2= 'Provided' ) ) ;
    public final Enumerator ruleAssemblyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1415:2: ( ( (enumLiteral_0= 'AnyAssembly' ) | (enumLiteral_1= 'Required' ) | (enumLiteral_2= 'Provided' ) ) )
            // InternalQualityEffectSpecification.g:1416:2: ( (enumLiteral_0= 'AnyAssembly' ) | (enumLiteral_1= 'Required' ) | (enumLiteral_2= 'Provided' ) )
            {
            // InternalQualityEffectSpecification.g:1416:2: ( (enumLiteral_0= 'AnyAssembly' ) | (enumLiteral_1= 'Required' ) | (enumLiteral_2= 'Provided' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt26=1;
                }
                break;
            case 43:
                {
                alt26=2;
                }
                break;
            case 44:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1417:3: (enumLiteral_0= 'AnyAssembly' )
                    {
                    // InternalQualityEffectSpecification.g:1417:3: (enumLiteral_0= 'AnyAssembly' )
                    // InternalQualityEffectSpecification.g:1418:4: enumLiteral_0= 'AnyAssembly'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1425:3: (enumLiteral_1= 'Required' )
                    {
                    // InternalQualityEffectSpecification.g:1425:3: (enumLiteral_1= 'Required' )
                    // InternalQualityEffectSpecification.g:1426:4: enumLiteral_1= 'Required'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1433:3: (enumLiteral_2= 'Provided' )
                    {
                    // InternalQualityEffectSpecification.g:1433:3: (enumLiteral_2= 'Provided' )
                    // InternalQualityEffectSpecification.g:1434:4: enumLiteral_2= 'Provided'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:1444:1: ruleTransformationType returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) ) ;
    public final Enumerator ruleTransformationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1450:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) ) )
            // InternalQualityEffectSpecification.g:1451:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) )
            {
            // InternalQualityEffectSpecification.g:1451:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= '*' ) | (enumLiteral_4= '/' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt27=1;
                }
                break;
            case 46:
                {
                alt27=2;
                }
                break;
            case 47:
                {
                alt27=3;
                }
                break;
            case 48:
                {
                alt27=4;
                }
                break;
            case 49:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1452:3: (enumLiteral_0= '=' )
                    {
                    // InternalQualityEffectSpecification.g:1452:3: (enumLiteral_0= '=' )
                    // InternalQualityEffectSpecification.g:1453:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1460:3: (enumLiteral_1= '+' )
                    {
                    // InternalQualityEffectSpecification.g:1460:3: (enumLiteral_1= '+' )
                    // InternalQualityEffectSpecification.g:1461:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1468:3: (enumLiteral_2= '-' )
                    {
                    // InternalQualityEffectSpecification.g:1468:3: (enumLiteral_2= '-' )
                    // InternalQualityEffectSpecification.g:1469:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:1476:3: (enumLiteral_3= '*' )
                    {
                    // InternalQualityEffectSpecification.g:1476:3: (enumLiteral_3= '*' )
                    // InternalQualityEffectSpecification.g:1477:4: enumLiteral_3= '*'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:1484:3: (enumLiteral_4= '/' )
                    {
                    // InternalQualityEffectSpecification.g:1484:3: (enumLiteral_4= '/' )
                    // InternalQualityEffectSpecification.g:1485:4: enumLiteral_4= '/'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000008C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000008C001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000031D0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000031D8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000700020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000003F800020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000250000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000258000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000450000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000458000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00001C0000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});

}