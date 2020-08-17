package org.xtext.example.mdsd.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidGeneratorLexer extends Lexer {
    public static final int App=23;
    public static final int AndroidSDK=4;
    public static final int RULE_END=35;
    public static final int RULE_BEGIN=34;
    public static final int Spinner=16;
    public static final int F=30;
    public static final int RULE_PACKAGE_NAME=33;
    public static final int FilterQuery=5;
    public static final int RULE_STRING=37;
    public static final int Elements=14;
    public static final int Fragment=11;
    public static final int M=31;
    public static final int LessThanSign=27;
    public static final int RULE_SL_COMMENT=39;
    public static final int Comma=25;
    public static final int EqualsSign=28;
    public static final int Toast=22;
    public static final int Button=19;
    public static final int MinimumSDK=6;
    public static final int Permissions=7;
    public static final int Colon=26;
    public static final int TargetSDK=8;
    public static final int EOF=-1;
    public static final int Distance=9;
    public static final int Settings=12;
    public static final int EditText=10;
    public static final int GreaterThanSign=29;
    public static final int RULE_ID=32;
    public static final int Textview=13;
    public static final int Content_1=17;
    public static final int RULE_WS=40;
    public static final int Bundle=18;
    public static final int Holder=20;
    public static final int RULE_ANY_OTHER=41;
    public static final int Content=15;
    public static final int RULE_INT=36;
    public static final int Model=21;
    public static final int RULE_ML_COMMENT=38;
    public static final int Map=24;

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

    // $ANTLR start "MinimumSDK"
    public final void mMinimumSDK() throws RecognitionException {
        try {
            int _type = MinimumSDK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:18:12: ( 'Minimum-SDK' )
            // InternalAndroidGeneratorLexer.g:18:14: 'Minimum-SDK'
            {
            match("Minimum-SDK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MinimumSDK"

    // $ANTLR start "Permissions"
    public final void mPermissions() throws RecognitionException {
        try {
            int _type = Permissions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:20:13: ( 'permissions' )
            // InternalAndroidGeneratorLexer.g:20:15: 'permissions'
            {
            match("permissions"); 


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
            // InternalAndroidGeneratorLexer.g:22:11: ( 'Target-SDK' )
            // InternalAndroidGeneratorLexer.g:22:13: 'Target-SDK'
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

    // $ANTLR start "Distance"
    public final void mDistance() throws RecognitionException {
        try {
            int _type = Distance;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:24:10: ( 'Distance' )
            // InternalAndroidGeneratorLexer.g:24:12: 'Distance'
            {
            match("Distance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Distance"

    // $ANTLR start "EditText"
    public final void mEditText() throws RecognitionException {
        try {
            int _type = EditText;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:26:10: ( 'EditText' )
            // InternalAndroidGeneratorLexer.g:26:12: 'EditText'
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

    // $ANTLR start "Fragment"
    public final void mFragment() throws RecognitionException {
        try {
            int _type = Fragment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:28:10: ( 'Fragment' )
            // InternalAndroidGeneratorLexer.g:28:12: 'Fragment'
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
            // InternalAndroidGeneratorLexer.g:30:10: ( 'Settings' )
            // InternalAndroidGeneratorLexer.g:30:12: 'Settings'
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
            // InternalAndroidGeneratorLexer.g:32:10: ( 'Textview' )
            // InternalAndroidGeneratorLexer.g:32:12: 'Textview'
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

    // $ANTLR start "Elements"
    public final void mElements() throws RecognitionException {
        try {
            int _type = Elements;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:34:10: ( 'elements' )
            // InternalAndroidGeneratorLexer.g:34:12: 'elements'
            {
            match("elements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Elements"

    // $ANTLR start "Content"
    public final void mContent() throws RecognitionException {
        try {
            int _type = Content;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:36:9: ( 'Content' )
            // InternalAndroidGeneratorLexer.g:36:11: 'Content'
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

    // $ANTLR start "Spinner"
    public final void mSpinner() throws RecognitionException {
        try {
            int _type = Spinner;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:38:9: ( 'Spinner' )
            // InternalAndroidGeneratorLexer.g:38:11: 'Spinner'
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

    // $ANTLR start "Content_1"
    public final void mContent_1() throws RecognitionException {
        try {
            int _type = Content_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:40:11: ( 'content' )
            // InternalAndroidGeneratorLexer.g:40:13: 'content'
            {
            match("content"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Content_1"

    // $ANTLR start "Bundle"
    public final void mBundle() throws RecognitionException {
        try {
            int _type = Bundle;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:42:8: ( 'Bundle' )
            // InternalAndroidGeneratorLexer.g:42:10: 'Bundle'
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
            // InternalAndroidGeneratorLexer.g:44:8: ( 'Button' )
            // InternalAndroidGeneratorLexer.g:44:10: 'Button'
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
            // InternalAndroidGeneratorLexer.g:46:8: ( 'Holder' )
            // InternalAndroidGeneratorLexer.g:46:10: 'Holder'
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
            // InternalAndroidGeneratorLexer.g:48:7: ( 'Model' )
            // InternalAndroidGeneratorLexer.g:48:9: 'Model'
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
            // InternalAndroidGeneratorLexer.g:50:7: ( 'Toast' )
            // InternalAndroidGeneratorLexer.g:50:9: 'Toast'
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

    // $ANTLR start "App"
    public final void mApp() throws RecognitionException {
        try {
            int _type = App;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:52:5: ( 'App' )
            // InternalAndroidGeneratorLexer.g:52:7: 'App'
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
            // InternalAndroidGeneratorLexer.g:54:5: ( 'Map' )
            // InternalAndroidGeneratorLexer.g:54:7: 'Map'
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
            // InternalAndroidGeneratorLexer.g:56:7: ( ',' )
            // InternalAndroidGeneratorLexer.g:56:9: ','
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
            // InternalAndroidGeneratorLexer.g:58:7: ( ':' )
            // InternalAndroidGeneratorLexer.g:58:9: ':'
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
            // InternalAndroidGeneratorLexer.g:60:14: ( '<' )
            // InternalAndroidGeneratorLexer.g:60:16: '<'
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
            // InternalAndroidGeneratorLexer.g:62:12: ( '=' )
            // InternalAndroidGeneratorLexer.g:62:14: '='
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
            // InternalAndroidGeneratorLexer.g:64:17: ( '>' )
            // InternalAndroidGeneratorLexer.g:64:19: '>'
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
            // InternalAndroidGeneratorLexer.g:66:3: ( 'f' )
            // InternalAndroidGeneratorLexer.g:66:5: 'f'
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
            // InternalAndroidGeneratorLexer.g:68:3: ( 'm' )
            // InternalAndroidGeneratorLexer.g:68:5: 'm'
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

    // $ANTLR start "RULE_PACKAGE_NAME"
    public final void mRULE_PACKAGE_NAME() throws RecognitionException {
        try {
            int _type = RULE_PACKAGE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:70:19: ( '\"' RULE_ID ( '.' RULE_ID )* '\"' )
            // InternalAndroidGeneratorLexer.g:70:21: '\"' RULE_ID ( '.' RULE_ID )* '\"'
            {
            match('\"'); 
            mRULE_ID(); 
            // InternalAndroidGeneratorLexer.g:70:33: ( '.' RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroidGeneratorLexer.g:70:34: '.' RULE_ID
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalAndroidGeneratorLexer.g:72:21: ()
            // InternalAndroidGeneratorLexer.g:72:23: 
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
            // InternalAndroidGeneratorLexer.g:74:19: ()
            // InternalAndroidGeneratorLexer.g:74:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAndroidGeneratorLexer.g:76:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAndroidGeneratorLexer.g:76:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAndroidGeneratorLexer.g:76:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAndroidGeneratorLexer.g:76:11: '^'
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

            // InternalAndroidGeneratorLexer.g:76:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalAndroidGeneratorLexer.g:78:10: ( ( '0' .. '9' )+ )
            // InternalAndroidGeneratorLexer.g:78:12: ( '0' .. '9' )+
            {
            // InternalAndroidGeneratorLexer.g:78:12: ( '0' .. '9' )+
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
            	    // InternalAndroidGeneratorLexer.g:78:13: '0' .. '9'
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
            // InternalAndroidGeneratorLexer.g:80:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAndroidGeneratorLexer.g:80:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAndroidGeneratorLexer.g:80:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalAndroidGeneratorLexer.g:80:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAndroidGeneratorLexer.g:80:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalAndroidGeneratorLexer.g:80:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAndroidGeneratorLexer.g:80:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalAndroidGeneratorLexer.g:80:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAndroidGeneratorLexer.g:80:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalAndroidGeneratorLexer.g:80:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAndroidGeneratorLexer.g:80:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAndroidGeneratorLexer.g:82:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAndroidGeneratorLexer.g:82:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAndroidGeneratorLexer.g:82:24: ( options {greedy=false; } : . )*
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
            	    // InternalAndroidGeneratorLexer.g:82:52: .
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
            // InternalAndroidGeneratorLexer.g:84:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAndroidGeneratorLexer.g:84:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAndroidGeneratorLexer.g:84:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAndroidGeneratorLexer.g:84:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalAndroidGeneratorLexer.g:84:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAndroidGeneratorLexer.g:84:41: ( '\\r' )? '\\n'
                    {
                    // InternalAndroidGeneratorLexer.g:84:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAndroidGeneratorLexer.g:84:41: '\\r'
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
            // InternalAndroidGeneratorLexer.g:86:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAndroidGeneratorLexer.g:86:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAndroidGeneratorLexer.g:86:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalAndroidGeneratorLexer.g:88:16: ( . )
            // InternalAndroidGeneratorLexer.g:88:18: .
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
        // InternalAndroidGeneratorLexer.g:1:8: ( AndroidSDK | FilterQuery | MinimumSDK | Permissions | TargetSDK | Distance | EditText | Fragment | Settings | Textview | Elements | Content | Spinner | Content_1 | Bundle | Button | Holder | Model | Toast | App | Map | Comma | Colon | LessThanSign | EqualsSign | GreaterThanSign | F | M | RULE_PACKAGE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=36;
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
                // InternalAndroidGeneratorLexer.g:1:33: MinimumSDK
                {
                mMinimumSDK(); 

                }
                break;
            case 4 :
                // InternalAndroidGeneratorLexer.g:1:44: Permissions
                {
                mPermissions(); 

                }
                break;
            case 5 :
                // InternalAndroidGeneratorLexer.g:1:56: TargetSDK
                {
                mTargetSDK(); 

                }
                break;
            case 6 :
                // InternalAndroidGeneratorLexer.g:1:66: Distance
                {
                mDistance(); 

                }
                break;
            case 7 :
                // InternalAndroidGeneratorLexer.g:1:75: EditText
                {
                mEditText(); 

                }
                break;
            case 8 :
                // InternalAndroidGeneratorLexer.g:1:84: Fragment
                {
                mFragment(); 

                }
                break;
            case 9 :
                // InternalAndroidGeneratorLexer.g:1:93: Settings
                {
                mSettings(); 

                }
                break;
            case 10 :
                // InternalAndroidGeneratorLexer.g:1:102: Textview
                {
                mTextview(); 

                }
                break;
            case 11 :
                // InternalAndroidGeneratorLexer.g:1:111: Elements
                {
                mElements(); 

                }
                break;
            case 12 :
                // InternalAndroidGeneratorLexer.g:1:120: Content
                {
                mContent(); 

                }
                break;
            case 13 :
                // InternalAndroidGeneratorLexer.g:1:128: Spinner
                {
                mSpinner(); 

                }
                break;
            case 14 :
                // InternalAndroidGeneratorLexer.g:1:136: Content_1
                {
                mContent_1(); 

                }
                break;
            case 15 :
                // InternalAndroidGeneratorLexer.g:1:146: Bundle
                {
                mBundle(); 

                }
                break;
            case 16 :
                // InternalAndroidGeneratorLexer.g:1:153: Button
                {
                mButton(); 

                }
                break;
            case 17 :
                // InternalAndroidGeneratorLexer.g:1:160: Holder
                {
                mHolder(); 

                }
                break;
            case 18 :
                // InternalAndroidGeneratorLexer.g:1:167: Model
                {
                mModel(); 

                }
                break;
            case 19 :
                // InternalAndroidGeneratorLexer.g:1:173: Toast
                {
                mToast(); 

                }
                break;
            case 20 :
                // InternalAndroidGeneratorLexer.g:1:179: App
                {
                mApp(); 

                }
                break;
            case 21 :
                // InternalAndroidGeneratorLexer.g:1:183: Map
                {
                mMap(); 

                }
                break;
            case 22 :
                // InternalAndroidGeneratorLexer.g:1:187: Comma
                {
                mComma(); 

                }
                break;
            case 23 :
                // InternalAndroidGeneratorLexer.g:1:193: Colon
                {
                mColon(); 

                }
                break;
            case 24 :
                // InternalAndroidGeneratorLexer.g:1:199: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 25 :
                // InternalAndroidGeneratorLexer.g:1:212: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 26 :
                // InternalAndroidGeneratorLexer.g:1:223: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 27 :
                // InternalAndroidGeneratorLexer.g:1:239: F
                {
                mF(); 

                }
                break;
            case 28 :
                // InternalAndroidGeneratorLexer.g:1:241: M
                {
                mM(); 

                }
                break;
            case 29 :
                // InternalAndroidGeneratorLexer.g:1:243: RULE_PACKAGE_NAME
                {
                mRULE_PACKAGE_NAME(); 

                }
                break;
            case 30 :
                // InternalAndroidGeneratorLexer.g:1:261: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalAndroidGeneratorLexer.g:1:269: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalAndroidGeneratorLexer.g:1:278: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalAndroidGeneratorLexer.g:1:290: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalAndroidGeneratorLexer.g:1:306: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalAndroidGeneratorLexer.g:1:322: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalAndroidGeneratorLexer.g:1:330: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\15\37\5\uffff\1\67\1\70\2\34\2\uffff\2\34\2\uffff\2\37\1\uffff\22\37\16\uffff\1\37\1\131\4\37\1\136\16\37\3\uffff\1\37\1\uffff\4\37\1\uffff\16\37\3\uffff\4\37\1\u0088\3\37\1\u008c\12\37\1\uffff\4\37\1\uffff\3\37\1\uffff\7\37\1\u00a5\1\u00a6\1\u00a7\5\37\1\uffff\4\37\1\u00b1\1\37\1\u00b3\1\u00b4\4\uffff\1\37\1\u00b6\1\uffff\1\37\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\uffff\1\u00bc\2\uffff\1\37\1\uffff\1\37\5\uffff\2\37\1\u00c1\1\u00c2\2\uffff";
    static final String DFA13_eofS =
        "\u00c3\uffff";
    static final String DFA13_minS =
        "\1\0\1\156\1\151\1\141\1\145\1\141\1\151\1\144\1\145\1\154\2\157\1\165\1\157\5\uffff\2\60\1\0\1\101\2\uffff\1\0\1\52\2\uffff\1\144\1\160\1\uffff\1\154\1\141\1\156\1\144\1\160\2\162\1\170\1\141\1\163\1\151\1\164\1\151\1\145\3\156\1\154\7\uffff\2\0\5\uffff\1\162\1\60\1\164\1\147\1\151\1\145\1\60\1\155\1\147\1\164\1\163\3\164\1\156\1\155\2\164\1\144\1\164\1\144\2\0\1\uffff\1\157\1\uffff\1\145\2\155\1\154\1\uffff\1\151\1\145\1\166\1\164\1\141\1\124\1\151\1\156\3\145\1\154\1\157\1\145\2\0\1\uffff\1\151\1\162\1\145\1\165\1\60\1\163\1\164\1\151\1\60\1\156\1\145\1\156\1\145\3\156\1\145\1\156\1\162\1\0\1\144\1\121\1\156\1\155\1\uffff\1\163\1\55\1\145\1\uffff\1\143\1\170\1\147\1\162\3\164\3\60\1\55\1\165\1\164\1\55\1\151\1\uffff\1\167\1\145\1\164\1\163\1\60\1\163\2\60\4\uffff\1\145\1\60\1\uffff\1\157\4\60\1\uffff\1\60\2\uffff\1\162\1\uffff\1\156\5\uffff\1\171\1\163\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\160\1\162\1\157\1\145\1\157\1\151\1\144\1\160\1\154\2\157\1\165\1\157\5\uffff\2\172\1\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\1\144\1\160\1\uffff\1\154\1\141\1\156\1\144\1\160\2\162\1\170\1\141\1\163\1\151\1\164\1\151\1\145\2\156\1\164\1\154\7\uffff\2\uffff\5\uffff\1\162\1\172\1\164\1\147\1\151\1\145\1\172\1\155\1\147\1\164\1\163\3\164\1\156\1\155\2\164\1\144\1\164\1\144\2\uffff\1\uffff\1\157\1\uffff\1\145\2\155\1\154\1\uffff\1\151\1\145\1\166\1\164\1\141\1\124\1\151\1\156\3\145\1\154\1\157\1\145\2\uffff\1\uffff\1\151\1\162\1\145\1\165\1\172\1\163\1\164\1\151\1\172\1\156\1\145\1\156\1\145\3\156\1\145\1\156\1\162\1\uffff\1\144\1\121\1\156\1\155\1\uffff\1\163\1\55\1\145\1\uffff\1\143\1\170\1\147\1\162\3\164\3\172\1\55\1\165\1\164\1\55\1\151\1\uffff\1\167\1\145\1\164\1\163\1\172\1\163\2\172\4\uffff\1\145\1\172\1\uffff\1\157\4\172\1\uffff\1\172\2\uffff\1\162\1\uffff\1\156\5\uffff\1\171\1\163\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\16\uffff\1\26\1\27\1\30\1\31\1\32\4\uffff\1\36\1\37\2\uffff\1\43\1\44\2\uffff\1\36\22\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\2\uffff\1\40\1\37\1\41\1\42\1\43\27\uffff\1\35\1\uffff\1\24\4\uffff\1\25\20\uffff\1\35\30\uffff\1\22\3\uffff\1\23\17\uffff\1\5\10\uffff\1\17\1\20\1\21\1\1\2\uffff\1\3\5\uffff\1\15\1\uffff\1\14\1\16\1\uffff\1\10\1\uffff\1\12\1\6\1\7\1\11\1\13\4\uffff\1\2\1\4";
    static final String DFA13_specialS =
        "\1\0\24\uffff\1\7\3\uffff\1\10\37\uffff\1\5\1\4\32\uffff\1\1\1\3\26\uffff\1\6\1\2\24\uffff\1\11\77\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\25\4\34\1\31\4\34\1\16\2\34\1\32\12\30\1\17\1\34\1\20\1\21\1\22\2\34\1\1\1\14\1\12\1\6\1\7\1\2\1\27\1\15\4\27\1\3\5\27\1\10\1\5\6\27\3\34\1\26\1\27\1\34\2\27\1\13\1\27\1\11\1\23\6\27\1\24\2\27\1\4\12\27\uff85\34",
            "\1\35\1\uffff\1\36",
            "\1\40\10\uffff\1\41",
            "\1\44\7\uffff\1\42\5\uffff\1\43",
            "\1\45",
            "\1\46\3\uffff\1\47\11\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53\12\uffff\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\101\73\32\72\3\73\1\71\1\72\1\73\32\72\uff85\73",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\73",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\100",
            "\1\101",
            "",
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
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122\5\uffff\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\101\73\32\72\4\73\1\72\1\73\32\72\uff85\73",
            "\42\73\1\127\13\73\1\126\1\73\12\125\7\73\32\125\4\73\1\125\1\73\32\125\uff85\73",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\42\73\1\127\13\73\1\126\1\73\12\125\7\73\32\125\4\73\1\125\1\73\32\125\uff85\73",
            "\101\73\32\156\3\73\1\155\1\156\1\73\32\156\uff85\73",
            "",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\101\73\32\156\4\73\1\156\1\73\32\156\uff85\73",
            "\42\73\1\127\13\73\1\126\1\73\12\u0083\7\73\32\u0083\4\73\1\u0083\1\73\32\u0083\uff85\73",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\42\73\1\127\13\73\1\126\1\73\12\u0083\7\73\32\u0083\4\73\1\u0083\1\73\32\u0083\uff85\73",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u00b2",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "\1\u00b5",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u00b7",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u00bd",
            "",
            "\1\u00be",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
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
            return "1:1: Tokens : ( AndroidSDK | FilterQuery | MinimumSDK | Permissions | TargetSDK | Distance | EditText | Fragment | Settings | Textview | Elements | Content | Spinner | Content_1 | Bundle | Button | Holder | Model | Toast | App | Map | Comma | Colon | LessThanSign | EqualsSign | GreaterThanSign | F | M | RULE_PACKAGE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='A') ) {s = 1;}

                        else if ( (LA13_0=='F') ) {s = 2;}

                        else if ( (LA13_0=='M') ) {s = 3;}

                        else if ( (LA13_0=='p') ) {s = 4;}

                        else if ( (LA13_0=='T') ) {s = 5;}

                        else if ( (LA13_0=='D') ) {s = 6;}

                        else if ( (LA13_0=='E') ) {s = 7;}

                        else if ( (LA13_0=='S') ) {s = 8;}

                        else if ( (LA13_0=='e') ) {s = 9;}

                        else if ( (LA13_0=='C') ) {s = 10;}

                        else if ( (LA13_0=='c') ) {s = 11;}

                        else if ( (LA13_0=='B') ) {s = 12;}

                        else if ( (LA13_0=='H') ) {s = 13;}

                        else if ( (LA13_0==',') ) {s = 14;}

                        else if ( (LA13_0==':') ) {s = 15;}

                        else if ( (LA13_0=='<') ) {s = 16;}

                        else if ( (LA13_0=='=') ) {s = 17;}

                        else if ( (LA13_0=='>') ) {s = 18;}

                        else if ( (LA13_0=='f') ) {s = 19;}

                        else if ( (LA13_0=='m') ) {s = 20;}

                        else if ( (LA13_0=='\"') ) {s = 21;}

                        else if ( (LA13_0=='^') ) {s = 22;}

                        else if ( (LA13_0=='G'||(LA13_0>='I' && LA13_0<='L')||(LA13_0>='N' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='b')||LA13_0=='d'||(LA13_0>='g' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='z')) ) {s = 23;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 24;}

                        else if ( (LA13_0=='\'') ) {s = 25;}

                        else if ( (LA13_0=='/') ) {s = 26;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 27;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||LA13_0==';'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_85 = input.LA(1);

                        s = -1;
                        if ( (LA13_85=='.') ) {s = 86;}

                        else if ( (LA13_85=='\"') ) {s = 87;}

                        else if ( ((LA13_85>='0' && LA13_85<='9')||(LA13_85>='A' && LA13_85<='Z')||LA13_85=='_'||(LA13_85>='a' && LA13_85<='z')) ) {s = 85;}

                        else if ( ((LA13_85>='\u0000' && LA13_85<='!')||(LA13_85>='#' && LA13_85<='-')||LA13_85=='/'||(LA13_85>=':' && LA13_85<='@')||(LA13_85>='[' && LA13_85<='^')||LA13_85=='`'||(LA13_85>='{' && LA13_85<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_110 = input.LA(1);

                        s = -1;
                        if ( ((LA13_110>='0' && LA13_110<='9')||(LA13_110>='A' && LA13_110<='Z')||LA13_110=='_'||(LA13_110>='a' && LA13_110<='z')) ) {s = 131;}

                        else if ( (LA13_110=='\"') ) {s = 87;}

                        else if ( (LA13_110=='.') ) {s = 86;}

                        else if ( ((LA13_110>='\u0000' && LA13_110<='!')||(LA13_110>='#' && LA13_110<='-')||LA13_110=='/'||(LA13_110>=':' && LA13_110<='@')||(LA13_110>='[' && LA13_110<='^')||LA13_110=='`'||(LA13_110>='{' && LA13_110<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_86 = input.LA(1);

                        s = -1;
                        if ( (LA13_86=='^') ) {s = 109;}

                        else if ( ((LA13_86>='A' && LA13_86<='Z')||LA13_86=='_'||(LA13_86>='a' && LA13_86<='z')) ) {s = 110;}

                        else if ( ((LA13_86>='\u0000' && LA13_86<='@')||(LA13_86>='[' && LA13_86<=']')||LA13_86=='`'||(LA13_86>='{' && LA13_86<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_58 = input.LA(1);

                        s = -1;
                        if ( ((LA13_58>='0' && LA13_58<='9')||(LA13_58>='A' && LA13_58<='Z')||LA13_58=='_'||(LA13_58>='a' && LA13_58<='z')) ) {s = 85;}

                        else if ( (LA13_58=='.') ) {s = 86;}

                        else if ( (LA13_58=='\"') ) {s = 87;}

                        else if ( ((LA13_58>='\u0000' && LA13_58<='!')||(LA13_58>='#' && LA13_58<='-')||LA13_58=='/'||(LA13_58>=':' && LA13_58<='@')||(LA13_58>='[' && LA13_58<='^')||LA13_58=='`'||(LA13_58>='{' && LA13_58<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_57 = input.LA(1);

                        s = -1;
                        if ( ((LA13_57>='\u0000' && LA13_57<='@')||(LA13_57>='[' && LA13_57<='^')||LA13_57=='`'||(LA13_57>='{' && LA13_57<='\uFFFF')) ) {s = 59;}

                        else if ( ((LA13_57>='A' && LA13_57<='Z')||LA13_57=='_'||(LA13_57>='a' && LA13_57<='z')) ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_109 = input.LA(1);

                        s = -1;
                        if ( ((LA13_109>='A' && LA13_109<='Z')||LA13_109=='_'||(LA13_109>='a' && LA13_109<='z')) ) {s = 110;}

                        else if ( ((LA13_109>='\u0000' && LA13_109<='@')||(LA13_109>='[' && LA13_109<='^')||LA13_109=='`'||(LA13_109>='{' && LA13_109<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( (LA13_21=='^') ) {s = 57;}

                        else if ( ((LA13_21>='A' && LA13_21<='Z')||LA13_21=='_'||(LA13_21>='a' && LA13_21<='z')) ) {s = 58;}

                        else if ( ((LA13_21>='\u0000' && LA13_21<='@')||(LA13_21>='[' && LA13_21<=']')||LA13_21=='`'||(LA13_21>='{' && LA13_21<='\uFFFF')) ) {s = 59;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( ((LA13_25>='\u0000' && LA13_25<='\uFFFF')) ) {s = 59;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_131 = input.LA(1);

                        s = -1;
                        if ( (LA13_131=='\"') ) {s = 87;}

                        else if ( (LA13_131=='.') ) {s = 86;}

                        else if ( ((LA13_131>='0' && LA13_131<='9')||(LA13_131>='A' && LA13_131<='Z')||LA13_131=='_'||(LA13_131>='a' && LA13_131<='z')) ) {s = 131;}

                        else if ( ((LA13_131>='\u0000' && LA13_131<='!')||(LA13_131>='#' && LA13_131<='-')||LA13_131=='/'||(LA13_131>=':' && LA13_131<='@')||(LA13_131>='[' && LA13_131<='^')||LA13_131=='`'||(LA13_131>='{' && LA13_131<='\uFFFF')) ) {s = 59;}

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