package org.palladiosimulator.aes.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.palladiosimulator.aes.services.ArchitectureEffectSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArchitectureEffectSpecificationParser extends AbstractInternalContentAssistParser {
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


        public InternalArchitectureEffectSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArchitectureEffectSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArchitectureEffectSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArchitectureEffectSpecification.g"; }


    	private ArchitectureEffectSpecificationGrammarAccess grammarAccess;

    	public void setGrammarAccess(ArchitectureEffectSpecificationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalArchitectureEffectSpecification.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalArchitectureEffectSpecification.g:54:1: ( ruleModel EOF )
            // InternalArchitectureEffectSpecification.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalArchitectureEffectSpecification.g:62:1: ruleModel : ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitectureEffectSpecification.g:66:2: ( ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) ) )
            // InternalArchitectureEffectSpecification.g:67:2: ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) )
            {
            // InternalArchitectureEffectSpecification.g:67:2: ( ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* ) )
            // InternalArchitectureEffectSpecification.g:68:3: ( ( rule__Model__ElementsAssignment ) ) ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalArchitectureEffectSpecification.g:68:3: ( ( rule__Model__ElementsAssignment ) )
            // InternalArchitectureEffectSpecification.g:69:4: ( rule__Model__ElementsAssignment )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalArchitectureEffectSpecification.g:70:4: ( rule__Model__ElementsAssignment )
            // InternalArchitectureEffectSpecification.g:70:5: rule__Model__ElementsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }

            // InternalArchitectureEffectSpecification.g:73:3: ( ( rule__Model__ElementsAssignment )* )
            // InternalArchitectureEffectSpecification.g:74:4: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalArchitectureEffectSpecification.g:75:4: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArchitectureEffectSpecification.g:75:5: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFindByName"
    // InternalArchitectureEffectSpecification.g:85:1: entryRuleFindByName : ruleFindByName EOF ;
    public final void entryRuleFindByName() throws RecognitionException {
        try {
            // InternalArchitectureEffectSpecification.g:86:1: ( ruleFindByName EOF )
            // InternalArchitectureEffectSpecification.g:87:1: ruleFindByName EOF
            {
             before(grammarAccess.getFindByNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFindByName();

            state._fsp--;

             after(grammarAccess.getFindByNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFindByName"


    // $ANTLR start "ruleFindByName"
    // InternalArchitectureEffectSpecification.g:94:1: ruleFindByName : ( ( rule__FindByName__Group__0 ) ) ;
    public final void ruleFindByName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitectureEffectSpecification.g:98:2: ( ( ( rule__FindByName__Group__0 ) ) )
            // InternalArchitectureEffectSpecification.g:99:2: ( ( rule__FindByName__Group__0 ) )
            {
            // InternalArchitectureEffectSpecification.g:99:2: ( ( rule__FindByName__Group__0 ) )
            // InternalArchitectureEffectSpecification.g:100:3: ( rule__FindByName__Group__0 )
            {
             before(grammarAccess.getFindByNameAccess().getGroup()); 
            // InternalArchitectureEffectSpecification.g:101:3: ( rule__FindByName__Group__0 )
            // InternalArchitectureEffectSpecification.g:101:4: rule__FindByName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FindByName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFindByNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFindByName"


    // $ANTLR start "rule__FindByName__Group__0"
    // InternalArchitectureEffectSpecification.g:109:1: rule__FindByName__Group__0 : rule__FindByName__Group__0__Impl rule__FindByName__Group__1 ;
    public final void rule__FindByName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitectureEffectSpecification.g:113:1: ( rule__FindByName__Group__0__Impl rule__FindByName__Group__1 )
            // InternalArchitectureEffectSpecification.g:114:2: rule__FindByName__Group__0__Impl rule__FindByName__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FindByName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FindByName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindByName__Group__0"


    // $ANTLR start "rule__FindByName__Group__0__Impl"
    // InternalArchitectureEffectSpecification.g:121:1: rule__FindByName__Group__0__Impl : ( 'Find' ) ;
    public final void rule__FindByName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitectureEffectSpecification.g:125:1: ( ( 'Find' ) )
            // InternalArchitectureEffectSpecification.g:126:1: ( 'Find' )
            {
            // InternalArchitectureEffectSpecification.g:126:1: ( 'Find' )
            // InternalArchitectureEffectSpecification.g:127:2: 'Find'
            {
             before(grammarAccess.getFindByNameAccess().getFindKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFindByNameAccess().getFindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindByName__Group__0__Impl"


    // $ANTLR start "rule__FindByName__Group__1"
    // InternalArchitectureEffectSpecification.g:136:1: rule__FindByName__Group__1 : rule__FindByName__Group__1__Impl ;
    public final void rule__FindByName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitectureEffectSpecification.g:140:1: ( rule__FindByName__Group__1__Impl )
            // InternalArchitectureEffectSpecification.g:141:2: rule__FindByName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FindByName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindByName__Group__1"


    // $ANTLR start "rule__FindByName__Group__1__Impl"
    // InternalArchitectureEffectSpecification.g:147:1: rule__FindByName__Group__1__Impl : ( ( rule__FindByName__NameAssignment_1 ) ) ;
    public final void rule__FindByName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitectureEffectSpecification.g:151:1: ( ( ( rule__FindByName__NameAssignment_1 ) ) )
            // InternalArchitectureEffectSpecification.g:152:1: ( ( rule__FindByName__NameAssignment_1 ) )
            {
            // InternalArchitectureEffectSpecification.g:152:1: ( ( rule__FindByName__NameAssignment_1 ) )
            // InternalArchitectureEffectSpecification.g:153:2: ( rule__FindByName__NameAssignment_1 )
            {
             before(grammarAccess.getFindByNameAccess().getNameAssignment_1()); 
            // InternalArchitectureEffectSpecification.g:154:2: ( rule__FindByName__NameAssignment_1 )
            // InternalArchitectureEffectSpecification.g:154:3: rule__FindByName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FindByName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFindByNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindByName__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalArchitectureEffectSpecification.g:163:1: rule__Model__ElementsAssignment : ( ruleFindByName ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitectureEffectSpecification.g:167:1: ( ( ruleFindByName ) )
            // InternalArchitectureEffectSpecification.g:168:2: ( ruleFindByName )
            {
            // InternalArchitectureEffectSpecification.g:168:2: ( ruleFindByName )
            // InternalArchitectureEffectSpecification.g:169:3: ruleFindByName
            {
             before(grammarAccess.getModelAccess().getElementsFindByNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFindByName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsFindByNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__FindByName__NameAssignment_1"
    // InternalArchitectureEffectSpecification.g:178:1: rule__FindByName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FindByName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitectureEffectSpecification.g:182:1: ( ( RULE_ID ) )
            // InternalArchitectureEffectSpecification.g:183:2: ( RULE_ID )
            {
            // InternalArchitectureEffectSpecification.g:183:2: ( RULE_ID )
            // InternalArchitectureEffectSpecification.g:184:3: RULE_ID
            {
             before(grammarAccess.getFindByNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFindByNameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindByName__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}