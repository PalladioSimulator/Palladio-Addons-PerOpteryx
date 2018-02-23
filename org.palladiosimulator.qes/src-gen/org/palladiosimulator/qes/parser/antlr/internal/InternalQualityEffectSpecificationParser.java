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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Component('", "')'", "'Not('", "'Name('", "'Id('", "'Type('", "'Role('", "'Assembly('", "'NQA('", "'='", "'Reasoning('", "'{'", "'})'", "'('", "'['", "']'", "'basic'", "'composite'", "'required'", "'provided'", "'component'", "'infrastructure'", "'assembly'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalQualityEffectSpecification.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_components_0_0= ruleComponent ) )+ otherlv_1= ':' ( (lv_transformations_2_0= ruleTransformation ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_components_0_0 = null;

        EObject lv_transformations_2_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:78:2: ( ( ( (lv_components_0_0= ruleComponent ) )+ otherlv_1= ':' ( (lv_transformations_2_0= ruleTransformation ) )+ ) )
            // InternalQualityEffectSpecification.g:79:2: ( ( (lv_components_0_0= ruleComponent ) )+ otherlv_1= ':' ( (lv_transformations_2_0= ruleTransformation ) )+ )
            {
            // InternalQualityEffectSpecification.g:79:2: ( ( (lv_components_0_0= ruleComponent ) )+ otherlv_1= ':' ( (lv_transformations_2_0= ruleTransformation ) )+ )
            // InternalQualityEffectSpecification.g:80:3: ( (lv_components_0_0= ruleComponent ) )+ otherlv_1= ':' ( (lv_transformations_2_0= ruleTransformation ) )+
            {
            // InternalQualityEffectSpecification.g:80:3: ( (lv_components_0_0= ruleComponent ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:81:4: (lv_components_0_0= ruleComponent )
            	    {
            	    // InternalQualityEffectSpecification.g:81:4: (lv_components_0_0= ruleComponent )
            	    // InternalQualityEffectSpecification.g:82:5: lv_components_0_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_components_0_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_0_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.Component");
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

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_1());
            		
            // InternalQualityEffectSpecification.g:103:3: ( (lv_transformations_2_0= ruleTransformation ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20||LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:104:4: (lv_transformations_2_0= ruleTransformation )
            	    {
            	    // InternalQualityEffectSpecification.g:104:4: (lv_transformations_2_0= ruleTransformation )
            	    // InternalQualityEffectSpecification.g:105:5: lv_transformations_2_0= ruleTransformation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTransformationsTransformationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_transformations_2_0=ruleTransformation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transformations",
            	    						lv_transformations_2_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.Transformation");
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


    // $ANTLR start "entryRuleComponent"
    // InternalQualityEffectSpecification.g:126:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalQualityEffectSpecification.g:126:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalQualityEffectSpecification.g:127:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalQualityEffectSpecification.g:133:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component(' ( (lv_properties_1_0= rulePropertie ) )+ otherlv_2= ')' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:139:2: ( (otherlv_0= 'Component(' ( (lv_properties_1_0= rulePropertie ) )+ otherlv_2= ')' ) )
            // InternalQualityEffectSpecification.g:140:2: (otherlv_0= 'Component(' ( (lv_properties_1_0= rulePropertie ) )+ otherlv_2= ')' )
            {
            // InternalQualityEffectSpecification.g:140:2: (otherlv_0= 'Component(' ( (lv_properties_1_0= rulePropertie ) )+ otherlv_2= ')' )
            // InternalQualityEffectSpecification.g:141:3: otherlv_0= 'Component(' ( (lv_properties_1_0= rulePropertie ) )+ otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalQualityEffectSpecification.g:145:3: ( (lv_properties_1_0= rulePropertie ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:146:4: (lv_properties_1_0= rulePropertie )
            	    {
            	    // InternalQualityEffectSpecification.g:146:4: (lv_properties_1_0= rulePropertie )
            	    // InternalQualityEffectSpecification.g:147:5: lv_properties_1_0= rulePropertie
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getPropertiesPropertieParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_properties_1_0=rulePropertie();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.Propertie");
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

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePropertie"
    // InternalQualityEffectSpecification.g:172:1: entryRulePropertie returns [EObject current=null] : iv_rulePropertie= rulePropertie EOF ;
    public final EObject entryRulePropertie() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertie = null;


        try {
            // InternalQualityEffectSpecification.g:172:50: (iv_rulePropertie= rulePropertie EOF )
            // InternalQualityEffectSpecification.g:173:2: iv_rulePropertie= rulePropertie EOF
            {
             newCompositeNode(grammarAccess.getPropertieRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertie=rulePropertie();

            state._fsp--;

             current =iv_rulePropertie; 
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
    // $ANTLR end "entryRulePropertie"


    // $ANTLR start "rulePropertie"
    // InternalQualityEffectSpecification.g:179:1: rulePropertie returns [EObject current=null] : (this_Negation_0= ruleNegation | this_ComponentPropertie_1= ruleComponentPropertie ) ;
    public final EObject rulePropertie() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_ComponentPropertie_1 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:185:2: ( (this_Negation_0= ruleNegation | this_ComponentPropertie_1= ruleComponentPropertie ) )
            // InternalQualityEffectSpecification.g:186:2: (this_Negation_0= ruleNegation | this_ComponentPropertie_1= ruleComponentPropertie )
            {
            // InternalQualityEffectSpecification.g:186:2: (this_Negation_0= ruleNegation | this_ComponentPropertie_1= ruleComponentPropertie )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=19)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQualityEffectSpecification.g:187:3: this_Negation_0= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getPropertieAccess().getNegationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_0=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:196:3: this_ComponentPropertie_1= ruleComponentPropertie
                    {

                    			newCompositeNode(grammarAccess.getPropertieAccess().getComponentPropertieParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentPropertie_1=ruleComponentPropertie();

                    state._fsp--;


                    			current = this_ComponentPropertie_1;
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
    // $ANTLR end "rulePropertie"


    // $ANTLR start "entryRuleNegation"
    // InternalQualityEffectSpecification.g:208:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalQualityEffectSpecification.g:208:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalQualityEffectSpecification.g:209:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalQualityEffectSpecification.g:215:1: ruleNegation returns [EObject current=null] : (otherlv_0= 'Not(' ( (lv_propertie_1_0= ruleComponentPropertie ) ) otherlv_2= ')' ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_propertie_1_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:221:2: ( (otherlv_0= 'Not(' ( (lv_propertie_1_0= ruleComponentPropertie ) ) otherlv_2= ')' ) )
            // InternalQualityEffectSpecification.g:222:2: (otherlv_0= 'Not(' ( (lv_propertie_1_0= ruleComponentPropertie ) ) otherlv_2= ')' )
            {
            // InternalQualityEffectSpecification.g:222:2: (otherlv_0= 'Not(' ( (lv_propertie_1_0= ruleComponentPropertie ) ) otherlv_2= ')' )
            // InternalQualityEffectSpecification.g:223:3: otherlv_0= 'Not(' ( (lv_propertie_1_0= ruleComponentPropertie ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNotKeyword_0());
            		
            // InternalQualityEffectSpecification.g:227:3: ( (lv_propertie_1_0= ruleComponentPropertie ) )
            // InternalQualityEffectSpecification.g:228:4: (lv_propertie_1_0= ruleComponentPropertie )
            {
            // InternalQualityEffectSpecification.g:228:4: (lv_propertie_1_0= ruleComponentPropertie )
            // InternalQualityEffectSpecification.g:229:5: lv_propertie_1_0= ruleComponentPropertie
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getPropertieComponentPropertieParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_propertie_1_0=ruleComponentPropertie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationRule());
            					}
            					set(
            						current,
            						"propertie",
            						lv_propertie_1_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentPropertie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNegationAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleComponentPropertie"
    // InternalQualityEffectSpecification.g:254:1: entryRuleComponentPropertie returns [EObject current=null] : iv_ruleComponentPropertie= ruleComponentPropertie EOF ;
    public final EObject entryRuleComponentPropertie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentPropertie = null;


        try {
            // InternalQualityEffectSpecification.g:254:59: (iv_ruleComponentPropertie= ruleComponentPropertie EOF )
            // InternalQualityEffectSpecification.g:255:2: iv_ruleComponentPropertie= ruleComponentPropertie EOF
            {
             newCompositeNode(grammarAccess.getComponentPropertieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentPropertie=ruleComponentPropertie();

            state._fsp--;

             current =iv_ruleComponentPropertie; 
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
    // $ANTLR end "entryRuleComponentPropertie"


    // $ANTLR start "ruleComponentPropertie"
    // InternalQualityEffectSpecification.g:261:1: ruleComponentPropertie returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Type_2= ruleType | this_Role_3= ruleRole | this_Assembly_4= ruleAssembly ) ;
    public final EObject ruleComponentPropertie() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;

        EObject this_Type_2 = null;

        EObject this_Role_3 = null;

        EObject this_Assembly_4 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:267:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Type_2= ruleType | this_Role_3= ruleRole | this_Assembly_4= ruleAssembly ) )
            // InternalQualityEffectSpecification.g:268:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Type_2= ruleType | this_Role_3= ruleRole | this_Assembly_4= ruleAssembly )
            {
            // InternalQualityEffectSpecification.g:268:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier | this_Type_2= ruleType | this_Role_3= ruleRole | this_Assembly_4= ruleAssembly )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQualityEffectSpecification.g:269:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertieAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current = this_Name_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:278:3: this_Identifier_1= ruleIdentifier
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertieAccess().getIdentifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Identifier_1=ruleIdentifier();

                    state._fsp--;


                    			current = this_Identifier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:287:3: this_Type_2= ruleType
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertieAccess().getTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_2=ruleType();

                    state._fsp--;


                    			current = this_Type_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:296:3: this_Role_3= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertieAccess().getRoleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_3=ruleRole();

                    state._fsp--;


                    			current = this_Role_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:305:3: this_Assembly_4= ruleAssembly
                    {

                    			newCompositeNode(grammarAccess.getComponentPropertieAccess().getAssemblyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assembly_4=ruleAssembly();

                    state._fsp--;


                    			current = this_Assembly_4;
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
    // $ANTLR end "ruleComponentPropertie"


    // $ANTLR start "entryRuleName"
    // InternalQualityEffectSpecification.g:317:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalQualityEffectSpecification.g:317:45: (iv_ruleName= ruleName EOF )
            // InternalQualityEffectSpecification.g:318:2: iv_ruleName= ruleName EOF
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
    // InternalQualityEffectSpecification.g:324:1: ruleName returns [EObject current=null] : (otherlv_0= 'Name(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:330:2: ( (otherlv_0= 'Name(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) )
            // InternalQualityEffectSpecification.g:331:2: (otherlv_0= 'Name(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            {
            // InternalQualityEffectSpecification.g:331:2: (otherlv_0= 'Name(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            // InternalQualityEffectSpecification.g:332:3: otherlv_0= 'Name(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
            		
            // InternalQualityEffectSpecification.g:336:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:337:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:337:4: (lv_name_1_0= RULE_ID )
            // InternalQualityEffectSpecification.g:338:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNameAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalQualityEffectSpecification.g:362:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalQualityEffectSpecification.g:362:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalQualityEffectSpecification.g:363:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalQualityEffectSpecification.g:369:1: ruleIdentifier returns [EObject current=null] : (otherlv_0= 'Id(' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:375:2: ( (otherlv_0= 'Id(' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= ')' ) )
            // InternalQualityEffectSpecification.g:376:2: (otherlv_0= 'Id(' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= ')' )
            {
            // InternalQualityEffectSpecification.g:376:2: (otherlv_0= 'Id(' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= ')' )
            // InternalQualityEffectSpecification.g:377:3: otherlv_0= 'Id(' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdKeyword_0());
            		
            // InternalQualityEffectSpecification.g:381:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:382:4: (lv_id_1_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:382:4: (lv_id_1_0= RULE_ID )
            // InternalQualityEffectSpecification.g:383:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_id_1_0, grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalQualityEffectSpecification.g:407:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalQualityEffectSpecification.g:407:45: (iv_ruleType= ruleType EOF )
            // InternalQualityEffectSpecification.g:408:2: iv_ruleType= ruleType EOF
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
    // InternalQualityEffectSpecification.g:414:1: ruleType returns [EObject current=null] : (otherlv_0= 'Type(' ( (lv_type_1_0= ruleComponentType ) ) otherlv_2= ')' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:420:2: ( (otherlv_0= 'Type(' ( (lv_type_1_0= ruleComponentType ) ) otherlv_2= ')' ) )
            // InternalQualityEffectSpecification.g:421:2: (otherlv_0= 'Type(' ( (lv_type_1_0= ruleComponentType ) ) otherlv_2= ')' )
            {
            // InternalQualityEffectSpecification.g:421:2: (otherlv_0= 'Type(' ( (lv_type_1_0= ruleComponentType ) ) otherlv_2= ')' )
            // InternalQualityEffectSpecification.g:422:3: otherlv_0= 'Type(' ( (lv_type_1_0= ruleComponentType ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalQualityEffectSpecification.g:426:3: ( (lv_type_1_0= ruleComponentType ) )
            // InternalQualityEffectSpecification.g:427:4: (lv_type_1_0= ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:427:4: (lv_type_1_0= ruleComponentType )
            // InternalQualityEffectSpecification.g:428:5: lv_type_1_0= ruleComponentType
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_1_0=ruleComponentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.ComponentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2());
            		

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
    // InternalQualityEffectSpecification.g:453:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalQualityEffectSpecification.g:453:45: (iv_ruleRole= ruleRole EOF )
            // InternalQualityEffectSpecification.g:454:2: iv_ruleRole= ruleRole EOF
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
    // InternalQualityEffectSpecification.g:460:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role(' ( (lv_types_1_0= ruleRoleType ) )+ ( (lv_properties_2_0= ruleRolePropertie ) )+ otherlv_3= ')' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_types_1_0 = null;

        EObject lv_properties_2_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:466:2: ( (otherlv_0= 'Role(' ( (lv_types_1_0= ruleRoleType ) )+ ( (lv_properties_2_0= ruleRolePropertie ) )+ otherlv_3= ')' ) )
            // InternalQualityEffectSpecification.g:467:2: (otherlv_0= 'Role(' ( (lv_types_1_0= ruleRoleType ) )+ ( (lv_properties_2_0= ruleRolePropertie ) )+ otherlv_3= ')' )
            {
            // InternalQualityEffectSpecification.g:467:2: (otherlv_0= 'Role(' ( (lv_types_1_0= ruleRoleType ) )+ ( (lv_properties_2_0= ruleRolePropertie ) )+ otherlv_3= ')' )
            // InternalQualityEffectSpecification.g:468:3: otherlv_0= 'Role(' ( (lv_types_1_0= ruleRoleType ) )+ ( (lv_properties_2_0= ruleRolePropertie ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalQualityEffectSpecification.g:472:3: ( (lv_types_1_0= ruleRoleType ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=30 && LA6_0<=33)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:473:4: (lv_types_1_0= ruleRoleType )
            	    {
            	    // InternalQualityEffectSpecification.g:473:4: (lv_types_1_0= ruleRoleType )
            	    // InternalQualityEffectSpecification.g:474:5: lv_types_1_0= ruleRoleType
            	    {

            	    					newCompositeNode(grammarAccess.getRoleAccess().getTypesRoleTypeEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_types_1_0=ruleRoleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_1_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.RoleType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalQualityEffectSpecification.g:491:3: ( (lv_properties_2_0= ruleRolePropertie ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=15 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:492:4: (lv_properties_2_0= ruleRolePropertie )
            	    {
            	    // InternalQualityEffectSpecification.g:492:4: (lv_properties_2_0= ruleRolePropertie )
            	    // InternalQualityEffectSpecification.g:493:5: lv_properties_2_0= ruleRolePropertie
            	    {

            	    					newCompositeNode(grammarAccess.getRoleAccess().getPropertiesRolePropertieParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_properties_2_0=ruleRolePropertie();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_2_0,
            	    						"org.palladiosimulator.qes.QualityEffectSpecification.RolePropertie");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleRolePropertie"
    // InternalQualityEffectSpecification.g:518:1: entryRuleRolePropertie returns [EObject current=null] : iv_ruleRolePropertie= ruleRolePropertie EOF ;
    public final EObject entryRuleRolePropertie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolePropertie = null;


        try {
            // InternalQualityEffectSpecification.g:518:54: (iv_ruleRolePropertie= ruleRolePropertie EOF )
            // InternalQualityEffectSpecification.g:519:2: iv_ruleRolePropertie= ruleRolePropertie EOF
            {
             newCompositeNode(grammarAccess.getRolePropertieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRolePropertie=ruleRolePropertie();

            state._fsp--;

             current =iv_ruleRolePropertie; 
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
    // $ANTLR end "entryRuleRolePropertie"


    // $ANTLR start "ruleRolePropertie"
    // InternalQualityEffectSpecification.g:525:1: ruleRolePropertie returns [EObject current=null] : (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier ) ;
    public final EObject ruleRolePropertie() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Identifier_1 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:531:2: ( (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier ) )
            // InternalQualityEffectSpecification.g:532:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier )
            {
            // InternalQualityEffectSpecification.g:532:2: (this_Name_0= ruleName | this_Identifier_1= ruleIdentifier )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQualityEffectSpecification.g:533:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getRolePropertieAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current = this_Name_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:542:3: this_Identifier_1= ruleIdentifier
                    {

                    			newCompositeNode(grammarAccess.getRolePropertieAccess().getIdentifierParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleRolePropertie"


    // $ANTLR start "entryRuleAssembly"
    // InternalQualityEffectSpecification.g:554:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalQualityEffectSpecification.g:554:49: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalQualityEffectSpecification.g:555:2: iv_ruleAssembly= ruleAssembly EOF
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
    // InternalQualityEffectSpecification.g:561:1: ruleAssembly returns [EObject current=null] : (otherlv_0= 'Assembly(' ( (lv_assemblyType_1_0= ruleAssemblyType ) ) ( (lv_assemblyComponent_2_0= ruleComponent ) ) otherlv_3= ')' ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_assemblyType_1_0 = null;

        EObject lv_assemblyComponent_2_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:567:2: ( (otherlv_0= 'Assembly(' ( (lv_assemblyType_1_0= ruleAssemblyType ) ) ( (lv_assemblyComponent_2_0= ruleComponent ) ) otherlv_3= ')' ) )
            // InternalQualityEffectSpecification.g:568:2: (otherlv_0= 'Assembly(' ( (lv_assemblyType_1_0= ruleAssemblyType ) ) ( (lv_assemblyComponent_2_0= ruleComponent ) ) otherlv_3= ')' )
            {
            // InternalQualityEffectSpecification.g:568:2: (otherlv_0= 'Assembly(' ( (lv_assemblyType_1_0= ruleAssemblyType ) ) ( (lv_assemblyComponent_2_0= ruleComponent ) ) otherlv_3= ')' )
            // InternalQualityEffectSpecification.g:569:3: otherlv_0= 'Assembly(' ( (lv_assemblyType_1_0= ruleAssemblyType ) ) ( (lv_assemblyComponent_2_0= ruleComponent ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyAccess().getAssemblyKeyword_0());
            		
            // InternalQualityEffectSpecification.g:573:3: ( (lv_assemblyType_1_0= ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:574:4: (lv_assemblyType_1_0= ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:574:4: (lv_assemblyType_1_0= ruleAssemblyType )
            // InternalQualityEffectSpecification.g:575:5: lv_assemblyType_1_0= ruleAssemblyType
            {

            					newCompositeNode(grammarAccess.getAssemblyAccess().getAssemblyTypeAssemblyTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_assemblyType_1_0=ruleAssemblyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            					}
            					set(
            						current,
            						"assemblyType",
            						lv_assemblyType_1_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.AssemblyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQualityEffectSpecification.g:592:3: ( (lv_assemblyComponent_2_0= ruleComponent ) )
            // InternalQualityEffectSpecification.g:593:4: (lv_assemblyComponent_2_0= ruleComponent )
            {
            // InternalQualityEffectSpecification.g:593:4: (lv_assemblyComponent_2_0= ruleComponent )
            // InternalQualityEffectSpecification.g:594:5: lv_assemblyComponent_2_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getAssemblyAccess().getAssemblyComponentComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_assemblyComponent_2_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyRule());
            					}
            					set(
            						current,
            						"assemblyComponent",
            						lv_assemblyComponent_2_0,
            						"org.palladiosimulator.qes.QualityEffectSpecification.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleTransformation"
    // InternalQualityEffectSpecification.g:619:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // InternalQualityEffectSpecification.g:619:55: (iv_ruleTransformation= ruleTransformation EOF )
            // InternalQualityEffectSpecification.g:620:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalQualityEffectSpecification.g:626:1: ruleTransformation returns [EObject current=null] : (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        EObject this_NQA_0 = null;

        EObject this_Reasoning_1 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:632:2: ( (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning ) )
            // InternalQualityEffectSpecification.g:633:2: (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning )
            {
            // InternalQualityEffectSpecification.g:633:2: (this_NQA_0= ruleNQA | this_Reasoning_1= ruleReasoning )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQualityEffectSpecification.g:634:3: this_NQA_0= ruleNQA
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getNQAParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NQA_0=ruleNQA();

                    state._fsp--;


                    			current = this_NQA_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:643:3: this_Reasoning_1= ruleReasoning
                    {

                    			newCompositeNode(grammarAccess.getTransformationAccess().getReasoningParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reasoning_1=ruleReasoning();

                    state._fsp--;


                    			current = this_Reasoning_1;
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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleNQA"
    // InternalQualityEffectSpecification.g:655:1: entryRuleNQA returns [EObject current=null] : iv_ruleNQA= ruleNQA EOF ;
    public final EObject entryRuleNQA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNQA = null;


        try {
            // InternalQualityEffectSpecification.g:655:44: (iv_ruleNQA= ruleNQA EOF )
            // InternalQualityEffectSpecification.g:656:2: iv_ruleNQA= ruleNQA EOF
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
    // InternalQualityEffectSpecification.g:662:1: ruleNQA returns [EObject current=null] : (otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_element_3_0= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleNQA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_quality_1_0=null;
        Token otherlv_2=null;
        Token lv_element_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:668:2: ( (otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_element_3_0= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:669:2: (otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_element_3_0= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:669:2: (otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_element_3_0= RULE_ID ) ) otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:670:3: otherlv_0= 'NQA(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_element_3_0= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getNQAAccess().getNQAKeyword_0());
            		
            // InternalQualityEffectSpecification.g:674:3: ( (lv_quality_1_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:675:4: (lv_quality_1_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:675:4: (lv_quality_1_0= RULE_ID )
            // InternalQualityEffectSpecification.g:676:5: lv_quality_1_0= RULE_ID
            {
            lv_quality_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_quality_1_0, grammarAccess.getNQAAccess().getQualityIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNQARule());
            					}
            					setWithLastConsumed(
            						current,
            						"quality",
            						lv_quality_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getNQAAccess().getEqualsSignKeyword_2());
            		
            // InternalQualityEffectSpecification.g:696:3: ( (lv_element_3_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:697:4: (lv_element_3_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:697:4: (lv_element_3_0= RULE_ID )
            // InternalQualityEffectSpecification.g:698:5: lv_element_3_0= RULE_ID
            {
            lv_element_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_element_3_0, grammarAccess.getNQAAccess().getElementIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNQARule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:722:1: entryRuleReasoning returns [EObject current=null] : iv_ruleReasoning= ruleReasoning EOF ;
    public final EObject entryRuleReasoning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReasoning = null;


        try {
            // InternalQualityEffectSpecification.g:722:50: (iv_ruleReasoning= ruleReasoning EOF )
            // InternalQualityEffectSpecification.g:723:2: iv_ruleReasoning= ruleReasoning EOF
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
    // InternalQualityEffectSpecification.g:729:1: ruleReasoning returns [EObject current=null] : (otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= '})' ) ;
    public final EObject ruleReasoning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_quality_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:735:2: ( (otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= '})' ) )
            // InternalQualityEffectSpecification.g:736:2: (otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= '})' )
            {
            // InternalQualityEffectSpecification.g:736:2: (otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= '})' )
            // InternalQualityEffectSpecification.g:737:3: otherlv_0= 'Reasoning(' ( (lv_quality_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleRule ) )+ otherlv_4= '})'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReasoningAccess().getReasoningKeyword_0());
            		
            // InternalQualityEffectSpecification.g:741:3: ( (lv_quality_1_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:742:4: (lv_quality_1_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:742:4: (lv_quality_1_0= RULE_ID )
            // InternalQualityEffectSpecification.g:743:5: lv_quality_1_0= RULE_ID
            {
            lv_quality_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_quality_1_0, grammarAccess.getReasoningAccess().getQualityIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReasoningRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quality",
            						lv_quality_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getReasoningAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQualityEffectSpecification.g:763:3: ( (lv_rules_3_0= ruleRule ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:764:4: (lv_rules_3_0= ruleRule )
            	    {
            	    // InternalQualityEffectSpecification.g:764:4: (lv_rules_3_0= ruleRule )
            	    // InternalQualityEffectSpecification.g:765:5: lv_rules_3_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReasoningAccess().getRightCurlyBracketRightParenthesisKeyword_4());
            		

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
    // InternalQualityEffectSpecification.g:790:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalQualityEffectSpecification.g:790:45: (iv_ruleRule= ruleRule EOF )
            // InternalQualityEffectSpecification.g:791:2: iv_ruleRule= ruleRule EOF
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
    // InternalQualityEffectSpecification.g:797:1: ruleRule returns [EObject current=null] : (otherlv_0= '(' ( (lv_qualities_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_entries_3_0= ruleEntry ) ) otherlv_4= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_qualities_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:803:2: ( (otherlv_0= '(' ( (lv_qualities_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_entries_3_0= ruleEntry ) ) otherlv_4= ')' ) )
            // InternalQualityEffectSpecification.g:804:2: (otherlv_0= '(' ( (lv_qualities_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_entries_3_0= ruleEntry ) ) otherlv_4= ')' )
            {
            // InternalQualityEffectSpecification.g:804:2: (otherlv_0= '(' ( (lv_qualities_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_entries_3_0= ruleEntry ) ) otherlv_4= ')' )
            // InternalQualityEffectSpecification.g:805:3: otherlv_0= '(' ( (lv_qualities_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_entries_3_0= ruleEntry ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_0());
            		
            // InternalQualityEffectSpecification.g:809:3: ( (lv_qualities_1_0= RULE_ID ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:810:4: (lv_qualities_1_0= RULE_ID )
            	    {
            	    // InternalQualityEffectSpecification.g:810:4: (lv_qualities_1_0= RULE_ID )
            	    // InternalQualityEffectSpecification.g:811:5: lv_qualities_1_0= RULE_ID
            	    {
            	    lv_qualities_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    					newLeafNode(lv_qualities_1_0, grammarAccess.getRuleAccess().getQualitiesIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRuleRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"qualities",
            	    						lv_qualities_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_2=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalQualityEffectSpecification.g:831:3: ( (lv_entries_3_0= ruleEntry ) )
            // InternalQualityEffectSpecification.g:832:4: (lv_entries_3_0= ruleEntry )
            {
            // InternalQualityEffectSpecification.g:832:4: (lv_entries_3_0= ruleEntry )
            // InternalQualityEffectSpecification.g:833:5: lv_entries_3_0= ruleEntry
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:858:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalQualityEffectSpecification.g:858:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalQualityEffectSpecification.g:859:2: iv_ruleEntry= ruleEntry EOF
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
    // InternalQualityEffectSpecification.g:865:1: ruleEntry returns [EObject current=null] : (otherlv_0= '[' ( (lv_key_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:871:2: ( (otherlv_0= '[' ( (lv_key_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' ) )
            // InternalQualityEffectSpecification.g:872:2: (otherlv_0= '[' ( (lv_key_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' )
            {
            // InternalQualityEffectSpecification.g:872:2: (otherlv_0= '[' ( (lv_key_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' )
            // InternalQualityEffectSpecification.g:873:3: otherlv_0= '[' ( (lv_key_1_0= RULE_ID ) )+ otherlv_2= '=' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEntryAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalQualityEffectSpecification.g:877:3: ( (lv_key_1_0= RULE_ID ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:878:4: (lv_key_1_0= RULE_ID )
            	    {
            	    // InternalQualityEffectSpecification.g:878:4: (lv_key_1_0= RULE_ID )
            	    // InternalQualityEffectSpecification.g:879:5: lv_key_1_0= RULE_ID
            	    {
            	    lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    					newLeafNode(lv_key_1_0, grammarAccess.getEntryAccess().getKeyIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEntryRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"key",
            	    						lv_key_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

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

            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEntryAccess().getEqualsSignKeyword_2());
            		
            // InternalQualityEffectSpecification.g:899:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:900:4: (lv_value_3_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:900:4: (lv_value_3_0= RULE_ID )
            // InternalQualityEffectSpecification.g:901:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_value_3_0, grammarAccess.getEntryAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "ruleComponentType"
    // InternalQualityEffectSpecification.g:925:1: ruleComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'basic' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleComponentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:931:2: ( ( (enumLiteral_0= 'basic' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalQualityEffectSpecification.g:932:2: ( (enumLiteral_0= 'basic' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalQualityEffectSpecification.g:932:2: ( (enumLiteral_0= 'basic' ) | (enumLiteral_1= 'composite' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalQualityEffectSpecification.g:933:3: (enumLiteral_0= 'basic' )
                    {
                    // InternalQualityEffectSpecification.g:933:3: (enumLiteral_0= 'basic' )
                    // InternalQualityEffectSpecification.g:934:4: enumLiteral_0= 'basic'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:941:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalQualityEffectSpecification.g:941:3: (enumLiteral_1= 'composite' )
                    // InternalQualityEffectSpecification.g:942:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1());
                    			

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
    // InternalQualityEffectSpecification.g:952:1: ruleRoleType returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'component' ) | (enumLiteral_3= 'infrastructure' ) ) ;
    public final Enumerator ruleRoleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:958:2: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'component' ) | (enumLiteral_3= 'infrastructure' ) ) )
            // InternalQualityEffectSpecification.g:959:2: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'component' ) | (enumLiteral_3= 'infrastructure' ) )
            {
            // InternalQualityEffectSpecification.g:959:2: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'component' ) | (enumLiteral_3= 'infrastructure' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalQualityEffectSpecification.g:960:3: (enumLiteral_0= 'required' )
                    {
                    // InternalQualityEffectSpecification.g:960:3: (enumLiteral_0= 'required' )
                    // InternalQualityEffectSpecification.g:961:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleTypeAccess().getREQUIREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:968:3: (enumLiteral_1= 'provided' )
                    {
                    // InternalQualityEffectSpecification.g:968:3: (enumLiteral_1= 'provided' )
                    // InternalQualityEffectSpecification.g:969:4: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoleTypeAccess().getPROVIDEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:976:3: (enumLiteral_2= 'component' )
                    {
                    // InternalQualityEffectSpecification.g:976:3: (enumLiteral_2= 'component' )
                    // InternalQualityEffectSpecification.g:977:4: enumLiteral_2= 'component'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getCOMPONENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRoleTypeAccess().getCOMPONENTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:984:3: (enumLiteral_3= 'infrastructure' )
                    {
                    // InternalQualityEffectSpecification.g:984:3: (enumLiteral_3= 'infrastructure' )
                    // InternalQualityEffectSpecification.g:985:4: enumLiteral_3= 'infrastructure'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getRoleTypeAccess().getINFRASTRUCTUREEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRoleTypeAccess().getINFRASTRUCTUREEnumLiteralDeclaration_3());
                    			

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
    // InternalQualityEffectSpecification.g:995:1: ruleAssemblyType returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'assembly' ) ) ;
    public final Enumerator ruleAssemblyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:1001:2: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'assembly' ) ) )
            // InternalQualityEffectSpecification.g:1002:2: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'assembly' ) )
            {
            // InternalQualityEffectSpecification.g:1002:2: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) | (enumLiteral_2= 'assembly' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 34:
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
                    // InternalQualityEffectSpecification.g:1003:3: (enumLiteral_0= 'required' )
                    {
                    // InternalQualityEffectSpecification.g:1003:3: (enumLiteral_0= 'required' )
                    // InternalQualityEffectSpecification.g:1004:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1011:3: (enumLiteral_1= 'provided' )
                    {
                    // InternalQualityEffectSpecification.g:1011:3: (enumLiteral_1= 'provided' )
                    // InternalQualityEffectSpecification.g:1012:4: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:1019:3: (enumLiteral_2= 'assembly' )
                    {
                    // InternalQualityEffectSpecification.g:1019:3: (enumLiteral_2= 'assembly' )
                    // InternalQualityEffectSpecification.g:1020:4: enumLiteral_2= 'assembly'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getAssemblyTypeAccess().getASSEMBLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAssemblyTypeAccess().getASSEMBLYEnumLiteralDeclaration_2());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000003C0018000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000004C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});

}