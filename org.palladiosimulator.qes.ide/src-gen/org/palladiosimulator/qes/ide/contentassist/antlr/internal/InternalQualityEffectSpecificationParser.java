package org.palladiosimulator.qes.ide.contentassist.antlr.internal;

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
import org.palladiosimulator.qes.services.QualityEffectSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQualityEffectSpecificationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyComponentType'", "'Basic'", "'Composite'", "'AnyRoleType'", "'ComponentRequiredProvided'", "'ComponentRequired'", "'ComponentProvided'", "'InfrastructureRequiredProvided'", "'InfrastructureRequired'", "'InfrastructureProvided'", "'AnyAssembly'", "'Required'", "'Provided'", "'='", "'+'", "'-'", "'*'", "'/'", "'For{'", "'}'", "'Do{'", "'Component('", "')'", "'Name('", "'Id('", "'Type('", "'Role('", "'Interface('", "'Method('", "':'", "'Assembly('", "'Resource('", "'NQA('", "'Reasoning('", "'('", "'['", "']'", "'Cost('", "'Not'"
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

    	public void setGrammarAccess(QualityEffectSpecificationGrammarAccess grammarAccess) {
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
    // InternalQualityEffectSpecification.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:54:1: ( ruleModel EOF )
            // InternalQualityEffectSpecification.g:55:1: ruleModel EOF
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
    // InternalQualityEffectSpecification.g:62:1: ruleModel : ( ( ( rule__Model__SpecificationsAssignment ) ) ( ( rule__Model__SpecificationsAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:66:2: ( ( ( ( rule__Model__SpecificationsAssignment ) ) ( ( rule__Model__SpecificationsAssignment )* ) ) )
            // InternalQualityEffectSpecification.g:67:2: ( ( ( rule__Model__SpecificationsAssignment ) ) ( ( rule__Model__SpecificationsAssignment )* ) )
            {
            // InternalQualityEffectSpecification.g:67:2: ( ( ( rule__Model__SpecificationsAssignment ) ) ( ( rule__Model__SpecificationsAssignment )* ) )
            // InternalQualityEffectSpecification.g:68:3: ( ( rule__Model__SpecificationsAssignment ) ) ( ( rule__Model__SpecificationsAssignment )* )
            {
            // InternalQualityEffectSpecification.g:68:3: ( ( rule__Model__SpecificationsAssignment ) )
            // InternalQualityEffectSpecification.g:69:4: ( rule__Model__SpecificationsAssignment )
            {
             before(grammarAccess.getModelAccess().getSpecificationsAssignment()); 
            // InternalQualityEffectSpecification.g:70:4: ( rule__Model__SpecificationsAssignment )
            // InternalQualityEffectSpecification.g:70:5: rule__Model__SpecificationsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__SpecificationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSpecificationsAssignment()); 

            }

            // InternalQualityEffectSpecification.g:73:3: ( ( rule__Model__SpecificationsAssignment )* )
            // InternalQualityEffectSpecification.g:74:4: ( rule__Model__SpecificationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getSpecificationsAssignment()); 
            // InternalQualityEffectSpecification.g:75:4: ( rule__Model__SpecificationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:75:5: rule__Model__SpecificationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__SpecificationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSpecificationsAssignment()); 

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


    // $ANTLR start "entryRuleQES"
    // InternalQualityEffectSpecification.g:85:1: entryRuleQES : ruleQES EOF ;
    public final void entryRuleQES() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:86:1: ( ruleQES EOF )
            // InternalQualityEffectSpecification.g:87:1: ruleQES EOF
            {
             before(grammarAccess.getQESRule()); 
            pushFollow(FOLLOW_1);
            ruleQES();

            state._fsp--;

             after(grammarAccess.getQESRule()); 
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
    // $ANTLR end "entryRuleQES"


    // $ANTLR start "ruleQES"
    // InternalQualityEffectSpecification.g:94:1: ruleQES : ( ( rule__QES__Group__0 ) ) ;
    public final void ruleQES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:98:2: ( ( ( rule__QES__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:99:2: ( ( rule__QES__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:99:2: ( ( rule__QES__Group__0 ) )
            // InternalQualityEffectSpecification.g:100:3: ( rule__QES__Group__0 )
            {
             before(grammarAccess.getQESAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:101:3: ( rule__QES__Group__0 )
            // InternalQualityEffectSpecification.g:101:4: rule__QES__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QES__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getGroup()); 

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
    // $ANTLR end "ruleQES"


    // $ANTLR start "entryRuleComponentSpecification"
    // InternalQualityEffectSpecification.g:110:1: entryRuleComponentSpecification : ruleComponentSpecification EOF ;
    public final void entryRuleComponentSpecification() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:111:1: ( ruleComponentSpecification EOF )
            // InternalQualityEffectSpecification.g:112:1: ruleComponentSpecification EOF
            {
             before(grammarAccess.getComponentSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentSpecification();

            state._fsp--;

             after(grammarAccess.getComponentSpecificationRule()); 
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
    // $ANTLR end "entryRuleComponentSpecification"


    // $ANTLR start "ruleComponentSpecification"
    // InternalQualityEffectSpecification.g:119:1: ruleComponentSpecification : ( ( rule__ComponentSpecification__Group__0 ) ) ;
    public final void ruleComponentSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:123:2: ( ( ( rule__ComponentSpecification__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:124:2: ( ( rule__ComponentSpecification__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:124:2: ( ( rule__ComponentSpecification__Group__0 ) )
            // InternalQualityEffectSpecification.g:125:3: ( rule__ComponentSpecification__Group__0 )
            {
             before(grammarAccess.getComponentSpecificationAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:126:3: ( rule__ComponentSpecification__Group__0 )
            // InternalQualityEffectSpecification.g:126:4: rule__ComponentSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentSpecification"


    // $ANTLR start "entryRuleComponentProperty"
    // InternalQualityEffectSpecification.g:135:1: entryRuleComponentProperty : ruleComponentProperty EOF ;
    public final void entryRuleComponentProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:136:1: ( ruleComponentProperty EOF )
            // InternalQualityEffectSpecification.g:137:1: ruleComponentProperty EOF
            {
             before(grammarAccess.getComponentPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentProperty();

            state._fsp--;

             after(grammarAccess.getComponentPropertyRule()); 
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
    // $ANTLR end "entryRuleComponentProperty"


    // $ANTLR start "ruleComponentProperty"
    // InternalQualityEffectSpecification.g:144:1: ruleComponentProperty : ( ( rule__ComponentProperty__Alternatives ) ) ;
    public final void ruleComponentProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:148:2: ( ( ( rule__ComponentProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:149:2: ( ( rule__ComponentProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:149:2: ( ( rule__ComponentProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:150:3: ( rule__ComponentProperty__Alternatives )
            {
             before(grammarAccess.getComponentPropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:151:3: ( rule__ComponentProperty__Alternatives )
            // InternalQualityEffectSpecification.g:151:4: rule__ComponentProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentPropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComponentProperty"


    // $ANTLR start "entryRuleName"
    // InternalQualityEffectSpecification.g:160:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:161:1: ( ruleName EOF )
            // InternalQualityEffectSpecification.g:162:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalQualityEffectSpecification.g:169:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:173:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:174:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:174:2: ( ( rule__Name__Group__0 ) )
            // InternalQualityEffectSpecification.g:175:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:176:3: ( rule__Name__Group__0 )
            // InternalQualityEffectSpecification.g:176:4: rule__Name__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleIdentifier"
    // InternalQualityEffectSpecification.g:185:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:186:1: ( ruleIdentifier EOF )
            // InternalQualityEffectSpecification.g:187:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalQualityEffectSpecification.g:194:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:198:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:199:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:199:2: ( ( rule__Identifier__Group__0 ) )
            // InternalQualityEffectSpecification.g:200:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:201:3: ( rule__Identifier__Group__0 )
            // InternalQualityEffectSpecification.g:201:4: rule__Identifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getGroup()); 

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleType"
    // InternalQualityEffectSpecification.g:210:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:211:1: ( ruleType EOF )
            // InternalQualityEffectSpecification.g:212:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalQualityEffectSpecification.g:219:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:223:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:224:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:224:2: ( ( rule__Type__Group__0 ) )
            // InternalQualityEffectSpecification.g:225:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:226:3: ( rule__Type__Group__0 )
            // InternalQualityEffectSpecification.g:226:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRole"
    // InternalQualityEffectSpecification.g:235:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:236:1: ( ruleRole EOF )
            // InternalQualityEffectSpecification.g:237:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalQualityEffectSpecification.g:244:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:248:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:249:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:249:2: ( ( rule__Role__Group__0 ) )
            // InternalQualityEffectSpecification.g:250:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:251:3: ( rule__Role__Group__0 )
            // InternalQualityEffectSpecification.g:251:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleRoleProperty"
    // InternalQualityEffectSpecification.g:260:1: entryRuleRoleProperty : ruleRoleProperty EOF ;
    public final void entryRuleRoleProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:261:1: ( ruleRoleProperty EOF )
            // InternalQualityEffectSpecification.g:262:1: ruleRoleProperty EOF
            {
             before(grammarAccess.getRolePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleProperty();

            state._fsp--;

             after(grammarAccess.getRolePropertyRule()); 
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
    // $ANTLR end "entryRuleRoleProperty"


    // $ANTLR start "ruleRoleProperty"
    // InternalQualityEffectSpecification.g:269:1: ruleRoleProperty : ( ( rule__RoleProperty__Alternatives ) ) ;
    public final void ruleRoleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:273:2: ( ( ( rule__RoleProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:274:2: ( ( rule__RoleProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:274:2: ( ( rule__RoleProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:275:3: ( rule__RoleProperty__Alternatives )
            {
             before(grammarAccess.getRolePropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:276:3: ( rule__RoleProperty__Alternatives )
            // InternalQualityEffectSpecification.g:276:4: rule__RoleProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoleProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRolePropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRoleProperty"


    // $ANTLR start "entryRuleInterface"
    // InternalQualityEffectSpecification.g:285:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:286:1: ( ruleInterface EOF )
            // InternalQualityEffectSpecification.g:287:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalQualityEffectSpecification.g:294:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:298:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:299:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:299:2: ( ( rule__Interface__Group__0 ) )
            // InternalQualityEffectSpecification.g:300:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:301:3: ( rule__Interface__Group__0 )
            // InternalQualityEffectSpecification.g:301:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleInterfaceProperty"
    // InternalQualityEffectSpecification.g:310:1: entryRuleInterfaceProperty : ruleInterfaceProperty EOF ;
    public final void entryRuleInterfaceProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:311:1: ( ruleInterfaceProperty EOF )
            // InternalQualityEffectSpecification.g:312:1: ruleInterfaceProperty EOF
            {
             before(grammarAccess.getInterfacePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceProperty();

            state._fsp--;

             after(grammarAccess.getInterfacePropertyRule()); 
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
    // $ANTLR end "entryRuleInterfaceProperty"


    // $ANTLR start "ruleInterfaceProperty"
    // InternalQualityEffectSpecification.g:319:1: ruleInterfaceProperty : ( ( rule__InterfaceProperty__Alternatives ) ) ;
    public final void ruleInterfaceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:323:2: ( ( ( rule__InterfaceProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:324:2: ( ( rule__InterfaceProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:324:2: ( ( rule__InterfaceProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:325:3: ( rule__InterfaceProperty__Alternatives )
            {
             before(grammarAccess.getInterfacePropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:326:3: ( rule__InterfaceProperty__Alternatives )
            // InternalQualityEffectSpecification.g:326:4: rule__InterfaceProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterfacePropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInterfaceProperty"


    // $ANTLR start "entryRuleMethodSignature"
    // InternalQualityEffectSpecification.g:335:1: entryRuleMethodSignature : ruleMethodSignature EOF ;
    public final void entryRuleMethodSignature() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:336:1: ( ruleMethodSignature EOF )
            // InternalQualityEffectSpecification.g:337:1: ruleMethodSignature EOF
            {
             before(grammarAccess.getMethodSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodSignature();

            state._fsp--;

             after(grammarAccess.getMethodSignatureRule()); 
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
    // $ANTLR end "entryRuleMethodSignature"


    // $ANTLR start "ruleMethodSignature"
    // InternalQualityEffectSpecification.g:344:1: ruleMethodSignature : ( ( rule__MethodSignature__Group__0 ) ) ;
    public final void ruleMethodSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:348:2: ( ( ( rule__MethodSignature__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:349:2: ( ( rule__MethodSignature__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:349:2: ( ( rule__MethodSignature__Group__0 ) )
            // InternalQualityEffectSpecification.g:350:3: ( rule__MethodSignature__Group__0 )
            {
             before(grammarAccess.getMethodSignatureAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:351:3: ( rule__MethodSignature__Group__0 )
            // InternalQualityEffectSpecification.g:351:4: rule__MethodSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodSignatureAccess().getGroup()); 

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
    // $ANTLR end "ruleMethodSignature"


    // $ANTLR start "entryRuleAssembly"
    // InternalQualityEffectSpecification.g:360:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:361:1: ( ruleAssembly EOF )
            // InternalQualityEffectSpecification.g:362:1: ruleAssembly EOF
            {
             before(grammarAccess.getAssemblyRule()); 
            pushFollow(FOLLOW_1);
            ruleAssembly();

            state._fsp--;

             after(grammarAccess.getAssemblyRule()); 
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
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // InternalQualityEffectSpecification.g:369:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:373:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:374:2: ( ( rule__Assembly__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:374:2: ( ( rule__Assembly__Group__0 ) )
            // InternalQualityEffectSpecification.g:375:3: ( rule__Assembly__Group__0 )
            {
             before(grammarAccess.getAssemblyAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:376:3: ( rule__Assembly__Group__0 )
            // InternalQualityEffectSpecification.g:376:4: rule__Assembly__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getGroup()); 

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
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleResource"
    // InternalQualityEffectSpecification.g:385:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:386:1: ( ruleResource EOF )
            // InternalQualityEffectSpecification.g:387:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalQualityEffectSpecification.g:394:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:398:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:399:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:399:2: ( ( rule__Resource__Group__0 ) )
            // InternalQualityEffectSpecification.g:400:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:401:3: ( rule__Resource__Group__0 )
            // InternalQualityEffectSpecification.g:401:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleResourceProperty"
    // InternalQualityEffectSpecification.g:410:1: entryRuleResourceProperty : ruleResourceProperty EOF ;
    public final void entryRuleResourceProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:411:1: ( ruleResourceProperty EOF )
            // InternalQualityEffectSpecification.g:412:1: ruleResourceProperty EOF
            {
             before(grammarAccess.getResourcePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleResourceProperty();

            state._fsp--;

             after(grammarAccess.getResourcePropertyRule()); 
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
    // $ANTLR end "entryRuleResourceProperty"


    // $ANTLR start "ruleResourceProperty"
    // InternalQualityEffectSpecification.g:419:1: ruleResourceProperty : ( ( rule__ResourceProperty__Alternatives ) ) ;
    public final void ruleResourceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:423:2: ( ( ( rule__ResourceProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:424:2: ( ( rule__ResourceProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:424:2: ( ( rule__ResourceProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:425:3: ( rule__ResourceProperty__Alternatives )
            {
             before(grammarAccess.getResourcePropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:426:3: ( rule__ResourceProperty__Alternatives )
            // InternalQualityEffectSpecification.g:426:4: rule__ResourceProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResourceProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResourcePropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleResourceProperty"


    // $ANTLR start "entryRuleTransformationSpecification"
    // InternalQualityEffectSpecification.g:435:1: entryRuleTransformationSpecification : ruleTransformationSpecification EOF ;
    public final void entryRuleTransformationSpecification() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:436:1: ( ruleTransformationSpecification EOF )
            // InternalQualityEffectSpecification.g:437:1: ruleTransformationSpecification EOF
            {
             before(grammarAccess.getTransformationSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformationSpecification();

            state._fsp--;

             after(grammarAccess.getTransformationSpecificationRule()); 
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
    // $ANTLR end "entryRuleTransformationSpecification"


    // $ANTLR start "ruleTransformationSpecification"
    // InternalQualityEffectSpecification.g:444:1: ruleTransformationSpecification : ( ( rule__TransformationSpecification__Alternatives ) ) ;
    public final void ruleTransformationSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:448:2: ( ( ( rule__TransformationSpecification__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:449:2: ( ( rule__TransformationSpecification__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:449:2: ( ( rule__TransformationSpecification__Alternatives ) )
            // InternalQualityEffectSpecification.g:450:3: ( rule__TransformationSpecification__Alternatives )
            {
             before(grammarAccess.getTransformationSpecificationAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:451:3: ( rule__TransformationSpecification__Alternatives )
            // InternalQualityEffectSpecification.g:451:4: rule__TransformationSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TransformationSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransformationSpecificationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTransformationSpecification"


    // $ANTLR start "entryRuleNQA"
    // InternalQualityEffectSpecification.g:460:1: entryRuleNQA : ruleNQA EOF ;
    public final void entryRuleNQA() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:461:1: ( ruleNQA EOF )
            // InternalQualityEffectSpecification.g:462:1: ruleNQA EOF
            {
             before(grammarAccess.getNQARule()); 
            pushFollow(FOLLOW_1);
            ruleNQA();

            state._fsp--;

             after(grammarAccess.getNQARule()); 
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
    // $ANTLR end "entryRuleNQA"


    // $ANTLR start "ruleNQA"
    // InternalQualityEffectSpecification.g:469:1: ruleNQA : ( ( rule__NQA__Group__0 ) ) ;
    public final void ruleNQA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:473:2: ( ( ( rule__NQA__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:474:2: ( ( rule__NQA__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:474:2: ( ( rule__NQA__Group__0 ) )
            // InternalQualityEffectSpecification.g:475:3: ( rule__NQA__Group__0 )
            {
             before(grammarAccess.getNQAAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:476:3: ( rule__NQA__Group__0 )
            // InternalQualityEffectSpecification.g:476:4: rule__NQA__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NQA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNQAAccess().getGroup()); 

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
    // $ANTLR end "ruleNQA"


    // $ANTLR start "entryRuleReasoning"
    // InternalQualityEffectSpecification.g:485:1: entryRuleReasoning : ruleReasoning EOF ;
    public final void entryRuleReasoning() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:486:1: ( ruleReasoning EOF )
            // InternalQualityEffectSpecification.g:487:1: ruleReasoning EOF
            {
             before(grammarAccess.getReasoningRule()); 
            pushFollow(FOLLOW_1);
            ruleReasoning();

            state._fsp--;

             after(grammarAccess.getReasoningRule()); 
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
    // $ANTLR end "entryRuleReasoning"


    // $ANTLR start "ruleReasoning"
    // InternalQualityEffectSpecification.g:494:1: ruleReasoning : ( ( rule__Reasoning__Group__0 ) ) ;
    public final void ruleReasoning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:498:2: ( ( ( rule__Reasoning__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:499:2: ( ( rule__Reasoning__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:499:2: ( ( rule__Reasoning__Group__0 ) )
            // InternalQualityEffectSpecification.g:500:3: ( rule__Reasoning__Group__0 )
            {
             before(grammarAccess.getReasoningAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:501:3: ( rule__Reasoning__Group__0 )
            // InternalQualityEffectSpecification.g:501:4: rule__Reasoning__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getGroup()); 

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
    // $ANTLR end "ruleReasoning"


    // $ANTLR start "entryRuleRule"
    // InternalQualityEffectSpecification.g:510:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:511:1: ( ruleRule EOF )
            // InternalQualityEffectSpecification.g:512:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalQualityEffectSpecification.g:519:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:523:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:524:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:524:2: ( ( rule__Rule__Group__0 ) )
            // InternalQualityEffectSpecification.g:525:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:526:3: ( rule__Rule__Group__0 )
            // InternalQualityEffectSpecification.g:526:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEntry"
    // InternalQualityEffectSpecification.g:535:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:536:1: ( ruleEntry EOF )
            // InternalQualityEffectSpecification.g:537:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getEntryRule()); 
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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalQualityEffectSpecification.g:544:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:548:2: ( ( ( rule__Entry__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:549:2: ( ( rule__Entry__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:549:2: ( ( rule__Entry__Group__0 ) )
            // InternalQualityEffectSpecification.g:550:3: ( rule__Entry__Group__0 )
            {
             before(grammarAccess.getEntryAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:551:3: ( rule__Entry__Group__0 )
            // InternalQualityEffectSpecification.g:551:4: rule__Entry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getGroup()); 

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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleCost"
    // InternalQualityEffectSpecification.g:560:1: entryRuleCost : ruleCost EOF ;
    public final void entryRuleCost() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:561:1: ( ruleCost EOF )
            // InternalQualityEffectSpecification.g:562:1: ruleCost EOF
            {
             before(grammarAccess.getCostRule()); 
            pushFollow(FOLLOW_1);
            ruleCost();

            state._fsp--;

             after(grammarAccess.getCostRule()); 
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
    // $ANTLR end "entryRuleCost"


    // $ANTLR start "ruleCost"
    // InternalQualityEffectSpecification.g:569:1: ruleCost : ( ( rule__Cost__Group__0 ) ) ;
    public final void ruleCost() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:573:2: ( ( ( rule__Cost__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:574:2: ( ( rule__Cost__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:574:2: ( ( rule__Cost__Group__0 ) )
            // InternalQualityEffectSpecification.g:575:3: ( rule__Cost__Group__0 )
            {
             before(grammarAccess.getCostAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:576:3: ( rule__Cost__Group__0 )
            // InternalQualityEffectSpecification.g:576:4: rule__Cost__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cost__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCostAccess().getGroup()); 

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
    // $ANTLR end "ruleCost"


    // $ANTLR start "ruleComponentType"
    // InternalQualityEffectSpecification.g:585:1: ruleComponentType : ( ( rule__ComponentType__Alternatives ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:589:1: ( ( ( rule__ComponentType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:590:2: ( ( rule__ComponentType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:590:2: ( ( rule__ComponentType__Alternatives ) )
            // InternalQualityEffectSpecification.g:591:3: ( rule__ComponentType__Alternatives )
            {
             before(grammarAccess.getComponentTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:592:3: ( rule__ComponentType__Alternatives )
            // InternalQualityEffectSpecification.g:592:4: rule__ComponentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "ruleRoleType"
    // InternalQualityEffectSpecification.g:601:1: ruleRoleType : ( ( rule__RoleType__Alternatives ) ) ;
    public final void ruleRoleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:605:1: ( ( ( rule__RoleType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:606:2: ( ( rule__RoleType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:606:2: ( ( rule__RoleType__Alternatives ) )
            // InternalQualityEffectSpecification.g:607:3: ( rule__RoleType__Alternatives )
            {
             before(grammarAccess.getRoleTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:608:3: ( rule__RoleType__Alternatives )
            // InternalQualityEffectSpecification.g:608:4: rule__RoleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRoleType"


    // $ANTLR start "ruleAssemblyType"
    // InternalQualityEffectSpecification.g:617:1: ruleAssemblyType : ( ( rule__AssemblyType__Alternatives ) ) ;
    public final void ruleAssemblyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:621:1: ( ( ( rule__AssemblyType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:622:2: ( ( rule__AssemblyType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:622:2: ( ( rule__AssemblyType__Alternatives ) )
            // InternalQualityEffectSpecification.g:623:3: ( rule__AssemblyType__Alternatives )
            {
             before(grammarAccess.getAssemblyTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:624:3: ( rule__AssemblyType__Alternatives )
            // InternalQualityEffectSpecification.g:624:4: rule__AssemblyType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAssemblyType"


    // $ANTLR start "ruleTransformationType"
    // InternalQualityEffectSpecification.g:633:1: ruleTransformationType : ( ( rule__TransformationType__Alternatives ) ) ;
    public final void ruleTransformationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:637:1: ( ( ( rule__TransformationType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:638:2: ( ( rule__TransformationType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:638:2: ( ( rule__TransformationType__Alternatives ) )
            // InternalQualityEffectSpecification.g:639:3: ( rule__TransformationType__Alternatives )
            {
             before(grammarAccess.getTransformationTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:640:3: ( rule__TransformationType__Alternatives )
            // InternalQualityEffectSpecification.g:640:4: rule__TransformationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TransformationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransformationTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTransformationType"


    // $ANTLR start "rule__ComponentProperty__Alternatives"
    // InternalQualityEffectSpecification.g:648:1: rule__ComponentProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) );
    public final void rule__ComponentProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:652:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 41:
                {
                alt2=5;
                }
                break;
            case 42:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQualityEffectSpecification.g:653:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:653:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:654:3: ruleName
                    {
                     before(grammarAccess.getComponentPropertyAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:659:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:659:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:660:3: ruleIdentifier
                    {
                     before(grammarAccess.getComponentPropertyAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getIdentifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:665:2: ( ruleType )
                    {
                    // InternalQualityEffectSpecification.g:665:2: ( ruleType )
                    // InternalQualityEffectSpecification.g:666:3: ruleType
                    {
                     before(grammarAccess.getComponentPropertyAccess().getTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:671:2: ( ruleRole )
                    {
                    // InternalQualityEffectSpecification.g:671:2: ( ruleRole )
                    // InternalQualityEffectSpecification.g:672:3: ruleRole
                    {
                     before(grammarAccess.getComponentPropertyAccess().getRoleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getRoleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:677:2: ( ruleAssembly )
                    {
                    // InternalQualityEffectSpecification.g:677:2: ( ruleAssembly )
                    // InternalQualityEffectSpecification.g:678:3: ruleAssembly
                    {
                     before(grammarAccess.getComponentPropertyAccess().getAssemblyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAssembly();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getAssemblyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:683:2: ( ruleResource )
                    {
                    // InternalQualityEffectSpecification.g:683:2: ( ruleResource )
                    // InternalQualityEffectSpecification.g:684:3: ruleResource
                    {
                     before(grammarAccess.getComponentPropertyAccess().getResourceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getResourceParserRuleCall_5()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ComponentProperty__Alternatives"


    // $ANTLR start "rule__RoleProperty__Alternatives"
    // InternalQualityEffectSpecification.g:693:1: rule__RoleProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleInterface ) );
    public final void rule__RoleProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:697:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleInterface ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQualityEffectSpecification.g:698:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:698:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:699:3: ruleName
                    {
                     before(grammarAccess.getRolePropertyAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getRolePropertyAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:704:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:704:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:705:3: ruleIdentifier
                    {
                     before(grammarAccess.getRolePropertyAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getRolePropertyAccess().getIdentifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:710:2: ( ruleInterface )
                    {
                    // InternalQualityEffectSpecification.g:710:2: ( ruleInterface )
                    // InternalQualityEffectSpecification.g:711:3: ruleInterface
                    {
                     before(grammarAccess.getRolePropertyAccess().getInterfaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getRolePropertyAccess().getInterfaceParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__RoleProperty__Alternatives"


    // $ANTLR start "rule__InterfaceProperty__Alternatives"
    // InternalQualityEffectSpecification.g:720:1: rule__InterfaceProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleMethodSignature ) );
    public final void rule__InterfaceProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:724:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleMethodSignature ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQualityEffectSpecification.g:725:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:725:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:726:3: ruleName
                    {
                     before(grammarAccess.getInterfacePropertyAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getInterfacePropertyAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:731:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:731:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:732:3: ruleIdentifier
                    {
                     before(grammarAccess.getInterfacePropertyAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getInterfacePropertyAccess().getIdentifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:737:2: ( ruleMethodSignature )
                    {
                    // InternalQualityEffectSpecification.g:737:2: ( ruleMethodSignature )
                    // InternalQualityEffectSpecification.g:738:3: ruleMethodSignature
                    {
                     before(grammarAccess.getInterfacePropertyAccess().getMethodSignatureParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodSignature();

                    state._fsp--;

                     after(grammarAccess.getInterfacePropertyAccess().getMethodSignatureParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__InterfaceProperty__Alternatives"


    // $ANTLR start "rule__ResourceProperty__Alternatives"
    // InternalQualityEffectSpecification.g:747:1: rule__ResourceProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) );
    public final void rule__ResourceProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:751:1: ( ( ruleName ) | ( ruleIdentifier ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==35) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQualityEffectSpecification.g:752:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:752:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:753:3: ruleName
                    {
                     before(grammarAccess.getResourcePropertyAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getResourcePropertyAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:758:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:758:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:759:3: ruleIdentifier
                    {
                     before(grammarAccess.getResourcePropertyAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getResourcePropertyAccess().getIdentifierParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ResourceProperty__Alternatives"


    // $ANTLR start "rule__TransformationSpecification__Alternatives"
    // InternalQualityEffectSpecification.g:768:1: rule__TransformationSpecification__Alternatives : ( ( ruleNQA ) | ( ruleReasoning ) | ( ruleCost ) );
    public final void rule__TransformationSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:772:1: ( ( ruleNQA ) | ( ruleReasoning ) | ( ruleCost ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 48:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQualityEffectSpecification.g:773:2: ( ruleNQA )
                    {
                    // InternalQualityEffectSpecification.g:773:2: ( ruleNQA )
                    // InternalQualityEffectSpecification.g:774:3: ruleNQA
                    {
                     before(grammarAccess.getTransformationSpecificationAccess().getNQAParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNQA();

                    state._fsp--;

                     after(grammarAccess.getTransformationSpecificationAccess().getNQAParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:779:2: ( ruleReasoning )
                    {
                    // InternalQualityEffectSpecification.g:779:2: ( ruleReasoning )
                    // InternalQualityEffectSpecification.g:780:3: ruleReasoning
                    {
                     before(grammarAccess.getTransformationSpecificationAccess().getReasoningParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReasoning();

                    state._fsp--;

                     after(grammarAccess.getTransformationSpecificationAccess().getReasoningParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:785:2: ( ruleCost )
                    {
                    // InternalQualityEffectSpecification.g:785:2: ( ruleCost )
                    // InternalQualityEffectSpecification.g:786:3: ruleCost
                    {
                     before(grammarAccess.getTransformationSpecificationAccess().getCostParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCost();

                    state._fsp--;

                     after(grammarAccess.getTransformationSpecificationAccess().getCostParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__TransformationSpecification__Alternatives"


    // $ANTLR start "rule__ComponentType__Alternatives"
    // InternalQualityEffectSpecification.g:795:1: rule__ComponentType__Alternatives : ( ( ( 'AnyComponentType' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) );
    public final void rule__ComponentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:799:1: ( ( ( 'AnyComponentType' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQualityEffectSpecification.g:800:2: ( ( 'AnyComponentType' ) )
                    {
                    // InternalQualityEffectSpecification.g:800:2: ( ( 'AnyComponentType' ) )
                    // InternalQualityEffectSpecification.g:801:3: ( 'AnyComponentType' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:802:3: ( 'AnyComponentType' )
                    // InternalQualityEffectSpecification.g:802:4: 'AnyComponentType'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:806:2: ( ( 'Basic' ) )
                    {
                    // InternalQualityEffectSpecification.g:806:2: ( ( 'Basic' ) )
                    // InternalQualityEffectSpecification.g:807:3: ( 'Basic' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:808:3: ( 'Basic' )
                    // InternalQualityEffectSpecification.g:808:4: 'Basic'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:812:2: ( ( 'Composite' ) )
                    {
                    // InternalQualityEffectSpecification.g:812:2: ( ( 'Composite' ) )
                    // InternalQualityEffectSpecification.g:813:3: ( 'Composite' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:814:3: ( 'Composite' )
                    // InternalQualityEffectSpecification.g:814:4: 'Composite'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ComponentType__Alternatives"


    // $ANTLR start "rule__RoleType__Alternatives"
    // InternalQualityEffectSpecification.g:822:1: rule__RoleType__Alternatives : ( ( ( 'AnyRoleType' ) ) | ( ( 'ComponentRequiredProvided' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'InfrastructureRequiredProvided' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) );
    public final void rule__RoleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:826:1: ( ( ( 'AnyRoleType' ) ) | ( ( 'ComponentRequiredProvided' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'InfrastructureRequiredProvided' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            case 19:
                {
                alt8=6;
                }
                break;
            case 20:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQualityEffectSpecification.g:827:2: ( ( 'AnyRoleType' ) )
                    {
                    // InternalQualityEffectSpecification.g:827:2: ( ( 'AnyRoleType' ) )
                    // InternalQualityEffectSpecification.g:828:3: ( 'AnyRoleType' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:829:3: ( 'AnyRoleType' )
                    // InternalQualityEffectSpecification.g:829:4: 'AnyRoleType'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:833:2: ( ( 'ComponentRequiredProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:833:2: ( ( 'ComponentRequiredProvided' ) )
                    // InternalQualityEffectSpecification.g:834:3: ( 'ComponentRequiredProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:835:3: ( 'ComponentRequiredProvided' )
                    // InternalQualityEffectSpecification.g:835:4: 'ComponentRequiredProvided'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:839:2: ( ( 'ComponentRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:839:2: ( ( 'ComponentRequired' ) )
                    // InternalQualityEffectSpecification.g:840:3: ( 'ComponentRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:841:3: ( 'ComponentRequired' )
                    // InternalQualityEffectSpecification.g:841:4: 'ComponentRequired'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:845:2: ( ( 'ComponentProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:845:2: ( ( 'ComponentProvided' ) )
                    // InternalQualityEffectSpecification.g:846:3: ( 'ComponentProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:847:3: ( 'ComponentProvided' )
                    // InternalQualityEffectSpecification.g:847:4: 'ComponentProvided'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:851:2: ( ( 'InfrastructureRequiredProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:851:2: ( ( 'InfrastructureRequiredProvided' ) )
                    // InternalQualityEffectSpecification.g:852:3: ( 'InfrastructureRequiredProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:853:3: ( 'InfrastructureRequiredProvided' )
                    // InternalQualityEffectSpecification.g:853:4: 'InfrastructureRequiredProvided'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:857:2: ( ( 'InfrastructureRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:857:2: ( ( 'InfrastructureRequired' ) )
                    // InternalQualityEffectSpecification.g:858:3: ( 'InfrastructureRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 
                    // InternalQualityEffectSpecification.g:859:3: ( 'InfrastructureRequired' )
                    // InternalQualityEffectSpecification.g:859:4: 'InfrastructureRequired'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:863:2: ( ( 'InfrastructureProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:863:2: ( ( 'InfrastructureProvided' ) )
                    // InternalQualityEffectSpecification.g:864:3: ( 'InfrastructureProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_PROVIDEDEnumLiteralDeclaration_6()); 
                    // InternalQualityEffectSpecification.g:865:3: ( 'InfrastructureProvided' )
                    // InternalQualityEffectSpecification.g:865:4: 'InfrastructureProvided'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_PROVIDEDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__RoleType__Alternatives"


    // $ANTLR start "rule__AssemblyType__Alternatives"
    // InternalQualityEffectSpecification.g:873:1: rule__AssemblyType__Alternatives : ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) );
    public final void rule__AssemblyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:877:1: ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalQualityEffectSpecification.g:878:2: ( ( 'AnyAssembly' ) )
                    {
                    // InternalQualityEffectSpecification.g:878:2: ( ( 'AnyAssembly' ) )
                    // InternalQualityEffectSpecification.g:879:3: ( 'AnyAssembly' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:880:3: ( 'AnyAssembly' )
                    // InternalQualityEffectSpecification.g:880:4: 'AnyAssembly'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:884:2: ( ( 'Required' ) )
                    {
                    // InternalQualityEffectSpecification.g:884:2: ( ( 'Required' ) )
                    // InternalQualityEffectSpecification.g:885:3: ( 'Required' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:886:3: ( 'Required' )
                    // InternalQualityEffectSpecification.g:886:4: 'Required'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:890:2: ( ( 'Provided' ) )
                    {
                    // InternalQualityEffectSpecification.g:890:2: ( ( 'Provided' ) )
                    // InternalQualityEffectSpecification.g:891:3: ( 'Provided' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:892:3: ( 'Provided' )
                    // InternalQualityEffectSpecification.g:892:4: 'Provided'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AssemblyType__Alternatives"


    // $ANTLR start "rule__TransformationType__Alternatives"
    // InternalQualityEffectSpecification.g:900:1: rule__TransformationType__Alternatives : ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__TransformationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:904:1: ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalQualityEffectSpecification.g:905:2: ( ( '=' ) )
                    {
                    // InternalQualityEffectSpecification.g:905:2: ( ( '=' ) )
                    // InternalQualityEffectSpecification.g:906:3: ( '=' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:907:3: ( '=' )
                    // InternalQualityEffectSpecification.g:907:4: '='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:911:2: ( ( '+' ) )
                    {
                    // InternalQualityEffectSpecification.g:911:2: ( ( '+' ) )
                    // InternalQualityEffectSpecification.g:912:3: ( '+' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:913:3: ( '+' )
                    // InternalQualityEffectSpecification.g:913:4: '+'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:917:2: ( ( '-' ) )
                    {
                    // InternalQualityEffectSpecification.g:917:2: ( ( '-' ) )
                    // InternalQualityEffectSpecification.g:918:3: ( '-' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:919:3: ( '-' )
                    // InternalQualityEffectSpecification.g:919:4: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:923:2: ( ( '*' ) )
                    {
                    // InternalQualityEffectSpecification.g:923:2: ( ( '*' ) )
                    // InternalQualityEffectSpecification.g:924:3: ( '*' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:925:3: ( '*' )
                    // InternalQualityEffectSpecification.g:925:4: '*'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:929:2: ( ( '/' ) )
                    {
                    // InternalQualityEffectSpecification.g:929:2: ( ( '/' ) )
                    // InternalQualityEffectSpecification.g:930:3: ( '/' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getDIVISIONEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:931:3: ( '/' )
                    // InternalQualityEffectSpecification.g:931:4: '/'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getDIVISIONEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__TransformationType__Alternatives"


    // $ANTLR start "rule__QES__Group__0"
    // InternalQualityEffectSpecification.g:939:1: rule__QES__Group__0 : rule__QES__Group__0__Impl rule__QES__Group__1 ;
    public final void rule__QES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:943:1: ( rule__QES__Group__0__Impl rule__QES__Group__1 )
            // InternalQualityEffectSpecification.g:944:2: rule__QES__Group__0__Impl rule__QES__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QES__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QES__Group__1();

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
    // $ANTLR end "rule__QES__Group__0"


    // $ANTLR start "rule__QES__Group__0__Impl"
    // InternalQualityEffectSpecification.g:951:1: rule__QES__Group__0__Impl : ( 'For{' ) ;
    public final void rule__QES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:955:1: ( ( 'For{' ) )
            // InternalQualityEffectSpecification.g:956:1: ( 'For{' )
            {
            // InternalQualityEffectSpecification.g:956:1: ( 'For{' )
            // InternalQualityEffectSpecification.g:957:2: 'For{'
            {
             before(grammarAccess.getQESAccess().getForKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQESAccess().getForKeyword_0()); 

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
    // $ANTLR end "rule__QES__Group__0__Impl"


    // $ANTLR start "rule__QES__Group__1"
    // InternalQualityEffectSpecification.g:966:1: rule__QES__Group__1 : rule__QES__Group__1__Impl rule__QES__Group__2 ;
    public final void rule__QES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:970:1: ( rule__QES__Group__1__Impl rule__QES__Group__2 )
            // InternalQualityEffectSpecification.g:971:2: rule__QES__Group__1__Impl rule__QES__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__QES__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QES__Group__2();

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
    // $ANTLR end "rule__QES__Group__1"


    // $ANTLR start "rule__QES__Group__1__Impl"
    // InternalQualityEffectSpecification.g:978:1: rule__QES__Group__1__Impl : ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) ) ;
    public final void rule__QES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:982:1: ( ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:983:1: ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:983:1: ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:984:2: ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:984:2: ( ( rule__QES__ComponentsAssignment_1 ) )
            // InternalQualityEffectSpecification.g:985:3: ( rule__QES__ComponentsAssignment_1 )
            {
             before(grammarAccess.getQESAccess().getComponentsAssignment_1()); 
            // InternalQualityEffectSpecification.g:986:3: ( rule__QES__ComponentsAssignment_1 )
            // InternalQualityEffectSpecification.g:986:4: rule__QES__ComponentsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__QES__ComponentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getComponentsAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:989:2: ( ( rule__QES__ComponentsAssignment_1 )* )
            // InternalQualityEffectSpecification.g:990:3: ( rule__QES__ComponentsAssignment_1 )*
            {
             before(grammarAccess.getQESAccess().getComponentsAssignment_1()); 
            // InternalQualityEffectSpecification.g:991:3: ( rule__QES__ComponentsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:991:4: rule__QES__ComponentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QES__ComponentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQESAccess().getComponentsAssignment_1()); 

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
    // $ANTLR end "rule__QES__Group__1__Impl"


    // $ANTLR start "rule__QES__Group__2"
    // InternalQualityEffectSpecification.g:1000:1: rule__QES__Group__2 : rule__QES__Group__2__Impl rule__QES__Group__3 ;
    public final void rule__QES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1004:1: ( rule__QES__Group__2__Impl rule__QES__Group__3 )
            // InternalQualityEffectSpecification.g:1005:2: rule__QES__Group__2__Impl rule__QES__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__QES__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QES__Group__3();

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
    // $ANTLR end "rule__QES__Group__2"


    // $ANTLR start "rule__QES__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1012:1: rule__QES__Group__2__Impl : ( '}' ) ;
    public final void rule__QES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1016:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:1017:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:1017:1: ( '}' )
            // InternalQualityEffectSpecification.g:1018:2: '}'
            {
             before(grammarAccess.getQESAccess().getRightCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQESAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__QES__Group__2__Impl"


    // $ANTLR start "rule__QES__Group__3"
    // InternalQualityEffectSpecification.g:1027:1: rule__QES__Group__3 : rule__QES__Group__3__Impl rule__QES__Group__4 ;
    public final void rule__QES__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1031:1: ( rule__QES__Group__3__Impl rule__QES__Group__4 )
            // InternalQualityEffectSpecification.g:1032:2: rule__QES__Group__3__Impl rule__QES__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__QES__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QES__Group__4();

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
    // $ANTLR end "rule__QES__Group__3"


    // $ANTLR start "rule__QES__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1039:1: rule__QES__Group__3__Impl : ( 'Do{' ) ;
    public final void rule__QES__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1043:1: ( ( 'Do{' ) )
            // InternalQualityEffectSpecification.g:1044:1: ( 'Do{' )
            {
            // InternalQualityEffectSpecification.g:1044:1: ( 'Do{' )
            // InternalQualityEffectSpecification.g:1045:2: 'Do{'
            {
             before(grammarAccess.getQESAccess().getDoKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQESAccess().getDoKeyword_3()); 

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
    // $ANTLR end "rule__QES__Group__3__Impl"


    // $ANTLR start "rule__QES__Group__4"
    // InternalQualityEffectSpecification.g:1054:1: rule__QES__Group__4 : rule__QES__Group__4__Impl rule__QES__Group__5 ;
    public final void rule__QES__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1058:1: ( rule__QES__Group__4__Impl rule__QES__Group__5 )
            // InternalQualityEffectSpecification.g:1059:2: rule__QES__Group__4__Impl rule__QES__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__QES__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QES__Group__5();

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
    // $ANTLR end "rule__QES__Group__4"


    // $ANTLR start "rule__QES__Group__4__Impl"
    // InternalQualityEffectSpecification.g:1066:1: rule__QES__Group__4__Impl : ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) ) ;
    public final void rule__QES__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1070:1: ( ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) ) )
            // InternalQualityEffectSpecification.g:1071:1: ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) )
            {
            // InternalQualityEffectSpecification.g:1071:1: ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) )
            // InternalQualityEffectSpecification.g:1072:2: ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* )
            {
            // InternalQualityEffectSpecification.g:1072:2: ( ( rule__QES__TransformationsAssignment_4 ) )
            // InternalQualityEffectSpecification.g:1073:3: ( rule__QES__TransformationsAssignment_4 )
            {
             before(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 
            // InternalQualityEffectSpecification.g:1074:3: ( rule__QES__TransformationsAssignment_4 )
            // InternalQualityEffectSpecification.g:1074:4: rule__QES__TransformationsAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__QES__TransformationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 

            }

            // InternalQualityEffectSpecification.g:1077:2: ( ( rule__QES__TransformationsAssignment_4 )* )
            // InternalQualityEffectSpecification.g:1078:3: ( rule__QES__TransformationsAssignment_4 )*
            {
             before(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 
            // InternalQualityEffectSpecification.g:1079:3: ( rule__QES__TransformationsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=43 && LA12_0<=44)||LA12_0==48) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1079:4: rule__QES__TransformationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QES__TransformationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 

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
    // $ANTLR end "rule__QES__Group__4__Impl"


    // $ANTLR start "rule__QES__Group__5"
    // InternalQualityEffectSpecification.g:1088:1: rule__QES__Group__5 : rule__QES__Group__5__Impl ;
    public final void rule__QES__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1092:1: ( rule__QES__Group__5__Impl )
            // InternalQualityEffectSpecification.g:1093:2: rule__QES__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QES__Group__5__Impl();

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
    // $ANTLR end "rule__QES__Group__5"


    // $ANTLR start "rule__QES__Group__5__Impl"
    // InternalQualityEffectSpecification.g:1099:1: rule__QES__Group__5__Impl : ( '}' ) ;
    public final void rule__QES__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1103:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:1104:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:1104:1: ( '}' )
            // InternalQualityEffectSpecification.g:1105:2: '}'
            {
             before(grammarAccess.getQESAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQESAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__QES__Group__5__Impl"


    // $ANTLR start "rule__ComponentSpecification__Group__0"
    // InternalQualityEffectSpecification.g:1115:1: rule__ComponentSpecification__Group__0 : rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1 ;
    public final void rule__ComponentSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1119:1: ( rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1 )
            // InternalQualityEffectSpecification.g:1120:2: rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ComponentSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group__1();

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
    // $ANTLR end "rule__ComponentSpecification__Group__0"


    // $ANTLR start "rule__ComponentSpecification__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1127:1: rule__ComponentSpecification__Group__0__Impl : ( 'Component(' ) ;
    public final void rule__ComponentSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1131:1: ( ( 'Component(' ) )
            // InternalQualityEffectSpecification.g:1132:1: ( 'Component(' )
            {
            // InternalQualityEffectSpecification.g:1132:1: ( 'Component(' )
            // InternalQualityEffectSpecification.g:1133:2: 'Component('
            {
             before(grammarAccess.getComponentSpecificationAccess().getComponentKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentSpecificationAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__ComponentSpecification__Group__0__Impl"


    // $ANTLR start "rule__ComponentSpecification__Group__1"
    // InternalQualityEffectSpecification.g:1142:1: rule__ComponentSpecification__Group__1 : rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2 ;
    public final void rule__ComponentSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1146:1: ( rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2 )
            // InternalQualityEffectSpecification.g:1147:2: rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ComponentSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group__2();

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
    // $ANTLR end "rule__ComponentSpecification__Group__1"


    // $ANTLR start "rule__ComponentSpecification__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1154:1: rule__ComponentSpecification__Group__1__Impl : ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) ) ;
    public final void rule__ComponentSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1158:1: ( ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1159:1: ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1159:1: ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1160:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1160:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1161:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1162:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:1162:4: rule__ComponentSpecification__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__ComponentSpecification__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1165:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1166:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1167:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=34 && LA13_0<=37)||(LA13_0>=41 && LA13_0<=42)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1167:4: rule__ComponentSpecification__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ComponentSpecification__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 

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
    // $ANTLR end "rule__ComponentSpecification__Group__1__Impl"


    // $ANTLR start "rule__ComponentSpecification__Group__2"
    // InternalQualityEffectSpecification.g:1176:1: rule__ComponentSpecification__Group__2 : rule__ComponentSpecification__Group__2__Impl ;
    public final void rule__ComponentSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1180:1: ( rule__ComponentSpecification__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1181:2: rule__ComponentSpecification__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group__2__Impl();

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
    // $ANTLR end "rule__ComponentSpecification__Group__2"


    // $ANTLR start "rule__ComponentSpecification__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1187:1: rule__ComponentSpecification__Group__2__Impl : ( ')' ) ;
    public final void rule__ComponentSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1191:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1192:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1192:1: ( ')' )
            // InternalQualityEffectSpecification.g:1193:2: ')'
            {
             before(grammarAccess.getComponentSpecificationAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentSpecificationAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ComponentSpecification__Group__2__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalQualityEffectSpecification.g:1203:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1207:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalQualityEffectSpecification.g:1208:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__1();

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
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1215:1: rule__Name__Group__0__Impl : ( 'Name(' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1219:1: ( ( 'Name(' ) )
            // InternalQualityEffectSpecification.g:1220:1: ( 'Name(' )
            {
            // InternalQualityEffectSpecification.g:1220:1: ( 'Name(' )
            // InternalQualityEffectSpecification.g:1221:2: 'Name('
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // InternalQualityEffectSpecification.g:1230:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1234:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalQualityEffectSpecification.g:1235:2: rule__Name__Group__1__Impl rule__Name__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Name__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__2();

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
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1242:1: rule__Name__Group__1__Impl : ( ( rule__Name__NotAssignment_1 )? ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1246:1: ( ( ( rule__Name__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1247:1: ( ( rule__Name__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1247:1: ( ( rule__Name__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1248:2: ( rule__Name__NotAssignment_1 )?
            {
             before(grammarAccess.getNameAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1249:2: ( rule__Name__NotAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1249:3: rule__Name__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Name__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameAccess().getNotAssignment_1()); 

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
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Name__Group__2"
    // InternalQualityEffectSpecification.g:1257:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1261:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalQualityEffectSpecification.g:1262:2: rule__Name__Group__2__Impl rule__Name__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Name__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__3();

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
    // $ANTLR end "rule__Name__Group__2"


    // $ANTLR start "rule__Name__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1269:1: rule__Name__Group__2__Impl : ( ( rule__Name__NameAssignment_2 ) ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1273:1: ( ( ( rule__Name__NameAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1274:1: ( ( rule__Name__NameAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1274:1: ( ( rule__Name__NameAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1275:2: ( rule__Name__NameAssignment_2 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_2()); 
            // InternalQualityEffectSpecification.g:1276:2: ( rule__Name__NameAssignment_2 )
            // InternalQualityEffectSpecification.g:1276:3: rule__Name__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Name__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Name__Group__2__Impl"


    // $ANTLR start "rule__Name__Group__3"
    // InternalQualityEffectSpecification.g:1284:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1288:1: ( rule__Name__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1289:2: rule__Name__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__3__Impl();

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
    // $ANTLR end "rule__Name__Group__3"


    // $ANTLR start "rule__Name__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1295:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1299:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1300:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1300:1: ( ')' )
            // InternalQualityEffectSpecification.g:1301:2: ')'
            {
             before(grammarAccess.getNameAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Name__Group__3__Impl"


    // $ANTLR start "rule__Identifier__Group__0"
    // InternalQualityEffectSpecification.g:1311:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1315:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalQualityEffectSpecification.g:1316:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group__1();

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
    // $ANTLR end "rule__Identifier__Group__0"


    // $ANTLR start "rule__Identifier__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1323:1: rule__Identifier__Group__0__Impl : ( 'Id(' ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1327:1: ( ( 'Id(' ) )
            // InternalQualityEffectSpecification.g:1328:1: ( 'Id(' )
            {
            // InternalQualityEffectSpecification.g:1328:1: ( 'Id(' )
            // InternalQualityEffectSpecification.g:1329:2: 'Id('
            {
             before(grammarAccess.getIdentifierAccess().getIdKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getIdKeyword_0()); 

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
    // $ANTLR end "rule__Identifier__Group__0__Impl"


    // $ANTLR start "rule__Identifier__Group__1"
    // InternalQualityEffectSpecification.g:1338:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1342:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // InternalQualityEffectSpecification.g:1343:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Identifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group__2();

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
    // $ANTLR end "rule__Identifier__Group__1"


    // $ANTLR start "rule__Identifier__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1350:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NotAssignment_1 )? ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1354:1: ( ( ( rule__Identifier__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1355:1: ( ( rule__Identifier__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1355:1: ( ( rule__Identifier__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1356:2: ( rule__Identifier__NotAssignment_1 )?
            {
             before(grammarAccess.getIdentifierAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1357:2: ( rule__Identifier__NotAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1357:3: rule__Identifier__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Identifier__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIdentifierAccess().getNotAssignment_1()); 

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
    // $ANTLR end "rule__Identifier__Group__1__Impl"


    // $ANTLR start "rule__Identifier__Group__2"
    // InternalQualityEffectSpecification.g:1365:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl rule__Identifier__Group__3 ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1369:1: ( rule__Identifier__Group__2__Impl rule__Identifier__Group__3 )
            // InternalQualityEffectSpecification.g:1370:2: rule__Identifier__Group__2__Impl rule__Identifier__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Identifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group__3();

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
    // $ANTLR end "rule__Identifier__Group__2"


    // $ANTLR start "rule__Identifier__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1377:1: rule__Identifier__Group__2__Impl : ( ( rule__Identifier__IdAssignment_2 ) ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1381:1: ( ( ( rule__Identifier__IdAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1382:1: ( ( rule__Identifier__IdAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1382:1: ( ( rule__Identifier__IdAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1383:2: ( rule__Identifier__IdAssignment_2 )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment_2()); 
            // InternalQualityEffectSpecification.g:1384:2: ( rule__Identifier__IdAssignment_2 )
            // InternalQualityEffectSpecification.g:1384:3: rule__Identifier__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getIdAssignment_2()); 

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
    // $ANTLR end "rule__Identifier__Group__2__Impl"


    // $ANTLR start "rule__Identifier__Group__3"
    // InternalQualityEffectSpecification.g:1392:1: rule__Identifier__Group__3 : rule__Identifier__Group__3__Impl ;
    public final void rule__Identifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1396:1: ( rule__Identifier__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1397:2: rule__Identifier__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__3__Impl();

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
    // $ANTLR end "rule__Identifier__Group__3"


    // $ANTLR start "rule__Identifier__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1403:1: rule__Identifier__Group__3__Impl : ( ')' ) ;
    public final void rule__Identifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1407:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1408:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1408:1: ( ')' )
            // InternalQualityEffectSpecification.g:1409:2: ')'
            {
             before(grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Identifier__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalQualityEffectSpecification.g:1419:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1423:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalQualityEffectSpecification.g:1424:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1431:1: rule__Type__Group__0__Impl : ( 'Type(' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1435:1: ( ( 'Type(' ) )
            // InternalQualityEffectSpecification.g:1436:1: ( 'Type(' )
            {
            // InternalQualityEffectSpecification.g:1436:1: ( 'Type(' )
            // InternalQualityEffectSpecification.g:1437:2: 'Type('
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalQualityEffectSpecification.g:1446:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1450:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalQualityEffectSpecification.g:1451:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1458:1: rule__Type__Group__1__Impl : ( ( rule__Type__NotAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1462:1: ( ( ( rule__Type__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1463:1: ( ( rule__Type__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1463:1: ( ( rule__Type__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1464:2: ( rule__Type__NotAssignment_1 )?
            {
             before(grammarAccess.getTypeAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1465:2: ( rule__Type__NotAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1465:3: rule__Type__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getNotAssignment_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalQualityEffectSpecification.g:1473:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1477:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalQualityEffectSpecification.g:1478:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1485:1: rule__Type__Group__2__Impl : ( ( rule__Type__TypeAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1489:1: ( ( ( rule__Type__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1490:1: ( ( rule__Type__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1490:1: ( ( rule__Type__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1491:2: ( rule__Type__TypeAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1492:2: ( rule__Type__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1492:3: rule__Type__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalQualityEffectSpecification.g:1500:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1504:1: ( rule__Type__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1505:2: rule__Type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__3__Impl();

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
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1511:1: rule__Type__Group__3__Impl : ( ')' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1515:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1516:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1516:1: ( ')' )
            // InternalQualityEffectSpecification.g:1517:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalQualityEffectSpecification.g:1527:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1531:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalQualityEffectSpecification.g:1532:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

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
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1539:1: rule__Role__Group__0__Impl : ( 'Role(' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1543:1: ( ( 'Role(' ) )
            // InternalQualityEffectSpecification.g:1544:1: ( 'Role(' )
            {
            // InternalQualityEffectSpecification.g:1544:1: ( 'Role(' )
            // InternalQualityEffectSpecification.g:1545:2: 'Role('
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

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
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalQualityEffectSpecification.g:1554:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1558:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalQualityEffectSpecification.g:1559:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

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
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1566:1: rule__Role__Group__1__Impl : ( ( rule__Role__NotAssignment_1 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1570:1: ( ( ( rule__Role__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1571:1: ( ( rule__Role__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1571:1: ( ( rule__Role__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1572:2: ( rule__Role__NotAssignment_1 )?
            {
             before(grammarAccess.getRoleAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1573:2: ( rule__Role__NotAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==49) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1573:3: rule__Role__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getNotAssignment_1()); 

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
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalQualityEffectSpecification.g:1581:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1585:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalQualityEffectSpecification.g:1586:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

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
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1593:1: rule__Role__Group__2__Impl : ( ( rule__Role__TypeAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1597:1: ( ( ( rule__Role__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1598:1: ( ( rule__Role__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1598:1: ( ( rule__Role__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1599:2: ( rule__Role__TypeAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1600:2: ( rule__Role__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1600:3: rule__Role__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Role__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalQualityEffectSpecification.g:1608:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1612:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalQualityEffectSpecification.g:1613:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__4();

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
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1620:1: rule__Role__Group__3__Impl : ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1624:1: ( ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1625:1: ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1625:1: ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1626:2: ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1626:2: ( ( rule__Role__PropertiesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1627:3: ( rule__Role__PropertiesAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1628:3: ( rule__Role__PropertiesAssignment_3 )
            // InternalQualityEffectSpecification.g:1628:4: rule__Role__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__Role__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1631:2: ( ( rule__Role__PropertiesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1632:3: ( rule__Role__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1633:3: ( rule__Role__PropertiesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=35)||LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1633:4: rule__Role__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Role__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // InternalQualityEffectSpecification.g:1642:1: rule__Role__Group__4 : rule__Role__Group__4__Impl ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1646:1: ( rule__Role__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1647:2: rule__Role__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__4__Impl();

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
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // InternalQualityEffectSpecification.g:1653:1: rule__Role__Group__4__Impl : ( ')' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1657:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1658:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1658:1: ( ')' )
            // InternalQualityEffectSpecification.g:1659:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalQualityEffectSpecification.g:1669:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1673:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalQualityEffectSpecification.g:1674:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1681:1: rule__Interface__Group__0__Impl : ( 'Interface(' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1685:1: ( ( 'Interface(' ) )
            // InternalQualityEffectSpecification.g:1686:1: ( 'Interface(' )
            {
            // InternalQualityEffectSpecification.g:1686:1: ( 'Interface(' )
            // InternalQualityEffectSpecification.g:1687:2: 'Interface('
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalQualityEffectSpecification.g:1696:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1700:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalQualityEffectSpecification.g:1701:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1708:1: rule__Interface__Group__1__Impl : ( ( ( rule__Interface__PropertiesAssignment_1 ) ) ( ( rule__Interface__PropertiesAssignment_1 )* ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1712:1: ( ( ( ( rule__Interface__PropertiesAssignment_1 ) ) ( ( rule__Interface__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1713:1: ( ( ( rule__Interface__PropertiesAssignment_1 ) ) ( ( rule__Interface__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1713:1: ( ( ( rule__Interface__PropertiesAssignment_1 ) ) ( ( rule__Interface__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1714:2: ( ( rule__Interface__PropertiesAssignment_1 ) ) ( ( rule__Interface__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1714:2: ( ( rule__Interface__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1715:3: ( rule__Interface__PropertiesAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1716:3: ( rule__Interface__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:1716:4: rule__Interface__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_20);
            rule__Interface__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1719:2: ( ( rule__Interface__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1720:3: ( rule__Interface__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getInterfaceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1721:3: ( rule__Interface__PropertiesAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=34 && LA19_0<=35)||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1721:4: rule__Interface__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Interface__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getPropertiesAssignment_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalQualityEffectSpecification.g:1730:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1734:1: ( rule__Interface__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1735:2: rule__Interface__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__2__Impl();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1741:1: rule__Interface__Group__2__Impl : ( ')' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1745:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1746:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1746:1: ( ')' )
            // InternalQualityEffectSpecification.g:1747:2: ')'
            {
             before(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__MethodSignature__Group__0"
    // InternalQualityEffectSpecification.g:1757:1: rule__MethodSignature__Group__0 : rule__MethodSignature__Group__0__Impl rule__MethodSignature__Group__1 ;
    public final void rule__MethodSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1761:1: ( rule__MethodSignature__Group__0__Impl rule__MethodSignature__Group__1 )
            // InternalQualityEffectSpecification.g:1762:2: rule__MethodSignature__Group__0__Impl rule__MethodSignature__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MethodSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSignature__Group__1();

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
    // $ANTLR end "rule__MethodSignature__Group__0"


    // $ANTLR start "rule__MethodSignature__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1769:1: rule__MethodSignature__Group__0__Impl : ( 'Method(' ) ;
    public final void rule__MethodSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1773:1: ( ( 'Method(' ) )
            // InternalQualityEffectSpecification.g:1774:1: ( 'Method(' )
            {
            // InternalQualityEffectSpecification.g:1774:1: ( 'Method(' )
            // InternalQualityEffectSpecification.g:1775:2: 'Method('
            {
             before(grammarAccess.getMethodSignatureAccess().getMethodKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMethodSignatureAccess().getMethodKeyword_0()); 

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
    // $ANTLR end "rule__MethodSignature__Group__0__Impl"


    // $ANTLR start "rule__MethodSignature__Group__1"
    // InternalQualityEffectSpecification.g:1784:1: rule__MethodSignature__Group__1 : rule__MethodSignature__Group__1__Impl rule__MethodSignature__Group__2 ;
    public final void rule__MethodSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1788:1: ( rule__MethodSignature__Group__1__Impl rule__MethodSignature__Group__2 )
            // InternalQualityEffectSpecification.g:1789:2: rule__MethodSignature__Group__1__Impl rule__MethodSignature__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__MethodSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSignature__Group__2();

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
    // $ANTLR end "rule__MethodSignature__Group__1"


    // $ANTLR start "rule__MethodSignature__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1796:1: rule__MethodSignature__Group__1__Impl : ( ( rule__MethodSignature__NameAssignment_1 ) ) ;
    public final void rule__MethodSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1800:1: ( ( ( rule__MethodSignature__NameAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1801:1: ( ( rule__MethodSignature__NameAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1801:1: ( ( rule__MethodSignature__NameAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1802:2: ( rule__MethodSignature__NameAssignment_1 )
            {
             before(grammarAccess.getMethodSignatureAccess().getNameAssignment_1()); 
            // InternalQualityEffectSpecification.g:1803:2: ( rule__MethodSignature__NameAssignment_1 )
            // InternalQualityEffectSpecification.g:1803:3: rule__MethodSignature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodSignature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodSignatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MethodSignature__Group__1__Impl"


    // $ANTLR start "rule__MethodSignature__Group__2"
    // InternalQualityEffectSpecification.g:1811:1: rule__MethodSignature__Group__2 : rule__MethodSignature__Group__2__Impl rule__MethodSignature__Group__3 ;
    public final void rule__MethodSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1815:1: ( rule__MethodSignature__Group__2__Impl rule__MethodSignature__Group__3 )
            // InternalQualityEffectSpecification.g:1816:2: rule__MethodSignature__Group__2__Impl rule__MethodSignature__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__MethodSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSignature__Group__3();

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
    // $ANTLR end "rule__MethodSignature__Group__2"


    // $ANTLR start "rule__MethodSignature__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1823:1: rule__MethodSignature__Group__2__Impl : ( ':' ) ;
    public final void rule__MethodSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1827:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:1828:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:1828:1: ( ':' )
            // InternalQualityEffectSpecification.g:1829:2: ':'
            {
             before(grammarAccess.getMethodSignatureAccess().getColonKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMethodSignatureAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__MethodSignature__Group__2__Impl"


    // $ANTLR start "rule__MethodSignature__Group__3"
    // InternalQualityEffectSpecification.g:1838:1: rule__MethodSignature__Group__3 : rule__MethodSignature__Group__3__Impl rule__MethodSignature__Group__4 ;
    public final void rule__MethodSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1842:1: ( rule__MethodSignature__Group__3__Impl rule__MethodSignature__Group__4 )
            // InternalQualityEffectSpecification.g:1843:2: rule__MethodSignature__Group__3__Impl rule__MethodSignature__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__MethodSignature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodSignature__Group__4();

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
    // $ANTLR end "rule__MethodSignature__Group__3"


    // $ANTLR start "rule__MethodSignature__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1850:1: rule__MethodSignature__Group__3__Impl : ( ( rule__MethodSignature__ParameterTypesAssignment_3 )* ) ;
    public final void rule__MethodSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1854:1: ( ( ( rule__MethodSignature__ParameterTypesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1855:1: ( ( rule__MethodSignature__ParameterTypesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1855:1: ( ( rule__MethodSignature__ParameterTypesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1856:2: ( rule__MethodSignature__ParameterTypesAssignment_3 )*
            {
             before(grammarAccess.getMethodSignatureAccess().getParameterTypesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1857:2: ( rule__MethodSignature__ParameterTypesAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1857:3: rule__MethodSignature__ParameterTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__MethodSignature__ParameterTypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMethodSignatureAccess().getParameterTypesAssignment_3()); 

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
    // $ANTLR end "rule__MethodSignature__Group__3__Impl"


    // $ANTLR start "rule__MethodSignature__Group__4"
    // InternalQualityEffectSpecification.g:1865:1: rule__MethodSignature__Group__4 : rule__MethodSignature__Group__4__Impl ;
    public final void rule__MethodSignature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1869:1: ( rule__MethodSignature__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1870:2: rule__MethodSignature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodSignature__Group__4__Impl();

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
    // $ANTLR end "rule__MethodSignature__Group__4"


    // $ANTLR start "rule__MethodSignature__Group__4__Impl"
    // InternalQualityEffectSpecification.g:1876:1: rule__MethodSignature__Group__4__Impl : ( ')' ) ;
    public final void rule__MethodSignature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1880:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1881:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1881:1: ( ')' )
            // InternalQualityEffectSpecification.g:1882:2: ')'
            {
             before(grammarAccess.getMethodSignatureAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMethodSignatureAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__MethodSignature__Group__4__Impl"


    // $ANTLR start "rule__Assembly__Group__0"
    // InternalQualityEffectSpecification.g:1892:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1896:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalQualityEffectSpecification.g:1897:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Assembly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__1();

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
    // $ANTLR end "rule__Assembly__Group__0"


    // $ANTLR start "rule__Assembly__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1904:1: rule__Assembly__Group__0__Impl : ( 'Assembly(' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1908:1: ( ( 'Assembly(' ) )
            // InternalQualityEffectSpecification.g:1909:1: ( 'Assembly(' )
            {
            // InternalQualityEffectSpecification.g:1909:1: ( 'Assembly(' )
            // InternalQualityEffectSpecification.g:1910:2: 'Assembly('
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 

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
    // $ANTLR end "rule__Assembly__Group__0__Impl"


    // $ANTLR start "rule__Assembly__Group__1"
    // InternalQualityEffectSpecification.g:1919:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1923:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalQualityEffectSpecification.g:1924:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Assembly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__2();

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
    // $ANTLR end "rule__Assembly__Group__1"


    // $ANTLR start "rule__Assembly__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1931:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NotAssignment_1 )? ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1935:1: ( ( ( rule__Assembly__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1936:1: ( ( rule__Assembly__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1936:1: ( ( rule__Assembly__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1937:2: ( rule__Assembly__NotAssignment_1 )?
            {
             before(grammarAccess.getAssemblyAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1938:2: ( rule__Assembly__NotAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1938:3: rule__Assembly__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assembly__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyAccess().getNotAssignment_1()); 

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
    // $ANTLR end "rule__Assembly__Group__1__Impl"


    // $ANTLR start "rule__Assembly__Group__2"
    // InternalQualityEffectSpecification.g:1946:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1950:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalQualityEffectSpecification.g:1951:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Assembly__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__3();

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
    // $ANTLR end "rule__Assembly__Group__2"


    // $ANTLR start "rule__Assembly__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1958:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__TypeAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1962:1: ( ( ( rule__Assembly__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1963:1: ( ( rule__Assembly__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1963:1: ( ( rule__Assembly__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1964:2: ( rule__Assembly__TypeAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1965:2: ( rule__Assembly__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1965:3: rule__Assembly__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Assembly__Group__2__Impl"


    // $ANTLR start "rule__Assembly__Group__3"
    // InternalQualityEffectSpecification.g:1973:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1977:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalQualityEffectSpecification.g:1978:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Assembly__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__4();

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
    // $ANTLR end "rule__Assembly__Group__3"


    // $ANTLR start "rule__Assembly__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1985:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1989:1: ( ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1990:1: ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1990:1: ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1991:2: ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1991:2: ( ( rule__Assembly__ComponentsAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1992:3: ( rule__Assembly__ComponentsAssignment_3 )
            {
             before(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 
            // InternalQualityEffectSpecification.g:1993:3: ( rule__Assembly__ComponentsAssignment_3 )
            // InternalQualityEffectSpecification.g:1993:4: rule__Assembly__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Assembly__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1996:2: ( ( rule__Assembly__ComponentsAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1997:3: ( rule__Assembly__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 
            // InternalQualityEffectSpecification.g:1998:3: ( rule__Assembly__ComponentsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1998:4: rule__Assembly__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Assembly__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 

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
    // $ANTLR end "rule__Assembly__Group__3__Impl"


    // $ANTLR start "rule__Assembly__Group__4"
    // InternalQualityEffectSpecification.g:2007:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2011:1: ( rule__Assembly__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2012:2: rule__Assembly__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__4__Impl();

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
    // $ANTLR end "rule__Assembly__Group__4"


    // $ANTLR start "rule__Assembly__Group__4__Impl"
    // InternalQualityEffectSpecification.g:2018:1: rule__Assembly__Group__4__Impl : ( ')' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2022:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2023:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2023:1: ( ')' )
            // InternalQualityEffectSpecification.g:2024:2: ')'
            {
             before(grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Assembly__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalQualityEffectSpecification.g:2034:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2038:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalQualityEffectSpecification.g:2039:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalQualityEffectSpecification.g:2046:1: rule__Resource__Group__0__Impl : ( 'Resource(' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2050:1: ( ( 'Resource(' ) )
            // InternalQualityEffectSpecification.g:2051:1: ( 'Resource(' )
            {
            // InternalQualityEffectSpecification.g:2051:1: ( 'Resource(' )
            // InternalQualityEffectSpecification.g:2052:2: 'Resource('
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalQualityEffectSpecification.g:2061:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2065:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalQualityEffectSpecification.g:2066:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalQualityEffectSpecification.g:2073:1: rule__Resource__Group__1__Impl : ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2077:1: ( ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2078:1: ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2078:1: ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2079:2: ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2079:2: ( ( rule__Resource__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2080:3: ( rule__Resource__PropertiesAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2081:3: ( rule__Resource__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:2081:4: rule__Resource__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_27);
            rule__Resource__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2084:2: ( ( rule__Resource__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2085:3: ( rule__Resource__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2086:3: ( rule__Resource__PropertiesAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=34 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2086:4: rule__Resource__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Resource__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalQualityEffectSpecification.g:2095:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2099:1: ( rule__Resource__Group__2__Impl )
            // InternalQualityEffectSpecification.g:2100:2: rule__Resource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__2__Impl();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalQualityEffectSpecification.g:2106:1: rule__Resource__Group__2__Impl : ( ')' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2110:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2111:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2111:1: ( ')' )
            // InternalQualityEffectSpecification.g:2112:2: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__NQA__Group__0"
    // InternalQualityEffectSpecification.g:2122:1: rule__NQA__Group__0 : rule__NQA__Group__0__Impl rule__NQA__Group__1 ;
    public final void rule__NQA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2126:1: ( rule__NQA__Group__0__Impl rule__NQA__Group__1 )
            // InternalQualityEffectSpecification.g:2127:2: rule__NQA__Group__0__Impl rule__NQA__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__NQA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NQA__Group__1();

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
    // $ANTLR end "rule__NQA__Group__0"


    // $ANTLR start "rule__NQA__Group__0__Impl"
    // InternalQualityEffectSpecification.g:2134:1: rule__NQA__Group__0__Impl : ( 'NQA(' ) ;
    public final void rule__NQA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2138:1: ( ( 'NQA(' ) )
            // InternalQualityEffectSpecification.g:2139:1: ( 'NQA(' )
            {
            // InternalQualityEffectSpecification.g:2139:1: ( 'NQA(' )
            // InternalQualityEffectSpecification.g:2140:2: 'NQA('
            {
             before(grammarAccess.getNQAAccess().getNQAKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getNQAKeyword_0()); 

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
    // $ANTLR end "rule__NQA__Group__0__Impl"


    // $ANTLR start "rule__NQA__Group__1"
    // InternalQualityEffectSpecification.g:2149:1: rule__NQA__Group__1 : rule__NQA__Group__1__Impl rule__NQA__Group__2 ;
    public final void rule__NQA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2153:1: ( rule__NQA__Group__1__Impl rule__NQA__Group__2 )
            // InternalQualityEffectSpecification.g:2154:2: rule__NQA__Group__1__Impl rule__NQA__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__NQA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NQA__Group__2();

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
    // $ANTLR end "rule__NQA__Group__1"


    // $ANTLR start "rule__NQA__Group__1__Impl"
    // InternalQualityEffectSpecification.g:2161:1: rule__NQA__Group__1__Impl : ( ( rule__NQA__QualityAssignment_1 ) ) ;
    public final void rule__NQA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2165:1: ( ( ( rule__NQA__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:2166:1: ( ( rule__NQA__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:2166:1: ( ( rule__NQA__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2167:2: ( rule__NQA__QualityAssignment_1 )
            {
             before(grammarAccess.getNQAAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:2168:2: ( rule__NQA__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:2168:3: rule__NQA__QualityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NQA__QualityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNQAAccess().getQualityAssignment_1()); 

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
    // $ANTLR end "rule__NQA__Group__1__Impl"


    // $ANTLR start "rule__NQA__Group__2"
    // InternalQualityEffectSpecification.g:2176:1: rule__NQA__Group__2 : rule__NQA__Group__2__Impl rule__NQA__Group__3 ;
    public final void rule__NQA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2180:1: ( rule__NQA__Group__2__Impl rule__NQA__Group__3 )
            // InternalQualityEffectSpecification.g:2181:2: rule__NQA__Group__2__Impl rule__NQA__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__NQA__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NQA__Group__3();

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
    // $ANTLR end "rule__NQA__Group__2"


    // $ANTLR start "rule__NQA__Group__2__Impl"
    // InternalQualityEffectSpecification.g:2188:1: rule__NQA__Group__2__Impl : ( ( rule__NQA__TypeAssignment_2 ) ) ;
    public final void rule__NQA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2192:1: ( ( ( rule__NQA__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:2193:1: ( ( rule__NQA__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:2193:1: ( ( rule__NQA__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:2194:2: ( rule__NQA__TypeAssignment_2 )
            {
             before(grammarAccess.getNQAAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:2195:2: ( rule__NQA__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:2195:3: rule__NQA__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NQA__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNQAAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__NQA__Group__2__Impl"


    // $ANTLR start "rule__NQA__Group__3"
    // InternalQualityEffectSpecification.g:2203:1: rule__NQA__Group__3 : rule__NQA__Group__3__Impl rule__NQA__Group__4 ;
    public final void rule__NQA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2207:1: ( rule__NQA__Group__3__Impl rule__NQA__Group__4 )
            // InternalQualityEffectSpecification.g:2208:2: rule__NQA__Group__3__Impl rule__NQA__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__NQA__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NQA__Group__4();

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
    // $ANTLR end "rule__NQA__Group__3"


    // $ANTLR start "rule__NQA__Group__3__Impl"
    // InternalQualityEffectSpecification.g:2215:1: rule__NQA__Group__3__Impl : ( ( rule__NQA__ElementAssignment_3 ) ) ;
    public final void rule__NQA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2219:1: ( ( ( rule__NQA__ElementAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2220:1: ( ( rule__NQA__ElementAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2220:1: ( ( rule__NQA__ElementAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2221:2: ( rule__NQA__ElementAssignment_3 )
            {
             before(grammarAccess.getNQAAccess().getElementAssignment_3()); 
            // InternalQualityEffectSpecification.g:2222:2: ( rule__NQA__ElementAssignment_3 )
            // InternalQualityEffectSpecification.g:2222:3: rule__NQA__ElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NQA__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNQAAccess().getElementAssignment_3()); 

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
    // $ANTLR end "rule__NQA__Group__3__Impl"


    // $ANTLR start "rule__NQA__Group__4"
    // InternalQualityEffectSpecification.g:2230:1: rule__NQA__Group__4 : rule__NQA__Group__4__Impl ;
    public final void rule__NQA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2234:1: ( rule__NQA__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2235:2: rule__NQA__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NQA__Group__4__Impl();

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
    // $ANTLR end "rule__NQA__Group__4"


    // $ANTLR start "rule__NQA__Group__4__Impl"
    // InternalQualityEffectSpecification.g:2241:1: rule__NQA__Group__4__Impl : ( ')' ) ;
    public final void rule__NQA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2245:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2246:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2246:1: ( ')' )
            // InternalQualityEffectSpecification.g:2247:2: ')'
            {
             before(grammarAccess.getNQAAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__NQA__Group__4__Impl"


    // $ANTLR start "rule__Reasoning__Group__0"
    // InternalQualityEffectSpecification.g:2257:1: rule__Reasoning__Group__0 : rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 ;
    public final void rule__Reasoning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2261:1: ( rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 )
            // InternalQualityEffectSpecification.g:2262:2: rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Reasoning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__1();

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
    // $ANTLR end "rule__Reasoning__Group__0"


    // $ANTLR start "rule__Reasoning__Group__0__Impl"
    // InternalQualityEffectSpecification.g:2269:1: rule__Reasoning__Group__0__Impl : ( 'Reasoning(' ) ;
    public final void rule__Reasoning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2273:1: ( ( 'Reasoning(' ) )
            // InternalQualityEffectSpecification.g:2274:1: ( 'Reasoning(' )
            {
            // InternalQualityEffectSpecification.g:2274:1: ( 'Reasoning(' )
            // InternalQualityEffectSpecification.g:2275:2: 'Reasoning('
            {
             before(grammarAccess.getReasoningAccess().getReasoningKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getReasoningKeyword_0()); 

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
    // $ANTLR end "rule__Reasoning__Group__0__Impl"


    // $ANTLR start "rule__Reasoning__Group__1"
    // InternalQualityEffectSpecification.g:2284:1: rule__Reasoning__Group__1 : rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 ;
    public final void rule__Reasoning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2288:1: ( rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 )
            // InternalQualityEffectSpecification.g:2289:2: rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Reasoning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__2();

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
    // $ANTLR end "rule__Reasoning__Group__1"


    // $ANTLR start "rule__Reasoning__Group__1__Impl"
    // InternalQualityEffectSpecification.g:2296:1: rule__Reasoning__Group__1__Impl : ( ( rule__Reasoning__QualityAssignment_1 ) ) ;
    public final void rule__Reasoning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2300:1: ( ( ( rule__Reasoning__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:2301:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:2301:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2302:2: ( rule__Reasoning__QualityAssignment_1 )
            {
             before(grammarAccess.getReasoningAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:2303:2: ( rule__Reasoning__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:2303:3: rule__Reasoning__QualityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reasoning__QualityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getQualityAssignment_1()); 

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
    // $ANTLR end "rule__Reasoning__Group__1__Impl"


    // $ANTLR start "rule__Reasoning__Group__2"
    // InternalQualityEffectSpecification.g:2311:1: rule__Reasoning__Group__2 : rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 ;
    public final void rule__Reasoning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2315:1: ( rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 )
            // InternalQualityEffectSpecification.g:2316:2: rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Reasoning__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__3();

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
    // $ANTLR end "rule__Reasoning__Group__2"


    // $ANTLR start "rule__Reasoning__Group__2__Impl"
    // InternalQualityEffectSpecification.g:2323:1: rule__Reasoning__Group__2__Impl : ( ':' ) ;
    public final void rule__Reasoning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2327:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2328:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2328:1: ( ':' )
            // InternalQualityEffectSpecification.g:2329:2: ':'
            {
             before(grammarAccess.getReasoningAccess().getColonKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Reasoning__Group__2__Impl"


    // $ANTLR start "rule__Reasoning__Group__3"
    // InternalQualityEffectSpecification.g:2338:1: rule__Reasoning__Group__3 : rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 ;
    public final void rule__Reasoning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2342:1: ( rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 )
            // InternalQualityEffectSpecification.g:2343:2: rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Reasoning__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__4();

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
    // $ANTLR end "rule__Reasoning__Group__3"


    // $ANTLR start "rule__Reasoning__Group__3__Impl"
    // InternalQualityEffectSpecification.g:2350:1: rule__Reasoning__Group__3__Impl : ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) ;
    public final void rule__Reasoning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2354:1: ( ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:2355:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:2355:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:2356:2: ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:2356:2: ( ( rule__Reasoning__RulesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2357:3: ( rule__Reasoning__RulesAssignment_3 )
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2358:3: ( rule__Reasoning__RulesAssignment_3 )
            // InternalQualityEffectSpecification.g:2358:4: rule__Reasoning__RulesAssignment_3
            {
            pushFollow(FOLLOW_30);
            rule__Reasoning__RulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:2361:2: ( ( rule__Reasoning__RulesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:2362:3: ( rule__Reasoning__RulesAssignment_3 )*
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2363:3: ( rule__Reasoning__RulesAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2363:4: rule__Reasoning__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Reasoning__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 

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
    // $ANTLR end "rule__Reasoning__Group__3__Impl"


    // $ANTLR start "rule__Reasoning__Group__4"
    // InternalQualityEffectSpecification.g:2372:1: rule__Reasoning__Group__4 : rule__Reasoning__Group__4__Impl ;
    public final void rule__Reasoning__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2376:1: ( rule__Reasoning__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2377:2: rule__Reasoning__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__4__Impl();

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
    // $ANTLR end "rule__Reasoning__Group__4"


    // $ANTLR start "rule__Reasoning__Group__4__Impl"
    // InternalQualityEffectSpecification.g:2383:1: rule__Reasoning__Group__4__Impl : ( ')' ) ;
    public final void rule__Reasoning__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2387:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2388:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2388:1: ( ')' )
            // InternalQualityEffectSpecification.g:2389:2: ')'
            {
             before(grammarAccess.getReasoningAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Reasoning__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalQualityEffectSpecification.g:2399:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2403:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalQualityEffectSpecification.g:2404:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalQualityEffectSpecification.g:2411:1: rule__Rule__Group__0__Impl : ( '(' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2415:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2416:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2416:1: ( '(' )
            // InternalQualityEffectSpecification.g:2417:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalQualityEffectSpecification.g:2426:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2430:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalQualityEffectSpecification.g:2431:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalQualityEffectSpecification.g:2438:1: rule__Rule__Group__1__Impl : ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2442:1: ( ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2443:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2443:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2444:2: ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2444:2: ( ( rule__Rule__QualitiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2445:3: ( rule__Rule__QualitiesAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2446:3: ( rule__Rule__QualitiesAssignment_1 )
            // InternalQualityEffectSpecification.g:2446:4: rule__Rule__QualitiesAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__Rule__QualitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2449:2: ( ( rule__Rule__QualitiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2450:3: ( rule__Rule__QualitiesAssignment_1 )*
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2451:3: ( rule__Rule__QualitiesAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2451:4: rule__Rule__QualitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Rule__QualitiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalQualityEffectSpecification.g:2460:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2464:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalQualityEffectSpecification.g:2465:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalQualityEffectSpecification.g:2472:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2476:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2477:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2477:1: ( ':' )
            // InternalQualityEffectSpecification.g:2478:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalQualityEffectSpecification.g:2487:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2491:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalQualityEffectSpecification.g:2492:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalQualityEffectSpecification.g:2499:1: rule__Rule__Group__3__Impl : ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2503:1: ( ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:2504:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:2504:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:2505:2: ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:2505:2: ( ( rule__Rule__EntriesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2506:3: ( rule__Rule__EntriesAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2507:3: ( rule__Rule__EntriesAssignment_3 )
            // InternalQualityEffectSpecification.g:2507:4: rule__Rule__EntriesAssignment_3
            {
            pushFollow(FOLLOW_32);
            rule__Rule__EntriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:2510:2: ( ( rule__Rule__EntriesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:2511:3: ( rule__Rule__EntriesAssignment_3 )*
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2512:3: ( rule__Rule__EntriesAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2512:4: rule__Rule__EntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Rule__EntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalQualityEffectSpecification.g:2521:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2525:1: ( rule__Rule__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2526:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalQualityEffectSpecification.g:2532:1: rule__Rule__Group__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2536:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2537:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2537:1: ( ')' )
            // InternalQualityEffectSpecification.g:2538:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Entry__Group__0"
    // InternalQualityEffectSpecification.g:2548:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2552:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalQualityEffectSpecification.g:2553:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Entry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__1();

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
    // $ANTLR end "rule__Entry__Group__0"


    // $ANTLR start "rule__Entry__Group__0__Impl"
    // InternalQualityEffectSpecification.g:2560:1: rule__Entry__Group__0__Impl : ( '[' ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2564:1: ( ( '[' ) )
            // InternalQualityEffectSpecification.g:2565:1: ( '[' )
            {
            // InternalQualityEffectSpecification.g:2565:1: ( '[' )
            // InternalQualityEffectSpecification.g:2566:2: '['
            {
             before(grammarAccess.getEntryAccess().getLeftSquareBracketKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Entry__Group__0__Impl"


    // $ANTLR start "rule__Entry__Group__1"
    // InternalQualityEffectSpecification.g:2575:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2579:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalQualityEffectSpecification.g:2580:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Entry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__2();

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
    // $ANTLR end "rule__Entry__Group__1"


    // $ANTLR start "rule__Entry__Group__1__Impl"
    // InternalQualityEffectSpecification.g:2587:1: rule__Entry__Group__1__Impl : ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2591:1: ( ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2592:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2592:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2593:2: ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2593:2: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2594:3: ( rule__Entry__KeyAssignment_1 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:2595:3: ( rule__Entry__KeyAssignment_1 )
            // InternalQualityEffectSpecification.g:2595:4: rule__Entry__KeyAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__Entry__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getKeyAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2598:2: ( ( rule__Entry__KeyAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2599:3: ( rule__Entry__KeyAssignment_1 )*
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:2600:3: ( rule__Entry__KeyAssignment_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2600:4: rule__Entry__KeyAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Entry__KeyAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEntryAccess().getKeyAssignment_1()); 

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
    // $ANTLR end "rule__Entry__Group__1__Impl"


    // $ANTLR start "rule__Entry__Group__2"
    // InternalQualityEffectSpecification.g:2609:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2613:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalQualityEffectSpecification.g:2614:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Entry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__3();

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
    // $ANTLR end "rule__Entry__Group__2"


    // $ANTLR start "rule__Entry__Group__2__Impl"
    // InternalQualityEffectSpecification.g:2621:1: rule__Entry__Group__2__Impl : ( ':' ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2625:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2626:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2626:1: ( ':' )
            // InternalQualityEffectSpecification.g:2627:2: ':'
            {
             before(grammarAccess.getEntryAccess().getColonKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Entry__Group__2__Impl"


    // $ANTLR start "rule__Entry__Group__3"
    // InternalQualityEffectSpecification.g:2636:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2640:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalQualityEffectSpecification.g:2641:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Entry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__4();

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
    // $ANTLR end "rule__Entry__Group__3"


    // $ANTLR start "rule__Entry__Group__3__Impl"
    // InternalQualityEffectSpecification.g:2648:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__ValueAssignment_3 ) ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2652:1: ( ( ( rule__Entry__ValueAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2653:1: ( ( rule__Entry__ValueAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2653:1: ( ( rule__Entry__ValueAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2654:2: ( rule__Entry__ValueAssignment_3 )
            {
             before(grammarAccess.getEntryAccess().getValueAssignment_3()); 
            // InternalQualityEffectSpecification.g:2655:2: ( rule__Entry__ValueAssignment_3 )
            // InternalQualityEffectSpecification.g:2655:3: rule__Entry__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entry__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Entry__Group__3__Impl"


    // $ANTLR start "rule__Entry__Group__4"
    // InternalQualityEffectSpecification.g:2663:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2667:1: ( rule__Entry__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2668:2: rule__Entry__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__4__Impl();

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
    // $ANTLR end "rule__Entry__Group__4"


    // $ANTLR start "rule__Entry__Group__4__Impl"
    // InternalQualityEffectSpecification.g:2674:1: rule__Entry__Group__4__Impl : ( ']' ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2678:1: ( ( ']' ) )
            // InternalQualityEffectSpecification.g:2679:1: ( ']' )
            {
            // InternalQualityEffectSpecification.g:2679:1: ( ']' )
            // InternalQualityEffectSpecification.g:2680:2: ']'
            {
             before(grammarAccess.getEntryAccess().getRightSquareBracketKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entry__Group__4__Impl"


    // $ANTLR start "rule__Cost__Group__0"
    // InternalQualityEffectSpecification.g:2690:1: rule__Cost__Group__0 : rule__Cost__Group__0__Impl rule__Cost__Group__1 ;
    public final void rule__Cost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2694:1: ( rule__Cost__Group__0__Impl rule__Cost__Group__1 )
            // InternalQualityEffectSpecification.g:2695:2: rule__Cost__Group__0__Impl rule__Cost__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Cost__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cost__Group__1();

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
    // $ANTLR end "rule__Cost__Group__0"


    // $ANTLR start "rule__Cost__Group__0__Impl"
    // InternalQualityEffectSpecification.g:2702:1: rule__Cost__Group__0__Impl : ( 'Cost(' ) ;
    public final void rule__Cost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2706:1: ( ( 'Cost(' ) )
            // InternalQualityEffectSpecification.g:2707:1: ( 'Cost(' )
            {
            // InternalQualityEffectSpecification.g:2707:1: ( 'Cost(' )
            // InternalQualityEffectSpecification.g:2708:2: 'Cost('
            {
             before(grammarAccess.getCostAccess().getCostKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCostAccess().getCostKeyword_0()); 

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
    // $ANTLR end "rule__Cost__Group__0__Impl"


    // $ANTLR start "rule__Cost__Group__1"
    // InternalQualityEffectSpecification.g:2717:1: rule__Cost__Group__1 : rule__Cost__Group__1__Impl rule__Cost__Group__2 ;
    public final void rule__Cost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2721:1: ( rule__Cost__Group__1__Impl rule__Cost__Group__2 )
            // InternalQualityEffectSpecification.g:2722:2: rule__Cost__Group__1__Impl rule__Cost__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Cost__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cost__Group__2();

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
    // $ANTLR end "rule__Cost__Group__1"


    // $ANTLR start "rule__Cost__Group__1__Impl"
    // InternalQualityEffectSpecification.g:2729:1: rule__Cost__Group__1__Impl : ( ( rule__Cost__TypeAssignment_1 ) ) ;
    public final void rule__Cost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2733:1: ( ( ( rule__Cost__TypeAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:2734:1: ( ( rule__Cost__TypeAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:2734:1: ( ( rule__Cost__TypeAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2735:2: ( rule__Cost__TypeAssignment_1 )
            {
             before(grammarAccess.getCostAccess().getTypeAssignment_1()); 
            // InternalQualityEffectSpecification.g:2736:2: ( rule__Cost__TypeAssignment_1 )
            // InternalQualityEffectSpecification.g:2736:3: rule__Cost__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cost__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCostAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Cost__Group__1__Impl"


    // $ANTLR start "rule__Cost__Group__2"
    // InternalQualityEffectSpecification.g:2744:1: rule__Cost__Group__2 : rule__Cost__Group__2__Impl rule__Cost__Group__3 ;
    public final void rule__Cost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2748:1: ( rule__Cost__Group__2__Impl rule__Cost__Group__3 )
            // InternalQualityEffectSpecification.g:2749:2: rule__Cost__Group__2__Impl rule__Cost__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Cost__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cost__Group__3();

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
    // $ANTLR end "rule__Cost__Group__2"


    // $ANTLR start "rule__Cost__Group__2__Impl"
    // InternalQualityEffectSpecification.g:2756:1: rule__Cost__Group__2__Impl : ( ( rule__Cost__CostAssignment_2 ) ) ;
    public final void rule__Cost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2760:1: ( ( ( rule__Cost__CostAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:2761:1: ( ( rule__Cost__CostAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:2761:1: ( ( rule__Cost__CostAssignment_2 ) )
            // InternalQualityEffectSpecification.g:2762:2: ( rule__Cost__CostAssignment_2 )
            {
             before(grammarAccess.getCostAccess().getCostAssignment_2()); 
            // InternalQualityEffectSpecification.g:2763:2: ( rule__Cost__CostAssignment_2 )
            // InternalQualityEffectSpecification.g:2763:3: rule__Cost__CostAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cost__CostAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCostAccess().getCostAssignment_2()); 

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
    // $ANTLR end "rule__Cost__Group__2__Impl"


    // $ANTLR start "rule__Cost__Group__3"
    // InternalQualityEffectSpecification.g:2771:1: rule__Cost__Group__3 : rule__Cost__Group__3__Impl ;
    public final void rule__Cost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2775:1: ( rule__Cost__Group__3__Impl )
            // InternalQualityEffectSpecification.g:2776:2: rule__Cost__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cost__Group__3__Impl();

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
    // $ANTLR end "rule__Cost__Group__3"


    // $ANTLR start "rule__Cost__Group__3__Impl"
    // InternalQualityEffectSpecification.g:2782:1: rule__Cost__Group__3__Impl : ( ')' ) ;
    public final void rule__Cost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2786:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2787:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2787:1: ( ')' )
            // InternalQualityEffectSpecification.g:2788:2: ')'
            {
             before(grammarAccess.getCostAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCostAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Cost__Group__3__Impl"


    // $ANTLR start "rule__Model__SpecificationsAssignment"
    // InternalQualityEffectSpecification.g:2798:1: rule__Model__SpecificationsAssignment : ( ruleQES ) ;
    public final void rule__Model__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2802:1: ( ( ruleQES ) )
            // InternalQualityEffectSpecification.g:2803:2: ( ruleQES )
            {
            // InternalQualityEffectSpecification.g:2803:2: ( ruleQES )
            // InternalQualityEffectSpecification.g:2804:3: ruleQES
            {
             before(grammarAccess.getModelAccess().getSpecificationsQESParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQES();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSpecificationsQESParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__SpecificationsAssignment"


    // $ANTLR start "rule__QES__ComponentsAssignment_1"
    // InternalQualityEffectSpecification.g:2813:1: rule__QES__ComponentsAssignment_1 : ( ruleComponentSpecification ) ;
    public final void rule__QES__ComponentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2817:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:2818:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:2818:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:2819:3: ruleComponentSpecification
            {
             before(grammarAccess.getQESAccess().getComponentsComponentSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentSpecification();

            state._fsp--;

             after(grammarAccess.getQESAccess().getComponentsComponentSpecificationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QES__ComponentsAssignment_1"


    // $ANTLR start "rule__QES__TransformationsAssignment_4"
    // InternalQualityEffectSpecification.g:2828:1: rule__QES__TransformationsAssignment_4 : ( ruleTransformationSpecification ) ;
    public final void rule__QES__TransformationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2832:1: ( ( ruleTransformationSpecification ) )
            // InternalQualityEffectSpecification.g:2833:2: ( ruleTransformationSpecification )
            {
            // InternalQualityEffectSpecification.g:2833:2: ( ruleTransformationSpecification )
            // InternalQualityEffectSpecification.g:2834:3: ruleTransformationSpecification
            {
             before(grammarAccess.getQESAccess().getTransformationsTransformationSpecificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformationSpecification();

            state._fsp--;

             after(grammarAccess.getQESAccess().getTransformationsTransformationSpecificationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__QES__TransformationsAssignment_4"


    // $ANTLR start "rule__ComponentSpecification__PropertiesAssignment_1"
    // InternalQualityEffectSpecification.g:2843:1: rule__ComponentSpecification__PropertiesAssignment_1 : ( ruleComponentProperty ) ;
    public final void rule__ComponentSpecification__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2847:1: ( ( ruleComponentProperty ) )
            // InternalQualityEffectSpecification.g:2848:2: ( ruleComponentProperty )
            {
            // InternalQualityEffectSpecification.g:2848:2: ( ruleComponentProperty )
            // InternalQualityEffectSpecification.g:2849:3: ruleComponentProperty
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentProperty();

            state._fsp--;

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentSpecification__PropertiesAssignment_1"


    // $ANTLR start "rule__Name__NotAssignment_1"
    // InternalQualityEffectSpecification.g:2858:1: rule__Name__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Name__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2862:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2863:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2863:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2864:3: ( 'Not' )
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2865:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2866:4: 'Not'
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 

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
    // $ANTLR end "rule__Name__NotAssignment_1"


    // $ANTLR start "rule__Name__NameAssignment_2"
    // InternalQualityEffectSpecification.g:2877:1: rule__Name__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Name__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2881:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2882:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2882:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2883:3: RULE_STRING
            {
             before(grammarAccess.getNameAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Name__NameAssignment_2"


    // $ANTLR start "rule__Identifier__NotAssignment_1"
    // InternalQualityEffectSpecification.g:2892:1: rule__Identifier__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Identifier__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2896:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2897:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2897:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2898:3: ( 'Not' )
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2899:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2900:4: 'Not'
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 

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
    // $ANTLR end "rule__Identifier__NotAssignment_1"


    // $ANTLR start "rule__Identifier__IdAssignment_2"
    // InternalQualityEffectSpecification.g:2911:1: rule__Identifier__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__Identifier__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2915:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2916:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2916:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2917:3: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Identifier__IdAssignment_2"


    // $ANTLR start "rule__Type__NotAssignment_1"
    // InternalQualityEffectSpecification.g:2926:1: rule__Type__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Type__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2930:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2931:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2931:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2932:3: ( 'Not' )
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2933:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2934:4: 'Not'
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 

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
    // $ANTLR end "rule__Type__NotAssignment_1"


    // $ANTLR start "rule__Type__TypeAssignment_2"
    // InternalQualityEffectSpecification.g:2945:1: rule__Type__TypeAssignment_2 : ( ruleComponentType ) ;
    public final void rule__Type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2949:1: ( ( ruleComponentType ) )
            // InternalQualityEffectSpecification.g:2950:2: ( ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:2950:2: ( ruleComponentType )
            // InternalQualityEffectSpecification.g:2951:3: ruleComponentType
            {
             before(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Type__TypeAssignment_2"


    // $ANTLR start "rule__Role__NotAssignment_1"
    // InternalQualityEffectSpecification.g:2960:1: rule__Role__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Role__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2964:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2965:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2965:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2966:3: ( 'Not' )
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2967:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2968:4: 'Not'
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 

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
    // $ANTLR end "rule__Role__NotAssignment_1"


    // $ANTLR start "rule__Role__TypeAssignment_2"
    // InternalQualityEffectSpecification.g:2979:1: rule__Role__TypeAssignment_2 : ( ruleRoleType ) ;
    public final void rule__Role__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2983:1: ( ( ruleRoleType ) )
            // InternalQualityEffectSpecification.g:2984:2: ( ruleRoleType )
            {
            // InternalQualityEffectSpecification.g:2984:2: ( ruleRoleType )
            // InternalQualityEffectSpecification.g:2985:3: ruleRoleType
            {
             before(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleType();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Role__TypeAssignment_2"


    // $ANTLR start "rule__Role__PropertiesAssignment_3"
    // InternalQualityEffectSpecification.g:2994:1: rule__Role__PropertiesAssignment_3 : ( ruleRoleProperty ) ;
    public final void rule__Role__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2998:1: ( ( ruleRoleProperty ) )
            // InternalQualityEffectSpecification.g:2999:2: ( ruleRoleProperty )
            {
            // InternalQualityEffectSpecification.g:2999:2: ( ruleRoleProperty )
            // InternalQualityEffectSpecification.g:3000:3: ruleRoleProperty
            {
             before(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleProperty();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Role__PropertiesAssignment_3"


    // $ANTLR start "rule__Interface__PropertiesAssignment_1"
    // InternalQualityEffectSpecification.g:3009:1: rule__Interface__PropertiesAssignment_1 : ( ruleInterfaceProperty ) ;
    public final void rule__Interface__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3013:1: ( ( ruleInterfaceProperty ) )
            // InternalQualityEffectSpecification.g:3014:2: ( ruleInterfaceProperty )
            {
            // InternalQualityEffectSpecification.g:3014:2: ( ruleInterfaceProperty )
            // InternalQualityEffectSpecification.g:3015:3: ruleInterfaceProperty
            {
             before(grammarAccess.getInterfaceAccess().getPropertiesInterfacePropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterfaceProperty();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getPropertiesInterfacePropertyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interface__PropertiesAssignment_1"


    // $ANTLR start "rule__MethodSignature__NameAssignment_1"
    // InternalQualityEffectSpecification.g:3024:1: rule__MethodSignature__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MethodSignature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3028:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3029:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3029:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3030:3: RULE_STRING
            {
             before(grammarAccess.getMethodSignatureAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMethodSignatureAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MethodSignature__NameAssignment_1"


    // $ANTLR start "rule__MethodSignature__ParameterTypesAssignment_3"
    // InternalQualityEffectSpecification.g:3039:1: rule__MethodSignature__ParameterTypesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MethodSignature__ParameterTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3043:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3044:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3044:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3045:3: RULE_STRING
            {
             before(grammarAccess.getMethodSignatureAccess().getParameterTypesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMethodSignatureAccess().getParameterTypesSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__MethodSignature__ParameterTypesAssignment_3"


    // $ANTLR start "rule__Assembly__NotAssignment_1"
    // InternalQualityEffectSpecification.g:3054:1: rule__Assembly__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Assembly__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3058:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:3059:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:3059:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:3060:3: ( 'Not' )
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:3061:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:3062:4: 'Not'
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 

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
    // $ANTLR end "rule__Assembly__NotAssignment_1"


    // $ANTLR start "rule__Assembly__TypeAssignment_2"
    // InternalQualityEffectSpecification.g:3073:1: rule__Assembly__TypeAssignment_2 : ( ruleAssemblyType ) ;
    public final void rule__Assembly__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3077:1: ( ( ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:3078:2: ( ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:3078:2: ( ruleAssemblyType )
            // InternalQualityEffectSpecification.g:3079:3: ruleAssemblyType
            {
             before(grammarAccess.getAssemblyAccess().getTypeAssemblyTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyType();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getTypeAssemblyTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assembly__TypeAssignment_2"


    // $ANTLR start "rule__Assembly__ComponentsAssignment_3"
    // InternalQualityEffectSpecification.g:3088:1: rule__Assembly__ComponentsAssignment_3 : ( ruleComponentSpecification ) ;
    public final void rule__Assembly__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3092:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:3093:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:3093:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:3094:3: ruleComponentSpecification
            {
             before(grammarAccess.getAssemblyAccess().getComponentsComponentSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentSpecification();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getComponentsComponentSpecificationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Assembly__ComponentsAssignment_3"


    // $ANTLR start "rule__Resource__PropertiesAssignment_1"
    // InternalQualityEffectSpecification.g:3103:1: rule__Resource__PropertiesAssignment_1 : ( ruleResourceProperty ) ;
    public final void rule__Resource__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3107:1: ( ( ruleResourceProperty ) )
            // InternalQualityEffectSpecification.g:3108:2: ( ruleResourceProperty )
            {
            // InternalQualityEffectSpecification.g:3108:2: ( ruleResourceProperty )
            // InternalQualityEffectSpecification.g:3109:3: ruleResourceProperty
            {
             before(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResourceProperty();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Resource__PropertiesAssignment_1"


    // $ANTLR start "rule__NQA__QualityAssignment_1"
    // InternalQualityEffectSpecification.g:3118:1: rule__NQA__QualityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NQA__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3122:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3123:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3123:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3124:3: RULE_STRING
            {
             before(grammarAccess.getNQAAccess().getQualitySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getQualitySTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NQA__QualityAssignment_1"


    // $ANTLR start "rule__NQA__TypeAssignment_2"
    // InternalQualityEffectSpecification.g:3133:1: rule__NQA__TypeAssignment_2 : ( ruleTransformationType ) ;
    public final void rule__NQA__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3137:1: ( ( ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:3138:2: ( ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:3138:2: ( ruleTransformationType )
            // InternalQualityEffectSpecification.g:3139:3: ruleTransformationType
            {
             before(grammarAccess.getNQAAccess().getTypeTransformationTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformationType();

            state._fsp--;

             after(grammarAccess.getNQAAccess().getTypeTransformationTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__NQA__TypeAssignment_2"


    // $ANTLR start "rule__NQA__ElementAssignment_3"
    // InternalQualityEffectSpecification.g:3148:1: rule__NQA__ElementAssignment_3 : ( RULE_STRING ) ;
    public final void rule__NQA__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3152:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3153:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3153:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3154:3: RULE_STRING
            {
             before(grammarAccess.getNQAAccess().getElementSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getElementSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__NQA__ElementAssignment_3"


    // $ANTLR start "rule__Reasoning__QualityAssignment_1"
    // InternalQualityEffectSpecification.g:3163:1: rule__Reasoning__QualityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Reasoning__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3167:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3168:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3168:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3169:3: RULE_STRING
            {
             before(grammarAccess.getReasoningAccess().getQualitySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getQualitySTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Reasoning__QualityAssignment_1"


    // $ANTLR start "rule__Reasoning__RulesAssignment_3"
    // InternalQualityEffectSpecification.g:3178:1: rule__Reasoning__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Reasoning__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3182:1: ( ( ruleRule ) )
            // InternalQualityEffectSpecification.g:3183:2: ( ruleRule )
            {
            // InternalQualityEffectSpecification.g:3183:2: ( ruleRule )
            // InternalQualityEffectSpecification.g:3184:3: ruleRule
            {
             before(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Reasoning__RulesAssignment_3"


    // $ANTLR start "rule__Rule__QualitiesAssignment_1"
    // InternalQualityEffectSpecification.g:3193:1: rule__Rule__QualitiesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__QualitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3197:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3198:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3198:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3199:3: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__QualitiesAssignment_1"


    // $ANTLR start "rule__Rule__EntriesAssignment_3"
    // InternalQualityEffectSpecification.g:3208:1: rule__Rule__EntriesAssignment_3 : ( ruleEntry ) ;
    public final void rule__Rule__EntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3212:1: ( ( ruleEntry ) )
            // InternalQualityEffectSpecification.g:3213:2: ( ruleEntry )
            {
            // InternalQualityEffectSpecification.g:3213:2: ( ruleEntry )
            // InternalQualityEffectSpecification.g:3214:3: ruleEntry
            {
             before(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__EntriesAssignment_3"


    // $ANTLR start "rule__Entry__KeyAssignment_1"
    // InternalQualityEffectSpecification.g:3223:1: rule__Entry__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3227:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3228:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3228:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3229:3: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entry__KeyAssignment_1"


    // $ANTLR start "rule__Entry__ValueAssignment_3"
    // InternalQualityEffectSpecification.g:3238:1: rule__Entry__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Entry__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3242:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3243:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3243:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3244:3: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entry__ValueAssignment_3"


    // $ANTLR start "rule__Cost__TypeAssignment_1"
    // InternalQualityEffectSpecification.g:3253:1: rule__Cost__TypeAssignment_1 : ( ruleTransformationType ) ;
    public final void rule__Cost__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3257:1: ( ( ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:3258:2: ( ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:3258:2: ( ruleTransformationType )
            // InternalQualityEffectSpecification.g:3259:3: ruleTransformationType
            {
             before(grammarAccess.getCostAccess().getTypeTransformationTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformationType();

            state._fsp--;

             after(grammarAccess.getCostAccess().getTypeTransformationTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cost__TypeAssignment_1"


    // $ANTLR start "rule__Cost__CostAssignment_2"
    // InternalQualityEffectSpecification.g:3268:1: rule__Cost__CostAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cost__CostAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3272:1: ( ( RULE_INT ) )
            // InternalQualityEffectSpecification.g:3273:2: ( RULE_INT )
            {
            // InternalQualityEffectSpecification.g:3273:2: ( RULE_INT )
            // InternalQualityEffectSpecification.g:3274:3: RULE_INT
            {
             before(grammarAccess.getCostAccess().getCostINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCostAccess().getCostINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Cost__CostAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001180000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001180000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000063C00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000063C00000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000003800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00020000001FC000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004C00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004C00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008C00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008C00000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000000E00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});

}