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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int RULE_INT=6;
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
            // InternalAndroidGenerator.g:19:7: ( 'main-activity' )
            // InternalAndroidGenerator.g:19:9: 'main-activity'
            {
            match("main-activity"); 


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
            // InternalAndroidGenerator.g:20:7: ( 'Model' )
            // InternalAndroidGenerator.g:20:9: 'Model'
            {
            match("Model"); 


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
            // InternalAndroidGenerator.g:21:7: ( 'Fragment' )
            // InternalAndroidGenerator.g:21:9: 'Fragment'
            {
            match("Fragment"); 


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
            // InternalAndroidGenerator.g:22:7: ( 'Activity' )
            // InternalAndroidGenerator.g:22:9: 'Activity'
            {
            match("Activity"); 


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
            // InternalAndroidGenerator.g:23:7: ( 'Maps' )
            // InternalAndroidGenerator.g:23:9: 'Maps'
            {
            match("Maps"); 


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
            // InternalAndroidGenerator.g:24:7: ( 'TextView' )
            // InternalAndroidGenerator.g:24:9: 'TextView'
            {
            match("TextView"); 


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
            // InternalAndroidGenerator.g:25:7: ( 'Button' )
            // InternalAndroidGenerator.g:25:9: 'Button'
            {
            match("Button"); 


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
            // InternalAndroidGenerator.g:26:7: ( 'FilterQuery' )
            // InternalAndroidGenerator.g:26:9: 'FilterQuery'
            {
            match("FilterQuery"); 


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
            // InternalAndroidGenerator.g:27:7: ( 'Distance' )
            // InternalAndroidGenerator.g:27:9: 'Distance'
            {
            match("Distance"); 


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
            // InternalAndroidGenerator.g:28:7: ( '>' )
            // InternalAndroidGenerator.g:28:9: '>'
            {
            match('>'); 

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
            // InternalAndroidGenerator.g:29:7: ( '<' )
            // InternalAndroidGenerator.g:29:9: '<'
            {
            match('<'); 

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
            // InternalAndroidGenerator.g:30:7: ( '=' )
            // InternalAndroidGenerator.g:30:9: '='
            {
            match('='); 

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
            // InternalAndroidGenerator.g:31:7: ( 'm' )
            // InternalAndroidGenerator.g:31:9: 'm'
            {
            match('m'); 

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
            // InternalAndroidGenerator.g:32:7: ( 'f' )
            // InternalAndroidGenerator.g:32:9: 'f'
            {
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_PACKAGE_NAME"
    public final void mRULE_PACKAGE_NAME() throws RecognitionException {
        try {
            int _type = RULE_PACKAGE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGenerator.g:4264:19: ( '\"' RULE_ID ( '.' RULE_ID )* '\"' )
            // InternalAndroidGenerator.g:4264:21: '\"' RULE_ID ( '.' RULE_ID )* '\"'
            {
            match('\"'); 
            mRULE_ID(); 
            // InternalAndroidGenerator.g:4264:33: ( '.' RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroidGenerator.g:4264:34: '.' RULE_ID
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
            // InternalAndroidGenerator.g:4266:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAndroidGenerator.g:4266:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAndroidGenerator.g:4266:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAndroidGenerator.g:4266:11: '^'
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

            // InternalAndroidGenerator.g:4266:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalAndroidGenerator.g:4268:10: ( ( '0' .. '9' )+ )
            // InternalAndroidGenerator.g:4268:12: ( '0' .. '9' )+
            {
            // InternalAndroidGenerator.g:4268:12: ( '0' .. '9' )+
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
            	    // InternalAndroidGenerator.g:4268:13: '0' .. '9'
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
            // InternalAndroidGenerator.g:4270:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAndroidGenerator.g:4270:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAndroidGenerator.g:4270:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalAndroidGenerator.g:4270:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAndroidGenerator.g:4270:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalAndroidGenerator.g:4270:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAndroidGenerator.g:4270:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalAndroidGenerator.g:4270:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAndroidGenerator.g:4270:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalAndroidGenerator.g:4270:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAndroidGenerator.g:4270:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAndroidGenerator.g:4272:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAndroidGenerator.g:4272:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAndroidGenerator.g:4272:24: ( options {greedy=false; } : . )*
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
            	    // InternalAndroidGenerator.g:4272:52: .
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
            // InternalAndroidGenerator.g:4274:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAndroidGenerator.g:4274:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAndroidGenerator.g:4274:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAndroidGenerator.g:4274:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalAndroidGenerator.g:4274:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAndroidGenerator.g:4274:41: ( '\\r' )? '\\n'
                    {
                    // InternalAndroidGenerator.g:4274:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAndroidGenerator.g:4274:41: '\\r'
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
            // InternalAndroidGenerator.g:4276:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAndroidGenerator.g:4276:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAndroidGenerator.g:4276:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalAndroidGenerator.g:4278:16: ( . )
            // InternalAndroidGenerator.g:4278:18: .
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
        // InternalAndroidGenerator.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_PACKAGE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=30;
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
                // InternalAndroidGenerator.g:1:142: RULE_PACKAGE_NAME
                {
                mRULE_PACKAGE_NAME(); 

                }
                break;
            case 24 :
                // InternalAndroidGenerator.g:1:160: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalAndroidGenerator.g:1:168: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalAndroidGenerator.g:1:177: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // InternalAndroidGenerator.g:1:189: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalAndroidGenerator.g:1:205: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalAndroidGenerator.g:1:221: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalAndroidGenerator.g:1:229: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\2\uffff\1\34\1\uffff\4\34\1\46\3\34\3\uffff\1\56\2\27\2\uffff\2\27\3\uffff\3\34\2\uffff\10\34\1\uffff\4\34\13\uffff\17\34\3\uffff\7\34\1\141\7\34\3\uffff\6\34\1\160\1\uffff\2\34\1\uffff\4\34\1\uffff\6\34\1\uffff\4\34\1\u0081\4\34\1\uffff\6\34\1\uffff\2\34\1\uffff\1\u008e\1\u008f\1\uffff\1\34\1\u0091\1\u0092\1\34\1\u0094\1\34\2\uffff\1\34\2\uffff\1\34\1\uffff\3\34\1\u009b\1\u009c\1\u009d\3\uffff";
    static final String DFA13_eofS =
        "\u009e\uffff";
    static final String DFA13_minS =
        "\1\0\1\uffff\1\143\1\uffff\2\141\1\145\1\154\1\60\1\151\1\165\1\151\3\uffff\1\60\1\0\1\101\2\uffff\1\0\1\52\3\uffff\1\160\1\144\1\164\2\uffff\1\162\1\170\1\156\1\144\1\160\1\162\1\145\1\151\1\uffff\1\141\1\154\1\164\1\163\5\uffff\2\0\4\uffff\1\154\1\162\1\151\1\147\1\164\1\151\1\145\1\163\2\155\1\156\1\147\3\164\1\uffff\2\0\1\151\1\157\1\166\1\145\1\126\1\155\1\154\1\60\1\151\1\145\1\55\1\155\1\145\1\157\1\141\1\uffff\2\0\1\143\2\151\1\164\1\151\1\165\1\60\1\uffff\1\163\1\156\1\uffff\1\145\1\162\2\156\1\0\1\141\1\144\1\164\1\55\1\145\1\155\1\uffff\1\163\1\164\1\156\1\121\1\60\1\143\1\164\1\55\1\171\1\uffff\1\167\1\55\1\151\1\163\1\164\1\165\1\uffff\1\145\1\151\1\uffff\2\60\1\uffff\1\157\2\60\1\145\1\60\1\157\2\uffff\1\156\2\uffff\1\162\1\uffff\1\156\1\163\1\171\3\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\uffff\1\160\1\uffff\1\145\1\157\1\145\1\154\1\172\1\162\1\165\1\151\3\uffff\1\172\1\uffff\1\172\2\uffff\1\uffff\1\57\3\uffff\1\160\1\144\1\164\2\uffff\1\162\1\170\1\156\1\144\1\160\1\162\1\145\1\151\1\uffff\1\141\1\154\1\164\1\163\5\uffff\2\uffff\4\uffff\1\154\1\162\1\151\1\147\1\164\1\151\1\145\1\163\2\155\1\156\1\147\3\164\1\uffff\2\uffff\1\151\1\157\1\166\1\145\1\126\1\155\1\154\1\172\1\151\1\145\1\55\1\155\1\145\1\157\1\141\1\uffff\2\uffff\1\143\2\151\1\164\1\151\1\165\1\172\1\uffff\1\163\1\156\1\uffff\1\145\1\162\2\156\1\uffff\1\141\1\144\1\164\1\55\1\145\1\155\1\uffff\1\163\1\164\1\156\1\121\1\172\1\143\1\164\1\55\1\171\1\uffff\1\167\1\55\1\151\1\163\1\164\1\165\1\uffff\1\145\1\151\1\uffff\2\172\1\uffff\1\157\2\172\1\145\1\172\1\157\2\uffff\1\156\2\uffff\1\162\1\uffff\1\156\1\163\1\171\3\172\3\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\10\uffff\1\22\1\23\1\24\3\uffff\1\30\1\31\2\uffff\1\35\1\36\1\1\3\uffff\1\30\1\4\10\uffff\1\25\4\uffff\1\22\1\23\1\24\1\26\1\32\2\uffff\1\31\1\33\1\34\1\35\17\uffff\1\27\21\uffff\1\27\11\uffff\1\15\2\uffff\1\11\13\uffff\1\12\11\uffff\1\5\6\uffff\1\17\2\uffff\1\3\2\uffff\1\6\6\uffff\1\14\1\16\1\uffff\1\10\1\13\1\uffff\1\21\6\uffff\1\2\1\7\1\20";
    static final String DFA13_specialS =
        "\1\4\17\uffff\1\6\3\uffff\1\3\33\uffff\1\10\1\2\24\uffff\1\0\1\5\20\uffff\1\11\1\1\17\uffff\1\7\64\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\20\4\27\1\24\4\27\1\1\2\27\1\25\12\23\1\3\1\27\1\15\1\16\1\14\2\27\1\2\1\12\1\22\1\13\1\22\1\11\6\22\1\5\6\22\1\4\6\22\3\27\1\21\1\22\1\27\4\22\1\7\1\17\6\22\1\10\2\22\1\6\12\22\uff85\27",
            "",
            "\1\33\12\uffff\1\32\1\uffff\1\31",
            "",
            "\1\36\3\uffff\1\37",
            "\1\42\7\uffff\1\40\5\uffff\1\41",
            "\1\43",
            "\1\44",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\1\45\31\34",
            "\1\50\10\uffff\1\47",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\101\57\32\61\3\57\1\60\1\61\1\57\32\61\uff85\57",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\57",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "\101\57\32\61\4\57\1\61\1\57\32\61\uff85\57",
            "\42\57\1\105\13\57\1\107\1\57\12\106\7\57\32\106\4\57\1\106\1\57\32\106\uff85\57",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\42\57\1\105\13\57\1\107\1\57\12\106\7\57\32\106\4\57\1\106\1\57\32\106\uff85\57",
            "\101\57\32\131\3\57\1\130\1\131\1\57\32\131\uff85\57",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\101\57\32\131\4\57\1\131\1\57\32\131\uff85\57",
            "\42\57\1\105\13\57\1\107\1\57\12\151\7\57\32\151\4\57\1\151\1\57\32\151\uff85\57",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\42\57\1\105\13\57\1\107\1\57\12\151\7\57\32\151\4\57\1\151\1\57\32\151\uff85\57",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u0090",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0093",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_PACKAGE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_70 = input.LA(1);

                        s = -1;
                        if ( (LA13_70=='\"') ) {s = 69;}

                        else if ( ((LA13_70>='\u0000' && LA13_70<='!')||(LA13_70>='#' && LA13_70<='-')||LA13_70=='/'||(LA13_70>=':' && LA13_70<='@')||(LA13_70>='[' && LA13_70<='^')||LA13_70=='`'||(LA13_70>='{' && LA13_70<='\uFFFF')) ) {s = 47;}

                        else if ( (LA13_70=='.') ) {s = 71;}

                        else if ( ((LA13_70>='0' && LA13_70<='9')||(LA13_70>='A' && LA13_70<='Z')||LA13_70=='_'||(LA13_70>='a' && LA13_70<='z')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_89 = input.LA(1);

                        s = -1;
                        if ( (LA13_89=='\"') ) {s = 69;}

                        else if ( ((LA13_89>='\u0000' && LA13_89<='!')||(LA13_89>='#' && LA13_89<='-')||LA13_89=='/'||(LA13_89>=':' && LA13_89<='@')||(LA13_89>='[' && LA13_89<='^')||LA13_89=='`'||(LA13_89>='{' && LA13_89<='\uFFFF')) ) {s = 47;}

                        else if ( ((LA13_89>='0' && LA13_89<='9')||(LA13_89>='A' && LA13_89<='Z')||LA13_89=='_'||(LA13_89>='a' && LA13_89<='z')) ) {s = 105;}

                        else if ( (LA13_89=='.') ) {s = 71;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_49 = input.LA(1);

                        s = -1;
                        if ( (LA13_49=='\"') ) {s = 69;}

                        else if ( ((LA13_49>='\u0000' && LA13_49<='!')||(LA13_49>='#' && LA13_49<='-')||LA13_49=='/'||(LA13_49>=':' && LA13_49<='@')||(LA13_49>='[' && LA13_49<='^')||LA13_49=='`'||(LA13_49>='{' && LA13_49<='\uFFFF')) ) {s = 47;}

                        else if ( ((LA13_49>='0' && LA13_49<='9')||(LA13_49>='A' && LA13_49<='Z')||LA13_49=='_'||(LA13_49>='a' && LA13_49<='z')) ) {s = 70;}

                        else if ( (LA13_49=='.') ) {s = 71;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 47;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0==',') ) {s = 1;}

                        else if ( (LA13_0=='A') ) {s = 2;}

                        else if ( (LA13_0==':') ) {s = 3;}

                        else if ( (LA13_0=='T') ) {s = 4;}

                        else if ( (LA13_0=='M') ) {s = 5;}

                        else if ( (LA13_0=='p') ) {s = 6;}

                        else if ( (LA13_0=='e') ) {s = 7;}

                        else if ( (LA13_0=='m') ) {s = 8;}

                        else if ( (LA13_0=='F') ) {s = 9;}

                        else if ( (LA13_0=='B') ) {s = 10;}

                        else if ( (LA13_0=='D') ) {s = 11;}

                        else if ( (LA13_0=='>') ) {s = 12;}

                        else if ( (LA13_0=='<') ) {s = 13;}

                        else if ( (LA13_0=='=') ) {s = 14;}

                        else if ( (LA13_0=='f') ) {s = 15;}

                        else if ( (LA13_0=='\"') ) {s = 16;}

                        else if ( (LA13_0=='^') ) {s = 17;}

                        else if ( (LA13_0=='C'||LA13_0=='E'||(LA13_0>='G' && LA13_0<='L')||(LA13_0>='N' && LA13_0<='S')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='z')) ) {s = 18;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 19;}

                        else if ( (LA13_0=='\'') ) {s = 20;}

                        else if ( (LA13_0=='/') ) {s = 21;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 22;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_71 = input.LA(1);

                        s = -1;
                        if ( (LA13_71=='^') ) {s = 88;}

                        else if ( ((LA13_71>='A' && LA13_71<='Z')||LA13_71=='_'||(LA13_71>='a' && LA13_71<='z')) ) {s = 89;}

                        else if ( ((LA13_71>='\u0000' && LA13_71<='@')||(LA13_71>='[' && LA13_71<=']')||LA13_71=='`'||(LA13_71>='{' && LA13_71<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='\u0000' && LA13_16<='@')||(LA13_16>='[' && LA13_16<=']')||LA13_16=='`'||(LA13_16>='{' && LA13_16<='\uFFFF')) ) {s = 47;}

                        else if ( (LA13_16=='^') ) {s = 48;}

                        else if ( ((LA13_16>='A' && LA13_16<='Z')||LA13_16=='_'||(LA13_16>='a' && LA13_16<='z')) ) {s = 49;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_105 = input.LA(1);

                        s = -1;
                        if ( (LA13_105=='\"') ) {s = 69;}

                        else if ( ((LA13_105>='\u0000' && LA13_105<='!')||(LA13_105>='#' && LA13_105<='-')||LA13_105=='/'||(LA13_105>=':' && LA13_105<='@')||(LA13_105>='[' && LA13_105<='^')||LA13_105=='`'||(LA13_105>='{' && LA13_105<='\uFFFF')) ) {s = 47;}

                        else if ( (LA13_105=='.') ) {s = 71;}

                        else if ( ((LA13_105>='0' && LA13_105<='9')||(LA13_105>='A' && LA13_105<='Z')||LA13_105=='_'||(LA13_105>='a' && LA13_105<='z')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_48 = input.LA(1);

                        s = -1;
                        if ( ((LA13_48>='\u0000' && LA13_48<='@')||(LA13_48>='[' && LA13_48<='^')||LA13_48=='`'||(LA13_48>='{' && LA13_48<='\uFFFF')) ) {s = 47;}

                        else if ( ((LA13_48>='A' && LA13_48<='Z')||LA13_48=='_'||(LA13_48>='a' && LA13_48<='z')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_88 = input.LA(1);

                        s = -1;
                        if ( ((LA13_88>='\u0000' && LA13_88<='@')||(LA13_88>='[' && LA13_88<='^')||LA13_88=='`'||(LA13_88>='{' && LA13_88<='\uFFFF')) ) {s = 47;}

                        else if ( ((LA13_88>='A' && LA13_88<='Z')||LA13_88=='_'||(LA13_88>='a' && LA13_88<='z')) ) {s = 89;}

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