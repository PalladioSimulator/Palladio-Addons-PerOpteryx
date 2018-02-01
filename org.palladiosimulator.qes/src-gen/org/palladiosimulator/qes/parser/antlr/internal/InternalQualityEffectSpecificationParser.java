package org.palladiosimulator.qes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Find'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

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
    // InternalQualityEffectSpecification.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalQualityEffectSpecification.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalQualityEffectSpecification.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalQualityEffectSpecification.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleFindByName ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:77:2: ( ( (lv_elements_0_0= ruleFindByName ) )+ )
            // InternalQualityEffectSpecification.g:78:2: ( (lv_elements_0_0= ruleFindByName ) )+
            {
            // InternalQualityEffectSpecification.g:78:2: ( (lv_elements_0_0= ruleFindByName ) )+
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
            	    // InternalQualityEffectSpecification.g:79:3: (lv_elements_0_0= ruleFindByName )
            	    {
            	    // InternalQualityEffectSpecification.g:79:3: (lv_elements_0_0= ruleFindByName )
            	    // InternalQualityEffectSpecification.g:80:4: lv_elements_0_0= ruleFindByName
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsFindByNameParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleFindByName();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.palladiosimulator.qes.QualityEffectSpecification.FindByName");
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


    // $ANTLR start "entryRuleFindByName"
    // InternalQualityEffectSpecification.g:100:1: entryRuleFindByName returns [EObject current=null] : iv_ruleFindByName= ruleFindByName EOF ;
    public final EObject entryRuleFindByName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindByName = null;


        try {
            // InternalQualityEffectSpecification.g:100:51: (iv_ruleFindByName= ruleFindByName EOF )
            // InternalQualityEffectSpecification.g:101:2: iv_ruleFindByName= ruleFindByName EOF
            {
             newCompositeNode(grammarAccess.getFindByNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindByName=ruleFindByName();

            state._fsp--;

             current =iv_ruleFindByName; 
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
    // $ANTLR end "entryRuleFindByName"


    // $ANTLR start "ruleFindByName"
    // InternalQualityEffectSpecification.g:107:1: ruleFindByName returns [EObject current=null] : (otherlv_0= 'Find' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFindByName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalQualityEffectSpecification.g:113:2: ( (otherlv_0= 'Find' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalQualityEffectSpecification.g:114:2: (otherlv_0= 'Find' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalQualityEffectSpecification.g:114:2: (otherlv_0= 'Find' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalQualityEffectSpecification.g:115:3: otherlv_0= 'Find' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFindByNameAccess().getFindKeyword_0());
            		
            // InternalQualityEffectSpecification.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQualityEffectSpecification.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQualityEffectSpecification.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalQualityEffectSpecification.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFindByNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindByNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFindByName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}