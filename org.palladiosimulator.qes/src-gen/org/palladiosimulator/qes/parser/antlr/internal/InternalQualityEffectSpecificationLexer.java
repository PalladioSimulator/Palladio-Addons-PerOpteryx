package org.palladiosimulator.qes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQualityEffectSpecificationLexer extends Lexer {
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

    public InternalQualityEffectSpecificationLexer() {;} 
    public InternalQualityEffectSpecificationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQualityEffectSpecificationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalQualityEffectSpecification.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:11:7: ( 'For' )
            // InternalQualityEffectSpecification.g:11:9: 'For'
            {
            match("For"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:12:7: ( '{' )
            // InternalQualityEffectSpecification.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:13:7: ( 'and' )
            // InternalQualityEffectSpecification.g:13:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:14:7: ( '}' )
            // InternalQualityEffectSpecification.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:15:7: ( 'Do' )
            // InternalQualityEffectSpecification.g:15:9: 'Do'
            {
            match("Do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:16:7: ( 'Component' )
            // InternalQualityEffectSpecification.g:16:9: 'Component'
            {
            match("Component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:17:7: ( '(' )
            // InternalQualityEffectSpecification.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:18:7: ( ')' )
            // InternalQualityEffectSpecification.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:19:7: ( 'Name' )
            // InternalQualityEffectSpecification.g:19:9: 'Name'
            {
            match("Name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:20:7: ( 'not' )
            // InternalQualityEffectSpecification.g:20:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:21:7: ( 'Id' )
            // InternalQualityEffectSpecification.g:21:9: 'Id'
            {
            match("Id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:22:7: ( 'Annotation' )
            // InternalQualityEffectSpecification.g:22:9: 'Annotation'
            {
            match("Annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:23:7: ( 'Type' )
            // InternalQualityEffectSpecification.g:23:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:24:7: ( 'Role' )
            // InternalQualityEffectSpecification.g:24:9: 'Role'
            {
            match("Role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:25:7: ( 'with' )
            // InternalQualityEffectSpecification.g:25:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:26:7: ( 'Assembly' )
            // InternalQualityEffectSpecification.g:26:9: 'Assembly'
            {
            match("Assembly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:27:7: ( 'Resource' )
            // InternalQualityEffectSpecification.g:27:9: 'Resource'
            {
            match("Resource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:28:7: ( 'NQA' )
            // InternalQualityEffectSpecification.g:28:9: 'NQA'
            {
            match("NQA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:29:7: ( 'Reasoning' )
            // InternalQualityEffectSpecification.g:29:9: 'Reasoning'
            {
            match("Reasoning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:30:7: ( '=' )
            // InternalQualityEffectSpecification.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:31:7: ( ',' )
            // InternalQualityEffectSpecification.g:31:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:32:7: ( 'Rule' )
            // InternalQualityEffectSpecification.g:32:9: 'Rule'
            {
            match("Rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:33:7: ( 'Entry' )
            // InternalQualityEffectSpecification.g:33:9: 'Entry'
            {
            match("Entry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:34:7: ( 'AnyComponentType' )
            // InternalQualityEffectSpecification.g:34:9: 'AnyComponentType'
            {
            match("AnyComponentType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:35:7: ( 'Basic' )
            // InternalQualityEffectSpecification.g:35:9: 'Basic'
            {
            match("Basic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:36:7: ( 'Composite' )
            // InternalQualityEffectSpecification.g:36:9: 'Composite'
            {
            match("Composite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:37:7: ( 'AnyRoleType' )
            // InternalQualityEffectSpecification.g:37:9: 'AnyRoleType'
            {
            match("AnyRoleType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:38:7: ( 'ComponentRequiredProvided' )
            // InternalQualityEffectSpecification.g:38:9: 'ComponentRequiredProvided'
            {
            match("ComponentRequiredProvided"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:39:7: ( 'ComponentRequired' )
            // InternalQualityEffectSpecification.g:39:9: 'ComponentRequired'
            {
            match("ComponentRequired"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:40:7: ( 'ComponentProvided' )
            // InternalQualityEffectSpecification.g:40:9: 'ComponentProvided'
            {
            match("ComponentProvided"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:41:7: ( 'InfrastructureRequiredProvided' )
            // InternalQualityEffectSpecification.g:41:9: 'InfrastructureRequiredProvided'
            {
            match("InfrastructureRequiredProvided"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:42:7: ( 'InfrastructureRequired' )
            // InternalQualityEffectSpecification.g:42:9: 'InfrastructureRequired'
            {
            match("InfrastructureRequired"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:43:7: ( 'InfrastructureProvided' )
            // InternalQualityEffectSpecification.g:43:9: 'InfrastructureProvided'
            {
            match("InfrastructureProvided"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:44:7: ( 'AnyAssembly' )
            // InternalQualityEffectSpecification.g:44:9: 'AnyAssembly'
            {
            match("AnyAssembly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:45:7: ( 'Required' )
            // InternalQualityEffectSpecification.g:45:9: 'Required'
            {
            match("Required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:46:7: ( 'Provided' )
            // InternalQualityEffectSpecification.g:46:9: 'Provided'
            {
            match("Provided"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:47:7: ( '+' )
            // InternalQualityEffectSpecification.g:47:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:48:7: ( '-' )
            // InternalQualityEffectSpecification.g:48:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:49:7: ( '*' )
            // InternalQualityEffectSpecification.g:49:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:50:7: ( '/' )
            // InternalQualityEffectSpecification.g:50:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:1744:13: ( RULE_INT ( '.' RULE_INT )? )
            // InternalQualityEffectSpecification.g:1744:15: RULE_INT ( '.' RULE_INT )?
            {
            mRULE_INT(); 
            // InternalQualityEffectSpecification.g:1744:24: ( '.' RULE_INT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='.') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1744:25: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:1746:9: ( ( '\\r' )? '\\n' )
            // InternalQualityEffectSpecification.g:1746:11: ( '\\r' )? '\\n'
            {
            // InternalQualityEffectSpecification.g:1746:11: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1746:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:1748:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQualityEffectSpecification.g:1748:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQualityEffectSpecification.g:1748:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1748:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalQualityEffectSpecification.g:1748:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalQualityEffectSpecification.g:1750:19: ( ( '0' .. '9' )+ )
            // InternalQualityEffectSpecification.g:1750:21: ( '0' .. '9' )+
            {
            // InternalQualityEffectSpecification.g:1750:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1750:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:1752:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQualityEffectSpecification.g:1752:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQualityEffectSpecification.g:1752:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1752:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQualityEffectSpecification.g:1752:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalQualityEffectSpecification.g:1752:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQualityEffectSpecification.g:1752:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalQualityEffectSpecification.g:1752:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQualityEffectSpecification.g:1752:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalQualityEffectSpecification.g:1752:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQualityEffectSpecification.g:1752:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:1754:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQualityEffectSpecification.g:1754:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQualityEffectSpecification.g:1754:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1754:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:1756:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalQualityEffectSpecification.g:1756:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalQualityEffectSpecification.g:1756:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:1756:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalQualityEffectSpecification.g:1756:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQualityEffectSpecification.g:1756:41: ( '\\r' )? '\\n'
                    {
                    // InternalQualityEffectSpecification.g:1756:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalQualityEffectSpecification.g:1756:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:1758:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQualityEffectSpecification.g:1758:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQualityEffectSpecification.g:1758:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQualityEffectSpecification.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQualityEffectSpecification.g:1760:16: ( . )
            // InternalQualityEffectSpecification.g:1760:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalQualityEffectSpecification.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_NUMBER | RULE_NL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=48;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalQualityEffectSpecification.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalQualityEffectSpecification.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalQualityEffectSpecification.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalQualityEffectSpecification.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalQualityEffectSpecification.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalQualityEffectSpecification.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalQualityEffectSpecification.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalQualityEffectSpecification.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalQualityEffectSpecification.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalQualityEffectSpecification.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalQualityEffectSpecification.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalQualityEffectSpecification.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalQualityEffectSpecification.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalQualityEffectSpecification.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalQualityEffectSpecification.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalQualityEffectSpecification.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalQualityEffectSpecification.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalQualityEffectSpecification.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalQualityEffectSpecification.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalQualityEffectSpecification.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalQualityEffectSpecification.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalQualityEffectSpecification.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalQualityEffectSpecification.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalQualityEffectSpecification.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalQualityEffectSpecification.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalQualityEffectSpecification.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalQualityEffectSpecification.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalQualityEffectSpecification.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalQualityEffectSpecification.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalQualityEffectSpecification.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalQualityEffectSpecification.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalQualityEffectSpecification.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalQualityEffectSpecification.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalQualityEffectSpecification.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalQualityEffectSpecification.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalQualityEffectSpecification.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalQualityEffectSpecification.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalQualityEffectSpecification.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalQualityEffectSpecification.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalQualityEffectSpecification.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalQualityEffectSpecification.g:1:250: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 42 :
                // InternalQualityEffectSpecification.g:1:262: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 43 :
                // InternalQualityEffectSpecification.g:1:270: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // InternalQualityEffectSpecification.g:1:278: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalQualityEffectSpecification.g:1:290: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // InternalQualityEffectSpecification.g:1:306: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // InternalQualityEffectSpecification.g:1:322: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // InternalQualityEffectSpecification.g:1:330: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\43\1\uffff\1\43\1\uffff\2\43\2\uffff\7\43\2\uffff\3\43\3\uffff\1\101\1\uffff\1\103\1\105\1\41\1\uffff\2\41\2\uffff\1\43\2\uffff\1\43\1\uffff\1\111\1\43\2\uffff\3\43\1\116\10\43\2\uffff\3\43\10\uffff\1\105\2\uffff\1\135\1\136\1\uffff\2\43\1\141\1\142\1\uffff\16\43\2\uffff\1\43\1\164\2\uffff\6\43\1\173\1\174\3\43\1\u0080\1\u0081\4\43\1\uffff\6\43\2\uffff\3\43\2\uffff\1\u0090\1\u0091\14\43\2\uffff\24\43\1\u00b2\1\u00b3\1\43\1\u00b5\1\u00b6\1\u00b9\1\u00ba\5\43\2\uffff\1\u00c0\2\uffff\2\43\2\uffff\1\43\1\u00c4\3\43\1\uffff\3\43\1\uffff\1\43\1\u00cc\1\u00cd\4\43\2\uffff\21\43\1\u00e4\1\u00e6\1\u00e7\2\43\1\uffff\1\43\2\uffff\14\43\1\u00f8\1\u00f9\2\43\2\uffff\2\43\1\u00fe\1\43\1\uffff\4\43\1\u0104\1\uffff";
    static final String DFA14_eofS =
        "\u0105\uffff";
    static final String DFA14_minS =
        "\1\0\1\157\1\uffff\1\156\1\uffff\2\157\2\uffff\1\121\1\157\1\144\1\156\1\171\1\145\1\151\2\uffff\1\156\1\141\1\162\3\uffff\1\52\1\uffff\1\12\1\11\1\101\1\uffff\2\0\2\uffff\1\162\2\uffff\1\144\1\uffff\1\60\1\155\2\uffff\1\155\1\101\1\164\1\60\1\146\1\156\1\163\1\160\1\154\1\141\1\154\1\164\2\uffff\1\164\1\163\1\157\10\uffff\1\11\2\uffff\2\60\1\uffff\1\160\1\145\2\60\1\uffff\1\162\1\157\1\101\3\145\1\157\1\163\1\165\1\145\1\150\1\162\1\151\1\166\2\uffff\1\157\1\60\2\uffff\1\141\1\164\2\157\1\163\1\155\2\60\1\165\1\157\1\151\2\60\1\171\1\143\1\151\1\156\1\uffff\1\163\1\141\1\155\1\154\1\163\1\142\2\uffff\1\162\1\156\1\162\2\uffff\2\60\1\144\1\145\1\151\2\164\1\160\2\145\1\154\1\143\1\151\1\145\2\uffff\1\145\1\156\1\164\1\162\1\151\1\157\1\124\1\155\1\171\1\145\1\156\2\144\1\164\1\145\1\165\1\157\1\156\1\171\1\142\2\60\1\147\4\60\1\143\1\156\1\145\1\160\1\154\2\uffff\1\60\2\uffff\1\145\1\162\2\uffff\1\164\1\60\1\156\1\145\1\171\1\uffff\1\161\1\157\1\165\1\uffff\1\164\2\60\1\165\1\166\1\162\1\124\2\uffff\2\151\1\145\1\171\1\162\1\144\1\120\1\160\3\145\1\162\1\145\2\144\1\161\1\157\3\60\1\165\1\166\1\uffff\1\162\2\uffff\2\151\1\157\1\162\1\144\1\166\2\145\1\151\3\144\2\60\1\145\1\162\2\uffff\1\144\1\157\1\60\1\166\1\uffff\1\151\1\144\1\145\1\144\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\157\1\uffff\1\156\1\uffff\2\157\2\uffff\1\141\1\157\1\156\1\163\1\171\1\165\1\151\2\uffff\1\156\1\141\1\162\3\uffff\1\57\1\uffff\1\12\1\40\1\172\1\uffff\2\uffff\2\uffff\1\162\2\uffff\1\144\1\uffff\1\172\1\155\2\uffff\1\155\1\101\1\164\1\172\1\146\1\171\1\163\1\160\1\154\1\163\1\154\1\164\2\uffff\1\164\1\163\1\157\10\uffff\1\40\2\uffff\2\172\1\uffff\1\160\1\145\2\172\1\uffff\1\162\1\157\1\122\3\145\1\157\1\163\1\165\1\145\1\150\1\162\1\151\1\166\2\uffff\1\157\1\172\2\uffff\1\141\1\164\2\157\1\163\1\155\2\172\1\165\1\157\1\151\2\172\1\171\1\143\1\151\1\163\1\uffff\1\163\1\141\1\155\1\154\1\163\1\142\2\uffff\1\162\1\156\1\162\2\uffff\2\172\1\144\1\145\1\151\2\164\1\160\2\145\1\154\1\143\1\151\1\145\2\uffff\1\145\1\156\1\164\1\162\1\151\1\157\1\124\1\155\1\171\1\145\1\156\2\144\1\164\1\145\1\165\1\157\1\156\1\171\1\142\2\172\1\147\4\172\1\143\1\156\1\145\1\160\1\154\2\uffff\1\172\2\uffff\1\145\1\162\2\uffff\1\164\1\172\1\156\1\145\1\171\1\uffff\1\161\1\157\1\165\1\uffff\1\164\2\172\1\165\1\166\1\162\1\124\2\uffff\2\151\1\145\1\171\1\162\1\144\1\122\1\160\3\145\1\162\1\145\2\144\1\161\1\157\3\172\1\165\1\166\1\uffff\1\162\2\uffff\2\151\1\157\1\162\1\144\1\166\2\145\1\151\3\144\2\172\1\145\1\162\2\uffff\1\144\1\157\1\172\1\166\1\uffff\1\151\1\144\1\145\1\144\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\2\uffff\1\7\1\10\7\uffff\1\24\1\25\3\uffff\1\45\1\46\1\47\1\uffff\1\51\3\uffff\1\53\2\uffff\1\57\1\60\1\uffff\1\53\1\2\1\uffff\1\4\2\uffff\1\7\1\10\14\uffff\1\24\1\25\3\uffff\1\45\1\46\1\47\1\55\1\56\1\50\1\51\1\57\1\uffff\1\52\1\54\2\uffff\1\5\4\uffff\1\13\16\uffff\1\1\1\3\2\uffff\1\22\1\12\21\uffff\1\11\6\uffff\1\15\1\16\3\uffff\1\26\1\17\16\uffff\1\27\1\31\40\uffff\1\20\1\21\1\uffff\1\43\1\44\2\uffff\1\6\1\32\5\uffff\1\23\3\uffff\1\14\7\uffff\1\33\1\42\26\uffff\1\30\1\uffff\1\35\1\36\20\uffff\1\40\1\41\4\uffff\1\34\5\uffff\1\37";
    static final String DFA14_specialS =
        "\1\0\35\uffff\1\1\1\2\u00e5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\41\1\40\1\33\2\41\1\32\22\41\1\40\1\41\1\36\4\41\1\37\1\7\1\10\1\27\1\25\1\21\1\26\1\41\1\30\12\31\3\41\1\20\3\41\1\14\1\23\1\6\1\5\1\22\1\1\2\35\1\13\4\35\1\11\1\35\1\24\1\35\1\16\1\35\1\15\6\35\3\41\1\34\1\35\1\41\1\3\14\35\1\12\10\35\1\17\3\35\1\2\1\41\1\4\uff82\41",
            "\1\42",
            "",
            "\1\45",
            "",
            "\1\47",
            "\1\50",
            "",
            "",
            "\1\54\17\uffff\1\53",
            "\1\55",
            "\1\56\11\uffff\1\57",
            "\1\60\4\uffff\1\61",
            "\1\62",
            "\1\64\11\uffff\1\63\5\uffff\1\65",
            "\1\66",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "\1\77\4\uffff\1\100",
            "",
            "\1\104",
            "\2\103\2\uffff\1\103\22\uffff\1\103",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\106",
            "\0\106",
            "",
            "",
            "\1\107",
            "",
            "",
            "\1\110",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\117",
            "\1\120\12\uffff\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\126\17\uffff\1\127\1\uffff\1\125",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\103\2\uffff\1\103\22\uffff\1\103",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\137",
            "\1\140",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\143",
            "\1\144",
            "\1\147\1\uffff\1\145\16\uffff\1\146",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "",
            "\1\163",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\4\uffff\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b4",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\17\43\1\u00b8\1\43\1\u00b7\10\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "\1\u00c3",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d9\1\uffff\1\u00d8",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\17\43\1\u00e5\12\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\43\7\uffff\17\43\1\u00f7\12\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_NUMBER | RULE_NL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='F') ) {s = 1;}

                        else if ( (LA14_0=='{') ) {s = 2;}

                        else if ( (LA14_0=='a') ) {s = 3;}

                        else if ( (LA14_0=='}') ) {s = 4;}

                        else if ( (LA14_0=='D') ) {s = 5;}

                        else if ( (LA14_0=='C') ) {s = 6;}

                        else if ( (LA14_0=='(') ) {s = 7;}

                        else if ( (LA14_0==')') ) {s = 8;}

                        else if ( (LA14_0=='N') ) {s = 9;}

                        else if ( (LA14_0=='n') ) {s = 10;}

                        else if ( (LA14_0=='I') ) {s = 11;}

                        else if ( (LA14_0=='A') ) {s = 12;}

                        else if ( (LA14_0=='T') ) {s = 13;}

                        else if ( (LA14_0=='R') ) {s = 14;}

                        else if ( (LA14_0=='w') ) {s = 15;}

                        else if ( (LA14_0=='=') ) {s = 16;}

                        else if ( (LA14_0==',') ) {s = 17;}

                        else if ( (LA14_0=='E') ) {s = 18;}

                        else if ( (LA14_0=='B') ) {s = 19;}

                        else if ( (LA14_0=='P') ) {s = 20;}

                        else if ( (LA14_0=='+') ) {s = 21;}

                        else if ( (LA14_0=='-') ) {s = 22;}

                        else if ( (LA14_0=='*') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 25;}

                        else if ( (LA14_0=='\r') ) {s = 26;}

                        else if ( (LA14_0=='\n') ) {s = 27;}

                        else if ( (LA14_0=='^') ) {s = 28;}

                        else if ( ((LA14_0>='G' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='M')||LA14_0=='O'||LA14_0=='Q'||LA14_0=='S'||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 29;}

                        else if ( (LA14_0=='\"') ) {s = 30;}

                        else if ( (LA14_0=='\'') ) {s = 31;}

                        else if ( (LA14_0=='\t'||LA14_0==' ') ) {s = 32;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||LA14_0=='.'||(LA14_0>=':' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( ((LA14_30>='\u0000' && LA14_30<='\uFFFF')) ) {s = 70;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFF')) ) {s = 70;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}