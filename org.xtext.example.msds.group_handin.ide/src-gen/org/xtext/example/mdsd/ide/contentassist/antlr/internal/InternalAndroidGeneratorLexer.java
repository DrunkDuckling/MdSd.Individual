package org.xtext.example.mdsd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidGeneratorLexer extends Lexer {
    public static final int RULE_PACKAGE_NAME=5;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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

    // delegates
    // delegators

    public InternalAndroidGeneratorLexer() {;} 
    public InternalAndroidGeneratorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAndroidGeneratorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAndroidGenerator.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGenerator.g:11:7: ( ',' )
            // InternalAndroidGenerator.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGenerator.g:12:7: ( 'Application' )
            // InternalAndroidGenerator.g:12:9: 'Application'
            {
            match("Application"); 


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
            // InternalAndroidGenerator.g:13:7: ( 'Android-SDK' )
            // InternalAndroidGenerator.g:13:9: 'Android-SDK'
            {
            match("Android-SDK"); 


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
            // InternalAndroidGenerator.g:14:7: ( ':' )
            // InternalAndroidGenerator.g:14:9: ':'
            {
            match(':'); 

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
            // InternalAndroidGenerator.g:15:7: ( 'Target-SDK' )
            // InternalAndroidGenerator.g:15:9: 'Target-SDK'
            {
            match("Target-SDK"); 


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
            // InternalAndroidGenerator.g:16:7: ( 'Minimum-SDK' )
            // InternalAndroidGenerator.g:16:9: 'Minimum-SDK'
            {
            match("Minimum-SDK"); 


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
            // InternalAndroidGenerator.g:17:7: ( 'permissions' )
            // InternalAndroidGenerator.g:17:9: 'permissions'
            {
            match("permissions"); 


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
            // InternalAndroidGenerator.g:18:7: ( 'elements' )
            // InternalAndroidGenerator.g:18:9: 'elements'
            {
            match("elements"); 


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
            // InternalAndroidGenerator.g:19:7: ( 'Model' )
            // InternalAndroidGenerator.g:19:9: 'Model'
            {
            match("Model"); 


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
            // InternalAndroidGenerator.g:20:7: ( 'Fragment' )
            // InternalAndroidGenerator.g:20:9: 'Fragment'
            {
            match("Fragment"); 


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
            // InternalAndroidGenerator.g:21:7: ( 'Map' )
            // InternalAndroidGenerator.g:21:9: 'Map'
            {
            match("Map"); 


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
            // InternalAndroidGenerator.g:22:7: ( 'Settings' )
            // InternalAndroidGenerator.g:22:9: 'Settings'
            {
            match("Settings"); 


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
            // InternalAndroidGenerator.g:23:7: ( 'EditText' )
            // InternalAndroidGenerator.g:23:9: 'EditText'
            {
            match("EditText"); 


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
            // InternalAndroidGenerator.g:24:7: ( 'Spinner' )
            // InternalAndroidGenerator.g:24:9: 'Spinner'
            {
            match("Spinner"); 


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
            // InternalAndroidGenerator.g:25:7: ( 'Textfield' )
            // InternalAndroidGenerator.g:25:9: 'Textfield'
            {
            match("Textfield"); 


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
            // InternalAndroidGenerator.g:26:7: ( 'Button' )
            // InternalAndroidGenerator.g:26:9: 'Button'
            {
            match("Button"); 


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
            // InternalAndroidGenerator.g:27:7: ( 'Toast' )
            // InternalAndroidGenerator.g:27:9: 'Toast'
            {
            match("Toast"); 


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
            // InternalAndroidGenerator.g:28:7: ( 'Bundle' )
            // InternalAndroidGenerator.g:28:9: 'Bundle'
            {
            match("Bundle"); 


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
            // InternalAndroidGenerator.g:29:7: ( 'Holder' )
            // InternalAndroidGenerator.g:29:9: 'Holder'
            {
            match("Holder"); 


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
            // InternalAndroidGenerator.g:30:7: ( 'FilterQuery' )
            // InternalAndroidGenerator.g:30:9: 'FilterQuery'
            {
            match("FilterQuery"); 


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
            // InternalAndroidGenerator.g:31:7: ( 'Distance' )
            // InternalAndroidGenerator.g:31:9: 'Distance'
            {
            match("Distance"); 


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
            // InternalAndroidGenerator.g:32:7: ( '>' )
            // InternalAndroidGenerator.g:32:9: '>'
            {
            match('>'); 

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
            // InternalAndroidGenerator.g:33:7: ( '<' )
            // InternalAndroidGenerator.g:33:9: '<'
            {
            match('<'); 

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
            // InternalAndroidGenerator.g:34:7: ( '=' )
            // InternalAndroidGenerator.g:34:9: '='
            {
            match('='); 

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
            // InternalAndroidGenerator.g:35:7: ( 'm' )
            // InternalAndroidGenerator.g:35:9: 'm'
            {
            match('m'); 

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
            // InternalAndroidGenerator.g:36:7: ( 'f' )
            // InternalAndroidGenerator.g:36:9: 'f'
            {
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_PACKAGE_NAME"
    public final void mRULE_PACKAGE_NAME() throws RecognitionException {
        try {
            int _type = RULE_PACKAGE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGenerator.g:4028:19: ( '\"' RULE_ID ( '.' RULE_ID )* '\"' )
            // InternalAndroidGenerator.g:4028:21: '\"' RULE_ID ( '.' RULE_ID )* '\"'
            {
            match('\"'); 
            mRULE_ID(); 
            // InternalAndroidGenerator.g:4028:33: ( '.' RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroidGenerator.g:4028:34: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PACKAGE_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGenerator.g:4030:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAndroidGenerator.g:4030:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAndroidGenerator.g:4030:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAndroidGenerator.g:4030:11: '^'
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

            // InternalAndroidGenerator.g:4030:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAndroidGenerator.g:
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
            	    break loop3;
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
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGenerator.g:4032:10: ( ( '0' .. '9' )+ )
            // InternalAndroidGenerator.g:4032:12: ( '0' .. '9' )+
            {
            // InternalAndroidGenerator.g:4032:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAndroidGenerator.g:4032:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalAndroidGenerator.g:4034:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAndroidGenerator.g:4034:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAndroidGenerator.g:4034:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAndroidGenerator.g:4034:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAndroidGenerator.g:4034:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAndroidGenerator.g:4034:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAndroidGenerator.g:4034:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:4034:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAndroidGenerator.g:4034:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAndroidGenerator.g:4034:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAndroidGenerator.g:4034:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalAndroidGenerator.g:4036:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAndroidGenerator.g:4036:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAndroidGenerator.g:4036:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAndroidGenerator.g:4036:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalAndroidGenerator.g:4038:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAndroidGenerator.g:4038:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAndroidGenerator.g:4038:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAndroidGenerator.g:4038:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalAndroidGenerator.g:4038:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAndroidGenerator.g:4038:41: ( '\\r' )? '\\n'
                    {
                    // InternalAndroidGenerator.g:4038:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAndroidGenerator.g:4038:41: '\\r'
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
            // InternalAndroidGenerator.g:4040:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAndroidGenerator.g:4040:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAndroidGenerator.g:4040:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAndroidGenerator.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalAndroidGenerator.g:4042:16: ( . )
            // InternalAndroidGenerator.g:4042:18: .
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
        // InternalAndroidGenerator.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_PACKAGE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=34;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalAndroidGenerator.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalAndroidGenerator.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalAndroidGenerator.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalAndroidGenerator.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalAndroidGenerator.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalAndroidGenerator.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalAndroidGenerator.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalAndroidGenerator.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalAndroidGenerator.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalAndroidGenerator.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalAndroidGenerator.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalAndroidGenerator.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalAndroidGenerator.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalAndroidGenerator.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalAndroidGenerator.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalAndroidGenerator.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalAndroidGenerator.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalAndroidGenerator.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalAndroidGenerator.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalAndroidGenerator.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalAndroidGenerator.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalAndroidGenerator.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalAndroidGenerator.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalAndroidGenerator.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalAndroidGenerator.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalAndroidGenerator.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalAndroidGenerator.g:1:166: RULE_PACKAGE_NAME
                {
                mRULE_PACKAGE_NAME(); 

                }
                break;
            case 28 :
                // InternalAndroidGenerator.g:1:184: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalAndroidGenerator.g:1:192: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalAndroidGenerator.g:1:201: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalAndroidGenerator.g:1:213: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalAndroidGenerator.g:1:229: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalAndroidGenerator.g:1:245: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalAndroidGenerator.g:1:253: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\2\uffff\1\36\1\uffff\12\36\3\uffff\1\63\1\64\2\32\2\uffff\2\32\3\uffff\2\36\2\uffff\20\36\14\uffff\7\36\1\131\13\36\3\uffff\7\36\1\uffff\13\36\3\uffff\4\36\1\177\1\36\1\u0081\13\36\1\uffff\4\36\1\uffff\1\36\1\uffff\7\36\1\u0099\1\u009a\1\u009b\3\36\1\uffff\7\36\1\u00a6\1\36\3\uffff\2\36\1\uffff\1\36\1\uffff\1\36\1\u00ac\1\u00ad\1\36\1\u00af\1\uffff\1\u00b0\1\u00b1\1\36\1\u00b3\1\36\2\uffff\1\36\3\uffff\1\36\1\uffff\2\36\1\u00b9\1\u00ba\1\u00bb\3\uffff";
    static final String DFA13_eofS =
        "\u00bc\uffff";
    static final String DFA13_minS =
        "\1\0\1\uffff\1\156\1\uffff\2\141\1\145\1\154\1\151\1\145\1\144\1\165\1\157\1\151\3\uffff\2\60\1\0\1\101\2\uffff\1\0\1\52\3\uffff\1\160\1\144\2\uffff\1\162\1\170\1\141\1\156\1\144\1\160\1\162\1\145\1\141\1\154\1\164\2\151\1\156\1\154\1\163\6\uffff\2\0\4\uffff\1\154\1\162\1\147\1\164\1\163\1\151\1\145\1\60\2\155\1\147\2\164\1\156\2\164\2\144\1\164\1\uffff\2\0\1\151\1\157\1\145\1\146\1\164\1\155\1\154\1\uffff\1\151\1\145\1\155\1\145\1\151\1\156\1\124\1\157\1\154\1\145\1\141\1\uffff\2\0\1\143\1\151\1\164\1\151\1\60\1\165\1\60\1\163\1\156\1\145\1\162\1\156\2\145\1\156\1\145\1\162\1\156\1\0\1\141\1\144\1\55\1\145\1\uffff\1\155\1\uffff\1\163\1\164\1\156\1\121\1\147\1\162\1\170\3\60\1\143\1\164\1\55\1\uffff\1\154\1\55\1\151\1\163\1\164\1\165\1\163\1\60\1\164\3\uffff\1\145\1\151\1\uffff\1\144\1\uffff\1\157\2\60\1\145\1\60\1\uffff\2\60\1\157\1\60\1\156\2\uffff\1\162\3\uffff\1\156\1\uffff\1\163\1\171\3\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\uffff\1\160\1\uffff\2\157\1\145\1\154\1\162\1\160\1\144\1\165\1\157\1\151\3\uffff\2\172\1\uffff\1\172\2\uffff\1\uffff\1\57\3\uffff\1\160\1\144\2\uffff\1\162\1\170\1\141\1\156\1\144\1\160\1\162\1\145\1\141\1\154\1\164\2\151\1\164\1\154\1\163\6\uffff\2\uffff\4\uffff\1\154\1\162\1\147\1\164\1\163\1\151\1\145\1\172\2\155\1\147\2\164\1\156\2\164\2\144\1\164\1\uffff\2\uffff\1\151\1\157\1\145\1\146\1\164\1\155\1\154\1\uffff\1\151\1\145\1\155\1\145\1\151\1\156\1\124\1\157\1\154\1\145\1\141\1\uffff\2\uffff\1\143\1\151\1\164\1\151\1\172\1\165\1\172\1\163\1\156\1\145\1\162\1\156\2\145\1\156\1\145\1\162\1\156\1\uffff\1\141\1\144\1\55\1\145\1\uffff\1\155\1\uffff\1\163\1\164\1\156\1\121\1\147\1\162\1\170\3\172\1\143\1\164\1\55\1\uffff\1\154\1\55\1\151\1\163\1\164\1\165\1\163\1\172\1\164\3\uffff\1\145\1\151\1\uffff\1\144\1\uffff\1\157\2\172\1\145\1\172\1\uffff\2\172\1\157\1\172\1\156\2\uffff\1\162\3\uffff\1\156\1\uffff\1\163\1\171\3\172\3\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\12\uffff\1\26\1\27\1\30\4\uffff\1\34\1\35\2\uffff\1\41\1\42\1\1\2\uffff\1\34\1\4\20\uffff\1\26\1\27\1\30\1\31\1\32\1\36\2\uffff\1\35\1\37\1\40\1\41\23\uffff\1\33\11\uffff\1\13\13\uffff\1\33\31\uffff\1\21\1\uffff\1\11\15\uffff\1\5\11\uffff\1\20\1\22\1\23\2\uffff\1\3\1\uffff\1\6\5\uffff\1\16\5\uffff\1\10\1\12\1\uffff\1\14\1\15\1\25\1\uffff\1\17\5\uffff\1\2\1\7\1\24";
    static final String DFA13_specialS =
        "\1\2\22\uffff\1\6\3\uffff\1\1\36\uffff\1\4\1\3\30\uffff\1\7\1\10\24\uffff\1\5\1\11\22\uffff\1\0\101\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\23\4\32\1\27\4\32\1\1\2\32\1\30\12\26\1\3\1\32\1\17\1\20\1\16\2\32\1\2\1\13\1\25\1\15\1\12\1\10\1\25\1\14\4\25\1\5\5\25\1\11\1\4\6\25\3\32\1\24\1\25\1\32\4\25\1\7\1\22\6\25\1\21\2\25\1\6\12\25\uff85\32",
            "",
            "\1\35\1\uffff\1\34",
            "",
            "\1\40\3\uffff\1\41\11\uffff\1\42",
            "\1\45\7\uffff\1\43\5\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\51\10\uffff\1\50",
            "\1\52\12\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\101\65\32\67\3\65\1\66\1\67\1\65\32\67\uff85\65",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\65",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\114\5\uffff\1\113",
            "\1\115",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "\101\65\32\67\4\65\1\67\1\65\32\67\uff85\65",
            "\42\65\1\117\13\65\1\121\1\65\12\120\7\65\32\120\4\65\1\120\1\65\32\120\uff85\65",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\42\65\1\117\13\65\1\121\1\65\12\120\7\65\32\120\4\65\1\120\1\65\32\120\uff85\65",
            "\101\65\32\147\3\65\1\146\1\147\1\65\32\147\uff85\65",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\101\65\32\147\4\65\1\147\1\65\32\147\uff85\65",
            "\42\65\1\117\13\65\1\121\1\65\12\172\7\65\32\172\4\65\1\172\1\65\32\172\uff85\65",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0080",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\42\65\1\117\13\65\1\121\1\65\12\172\7\65\32\172\4\65\1\172\1\65\32\172\uff85\65",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00a7",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ae",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b2",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00b4",
            "",
            "",
            "\1\u00b5",
            "",
            "",
            "",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_PACKAGE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_122 = input.LA(1);

                        s = -1;
                        if ( (LA13_122=='\"') ) {s = 79;}

                        else if ( (LA13_122=='.') ) {s = 81;}

                        else if ( ((LA13_122>='0' && LA13_122<='9')||(LA13_122>='A' && LA13_122<='Z')||LA13_122=='_'||(LA13_122>='a' && LA13_122<='z')) ) {s = 122;}

                        else if ( ((LA13_122>='\u0000' && LA13_122<='!')||(LA13_122>='#' && LA13_122<='-')||LA13_122=='/'||(LA13_122>=':' && LA13_122<='@')||(LA13_122>='[' && LA13_122<='^')||LA13_122=='`'||(LA13_122>='{' && LA13_122<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFF')) ) {s = 53;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0==',') ) {s = 1;}

                        else if ( (LA13_0=='A') ) {s = 2;}

                        else if ( (LA13_0==':') ) {s = 3;}

                        else if ( (LA13_0=='T') ) {s = 4;}

                        else if ( (LA13_0=='M') ) {s = 5;}

                        else if ( (LA13_0=='p') ) {s = 6;}

                        else if ( (LA13_0=='e') ) {s = 7;}

                        else if ( (LA13_0=='F') ) {s = 8;}

                        else if ( (LA13_0=='S') ) {s = 9;}

                        else if ( (LA13_0=='E') ) {s = 10;}

                        else if ( (LA13_0=='B') ) {s = 11;}

                        else if ( (LA13_0=='H') ) {s = 12;}

                        else if ( (LA13_0=='D') ) {s = 13;}

                        else if ( (LA13_0=='>') ) {s = 14;}

                        else if ( (LA13_0=='<') ) {s = 15;}

                        else if ( (LA13_0=='=') ) {s = 16;}

                        else if ( (LA13_0=='m') ) {s = 17;}

                        else if ( (LA13_0=='f') ) {s = 18;}

                        else if ( (LA13_0=='\"') ) {s = 19;}

                        else if ( (LA13_0=='^') ) {s = 20;}

                        else if ( (LA13_0=='C'||LA13_0=='G'||(LA13_0>='I' && LA13_0<='L')||(LA13_0>='N' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='z')) ) {s = 21;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 22;}

                        else if ( (LA13_0=='\'') ) {s = 23;}

                        else if ( (LA13_0=='/') ) {s = 24;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 25;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_55 = input.LA(1);

                        s = -1;
                        if ( (LA13_55=='\"') ) {s = 79;}

                        else if ( ((LA13_55>='\u0000' && LA13_55<='!')||(LA13_55>='#' && LA13_55<='-')||LA13_55=='/'||(LA13_55>=':' && LA13_55<='@')||(LA13_55>='[' && LA13_55<='^')||LA13_55=='`'||(LA13_55>='{' && LA13_55<='\uFFFF')) ) {s = 53;}

                        else if ( ((LA13_55>='0' && LA13_55<='9')||(LA13_55>='A' && LA13_55<='Z')||LA13_55=='_'||(LA13_55>='a' && LA13_55<='z')) ) {s = 80;}

                        else if ( (LA13_55=='.') ) {s = 81;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_54 = input.LA(1);

                        s = -1;
                        if ( ((LA13_54>='\u0000' && LA13_54<='@')||(LA13_54>='[' && LA13_54<='^')||LA13_54=='`'||(LA13_54>='{' && LA13_54<='\uFFFF')) ) {s = 53;}

                        else if ( ((LA13_54>='A' && LA13_54<='Z')||LA13_54=='_'||(LA13_54>='a' && LA13_54<='z')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_102 = input.LA(1);

                        s = -1;
                        if ( ((LA13_102>='\u0000' && LA13_102<='@')||(LA13_102>='[' && LA13_102<='^')||LA13_102=='`'||(LA13_102>='{' && LA13_102<='\uFFFF')) ) {s = 53;}

                        else if ( ((LA13_102>='A' && LA13_102<='Z')||LA13_102=='_'||(LA13_102>='a' && LA13_102<='z')) ) {s = 103;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='@')||(LA13_19>='[' && LA13_19<=']')||LA13_19=='`'||(LA13_19>='{' && LA13_19<='\uFFFF')) ) {s = 53;}

                        else if ( (LA13_19=='^') ) {s = 54;}

                        else if ( ((LA13_19>='A' && LA13_19<='Z')||LA13_19=='_'||(LA13_19>='a' && LA13_19<='z')) ) {s = 55;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_80 = input.LA(1);

                        s = -1;
                        if ( (LA13_80=='\"') ) {s = 79;}

                        else if ( ((LA13_80>='\u0000' && LA13_80<='!')||(LA13_80>='#' && LA13_80<='-')||LA13_80=='/'||(LA13_80>=':' && LA13_80<='@')||(LA13_80>='[' && LA13_80<='^')||LA13_80=='`'||(LA13_80>='{' && LA13_80<='\uFFFF')) ) {s = 53;}

                        else if ( (LA13_80=='.') ) {s = 81;}

                        else if ( ((LA13_80>='0' && LA13_80<='9')||(LA13_80>='A' && LA13_80<='Z')||LA13_80=='_'||(LA13_80>='a' && LA13_80<='z')) ) {s = 80;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_81 = input.LA(1);

                        s = -1;
                        if ( (LA13_81=='^') ) {s = 102;}

                        else if ( ((LA13_81>='A' && LA13_81<='Z')||LA13_81=='_'||(LA13_81>='a' && LA13_81<='z')) ) {s = 103;}

                        else if ( ((LA13_81>='\u0000' && LA13_81<='@')||(LA13_81>='[' && LA13_81<=']')||LA13_81=='`'||(LA13_81>='{' && LA13_81<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_103 = input.LA(1);

                        s = -1;
                        if ( ((LA13_103>='0' && LA13_103<='9')||(LA13_103>='A' && LA13_103<='Z')||LA13_103=='_'||(LA13_103>='a' && LA13_103<='z')) ) {s = 122;}

                        else if ( (LA13_103=='\"') ) {s = 79;}

                        else if ( (LA13_103=='.') ) {s = 81;}

                        else if ( ((LA13_103>='\u0000' && LA13_103<='!')||(LA13_103>='#' && LA13_103<='-')||LA13_103=='/'||(LA13_103>=':' && LA13_103<='@')||(LA13_103>='[' && LA13_103<='^')||LA13_103=='`'||(LA13_103>='{' && LA13_103<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}