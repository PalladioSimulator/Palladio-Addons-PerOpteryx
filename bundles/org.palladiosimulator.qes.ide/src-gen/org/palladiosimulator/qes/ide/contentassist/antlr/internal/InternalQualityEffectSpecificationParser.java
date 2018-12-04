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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_STRING", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyComponentType'", "'Basic'", "'Composite'", "'AnyRoleType'", "'ComponentRequiredProvided'", "'ComponentRequired'", "'ComponentProvided'", "'InfrastructureRequiredProvided'", "'InfrastructureRequired'", "'InfrastructureProvided'", "'AnyAssembly'", "'Required'", "'Provided'", "'='", "'+'", "'-'", "'*'", "'/'", "'For'", "'{'", "'}'", "'Do'", "'and'", "'Component'", "'('", "')'", "'Name'", "'Id'", "'Annotation'", "'Type'", "'Role'", "'with'", "'Assembly'", "'Resource'", "'NQA'", "'Reasoning'", "','", "'Rule'", "'Entry'", "'not'"
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


    // $ANTLR start "entryRuleQualityEffectSpecification"
    // InternalQualityEffectSpecification.g:78:1: entryRuleQualityEffectSpecification : ruleQualityEffectSpecification EOF ;
    public final void entryRuleQualityEffectSpecification() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:79:1: ( ruleQualityEffectSpecification EOF )
            // InternalQualityEffectSpecification.g:80:1: ruleQualityEffectSpecification EOF
            {
             before(grammarAccess.getQualityEffectSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleQualityEffectSpecification();

            state._fsp--;

             after(grammarAccess.getQualityEffectSpecificationRule()); 
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
    // $ANTLR end "entryRuleQualityEffectSpecification"


    // $ANTLR start "ruleQualityEffectSpecification"
    // InternalQualityEffectSpecification.g:87:1: ruleQualityEffectSpecification : ( ( rule__QualityEffectSpecification__Group__0 ) ) ;
    public final void ruleQualityEffectSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:91:2: ( ( ( rule__QualityEffectSpecification__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:92:2: ( ( rule__QualityEffectSpecification__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:92:2: ( ( rule__QualityEffectSpecification__Group__0 ) )
            // InternalQualityEffectSpecification.g:93:3: ( rule__QualityEffectSpecification__Group__0 )
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:94:3: ( rule__QualityEffectSpecification__Group__0 )
            // InternalQualityEffectSpecification.g:94:4: rule__QualityEffectSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualityEffectSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualityEffectSpecification"


    // $ANTLR start "entryRuleComponentSpecification"
    // InternalQualityEffectSpecification.g:103:1: entryRuleComponentSpecification : ruleComponentSpecification EOF ;
    public final void entryRuleComponentSpecification() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:104:1: ( ruleComponentSpecification EOF )
            // InternalQualityEffectSpecification.g:105:1: ruleComponentSpecification EOF
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
    // InternalQualityEffectSpecification.g:112:1: ruleComponentSpecification : ( ( rule__ComponentSpecification__Group__0 ) ) ;
    public final void ruleComponentSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:116:2: ( ( ( rule__ComponentSpecification__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:117:2: ( ( rule__ComponentSpecification__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:117:2: ( ( rule__ComponentSpecification__Group__0 ) )
            // InternalQualityEffectSpecification.g:118:3: ( rule__ComponentSpecification__Group__0 )
            {
             before(grammarAccess.getComponentSpecificationAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:119:3: ( rule__ComponentSpecification__Group__0 )
            // InternalQualityEffectSpecification.g:119:4: rule__ComponentSpecification__Group__0
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
    // InternalQualityEffectSpecification.g:128:1: entryRuleComponentProperty : ruleComponentProperty EOF ;
    public final void entryRuleComponentProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:129:1: ( ruleComponentProperty EOF )
            // InternalQualityEffectSpecification.g:130:1: ruleComponentProperty EOF
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
    // InternalQualityEffectSpecification.g:137:1: ruleComponentProperty : ( ( rule__ComponentProperty__Alternatives ) ) ;
    public final void ruleComponentProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:141:2: ( ( ( rule__ComponentProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:142:2: ( ( rule__ComponentProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:142:2: ( ( rule__ComponentProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:143:3: ( rule__ComponentProperty__Alternatives )
            {
             before(grammarAccess.getComponentPropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:144:3: ( rule__ComponentProperty__Alternatives )
            // InternalQualityEffectSpecification.g:144:4: rule__ComponentProperty__Alternatives
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
    // InternalQualityEffectSpecification.g:153:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:154:1: ( ruleName EOF )
            // InternalQualityEffectSpecification.g:155:1: ruleName EOF
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
    // InternalQualityEffectSpecification.g:162:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:166:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:167:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:167:2: ( ( rule__Name__Group__0 ) )
            // InternalQualityEffectSpecification.g:168:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:169:3: ( rule__Name__Group__0 )
            // InternalQualityEffectSpecification.g:169:4: rule__Name__Group__0
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
    // InternalQualityEffectSpecification.g:178:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:179:1: ( ruleIdentifier EOF )
            // InternalQualityEffectSpecification.g:180:1: ruleIdentifier EOF
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
    // InternalQualityEffectSpecification.g:187:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:191:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:192:2: ( ( rule__Identifier__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:192:2: ( ( rule__Identifier__Group__0 ) )
            // InternalQualityEffectSpecification.g:193:3: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:194:3: ( rule__Identifier__Group__0 )
            // InternalQualityEffectSpecification.g:194:4: rule__Identifier__Group__0
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


    // $ANTLR start "entryRuleAnnotation"
    // InternalQualityEffectSpecification.g:203:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:204:1: ( ruleAnnotation EOF )
            // InternalQualityEffectSpecification.g:205:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalQualityEffectSpecification.g:212:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:216:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:217:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:217:2: ( ( rule__Annotation__Group__0 ) )
            // InternalQualityEffectSpecification.g:218:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:219:3: ( rule__Annotation__Group__0 )
            // InternalQualityEffectSpecification.g:219:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


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


    // $ANTLR start "entryRuleRoleProperty"
    // InternalQualityEffectSpecification.g:278:1: entryRuleRoleProperty : ruleRoleProperty EOF ;
    public final void entryRuleRoleProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:279:1: ( ruleRoleProperty EOF )
            // InternalQualityEffectSpecification.g:280:1: ruleRoleProperty EOF
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
    // InternalQualityEffectSpecification.g:287:1: ruleRoleProperty : ( ( rule__RoleProperty__Alternatives ) ) ;
    public final void ruleRoleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:291:2: ( ( ( rule__RoleProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:292:2: ( ( rule__RoleProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:292:2: ( ( rule__RoleProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:293:3: ( rule__RoleProperty__Alternatives )
            {
             before(grammarAccess.getRolePropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:294:3: ( rule__RoleProperty__Alternatives )
            // InternalQualityEffectSpecification.g:294:4: rule__RoleProperty__Alternatives
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


    // $ANTLR start "entryRuleResource"
    // InternalQualityEffectSpecification.g:328:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:329:1: ( ruleResource EOF )
            // InternalQualityEffectSpecification.g:330:1: ruleResource EOF
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
    // InternalQualityEffectSpecification.g:337:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:341:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:342:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:342:2: ( ( rule__Resource__Group__0 ) )
            // InternalQualityEffectSpecification.g:343:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:344:3: ( rule__Resource__Group__0 )
            // InternalQualityEffectSpecification.g:344:4: rule__Resource__Group__0
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
    // InternalQualityEffectSpecification.g:353:1: entryRuleResourceProperty : ruleResourceProperty EOF ;
    public final void entryRuleResourceProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:354:1: ( ruleResourceProperty EOF )
            // InternalQualityEffectSpecification.g:355:1: ruleResourceProperty EOF
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
    // InternalQualityEffectSpecification.g:362:1: ruleResourceProperty : ( ( rule__ResourceProperty__Alternatives ) ) ;
    public final void ruleResourceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:366:2: ( ( ( rule__ResourceProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:367:2: ( ( rule__ResourceProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:367:2: ( ( rule__ResourceProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:368:3: ( rule__ResourceProperty__Alternatives )
            {
             before(grammarAccess.getResourcePropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:369:3: ( rule__ResourceProperty__Alternatives )
            // InternalQualityEffectSpecification.g:369:4: rule__ResourceProperty__Alternatives
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
    // InternalQualityEffectSpecification.g:378:1: entryRuleTransformationSpecification : ruleTransformationSpecification EOF ;
    public final void entryRuleTransformationSpecification() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:379:1: ( ruleTransformationSpecification EOF )
            // InternalQualityEffectSpecification.g:380:1: ruleTransformationSpecification EOF
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
    // InternalQualityEffectSpecification.g:387:1: ruleTransformationSpecification : ( ( rule__TransformationSpecification__Alternatives ) ) ;
    public final void ruleTransformationSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:391:2: ( ( ( rule__TransformationSpecification__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:392:2: ( ( rule__TransformationSpecification__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:392:2: ( ( rule__TransformationSpecification__Alternatives ) )
            // InternalQualityEffectSpecification.g:393:3: ( rule__TransformationSpecification__Alternatives )
            {
             before(grammarAccess.getTransformationSpecificationAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:394:3: ( rule__TransformationSpecification__Alternatives )
            // InternalQualityEffectSpecification.g:394:4: rule__TransformationSpecification__Alternatives
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
    // InternalQualityEffectSpecification.g:403:1: entryRuleNQA : ruleNQA EOF ;
    public final void entryRuleNQA() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:404:1: ( ruleNQA EOF )
            // InternalQualityEffectSpecification.g:405:1: ruleNQA EOF
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
    // InternalQualityEffectSpecification.g:412:1: ruleNQA : ( ( rule__NQA__Group__0 ) ) ;
    public final void ruleNQA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:416:2: ( ( ( rule__NQA__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:417:2: ( ( rule__NQA__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:417:2: ( ( rule__NQA__Group__0 ) )
            // InternalQualityEffectSpecification.g:418:3: ( rule__NQA__Group__0 )
            {
             before(grammarAccess.getNQAAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:419:3: ( rule__NQA__Group__0 )
            // InternalQualityEffectSpecification.g:419:4: rule__NQA__Group__0
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
    // InternalQualityEffectSpecification.g:428:1: entryRuleReasoning : ruleReasoning EOF ;
    public final void entryRuleReasoning() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:429:1: ( ruleReasoning EOF )
            // InternalQualityEffectSpecification.g:430:1: ruleReasoning EOF
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
    // InternalQualityEffectSpecification.g:437:1: ruleReasoning : ( ( rule__Reasoning__Group__0 ) ) ;
    public final void ruleReasoning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:441:2: ( ( ( rule__Reasoning__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:442:2: ( ( rule__Reasoning__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:442:2: ( ( rule__Reasoning__Group__0 ) )
            // InternalQualityEffectSpecification.g:443:3: ( rule__Reasoning__Group__0 )
            {
             before(grammarAccess.getReasoningAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:444:3: ( rule__Reasoning__Group__0 )
            // InternalQualityEffectSpecification.g:444:4: rule__Reasoning__Group__0
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
    // InternalQualityEffectSpecification.g:453:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:454:1: ( ruleRule EOF )
            // InternalQualityEffectSpecification.g:455:1: ruleRule EOF
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
    // InternalQualityEffectSpecification.g:462:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:466:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:467:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:467:2: ( ( rule__Rule__Group__0 ) )
            // InternalQualityEffectSpecification.g:468:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:469:3: ( rule__Rule__Group__0 )
            // InternalQualityEffectSpecification.g:469:4: rule__Rule__Group__0
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
    // InternalQualityEffectSpecification.g:478:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:479:1: ( ruleEntry EOF )
            // InternalQualityEffectSpecification.g:480:1: ruleEntry EOF
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
    // InternalQualityEffectSpecification.g:487:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:491:2: ( ( ( rule__Entry__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:492:2: ( ( rule__Entry__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:492:2: ( ( rule__Entry__Group__0 ) )
            // InternalQualityEffectSpecification.g:493:3: ( rule__Entry__Group__0 )
            {
             before(grammarAccess.getEntryAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:494:3: ( rule__Entry__Group__0 )
            // InternalQualityEffectSpecification.g:494:4: rule__Entry__Group__0
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


    // $ANTLR start "entryRuleNumericValue"
    // InternalQualityEffectSpecification.g:503:1: entryRuleNumericValue : ruleNumericValue EOF ;
    public final void entryRuleNumericValue() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:504:1: ( ruleNumericValue EOF )
            // InternalQualityEffectSpecification.g:505:1: ruleNumericValue EOF
            {
             before(grammarAccess.getNumericValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericValue();

            state._fsp--;

             after(grammarAccess.getNumericValueRule()); 
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
    // $ANTLR end "entryRuleNumericValue"


    // $ANTLR start "ruleNumericValue"
    // InternalQualityEffectSpecification.g:512:1: ruleNumericValue : ( ( rule__NumericValue__Group__0 ) ) ;
    public final void ruleNumericValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:516:2: ( ( ( rule__NumericValue__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:517:2: ( ( rule__NumericValue__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:517:2: ( ( rule__NumericValue__Group__0 ) )
            // InternalQualityEffectSpecification.g:518:3: ( rule__NumericValue__Group__0 )
            {
             before(grammarAccess.getNumericValueAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:519:3: ( rule__NumericValue__Group__0 )
            // InternalQualityEffectSpecification.g:519:4: rule__NumericValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericValue"


    // $ANTLR start "ruleComponentType"
    // InternalQualityEffectSpecification.g:528:1: ruleComponentType : ( ( rule__ComponentType__Alternatives ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:532:1: ( ( ( rule__ComponentType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:533:2: ( ( rule__ComponentType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:533:2: ( ( rule__ComponentType__Alternatives ) )
            // InternalQualityEffectSpecification.g:534:3: ( rule__ComponentType__Alternatives )
            {
             before(grammarAccess.getComponentTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:535:3: ( rule__ComponentType__Alternatives )
            // InternalQualityEffectSpecification.g:535:4: rule__ComponentType__Alternatives
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
    // InternalQualityEffectSpecification.g:544:1: ruleRoleType : ( ( rule__RoleType__Alternatives ) ) ;
    public final void ruleRoleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:548:1: ( ( ( rule__RoleType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:549:2: ( ( rule__RoleType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:549:2: ( ( rule__RoleType__Alternatives ) )
            // InternalQualityEffectSpecification.g:550:3: ( rule__RoleType__Alternatives )
            {
             before(grammarAccess.getRoleTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:551:3: ( rule__RoleType__Alternatives )
            // InternalQualityEffectSpecification.g:551:4: rule__RoleType__Alternatives
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
    // InternalQualityEffectSpecification.g:560:1: ruleAssemblyType : ( ( rule__AssemblyType__Alternatives ) ) ;
    public final void ruleAssemblyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:564:1: ( ( ( rule__AssemblyType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:565:2: ( ( rule__AssemblyType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:565:2: ( ( rule__AssemblyType__Alternatives ) )
            // InternalQualityEffectSpecification.g:566:3: ( rule__AssemblyType__Alternatives )
            {
             before(grammarAccess.getAssemblyTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:567:3: ( rule__AssemblyType__Alternatives )
            // InternalQualityEffectSpecification.g:567:4: rule__AssemblyType__Alternatives
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
    // InternalQualityEffectSpecification.g:576:1: ruleTransformationType : ( ( rule__TransformationType__Alternatives ) ) ;
    public final void ruleTransformationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:580:1: ( ( ( rule__TransformationType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:581:2: ( ( rule__TransformationType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:581:2: ( ( rule__TransformationType__Alternatives ) )
            // InternalQualityEffectSpecification.g:582:3: ( rule__TransformationType__Alternatives )
            {
             before(grammarAccess.getTransformationTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:583:3: ( rule__TransformationType__Alternatives )
            // InternalQualityEffectSpecification.g:583:4: rule__TransformationType__Alternatives
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
    // InternalQualityEffectSpecification.g:591:1: rule__ComponentProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleAnnotation ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) );
    public final void rule__ComponentProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:595:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleAnnotation ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            case 42:
                {
                alt1=4;
                }
                break;
            case 43:
                {
                alt1=5;
                }
                break;
            case 45:
                {
                alt1=6;
                }
                break;
            case 46:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalQualityEffectSpecification.g:596:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:596:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:597:3: ruleName
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
                    // InternalQualityEffectSpecification.g:602:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:602:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:603:3: ruleIdentifier
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
                    // InternalQualityEffectSpecification.g:608:2: ( ruleAnnotation )
                    {
                    // InternalQualityEffectSpecification.g:608:2: ( ruleAnnotation )
                    // InternalQualityEffectSpecification.g:609:3: ruleAnnotation
                    {
                     before(grammarAccess.getComponentPropertyAccess().getAnnotationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAnnotation();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getAnnotationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:614:2: ( ruleType )
                    {
                    // InternalQualityEffectSpecification.g:614:2: ( ruleType )
                    // InternalQualityEffectSpecification.g:615:3: ruleType
                    {
                     before(grammarAccess.getComponentPropertyAccess().getTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:620:2: ( ruleRole )
                    {
                    // InternalQualityEffectSpecification.g:620:2: ( ruleRole )
                    // InternalQualityEffectSpecification.g:621:3: ruleRole
                    {
                     before(grammarAccess.getComponentPropertyAccess().getRoleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getRoleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:626:2: ( ruleAssembly )
                    {
                    // InternalQualityEffectSpecification.g:626:2: ( ruleAssembly )
                    // InternalQualityEffectSpecification.g:627:3: ruleAssembly
                    {
                     before(grammarAccess.getComponentPropertyAccess().getAssemblyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAssembly();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getAssemblyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:632:2: ( ruleResource )
                    {
                    // InternalQualityEffectSpecification.g:632:2: ( ruleResource )
                    // InternalQualityEffectSpecification.g:633:3: ruleResource
                    {
                     before(grammarAccess.getComponentPropertyAccess().getResourceParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getComponentPropertyAccess().getResourceParserRuleCall_6()); 

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
    // InternalQualityEffectSpecification.g:642:1: rule__RoleProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleAnnotation ) );
    public final void rule__RoleProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:646:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleAnnotation ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQualityEffectSpecification.g:647:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:647:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:648:3: ruleName
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
                    // InternalQualityEffectSpecification.g:653:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:653:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:654:3: ruleIdentifier
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
                    // InternalQualityEffectSpecification.g:659:2: ( ruleAnnotation )
                    {
                    // InternalQualityEffectSpecification.g:659:2: ( ruleAnnotation )
                    // InternalQualityEffectSpecification.g:660:3: ruleAnnotation
                    {
                     before(grammarAccess.getRolePropertyAccess().getAnnotationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAnnotation();

                    state._fsp--;

                     after(grammarAccess.getRolePropertyAccess().getAnnotationParserRuleCall_2()); 

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
    // InternalQualityEffectSpecification.g:669:1: rule__ResourceProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) );
    public final void rule__ResourceProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:673:1: ( ( ruleName ) | ( ruleIdentifier ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQualityEffectSpecification.g:674:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:674:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:675:3: ruleName
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
                    // InternalQualityEffectSpecification.g:680:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:680:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:681:3: ruleIdentifier
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
    // InternalQualityEffectSpecification.g:690:1: rule__TransformationSpecification__Alternatives : ( ( ruleNQA ) | ( ruleReasoning ) | ( ruleNumericValue ) );
    public final void rule__TransformationSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:694:1: ( ( ruleNQA ) | ( ruleReasoning ) | ( ruleNumericValue ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt4=1;
                }
                break;
            case 48:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
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
                    // InternalQualityEffectSpecification.g:695:2: ( ruleNQA )
                    {
                    // InternalQualityEffectSpecification.g:695:2: ( ruleNQA )
                    // InternalQualityEffectSpecification.g:696:3: ruleNQA
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
                    // InternalQualityEffectSpecification.g:701:2: ( ruleReasoning )
                    {
                    // InternalQualityEffectSpecification.g:701:2: ( ruleReasoning )
                    // InternalQualityEffectSpecification.g:702:3: ruleReasoning
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
                    // InternalQualityEffectSpecification.g:707:2: ( ruleNumericValue )
                    {
                    // InternalQualityEffectSpecification.g:707:2: ( ruleNumericValue )
                    // InternalQualityEffectSpecification.g:708:3: ruleNumericValue
                    {
                     before(grammarAccess.getTransformationSpecificationAccess().getNumericValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericValue();

                    state._fsp--;

                     after(grammarAccess.getTransformationSpecificationAccess().getNumericValueParserRuleCall_2()); 

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
    // InternalQualityEffectSpecification.g:717:1: rule__ComponentType__Alternatives : ( ( ( 'AnyComponentType' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) );
    public final void rule__ComponentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:721:1: ( ( ( 'AnyComponentType' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
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
                    // InternalQualityEffectSpecification.g:722:2: ( ( 'AnyComponentType' ) )
                    {
                    // InternalQualityEffectSpecification.g:722:2: ( ( 'AnyComponentType' ) )
                    // InternalQualityEffectSpecification.g:723:3: ( 'AnyComponentType' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:724:3: ( 'AnyComponentType' )
                    // InternalQualityEffectSpecification.g:724:4: 'AnyComponentType'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:728:2: ( ( 'Basic' ) )
                    {
                    // InternalQualityEffectSpecification.g:728:2: ( ( 'Basic' ) )
                    // InternalQualityEffectSpecification.g:729:3: ( 'Basic' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:730:3: ( 'Basic' )
                    // InternalQualityEffectSpecification.g:730:4: 'Basic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:734:2: ( ( 'Composite' ) )
                    {
                    // InternalQualityEffectSpecification.g:734:2: ( ( 'Composite' ) )
                    // InternalQualityEffectSpecification.g:735:3: ( 'Composite' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:736:3: ( 'Composite' )
                    // InternalQualityEffectSpecification.g:736:4: 'Composite'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:744:1: rule__RoleType__Alternatives : ( ( ( 'AnyRoleType' ) ) | ( ( 'ComponentRequiredProvided' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'InfrastructureRequiredProvided' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) );
    public final void rule__RoleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:748:1: ( ( ( 'AnyRoleType' ) ) | ( ( 'ComponentRequiredProvided' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'InfrastructureRequiredProvided' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQualityEffectSpecification.g:749:2: ( ( 'AnyRoleType' ) )
                    {
                    // InternalQualityEffectSpecification.g:749:2: ( ( 'AnyRoleType' ) )
                    // InternalQualityEffectSpecification.g:750:3: ( 'AnyRoleType' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:751:3: ( 'AnyRoleType' )
                    // InternalQualityEffectSpecification.g:751:4: 'AnyRoleType'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:755:2: ( ( 'ComponentRequiredProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:755:2: ( ( 'ComponentRequiredProvided' ) )
                    // InternalQualityEffectSpecification.g:756:3: ( 'ComponentRequiredProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:757:3: ( 'ComponentRequiredProvided' )
                    // InternalQualityEffectSpecification.g:757:4: 'ComponentRequiredProvided'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:761:2: ( ( 'ComponentRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:761:2: ( ( 'ComponentRequired' ) )
                    // InternalQualityEffectSpecification.g:762:3: ( 'ComponentRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:763:3: ( 'ComponentRequired' )
                    // InternalQualityEffectSpecification.g:763:4: 'ComponentRequired'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:767:2: ( ( 'ComponentProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:767:2: ( ( 'ComponentProvided' ) )
                    // InternalQualityEffectSpecification.g:768:3: ( 'ComponentProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:769:3: ( 'ComponentProvided' )
                    // InternalQualityEffectSpecification.g:769:4: 'ComponentProvided'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:773:2: ( ( 'InfrastructureRequiredProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:773:2: ( ( 'InfrastructureRequiredProvided' ) )
                    // InternalQualityEffectSpecification.g:774:3: ( 'InfrastructureRequiredProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:775:3: ( 'InfrastructureRequiredProvided' )
                    // InternalQualityEffectSpecification.g:775:4: 'InfrastructureRequiredProvided'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:779:2: ( ( 'InfrastructureRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:779:2: ( ( 'InfrastructureRequired' ) )
                    // InternalQualityEffectSpecification.g:780:3: ( 'InfrastructureRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 
                    // InternalQualityEffectSpecification.g:781:3: ( 'InfrastructureRequired' )
                    // InternalQualityEffectSpecification.g:781:4: 'InfrastructureRequired'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:785:2: ( ( 'InfrastructureProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:785:2: ( ( 'InfrastructureProvided' ) )
                    // InternalQualityEffectSpecification.g:786:3: ( 'InfrastructureProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_PROVIDEDEnumLiteralDeclaration_6()); 
                    // InternalQualityEffectSpecification.g:787:3: ( 'InfrastructureProvided' )
                    // InternalQualityEffectSpecification.g:787:4: 'InfrastructureProvided'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:795:1: rule__AssemblyType__Alternatives : ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) );
    public final void rule__AssemblyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:799:1: ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
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
                    // InternalQualityEffectSpecification.g:800:2: ( ( 'AnyAssembly' ) )
                    {
                    // InternalQualityEffectSpecification.g:800:2: ( ( 'AnyAssembly' ) )
                    // InternalQualityEffectSpecification.g:801:3: ( 'AnyAssembly' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:802:3: ( 'AnyAssembly' )
                    // InternalQualityEffectSpecification.g:802:4: 'AnyAssembly'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:806:2: ( ( 'Required' ) )
                    {
                    // InternalQualityEffectSpecification.g:806:2: ( ( 'Required' ) )
                    // InternalQualityEffectSpecification.g:807:3: ( 'Required' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:808:3: ( 'Required' )
                    // InternalQualityEffectSpecification.g:808:4: 'Required'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:812:2: ( ( 'Provided' ) )
                    {
                    // InternalQualityEffectSpecification.g:812:2: ( ( 'Provided' ) )
                    // InternalQualityEffectSpecification.g:813:3: ( 'Provided' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:814:3: ( 'Provided' )
                    // InternalQualityEffectSpecification.g:814:4: 'Provided'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:822:1: rule__TransformationType__Alternatives : ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__TransformationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:826:1: ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 30:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQualityEffectSpecification.g:827:2: ( ( '=' ) )
                    {
                    // InternalQualityEffectSpecification.g:827:2: ( ( '=' ) )
                    // InternalQualityEffectSpecification.g:828:3: ( '=' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:829:3: ( '=' )
                    // InternalQualityEffectSpecification.g:829:4: '='
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:833:2: ( ( '+' ) )
                    {
                    // InternalQualityEffectSpecification.g:833:2: ( ( '+' ) )
                    // InternalQualityEffectSpecification.g:834:3: ( '+' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:835:3: ( '+' )
                    // InternalQualityEffectSpecification.g:835:4: '+'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:839:2: ( ( '-' ) )
                    {
                    // InternalQualityEffectSpecification.g:839:2: ( ( '-' ) )
                    // InternalQualityEffectSpecification.g:840:3: ( '-' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:841:3: ( '-' )
                    // InternalQualityEffectSpecification.g:841:4: '-'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:845:2: ( ( '*' ) )
                    {
                    // InternalQualityEffectSpecification.g:845:2: ( ( '*' ) )
                    // InternalQualityEffectSpecification.g:846:3: ( '*' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:847:3: ( '*' )
                    // InternalQualityEffectSpecification.g:847:4: '*'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:851:2: ( ( '/' ) )
                    {
                    // InternalQualityEffectSpecification.g:851:2: ( ( '/' ) )
                    // InternalQualityEffectSpecification.g:852:3: ( '/' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getDIVISIONEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:853:3: ( '/' )
                    // InternalQualityEffectSpecification.g:853:4: '/'
                    {
                    match(input,30,FOLLOW_2); 

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalQualityEffectSpecification.g:861:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:865:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalQualityEffectSpecification.g:866:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalQualityEffectSpecification.g:873:1: rule__Model__Group__0__Impl : ( ( rule__Model__SpecificationsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:877:1: ( ( ( rule__Model__SpecificationsAssignment_0 ) ) )
            // InternalQualityEffectSpecification.g:878:1: ( ( rule__Model__SpecificationsAssignment_0 ) )
            {
            // InternalQualityEffectSpecification.g:878:1: ( ( rule__Model__SpecificationsAssignment_0 ) )
            // InternalQualityEffectSpecification.g:879:2: ( rule__Model__SpecificationsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getSpecificationsAssignment_0()); 
            // InternalQualityEffectSpecification.g:880:2: ( rule__Model__SpecificationsAssignment_0 )
            // InternalQualityEffectSpecification.g:880:3: rule__Model__SpecificationsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__SpecificationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSpecificationsAssignment_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:888:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:892:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalQualityEffectSpecification.g:893:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalQualityEffectSpecification.g:900:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:904:1: ( ( ( rule__Model__Group_1__0 )* ) )
            // InternalQualityEffectSpecification.g:905:1: ( ( rule__Model__Group_1__0 )* )
            {
            // InternalQualityEffectSpecification.g:905:1: ( ( rule__Model__Group_1__0 )* )
            // InternalQualityEffectSpecification.g:906:2: ( rule__Model__Group_1__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // InternalQualityEffectSpecification.g:907:2: ( rule__Model__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:907:3: rule__Model__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:915:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:919:1: ( rule__Model__Group__2__Impl )
            // InternalQualityEffectSpecification.g:920:2: rule__Model__Group__2__Impl
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
    // InternalQualityEffectSpecification.g:926:1: rule__Model__Group__2__Impl : ( ( ( RULE_NL ) ) ( ( RULE_NL )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:930:1: ( ( ( ( RULE_NL ) ) ( ( RULE_NL )* ) ) )
            // InternalQualityEffectSpecification.g:931:1: ( ( ( RULE_NL ) ) ( ( RULE_NL )* ) )
            {
            // InternalQualityEffectSpecification.g:931:1: ( ( ( RULE_NL ) ) ( ( RULE_NL )* ) )
            // InternalQualityEffectSpecification.g:932:2: ( ( RULE_NL ) ) ( ( RULE_NL )* )
            {
            // InternalQualityEffectSpecification.g:932:2: ( ( RULE_NL ) )
            // InternalQualityEffectSpecification.g:933:3: ( RULE_NL )
            {
             before(grammarAccess.getModelAccess().getNLTerminalRuleCall_2()); 
            // InternalQualityEffectSpecification.g:934:3: ( RULE_NL )
            // InternalQualityEffectSpecification.g:934:4: RULE_NL
            {
            match(input,RULE_NL,FOLLOW_4); 

            }

             after(grammarAccess.getModelAccess().getNLTerminalRuleCall_2()); 

            }

            // InternalQualityEffectSpecification.g:937:2: ( ( RULE_NL )* )
            // InternalQualityEffectSpecification.g:938:3: ( RULE_NL )*
            {
             before(grammarAccess.getModelAccess().getNLTerminalRuleCall_2()); 
            // InternalQualityEffectSpecification.g:939:3: ( RULE_NL )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_NL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:939:4: RULE_NL
            	    {
            	    match(input,RULE_NL,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getNLTerminalRuleCall_2()); 

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


    // $ANTLR start "rule__Model__Group_1__0"
    // InternalQualityEffectSpecification.g:949:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:953:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // InternalQualityEffectSpecification.g:954:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1();

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
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // InternalQualityEffectSpecification.g:961:1: rule__Model__Group_1__0__Impl : ( ( ( RULE_NL ) ) ( ( RULE_NL )* ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:965:1: ( ( ( ( RULE_NL ) ) ( ( RULE_NL )* ) ) )
            // InternalQualityEffectSpecification.g:966:1: ( ( ( RULE_NL ) ) ( ( RULE_NL )* ) )
            {
            // InternalQualityEffectSpecification.g:966:1: ( ( ( RULE_NL ) ) ( ( RULE_NL )* ) )
            // InternalQualityEffectSpecification.g:967:2: ( ( RULE_NL ) ) ( ( RULE_NL )* )
            {
            // InternalQualityEffectSpecification.g:967:2: ( ( RULE_NL ) )
            // InternalQualityEffectSpecification.g:968:3: ( RULE_NL )
            {
             before(grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0()); 
            // InternalQualityEffectSpecification.g:969:3: ( RULE_NL )
            // InternalQualityEffectSpecification.g:969:4: RULE_NL
            {
            match(input,RULE_NL,FOLLOW_4); 

            }

             after(grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0()); 

            }

            // InternalQualityEffectSpecification.g:972:2: ( ( RULE_NL )* )
            // InternalQualityEffectSpecification.g:973:3: ( RULE_NL )*
            {
             before(grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0()); 
            // InternalQualityEffectSpecification.g:974:3: ( RULE_NL )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_NL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:974:4: RULE_NL
            	    {
            	    match(input,RULE_NL,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // InternalQualityEffectSpecification.g:983:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:987:1: ( rule__Model__Group_1__1__Impl )
            // InternalQualityEffectSpecification.g:988:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // InternalQualityEffectSpecification.g:994:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__SpecificationsAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:998:1: ( ( ( rule__Model__SpecificationsAssignment_1_1 ) ) )
            // InternalQualityEffectSpecification.g:999:1: ( ( rule__Model__SpecificationsAssignment_1_1 ) )
            {
            // InternalQualityEffectSpecification.g:999:1: ( ( rule__Model__SpecificationsAssignment_1_1 ) )
            // InternalQualityEffectSpecification.g:1000:2: ( rule__Model__SpecificationsAssignment_1_1 )
            {
             before(grammarAccess.getModelAccess().getSpecificationsAssignment_1_1()); 
            // InternalQualityEffectSpecification.g:1001:2: ( rule__Model__SpecificationsAssignment_1_1 )
            // InternalQualityEffectSpecification.g:1001:3: rule__Model__SpecificationsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__SpecificationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSpecificationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__0"
    // InternalQualityEffectSpecification.g:1010:1: rule__QualityEffectSpecification__Group__0 : rule__QualityEffectSpecification__Group__0__Impl rule__QualityEffectSpecification__Group__1 ;
    public final void rule__QualityEffectSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1014:1: ( rule__QualityEffectSpecification__Group__0__Impl rule__QualityEffectSpecification__Group__1 )
            // InternalQualityEffectSpecification.g:1015:2: rule__QualityEffectSpecification__Group__0__Impl rule__QualityEffectSpecification__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualityEffectSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__1();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__0"


    // $ANTLR start "rule__QualityEffectSpecification__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1022:1: rule__QualityEffectSpecification__Group__0__Impl : ( 'For' ) ;
    public final void rule__QualityEffectSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1026:1: ( ( 'For' ) )
            // InternalQualityEffectSpecification.g:1027:1: ( 'For' )
            {
            // InternalQualityEffectSpecification.g:1027:1: ( 'For' )
            // InternalQualityEffectSpecification.g:1028:2: 'For'
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getForKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQualityEffectSpecificationAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__0__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__1"
    // InternalQualityEffectSpecification.g:1037:1: rule__QualityEffectSpecification__Group__1 : rule__QualityEffectSpecification__Group__1__Impl rule__QualityEffectSpecification__Group__2 ;
    public final void rule__QualityEffectSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1041:1: ( rule__QualityEffectSpecification__Group__1__Impl rule__QualityEffectSpecification__Group__2 )
            // InternalQualityEffectSpecification.g:1042:2: rule__QualityEffectSpecification__Group__1__Impl rule__QualityEffectSpecification__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__QualityEffectSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__2();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__1"


    // $ANTLR start "rule__QualityEffectSpecification__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1049:1: rule__QualityEffectSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__QualityEffectSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1053:1: ( ( '{' ) )
            // InternalQualityEffectSpecification.g:1054:1: ( '{' )
            {
            // InternalQualityEffectSpecification.g:1054:1: ( '{' )
            // InternalQualityEffectSpecification.g:1055:2: '{'
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQualityEffectSpecificationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__1__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__2"
    // InternalQualityEffectSpecification.g:1064:1: rule__QualityEffectSpecification__Group__2 : rule__QualityEffectSpecification__Group__2__Impl rule__QualityEffectSpecification__Group__3 ;
    public final void rule__QualityEffectSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1068:1: ( rule__QualityEffectSpecification__Group__2__Impl rule__QualityEffectSpecification__Group__3 )
            // InternalQualityEffectSpecification.g:1069:2: rule__QualityEffectSpecification__Group__2__Impl rule__QualityEffectSpecification__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__QualityEffectSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__3();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__2"


    // $ANTLR start "rule__QualityEffectSpecification__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1076:1: rule__QualityEffectSpecification__Group__2__Impl : ( ( rule__QualityEffectSpecification__ComponentsAssignment_2 ) ) ;
    public final void rule__QualityEffectSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1080:1: ( ( ( rule__QualityEffectSpecification__ComponentsAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1081:1: ( ( rule__QualityEffectSpecification__ComponentsAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1081:1: ( ( rule__QualityEffectSpecification__ComponentsAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1082:2: ( rule__QualityEffectSpecification__ComponentsAssignment_2 )
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getComponentsAssignment_2()); 
            // InternalQualityEffectSpecification.g:1083:2: ( rule__QualityEffectSpecification__ComponentsAssignment_2 )
            // InternalQualityEffectSpecification.g:1083:3: rule__QualityEffectSpecification__ComponentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__ComponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualityEffectSpecificationAccess().getComponentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__2__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__3"
    // InternalQualityEffectSpecification.g:1091:1: rule__QualityEffectSpecification__Group__3 : rule__QualityEffectSpecification__Group__3__Impl rule__QualityEffectSpecification__Group__4 ;
    public final void rule__QualityEffectSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1095:1: ( rule__QualityEffectSpecification__Group__3__Impl rule__QualityEffectSpecification__Group__4 )
            // InternalQualityEffectSpecification.g:1096:2: rule__QualityEffectSpecification__Group__3__Impl rule__QualityEffectSpecification__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__QualityEffectSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__4();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__3"


    // $ANTLR start "rule__QualityEffectSpecification__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1103:1: rule__QualityEffectSpecification__Group__3__Impl : ( ( rule__QualityEffectSpecification__Group_3__0 )* ) ;
    public final void rule__QualityEffectSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1107:1: ( ( ( rule__QualityEffectSpecification__Group_3__0 )* ) )
            // InternalQualityEffectSpecification.g:1108:1: ( ( rule__QualityEffectSpecification__Group_3__0 )* )
            {
            // InternalQualityEffectSpecification.g:1108:1: ( ( rule__QualityEffectSpecification__Group_3__0 )* )
            // InternalQualityEffectSpecification.g:1109:2: ( rule__QualityEffectSpecification__Group_3__0 )*
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getGroup_3()); 
            // InternalQualityEffectSpecification.g:1110:2: ( rule__QualityEffectSpecification__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1110:3: rule__QualityEffectSpecification__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualityEffectSpecification__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQualityEffectSpecificationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__3__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__4"
    // InternalQualityEffectSpecification.g:1118:1: rule__QualityEffectSpecification__Group__4 : rule__QualityEffectSpecification__Group__4__Impl rule__QualityEffectSpecification__Group__5 ;
    public final void rule__QualityEffectSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1122:1: ( rule__QualityEffectSpecification__Group__4__Impl rule__QualityEffectSpecification__Group__5 )
            // InternalQualityEffectSpecification.g:1123:2: rule__QualityEffectSpecification__Group__4__Impl rule__QualityEffectSpecification__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__QualityEffectSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__5();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__4"


    // $ANTLR start "rule__QualityEffectSpecification__Group__4__Impl"
    // InternalQualityEffectSpecification.g:1130:1: rule__QualityEffectSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__QualityEffectSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1134:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:1135:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:1135:1: ( '}' )
            // InternalQualityEffectSpecification.g:1136:2: '}'
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQualityEffectSpecificationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__4__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__5"
    // InternalQualityEffectSpecification.g:1145:1: rule__QualityEffectSpecification__Group__5 : rule__QualityEffectSpecification__Group__5__Impl rule__QualityEffectSpecification__Group__6 ;
    public final void rule__QualityEffectSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1149:1: ( rule__QualityEffectSpecification__Group__5__Impl rule__QualityEffectSpecification__Group__6 )
            // InternalQualityEffectSpecification.g:1150:2: rule__QualityEffectSpecification__Group__5__Impl rule__QualityEffectSpecification__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__QualityEffectSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__6();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__5"


    // $ANTLR start "rule__QualityEffectSpecification__Group__5__Impl"
    // InternalQualityEffectSpecification.g:1157:1: rule__QualityEffectSpecification__Group__5__Impl : ( 'Do' ) ;
    public final void rule__QualityEffectSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1161:1: ( ( 'Do' ) )
            // InternalQualityEffectSpecification.g:1162:1: ( 'Do' )
            {
            // InternalQualityEffectSpecification.g:1162:1: ( 'Do' )
            // InternalQualityEffectSpecification.g:1163:2: 'Do'
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getDoKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQualityEffectSpecificationAccess().getDoKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__5__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__6"
    // InternalQualityEffectSpecification.g:1172:1: rule__QualityEffectSpecification__Group__6 : rule__QualityEffectSpecification__Group__6__Impl rule__QualityEffectSpecification__Group__7 ;
    public final void rule__QualityEffectSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1176:1: ( rule__QualityEffectSpecification__Group__6__Impl rule__QualityEffectSpecification__Group__7 )
            // InternalQualityEffectSpecification.g:1177:2: rule__QualityEffectSpecification__Group__6__Impl rule__QualityEffectSpecification__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__QualityEffectSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__7();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__6"


    // $ANTLR start "rule__QualityEffectSpecification__Group__6__Impl"
    // InternalQualityEffectSpecification.g:1184:1: rule__QualityEffectSpecification__Group__6__Impl : ( '{' ) ;
    public final void rule__QualityEffectSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1188:1: ( ( '{' ) )
            // InternalQualityEffectSpecification.g:1189:1: ( '{' )
            {
            // InternalQualityEffectSpecification.g:1189:1: ( '{' )
            // InternalQualityEffectSpecification.g:1190:2: '{'
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQualityEffectSpecificationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__6__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__7"
    // InternalQualityEffectSpecification.g:1199:1: rule__QualityEffectSpecification__Group__7 : rule__QualityEffectSpecification__Group__7__Impl rule__QualityEffectSpecification__Group__8 ;
    public final void rule__QualityEffectSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1203:1: ( rule__QualityEffectSpecification__Group__7__Impl rule__QualityEffectSpecification__Group__8 )
            // InternalQualityEffectSpecification.g:1204:2: rule__QualityEffectSpecification__Group__7__Impl rule__QualityEffectSpecification__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__QualityEffectSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__8();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__7"


    // $ANTLR start "rule__QualityEffectSpecification__Group__7__Impl"
    // InternalQualityEffectSpecification.g:1211:1: rule__QualityEffectSpecification__Group__7__Impl : ( ( rule__QualityEffectSpecification__TransformationsAssignment_7 ) ) ;
    public final void rule__QualityEffectSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1215:1: ( ( ( rule__QualityEffectSpecification__TransformationsAssignment_7 ) ) )
            // InternalQualityEffectSpecification.g:1216:1: ( ( rule__QualityEffectSpecification__TransformationsAssignment_7 ) )
            {
            // InternalQualityEffectSpecification.g:1216:1: ( ( rule__QualityEffectSpecification__TransformationsAssignment_7 ) )
            // InternalQualityEffectSpecification.g:1217:2: ( rule__QualityEffectSpecification__TransformationsAssignment_7 )
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsAssignment_7()); 
            // InternalQualityEffectSpecification.g:1218:2: ( rule__QualityEffectSpecification__TransformationsAssignment_7 )
            // InternalQualityEffectSpecification.g:1218:3: rule__QualityEffectSpecification__TransformationsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__TransformationsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__7__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__8"
    // InternalQualityEffectSpecification.g:1226:1: rule__QualityEffectSpecification__Group__8 : rule__QualityEffectSpecification__Group__8__Impl rule__QualityEffectSpecification__Group__9 ;
    public final void rule__QualityEffectSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1230:1: ( rule__QualityEffectSpecification__Group__8__Impl rule__QualityEffectSpecification__Group__9 )
            // InternalQualityEffectSpecification.g:1231:2: rule__QualityEffectSpecification__Group__8__Impl rule__QualityEffectSpecification__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__QualityEffectSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__9();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__8"


    // $ANTLR start "rule__QualityEffectSpecification__Group__8__Impl"
    // InternalQualityEffectSpecification.g:1238:1: rule__QualityEffectSpecification__Group__8__Impl : ( ( rule__QualityEffectSpecification__Group_8__0 )* ) ;
    public final void rule__QualityEffectSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1242:1: ( ( ( rule__QualityEffectSpecification__Group_8__0 )* ) )
            // InternalQualityEffectSpecification.g:1243:1: ( ( rule__QualityEffectSpecification__Group_8__0 )* )
            {
            // InternalQualityEffectSpecification.g:1243:1: ( ( rule__QualityEffectSpecification__Group_8__0 )* )
            // InternalQualityEffectSpecification.g:1244:2: ( rule__QualityEffectSpecification__Group_8__0 )*
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getGroup_8()); 
            // InternalQualityEffectSpecification.g:1245:2: ( rule__QualityEffectSpecification__Group_8__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1245:3: rule__QualityEffectSpecification__Group_8__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualityEffectSpecification__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getQualityEffectSpecificationAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__8__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group__9"
    // InternalQualityEffectSpecification.g:1253:1: rule__QualityEffectSpecification__Group__9 : rule__QualityEffectSpecification__Group__9__Impl ;
    public final void rule__QualityEffectSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1257:1: ( rule__QualityEffectSpecification__Group__9__Impl )
            // InternalQualityEffectSpecification.g:1258:2: rule__QualityEffectSpecification__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group__9__Impl();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group__9"


    // $ANTLR start "rule__QualityEffectSpecification__Group__9__Impl"
    // InternalQualityEffectSpecification.g:1264:1: rule__QualityEffectSpecification__Group__9__Impl : ( '}' ) ;
    public final void rule__QualityEffectSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1268:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:1269:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:1269:1: ( '}' )
            // InternalQualityEffectSpecification.g:1270:2: '}'
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQualityEffectSpecificationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group__9__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group_3__0"
    // InternalQualityEffectSpecification.g:1280:1: rule__QualityEffectSpecification__Group_3__0 : rule__QualityEffectSpecification__Group_3__0__Impl rule__QualityEffectSpecification__Group_3__1 ;
    public final void rule__QualityEffectSpecification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1284:1: ( rule__QualityEffectSpecification__Group_3__0__Impl rule__QualityEffectSpecification__Group_3__1 )
            // InternalQualityEffectSpecification.g:1285:2: rule__QualityEffectSpecification__Group_3__0__Impl rule__QualityEffectSpecification__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__QualityEffectSpecification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group_3__1();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group_3__0"


    // $ANTLR start "rule__QualityEffectSpecification__Group_3__0__Impl"
    // InternalQualityEffectSpecification.g:1292:1: rule__QualityEffectSpecification__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__QualityEffectSpecification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1296:1: ( ( 'and' ) )
            // InternalQualityEffectSpecification.g:1297:1: ( 'and' )
            {
            // InternalQualityEffectSpecification.g:1297:1: ( 'and' )
            // InternalQualityEffectSpecification.g:1298:2: 'and'
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getAndKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getQualityEffectSpecificationAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group_3__0__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group_3__1"
    // InternalQualityEffectSpecification.g:1307:1: rule__QualityEffectSpecification__Group_3__1 : rule__QualityEffectSpecification__Group_3__1__Impl ;
    public final void rule__QualityEffectSpecification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1311:1: ( rule__QualityEffectSpecification__Group_3__1__Impl )
            // InternalQualityEffectSpecification.g:1312:2: rule__QualityEffectSpecification__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group_3__1__Impl();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group_3__1"


    // $ANTLR start "rule__QualityEffectSpecification__Group_3__1__Impl"
    // InternalQualityEffectSpecification.g:1318:1: rule__QualityEffectSpecification__Group_3__1__Impl : ( ( rule__QualityEffectSpecification__ComponentsAssignment_3_1 ) ) ;
    public final void rule__QualityEffectSpecification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1322:1: ( ( ( rule__QualityEffectSpecification__ComponentsAssignment_3_1 ) ) )
            // InternalQualityEffectSpecification.g:1323:1: ( ( rule__QualityEffectSpecification__ComponentsAssignment_3_1 ) )
            {
            // InternalQualityEffectSpecification.g:1323:1: ( ( rule__QualityEffectSpecification__ComponentsAssignment_3_1 ) )
            // InternalQualityEffectSpecification.g:1324:2: ( rule__QualityEffectSpecification__ComponentsAssignment_3_1 )
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getComponentsAssignment_3_1()); 
            // InternalQualityEffectSpecification.g:1325:2: ( rule__QualityEffectSpecification__ComponentsAssignment_3_1 )
            // InternalQualityEffectSpecification.g:1325:3: rule__QualityEffectSpecification__ComponentsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__ComponentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityEffectSpecificationAccess().getComponentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group_3__1__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group_8__0"
    // InternalQualityEffectSpecification.g:1334:1: rule__QualityEffectSpecification__Group_8__0 : rule__QualityEffectSpecification__Group_8__0__Impl rule__QualityEffectSpecification__Group_8__1 ;
    public final void rule__QualityEffectSpecification__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1338:1: ( rule__QualityEffectSpecification__Group_8__0__Impl rule__QualityEffectSpecification__Group_8__1 )
            // InternalQualityEffectSpecification.g:1339:2: rule__QualityEffectSpecification__Group_8__0__Impl rule__QualityEffectSpecification__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__QualityEffectSpecification__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group_8__1();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group_8__0"


    // $ANTLR start "rule__QualityEffectSpecification__Group_8__0__Impl"
    // InternalQualityEffectSpecification.g:1346:1: rule__QualityEffectSpecification__Group_8__0__Impl : ( 'and' ) ;
    public final void rule__QualityEffectSpecification__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1350:1: ( ( 'and' ) )
            // InternalQualityEffectSpecification.g:1351:1: ( 'and' )
            {
            // InternalQualityEffectSpecification.g:1351:1: ( 'and' )
            // InternalQualityEffectSpecification.g:1352:2: 'and'
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getAndKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getQualityEffectSpecificationAccess().getAndKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group_8__0__Impl"


    // $ANTLR start "rule__QualityEffectSpecification__Group_8__1"
    // InternalQualityEffectSpecification.g:1361:1: rule__QualityEffectSpecification__Group_8__1 : rule__QualityEffectSpecification__Group_8__1__Impl ;
    public final void rule__QualityEffectSpecification__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1365:1: ( rule__QualityEffectSpecification__Group_8__1__Impl )
            // InternalQualityEffectSpecification.g:1366:2: rule__QualityEffectSpecification__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__Group_8__1__Impl();

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
    // $ANTLR end "rule__QualityEffectSpecification__Group_8__1"


    // $ANTLR start "rule__QualityEffectSpecification__Group_8__1__Impl"
    // InternalQualityEffectSpecification.g:1372:1: rule__QualityEffectSpecification__Group_8__1__Impl : ( ( rule__QualityEffectSpecification__TransformationsAssignment_8_1 ) ) ;
    public final void rule__QualityEffectSpecification__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1376:1: ( ( ( rule__QualityEffectSpecification__TransformationsAssignment_8_1 ) ) )
            // InternalQualityEffectSpecification.g:1377:1: ( ( rule__QualityEffectSpecification__TransformationsAssignment_8_1 ) )
            {
            // InternalQualityEffectSpecification.g:1377:1: ( ( rule__QualityEffectSpecification__TransformationsAssignment_8_1 ) )
            // InternalQualityEffectSpecification.g:1378:2: ( rule__QualityEffectSpecification__TransformationsAssignment_8_1 )
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsAssignment_8_1()); 
            // InternalQualityEffectSpecification.g:1379:2: ( rule__QualityEffectSpecification__TransformationsAssignment_8_1 )
            // InternalQualityEffectSpecification.g:1379:3: rule__QualityEffectSpecification__TransformationsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityEffectSpecification__TransformationsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__Group_8__1__Impl"


    // $ANTLR start "rule__ComponentSpecification__Group__0"
    // InternalQualityEffectSpecification.g:1388:1: rule__ComponentSpecification__Group__0 : rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1 ;
    public final void rule__ComponentSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1392:1: ( rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1 )
            // InternalQualityEffectSpecification.g:1393:2: rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:1400:1: rule__ComponentSpecification__Group__0__Impl : ( 'Component' ) ;
    public final void rule__ComponentSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1404:1: ( ( 'Component' ) )
            // InternalQualityEffectSpecification.g:1405:1: ( 'Component' )
            {
            // InternalQualityEffectSpecification.g:1405:1: ( 'Component' )
            // InternalQualityEffectSpecification.g:1406:2: 'Component'
            {
             before(grammarAccess.getComponentSpecificationAccess().getComponentKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1415:1: rule__ComponentSpecification__Group__1 : rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2 ;
    public final void rule__ComponentSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1419:1: ( rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2 )
            // InternalQualityEffectSpecification.g:1420:2: rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalQualityEffectSpecification.g:1427:1: rule__ComponentSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__ComponentSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1431:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:1432:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:1432:1: ( '(' )
            // InternalQualityEffectSpecification.g:1433:2: '('
            {
             before(grammarAccess.getComponentSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComponentSpecificationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1442:1: rule__ComponentSpecification__Group__2 : rule__ComponentSpecification__Group__2__Impl rule__ComponentSpecification__Group__3 ;
    public final void rule__ComponentSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1446:1: ( rule__ComponentSpecification__Group__2__Impl rule__ComponentSpecification__Group__3 )
            // InternalQualityEffectSpecification.g:1447:2: rule__ComponentSpecification__Group__2__Impl rule__ComponentSpecification__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ComponentSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group__3();

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
    // InternalQualityEffectSpecification.g:1454:1: rule__ComponentSpecification__Group__2__Impl : ( ( rule__ComponentSpecification__PropertiesAssignment_2 ) ) ;
    public final void rule__ComponentSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1458:1: ( ( ( rule__ComponentSpecification__PropertiesAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1459:1: ( ( rule__ComponentSpecification__PropertiesAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1459:1: ( ( rule__ComponentSpecification__PropertiesAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1460:2: ( rule__ComponentSpecification__PropertiesAssignment_2 )
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_2()); 
            // InternalQualityEffectSpecification.g:1461:2: ( rule__ComponentSpecification__PropertiesAssignment_2 )
            // InternalQualityEffectSpecification.g:1461:3: rule__ComponentSpecification__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__PropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentSpecification__Group__3"
    // InternalQualityEffectSpecification.g:1469:1: rule__ComponentSpecification__Group__3 : rule__ComponentSpecification__Group__3__Impl rule__ComponentSpecification__Group__4 ;
    public final void rule__ComponentSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1473:1: ( rule__ComponentSpecification__Group__3__Impl rule__ComponentSpecification__Group__4 )
            // InternalQualityEffectSpecification.g:1474:2: rule__ComponentSpecification__Group__3__Impl rule__ComponentSpecification__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ComponentSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group__4();

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
    // $ANTLR end "rule__ComponentSpecification__Group__3"


    // $ANTLR start "rule__ComponentSpecification__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1481:1: rule__ComponentSpecification__Group__3__Impl : ( ( rule__ComponentSpecification__Group_3__0 )* ) ;
    public final void rule__ComponentSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1485:1: ( ( ( rule__ComponentSpecification__Group_3__0 )* ) )
            // InternalQualityEffectSpecification.g:1486:1: ( ( rule__ComponentSpecification__Group_3__0 )* )
            {
            // InternalQualityEffectSpecification.g:1486:1: ( ( rule__ComponentSpecification__Group_3__0 )* )
            // InternalQualityEffectSpecification.g:1487:2: ( rule__ComponentSpecification__Group_3__0 )*
            {
             before(grammarAccess.getComponentSpecificationAccess().getGroup_3()); 
            // InternalQualityEffectSpecification.g:1488:2: ( rule__ComponentSpecification__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1488:3: rule__ComponentSpecification__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentSpecification__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentSpecificationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSpecification__Group__3__Impl"


    // $ANTLR start "rule__ComponentSpecification__Group__4"
    // InternalQualityEffectSpecification.g:1496:1: rule__ComponentSpecification__Group__4 : rule__ComponentSpecification__Group__4__Impl ;
    public final void rule__ComponentSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1500:1: ( rule__ComponentSpecification__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1501:2: rule__ComponentSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group__4__Impl();

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
    // $ANTLR end "rule__ComponentSpecification__Group__4"


    // $ANTLR start "rule__ComponentSpecification__Group__4__Impl"
    // InternalQualityEffectSpecification.g:1507:1: rule__ComponentSpecification__Group__4__Impl : ( ')' ) ;
    public final void rule__ComponentSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1511:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1512:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1512:1: ( ')' )
            // InternalQualityEffectSpecification.g:1513:2: ')'
            {
             before(grammarAccess.getComponentSpecificationAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComponentSpecificationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSpecification__Group__4__Impl"


    // $ANTLR start "rule__ComponentSpecification__Group_3__0"
    // InternalQualityEffectSpecification.g:1523:1: rule__ComponentSpecification__Group_3__0 : rule__ComponentSpecification__Group_3__0__Impl rule__ComponentSpecification__Group_3__1 ;
    public final void rule__ComponentSpecification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1527:1: ( rule__ComponentSpecification__Group_3__0__Impl rule__ComponentSpecification__Group_3__1 )
            // InternalQualityEffectSpecification.g:1528:2: rule__ComponentSpecification__Group_3__0__Impl rule__ComponentSpecification__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ComponentSpecification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group_3__1();

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
    // $ANTLR end "rule__ComponentSpecification__Group_3__0"


    // $ANTLR start "rule__ComponentSpecification__Group_3__0__Impl"
    // InternalQualityEffectSpecification.g:1535:1: rule__ComponentSpecification__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__ComponentSpecification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1539:1: ( ( 'and' ) )
            // InternalQualityEffectSpecification.g:1540:1: ( 'and' )
            {
            // InternalQualityEffectSpecification.g:1540:1: ( 'and' )
            // InternalQualityEffectSpecification.g:1541:2: 'and'
            {
             before(grammarAccess.getComponentSpecificationAccess().getAndKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComponentSpecificationAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSpecification__Group_3__0__Impl"


    // $ANTLR start "rule__ComponentSpecification__Group_3__1"
    // InternalQualityEffectSpecification.g:1550:1: rule__ComponentSpecification__Group_3__1 : rule__ComponentSpecification__Group_3__1__Impl ;
    public final void rule__ComponentSpecification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1554:1: ( rule__ComponentSpecification__Group_3__1__Impl )
            // InternalQualityEffectSpecification.g:1555:2: rule__ComponentSpecification__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__Group_3__1__Impl();

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
    // $ANTLR end "rule__ComponentSpecification__Group_3__1"


    // $ANTLR start "rule__ComponentSpecification__Group_3__1__Impl"
    // InternalQualityEffectSpecification.g:1561:1: rule__ComponentSpecification__Group_3__1__Impl : ( ( rule__ComponentSpecification__PropertiesAssignment_3_1 ) ) ;
    public final void rule__ComponentSpecification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1565:1: ( ( ( rule__ComponentSpecification__PropertiesAssignment_3_1 ) ) )
            // InternalQualityEffectSpecification.g:1566:1: ( ( rule__ComponentSpecification__PropertiesAssignment_3_1 ) )
            {
            // InternalQualityEffectSpecification.g:1566:1: ( ( rule__ComponentSpecification__PropertiesAssignment_3_1 ) )
            // InternalQualityEffectSpecification.g:1567:2: ( rule__ComponentSpecification__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_3_1()); 
            // InternalQualityEffectSpecification.g:1568:2: ( rule__ComponentSpecification__PropertiesAssignment_3_1 )
            // InternalQualityEffectSpecification.g:1568:3: rule__ComponentSpecification__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSpecification__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSpecification__Group_3__1__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalQualityEffectSpecification.g:1577:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1581:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalQualityEffectSpecification.g:1582:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:1589:1: rule__Name__Group__0__Impl : ( 'Name' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1593:1: ( ( 'Name' ) )
            // InternalQualityEffectSpecification.g:1594:1: ( 'Name' )
            {
            // InternalQualityEffectSpecification.g:1594:1: ( 'Name' )
            // InternalQualityEffectSpecification.g:1595:2: 'Name'
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1604:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1608:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalQualityEffectSpecification.g:1609:2: rule__Name__Group__1__Impl rule__Name__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalQualityEffectSpecification.g:1616:1: rule__Name__Group__1__Impl : ( '(' ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1620:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:1621:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:1621:1: ( '(' )
            // InternalQualityEffectSpecification.g:1622:2: '('
            {
             before(grammarAccess.getNameAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1631:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1635:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalQualityEffectSpecification.g:1636:2: rule__Name__Group__2__Impl rule__Name__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalQualityEffectSpecification.g:1643:1: rule__Name__Group__2__Impl : ( ( rule__Name__NotAssignment_2 )? ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1647:1: ( ( ( rule__Name__NotAssignment_2 )? ) )
            // InternalQualityEffectSpecification.g:1648:1: ( ( rule__Name__NotAssignment_2 )? )
            {
            // InternalQualityEffectSpecification.g:1648:1: ( ( rule__Name__NotAssignment_2 )? )
            // InternalQualityEffectSpecification.g:1649:2: ( rule__Name__NotAssignment_2 )?
            {
             before(grammarAccess.getNameAccess().getNotAssignment_2()); 
            // InternalQualityEffectSpecification.g:1650:2: ( rule__Name__NotAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==52) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1650:3: rule__Name__NotAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Name__NotAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameAccess().getNotAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1658:1: rule__Name__Group__3 : rule__Name__Group__3__Impl rule__Name__Group__4 ;
    public final void rule__Name__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1662:1: ( rule__Name__Group__3__Impl rule__Name__Group__4 )
            // InternalQualityEffectSpecification.g:1663:2: rule__Name__Group__3__Impl rule__Name__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Name__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__4();

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
    // InternalQualityEffectSpecification.g:1670:1: rule__Name__Group__3__Impl : ( ( rule__Name__AutonymAssignment_3 ) ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1674:1: ( ( ( rule__Name__AutonymAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:1675:1: ( ( rule__Name__AutonymAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:1675:1: ( ( rule__Name__AutonymAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1676:2: ( rule__Name__AutonymAssignment_3 )
            {
             before(grammarAccess.getNameAccess().getAutonymAssignment_3()); 
            // InternalQualityEffectSpecification.g:1677:2: ( rule__Name__AutonymAssignment_3 )
            // InternalQualityEffectSpecification.g:1677:3: rule__Name__AutonymAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Name__AutonymAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getAutonymAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Name__Group__4"
    // InternalQualityEffectSpecification.g:1685:1: rule__Name__Group__4 : rule__Name__Group__4__Impl ;
    public final void rule__Name__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1689:1: ( rule__Name__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1690:2: rule__Name__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__4__Impl();

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
    // $ANTLR end "rule__Name__Group__4"


    // $ANTLR start "rule__Name__Group__4__Impl"
    // InternalQualityEffectSpecification.g:1696:1: rule__Name__Group__4__Impl : ( ')' ) ;
    public final void rule__Name__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1700:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1701:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1701:1: ( ')' )
            // InternalQualityEffectSpecification.g:1702:2: ')'
            {
             before(grammarAccess.getNameAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__4__Impl"


    // $ANTLR start "rule__Identifier__Group__0"
    // InternalQualityEffectSpecification.g:1712:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1716:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalQualityEffectSpecification.g:1717:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:1724:1: rule__Identifier__Group__0__Impl : ( 'Id' ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1728:1: ( ( 'Id' ) )
            // InternalQualityEffectSpecification.g:1729:1: ( 'Id' )
            {
            // InternalQualityEffectSpecification.g:1729:1: ( 'Id' )
            // InternalQualityEffectSpecification.g:1730:2: 'Id'
            {
             before(grammarAccess.getIdentifierAccess().getIdKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1739:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1743:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // InternalQualityEffectSpecification.g:1744:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalQualityEffectSpecification.g:1751:1: rule__Identifier__Group__1__Impl : ( '(' ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1755:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:1756:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:1756:1: ( '(' )
            // InternalQualityEffectSpecification.g:1757:2: '('
            {
             before(grammarAccess.getIdentifierAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1766:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl rule__Identifier__Group__3 ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1770:1: ( rule__Identifier__Group__2__Impl rule__Identifier__Group__3 )
            // InternalQualityEffectSpecification.g:1771:2: rule__Identifier__Group__2__Impl rule__Identifier__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalQualityEffectSpecification.g:1778:1: rule__Identifier__Group__2__Impl : ( ( rule__Identifier__NotAssignment_2 )? ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1782:1: ( ( ( rule__Identifier__NotAssignment_2 )? ) )
            // InternalQualityEffectSpecification.g:1783:1: ( ( rule__Identifier__NotAssignment_2 )? )
            {
            // InternalQualityEffectSpecification.g:1783:1: ( ( rule__Identifier__NotAssignment_2 )? )
            // InternalQualityEffectSpecification.g:1784:2: ( rule__Identifier__NotAssignment_2 )?
            {
             before(grammarAccess.getIdentifierAccess().getNotAssignment_2()); 
            // InternalQualityEffectSpecification.g:1785:2: ( rule__Identifier__NotAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1785:3: rule__Identifier__NotAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Identifier__NotAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIdentifierAccess().getNotAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1793:1: rule__Identifier__Group__3 : rule__Identifier__Group__3__Impl rule__Identifier__Group__4 ;
    public final void rule__Identifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1797:1: ( rule__Identifier__Group__3__Impl rule__Identifier__Group__4 )
            // InternalQualityEffectSpecification.g:1798:2: rule__Identifier__Group__3__Impl rule__Identifier__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Identifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier__Group__4();

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
    // InternalQualityEffectSpecification.g:1805:1: rule__Identifier__Group__3__Impl : ( ( rule__Identifier__IdAssignment_3 ) ) ;
    public final void rule__Identifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1809:1: ( ( ( rule__Identifier__IdAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:1810:1: ( ( rule__Identifier__IdAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:1810:1: ( ( rule__Identifier__IdAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1811:2: ( rule__Identifier__IdAssignment_3 )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment_3()); 
            // InternalQualityEffectSpecification.g:1812:2: ( rule__Identifier__IdAssignment_3 )
            // InternalQualityEffectSpecification.g:1812:3: rule__Identifier__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getIdAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Identifier__Group__4"
    // InternalQualityEffectSpecification.g:1820:1: rule__Identifier__Group__4 : rule__Identifier__Group__4__Impl ;
    public final void rule__Identifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1824:1: ( rule__Identifier__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1825:2: rule__Identifier__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier__Group__4__Impl();

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
    // $ANTLR end "rule__Identifier__Group__4"


    // $ANTLR start "rule__Identifier__Group__4__Impl"
    // InternalQualityEffectSpecification.g:1831:1: rule__Identifier__Group__4__Impl : ( ')' ) ;
    public final void rule__Identifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1835:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1836:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1836:1: ( ')' )
            // InternalQualityEffectSpecification.g:1837:2: ')'
            {
             before(grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__4__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalQualityEffectSpecification.g:1847:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1851:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalQualityEffectSpecification.g:1852:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalQualityEffectSpecification.g:1859:1: rule__Annotation__Group__0__Impl : ( 'Annotation' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1863:1: ( ( 'Annotation' ) )
            // InternalQualityEffectSpecification.g:1864:1: ( 'Annotation' )
            {
            // InternalQualityEffectSpecification.g:1864:1: ( 'Annotation' )
            // InternalQualityEffectSpecification.g:1865:2: 'Annotation'
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalQualityEffectSpecification.g:1874:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1878:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalQualityEffectSpecification.g:1879:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2();

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalQualityEffectSpecification.g:1886:1: rule__Annotation__Group__1__Impl : ( '(' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1890:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:1891:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:1891:1: ( '(' )
            // InternalQualityEffectSpecification.g:1892:2: '('
            {
             before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // InternalQualityEffectSpecification.g:1901:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1905:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalQualityEffectSpecification.g:1906:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Annotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3();

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
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // InternalQualityEffectSpecification.g:1913:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__NotAssignment_2 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1917:1: ( ( ( rule__Annotation__NotAssignment_2 )? ) )
            // InternalQualityEffectSpecification.g:1918:1: ( ( rule__Annotation__NotAssignment_2 )? )
            {
            // InternalQualityEffectSpecification.g:1918:1: ( ( rule__Annotation__NotAssignment_2 )? )
            // InternalQualityEffectSpecification.g:1919:2: ( rule__Annotation__NotAssignment_2 )?
            {
             before(grammarAccess.getAnnotationAccess().getNotAssignment_2()); 
            // InternalQualityEffectSpecification.g:1920:2: ( rule__Annotation__NotAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1920:3: rule__Annotation__NotAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__NotAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getNotAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__3"
    // InternalQualityEffectSpecification.g:1928:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1932:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // InternalQualityEffectSpecification.g:1933:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Annotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__4();

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
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // InternalQualityEffectSpecification.g:1940:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__AnnotationAssignment_3 ) ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1944:1: ( ( ( rule__Annotation__AnnotationAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:1945:1: ( ( rule__Annotation__AnnotationAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:1945:1: ( ( rule__Annotation__AnnotationAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1946:2: ( rule__Annotation__AnnotationAssignment_3 )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationAssignment_3()); 
            // InternalQualityEffectSpecification.g:1947:2: ( rule__Annotation__AnnotationAssignment_3 )
            // InternalQualityEffectSpecification.g:1947:3: rule__Annotation__AnnotationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__AnnotationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAnnotationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__Annotation__Group__4"
    // InternalQualityEffectSpecification.g:1955:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1959:1: ( rule__Annotation__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1960:2: rule__Annotation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__4__Impl();

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
    // $ANTLR end "rule__Annotation__Group__4"


    // $ANTLR start "rule__Annotation__Group__4__Impl"
    // InternalQualityEffectSpecification.g:1966:1: rule__Annotation__Group__4__Impl : ( ')' ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1970:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1971:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1971:1: ( ')' )
            // InternalQualityEffectSpecification.g:1972:2: ')'
            {
             before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalQualityEffectSpecification.g:1982:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1986:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalQualityEffectSpecification.g:1987:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:1994:1: rule__Type__Group__0__Impl : ( 'Type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1998:1: ( ( 'Type' ) )
            // InternalQualityEffectSpecification.g:1999:1: ( 'Type' )
            {
            // InternalQualityEffectSpecification.g:1999:1: ( 'Type' )
            // InternalQualityEffectSpecification.g:2000:2: 'Type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2009:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2013:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalQualityEffectSpecification.g:2014:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalQualityEffectSpecification.g:2021:1: rule__Type__Group__1__Impl : ( '(' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2025:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2026:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2026:1: ( '(' )
            // InternalQualityEffectSpecification.g:2027:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2036:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2040:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalQualityEffectSpecification.g:2041:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalQualityEffectSpecification.g:2048:1: rule__Type__Group__2__Impl : ( ( rule__Type__NotAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2052:1: ( ( ( rule__Type__NotAssignment_2 )? ) )
            // InternalQualityEffectSpecification.g:2053:1: ( ( rule__Type__NotAssignment_2 )? )
            {
            // InternalQualityEffectSpecification.g:2053:1: ( ( rule__Type__NotAssignment_2 )? )
            // InternalQualityEffectSpecification.g:2054:2: ( rule__Type__NotAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getNotAssignment_2()); 
            // InternalQualityEffectSpecification.g:2055:2: ( rule__Type__NotAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQualityEffectSpecification.g:2055:3: rule__Type__NotAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__NotAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getNotAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2063:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2067:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalQualityEffectSpecification.g:2068:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__4();

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
    // InternalQualityEffectSpecification.g:2075:1: rule__Type__Group__3__Impl : ( ( rule__Type__TypeAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2079:1: ( ( ( rule__Type__TypeAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2080:1: ( ( rule__Type__TypeAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2080:1: ( ( rule__Type__TypeAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2081:2: ( rule__Type__TypeAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_3()); 
            // InternalQualityEffectSpecification.g:2082:2: ( rule__Type__TypeAssignment_3 )
            // InternalQualityEffectSpecification.g:2082:3: rule__Type__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Type__Group__4"
    // InternalQualityEffectSpecification.g:2090:1: rule__Type__Group__4 : rule__Type__Group__4__Impl ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2094:1: ( rule__Type__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2095:2: rule__Type__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__4__Impl();

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
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // InternalQualityEffectSpecification.g:2101:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2105:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2106:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2106:1: ( ')' )
            // InternalQualityEffectSpecification.g:2107:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalQualityEffectSpecification.g:2117:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2121:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalQualityEffectSpecification.g:2122:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalQualityEffectSpecification.g:2129:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2133:1: ( ( 'Role' ) )
            // InternalQualityEffectSpecification.g:2134:1: ( 'Role' )
            {
            // InternalQualityEffectSpecification.g:2134:1: ( 'Role' )
            // InternalQualityEffectSpecification.g:2135:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2144:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2148:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalQualityEffectSpecification.g:2149:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalQualityEffectSpecification.g:2156:1: rule__Role__Group__1__Impl : ( '(' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2160:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2161:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2161:1: ( '(' )
            // InternalQualityEffectSpecification.g:2162:2: '('
            {
             before(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2171:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2175:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalQualityEffectSpecification.g:2176:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalQualityEffectSpecification.g:2183:1: rule__Role__Group__2__Impl : ( ( rule__Role__NotAssignment_2 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2187:1: ( ( ( rule__Role__NotAssignment_2 )? ) )
            // InternalQualityEffectSpecification.g:2188:1: ( ( rule__Role__NotAssignment_2 )? )
            {
            // InternalQualityEffectSpecification.g:2188:1: ( ( rule__Role__NotAssignment_2 )? )
            // InternalQualityEffectSpecification.g:2189:2: ( rule__Role__NotAssignment_2 )?
            {
             before(grammarAccess.getRoleAccess().getNotAssignment_2()); 
            // InternalQualityEffectSpecification.g:2190:2: ( rule__Role__NotAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQualityEffectSpecification.g:2190:3: rule__Role__NotAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__NotAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getNotAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2198:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2202:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalQualityEffectSpecification.g:2203:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalQualityEffectSpecification.g:2210:1: rule__Role__Group__3__Impl : ( ( rule__Role__TypeAssignment_3 ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2214:1: ( ( ( rule__Role__TypeAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2215:1: ( ( rule__Role__TypeAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2215:1: ( ( rule__Role__TypeAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2216:2: ( rule__Role__TypeAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getTypeAssignment_3()); 
            // InternalQualityEffectSpecification.g:2217:2: ( rule__Role__TypeAssignment_3 )
            // InternalQualityEffectSpecification.g:2217:3: rule__Role__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Role__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2225:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2229:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalQualityEffectSpecification.g:2230:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__5();

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
    // InternalQualityEffectSpecification.g:2237:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )? ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2241:1: ( ( ( rule__Role__Group_4__0 )? ) )
            // InternalQualityEffectSpecification.g:2242:1: ( ( rule__Role__Group_4__0 )? )
            {
            // InternalQualityEffectSpecification.g:2242:1: ( ( rule__Role__Group_4__0 )? )
            // InternalQualityEffectSpecification.g:2243:2: ( rule__Role__Group_4__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // InternalQualityEffectSpecification.g:2244:2: ( rule__Role__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQualityEffectSpecification.g:2244:3: rule__Role__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Role__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Role__Group__5"
    // InternalQualityEffectSpecification.g:2252:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2256:1: ( rule__Role__Group__5__Impl )
            // InternalQualityEffectSpecification.g:2257:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__5__Impl();

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
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // InternalQualityEffectSpecification.g:2263:1: rule__Role__Group__5__Impl : ( ')' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2267:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2268:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2268:1: ( ')' )
            // InternalQualityEffectSpecification.g:2269:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group_4__0"
    // InternalQualityEffectSpecification.g:2279:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2283:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // InternalQualityEffectSpecification.g:2284:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__1();

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
    // $ANTLR end "rule__Role__Group_4__0"


    // $ANTLR start "rule__Role__Group_4__0__Impl"
    // InternalQualityEffectSpecification.g:2291:1: rule__Role__Group_4__0__Impl : ( 'with' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2295:1: ( ( 'with' ) )
            // InternalQualityEffectSpecification.g:2296:1: ( 'with' )
            {
            // InternalQualityEffectSpecification.g:2296:1: ( 'with' )
            // InternalQualityEffectSpecification.g:2297:2: 'with'
            {
             before(grammarAccess.getRoleAccess().getWithKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getWithKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0__Impl"


    // $ANTLR start "rule__Role__Group_4__1"
    // InternalQualityEffectSpecification.g:2306:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl rule__Role__Group_4__2 ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2310:1: ( rule__Role__Group_4__1__Impl rule__Role__Group_4__2 )
            // InternalQualityEffectSpecification.g:2311:2: rule__Role__Group_4__1__Impl rule__Role__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__Role__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4__2();

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
    // $ANTLR end "rule__Role__Group_4__1"


    // $ANTLR start "rule__Role__Group_4__1__Impl"
    // InternalQualityEffectSpecification.g:2318:1: rule__Role__Group_4__1__Impl : ( ( rule__Role__PropertiesAssignment_4_1 ) ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2322:1: ( ( ( rule__Role__PropertiesAssignment_4_1 ) ) )
            // InternalQualityEffectSpecification.g:2323:1: ( ( rule__Role__PropertiesAssignment_4_1 ) )
            {
            // InternalQualityEffectSpecification.g:2323:1: ( ( rule__Role__PropertiesAssignment_4_1 ) )
            // InternalQualityEffectSpecification.g:2324:2: ( rule__Role__PropertiesAssignment_4_1 )
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_4_1()); 
            // InternalQualityEffectSpecification.g:2325:2: ( rule__Role__PropertiesAssignment_4_1 )
            // InternalQualityEffectSpecification.g:2325:3: rule__Role__PropertiesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__PropertiesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1__Impl"


    // $ANTLR start "rule__Role__Group_4__2"
    // InternalQualityEffectSpecification.g:2333:1: rule__Role__Group_4__2 : rule__Role__Group_4__2__Impl ;
    public final void rule__Role__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2337:1: ( rule__Role__Group_4__2__Impl )
            // InternalQualityEffectSpecification.g:2338:2: rule__Role__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_4__2__Impl();

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
    // $ANTLR end "rule__Role__Group_4__2"


    // $ANTLR start "rule__Role__Group_4__2__Impl"
    // InternalQualityEffectSpecification.g:2344:1: rule__Role__Group_4__2__Impl : ( ( rule__Role__Group_4_2__0 )* ) ;
    public final void rule__Role__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2348:1: ( ( ( rule__Role__Group_4_2__0 )* ) )
            // InternalQualityEffectSpecification.g:2349:1: ( ( rule__Role__Group_4_2__0 )* )
            {
            // InternalQualityEffectSpecification.g:2349:1: ( ( rule__Role__Group_4_2__0 )* )
            // InternalQualityEffectSpecification.g:2350:2: ( rule__Role__Group_4_2__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4_2()); 
            // InternalQualityEffectSpecification.g:2351:2: ( rule__Role__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2351:3: rule__Role__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Role__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__2__Impl"


    // $ANTLR start "rule__Role__Group_4_2__0"
    // InternalQualityEffectSpecification.g:2360:1: rule__Role__Group_4_2__0 : rule__Role__Group_4_2__0__Impl rule__Role__Group_4_2__1 ;
    public final void rule__Role__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2364:1: ( rule__Role__Group_4_2__0__Impl rule__Role__Group_4_2__1 )
            // InternalQualityEffectSpecification.g:2365:2: rule__Role__Group_4_2__0__Impl rule__Role__Group_4_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Role__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group_4_2__1();

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
    // $ANTLR end "rule__Role__Group_4_2__0"


    // $ANTLR start "rule__Role__Group_4_2__0__Impl"
    // InternalQualityEffectSpecification.g:2372:1: rule__Role__Group_4_2__0__Impl : ( 'and' ) ;
    public final void rule__Role__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2376:1: ( ( 'and' ) )
            // InternalQualityEffectSpecification.g:2377:1: ( 'and' )
            {
            // InternalQualityEffectSpecification.g:2377:1: ( 'and' )
            // InternalQualityEffectSpecification.g:2378:2: 'and'
            {
             before(grammarAccess.getRoleAccess().getAndKeyword_4_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getAndKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4_2__0__Impl"


    // $ANTLR start "rule__Role__Group_4_2__1"
    // InternalQualityEffectSpecification.g:2387:1: rule__Role__Group_4_2__1 : rule__Role__Group_4_2__1__Impl ;
    public final void rule__Role__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2391:1: ( rule__Role__Group_4_2__1__Impl )
            // InternalQualityEffectSpecification.g:2392:2: rule__Role__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Role__Group_4_2__1"


    // $ANTLR start "rule__Role__Group_4_2__1__Impl"
    // InternalQualityEffectSpecification.g:2398:1: rule__Role__Group_4_2__1__Impl : ( ( rule__Role__PropertiesAssignment_4_2_1 ) ) ;
    public final void rule__Role__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2402:1: ( ( ( rule__Role__PropertiesAssignment_4_2_1 ) ) )
            // InternalQualityEffectSpecification.g:2403:1: ( ( rule__Role__PropertiesAssignment_4_2_1 ) )
            {
            // InternalQualityEffectSpecification.g:2403:1: ( ( rule__Role__PropertiesAssignment_4_2_1 ) )
            // InternalQualityEffectSpecification.g:2404:2: ( rule__Role__PropertiesAssignment_4_2_1 )
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_4_2_1()); 
            // InternalQualityEffectSpecification.g:2405:2: ( rule__Role__PropertiesAssignment_4_2_1 )
            // InternalQualityEffectSpecification.g:2405:3: rule__Role__PropertiesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__PropertiesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4_2__1__Impl"


    // $ANTLR start "rule__Assembly__Group__0"
    // InternalQualityEffectSpecification.g:2414:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2418:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalQualityEffectSpecification.g:2419:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:2426:1: rule__Assembly__Group__0__Impl : ( 'Assembly' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2430:1: ( ( 'Assembly' ) )
            // InternalQualityEffectSpecification.g:2431:1: ( 'Assembly' )
            {
            // InternalQualityEffectSpecification.g:2431:1: ( 'Assembly' )
            // InternalQualityEffectSpecification.g:2432:2: 'Assembly'
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2441:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2445:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalQualityEffectSpecification.g:2446:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalQualityEffectSpecification.g:2453:1: rule__Assembly__Group__1__Impl : ( '(' ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2457:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2458:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2458:1: ( '(' )
            // InternalQualityEffectSpecification.g:2459:2: '('
            {
             before(grammarAccess.getAssemblyAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2468:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2472:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalQualityEffectSpecification.g:2473:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalQualityEffectSpecification.g:2480:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__NotAssignment_2 )? ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2484:1: ( ( ( rule__Assembly__NotAssignment_2 )? ) )
            // InternalQualityEffectSpecification.g:2485:1: ( ( rule__Assembly__NotAssignment_2 )? )
            {
            // InternalQualityEffectSpecification.g:2485:1: ( ( rule__Assembly__NotAssignment_2 )? )
            // InternalQualityEffectSpecification.g:2486:2: ( rule__Assembly__NotAssignment_2 )?
            {
             before(grammarAccess.getAssemblyAccess().getNotAssignment_2()); 
            // InternalQualityEffectSpecification.g:2487:2: ( rule__Assembly__NotAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQualityEffectSpecification.g:2487:3: rule__Assembly__NotAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assembly__NotAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyAccess().getNotAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2495:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2499:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalQualityEffectSpecification.g:2500:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalQualityEffectSpecification.g:2507:1: rule__Assembly__Group__3__Impl : ( ( rule__Assembly__TypeAssignment_3 ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2511:1: ( ( ( rule__Assembly__TypeAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2512:1: ( ( rule__Assembly__TypeAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2512:1: ( ( rule__Assembly__TypeAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2513:2: ( rule__Assembly__TypeAssignment_3 )
            {
             before(grammarAccess.getAssemblyAccess().getTypeAssignment_3()); 
            // InternalQualityEffectSpecification.g:2514:2: ( rule__Assembly__TypeAssignment_3 )
            // InternalQualityEffectSpecification.g:2514:3: rule__Assembly__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2522:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl rule__Assembly__Group__5 ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2526:1: ( rule__Assembly__Group__4__Impl rule__Assembly__Group__5 )
            // InternalQualityEffectSpecification.g:2527:2: rule__Assembly__Group__4__Impl rule__Assembly__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Assembly__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group__5();

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
    // InternalQualityEffectSpecification.g:2534:1: rule__Assembly__Group__4__Impl : ( ( rule__Assembly__Group_4__0 )? ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2538:1: ( ( ( rule__Assembly__Group_4__0 )? ) )
            // InternalQualityEffectSpecification.g:2539:1: ( ( rule__Assembly__Group_4__0 )? )
            {
            // InternalQualityEffectSpecification.g:2539:1: ( ( rule__Assembly__Group_4__0 )? )
            // InternalQualityEffectSpecification.g:2540:2: ( rule__Assembly__Group_4__0 )?
            {
             before(grammarAccess.getAssemblyAccess().getGroup_4()); 
            // InternalQualityEffectSpecification.g:2541:2: ( rule__Assembly__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQualityEffectSpecification.g:2541:3: rule__Assembly__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assembly__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Assembly__Group__5"
    // InternalQualityEffectSpecification.g:2549:1: rule__Assembly__Group__5 : rule__Assembly__Group__5__Impl ;
    public final void rule__Assembly__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2553:1: ( rule__Assembly__Group__5__Impl )
            // InternalQualityEffectSpecification.g:2554:2: rule__Assembly__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group__5__Impl();

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
    // $ANTLR end "rule__Assembly__Group__5"


    // $ANTLR start "rule__Assembly__Group__5__Impl"
    // InternalQualityEffectSpecification.g:2560:1: rule__Assembly__Group__5__Impl : ( ')' ) ;
    public final void rule__Assembly__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2564:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2565:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2565:1: ( ')' )
            // InternalQualityEffectSpecification.g:2566:2: ')'
            {
             before(grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group__5__Impl"


    // $ANTLR start "rule__Assembly__Group_4__0"
    // InternalQualityEffectSpecification.g:2576:1: rule__Assembly__Group_4__0 : rule__Assembly__Group_4__0__Impl rule__Assembly__Group_4__1 ;
    public final void rule__Assembly__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2580:1: ( rule__Assembly__Group_4__0__Impl rule__Assembly__Group_4__1 )
            // InternalQualityEffectSpecification.g:2581:2: rule__Assembly__Group_4__0__Impl rule__Assembly__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Assembly__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assembly__Group_4__1();

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
    // $ANTLR end "rule__Assembly__Group_4__0"


    // $ANTLR start "rule__Assembly__Group_4__0__Impl"
    // InternalQualityEffectSpecification.g:2588:1: rule__Assembly__Group_4__0__Impl : ( 'with' ) ;
    public final void rule__Assembly__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2592:1: ( ( 'with' ) )
            // InternalQualityEffectSpecification.g:2593:1: ( 'with' )
            {
            // InternalQualityEffectSpecification.g:2593:1: ( 'with' )
            // InternalQualityEffectSpecification.g:2594:2: 'with'
            {
             before(grammarAccess.getAssemblyAccess().getWithKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getWithKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group_4__0__Impl"


    // $ANTLR start "rule__Assembly__Group_4__1"
    // InternalQualityEffectSpecification.g:2603:1: rule__Assembly__Group_4__1 : rule__Assembly__Group_4__1__Impl ;
    public final void rule__Assembly__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2607:1: ( rule__Assembly__Group_4__1__Impl )
            // InternalQualityEffectSpecification.g:2608:2: rule__Assembly__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__Group_4__1__Impl();

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
    // $ANTLR end "rule__Assembly__Group_4__1"


    // $ANTLR start "rule__Assembly__Group_4__1__Impl"
    // InternalQualityEffectSpecification.g:2614:1: rule__Assembly__Group_4__1__Impl : ( ( rule__Assembly__ComponentAssignment_4_1 ) ) ;
    public final void rule__Assembly__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2618:1: ( ( ( rule__Assembly__ComponentAssignment_4_1 ) ) )
            // InternalQualityEffectSpecification.g:2619:1: ( ( rule__Assembly__ComponentAssignment_4_1 ) )
            {
            // InternalQualityEffectSpecification.g:2619:1: ( ( rule__Assembly__ComponentAssignment_4_1 ) )
            // InternalQualityEffectSpecification.g:2620:2: ( rule__Assembly__ComponentAssignment_4_1 )
            {
             before(grammarAccess.getAssemblyAccess().getComponentAssignment_4_1()); 
            // InternalQualityEffectSpecification.g:2621:2: ( rule__Assembly__ComponentAssignment_4_1 )
            // InternalQualityEffectSpecification.g:2621:3: rule__Assembly__ComponentAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Assembly__ComponentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getComponentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__Group_4__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalQualityEffectSpecification.g:2630:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2634:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalQualityEffectSpecification.g:2635:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:2642:1: rule__Resource__Group__0__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2646:1: ( ( 'Resource' ) )
            // InternalQualityEffectSpecification.g:2647:1: ( 'Resource' )
            {
            // InternalQualityEffectSpecification.g:2647:1: ( 'Resource' )
            // InternalQualityEffectSpecification.g:2648:2: 'Resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2657:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2661:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalQualityEffectSpecification.g:2662:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalQualityEffectSpecification.g:2669:1: rule__Resource__Group__1__Impl : ( '(' ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2673:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2674:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2674:1: ( '(' )
            // InternalQualityEffectSpecification.g:2675:2: '('
            {
             before(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2684:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2688:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalQualityEffectSpecification.g:2689:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

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
    // InternalQualityEffectSpecification.g:2696:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__PropertiesAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2700:1: ( ( ( rule__Resource__PropertiesAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:2701:1: ( ( rule__Resource__PropertiesAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:2701:1: ( ( rule__Resource__PropertiesAssignment_2 ) )
            // InternalQualityEffectSpecification.g:2702:2: ( rule__Resource__PropertiesAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_2()); 
            // InternalQualityEffectSpecification.g:2703:2: ( rule__Resource__PropertiesAssignment_2 )
            // InternalQualityEffectSpecification.g:2703:3: rule__Resource__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__PropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Resource__Group__3"
    // InternalQualityEffectSpecification.g:2711:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2715:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalQualityEffectSpecification.g:2716:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__4();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalQualityEffectSpecification.g:2723:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__Group_3__0 )* ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2727:1: ( ( ( rule__Resource__Group_3__0 )* ) )
            // InternalQualityEffectSpecification.g:2728:1: ( ( rule__Resource__Group_3__0 )* )
            {
            // InternalQualityEffectSpecification.g:2728:1: ( ( rule__Resource__Group_3__0 )* )
            // InternalQualityEffectSpecification.g:2729:2: ( rule__Resource__Group_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_3()); 
            // InternalQualityEffectSpecification.g:2730:2: ( rule__Resource__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2730:3: rule__Resource__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Resource__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // InternalQualityEffectSpecification.g:2738:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2742:1: ( rule__Resource__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2743:2: rule__Resource__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__4__Impl();

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
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // InternalQualityEffectSpecification.g:2749:1: rule__Resource__Group__4__Impl : ( ')' ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2753:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2754:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2754:1: ( ')' )
            // InternalQualityEffectSpecification.g:2755:2: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group_3__0"
    // InternalQualityEffectSpecification.g:2765:1: rule__Resource__Group_3__0 : rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 ;
    public final void rule__Resource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2769:1: ( rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 )
            // InternalQualityEffectSpecification.g:2770:2: rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Resource__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_3__1();

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
    // $ANTLR end "rule__Resource__Group_3__0"


    // $ANTLR start "rule__Resource__Group_3__0__Impl"
    // InternalQualityEffectSpecification.g:2777:1: rule__Resource__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__Resource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2781:1: ( ( 'and' ) )
            // InternalQualityEffectSpecification.g:2782:1: ( 'and' )
            {
            // InternalQualityEffectSpecification.g:2782:1: ( 'and' )
            // InternalQualityEffectSpecification.g:2783:2: 'and'
            {
             before(grammarAccess.getResourceAccess().getAndKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_3__0__Impl"


    // $ANTLR start "rule__Resource__Group_3__1"
    // InternalQualityEffectSpecification.g:2792:1: rule__Resource__Group_3__1 : rule__Resource__Group_3__1__Impl ;
    public final void rule__Resource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2796:1: ( rule__Resource__Group_3__1__Impl )
            // InternalQualityEffectSpecification.g:2797:2: rule__Resource__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_3__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_3__1"


    // $ANTLR start "rule__Resource__Group_3__1__Impl"
    // InternalQualityEffectSpecification.g:2803:1: rule__Resource__Group_3__1__Impl : ( ( rule__Resource__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Resource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2807:1: ( ( ( rule__Resource__PropertiesAssignment_3_1 ) ) )
            // InternalQualityEffectSpecification.g:2808:1: ( ( rule__Resource__PropertiesAssignment_3_1 ) )
            {
            // InternalQualityEffectSpecification.g:2808:1: ( ( rule__Resource__PropertiesAssignment_3_1 ) )
            // InternalQualityEffectSpecification.g:2809:2: ( rule__Resource__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_3_1()); 
            // InternalQualityEffectSpecification.g:2810:2: ( rule__Resource__PropertiesAssignment_3_1 )
            // InternalQualityEffectSpecification.g:2810:3: rule__Resource__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_3__1__Impl"


    // $ANTLR start "rule__NQA__Group__0"
    // InternalQualityEffectSpecification.g:2819:1: rule__NQA__Group__0 : rule__NQA__Group__0__Impl rule__NQA__Group__1 ;
    public final void rule__NQA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2823:1: ( rule__NQA__Group__0__Impl rule__NQA__Group__1 )
            // InternalQualityEffectSpecification.g:2824:2: rule__NQA__Group__0__Impl rule__NQA__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:2831:1: rule__NQA__Group__0__Impl : ( 'NQA' ) ;
    public final void rule__NQA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2835:1: ( ( 'NQA' ) )
            // InternalQualityEffectSpecification.g:2836:1: ( 'NQA' )
            {
            // InternalQualityEffectSpecification.g:2836:1: ( 'NQA' )
            // InternalQualityEffectSpecification.g:2837:2: 'NQA'
            {
             before(grammarAccess.getNQAAccess().getNQAKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2846:1: rule__NQA__Group__1 : rule__NQA__Group__1__Impl rule__NQA__Group__2 ;
    public final void rule__NQA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2850:1: ( rule__NQA__Group__1__Impl rule__NQA__Group__2 )
            // InternalQualityEffectSpecification.g:2851:2: rule__NQA__Group__1__Impl rule__NQA__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalQualityEffectSpecification.g:2858:1: rule__NQA__Group__1__Impl : ( '(' ) ;
    public final void rule__NQA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2862:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2863:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2863:1: ( '(' )
            // InternalQualityEffectSpecification.g:2864:2: '('
            {
             before(grammarAccess.getNQAAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2873:1: rule__NQA__Group__2 : rule__NQA__Group__2__Impl rule__NQA__Group__3 ;
    public final void rule__NQA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2877:1: ( rule__NQA__Group__2__Impl rule__NQA__Group__3 )
            // InternalQualityEffectSpecification.g:2878:2: rule__NQA__Group__2__Impl rule__NQA__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalQualityEffectSpecification.g:2885:1: rule__NQA__Group__2__Impl : ( ( rule__NQA__QualityAssignment_2 ) ) ;
    public final void rule__NQA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2889:1: ( ( ( rule__NQA__QualityAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:2890:1: ( ( rule__NQA__QualityAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:2890:1: ( ( rule__NQA__QualityAssignment_2 ) )
            // InternalQualityEffectSpecification.g:2891:2: ( rule__NQA__QualityAssignment_2 )
            {
             before(grammarAccess.getNQAAccess().getQualityAssignment_2()); 
            // InternalQualityEffectSpecification.g:2892:2: ( rule__NQA__QualityAssignment_2 )
            // InternalQualityEffectSpecification.g:2892:3: rule__NQA__QualityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NQA__QualityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNQAAccess().getQualityAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2900:1: rule__NQA__Group__3 : rule__NQA__Group__3__Impl rule__NQA__Group__4 ;
    public final void rule__NQA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2904:1: ( rule__NQA__Group__3__Impl rule__NQA__Group__4 )
            // InternalQualityEffectSpecification.g:2905:2: rule__NQA__Group__3__Impl rule__NQA__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalQualityEffectSpecification.g:2912:1: rule__NQA__Group__3__Impl : ( ( rule__NQA__TypeAssignment_3 ) ) ;
    public final void rule__NQA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2916:1: ( ( ( rule__NQA__TypeAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2917:1: ( ( rule__NQA__TypeAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2917:1: ( ( rule__NQA__TypeAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2918:2: ( rule__NQA__TypeAssignment_3 )
            {
             before(grammarAccess.getNQAAccess().getTypeAssignment_3()); 
            // InternalQualityEffectSpecification.g:2919:2: ( rule__NQA__TypeAssignment_3 )
            // InternalQualityEffectSpecification.g:2919:3: rule__NQA__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NQA__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNQAAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:2927:1: rule__NQA__Group__4 : rule__NQA__Group__4__Impl rule__NQA__Group__5 ;
    public final void rule__NQA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2931:1: ( rule__NQA__Group__4__Impl rule__NQA__Group__5 )
            // InternalQualityEffectSpecification.g:2932:2: rule__NQA__Group__4__Impl rule__NQA__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__NQA__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NQA__Group__5();

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
    // InternalQualityEffectSpecification.g:2939:1: rule__NQA__Group__4__Impl : ( ( rule__NQA__ElementAssignment_4 ) ) ;
    public final void rule__NQA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2943:1: ( ( ( rule__NQA__ElementAssignment_4 ) ) )
            // InternalQualityEffectSpecification.g:2944:1: ( ( rule__NQA__ElementAssignment_4 ) )
            {
            // InternalQualityEffectSpecification.g:2944:1: ( ( rule__NQA__ElementAssignment_4 ) )
            // InternalQualityEffectSpecification.g:2945:2: ( rule__NQA__ElementAssignment_4 )
            {
             before(grammarAccess.getNQAAccess().getElementAssignment_4()); 
            // InternalQualityEffectSpecification.g:2946:2: ( rule__NQA__ElementAssignment_4 )
            // InternalQualityEffectSpecification.g:2946:3: rule__NQA__ElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__NQA__ElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNQAAccess().getElementAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__NQA__Group__5"
    // InternalQualityEffectSpecification.g:2954:1: rule__NQA__Group__5 : rule__NQA__Group__5__Impl ;
    public final void rule__NQA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2958:1: ( rule__NQA__Group__5__Impl )
            // InternalQualityEffectSpecification.g:2959:2: rule__NQA__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NQA__Group__5__Impl();

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
    // $ANTLR end "rule__NQA__Group__5"


    // $ANTLR start "rule__NQA__Group__5__Impl"
    // InternalQualityEffectSpecification.g:2965:1: rule__NQA__Group__5__Impl : ( ')' ) ;
    public final void rule__NQA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2969:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2970:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2970:1: ( ')' )
            // InternalQualityEffectSpecification.g:2971:2: ')'
            {
             before(grammarAccess.getNQAAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NQA__Group__5__Impl"


    // $ANTLR start "rule__Reasoning__Group__0"
    // InternalQualityEffectSpecification.g:2981:1: rule__Reasoning__Group__0 : rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 ;
    public final void rule__Reasoning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2985:1: ( rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 )
            // InternalQualityEffectSpecification.g:2986:2: rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:2993:1: rule__Reasoning__Group__0__Impl : ( 'Reasoning' ) ;
    public final void rule__Reasoning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2997:1: ( ( 'Reasoning' ) )
            // InternalQualityEffectSpecification.g:2998:1: ( 'Reasoning' )
            {
            // InternalQualityEffectSpecification.g:2998:1: ( 'Reasoning' )
            // InternalQualityEffectSpecification.g:2999:2: 'Reasoning'
            {
             before(grammarAccess.getReasoningAccess().getReasoningKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:3008:1: rule__Reasoning__Group__1 : rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 ;
    public final void rule__Reasoning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3012:1: ( rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 )
            // InternalQualityEffectSpecification.g:3013:2: rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalQualityEffectSpecification.g:3020:1: rule__Reasoning__Group__1__Impl : ( '(' ) ;
    public final void rule__Reasoning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3024:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:3025:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:3025:1: ( '(' )
            // InternalQualityEffectSpecification.g:3026:2: '('
            {
             before(grammarAccess.getReasoningAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3035:1: rule__Reasoning__Group__2 : rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 ;
    public final void rule__Reasoning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3039:1: ( rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 )
            // InternalQualityEffectSpecification.g:3040:2: rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalQualityEffectSpecification.g:3047:1: rule__Reasoning__Group__2__Impl : ( ( rule__Reasoning__QualityAssignment_2 ) ) ;
    public final void rule__Reasoning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3051:1: ( ( ( rule__Reasoning__QualityAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:3052:1: ( ( rule__Reasoning__QualityAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:3052:1: ( ( rule__Reasoning__QualityAssignment_2 ) )
            // InternalQualityEffectSpecification.g:3053:2: ( rule__Reasoning__QualityAssignment_2 )
            {
             before(grammarAccess.getReasoningAccess().getQualityAssignment_2()); 
            // InternalQualityEffectSpecification.g:3054:2: ( rule__Reasoning__QualityAssignment_2 )
            // InternalQualityEffectSpecification.g:3054:3: rule__Reasoning__QualityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reasoning__QualityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getQualityAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3062:1: rule__Reasoning__Group__3 : rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 ;
    public final void rule__Reasoning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3066:1: ( rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 )
            // InternalQualityEffectSpecification.g:3067:2: rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalQualityEffectSpecification.g:3074:1: rule__Reasoning__Group__3__Impl : ( '=' ) ;
    public final void rule__Reasoning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3078:1: ( ( '=' ) )
            // InternalQualityEffectSpecification.g:3079:1: ( '=' )
            {
            // InternalQualityEffectSpecification.g:3079:1: ( '=' )
            // InternalQualityEffectSpecification.g:3080:2: '='
            {
             before(grammarAccess.getReasoningAccess().getEqualsSignKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3089:1: rule__Reasoning__Group__4 : rule__Reasoning__Group__4__Impl rule__Reasoning__Group__5 ;
    public final void rule__Reasoning__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3093:1: ( rule__Reasoning__Group__4__Impl rule__Reasoning__Group__5 )
            // InternalQualityEffectSpecification.g:3094:2: rule__Reasoning__Group__4__Impl rule__Reasoning__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Reasoning__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__5();

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
    // InternalQualityEffectSpecification.g:3101:1: rule__Reasoning__Group__4__Impl : ( ( rule__Reasoning__RulesAssignment_4 ) ) ;
    public final void rule__Reasoning__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3105:1: ( ( ( rule__Reasoning__RulesAssignment_4 ) ) )
            // InternalQualityEffectSpecification.g:3106:1: ( ( rule__Reasoning__RulesAssignment_4 ) )
            {
            // InternalQualityEffectSpecification.g:3106:1: ( ( rule__Reasoning__RulesAssignment_4 ) )
            // InternalQualityEffectSpecification.g:3107:2: ( rule__Reasoning__RulesAssignment_4 )
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_4()); 
            // InternalQualityEffectSpecification.g:3108:2: ( rule__Reasoning__RulesAssignment_4 )
            // InternalQualityEffectSpecification.g:3108:3: rule__Reasoning__RulesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reasoning__RulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getRulesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Reasoning__Group__5"
    // InternalQualityEffectSpecification.g:3116:1: rule__Reasoning__Group__5 : rule__Reasoning__Group__5__Impl rule__Reasoning__Group__6 ;
    public final void rule__Reasoning__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3120:1: ( rule__Reasoning__Group__5__Impl rule__Reasoning__Group__6 )
            // InternalQualityEffectSpecification.g:3121:2: rule__Reasoning__Group__5__Impl rule__Reasoning__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Reasoning__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__6();

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
    // $ANTLR end "rule__Reasoning__Group__5"


    // $ANTLR start "rule__Reasoning__Group__5__Impl"
    // InternalQualityEffectSpecification.g:3128:1: rule__Reasoning__Group__5__Impl : ( ( rule__Reasoning__Group_5__0 )* ) ;
    public final void rule__Reasoning__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3132:1: ( ( ( rule__Reasoning__Group_5__0 )* ) )
            // InternalQualityEffectSpecification.g:3133:1: ( ( rule__Reasoning__Group_5__0 )* )
            {
            // InternalQualityEffectSpecification.g:3133:1: ( ( rule__Reasoning__Group_5__0 )* )
            // InternalQualityEffectSpecification.g:3134:2: ( rule__Reasoning__Group_5__0 )*
            {
             before(grammarAccess.getReasoningAccess().getGroup_5()); 
            // InternalQualityEffectSpecification.g:3135:2: ( rule__Reasoning__Group_5__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:3135:3: rule__Reasoning__Group_5__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Reasoning__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getReasoningAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasoning__Group__5__Impl"


    // $ANTLR start "rule__Reasoning__Group__6"
    // InternalQualityEffectSpecification.g:3143:1: rule__Reasoning__Group__6 : rule__Reasoning__Group__6__Impl ;
    public final void rule__Reasoning__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3147:1: ( rule__Reasoning__Group__6__Impl )
            // InternalQualityEffectSpecification.g:3148:2: rule__Reasoning__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reasoning__Group__6__Impl();

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
    // $ANTLR end "rule__Reasoning__Group__6"


    // $ANTLR start "rule__Reasoning__Group__6__Impl"
    // InternalQualityEffectSpecification.g:3154:1: rule__Reasoning__Group__6__Impl : ( ')' ) ;
    public final void rule__Reasoning__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3158:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:3159:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:3159:1: ( ')' )
            // InternalQualityEffectSpecification.g:3160:2: ')'
            {
             before(grammarAccess.getReasoningAccess().getRightParenthesisKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasoning__Group__6__Impl"


    // $ANTLR start "rule__Reasoning__Group_5__0"
    // InternalQualityEffectSpecification.g:3170:1: rule__Reasoning__Group_5__0 : rule__Reasoning__Group_5__0__Impl rule__Reasoning__Group_5__1 ;
    public final void rule__Reasoning__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3174:1: ( rule__Reasoning__Group_5__0__Impl rule__Reasoning__Group_5__1 )
            // InternalQualityEffectSpecification.g:3175:2: rule__Reasoning__Group_5__0__Impl rule__Reasoning__Group_5__1
            {
            pushFollow(FOLLOW_27);
            rule__Reasoning__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reasoning__Group_5__1();

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
    // $ANTLR end "rule__Reasoning__Group_5__0"


    // $ANTLR start "rule__Reasoning__Group_5__0__Impl"
    // InternalQualityEffectSpecification.g:3182:1: rule__Reasoning__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Reasoning__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3186:1: ( ( ',' ) )
            // InternalQualityEffectSpecification.g:3187:1: ( ',' )
            {
            // InternalQualityEffectSpecification.g:3187:1: ( ',' )
            // InternalQualityEffectSpecification.g:3188:2: ','
            {
             before(grammarAccess.getReasoningAccess().getCommaKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasoning__Group_5__0__Impl"


    // $ANTLR start "rule__Reasoning__Group_5__1"
    // InternalQualityEffectSpecification.g:3197:1: rule__Reasoning__Group_5__1 : rule__Reasoning__Group_5__1__Impl ;
    public final void rule__Reasoning__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3201:1: ( rule__Reasoning__Group_5__1__Impl )
            // InternalQualityEffectSpecification.g:3202:2: rule__Reasoning__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reasoning__Group_5__1__Impl();

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
    // $ANTLR end "rule__Reasoning__Group_5__1"


    // $ANTLR start "rule__Reasoning__Group_5__1__Impl"
    // InternalQualityEffectSpecification.g:3208:1: rule__Reasoning__Group_5__1__Impl : ( ( rule__Reasoning__RulesAssignment_5_1 ) ) ;
    public final void rule__Reasoning__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3212:1: ( ( ( rule__Reasoning__RulesAssignment_5_1 ) ) )
            // InternalQualityEffectSpecification.g:3213:1: ( ( rule__Reasoning__RulesAssignment_5_1 ) )
            {
            // InternalQualityEffectSpecification.g:3213:1: ( ( rule__Reasoning__RulesAssignment_5_1 ) )
            // InternalQualityEffectSpecification.g:3214:2: ( rule__Reasoning__RulesAssignment_5_1 )
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_5_1()); 
            // InternalQualityEffectSpecification.g:3215:2: ( rule__Reasoning__RulesAssignment_5_1 )
            // InternalQualityEffectSpecification.g:3215:3: rule__Reasoning__RulesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Reasoning__RulesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getRulesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasoning__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalQualityEffectSpecification.g:3224:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3228:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalQualityEffectSpecification.g:3229:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:3236:1: rule__Rule__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3240:1: ( ( 'Rule' ) )
            // InternalQualityEffectSpecification.g:3241:1: ( 'Rule' )
            {
            // InternalQualityEffectSpecification.g:3241:1: ( 'Rule' )
            // InternalQualityEffectSpecification.g:3242:2: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3251:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3255:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalQualityEffectSpecification.g:3256:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalQualityEffectSpecification.g:3263:1: rule__Rule__Group__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3267:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:3268:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:3268:1: ( '(' )
            // InternalQualityEffectSpecification.g:3269:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3278:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3282:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalQualityEffectSpecification.g:3283:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalQualityEffectSpecification.g:3290:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__QualitiesAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3294:1: ( ( ( rule__Rule__QualitiesAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:3295:1: ( ( rule__Rule__QualitiesAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:3295:1: ( ( rule__Rule__QualitiesAssignment_2 ) )
            // InternalQualityEffectSpecification.g:3296:2: ( rule__Rule__QualitiesAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_2()); 
            // InternalQualityEffectSpecification.g:3297:2: ( rule__Rule__QualitiesAssignment_2 )
            // InternalQualityEffectSpecification.g:3297:3: rule__Rule__QualitiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__QualitiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQualitiesAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3305:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3309:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalQualityEffectSpecification.g:3310:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalQualityEffectSpecification.g:3317:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Group_3__0 )* ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3321:1: ( ( ( rule__Rule__Group_3__0 )* ) )
            // InternalQualityEffectSpecification.g:3322:1: ( ( rule__Rule__Group_3__0 )* )
            {
            // InternalQualityEffectSpecification.g:3322:1: ( ( rule__Rule__Group_3__0 )* )
            // InternalQualityEffectSpecification.g:3323:2: ( rule__Rule__Group_3__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_3()); 
            // InternalQualityEffectSpecification.g:3324:2: ( rule__Rule__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==49) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:3324:3: rule__Rule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Rule__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3332:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3336:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalQualityEffectSpecification.g:3337:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

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
    // InternalQualityEffectSpecification.g:3344:1: rule__Rule__Group__4__Impl : ( '=' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3348:1: ( ( '=' ) )
            // InternalQualityEffectSpecification.g:3349:1: ( '=' )
            {
            // InternalQualityEffectSpecification.g:3349:1: ( '=' )
            // InternalQualityEffectSpecification.g:3350:2: '='
            {
             before(grammarAccess.getRuleAccess().getEqualsSignKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rule__Group__5"
    // InternalQualityEffectSpecification.g:3359:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3363:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalQualityEffectSpecification.g:3364:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalQualityEffectSpecification.g:3371:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__EntriesAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3375:1: ( ( ( rule__Rule__EntriesAssignment_5 ) ) )
            // InternalQualityEffectSpecification.g:3376:1: ( ( rule__Rule__EntriesAssignment_5 ) )
            {
            // InternalQualityEffectSpecification.g:3376:1: ( ( rule__Rule__EntriesAssignment_5 ) )
            // InternalQualityEffectSpecification.g:3377:2: ( rule__Rule__EntriesAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_5()); 
            // InternalQualityEffectSpecification.g:3378:2: ( rule__Rule__EntriesAssignment_5 )
            // InternalQualityEffectSpecification.g:3378:3: rule__Rule__EntriesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__EntriesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEntriesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalQualityEffectSpecification.g:3386:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3390:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalQualityEffectSpecification.g:3391:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

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
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalQualityEffectSpecification.g:3398:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )* ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3402:1: ( ( ( rule__Rule__Group_6__0 )* ) )
            // InternalQualityEffectSpecification.g:3403:1: ( ( rule__Rule__Group_6__0 )* )
            {
            // InternalQualityEffectSpecification.g:3403:1: ( ( rule__Rule__Group_6__0 )* )
            // InternalQualityEffectSpecification.g:3404:2: ( rule__Rule__Group_6__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalQualityEffectSpecification.g:3405:2: ( rule__Rule__Group_6__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:3405:3: rule__Rule__Group_6__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Rule__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalQualityEffectSpecification.g:3413:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3417:1: ( rule__Rule__Group__7__Impl )
            // InternalQualityEffectSpecification.g:3418:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

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
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalQualityEffectSpecification.g:3424:1: rule__Rule__Group__7__Impl : ( ')' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3428:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:3429:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:3429:1: ( ')' )
            // InternalQualityEffectSpecification.g:3430:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group_3__0"
    // InternalQualityEffectSpecification.g:3440:1: rule__Rule__Group_3__0 : rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 ;
    public final void rule__Rule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3444:1: ( rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 )
            // InternalQualityEffectSpecification.g:3445:2: rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Rule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_3__1();

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
    // $ANTLR end "rule__Rule__Group_3__0"


    // $ANTLR start "rule__Rule__Group_3__0__Impl"
    // InternalQualityEffectSpecification.g:3452:1: rule__Rule__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3456:1: ( ( ',' ) )
            // InternalQualityEffectSpecification.g:3457:1: ( ',' )
            {
            // InternalQualityEffectSpecification.g:3457:1: ( ',' )
            // InternalQualityEffectSpecification.g:3458:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3__1"
    // InternalQualityEffectSpecification.g:3467:1: rule__Rule__Group_3__1 : rule__Rule__Group_3__1__Impl ;
    public final void rule__Rule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3471:1: ( rule__Rule__Group_3__1__Impl )
            // InternalQualityEffectSpecification.g:3472:2: rule__Rule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_3__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_3__1"


    // $ANTLR start "rule__Rule__Group_3__1__Impl"
    // InternalQualityEffectSpecification.g:3478:1: rule__Rule__Group_3__1__Impl : ( ( rule__Rule__QualitiesAssignment_3_1 ) ) ;
    public final void rule__Rule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3482:1: ( ( ( rule__Rule__QualitiesAssignment_3_1 ) ) )
            // InternalQualityEffectSpecification.g:3483:1: ( ( rule__Rule__QualitiesAssignment_3_1 ) )
            {
            // InternalQualityEffectSpecification.g:3483:1: ( ( rule__Rule__QualitiesAssignment_3_1 ) )
            // InternalQualityEffectSpecification.g:3484:2: ( rule__Rule__QualitiesAssignment_3_1 )
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_3_1()); 
            // InternalQualityEffectSpecification.g:3485:2: ( rule__Rule__QualitiesAssignment_3_1 )
            // InternalQualityEffectSpecification.g:3485:3: rule__Rule__QualitiesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__QualitiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQualitiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1__Impl"


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalQualityEffectSpecification.g:3494:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3498:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalQualityEffectSpecification.g:3499:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_31);
            rule__Rule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1();

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
    // $ANTLR end "rule__Rule__Group_6__0"


    // $ANTLR start "rule__Rule__Group_6__0__Impl"
    // InternalQualityEffectSpecification.g:3506:1: rule__Rule__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3510:1: ( ( ',' ) )
            // InternalQualityEffectSpecification.g:3511:1: ( ',' )
            {
            // InternalQualityEffectSpecification.g:3511:1: ( ',' )
            // InternalQualityEffectSpecification.g:3512:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0__Impl"


    // $ANTLR start "rule__Rule__Group_6__1"
    // InternalQualityEffectSpecification.g:3521:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3525:1: ( rule__Rule__Group_6__1__Impl )
            // InternalQualityEffectSpecification.g:3526:2: rule__Rule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_6__1"


    // $ANTLR start "rule__Rule__Group_6__1__Impl"
    // InternalQualityEffectSpecification.g:3532:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__EntriesAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3536:1: ( ( ( rule__Rule__EntriesAssignment_6_1 ) ) )
            // InternalQualityEffectSpecification.g:3537:1: ( ( rule__Rule__EntriesAssignment_6_1 ) )
            {
            // InternalQualityEffectSpecification.g:3537:1: ( ( rule__Rule__EntriesAssignment_6_1 ) )
            // InternalQualityEffectSpecification.g:3538:2: ( rule__Rule__EntriesAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_6_1()); 
            // InternalQualityEffectSpecification.g:3539:2: ( rule__Rule__EntriesAssignment_6_1 )
            // InternalQualityEffectSpecification.g:3539:3: rule__Rule__EntriesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__EntriesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEntriesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1__Impl"


    // $ANTLR start "rule__Entry__Group__0"
    // InternalQualityEffectSpecification.g:3548:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3552:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalQualityEffectSpecification.g:3553:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalQualityEffectSpecification.g:3560:1: rule__Entry__Group__0__Impl : ( 'Entry' ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3564:1: ( ( 'Entry' ) )
            // InternalQualityEffectSpecification.g:3565:1: ( 'Entry' )
            {
            // InternalQualityEffectSpecification.g:3565:1: ( 'Entry' )
            // InternalQualityEffectSpecification.g:3566:2: 'Entry'
            {
             before(grammarAccess.getEntryAccess().getEntryKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getEntryKeyword_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3575:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3579:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalQualityEffectSpecification.g:3580:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalQualityEffectSpecification.g:3587:1: rule__Entry__Group__1__Impl : ( '(' ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3591:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:3592:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:3592:1: ( '(' )
            // InternalQualityEffectSpecification.g:3593:2: '('
            {
             before(grammarAccess.getEntryAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3602:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3606:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalQualityEffectSpecification.g:3607:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalQualityEffectSpecification.g:3614:1: rule__Entry__Group__2__Impl : ( ( rule__Entry__KeyAssignment_2 ) ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3618:1: ( ( ( rule__Entry__KeyAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:3619:1: ( ( rule__Entry__KeyAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:3619:1: ( ( rule__Entry__KeyAssignment_2 ) )
            // InternalQualityEffectSpecification.g:3620:2: ( rule__Entry__KeyAssignment_2 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_2()); 
            // InternalQualityEffectSpecification.g:3621:2: ( rule__Entry__KeyAssignment_2 )
            // InternalQualityEffectSpecification.g:3621:3: rule__Entry__KeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entry__KeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getKeyAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3629:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3633:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalQualityEffectSpecification.g:3634:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalQualityEffectSpecification.g:3641:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__Group_3__0 )* ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3645:1: ( ( ( rule__Entry__Group_3__0 )* ) )
            // InternalQualityEffectSpecification.g:3646:1: ( ( rule__Entry__Group_3__0 )* )
            {
            // InternalQualityEffectSpecification.g:3646:1: ( ( rule__Entry__Group_3__0 )* )
            // InternalQualityEffectSpecification.g:3647:2: ( rule__Entry__Group_3__0 )*
            {
             before(grammarAccess.getEntryAccess().getGroup_3()); 
            // InternalQualityEffectSpecification.g:3648:2: ( rule__Entry__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==49) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:3648:3: rule__Entry__Group_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Entry__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getEntryAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3656:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl rule__Entry__Group__5 ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3660:1: ( rule__Entry__Group__4__Impl rule__Entry__Group__5 )
            // InternalQualityEffectSpecification.g:3661:2: rule__Entry__Group__4__Impl rule__Entry__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Entry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__5();

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
    // InternalQualityEffectSpecification.g:3668:1: rule__Entry__Group__4__Impl : ( '=' ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3672:1: ( ( '=' ) )
            // InternalQualityEffectSpecification.g:3673:1: ( '=' )
            {
            // InternalQualityEffectSpecification.g:3673:1: ( '=' )
            // InternalQualityEffectSpecification.g:3674:2: '='
            {
             before(grammarAccess.getEntryAccess().getEqualsSignKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entry__Group__5"
    // InternalQualityEffectSpecification.g:3683:1: rule__Entry__Group__5 : rule__Entry__Group__5__Impl rule__Entry__Group__6 ;
    public final void rule__Entry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3687:1: ( rule__Entry__Group__5__Impl rule__Entry__Group__6 )
            // InternalQualityEffectSpecification.g:3688:2: rule__Entry__Group__5__Impl rule__Entry__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Entry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__6();

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
    // $ANTLR end "rule__Entry__Group__5"


    // $ANTLR start "rule__Entry__Group__5__Impl"
    // InternalQualityEffectSpecification.g:3695:1: rule__Entry__Group__5__Impl : ( ( rule__Entry__ValueAssignment_5 ) ) ;
    public final void rule__Entry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3699:1: ( ( ( rule__Entry__ValueAssignment_5 ) ) )
            // InternalQualityEffectSpecification.g:3700:1: ( ( rule__Entry__ValueAssignment_5 ) )
            {
            // InternalQualityEffectSpecification.g:3700:1: ( ( rule__Entry__ValueAssignment_5 ) )
            // InternalQualityEffectSpecification.g:3701:2: ( rule__Entry__ValueAssignment_5 )
            {
             before(grammarAccess.getEntryAccess().getValueAssignment_5()); 
            // InternalQualityEffectSpecification.g:3702:2: ( rule__Entry__ValueAssignment_5 )
            // InternalQualityEffectSpecification.g:3702:3: rule__Entry__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Entry__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__5__Impl"


    // $ANTLR start "rule__Entry__Group__6"
    // InternalQualityEffectSpecification.g:3710:1: rule__Entry__Group__6 : rule__Entry__Group__6__Impl ;
    public final void rule__Entry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3714:1: ( rule__Entry__Group__6__Impl )
            // InternalQualityEffectSpecification.g:3715:2: rule__Entry__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__6__Impl();

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
    // $ANTLR end "rule__Entry__Group__6"


    // $ANTLR start "rule__Entry__Group__6__Impl"
    // InternalQualityEffectSpecification.g:3721:1: rule__Entry__Group__6__Impl : ( ')' ) ;
    public final void rule__Entry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3725:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:3726:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:3726:1: ( ')' )
            // InternalQualityEffectSpecification.g:3727:2: ')'
            {
             before(grammarAccess.getEntryAccess().getRightParenthesisKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__6__Impl"


    // $ANTLR start "rule__Entry__Group_3__0"
    // InternalQualityEffectSpecification.g:3737:1: rule__Entry__Group_3__0 : rule__Entry__Group_3__0__Impl rule__Entry__Group_3__1 ;
    public final void rule__Entry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3741:1: ( rule__Entry__Group_3__0__Impl rule__Entry__Group_3__1 )
            // InternalQualityEffectSpecification.g:3742:2: rule__Entry__Group_3__0__Impl rule__Entry__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Entry__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group_3__1();

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
    // $ANTLR end "rule__Entry__Group_3__0"


    // $ANTLR start "rule__Entry__Group_3__0__Impl"
    // InternalQualityEffectSpecification.g:3749:1: rule__Entry__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Entry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3753:1: ( ( ',' ) )
            // InternalQualityEffectSpecification.g:3754:1: ( ',' )
            {
            // InternalQualityEffectSpecification.g:3754:1: ( ',' )
            // InternalQualityEffectSpecification.g:3755:2: ','
            {
             before(grammarAccess.getEntryAccess().getCommaKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group_3__0__Impl"


    // $ANTLR start "rule__Entry__Group_3__1"
    // InternalQualityEffectSpecification.g:3764:1: rule__Entry__Group_3__1 : rule__Entry__Group_3__1__Impl ;
    public final void rule__Entry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3768:1: ( rule__Entry__Group_3__1__Impl )
            // InternalQualityEffectSpecification.g:3769:2: rule__Entry__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entry__Group_3__1"


    // $ANTLR start "rule__Entry__Group_3__1__Impl"
    // InternalQualityEffectSpecification.g:3775:1: rule__Entry__Group_3__1__Impl : ( ( rule__Entry__KeyAssignment_3_1 ) ) ;
    public final void rule__Entry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3779:1: ( ( ( rule__Entry__KeyAssignment_3_1 ) ) )
            // InternalQualityEffectSpecification.g:3780:1: ( ( rule__Entry__KeyAssignment_3_1 ) )
            {
            // InternalQualityEffectSpecification.g:3780:1: ( ( rule__Entry__KeyAssignment_3_1 ) )
            // InternalQualityEffectSpecification.g:3781:2: ( rule__Entry__KeyAssignment_3_1 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_3_1()); 
            // InternalQualityEffectSpecification.g:3782:2: ( rule__Entry__KeyAssignment_3_1 )
            // InternalQualityEffectSpecification.g:3782:3: rule__Entry__KeyAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entry__KeyAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getKeyAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group_3__1__Impl"


    // $ANTLR start "rule__NumericValue__Group__0"
    // InternalQualityEffectSpecification.g:3791:1: rule__NumericValue__Group__0 : rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1 ;
    public final void rule__NumericValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3795:1: ( rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1 )
            // InternalQualityEffectSpecification.g:3796:2: rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__NumericValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericValue__Group__1();

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
    // $ANTLR end "rule__NumericValue__Group__0"


    // $ANTLR start "rule__NumericValue__Group__0__Impl"
    // InternalQualityEffectSpecification.g:3803:1: rule__NumericValue__Group__0__Impl : ( ( rule__NumericValue__ValueTypeAssignment_0 ) ) ;
    public final void rule__NumericValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3807:1: ( ( ( rule__NumericValue__ValueTypeAssignment_0 ) ) )
            // InternalQualityEffectSpecification.g:3808:1: ( ( rule__NumericValue__ValueTypeAssignment_0 ) )
            {
            // InternalQualityEffectSpecification.g:3808:1: ( ( rule__NumericValue__ValueTypeAssignment_0 ) )
            // InternalQualityEffectSpecification.g:3809:2: ( rule__NumericValue__ValueTypeAssignment_0 )
            {
             before(grammarAccess.getNumericValueAccess().getValueTypeAssignment_0()); 
            // InternalQualityEffectSpecification.g:3810:2: ( rule__NumericValue__ValueTypeAssignment_0 )
            // InternalQualityEffectSpecification.g:3810:3: rule__NumericValue__ValueTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumericValue__ValueTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumericValueAccess().getValueTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__Group__0__Impl"


    // $ANTLR start "rule__NumericValue__Group__1"
    // InternalQualityEffectSpecification.g:3818:1: rule__NumericValue__Group__1 : rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2 ;
    public final void rule__NumericValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3822:1: ( rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2 )
            // InternalQualityEffectSpecification.g:3823:2: rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__NumericValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericValue__Group__2();

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
    // $ANTLR end "rule__NumericValue__Group__1"


    // $ANTLR start "rule__NumericValue__Group__1__Impl"
    // InternalQualityEffectSpecification.g:3830:1: rule__NumericValue__Group__1__Impl : ( '(' ) ;
    public final void rule__NumericValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3834:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:3835:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:3835:1: ( '(' )
            // InternalQualityEffectSpecification.g:3836:2: '('
            {
             before(grammarAccess.getNumericValueAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNumericValueAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__Group__1__Impl"


    // $ANTLR start "rule__NumericValue__Group__2"
    // InternalQualityEffectSpecification.g:3845:1: rule__NumericValue__Group__2 : rule__NumericValue__Group__2__Impl rule__NumericValue__Group__3 ;
    public final void rule__NumericValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3849:1: ( rule__NumericValue__Group__2__Impl rule__NumericValue__Group__3 )
            // InternalQualityEffectSpecification.g:3850:2: rule__NumericValue__Group__2__Impl rule__NumericValue__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__NumericValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericValue__Group__3();

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
    // $ANTLR end "rule__NumericValue__Group__2"


    // $ANTLR start "rule__NumericValue__Group__2__Impl"
    // InternalQualityEffectSpecification.g:3857:1: rule__NumericValue__Group__2__Impl : ( ( rule__NumericValue__TransformationTypeAssignment_2 ) ) ;
    public final void rule__NumericValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3861:1: ( ( ( rule__NumericValue__TransformationTypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:3862:1: ( ( rule__NumericValue__TransformationTypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:3862:1: ( ( rule__NumericValue__TransformationTypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:3863:2: ( rule__NumericValue__TransformationTypeAssignment_2 )
            {
             before(grammarAccess.getNumericValueAccess().getTransformationTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:3864:2: ( rule__NumericValue__TransformationTypeAssignment_2 )
            // InternalQualityEffectSpecification.g:3864:3: rule__NumericValue__TransformationTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumericValue__TransformationTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumericValueAccess().getTransformationTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__Group__2__Impl"


    // $ANTLR start "rule__NumericValue__Group__3"
    // InternalQualityEffectSpecification.g:3872:1: rule__NumericValue__Group__3 : rule__NumericValue__Group__3__Impl rule__NumericValue__Group__4 ;
    public final void rule__NumericValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3876:1: ( rule__NumericValue__Group__3__Impl rule__NumericValue__Group__4 )
            // InternalQualityEffectSpecification.g:3877:2: rule__NumericValue__Group__3__Impl rule__NumericValue__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__NumericValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericValue__Group__4();

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
    // $ANTLR end "rule__NumericValue__Group__3"


    // $ANTLR start "rule__NumericValue__Group__3__Impl"
    // InternalQualityEffectSpecification.g:3884:1: rule__NumericValue__Group__3__Impl : ( ( rule__NumericValue__TransformationNumberAssignment_3 ) ) ;
    public final void rule__NumericValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3888:1: ( ( ( rule__NumericValue__TransformationNumberAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:3889:1: ( ( rule__NumericValue__TransformationNumberAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:3889:1: ( ( rule__NumericValue__TransformationNumberAssignment_3 ) )
            // InternalQualityEffectSpecification.g:3890:2: ( rule__NumericValue__TransformationNumberAssignment_3 )
            {
             before(grammarAccess.getNumericValueAccess().getTransformationNumberAssignment_3()); 
            // InternalQualityEffectSpecification.g:3891:2: ( rule__NumericValue__TransformationNumberAssignment_3 )
            // InternalQualityEffectSpecification.g:3891:3: rule__NumericValue__TransformationNumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NumericValue__TransformationNumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNumericValueAccess().getTransformationNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__Group__3__Impl"


    // $ANTLR start "rule__NumericValue__Group__4"
    // InternalQualityEffectSpecification.g:3899:1: rule__NumericValue__Group__4 : rule__NumericValue__Group__4__Impl ;
    public final void rule__NumericValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3903:1: ( rule__NumericValue__Group__4__Impl )
            // InternalQualityEffectSpecification.g:3904:2: rule__NumericValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericValue__Group__4__Impl();

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
    // $ANTLR end "rule__NumericValue__Group__4"


    // $ANTLR start "rule__NumericValue__Group__4__Impl"
    // InternalQualityEffectSpecification.g:3910:1: rule__NumericValue__Group__4__Impl : ( ')' ) ;
    public final void rule__NumericValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3914:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:3915:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:3915:1: ( ')' )
            // InternalQualityEffectSpecification.g:3916:2: ')'
            {
             before(grammarAccess.getNumericValueAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNumericValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__Group__4__Impl"


    // $ANTLR start "rule__Model__SpecificationsAssignment_0"
    // InternalQualityEffectSpecification.g:3926:1: rule__Model__SpecificationsAssignment_0 : ( ruleQualityEffectSpecification ) ;
    public final void rule__Model__SpecificationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3930:1: ( ( ruleQualityEffectSpecification ) )
            // InternalQualityEffectSpecification.g:3931:2: ( ruleQualityEffectSpecification )
            {
            // InternalQualityEffectSpecification.g:3931:2: ( ruleQualityEffectSpecification )
            // InternalQualityEffectSpecification.g:3932:3: ruleQualityEffectSpecification
            {
             before(grammarAccess.getModelAccess().getSpecificationsQualityEffectSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualityEffectSpecification();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSpecificationsQualityEffectSpecificationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SpecificationsAssignment_0"


    // $ANTLR start "rule__Model__SpecificationsAssignment_1_1"
    // InternalQualityEffectSpecification.g:3941:1: rule__Model__SpecificationsAssignment_1_1 : ( ruleQualityEffectSpecification ) ;
    public final void rule__Model__SpecificationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3945:1: ( ( ruleQualityEffectSpecification ) )
            // InternalQualityEffectSpecification.g:3946:2: ( ruleQualityEffectSpecification )
            {
            // InternalQualityEffectSpecification.g:3946:2: ( ruleQualityEffectSpecification )
            // InternalQualityEffectSpecification.g:3947:3: ruleQualityEffectSpecification
            {
             before(grammarAccess.getModelAccess().getSpecificationsQualityEffectSpecificationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualityEffectSpecification();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSpecificationsQualityEffectSpecificationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SpecificationsAssignment_1_1"


    // $ANTLR start "rule__QualityEffectSpecification__ComponentsAssignment_2"
    // InternalQualityEffectSpecification.g:3956:1: rule__QualityEffectSpecification__ComponentsAssignment_2 : ( ruleComponentSpecification ) ;
    public final void rule__QualityEffectSpecification__ComponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3960:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:3961:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:3961:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:3962:3: ruleComponentSpecification
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getComponentsComponentSpecificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentSpecification();

            state._fsp--;

             after(grammarAccess.getQualityEffectSpecificationAccess().getComponentsComponentSpecificationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__ComponentsAssignment_2"


    // $ANTLR start "rule__QualityEffectSpecification__ComponentsAssignment_3_1"
    // InternalQualityEffectSpecification.g:3971:1: rule__QualityEffectSpecification__ComponentsAssignment_3_1 : ( ruleComponentSpecification ) ;
    public final void rule__QualityEffectSpecification__ComponentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3975:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:3976:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:3976:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:3977:3: ruleComponentSpecification
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getComponentsComponentSpecificationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentSpecification();

            state._fsp--;

             after(grammarAccess.getQualityEffectSpecificationAccess().getComponentsComponentSpecificationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__ComponentsAssignment_3_1"


    // $ANTLR start "rule__QualityEffectSpecification__TransformationsAssignment_7"
    // InternalQualityEffectSpecification.g:3986:1: rule__QualityEffectSpecification__TransformationsAssignment_7 : ( ruleTransformationSpecification ) ;
    public final void rule__QualityEffectSpecification__TransformationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3990:1: ( ( ruleTransformationSpecification ) )
            // InternalQualityEffectSpecification.g:3991:2: ( ruleTransformationSpecification )
            {
            // InternalQualityEffectSpecification.g:3991:2: ( ruleTransformationSpecification )
            // InternalQualityEffectSpecification.g:3992:3: ruleTransformationSpecification
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsTransformationSpecificationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformationSpecification();

            state._fsp--;

             after(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsTransformationSpecificationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__TransformationsAssignment_7"


    // $ANTLR start "rule__QualityEffectSpecification__TransformationsAssignment_8_1"
    // InternalQualityEffectSpecification.g:4001:1: rule__QualityEffectSpecification__TransformationsAssignment_8_1 : ( ruleTransformationSpecification ) ;
    public final void rule__QualityEffectSpecification__TransformationsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4005:1: ( ( ruleTransformationSpecification ) )
            // InternalQualityEffectSpecification.g:4006:2: ( ruleTransformationSpecification )
            {
            // InternalQualityEffectSpecification.g:4006:2: ( ruleTransformationSpecification )
            // InternalQualityEffectSpecification.g:4007:3: ruleTransformationSpecification
            {
             before(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsTransformationSpecificationParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformationSpecification();

            state._fsp--;

             after(grammarAccess.getQualityEffectSpecificationAccess().getTransformationsTransformationSpecificationParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityEffectSpecification__TransformationsAssignment_8_1"


    // $ANTLR start "rule__ComponentSpecification__PropertiesAssignment_2"
    // InternalQualityEffectSpecification.g:4016:1: rule__ComponentSpecification__PropertiesAssignment_2 : ( ruleComponentProperty ) ;
    public final void rule__ComponentSpecification__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4020:1: ( ( ruleComponentProperty ) )
            // InternalQualityEffectSpecification.g:4021:2: ( ruleComponentProperty )
            {
            // InternalQualityEffectSpecification.g:4021:2: ( ruleComponentProperty )
            // InternalQualityEffectSpecification.g:4022:3: ruleComponentProperty
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentProperty();

            state._fsp--;

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSpecification__PropertiesAssignment_2"


    // $ANTLR start "rule__ComponentSpecification__PropertiesAssignment_3_1"
    // InternalQualityEffectSpecification.g:4031:1: rule__ComponentSpecification__PropertiesAssignment_3_1 : ( ruleComponentProperty ) ;
    public final void rule__ComponentSpecification__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4035:1: ( ( ruleComponentProperty ) )
            // InternalQualityEffectSpecification.g:4036:2: ( ruleComponentProperty )
            {
            // InternalQualityEffectSpecification.g:4036:2: ( ruleComponentProperty )
            // InternalQualityEffectSpecification.g:4037:3: ruleComponentProperty
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentProperty();

            state._fsp--;

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesComponentPropertyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSpecification__PropertiesAssignment_3_1"


    // $ANTLR start "rule__Name__NotAssignment_2"
    // InternalQualityEffectSpecification.g:4046:1: rule__Name__NotAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__Name__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4050:1: ( ( ( 'not' ) ) )
            // InternalQualityEffectSpecification.g:4051:2: ( ( 'not' ) )
            {
            // InternalQualityEffectSpecification.g:4051:2: ( ( 'not' ) )
            // InternalQualityEffectSpecification.g:4052:3: ( 'not' )
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_2_0()); 
            // InternalQualityEffectSpecification.g:4053:3: ( 'not' )
            // InternalQualityEffectSpecification.g:4054:4: 'not'
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getNotNotKeyword_2_0()); 

            }

             after(grammarAccess.getNameAccess().getNotNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__NotAssignment_2"


    // $ANTLR start "rule__Name__AutonymAssignment_3"
    // InternalQualityEffectSpecification.g:4065:1: rule__Name__AutonymAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Name__AutonymAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4069:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4070:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4070:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4071:3: RULE_STRING
            {
             before(grammarAccess.getNameAccess().getAutonymSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getAutonymSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__AutonymAssignment_3"


    // $ANTLR start "rule__Identifier__NotAssignment_2"
    // InternalQualityEffectSpecification.g:4080:1: rule__Identifier__NotAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__Identifier__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4084:1: ( ( ( 'not' ) ) )
            // InternalQualityEffectSpecification.g:4085:2: ( ( 'not' ) )
            {
            // InternalQualityEffectSpecification.g:4085:2: ( ( 'not' ) )
            // InternalQualityEffectSpecification.g:4086:3: ( 'not' )
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_2_0()); 
            // InternalQualityEffectSpecification.g:4087:3: ( 'not' )
            // InternalQualityEffectSpecification.g:4088:4: 'not'
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getNotNotKeyword_2_0()); 

            }

             after(grammarAccess.getIdentifierAccess().getNotNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__NotAssignment_2"


    // $ANTLR start "rule__Identifier__IdAssignment_3"
    // InternalQualityEffectSpecification.g:4099:1: rule__Identifier__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Identifier__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4103:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4104:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4104:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4105:3: RULE_STRING
            {
             before(grammarAccess.getIdentifierAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIdentifierAccess().getIdSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__IdAssignment_3"


    // $ANTLR start "rule__Annotation__NotAssignment_2"
    // InternalQualityEffectSpecification.g:4114:1: rule__Annotation__NotAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__Annotation__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4118:1: ( ( ( 'not' ) ) )
            // InternalQualityEffectSpecification.g:4119:2: ( ( 'not' ) )
            {
            // InternalQualityEffectSpecification.g:4119:2: ( ( 'not' ) )
            // InternalQualityEffectSpecification.g:4120:3: ( 'not' )
            {
             before(grammarAccess.getAnnotationAccess().getNotNotKeyword_2_0()); 
            // InternalQualityEffectSpecification.g:4121:3: ( 'not' )
            // InternalQualityEffectSpecification.g:4122:4: 'not'
            {
             before(grammarAccess.getAnnotationAccess().getNotNotKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getNotNotKeyword_2_0()); 

            }

             after(grammarAccess.getAnnotationAccess().getNotNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__NotAssignment_2"


    // $ANTLR start "rule__Annotation__AnnotationAssignment_3"
    // InternalQualityEffectSpecification.g:4133:1: rule__Annotation__AnnotationAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Annotation__AnnotationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4137:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4138:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4138:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4139:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getAnnotationSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AnnotationAssignment_3"


    // $ANTLR start "rule__Type__NotAssignment_2"
    // InternalQualityEffectSpecification.g:4148:1: rule__Type__NotAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__Type__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4152:1: ( ( ( 'not' ) ) )
            // InternalQualityEffectSpecification.g:4153:2: ( ( 'not' ) )
            {
            // InternalQualityEffectSpecification.g:4153:2: ( ( 'not' ) )
            // InternalQualityEffectSpecification.g:4154:3: ( 'not' )
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_2_0()); 
            // InternalQualityEffectSpecification.g:4155:3: ( 'not' )
            // InternalQualityEffectSpecification.g:4156:4: 'not'
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNotNotKeyword_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getNotNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NotAssignment_2"


    // $ANTLR start "rule__Type__TypeAssignment_3"
    // InternalQualityEffectSpecification.g:4167:1: rule__Type__TypeAssignment_3 : ( ruleComponentType ) ;
    public final void rule__Type__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4171:1: ( ( ruleComponentType ) )
            // InternalQualityEffectSpecification.g:4172:2: ( ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:4172:2: ( ruleComponentType )
            // InternalQualityEffectSpecification.g:4173:3: ruleComponentType
            {
             before(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTypeComponentTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_3"


    // $ANTLR start "rule__Role__NotAssignment_2"
    // InternalQualityEffectSpecification.g:4182:1: rule__Role__NotAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__Role__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4186:1: ( ( ( 'not' ) ) )
            // InternalQualityEffectSpecification.g:4187:2: ( ( 'not' ) )
            {
            // InternalQualityEffectSpecification.g:4187:2: ( ( 'not' ) )
            // InternalQualityEffectSpecification.g:4188:3: ( 'not' )
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_2_0()); 
            // InternalQualityEffectSpecification.g:4189:3: ( 'not' )
            // InternalQualityEffectSpecification.g:4190:4: 'not'
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNotNotKeyword_2_0()); 

            }

             after(grammarAccess.getRoleAccess().getNotNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NotAssignment_2"


    // $ANTLR start "rule__Role__TypeAssignment_3"
    // InternalQualityEffectSpecification.g:4201:1: rule__Role__TypeAssignment_3 : ( ruleRoleType ) ;
    public final void rule__Role__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4205:1: ( ( ruleRoleType ) )
            // InternalQualityEffectSpecification.g:4206:2: ( ruleRoleType )
            {
            // InternalQualityEffectSpecification.g:4206:2: ( ruleRoleType )
            // InternalQualityEffectSpecification.g:4207:3: ruleRoleType
            {
             before(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleType();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getTypeRoleTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__TypeAssignment_3"


    // $ANTLR start "rule__Role__PropertiesAssignment_4_1"
    // InternalQualityEffectSpecification.g:4216:1: rule__Role__PropertiesAssignment_4_1 : ( ruleRoleProperty ) ;
    public final void rule__Role__PropertiesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4220:1: ( ( ruleRoleProperty ) )
            // InternalQualityEffectSpecification.g:4221:2: ( ruleRoleProperty )
            {
            // InternalQualityEffectSpecification.g:4221:2: ( ruleRoleProperty )
            // InternalQualityEffectSpecification.g:4222:3: ruleRoleProperty
            {
             before(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleProperty();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__PropertiesAssignment_4_1"


    // $ANTLR start "rule__Role__PropertiesAssignment_4_2_1"
    // InternalQualityEffectSpecification.g:4231:1: rule__Role__PropertiesAssignment_4_2_1 : ( ruleRoleProperty ) ;
    public final void rule__Role__PropertiesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4235:1: ( ( ruleRoleProperty ) )
            // InternalQualityEffectSpecification.g:4236:2: ( ruleRoleProperty )
            {
            // InternalQualityEffectSpecification.g:4236:2: ( ruleRoleProperty )
            // InternalQualityEffectSpecification.g:4237:3: ruleRoleProperty
            {
             before(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoleProperty();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getPropertiesRolePropertyParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__PropertiesAssignment_4_2_1"


    // $ANTLR start "rule__Assembly__NotAssignment_2"
    // InternalQualityEffectSpecification.g:4246:1: rule__Assembly__NotAssignment_2 : ( ( 'not' ) ) ;
    public final void rule__Assembly__NotAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4250:1: ( ( ( 'not' ) ) )
            // InternalQualityEffectSpecification.g:4251:2: ( ( 'not' ) )
            {
            // InternalQualityEffectSpecification.g:4251:2: ( ( 'not' ) )
            // InternalQualityEffectSpecification.g:4252:3: ( 'not' )
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_2_0()); 
            // InternalQualityEffectSpecification.g:4253:3: ( 'not' )
            // InternalQualityEffectSpecification.g:4254:4: 'not'
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAssemblyAccess().getNotNotKeyword_2_0()); 

            }

             after(grammarAccess.getAssemblyAccess().getNotNotKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__NotAssignment_2"


    // $ANTLR start "rule__Assembly__TypeAssignment_3"
    // InternalQualityEffectSpecification.g:4265:1: rule__Assembly__TypeAssignment_3 : ( ruleAssemblyType ) ;
    public final void rule__Assembly__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4269:1: ( ( ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:4270:2: ( ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:4270:2: ( ruleAssemblyType )
            // InternalQualityEffectSpecification.g:4271:3: ruleAssemblyType
            {
             before(grammarAccess.getAssemblyAccess().getTypeAssemblyTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyType();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getTypeAssemblyTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__TypeAssignment_3"


    // $ANTLR start "rule__Assembly__ComponentAssignment_4_1"
    // InternalQualityEffectSpecification.g:4280:1: rule__Assembly__ComponentAssignment_4_1 : ( ruleComponentSpecification ) ;
    public final void rule__Assembly__ComponentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4284:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:4285:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:4285:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:4286:3: ruleComponentSpecification
            {
             before(grammarAccess.getAssemblyAccess().getComponentComponentSpecificationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentSpecification();

            state._fsp--;

             after(grammarAccess.getAssemblyAccess().getComponentComponentSpecificationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assembly__ComponentAssignment_4_1"


    // $ANTLR start "rule__Resource__PropertiesAssignment_2"
    // InternalQualityEffectSpecification.g:4295:1: rule__Resource__PropertiesAssignment_2 : ( ruleResourceProperty ) ;
    public final void rule__Resource__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4299:1: ( ( ruleResourceProperty ) )
            // InternalQualityEffectSpecification.g:4300:2: ( ruleResourceProperty )
            {
            // InternalQualityEffectSpecification.g:4300:2: ( ruleResourceProperty )
            // InternalQualityEffectSpecification.g:4301:3: ruleResourceProperty
            {
             before(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResourceProperty();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__PropertiesAssignment_2"


    // $ANTLR start "rule__Resource__PropertiesAssignment_3_1"
    // InternalQualityEffectSpecification.g:4310:1: rule__Resource__PropertiesAssignment_3_1 : ( ruleResourceProperty ) ;
    public final void rule__Resource__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4314:1: ( ( ruleResourceProperty ) )
            // InternalQualityEffectSpecification.g:4315:2: ( ruleResourceProperty )
            {
            // InternalQualityEffectSpecification.g:4315:2: ( ruleResourceProperty )
            // InternalQualityEffectSpecification.g:4316:3: ruleResourceProperty
            {
             before(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResourceProperty();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getPropertiesResourcePropertyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__PropertiesAssignment_3_1"


    // $ANTLR start "rule__NQA__QualityAssignment_2"
    // InternalQualityEffectSpecification.g:4325:1: rule__NQA__QualityAssignment_2 : ( RULE_STRING ) ;
    public final void rule__NQA__QualityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4329:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4330:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4330:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4331:3: RULE_STRING
            {
             before(grammarAccess.getNQAAccess().getQualitySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getQualitySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NQA__QualityAssignment_2"


    // $ANTLR start "rule__NQA__TypeAssignment_3"
    // InternalQualityEffectSpecification.g:4340:1: rule__NQA__TypeAssignment_3 : ( ruleTransformationType ) ;
    public final void rule__NQA__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4344:1: ( ( ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:4345:2: ( ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:4345:2: ( ruleTransformationType )
            // InternalQualityEffectSpecification.g:4346:3: ruleTransformationType
            {
             before(grammarAccess.getNQAAccess().getTypeTransformationTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformationType();

            state._fsp--;

             after(grammarAccess.getNQAAccess().getTypeTransformationTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NQA__TypeAssignment_3"


    // $ANTLR start "rule__NQA__ElementAssignment_4"
    // InternalQualityEffectSpecification.g:4355:1: rule__NQA__ElementAssignment_4 : ( RULE_STRING ) ;
    public final void rule__NQA__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4359:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4360:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4360:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4361:3: RULE_STRING
            {
             before(grammarAccess.getNQAAccess().getElementSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNQAAccess().getElementSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NQA__ElementAssignment_4"


    // $ANTLR start "rule__Reasoning__QualityAssignment_2"
    // InternalQualityEffectSpecification.g:4370:1: rule__Reasoning__QualityAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Reasoning__QualityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4374:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4375:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4375:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4376:3: RULE_STRING
            {
             before(grammarAccess.getReasoningAccess().getQualitySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReasoningAccess().getQualitySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasoning__QualityAssignment_2"


    // $ANTLR start "rule__Reasoning__RulesAssignment_4"
    // InternalQualityEffectSpecification.g:4385:1: rule__Reasoning__RulesAssignment_4 : ( ruleRule ) ;
    public final void rule__Reasoning__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4389:1: ( ( ruleRule ) )
            // InternalQualityEffectSpecification.g:4390:2: ( ruleRule )
            {
            // InternalQualityEffectSpecification.g:4390:2: ( ruleRule )
            // InternalQualityEffectSpecification.g:4391:3: ruleRule
            {
             before(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasoning__RulesAssignment_4"


    // $ANTLR start "rule__Reasoning__RulesAssignment_5_1"
    // InternalQualityEffectSpecification.g:4400:1: rule__Reasoning__RulesAssignment_5_1 : ( ruleRule ) ;
    public final void rule__Reasoning__RulesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4404:1: ( ( ruleRule ) )
            // InternalQualityEffectSpecification.g:4405:2: ( ruleRule )
            {
            // InternalQualityEffectSpecification.g:4405:2: ( ruleRule )
            // InternalQualityEffectSpecification.g:4406:3: ruleRule
            {
             before(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getReasoningAccess().getRulesRuleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reasoning__RulesAssignment_5_1"


    // $ANTLR start "rule__Rule__QualitiesAssignment_2"
    // InternalQualityEffectSpecification.g:4415:1: rule__Rule__QualitiesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Rule__QualitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4419:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4420:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4420:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4421:3: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__QualitiesAssignment_2"


    // $ANTLR start "rule__Rule__QualitiesAssignment_3_1"
    // InternalQualityEffectSpecification.g:4430:1: rule__Rule__QualitiesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Rule__QualitiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4434:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4435:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4435:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4436:3: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getQualitiesSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__QualitiesAssignment_3_1"


    // $ANTLR start "rule__Rule__EntriesAssignment_5"
    // InternalQualityEffectSpecification.g:4445:1: rule__Rule__EntriesAssignment_5 : ( ruleEntry ) ;
    public final void rule__Rule__EntriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4449:1: ( ( ruleEntry ) )
            // InternalQualityEffectSpecification.g:4450:2: ( ruleEntry )
            {
            // InternalQualityEffectSpecification.g:4450:2: ( ruleEntry )
            // InternalQualityEffectSpecification.g:4451:3: ruleEntry
            {
             before(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EntriesAssignment_5"


    // $ANTLR start "rule__Rule__EntriesAssignment_6_1"
    // InternalQualityEffectSpecification.g:4460:1: rule__Rule__EntriesAssignment_6_1 : ( ruleEntry ) ;
    public final void rule__Rule__EntriesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4464:1: ( ( ruleEntry ) )
            // InternalQualityEffectSpecification.g:4465:2: ( ruleEntry )
            {
            // InternalQualityEffectSpecification.g:4465:2: ( ruleEntry )
            // InternalQualityEffectSpecification.g:4466:3: ruleEntry
            {
             before(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getEntriesEntryParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EntriesAssignment_6_1"


    // $ANTLR start "rule__Entry__KeyAssignment_2"
    // InternalQualityEffectSpecification.g:4475:1: rule__Entry__KeyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Entry__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4479:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4480:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4480:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4481:3: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__KeyAssignment_2"


    // $ANTLR start "rule__Entry__KeyAssignment_3_1"
    // InternalQualityEffectSpecification.g:4490:1: rule__Entry__KeyAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Entry__KeyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4494:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4495:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4495:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4496:3: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getKeySTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__KeyAssignment_3_1"


    // $ANTLR start "rule__Entry__ValueAssignment_5"
    // InternalQualityEffectSpecification.g:4505:1: rule__Entry__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Entry__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4509:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:4510:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:4510:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:4511:3: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__ValueAssignment_5"


    // $ANTLR start "rule__NumericValue__ValueTypeAssignment_0"
    // InternalQualityEffectSpecification.g:4520:1: rule__NumericValue__ValueTypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__NumericValue__ValueTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4524:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:4525:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:4525:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:4526:3: RULE_ID
            {
             before(grammarAccess.getNumericValueAccess().getValueTypeIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNumericValueAccess().getValueTypeIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__ValueTypeAssignment_0"


    // $ANTLR start "rule__NumericValue__TransformationTypeAssignment_2"
    // InternalQualityEffectSpecification.g:4535:1: rule__NumericValue__TransformationTypeAssignment_2 : ( ruleTransformationType ) ;
    public final void rule__NumericValue__TransformationTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4539:1: ( ( ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:4540:2: ( ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:4540:2: ( ruleTransformationType )
            // InternalQualityEffectSpecification.g:4541:3: ruleTransformationType
            {
             before(grammarAccess.getNumericValueAccess().getTransformationTypeTransformationTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransformationType();

            state._fsp--;

             after(grammarAccess.getNumericValueAccess().getTransformationTypeTransformationTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__TransformationTypeAssignment_2"


    // $ANTLR start "rule__NumericValue__TransformationNumberAssignment_3"
    // InternalQualityEffectSpecification.g:4550:1: rule__NumericValue__TransformationNumberAssignment_3 : ( RULE_NUMBER ) ;
    public final void rule__NumericValue__TransformationNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:4554:1: ( ( RULE_NUMBER ) )
            // InternalQualityEffectSpecification.g:4555:2: ( RULE_NUMBER )
            {
            // InternalQualityEffectSpecification.g:4555:2: ( RULE_NUMBER )
            // InternalQualityEffectSpecification.g:4556:3: RULE_NUMBER
            {
             before(grammarAccess.getNumericValueAccess().getTransformationNumberNUMBERTerminalRuleCall_3_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getNumericValueAccess().getTransformationNumberNUMBERTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericValue__TransformationNumberAssignment_3"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\uffff\2\3\2\uffff";
    static final String dfa_3s = "\3\4\2\uffff";
    static final String dfa_4s = "\1\4\2\37\2\uffff";
    static final String dfa_5s = "\3\uffff\1\2\1\1";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\32\uffff\1\4",
            "\1\2\32\uffff\1\4",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 907:2: ( rule__Model__Group_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001800000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00006F8000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x001000000000E000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00100000007F0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000003800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});

}