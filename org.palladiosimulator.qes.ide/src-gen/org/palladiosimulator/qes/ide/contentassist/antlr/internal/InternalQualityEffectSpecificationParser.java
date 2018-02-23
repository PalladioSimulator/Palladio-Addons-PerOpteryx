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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'basic'", "'composite'", "'required'", "'provided'", "'component'", "'infrastructure'", "'assembly'", "':'", "'Component('", "')'", "'Not('", "'Name('", "'Id('", "'Type('", "'Role('", "'Assembly('", "'NQA('", "'='", "'Reasoning('", "'{'", "'})'", "'('", "'['", "']'"
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
    // InternalQualityEffectSpecification.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalQualityEffectSpecification.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:69:3: ( rule__Model__Group__0 )
            // InternalQualityEffectSpecification.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleComponent"
    // InternalQualityEffectSpecification.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:79:1: ( ruleComponent EOF )
            // InternalQualityEffectSpecification.g:80:1: ruleComponent EOF
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
    // InternalQualityEffectSpecification.g:87:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:91:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:92:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:92:2: ( ( rule__Component__Group__0 ) )
            // InternalQualityEffectSpecification.g:93:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:94:3: ( rule__Component__Group__0 )
            // InternalQualityEffectSpecification.g:94:4: rule__Component__Group__0
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


    // $ANTLR start "entryRulePropertie"
    // InternalQualityEffectSpecification.g:103:1: entryRulePropertie : rulePropertie EOF ;
    public final void entryRulePropertie() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:104:1: ( rulePropertie EOF )
            // InternalQualityEffectSpecification.g:105:1: rulePropertie EOF
            {
             before(grammarAccess.getPropertieRule()); 
            pushFollow(FOLLOW_1);
            rulePropertie();

            state._fsp--;

             after(grammarAccess.getPropertieRule()); 
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
    // $ANTLR end "entryRulePropertie"


    // $ANTLR start "rulePropertie"
    // InternalQualityEffectSpecification.g:112:1: rulePropertie : ( ( rule__Propertie__Alternatives ) ) ;
    public final void rulePropertie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:116:2: ( ( ( rule__Propertie__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:117:2: ( ( rule__Propertie__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:117:2: ( ( rule__Propertie__Alternatives ) )
            // InternalQualityEffectSpecification.g:118:3: ( rule__Propertie__Alternatives )
            {
             before(grammarAccess.getPropertieAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:119:3: ( rule__Propertie__Alternatives )
            // InternalQualityEffectSpecification.g:119:4: rule__Propertie__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertieAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertie"


    // $ANTLR start "entryRuleNegation"
    // InternalQualityEffectSpecification.g:128:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:129:1: ( ruleNegation EOF )
            // InternalQualityEffectSpecification.g:130:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalQualityEffectSpecification.g:137:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:141:2: ( ( ( rule__Negation__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:142:2: ( ( rule__Negation__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:142:2: ( ( rule__Negation__Group__0 ) )
            // InternalQualityEffectSpecification.g:143:3: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:144:3: ( rule__Negation__Group__0 )
            // InternalQualityEffectSpecification.g:144:4: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleComponentPropertie"
    // InternalQualityEffectSpecification.g:153:1: entryRuleComponentPropertie : ruleComponentPropertie EOF ;
    public final void entryRuleComponentPropertie() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:154:1: ( ruleComponentPropertie EOF )
            // InternalQualityEffectSpecification.g:155:1: ruleComponentPropertie EOF
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
    // InternalQualityEffectSpecification.g:162:1: ruleComponentPropertie : ( ( rule__ComponentPropertie__Alternatives ) ) ;
    public final void ruleComponentPropertie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:166:2: ( ( ( rule__ComponentPropertie__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:167:2: ( ( rule__ComponentPropertie__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:167:2: ( ( rule__ComponentPropertie__Alternatives ) )
            // InternalQualityEffectSpecification.g:168:3: ( rule__ComponentPropertie__Alternatives )
            {
             before(grammarAccess.getComponentPropertieAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:169:3: ( rule__ComponentPropertie__Alternatives )
            // InternalQualityEffectSpecification.g:169:4: rule__ComponentPropertie__Alternatives
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
    // InternalQualityEffectSpecification.g:178:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:179:1: ( ruleName EOF )
            // InternalQualityEffectSpecification.g:180:1: ruleName EOF
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
    // InternalQualityEffectSpecification.g:187:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:191:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:192:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:192:2: ( ( rule__Name__Group__0 ) )
            // InternalQualityEffectSpecification.g:193:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:194:3: ( rule__Name__Group__0 )
            // InternalQualityEffectSpecification.g:194:4: rule__Name__Group__0
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
    // InternalQualityEffectSpecification.g:203:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:204:1: ( ruleIdentifier EOF )
            // InternalQualityEffectSpecification.g:205:1: ruleIdentifier EOF
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
    // InternalQualityEffectSpecification.g:212:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:216:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:217:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:217:2: ( ( rule__Identifier__Group__0 ) )
            // InternalQualityEffectSpecification.g:218:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:219:3: ( rule__Identifier__Group__0 )
            // InternalQualityEffectSpecification.g:219:4: rule__Identifier__Group__0
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
    // InternalQualityEffectSpecification.g:228:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:229:1: ( ruleType EOF )
            // InternalQualityEffectSpecification.g:230:1: ruleType EOF
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
    // InternalQualityEffectSpecification.g:237:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:241:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:242:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:242:2: ( ( rule__Type__Group__0 ) )
            // InternalQualityEffectSpecification.g:243:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:244:3: ( rule__Type__Group__0 )
            // InternalQualityEffectSpecification.g:244:4: rule__Type__Group__0
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
    // InternalQualityEffectSpecification.g:253:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:254:1: ( ruleRole EOF )
            // InternalQualityEffectSpecification.g:255:1: ruleRole EOF
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
    // InternalQualityEffectSpecification.g:262:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:266:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:267:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:267:2: ( ( rule__Role__Group__0 ) )
            // InternalQualityEffectSpecification.g:268:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:269:3: ( rule__Role__Group__0 )
            // InternalQualityEffectSpecification.g:269:4: rule__Role__Group__0
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
    // InternalQualityEffectSpecification.g:278:1: entryRuleRolePropertie : ruleRolePropertie EOF ;
    public final void entryRuleRolePropertie() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:279:1: ( ruleRolePropertie EOF )
            // InternalQualityEffectSpecification.g:280:1: ruleRolePropertie EOF
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
    // InternalQualityEffectSpecification.g:287:1: ruleRolePropertie : ( ( rule__RolePropertie__Alternatives ) ) ;
    public final void ruleRolePropertie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:291:2: ( ( ( rule__RolePropertie__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:292:2: ( ( rule__RolePropertie__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:292:2: ( ( rule__RolePropertie__Alternatives ) )
            // InternalQualityEffectSpecification.g:293:3: ( rule__RolePropertie__Alternatives )
            {
             before(grammarAccess.getRolePropertieAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:294:3: ( rule__RolePropertie__Alternatives )
            // InternalQualityEffectSpecification.g:294:4: rule__RolePropertie__Alternatives
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
    // InternalQualityEffectSpecification.g:303:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:304:1: ( ruleAssembly EOF )
            // InternalQualityEffectSpecification.g:305:1: ruleAssembly EOF
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
    // InternalQualityEffectSpecification.g:312:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:316:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:317:2: ( ( rule__Assembly__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:317:2: ( ( rule__Assembly__Group__0 ) )
            // InternalQualityEffectSpecification.g:318:3: ( rule__Assembly__Group__0 )
            {
             before(grammarAccess.getAssemblyAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:319:3: ( rule__Assembly__Group__0 )
            // InternalQualityEffectSpecification.g:319:4: rule__Assembly__Group__0
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


    // $ANTLR start "entryRuleTransformation"
    // InternalQualityEffectSpecification.g:328:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:329:1: ( ruleTransformation EOF )
            // InternalQualityEffectSpecification.g:330:1: ruleTransformation EOF
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
    // InternalQualityEffectSpecification.g:337:1: ruleTransformation : ( ( rule__Transformation__Alternatives ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:341:2: ( ( ( rule__Transformation__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:342:2: ( ( rule__Transformation__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:342:2: ( ( rule__Transformation__Alternatives ) )
            // InternalQualityEffectSpecification.g:343:3: ( rule__Transformation__Alternatives )
            {
             before(grammarAccess.getTransformationAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:344:3: ( rule__Transformation__Alternatives )
            // InternalQualityEffectSpecification.g:344:4: rule__Transformation__Alternatives
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
    // InternalQualityEffectSpecification.g:353:1: entryRuleNQA : ruleNQA EOF ;
    public final void entryRuleNQA() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:354:1: ( ruleNQA EOF )
            // InternalQualityEffectSpecification.g:355:1: ruleNQA EOF
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
    // InternalQualityEffectSpecification.g:362:1: ruleNQA : ( ( rule__NQA__Group__0 ) ) ;
    public final void ruleNQA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:366:2: ( ( ( rule__NQA__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:367:2: ( ( rule__NQA__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:367:2: ( ( rule__NQA__Group__0 ) )
            // InternalQualityEffectSpecification.g:368:3: ( rule__NQA__Group__0 )
            {
             before(grammarAccess.getNQAAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:369:3: ( rule__NQA__Group__0 )
            // InternalQualityEffectSpecification.g:369:4: rule__NQA__Group__0
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
    // InternalQualityEffectSpecification.g:378:1: entryRuleReasoning : ruleReasoning EOF ;
    public final void entryRuleReasoning() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:379:1: ( ruleReasoning EOF )
            // InternalQualityEffectSpecification.g:380:1: ruleReasoning EOF
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
    // InternalQualityEffectSpecification.g:387:1: ruleReasoning : ( ( rule__Reasoning__Group__0 ) ) ;
    public final void ruleReasoning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:391:2: ( ( ( rule__Reasoning__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:392:2: ( ( rule__Reasoning__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:392:2: ( ( rule__Reasoning__Group__0 ) )
            // InternalQualityEffectSpecification.g:393:3: ( rule__Reasoning__Group__0 )
            {
             before(grammarAccess.getReasoningAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:394:3: ( rule__Reasoning__Group__0 )
            // InternalQualityEffectSpecification.g:394:4: rule__Reasoning__Group__0
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
    // InternalQualityEffectSpecification.g:403:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:404:1: ( ruleRule EOF )
            // InternalQualityEffectSpecification.g:405:1: ruleRule EOF
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
    // InternalQualityEffectSpecification.g:412:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:416:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:417:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:417:2: ( ( rule__Rule__Group__0 ) )
            // InternalQualityEffectSpecification.g:418:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:419:3: ( rule__Rule__Group__0 )
            // InternalQualityEffectSpecification.g:419:4: rule__Rule__Group__0
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
    // InternalQualityEffectSpecification.g:428:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:429:1: ( ruleEntry EOF )
            // InternalQualityEffectSpecification.g:430:1: ruleEntry EOF
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
    // InternalQualityEffectSpecification.g:437:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:441:2: ( ( ( rule__Entry__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:442:2: ( ( rule__Entry__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:442:2: ( ( rule__Entry__Group__0 ) )
            // InternalQualityEffectSpecification.g:443:3: ( rule__Entry__Group__0 )
            {
             before(grammarAccess.getEntryAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:444:3: ( rule__Entry__Group__0 )
            // InternalQualityEffectSpecification.g:444:4: rule__Entry__Group__0
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
    // InternalQualityEffectSpecification.g:453:1: ruleComponentType : ( ( rule__ComponentType__Alternatives ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:457:1: ( ( ( rule__ComponentType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:458:2: ( ( rule__ComponentType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:458:2: ( ( rule__ComponentType__Alternatives ) )
            // InternalQualityEffectSpecification.g:459:3: ( rule__ComponentType__Alternatives )
            {
             before(grammarAccess.getComponentTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:460:3: ( rule__ComponentType__Alternatives )
            // InternalQualityEffectSpecification.g:460:4: rule__ComponentType__Alternatives
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
    // InternalQualityEffectSpecification.g:469:1: ruleRoleType : ( ( rule__RoleType__Alternatives ) ) ;
    public final void ruleRoleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:473:1: ( ( ( rule__RoleType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:474:2: ( ( rule__RoleType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:474:2: ( ( rule__RoleType__Alternatives ) )
            // InternalQualityEffectSpecification.g:475:3: ( rule__RoleType__Alternatives )
            {
             before(grammarAccess.getRoleTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:476:3: ( rule__RoleType__Alternatives )
            // InternalQualityEffectSpecification.g:476:4: rule__RoleType__Alternatives
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
    // InternalQualityEffectSpecification.g:485:1: ruleAssemblyType : ( ( rule__AssemblyType__Alternatives ) ) ;
    public final void ruleAssemblyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:489:1: ( ( ( rule__AssemblyType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:490:2: ( ( rule__AssemblyType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:490:2: ( ( rule__AssemblyType__Alternatives ) )
            // InternalQualityEffectSpecification.g:491:3: ( rule__AssemblyType__Alternatives )
            {
             before(grammarAccess.getAssemblyTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:492:3: ( rule__AssemblyType__Alternatives )
            // InternalQualityEffectSpecification.g:492:4: rule__AssemblyType__Alternatives
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


    // $ANTLR start "rule__Propertie__Alternatives"
    // InternalQualityEffectSpecification.g:500:1: rule__Propertie__Alternatives : ( ( ruleNegation ) | ( ruleComponentPropertie ) );
    public final void rule__Propertie__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:504:1: ( ( ruleNegation ) | ( ruleComponentPropertie ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=22 && LA1_0<=26)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQualityEffectSpecification.g:505:2: ( ruleNegation )
                    {
                    // InternalQualityEffectSpecification.g:505:2: ( ruleNegation )
                    // InternalQualityEffectSpecification.g:506:3: ruleNegation
                    {
                     before(grammarAccess.getPropertieAccess().getNegationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getPropertieAccess().getNegationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:511:2: ( ruleComponentPropertie )
                    {
                    // InternalQualityEffectSpecification.g:511:2: ( ruleComponentPropertie )
                    // InternalQualityEffectSpecification.g:512:3: ruleComponentPropertie
                    {
                     before(grammarAccess.getPropertieAccess().getComponentPropertieParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentPropertie();

                    state._fsp--;

                     after(grammarAccess.getPropertieAccess().getComponentPropertieParserRuleCall_1()); 

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
    // $ANTLR end "rule__Propertie__Alternatives"


    // $ANTLR start "rule__ComponentPropertie__Alternatives"
    // InternalQualityEffectSpecification.g:521:1: rule__ComponentPropertie__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) );
    public final void rule__ComponentPropertie__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:525:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQualityEffectSpecification.g:526:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:526:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:527:3: ruleName
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
                    // InternalQualityEffectSpecification.g:532:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:532:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:533:3: ruleIdentifier
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
                    // InternalQualityEffectSpecification.g:538:2: ( ruleType )
                    {
                    // InternalQualityEffectSpecification.g:538:2: ( ruleType )
                    // InternalQualityEffectSpecification.g:539:3: ruleType
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
                    // InternalQualityEffectSpecification.g:544:2: ( ruleRole )
                    {
                    // InternalQualityEffectSpecification.g:544:2: ( ruleRole )
                    // InternalQualityEffectSpecification.g:545:3: ruleRole
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
                    // InternalQualityEffectSpecification.g:550:2: ( ruleAssembly )
                    {
                    // InternalQualityEffectSpecification.g:550:2: ( ruleAssembly )
                    // InternalQualityEffectSpecification.g:551:3: ruleAssembly
                    {
                     before(grammarAccess.getComponentPropertieAccess().getAssemblyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAssembly();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertieAccess().getAssemblyParserRuleCall_4()); 

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
    // InternalQualityEffectSpecification.g:560:1: rule__RolePropertie__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) );
    public final void rule__RolePropertie__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:564:1: ( ( ruleName ) | ( ruleIdentifier ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQualityEffectSpecification.g:565:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:565:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:566:3: ruleName
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
                    // InternalQualityEffectSpecification.g:571:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:571:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:572:3: ruleIdentifier
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


    // $ANTLR start "rule__Transformation__Alternatives"
    // InternalQualityEffectSpecification.g:581:1: rule__Transformation__Alternatives : ( ( ruleNQA ) | ( ruleReasoning ) );
    public final void rule__Transformation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:585:1: ( ( ruleNQA ) | ( ruleReasoning ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQualityEffectSpecification.g:586:2: ( ruleNQA )
                    {
                    // InternalQualityEffectSpecification.g:586:2: ( ruleNQA )
                    // InternalQualityEffectSpecification.g:587:3: ruleNQA
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
                    // InternalQualityEffectSpecification.g:592:2: ( ruleReasoning )
                    {
                    // InternalQualityEffectSpecification.g:592:2: ( ruleReasoning )
                    // InternalQualityEffectSpecification.g:593:3: ruleReasoning
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
    // InternalQualityEffectSpecification.g:602:1: rule__ComponentType__Alternatives : ( ( ( 'basic' ) ) | ( ( 'composite' ) ) );
    public final void rule__ComponentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:606:1: ( ( ( 'basic' ) ) | ( ( 'composite' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQualityEffectSpecification.g:607:2: ( ( 'basic' ) )
                    {
                    // InternalQualityEffectSpecification.g:607:2: ( ( 'basic' ) )
                    // InternalQualityEffectSpecification.g:608:3: ( 'basic' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:609:3: ( 'basic' )
                    // InternalQualityEffectSpecification.g:609:4: 'basic'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:613:2: ( ( 'composite' ) )
                    {
                    // InternalQualityEffectSpecification.g:613:2: ( ( 'composite' ) )
                    // InternalQualityEffectSpecification.g:614:3: ( 'composite' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:615:3: ( 'composite' )
                    // InternalQualityEffectSpecification.g:615:4: 'composite'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 

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
    // InternalQualityEffectSpecification.g:623:1: rule__RoleType__Alternatives : ( ( ( 'required' ) ) | ( ( 'provided' ) ) | ( ( 'component' ) ) | ( ( 'infrastructure' ) ) );
    public final void rule__RoleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:627:1: ( ( ( 'required' ) ) | ( ( 'provided' ) ) | ( ( 'component' ) ) | ( ( 'infrastructure' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQualityEffectSpecification.g:628:2: ( ( 'required' ) )
                    {
                    // InternalQualityEffectSpecification.g:628:2: ( ( 'required' ) )
                    // InternalQualityEffectSpecification.g:629:3: ( 'required' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:630:3: ( 'required' )
                    // InternalQualityEffectSpecification.g:630:4: 'required'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:634:2: ( ( 'provided' ) )
                    {
                    // InternalQualityEffectSpecification.g:634:2: ( ( 'provided' ) )
                    // InternalQualityEffectSpecification.g:635:3: ( 'provided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:636:3: ( 'provided' )
                    // InternalQualityEffectSpecification.g:636:4: 'provided'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:640:2: ( ( 'component' ) )
                    {
                    // InternalQualityEffectSpecification.g:640:2: ( ( 'component' ) )
                    // InternalQualityEffectSpecification.g:641:3: ( 'component' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENTEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:642:3: ( 'component' )
                    // InternalQualityEffectSpecification.g:642:4: 'component'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:646:2: ( ( 'infrastructure' ) )
                    {
                    // InternalQualityEffectSpecification.g:646:2: ( ( 'infrastructure' ) )
                    // InternalQualityEffectSpecification.g:647:3: ( 'infrastructure' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTUREEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:648:3: ( 'infrastructure' )
                    // InternalQualityEffectSpecification.g:648:4: 'infrastructure'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTUREEnumLiteralDeclaration_3()); 

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
    // InternalQualityEffectSpecification.g:656:1: rule__AssemblyType__Alternatives : ( ( ( 'required' ) ) | ( ( 'provided' ) ) | ( ( 'assembly' ) ) );
    public final void rule__AssemblyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:660:1: ( ( ( 'required' ) ) | ( ( 'provided' ) ) | ( ( 'assembly' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 17:
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
                    // InternalQualityEffectSpecification.g:661:2: ( ( 'required' ) )
                    {
                    // InternalQualityEffectSpecification.g:661:2: ( ( 'required' ) )
                    // InternalQualityEffectSpecification.g:662:3: ( 'required' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:663:3: ( 'required' )
                    // InternalQualityEffectSpecification.g:663:4: 'required'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:667:2: ( ( 'provided' ) )
                    {
                    // InternalQualityEffectSpecification.g:667:2: ( ( 'provided' ) )
                    // InternalQualityEffectSpecification.g:668:3: ( 'provided' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:669:3: ( 'provided' )
                    // InternalQualityEffectSpecification.g:669:4: 'provided'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:673:2: ( ( 'assembly' ) )
                    {
                    // InternalQualityEffectSpecification.g:673:2: ( ( 'assembly' ) )
                    // InternalQualityEffectSpecification.g:674:3: ( 'assembly' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getASSEMBLYEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:675:3: ( 'assembly' )
                    // InternalQualityEffectSpecification.g:675:4: 'assembly'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getASSEMBLYEnumLiteralDeclaration_2()); 

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalQualityEffectSpecification.g:683:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:687:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalQualityEffectSpecification.g:688:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalQualityEffectSpecification.g:695:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__ComponentsAssignment_0 ) ) ( ( rule__Model__ComponentsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:699:1: ( ( ( ( rule__Model__ComponentsAssignment_0 ) ) ( ( rule__Model__ComponentsAssignment_0 )* ) ) )
            // InternalQualityEffectSpecification.g:700:1: ( ( ( rule__Model__ComponentsAssignment_0 ) ) ( ( rule__Model__ComponentsAssignment_0 )* ) )
            {
            // InternalQualityEffectSpecification.g:700:1: ( ( ( rule__Model__ComponentsAssignment_0 ) ) ( ( rule__Model__ComponentsAssignment_0 )* ) )
            // InternalQualityEffectSpecification.g:701:2: ( ( rule__Model__ComponentsAssignment_0 ) ) ( ( rule__Model__ComponentsAssignment_0 )* )
            {
            // InternalQualityEffectSpecification.g:701:2: ( ( rule__Model__ComponentsAssignment_0 ) )
            // InternalQualityEffectSpecification.g:702:3: ( rule__Model__ComponentsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_0()); 
            // InternalQualityEffectSpecification.g:703:3: ( rule__Model__ComponentsAssignment_0 )
            // InternalQualityEffectSpecification.g:703:4: rule__Model__ComponentsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__Model__ComponentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getComponentsAssignment_0()); 

            }

            // InternalQualityEffectSpecification.g:706:2: ( ( rule__Model__ComponentsAssignment_0 )* )
            // InternalQualityEffectSpecification.g:707:3: ( rule__Model__ComponentsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment_0()); 
            // InternalQualityEffectSpecification.g:708:3: ( rule__Model__ComponentsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:708:4: rule__Model__ComponentsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ComponentsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getComponentsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalQualityEffectSpecification.g:717:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:721:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalQualityEffectSpecification.g:722:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalQualityEffectSpecification.g:729:1: rule__Model__Group__1__Impl : ( ':' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:733:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:734:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:734:1: ( ':' )
            // InternalQualityEffectSpecification.g:735:2: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalQualityEffectSpecification.g:744:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:748:1: ( rule__Model__Group__2__Impl )
            // InternalQualityEffectSpecification.g:749:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalQualityEffectSpecification.g:755:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__TransformationsAssignment_2 ) ) ( ( rule__Model__TransformationsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:759:1: ( ( ( ( rule__Model__TransformationsAssignment_2 ) ) ( ( rule__Model__TransformationsAssignment_2 )* ) ) )
            // InternalQualityEffectSpecification.g:760:1: ( ( ( rule__Model__TransformationsAssignment_2 ) ) ( ( rule__Model__TransformationsAssignment_2 )* ) )
            {
            // InternalQualityEffectSpecification.g:760:1: ( ( ( rule__Model__TransformationsAssignment_2 ) ) ( ( rule__Model__TransformationsAssignment_2 )* ) )
            // InternalQualityEffectSpecification.g:761:2: ( ( rule__Model__TransformationsAssignment_2 ) ) ( ( rule__Model__TransformationsAssignment_2 )* )
            {
            // InternalQualityEffectSpecification.g:761:2: ( ( rule__Model__TransformationsAssignment_2 ) )
            // InternalQualityEffectSpecification.g:762:3: ( rule__Model__TransformationsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getTransformationsAssignment_2()); 
            // InternalQualityEffectSpecification.g:763:3: ( rule__Model__TransformationsAssignment_2 )
            // InternalQualityEffectSpecification.g:763:4: rule__Model__TransformationsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Model__TransformationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTransformationsAssignment_2()); 

            }

            // InternalQualityEffectSpecification.g:766:2: ( ( rule__Model__TransformationsAssignment_2 )* )
            // InternalQualityEffectSpecification.g:767:3: ( rule__Model__TransformationsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getTransformationsAssignment_2()); 
            // InternalQualityEffectSpecification.g:768:3: ( rule__Model__TransformationsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27||LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:768:4: rule__Model__TransformationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__TransformationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTransformationsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalQualityEffectSpecification.g:778:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:782:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalQualityEffectSpecification.g:783:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalQualityEffectSpecification.g:790:1: rule__Component__Group__0__Impl : ( 'Component(' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:794:1: ( ( 'Component(' ) )
            // InternalQualityEffectSpecification.g:795:1: ( 'Component(' )
            {
            // InternalQualityEffectSpecification.g:795:1: ( 'Component(' )
            // InternalQualityEffectSpecification.g:796:2: 'Component('
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:805:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:809:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalQualityEffectSpecification.g:810:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalQualityEffectSpecification.g:817:1: rule__Component__Group__1__Impl : ( ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:821:1: ( ( ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:822:1: ( ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:822:1: ( ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:823:2: ( ( rule__Component__PropertiesAssignment_1 ) ) ( ( rule__Component__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:823:2: ( ( rule__Component__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:824:3: ( rule__Component__PropertiesAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:825:3: ( rule__Component__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:825:4: rule__Component__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_9);
            rule__Component__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:828:2: ( ( rule__Component__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:829:3: ( rule__Component__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:830:3: ( rule__Component__PropertiesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:830:4: rule__Component__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalQualityEffectSpecification.g:839:1: rule__Component__Group__2 : rule__Component__Group__2__Impl ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:843:1: ( rule__Component__Group__2__Impl )
            // InternalQualityEffectSpecification.g:844:2: rule__Component__Group__2__Impl
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
    // InternalQualityEffectSpecification.g:850:1: rule__Component__Group__2__Impl : ( ')' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:854:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:855:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:855:1: ( ')' )
            // InternalQualityEffectSpecification.g:856:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__Negation__Group__0"
    // InternalQualityEffectSpecification.g:866:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:870:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // InternalQualityEffectSpecification.g:871:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__1();

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
    // $ANTLR end "rule__Negation__Group__0"


    // $ANTLR start "rule__Negation__Group__0__Impl"
    // InternalQualityEffectSpecification.g:878:1: rule__Negation__Group__0__Impl : ( 'Not(' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:882:1: ( ( 'Not(' ) )
            // InternalQualityEffectSpecification.g:883:1: ( 'Not(' )
            {
            // InternalQualityEffectSpecification.g:883:1: ( 'Not(' )
            // InternalQualityEffectSpecification.g:884:2: 'Not('
            {
             before(grammarAccess.getNegationAccess().getNotKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0__Impl"


    // $ANTLR start "rule__Negation__Group__1"
    // InternalQualityEffectSpecification.g:893:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl rule__Negation__Group__2 ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:897:1: ( rule__Negation__Group__1__Impl rule__Negation__Group__2 )
            // InternalQualityEffectSpecification.g:898:2: rule__Negation__Group__1__Impl rule__Negation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Negation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__2();

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
    // $ANTLR end "rule__Negation__Group__1"


    // $ANTLR start "rule__Negation__Group__1__Impl"
    // InternalQualityEffectSpecification.g:905:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__PropertieAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:909:1: ( ( ( rule__Negation__PropertieAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:910:1: ( ( rule__Negation__PropertieAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:910:1: ( ( rule__Negation__PropertieAssignment_1 ) )
            // InternalQualityEffectSpecification.g:911:2: ( rule__Negation__PropertieAssignment_1 )
            {
             before(grammarAccess.getNegationAccess().getPropertieAssignment_1()); 
            // InternalQualityEffectSpecification.g:912:2: ( rule__Negation__PropertieAssignment_1 )
            // InternalQualityEffectSpecification.g:912:3: rule__Negation__PropertieAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Negation__PropertieAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getPropertieAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1__Impl"


    // $ANTLR start "rule__Negation__Group__2"
    // InternalQualityEffectSpecification.g:920:1: rule__Negation__Group__2 : rule__Negation__Group__2__Impl ;
    public final void rule__Negation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:924:1: ( rule__Negation__Group__2__Impl )
            // InternalQualityEffectSpecification.g:925:2: rule__Negation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__2__Impl();

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
    // $ANTLR end "rule__Negation__Group__2"


    // $ANTLR start "rule__Negation__Group__2__Impl"
    // InternalQualityEffectSpecification.g:931:1: rule__Negation__Group__2__Impl : ( ')' ) ;
    public final void rule__Negation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:935:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:936:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:936:1: ( ')' )
            // InternalQualityEffectSpecification.g:937:2: ')'
            {
             before(grammarAccess.getNegationAccess().getRightParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__2__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalQualityEffectSpecification.g:947:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:951:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalQualityEffectSpecification.g:952:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQualityEffectSpecification.g:959:1: rule__Name__Group__0__Impl : ( 'Name(' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:963:1: ( ( 'Name(' ) )
            // InternalQualityEffectSpecification.g:964:1: ( 'Name(' )
            {
            // InternalQualityEffectSpecification.g:964:1: ( 'Name(' )
            // InternalQualityEffectSpecification.g:965:2: 'Name('
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:974:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:978:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalQualityEffectSpecification.g:979:2: rule__Name__Group__1__Impl rule__Name__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalQualityEffectSpecification.g:986:1: rule__Name__Group__1__Impl : ( ( rule__Name__NameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:990:1: ( ( ( rule__Name__NameAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:991:1: ( ( rule__Name__NameAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:991:1: ( ( rule__Name__NameAssignment_1 ) )
            // InternalQualityEffectSpecification.g:992:2: ( rule__Name__NameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1()); 
            // InternalQualityEffectSpecification.g:993:2: ( rule__Name__NameAssignment_1 )
            // InternalQualityEffectSpecification.g:993:3: rule__Name__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Name__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1001:1: rule__Name__Group__2 : rule__Name__Group__2__Impl ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1005:1: ( rule__Name__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1006:2: rule__Name__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__2__Impl();

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
    // InternalQualityEffectSpecification.g:1012:1: rule__Name__Group__2__Impl : ( ')' ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1016:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1017:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1017:1: ( ')' )
            // InternalQualityEffectSpecification.g:1018:2: ')'
            {
             before(grammarAccess.getNameAccess().getRightParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Identifier__Group__0"
    // InternalQualityEffectSpecification.g:1028:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1032:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalQualityEffectSpecification.g:1033:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQualityEffectSpecification.g:1040:1: rule__Identifier__Group__0__Impl : ( 'Id(' ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1044:1: ( ( 'Id(' ) )
            // InternalQualityEffectSpecification.g:1045:1: ( 'Id(' )
            {
            // InternalQualityEffectSpecification.g:1045:1: ( 'Id(' )
            // InternalQualityEffectSpecification.g:1046:2: 'Id('
            {
             before(grammarAccess.getIdentifierAccess().getIdKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1055:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1059:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // InternalQualityEffectSpecification.g:1060:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalQualityEffectSpecification.g:1067:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__IdAssignment_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1071:1: ( ( ( rule__Identifier__IdAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1072:1: ( ( rule__Identifier__IdAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1072:1: ( ( rule__Identifier__IdAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1073:2: ( rule__Identifier__IdAssignment_1 )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment_1()); 
            // InternalQualityEffectSpecification.g:1074:2: ( rule__Identifier__IdAssignment_1 )
            // InternalQualityEffectSpecification.g:1074:3: rule__Identifier__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getIdAssignment_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1082:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1086:1: ( rule__Identifier__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1087:2: rule__Identifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__2__Impl();

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
    // InternalQualityEffectSpecification.g:1093:1: rule__Identifier__Group__2__Impl : ( ')' ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1097:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1098:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1098:1: ( ')' )
            // InternalQualityEffectSpecification.g:1099:2: ')'
            {
             before(grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Type__Group__0"
    // InternalQualityEffectSpecification.g:1109:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1113:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalQualityEffectSpecification.g:1114:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQualityEffectSpecification.g:1121:1: rule__Type__Group__0__Impl : ( 'Type(' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1125:1: ( ( 'Type(' ) )
            // InternalQualityEffectSpecification.g:1126:1: ( 'Type(' )
            {
            // InternalQualityEffectSpecification.g:1126:1: ( 'Type(' )
            // InternalQualityEffectSpecification.g:1127:2: 'Type('
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1136:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1140:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalQualityEffectSpecification.g:1141:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalQualityEffectSpecification.g:1148:1: rule__Type__Group__1__Impl : ( ( rule__Type__TypeAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1152:1: ( ( ( rule__Type__TypeAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1153:1: ( ( rule__Type__TypeAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1153:1: ( ( rule__Type__TypeAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1154:2: ( rule__Type__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_1()); 
            // InternalQualityEffectSpecification.g:1155:2: ( rule__Type__TypeAssignment_1 )
            // InternalQualityEffectSpecification.g:1155:3: rule__Type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1163:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1167:1: ( rule__Type__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1168:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

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
    // InternalQualityEffectSpecification.g:1174:1: rule__Type__Group__2__Impl : ( ')' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1178:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1179:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1179:1: ( ')' )
            // InternalQualityEffectSpecification.g:1180:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Role__Group__0"
    // InternalQualityEffectSpecification.g:1190:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1194:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalQualityEffectSpecification.g:1195:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:1202:1: rule__Role__Group__0__Impl : ( 'Role(' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1206:1: ( ( 'Role(' ) )
            // InternalQualityEffectSpecification.g:1207:1: ( 'Role(' )
            {
            // InternalQualityEffectSpecification.g:1207:1: ( 'Role(' )
            // InternalQualityEffectSpecification.g:1208:2: 'Role('
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1217:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1221:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalQualityEffectSpecification.g:1222:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalQualityEffectSpecification.g:1229:1: rule__Role__Group__1__Impl : ( ( ( rule__Role__TypesAssignment_1 ) ) ( ( rule__Role__TypesAssignment_1 )* ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1233:1: ( ( ( ( rule__Role__TypesAssignment_1 ) ) ( ( rule__Role__TypesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1234:1: ( ( ( rule__Role__TypesAssignment_1 ) ) ( ( rule__Role__TypesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1234:1: ( ( ( rule__Role__TypesAssignment_1 ) ) ( ( rule__Role__TypesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1235:2: ( ( rule__Role__TypesAssignment_1 ) ) ( ( rule__Role__TypesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1235:2: ( ( rule__Role__TypesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1236:3: ( rule__Role__TypesAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getTypesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1237:3: ( rule__Role__TypesAssignment_1 )
            // InternalQualityEffectSpecification.g:1237:4: rule__Role__TypesAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__Role__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getTypesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1240:2: ( ( rule__Role__TypesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1241:3: ( rule__Role__TypesAssignment_1 )*
            {
             before(grammarAccess.getRoleAccess().getTypesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1242:3: ( rule__Role__TypesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=16)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1242:4: rule__Role__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Role__TypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getTypesAssignment_1()); 

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
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalQualityEffectSpecification.g:1251:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1255:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalQualityEffectSpecification.g:1256:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalQualityEffectSpecification.g:1263:1: rule__Role__Group__2__Impl : ( ( ( rule__Role__PropertiesAssignment_2 ) ) ( ( rule__Role__PropertiesAssignment_2 )* ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1267:1: ( ( ( ( rule__Role__PropertiesAssignment_2 ) ) ( ( rule__Role__PropertiesAssignment_2 )* ) ) )
            // InternalQualityEffectSpecification.g:1268:1: ( ( ( rule__Role__PropertiesAssignment_2 ) ) ( ( rule__Role__PropertiesAssignment_2 )* ) )
            {
            // InternalQualityEffectSpecification.g:1268:1: ( ( ( rule__Role__PropertiesAssignment_2 ) ) ( ( rule__Role__PropertiesAssignment_2 )* ) )
            // InternalQualityEffectSpecification.g:1269:2: ( ( rule__Role__PropertiesAssignment_2 ) ) ( ( rule__Role__PropertiesAssignment_2 )* )
            {
            // InternalQualityEffectSpecification.g:1269:2: ( ( rule__Role__PropertiesAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1270:3: ( rule__Role__PropertiesAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_2()); 
            // InternalQualityEffectSpecification.g:1271:3: ( rule__Role__PropertiesAssignment_2 )
            // InternalQualityEffectSpecification.g:1271:4: rule__Role__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__Role__PropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_2()); 

            }

            // InternalQualityEffectSpecification.g:1274:2: ( ( rule__Role__PropertiesAssignment_2 )* )
            // InternalQualityEffectSpecification.g:1275:3: ( rule__Role__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_2()); 
            // InternalQualityEffectSpecification.g:1276:3: ( rule__Role__PropertiesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=22 && LA12_0<=23)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1276:4: rule__Role__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Role__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_2()); 

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
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalQualityEffectSpecification.g:1285:1: rule__Role__Group__3 : rule__Role__Group__3__Impl ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1289:1: ( rule__Role__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1290:2: rule__Role__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__3__Impl();

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
    // InternalQualityEffectSpecification.g:1296:1: rule__Role__Group__3__Impl : ( ')' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1300:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1301:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1301:1: ( ')' )
            // InternalQualityEffectSpecification.g:1302:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Assembly__Group__0"
    // InternalQualityEffectSpecification.g:1312:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1316:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalQualityEffectSpecification.g:1317:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalQualityEffectSpecification.g:1324:1: rule__Assembly__Group__0__Impl : ( 'Assembly(' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1328:1: ( ( 'Assembly(' ) )
            // InternalQualityEffectSpecification.g:1329:1: ( 'Assembly(' )
            {
            // InternalQualityEffectSpecification.g:1329:1: ( 'Assembly(' )
            // InternalQualityEffectSpecification.g:1330:2: 'Assembly('
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1339:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1343:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalQualityEffectSpecification.g:1344:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalQualityEffectSpecification.g:1351:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__AssemblyTypeAssignment_1 ) ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1355:1: ( ( ( rule__Assembly__AssemblyTypeAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1356:1: ( ( rule__Assembly__AssemblyTypeAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1356:1: ( ( rule__Assembly__AssemblyTypeAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1357:2: ( rule__Assembly__AssemblyTypeAssignment_1 )
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyTypeAssignment_1()); 
            // InternalQualityEffectSpecification.g:1358:2: ( rule__Assembly__AssemblyTypeAssignment_1 )
            // InternalQualityEffectSpecification.g:1358:3: rule__Assembly__AssemblyTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__AssemblyTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getAssemblyTypeAssignment_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1366:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1370:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalQualityEffectSpecification.g:1371:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalQualityEffectSpecification.g:1378:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__AssemblyComponentAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1382:1: ( ( ( rule__Assembly__AssemblyComponentAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1383:1: ( ( rule__Assembly__AssemblyComponentAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1383:1: ( ( rule__Assembly__AssemblyComponentAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1384:2: ( rule__Assembly__AssemblyComponentAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyComponentAssignment_2()); 
            // InternalQualityEffectSpecification.g:1385:2: ( rule__Assembly__AssemblyComponentAssignment_2 )
            // InternalQualityEffectSpecification.g:1385:3: rule__Assembly__AssemblyComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__AssemblyComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getAssemblyComponentAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1393:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1397:1: ( rule__Assembly__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1398:2: rule__Assembly__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__3__Impl();

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
    // InternalQualityEffectSpecification.g:1404:1: rule__Assembly__Group__3__Impl : ( ')' ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1408:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1409:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1409:1: ( ')' )
            // InternalQualityEffectSpecification.g:1410:2: ')'
            {
             before(grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__NQA__Group__0"
    // InternalQualityEffectSpecification.g:1420:1: rule__NQA__Group__0 : rule__NQA__Group__0__Impl rule__NQA__Group__1 ;
    public final void rule__NQA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1424:1: ( rule__NQA__Group__0__Impl rule__NQA__Group__1 )
            // InternalQualityEffectSpecification.g:1425:2: rule__NQA__Group__0__Impl rule__NQA__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQualityEffectSpecification.g:1432:1: rule__NQA__Group__0__Impl : ( 'NQA(' ) ;
    public final void rule__NQA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1436:1: ( ( 'NQA(' ) )
            // InternalQualityEffectSpecification.g:1437:1: ( 'NQA(' )
            {
            // InternalQualityEffectSpecification.g:1437:1: ( 'NQA(' )
            // InternalQualityEffectSpecification.g:1438:2: 'NQA('
            {
             before(grammarAccess.getNQAAccess().getNQAKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1447:1: rule__NQA__Group__1 : rule__NQA__Group__1__Impl rule__NQA__Group__2 ;
    public final void rule__NQA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1451:1: ( rule__NQA__Group__1__Impl rule__NQA__Group__2 )
            // InternalQualityEffectSpecification.g:1452:2: rule__NQA__Group__1__Impl rule__NQA__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalQualityEffectSpecification.g:1459:1: rule__NQA__Group__1__Impl : ( ( rule__NQA__QualityAssignment_1 ) ) ;
    public final void rule__NQA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1463:1: ( ( ( rule__NQA__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1464:1: ( ( rule__NQA__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1464:1: ( ( rule__NQA__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1465:2: ( rule__NQA__QualityAssignment_1 )
            {
             before(grammarAccess.getNQAAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:1466:2: ( rule__NQA__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:1466:3: rule__NQA__QualityAssignment_1
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
    // InternalQualityEffectSpecification.g:1474:1: rule__NQA__Group__2 : rule__NQA__Group__2__Impl rule__NQA__Group__3 ;
    public final void rule__NQA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1478:1: ( rule__NQA__Group__2__Impl rule__NQA__Group__3 )
            // InternalQualityEffectSpecification.g:1479:2: rule__NQA__Group__2__Impl rule__NQA__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalQualityEffectSpecification.g:1486:1: rule__NQA__Group__2__Impl : ( '=' ) ;
    public final void rule__NQA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1490:1: ( ( '=' ) )
            // InternalQualityEffectSpecification.g:1491:1: ( '=' )
            {
            // InternalQualityEffectSpecification.g:1491:1: ( '=' )
            // InternalQualityEffectSpecification.g:1492:2: '='
            {
             before(grammarAccess.getNQAAccess().getEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1501:1: rule__NQA__Group__3 : rule__NQA__Group__3__Impl rule__NQA__Group__4 ;
    public final void rule__NQA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1505:1: ( rule__NQA__Group__3__Impl rule__NQA__Group__4 )
            // InternalQualityEffectSpecification.g:1506:2: rule__NQA__Group__3__Impl rule__NQA__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalQualityEffectSpecification.g:1513:1: rule__NQA__Group__3__Impl : ( ( rule__NQA__ElementAssignment_3 ) ) ;
    public final void rule__NQA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1517:1: ( ( ( rule__NQA__ElementAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:1518:1: ( ( rule__NQA__ElementAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:1518:1: ( ( rule__NQA__ElementAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1519:2: ( rule__NQA__ElementAssignment_3 )
            {
             before(grammarAccess.getNQAAccess().getElementAssignment_3()); 
            // InternalQualityEffectSpecification.g:1520:2: ( rule__NQA__ElementAssignment_3 )
            // InternalQualityEffectSpecification.g:1520:3: rule__NQA__ElementAssignment_3
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
    // InternalQualityEffectSpecification.g:1528:1: rule__NQA__Group__4 : rule__NQA__Group__4__Impl ;
    public final void rule__NQA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1532:1: ( rule__NQA__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1533:2: rule__NQA__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1539:1: rule__NQA__Group__4__Impl : ( ')' ) ;
    public final void rule__NQA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1543:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1544:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1544:1: ( ')' )
            // InternalQualityEffectSpecification.g:1545:2: ')'
            {
             before(grammarAccess.getNQAAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1555:1: rule__Reasoning__Group__0 : rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 ;
    public final void rule__Reasoning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1559:1: ( rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 )
            // InternalQualityEffectSpecification.g:1560:2: rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQualityEffectSpecification.g:1567:1: rule__Reasoning__Group__0__Impl : ( 'Reasoning(' ) ;
    public final void rule__Reasoning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1571:1: ( ( 'Reasoning(' ) )
            // InternalQualityEffectSpecification.g:1572:1: ( 'Reasoning(' )
            {
            // InternalQualityEffectSpecification.g:1572:1: ( 'Reasoning(' )
            // InternalQualityEffectSpecification.g:1573:2: 'Reasoning('
            {
             before(grammarAccess.getReasoningAccess().getReasoningKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1582:1: rule__Reasoning__Group__1 : rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 ;
    public final void rule__Reasoning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1586:1: ( rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 )
            // InternalQualityEffectSpecification.g:1587:2: rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalQualityEffectSpecification.g:1594:1: rule__Reasoning__Group__1__Impl : ( ( rule__Reasoning__QualityAssignment_1 ) ) ;
    public final void rule__Reasoning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1598:1: ( ( ( rule__Reasoning__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1599:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1599:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1600:2: ( rule__Reasoning__QualityAssignment_1 )
            {
             before(grammarAccess.getReasoningAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:1601:2: ( rule__Reasoning__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:1601:3: rule__Reasoning__QualityAssignment_1
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
    // InternalQualityEffectSpecification.g:1609:1: rule__Reasoning__Group__2 : rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 ;
    public final void rule__Reasoning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1613:1: ( rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 )
            // InternalQualityEffectSpecification.g:1614:2: rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalQualityEffectSpecification.g:1621:1: rule__Reasoning__Group__2__Impl : ( '{' ) ;
    public final void rule__Reasoning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1625:1: ( ( '{' ) )
            // InternalQualityEffectSpecification.g:1626:1: ( '{' )
            {
            // InternalQualityEffectSpecification.g:1626:1: ( '{' )
            // InternalQualityEffectSpecification.g:1627:2: '{'
            {
             before(grammarAccess.getReasoningAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1636:1: rule__Reasoning__Group__3 : rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 ;
    public final void rule__Reasoning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1640:1: ( rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 )
            // InternalQualityEffectSpecification.g:1641:2: rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalQualityEffectSpecification.g:1648:1: rule__Reasoning__Group__3__Impl : ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) ;
    public final void rule__Reasoning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1652:1: ( ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1653:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1653:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1654:2: ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1654:2: ( ( rule__Reasoning__RulesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1655:3: ( rule__Reasoning__RulesAssignment_3 )
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1656:3: ( rule__Reasoning__RulesAssignment_3 )
            // InternalQualityEffectSpecification.g:1656:4: rule__Reasoning__RulesAssignment_3
            {
            pushFollow(FOLLOW_22);
            rule__Reasoning__RulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1659:2: ( ( rule__Reasoning__RulesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1660:3: ( rule__Reasoning__RulesAssignment_3 )*
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1661:3: ( rule__Reasoning__RulesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1661:4: rule__Reasoning__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Reasoning__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalQualityEffectSpecification.g:1670:1: rule__Reasoning__Group__4 : rule__Reasoning__Group__4__Impl ;
    public final void rule__Reasoning__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1674:1: ( rule__Reasoning__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1675:2: rule__Reasoning__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1681:1: rule__Reasoning__Group__4__Impl : ( '})' ) ;
    public final void rule__Reasoning__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1685:1: ( ( '})' ) )
            // InternalQualityEffectSpecification.g:1686:1: ( '})' )
            {
            // InternalQualityEffectSpecification.g:1686:1: ( '})' )
            // InternalQualityEffectSpecification.g:1687:2: '})'
            {
             before(grammarAccess.getReasoningAccess().getRightCurlyBracketRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getRightCurlyBracketRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1697:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1701:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalQualityEffectSpecification.g:1702:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQualityEffectSpecification.g:1709:1: rule__Rule__Group__0__Impl : ( '(' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1713:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:1714:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:1714:1: ( '(' )
            // InternalQualityEffectSpecification.g:1715:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1724:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1728:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalQualityEffectSpecification.g:1729:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalQualityEffectSpecification.g:1736:1: rule__Rule__Group__1__Impl : ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1740:1: ( ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1741:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1741:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1742:2: ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1742:2: ( ( rule__Rule__QualitiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1743:3: ( rule__Rule__QualitiesAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1744:3: ( rule__Rule__QualitiesAssignment_1 )
            // InternalQualityEffectSpecification.g:1744:4: rule__Rule__QualitiesAssignment_1
            {
            pushFollow(FOLLOW_23);
            rule__Rule__QualitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1747:2: ( ( rule__Rule__QualitiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1748:3: ( rule__Rule__QualitiesAssignment_1 )*
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1749:3: ( rule__Rule__QualitiesAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1749:4: rule__Rule__QualitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Rule__QualitiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalQualityEffectSpecification.g:1758:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1762:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalQualityEffectSpecification.g:1763:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalQualityEffectSpecification.g:1770:1: rule__Rule__Group__2__Impl : ( '=' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1774:1: ( ( '=' ) )
            // InternalQualityEffectSpecification.g:1775:1: ( '=' )
            {
            // InternalQualityEffectSpecification.g:1775:1: ( '=' )
            // InternalQualityEffectSpecification.g:1776:2: '='
            {
             before(grammarAccess.getRuleAccess().getEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1785:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1789:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalQualityEffectSpecification.g:1790:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalQualityEffectSpecification.g:1797:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__EntriesAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1801:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:1802:1: ( ( rule__Rule__EntriesAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:1802:1: ( ( rule__Rule__EntriesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1803:2: ( rule__Rule__EntriesAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1804:2: ( rule__Rule__EntriesAssignment_3 )
            // InternalQualityEffectSpecification.g:1804:3: rule__Rule__EntriesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__EntriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1812:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1816:1: ( rule__Rule__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1817:2: rule__Rule__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1823:1: rule__Rule__Group__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1827:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1828:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1828:1: ( ')' )
            // InternalQualityEffectSpecification.g:1829:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1839:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1843:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalQualityEffectSpecification.g:1844:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQualityEffectSpecification.g:1851:1: rule__Entry__Group__0__Impl : ( '[' ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1855:1: ( ( '[' ) )
            // InternalQualityEffectSpecification.g:1856:1: ( '[' )
            {
            // InternalQualityEffectSpecification.g:1856:1: ( '[' )
            // InternalQualityEffectSpecification.g:1857:2: '['
            {
             before(grammarAccess.getEntryAccess().getLeftSquareBracketKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1866:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1870:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalQualityEffectSpecification.g:1871:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalQualityEffectSpecification.g:1878:1: rule__Entry__Group__1__Impl : ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1882:1: ( ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1883:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1883:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1884:2: ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1884:2: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1885:3: ( rule__Entry__KeyAssignment_1 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:1886:3: ( rule__Entry__KeyAssignment_1 )
            // InternalQualityEffectSpecification.g:1886:4: rule__Entry__KeyAssignment_1
            {
            pushFollow(FOLLOW_23);
            rule__Entry__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getKeyAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1889:2: ( ( rule__Entry__KeyAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1890:3: ( rule__Entry__KeyAssignment_1 )*
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:1891:3: ( rule__Entry__KeyAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1891:4: rule__Entry__KeyAssignment_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Entry__KeyAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalQualityEffectSpecification.g:1900:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1904:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalQualityEffectSpecification.g:1905:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalQualityEffectSpecification.g:1912:1: rule__Entry__Group__2__Impl : ( '=' ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1916:1: ( ( '=' ) )
            // InternalQualityEffectSpecification.g:1917:1: ( '=' )
            {
            // InternalQualityEffectSpecification.g:1917:1: ( '=' )
            // InternalQualityEffectSpecification.g:1918:2: '='
            {
             before(grammarAccess.getEntryAccess().getEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1927:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1931:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalQualityEffectSpecification.g:1932:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalQualityEffectSpecification.g:1939:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__ValueAssignment_3 ) ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1943:1: ( ( ( rule__Entry__ValueAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:1944:1: ( ( rule__Entry__ValueAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:1944:1: ( ( rule__Entry__ValueAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1945:2: ( rule__Entry__ValueAssignment_3 )
            {
             before(grammarAccess.getEntryAccess().getValueAssignment_3()); 
            // InternalQualityEffectSpecification.g:1946:2: ( rule__Entry__ValueAssignment_3 )
            // InternalQualityEffectSpecification.g:1946:3: rule__Entry__ValueAssignment_3
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
    // InternalQualityEffectSpecification.g:1954:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1958:1: ( rule__Entry__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1959:2: rule__Entry__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1965:1: rule__Entry__Group__4__Impl : ( ']' ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1969:1: ( ( ']' ) )
            // InternalQualityEffectSpecification.g:1970:1: ( ']' )
            {
            // InternalQualityEffectSpecification.g:1970:1: ( ']' )
            // InternalQualityEffectSpecification.g:1971:2: ']'
            {
             before(grammarAccess.getEntryAccess().getRightSquareBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__ComponentsAssignment_0"
    // InternalQualityEffectSpecification.g:1981:1: rule__Model__ComponentsAssignment_0 : ( ruleComponent ) ;
    public final void rule__Model__ComponentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1985:1: ( ( ruleComponent ) )
            // InternalQualityEffectSpecification.g:1986:2: ( ruleComponent )
            {
            // InternalQualityEffectSpecification.g:1986:2: ( ruleComponent )
            // InternalQualityEffectSpecification.g:1987:3: ruleComponent
            {
             before(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ComponentsAssignment_0"


    // $ANTLR start "rule__Model__TransformationsAssignment_2"
    // InternalQualityEffectSpecification.g:1996:1: rule__Model__TransformationsAssignment_2 : ( ruleTransformation ) ;
    public final void rule__Model__TransformationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2000:1: ( ( ruleTransformation ) )
            // InternalQualityEffectSpecification.g:2001:2: ( ruleTransformation )
            {
            // InternalQualityEffectSpecification.g:2001:2: ( ruleTransformation )
            // InternalQualityEffectSpecification.g:2002:3: ruleTransformation
            {
             before(grammarAccess.getModelAccess().getTransformationsTransformationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTransformationsTransformationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TransformationsAssignment_2"


    // $ANTLR start "rule__Component__PropertiesAssignment_1"
    // InternalQualityEffectSpecification.g:2011:1: rule__Component__PropertiesAssignment_1 : ( rulePropertie ) ;
    public final void rule__Component__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2015:1: ( ( rulePropertie ) )
            // InternalQualityEffectSpecification.g:2016:2: ( rulePropertie )
            {
            // InternalQualityEffectSpecification.g:2016:2: ( rulePropertie )
            // InternalQualityEffectSpecification.g:2017:3: rulePropertie
            {
             before(grammarAccess.getComponentAccess().getPropertiesPropertieParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertie();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPropertiesPropertieParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Negation__PropertieAssignment_1"
    // InternalQualityEffectSpecification.g:2026:1: rule__Negation__PropertieAssignment_1 : ( ruleComponentPropertie ) ;
    public final void rule__Negation__PropertieAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2030:1: ( ( ruleComponentPropertie ) )
            // InternalQualityEffectSpecification.g:2031:2: ( ruleComponentPropertie )
            {
            // InternalQualityEffectSpecification.g:2031:2: ( ruleComponentPropertie )
            // InternalQualityEffectSpecification.g:2032:3: ruleComponentPropertie
            {
             before(grammarAccess.getNegationAccess().getPropertieComponentPropertieParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPropertie();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getPropertieComponentPropertieParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__PropertieAssignment_1"


    // $ANTLR start "rule__Name__NameAssignment_1"
    // InternalQualityEffectSpecification.g:2041:1: rule__Name__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2045:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2046:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2046:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2047:3: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__NameAssignment_1"


    // $ANTLR start "rule__Identifier__IdAssignment_1"
    // InternalQualityEffectSpecification.g:2056:1: rule__Identifier__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Identifier__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2060:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2061:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2061:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2062:3: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__IdAssignment_1"


    // $ANTLR start "rule__Type__TypeAssignment_1"
    // InternalQualityEffectSpecification.g:2071:1: rule__Type__TypeAssignment_1 : ( ruleComponentType ) ;
    public final void rule__Type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2075:1: ( ( ruleComponentType ) )
            // InternalQualityEffectSpecification.g:2076:2: ( ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:2076:2: ( ruleComponentType )
            // InternalQualityEffectSpecification.g:2077:3: ruleComponentType
            {
             before(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_1"


    // $ANTLR start "rule__Role__TypesAssignment_1"
    // InternalQualityEffectSpecification.g:2086:1: rule__Role__TypesAssignment_1 : ( ruleRoleType ) ;
    public final void rule__Role__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2090:1: ( ( ruleRoleType ) )
            // InternalQualityEffectSpecification.g:2091:2: ( ruleRoleType )
            {
            // InternalQualityEffectSpecification.g:2091:2: ( ruleRoleType )
            // InternalQualityEffectSpecification.g:2092:3: ruleRoleType
            {
             before(grammarAccess.getRoleAccess().getTypesRoleTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleType();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getTypesRoleTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__TypesAssignment_1"


    // $ANTLR start "rule__Role__PropertiesAssignment_2"
    // InternalQualityEffectSpecification.g:2101:1: rule__Role__PropertiesAssignment_2 : ( ruleRolePropertie ) ;
    public final void rule__Role__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2105:1: ( ( ruleRolePropertie ) )
            // InternalQualityEffectSpecification.g:2106:2: ( ruleRolePropertie )
            {
            // InternalQualityEffectSpecification.g:2106:2: ( ruleRolePropertie )
            // InternalQualityEffectSpecification.g:2107:3: ruleRolePropertie
            {
             before(grammarAccess.getRoleAccess().getPropertiesRolePropertieParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRolePropertie();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPropertiesRolePropertieParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__PropertiesAssignment_2"


    // $ANTLR start "rule__Assembly__AssemblyTypeAssignment_1"
    // InternalQualityEffectSpecification.g:2116:1: rule__Assembly__AssemblyTypeAssignment_1 : ( ruleAssemblyType ) ;
    public final void rule__Assembly__AssemblyTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2120:1: ( ( ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:2121:2: ( ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:2121:2: ( ruleAssemblyType )
            // InternalQualityEffectSpecification.g:2122:3: ruleAssemblyType
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyTypeAssemblyTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyType();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getAssemblyTypeAssemblyTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__AssemblyTypeAssignment_1"


    // $ANTLR start "rule__Assembly__AssemblyComponentAssignment_2"
    // InternalQualityEffectSpecification.g:2131:1: rule__Assembly__AssemblyComponentAssignment_2 : ( ruleComponent ) ;
    public final void rule__Assembly__AssemblyComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2135:1: ( ( ruleComponent ) )
            // InternalQualityEffectSpecification.g:2136:2: ( ruleComponent )
            {
            // InternalQualityEffectSpecification.g:2136:2: ( ruleComponent )
            // InternalQualityEffectSpecification.g:2137:3: ruleComponent
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyComponentComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getAssemblyComponentComponentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__AssemblyComponentAssignment_2"


    // $ANTLR start "rule__NQA__QualityAssignment_1"
    // InternalQualityEffectSpecification.g:2146:1: rule__NQA__QualityAssignment_1 : ( RULE_ID ) ;
    public final void rule__NQA__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2150:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2151:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2151:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2152:3: RULE_ID
            {
             before(grammarAccess.getNQAAccess().getQualityIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getQualityIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2161:1: rule__NQA__ElementAssignment_3 : ( RULE_ID ) ;
    public final void rule__NQA__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2165:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2166:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2166:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2167:3: RULE_ID
            {
             before(grammarAccess.getNQAAccess().getElementIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getElementIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2176:1: rule__Reasoning__QualityAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reasoning__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2180:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2181:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2181:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2182:3: RULE_ID
            {
             before(grammarAccess.getReasoningAccess().getQualityIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getQualityIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2191:1: rule__Reasoning__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Reasoning__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2195:1: ( ( ruleRule ) )
            // InternalQualityEffectSpecification.g:2196:2: ( ruleRule )
            {
            // InternalQualityEffectSpecification.g:2196:2: ( ruleRule )
            // InternalQualityEffectSpecification.g:2197:3: ruleRule
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
    // InternalQualityEffectSpecification.g:2206:1: rule__Rule__QualitiesAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__QualitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2210:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2211:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2211:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2212:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getQualitiesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQualitiesIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2221:1: rule__Rule__EntriesAssignment_3 : ( ruleEntry ) ;
    public final void rule__Rule__EntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2225:1: ( ( ruleEntry ) )
            // InternalQualityEffectSpecification.g:2226:2: ( ruleEntry )
            {
            // InternalQualityEffectSpecification.g:2226:2: ( ruleEntry )
            // InternalQualityEffectSpecification.g:2227:3: ruleEntry
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
    // InternalQualityEffectSpecification.g:2236:1: rule__Entry__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2240:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2241:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2241:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2242:3: RULE_ID
            {
             before(grammarAccess.getEntryAccess().getKeyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getKeyIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2251:1: rule__Entry__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entry__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2255:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2256:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2256:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2257:3: RULE_ID
            {
             before(grammarAccess.getEntryAccess().getValueIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getValueIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007E00002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});

}