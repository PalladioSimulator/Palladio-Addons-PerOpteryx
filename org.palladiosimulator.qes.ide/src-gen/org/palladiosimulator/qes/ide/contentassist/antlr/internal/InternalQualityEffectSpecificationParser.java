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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AnyComponentType'", "'Basic'", "'Composite'", "'AnyRoleType'", "'ComponentRequiredProvided'", "'ComponentRequired'", "'ComponentProvided'", "'InfrastructureRequiredProvided'", "'InfrastructureRequired'", "'InfrastructureProvided'", "'AnyAssembly'", "'Required'", "'Provided'", "'='", "'+'", "'-'", "'*'", "'/'", "'For{'", "'}'", "'Do{'", "'Component('", "')'", "'Name('", "'Id('", "'Annotation('", "'Type('", "'Role('", "'Assembly('", "'Resource('", "'NQA('", "'Reasoning('", "':'", "'('", "'['", "']'", "'Not'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=6;
    public static final int T__48=48;
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

                if ( (LA1_0==30) ) {
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


    // $ANTLR start "entryRuleAnnotation"
    // InternalQualityEffectSpecification.g:210:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:211:1: ( ruleAnnotation EOF )
            // InternalQualityEffectSpecification.g:212:1: ruleAnnotation EOF
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
    // InternalQualityEffectSpecification.g:219:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:223:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:224:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:224:2: ( ( rule__Annotation__Group__0 ) )
            // InternalQualityEffectSpecification.g:225:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:226:3: ( rule__Annotation__Group__0 )
            // InternalQualityEffectSpecification.g:226:4: rule__Annotation__Group__0
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
    // InternalQualityEffectSpecification.g:235:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:236:1: ( ruleType EOF )
            // InternalQualityEffectSpecification.g:237:1: ruleType EOF
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
    // InternalQualityEffectSpecification.g:244:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:248:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:249:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:249:2: ( ( rule__Type__Group__0 ) )
            // InternalQualityEffectSpecification.g:250:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:251:3: ( rule__Type__Group__0 )
            // InternalQualityEffectSpecification.g:251:4: rule__Type__Group__0
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
    // InternalQualityEffectSpecification.g:260:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:261:1: ( ruleRole EOF )
            // InternalQualityEffectSpecification.g:262:1: ruleRole EOF
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
    // InternalQualityEffectSpecification.g:269:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:273:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:274:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:274:2: ( ( rule__Role__Group__0 ) )
            // InternalQualityEffectSpecification.g:275:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:276:3: ( rule__Role__Group__0 )
            // InternalQualityEffectSpecification.g:276:4: rule__Role__Group__0
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
    // InternalQualityEffectSpecification.g:285:1: entryRuleRoleProperty : ruleRoleProperty EOF ;
    public final void entryRuleRoleProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:286:1: ( ruleRoleProperty EOF )
            // InternalQualityEffectSpecification.g:287:1: ruleRoleProperty EOF
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
    // InternalQualityEffectSpecification.g:294:1: ruleRoleProperty : ( ( rule__RoleProperty__Alternatives ) ) ;
    public final void ruleRoleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:298:2: ( ( ( rule__RoleProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:299:2: ( ( rule__RoleProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:299:2: ( ( rule__RoleProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:300:3: ( rule__RoleProperty__Alternatives )
            {
             before(grammarAccess.getRolePropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:301:3: ( rule__RoleProperty__Alternatives )
            // InternalQualityEffectSpecification.g:301:4: rule__RoleProperty__Alternatives
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
    // InternalQualityEffectSpecification.g:310:1: entryRuleAssembly : ruleAssembly EOF ;
    public final void entryRuleAssembly() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:311:1: ( ruleAssembly EOF )
            // InternalQualityEffectSpecification.g:312:1: ruleAssembly EOF
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
    // InternalQualityEffectSpecification.g:319:1: ruleAssembly : ( ( rule__Assembly__Group__0 ) ) ;
    public final void ruleAssembly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:323:2: ( ( ( rule__Assembly__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:324:2: ( ( rule__Assembly__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:324:2: ( ( rule__Assembly__Group__0 ) )
            // InternalQualityEffectSpecification.g:325:3: ( rule__Assembly__Group__0 )
            {
             before(grammarAccess.getAssemblyAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:326:3: ( rule__Assembly__Group__0 )
            // InternalQualityEffectSpecification.g:326:4: rule__Assembly__Group__0
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
    // InternalQualityEffectSpecification.g:335:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:336:1: ( ruleResource EOF )
            // InternalQualityEffectSpecification.g:337:1: ruleResource EOF
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
    // InternalQualityEffectSpecification.g:344:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:348:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:349:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:349:2: ( ( rule__Resource__Group__0 ) )
            // InternalQualityEffectSpecification.g:350:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:351:3: ( rule__Resource__Group__0 )
            // InternalQualityEffectSpecification.g:351:4: rule__Resource__Group__0
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
    // InternalQualityEffectSpecification.g:360:1: entryRuleResourceProperty : ruleResourceProperty EOF ;
    public final void entryRuleResourceProperty() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:361:1: ( ruleResourceProperty EOF )
            // InternalQualityEffectSpecification.g:362:1: ruleResourceProperty EOF
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
    // InternalQualityEffectSpecification.g:369:1: ruleResourceProperty : ( ( rule__ResourceProperty__Alternatives ) ) ;
    public final void ruleResourceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:373:2: ( ( ( rule__ResourceProperty__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:374:2: ( ( rule__ResourceProperty__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:374:2: ( ( rule__ResourceProperty__Alternatives ) )
            // InternalQualityEffectSpecification.g:375:3: ( rule__ResourceProperty__Alternatives )
            {
             before(grammarAccess.getResourcePropertyAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:376:3: ( rule__ResourceProperty__Alternatives )
            // InternalQualityEffectSpecification.g:376:4: rule__ResourceProperty__Alternatives
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
    // InternalQualityEffectSpecification.g:385:1: entryRuleTransformationSpecification : ruleTransformationSpecification EOF ;
    public final void entryRuleTransformationSpecification() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:386:1: ( ruleTransformationSpecification EOF )
            // InternalQualityEffectSpecification.g:387:1: ruleTransformationSpecification EOF
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
    // InternalQualityEffectSpecification.g:394:1: ruleTransformationSpecification : ( ( rule__TransformationSpecification__Alternatives ) ) ;
    public final void ruleTransformationSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:398:2: ( ( ( rule__TransformationSpecification__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:399:2: ( ( rule__TransformationSpecification__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:399:2: ( ( rule__TransformationSpecification__Alternatives ) )
            // InternalQualityEffectSpecification.g:400:3: ( rule__TransformationSpecification__Alternatives )
            {
             before(grammarAccess.getTransformationSpecificationAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:401:3: ( rule__TransformationSpecification__Alternatives )
            // InternalQualityEffectSpecification.g:401:4: rule__TransformationSpecification__Alternatives
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
    // InternalQualityEffectSpecification.g:410:1: entryRuleNQA : ruleNQA EOF ;
    public final void entryRuleNQA() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:411:1: ( ruleNQA EOF )
            // InternalQualityEffectSpecification.g:412:1: ruleNQA EOF
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
    // InternalQualityEffectSpecification.g:419:1: ruleNQA : ( ( rule__NQA__Group__0 ) ) ;
    public final void ruleNQA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:423:2: ( ( ( rule__NQA__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:424:2: ( ( rule__NQA__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:424:2: ( ( rule__NQA__Group__0 ) )
            // InternalQualityEffectSpecification.g:425:3: ( rule__NQA__Group__0 )
            {
             before(grammarAccess.getNQAAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:426:3: ( rule__NQA__Group__0 )
            // InternalQualityEffectSpecification.g:426:4: rule__NQA__Group__0
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
    // InternalQualityEffectSpecification.g:435:1: entryRuleReasoning : ruleReasoning EOF ;
    public final void entryRuleReasoning() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:436:1: ( ruleReasoning EOF )
            // InternalQualityEffectSpecification.g:437:1: ruleReasoning EOF
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
    // InternalQualityEffectSpecification.g:444:1: ruleReasoning : ( ( rule__Reasoning__Group__0 ) ) ;
    public final void ruleReasoning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:448:2: ( ( ( rule__Reasoning__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:449:2: ( ( rule__Reasoning__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:449:2: ( ( rule__Reasoning__Group__0 ) )
            // InternalQualityEffectSpecification.g:450:3: ( rule__Reasoning__Group__0 )
            {
             before(grammarAccess.getReasoningAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:451:3: ( rule__Reasoning__Group__0 )
            // InternalQualityEffectSpecification.g:451:4: rule__Reasoning__Group__0
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
    // InternalQualityEffectSpecification.g:460:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:461:1: ( ruleRule EOF )
            // InternalQualityEffectSpecification.g:462:1: ruleRule EOF
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
    // InternalQualityEffectSpecification.g:469:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:473:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:474:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:474:2: ( ( rule__Rule__Group__0 ) )
            // InternalQualityEffectSpecification.g:475:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:476:3: ( rule__Rule__Group__0 )
            // InternalQualityEffectSpecification.g:476:4: rule__Rule__Group__0
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
    // InternalQualityEffectSpecification.g:485:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:486:1: ( ruleEntry EOF )
            // InternalQualityEffectSpecification.g:487:1: ruleEntry EOF
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
    // InternalQualityEffectSpecification.g:494:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:498:2: ( ( ( rule__Entry__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:499:2: ( ( rule__Entry__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:499:2: ( ( rule__Entry__Group__0 ) )
            // InternalQualityEffectSpecification.g:500:3: ( rule__Entry__Group__0 )
            {
             before(grammarAccess.getEntryAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:501:3: ( rule__Entry__Group__0 )
            // InternalQualityEffectSpecification.g:501:4: rule__Entry__Group__0
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
    // InternalQualityEffectSpecification.g:510:1: entryRuleNumericValue : ruleNumericValue EOF ;
    public final void entryRuleNumericValue() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:511:1: ( ruleNumericValue EOF )
            // InternalQualityEffectSpecification.g:512:1: ruleNumericValue EOF
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
    // InternalQualityEffectSpecification.g:519:1: ruleNumericValue : ( ( rule__NumericValue__Group__0 ) ) ;
    public final void ruleNumericValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:523:2: ( ( ( rule__NumericValue__Group__0 ) ) )
            // InternalQualityEffectSpecification.g:524:2: ( ( rule__NumericValue__Group__0 ) )
            {
            // InternalQualityEffectSpecification.g:524:2: ( ( rule__NumericValue__Group__0 ) )
            // InternalQualityEffectSpecification.g:525:3: ( rule__NumericValue__Group__0 )
            {
             before(grammarAccess.getNumericValueAccess().getGroup()); 
            // InternalQualityEffectSpecification.g:526:3: ( rule__NumericValue__Group__0 )
            // InternalQualityEffectSpecification.g:526:4: rule__NumericValue__Group__0
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
    // InternalQualityEffectSpecification.g:535:1: ruleComponentType : ( ( rule__ComponentType__Alternatives ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:539:1: ( ( ( rule__ComponentType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:540:2: ( ( rule__ComponentType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:540:2: ( ( rule__ComponentType__Alternatives ) )
            // InternalQualityEffectSpecification.g:541:3: ( rule__ComponentType__Alternatives )
            {
             before(grammarAccess.getComponentTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:542:3: ( rule__ComponentType__Alternatives )
            // InternalQualityEffectSpecification.g:542:4: rule__ComponentType__Alternatives
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
    // InternalQualityEffectSpecification.g:551:1: ruleRoleType : ( ( rule__RoleType__Alternatives ) ) ;
    public final void ruleRoleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:555:1: ( ( ( rule__RoleType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:556:2: ( ( rule__RoleType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:556:2: ( ( rule__RoleType__Alternatives ) )
            // InternalQualityEffectSpecification.g:557:3: ( rule__RoleType__Alternatives )
            {
             before(grammarAccess.getRoleTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:558:3: ( rule__RoleType__Alternatives )
            // InternalQualityEffectSpecification.g:558:4: rule__RoleType__Alternatives
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
    // InternalQualityEffectSpecification.g:567:1: ruleAssemblyType : ( ( rule__AssemblyType__Alternatives ) ) ;
    public final void ruleAssemblyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:571:1: ( ( ( rule__AssemblyType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:572:2: ( ( rule__AssemblyType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:572:2: ( ( rule__AssemblyType__Alternatives ) )
            // InternalQualityEffectSpecification.g:573:3: ( rule__AssemblyType__Alternatives )
            {
             before(grammarAccess.getAssemblyTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:574:3: ( rule__AssemblyType__Alternatives )
            // InternalQualityEffectSpecification.g:574:4: rule__AssemblyType__Alternatives
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
    // InternalQualityEffectSpecification.g:583:1: ruleTransformationType : ( ( rule__TransformationType__Alternatives ) ) ;
    public final void ruleTransformationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:587:1: ( ( ( rule__TransformationType__Alternatives ) ) )
            // InternalQualityEffectSpecification.g:588:2: ( ( rule__TransformationType__Alternatives ) )
            {
            // InternalQualityEffectSpecification.g:588:2: ( ( rule__TransformationType__Alternatives ) )
            // InternalQualityEffectSpecification.g:589:3: ( rule__TransformationType__Alternatives )
            {
             before(grammarAccess.getTransformationTypeAccess().getAlternatives()); 
            // InternalQualityEffectSpecification.g:590:3: ( rule__TransformationType__Alternatives )
            // InternalQualityEffectSpecification.g:590:4: rule__TransformationType__Alternatives
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
    // InternalQualityEffectSpecification.g:598:1: rule__ComponentProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleAnnotation ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) );
    public final void rule__ComponentProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:602:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleAnnotation ) | ( ruleType ) | ( ruleRole ) | ( ruleAssembly ) | ( ruleResource ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            case 39:
                {
                alt2=5;
                }
                break;
            case 40:
                {
                alt2=6;
                }
                break;
            case 41:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQualityEffectSpecification.g:603:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:603:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:604:3: ruleName
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
                    // InternalQualityEffectSpecification.g:609:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:609:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:610:3: ruleIdentifier
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
                    // InternalQualityEffectSpecification.g:615:2: ( ruleAnnotation )
                    {
                    // InternalQualityEffectSpecification.g:615:2: ( ruleAnnotation )
                    // InternalQualityEffectSpecification.g:616:3: ruleAnnotation
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
                    // InternalQualityEffectSpecification.g:621:2: ( ruleType )
                    {
                    // InternalQualityEffectSpecification.g:621:2: ( ruleType )
                    // InternalQualityEffectSpecification.g:622:3: ruleType
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
                    // InternalQualityEffectSpecification.g:627:2: ( ruleRole )
                    {
                    // InternalQualityEffectSpecification.g:627:2: ( ruleRole )
                    // InternalQualityEffectSpecification.g:628:3: ruleRole
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
                    // InternalQualityEffectSpecification.g:633:2: ( ruleAssembly )
                    {
                    // InternalQualityEffectSpecification.g:633:2: ( ruleAssembly )
                    // InternalQualityEffectSpecification.g:634:3: ruleAssembly
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
                    // InternalQualityEffectSpecification.g:639:2: ( ruleResource )
                    {
                    // InternalQualityEffectSpecification.g:639:2: ( ruleResource )
                    // InternalQualityEffectSpecification.g:640:3: ruleResource
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
    // InternalQualityEffectSpecification.g:649:1: rule__RoleProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) | ( ruleAnnotation ) );
    public final void rule__RoleProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:653:1: ( ( ruleName ) | ( ruleIdentifier ) | ( ruleAnnotation ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 36:
                {
                alt3=2;
                }
                break;
            case 37:
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
                    // InternalQualityEffectSpecification.g:654:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:654:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:655:3: ruleName
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
                    // InternalQualityEffectSpecification.g:660:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:660:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:661:3: ruleIdentifier
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
                    // InternalQualityEffectSpecification.g:666:2: ( ruleAnnotation )
                    {
                    // InternalQualityEffectSpecification.g:666:2: ( ruleAnnotation )
                    // InternalQualityEffectSpecification.g:667:3: ruleAnnotation
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
    // InternalQualityEffectSpecification.g:676:1: rule__ResourceProperty__Alternatives : ( ( ruleName ) | ( ruleIdentifier ) );
    public final void rule__ResourceProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:680:1: ( ( ruleName ) | ( ruleIdentifier ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQualityEffectSpecification.g:681:2: ( ruleName )
                    {
                    // InternalQualityEffectSpecification.g:681:2: ( ruleName )
                    // InternalQualityEffectSpecification.g:682:3: ruleName
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
                    // InternalQualityEffectSpecification.g:687:2: ( ruleIdentifier )
                    {
                    // InternalQualityEffectSpecification.g:687:2: ( ruleIdentifier )
                    // InternalQualityEffectSpecification.g:688:3: ruleIdentifier
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
    // InternalQualityEffectSpecification.g:697:1: rule__TransformationSpecification__Alternatives : ( ( ruleNQA ) | ( ruleReasoning ) | ( ruleNumericValue ) );
    public final void rule__TransformationSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:701:1: ( ( ruleNQA ) | ( ruleReasoning ) | ( ruleNumericValue ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalQualityEffectSpecification.g:702:2: ( ruleNQA )
                    {
                    // InternalQualityEffectSpecification.g:702:2: ( ruleNQA )
                    // InternalQualityEffectSpecification.g:703:3: ruleNQA
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
                    // InternalQualityEffectSpecification.g:708:2: ( ruleReasoning )
                    {
                    // InternalQualityEffectSpecification.g:708:2: ( ruleReasoning )
                    // InternalQualityEffectSpecification.g:709:3: ruleReasoning
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
                    // InternalQualityEffectSpecification.g:714:2: ( ruleNumericValue )
                    {
                    // InternalQualityEffectSpecification.g:714:2: ( ruleNumericValue )
                    // InternalQualityEffectSpecification.g:715:3: ruleNumericValue
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
    // InternalQualityEffectSpecification.g:724:1: rule__ComponentType__Alternatives : ( ( ( 'AnyComponentType' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) );
    public final void rule__ComponentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:728:1: ( ( ( 'AnyComponentType' ) ) | ( ( 'Basic' ) ) | ( ( 'Composite' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
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
                    // InternalQualityEffectSpecification.g:729:2: ( ( 'AnyComponentType' ) )
                    {
                    // InternalQualityEffectSpecification.g:729:2: ( ( 'AnyComponentType' ) )
                    // InternalQualityEffectSpecification.g:730:3: ( 'AnyComponentType' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:731:3: ( 'AnyComponentType' )
                    // InternalQualityEffectSpecification.g:731:4: 'AnyComponentType'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:735:2: ( ( 'Basic' ) )
                    {
                    // InternalQualityEffectSpecification.g:735:2: ( ( 'Basic' ) )
                    // InternalQualityEffectSpecification.g:736:3: ( 'Basic' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:737:3: ( 'Basic' )
                    // InternalQualityEffectSpecification.g:737:4: 'Basic'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getComponentTypeAccess().getBASICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:741:2: ( ( 'Composite' ) )
                    {
                    // InternalQualityEffectSpecification.g:741:2: ( ( 'Composite' ) )
                    // InternalQualityEffectSpecification.g:742:3: ( 'Composite' )
                    {
                     before(grammarAccess.getComponentTypeAccess().getCOMPOSITEEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:743:3: ( 'Composite' )
                    // InternalQualityEffectSpecification.g:743:4: 'Composite'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:751:1: rule__RoleType__Alternatives : ( ( ( 'AnyRoleType' ) ) | ( ( 'ComponentRequiredProvided' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'InfrastructureRequiredProvided' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) );
    public final void rule__RoleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:755:1: ( ( ( 'AnyRoleType' ) ) | ( ( 'ComponentRequiredProvided' ) ) | ( ( 'ComponentRequired' ) ) | ( ( 'ComponentProvided' ) ) | ( ( 'InfrastructureRequiredProvided' ) ) | ( ( 'InfrastructureRequired' ) ) | ( ( 'InfrastructureProvided' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 21:
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
                    // InternalQualityEffectSpecification.g:756:2: ( ( 'AnyRoleType' ) )
                    {
                    // InternalQualityEffectSpecification.g:756:2: ( ( 'AnyRoleType' ) )
                    // InternalQualityEffectSpecification.g:757:3: ( 'AnyRoleType' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:758:3: ( 'AnyRoleType' )
                    // InternalQualityEffectSpecification.g:758:4: 'AnyRoleType'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:762:2: ( ( 'ComponentRequiredProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:762:2: ( ( 'ComponentRequiredProvided' ) )
                    // InternalQualityEffectSpecification.g:763:3: ( 'ComponentRequiredProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:764:3: ( 'ComponentRequiredProvided' )
                    // InternalQualityEffectSpecification.g:764:4: 'ComponentRequiredProvided'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIRED_PROVIDEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:768:2: ( ( 'ComponentRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:768:2: ( ( 'ComponentRequired' ) )
                    // InternalQualityEffectSpecification.g:769:3: ( 'ComponentRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:770:3: ( 'ComponentRequired' )
                    // InternalQualityEffectSpecification.g:770:4: 'ComponentRequired'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_REQUIREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:774:2: ( ( 'ComponentProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:774:2: ( ( 'ComponentProvided' ) )
                    // InternalQualityEffectSpecification.g:775:3: ( 'ComponentProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:776:3: ( 'ComponentProvided' )
                    // InternalQualityEffectSpecification.g:776:4: 'ComponentProvided'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getCOMPONENT_PROVIDEDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:780:2: ( ( 'InfrastructureRequiredProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:780:2: ( ( 'InfrastructureRequiredProvided' ) )
                    // InternalQualityEffectSpecification.g:781:3: ( 'InfrastructureRequiredProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:782:3: ( 'InfrastructureRequiredProvided' )
                    // InternalQualityEffectSpecification.g:782:4: 'InfrastructureRequiredProvided'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIRED_PROVIDEDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQualityEffectSpecification.g:786:2: ( ( 'InfrastructureRequired' ) )
                    {
                    // InternalQualityEffectSpecification.g:786:2: ( ( 'InfrastructureRequired' ) )
                    // InternalQualityEffectSpecification.g:787:3: ( 'InfrastructureRequired' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 
                    // InternalQualityEffectSpecification.g:788:3: ( 'InfrastructureRequired' )
                    // InternalQualityEffectSpecification.g:788:4: 'InfrastructureRequired'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_REQUIREDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQualityEffectSpecification.g:792:2: ( ( 'InfrastructureProvided' ) )
                    {
                    // InternalQualityEffectSpecification.g:792:2: ( ( 'InfrastructureProvided' ) )
                    // InternalQualityEffectSpecification.g:793:3: ( 'InfrastructureProvided' )
                    {
                     before(grammarAccess.getRoleTypeAccess().getINFRASTRUCTURE_PROVIDEDEnumLiteralDeclaration_6()); 
                    // InternalQualityEffectSpecification.g:794:3: ( 'InfrastructureProvided' )
                    // InternalQualityEffectSpecification.g:794:4: 'InfrastructureProvided'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:802:1: rule__AssemblyType__Alternatives : ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) );
    public final void rule__AssemblyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:806:1: ( ( ( 'AnyAssembly' ) ) | ( ( 'Required' ) ) | ( ( 'Provided' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
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
                    // InternalQualityEffectSpecification.g:807:2: ( ( 'AnyAssembly' ) )
                    {
                    // InternalQualityEffectSpecification.g:807:2: ( ( 'AnyAssembly' ) )
                    // InternalQualityEffectSpecification.g:808:3: ( 'AnyAssembly' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:809:3: ( 'AnyAssembly' )
                    // InternalQualityEffectSpecification.g:809:4: 'AnyAssembly'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:813:2: ( ( 'Required' ) )
                    {
                    // InternalQualityEffectSpecification.g:813:2: ( ( 'Required' ) )
                    // InternalQualityEffectSpecification.g:814:3: ( 'Required' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:815:3: ( 'Required' )
                    // InternalQualityEffectSpecification.g:815:4: 'Required'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAssemblyTypeAccess().getREQUIREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:819:2: ( ( 'Provided' ) )
                    {
                    // InternalQualityEffectSpecification.g:819:2: ( ( 'Provided' ) )
                    // InternalQualityEffectSpecification.g:820:3: ( 'Provided' )
                    {
                     before(grammarAccess.getAssemblyTypeAccess().getPROVIDEDEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:821:3: ( 'Provided' )
                    // InternalQualityEffectSpecification.g:821:4: 'Provided'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:829:1: rule__TransformationType__Alternatives : ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__TransformationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:833:1: ( ( ( '=' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 29:
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
                    // InternalQualityEffectSpecification.g:834:2: ( ( '=' ) )
                    {
                    // InternalQualityEffectSpecification.g:834:2: ( ( '=' ) )
                    // InternalQualityEffectSpecification.g:835:3: ( '=' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0()); 
                    // InternalQualityEffectSpecification.g:836:3: ( '=' )
                    // InternalQualityEffectSpecification.g:836:4: '='
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getISEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:840:2: ( ( '+' ) )
                    {
                    // InternalQualityEffectSpecification.g:840:2: ( ( '+' ) )
                    // InternalQualityEffectSpecification.g:841:3: ( '+' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1()); 
                    // InternalQualityEffectSpecification.g:842:3: ( '+' )
                    // InternalQualityEffectSpecification.g:842:4: '+'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getPLUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQualityEffectSpecification.g:846:2: ( ( '-' ) )
                    {
                    // InternalQualityEffectSpecification.g:846:2: ( ( '-' ) )
                    // InternalQualityEffectSpecification.g:847:3: ( '-' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2()); 
                    // InternalQualityEffectSpecification.g:848:3: ( '-' )
                    // InternalQualityEffectSpecification.g:848:4: '-'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getMINUSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQualityEffectSpecification.g:852:2: ( ( '*' ) )
                    {
                    // InternalQualityEffectSpecification.g:852:2: ( ( '*' ) )
                    // InternalQualityEffectSpecification.g:853:3: ( '*' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3()); 
                    // InternalQualityEffectSpecification.g:854:3: ( '*' )
                    // InternalQualityEffectSpecification.g:854:4: '*'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransformationTypeAccess().getMULTIPLICATIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQualityEffectSpecification.g:858:2: ( ( '/' ) )
                    {
                    // InternalQualityEffectSpecification.g:858:2: ( ( '/' ) )
                    // InternalQualityEffectSpecification.g:859:3: ( '/' )
                    {
                     before(grammarAccess.getTransformationTypeAccess().getDIVISIONEnumLiteralDeclaration_4()); 
                    // InternalQualityEffectSpecification.g:860:3: ( '/' )
                    // InternalQualityEffectSpecification.g:860:4: '/'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalQualityEffectSpecification.g:868:1: rule__QES__Group__0 : rule__QES__Group__0__Impl rule__QES__Group__1 ;
    public final void rule__QES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:872:1: ( rule__QES__Group__0__Impl rule__QES__Group__1 )
            // InternalQualityEffectSpecification.g:873:2: rule__QES__Group__0__Impl rule__QES__Group__1
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
    // InternalQualityEffectSpecification.g:880:1: rule__QES__Group__0__Impl : ( 'For{' ) ;
    public final void rule__QES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:884:1: ( ( 'For{' ) )
            // InternalQualityEffectSpecification.g:885:1: ( 'For{' )
            {
            // InternalQualityEffectSpecification.g:885:1: ( 'For{' )
            // InternalQualityEffectSpecification.g:886:2: 'For{'
            {
             before(grammarAccess.getQESAccess().getForKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:895:1: rule__QES__Group__1 : rule__QES__Group__1__Impl rule__QES__Group__2 ;
    public final void rule__QES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:899:1: ( rule__QES__Group__1__Impl rule__QES__Group__2 )
            // InternalQualityEffectSpecification.g:900:2: rule__QES__Group__1__Impl rule__QES__Group__2
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
    // InternalQualityEffectSpecification.g:907:1: rule__QES__Group__1__Impl : ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) ) ;
    public final void rule__QES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:911:1: ( ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:912:1: ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:912:1: ( ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:913:2: ( ( rule__QES__ComponentsAssignment_1 ) ) ( ( rule__QES__ComponentsAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:913:2: ( ( rule__QES__ComponentsAssignment_1 ) )
            // InternalQualityEffectSpecification.g:914:3: ( rule__QES__ComponentsAssignment_1 )
            {
             before(grammarAccess.getQESAccess().getComponentsAssignment_1()); 
            // InternalQualityEffectSpecification.g:915:3: ( rule__QES__ComponentsAssignment_1 )
            // InternalQualityEffectSpecification.g:915:4: rule__QES__ComponentsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__QES__ComponentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getComponentsAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:918:2: ( ( rule__QES__ComponentsAssignment_1 )* )
            // InternalQualityEffectSpecification.g:919:3: ( rule__QES__ComponentsAssignment_1 )*
            {
             before(grammarAccess.getQESAccess().getComponentsAssignment_1()); 
            // InternalQualityEffectSpecification.g:920:3: ( rule__QES__ComponentsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:920:4: rule__QES__ComponentsAssignment_1
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
    // InternalQualityEffectSpecification.g:929:1: rule__QES__Group__2 : rule__QES__Group__2__Impl rule__QES__Group__3 ;
    public final void rule__QES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:933:1: ( rule__QES__Group__2__Impl rule__QES__Group__3 )
            // InternalQualityEffectSpecification.g:934:2: rule__QES__Group__2__Impl rule__QES__Group__3
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
    // InternalQualityEffectSpecification.g:941:1: rule__QES__Group__2__Impl : ( '}' ) ;
    public final void rule__QES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:945:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:946:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:946:1: ( '}' )
            // InternalQualityEffectSpecification.g:947:2: '}'
            {
             before(grammarAccess.getQESAccess().getRightCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:956:1: rule__QES__Group__3 : rule__QES__Group__3__Impl rule__QES__Group__4 ;
    public final void rule__QES__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:960:1: ( rule__QES__Group__3__Impl rule__QES__Group__4 )
            // InternalQualityEffectSpecification.g:961:2: rule__QES__Group__3__Impl rule__QES__Group__4
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
    // InternalQualityEffectSpecification.g:968:1: rule__QES__Group__3__Impl : ( 'Do{' ) ;
    public final void rule__QES__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:972:1: ( ( 'Do{' ) )
            // InternalQualityEffectSpecification.g:973:1: ( 'Do{' )
            {
            // InternalQualityEffectSpecification.g:973:1: ( 'Do{' )
            // InternalQualityEffectSpecification.g:974:2: 'Do{'
            {
             before(grammarAccess.getQESAccess().getDoKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:983:1: rule__QES__Group__4 : rule__QES__Group__4__Impl rule__QES__Group__5 ;
    public final void rule__QES__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:987:1: ( rule__QES__Group__4__Impl rule__QES__Group__5 )
            // InternalQualityEffectSpecification.g:988:2: rule__QES__Group__4__Impl rule__QES__Group__5
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
    // InternalQualityEffectSpecification.g:995:1: rule__QES__Group__4__Impl : ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) ) ;
    public final void rule__QES__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:999:1: ( ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) ) )
            // InternalQualityEffectSpecification.g:1000:1: ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) )
            {
            // InternalQualityEffectSpecification.g:1000:1: ( ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* ) )
            // InternalQualityEffectSpecification.g:1001:2: ( ( rule__QES__TransformationsAssignment_4 ) ) ( ( rule__QES__TransformationsAssignment_4 )* )
            {
            // InternalQualityEffectSpecification.g:1001:2: ( ( rule__QES__TransformationsAssignment_4 ) )
            // InternalQualityEffectSpecification.g:1002:3: ( rule__QES__TransformationsAssignment_4 )
            {
             before(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 
            // InternalQualityEffectSpecification.g:1003:3: ( rule__QES__TransformationsAssignment_4 )
            // InternalQualityEffectSpecification.g:1003:4: rule__QES__TransformationsAssignment_4
            {
            pushFollow(FOLLOW_9);
            rule__QES__TransformationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 

            }

            // InternalQualityEffectSpecification.g:1006:2: ( ( rule__QES__TransformationsAssignment_4 )* )
            // InternalQualityEffectSpecification.g:1007:3: ( rule__QES__TransformationsAssignment_4 )*
            {
             before(grammarAccess.getQESAccess().getTransformationsAssignment_4()); 
            // InternalQualityEffectSpecification.g:1008:3: ( rule__QES__TransformationsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||(LA11_0>=42 && LA11_0<=43)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1008:4: rule__QES__TransformationsAssignment_4
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
    // InternalQualityEffectSpecification.g:1017:1: rule__QES__Group__5 : rule__QES__Group__5__Impl ;
    public final void rule__QES__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1021:1: ( rule__QES__Group__5__Impl )
            // InternalQualityEffectSpecification.g:1022:2: rule__QES__Group__5__Impl
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
    // InternalQualityEffectSpecification.g:1028:1: rule__QES__Group__5__Impl : ( '}' ) ;
    public final void rule__QES__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1032:1: ( ( '}' ) )
            // InternalQualityEffectSpecification.g:1033:1: ( '}' )
            {
            // InternalQualityEffectSpecification.g:1033:1: ( '}' )
            // InternalQualityEffectSpecification.g:1034:2: '}'
            {
             before(grammarAccess.getQESAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1044:1: rule__ComponentSpecification__Group__0 : rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1 ;
    public final void rule__ComponentSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1048:1: ( rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1 )
            // InternalQualityEffectSpecification.g:1049:2: rule__ComponentSpecification__Group__0__Impl rule__ComponentSpecification__Group__1
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
    // InternalQualityEffectSpecification.g:1056:1: rule__ComponentSpecification__Group__0__Impl : ( 'Component(' ) ;
    public final void rule__ComponentSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1060:1: ( ( 'Component(' ) )
            // InternalQualityEffectSpecification.g:1061:1: ( 'Component(' )
            {
            // InternalQualityEffectSpecification.g:1061:1: ( 'Component(' )
            // InternalQualityEffectSpecification.g:1062:2: 'Component('
            {
             before(grammarAccess.getComponentSpecificationAccess().getComponentKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1071:1: rule__ComponentSpecification__Group__1 : rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2 ;
    public final void rule__ComponentSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1075:1: ( rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2 )
            // InternalQualityEffectSpecification.g:1076:2: rule__ComponentSpecification__Group__1__Impl rule__ComponentSpecification__Group__2
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
    // InternalQualityEffectSpecification.g:1083:1: rule__ComponentSpecification__Group__1__Impl : ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) ) ;
    public final void rule__ComponentSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1087:1: ( ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1088:1: ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1088:1: ( ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1089:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) ) ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1089:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1090:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1091:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:1091:4: rule__ComponentSpecification__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__ComponentSpecification__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1094:2: ( ( rule__ComponentSpecification__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1095:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getComponentSpecificationAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1096:3: ( rule__ComponentSpecification__PropertiesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=35 && LA12_0<=41)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1096:4: rule__ComponentSpecification__PropertiesAssignment_1
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
    // InternalQualityEffectSpecification.g:1105:1: rule__ComponentSpecification__Group__2 : rule__ComponentSpecification__Group__2__Impl ;
    public final void rule__ComponentSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1109:1: ( rule__ComponentSpecification__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1110:2: rule__ComponentSpecification__Group__2__Impl
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
    // InternalQualityEffectSpecification.g:1116:1: rule__ComponentSpecification__Group__2__Impl : ( ')' ) ;
    public final void rule__ComponentSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1120:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1121:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1121:1: ( ')' )
            // InternalQualityEffectSpecification.g:1122:2: ')'
            {
             before(grammarAccess.getComponentSpecificationAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1132:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1136:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalQualityEffectSpecification.g:1137:2: rule__Name__Group__0__Impl rule__Name__Group__1
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
    // InternalQualityEffectSpecification.g:1144:1: rule__Name__Group__0__Impl : ( 'Name(' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1148:1: ( ( 'Name(' ) )
            // InternalQualityEffectSpecification.g:1149:1: ( 'Name(' )
            {
            // InternalQualityEffectSpecification.g:1149:1: ( 'Name(' )
            // InternalQualityEffectSpecification.g:1150:2: 'Name('
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1159:1: rule__Name__Group__1 : rule__Name__Group__1__Impl rule__Name__Group__2 ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1163:1: ( rule__Name__Group__1__Impl rule__Name__Group__2 )
            // InternalQualityEffectSpecification.g:1164:2: rule__Name__Group__1__Impl rule__Name__Group__2
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
    // InternalQualityEffectSpecification.g:1171:1: rule__Name__Group__1__Impl : ( ( rule__Name__NotAssignment_1 )? ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1175:1: ( ( ( rule__Name__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1176:1: ( ( rule__Name__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1176:1: ( ( rule__Name__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1177:2: ( rule__Name__NotAssignment_1 )?
            {
             before(grammarAccess.getNameAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1178:2: ( rule__Name__NotAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1178:3: rule__Name__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1186:1: rule__Name__Group__2 : rule__Name__Group__2__Impl rule__Name__Group__3 ;
    public final void rule__Name__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1190:1: ( rule__Name__Group__2__Impl rule__Name__Group__3 )
            // InternalQualityEffectSpecification.g:1191:2: rule__Name__Group__2__Impl rule__Name__Group__3
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
    // InternalQualityEffectSpecification.g:1198:1: rule__Name__Group__2__Impl : ( ( rule__Name__NameAssignment_2 ) ) ;
    public final void rule__Name__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1202:1: ( ( ( rule__Name__NameAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1203:1: ( ( rule__Name__NameAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1203:1: ( ( rule__Name__NameAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1204:2: ( rule__Name__NameAssignment_2 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_2()); 
            // InternalQualityEffectSpecification.g:1205:2: ( rule__Name__NameAssignment_2 )
            // InternalQualityEffectSpecification.g:1205:3: rule__Name__NameAssignment_2
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
    // InternalQualityEffectSpecification.g:1213:1: rule__Name__Group__3 : rule__Name__Group__3__Impl ;
    public final void rule__Name__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1217:1: ( rule__Name__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1218:2: rule__Name__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1224:1: rule__Name__Group__3__Impl : ( ')' ) ;
    public final void rule__Name__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1228:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1229:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1229:1: ( ')' )
            // InternalQualityEffectSpecification.g:1230:2: ')'
            {
             before(grammarAccess.getNameAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1240:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1244:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // InternalQualityEffectSpecification.g:1245:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
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
    // InternalQualityEffectSpecification.g:1252:1: rule__Identifier__Group__0__Impl : ( 'Id(' ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1256:1: ( ( 'Id(' ) )
            // InternalQualityEffectSpecification.g:1257:1: ( 'Id(' )
            {
            // InternalQualityEffectSpecification.g:1257:1: ( 'Id(' )
            // InternalQualityEffectSpecification.g:1258:2: 'Id('
            {
             before(grammarAccess.getIdentifierAccess().getIdKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1267:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1271:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // InternalQualityEffectSpecification.g:1272:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
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
    // InternalQualityEffectSpecification.g:1279:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NotAssignment_1 )? ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1283:1: ( ( ( rule__Identifier__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1284:1: ( ( rule__Identifier__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1284:1: ( ( rule__Identifier__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1285:2: ( rule__Identifier__NotAssignment_1 )?
            {
             before(grammarAccess.getIdentifierAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1286:2: ( rule__Identifier__NotAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1286:3: rule__Identifier__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1294:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl rule__Identifier__Group__3 ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1298:1: ( rule__Identifier__Group__2__Impl rule__Identifier__Group__3 )
            // InternalQualityEffectSpecification.g:1299:2: rule__Identifier__Group__2__Impl rule__Identifier__Group__3
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
    // InternalQualityEffectSpecification.g:1306:1: rule__Identifier__Group__2__Impl : ( ( rule__Identifier__IdAssignment_2 ) ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1310:1: ( ( ( rule__Identifier__IdAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1311:1: ( ( rule__Identifier__IdAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1311:1: ( ( rule__Identifier__IdAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1312:2: ( rule__Identifier__IdAssignment_2 )
            {
             before(grammarAccess.getIdentifierAccess().getIdAssignment_2()); 
            // InternalQualityEffectSpecification.g:1313:2: ( rule__Identifier__IdAssignment_2 )
            // InternalQualityEffectSpecification.g:1313:3: rule__Identifier__IdAssignment_2
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
    // InternalQualityEffectSpecification.g:1321:1: rule__Identifier__Group__3 : rule__Identifier__Group__3__Impl ;
    public final void rule__Identifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1325:1: ( rule__Identifier__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1326:2: rule__Identifier__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1332:1: rule__Identifier__Group__3__Impl : ( ')' ) ;
    public final void rule__Identifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1336:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1337:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1337:1: ( ')' )
            // InternalQualityEffectSpecification.g:1338:2: ')'
            {
             before(grammarAccess.getIdentifierAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalQualityEffectSpecification.g:1348:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1352:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalQualityEffectSpecification.g:1353:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalQualityEffectSpecification.g:1360:1: rule__Annotation__Group__0__Impl : ( 'Annotation(' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1364:1: ( ( 'Annotation(' ) )
            // InternalQualityEffectSpecification.g:1365:1: ( 'Annotation(' )
            {
            // InternalQualityEffectSpecification.g:1365:1: ( 'Annotation(' )
            // InternalQualityEffectSpecification.g:1366:2: 'Annotation('
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1375:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1379:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalQualityEffectSpecification.g:1380:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalQualityEffectSpecification.g:1387:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NotAssignment_1 )? ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1391:1: ( ( ( rule__Annotation__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1392:1: ( ( rule__Annotation__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1392:1: ( ( rule__Annotation__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1393:2: ( rule__Annotation__NotAssignment_1 )?
            {
             before(grammarAccess.getAnnotationAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1394:2: ( rule__Annotation__NotAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1394:3: rule__Annotation__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getNotAssignment_1()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1402:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1406:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalQualityEffectSpecification.g:1407:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalQualityEffectSpecification.g:1414:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__AnnotationAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1418:1: ( ( ( rule__Annotation__AnnotationAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1419:1: ( ( rule__Annotation__AnnotationAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1419:1: ( ( rule__Annotation__AnnotationAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1420:2: ( rule__Annotation__AnnotationAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationAssignment_2()); 
            // InternalQualityEffectSpecification.g:1421:2: ( rule__Annotation__AnnotationAssignment_2 )
            // InternalQualityEffectSpecification.g:1421:3: rule__Annotation__AnnotationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__AnnotationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAnnotationAssignment_2()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:1429:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1433:1: ( rule__Annotation__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1434:2: rule__Annotation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalQualityEffectSpecification.g:1440:1: rule__Annotation__Group__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1444:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1445:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1445:1: ( ')' )
            // InternalQualityEffectSpecification.g:1446:2: ')'
            {
             before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Type__Group__0"
    // InternalQualityEffectSpecification.g:1456:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1460:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalQualityEffectSpecification.g:1461:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalQualityEffectSpecification.g:1468:1: rule__Type__Group__0__Impl : ( 'Type(' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1472:1: ( ( 'Type(' ) )
            // InternalQualityEffectSpecification.g:1473:1: ( 'Type(' )
            {
            // InternalQualityEffectSpecification.g:1473:1: ( 'Type(' )
            // InternalQualityEffectSpecification.g:1474:2: 'Type('
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1483:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1487:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalQualityEffectSpecification.g:1488:2: rule__Type__Group__1__Impl rule__Type__Group__2
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
    // InternalQualityEffectSpecification.g:1495:1: rule__Type__Group__1__Impl : ( ( rule__Type__NotAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1499:1: ( ( ( rule__Type__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1500:1: ( ( rule__Type__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1500:1: ( ( rule__Type__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1501:2: ( rule__Type__NotAssignment_1 )?
            {
             before(grammarAccess.getTypeAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1502:2: ( rule__Type__NotAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1502:3: rule__Type__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1510:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1514:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalQualityEffectSpecification.g:1515:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalQualityEffectSpecification.g:1522:1: rule__Type__Group__2__Impl : ( ( rule__Type__TypeAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1526:1: ( ( ( rule__Type__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1527:1: ( ( rule__Type__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1527:1: ( ( rule__Type__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1528:2: ( rule__Type__TypeAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1529:2: ( rule__Type__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1529:3: rule__Type__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1537:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1541:1: ( rule__Type__Group__3__Impl )
            // InternalQualityEffectSpecification.g:1542:2: rule__Type__Group__3__Impl
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
    // InternalQualityEffectSpecification.g:1548:1: rule__Type__Group__3__Impl : ( ')' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1552:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1553:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1553:1: ( ')' )
            // InternalQualityEffectSpecification.g:1554:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1564:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1568:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalQualityEffectSpecification.g:1569:2: rule__Role__Group__0__Impl rule__Role__Group__1
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
    // InternalQualityEffectSpecification.g:1576:1: rule__Role__Group__0__Impl : ( 'Role(' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1580:1: ( ( 'Role(' ) )
            // InternalQualityEffectSpecification.g:1581:1: ( 'Role(' )
            {
            // InternalQualityEffectSpecification.g:1581:1: ( 'Role(' )
            // InternalQualityEffectSpecification.g:1582:2: 'Role('
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1591:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1595:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalQualityEffectSpecification.g:1596:2: rule__Role__Group__1__Impl rule__Role__Group__2
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
    // InternalQualityEffectSpecification.g:1603:1: rule__Role__Group__1__Impl : ( ( rule__Role__NotAssignment_1 )? ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1607:1: ( ( ( rule__Role__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1608:1: ( ( rule__Role__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1608:1: ( ( rule__Role__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1609:2: ( rule__Role__NotAssignment_1 )?
            {
             before(grammarAccess.getRoleAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1610:2: ( rule__Role__NotAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1610:3: rule__Role__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1618:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1622:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalQualityEffectSpecification.g:1623:2: rule__Role__Group__2__Impl rule__Role__Group__3
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
    // InternalQualityEffectSpecification.g:1630:1: rule__Role__Group__2__Impl : ( ( rule__Role__TypeAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1634:1: ( ( ( rule__Role__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1635:1: ( ( rule__Role__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1635:1: ( ( rule__Role__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1636:2: ( rule__Role__TypeAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1637:2: ( rule__Role__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1637:3: rule__Role__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1645:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1649:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalQualityEffectSpecification.g:1650:2: rule__Role__Group__3__Impl rule__Role__Group__4
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
    // InternalQualityEffectSpecification.g:1657:1: rule__Role__Group__3__Impl : ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1661:1: ( ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1662:1: ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1662:1: ( ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1663:2: ( ( rule__Role__PropertiesAssignment_3 ) ) ( ( rule__Role__PropertiesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1663:2: ( ( rule__Role__PropertiesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1664:3: ( rule__Role__PropertiesAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1665:3: ( rule__Role__PropertiesAssignment_3 )
            // InternalQualityEffectSpecification.g:1665:4: rule__Role__PropertiesAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__Role__PropertiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1668:2: ( ( rule__Role__PropertiesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1669:3: ( rule__Role__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getRoleAccess().getPropertiesAssignment_3()); 
            // InternalQualityEffectSpecification.g:1670:3: ( rule__Role__PropertiesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=35 && LA18_0<=37)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1670:4: rule__Role__PropertiesAssignment_3
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
    // InternalQualityEffectSpecification.g:1679:1: rule__Role__Group__4 : rule__Role__Group__4__Impl ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1683:1: ( rule__Role__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1684:2: rule__Role__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1690:1: rule__Role__Group__4__Impl : ( ')' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1694:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1695:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1695:1: ( ')' )
            // InternalQualityEffectSpecification.g:1696:2: ')'
            {
             before(grammarAccess.getRoleAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1706:1: rule__Assembly__Group__0 : rule__Assembly__Group__0__Impl rule__Assembly__Group__1 ;
    public final void rule__Assembly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1710:1: ( rule__Assembly__Group__0__Impl rule__Assembly__Group__1 )
            // InternalQualityEffectSpecification.g:1711:2: rule__Assembly__Group__0__Impl rule__Assembly__Group__1
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
    // InternalQualityEffectSpecification.g:1718:1: rule__Assembly__Group__0__Impl : ( 'Assembly(' ) ;
    public final void rule__Assembly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1722:1: ( ( 'Assembly(' ) )
            // InternalQualityEffectSpecification.g:1723:1: ( 'Assembly(' )
            {
            // InternalQualityEffectSpecification.g:1723:1: ( 'Assembly(' )
            // InternalQualityEffectSpecification.g:1724:2: 'Assembly('
            {
             before(grammarAccess.getAssemblyAccess().getAssemblyKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1733:1: rule__Assembly__Group__1 : rule__Assembly__Group__1__Impl rule__Assembly__Group__2 ;
    public final void rule__Assembly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1737:1: ( rule__Assembly__Group__1__Impl rule__Assembly__Group__2 )
            // InternalQualityEffectSpecification.g:1738:2: rule__Assembly__Group__1__Impl rule__Assembly__Group__2
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
    // InternalQualityEffectSpecification.g:1745:1: rule__Assembly__Group__1__Impl : ( ( rule__Assembly__NotAssignment_1 )? ) ;
    public final void rule__Assembly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1749:1: ( ( ( rule__Assembly__NotAssignment_1 )? ) )
            // InternalQualityEffectSpecification.g:1750:1: ( ( rule__Assembly__NotAssignment_1 )? )
            {
            // InternalQualityEffectSpecification.g:1750:1: ( ( rule__Assembly__NotAssignment_1 )? )
            // InternalQualityEffectSpecification.g:1751:2: ( rule__Assembly__NotAssignment_1 )?
            {
             before(grammarAccess.getAssemblyAccess().getNotAssignment_1()); 
            // InternalQualityEffectSpecification.g:1752:2: ( rule__Assembly__NotAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1752:3: rule__Assembly__NotAssignment_1
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
    // InternalQualityEffectSpecification.g:1760:1: rule__Assembly__Group__2 : rule__Assembly__Group__2__Impl rule__Assembly__Group__3 ;
    public final void rule__Assembly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1764:1: ( rule__Assembly__Group__2__Impl rule__Assembly__Group__3 )
            // InternalQualityEffectSpecification.g:1765:2: rule__Assembly__Group__2__Impl rule__Assembly__Group__3
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
    // InternalQualityEffectSpecification.g:1772:1: rule__Assembly__Group__2__Impl : ( ( rule__Assembly__TypeAssignment_2 ) ) ;
    public final void rule__Assembly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1776:1: ( ( ( rule__Assembly__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:1777:1: ( ( rule__Assembly__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:1777:1: ( ( rule__Assembly__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:1778:2: ( rule__Assembly__TypeAssignment_2 )
            {
             before(grammarAccess.getAssemblyAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:1779:2: ( rule__Assembly__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:1779:3: rule__Assembly__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:1787:1: rule__Assembly__Group__3 : rule__Assembly__Group__3__Impl rule__Assembly__Group__4 ;
    public final void rule__Assembly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1791:1: ( rule__Assembly__Group__3__Impl rule__Assembly__Group__4 )
            // InternalQualityEffectSpecification.g:1792:2: rule__Assembly__Group__3__Impl rule__Assembly__Group__4
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
    // InternalQualityEffectSpecification.g:1799:1: rule__Assembly__Group__3__Impl : ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) ) ;
    public final void rule__Assembly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1803:1: ( ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:1804:1: ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:1804:1: ( ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:1805:2: ( ( rule__Assembly__ComponentsAssignment_3 ) ) ( ( rule__Assembly__ComponentsAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:1805:2: ( ( rule__Assembly__ComponentsAssignment_3 ) )
            // InternalQualityEffectSpecification.g:1806:3: ( rule__Assembly__ComponentsAssignment_3 )
            {
             before(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 
            // InternalQualityEffectSpecification.g:1807:3: ( rule__Assembly__ComponentsAssignment_3 )
            // InternalQualityEffectSpecification.g:1807:4: rule__Assembly__ComponentsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Assembly__ComponentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:1810:2: ( ( rule__Assembly__ComponentsAssignment_3 )* )
            // InternalQualityEffectSpecification.g:1811:3: ( rule__Assembly__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getAssemblyAccess().getComponentsAssignment_3()); 
            // InternalQualityEffectSpecification.g:1812:3: ( rule__Assembly__ComponentsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1812:4: rule__Assembly__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Assembly__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalQualityEffectSpecification.g:1821:1: rule__Assembly__Group__4 : rule__Assembly__Group__4__Impl ;
    public final void rule__Assembly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1825:1: ( rule__Assembly__Group__4__Impl )
            // InternalQualityEffectSpecification.g:1826:2: rule__Assembly__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:1832:1: rule__Assembly__Group__4__Impl : ( ')' ) ;
    public final void rule__Assembly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1836:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1837:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1837:1: ( ')' )
            // InternalQualityEffectSpecification.g:1838:2: ')'
            {
             before(grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1848:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1852:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalQualityEffectSpecification.g:1853:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalQualityEffectSpecification.g:1860:1: rule__Resource__Group__0__Impl : ( 'Resource(' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1864:1: ( ( 'Resource(' ) )
            // InternalQualityEffectSpecification.g:1865:1: ( 'Resource(' )
            {
            // InternalQualityEffectSpecification.g:1865:1: ( 'Resource(' )
            // InternalQualityEffectSpecification.g:1866:2: 'Resource('
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1875:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1879:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalQualityEffectSpecification.g:1880:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
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
    // InternalQualityEffectSpecification.g:1887:1: rule__Resource__Group__1__Impl : ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1891:1: ( ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:1892:1: ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:1892:1: ( ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:1893:2: ( ( rule__Resource__PropertiesAssignment_1 ) ) ( ( rule__Resource__PropertiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:1893:2: ( ( rule__Resource__PropertiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1894:3: ( rule__Resource__PropertiesAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1895:3: ( rule__Resource__PropertiesAssignment_1 )
            // InternalQualityEffectSpecification.g:1895:4: rule__Resource__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_21);
            rule__Resource__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:1898:2: ( ( rule__Resource__PropertiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:1899:3: ( rule__Resource__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:1900:3: ( rule__Resource__PropertiesAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=35 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1900:4: rule__Resource__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Resource__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalQualityEffectSpecification.g:1909:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1913:1: ( rule__Resource__Group__2__Impl )
            // InternalQualityEffectSpecification.g:1914:2: rule__Resource__Group__2__Impl
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
    // InternalQualityEffectSpecification.g:1920:1: rule__Resource__Group__2__Impl : ( ')' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1924:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:1925:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:1925:1: ( ')' )
            // InternalQualityEffectSpecification.g:1926:2: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1936:1: rule__NQA__Group__0 : rule__NQA__Group__0__Impl rule__NQA__Group__1 ;
    public final void rule__NQA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1940:1: ( rule__NQA__Group__0__Impl rule__NQA__Group__1 )
            // InternalQualityEffectSpecification.g:1941:2: rule__NQA__Group__0__Impl rule__NQA__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalQualityEffectSpecification.g:1948:1: rule__NQA__Group__0__Impl : ( 'NQA(' ) ;
    public final void rule__NQA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1952:1: ( ( 'NQA(' ) )
            // InternalQualityEffectSpecification.g:1953:1: ( 'NQA(' )
            {
            // InternalQualityEffectSpecification.g:1953:1: ( 'NQA(' )
            // InternalQualityEffectSpecification.g:1954:2: 'NQA('
            {
             before(grammarAccess.getNQAAccess().getNQAKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:1963:1: rule__NQA__Group__1 : rule__NQA__Group__1__Impl rule__NQA__Group__2 ;
    public final void rule__NQA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1967:1: ( rule__NQA__Group__1__Impl rule__NQA__Group__2 )
            // InternalQualityEffectSpecification.g:1968:2: rule__NQA__Group__1__Impl rule__NQA__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalQualityEffectSpecification.g:1975:1: rule__NQA__Group__1__Impl : ( ( rule__NQA__QualityAssignment_1 ) ) ;
    public final void rule__NQA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1979:1: ( ( ( rule__NQA__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:1980:1: ( ( rule__NQA__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:1980:1: ( ( rule__NQA__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:1981:2: ( rule__NQA__QualityAssignment_1 )
            {
             before(grammarAccess.getNQAAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:1982:2: ( rule__NQA__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:1982:3: rule__NQA__QualityAssignment_1
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
    // InternalQualityEffectSpecification.g:1990:1: rule__NQA__Group__2 : rule__NQA__Group__2__Impl rule__NQA__Group__3 ;
    public final void rule__NQA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:1994:1: ( rule__NQA__Group__2__Impl rule__NQA__Group__3 )
            // InternalQualityEffectSpecification.g:1995:2: rule__NQA__Group__2__Impl rule__NQA__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalQualityEffectSpecification.g:2002:1: rule__NQA__Group__2__Impl : ( ( rule__NQA__TypeAssignment_2 ) ) ;
    public final void rule__NQA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2006:1: ( ( ( rule__NQA__TypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:2007:1: ( ( rule__NQA__TypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:2007:1: ( ( rule__NQA__TypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:2008:2: ( rule__NQA__TypeAssignment_2 )
            {
             before(grammarAccess.getNQAAccess().getTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:2009:2: ( rule__NQA__TypeAssignment_2 )
            // InternalQualityEffectSpecification.g:2009:3: rule__NQA__TypeAssignment_2
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
    // InternalQualityEffectSpecification.g:2017:1: rule__NQA__Group__3 : rule__NQA__Group__3__Impl rule__NQA__Group__4 ;
    public final void rule__NQA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2021:1: ( rule__NQA__Group__3__Impl rule__NQA__Group__4 )
            // InternalQualityEffectSpecification.g:2022:2: rule__NQA__Group__3__Impl rule__NQA__Group__4
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
    // InternalQualityEffectSpecification.g:2029:1: rule__NQA__Group__3__Impl : ( ( rule__NQA__ElementAssignment_3 ) ) ;
    public final void rule__NQA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2033:1: ( ( ( rule__NQA__ElementAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2034:1: ( ( rule__NQA__ElementAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2034:1: ( ( rule__NQA__ElementAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2035:2: ( rule__NQA__ElementAssignment_3 )
            {
             before(grammarAccess.getNQAAccess().getElementAssignment_3()); 
            // InternalQualityEffectSpecification.g:2036:2: ( rule__NQA__ElementAssignment_3 )
            // InternalQualityEffectSpecification.g:2036:3: rule__NQA__ElementAssignment_3
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
    // InternalQualityEffectSpecification.g:2044:1: rule__NQA__Group__4 : rule__NQA__Group__4__Impl ;
    public final void rule__NQA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2048:1: ( rule__NQA__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2049:2: rule__NQA__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2055:1: rule__NQA__Group__4__Impl : ( ')' ) ;
    public final void rule__NQA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2059:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2060:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2060:1: ( ')' )
            // InternalQualityEffectSpecification.g:2061:2: ')'
            {
             before(grammarAccess.getNQAAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2071:1: rule__Reasoning__Group__0 : rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 ;
    public final void rule__Reasoning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2075:1: ( rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1 )
            // InternalQualityEffectSpecification.g:2076:2: rule__Reasoning__Group__0__Impl rule__Reasoning__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalQualityEffectSpecification.g:2083:1: rule__Reasoning__Group__0__Impl : ( 'Reasoning(' ) ;
    public final void rule__Reasoning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2087:1: ( ( 'Reasoning(' ) )
            // InternalQualityEffectSpecification.g:2088:1: ( 'Reasoning(' )
            {
            // InternalQualityEffectSpecification.g:2088:1: ( 'Reasoning(' )
            // InternalQualityEffectSpecification.g:2089:2: 'Reasoning('
            {
             before(grammarAccess.getReasoningAccess().getReasoningKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2098:1: rule__Reasoning__Group__1 : rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 ;
    public final void rule__Reasoning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2102:1: ( rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2 )
            // InternalQualityEffectSpecification.g:2103:2: rule__Reasoning__Group__1__Impl rule__Reasoning__Group__2
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
    // InternalQualityEffectSpecification.g:2110:1: rule__Reasoning__Group__1__Impl : ( ( rule__Reasoning__QualityAssignment_1 ) ) ;
    public final void rule__Reasoning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2114:1: ( ( ( rule__Reasoning__QualityAssignment_1 ) ) )
            // InternalQualityEffectSpecification.g:2115:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            {
            // InternalQualityEffectSpecification.g:2115:1: ( ( rule__Reasoning__QualityAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2116:2: ( rule__Reasoning__QualityAssignment_1 )
            {
             before(grammarAccess.getReasoningAccess().getQualityAssignment_1()); 
            // InternalQualityEffectSpecification.g:2117:2: ( rule__Reasoning__QualityAssignment_1 )
            // InternalQualityEffectSpecification.g:2117:3: rule__Reasoning__QualityAssignment_1
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
    // InternalQualityEffectSpecification.g:2125:1: rule__Reasoning__Group__2 : rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 ;
    public final void rule__Reasoning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2129:1: ( rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3 )
            // InternalQualityEffectSpecification.g:2130:2: rule__Reasoning__Group__2__Impl rule__Reasoning__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalQualityEffectSpecification.g:2137:1: rule__Reasoning__Group__2__Impl : ( ':' ) ;
    public final void rule__Reasoning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2141:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2142:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2142:1: ( ':' )
            // InternalQualityEffectSpecification.g:2143:2: ':'
            {
             before(grammarAccess.getReasoningAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2152:1: rule__Reasoning__Group__3 : rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 ;
    public final void rule__Reasoning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2156:1: ( rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4 )
            // InternalQualityEffectSpecification.g:2157:2: rule__Reasoning__Group__3__Impl rule__Reasoning__Group__4
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
    // InternalQualityEffectSpecification.g:2164:1: rule__Reasoning__Group__3__Impl : ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) ;
    public final void rule__Reasoning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2168:1: ( ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:2169:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:2169:1: ( ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:2170:2: ( ( rule__Reasoning__RulesAssignment_3 ) ) ( ( rule__Reasoning__RulesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:2170:2: ( ( rule__Reasoning__RulesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2171:3: ( rule__Reasoning__RulesAssignment_3 )
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2172:3: ( rule__Reasoning__RulesAssignment_3 )
            // InternalQualityEffectSpecification.g:2172:4: rule__Reasoning__RulesAssignment_3
            {
            pushFollow(FOLLOW_26);
            rule__Reasoning__RulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:2175:2: ( ( rule__Reasoning__RulesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:2176:3: ( rule__Reasoning__RulesAssignment_3 )*
            {
             before(grammarAccess.getReasoningAccess().getRulesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2177:3: ( rule__Reasoning__RulesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2177:4: rule__Reasoning__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Reasoning__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalQualityEffectSpecification.g:2186:1: rule__Reasoning__Group__4 : rule__Reasoning__Group__4__Impl ;
    public final void rule__Reasoning__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2190:1: ( rule__Reasoning__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2191:2: rule__Reasoning__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2197:1: rule__Reasoning__Group__4__Impl : ( ')' ) ;
    public final void rule__Reasoning__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2201:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2202:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2202:1: ( ')' )
            // InternalQualityEffectSpecification.g:2203:2: ')'
            {
             before(grammarAccess.getReasoningAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2213:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2217:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalQualityEffectSpecification.g:2218:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalQualityEffectSpecification.g:2225:1: rule__Rule__Group__0__Impl : ( '(' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2229:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2230:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2230:1: ( '(' )
            // InternalQualityEffectSpecification.g:2231:2: '('
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
    // InternalQualityEffectSpecification.g:2240:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2244:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalQualityEffectSpecification.g:2245:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalQualityEffectSpecification.g:2252:1: rule__Rule__Group__1__Impl : ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2256:1: ( ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2257:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2257:1: ( ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2258:2: ( ( rule__Rule__QualitiesAssignment_1 ) ) ( ( rule__Rule__QualitiesAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2258:2: ( ( rule__Rule__QualitiesAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2259:3: ( rule__Rule__QualitiesAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2260:3: ( rule__Rule__QualitiesAssignment_1 )
            // InternalQualityEffectSpecification.g:2260:4: rule__Rule__QualitiesAssignment_1
            {
            pushFollow(FOLLOW_27);
            rule__Rule__QualitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2263:2: ( ( rule__Rule__QualitiesAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2264:3: ( rule__Rule__QualitiesAssignment_1 )*
            {
             before(grammarAccess.getRuleAccess().getQualitiesAssignment_1()); 
            // InternalQualityEffectSpecification.g:2265:3: ( rule__Rule__QualitiesAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2265:4: rule__Rule__QualitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Rule__QualitiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalQualityEffectSpecification.g:2274:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2278:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalQualityEffectSpecification.g:2279:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalQualityEffectSpecification.g:2286:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2290:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2291:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2291:1: ( ':' )
            // InternalQualityEffectSpecification.g:2292:2: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2301:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2305:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalQualityEffectSpecification.g:2306:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalQualityEffectSpecification.g:2313:1: rule__Rule__Group__3__Impl : ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2317:1: ( ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) ) )
            // InternalQualityEffectSpecification.g:2318:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) )
            {
            // InternalQualityEffectSpecification.g:2318:1: ( ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* ) )
            // InternalQualityEffectSpecification.g:2319:2: ( ( rule__Rule__EntriesAssignment_3 ) ) ( ( rule__Rule__EntriesAssignment_3 )* )
            {
            // InternalQualityEffectSpecification.g:2319:2: ( ( rule__Rule__EntriesAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2320:3: ( rule__Rule__EntriesAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2321:3: ( rule__Rule__EntriesAssignment_3 )
            // InternalQualityEffectSpecification.g:2321:4: rule__Rule__EntriesAssignment_3
            {
            pushFollow(FOLLOW_29);
            rule__Rule__EntriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 

            }

            // InternalQualityEffectSpecification.g:2324:2: ( ( rule__Rule__EntriesAssignment_3 )* )
            // InternalQualityEffectSpecification.g:2325:3: ( rule__Rule__EntriesAssignment_3 )*
            {
             before(grammarAccess.getRuleAccess().getEntriesAssignment_3()); 
            // InternalQualityEffectSpecification.g:2326:3: ( rule__Rule__EntriesAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2326:4: rule__Rule__EntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Rule__EntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalQualityEffectSpecification.g:2335:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2339:1: ( rule__Rule__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2340:2: rule__Rule__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2346:1: rule__Rule__Group__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2350:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2351:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2351:1: ( ')' )
            // InternalQualityEffectSpecification.g:2352:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2362:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2366:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalQualityEffectSpecification.g:2367:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalQualityEffectSpecification.g:2374:1: rule__Entry__Group__0__Impl : ( '[' ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2378:1: ( ( '[' ) )
            // InternalQualityEffectSpecification.g:2379:1: ( '[' )
            {
            // InternalQualityEffectSpecification.g:2379:1: ( '[' )
            // InternalQualityEffectSpecification.g:2380:2: '['
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
    // InternalQualityEffectSpecification.g:2389:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2393:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalQualityEffectSpecification.g:2394:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
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
    // InternalQualityEffectSpecification.g:2401:1: rule__Entry__Group__1__Impl : ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2405:1: ( ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) ) )
            // InternalQualityEffectSpecification.g:2406:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            {
            // InternalQualityEffectSpecification.g:2406:1: ( ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* ) )
            // InternalQualityEffectSpecification.g:2407:2: ( ( rule__Entry__KeyAssignment_1 ) ) ( ( rule__Entry__KeyAssignment_1 )* )
            {
            // InternalQualityEffectSpecification.g:2407:2: ( ( rule__Entry__KeyAssignment_1 ) )
            // InternalQualityEffectSpecification.g:2408:3: ( rule__Entry__KeyAssignment_1 )
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:2409:3: ( rule__Entry__KeyAssignment_1 )
            // InternalQualityEffectSpecification.g:2409:4: rule__Entry__KeyAssignment_1
            {
            pushFollow(FOLLOW_27);
            rule__Entry__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getKeyAssignment_1()); 

            }

            // InternalQualityEffectSpecification.g:2412:2: ( ( rule__Entry__KeyAssignment_1 )* )
            // InternalQualityEffectSpecification.g:2413:3: ( rule__Entry__KeyAssignment_1 )*
            {
             before(grammarAccess.getEntryAccess().getKeyAssignment_1()); 
            // InternalQualityEffectSpecification.g:2414:3: ( rule__Entry__KeyAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:2414:4: rule__Entry__KeyAssignment_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Entry__KeyAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalQualityEffectSpecification.g:2423:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2427:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalQualityEffectSpecification.g:2428:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalQualityEffectSpecification.g:2435:1: rule__Entry__Group__2__Impl : ( ':' ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2439:1: ( ( ':' ) )
            // InternalQualityEffectSpecification.g:2440:1: ( ':' )
            {
            // InternalQualityEffectSpecification.g:2440:1: ( ':' )
            // InternalQualityEffectSpecification.g:2441:2: ':'
            {
             before(grammarAccess.getEntryAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2450:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2454:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalQualityEffectSpecification.g:2455:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
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
    // InternalQualityEffectSpecification.g:2462:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__ValueAssignment_3 ) ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2466:1: ( ( ( rule__Entry__ValueAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2467:1: ( ( rule__Entry__ValueAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2467:1: ( ( rule__Entry__ValueAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2468:2: ( rule__Entry__ValueAssignment_3 )
            {
             before(grammarAccess.getEntryAccess().getValueAssignment_3()); 
            // InternalQualityEffectSpecification.g:2469:2: ( rule__Entry__ValueAssignment_3 )
            // InternalQualityEffectSpecification.g:2469:3: rule__Entry__ValueAssignment_3
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
    // InternalQualityEffectSpecification.g:2477:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2481:1: ( rule__Entry__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2482:2: rule__Entry__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2488:1: rule__Entry__Group__4__Impl : ( ']' ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2492:1: ( ( ']' ) )
            // InternalQualityEffectSpecification.g:2493:1: ( ']' )
            {
            // InternalQualityEffectSpecification.g:2493:1: ( ']' )
            // InternalQualityEffectSpecification.g:2494:2: ']'
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


    // $ANTLR start "rule__NumericValue__Group__0"
    // InternalQualityEffectSpecification.g:2504:1: rule__NumericValue__Group__0 : rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1 ;
    public final void rule__NumericValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2508:1: ( rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1 )
            // InternalQualityEffectSpecification.g:2509:2: rule__NumericValue__Group__0__Impl rule__NumericValue__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalQualityEffectSpecification.g:2516:1: rule__NumericValue__Group__0__Impl : ( ( rule__NumericValue__ValueTypeAssignment_0 ) ) ;
    public final void rule__NumericValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2520:1: ( ( ( rule__NumericValue__ValueTypeAssignment_0 ) ) )
            // InternalQualityEffectSpecification.g:2521:1: ( ( rule__NumericValue__ValueTypeAssignment_0 ) )
            {
            // InternalQualityEffectSpecification.g:2521:1: ( ( rule__NumericValue__ValueTypeAssignment_0 ) )
            // InternalQualityEffectSpecification.g:2522:2: ( rule__NumericValue__ValueTypeAssignment_0 )
            {
             before(grammarAccess.getNumericValueAccess().getValueTypeAssignment_0()); 
            // InternalQualityEffectSpecification.g:2523:2: ( rule__NumericValue__ValueTypeAssignment_0 )
            // InternalQualityEffectSpecification.g:2523:3: rule__NumericValue__ValueTypeAssignment_0
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
    // InternalQualityEffectSpecification.g:2531:1: rule__NumericValue__Group__1 : rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2 ;
    public final void rule__NumericValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2535:1: ( rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2 )
            // InternalQualityEffectSpecification.g:2536:2: rule__NumericValue__Group__1__Impl rule__NumericValue__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalQualityEffectSpecification.g:2543:1: rule__NumericValue__Group__1__Impl : ( '(' ) ;
    public final void rule__NumericValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2547:1: ( ( '(' ) )
            // InternalQualityEffectSpecification.g:2548:1: ( '(' )
            {
            // InternalQualityEffectSpecification.g:2548:1: ( '(' )
            // InternalQualityEffectSpecification.g:2549:2: '('
            {
             before(grammarAccess.getNumericValueAccess().getLeftParenthesisKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2558:1: rule__NumericValue__Group__2 : rule__NumericValue__Group__2__Impl rule__NumericValue__Group__3 ;
    public final void rule__NumericValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2562:1: ( rule__NumericValue__Group__2__Impl rule__NumericValue__Group__3 )
            // InternalQualityEffectSpecification.g:2563:2: rule__NumericValue__Group__2__Impl rule__NumericValue__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalQualityEffectSpecification.g:2570:1: rule__NumericValue__Group__2__Impl : ( ( rule__NumericValue__TransformationTypeAssignment_2 ) ) ;
    public final void rule__NumericValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2574:1: ( ( ( rule__NumericValue__TransformationTypeAssignment_2 ) ) )
            // InternalQualityEffectSpecification.g:2575:1: ( ( rule__NumericValue__TransformationTypeAssignment_2 ) )
            {
            // InternalQualityEffectSpecification.g:2575:1: ( ( rule__NumericValue__TransformationTypeAssignment_2 ) )
            // InternalQualityEffectSpecification.g:2576:2: ( rule__NumericValue__TransformationTypeAssignment_2 )
            {
             before(grammarAccess.getNumericValueAccess().getTransformationTypeAssignment_2()); 
            // InternalQualityEffectSpecification.g:2577:2: ( rule__NumericValue__TransformationTypeAssignment_2 )
            // InternalQualityEffectSpecification.g:2577:3: rule__NumericValue__TransformationTypeAssignment_2
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
    // InternalQualityEffectSpecification.g:2585:1: rule__NumericValue__Group__3 : rule__NumericValue__Group__3__Impl rule__NumericValue__Group__4 ;
    public final void rule__NumericValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2589:1: ( rule__NumericValue__Group__3__Impl rule__NumericValue__Group__4 )
            // InternalQualityEffectSpecification.g:2590:2: rule__NumericValue__Group__3__Impl rule__NumericValue__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalQualityEffectSpecification.g:2597:1: rule__NumericValue__Group__3__Impl : ( ( rule__NumericValue__TransformationNumberAssignment_3 ) ) ;
    public final void rule__NumericValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2601:1: ( ( ( rule__NumericValue__TransformationNumberAssignment_3 ) ) )
            // InternalQualityEffectSpecification.g:2602:1: ( ( rule__NumericValue__TransformationNumberAssignment_3 ) )
            {
            // InternalQualityEffectSpecification.g:2602:1: ( ( rule__NumericValue__TransformationNumberAssignment_3 ) )
            // InternalQualityEffectSpecification.g:2603:2: ( rule__NumericValue__TransformationNumberAssignment_3 )
            {
             before(grammarAccess.getNumericValueAccess().getTransformationNumberAssignment_3()); 
            // InternalQualityEffectSpecification.g:2604:2: ( rule__NumericValue__TransformationNumberAssignment_3 )
            // InternalQualityEffectSpecification.g:2604:3: rule__NumericValue__TransformationNumberAssignment_3
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
    // InternalQualityEffectSpecification.g:2612:1: rule__NumericValue__Group__4 : rule__NumericValue__Group__4__Impl ;
    public final void rule__NumericValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2616:1: ( rule__NumericValue__Group__4__Impl )
            // InternalQualityEffectSpecification.g:2617:2: rule__NumericValue__Group__4__Impl
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
    // InternalQualityEffectSpecification.g:2623:1: rule__NumericValue__Group__4__Impl : ( ')' ) ;
    public final void rule__NumericValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2627:1: ( ( ')' ) )
            // InternalQualityEffectSpecification.g:2628:1: ( ')' )
            {
            // InternalQualityEffectSpecification.g:2628:1: ( ')' )
            // InternalQualityEffectSpecification.g:2629:2: ')'
            {
             before(grammarAccess.getNumericValueAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__SpecificationsAssignment"
    // InternalQualityEffectSpecification.g:2639:1: rule__Model__SpecificationsAssignment : ( ruleQES ) ;
    public final void rule__Model__SpecificationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2643:1: ( ( ruleQES ) )
            // InternalQualityEffectSpecification.g:2644:2: ( ruleQES )
            {
            // InternalQualityEffectSpecification.g:2644:2: ( ruleQES )
            // InternalQualityEffectSpecification.g:2645:3: ruleQES
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
    // InternalQualityEffectSpecification.g:2654:1: rule__QES__ComponentsAssignment_1 : ( ruleComponentSpecification ) ;
    public final void rule__QES__ComponentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2658:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:2659:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:2659:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:2660:3: ruleComponentSpecification
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
    // InternalQualityEffectSpecification.g:2669:1: rule__QES__TransformationsAssignment_4 : ( ruleTransformationSpecification ) ;
    public final void rule__QES__TransformationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2673:1: ( ( ruleTransformationSpecification ) )
            // InternalQualityEffectSpecification.g:2674:2: ( ruleTransformationSpecification )
            {
            // InternalQualityEffectSpecification.g:2674:2: ( ruleTransformationSpecification )
            // InternalQualityEffectSpecification.g:2675:3: ruleTransformationSpecification
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
    // InternalQualityEffectSpecification.g:2684:1: rule__ComponentSpecification__PropertiesAssignment_1 : ( ruleComponentProperty ) ;
    public final void rule__ComponentSpecification__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2688:1: ( ( ruleComponentProperty ) )
            // InternalQualityEffectSpecification.g:2689:2: ( ruleComponentProperty )
            {
            // InternalQualityEffectSpecification.g:2689:2: ( ruleComponentProperty )
            // InternalQualityEffectSpecification.g:2690:3: ruleComponentProperty
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
    // InternalQualityEffectSpecification.g:2699:1: rule__Name__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Name__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2703:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2704:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2704:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2705:3: ( 'Not' )
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2706:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2707:4: 'Not'
            {
             before(grammarAccess.getNameAccess().getNotNotKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2718:1: rule__Name__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Name__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2722:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2723:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2723:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2724:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2733:1: rule__Identifier__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Identifier__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2737:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2738:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2738:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2739:3: ( 'Not' )
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2740:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2741:4: 'Not'
            {
             before(grammarAccess.getIdentifierAccess().getNotNotKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2752:1: rule__Identifier__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__Identifier__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2756:1: ( ( RULE_ID ) )
            // InternalQualityEffectSpecification.g:2757:2: ( RULE_ID )
            {
            // InternalQualityEffectSpecification.g:2757:2: ( RULE_ID )
            // InternalQualityEffectSpecification.g:2758:3: RULE_ID
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


    // $ANTLR start "rule__Annotation__NotAssignment_1"
    // InternalQualityEffectSpecification.g:2767:1: rule__Annotation__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Annotation__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2771:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2772:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2772:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2773:3: ( 'Not' )
            {
             before(grammarAccess.getAnnotationAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2774:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2775:4: 'Not'
            {
             before(grammarAccess.getAnnotationAccess().getNotNotKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getAnnotationAccess().getNotNotKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__NotAssignment_1"


    // $ANTLR start "rule__Annotation__AnnotationAssignment_2"
    // InternalQualityEffectSpecification.g:2786:1: rule__Annotation__AnnotationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Annotation__AnnotationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2790:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2791:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2791:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2792:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getAnnotationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AnnotationAssignment_2"


    // $ANTLR start "rule__Type__NotAssignment_1"
    // InternalQualityEffectSpecification.g:2801:1: rule__Type__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Type__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2805:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2806:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2806:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2807:3: ( 'Not' )
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2808:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2809:4: 'Not'
            {
             before(grammarAccess.getTypeAccess().getNotNotKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2820:1: rule__Type__TypeAssignment_2 : ( ruleComponentType ) ;
    public final void rule__Type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2824:1: ( ( ruleComponentType ) )
            // InternalQualityEffectSpecification.g:2825:2: ( ruleComponentType )
            {
            // InternalQualityEffectSpecification.g:2825:2: ( ruleComponentType )
            // InternalQualityEffectSpecification.g:2826:3: ruleComponentType
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
    // InternalQualityEffectSpecification.g:2835:1: rule__Role__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Role__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2839:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2840:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2840:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2841:3: ( 'Not' )
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2842:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2843:4: 'Not'
            {
             before(grammarAccess.getRoleAccess().getNotNotKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2854:1: rule__Role__TypeAssignment_2 : ( ruleRoleType ) ;
    public final void rule__Role__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2858:1: ( ( ruleRoleType ) )
            // InternalQualityEffectSpecification.g:2859:2: ( ruleRoleType )
            {
            // InternalQualityEffectSpecification.g:2859:2: ( ruleRoleType )
            // InternalQualityEffectSpecification.g:2860:3: ruleRoleType
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
    // InternalQualityEffectSpecification.g:2869:1: rule__Role__PropertiesAssignment_3 : ( ruleRoleProperty ) ;
    public final void rule__Role__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2873:1: ( ( ruleRoleProperty ) )
            // InternalQualityEffectSpecification.g:2874:2: ( ruleRoleProperty )
            {
            // InternalQualityEffectSpecification.g:2874:2: ( ruleRoleProperty )
            // InternalQualityEffectSpecification.g:2875:3: ruleRoleProperty
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
    // InternalQualityEffectSpecification.g:2884:1: rule__Assembly__NotAssignment_1 : ( ( 'Not' ) ) ;
    public final void rule__Assembly__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2888:1: ( ( ( 'Not' ) ) )
            // InternalQualityEffectSpecification.g:2889:2: ( ( 'Not' ) )
            {
            // InternalQualityEffectSpecification.g:2889:2: ( ( 'Not' ) )
            // InternalQualityEffectSpecification.g:2890:3: ( 'Not' )
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 
            // InternalQualityEffectSpecification.g:2891:3: ( 'Not' )
            // InternalQualityEffectSpecification.g:2892:4: 'Not'
            {
             before(grammarAccess.getAssemblyAccess().getNotNotKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalQualityEffectSpecification.g:2903:1: rule__Assembly__TypeAssignment_2 : ( ruleAssemblyType ) ;
    public final void rule__Assembly__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2907:1: ( ( ruleAssemblyType ) )
            // InternalQualityEffectSpecification.g:2908:2: ( ruleAssemblyType )
            {
            // InternalQualityEffectSpecification.g:2908:2: ( ruleAssemblyType )
            // InternalQualityEffectSpecification.g:2909:3: ruleAssemblyType
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
    // InternalQualityEffectSpecification.g:2918:1: rule__Assembly__ComponentsAssignment_3 : ( ruleComponentSpecification ) ;
    public final void rule__Assembly__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2922:1: ( ( ruleComponentSpecification ) )
            // InternalQualityEffectSpecification.g:2923:2: ( ruleComponentSpecification )
            {
            // InternalQualityEffectSpecification.g:2923:2: ( ruleComponentSpecification )
            // InternalQualityEffectSpecification.g:2924:3: ruleComponentSpecification
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
    // InternalQualityEffectSpecification.g:2933:1: rule__Resource__PropertiesAssignment_1 : ( ruleResourceProperty ) ;
    public final void rule__Resource__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2937:1: ( ( ruleResourceProperty ) )
            // InternalQualityEffectSpecification.g:2938:2: ( ruleResourceProperty )
            {
            // InternalQualityEffectSpecification.g:2938:2: ( ruleResourceProperty )
            // InternalQualityEffectSpecification.g:2939:3: ruleResourceProperty
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
    // InternalQualityEffectSpecification.g:2948:1: rule__NQA__QualityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NQA__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2952:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2953:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2953:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2954:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2963:1: rule__NQA__TypeAssignment_2 : ( ruleTransformationType ) ;
    public final void rule__NQA__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2967:1: ( ( ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:2968:2: ( ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:2968:2: ( ruleTransformationType )
            // InternalQualityEffectSpecification.g:2969:3: ruleTransformationType
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
    // InternalQualityEffectSpecification.g:2978:1: rule__NQA__ElementAssignment_3 : ( RULE_STRING ) ;
    public final void rule__NQA__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2982:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2983:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2983:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2984:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:2993:1: rule__Reasoning__QualityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Reasoning__QualityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:2997:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:2998:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:2998:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:2999:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:3008:1: rule__Reasoning__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Reasoning__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3012:1: ( ( ruleRule ) )
            // InternalQualityEffectSpecification.g:3013:2: ( ruleRule )
            {
            // InternalQualityEffectSpecification.g:3013:2: ( ruleRule )
            // InternalQualityEffectSpecification.g:3014:3: ruleRule
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
    // InternalQualityEffectSpecification.g:3023:1: rule__Rule__QualitiesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Rule__QualitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3027:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3028:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3028:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3029:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:3038:1: rule__Rule__EntriesAssignment_3 : ( ruleEntry ) ;
    public final void rule__Rule__EntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3042:1: ( ( ruleEntry ) )
            // InternalQualityEffectSpecification.g:3043:2: ( ruleEntry )
            {
            // InternalQualityEffectSpecification.g:3043:2: ( ruleEntry )
            // InternalQualityEffectSpecification.g:3044:3: ruleEntry
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
    // InternalQualityEffectSpecification.g:3053:1: rule__Entry__KeyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3057:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3058:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3058:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3059:3: RULE_STRING
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
    // InternalQualityEffectSpecification.g:3068:1: rule__Entry__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Entry__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3072:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3073:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3073:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3074:3: RULE_STRING
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


    // $ANTLR start "rule__NumericValue__ValueTypeAssignment_0"
    // InternalQualityEffectSpecification.g:3083:1: rule__NumericValue__ValueTypeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__NumericValue__ValueTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3087:1: ( ( RULE_STRING ) )
            // InternalQualityEffectSpecification.g:3088:2: ( RULE_STRING )
            {
            // InternalQualityEffectSpecification.g:3088:2: ( RULE_STRING )
            // InternalQualityEffectSpecification.g:3089:3: RULE_STRING
            {
             before(grammarAccess.getNumericValueAccess().getValueTypeSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericValueAccess().getValueTypeSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalQualityEffectSpecification.g:3098:1: rule__NumericValue__TransformationTypeAssignment_2 : ( ruleTransformationType ) ;
    public final void rule__NumericValue__TransformationTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3102:1: ( ( ruleTransformationType ) )
            // InternalQualityEffectSpecification.g:3103:2: ( ruleTransformationType )
            {
            // InternalQualityEffectSpecification.g:3103:2: ( ruleTransformationType )
            // InternalQualityEffectSpecification.g:3104:3: ruleTransformationType
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
    // InternalQualityEffectSpecification.g:3113:1: rule__NumericValue__TransformationNumberAssignment_3 : ( RULE_NUMBER ) ;
    public final void rule__NumericValue__TransformationNumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQualityEffectSpecification.g:3117:1: ( ( RULE_NUMBER ) )
            // InternalQualityEffectSpecification.g:3118:2: ( RULE_NUMBER )
            {
            // InternalQualityEffectSpecification.g:3118:2: ( RULE_NUMBER )
            // InternalQualityEffectSpecification.g:3119:3: RULE_NUMBER
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000C0000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000C0000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000003F800000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000007000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00010000003F8000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000001C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});

}