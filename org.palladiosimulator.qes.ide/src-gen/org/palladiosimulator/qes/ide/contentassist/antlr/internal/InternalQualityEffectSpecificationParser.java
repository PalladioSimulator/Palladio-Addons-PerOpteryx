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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyComponentType'", "'Basic'", "'Composite'", "'AnyRoleType'", "'ComponentRequiredProvided'", "'ComponentRequired'", "'ComponentProvided'", "'InfrastructureRequiredProvided'", "'InfrastructureRequired'", "'InfrastructureProvided'", "'AnyAssembly'", "'Required'", "'Provided'", "'='", "'+'", "'-'", "'*'", "'/'", "'For{'", "'}'", "'Do{'", "'Component('", "')'", "'Name('", "'Id('", "'Type('", "'Role('", "'Assembly('", "'Resource('", "'NQA('", "'Reasoning('", "':'", "'('", "'['", "']'", "'Cost('", "'Not'"
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


    // $ANTLR start "entryRuleAssembly"
    // InternalQualityEffectSpecification.g:285:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:286:1: ( ruleAssembly EOF )
            // InternalQualityEffectSpecification.g:287:1: ruleAssembly EOF
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
    // InternalQualityEffectSpecification.g:294:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:298:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:299:2: ( ( rule__Assembly__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:299:2: ( ( rule__Assembly__Group__0 ) )
            // InternalQualityEffectSpecification.g:300:3: ( rule__Assembly__Group__0 )
            {
             before(grammarAccess.getAssemblyAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:301:3: ( rule__Assembly__Group__0 )
            // InternalQualityEffectSpecification.g:301:4: rule__Assembly__Group__0
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
    // InternalQualityEffectSpecification.g:310:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:311:1: ( ruleResource EOF )
            // InternalQualityEffectSpecification.g:312:1: ruleResource EOF
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
    // InternalQualityEffectSpecification.g:319:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:323:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:324:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:324:2: ( ( rule__Resource__Group__0 ) )
            // InternalQualityEffectSpecification.g:325:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:326:3: ( rule__Resource__Group__0 )
            // InternalQualityEffectSpecification.g:326:4: rule__Resource__Group__0
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
    // InternalQualityEffectSpecification.g:335:1: entryRuleResourceProperty : ruleResourceProperty EOF ;
    public final void entryRuleResourceProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:336:1: ( ruleResourceProperty EOF )
            // InternalQualityEffectSpecification.g:337:1: ruleResourceProperty EOF
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
    // InternalQualityEffectSpecification.g:344:1: ruleResourceProperty : ( ( rule__ResourceProperty__Alternatives ) ) ;
    public final void ruleResourceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:348:2: ( ( ( rule__ResourceProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:349:2: ( ( rule__ResourceProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:349:2: ( ( rule__ResourceProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:350:3: ( rule__ResourceProperty__Alternatives )
            {
             before(grammarAccess.getResourcePropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:351:3: ( rule__ResourceProperty__Alternatives )
            // InternalQualityEffectSpecification.g:351:4: rule__ResourceProperty__Alternatives
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
    // InternalQualityEffectSpecification.g:360:1: entryRuleTransformationSpecification : ruleTransformationSpecification EOF ;
    public final void entryRuleTransformationSpecification() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:361:1: ( ruleTransformationSpecification EOF )
            // InternalQualityEffectSpecification.g:362:1: ruleTransformationSpecification EOF
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
    // InternalQualityEffectSpecification.g:369:1: ruleTransformationSpecification : ( ( rule__TransformationSpecification__Alternatives ) ) ;
    public final void ruleTransformationSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:373:2: ( ( ( rule__TransformationSpecification__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:374:2: ( ( rule__TransformationSpecification__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:374:2: ( ( rule__TransformationSpecification__Alternatives ) )
            // InternalQualityEffectSpecification.g:375:3: ( rule__TransformationSpecification__Alternatives )
            {
             before(grammarAccess.getTransformationSpecificationAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:376:3: ( rule__TransformationSpecification__Alternatives )
            // InternalQualityEffectSpecification.g:376:4: rule__TransformationSpecification__Alternatives
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
    // InternalQualityEffectSpecification.g:385:1: entryRuleNQA : ruleNQA EOF ;
    public final void entryRuleNQA() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:386:1: ( ruleNQA EOF )
            // InternalQualityEffectSpecification.g:387:1: ruleNQA EOF
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
    // InternalQualityEffectSpecification.g:394:1: ruleNQA : ( ( rule__NQA__Group__0 ) ) ;
    public final void ruleNQA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:398:2: ( ( ( rule__NQA__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:399:2: ( ( rule__NQA__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:399:2: ( ( rule__NQA__Group__0 ) )
            // InternalQualityEffectSpecification.g:400:3: ( rule__NQA__Group__0 )
            {
             before(grammarAccess.getNQAAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:401:3: ( rule__NQA__Group__0 )
            // InternalQualityEffectSpecification.g:401:4: rule__NQA__Group__0
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
    // InternalQualityEffectSpecification.g:410:1: entryRuleReasoning : ruleReasoning EOF ;
    public final void entryRuleReasoning() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:411:1: ( ruleReasoning EOF )
            // InternalQualityEffectSpecification.g:412:1: ruleReasoning EOF
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
    // InternalQualityEffectSpecification.g:419:1: ruleReasoning : ( ( rule__Reasoning__Group__0 ) ) ;
    public final void ruleReasoning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:423:2: ( ( ( rule__Reasoning__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:424:2: ( ( rule__Reasoning__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:424:2: ( ( rule__Reasoning__Group__0 ) )
            // InternalQualityEffectSpecification.g:425:3: ( rule__Reasoning__Group__0 )
            {
             before(grammarAccess.getReasoningAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:426:3: ( rule__Reasoning__Group__0 )
            // InternalQualityEffectSpecification.g:426:4: rule__Reasoning__Group__0
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
    // InternalQualityEffectSpecification.g:435:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:436:1: ( ruleRule EOF )
            // InternalQualityEffectSpecification.g:437:1: ruleRule EOF
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
    // InternalQualityEffectSpecification.g:444:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:448:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:449:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:449:2: ( ( rule__Rule__Group__0 ) )
            // InternalQualityEffectSpecification.g:450:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:451:3: ( rule__Rule__Group__0 )
            // InternalQualityEffectSpecification.g:451:4: rule__Rule__Group__0
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
    // InternalQualityEffectSpecification.g:460:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:461:1: ( ruleEntry EOF )
            // InternalQualityEffectSpecification.g:462:1: ruleEntry EOF
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
    // InternalQualityEffectSpecification.g:469:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:473:2: ( ( ( rule__Entry__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:474:2: ( ( rule__Entry__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:474:2: ( ( rule__Entry__Group__0 ) )
            // InternalQualityEffectSpecification.g:475:3: ( rule__Entry__Group__0 )
            {
             before(grammarAccess.getEntryAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:476:3: ( rule__Entry__Group__0 )
            // InternalQualityEffectSpecification.g:476:4: rule__Entry__Group__0
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
    // InternalQualityEffectSpecification.g:485:1: entryRuleCost : ruleCost EOF ;
    public final void entryRuleCost() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:486:1: ( ruleCost EOF )
            // InternalQualityEffectSpecification.g:487:1: ruleCost EOF
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
    // InternalQualityEffectSpecification.g:494:1: ruleCost : ( ( rule__Cost__Group__0 ) ) ;
    public final void ruleCost() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:498:2: ( ( ( rule__Cost__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:499:2: ( ( rule__Cost__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:499:2: ( ( rule__Cost__Group__0 ) )
            // InternalQualityEffectSpecification.g:500:3: ( rule__Cost__Group__0 )
            {
             before(grammarAccess.getCostAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:501:3: ( rule__Cost__Group__0 )
            // InternalQualityEffectSpecification.g:501:4: rule__Cost__Group__0
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
    // InternalQualityEffectSpecification.g:510:1: ruleComponentType : ( ( rule__ComponentType__Alternatives ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:514:1: ( ( ( rule__ComponentType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:515:2: ( ( rule__ComponentType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:515:2: ( ( rule__ComponentType__Alternatives ) )
            // InternalQualityEffectSpecification.g:516:3: ( rule__ComponentType__Alternatives )
            {
             before(grammarAccess.getComponentTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:517:3: ( rule__ComponentType__Alternatives )
            // InternalQualityEffectSpecification.g:517:4: rule__ComponentType__Alternatives
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
    // InternalQualityEffectSpecification.g:526:1: ruleRoleType : ( ( rule__RoleType__Alternatives ) ) ;
    public final void ruleRoleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:530:1: ( ( ( rule__RoleType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:531:2: ( ( rule__RoleType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:531:2: ( ( rule__RoleType__Alternatives ) )
            // InternalQualityEffectSpecification.g:532:3: ( rule__RoleType__Alternatives )
            {
             before(grammarAccess.getRoleTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:533:3: ( rule__RoleType__Alternatives )
            // InternalQualityEffectSpecification.g:533:4: rule__RoleType__Alternatives
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
    // InternalQualityEffectSpecification.g:542:1: ruleAssemblyType : ( ( rule__AssemblyType__Alternatives ) ) ;
    public final void ruleAssemblyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:546:1: ( ( ( rule__AssemblyType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:547:2: ( ( rule__AssemblyType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:547:2: ( ( rule__AssemblyType__Alternatives ) )
            // InternalQualityEffectSpecification.g:548:3: ( rule__AssemblyType__Alternatives )
            {
             before(grammarAccess.getAssemblyTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:549:3: ( rule__AssemblyType__Alternatives )
            // InternalQualityEffectSpecification.g:549:4: rule__AssemblyType__Alternatives
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
    // InternalQualityEffectSpecification.g:558:1: ruleTransformationType : ( ( rule__TransformationType__Alternatives ) ) ;
    public final void ruleTransformationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:562:1: ( ( ( rule__TransformationType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:563:2: ( ( rule__TransformationType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:563:2: ( ( rule__TransformationType__Alternatives ) )
            // InternalQualityEffectSpecification.g:564:3: ( rule__TransformationType__Alternatives )
            {
             before(grammarAccess.getTransformationTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:565:3: ( rule__TransformationType__Alternatives )
            // InternalQualityEffectSpecification.g:565:4: rule__TransformationType__Alternatives
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
    // InternalQualityEffectSpecification.g:573:1: rule__ComponentProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) );
    public final void rule__ComponentProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:577:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) )
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
            case 38:
                {
                alt2=5;
                }
                break;
            case 39:
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
                    // InternalQualityEffectSpecification.g:578:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:578:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:579:3: ruleName
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
                    // InternalQualityEffectSpecification.g:584:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:584:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:585:3: ruleIdentifier
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
                    // InternalQualityEffectSpecification.g:590:2: ( ruleType )
                    {
                    // InternalQualityEffectSpecification.g:590:2: ( ruleType )
                    // InternalQualityEffectSpecification.g:591:3: ruleType
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
                    // InternalQualityEffectSpecification.g:596:2: ( ruleRole )
                    {
                    // InternalQualityEffectSpecification.g:596:2: ( ruleRole )
                    // InternalQualityEffectSpecification.g:597:3: ruleRole
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
                    // InternalQualityEffectSpecification.g:602:2: ( ruleAssembly )
                    {
                    // InternalQualityEffectSpecification.g:602:2: ( ruleAssembly )
                    // InternalQualityEffectSpecification.g:603:3: ruleAssembly
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
                    // InternalQualityEffectSpecification.g:608:2: ( ruleResource )
                    {
                    // InternalQualityEffectSpecification.g:608:2: ( ruleResource )
                    // InternalQualityEffectSpecification.g:609:3: ruleResource
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
    // InternalQualityEffectSpecification.g:618:1: rule__RoleProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) );
    public final void rule__RoleProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:622:1: ( ( ruleName ) | ( ruleIdentifier ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQualityEffectSpecification.g:623:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:623:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:624:3: ruleName
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
                    // InternalQualityEffectSpecification.g:629:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:629:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:630:3: ruleIdentifier
                    {
                     before(grammarAccess.getRolePropertyAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getRolePropertyAccess().getIdentifierParserRuleCall_1()); 

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


    // $ANTLR start "rule__ResourceProperty__Alternatives"
    // InternalQualityEffectSpecification.g:639:1: rule__ResourceProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) );
    public final void rule__ResourceProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:643:1: ( ( ruleName ) | ( ruleIdentifier ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQualityEffectSpecification.g:644:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:644:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:645:3: ruleName
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
                    // InternalQualityEffectSpecification.g:650:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:650:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:651:3: ruleIdentifier
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
    // InternalQualityEffectSpecification.g:660:1: rule__TransformationSpecification__Alternatives : ( ( ruleNQA ) | ( ruleReasoning ) | ( ruleCost ) );
    public final void rule__TransformationSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:664:1: ( ( ruleNQA ) | ( ruleReasoning ) | ( ruleCost ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 46:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQualityEffectSpecification.g:665:2: ( ruleNQA )
                    {
                    // InternalQualityEffectSpecification.g:665:2: ( ruleNQA )
                    // InternalQualityEffectSpecification.g:666:3: ruleNQA
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
                    // InternalQualityEffectSpecification.g:671:2: ( ruleReasoning )
                    {
                    // InternalQualityEffectSpecification.g:671:2: ( ruleReasoning )
                    // InternalQualityEffectSpecification.g:672:3: ruleReasoning
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
                    // InternalQualityEffectSpecification.g:677:2: ( ruleCost )
                    {
                    // InternalQualityEffectSpecification.g:677:2: ( ruleCost )
                    // InternalQualityEffectSpecification.g:678:3: ruleCost
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
    // InternalQualityEffectSpecification.g:687:1: rule__ComponentType__Alternatives : ( ( ( 'AnyComponentType' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) );
    public final void rule__ComponentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:691:1: ( ( ( 'AnyComponentType' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
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
                    // InternalQualityEffectSpecification.g:692:2: ( ( 'AnyComponentType' ) )
                    {
                    // InternalQualityEffectSpecification.g:692:2: ( ( 'AnyComponentType' ) )
                    // InternalQualityEffectSpecification.g:693:3: ( 'AnyComponentType' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:694:3: ( 'AnyComponentType' )
                    // InternalQualityEffectSpecification.g:694:4: 'AnyComponentType'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:698:2: ( ( 'Basic' ) )
                    {
                    // InternalQualityEffectSpecification.g:698:2: ( ( 'Basic' ) )
                    // InternalQualityEffectSpecification.g:699:3: ( 'Basic' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:700:3: ( 'Basic' )
                    // InternalQualityEffectSpecification.g:700:4: 'Basic'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:704:2: ( ( 'Composite' ) )
                    {
                    // InternalQualityEffectSpecification.g:704:2: ( ( 'Composite' ) )
                    // InternalQualityEffectSpecification.g:705:3: ( 'Composite' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:706:3: ( 'Composite' )
                    // InternalQualityEffectSpecification.g:706:4: 'Composite'
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
    // InternalQualityEffectSpecification.g:714:1: rule__RoleType__Alternatives : ( ( ( 'AnyRoleType' ) ) | ( ( 'ComponentRequiredProvided' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'InfrastructureRequiredProvided' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) );
    public final void rule__RoleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:718:1: ( ( ( 'AnyRoleType' ) ) | ( ( 'ComponentRequiredProvided' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'InfrastructureRequiredProvided' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            case 20:
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
                    // InternalQualityEffectSpecification.g:719:2: ( ( 'AnyRoleType' ) )
                    {
                    // InternalQualityEffectSpecification.g:719:2: ( ( 'AnyRoleType' ) )
                    // InternalQualityEffectSpecification.g:720:3: ( 'AnyRoleType' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:721:3: ( 'AnyRoleType' )
                    // InternalQualityEffectSpecification.g:721:4: 'AnyRoleType'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:725:2: ( ( 'ComponentRequiredProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:725:2: ( ( 'ComponentRequiredProvided' ) )
                    // InternalQualityEffectSpecification.g:726:3: ( 'ComponentRequiredProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:727:3: ( 'ComponentRequiredProvided' )
                    // InternalQualityEffectSpecification.g:727:4: 'ComponentRequiredProvided'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:731:2: ( ( 'ComponentRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:731:2: ( ( 'ComponentRequired' ) )
                    // InternalQualityEffectSpecification.g:732:3: ( 'ComponentRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:733:3: ( 'ComponentRequired' )
                    // InternalQualityEffectSpecification.g:733:4: 'ComponentRequired'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:737:2: ( ( 'ComponentProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:737:2: ( ( 'ComponentProvided' ) )
                    // InternalQualityEffectSpecification.g:738:3: ( 'ComponentProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:739:3: ( 'ComponentProvided' )
                    // InternalQualityEffectSpecification.g:739:4: 'ComponentProvided'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:743:2: ( ( 'InfrastructureRequiredProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:743:2: ( ( 'InfrastructureRequiredProvided' ) )
                    // InternalQualityEffectSpecification.g:744:3: ( 'InfrastructureRequiredProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:745:3: ( 'InfrastructureRequiredProvided' )
                    // InternalQualityEffectSpecification.g:745:4: 'InfrastructureRequiredProvided'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:749:2: ( ( 'InfrastructureRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:749:2: ( ( 'InfrastructureRequired' ) )
                    // InternalQualityEffectSpecification.g:750:3: ( 'InfrastructureRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 
                    // InternalQualityEffectSpecification.g:751:3: ( 'InfrastructureRequired' )
                    // InternalQualityEffectSpecification.g:751:4: 'InfrastructureRequired'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:755:2: ( ( 'InfrastructureProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:755:2: ( ( 'InfrastructureProvided' ) )
                    // InternalQualityEffectSpecification.g:756:3: ( 'InfrastructureProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_PROVIDEDEnumLiteralDeclaration_6()); 
                    // InternalQualityEffectSpecification.g:757:3: ( 'InfrastructureProvided' )
                    // InternalQualityEffectSpecification.g:757:4: 'InfrastructureProvided'
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
    // InternalQualityEffectSpecification.g:765:1: rule__AssemblyType__Alternatives : ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) );
    public final void rule__AssemblyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:769:1: ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQualityEffectSpecification.g:770:2: ( ( 'AnyAssembly' ) )
                    {
                    // InternalQualityEffectSpecification.g:770:2: ( ( 'AnyAssembly' ) )
                    // InternalQualityEffectSpecification.g:771:3: ( 'AnyAssembly' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:772:3: ( 'AnyAssembly' )
                    // InternalQualityEffectSpecification.g:772:4: 'AnyAssembly'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:776:2: ( ( 'Required' ) )
                    {
                    // InternalQualityEffectSpecification.g:776:2: ( ( 'Required' ) )
                    // InternalQualityEffectSpecification.g:777:3: ( 'Required' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:778:3: ( 'Required' )
                    // InternalQualityEffectSpecification.g:778:4: 'Required'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:782:2: ( ( 'Provided' ) )
                    {
                    // InternalQualityEffectSpecification.g:782:2: ( ( 'Provided' ) )
                    // InternalQualityEffectSpecification.g:783:3: ( 'Provided' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:784:3: ( 'Provided' )
                    // InternalQualityEffectSpecification.g:784:4: 'Provided'
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
    // InternalQualityEffectSpecification.g:792:1: rule__TransformationType__Alternatives : ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__TransformationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:796:1: ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalQualityEffectSpecification.g:797:2: ( ( '=' ) )
                    {
                    // InternalQualityEffectSpecification.g:797:2: ( ( '=' ) )
                    // InternalQualityEffectSpecification.g:798:3: ( '=' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:799:3: ( '=' )
                    // InternalQualityEffectSpecification.g:799:4: '='
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:803:2: ( ( '+' ) )
                    {
                    // InternalQualityEffectSpecification.g:803:2: ( ( '+' ) )
                    // InternalQualityEffectSpecification.g:804:3: ( '+' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:805:3: ( '+' )
                    // InternalQualityEffectSpecification.g:805:4: '+'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:809:2: ( ( '-' ) )
                    {
                    // InternalQualityEffectSpecification.g:809:2: ( ( '-' ) )
                    // InternalQualityEffectSpecification.g:810:3: ( '-' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:811:3: ( '-' )
                    // InternalQualityEffectSpecification.g:811:4: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:815:2: ( ( '*' ) )
                    {
                    // InternalQualityEffectSpecification.g:815:2: ( ( '*' ) )
                    // InternalQualityEffectSpecification.g:816:3: ( '*' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:817:3: ( '*' )
                    // InternalQualityEffectSpecification.g:817:4: '*'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:821:2: ( ( '/' ) )
                    {
                    // InternalQualityEffectSpecification.g:821:2: ( ( '/' ) )
                    // InternalQualityEffectSpecification.g:822:3: ( '/' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getDIVISIONEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:823:3: ( '/' )
                    // InternalQualityEffectSpecification.g:823:4: '/'
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
    // InternalQualityEffectSpecification.g:831:1: rule__QES__Group__0 : rule__QES__Group__0__Impl rule__QES__Group__1 ;
    public final void rule__QES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:835:1: ( rule__QES__Group__0__Impl rule__QES__Group__1 )
            // InternalQualityEffectSpecification.g:836:2: rule__QES__Group__0__Impl rule__QES__Group__1
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
    // InternalQualityEffectSpecification.g:843:1: rule__QES__Group__0__Impl : ( 'For{' ) ;
    public final void rule__QES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:847:1: ( ( 'For{' ) )
            // InternalQualityEffectSpecification.g:848:1: ( 'For{' )
            {
            // InternalQualityEffectSpecification.g:848:1: ( 'For{' )
            // InternalQualityEffectSpecification.g:849:2: 'For{'
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
    // InternalQualityEffectSpecification.g:858:1: rule__QES__Group__1 : rule__QES__Group__1__Impl rule__QES__Group__2 ;
    public final void rule__QES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:862:1: ( rule__QES__Group__1__Impl rule__QES__Group__2 )
            // InternalQualityEffectSpecification.g:863:2: rule__QES__Group__1__Impl rule__QES__Group__2
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
    // InternalQualityEffectSpecification.g:870:1: rule__QES__Group__1__Impl : ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) ) ;
    public final void rule__QES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:874:1: ( ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:875:1: ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:875:1: ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:876:2: ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:876:2: ( ( rule__QES__ComponentsAssignment_1 ) )
            // InternalQualityEffectSpecification.g:877:3: ( rule__QES__ComponentsAssignment_1 )
            {
             before(grammarAccess.getQESAccess().getComponentsAssignment_1()); 
            // InternalQualityEffectSpecification.g:878:3: ( rule__QES__ComponentsAssignment_1 )
            // InternalQualityEffectSpecification.g:878:4: rule__QES__ComponentsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__QES__ComponentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getComponentsAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:881:2: ( ( rule__QES__ComponentsAssignment_1 )* )
            // InternalQualityEffectSpecification.g:882:3: ( rule__QES__ComponentsAssignment_1 )*
            {
             before(grammarAccess.getQESAccess().getComponentsAssignment_1()); 
            // InternalQualityEffectSpecification.g:883:3: ( rule__QES__ComponentsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:883:4: rule__QES__ComponentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QES__ComponentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalQualityEffectSpecification.g:892:1: rule__QES__Group__2 : rule__QES__Group__2__Impl rule__QES__Group__3 ;
    public final void rule__QES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:896:1: ( rule__QES__Group__2__Impl rule__QES__Group__3 )
            // InternalQualityEffectSpecification.g:897:2: rule__QES__Group__2__Impl rule__QES__Group__3
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
    // InternalQualityEffectSpecification.g:904:1: rule__QES__Group__2__Impl : ( '}' ) ;
    public final void rule__QES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:908:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:909:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:909:1: ( '}' )
            // InternalQualityEffectSpecification.g:910:2: '}'
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
    // InternalQualityEffectSpecification.g:919:1: rule__QES__Group__3 : rule__QES__Group__3__Impl rule__QES__Group__4 ;
    public final void rule__QES__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:923:1: ( rule__QES__Group__3__Impl rule__QES__Group__4 )
            // InternalQualityEffectSpecification.g:924:2: rule__QES__Group__3__Impl rule__QES__Group__4
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
    // InternalQualityEffectSpecification.g:931:1: rule__QES__Group__3__Impl : ( 'Do{' ) ;
    public final void rule__QES__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:935:1: ( ( 'Do{' ) )
            // InternalQualityEffectSpecification.g:936:1: ( 'Do{' )
            {
            // InternalQualityEffectSpecification.g:936:1: ( 'Do{' )
            // InternalQualityEffectSpecification.g:937:2: 'Do{'
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
    // InternalQualityEffectSpecification.g:946:1: rule__QES__Group__4 : rule__QES__Group__4__Impl rule__QES__Group__5 ;
    public final void rule__QES__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:950:1: ( rule__QES__Group__4__Impl rule__QES__Group__5 )
            // InternalQualityEffectSpecification.g:951:2: rule__QES__Group__4__Impl rule__QES__Group__5
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
    // InternalQualityEffectSpecification.g:958:1: rule__QES__Group__4__Impl : ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) ) ;
    public final void rule__QES__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:962:1: ( ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) ) )
            // InternalQualityEffectSpecification.g:963:1: ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) )
            {
            // InternalQualityEffectSpecification.g:963:1: ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) )
            // InternalQualityEffectSpecification.g:964:2: ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* )
            {
            // InternalQualityEffectSpecification.g:964:2: ( ( rule__QES__TransformationsAssignment_4 ) )
            // InternalQualityEffectSpecification.g:965:3: ( rule__QES__TransformationsAssignment_4 )
            {
             before(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 
            // InternalQualityEffectSpecification.g:966:3: ( rule__QES__TransformationsAssignment_4 )
            // InternalQualityEffectSpecification.g:966:4: rule__QES__TransformationsAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__QES__TransformationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 

            }

            // InternalQualityEffectSpecification.g:969:2: ( ( rule__QES__TransformationsAssignment_4 )* )
            // InternalQualityEffectSpecification.g:970:3: ( rule__QES__TransformationsAssignment_4 )*
            {
             before(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 
            // InternalQualityEffectSpecification.g:971:3: ( rule__QES__TransformationsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=40 && LA11_0<=41)||LA11_0==46) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:971:4: rule__QES__TransformationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QES__TransformationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalQualityEffectSpecification.g:980:1: rule__QES__Group__5 : rule__QES__Group__5__Impl ;
    public final void rule__QES__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:984:1: ( rule__QES__Group__5__Impl )
            // InternalQualityEffectSpecification.g:985:2: rule__QES__Group__5__Impl
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
    // InternalQualityEffectSpecification.g:991:1: rule__QES__Group__5__Impl : ( '}' ) ;
    public final void rule__QES__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:995:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:996:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:996:1: ( '}' )
            // InternalQualityEffectSpecification.g:997:2: '}'
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
    // InternalQualityEffectSpecification.g:1007:1: rule__ComponentSpecification__Group__0 : rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1 ;
    public final void rule__ComponentSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1011:1: ( rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1 )
            // InternalQualityEffectSpecification.g:1012:2: rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1
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
    // InternalQualityEffectSpecification.g:1019:1: rule__ComponentSpecification__Group__0__Impl : ( 'Component(' ) ;
    public final void rule__ComponentSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1023:1: ( ( 'Component(' ) )
            // InternalQualityEffectSpecification.g:1024:1: ( 'Component(' )
            {
            // InternalQualityEffectSpecification.g:1024:1: ( 'Component(' )
            // InternalQualityEffectSpecification.g:1025:2: 'Component('
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
    // InternalQualityEffectSpecification.g:1034:1: rule__ComponentSpecification__Group__1 : rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2 ;
    public final void rule__ComponentSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1038:1: ( rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2 )
            // InternalQualityEffectSpecification.g:1039:2: rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2
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
    // InternalQualityEffectSpecification.g:1046:1: rule__ComponentSpecification__Group__1__Impl : ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) ) ;
    public final void rule__ComponentSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1050:1: ( ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1051:1: ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1051:1: ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1052:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1052:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1053:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1054:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:1054:4: rule__ComponentSpecification__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__ComponentSpecification__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1057:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1058:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1059:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=34 && LA12_0<=39)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1059:4: rule__ComponentSpecification__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ComponentSpecification__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalQualityEffectSpecification.g:1068:1: rule__ComponentSpecification__Group__2 : rule__ComponentSpecification__Group__2__Impl ;
    public final void rule__ComponentSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1072:1: ( rule__ComponentSpecification__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1073:2: rule__ComponentSpecification__Group__2__Impl
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
    // InternalQualityEffectSpecification.g:1079:1: rule__ComponentSpecification__Group__2__Impl : ( ')' ) ;
    public final void rule__ComponentSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1083:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1084:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1084:1: ( ')' )
            // InternalQualityEffectSpecification.g:1085:2: ')'
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
    // InternalQualityEffectSpecification.g:1095:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1099:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalQualityEffectSpecification.g:1100:2: rule__Name__Group__0__Impl rule__Name__Group__1
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
    // InternalQualityEffectSpecification.g:1107:1: rule__Name__Group__0__Impl : ( 'Name(' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1111:1: ( ( 'Name(' ) )
            // InternalQualityEffectSpecification.g:1112:1: ( 'Name(' )
            {
            // InternalQualityEffectSpecification.g:1112:1: ( 'Name(' )
            // InternalQualityEffectSpecification.g:1113:2: 'Name('
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
    // InternalQualityEffectSpecification.g:1122:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1126:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalQualityEffectSpecification.g:1127:2: rule__Name__Group__1__Impl rule__Name__Group__2
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
    // InternalQualityEffectSpecification.g:1134:1: rule__Name__Group__1__Impl : ( ( rule__Name__NotAssignment_1 )? ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1138:1: ( ( ( rule__Name__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1139:1: ( ( rule__Name__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1139:1: ( ( rule__Name__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1140:2: ( rule__Name__NotAssignment_1 )?
            {
             before(grammarAccess.getNameAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1141:2: ( rule__Name__NotAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1141:3: rule__Name__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1149:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1153:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalQualityEffectSpecification.g:1154:2: rule__Name__Group__2__Impl rule__Name__Group__3
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
    // InternalQualityEffectSpecification.g:1161:1: rule__Name__Group__2__Impl : ( ( rule__Name__NameAssignment_2 ) ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1165:1: ( ( ( rule__Name__NameAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1166:1: ( ( rule__Name__NameAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1166:1: ( ( rule__Name__NameAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1167:2: ( rule__Name__NameAssignment_2 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_2()); 
            // InternalQualityEffectSpecification.g:1168:2: ( rule__Name__NameAssignment_2 )
            // InternalQualityEffectSpecification.g:1168:3: rule__Name__NameAssignment_2
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
    // InternalQualityEffectSpecification.g:1176:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1180:1: ( rule__Name__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1181:2: rule__Name__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1187:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1191:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1192:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1192:1: ( ')' )
            // InternalQualityEffectSpecification.g:1193:2: ')'
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
    // InternalQualityEffectSpecification.g:1203:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1207:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalQualityEffectSpecification.g:1208:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
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
    // InternalQualityEffectSpecification.g:1215:1: rule__Identifier__Group__0__Impl : ( 'Id(' ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1219:1: ( ( 'Id(' ) )
            // InternalQualityEffectSpecification.g:1220:1: ( 'Id(' )
            {
            // InternalQualityEffectSpecification.g:1220:1: ( 'Id(' )
            // InternalQualityEffectSpecification.g:1221:2: 'Id('
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
    // InternalQualityEffectSpecification.g:1230:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1234:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // InternalQualityEffectSpecification.g:1235:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
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
    // InternalQualityEffectSpecification.g:1242:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NotAssignment_1 )? ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1246:1: ( ( ( rule__Identifier__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1247:1: ( ( rule__Identifier__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1247:1: ( ( rule__Identifier__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1248:2: ( rule__Identifier__NotAssignment_1 )?
            {
             before(grammarAccess.getIdentifierAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1249:2: ( rule__Identifier__NotAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1249:3: rule__Identifier__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1257:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl rule__Identifier__Group__3 ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1261:1: ( rule__Identifier__Group__2__Impl rule__Identifier__Group__3 )
            // InternalQualityEffectSpecification.g:1262:2: rule__Identifier__Group__2__Impl rule__Identifier__Group__3
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
    // InternalQualityEffectSpecification.g:1269:1: rule__Identifier__Group__2__Impl : ( ( rule__Identifier__IdAssignment_2 ) ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1273:1: ( ( ( rule__Identifier__IdAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1274:1: ( ( rule__Identifier__IdAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1274:1: ( ( rule__Identifier__IdAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1275:2: ( rule__Identifier__IdAssignment_2 )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment_2()); 
            // InternalQualityEffectSpecification.g:1276:2: ( rule__Identifier__IdAssignment_2 )
            // InternalQualityEffectSpecification.g:1276:3: rule__Identifier__IdAssignment_2
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
    // InternalQualityEffectSpecification.g:1284:1: rule__Identifier__Group__3 : rule__Identifier__Group__3__Impl ;
    public final void rule__Identifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1288:1: ( rule__Identifier__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1289:2: rule__Identifier__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1295:1: rule__Identifier__Group__3__Impl : ( ')' ) ;
    public final void rule__Identifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1299:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1300:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1300:1: ( ')' )
            // InternalQualityEffectSpecification.g:1301:2: ')'
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
    // InternalQualityEffectSpecification.g:1311:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1315:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalQualityEffectSpecification.g:1316:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalQualityEffectSpecification.g:1323:1: rule__Type__Group__0__Impl : ( 'Type(' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1327:1: ( ( 'Type(' ) )
            // InternalQualityEffectSpecification.g:1328:1: ( 'Type(' )
            {
            // InternalQualityEffectSpecification.g:1328:1: ( 'Type(' )
            // InternalQualityEffectSpecification.g:1329:2: 'Type('
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
    // InternalQualityEffectSpecification.g:1338:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1342:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalQualityEffectSpecification.g:1343:2: rule__Type__Group__1__Impl rule__Type__Group__2
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
    // InternalQualityEffectSpecification.g:1350:1: rule__Type__Group__1__Impl : ( ( rule__Type__NotAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1354:1: ( ( ( rule__Type__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1355:1: ( ( rule__Type__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1355:1: ( ( rule__Type__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1356:2: ( rule__Type__NotAssignment_1 )?
            {
             before(grammarAccess.getTypeAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1357:2: ( rule__Type__NotAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1357:3: rule__Type__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1365:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1369:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalQualityEffectSpecification.g:1370:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalQualityEffectSpecification.g:1377:1: rule__Type__Group__2__Impl : ( ( rule__Type__TypeAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1381:1: ( ( ( rule__Type__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1382:1: ( ( rule__Type__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1382:1: ( ( rule__Type__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1383:2: ( rule__Type__TypeAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1384:2: ( rule__Type__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1384:3: rule__Type__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1392:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1396:1: ( rule__Type__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1397:2: rule__Type__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1403:1: rule__Type__Group__3__Impl : ( ')' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1407:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1408:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1408:1: ( ')' )
            // InternalQualityEffectSpecification.g:1409:2: ')'
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
    // InternalQualityEffectSpecification.g:1419:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1423:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalQualityEffectSpecification.g:1424:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalQualityEffectSpecification.g:1431:1: rule__Role__Group__0__Impl : ( 'Role(' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1435:1: ( ( 'Role(' ) )
            // InternalQualityEffectSpecification.g:1436:1: ( 'Role(' )
            {
            // InternalQualityEffectSpecification.g:1436:1: ( 'Role(' )
            // InternalQualityEffectSpecification.g:1437:2: 'Role('
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
    // InternalQualityEffectSpecification.g:1446:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1450:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalQualityEffectSpecification.g:1451:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalQualityEffectSpecification.g:1458:1: rule__Role__Group__1__Impl : ( ( rule__Role__NotAssignment_1 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1462:1: ( ( ( rule__Role__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1463:1: ( ( rule__Role__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1463:1: ( ( rule__Role__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1464:2: ( rule__Role__NotAssignment_1 )?
            {
             before(grammarAccess.getRoleAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1465:2: ( rule__Role__NotAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1465:3: rule__Role__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1473:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1477:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalQualityEffectSpecification.g:1478:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalQualityEffectSpecification.g:1485:1: rule__Role__Group__2__Impl : ( ( rule__Role__TypeAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1489:1: ( ( ( rule__Role__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1490:1: ( ( rule__Role__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1490:1: ( ( rule__Role__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1491:2: ( rule__Role__TypeAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1492:2: ( rule__Role__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1492:3: rule__Role__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1500:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1504:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalQualityEffectSpecification.g:1505:2: rule__Role__Group__3__Impl rule__Role__Group__4
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
    // InternalQualityEffectSpecification.g:1512:1: rule__Role__Group__3__Impl : ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1516:1: ( ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1517:1: ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1517:1: ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1518:2: ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1518:2: ( ( rule__Role__PropertiesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1519:3: ( rule__Role__PropertiesAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1520:3: ( rule__Role__PropertiesAssignment_3 )
            // InternalQualityEffectSpecification.g:1520:4: rule__Role__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__Role__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1523:2: ( ( rule__Role__PropertiesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1524:3: ( rule__Role__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1525:3: ( rule__Role__PropertiesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=34 && LA17_0<=35)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1525:4: rule__Role__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Role__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalQualityEffectSpecification.g:1534:1: rule__Role__Group__4 : rule__Role__Group__4__Impl ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1538:1: ( rule__Role__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1539:2: rule__Role__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1545:1: rule__Role__Group__4__Impl : ( ')' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1549:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1550:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1550:1: ( ')' )
            // InternalQualityEffectSpecification.g:1551:2: ')'
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


    // $ANTLR start "rule__Assembly__Group__0"
    // InternalQualityEffectSpecification.g:1561:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1565:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalQualityEffectSpecification.g:1566:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalQualityEffectSpecification.g:1573:1: rule__Assembly__Group__0__Impl : ( 'Assembly(' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1577:1: ( ( 'Assembly(' ) )
            // InternalQualityEffectSpecification.g:1578:1: ( 'Assembly(' )
            {
            // InternalQualityEffectSpecification.g:1578:1: ( 'Assembly(' )
            // InternalQualityEffectSpecification.g:1579:2: 'Assembly('
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1588:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1592:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalQualityEffectSpecification.g:1593:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalQualityEffectSpecification.g:1600:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NotAssignment_1 )? ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1604:1: ( ( ( rule__Assembly__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1605:1: ( ( rule__Assembly__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1605:1: ( ( rule__Assembly__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1606:2: ( rule__Assembly__NotAssignment_1 )?
            {
             before(grammarAccess.getAssemblyAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1607:2: ( rule__Assembly__NotAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1607:3: rule__Assembly__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1615:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1619:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalQualityEffectSpecification.g:1620:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
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
    // InternalQualityEffectSpecification.g:1627:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__TypeAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1631:1: ( ( ( rule__Assembly__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1632:1: ( ( rule__Assembly__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1632:1: ( ( rule__Assembly__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1633:2: ( rule__Assembly__TypeAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1634:2: ( rule__Assembly__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1634:3: rule__Assembly__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1642:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1646:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalQualityEffectSpecification.g:1647:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
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
    // InternalQualityEffectSpecification.g:1654:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1658:1: ( ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1659:1: ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1659:1: ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1660:2: ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1660:2: ( ( rule__Assembly__ComponentsAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1661:3: ( rule__Assembly__ComponentsAssignment_3 )
            {
             before(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 
            // InternalQualityEffectSpecification.g:1662:3: ( rule__Assembly__ComponentsAssignment_3 )
            // InternalQualityEffectSpecification.g:1662:4: rule__Assembly__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Assembly__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1665:2: ( ( rule__Assembly__ComponentsAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1666:3: ( rule__Assembly__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 
            // InternalQualityEffectSpecification.g:1667:3: ( rule__Assembly__ComponentsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1667:4: rule__Assembly__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Assembly__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalQualityEffectSpecification.g:1676:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1680:1: ( rule__Assembly__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1681:2: rule__Assembly__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1687:1: rule__Assembly__Group__4__Impl : ( ')' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1691:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1692:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1692:1: ( ')' )
            // InternalQualityEffectSpecification.g:1693:2: ')'
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
    // InternalQualityEffectSpecification.g:1703:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1707:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalQualityEffectSpecification.g:1708:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalQualityEffectSpecification.g:1715:1: rule__Resource__Group__0__Impl : ( 'Resource(' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1719:1: ( ( 'Resource(' ) )
            // InternalQualityEffectSpecification.g:1720:1: ( 'Resource(' )
            {
            // InternalQualityEffectSpecification.g:1720:1: ( 'Resource(' )
            // InternalQualityEffectSpecification.g:1721:2: 'Resource('
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1730:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1734:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalQualityEffectSpecification.g:1735:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
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
    // InternalQualityEffectSpecification.g:1742:1: rule__Resource__Group__1__Impl : ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1746:1: ( ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1747:1: ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1747:1: ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1748:2: ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1748:2: ( ( rule__Resource__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1749:3: ( rule__Resource__PropertiesAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1750:3: ( rule__Resource__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:1750:4: rule__Resource__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_18);
            rule__Resource__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1753:2: ( ( rule__Resource__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1754:3: ( rule__Resource__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1755:3: ( rule__Resource__PropertiesAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=34 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1755:4: rule__Resource__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Resource__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalQualityEffectSpecification.g:1764:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1768:1: ( rule__Resource__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1769:2: rule__Resource__Group__2__Impl
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
    // InternalQualityEffectSpecification.g:1775:1: rule__Resource__Group__2__Impl : ( ')' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1779:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1780:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1780:1: ( ')' )
            // InternalQualityEffectSpecification.g:1781:2: ')'
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
    // InternalQualityEffectSpecification.g:1791:1: rule__NQA__Group__0 : rule__NQA__Group__0__Impl rule__NQA__Group__1 ;
    public final void rule__NQA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1795:1: ( rule__NQA__Group__0__Impl rule__NQA__Group__1 )
            // InternalQualityEffectSpecification.g:1796:2: rule__NQA__Group__0__Impl rule__NQA__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalQualityEffectSpecification.g:1803:1: rule__NQA__Group__0__Impl : ( 'NQA(' ) ;
    public final void rule__NQA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1807:1: ( ( 'NQA(' ) )
            // InternalQualityEffectSpecification.g:1808:1: ( 'NQA(' )
            {
            // InternalQualityEffectSpecification.g:1808:1: ( 'NQA(' )
            // InternalQualityEffectSpecification.g:1809:2: 'NQA('
            {
             before(grammarAccess.getNQAAccess().getNQAKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1818:1: rule__NQA__Group__1 : rule__NQA__Group__1__Impl rule__NQA__Group__2 ;
    public final void rule__NQA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1822:1: ( rule__NQA__Group__1__Impl rule__NQA__Group__2 )
            // InternalQualityEffectSpecification.g:1823:2: rule__NQA__Group__1__Impl rule__NQA__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalQualityEffectSpecification.g:1830:1: rule__NQA__Group__1__Impl : ( ( rule__NQA__QualityAssignment_1 ) ) ;
    public final void rule__NQA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1834:1: ( ( ( rule__NQA__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1835:1: ( ( rule__NQA__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1835:1: ( ( rule__NQA__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1836:2: ( rule__NQA__QualityAssignment_1 )
            {
             before(grammarAccess.getNQAAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:1837:2: ( rule__NQA__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:1837:3: rule__NQA__QualityAssignment_1
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
    // InternalQualityEffectSpecification.g:1845:1: rule__NQA__Group__2 : rule__NQA__Group__2__Impl rule__NQA__Group__3 ;
    public final void rule__NQA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1849:1: ( rule__NQA__Group__2__Impl rule__NQA__Group__3 )
            // InternalQualityEffectSpecification.g:1850:2: rule__NQA__Group__2__Impl rule__NQA__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalQualityEffectSpecification.g:1857:1: rule__NQA__Group__2__Impl : ( ( rule__NQA__TypeAssignment_2 ) ) ;
    public final void rule__NQA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1861:1: ( ( ( rule__NQA__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1862:1: ( ( rule__NQA__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1862:1: ( ( rule__NQA__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1863:2: ( rule__NQA__TypeAssignment_2 )
            {
             before(grammarAccess.getNQAAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1864:2: ( rule__NQA__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1864:3: rule__NQA__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1872:1: rule__NQA__Group__3 : rule__NQA__Group__3__Impl rule__NQA__Group__4 ;
    public final void rule__NQA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1876:1: ( rule__NQA__Group__3__Impl rule__NQA__Group__4 )
            // InternalQualityEffectSpecification.g:1877:2: rule__NQA__Group__3__Impl rule__NQA__Group__4
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
    // InternalQualityEffectSpecification.g:1884:1: rule__NQA__Group__3__Impl : ( ( rule__NQA__ElementAssignment_3 ) ) ;
    public final void rule__NQA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1888:1: ( ( ( rule__NQA__ElementAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:1889:1: ( ( rule__NQA__ElementAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:1889:1: ( ( rule__NQA__ElementAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1890:2: ( rule__NQA__ElementAssignment_3 )
            {
             before(grammarAccess.getNQAAccess().getElementAssignment_3()); 
            // InternalQualityEffectSpecification.g:1891:2: ( rule__NQA__ElementAssignment_3 )
            // InternalQualityEffectSpecification.g:1891:3: rule__NQA__ElementAssignment_3
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
    // InternalQualityEffectSpecification.g:1899:1: rule__NQA__Group__4 : rule__NQA__Group__4__Impl ;
    public final void rule__NQA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1903:1: ( rule__NQA__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1904:2: rule__NQA__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1910:1: rule__NQA__Group__4__Impl : ( ')' ) ;
    public final void rule__NQA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1914:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1915:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1915:1: ( ')' )
            // InternalQualityEffectSpecification.g:1916:2: ')'
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
    // InternalQualityEffectSpecification.g:1926:1: rule__Reasoning__Group__0 : rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 ;
    public final void rule__Reasoning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1930:1: ( rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 )
            // InternalQualityEffectSpecification.g:1931:2: rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalQualityEffectSpecification.g:1938:1: rule__Reasoning__Group__0__Impl : ( 'Reasoning(' ) ;
    public final void rule__Reasoning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1942:1: ( ( 'Reasoning(' ) )
            // InternalQualityEffectSpecification.g:1943:1: ( 'Reasoning(' )
            {
            // InternalQualityEffectSpecification.g:1943:1: ( 'Reasoning(' )
            // InternalQualityEffectSpecification.g:1944:2: 'Reasoning('
            {
             before(grammarAccess.getReasoningAccess().getReasoningKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1953:1: rule__Reasoning__Group__1 : rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 ;
    public final void rule__Reasoning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1957:1: ( rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 )
            // InternalQualityEffectSpecification.g:1958:2: rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2
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
    // InternalQualityEffectSpecification.g:1965:1: rule__Reasoning__Group__1__Impl : ( ( rule__Reasoning__QualityAssignment_1 ) ) ;
    public final void rule__Reasoning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1969:1: ( ( ( rule__Reasoning__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1970:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1970:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1971:2: ( rule__Reasoning__QualityAssignment_1 )
            {
             before(grammarAccess.getReasoningAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:1972:2: ( rule__Reasoning__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:1972:3: rule__Reasoning__QualityAssignment_1
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
    // InternalQualityEffectSpecification.g:1980:1: rule__Reasoning__Group__2 : rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 ;
    public final void rule__Reasoning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1984:1: ( rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 )
            // InternalQualityEffectSpecification.g:1985:2: rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalQualityEffectSpecification.g:1992:1: rule__Reasoning__Group__2__Impl : ( ':' ) ;
    public final void rule__Reasoning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1996:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:1997:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:1997:1: ( ':' )
            // InternalQualityEffectSpecification.g:1998:2: ':'
            {
             before(grammarAccess.getReasoningAccess().getColonKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2007:1: rule__Reasoning__Group__3 : rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 ;
    public final void rule__Reasoning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2011:1: ( rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 )
            // InternalQualityEffectSpecification.g:2012:2: rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4
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
    // InternalQualityEffectSpecification.g:2019:1: rule__Reasoning__Group__3__Impl : ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) ;
    public final void rule__Reasoning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2023:1: ( ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:2024:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:2024:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:2025:2: ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:2025:2: ( ( rule__Reasoning__RulesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2026:3: ( rule__Reasoning__RulesAssignment_3 )
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2027:3: ( rule__Reasoning__RulesAssignment_3 )
            // InternalQualityEffectSpecification.g:2027:4: rule__Reasoning__RulesAssignment_3
            {
            pushFollow(FOLLOW_24);
            rule__Reasoning__RulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:2030:2: ( ( rule__Reasoning__RulesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:2031:3: ( rule__Reasoning__RulesAssignment_3 )*
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2032:3: ( rule__Reasoning__RulesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2032:4: rule__Reasoning__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Reasoning__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalQualityEffectSpecification.g:2041:1: rule__Reasoning__Group__4 : rule__Reasoning__Group__4__Impl ;
    public final void rule__Reasoning__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2045:1: ( rule__Reasoning__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2046:2: rule__Reasoning__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2052:1: rule__Reasoning__Group__4__Impl : ( ')' ) ;
    public final void rule__Reasoning__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2056:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2057:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2057:1: ( ')' )
            // InternalQualityEffectSpecification.g:2058:2: ')'
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
    // InternalQualityEffectSpecification.g:2068:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2072:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalQualityEffectSpecification.g:2073:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalQualityEffectSpecification.g:2080:1: rule__Rule__Group__0__Impl : ( '(' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2084:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2085:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2085:1: ( '(' )
            // InternalQualityEffectSpecification.g:2086:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2095:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2099:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalQualityEffectSpecification.g:2100:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalQualityEffectSpecification.g:2107:1: rule__Rule__Group__1__Impl : ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2111:1: ( ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2112:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2112:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2113:2: ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2113:2: ( ( rule__Rule__QualitiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2114:3: ( rule__Rule__QualitiesAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2115:3: ( rule__Rule__QualitiesAssignment_1 )
            // InternalQualityEffectSpecification.g:2115:4: rule__Rule__QualitiesAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__Rule__QualitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2118:2: ( ( rule__Rule__QualitiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2119:3: ( rule__Rule__QualitiesAssignment_1 )*
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2120:3: ( rule__Rule__QualitiesAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2120:4: rule__Rule__QualitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Rule__QualitiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalQualityEffectSpecification.g:2129:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2133:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalQualityEffectSpecification.g:2134:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalQualityEffectSpecification.g:2141:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2145:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2146:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2146:1: ( ':' )
            // InternalQualityEffectSpecification.g:2147:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2156:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2160:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalQualityEffectSpecification.g:2161:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalQualityEffectSpecification.g:2168:1: rule__Rule__Group__3__Impl : ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2172:1: ( ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:2173:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:2173:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:2174:2: ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:2174:2: ( ( rule__Rule__EntriesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2175:3: ( rule__Rule__EntriesAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2176:3: ( rule__Rule__EntriesAssignment_3 )
            // InternalQualityEffectSpecification.g:2176:4: rule__Rule__EntriesAssignment_3
            {
            pushFollow(FOLLOW_27);
            rule__Rule__EntriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:2179:2: ( ( rule__Rule__EntriesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:2180:3: ( rule__Rule__EntriesAssignment_3 )*
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2181:3: ( rule__Rule__EntriesAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2181:4: rule__Rule__EntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Rule__EntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalQualityEffectSpecification.g:2190:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2194:1: ( rule__Rule__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2195:2: rule__Rule__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2201:1: rule__Rule__Group__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2205:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2206:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2206:1: ( ')' )
            // InternalQualityEffectSpecification.g:2207:2: ')'
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
    // InternalQualityEffectSpecification.g:2217:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2221:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalQualityEffectSpecification.g:2222:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalQualityEffectSpecification.g:2229:1: rule__Entry__Group__0__Impl : ( '[' ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2233:1: ( ( '[' ) )
            // InternalQualityEffectSpecification.g:2234:1: ( '[' )
            {
            // InternalQualityEffectSpecification.g:2234:1: ( '[' )
            // InternalQualityEffectSpecification.g:2235:2: '['
            {
             before(grammarAccess.getEntryAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2244:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2248:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalQualityEffectSpecification.g:2249:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
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
    // InternalQualityEffectSpecification.g:2256:1: rule__Entry__Group__1__Impl : ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2260:1: ( ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2261:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2261:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2262:2: ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2262:2: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2263:3: ( rule__Entry__KeyAssignment_1 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:2264:3: ( rule__Entry__KeyAssignment_1 )
            // InternalQualityEffectSpecification.g:2264:4: rule__Entry__KeyAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__Entry__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getKeyAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2267:2: ( ( rule__Entry__KeyAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2268:3: ( rule__Entry__KeyAssignment_1 )*
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:2269:3: ( rule__Entry__KeyAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2269:4: rule__Entry__KeyAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Entry__KeyAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalQualityEffectSpecification.g:2278:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2282:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalQualityEffectSpecification.g:2283:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalQualityEffectSpecification.g:2290:1: rule__Entry__Group__2__Impl : ( ':' ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2294:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2295:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2295:1: ( ':' )
            // InternalQualityEffectSpecification.g:2296:2: ':'
            {
             before(grammarAccess.getEntryAccess().getColonKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2305:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2309:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalQualityEffectSpecification.g:2310:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalQualityEffectSpecification.g:2317:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__ValueAssignment_3 ) ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2321:1: ( ( ( rule__Entry__ValueAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2322:1: ( ( rule__Entry__ValueAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2322:1: ( ( rule__Entry__ValueAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2323:2: ( rule__Entry__ValueAssignment_3 )
            {
             before(grammarAccess.getEntryAccess().getValueAssignment_3()); 
            // InternalQualityEffectSpecification.g:2324:2: ( rule__Entry__ValueAssignment_3 )
            // InternalQualityEffectSpecification.g:2324:3: rule__Entry__ValueAssignment_3
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
    // InternalQualityEffectSpecification.g:2332:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2336:1: ( rule__Entry__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2337:2: rule__Entry__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2343:1: rule__Entry__Group__4__Impl : ( ']' ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2347:1: ( ( ']' ) )
            // InternalQualityEffectSpecification.g:2348:1: ( ']' )
            {
            // InternalQualityEffectSpecification.g:2348:1: ( ']' )
            // InternalQualityEffectSpecification.g:2349:2: ']'
            {
             before(grammarAccess.getEntryAccess().getRightSquareBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2359:1: rule__Cost__Group__0 : rule__Cost__Group__0__Impl rule__Cost__Group__1 ;
    public final void rule__Cost__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2363:1: ( rule__Cost__Group__0__Impl rule__Cost__Group__1 )
            // InternalQualityEffectSpecification.g:2364:2: rule__Cost__Group__0__Impl rule__Cost__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalQualityEffectSpecification.g:2371:1: rule__Cost__Group__0__Impl : ( 'Cost(' ) ;
    public final void rule__Cost__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2375:1: ( ( 'Cost(' ) )
            // InternalQualityEffectSpecification.g:2376:1: ( 'Cost(' )
            {
            // InternalQualityEffectSpecification.g:2376:1: ( 'Cost(' )
            // InternalQualityEffectSpecification.g:2377:2: 'Cost('
            {
             before(grammarAccess.getCostAccess().getCostKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2386:1: rule__Cost__Group__1 : rule__Cost__Group__1__Impl rule__Cost__Group__2 ;
    public final void rule__Cost__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2390:1: ( rule__Cost__Group__1__Impl rule__Cost__Group__2 )
            // InternalQualityEffectSpecification.g:2391:2: rule__Cost__Group__1__Impl rule__Cost__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalQualityEffectSpecification.g:2398:1: rule__Cost__Group__1__Impl : ( ( rule__Cost__TypeAssignment_1 ) ) ;
    public final void rule__Cost__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2402:1: ( ( ( rule__Cost__TypeAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:2403:1: ( ( rule__Cost__TypeAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:2403:1: ( ( rule__Cost__TypeAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2404:2: ( rule__Cost__TypeAssignment_1 )
            {
             before(grammarAccess.getCostAccess().getTypeAssignment_1()); 
            // InternalQualityEffectSpecification.g:2405:2: ( rule__Cost__TypeAssignment_1 )
            // InternalQualityEffectSpecification.g:2405:3: rule__Cost__TypeAssignment_1
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
    // InternalQualityEffectSpecification.g:2413:1: rule__Cost__Group__2 : rule__Cost__Group__2__Impl rule__Cost__Group__3 ;
    public final void rule__Cost__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2417:1: ( rule__Cost__Group__2__Impl rule__Cost__Group__3 )
            // InternalQualityEffectSpecification.g:2418:2: rule__Cost__Group__2__Impl rule__Cost__Group__3
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
    // InternalQualityEffectSpecification.g:2425:1: rule__Cost__Group__2__Impl : ( ( rule__Cost__CostAssignment_2 ) ) ;
    public final void rule__Cost__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2429:1: ( ( ( rule__Cost__CostAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:2430:1: ( ( rule__Cost__CostAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:2430:1: ( ( rule__Cost__CostAssignment_2 ) )
            // InternalQualityEffectSpecification.g:2431:2: ( rule__Cost__CostAssignment_2 )
            {
             before(grammarAccess.getCostAccess().getCostAssignment_2()); 
            // InternalQualityEffectSpecification.g:2432:2: ( rule__Cost__CostAssignment_2 )
            // InternalQualityEffectSpecification.g:2432:3: rule__Cost__CostAssignment_2
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
    // InternalQualityEffectSpecification.g:2440:1: rule__Cost__Group__3 : rule__Cost__Group__3__Impl ;
    public final void rule__Cost__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2444:1: ( rule__Cost__Group__3__Impl )
            // InternalQualityEffectSpecification.g:2445:2: rule__Cost__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:2451:1: rule__Cost__Group__3__Impl : ( ')' ) ;
    public final void rule__Cost__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2455:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2456:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2456:1: ( ')' )
            // InternalQualityEffectSpecification.g:2457:2: ')'
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
    // InternalQualityEffectSpecification.g:2467:1: rule__Model__SpecificationsAssignment : ( ruleQES ) ;
    public final void rule__Model__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2471:1: ( ( ruleQES ) )
            // InternalQualityEffectSpecification.g:2472:2: ( ruleQES )
            {
            // InternalQualityEffectSpecification.g:2472:2: ( ruleQES )
            // InternalQualityEffectSpecification.g:2473:3: ruleQES
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
    // InternalQualityEffectSpecification.g:2482:1: rule__QES__ComponentsAssignment_1 : ( ruleComponentSpecification ) ;
    public final void rule__QES__ComponentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2486:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:2487:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:2487:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:2488:3: ruleComponentSpecification
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
    // InternalQualityEffectSpecification.g:2497:1: rule__QES__TransformationsAssignment_4 : ( ruleTransformationSpecification ) ;
    public final void rule__QES__TransformationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2501:1: ( ( ruleTransformationSpecification ) )
            // InternalQualityEffectSpecification.g:2502:2: ( ruleTransformationSpecification )
            {
            // InternalQualityEffectSpecification.g:2502:2: ( ruleTransformationSpecification )
            // InternalQualityEffectSpecification.g:2503:3: ruleTransformationSpecification
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
    // InternalQualityEffectSpecification.g:2512:1: rule__ComponentSpecification__PropertiesAssignment_1 : ( ruleComponentProperty ) ;
    public final void rule__ComponentSpecification__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2516:1: ( ( ruleComponentProperty ) )
            // InternalQualityEffectSpecification.g:2517:2: ( ruleComponentProperty )
            {
            // InternalQualityEffectSpecification.g:2517:2: ( ruleComponentProperty )
            // InternalQualityEffectSpecification.g:2518:3: ruleComponentProperty
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
    // InternalQualityEffectSpecification.g:2527:1: rule__Name__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Name__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2531:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2532:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2532:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2533:3: ( 'Not' )
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2534:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2535:4: 'Not'
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2546:1: rule__Name__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Name__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2550:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2551:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2551:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2552:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2561:1: rule__Identifier__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Identifier__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2565:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2566:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2566:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2567:3: ( 'Not' )
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2568:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2569:4: 'Not'
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2580:1: rule__Identifier__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__Identifier__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2584:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2585:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2585:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2586:3: RULE_ID
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
    // InternalQualityEffectSpecification.g:2595:1: rule__Type__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Type__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2599:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2600:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2600:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2601:3: ( 'Not' )
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2602:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2603:4: 'Not'
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2614:1: rule__Type__TypeAssignment_2 : ( ruleComponentType ) ;
    public final void rule__Type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2618:1: ( ( ruleComponentType ) )
            // InternalQualityEffectSpecification.g:2619:2: ( ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:2619:2: ( ruleComponentType )
            // InternalQualityEffectSpecification.g:2620:3: ruleComponentType
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
    // InternalQualityEffectSpecification.g:2629:1: rule__Role__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Role__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2633:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2634:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2634:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2635:3: ( 'Not' )
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2636:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2637:4: 'Not'
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2648:1: rule__Role__TypeAssignment_2 : ( ruleRoleType ) ;
    public final void rule__Role__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2652:1: ( ( ruleRoleType ) )
            // InternalQualityEffectSpecification.g:2653:2: ( ruleRoleType )
            {
            // InternalQualityEffectSpecification.g:2653:2: ( ruleRoleType )
            // InternalQualityEffectSpecification.g:2654:3: ruleRoleType
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
    // InternalQualityEffectSpecification.g:2663:1: rule__Role__PropertiesAssignment_3 : ( ruleRoleProperty ) ;
    public final void rule__Role__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2667:1: ( ( ruleRoleProperty ) )
            // InternalQualityEffectSpecification.g:2668:2: ( ruleRoleProperty )
            {
            // InternalQualityEffectSpecification.g:2668:2: ( ruleRoleProperty )
            // InternalQualityEffectSpecification.g:2669:3: ruleRoleProperty
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


    // $ANTLR start "rule__Assembly__NotAssignment_1"
    // InternalQualityEffectSpecification.g:2678:1: rule__Assembly__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Assembly__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2682:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2683:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2683:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2684:3: ( 'Not' )
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2685:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2686:4: 'Not'
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2697:1: rule__Assembly__TypeAssignment_2 : ( ruleAssemblyType ) ;
    public final void rule__Assembly__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2701:1: ( ( ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:2702:2: ( ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:2702:2: ( ruleAssemblyType )
            // InternalQualityEffectSpecification.g:2703:3: ruleAssemblyType
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
    // InternalQualityEffectSpecification.g:2712:1: rule__Assembly__ComponentsAssignment_3 : ( ruleComponentSpecification ) ;
    public final void rule__Assembly__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2716:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:2717:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:2717:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:2718:3: ruleComponentSpecification
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
    // InternalQualityEffectSpecification.g:2727:1: rule__Resource__PropertiesAssignment_1 : ( ruleResourceProperty ) ;
    public final void rule__Resource__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2731:1: ( ( ruleResourceProperty ) )
            // InternalQualityEffectSpecification.g:2732:2: ( ruleResourceProperty )
            {
            // InternalQualityEffectSpecification.g:2732:2: ( ruleResourceProperty )
            // InternalQualityEffectSpecification.g:2733:3: ruleResourceProperty
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
    // InternalQualityEffectSpecification.g:2742:1: rule__NQA__QualityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NQA__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2746:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2747:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2747:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2748:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2757:1: rule__NQA__TypeAssignment_2 : ( ruleTransformationType ) ;
    public final void rule__NQA__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2761:1: ( ( ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:2762:2: ( ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:2762:2: ( ruleTransformationType )
            // InternalQualityEffectSpecification.g:2763:3: ruleTransformationType
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
    // InternalQualityEffectSpecification.g:2772:1: rule__NQA__ElementAssignment_3 : ( RULE_STRING ) ;
    public final void rule__NQA__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2776:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2777:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2777:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2778:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2787:1: rule__Reasoning__QualityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Reasoning__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2791:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2792:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2792:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2793:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2802:1: rule__Reasoning__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Reasoning__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2806:1: ( ( ruleRule ) )
            // InternalQualityEffectSpecification.g:2807:2: ( ruleRule )
            {
            // InternalQualityEffectSpecification.g:2807:2: ( ruleRule )
            // InternalQualityEffectSpecification.g:2808:3: ruleRule
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
    // InternalQualityEffectSpecification.g:2817:1: rule__Rule__QualitiesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__QualitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2821:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2822:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2822:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2823:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2832:1: rule__Rule__EntriesAssignment_3 : ( ruleEntry ) ;
    public final void rule__Rule__EntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2836:1: ( ( ruleEntry ) )
            // InternalQualityEffectSpecification.g:2837:2: ( ruleEntry )
            {
            // InternalQualityEffectSpecification.g:2837:2: ( ruleEntry )
            // InternalQualityEffectSpecification.g:2838:3: ruleEntry
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
    // InternalQualityEffectSpecification.g:2847:1: rule__Entry__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2851:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2852:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2852:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2853:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2862:1: rule__Entry__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Entry__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2866:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2867:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2867:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2868:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2877:1: rule__Cost__TypeAssignment_1 : ( ruleTransformationType ) ;
    public final void rule__Cost__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2881:1: ( ( ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:2882:2: ( ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:2882:2: ( ruleTransformationType )
            // InternalQualityEffectSpecification.g:2883:3: ruleTransformationType
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
    // InternalQualityEffectSpecification.g:2892:1: rule__Cost__CostAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cost__CostAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2896:1: ( ( RULE_INT ) )
            // InternalQualityEffectSpecification.g:2897:2: ( RULE_INT )
            {
            // InternalQualityEffectSpecification.g:2897:2: ( RULE_INT )
            // InternalQualityEffectSpecification.g:2898:3: RULE_INT
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000430000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000430000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000FC00000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000003800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00008000001FC000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000E00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});

}