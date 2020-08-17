package org.xtext.example.mdsd.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidGeneratorLexer extends Lexer {
    public static final int App=22;
    public static final int AndroidSDK=4;
    public static final int RULE_END=32;
    public static final int RULE_BEGIN=31;
    public static final int Spinner=15;
    public static final int F=29;
    public static final int RULE_PACKAGE_NAME=34;
    public static final int MinSDK=14;
    public static final int FilterQuery=5;
    public static final int RULE_STRING=36;
    public static final int Elements=9;
    public static final int Fragment=10;
    public static final int M=30;
    public static final int LessThanSign=26;
    public static final int RULE_SL_COMMENT=38;
    public static final int Comma=24;
    public static final int EqualsSign=27;
    public static final int Toast=20;
    public static final int Button=17;
    public static final int Permissions=6;
    public static final int Colon=25;
    public static final int TargetSDK=7;
    public static final int EOF=-1;
    public static final int Settings=11;
    public static final int EditText=8;
    public static final int GreaterThanSign=28;
    public static final int RULE_ID=33;
    public static final int Textview=12;
    public static final int RULE_WS=39;
    public static final int Bundle=16;
    public static final int Dist=21;
    public static final int Holder=18;
    public static final int RULE_ANY_OTHER=40;
    public static final int Content=13;
    public static final int RULE_INT=35;
    public static final int Model=19;
    public static final int RULE_ML_COMMENT=37;
    public static final int Map=23;

    // delegates
    // delegators

    public InternalAndroidGeneratorLexer() {;} 
    public InternalAndroidGeneratorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAndroidGeneratorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAndroidGeneratorLexer.g"; }

    // $ANTLR start "AndroidSDK"
    public final void mAndroidSDK() throws RecognitionException {
        try {
            int _type = AndroidSDK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:14:12: ( 'Android-SDK' )
            // InternalAndroidGeneratorLexer.g:14:14: 'Android-SDK'
            {
            match("Android-SDK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AndroidSDK"

    // $ANTLR start "FilterQuery"
    public final void mFilterQuery() throws RecognitionException {
        try {
            int _type = FilterQuery;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:16:13: ( 'FilterQuery' )
            // InternalAndroidGeneratorLexer.g:16:15: 'FilterQuery'
            {
            match("FilterQuery"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FilterQuery"

    // $ANTLR start "Permissions"
    public final void mPermissions() throws RecognitionException {
        try {
            int _type = Permissions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:18:13: ( 'Permissions' )
            // InternalAndroidGeneratorLexer.g:18:15: 'Permissions'
            {
            match("Permissions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Permissions"

    // $ANTLR start "TargetSDK"
    public final void mTargetSDK() throws RecognitionException {
        try {
            int _type = TargetSDK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:20:11: ( 'Target-SDK' )
            // InternalAndroidGeneratorLexer.g:20:13: 'Target-SDK'
            {
            match("Target-SDK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TargetSDK"

    // $ANTLR start "EditText"
    public final void mEditText() throws RecognitionException {
        try {
            int _type = EditText;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:22:10: ( 'EditText' )
            // InternalAndroidGeneratorLexer.g:22:12: 'EditText'
            {
            match("EditText"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EditText"

    // $ANTLR start "Elements"
    public final void mElements() throws RecognitionException {
        try {
            int _type = Elements;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:24:10: ( 'Elements' )
            // InternalAndroidGeneratorLexer.g:24:12: 'Elements'
            {
            match("Elements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Elements"

    // $ANTLR start "Fragment"
    public final void mFragment() throws RecognitionException {
        try {
            int _type = Fragment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:26:10: ( 'Fragment' )
            // InternalAndroidGeneratorLexer.g:26:12: 'Fragment'
            {
            match("Fragment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fragment"

    // $ANTLR start "Settings"
    public final void mSettings() throws RecognitionException {
        try {
            int _type = Settings;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:28:10: ( 'Settings' )
            // InternalAndroidGeneratorLexer.g:28:12: 'Settings'
            {
            match("Settings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Settings"

    // $ANTLR start "Textview"
    public final void mTextview() throws RecognitionException {
        try {
            int _type = Textview;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:30:10: ( 'Textview' )
            // InternalAndroidGeneratorLexer.g:30:12: 'Textview'
            {
            match("Textview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Textview"

    // $ANTLR start "Content"
    public final void mContent() throws RecognitionException {
        try {
            int _type = Content;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:32:9: ( 'Content' )
            // InternalAndroidGeneratorLexer.g:32:11: 'Content'
            {
            match("Content"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Content"

    // $ANTLR start "MinSDK"
    public final void mMinSDK() throws RecognitionException {
        try {
            int _type = MinSDK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:34:8: ( 'Min-SDK' )
            // InternalAndroidGeneratorLexer.g:34:10: 'Min-SDK'
            {
            match("Min-SDK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MinSDK"

    // $ANTLR start "Spinner"
    public final void mSpinner() throws RecognitionException {
        try {
            int _type = Spinner;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:36:9: ( 'Spinner' )
            // InternalAndroidGeneratorLexer.g:36:11: 'Spinner'
            {
            match("Spinner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Spinner"

    // $ANTLR start "Bundle"
    public final void mBundle() throws RecognitionException {
        try {
            int _type = Bundle;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:38:8: ( 'Bundle' )
            // InternalAndroidGeneratorLexer.g:38:10: 'Bundle'
            {
            match("Bundle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bundle"

    // $ANTLR start "Button"
    public final void mButton() throws RecognitionException {
        try {
            int _type = Button;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:40:8: ( 'Button' )
            // InternalAndroidGeneratorLexer.g:40:10: 'Button'
            {
            match("Button"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Button"

    // $ANTLR start "Holder"
    public final void mHolder() throws RecognitionException {
        try {
            int _type = Holder;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:42:8: ( 'Holder' )
            // InternalAndroidGeneratorLexer.g:42:10: 'Holder'
            {
            match("Holder"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Holder"

    // $ANTLR start "Model"
    public final void mModel() throws RecognitionException {
        try {
            int _type = Model;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:44:7: ( 'Model' )
            // InternalAndroidGeneratorLexer.g:44:9: 'Model'
            {
            match("Model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Model"

    // $ANTLR start "Toast"
    public final void mToast() throws RecognitionException {
        try {
            int _type = Toast;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:46:7: ( 'Toast' )
            // InternalAndroidGeneratorLexer.g:46:9: 'Toast'
            {
            match("Toast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Toast"

    // $ANTLR start "Dist"
    public final void mDist() throws RecognitionException {
        try {
            int _type = Dist;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:48:6: ( 'Dist' )
            // InternalAndroidGeneratorLexer.g:48:8: 'Dist'
            {
            match("Dist"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dist"

    // $ANTLR start "App"
    public final void mApp() throws RecognitionException {
        try {
            int _type = App;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:50:5: ( 'App' )
            // InternalAndroidGeneratorLexer.g:50:7: 'App'
            {
            match("App"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "App"

    // $ANTLR start "Map"
    public final void mMap() throws RecognitionException {
        try {
            int _type = Map;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:52:5: ( 'Map' )
            // InternalAndroidGeneratorLexer.g:52:7: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Map"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:54:7: ( ',' )
            // InternalAndroidGeneratorLexer.g:54:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:56:7: ( ':' )
            // InternalAndroidGeneratorLexer.g:56:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:58:14: ( '<' )
            // InternalAndroidGeneratorLexer.g:58:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:60:12: ( '=' )
            // InternalAndroidGeneratorLexer.g:60:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:62:17: ( '>' )
            // InternalAndroidGeneratorLexer.g:62:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            int _type = F;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:64:3: ( 'f' )
            // InternalAndroidGeneratorLexer.g:64:5: 'f'
            {
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            int _type = M;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:66:3: ( 'm' )
            // InternalAndroidGeneratorLexer.g:66:5: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalAndroidGeneratorLexer.g:68:21: ()
            // InternalAndroidGeneratorLexer.g:68:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalAndroidGeneratorLexer.g:70:19: ()
            // InternalAndroidGeneratorLexer.g:70:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_PACKAGE_NAME"
    public final void mRULE_PACKAGE_NAME() throws RecognitionException {
        try {
            int _type = RULE_PACKAGE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:72:19: ( '\"' RULE_ID ( '.' RULE_ID )* '\"' )
            // InternalAndroidGeneratorLexer.g:72:21: '\"' RULE_ID ( '.' RULE_ID )* '\"'
            {
            match('\"'); 
            mRULE_ID(); 
            // InternalAndroidGeneratorLexer.g:72:33: ( '.' RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroidGeneratorLexer.g:72:34: '.' RULE_ID
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
            // InternalAndroidGeneratorLexer.g:74:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAndroidGeneratorLexer.g:74:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAndroidGeneratorLexer.g:74:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAndroidGeneratorLexer.g:74:11: '^'
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

            // InternalAndroidGeneratorLexer.g:74:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAndroidGeneratorLexer.g:
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
            // InternalAndroidGeneratorLexer.g:76:10: ( ( '0' .. '9' )+ )
            // InternalAndroidGeneratorLexer.g:76:12: ( '0' .. '9' )+
            {
            // InternalAndroidGeneratorLexer.g:76:12: ( '0' .. '9' )+
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
            	    // InternalAndroidGeneratorLexer.g:76:13: '0' .. '9'
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
            // InternalAndroidGeneratorLexer.g:78:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAndroidGeneratorLexer.g:78:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAndroidGeneratorLexer.g:78:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalAndroidGeneratorLexer.g:78:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAndroidGeneratorLexer.g:78:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalAndroidGeneratorLexer.g:78:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAndroidGeneratorLexer.g:78:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalAndroidGeneratorLexer.g:78:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAndroidGeneratorLexer.g:78:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalAndroidGeneratorLexer.g:78:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAndroidGeneratorLexer.g:78:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAndroidGeneratorLexer.g:80:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAndroidGeneratorLexer.g:80:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAndroidGeneratorLexer.g:80:24: ( options {greedy=false; } : . )*
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
            	    // InternalAndroidGeneratorLexer.g:80:52: .
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
            // InternalAndroidGeneratorLexer.g:82:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAndroidGeneratorLexer.g:82:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAndroidGeneratorLexer.g:82:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAndroidGeneratorLexer.g:82:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalAndroidGeneratorLexer.g:82:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAndroidGeneratorLexer.g:82:41: ( '\\r' )? '\\n'
                    {
                    // InternalAndroidGeneratorLexer.g:82:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAndroidGeneratorLexer.g:82:41: '\\r'
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
            // InternalAndroidGeneratorLexer.g:84:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAndroidGeneratorLexer.g:84:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAndroidGeneratorLexer.g:84:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalAndroidGeneratorLexer.g:
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
            // InternalAndroidGeneratorLexer.g:86:16: ( . )
            // InternalAndroidGeneratorLexer.g:86:18: .
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
        // InternalAndroidGeneratorLexer.g:1:8: ( AndroidSDK | FilterQuery | Permissions | TargetSDK | EditText | Elements | Fragment | Settings | Textview | Content | MinSDK | Spinner | Bundle | Button | Holder | Model | Toast | Dist | App | Map | Comma | Colon | LessThanSign | EqualsSign | GreaterThanSign | F | M | RULE_PACKAGE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=35;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalAndroidGeneratorLexer.g:1:10: AndroidSDK
                {
                mAndroidSDK(); 

                }
                break;
            case 2 :
                // InternalAndroidGeneratorLexer.g:1:21: FilterQuery
                {
                mFilterQuery(); 

                }
                break;
            case 3 :
                // InternalAndroidGeneratorLexer.g:1:33: Permissions
                {
                mPermissions(); 

                }
                break;
            case 4 :
                // InternalAndroidGeneratorLexer.g:1:45: TargetSDK
                {
                mTargetSDK(); 

                }
                break;
            case 5 :
                // InternalAndroidGeneratorLexer.g:1:55: EditText
                {
                mEditText(); 

                }
                break;
            case 6 :
                // InternalAndroidGeneratorLexer.g:1:64: Elements
                {
                mElements(); 

                }
                break;
            case 7 :
                // InternalAndroidGeneratorLexer.g:1:73: Fragment
                {
                mFragment(); 

                }
                break;
            case 8 :
                // InternalAndroidGeneratorLexer.g:1:82: Settings
                {
                mSettings(); 

                }
                break;
            case 9 :
                // InternalAndroidGeneratorLexer.g:1:91: Textview
                {
                mTextview(); 

                }
                break;
            case 10 :
                // InternalAndroidGeneratorLexer.g:1:100: Content
                {
                mContent(); 

                }
                break;
            case 11 :
                // InternalAndroidGeneratorLexer.g:1:108: MinSDK
                {
                mMinSDK(); 

                }
                break;
            case 12 :
                // InternalAndroidGeneratorLexer.g:1:115: Spinner
                {
                mSpinner(); 

                }
                break;
            case 13 :
                // InternalAndroidGeneratorLexer.g:1:123: Bundle
                {
                mBundle(); 

                }
                break;
            case 14 :
                // InternalAndroidGeneratorLexer.g:1:130: Button
                {
                mButton(); 

                }
                break;
            case 15 :
                // InternalAndroidGeneratorLexer.g:1:137: Holder
                {
                mHolder(); 

                }
                break;
            case 16 :
                // InternalAndroidGeneratorLexer.g:1:144: Model
                {
                mModel(); 

                }
                break;
            case 17 :
                // InternalAndroidGeneratorLexer.g:1:150: Toast
                {
                mToast(); 

                }
                break;
            case 18 :
                // InternalAndroidGeneratorLexer.g:1:156: Dist
                {
                mDist(); 

                }
                break;
            case 19 :
                // InternalAndroidGeneratorLexer.g:1:161: App
                {
                mApp(); 

                }
                break;
            case 20 :
                // InternalAndroidGeneratorLexer.g:1:165: Map
                {
                mMap(); 

                }
                break;
            case 21 :
                // InternalAndroidGeneratorLexer.g:1:169: Comma
                {
                mComma(); 

                }
                break;
            case 22 :
                // InternalAndroidGeneratorLexer.g:1:175: Colon
                {
                mColon(); 

                }
                break;
            case 23 :
                // InternalAndroidGeneratorLexer.g:1:181: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 24 :
                // InternalAndroidGeneratorLexer.g:1:194: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 25 :
                // InternalAndroidGeneratorLexer.g:1:205: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 26 :
                // InternalAndroidGeneratorLexer.g:1:221: F
                {
                mF(); 

                }
                break;
            case 27 :
                // InternalAndroidGeneratorLexer.g:1:223: M
                {
                mM(); 

                }
                break;
            case 28 :
                // InternalAndroidGeneratorLexer.g:1:225: RULE_PACKAGE_NAME
                {
                mRULE_PACKAGE_NAME(); 

                }
                break;
            case 29 :
                // InternalAndroidGeneratorLexer.g:1:243: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalAndroidGeneratorLexer.g:1:251: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalAndroidGeneratorLexer.g:1:260: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalAndroidGeneratorLexer.g:1:272: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalAndroidGeneratorLexer.g:1:288: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalAndroidGeneratorLexer.g:1:304: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalAndroidGeneratorLexer.g:1:312: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\13\35\5\uffff\1\64\1\65\2\32\2\uffff\2\32\2\uffff\2\35\1\uffff\21\35\16\uffff\1\35\1\125\15\35\1\143\4\35\3\uffff\1\35\1\uffff\13\35\1\uffff\1\35\1\uffff\3\35\1\173\3\uffff\6\35\1\u0083\5\35\1\u0089\3\35\2\uffff\6\35\1\uffff\5\35\1\uffff\1\u0098\1\u0099\1\u009a\4\35\1\uffff\4\35\1\u00a3\1\u00a4\4\uffff\1\35\1\u00a6\1\35\1\u00a8\1\u00a9\1\u00aa\1\u00ab\2\uffff\1\35\1\uffff\1\35\4\uffff\2\35\1\u00b0\1\u00b1\2\uffff";
    static final String DFA13_eofS =
        "\u00b2\uffff";
    static final String DFA13_minS =
        "\1\0\1\156\1\151\1\145\1\141\1\144\1\145\1\157\1\141\1\165\1\157\1\151\5\uffff\2\60\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\144\1\160\1\uffff\1\154\1\141\2\162\1\170\1\141\1\151\1\145\1\164\1\151\2\156\1\144\1\160\1\156\1\154\1\163\10\uffff\2\0\4\uffff\1\162\1\60\1\164\1\147\1\155\1\147\1\164\1\163\1\164\1\155\1\164\1\156\1\164\1\55\1\145\1\60\1\144\1\164\1\144\1\164\1\uffff\2\0\1\157\1\uffff\1\145\1\155\1\151\1\145\1\166\1\164\1\124\1\145\1\151\1\156\1\145\1\uffff\1\154\1\uffff\1\154\1\157\1\145\1\60\1\uffff\2\0\1\151\1\162\1\145\1\163\1\164\1\151\1\60\1\145\2\156\1\145\1\156\1\60\1\145\1\156\1\162\1\uffff\1\0\1\144\1\121\1\156\1\163\1\55\1\145\1\uffff\1\170\1\164\1\147\1\162\1\164\1\uffff\3\60\1\55\1\165\1\164\1\151\1\uffff\1\167\1\164\2\163\2\60\4\uffff\1\145\1\60\1\157\4\60\2\uffff\1\162\1\uffff\1\156\4\uffff\1\171\1\163\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\160\1\162\1\145\1\157\1\154\1\160\2\157\1\165\1\157\1\151\5\uffff\2\172\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1\144\1\160\1\uffff\1\154\1\141\2\162\1\170\1\141\1\151\1\145\1\164\1\151\2\156\1\144\1\160\1\164\1\154\1\163\10\uffff\2\uffff\4\uffff\1\162\1\172\1\164\1\147\1\155\1\147\1\164\1\163\1\164\1\155\1\164\1\156\1\164\1\55\1\145\1\172\1\144\1\164\1\144\1\164\1\uffff\2\uffff\1\157\1\uffff\1\145\1\155\1\151\1\145\1\166\1\164\1\124\1\145\1\151\1\156\1\145\1\uffff\1\154\1\uffff\1\154\1\157\1\145\1\172\1\uffff\2\uffff\1\151\1\162\1\145\1\163\1\164\1\151\1\172\1\145\2\156\1\145\1\156\1\172\1\145\1\156\1\162\1\uffff\1\uffff\1\144\1\121\1\156\1\163\1\55\1\145\1\uffff\1\170\1\164\1\147\1\162\1\164\1\uffff\3\172\1\55\1\165\1\164\1\151\1\uffff\1\167\1\164\2\163\2\172\4\uffff\1\145\1\172\1\157\4\172\2\uffff\1\162\1\uffff\1\156\4\uffff\1\171\1\163\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\14\uffff\1\25\1\26\1\27\1\30\1\31\4\uffff\1\35\1\36\2\uffff\1\42\1\43\2\uffff\1\35\21\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\37\2\uffff\1\36\1\40\1\41\1\42\24\uffff\1\34\3\uffff\1\23\13\uffff\1\13\1\uffff\1\24\4\uffff\1\34\22\uffff\1\22\7\uffff\1\21\5\uffff\1\20\7\uffff\1\4\6\uffff\1\15\1\16\1\17\1\1\7\uffff\1\14\1\12\1\uffff\1\7\1\uffff\1\11\1\5\1\6\1\10\4\uffff\1\2\1\3";
    static final String DFA13_specialS =
        "\1\7\22\uffff\1\10\3\uffff\1\5\37\uffff\1\2\1\6\31\uffff\1\0\1\11\25\uffff\1\3\1\1\21\uffff\1\4\65\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\23\4\32\1\27\4\32\1\14\2\32\1\30\12\26\1\15\1\32\1\16\1\17\1\20\2\32\1\1\1\11\1\7\1\13\1\5\1\2\1\25\1\12\4\25\1\10\2\25\1\3\2\25\1\6\1\4\6\25\3\32\1\24\1\25\1\32\5\25\1\21\6\25\1\22\15\25\uff85\32",
            "\1\33\1\uffff\1\34",
            "\1\36\10\uffff\1\37",
            "\1\40",
            "\1\41\3\uffff\1\42\11\uffff\1\43",
            "\1\44\7\uffff\1\45",
            "\1\46\12\uffff\1\47",
            "\1\50",
            "\1\53\7\uffff\1\51\5\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\101\66\32\70\3\66\1\67\1\70\1\66\32\70\uff85\66",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\66",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "\1\75",
            "\1\76",
            "",
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
            "\1\113",
            "\1\114",
            "\1\115\5\uffff\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\101\66\32\70\4\66\1\70\1\66\32\70\uff85\66",
            "\42\66\1\121\13\66\1\123\1\66\12\122\7\66\32\122\4\66\1\122\1\66\32\122\uff85\66",
            "",
            "",
            "",
            "",
            "\1\124",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\42\66\1\121\13\66\1\123\1\66\12\122\7\66\32\122\4\66\1\122\1\66\32\122\uff85\66",
            "\101\66\32\152\3\66\1\151\1\152\1\66\32\152\uff85\66",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\101\66\32\152\4\66\1\152\1\66\32\152\uff85\66",
            "\42\66\1\121\13\66\1\123\1\66\12\174\7\66\32\174\4\66\1\174\1\66\32\174\uff85\66",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\42\66\1\121\13\66\1\123\1\66\12\174\7\66\32\174\4\66\1\174\1\66\32\174\uff85\66",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00a7",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
            return "1:1: Tokens : ( AndroidSDK | FilterQuery | Permissions | TargetSDK | EditText | Elements | Fragment | Settings | Textview | Content | MinSDK | Spinner | Bundle | Button | Holder | Model | Toast | Dist | App | Map | Comma | Colon | LessThanSign | EqualsSign | GreaterThanSign | F | M | RULE_PACKAGE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_82 = input.LA(1);

                        s = -1;
                        if ( (LA13_82=='\"') ) {s = 81;}

                        else if ( ((LA13_82>='\u0000' && LA13_82<='!')||(LA13_82>='#' && LA13_82<='-')||LA13_82=='/'||(LA13_82>=':' && LA13_82<='@')||(LA13_82>='[' && LA13_82<='^')||LA13_82=='`'||(LA13_82>='{' && LA13_82<='\uFFFF')) ) {s = 54;}

                        else if ( (LA13_82=='.') ) {s = 83;}

                        else if ( ((LA13_82>='0' && LA13_82<='9')||(LA13_82>='A' && LA13_82<='Z')||LA13_82=='_'||(LA13_82>='a' && LA13_82<='z')) ) {s = 82;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_106 = input.LA(1);

                        s = -1;
                        if ( (LA13_106=='\"') ) {s = 81;}

                        else if ( ((LA13_106>='\u0000' && LA13_106<='!')||(LA13_106>='#' && LA13_106<='-')||LA13_106=='/'||(LA13_106>=':' && LA13_106<='@')||(LA13_106>='[' && LA13_106<='^')||LA13_106=='`'||(LA13_106>='{' && LA13_106<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA13_106>='0' && LA13_106<='9')||(LA13_106>='A' && LA13_106<='Z')||LA13_106=='_'||(LA13_106>='a' && LA13_106<='z')) ) {s = 124;}

                        else if ( (LA13_106=='.') ) {s = 83;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_55 = input.LA(1);

                        s = -1;
                        if ( ((LA13_55>='\u0000' && LA13_55<='@')||(LA13_55>='[' && LA13_55<='^')||LA13_55=='`'||(LA13_55>='{' && LA13_55<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA13_55>='A' && LA13_55<='Z')||LA13_55=='_'||(LA13_55>='a' && LA13_55<='z')) ) {s = 56;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_105 = input.LA(1);

                        s = -1;
                        if ( ((LA13_105>='\u0000' && LA13_105<='@')||(LA13_105>='[' && LA13_105<='^')||LA13_105=='`'||(LA13_105>='{' && LA13_105<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA13_105>='A' && LA13_105<='Z')||LA13_105=='_'||(LA13_105>='a' && LA13_105<='z')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_124 = input.LA(1);

                        s = -1;
                        if ( (LA13_124=='\"') ) {s = 81;}

                        else if ( ((LA13_124>='\u0000' && LA13_124<='!')||(LA13_124>='#' && LA13_124<='-')||LA13_124=='/'||(LA13_124>=':' && LA13_124<='@')||(LA13_124>='[' && LA13_124<='^')||LA13_124=='`'||(LA13_124>='{' && LA13_124<='\uFFFF')) ) {s = 54;}

                        else if ( (LA13_124=='.') ) {s = 83;}

                        else if ( ((LA13_124>='0' && LA13_124<='9')||(LA13_124>='A' && LA13_124<='Z')||LA13_124=='_'||(LA13_124>='a' && LA13_124<='z')) ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFF')) ) {s = 54;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_56 = input.LA(1);

                        s = -1;
                        if ( (LA13_56=='\"') ) {s = 81;}

                        else if ( ((LA13_56>='\u0000' && LA13_56<='!')||(LA13_56>='#' && LA13_56<='-')||LA13_56=='/'||(LA13_56>=':' && LA13_56<='@')||(LA13_56>='[' && LA13_56<='^')||LA13_56=='`'||(LA13_56>='{' && LA13_56<='\uFFFF')) ) {s = 54;}

                        else if ( ((LA13_56>='0' && LA13_56<='9')||(LA13_56>='A' && LA13_56<='Z')||LA13_56=='_'||(LA13_56>='a' && LA13_56<='z')) ) {s = 82;}

                        else if ( (LA13_56=='.') ) {s = 83;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='A') ) {s = 1;}

                        else if ( (LA13_0=='F') ) {s = 2;}

                        else if ( (LA13_0=='P') ) {s = 3;}

                        else if ( (LA13_0=='T') ) {s = 4;}

                        else if ( (LA13_0=='E') ) {s = 5;}

                        else if ( (LA13_0=='S') ) {s = 6;}

                        else if ( (LA13_0=='C') ) {s = 7;}

                        else if ( (LA13_0=='M') ) {s = 8;}

                        else if ( (LA13_0=='B') ) {s = 9;}

                        else if ( (LA13_0=='H') ) {s = 10;}

                        else if ( (LA13_0=='D') ) {s = 11;}

                        else if ( (LA13_0==',') ) {s = 12;}

                        else if ( (LA13_0==':') ) {s = 13;}

                        else if ( (LA13_0=='<') ) {s = 14;}

                        else if ( (LA13_0=='=') ) {s = 15;}

                        else if ( (LA13_0=='>') ) {s = 16;}

                        else if ( (LA13_0=='f') ) {s = 17;}

                        else if ( (LA13_0=='m') ) {s = 18;}

                        else if ( (LA13_0=='\"') ) {s = 19;}

                        else if ( (LA13_0=='^') ) {s = 20;}

                        else if ( (LA13_0=='G'||(LA13_0>='I' && LA13_0<='L')||(LA13_0>='N' && LA13_0<='O')||(LA13_0>='Q' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='z')) ) {s = 21;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 22;}

                        else if ( (LA13_0=='\'') ) {s = 23;}

                        else if ( (LA13_0=='/') ) {s = 24;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 25;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_19 = input.LA(1);

                        s = -1;
                        if ( ((LA13_19>='\u0000' && LA13_19<='@')||(LA13_19>='[' && LA13_19<=']')||LA13_19=='`'||(LA13_19>='{' && LA13_19<='\uFFFF')) ) {s = 54;}

                        else if ( (LA13_19=='^') ) {s = 55;}

                        else if ( ((LA13_19>='A' && LA13_19<='Z')||LA13_19=='_'||(LA13_19>='a' && LA13_19<='z')) ) {s = 56;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_83 = input.LA(1);

                        s = -1;
                        if ( ((LA13_83>='\u0000' && LA13_83<='@')||(LA13_83>='[' && LA13_83<=']')||LA13_83=='`'||(LA13_83>='{' && LA13_83<='\uFFFF')) ) {s = 54;}

                        else if ( (LA13_83=='^') ) {s = 105;}

                        else if ( ((LA13_83>='A' && LA13_83<='Z')||LA13_83=='_'||(LA13_83>='a' && LA13_83<='z')) ) {s = 106;}

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