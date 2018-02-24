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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyComponent'", "'Basic'", "'Composite'", "'AnyRole'", "'Component'", "'ComponentRequired'", "'ComponentProvided'", "'Infrastructure'", "'InfrastructureRequired'", "'InfrastructureProvided'", "'AnyAssembly'", "'Required'", "'Provided'", "'For{'", "'}'", "'Do{'", "'Component('", "')'", "'Name('", "'Id('", "'Type('", "'Role('", "'Assembly('", "'Resource('", "'NQA('", "'='", "'Reasoning('", "':'", "'('", "'['", "']'", "'Not'"
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
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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

                if ( (LA1_0==24) ) {
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


    // $ANTLR start "entryRuleComponent"
    // InternalQualityEffectSpecification.g:110:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:111:1: ( ruleComponent EOF )
            // InternalQualityEffectSpecification.g:112:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalQualityEffectSpecification.g:119:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:123:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:124:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:124:2: ( ( rule__Component__Group__0 ) )
            // InternalQualityEffectSpecification.g:125:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:126:3: ( rule__Component__Group__0 )
            // InternalQualityEffectSpecification.g:126:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentPropertie"
    // InternalQualityEffectSpecification.g:135:1: entryRuleComponentPropertie : ruleComponentPropertie EOF ;
    public final void entryRuleComponentPropertie() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:136:1: ( ruleComponentPropertie EOF )
            // InternalQualityEffectSpecification.g:137:1: ruleComponentPropertie EOF
            {
             before(grammarAccess.getComponentPropertieRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentPropertie();

            state._fsp--;

             after(grammarAccess.getComponentPropertieRule()); 
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
    // $ANTLR end "entryRuleComponentPropertie"


    // $ANTLR start "ruleComponentPropertie"
    // InternalQualityEffectSpecification.g:144:1: ruleComponentPropertie : ( ( rule__ComponentPropertie__Alternatives ) ) ;
    public final void ruleComponentPropertie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:148:2: ( ( ( rule__ComponentPropertie__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:149:2: ( ( rule__ComponentPropertie__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:149:2: ( ( rule__ComponentPropertie__Alternatives ) )
            // InternalQualityEffectSpecification.g:150:3: ( rule__ComponentPropertie__Alternatives )
            {
             before(grammarAccess.getComponentPropertieAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:151:3: ( rule__ComponentPropertie__Alternatives )
            // InternalQualityEffectSpecification.g:151:4: rule__ComponentPropertie__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentPropertie__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentPropertieAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComponentPropertie"


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


    // $ANTLR start "entryRuleRolePropertie"
    // InternalQualityEffectSpecification.g:260:1: entryRuleRolePropertie : ruleRolePropertie EOF ;
    public final void entryRuleRolePropertie() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:261:1: ( ruleRolePropertie EOF )
            // InternalQualityEffectSpecification.g:262:1: ruleRolePropertie EOF
            {
             before(grammarAccess.getRolePropertieRule()); 
            pushFollow(FOLLOW_1);
            ruleRolePropertie();

            state._fsp--;

             after(grammarAccess.getRolePropertieRule()); 
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
    // $ANTLR end "entryRuleRolePropertie"


    // $ANTLR start "ruleRolePropertie"
    // InternalQualityEffectSpecification.g:269:1: ruleRolePropertie : ( ( rule__RolePropertie__Alternatives ) ) ;
    public final void ruleRolePropertie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:273:2: ( ( ( rule__RolePropertie__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:274:2: ( ( rule__RolePropertie__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:274:2: ( ( rule__RolePropertie__Alternatives ) )
            // InternalQualityEffectSpecification.g:275:3: ( rule__RolePropertie__Alternatives )
            {
             before(grammarAccess.getRolePropertieAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:276:3: ( rule__RolePropertie__Alternatives )
            // InternalQualityEffectSpecification.g:276:4: rule__RolePropertie__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RolePropertie__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRolePropertieAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRolePropertie"


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


    // $ANTLR start "entryRuleResourcePropertie"
    // InternalQualityEffectSpecification.g:335:1: entryRuleResourcePropertie : ruleResourcePropertie EOF ;
    public final void entryRuleResourcePropertie() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:336:1: ( ruleResourcePropertie EOF )
            // InternalQualityEffectSpecification.g:337:1: ruleResourcePropertie EOF
            {
             before(grammarAccess.getResourcePropertieRule()); 
            pushFollow(FOLLOW_1);
            ruleResourcePropertie();

            state._fsp--;

             after(grammarAccess.getResourcePropertieRule()); 
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
    // $ANTLR end "entryRuleResourcePropertie"


    // $ANTLR start "ruleResourcePropertie"
    // InternalQualityEffectSpecification.g:344:1: ruleResourcePropertie : ( ( rule__ResourcePropertie__Alternatives ) ) ;
    public final void ruleResourcePropertie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:348:2: ( ( ( rule__ResourcePropertie__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:349:2: ( ( rule__ResourcePropertie__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:349:2: ( ( rule__ResourcePropertie__Alternatives ) )
            // InternalQualityEffectSpecification.g:350:3: ( rule__ResourcePropertie__Alternatives )
            {
             before(grammarAccess.getResourcePropertieAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:351:3: ( rule__ResourcePropertie__Alternatives )
            // InternalQualityEffectSpecification.g:351:4: rule__ResourcePropertie__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResourcePropertie__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResourcePropertieAccess().getAlternatives()); 

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
    // $ANTLR end "ruleResourcePropertie"


    // $ANTLR start "entryRuleTransformation"
    // InternalQualityEffectSpecification.g:360:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:361:1: ( ruleTransformation EOF )
            // InternalQualityEffectSpecification.g:362:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalQualityEffectSpecification.g:369:1: ruleTransformation : ( ( rule__Transformation__Alternatives ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:373:2: ( ( ( rule__Transformation__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:374:2: ( ( rule__Transformation__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:374:2: ( ( rule__Transformation__Alternatives ) )
            // InternalQualityEffectSpecification.g:375:3: ( rule__Transformation__Alternatives )
            {
             before(grammarAccess.getTransformationAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:376:3: ( rule__Transformation__Alternatives )
            // InternalQualityEffectSpecification.g:376:4: rule__Transformation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTransformation"


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


    // $ANTLR start "ruleComponentType"
    // InternalQualityEffectSpecification.g:485:1: ruleComponentType : ( ( rule__ComponentType__Alternatives ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:489:1: ( ( ( rule__ComponentType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:490:2: ( ( rule__ComponentType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:490:2: ( ( rule__ComponentType__Alternatives ) )
            // InternalQualityEffectSpecification.g:491:3: ( rule__ComponentType__Alternatives )
            {
             before(grammarAccess.getComponentTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:492:3: ( rule__ComponentType__Alternatives )
            // InternalQualityEffectSpecification.g:492:4: rule__ComponentType__Alternatives
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
    // InternalQualityEffectSpecification.g:501:1: ruleRoleType : ( ( rule__RoleType__Alternatives ) ) ;
    public final void ruleRoleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:505:1: ( ( ( rule__RoleType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:506:2: ( ( rule__RoleType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:506:2: ( ( rule__RoleType__Alternatives ) )
            // InternalQualityEffectSpecification.g:507:3: ( rule__RoleType__Alternatives )
            {
             before(grammarAccess.getRoleTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:508:3: ( rule__RoleType__Alternatives )
            // InternalQualityEffectSpecification.g:508:4: rule__RoleType__Alternatives
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
    // InternalQualityEffectSpecification.g:517:1: ruleAssemblyType : ( ( rule__AssemblyType__Alternatives ) ) ;
    public final void ruleAssemblyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:521:1: ( ( ( rule__AssemblyType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:522:2: ( ( rule__AssemblyType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:522:2: ( ( rule__AssemblyType__Alternatives ) )
            // InternalQualityEffectSpecification.g:523:3: ( rule__AssemblyType__Alternatives )
            {
             before(grammarAccess.getAssemblyTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:524:3: ( rule__AssemblyType__Alternatives )
            // InternalQualityEffectSpecification.g:524:4: rule__AssemblyType__Alternatives
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


    // $ANTLR start "rule__ComponentPropertie__Alternatives"
    // InternalQualityEffectSpecification.g:532:1: rule__ComponentPropertie__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) );
    public final void rule__ComponentPropertie__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:536:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 32:
                {
                alt2=4;
                }
                break;
            case 33:
                {
                alt2=5;
                }
                break;
            case 34:
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
                    // InternalQualityEffectSpecification.g:537:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:537:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:538:3: ruleName
                    {
                     before(grammarAccess.getComponentPropertieAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertieAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:543:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:543:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:544:3: ruleIdentifier
                    {
                     before(grammarAccess.getComponentPropertieAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertieAccess().getIdentifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:549:2: ( ruleType )
                    {
                    // InternalQualityEffectSpecification.g:549:2: ( ruleType )
                    // InternalQualityEffectSpecification.g:550:3: ruleType
                    {
                     before(grammarAccess.getComponentPropertieAccess().getTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertieAccess().getTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:555:2: ( ruleRole )
                    {
                    // InternalQualityEffectSpecification.g:555:2: ( ruleRole )
                    // InternalQualityEffectSpecification.g:556:3: ruleRole
                    {
                     before(grammarAccess.getComponentPropertieAccess().getRoleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertieAccess().getRoleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:561:2: ( ruleAssembly )
                    {
                    // InternalQualityEffectSpecification.g:561:2: ( ruleAssembly )
                    // InternalQualityEffectSpecification.g:562:3: ruleAssembly
                    {
                     before(grammarAccess.getComponentPropertieAccess().getAssemblyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAssembly();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertieAccess().getAssemblyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:567:2: ( ruleResource )
                    {
                    // InternalQualityEffectSpecification.g:567:2: ( ruleResource )
                    // InternalQualityEffectSpecification.g:568:3: ruleResource
                    {
                     before(grammarAccess.getComponentPropertieAccess().getResourceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertieAccess().getResourceParserRuleCall_5()); 

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
    // $ANTLR end "rule__ComponentPropertie__Alternatives"


    // $ANTLR start "rule__RolePropertie__Alternatives"
    // InternalQualityEffectSpecification.g:577:1: rule__RolePropertie__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) );
    public final void rule__RolePropertie__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:581:1: ( ( ruleName ) | ( ruleIdentifier ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQualityEffectSpecification.g:582:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:582:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:583:3: ruleName
                    {
                     before(grammarAccess.getRolePropertieAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getRolePropertieAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:588:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:588:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:589:3: ruleIdentifier
                    {
                     before(grammarAccess.getRolePropertieAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getRolePropertieAccess().getIdentifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__RolePropertie__Alternatives"


    // $ANTLR start "rule__ResourcePropertie__Alternatives"
    // InternalQualityEffectSpecification.g:598:1: rule__ResourcePropertie__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) );
    public final void rule__ResourcePropertie__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:602:1: ( ( ruleName ) | ( ruleIdentifier ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQualityEffectSpecification.g:603:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:603:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:604:3: ruleName
                    {
                     before(grammarAccess.getResourcePropertieAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getResourcePropertieAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:609:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:609:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:610:3: ruleIdentifier
                    {
                     before(grammarAccess.getResourcePropertieAccess().getIdentifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getResourcePropertieAccess().getIdentifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__ResourcePropertie__Alternatives"


    // $ANTLR start "rule__Transformation__Alternatives"
    // InternalQualityEffectSpecification.g:619:1: rule__Transformation__Alternatives : ( ( ruleNQA ) | ( ruleReasoning ) );
    public final void rule__Transformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:623:1: ( ( ruleNQA ) | ( ruleReasoning ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQualityEffectSpecification.g:624:2: ( ruleNQA )
                    {
                    // InternalQualityEffectSpecification.g:624:2: ( ruleNQA )
                    // InternalQualityEffectSpecification.g:625:3: ruleNQA
                    {
                     before(grammarAccess.getTransformationAccess().getNQAParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNQA();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getNQAParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:630:2: ( ruleReasoning )
                    {
                    // InternalQualityEffectSpecification.g:630:2: ( ruleReasoning )
                    // InternalQualityEffectSpecification.g:631:3: ruleReasoning
                    {
                     before(grammarAccess.getTransformationAccess().getReasoningParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReasoning();

                    state._fsp--;

                     after(grammarAccess.getTransformationAccess().getReasoningParserRuleCall_1()); 

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
    // $ANTLR end "rule__Transformation__Alternatives"


    // $ANTLR start "rule__ComponentType__Alternatives"
    // InternalQualityEffectSpecification.g:640:1: rule__ComponentType__Alternatives : ( ( ( 'AnyComponent' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) );
    public final void rule__ComponentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:644:1: ( ( ( 'AnyComponent' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) )
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
                    // InternalQualityEffectSpecification.g:645:2: ( ( 'AnyComponent' ) )
                    {
                    // InternalQualityEffectSpecification.g:645:2: ( ( 'AnyComponent' ) )
                    // InternalQualityEffectSpecification.g:646:3: ( 'AnyComponent' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:647:3: ( 'AnyComponent' )
                    // InternalQualityEffectSpecification.g:647:4: 'AnyComponent'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:651:2: ( ( 'Basic' ) )
                    {
                    // InternalQualityEffectSpecification.g:651:2: ( ( 'Basic' ) )
                    // InternalQualityEffectSpecification.g:652:3: ( 'Basic' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:653:3: ( 'Basic' )
                    // InternalQualityEffectSpecification.g:653:4: 'Basic'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:657:2: ( ( 'Composite' ) )
                    {
                    // InternalQualityEffectSpecification.g:657:2: ( ( 'Composite' ) )
                    // InternalQualityEffectSpecification.g:658:3: ( 'Composite' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:659:3: ( 'Composite' )
                    // InternalQualityEffectSpecification.g:659:4: 'Composite'
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
    // InternalQualityEffectSpecification.g:667:1: rule__RoleType__Alternatives : ( ( ( 'AnyRole' ) ) | ( ( 'Component' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'Infrastructure' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) );
    public final void rule__RoleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:671:1: ( ( ( 'AnyRole' ) ) | ( ( 'Component' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'Infrastructure' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) )
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
                    // InternalQualityEffectSpecification.g:672:2: ( ( 'AnyRole' ) )
                    {
                    // InternalQualityEffectSpecification.g:672:2: ( ( 'AnyRole' ) )
                    // InternalQualityEffectSpecification.g:673:3: ( 'AnyRole' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:674:3: ( 'AnyRole' )
                    // InternalQualityEffectSpecification.g:674:4: 'AnyRole'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:678:2: ( ( 'Component' ) )
                    {
                    // InternalQualityEffectSpecification.g:678:2: ( ( 'Component' ) )
                    // InternalQualityEffectSpecification.g:679:3: ( 'Component' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENTEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:680:3: ( 'Component' )
                    // InternalQualityEffectSpecification.g:680:4: 'Component'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:684:2: ( ( 'ComponentRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:684:2: ( ( 'ComponentRequired' ) )
                    // InternalQualityEffectSpecification.g:685:3: ( 'ComponentRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:686:3: ( 'ComponentRequired' )
                    // InternalQualityEffectSpecification.g:686:4: 'ComponentRequired'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:690:2: ( ( 'ComponentProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:690:2: ( ( 'ComponentProvided' ) )
                    // InternalQualityEffectSpecification.g:691:3: ( 'ComponentProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:692:3: ( 'ComponentProvided' )
                    // InternalQualityEffectSpecification.g:692:4: 'ComponentProvided'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:696:2: ( ( 'Infrastructure' ) )
                    {
                    // InternalQualityEffectSpecification.g:696:2: ( ( 'Infrastructure' ) )
                    // InternalQualityEffectSpecification.g:697:3: ( 'Infrastructure' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTUREEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:698:3: ( 'Infrastructure' )
                    // InternalQualityEffectSpecification.g:698:4: 'Infrastructure'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTUREEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:702:2: ( ( 'InfrastructureRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:702:2: ( ( 'InfrastructureRequired' ) )
                    // InternalQualityEffectSpecification.g:703:3: ( 'InfrastructureRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 
                    // InternalQualityEffectSpecification.g:704:3: ( 'InfrastructureRequired' )
                    // InternalQualityEffectSpecification.g:704:4: 'InfrastructureRequired'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:708:2: ( ( 'InfrastructureProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:708:2: ( ( 'InfrastructureProvided' ) )
                    // InternalQualityEffectSpecification.g:709:3: ( 'InfrastructureProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_PROVIDEDEnumLiteralDeclaration_6()); 
                    // InternalQualityEffectSpecification.g:710:3: ( 'InfrastructureProvided' )
                    // InternalQualityEffectSpecification.g:710:4: 'InfrastructureProvided'
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
    // InternalQualityEffectSpecification.g:718:1: rule__AssemblyType__Alternatives : ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) );
    public final void rule__AssemblyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:722:1: ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) )
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
                    // InternalQualityEffectSpecification.g:723:2: ( ( 'AnyAssembly' ) )
                    {
                    // InternalQualityEffectSpecification.g:723:2: ( ( 'AnyAssembly' ) )
                    // InternalQualityEffectSpecification.g:724:3: ( 'AnyAssembly' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:725:3: ( 'AnyAssembly' )
                    // InternalQualityEffectSpecification.g:725:4: 'AnyAssembly'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:729:2: ( ( 'Required' ) )
                    {
                    // InternalQualityEffectSpecification.g:729:2: ( ( 'Required' ) )
                    // InternalQualityEffectSpecification.g:730:3: ( 'Required' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:731:3: ( 'Required' )
                    // InternalQualityEffectSpecification.g:731:4: 'Required'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:735:2: ( ( 'Provided' ) )
                    {
                    // InternalQualityEffectSpecification.g:735:2: ( ( 'Provided' ) )
                    // InternalQualityEffectSpecification.g:736:3: ( 'Provided' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:737:3: ( 'Provided' )
                    // InternalQualityEffectSpecification.g:737:4: 'Provided'
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


    // $ANTLR start "rule__QES__Group__0"
    // InternalQualityEffectSpecification.g:745:1: rule__QES__Group__0 : rule__QES__Group__0__Impl rule__QES__Group__1 ;
    public final void rule__QES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:749:1: ( rule__QES__Group__0__Impl rule__QES__Group__1 )
            // InternalQualityEffectSpecification.g:750:2: rule__QES__Group__0__Impl rule__QES__Group__1
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
    // InternalQualityEffectSpecification.g:757:1: rule__QES__Group__0__Impl : ( 'For{' ) ;
    public final void rule__QES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:761:1: ( ( 'For{' ) )
            // InternalQualityEffectSpecification.g:762:1: ( 'For{' )
            {
            // InternalQualityEffectSpecification.g:762:1: ( 'For{' )
            // InternalQualityEffectSpecification.g:763:2: 'For{'
            {
             before(grammarAccess.getQESAccess().getForKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:772:1: rule__QES__Group__1 : rule__QES__Group__1__Impl rule__QES__Group__2 ;
    public final void rule__QES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:776:1: ( rule__QES__Group__1__Impl rule__QES__Group__2 )
            // InternalQualityEffectSpecification.g:777:2: rule__QES__Group__1__Impl rule__QES__Group__2
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
    // InternalQualityEffectSpecification.g:784:1: rule__QES__Group__1__Impl : ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) ) ;
    public final void rule__QES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:788:1: ( ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:789:1: ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:789:1: ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:790:2: ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:790:2: ( ( rule__QES__ComponentsAssignment_1 ) )
            // InternalQualityEffectSpecification.g:791:3: ( rule__QES__ComponentsAssignment_1 )
            {
             before(grammarAccess.getQESAccess().getComponentsAssignment_1()); 
            // InternalQualityEffectSpecification.g:792:3: ( rule__QES__ComponentsAssignment_1 )
            // InternalQualityEffectSpecification.g:792:4: rule__QES__ComponentsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__QES__ComponentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getComponentsAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:795:2: ( ( rule__QES__ComponentsAssignment_1 )* )
            // InternalQualityEffectSpecification.g:796:3: ( rule__QES__ComponentsAssignment_1 )*
            {
             before(grammarAccess.getQESAccess().getComponentsAssignment_1()); 
            // InternalQualityEffectSpecification.g:797:3: ( rule__QES__ComponentsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:797:4: rule__QES__ComponentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QES__ComponentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalQualityEffectSpecification.g:806:1: rule__QES__Group__2 : rule__QES__Group__2__Impl rule__QES__Group__3 ;
    public final void rule__QES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:810:1: ( rule__QES__Group__2__Impl rule__QES__Group__3 )
            // InternalQualityEffectSpecification.g:811:2: rule__QES__Group__2__Impl rule__QES__Group__3
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
    // InternalQualityEffectSpecification.g:818:1: rule__QES__Group__2__Impl : ( '}' ) ;
    public final void rule__QES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:822:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:823:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:823:1: ( '}' )
            // InternalQualityEffectSpecification.g:824:2: '}'
            {
             before(grammarAccess.getQESAccess().getRightCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:833:1: rule__QES__Group__3 : rule__QES__Group__3__Impl rule__QES__Group__4 ;
    public final void rule__QES__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:837:1: ( rule__QES__Group__3__Impl rule__QES__Group__4 )
            // InternalQualityEffectSpecification.g:838:2: rule__QES__Group__3__Impl rule__QES__Group__4
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
    // InternalQualityEffectSpecification.g:845:1: rule__QES__Group__3__Impl : ( 'Do{' ) ;
    public final void rule__QES__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:849:1: ( ( 'Do{' ) )
            // InternalQualityEffectSpecification.g:850:1: ( 'Do{' )
            {
            // InternalQualityEffectSpecification.g:850:1: ( 'Do{' )
            // InternalQualityEffectSpecification.g:851:2: 'Do{'
            {
             before(grammarAccess.getQESAccess().getDoKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:860:1: rule__QES__Group__4 : rule__QES__Group__4__Impl rule__QES__Group__5 ;
    public final void rule__QES__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:864:1: ( rule__QES__Group__4__Impl rule__QES__Group__5 )
            // InternalQualityEffectSpecification.g:865:2: rule__QES__Group__4__Impl rule__QES__Group__5
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
    // InternalQualityEffectSpecification.g:872:1: rule__QES__Group__4__Impl : ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) ) ;
    public final void rule__QES__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:876:1: ( ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) ) )
            // InternalQualityEffectSpecification.g:877:1: ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) )
            {
            // InternalQualityEffectSpecification.g:877:1: ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) )
            // InternalQualityEffectSpecification.g:878:2: ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* )
            {
            // InternalQualityEffectSpecification.g:878:2: ( ( rule__QES__TransformationsAssignment_4 ) )
            // InternalQualityEffectSpecification.g:879:3: ( rule__QES__TransformationsAssignment_4 )
            {
             before(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 
            // InternalQualityEffectSpecification.g:880:3: ( rule__QES__TransformationsAssignment_4 )
            // InternalQualityEffectSpecification.g:880:4: rule__QES__TransformationsAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__QES__TransformationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 

            }

            // InternalQualityEffectSpecification.g:883:2: ( ( rule__QES__TransformationsAssignment_4 )* )
            // InternalQualityEffectSpecification.g:884:3: ( rule__QES__TransformationsAssignment_4 )*
            {
             before(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 
            // InternalQualityEffectSpecification.g:885:3: ( rule__QES__TransformationsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35||LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:885:4: rule__QES__TransformationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QES__TransformationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalQualityEffectSpecification.g:894:1: rule__QES__Group__5 : rule__QES__Group__5__Impl ;
    public final void rule__QES__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:898:1: ( rule__QES__Group__5__Impl )
            // InternalQualityEffectSpecification.g:899:2: rule__QES__Group__5__Impl
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
    // InternalQualityEffectSpecification.g:905:1: rule__QES__Group__5__Impl : ( '}' ) ;
    public final void rule__QES__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:909:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:910:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:910:1: ( '}' )
            // InternalQualityEffectSpecification.g:911:2: '}'
            {
             before(grammarAccess.getQESAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__Component__Group__0"
    // InternalQualityEffectSpecification.g:921:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:925:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalQualityEffectSpecification.g:926:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalQualityEffectSpecification.g:933:1: rule__Component__Group__0__Impl : ( 'Component(' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:937:1: ( ( 'Component(' ) )
            // InternalQualityEffectSpecification.g:938:1: ( 'Component(' )
            {
            // InternalQualityEffectSpecification.g:938:1: ( 'Component(' )
            // InternalQualityEffectSpecification.g:939:2: 'Component('
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalQualityEffectSpecification.g:948:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:952:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalQualityEffectSpecification.g:953:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalQualityEffectSpecification.g:960:1: rule__Component__Group__1__Impl : ( ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:964:1: ( ( ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:965:1: ( ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:965:1: ( ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:966:2: ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:966:2: ( ( rule__Component__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:967:3: ( rule__Component__PropertiesAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:968:3: ( rule__Component__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:968:4: rule__Component__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__Component__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:971:2: ( ( rule__Component__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:972:3: ( rule__Component__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:973:3: ( rule__Component__PropertiesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=29 && LA11_0<=34)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:973:4: rule__Component__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalQualityEffectSpecification.g:982:1: rule__Component__Group__2 : rule__Component__Group__2__Impl ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:986:1: ( rule__Component__Group__2__Impl )
            // InternalQualityEffectSpecification.g:987:2: rule__Component__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__2__Impl();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalQualityEffectSpecification.g:993:1: rule__Component__Group__2__Impl : ( ')' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:997:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:998:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:998:1: ( ')' )
            // InternalQualityEffectSpecification.g:999:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalQualityEffectSpecification.g:1009:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1013:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalQualityEffectSpecification.g:1014:2: rule__Name__Group__0__Impl rule__Name__Group__1
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
    // InternalQualityEffectSpecification.g:1021:1: rule__Name__Group__0__Impl : ( 'Name(' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1025:1: ( ( 'Name(' ) )
            // InternalQualityEffectSpecification.g:1026:1: ( 'Name(' )
            {
            // InternalQualityEffectSpecification.g:1026:1: ( 'Name(' )
            // InternalQualityEffectSpecification.g:1027:2: 'Name('
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1036:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1040:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalQualityEffectSpecification.g:1041:2: rule__Name__Group__1__Impl rule__Name__Group__2
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
    // InternalQualityEffectSpecification.g:1048:1: rule__Name__Group__1__Impl : ( ( rule__Name__NotAssignment_1 )? ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1052:1: ( ( ( rule__Name__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1053:1: ( ( rule__Name__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1053:1: ( ( rule__Name__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1054:2: ( rule__Name__NotAssignment_1 )?
            {
             before(grammarAccess.getNameAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1055:2: ( rule__Name__NotAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==42) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1055:3: rule__Name__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1063:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1067:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalQualityEffectSpecification.g:1068:2: rule__Name__Group__2__Impl rule__Name__Group__3
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
    // InternalQualityEffectSpecification.g:1075:1: rule__Name__Group__2__Impl : ( ( rule__Name__NameAssignment_2 ) ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1079:1: ( ( ( rule__Name__NameAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1080:1: ( ( rule__Name__NameAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1080:1: ( ( rule__Name__NameAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1081:2: ( rule__Name__NameAssignment_2 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_2()); 
            // InternalQualityEffectSpecification.g:1082:2: ( rule__Name__NameAssignment_2 )
            // InternalQualityEffectSpecification.g:1082:3: rule__Name__NameAssignment_2
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
    // InternalQualityEffectSpecification.g:1090:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1094:1: ( rule__Name__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1095:2: rule__Name__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1101:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1105:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1106:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1106:1: ( ')' )
            // InternalQualityEffectSpecification.g:1107:2: ')'
            {
             before(grammarAccess.getNameAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1117:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1121:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalQualityEffectSpecification.g:1122:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
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
    // InternalQualityEffectSpecification.g:1129:1: rule__Identifier__Group__0__Impl : ( 'Id(' ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1133:1: ( ( 'Id(' ) )
            // InternalQualityEffectSpecification.g:1134:1: ( 'Id(' )
            {
            // InternalQualityEffectSpecification.g:1134:1: ( 'Id(' )
            // InternalQualityEffectSpecification.g:1135:2: 'Id('
            {
             before(grammarAccess.getIdentifierAccess().getIdKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1144:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1148:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // InternalQualityEffectSpecification.g:1149:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
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
    // InternalQualityEffectSpecification.g:1156:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NotAssignment_1 )? ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1160:1: ( ( ( rule__Identifier__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1161:1: ( ( rule__Identifier__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1161:1: ( ( rule__Identifier__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1162:2: ( rule__Identifier__NotAssignment_1 )?
            {
             before(grammarAccess.getIdentifierAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1163:2: ( rule__Identifier__NotAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1163:3: rule__Identifier__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1171:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl rule__Identifier__Group__3 ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1175:1: ( rule__Identifier__Group__2__Impl rule__Identifier__Group__3 )
            // InternalQualityEffectSpecification.g:1176:2: rule__Identifier__Group__2__Impl rule__Identifier__Group__3
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
    // InternalQualityEffectSpecification.g:1183:1: rule__Identifier__Group__2__Impl : ( ( rule__Identifier__IdAssignment_2 ) ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1187:1: ( ( ( rule__Identifier__IdAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1188:1: ( ( rule__Identifier__IdAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1188:1: ( ( rule__Identifier__IdAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1189:2: ( rule__Identifier__IdAssignment_2 )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment_2()); 
            // InternalQualityEffectSpecification.g:1190:2: ( rule__Identifier__IdAssignment_2 )
            // InternalQualityEffectSpecification.g:1190:3: rule__Identifier__IdAssignment_2
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
    // InternalQualityEffectSpecification.g:1198:1: rule__Identifier__Group__3 : rule__Identifier__Group__3__Impl ;
    public final void rule__Identifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1202:1: ( rule__Identifier__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1203:2: rule__Identifier__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1209:1: rule__Identifier__Group__3__Impl : ( ')' ) ;
    public final void rule__Identifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1213:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1214:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1214:1: ( ')' )
            // InternalQualityEffectSpecification.g:1215:2: ')'
            {
             before(grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1225:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1229:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalQualityEffectSpecification.g:1230:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalQualityEffectSpecification.g:1237:1: rule__Type__Group__0__Impl : ( 'Type(' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1241:1: ( ( 'Type(' ) )
            // InternalQualityEffectSpecification.g:1242:1: ( 'Type(' )
            {
            // InternalQualityEffectSpecification.g:1242:1: ( 'Type(' )
            // InternalQualityEffectSpecification.g:1243:2: 'Type('
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1252:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1256:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalQualityEffectSpecification.g:1257:2: rule__Type__Group__1__Impl rule__Type__Group__2
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
    // InternalQualityEffectSpecification.g:1264:1: rule__Type__Group__1__Impl : ( ( rule__Type__NotAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1268:1: ( ( ( rule__Type__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1269:1: ( ( rule__Type__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1269:1: ( ( rule__Type__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1270:2: ( rule__Type__NotAssignment_1 )?
            {
             before(grammarAccess.getTypeAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1271:2: ( rule__Type__NotAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1271:3: rule__Type__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1279:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1283:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalQualityEffectSpecification.g:1284:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalQualityEffectSpecification.g:1291:1: rule__Type__Group__2__Impl : ( ( rule__Type__TypeAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1295:1: ( ( ( rule__Type__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1296:1: ( ( rule__Type__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1296:1: ( ( rule__Type__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1297:2: ( rule__Type__TypeAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1298:2: ( rule__Type__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1298:3: rule__Type__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1306:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1310:1: ( rule__Type__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1311:2: rule__Type__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1317:1: rule__Type__Group__3__Impl : ( ')' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1321:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1322:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1322:1: ( ')' )
            // InternalQualityEffectSpecification.g:1323:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1333:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1337:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalQualityEffectSpecification.g:1338:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalQualityEffectSpecification.g:1345:1: rule__Role__Group__0__Impl : ( 'Role(' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1349:1: ( ( 'Role(' ) )
            // InternalQualityEffectSpecification.g:1350:1: ( 'Role(' )
            {
            // InternalQualityEffectSpecification.g:1350:1: ( 'Role(' )
            // InternalQualityEffectSpecification.g:1351:2: 'Role('
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1360:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1364:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalQualityEffectSpecification.g:1365:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalQualityEffectSpecification.g:1372:1: rule__Role__Group__1__Impl : ( ( rule__Role__NotAssignment_1 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1376:1: ( ( ( rule__Role__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1377:1: ( ( rule__Role__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1377:1: ( ( rule__Role__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1378:2: ( rule__Role__NotAssignment_1 )?
            {
             before(grammarAccess.getRoleAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1379:2: ( rule__Role__NotAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1379:3: rule__Role__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1387:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1391:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalQualityEffectSpecification.g:1392:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalQualityEffectSpecification.g:1399:1: rule__Role__Group__2__Impl : ( ( rule__Role__TypeAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1403:1: ( ( ( rule__Role__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1404:1: ( ( rule__Role__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1404:1: ( ( rule__Role__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1405:2: ( rule__Role__TypeAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1406:2: ( rule__Role__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1406:3: rule__Role__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1414:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1418:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalQualityEffectSpecification.g:1419:2: rule__Role__Group__3__Impl rule__Role__Group__4
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
    // InternalQualityEffectSpecification.g:1426:1: rule__Role__Group__3__Impl : ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1430:1: ( ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1431:1: ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1431:1: ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1432:2: ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1432:2: ( ( rule__Role__PropertiesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1433:3: ( rule__Role__PropertiesAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1434:3: ( rule__Role__PropertiesAssignment_3 )
            // InternalQualityEffectSpecification.g:1434:4: rule__Role__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__Role__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1437:2: ( ( rule__Role__PropertiesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1438:3: ( rule__Role__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1439:3: ( rule__Role__PropertiesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=30)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1439:4: rule__Role__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Role__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalQualityEffectSpecification.g:1448:1: rule__Role__Group__4 : rule__Role__Group__4__Impl ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1452:1: ( rule__Role__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1453:2: rule__Role__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1459:1: rule__Role__Group__4__Impl : ( ')' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1463:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1464:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1464:1: ( ')' )
            // InternalQualityEffectSpecification.g:1465:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1475:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1479:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalQualityEffectSpecification.g:1480:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
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
    // InternalQualityEffectSpecification.g:1487:1: rule__Assembly__Group__0__Impl : ( 'Assembly(' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1491:1: ( ( 'Assembly(' ) )
            // InternalQualityEffectSpecification.g:1492:1: ( 'Assembly(' )
            {
            // InternalQualityEffectSpecification.g:1492:1: ( 'Assembly(' )
            // InternalQualityEffectSpecification.g:1493:2: 'Assembly('
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1502:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1506:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalQualityEffectSpecification.g:1507:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
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
    // InternalQualityEffectSpecification.g:1514:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NotAssignment_1 )? ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1518:1: ( ( ( rule__Assembly__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1519:1: ( ( rule__Assembly__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1519:1: ( ( rule__Assembly__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1520:2: ( rule__Assembly__NotAssignment_1 )?
            {
             before(grammarAccess.getAssemblyAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1521:2: ( rule__Assembly__NotAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1521:3: rule__Assembly__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1529:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1533:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalQualityEffectSpecification.g:1534:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
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
    // InternalQualityEffectSpecification.g:1541:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__TypeAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1545:1: ( ( ( rule__Assembly__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1546:1: ( ( rule__Assembly__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1546:1: ( ( rule__Assembly__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1547:2: ( rule__Assembly__TypeAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1548:2: ( rule__Assembly__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1548:3: rule__Assembly__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1556:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1560:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalQualityEffectSpecification.g:1561:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
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
    // InternalQualityEffectSpecification.g:1568:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1572:1: ( ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1573:1: ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1573:1: ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1574:2: ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1574:2: ( ( rule__Assembly__ComponentsAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1575:3: ( rule__Assembly__ComponentsAssignment_3 )
            {
             before(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 
            // InternalQualityEffectSpecification.g:1576:3: ( rule__Assembly__ComponentsAssignment_3 )
            // InternalQualityEffectSpecification.g:1576:4: rule__Assembly__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Assembly__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1579:2: ( ( rule__Assembly__ComponentsAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1580:3: ( rule__Assembly__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 
            // InternalQualityEffectSpecification.g:1581:3: ( rule__Assembly__ComponentsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1581:4: rule__Assembly__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Assembly__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalQualityEffectSpecification.g:1590:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1594:1: ( rule__Assembly__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1595:2: rule__Assembly__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1601:1: rule__Assembly__Group__4__Impl : ( ')' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1605:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1606:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1606:1: ( ')' )
            // InternalQualityEffectSpecification.g:1607:2: ')'
            {
             before(grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1617:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1621:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalQualityEffectSpecification.g:1622:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
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
    // InternalQualityEffectSpecification.g:1629:1: rule__Resource__Group__0__Impl : ( 'Resource(' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1633:1: ( ( 'Resource(' ) )
            // InternalQualityEffectSpecification.g:1634:1: ( 'Resource(' )
            {
            // InternalQualityEffectSpecification.g:1634:1: ( 'Resource(' )
            // InternalQualityEffectSpecification.g:1635:2: 'Resource('
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1644:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1648:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalQualityEffectSpecification.g:1649:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
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
    // InternalQualityEffectSpecification.g:1656:1: rule__Resource__Group__1__Impl : ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1660:1: ( ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1661:1: ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1661:1: ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1662:2: ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1662:2: ( ( rule__Resource__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1663:3: ( rule__Resource__PropertiesAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1664:3: ( rule__Resource__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:1664:4: rule__Resource__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_18);
            rule__Resource__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1667:2: ( ( rule__Resource__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1668:3: ( rule__Resource__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1669:3: ( rule__Resource__PropertiesAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=29 && LA19_0<=30)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1669:4: rule__Resource__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Resource__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalQualityEffectSpecification.g:1678:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1682:1: ( rule__Resource__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1683:2: rule__Resource__Group__2__Impl
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
    // InternalQualityEffectSpecification.g:1689:1: rule__Resource__Group__2__Impl : ( ')' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1693:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1694:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1694:1: ( ')' )
            // InternalQualityEffectSpecification.g:1695:2: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1705:1: rule__NQA__Group__0 : rule__NQA__Group__0__Impl rule__NQA__Group__1 ;
    public final void rule__NQA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1709:1: ( rule__NQA__Group__0__Impl rule__NQA__Group__1 )
            // InternalQualityEffectSpecification.g:1710:2: rule__NQA__Group__0__Impl rule__NQA__Group__1
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
    // InternalQualityEffectSpecification.g:1717:1: rule__NQA__Group__0__Impl : ( 'NQA(' ) ;
    public final void rule__NQA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1721:1: ( ( 'NQA(' ) )
            // InternalQualityEffectSpecification.g:1722:1: ( 'NQA(' )
            {
            // InternalQualityEffectSpecification.g:1722:1: ( 'NQA(' )
            // InternalQualityEffectSpecification.g:1723:2: 'NQA('
            {
             before(grammarAccess.getNQAAccess().getNQAKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1732:1: rule__NQA__Group__1 : rule__NQA__Group__1__Impl rule__NQA__Group__2 ;
    public final void rule__NQA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1736:1: ( rule__NQA__Group__1__Impl rule__NQA__Group__2 )
            // InternalQualityEffectSpecification.g:1737:2: rule__NQA__Group__1__Impl rule__NQA__Group__2
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
    // InternalQualityEffectSpecification.g:1744:1: rule__NQA__Group__1__Impl : ( ( rule__NQA__QualityAssignment_1 ) ) ;
    public final void rule__NQA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1748:1: ( ( ( rule__NQA__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1749:1: ( ( rule__NQA__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1749:1: ( ( rule__NQA__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1750:2: ( rule__NQA__QualityAssignment_1 )
            {
             before(grammarAccess.getNQAAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:1751:2: ( rule__NQA__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:1751:3: rule__NQA__QualityAssignment_1
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
    // InternalQualityEffectSpecification.g:1759:1: rule__NQA__Group__2 : rule__NQA__Group__2__Impl rule__NQA__Group__3 ;
    public final void rule__NQA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1763:1: ( rule__NQA__Group__2__Impl rule__NQA__Group__3 )
            // InternalQualityEffectSpecification.g:1764:2: rule__NQA__Group__2__Impl rule__NQA__Group__3
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
    // InternalQualityEffectSpecification.g:1771:1: rule__NQA__Group__2__Impl : ( '=' ) ;
    public final void rule__NQA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1775:1: ( ( '=' ) )
            // InternalQualityEffectSpecification.g:1776:1: ( '=' )
            {
            // InternalQualityEffectSpecification.g:1776:1: ( '=' )
            // InternalQualityEffectSpecification.g:1777:2: '='
            {
             before(grammarAccess.getNQAAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getEqualsSignKeyword_2()); 

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
    // InternalQualityEffectSpecification.g:1786:1: rule__NQA__Group__3 : rule__NQA__Group__3__Impl rule__NQA__Group__4 ;
    public final void rule__NQA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1790:1: ( rule__NQA__Group__3__Impl rule__NQA__Group__4 )
            // InternalQualityEffectSpecification.g:1791:2: rule__NQA__Group__3__Impl rule__NQA__Group__4
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
    // InternalQualityEffectSpecification.g:1798:1: rule__NQA__Group__3__Impl : ( ( rule__NQA__ElementAssignment_3 ) ) ;
    public final void rule__NQA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1802:1: ( ( ( rule__NQA__ElementAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:1803:1: ( ( rule__NQA__ElementAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:1803:1: ( ( rule__NQA__ElementAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1804:2: ( rule__NQA__ElementAssignment_3 )
            {
             before(grammarAccess.getNQAAccess().getElementAssignment_3()); 
            // InternalQualityEffectSpecification.g:1805:2: ( rule__NQA__ElementAssignment_3 )
            // InternalQualityEffectSpecification.g:1805:3: rule__NQA__ElementAssignment_3
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
    // InternalQualityEffectSpecification.g:1813:1: rule__NQA__Group__4 : rule__NQA__Group__4__Impl ;
    public final void rule__NQA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1817:1: ( rule__NQA__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1818:2: rule__NQA__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1824:1: rule__NQA__Group__4__Impl : ( ')' ) ;
    public final void rule__NQA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1828:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1829:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1829:1: ( ')' )
            // InternalQualityEffectSpecification.g:1830:2: ')'
            {
             before(grammarAccess.getNQAAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1840:1: rule__Reasoning__Group__0 : rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 ;
    public final void rule__Reasoning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1844:1: ( rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 )
            // InternalQualityEffectSpecification.g:1845:2: rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1
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
    // InternalQualityEffectSpecification.g:1852:1: rule__Reasoning__Group__0__Impl : ( 'Reasoning(' ) ;
    public final void rule__Reasoning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1856:1: ( ( 'Reasoning(' ) )
            // InternalQualityEffectSpecification.g:1857:1: ( 'Reasoning(' )
            {
            // InternalQualityEffectSpecification.g:1857:1: ( 'Reasoning(' )
            // InternalQualityEffectSpecification.g:1858:2: 'Reasoning('
            {
             before(grammarAccess.getReasoningAccess().getReasoningKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1867:1: rule__Reasoning__Group__1 : rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 ;
    public final void rule__Reasoning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1871:1: ( rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 )
            // InternalQualityEffectSpecification.g:1872:2: rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2
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
    // InternalQualityEffectSpecification.g:1879:1: rule__Reasoning__Group__1__Impl : ( ( rule__Reasoning__QualityAssignment_1 ) ) ;
    public final void rule__Reasoning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1883:1: ( ( ( rule__Reasoning__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1884:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1884:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1885:2: ( rule__Reasoning__QualityAssignment_1 )
            {
             before(grammarAccess.getReasoningAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:1886:2: ( rule__Reasoning__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:1886:3: rule__Reasoning__QualityAssignment_1
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
    // InternalQualityEffectSpecification.g:1894:1: rule__Reasoning__Group__2 : rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 ;
    public final void rule__Reasoning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1898:1: ( rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 )
            // InternalQualityEffectSpecification.g:1899:2: rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3
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
    // InternalQualityEffectSpecification.g:1906:1: rule__Reasoning__Group__2__Impl : ( ':' ) ;
    public final void rule__Reasoning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1910:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:1911:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:1911:1: ( ':' )
            // InternalQualityEffectSpecification.g:1912:2: ':'
            {
             before(grammarAccess.getReasoningAccess().getColonKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1921:1: rule__Reasoning__Group__3 : rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 ;
    public final void rule__Reasoning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1925:1: ( rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 )
            // InternalQualityEffectSpecification.g:1926:2: rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4
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
    // InternalQualityEffectSpecification.g:1933:1: rule__Reasoning__Group__3__Impl : ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) ;
    public final void rule__Reasoning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1937:1: ( ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1938:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1938:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1939:2: ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1939:2: ( ( rule__Reasoning__RulesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1940:3: ( rule__Reasoning__RulesAssignment_3 )
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1941:3: ( rule__Reasoning__RulesAssignment_3 )
            // InternalQualityEffectSpecification.g:1941:4: rule__Reasoning__RulesAssignment_3
            {
            pushFollow(FOLLOW_24);
            rule__Reasoning__RulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1944:2: ( ( rule__Reasoning__RulesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1945:3: ( rule__Reasoning__RulesAssignment_3 )*
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1946:3: ( rule__Reasoning__RulesAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1946:4: rule__Reasoning__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Reasoning__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalQualityEffectSpecification.g:1955:1: rule__Reasoning__Group__4 : rule__Reasoning__Group__4__Impl ;
    public final void rule__Reasoning__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1959:1: ( rule__Reasoning__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1960:2: rule__Reasoning__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1966:1: rule__Reasoning__Group__4__Impl : ( ')' ) ;
    public final void rule__Reasoning__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1970:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1971:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1971:1: ( ')' )
            // InternalQualityEffectSpecification.g:1972:2: ')'
            {
             before(grammarAccess.getReasoningAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1982:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1986:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalQualityEffectSpecification.g:1987:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalQualityEffectSpecification.g:1994:1: rule__Rule__Group__0__Impl : ( '(' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1998:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:1999:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:1999:1: ( '(' )
            // InternalQualityEffectSpecification.g:2000:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2009:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2013:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalQualityEffectSpecification.g:2014:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalQualityEffectSpecification.g:2021:1: rule__Rule__Group__1__Impl : ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2025:1: ( ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2026:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2026:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2027:2: ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2027:2: ( ( rule__Rule__QualitiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2028:3: ( rule__Rule__QualitiesAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2029:3: ( rule__Rule__QualitiesAssignment_1 )
            // InternalQualityEffectSpecification.g:2029:4: rule__Rule__QualitiesAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__Rule__QualitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2032:2: ( ( rule__Rule__QualitiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2033:3: ( rule__Rule__QualitiesAssignment_1 )*
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2034:3: ( rule__Rule__QualitiesAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2034:4: rule__Rule__QualitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Rule__QualitiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalQualityEffectSpecification.g:2043:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2047:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalQualityEffectSpecification.g:2048:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalQualityEffectSpecification.g:2055:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2059:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2060:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2060:1: ( ':' )
            // InternalQualityEffectSpecification.g:2061:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2070:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2074:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalQualityEffectSpecification.g:2075:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalQualityEffectSpecification.g:2082:1: rule__Rule__Group__3__Impl : ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2086:1: ( ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:2087:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:2087:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:2088:2: ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:2088:2: ( ( rule__Rule__EntriesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2089:3: ( rule__Rule__EntriesAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2090:3: ( rule__Rule__EntriesAssignment_3 )
            // InternalQualityEffectSpecification.g:2090:4: rule__Rule__EntriesAssignment_3
            {
            pushFollow(FOLLOW_27);
            rule__Rule__EntriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:2093:2: ( ( rule__Rule__EntriesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:2094:3: ( rule__Rule__EntriesAssignment_3 )*
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2095:3: ( rule__Rule__EntriesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2095:4: rule__Rule__EntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Rule__EntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalQualityEffectSpecification.g:2104:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2108:1: ( rule__Rule__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2109:2: rule__Rule__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2115:1: rule__Rule__Group__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2119:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2120:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2120:1: ( ')' )
            // InternalQualityEffectSpecification.g:2121:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2131:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2135:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalQualityEffectSpecification.g:2136:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
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
    // InternalQualityEffectSpecification.g:2143:1: rule__Entry__Group__0__Impl : ( '[' ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2147:1: ( ( '[' ) )
            // InternalQualityEffectSpecification.g:2148:1: ( '[' )
            {
            // InternalQualityEffectSpecification.g:2148:1: ( '[' )
            // InternalQualityEffectSpecification.g:2149:2: '['
            {
             before(grammarAccess.getEntryAccess().getLeftSquareBracketKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2158:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2162:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalQualityEffectSpecification.g:2163:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalQualityEffectSpecification.g:2170:1: rule__Entry__Group__1__Impl : ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2174:1: ( ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2175:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2175:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2176:2: ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2176:2: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2177:3: ( rule__Entry__KeyAssignment_1 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:2178:3: ( rule__Entry__KeyAssignment_1 )
            // InternalQualityEffectSpecification.g:2178:4: rule__Entry__KeyAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__Entry__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getKeyAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2181:2: ( ( rule__Entry__KeyAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2182:3: ( rule__Entry__KeyAssignment_1 )*
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:2183:3: ( rule__Entry__KeyAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2183:4: rule__Entry__KeyAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Entry__KeyAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalQualityEffectSpecification.g:2192:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2196:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalQualityEffectSpecification.g:2197:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
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
    // InternalQualityEffectSpecification.g:2204:1: rule__Entry__Group__2__Impl : ( '=' ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2208:1: ( ( '=' ) )
            // InternalQualityEffectSpecification.g:2209:1: ( '=' )
            {
            // InternalQualityEffectSpecification.g:2209:1: ( '=' )
            // InternalQualityEffectSpecification.g:2210:2: '='
            {
             before(grammarAccess.getEntryAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getEqualsSignKeyword_2()); 

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
    // InternalQualityEffectSpecification.g:2219:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2223:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalQualityEffectSpecification.g:2224:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
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
    // InternalQualityEffectSpecification.g:2231:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__ValueAssignment_3 ) ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2235:1: ( ( ( rule__Entry__ValueAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2236:1: ( ( rule__Entry__ValueAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2236:1: ( ( rule__Entry__ValueAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2237:2: ( rule__Entry__ValueAssignment_3 )
            {
             before(grammarAccess.getEntryAccess().getValueAssignment_3()); 
            // InternalQualityEffectSpecification.g:2238:2: ( rule__Entry__ValueAssignment_3 )
            // InternalQualityEffectSpecification.g:2238:3: rule__Entry__ValueAssignment_3
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
    // InternalQualityEffectSpecification.g:2246:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2250:1: ( rule__Entry__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2251:2: rule__Entry__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2257:1: rule__Entry__Group__4__Impl : ( ']' ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2261:1: ( ( ']' ) )
            // InternalQualityEffectSpecification.g:2262:1: ( ']' )
            {
            // InternalQualityEffectSpecification.g:2262:1: ( ']' )
            // InternalQualityEffectSpecification.g:2263:2: ']'
            {
             before(grammarAccess.getEntryAccess().getRightSquareBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__SpecificationsAssignment"
    // InternalQualityEffectSpecification.g:2273:1: rule__Model__SpecificationsAssignment : ( ruleQES ) ;
    public final void rule__Model__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2277:1: ( ( ruleQES ) )
            // InternalQualityEffectSpecification.g:2278:2: ( ruleQES )
            {
            // InternalQualityEffectSpecification.g:2278:2: ( ruleQES )
            // InternalQualityEffectSpecification.g:2279:3: ruleQES
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
    // InternalQualityEffectSpecification.g:2288:1: rule__QES__ComponentsAssignment_1 : ( ruleComponent ) ;
    public final void rule__QES__ComponentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2292:1: ( ( ruleComponent ) )
            // InternalQualityEffectSpecification.g:2293:2: ( ruleComponent )
            {
            // InternalQualityEffectSpecification.g:2293:2: ( ruleComponent )
            // InternalQualityEffectSpecification.g:2294:3: ruleComponent
            {
             before(grammarAccess.getQESAccess().getComponentsComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getQESAccess().getComponentsComponentParserRuleCall_1_0()); 

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
    // InternalQualityEffectSpecification.g:2303:1: rule__QES__TransformationsAssignment_4 : ( ruleTransformation ) ;
    public final void rule__QES__TransformationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2307:1: ( ( ruleTransformation ) )
            // InternalQualityEffectSpecification.g:2308:2: ( ruleTransformation )
            {
            // InternalQualityEffectSpecification.g:2308:2: ( ruleTransformation )
            // InternalQualityEffectSpecification.g:2309:3: ruleTransformation
            {
             before(grammarAccess.getQESAccess().getTransformationsTransformationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getQESAccess().getTransformationsTransformationParserRuleCall_4_0()); 

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


    // $ANTLR start "rule__Component__PropertiesAssignment_1"
    // InternalQualityEffectSpecification.g:2318:1: rule__Component__PropertiesAssignment_1 : ( ruleComponentPropertie ) ;
    public final void rule__Component__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2322:1: ( ( ruleComponentPropertie ) )
            // InternalQualityEffectSpecification.g:2323:2: ( ruleComponentPropertie )
            {
            // InternalQualityEffectSpecification.g:2323:2: ( ruleComponentPropertie )
            // InternalQualityEffectSpecification.g:2324:3: ruleComponentPropertie
            {
             before(grammarAccess.getComponentAccess().getPropertiesComponentPropertieParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPropertie();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPropertiesComponentPropertieParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Component__PropertiesAssignment_1"


    // $ANTLR start "rule__Name__NotAssignment_1"
    // InternalQualityEffectSpecification.g:2333:1: rule__Name__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Name__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2337:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2338:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2338:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2339:3: ( 'Not' )
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2340:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2341:4: 'Not'
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2352:1: rule__Name__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Name__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2356:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2357:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2357:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2358:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2367:1: rule__Identifier__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Identifier__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2371:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2372:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2372:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2373:3: ( 'Not' )
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2374:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2375:4: 'Not'
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2386:1: rule__Identifier__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__Identifier__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2390:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2391:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2391:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2392:3: RULE_ID
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
    // InternalQualityEffectSpecification.g:2401:1: rule__Type__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Type__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2405:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2406:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2406:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2407:3: ( 'Not' )
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2408:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2409:4: 'Not'
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2420:1: rule__Type__TypeAssignment_2 : ( ruleComponentType ) ;
    public final void rule__Type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2424:1: ( ( ruleComponentType ) )
            // InternalQualityEffectSpecification.g:2425:2: ( ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:2425:2: ( ruleComponentType )
            // InternalQualityEffectSpecification.g:2426:3: ruleComponentType
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
    // InternalQualityEffectSpecification.g:2435:1: rule__Role__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Role__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2439:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2440:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2440:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2441:3: ( 'Not' )
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2442:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2443:4: 'Not'
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2454:1: rule__Role__TypeAssignment_2 : ( ruleRoleType ) ;
    public final void rule__Role__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2458:1: ( ( ruleRoleType ) )
            // InternalQualityEffectSpecification.g:2459:2: ( ruleRoleType )
            {
            // InternalQualityEffectSpecification.g:2459:2: ( ruleRoleType )
            // InternalQualityEffectSpecification.g:2460:3: ruleRoleType
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
    // InternalQualityEffectSpecification.g:2469:1: rule__Role__PropertiesAssignment_3 : ( ruleRolePropertie ) ;
    public final void rule__Role__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2473:1: ( ( ruleRolePropertie ) )
            // InternalQualityEffectSpecification.g:2474:2: ( ruleRolePropertie )
            {
            // InternalQualityEffectSpecification.g:2474:2: ( ruleRolePropertie )
            // InternalQualityEffectSpecification.g:2475:3: ruleRolePropertie
            {
             before(grammarAccess.getRoleAccess().getPropertiesRolePropertieParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRolePropertie();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPropertiesRolePropertieParserRuleCall_3_0()); 

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
    // InternalQualityEffectSpecification.g:2484:1: rule__Assembly__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Assembly__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2488:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2489:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2489:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2490:3: ( 'Not' )
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2491:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2492:4: 'Not'
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2503:1: rule__Assembly__TypeAssignment_2 : ( ruleAssemblyType ) ;
    public final void rule__Assembly__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2507:1: ( ( ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:2508:2: ( ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:2508:2: ( ruleAssemblyType )
            // InternalQualityEffectSpecification.g:2509:3: ruleAssemblyType
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
    // InternalQualityEffectSpecification.g:2518:1: rule__Assembly__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Assembly__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2522:1: ( ( ruleComponent ) )
            // InternalQualityEffectSpecification.g:2523:2: ( ruleComponent )
            {
            // InternalQualityEffectSpecification.g:2523:2: ( ruleComponent )
            // InternalQualityEffectSpecification.g:2524:3: ruleComponent
            {
             before(grammarAccess.getAssemblyAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getComponentsComponentParserRuleCall_3_0()); 

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
    // InternalQualityEffectSpecification.g:2533:1: rule__Resource__PropertiesAssignment_1 : ( ruleResourcePropertie ) ;
    public final void rule__Resource__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2537:1: ( ( ruleResourcePropertie ) )
            // InternalQualityEffectSpecification.g:2538:2: ( ruleResourcePropertie )
            {
            // InternalQualityEffectSpecification.g:2538:2: ( ruleResourcePropertie )
            // InternalQualityEffectSpecification.g:2539:3: ruleResourcePropertie
            {
             before(grammarAccess.getResourceAccess().getPropertiesResourcePropertieParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResourcePropertie();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getPropertiesResourcePropertieParserRuleCall_1_0()); 

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
    // InternalQualityEffectSpecification.g:2548:1: rule__NQA__QualityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NQA__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2552:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2553:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2553:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2554:3: RULE_STRING
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


    // $ANTLR start "rule__NQA__ElementAssignment_3"
    // InternalQualityEffectSpecification.g:2563:1: rule__NQA__ElementAssignment_3 : ( RULE_STRING ) ;
    public final void rule__NQA__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2567:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2568:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2568:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2569:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2578:1: rule__Reasoning__QualityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Reasoning__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2582:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2583:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2583:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2584:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2593:1: rule__Reasoning__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Reasoning__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2597:1: ( ( ruleRule ) )
            // InternalQualityEffectSpecification.g:2598:2: ( ruleRule )
            {
            // InternalQualityEffectSpecification.g:2598:2: ( ruleRule )
            // InternalQualityEffectSpecification.g:2599:3: ruleRule
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
    // InternalQualityEffectSpecification.g:2608:1: rule__Rule__QualitiesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__QualitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2612:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2613:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2613:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2614:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2623:1: rule__Rule__EntriesAssignment_3 : ( ruleEntry ) ;
    public final void rule__Rule__EntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2627:1: ( ( ruleEntry ) )
            // InternalQualityEffectSpecification.g:2628:2: ( ruleEntry )
            {
            // InternalQualityEffectSpecification.g:2628:2: ( ruleEntry )
            // InternalQualityEffectSpecification.g:2629:3: ruleEntry
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
    // InternalQualityEffectSpecification.g:2638:1: rule__Entry__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2642:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2643:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2643:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2644:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2653:1: rule__Entry__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Entry__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2657:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2658:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2658:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2659:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000003800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000400001FC000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000E00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});

}