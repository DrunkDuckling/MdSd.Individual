package org.xtext.example.mdsd.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import org.xtext.example.mdsd.services.AndroidGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidGeneratorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndroidSDK", "FilterQuery", "Permissions", "TargetSDK", "EditText", "Elements", "Fragment", "Settings", "Textview", "Content", "MinSDK", "Spinner", "Bundle", "Button", "Holder", "Model", "Toast", "Dist", "App", "Map", "Comma", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "F", "M", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_PACKAGE_NAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalAndroidGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAndroidGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAndroidGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAndroidGeneratorParser.g"; }


    	private AndroidGeneratorGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("F", "'f'");
    		tokenNameToValue.put("M", "'m'");
    		tokenNameToValue.put("App", "'App'");
    		tokenNameToValue.put("Map", "'Map'");
    		tokenNameToValue.put("Dist", "'Dist'");
    		tokenNameToValue.put("Model", "'Model'");
    		tokenNameToValue.put("Toast", "'Toast'");
    		tokenNameToValue.put("Bundle", "'Bundle'");
    		tokenNameToValue.put("Button", "'Button'");
    		tokenNameToValue.put("Holder", "'Holder'");
    		tokenNameToValue.put("Content", "'Content'");
    		tokenNameToValue.put("MinSDK", "'Min-SDK'");
    		tokenNameToValue.put("Spinner", "'Spinner'");
    		tokenNameToValue.put("EditText", "'EditText'");
    		tokenNameToValue.put("Elements", "'Elements'");
    		tokenNameToValue.put("Fragment", "'Fragment'");
    		tokenNameToValue.put("Settings", "'Settings'");
    		tokenNameToValue.put("Textview", "'Textview'");
    		tokenNameToValue.put("TargetSDK", "'Target-SDK'");
    		tokenNameToValue.put("AndroidSDK", "'Android-SDK'");
    		tokenNameToValue.put("FilterQuery", "'FilterQuery'");
    		tokenNameToValue.put("Permissions", "'Permissions'");
    	}

    	public void setGrammarAccess(AndroidGeneratorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleAndroidAppProject"
    // InternalAndroidGeneratorParser.g:82:1: entryRuleAndroidAppProject : ruleAndroidAppProject EOF ;
    public final void entryRuleAndroidAppProject() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:83:1: ( ruleAndroidAppProject EOF )
            // InternalAndroidGeneratorParser.g:84:1: ruleAndroidAppProject EOF
            {
             before(grammarAccess.getAndroidAppProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleAndroidAppProject();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectRule()); 
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
    // $ANTLR end "entryRuleAndroidAppProject"


    // $ANTLR start "ruleAndroidAppProject"
    // InternalAndroidGeneratorParser.g:91:1: ruleAndroidAppProject : ( ( rule__AndroidAppProject__ApplicationsAssignment )* ) ;
    public final void ruleAndroidAppProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:95:2: ( ( ( rule__AndroidAppProject__ApplicationsAssignment )* ) )
            // InternalAndroidGeneratorParser.g:96:2: ( ( rule__AndroidAppProject__ApplicationsAssignment )* )
            {
            // InternalAndroidGeneratorParser.g:96:2: ( ( rule__AndroidAppProject__ApplicationsAssignment )* )
            // InternalAndroidGeneratorParser.g:97:3: ( rule__AndroidAppProject__ApplicationsAssignment )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment()); 
            // InternalAndroidGeneratorParser.g:98:3: ( rule__AndroidAppProject__ApplicationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==App) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:98:4: rule__AndroidAppProject__ApplicationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AndroidAppProject__ApplicationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndroidAppProject"


    // $ANTLR start "entryRuleApplication"
    // InternalAndroidGeneratorParser.g:107:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:108:1: ( ruleApplication EOF )
            // InternalAndroidGeneratorParser.g:109:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalAndroidGeneratorParser.g:116:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:120:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:121:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:121:2: ( ( rule__Application__Group__0 ) )
            // InternalAndroidGeneratorParser.g:122:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:123:3: ( rule__Application__Group__0 )
            // InternalAndroidGeneratorParser.g:123:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleApplicationAttribute"
    // InternalAndroidGeneratorParser.g:132:1: entryRuleApplicationAttribute : ruleApplicationAttribute EOF ;
    public final void entryRuleApplicationAttribute() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:133:1: ( ruleApplicationAttribute EOF )
            // InternalAndroidGeneratorParser.g:134:1: ruleApplicationAttribute EOF
            {
             before(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAttributeRule()); 
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
    // $ANTLR end "entryRuleApplicationAttribute"


    // $ANTLR start "ruleApplicationAttribute"
    // InternalAndroidGeneratorParser.g:141:1: ruleApplicationAttribute : ( ( rule__ApplicationAttribute__Alternatives ) ) ;
    public final void ruleApplicationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:145:2: ( ( ( rule__ApplicationAttribute__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:146:2: ( ( rule__ApplicationAttribute__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:146:2: ( ( rule__ApplicationAttribute__Alternatives ) )
            // InternalAndroidGeneratorParser.g:147:3: ( rule__ApplicationAttribute__Alternatives )
            {
             before(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:148:3: ( rule__ApplicationAttribute__Alternatives )
            // InternalAndroidGeneratorParser.g:148:4: rule__ApplicationAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationAttribute"


    // $ANTLR start "entryRuleApplicationVersion"
    // InternalAndroidGeneratorParser.g:157:1: entryRuleApplicationVersion : ruleApplicationVersion EOF ;
    public final void entryRuleApplicationVersion() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:158:1: ( ruleApplicationVersion EOF )
            // InternalAndroidGeneratorParser.g:159:1: ruleApplicationVersion EOF
            {
             before(grammarAccess.getApplicationVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationVersion();

            state._fsp--;

             after(grammarAccess.getApplicationVersionRule()); 
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
    // $ANTLR end "entryRuleApplicationVersion"


    // $ANTLR start "ruleApplicationVersion"
    // InternalAndroidGeneratorParser.g:166:1: ruleApplicationVersion : ( ( rule__ApplicationVersion__Group__0 ) ) ;
    public final void ruleApplicationVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:170:2: ( ( ( rule__ApplicationVersion__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:171:2: ( ( rule__ApplicationVersion__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:171:2: ( ( rule__ApplicationVersion__Group__0 ) )
            // InternalAndroidGeneratorParser.g:172:3: ( rule__ApplicationVersion__Group__0 )
            {
             before(grammarAccess.getApplicationVersionAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:173:3: ( rule__ApplicationVersion__Group__0 )
            // InternalAndroidGeneratorParser.g:173:4: rule__ApplicationVersion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationVersion"


    // $ANTLR start "entryRuleTargetSDK"
    // InternalAndroidGeneratorParser.g:182:1: entryRuleTargetSDK : ruleTargetSDK EOF ;
    public final void entryRuleTargetSDK() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:183:1: ( ruleTargetSDK EOF )
            // InternalAndroidGeneratorParser.g:184:1: ruleTargetSDK EOF
            {
             before(grammarAccess.getTargetSDKRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetSDK();

            state._fsp--;

             after(grammarAccess.getTargetSDKRule()); 
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
    // $ANTLR end "entryRuleTargetSDK"


    // $ANTLR start "ruleTargetSDK"
    // InternalAndroidGeneratorParser.g:191:1: ruleTargetSDK : ( ( rule__TargetSDK__Group__0 ) ) ;
    public final void ruleTargetSDK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:195:2: ( ( ( rule__TargetSDK__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:196:2: ( ( rule__TargetSDK__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:196:2: ( ( rule__TargetSDK__Group__0 ) )
            // InternalAndroidGeneratorParser.g:197:3: ( rule__TargetSDK__Group__0 )
            {
             before(grammarAccess.getTargetSDKAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:198:3: ( rule__TargetSDK__Group__0 )
            // InternalAndroidGeneratorParser.g:198:4: rule__TargetSDK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetSDK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetSDKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetSDK"


    // $ANTLR start "entryRuleMinSDK"
    // InternalAndroidGeneratorParser.g:207:1: entryRuleMinSDK : ruleMinSDK EOF ;
    public final void entryRuleMinSDK() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:208:1: ( ruleMinSDK EOF )
            // InternalAndroidGeneratorParser.g:209:1: ruleMinSDK EOF
            {
             before(grammarAccess.getMinSDKRule()); 
            pushFollow(FOLLOW_1);
            ruleMinSDK();

            state._fsp--;

             after(grammarAccess.getMinSDKRule()); 
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
    // $ANTLR end "entryRuleMinSDK"


    // $ANTLR start "ruleMinSDK"
    // InternalAndroidGeneratorParser.g:216:1: ruleMinSDK : ( ( rule__MinSDK__Group__0 ) ) ;
    public final void ruleMinSDK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:220:2: ( ( ( rule__MinSDK__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:221:2: ( ( rule__MinSDK__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:221:2: ( ( rule__MinSDK__Group__0 ) )
            // InternalAndroidGeneratorParser.g:222:3: ( rule__MinSDK__Group__0 )
            {
             before(grammarAccess.getMinSDKAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:223:3: ( rule__MinSDK__Group__0 )
            // InternalAndroidGeneratorParser.g:223:4: rule__MinSDK__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinSDK__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinSDKAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinSDK"


    // $ANTLR start "entryRuleApplicationPermissionList"
    // InternalAndroidGeneratorParser.g:232:1: entryRuleApplicationPermissionList : ruleApplicationPermissionList EOF ;
    public final void entryRuleApplicationPermissionList() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:233:1: ( ruleApplicationPermissionList EOF )
            // InternalAndroidGeneratorParser.g:234:1: ruleApplicationPermissionList EOF
            {
             before(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationPermissionList();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListRule()); 
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
    // $ANTLR end "entryRuleApplicationPermissionList"


    // $ANTLR start "ruleApplicationPermissionList"
    // InternalAndroidGeneratorParser.g:241:1: ruleApplicationPermissionList : ( ( rule__ApplicationPermissionList__Group__0 ) ) ;
    public final void ruleApplicationPermissionList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:245:2: ( ( ( rule__ApplicationPermissionList__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:246:2: ( ( rule__ApplicationPermissionList__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:246:2: ( ( rule__ApplicationPermissionList__Group__0 ) )
            // InternalAndroidGeneratorParser.g:247:3: ( rule__ApplicationPermissionList__Group__0 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:248:3: ( rule__ApplicationPermissionList__Group__0 )
            // InternalAndroidGeneratorParser.g:248:4: rule__ApplicationPermissionList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationPermissionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationPermissionList"


    // $ANTLR start "entryRulePermission"
    // InternalAndroidGeneratorParser.g:257:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:258:1: ( rulePermission EOF )
            // InternalAndroidGeneratorParser.g:259:1: rulePermission EOF
            {
             before(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_1);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPermissionRule()); 
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
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // InternalAndroidGeneratorParser.g:266:1: rulePermission : ( ( rule__Permission__NameAssignment ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:270:2: ( ( ( rule__Permission__NameAssignment ) ) )
            // InternalAndroidGeneratorParser.g:271:2: ( ( rule__Permission__NameAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:271:2: ( ( rule__Permission__NameAssignment ) )
            // InternalAndroidGeneratorParser.g:272:3: ( rule__Permission__NameAssignment )
            {
             before(grammarAccess.getPermissionAccess().getNameAssignment()); 
            // InternalAndroidGeneratorParser.g:273:3: ( rule__Permission__NameAssignment )
            // InternalAndroidGeneratorParser.g:273:4: rule__Permission__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Permission__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleApplicationElementList"
    // InternalAndroidGeneratorParser.g:282:1: entryRuleApplicationElementList : ruleApplicationElementList EOF ;
    public final void entryRuleApplicationElementList() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:283:1: ( ruleApplicationElementList EOF )
            // InternalAndroidGeneratorParser.g:284:1: ruleApplicationElementList EOF
            {
             before(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationElementList();

            state._fsp--;

             after(grammarAccess.getApplicationElementListRule()); 
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
    // $ANTLR end "entryRuleApplicationElementList"


    // $ANTLR start "ruleApplicationElementList"
    // InternalAndroidGeneratorParser.g:291:1: ruleApplicationElementList : ( ( rule__ApplicationElementList__Group__0 ) ) ;
    public final void ruleApplicationElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:295:2: ( ( ( rule__ApplicationElementList__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:296:2: ( ( rule__ApplicationElementList__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:296:2: ( ( rule__ApplicationElementList__Group__0 ) )
            // InternalAndroidGeneratorParser.g:297:3: ( rule__ApplicationElementList__Group__0 )
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:298:3: ( rule__ApplicationElementList__Group__0 )
            // InternalAndroidGeneratorParser.g:298:4: rule__ApplicationElementList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationElementList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationElementList"


    // $ANTLR start "entryRuleApplicationElement"
    // InternalAndroidGeneratorParser.g:307:1: entryRuleApplicationElement : ruleApplicationElement EOF ;
    public final void entryRuleApplicationElement() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:308:1: ( ruleApplicationElement EOF )
            // InternalAndroidGeneratorParser.g:309:1: ruleApplicationElement EOF
            {
             before(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementRule()); 
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
    // $ANTLR end "entryRuleApplicationElement"


    // $ANTLR start "ruleApplicationElement"
    // InternalAndroidGeneratorParser.g:316:1: ruleApplicationElement : ( ( rule__ApplicationElement__Alternatives ) ) ;
    public final void ruleApplicationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:320:2: ( ( ( rule__ApplicationElement__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:321:2: ( ( rule__ApplicationElement__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:321:2: ( ( rule__ApplicationElement__Alternatives ) )
            // InternalAndroidGeneratorParser.g:322:3: ( rule__ApplicationElement__Alternatives )
            {
             before(grammarAccess.getApplicationElementAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:323:3: ( rule__ApplicationElement__Alternatives )
            // InternalAndroidGeneratorParser.g:323:4: rule__ApplicationElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getApplicationElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationElement"


    // $ANTLR start "entryRuleModel"
    // InternalAndroidGeneratorParser.g:332:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:333:1: ( ruleModel EOF )
            // InternalAndroidGeneratorParser.g:334:1: ruleModel EOF
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
    // InternalAndroidGeneratorParser.g:341:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:345:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:346:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:346:2: ( ( rule__Model__Group__0 ) )
            // InternalAndroidGeneratorParser.g:347:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:348:3: ( rule__Model__Group__0 )
            // InternalAndroidGeneratorParser.g:348:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleFragment"
    // InternalAndroidGeneratorParser.g:357:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:358:1: ( ruleFragment EOF )
            // InternalAndroidGeneratorParser.g:359:1: ruleFragment EOF
            {
             before(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalAndroidGeneratorParser.g:366:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:370:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:371:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:371:2: ( ( rule__Fragment__Group__0 ) )
            // InternalAndroidGeneratorParser.g:372:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:373:3: ( rule__Fragment__Group__0 )
            // InternalAndroidGeneratorParser.g:373:4: rule__Fragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleFragmentLayoutAttributes"
    // InternalAndroidGeneratorParser.g:382:1: entryRuleFragmentLayoutAttributes : ruleFragmentLayoutAttributes EOF ;
    public final void entryRuleFragmentLayoutAttributes() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:383:1: ( ruleFragmentLayoutAttributes EOF )
            // InternalAndroidGeneratorParser.g:384:1: ruleFragmentLayoutAttributes EOF
            {
             before(grammarAccess.getFragmentLayoutAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleFragmentLayoutAttributes();

            state._fsp--;

             after(grammarAccess.getFragmentLayoutAttributesRule()); 
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
    // $ANTLR end "entryRuleFragmentLayoutAttributes"


    // $ANTLR start "ruleFragmentLayoutAttributes"
    // InternalAndroidGeneratorParser.g:391:1: ruleFragmentLayoutAttributes : ( ( rule__FragmentLayoutAttributes__Group__0 ) ) ;
    public final void ruleFragmentLayoutAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:395:2: ( ( ( rule__FragmentLayoutAttributes__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:396:2: ( ( rule__FragmentLayoutAttributes__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:396:2: ( ( rule__FragmentLayoutAttributes__Group__0 ) )
            // InternalAndroidGeneratorParser.g:397:3: ( rule__FragmentLayoutAttributes__Group__0 )
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:398:3: ( rule__FragmentLayoutAttributes__Group__0 )
            // InternalAndroidGeneratorParser.g:398:4: rule__FragmentLayoutAttributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentLayoutAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragmentLayoutAttributes"


    // $ANTLR start "entryRuleLayoutElement"
    // InternalAndroidGeneratorParser.g:407:1: entryRuleLayoutElement : ruleLayoutElement EOF ;
    public final void entryRuleLayoutElement() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:408:1: ( ruleLayoutElement EOF )
            // InternalAndroidGeneratorParser.g:409:1: ruleLayoutElement EOF
            {
             before(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getLayoutElementRule()); 
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
    // $ANTLR end "entryRuleLayoutElement"


    // $ANTLR start "ruleLayoutElement"
    // InternalAndroidGeneratorParser.g:416:1: ruleLayoutElement : ( ( rule__LayoutElement__Alternatives ) ) ;
    public final void ruleLayoutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:420:2: ( ( ( rule__LayoutElement__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:421:2: ( ( rule__LayoutElement__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:421:2: ( ( rule__LayoutElement__Alternatives ) )
            // InternalAndroidGeneratorParser.g:422:3: ( rule__LayoutElement__Alternatives )
            {
             before(grammarAccess.getLayoutElementAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:423:3: ( rule__LayoutElement__Alternatives )
            // InternalAndroidGeneratorParser.g:423:4: rule__LayoutElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayoutElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutElement"


    // $ANTLR start "entryRuleDataholders"
    // InternalAndroidGeneratorParser.g:432:1: entryRuleDataholders : ruleDataholders EOF ;
    public final void entryRuleDataholders() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:433:1: ( ruleDataholders EOF )
            // InternalAndroidGeneratorParser.g:434:1: ruleDataholders EOF
            {
             before(grammarAccess.getDataholdersRule()); 
            pushFollow(FOLLOW_1);
            ruleDataholders();

            state._fsp--;

             after(grammarAccess.getDataholdersRule()); 
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
    // $ANTLR end "entryRuleDataholders"


    // $ANTLR start "ruleDataholders"
    // InternalAndroidGeneratorParser.g:441:1: ruleDataholders : ( ( rule__Dataholders__Alternatives ) ) ;
    public final void ruleDataholders() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:445:2: ( ( ( rule__Dataholders__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:446:2: ( ( rule__Dataholders__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:446:2: ( ( rule__Dataholders__Alternatives ) )
            // InternalAndroidGeneratorParser.g:447:3: ( rule__Dataholders__Alternatives )
            {
             before(grammarAccess.getDataholdersAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:448:3: ( rule__Dataholders__Alternatives )
            // InternalAndroidGeneratorParser.g:448:4: rule__Dataholders__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dataholders__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataholdersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataholders"


    // $ANTLR start "entryRuleTypeMap"
    // InternalAndroidGeneratorParser.g:457:1: entryRuleTypeMap : ruleTypeMap EOF ;
    public final void entryRuleTypeMap() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:458:1: ( ruleTypeMap EOF )
            // InternalAndroidGeneratorParser.g:459:1: ruleTypeMap EOF
            {
             before(grammarAccess.getTypeMapRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeMap();

            state._fsp--;

             after(grammarAccess.getTypeMapRule()); 
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
    // $ANTLR end "entryRuleTypeMap"


    // $ANTLR start "ruleTypeMap"
    // InternalAndroidGeneratorParser.g:466:1: ruleTypeMap : ( ( rule__TypeMap__Group__0 ) ) ;
    public final void ruleTypeMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:470:2: ( ( ( rule__TypeMap__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:471:2: ( ( rule__TypeMap__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:471:2: ( ( rule__TypeMap__Group__0 ) )
            // InternalAndroidGeneratorParser.g:472:3: ( rule__TypeMap__Group__0 )
            {
             before(grammarAccess.getTypeMapAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:473:3: ( rule__TypeMap__Group__0 )
            // InternalAndroidGeneratorParser.g:473:4: rule__TypeMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeMap"


    // $ANTLR start "entryRuleTypeSetting"
    // InternalAndroidGeneratorParser.g:482:1: entryRuleTypeSetting : ruleTypeSetting EOF ;
    public final void entryRuleTypeSetting() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:483:1: ( ruleTypeSetting EOF )
            // InternalAndroidGeneratorParser.g:484:1: ruleTypeSetting EOF
            {
             before(grammarAccess.getTypeSettingRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeSetting();

            state._fsp--;

             after(grammarAccess.getTypeSettingRule()); 
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
    // $ANTLR end "entryRuleTypeSetting"


    // $ANTLR start "ruleTypeSetting"
    // InternalAndroidGeneratorParser.g:491:1: ruleTypeSetting : ( ( rule__TypeSetting__Group__0 ) ) ;
    public final void ruleTypeSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:495:2: ( ( ( rule__TypeSetting__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:496:2: ( ( rule__TypeSetting__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:496:2: ( ( rule__TypeSetting__Group__0 ) )
            // InternalAndroidGeneratorParser.g:497:3: ( rule__TypeSetting__Group__0 )
            {
             before(grammarAccess.getTypeSettingAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:498:3: ( rule__TypeSetting__Group__0 )
            // InternalAndroidGeneratorParser.g:498:4: rule__TypeSetting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeSetting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeSettingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeSetting"


    // $ANTLR start "entryRuleFragmentTypeAttributes"
    // InternalAndroidGeneratorParser.g:507:1: entryRuleFragmentTypeAttributes : ruleFragmentTypeAttributes EOF ;
    public final void entryRuleFragmentTypeAttributes() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:508:1: ( ruleFragmentTypeAttributes EOF )
            // InternalAndroidGeneratorParser.g:509:1: ruleFragmentTypeAttributes EOF
            {
             before(grammarAccess.getFragmentTypeAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleFragmentTypeAttributes();

            state._fsp--;

             after(grammarAccess.getFragmentTypeAttributesRule()); 
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
    // $ANTLR end "entryRuleFragmentTypeAttributes"


    // $ANTLR start "ruleFragmentTypeAttributes"
    // InternalAndroidGeneratorParser.g:516:1: ruleFragmentTypeAttributes : ( ( rule__FragmentTypeAttributes__FilterAssignment ) ) ;
    public final void ruleFragmentTypeAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:520:2: ( ( ( rule__FragmentTypeAttributes__FilterAssignment ) ) )
            // InternalAndroidGeneratorParser.g:521:2: ( ( rule__FragmentTypeAttributes__FilterAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:521:2: ( ( rule__FragmentTypeAttributes__FilterAssignment ) )
            // InternalAndroidGeneratorParser.g:522:3: ( rule__FragmentTypeAttributes__FilterAssignment )
            {
             before(grammarAccess.getFragmentTypeAttributesAccess().getFilterAssignment()); 
            // InternalAndroidGeneratorParser.g:523:3: ( rule__FragmentTypeAttributes__FilterAssignment )
            // InternalAndroidGeneratorParser.g:523:4: rule__FragmentTypeAttributes__FilterAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FragmentTypeAttributes__FilterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFragmentTypeAttributesAccess().getFilterAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragmentTypeAttributes"


    // $ANTLR start "entryRuleEditText"
    // InternalAndroidGeneratorParser.g:532:1: entryRuleEditText : ruleEditText EOF ;
    public final void entryRuleEditText() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:533:1: ( ruleEditText EOF )
            // InternalAndroidGeneratorParser.g:534:1: ruleEditText EOF
            {
             before(grammarAccess.getEditTextRule()); 
            pushFollow(FOLLOW_1);
            ruleEditText();

            state._fsp--;

             after(grammarAccess.getEditTextRule()); 
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
    // $ANTLR end "entryRuleEditText"


    // $ANTLR start "ruleEditText"
    // InternalAndroidGeneratorParser.g:541:1: ruleEditText : ( ( rule__EditText__Group__0 ) ) ;
    public final void ruleEditText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:545:2: ( ( ( rule__EditText__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:546:2: ( ( rule__EditText__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:546:2: ( ( rule__EditText__Group__0 ) )
            // InternalAndroidGeneratorParser.g:547:3: ( rule__EditText__Group__0 )
            {
             before(grammarAccess.getEditTextAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:548:3: ( rule__EditText__Group__0 )
            // InternalAndroidGeneratorParser.g:548:4: rule__EditText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EditText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEditText"


    // $ANTLR start "entryRuleSpinner"
    // InternalAndroidGeneratorParser.g:557:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:558:1: ( ruleSpinner EOF )
            // InternalAndroidGeneratorParser.g:559:1: ruleSpinner EOF
            {
             before(grammarAccess.getSpinnerRule()); 
            pushFollow(FOLLOW_1);
            ruleSpinner();

            state._fsp--;

             after(grammarAccess.getSpinnerRule()); 
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
    // $ANTLR end "entryRuleSpinner"


    // $ANTLR start "ruleSpinner"
    // InternalAndroidGeneratorParser.g:566:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:570:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:571:2: ( ( rule__Spinner__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:571:2: ( ( rule__Spinner__Group__0 ) )
            // InternalAndroidGeneratorParser.g:572:3: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:573:3: ( rule__Spinner__Group__0 )
            // InternalAndroidGeneratorParser.g:573:4: rule__Spinner__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpinner"


    // $ANTLR start "entryRuleSpinnerCon"
    // InternalAndroidGeneratorParser.g:582:1: entryRuleSpinnerCon : ruleSpinnerCon EOF ;
    public final void entryRuleSpinnerCon() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:583:1: ( ruleSpinnerCon EOF )
            // InternalAndroidGeneratorParser.g:584:1: ruleSpinnerCon EOF
            {
             before(grammarAccess.getSpinnerConRule()); 
            pushFollow(FOLLOW_1);
            ruleSpinnerCon();

            state._fsp--;

             after(grammarAccess.getSpinnerConRule()); 
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
    // $ANTLR end "entryRuleSpinnerCon"


    // $ANTLR start "ruleSpinnerCon"
    // InternalAndroidGeneratorParser.g:591:1: ruleSpinnerCon : ( ( rule__SpinnerCon__TextAssignment ) ) ;
    public final void ruleSpinnerCon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:595:2: ( ( ( rule__SpinnerCon__TextAssignment ) ) )
            // InternalAndroidGeneratorParser.g:596:2: ( ( rule__SpinnerCon__TextAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:596:2: ( ( rule__SpinnerCon__TextAssignment ) )
            // InternalAndroidGeneratorParser.g:597:3: ( rule__SpinnerCon__TextAssignment )
            {
             before(grammarAccess.getSpinnerConAccess().getTextAssignment()); 
            // InternalAndroidGeneratorParser.g:598:3: ( rule__SpinnerCon__TextAssignment )
            // InternalAndroidGeneratorParser.g:598:4: rule__SpinnerCon__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SpinnerCon__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerConAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpinnerCon"


    // $ANTLR start "entryRuleTextView"
    // InternalAndroidGeneratorParser.g:607:1: entryRuleTextView : ruleTextView EOF ;
    public final void entryRuleTextView() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:608:1: ( ruleTextView EOF )
            // InternalAndroidGeneratorParser.g:609:1: ruleTextView EOF
            {
             before(grammarAccess.getTextViewRule()); 
            pushFollow(FOLLOW_1);
            ruleTextView();

            state._fsp--;

             after(grammarAccess.getTextViewRule()); 
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
    // $ANTLR end "entryRuleTextView"


    // $ANTLR start "ruleTextView"
    // InternalAndroidGeneratorParser.g:616:1: ruleTextView : ( ( rule__TextView__Group__0 ) ) ;
    public final void ruleTextView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:620:2: ( ( ( rule__TextView__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:621:2: ( ( rule__TextView__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:621:2: ( ( rule__TextView__Group__0 ) )
            // InternalAndroidGeneratorParser.g:622:3: ( rule__TextView__Group__0 )
            {
             before(grammarAccess.getTextViewAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:623:3: ( rule__TextView__Group__0 )
            // InternalAndroidGeneratorParser.g:623:4: rule__TextView__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextView"


    // $ANTLR start "entryRuleButton"
    // InternalAndroidGeneratorParser.g:632:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:633:1: ( ruleButton EOF )
            // InternalAndroidGeneratorParser.g:634:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalAndroidGeneratorParser.g:641:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:645:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:646:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:646:2: ( ( rule__Button__Group__0 ) )
            // InternalAndroidGeneratorParser.g:647:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:648:3: ( rule__Button__Group__0 )
            // InternalAndroidGeneratorParser.g:648:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonActions"
    // InternalAndroidGeneratorParser.g:657:1: entryRuleButtonActions : ruleButtonActions EOF ;
    public final void entryRuleButtonActions() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:658:1: ( ruleButtonActions EOF )
            // InternalAndroidGeneratorParser.g:659:1: ruleButtonActions EOF
            {
             before(grammarAccess.getButtonActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleButtonActions();

            state._fsp--;

             after(grammarAccess.getButtonActionsRule()); 
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
    // $ANTLR end "entryRuleButtonActions"


    // $ANTLR start "ruleButtonActions"
    // InternalAndroidGeneratorParser.g:666:1: ruleButtonActions : ( ( rule__ButtonActions__Alternatives ) ) ;
    public final void ruleButtonActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:670:2: ( ( ( rule__ButtonActions__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:671:2: ( ( rule__ButtonActions__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:671:2: ( ( rule__ButtonActions__Alternatives ) )
            // InternalAndroidGeneratorParser.g:672:3: ( rule__ButtonActions__Alternatives )
            {
             before(grammarAccess.getButtonActionsAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:673:3: ( rule__ButtonActions__Alternatives )
            // InternalAndroidGeneratorParser.g:673:4: rule__ButtonActions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ButtonActions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getButtonActionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonActions"


    // $ANTLR start "entryRuleToast"
    // InternalAndroidGeneratorParser.g:682:1: entryRuleToast : ruleToast EOF ;
    public final void entryRuleToast() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:683:1: ( ruleToast EOF )
            // InternalAndroidGeneratorParser.g:684:1: ruleToast EOF
            {
             before(grammarAccess.getToastRule()); 
            pushFollow(FOLLOW_1);
            ruleToast();

            state._fsp--;

             after(grammarAccess.getToastRule()); 
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
    // $ANTLR end "entryRuleToast"


    // $ANTLR start "ruleToast"
    // InternalAndroidGeneratorParser.g:691:1: ruleToast : ( ( rule__Toast__Group__0 ) ) ;
    public final void ruleToast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:695:2: ( ( ( rule__Toast__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:696:2: ( ( rule__Toast__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:696:2: ( ( rule__Toast__Group__0 ) )
            // InternalAndroidGeneratorParser.g:697:3: ( rule__Toast__Group__0 )
            {
             before(grammarAccess.getToastAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:698:3: ( rule__Toast__Group__0 )
            // InternalAndroidGeneratorParser.g:698:4: rule__Toast__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Toast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToastAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToast"


    // $ANTLR start "entryRuleBundle"
    // InternalAndroidGeneratorParser.g:707:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:708:1: ( ruleBundle EOF )
            // InternalAndroidGeneratorParser.g:709:1: ruleBundle EOF
            {
             before(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_1);
            ruleBundle();

            state._fsp--;

             after(grammarAccess.getBundleRule()); 
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
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // InternalAndroidGeneratorParser.g:716:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:720:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:721:2: ( ( rule__Bundle__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:721:2: ( ( rule__Bundle__Group__0 ) )
            // InternalAndroidGeneratorParser.g:722:3: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:723:3: ( rule__Bundle__Group__0 )
            // InternalAndroidGeneratorParser.g:723:4: rule__Bundle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBundleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleHolder"
    // InternalAndroidGeneratorParser.g:732:1: entryRuleHolder : ruleHolder EOF ;
    public final void entryRuleHolder() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:733:1: ( ruleHolder EOF )
            // InternalAndroidGeneratorParser.g:734:1: ruleHolder EOF
            {
             before(grammarAccess.getHolderRule()); 
            pushFollow(FOLLOW_1);
            ruleHolder();

            state._fsp--;

             after(grammarAccess.getHolderRule()); 
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
    // $ANTLR end "entryRuleHolder"


    // $ANTLR start "ruleHolder"
    // InternalAndroidGeneratorParser.g:741:1: ruleHolder : ( ( rule__Holder__Group__0 ) ) ;
    public final void ruleHolder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:745:2: ( ( ( rule__Holder__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:746:2: ( ( rule__Holder__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:746:2: ( ( rule__Holder__Group__0 ) )
            // InternalAndroidGeneratorParser.g:747:3: ( rule__Holder__Group__0 )
            {
             before(grammarAccess.getHolderAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:748:3: ( rule__Holder__Group__0 )
            // InternalAndroidGeneratorParser.g:748:4: rule__Holder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Holder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHolderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHolder"


    // $ANTLR start "entryRuleFilterQuery"
    // InternalAndroidGeneratorParser.g:757:1: entryRuleFilterQuery : ruleFilterQuery EOF ;
    public final void entryRuleFilterQuery() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:758:1: ( ruleFilterQuery EOF )
            // InternalAndroidGeneratorParser.g:759:1: ruleFilterQuery EOF
            {
             before(grammarAccess.getFilterQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterQuery();

            state._fsp--;

             after(grammarAccess.getFilterQueryRule()); 
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
    // $ANTLR end "entryRuleFilterQuery"


    // $ANTLR start "ruleFilterQuery"
    // InternalAndroidGeneratorParser.g:766:1: ruleFilterQuery : ( ( rule__FilterQuery__Group__0 ) ) ;
    public final void ruleFilterQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:770:2: ( ( ( rule__FilterQuery__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:771:2: ( ( rule__FilterQuery__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:771:2: ( ( rule__FilterQuery__Group__0 ) )
            // InternalAndroidGeneratorParser.g:772:3: ( rule__FilterQuery__Group__0 )
            {
             before(grammarAccess.getFilterQueryAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:773:3: ( rule__FilterQuery__Group__0 )
            // InternalAndroidGeneratorParser.g:773:4: rule__FilterQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterQuery"


    // $ANTLR start "entryRuleFilterAttributes"
    // InternalAndroidGeneratorParser.g:782:1: entryRuleFilterAttributes : ruleFilterAttributes EOF ;
    public final void entryRuleFilterAttributes() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:783:1: ( ruleFilterAttributes EOF )
            // InternalAndroidGeneratorParser.g:784:1: ruleFilterAttributes EOF
            {
             before(grammarAccess.getFilterAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterAttributes();

            state._fsp--;

             after(grammarAccess.getFilterAttributesRule()); 
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
    // $ANTLR end "entryRuleFilterAttributes"


    // $ANTLR start "ruleFilterAttributes"
    // InternalAndroidGeneratorParser.g:791:1: ruleFilterAttributes : ( ( rule__FilterAttributes__DistanceAssignment ) ) ;
    public final void ruleFilterAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:795:2: ( ( ( rule__FilterAttributes__DistanceAssignment ) ) )
            // InternalAndroidGeneratorParser.g:796:2: ( ( rule__FilterAttributes__DistanceAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:796:2: ( ( rule__FilterAttributes__DistanceAssignment ) )
            // InternalAndroidGeneratorParser.g:797:3: ( rule__FilterAttributes__DistanceAssignment )
            {
             before(grammarAccess.getFilterAttributesAccess().getDistanceAssignment()); 
            // InternalAndroidGeneratorParser.g:798:3: ( rule__FilterAttributes__DistanceAssignment )
            // InternalAndroidGeneratorParser.g:798:4: rule__FilterAttributes__DistanceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FilterAttributes__DistanceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFilterAttributesAccess().getDistanceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterAttributes"


    // $ANTLR start "entryRuleDistance"
    // InternalAndroidGeneratorParser.g:807:1: entryRuleDistance : ruleDistance EOF ;
    public final void entryRuleDistance() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:808:1: ( ruleDistance EOF )
            // InternalAndroidGeneratorParser.g:809:1: ruleDistance EOF
            {
             before(grammarAccess.getDistanceRule()); 
            pushFollow(FOLLOW_1);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getDistanceRule()); 
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
    // $ANTLR end "entryRuleDistance"


    // $ANTLR start "ruleDistance"
    // InternalAndroidGeneratorParser.g:816:1: ruleDistance : ( ( rule__Distance__Group__0 ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:820:2: ( ( ( rule__Distance__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:821:2: ( ( rule__Distance__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:821:2: ( ( rule__Distance__Group__0 ) )
            // InternalAndroidGeneratorParser.g:822:3: ( rule__Distance__Group__0 )
            {
             before(grammarAccess.getDistanceAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:823:3: ( rule__Distance__Group__0 )
            // InternalAndroidGeneratorParser.g:823:4: rule__Distance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Distance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistance"


    // $ANTLR start "entryRuleNumber"
    // InternalAndroidGeneratorParser.g:832:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:833:1: ( ruleNumber EOF )
            // InternalAndroidGeneratorParser.g:834:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalAndroidGeneratorParser.g:841:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:845:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalAndroidGeneratorParser.g:846:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:846:2: ( ( rule__Number__ValueAssignment ) )
            // InternalAndroidGeneratorParser.g:847:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalAndroidGeneratorParser.g:848:3: ( rule__Number__ValueAssignment )
            // InternalAndroidGeneratorParser.g:848:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleOperator"
    // InternalAndroidGeneratorParser.g:857:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:858:1: ( ruleOperator EOF )
            // InternalAndroidGeneratorParser.g:859:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalAndroidGeneratorParser.g:866:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:870:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:871:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:871:2: ( ( rule__Operator__Alternatives ) )
            // InternalAndroidGeneratorParser.g:872:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:873:3: ( rule__Operator__Alternatives )
            // InternalAndroidGeneratorParser.g:873:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleUnit"
    // InternalAndroidGeneratorParser.g:882:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:883:1: ( ruleUnit EOF )
            // InternalAndroidGeneratorParser.g:884:1: ruleUnit EOF
            {
             before(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getUnitRule()); 
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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalAndroidGeneratorParser.g:891:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:895:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:896:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:896:2: ( ( rule__Unit__Alternatives ) )
            // InternalAndroidGeneratorParser.g:897:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:898:3: ( rule__Unit__Alternatives )
            // InternalAndroidGeneratorParser.g:898:4: rule__Unit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "rule__ApplicationAttribute__Alternatives"
    // InternalAndroidGeneratorParser.g:906:1: rule__ApplicationAttribute__Alternatives : ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:910:1: ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_BEGIN:
                {
                alt2=1;
                }
                break;
            case Permissions:
                {
                alt2=2;
                }
                break;
            case Elements:
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
                    // InternalAndroidGeneratorParser.g:911:2: ( ruleApplicationVersion )
                    {
                    // InternalAndroidGeneratorParser.g:911:2: ( ruleApplicationVersion )
                    // InternalAndroidGeneratorParser.g:912:3: ruleApplicationVersion
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationVersionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicationVersion();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationVersionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:917:2: ( ruleApplicationPermissionList )
                    {
                    // InternalAndroidGeneratorParser.g:917:2: ( ruleApplicationPermissionList )
                    // InternalAndroidGeneratorParser.g:918:3: ruleApplicationPermissionList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicationPermissionList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGeneratorParser.g:923:2: ( ruleApplicationElementList )
                    {
                    // InternalAndroidGeneratorParser.g:923:2: ( ruleApplicationElementList )
                    // InternalAndroidGeneratorParser.g:924:3: ruleApplicationElementList
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicationElementList();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_2()); 

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
    // $ANTLR end "rule__ApplicationAttribute__Alternatives"


    // $ANTLR start "rule__ApplicationElement__Alternatives"
    // InternalAndroidGeneratorParser.g:933:1: rule__ApplicationElement__Alternatives : ( ( ruleFragment ) | ( ruleModel ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:937:1: ( ( ruleFragment ) | ( ruleModel ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Fragment) ) {
                alt3=1;
            }
            else if ( (LA3_0==Model) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:938:2: ( ruleFragment )
                    {
                    // InternalAndroidGeneratorParser.g:938:2: ( ruleFragment )
                    // InternalAndroidGeneratorParser.g:939:3: ruleFragment
                    {
                     before(grammarAccess.getApplicationElementAccess().getFragmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFragment();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getFragmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:944:2: ( ruleModel )
                    {
                    // InternalAndroidGeneratorParser.g:944:2: ( ruleModel )
                    // InternalAndroidGeneratorParser.g:945:3: ruleModel
                    {
                     before(grammarAccess.getApplicationElementAccess().getModelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModel();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getModelParserRuleCall_1()); 

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
    // $ANTLR end "rule__ApplicationElement__Alternatives"


    // $ANTLR start "rule__LayoutElement__Alternatives"
    // InternalAndroidGeneratorParser.g:954:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleDataholders ) | ( ruleTypeMap ) | ( ruleTypeSetting ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:958:1: ( ( ruleButton ) | ( ruleDataholders ) | ( ruleTypeMap ) | ( ruleTypeSetting ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case Button:
                {
                alt4=1;
                }
                break;
            case EditText:
            case Textview:
            case Spinner:
                {
                alt4=2;
                }
                break;
            case Map:
                {
                alt4=3;
                }
                break;
            case Settings:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:959:2: ( ruleButton )
                    {
                    // InternalAndroidGeneratorParser.g:959:2: ( ruleButton )
                    // InternalAndroidGeneratorParser.g:960:3: ruleButton
                    {
                     before(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:965:2: ( ruleDataholders )
                    {
                    // InternalAndroidGeneratorParser.g:965:2: ( ruleDataholders )
                    // InternalAndroidGeneratorParser.g:966:3: ruleDataholders
                    {
                     before(grammarAccess.getLayoutElementAccess().getDataholdersParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataholders();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getDataholdersParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGeneratorParser.g:971:2: ( ruleTypeMap )
                    {
                    // InternalAndroidGeneratorParser.g:971:2: ( ruleTypeMap )
                    // InternalAndroidGeneratorParser.g:972:3: ruleTypeMap
                    {
                     before(grammarAccess.getLayoutElementAccess().getTypeMapParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeMap();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getTypeMapParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAndroidGeneratorParser.g:977:2: ( ruleTypeSetting )
                    {
                    // InternalAndroidGeneratorParser.g:977:2: ( ruleTypeSetting )
                    // InternalAndroidGeneratorParser.g:978:3: ruleTypeSetting
                    {
                     before(grammarAccess.getLayoutElementAccess().getTypeSettingParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeSetting();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getTypeSettingParserRuleCall_3()); 

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
    // $ANTLR end "rule__LayoutElement__Alternatives"


    // $ANTLR start "rule__Dataholders__Alternatives"
    // InternalAndroidGeneratorParser.g:987:1: rule__Dataholders__Alternatives : ( ( ruleEditText ) | ( ruleSpinner ) | ( ruleTextView ) );
    public final void rule__Dataholders__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:991:1: ( ( ruleEditText ) | ( ruleSpinner ) | ( ruleTextView ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case EditText:
                {
                alt5=1;
                }
                break;
            case Spinner:
                {
                alt5=2;
                }
                break;
            case Textview:
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
                    // InternalAndroidGeneratorParser.g:992:2: ( ruleEditText )
                    {
                    // InternalAndroidGeneratorParser.g:992:2: ( ruleEditText )
                    // InternalAndroidGeneratorParser.g:993:3: ruleEditText
                    {
                     before(grammarAccess.getDataholdersAccess().getEditTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEditText();

                    state._fsp--;

                     after(grammarAccess.getDataholdersAccess().getEditTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:998:2: ( ruleSpinner )
                    {
                    // InternalAndroidGeneratorParser.g:998:2: ( ruleSpinner )
                    // InternalAndroidGeneratorParser.g:999:3: ruleSpinner
                    {
                     before(grammarAccess.getDataholdersAccess().getSpinnerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpinner();

                    state._fsp--;

                     after(grammarAccess.getDataholdersAccess().getSpinnerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGeneratorParser.g:1004:2: ( ruleTextView )
                    {
                    // InternalAndroidGeneratorParser.g:1004:2: ( ruleTextView )
                    // InternalAndroidGeneratorParser.g:1005:3: ruleTextView
                    {
                     before(grammarAccess.getDataholdersAccess().getTextViewParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTextView();

                    state._fsp--;

                     after(grammarAccess.getDataholdersAccess().getTextViewParserRuleCall_2()); 

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
    // $ANTLR end "rule__Dataholders__Alternatives"


    // $ANTLR start "rule__ButtonActions__Alternatives"
    // InternalAndroidGeneratorParser.g:1014:1: rule__ButtonActions__Alternatives : ( ( ruleToast ) | ( ruleBundle ) );
    public final void rule__ButtonActions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1018:1: ( ( ruleToast ) | ( ruleBundle ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Toast) ) {
                alt6=1;
            }
            else if ( (LA6_0==Bundle) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1019:2: ( ruleToast )
                    {
                    // InternalAndroidGeneratorParser.g:1019:2: ( ruleToast )
                    // InternalAndroidGeneratorParser.g:1020:3: ruleToast
                    {
                     before(grammarAccess.getButtonActionsAccess().getToastParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleToast();

                    state._fsp--;

                     after(grammarAccess.getButtonActionsAccess().getToastParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:1025:2: ( ruleBundle )
                    {
                    // InternalAndroidGeneratorParser.g:1025:2: ( ruleBundle )
                    // InternalAndroidGeneratorParser.g:1026:3: ruleBundle
                    {
                     before(grammarAccess.getButtonActionsAccess().getBundleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBundle();

                    state._fsp--;

                     after(grammarAccess.getButtonActionsAccess().getBundleParserRuleCall_1()); 

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
    // $ANTLR end "rule__ButtonActions__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalAndroidGeneratorParser.g:1035:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1039:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case GreaterThanSign:
                {
                alt7=1;
                }
                break;
            case LessThanSign:
                {
                alt7=2;
                }
                break;
            case EqualsSign:
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
                    // InternalAndroidGeneratorParser.g:1040:2: ( ( rule__Operator__Group_0__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1040:2: ( ( rule__Operator__Group_0__0 ) )
                    // InternalAndroidGeneratorParser.g:1041:3: ( rule__Operator__Group_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_0()); 
                    // InternalAndroidGeneratorParser.g:1042:3: ( rule__Operator__Group_0__0 )
                    // InternalAndroidGeneratorParser.g:1042:4: rule__Operator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:1046:2: ( ( rule__Operator__Group_1__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1046:2: ( ( rule__Operator__Group_1__0 ) )
                    // InternalAndroidGeneratorParser.g:1047:3: ( rule__Operator__Group_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_1()); 
                    // InternalAndroidGeneratorParser.g:1048:3: ( rule__Operator__Group_1__0 )
                    // InternalAndroidGeneratorParser.g:1048:4: rule__Operator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGeneratorParser.g:1052:2: ( ( rule__Operator__Group_2__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1052:2: ( ( rule__Operator__Group_2__0 ) )
                    // InternalAndroidGeneratorParser.g:1053:3: ( rule__Operator__Group_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_2()); 
                    // InternalAndroidGeneratorParser.g:1054:3: ( rule__Operator__Group_2__0 )
                    // InternalAndroidGeneratorParser.g:1054:4: rule__Operator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatorAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Unit__Alternatives"
    // InternalAndroidGeneratorParser.g:1062:1: rule__Unit__Alternatives : ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1066:1: ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==M) ) {
                alt8=1;
            }
            else if ( (LA8_0==F) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1067:2: ( ( rule__Unit__Group_0__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1067:2: ( ( rule__Unit__Group_0__0 ) )
                    // InternalAndroidGeneratorParser.g:1068:3: ( rule__Unit__Group_0__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_0()); 
                    // InternalAndroidGeneratorParser.g:1069:3: ( rule__Unit__Group_0__0 )
                    // InternalAndroidGeneratorParser.g:1069:4: rule__Unit__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unit__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnitAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGeneratorParser.g:1073:2: ( ( rule__Unit__Group_1__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1073:2: ( ( rule__Unit__Group_1__0 ) )
                    // InternalAndroidGeneratorParser.g:1074:3: ( rule__Unit__Group_1__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_1()); 
                    // InternalAndroidGeneratorParser.g:1075:3: ( rule__Unit__Group_1__0 )
                    // InternalAndroidGeneratorParser.g:1075:4: rule__Unit__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unit__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnitAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Unit__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // InternalAndroidGeneratorParser.g:1083:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1087:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalAndroidGeneratorParser.g:1088:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:1095:1: rule__Application__Group__0__Impl : ( App ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1099:1: ( ( App ) )
            // InternalAndroidGeneratorParser.g:1100:1: ( App )
            {
            // InternalAndroidGeneratorParser.g:1100:1: ( App )
            // InternalAndroidGeneratorParser.g:1101:2: App
            {
             before(grammarAccess.getApplicationAccess().getAppKeyword_0()); 
            match(input,App,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getAppKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalAndroidGeneratorParser.g:1110:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1114:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalAndroidGeneratorParser.g:1115:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:1122:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1126:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:1127:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1127:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:1128:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:1129:2: ( rule__Application__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:1129:3: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalAndroidGeneratorParser.g:1137:1: rule__Application__Group__2 : rule__Application__Group__2__Impl ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1141:1: ( rule__Application__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:1142:2: rule__Application__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:1148:1: rule__Application__Group__2__Impl : ( ( rule__Application__AttributesAssignment_2 )* ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1152:1: ( ( ( rule__Application__AttributesAssignment_2 )* ) )
            // InternalAndroidGeneratorParser.g:1153:1: ( ( rule__Application__AttributesAssignment_2 )* )
            {
            // InternalAndroidGeneratorParser.g:1153:1: ( ( rule__Application__AttributesAssignment_2 )* )
            // InternalAndroidGeneratorParser.g:1154:2: ( rule__Application__AttributesAssignment_2 )*
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_2()); 
            // InternalAndroidGeneratorParser.g:1155:2: ( rule__Application__AttributesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Permissions||LA9_0==Elements||LA9_0==RULE_BEGIN) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:1155:3: rule__Application__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Application__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__ApplicationVersion__Group__0"
    // InternalAndroidGeneratorParser.g:1164:1: rule__ApplicationVersion__Group__0 : rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 ;
    public final void rule__ApplicationVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1168:1: ( rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 )
            // InternalAndroidGeneratorParser.g:1169:2: rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ApplicationVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__0"


    // $ANTLR start "rule__ApplicationVersion__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:1176:1: rule__ApplicationVersion__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1180:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1181:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1181:1: ( () )
            // InternalAndroidGeneratorParser.g:1182:2: ()
            {
             before(grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0()); 
            // InternalAndroidGeneratorParser.g:1183:2: ()
            // InternalAndroidGeneratorParser.g:1183:3: 
            {
            }

             after(grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__0__Impl"


    // $ANTLR start "rule__ApplicationVersion__Group__1"
    // InternalAndroidGeneratorParser.g:1191:1: rule__ApplicationVersion__Group__1 : rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 ;
    public final void rule__ApplicationVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1195:1: ( rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 )
            // InternalAndroidGeneratorParser.g:1196:2: rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ApplicationVersion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__1"


    // $ANTLR start "rule__ApplicationVersion__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:1203:1: rule__ApplicationVersion__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__ApplicationVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1207:1: ( ( RULE_BEGIN ) )
            // InternalAndroidGeneratorParser.g:1208:1: ( RULE_BEGIN )
            {
            // InternalAndroidGeneratorParser.g:1208:1: ( RULE_BEGIN )
            // InternalAndroidGeneratorParser.g:1209:2: RULE_BEGIN
            {
             before(grammarAccess.getApplicationVersionAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getApplicationVersionAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__1__Impl"


    // $ANTLR start "rule__ApplicationVersion__Group__2"
    // InternalAndroidGeneratorParser.g:1218:1: rule__ApplicationVersion__Group__2 : rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 ;
    public final void rule__ApplicationVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1222:1: ( rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 )
            // InternalAndroidGeneratorParser.g:1223:2: rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ApplicationVersion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__2"


    // $ANTLR start "rule__ApplicationVersion__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:1230:1: rule__ApplicationVersion__Group__2__Impl : ( AndroidSDK ) ;
    public final void rule__ApplicationVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1234:1: ( ( AndroidSDK ) )
            // InternalAndroidGeneratorParser.g:1235:1: ( AndroidSDK )
            {
            // InternalAndroidGeneratorParser.g:1235:1: ( AndroidSDK )
            // InternalAndroidGeneratorParser.g:1236:2: AndroidSDK
            {
             before(grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_2()); 
            match(input,AndroidSDK,FOLLOW_2); 
             after(grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__2__Impl"


    // $ANTLR start "rule__ApplicationVersion__Group__3"
    // InternalAndroidGeneratorParser.g:1245:1: rule__ApplicationVersion__Group__3 : rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 ;
    public final void rule__ApplicationVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1249:1: ( rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 )
            // InternalAndroidGeneratorParser.g:1250:2: rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ApplicationVersion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__3"


    // $ANTLR start "rule__ApplicationVersion__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:1257:1: rule__ApplicationVersion__Group__3__Impl : ( Colon ) ;
    public final void rule__ApplicationVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1261:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:1262:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:1262:1: ( Colon )
            // InternalAndroidGeneratorParser.g:1263:2: Colon
            {
             before(grammarAccess.getApplicationVersionAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getApplicationVersionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__3__Impl"


    // $ANTLR start "rule__ApplicationVersion__Group__4"
    // InternalAndroidGeneratorParser.g:1272:1: rule__ApplicationVersion__Group__4 : rule__ApplicationVersion__Group__4__Impl rule__ApplicationVersion__Group__5 ;
    public final void rule__ApplicationVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1276:1: ( rule__ApplicationVersion__Group__4__Impl rule__ApplicationVersion__Group__5 )
            // InternalAndroidGeneratorParser.g:1277:2: rule__ApplicationVersion__Group__4__Impl rule__ApplicationVersion__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ApplicationVersion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__4"


    // $ANTLR start "rule__ApplicationVersion__Group__4__Impl"
    // InternalAndroidGeneratorParser.g:1284:1: rule__ApplicationVersion__Group__4__Impl : ( ( rule__ApplicationVersion__ResultAssignment_4 ) ) ;
    public final void rule__ApplicationVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1288:1: ( ( ( rule__ApplicationVersion__ResultAssignment_4 ) ) )
            // InternalAndroidGeneratorParser.g:1289:1: ( ( rule__ApplicationVersion__ResultAssignment_4 ) )
            {
            // InternalAndroidGeneratorParser.g:1289:1: ( ( rule__ApplicationVersion__ResultAssignment_4 ) )
            // InternalAndroidGeneratorParser.g:1290:2: ( rule__ApplicationVersion__ResultAssignment_4 )
            {
             before(grammarAccess.getApplicationVersionAccess().getResultAssignment_4()); 
            // InternalAndroidGeneratorParser.g:1291:2: ( rule__ApplicationVersion__ResultAssignment_4 )
            // InternalAndroidGeneratorParser.g:1291:3: rule__ApplicationVersion__ResultAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__ResultAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getApplicationVersionAccess().getResultAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__4__Impl"


    // $ANTLR start "rule__ApplicationVersion__Group__5"
    // InternalAndroidGeneratorParser.g:1299:1: rule__ApplicationVersion__Group__5 : rule__ApplicationVersion__Group__5__Impl rule__ApplicationVersion__Group__6 ;
    public final void rule__ApplicationVersion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1303:1: ( rule__ApplicationVersion__Group__5__Impl rule__ApplicationVersion__Group__6 )
            // InternalAndroidGeneratorParser.g:1304:2: rule__ApplicationVersion__Group__5__Impl rule__ApplicationVersion__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ApplicationVersion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__5"


    // $ANTLR start "rule__ApplicationVersion__Group__5__Impl"
    // InternalAndroidGeneratorParser.g:1311:1: rule__ApplicationVersion__Group__5__Impl : ( ( rule__ApplicationVersion__TargetsdkAssignment_5 )? ) ;
    public final void rule__ApplicationVersion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1315:1: ( ( ( rule__ApplicationVersion__TargetsdkAssignment_5 )? ) )
            // InternalAndroidGeneratorParser.g:1316:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_5 )? )
            {
            // InternalAndroidGeneratorParser.g:1316:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_5 )? )
            // InternalAndroidGeneratorParser.g:1317:2: ( rule__ApplicationVersion__TargetsdkAssignment_5 )?
            {
             before(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_5()); 
            // InternalAndroidGeneratorParser.g:1318:2: ( rule__ApplicationVersion__TargetsdkAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TargetSDK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1318:3: rule__ApplicationVersion__TargetsdkAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationVersion__TargetsdkAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__5__Impl"


    // $ANTLR start "rule__ApplicationVersion__Group__6"
    // InternalAndroidGeneratorParser.g:1326:1: rule__ApplicationVersion__Group__6 : rule__ApplicationVersion__Group__6__Impl ;
    public final void rule__ApplicationVersion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1330:1: ( rule__ApplicationVersion__Group__6__Impl )
            // InternalAndroidGeneratorParser.g:1331:2: rule__ApplicationVersion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__6"


    // $ANTLR start "rule__ApplicationVersion__Group__6__Impl"
    // InternalAndroidGeneratorParser.g:1337:1: rule__ApplicationVersion__Group__6__Impl : ( RULE_END ) ;
    public final void rule__ApplicationVersion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1341:1: ( ( RULE_END ) )
            // InternalAndroidGeneratorParser.g:1342:1: ( RULE_END )
            {
            // InternalAndroidGeneratorParser.g:1342:1: ( RULE_END )
            // InternalAndroidGeneratorParser.g:1343:2: RULE_END
            {
             before(grammarAccess.getApplicationVersionAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getApplicationVersionAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__Group__6__Impl"


    // $ANTLR start "rule__TargetSDK__Group__0"
    // InternalAndroidGeneratorParser.g:1353:1: rule__TargetSDK__Group__0 : rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 ;
    public final void rule__TargetSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1357:1: ( rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 )
            // InternalAndroidGeneratorParser.g:1358:2: rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__TargetSDK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetSDK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__0"


    // $ANTLR start "rule__TargetSDK__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:1365:1: rule__TargetSDK__Group__0__Impl : ( () ) ;
    public final void rule__TargetSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1369:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1370:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1370:1: ( () )
            // InternalAndroidGeneratorParser.g:1371:2: ()
            {
             before(grammarAccess.getTargetSDKAccess().getTargetSDKAction_0()); 
            // InternalAndroidGeneratorParser.g:1372:2: ()
            // InternalAndroidGeneratorParser.g:1372:3: 
            {
            }

             after(grammarAccess.getTargetSDKAccess().getTargetSDKAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__0__Impl"


    // $ANTLR start "rule__TargetSDK__Group__1"
    // InternalAndroidGeneratorParser.g:1380:1: rule__TargetSDK__Group__1 : rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 ;
    public final void rule__TargetSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1384:1: ( rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 )
            // InternalAndroidGeneratorParser.g:1385:2: rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TargetSDK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetSDK__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__1"


    // $ANTLR start "rule__TargetSDK__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:1392:1: rule__TargetSDK__Group__1__Impl : ( TargetSDK ) ;
    public final void rule__TargetSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1396:1: ( ( TargetSDK ) )
            // InternalAndroidGeneratorParser.g:1397:1: ( TargetSDK )
            {
            // InternalAndroidGeneratorParser.g:1397:1: ( TargetSDK )
            // InternalAndroidGeneratorParser.g:1398:2: TargetSDK
            {
             before(grammarAccess.getTargetSDKAccess().getTargetSDKKeyword_1()); 
            match(input,TargetSDK,FOLLOW_2); 
             after(grammarAccess.getTargetSDKAccess().getTargetSDKKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__1__Impl"


    // $ANTLR start "rule__TargetSDK__Group__2"
    // InternalAndroidGeneratorParser.g:1407:1: rule__TargetSDK__Group__2 : rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 ;
    public final void rule__TargetSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1411:1: ( rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 )
            // InternalAndroidGeneratorParser.g:1412:2: rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__TargetSDK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetSDK__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__2"


    // $ANTLR start "rule__TargetSDK__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:1419:1: rule__TargetSDK__Group__2__Impl : ( Colon ) ;
    public final void rule__TargetSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1423:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:1424:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:1424:1: ( Colon )
            // InternalAndroidGeneratorParser.g:1425:2: Colon
            {
             before(grammarAccess.getTargetSDKAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getTargetSDKAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__2__Impl"


    // $ANTLR start "rule__TargetSDK__Group__3"
    // InternalAndroidGeneratorParser.g:1434:1: rule__TargetSDK__Group__3 : rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 ;
    public final void rule__TargetSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1438:1: ( rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 )
            // InternalAndroidGeneratorParser.g:1439:2: rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__TargetSDK__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetSDK__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__3"


    // $ANTLR start "rule__TargetSDK__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:1446:1: rule__TargetSDK__Group__3__Impl : ( ( rule__TargetSDK__ResultAssignment_3 ) ) ;
    public final void rule__TargetSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1450:1: ( ( ( rule__TargetSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGeneratorParser.g:1451:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGeneratorParser.g:1451:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            // InternalAndroidGeneratorParser.g:1452:2: ( rule__TargetSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getTargetSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGeneratorParser.g:1453:2: ( rule__TargetSDK__ResultAssignment_3 )
            // InternalAndroidGeneratorParser.g:1453:3: rule__TargetSDK__ResultAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TargetSDK__ResultAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTargetSDKAccess().getResultAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__3__Impl"


    // $ANTLR start "rule__TargetSDK__Group__4"
    // InternalAndroidGeneratorParser.g:1461:1: rule__TargetSDK__Group__4 : rule__TargetSDK__Group__4__Impl ;
    public final void rule__TargetSDK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1465:1: ( rule__TargetSDK__Group__4__Impl )
            // InternalAndroidGeneratorParser.g:1466:2: rule__TargetSDK__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetSDK__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__4"


    // $ANTLR start "rule__TargetSDK__Group__4__Impl"
    // InternalAndroidGeneratorParser.g:1472:1: rule__TargetSDK__Group__4__Impl : ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) ;
    public final void rule__TargetSDK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1476:1: ( ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) )
            // InternalAndroidGeneratorParser.g:1477:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            {
            // InternalAndroidGeneratorParser.g:1477:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            // InternalAndroidGeneratorParser.g:1478:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            {
             before(grammarAccess.getTargetSDKAccess().getMinsdkAssignment_4()); 
            // InternalAndroidGeneratorParser.g:1479:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==MinSDK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1479:3: rule__TargetSDK__MinsdkAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetSDK__MinsdkAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetSDKAccess().getMinsdkAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__Group__4__Impl"


    // $ANTLR start "rule__MinSDK__Group__0"
    // InternalAndroidGeneratorParser.g:1488:1: rule__MinSDK__Group__0 : rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 ;
    public final void rule__MinSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1492:1: ( rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 )
            // InternalAndroidGeneratorParser.g:1493:2: rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MinSDK__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinSDK__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__Group__0"


    // $ANTLR start "rule__MinSDK__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:1500:1: rule__MinSDK__Group__0__Impl : ( () ) ;
    public final void rule__MinSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1504:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1505:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1505:1: ( () )
            // InternalAndroidGeneratorParser.g:1506:2: ()
            {
             before(grammarAccess.getMinSDKAccess().getMinSDKAction_0()); 
            // InternalAndroidGeneratorParser.g:1507:2: ()
            // InternalAndroidGeneratorParser.g:1507:3: 
            {
            }

             after(grammarAccess.getMinSDKAccess().getMinSDKAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__Group__0__Impl"


    // $ANTLR start "rule__MinSDK__Group__1"
    // InternalAndroidGeneratorParser.g:1515:1: rule__MinSDK__Group__1 : rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 ;
    public final void rule__MinSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1519:1: ( rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 )
            // InternalAndroidGeneratorParser.g:1520:2: rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MinSDK__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinSDK__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__Group__1"


    // $ANTLR start "rule__MinSDK__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:1527:1: rule__MinSDK__Group__1__Impl : ( MinSDK ) ;
    public final void rule__MinSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1531:1: ( ( MinSDK ) )
            // InternalAndroidGeneratorParser.g:1532:1: ( MinSDK )
            {
            // InternalAndroidGeneratorParser.g:1532:1: ( MinSDK )
            // InternalAndroidGeneratorParser.g:1533:2: MinSDK
            {
             before(grammarAccess.getMinSDKAccess().getMinSDKKeyword_1()); 
            match(input,MinSDK,FOLLOW_2); 
             after(grammarAccess.getMinSDKAccess().getMinSDKKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__Group__1__Impl"


    // $ANTLR start "rule__MinSDK__Group__2"
    // InternalAndroidGeneratorParser.g:1542:1: rule__MinSDK__Group__2 : rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 ;
    public final void rule__MinSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1546:1: ( rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 )
            // InternalAndroidGeneratorParser.g:1547:2: rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MinSDK__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinSDK__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__Group__2"


    // $ANTLR start "rule__MinSDK__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:1554:1: rule__MinSDK__Group__2__Impl : ( Colon ) ;
    public final void rule__MinSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1558:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:1559:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:1559:1: ( Colon )
            // InternalAndroidGeneratorParser.g:1560:2: Colon
            {
             before(grammarAccess.getMinSDKAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getMinSDKAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__Group__2__Impl"


    // $ANTLR start "rule__MinSDK__Group__3"
    // InternalAndroidGeneratorParser.g:1569:1: rule__MinSDK__Group__3 : rule__MinSDK__Group__3__Impl ;
    public final void rule__MinSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1573:1: ( rule__MinSDK__Group__3__Impl )
            // InternalAndroidGeneratorParser.g:1574:2: rule__MinSDK__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinSDK__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__Group__3"


    // $ANTLR start "rule__MinSDK__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:1580:1: rule__MinSDK__Group__3__Impl : ( ( rule__MinSDK__ResultAssignment_3 ) ) ;
    public final void rule__MinSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1584:1: ( ( ( rule__MinSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGeneratorParser.g:1585:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGeneratorParser.g:1585:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            // InternalAndroidGeneratorParser.g:1586:2: ( rule__MinSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getMinSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGeneratorParser.g:1587:2: ( rule__MinSDK__ResultAssignment_3 )
            // InternalAndroidGeneratorParser.g:1587:3: rule__MinSDK__ResultAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MinSDK__ResultAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMinSDKAccess().getResultAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__Group__3__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__0"
    // InternalAndroidGeneratorParser.g:1596:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1600:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // InternalAndroidGeneratorParser.g:1601:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ApplicationPermissionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationPermissionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__0"


    // $ANTLR start "rule__ApplicationPermissionList__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:1608:1: rule__ApplicationPermissionList__Group__0__Impl : ( Permissions ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1612:1: ( ( Permissions ) )
            // InternalAndroidGeneratorParser.g:1613:1: ( Permissions )
            {
            // InternalAndroidGeneratorParser.g:1613:1: ( Permissions )
            // InternalAndroidGeneratorParser.g:1614:2: Permissions
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 
            match(input,Permissions,FOLLOW_2); 
             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__0__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__1"
    // InternalAndroidGeneratorParser.g:1623:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1627:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // InternalAndroidGeneratorParser.g:1628:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ApplicationPermissionList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationPermissionList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__1"


    // $ANTLR start "rule__ApplicationPermissionList__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:1635:1: rule__ApplicationPermissionList__Group__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1639:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:1640:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1640:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:1641:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_1()); 
            // InternalAndroidGeneratorParser.g:1642:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            // InternalAndroidGeneratorParser.g:1642:3: rule__ApplicationPermissionList__PermissionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationPermissionList__PermissionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__1__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group__2"
    // InternalAndroidGeneratorParser.g:1650:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1654:1: ( rule__ApplicationPermissionList__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:1655:2: rule__ApplicationPermissionList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationPermissionList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__2"


    // $ANTLR start "rule__ApplicationPermissionList__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:1661:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__Group_2__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1665:1: ( ( ( rule__ApplicationPermissionList__Group_2__0 )* ) )
            // InternalAndroidGeneratorParser.g:1666:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            {
            // InternalAndroidGeneratorParser.g:1666:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            // InternalAndroidGeneratorParser.g:1667:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_2()); 
            // InternalAndroidGeneratorParser.g:1668:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:1668:3: rule__ApplicationPermissionList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ApplicationPermissionList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getApplicationPermissionListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group__2__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group_2__0"
    // InternalAndroidGeneratorParser.g:1677:1: rule__ApplicationPermissionList__Group_2__0 : rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 ;
    public final void rule__ApplicationPermissionList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1681:1: ( rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 )
            // InternalAndroidGeneratorParser.g:1682:2: rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ApplicationPermissionList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationPermissionList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group_2__0"


    // $ANTLR start "rule__ApplicationPermissionList__Group_2__0__Impl"
    // InternalAndroidGeneratorParser.g:1689:1: rule__ApplicationPermissionList__Group_2__0__Impl : ( Comma ) ;
    public final void rule__ApplicationPermissionList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1693:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:1694:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:1694:1: ( Comma )
            // InternalAndroidGeneratorParser.g:1695:2: Comma
            {
             before(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group_2__0__Impl"


    // $ANTLR start "rule__ApplicationPermissionList__Group_2__1"
    // InternalAndroidGeneratorParser.g:1704:1: rule__ApplicationPermissionList__Group_2__1 : rule__ApplicationPermissionList__Group_2__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1708:1: ( rule__ApplicationPermissionList__Group_2__1__Impl )
            // InternalAndroidGeneratorParser.g:1709:2: rule__ApplicationPermissionList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationPermissionList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group_2__1"


    // $ANTLR start "rule__ApplicationPermissionList__Group_2__1__Impl"
    // InternalAndroidGeneratorParser.g:1715:1: rule__ApplicationPermissionList__Group_2__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1719:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) )
            // InternalAndroidGeneratorParser.g:1720:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1720:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            // InternalAndroidGeneratorParser.g:1721:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2_1()); 
            // InternalAndroidGeneratorParser.g:1722:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            // InternalAndroidGeneratorParser.g:1722:3: rule__ApplicationPermissionList__PermissionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationPermissionList__PermissionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__Group_2__1__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__0"
    // InternalAndroidGeneratorParser.g:1731:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1735:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // InternalAndroidGeneratorParser.g:1736:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ApplicationElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationElementList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__0"


    // $ANTLR start "rule__ApplicationElementList__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:1743:1: rule__ApplicationElementList__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1747:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1748:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1748:1: ( () )
            // InternalAndroidGeneratorParser.g:1749:2: ()
            {
             before(grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0()); 
            // InternalAndroidGeneratorParser.g:1750:2: ()
            // InternalAndroidGeneratorParser.g:1750:3: 
            {
            }

             after(grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__0__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__1"
    // InternalAndroidGeneratorParser.g:1758:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1762:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // InternalAndroidGeneratorParser.g:1763:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ApplicationElementList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationElementList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__1"


    // $ANTLR start "rule__ApplicationElementList__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:1770:1: rule__ApplicationElementList__Group__1__Impl : ( Elements ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1774:1: ( ( Elements ) )
            // InternalAndroidGeneratorParser.g:1775:1: ( Elements )
            {
            // InternalAndroidGeneratorParser.g:1775:1: ( Elements )
            // InternalAndroidGeneratorParser.g:1776:2: Elements
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsKeyword_1()); 
            match(input,Elements,FOLLOW_2); 
             after(grammarAccess.getApplicationElementListAccess().getElementsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__1__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__2"
    // InternalAndroidGeneratorParser.g:1785:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1789:1: ( rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 )
            // InternalAndroidGeneratorParser.g:1790:2: rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ApplicationElementList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationElementList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__2"


    // $ANTLR start "rule__ApplicationElementList__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:1797:1: rule__ApplicationElementList__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1801:1: ( ( RULE_BEGIN ) )
            // InternalAndroidGeneratorParser.g:1802:1: ( RULE_BEGIN )
            {
            // InternalAndroidGeneratorParser.g:1802:1: ( RULE_BEGIN )
            // InternalAndroidGeneratorParser.g:1803:2: RULE_BEGIN
            {
             before(grammarAccess.getApplicationElementListAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getApplicationElementListAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__2__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__3"
    // InternalAndroidGeneratorParser.g:1812:1: rule__ApplicationElementList__Group__3 : rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 ;
    public final void rule__ApplicationElementList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1816:1: ( rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 )
            // InternalAndroidGeneratorParser.g:1817:2: rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ApplicationElementList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationElementList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__3"


    // $ANTLR start "rule__ApplicationElementList__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:1824:1: rule__ApplicationElementList__Group__3__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_3 )* ) ;
    public final void rule__ApplicationElementList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1828:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_3 )* ) )
            // InternalAndroidGeneratorParser.g:1829:1: ( ( rule__ApplicationElementList__ElementsAssignment_3 )* )
            {
            // InternalAndroidGeneratorParser.g:1829:1: ( ( rule__ApplicationElementList__ElementsAssignment_3 )* )
            // InternalAndroidGeneratorParser.g:1830:2: ( rule__ApplicationElementList__ElementsAssignment_3 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3()); 
            // InternalAndroidGeneratorParser.g:1831:2: ( rule__ApplicationElementList__ElementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Fragment||LA13_0==Model) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:1831:3: rule__ApplicationElementList__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ApplicationElementList__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__3__Impl"


    // $ANTLR start "rule__ApplicationElementList__Group__4"
    // InternalAndroidGeneratorParser.g:1839:1: rule__ApplicationElementList__Group__4 : rule__ApplicationElementList__Group__4__Impl ;
    public final void rule__ApplicationElementList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1843:1: ( rule__ApplicationElementList__Group__4__Impl )
            // InternalAndroidGeneratorParser.g:1844:2: rule__ApplicationElementList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationElementList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__4"


    // $ANTLR start "rule__ApplicationElementList__Group__4__Impl"
    // InternalAndroidGeneratorParser.g:1850:1: rule__ApplicationElementList__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ApplicationElementList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1854:1: ( ( RULE_END ) )
            // InternalAndroidGeneratorParser.g:1855:1: ( RULE_END )
            {
            // InternalAndroidGeneratorParser.g:1855:1: ( RULE_END )
            // InternalAndroidGeneratorParser.g:1856:2: RULE_END
            {
             before(grammarAccess.getApplicationElementListAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getApplicationElementListAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAndroidGeneratorParser.g:1866:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1870:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAndroidGeneratorParser.g:1871:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalAndroidGeneratorParser.g:1878:1: rule__Model__Group__0__Impl : ( Model ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1882:1: ( ( Model ) )
            // InternalAndroidGeneratorParser.g:1883:1: ( Model )
            {
            // InternalAndroidGeneratorParser.g:1883:1: ( Model )
            // InternalAndroidGeneratorParser.g:1884:2: Model
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,Model,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
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
    // InternalAndroidGeneratorParser.g:1893:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1897:1: ( rule__Model__Group__1__Impl )
            // InternalAndroidGeneratorParser.g:1898:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGeneratorParser.g:1904:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1908:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:1909:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1909:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:1910:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:1911:2: ( rule__Model__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:1911:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fragment__Group__0"
    // InternalAndroidGeneratorParser.g:1920:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1924:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalAndroidGeneratorParser.g:1925:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Fragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__0"


    // $ANTLR start "rule__Fragment__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:1932:1: rule__Fragment__Group__0__Impl : ( Fragment ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1936:1: ( ( Fragment ) )
            // InternalAndroidGeneratorParser.g:1937:1: ( Fragment )
            {
            // InternalAndroidGeneratorParser.g:1937:1: ( Fragment )
            // InternalAndroidGeneratorParser.g:1938:2: Fragment
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 
            match(input,Fragment,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__0__Impl"


    // $ANTLR start "rule__Fragment__Group__1"
    // InternalAndroidGeneratorParser.g:1947:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1951:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalAndroidGeneratorParser.g:1952:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Fragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__1"


    // $ANTLR start "rule__Fragment__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:1959:1: rule__Fragment__Group__1__Impl : ( ( rule__Fragment__NameAssignment_1 ) ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1963:1: ( ( ( rule__Fragment__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:1964:1: ( ( rule__Fragment__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1964:1: ( ( rule__Fragment__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:1965:2: ( rule__Fragment__NameAssignment_1 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:1966:2: ( rule__Fragment__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:1966:3: rule__Fragment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__1__Impl"


    // $ANTLR start "rule__Fragment__Group__2"
    // InternalAndroidGeneratorParser.g:1974:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1978:1: ( rule__Fragment__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:1979:2: rule__Fragment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__2"


    // $ANTLR start "rule__Fragment__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:1985:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__FragmentAttributesAssignment_2 )? ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1989:1: ( ( ( rule__Fragment__FragmentAttributesAssignment_2 )? ) )
            // InternalAndroidGeneratorParser.g:1990:1: ( ( rule__Fragment__FragmentAttributesAssignment_2 )? )
            {
            // InternalAndroidGeneratorParser.g:1990:1: ( ( rule__Fragment__FragmentAttributesAssignment_2 )? )
            // InternalAndroidGeneratorParser.g:1991:2: ( rule__Fragment__FragmentAttributesAssignment_2 )?
            {
             before(grammarAccess.getFragmentAccess().getFragmentAttributesAssignment_2()); 
            // InternalAndroidGeneratorParser.g:1992:2: ( rule__Fragment__FragmentAttributesAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BEGIN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1992:3: rule__Fragment__FragmentAttributesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fragment__FragmentAttributesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentAccess().getFragmentAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__2__Impl"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group__0"
    // InternalAndroidGeneratorParser.g:2001:1: rule__FragmentLayoutAttributes__Group__0 : rule__FragmentLayoutAttributes__Group__0__Impl rule__FragmentLayoutAttributes__Group__1 ;
    public final void rule__FragmentLayoutAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2005:1: ( rule__FragmentLayoutAttributes__Group__0__Impl rule__FragmentLayoutAttributes__Group__1 )
            // InternalAndroidGeneratorParser.g:2006:2: rule__FragmentLayoutAttributes__Group__0__Impl rule__FragmentLayoutAttributes__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FragmentLayoutAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group__0"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:2013:1: rule__FragmentLayoutAttributes__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__FragmentLayoutAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2017:1: ( ( RULE_BEGIN ) )
            // InternalAndroidGeneratorParser.g:2018:1: ( RULE_BEGIN )
            {
            // InternalAndroidGeneratorParser.g:2018:1: ( RULE_BEGIN )
            // InternalAndroidGeneratorParser.g:2019:2: RULE_BEGIN
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getFragmentLayoutAttributesAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group__0__Impl"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group__1"
    // InternalAndroidGeneratorParser.g:2028:1: rule__FragmentLayoutAttributes__Group__1 : rule__FragmentLayoutAttributes__Group__1__Impl rule__FragmentLayoutAttributes__Group__2 ;
    public final void rule__FragmentLayoutAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2032:1: ( rule__FragmentLayoutAttributes__Group__1__Impl rule__FragmentLayoutAttributes__Group__2 )
            // InternalAndroidGeneratorParser.g:2033:2: rule__FragmentLayoutAttributes__Group__1__Impl rule__FragmentLayoutAttributes__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__FragmentLayoutAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group__1"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:2040:1: rule__FragmentLayoutAttributes__Group__1__Impl : ( ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_1 ) ) ;
    public final void rule__FragmentLayoutAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2044:1: ( ( ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:2045:1: ( ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2045:1: ( ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:2046:2: ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_1 )
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsAssignment_1()); 
            // InternalAndroidGeneratorParser.g:2047:2: ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_1 )
            // InternalAndroidGeneratorParser.g:2047:3: rule__FragmentLayoutAttributes__LayoutElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__LayoutElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group__1__Impl"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group__2"
    // InternalAndroidGeneratorParser.g:2055:1: rule__FragmentLayoutAttributes__Group__2 : rule__FragmentLayoutAttributes__Group__2__Impl rule__FragmentLayoutAttributes__Group__3 ;
    public final void rule__FragmentLayoutAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2059:1: ( rule__FragmentLayoutAttributes__Group__2__Impl rule__FragmentLayoutAttributes__Group__3 )
            // InternalAndroidGeneratorParser.g:2060:2: rule__FragmentLayoutAttributes__Group__2__Impl rule__FragmentLayoutAttributes__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__FragmentLayoutAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group__2"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:2067:1: rule__FragmentLayoutAttributes__Group__2__Impl : ( ( rule__FragmentLayoutAttributes__Group_2__0 )* ) ;
    public final void rule__FragmentLayoutAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2071:1: ( ( ( rule__FragmentLayoutAttributes__Group_2__0 )* ) )
            // InternalAndroidGeneratorParser.g:2072:1: ( ( rule__FragmentLayoutAttributes__Group_2__0 )* )
            {
            // InternalAndroidGeneratorParser.g:2072:1: ( ( rule__FragmentLayoutAttributes__Group_2__0 )* )
            // InternalAndroidGeneratorParser.g:2073:2: ( rule__FragmentLayoutAttributes__Group_2__0 )*
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getGroup_2()); 
            // InternalAndroidGeneratorParser.g:2074:2: ( rule__FragmentLayoutAttributes__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:2074:3: rule__FragmentLayoutAttributes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FragmentLayoutAttributes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFragmentLayoutAttributesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group__2__Impl"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group__3"
    // InternalAndroidGeneratorParser.g:2082:1: rule__FragmentLayoutAttributes__Group__3 : rule__FragmentLayoutAttributes__Group__3__Impl ;
    public final void rule__FragmentLayoutAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2086:1: ( rule__FragmentLayoutAttributes__Group__3__Impl )
            // InternalAndroidGeneratorParser.g:2087:2: rule__FragmentLayoutAttributes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group__3"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:2093:1: rule__FragmentLayoutAttributes__Group__3__Impl : ( RULE_END ) ;
    public final void rule__FragmentLayoutAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2097:1: ( ( RULE_END ) )
            // InternalAndroidGeneratorParser.g:2098:1: ( RULE_END )
            {
            // InternalAndroidGeneratorParser.g:2098:1: ( RULE_END )
            // InternalAndroidGeneratorParser.g:2099:2: RULE_END
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getENDTerminalRuleCall_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getFragmentLayoutAttributesAccess().getENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group__3__Impl"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group_2__0"
    // InternalAndroidGeneratorParser.g:2109:1: rule__FragmentLayoutAttributes__Group_2__0 : rule__FragmentLayoutAttributes__Group_2__0__Impl rule__FragmentLayoutAttributes__Group_2__1 ;
    public final void rule__FragmentLayoutAttributes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2113:1: ( rule__FragmentLayoutAttributes__Group_2__0__Impl rule__FragmentLayoutAttributes__Group_2__1 )
            // InternalAndroidGeneratorParser.g:2114:2: rule__FragmentLayoutAttributes__Group_2__0__Impl rule__FragmentLayoutAttributes__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__FragmentLayoutAttributes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group_2__0"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group_2__0__Impl"
    // InternalAndroidGeneratorParser.g:2121:1: rule__FragmentLayoutAttributes__Group_2__0__Impl : ( Comma ) ;
    public final void rule__FragmentLayoutAttributes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2125:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:2126:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:2126:1: ( Comma )
            // InternalAndroidGeneratorParser.g:2127:2: Comma
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getCommaKeyword_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getFragmentLayoutAttributesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group_2__0__Impl"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group_2__1"
    // InternalAndroidGeneratorParser.g:2136:1: rule__FragmentLayoutAttributes__Group_2__1 : rule__FragmentLayoutAttributes__Group_2__1__Impl ;
    public final void rule__FragmentLayoutAttributes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2140:1: ( rule__FragmentLayoutAttributes__Group_2__1__Impl )
            // InternalAndroidGeneratorParser.g:2141:2: rule__FragmentLayoutAttributes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group_2__1"


    // $ANTLR start "rule__FragmentLayoutAttributes__Group_2__1__Impl"
    // InternalAndroidGeneratorParser.g:2147:1: rule__FragmentLayoutAttributes__Group_2__1__Impl : ( ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1 ) ) ;
    public final void rule__FragmentLayoutAttributes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2151:1: ( ( ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1 ) ) )
            // InternalAndroidGeneratorParser.g:2152:1: ( ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2152:1: ( ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1 ) )
            // InternalAndroidGeneratorParser.g:2153:2: ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1 )
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsAssignment_2_1()); 
            // InternalAndroidGeneratorParser.g:2154:2: ( rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1 )
            // InternalAndroidGeneratorParser.g:2154:3: rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__Group_2__1__Impl"


    // $ANTLR start "rule__TypeMap__Group__0"
    // InternalAndroidGeneratorParser.g:2163:1: rule__TypeMap__Group__0 : rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1 ;
    public final void rule__TypeMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2167:1: ( rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1 )
            // InternalAndroidGeneratorParser.g:2168:2: rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TypeMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMap__Group__0"


    // $ANTLR start "rule__TypeMap__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:2175:1: rule__TypeMap__Group__0__Impl : ( () ) ;
    public final void rule__TypeMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2179:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:2180:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:2180:1: ( () )
            // InternalAndroidGeneratorParser.g:2181:2: ()
            {
             before(grammarAccess.getTypeMapAccess().getTypeMapAction_0()); 
            // InternalAndroidGeneratorParser.g:2182:2: ()
            // InternalAndroidGeneratorParser.g:2182:3: 
            {
            }

             after(grammarAccess.getTypeMapAccess().getTypeMapAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMap__Group__0__Impl"


    // $ANTLR start "rule__TypeMap__Group__1"
    // InternalAndroidGeneratorParser.g:2190:1: rule__TypeMap__Group__1 : rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2 ;
    public final void rule__TypeMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2194:1: ( rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2 )
            // InternalAndroidGeneratorParser.g:2195:2: rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__TypeMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMap__Group__1"


    // $ANTLR start "rule__TypeMap__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:2202:1: rule__TypeMap__Group__1__Impl : ( Map ) ;
    public final void rule__TypeMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2206:1: ( ( Map ) )
            // InternalAndroidGeneratorParser.g:2207:1: ( Map )
            {
            // InternalAndroidGeneratorParser.g:2207:1: ( Map )
            // InternalAndroidGeneratorParser.g:2208:2: Map
            {
             before(grammarAccess.getTypeMapAccess().getMapKeyword_1()); 
            match(input,Map,FOLLOW_2); 
             after(grammarAccess.getTypeMapAccess().getMapKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMap__Group__1__Impl"


    // $ANTLR start "rule__TypeMap__Group__2"
    // InternalAndroidGeneratorParser.g:2217:1: rule__TypeMap__Group__2 : rule__TypeMap__Group__2__Impl ;
    public final void rule__TypeMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2221:1: ( rule__TypeMap__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:2222:2: rule__TypeMap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeMap__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMap__Group__2"


    // $ANTLR start "rule__TypeMap__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:2228:1: rule__TypeMap__Group__2__Impl : ( ( rule__TypeMap__FragmenttypeattributeAssignment_2 )? ) ;
    public final void rule__TypeMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2232:1: ( ( ( rule__TypeMap__FragmenttypeattributeAssignment_2 )? ) )
            // InternalAndroidGeneratorParser.g:2233:1: ( ( rule__TypeMap__FragmenttypeattributeAssignment_2 )? )
            {
            // InternalAndroidGeneratorParser.g:2233:1: ( ( rule__TypeMap__FragmenttypeattributeAssignment_2 )? )
            // InternalAndroidGeneratorParser.g:2234:2: ( rule__TypeMap__FragmenttypeattributeAssignment_2 )?
            {
             before(grammarAccess.getTypeMapAccess().getFragmenttypeattributeAssignment_2()); 
            // InternalAndroidGeneratorParser.g:2235:2: ( rule__TypeMap__FragmenttypeattributeAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FilterQuery) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:2235:3: rule__TypeMap__FragmenttypeattributeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeMap__FragmenttypeattributeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMapAccess().getFragmenttypeattributeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMap__Group__2__Impl"


    // $ANTLR start "rule__TypeSetting__Group__0"
    // InternalAndroidGeneratorParser.g:2244:1: rule__TypeSetting__Group__0 : rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1 ;
    public final void rule__TypeSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2248:1: ( rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1 )
            // InternalAndroidGeneratorParser.g:2249:2: rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TypeSetting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSetting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSetting__Group__0"


    // $ANTLR start "rule__TypeSetting__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:2256:1: rule__TypeSetting__Group__0__Impl : ( () ) ;
    public final void rule__TypeSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2260:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:2261:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:2261:1: ( () )
            // InternalAndroidGeneratorParser.g:2262:2: ()
            {
             before(grammarAccess.getTypeSettingAccess().getTypeSettingAction_0()); 
            // InternalAndroidGeneratorParser.g:2263:2: ()
            // InternalAndroidGeneratorParser.g:2263:3: 
            {
            }

             after(grammarAccess.getTypeSettingAccess().getTypeSettingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSetting__Group__0__Impl"


    // $ANTLR start "rule__TypeSetting__Group__1"
    // InternalAndroidGeneratorParser.g:2271:1: rule__TypeSetting__Group__1 : rule__TypeSetting__Group__1__Impl ;
    public final void rule__TypeSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2275:1: ( rule__TypeSetting__Group__1__Impl )
            // InternalAndroidGeneratorParser.g:2276:2: rule__TypeSetting__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeSetting__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSetting__Group__1"


    // $ANTLR start "rule__TypeSetting__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:2282:1: rule__TypeSetting__Group__1__Impl : ( Settings ) ;
    public final void rule__TypeSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2286:1: ( ( Settings ) )
            // InternalAndroidGeneratorParser.g:2287:1: ( Settings )
            {
            // InternalAndroidGeneratorParser.g:2287:1: ( Settings )
            // InternalAndroidGeneratorParser.g:2288:2: Settings
            {
             before(grammarAccess.getTypeSettingAccess().getSettingsKeyword_1()); 
            match(input,Settings,FOLLOW_2); 
             after(grammarAccess.getTypeSettingAccess().getSettingsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSetting__Group__1__Impl"


    // $ANTLR start "rule__EditText__Group__0"
    // InternalAndroidGeneratorParser.g:2298:1: rule__EditText__Group__0 : rule__EditText__Group__0__Impl rule__EditText__Group__1 ;
    public final void rule__EditText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2302:1: ( rule__EditText__Group__0__Impl rule__EditText__Group__1 )
            // InternalAndroidGeneratorParser.g:2303:2: rule__EditText__Group__0__Impl rule__EditText__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EditText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__Group__0"


    // $ANTLR start "rule__EditText__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:2310:1: rule__EditText__Group__0__Impl : ( EditText ) ;
    public final void rule__EditText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2314:1: ( ( EditText ) )
            // InternalAndroidGeneratorParser.g:2315:1: ( EditText )
            {
            // InternalAndroidGeneratorParser.g:2315:1: ( EditText )
            // InternalAndroidGeneratorParser.g:2316:2: EditText
            {
             before(grammarAccess.getEditTextAccess().getEditTextKeyword_0()); 
            match(input,EditText,FOLLOW_2); 
             after(grammarAccess.getEditTextAccess().getEditTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__Group__0__Impl"


    // $ANTLR start "rule__EditText__Group__1"
    // InternalAndroidGeneratorParser.g:2325:1: rule__EditText__Group__1 : rule__EditText__Group__1__Impl ;
    public final void rule__EditText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2329:1: ( rule__EditText__Group__1__Impl )
            // InternalAndroidGeneratorParser.g:2330:2: rule__EditText__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EditText__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__Group__1"


    // $ANTLR start "rule__EditText__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:2336:1: rule__EditText__Group__1__Impl : ( ( rule__EditText__NameAssignment_1 ) ) ;
    public final void rule__EditText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2340:1: ( ( ( rule__EditText__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:2341:1: ( ( rule__EditText__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2341:1: ( ( rule__EditText__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:2342:2: ( rule__EditText__NameAssignment_1 )
            {
             before(grammarAccess.getEditTextAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:2343:2: ( rule__EditText__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:2343:3: rule__EditText__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EditText__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEditTextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__Group__1__Impl"


    // $ANTLR start "rule__Spinner__Group__0"
    // InternalAndroidGeneratorParser.g:2352:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2356:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // InternalAndroidGeneratorParser.g:2357:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Spinner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__0"


    // $ANTLR start "rule__Spinner__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:2364:1: rule__Spinner__Group__0__Impl : ( Spinner ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2368:1: ( ( Spinner ) )
            // InternalAndroidGeneratorParser.g:2369:1: ( Spinner )
            {
            // InternalAndroidGeneratorParser.g:2369:1: ( Spinner )
            // InternalAndroidGeneratorParser.g:2370:2: Spinner
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); 
            match(input,Spinner,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__0__Impl"


    // $ANTLR start "rule__Spinner__Group__1"
    // InternalAndroidGeneratorParser.g:2379:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl rule__Spinner__Group__2 ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2383:1: ( rule__Spinner__Group__1__Impl rule__Spinner__Group__2 )
            // InternalAndroidGeneratorParser.g:2384:2: rule__Spinner__Group__1__Impl rule__Spinner__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Spinner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__1"


    // $ANTLR start "rule__Spinner__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:2391:1: rule__Spinner__Group__1__Impl : ( ( rule__Spinner__NameAssignment_1 ) ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2395:1: ( ( ( rule__Spinner__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:2396:1: ( ( rule__Spinner__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2396:1: ( ( rule__Spinner__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:2397:2: ( rule__Spinner__NameAssignment_1 )
            {
             before(grammarAccess.getSpinnerAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:2398:2: ( rule__Spinner__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:2398:3: rule__Spinner__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__1__Impl"


    // $ANTLR start "rule__Spinner__Group__2"
    // InternalAndroidGeneratorParser.g:2406:1: rule__Spinner__Group__2 : rule__Spinner__Group__2__Impl ;
    public final void rule__Spinner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2410:1: ( rule__Spinner__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:2411:2: rule__Spinner__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__2"


    // $ANTLR start "rule__Spinner__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:2417:1: rule__Spinner__Group__2__Impl : ( ( rule__Spinner__Group_2__0 )? ) ;
    public final void rule__Spinner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2421:1: ( ( ( rule__Spinner__Group_2__0 )? ) )
            // InternalAndroidGeneratorParser.g:2422:1: ( ( rule__Spinner__Group_2__0 )? )
            {
            // InternalAndroidGeneratorParser.g:2422:1: ( ( rule__Spinner__Group_2__0 )? )
            // InternalAndroidGeneratorParser.g:2423:2: ( rule__Spinner__Group_2__0 )?
            {
             before(grammarAccess.getSpinnerAccess().getGroup_2()); 
            // InternalAndroidGeneratorParser.g:2424:2: ( rule__Spinner__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Content) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:2424:3: rule__Spinner__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Spinner__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpinnerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__2__Impl"


    // $ANTLR start "rule__Spinner__Group_2__0"
    // InternalAndroidGeneratorParser.g:2433:1: rule__Spinner__Group_2__0 : rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1 ;
    public final void rule__Spinner__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2437:1: ( rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1 )
            // InternalAndroidGeneratorParser.g:2438:2: rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Spinner__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2__0"


    // $ANTLR start "rule__Spinner__Group_2__0__Impl"
    // InternalAndroidGeneratorParser.g:2445:1: rule__Spinner__Group_2__0__Impl : ( Content ) ;
    public final void rule__Spinner__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2449:1: ( ( Content ) )
            // InternalAndroidGeneratorParser.g:2450:1: ( Content )
            {
            // InternalAndroidGeneratorParser.g:2450:1: ( Content )
            // InternalAndroidGeneratorParser.g:2451:2: Content
            {
             before(grammarAccess.getSpinnerAccess().getContentKeyword_2_0()); 
            match(input,Content,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getContentKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2__0__Impl"


    // $ANTLR start "rule__Spinner__Group_2__1"
    // InternalAndroidGeneratorParser.g:2460:1: rule__Spinner__Group_2__1 : rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2 ;
    public final void rule__Spinner__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2464:1: ( rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2 )
            // InternalAndroidGeneratorParser.g:2465:2: rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2
            {
            pushFollow(FOLLOW_24);
            rule__Spinner__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2__1"


    // $ANTLR start "rule__Spinner__Group_2__1__Impl"
    // InternalAndroidGeneratorParser.g:2472:1: rule__Spinner__Group_2__1__Impl : ( Colon ) ;
    public final void rule__Spinner__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2476:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:2477:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:2477:1: ( Colon )
            // InternalAndroidGeneratorParser.g:2478:2: Colon
            {
             before(grammarAccess.getSpinnerAccess().getColonKeyword_2_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2__1__Impl"


    // $ANTLR start "rule__Spinner__Group_2__2"
    // InternalAndroidGeneratorParser.g:2487:1: rule__Spinner__Group_2__2 : rule__Spinner__Group_2__2__Impl rule__Spinner__Group_2__3 ;
    public final void rule__Spinner__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2491:1: ( rule__Spinner__Group_2__2__Impl rule__Spinner__Group_2__3 )
            // InternalAndroidGeneratorParser.g:2492:2: rule__Spinner__Group_2__2__Impl rule__Spinner__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__Spinner__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2__2"


    // $ANTLR start "rule__Spinner__Group_2__2__Impl"
    // InternalAndroidGeneratorParser.g:2499:1: rule__Spinner__Group_2__2__Impl : ( ( rule__Spinner__SpinnerconAssignment_2_2 ) ) ;
    public final void rule__Spinner__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2503:1: ( ( ( rule__Spinner__SpinnerconAssignment_2_2 ) ) )
            // InternalAndroidGeneratorParser.g:2504:1: ( ( rule__Spinner__SpinnerconAssignment_2_2 ) )
            {
            // InternalAndroidGeneratorParser.g:2504:1: ( ( rule__Spinner__SpinnerconAssignment_2_2 ) )
            // InternalAndroidGeneratorParser.g:2505:2: ( rule__Spinner__SpinnerconAssignment_2_2 )
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerconAssignment_2_2()); 
            // InternalAndroidGeneratorParser.g:2506:2: ( rule__Spinner__SpinnerconAssignment_2_2 )
            // InternalAndroidGeneratorParser.g:2506:3: rule__Spinner__SpinnerconAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__SpinnerconAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getSpinnerconAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2__2__Impl"


    // $ANTLR start "rule__Spinner__Group_2__3"
    // InternalAndroidGeneratorParser.g:2514:1: rule__Spinner__Group_2__3 : rule__Spinner__Group_2__3__Impl ;
    public final void rule__Spinner__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2518:1: ( rule__Spinner__Group_2__3__Impl )
            // InternalAndroidGeneratorParser.g:2519:2: rule__Spinner__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2__3"


    // $ANTLR start "rule__Spinner__Group_2__3__Impl"
    // InternalAndroidGeneratorParser.g:2525:1: rule__Spinner__Group_2__3__Impl : ( ( rule__Spinner__Group_2_3__0 )* ) ;
    public final void rule__Spinner__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2529:1: ( ( ( rule__Spinner__Group_2_3__0 )* ) )
            // InternalAndroidGeneratorParser.g:2530:1: ( ( rule__Spinner__Group_2_3__0 )* )
            {
            // InternalAndroidGeneratorParser.g:2530:1: ( ( rule__Spinner__Group_2_3__0 )* )
            // InternalAndroidGeneratorParser.g:2531:2: ( rule__Spinner__Group_2_3__0 )*
            {
             before(grammarAccess.getSpinnerAccess().getGroup_2_3()); 
            // InternalAndroidGeneratorParser.g:2532:2: ( rule__Spinner__Group_2_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==RULE_STRING) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:2532:3: rule__Spinner__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Spinner__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSpinnerAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2__3__Impl"


    // $ANTLR start "rule__Spinner__Group_2_3__0"
    // InternalAndroidGeneratorParser.g:2541:1: rule__Spinner__Group_2_3__0 : rule__Spinner__Group_2_3__0__Impl rule__Spinner__Group_2_3__1 ;
    public final void rule__Spinner__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2545:1: ( rule__Spinner__Group_2_3__0__Impl rule__Spinner__Group_2_3__1 )
            // InternalAndroidGeneratorParser.g:2546:2: rule__Spinner__Group_2_3__0__Impl rule__Spinner__Group_2_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Spinner__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2_3__0"


    // $ANTLR start "rule__Spinner__Group_2_3__0__Impl"
    // InternalAndroidGeneratorParser.g:2553:1: rule__Spinner__Group_2_3__0__Impl : ( Comma ) ;
    public final void rule__Spinner__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2557:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:2558:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:2558:1: ( Comma )
            // InternalAndroidGeneratorParser.g:2559:2: Comma
            {
             before(grammarAccess.getSpinnerAccess().getCommaKeyword_2_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2_3__0__Impl"


    // $ANTLR start "rule__Spinner__Group_2_3__1"
    // InternalAndroidGeneratorParser.g:2568:1: rule__Spinner__Group_2_3__1 : rule__Spinner__Group_2_3__1__Impl ;
    public final void rule__Spinner__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2572:1: ( rule__Spinner__Group_2_3__1__Impl )
            // InternalAndroidGeneratorParser.g:2573:2: rule__Spinner__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2_3__1"


    // $ANTLR start "rule__Spinner__Group_2_3__1__Impl"
    // InternalAndroidGeneratorParser.g:2579:1: rule__Spinner__Group_2_3__1__Impl : ( ( rule__Spinner__SpinnerconAssignment_2_3_1 ) ) ;
    public final void rule__Spinner__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2583:1: ( ( ( rule__Spinner__SpinnerconAssignment_2_3_1 ) ) )
            // InternalAndroidGeneratorParser.g:2584:1: ( ( rule__Spinner__SpinnerconAssignment_2_3_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2584:1: ( ( rule__Spinner__SpinnerconAssignment_2_3_1 ) )
            // InternalAndroidGeneratorParser.g:2585:2: ( rule__Spinner__SpinnerconAssignment_2_3_1 )
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerconAssignment_2_3_1()); 
            // InternalAndroidGeneratorParser.g:2586:2: ( rule__Spinner__SpinnerconAssignment_2_3_1 )
            // InternalAndroidGeneratorParser.g:2586:3: rule__Spinner__SpinnerconAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__SpinnerconAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getSpinnerconAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group_2_3__1__Impl"


    // $ANTLR start "rule__TextView__Group__0"
    // InternalAndroidGeneratorParser.g:2595:1: rule__TextView__Group__0 : rule__TextView__Group__0__Impl rule__TextView__Group__1 ;
    public final void rule__TextView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2599:1: ( rule__TextView__Group__0__Impl rule__TextView__Group__1 )
            // InternalAndroidGeneratorParser.g:2600:2: rule__TextView__Group__0__Impl rule__TextView__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TextView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextView__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__0"


    // $ANTLR start "rule__TextView__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:2607:1: rule__TextView__Group__0__Impl : ( Textview ) ;
    public final void rule__TextView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2611:1: ( ( Textview ) )
            // InternalAndroidGeneratorParser.g:2612:1: ( Textview )
            {
            // InternalAndroidGeneratorParser.g:2612:1: ( Textview )
            // InternalAndroidGeneratorParser.g:2613:2: Textview
            {
             before(grammarAccess.getTextViewAccess().getTextviewKeyword_0()); 
            match(input,Textview,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getTextviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__0__Impl"


    // $ANTLR start "rule__TextView__Group__1"
    // InternalAndroidGeneratorParser.g:2622:1: rule__TextView__Group__1 : rule__TextView__Group__1__Impl rule__TextView__Group__2 ;
    public final void rule__TextView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2626:1: ( rule__TextView__Group__1__Impl rule__TextView__Group__2 )
            // InternalAndroidGeneratorParser.g:2627:2: rule__TextView__Group__1__Impl rule__TextView__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__TextView__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextView__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__1"


    // $ANTLR start "rule__TextView__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:2634:1: rule__TextView__Group__1__Impl : ( ( rule__TextView__NameAssignment_1 ) ) ;
    public final void rule__TextView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2638:1: ( ( ( rule__TextView__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:2639:1: ( ( rule__TextView__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2639:1: ( ( rule__TextView__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:2640:2: ( rule__TextView__NameAssignment_1 )
            {
             before(grammarAccess.getTextViewAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:2641:2: ( rule__TextView__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:2641:3: rule__TextView__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TextView__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextViewAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__1__Impl"


    // $ANTLR start "rule__TextView__Group__2"
    // InternalAndroidGeneratorParser.g:2649:1: rule__TextView__Group__2 : rule__TextView__Group__2__Impl rule__TextView__Group__3 ;
    public final void rule__TextView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2653:1: ( rule__TextView__Group__2__Impl rule__TextView__Group__3 )
            // InternalAndroidGeneratorParser.g:2654:2: rule__TextView__Group__2__Impl rule__TextView__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__TextView__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextView__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__2"


    // $ANTLR start "rule__TextView__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:2661:1: rule__TextView__Group__2__Impl : ( Content ) ;
    public final void rule__TextView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2665:1: ( ( Content ) )
            // InternalAndroidGeneratorParser.g:2666:1: ( Content )
            {
            // InternalAndroidGeneratorParser.g:2666:1: ( Content )
            // InternalAndroidGeneratorParser.g:2667:2: Content
            {
             before(grammarAccess.getTextViewAccess().getContentKeyword_2()); 
            match(input,Content,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getContentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__2__Impl"


    // $ANTLR start "rule__TextView__Group__3"
    // InternalAndroidGeneratorParser.g:2676:1: rule__TextView__Group__3 : rule__TextView__Group__3__Impl rule__TextView__Group__4 ;
    public final void rule__TextView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2680:1: ( rule__TextView__Group__3__Impl rule__TextView__Group__4 )
            // InternalAndroidGeneratorParser.g:2681:2: rule__TextView__Group__3__Impl rule__TextView__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__TextView__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextView__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__3"


    // $ANTLR start "rule__TextView__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:2688:1: rule__TextView__Group__3__Impl : ( Colon ) ;
    public final void rule__TextView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2692:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:2693:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:2693:1: ( Colon )
            // InternalAndroidGeneratorParser.g:2694:2: Colon
            {
             before(grammarAccess.getTextViewAccess().getColonKeyword_3()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__3__Impl"


    // $ANTLR start "rule__TextView__Group__4"
    // InternalAndroidGeneratorParser.g:2703:1: rule__TextView__Group__4 : rule__TextView__Group__4__Impl ;
    public final void rule__TextView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2707:1: ( rule__TextView__Group__4__Impl )
            // InternalAndroidGeneratorParser.g:2708:2: rule__TextView__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextView__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__4"


    // $ANTLR start "rule__TextView__Group__4__Impl"
    // InternalAndroidGeneratorParser.g:2714:1: rule__TextView__Group__4__Impl : ( ( rule__TextView__TextAssignment_4 ) ) ;
    public final void rule__TextView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2718:1: ( ( ( rule__TextView__TextAssignment_4 ) ) )
            // InternalAndroidGeneratorParser.g:2719:1: ( ( rule__TextView__TextAssignment_4 ) )
            {
            // InternalAndroidGeneratorParser.g:2719:1: ( ( rule__TextView__TextAssignment_4 ) )
            // InternalAndroidGeneratorParser.g:2720:2: ( rule__TextView__TextAssignment_4 )
            {
             before(grammarAccess.getTextViewAccess().getTextAssignment_4()); 
            // InternalAndroidGeneratorParser.g:2721:2: ( rule__TextView__TextAssignment_4 )
            // InternalAndroidGeneratorParser.g:2721:3: rule__TextView__TextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TextView__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTextViewAccess().getTextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__4__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalAndroidGeneratorParser.g:2730:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2734:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalAndroidGeneratorParser.g:2735:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:2742:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2746:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:2747:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:2747:1: ( () )
            // InternalAndroidGeneratorParser.g:2748:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalAndroidGeneratorParser.g:2749:2: ()
            // InternalAndroidGeneratorParser.g:2749:3: 
            {
            }

             after(grammarAccess.getButtonAccess().getButtonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalAndroidGeneratorParser.g:2757:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2761:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalAndroidGeneratorParser.g:2762:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:2769:1: rule__Button__Group__1__Impl : ( Button ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2773:1: ( ( Button ) )
            // InternalAndroidGeneratorParser.g:2774:1: ( Button )
            {
            // InternalAndroidGeneratorParser.g:2774:1: ( Button )
            // InternalAndroidGeneratorParser.g:2775:2: Button
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_1()); 
            match(input,Button,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalAndroidGeneratorParser.g:2784:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2788:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalAndroidGeneratorParser.g:2789:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:2796:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2800:1: ( ( ( rule__Button__NameAssignment_2 ) ) )
            // InternalAndroidGeneratorParser.g:2801:1: ( ( rule__Button__NameAssignment_2 ) )
            {
            // InternalAndroidGeneratorParser.g:2801:1: ( ( rule__Button__NameAssignment_2 ) )
            // InternalAndroidGeneratorParser.g:2802:2: ( rule__Button__NameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalAndroidGeneratorParser.g:2803:2: ( rule__Button__NameAssignment_2 )
            // InternalAndroidGeneratorParser.g:2803:3: rule__Button__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalAndroidGeneratorParser.g:2811:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2815:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalAndroidGeneratorParser.g:2816:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:2823:1: rule__Button__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2827:1: ( ( RULE_BEGIN ) )
            // InternalAndroidGeneratorParser.g:2828:1: ( RULE_BEGIN )
            {
            // InternalAndroidGeneratorParser.g:2828:1: ( RULE_BEGIN )
            // InternalAndroidGeneratorParser.g:2829:2: RULE_BEGIN
            {
             before(grammarAccess.getButtonAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // InternalAndroidGeneratorParser.g:2838:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2842:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalAndroidGeneratorParser.g:2843:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // InternalAndroidGeneratorParser.g:2850:1: rule__Button__Group__4__Impl : ( ( rule__Button__Group_4__0 )? ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2854:1: ( ( ( rule__Button__Group_4__0 )? ) )
            // InternalAndroidGeneratorParser.g:2855:1: ( ( rule__Button__Group_4__0 )? )
            {
            // InternalAndroidGeneratorParser.g:2855:1: ( ( rule__Button__Group_4__0 )? )
            // InternalAndroidGeneratorParser.g:2856:2: ( rule__Button__Group_4__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_4()); 
            // InternalAndroidGeneratorParser.g:2857:2: ( rule__Button__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Bundle||LA19_0==Toast) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:2857:3: rule__Button__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__Button__Group__5"
    // InternalAndroidGeneratorParser.g:2865:1: rule__Button__Group__5 : rule__Button__Group__5__Impl ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2869:1: ( rule__Button__Group__5__Impl )
            // InternalAndroidGeneratorParser.g:2870:2: rule__Button__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__5"


    // $ANTLR start "rule__Button__Group__5__Impl"
    // InternalAndroidGeneratorParser.g:2876:1: rule__Button__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2880:1: ( ( RULE_END ) )
            // InternalAndroidGeneratorParser.g:2881:1: ( RULE_END )
            {
            // InternalAndroidGeneratorParser.g:2881:1: ( RULE_END )
            // InternalAndroidGeneratorParser.g:2882:2: RULE_END
            {
             before(grammarAccess.getButtonAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__5__Impl"


    // $ANTLR start "rule__Button__Group_4__0"
    // InternalAndroidGeneratorParser.g:2892:1: rule__Button__Group_4__0 : rule__Button__Group_4__0__Impl rule__Button__Group_4__1 ;
    public final void rule__Button__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2896:1: ( rule__Button__Group_4__0__Impl rule__Button__Group_4__1 )
            // InternalAndroidGeneratorParser.g:2897:2: rule__Button__Group_4__0__Impl rule__Button__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Button__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4__0"


    // $ANTLR start "rule__Button__Group_4__0__Impl"
    // InternalAndroidGeneratorParser.g:2904:1: rule__Button__Group_4__0__Impl : ( ( rule__Button__ActionsAssignment_4_0 ) ) ;
    public final void rule__Button__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2908:1: ( ( ( rule__Button__ActionsAssignment_4_0 ) ) )
            // InternalAndroidGeneratorParser.g:2909:1: ( ( rule__Button__ActionsAssignment_4_0 ) )
            {
            // InternalAndroidGeneratorParser.g:2909:1: ( ( rule__Button__ActionsAssignment_4_0 ) )
            // InternalAndroidGeneratorParser.g:2910:2: ( rule__Button__ActionsAssignment_4_0 )
            {
             before(grammarAccess.getButtonAccess().getActionsAssignment_4_0()); 
            // InternalAndroidGeneratorParser.g:2911:2: ( rule__Button__ActionsAssignment_4_0 )
            // InternalAndroidGeneratorParser.g:2911:3: rule__Button__ActionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Button__ActionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getActionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4__0__Impl"


    // $ANTLR start "rule__Button__Group_4__1"
    // InternalAndroidGeneratorParser.g:2919:1: rule__Button__Group_4__1 : rule__Button__Group_4__1__Impl ;
    public final void rule__Button__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2923:1: ( rule__Button__Group_4__1__Impl )
            // InternalAndroidGeneratorParser.g:2924:2: rule__Button__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4__1"


    // $ANTLR start "rule__Button__Group_4__1__Impl"
    // InternalAndroidGeneratorParser.g:2930:1: rule__Button__Group_4__1__Impl : ( ( rule__Button__Group_4_1__0 )* ) ;
    public final void rule__Button__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2934:1: ( ( ( rule__Button__Group_4_1__0 )* ) )
            // InternalAndroidGeneratorParser.g:2935:1: ( ( rule__Button__Group_4_1__0 )* )
            {
            // InternalAndroidGeneratorParser.g:2935:1: ( ( rule__Button__Group_4_1__0 )* )
            // InternalAndroidGeneratorParser.g:2936:2: ( rule__Button__Group_4_1__0 )*
            {
             before(grammarAccess.getButtonAccess().getGroup_4_1()); 
            // InternalAndroidGeneratorParser.g:2937:2: ( rule__Button__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:2937:3: rule__Button__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Button__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getButtonAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4__1__Impl"


    // $ANTLR start "rule__Button__Group_4_1__0"
    // InternalAndroidGeneratorParser.g:2946:1: rule__Button__Group_4_1__0 : rule__Button__Group_4_1__0__Impl rule__Button__Group_4_1__1 ;
    public final void rule__Button__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2950:1: ( rule__Button__Group_4_1__0__Impl rule__Button__Group_4_1__1 )
            // InternalAndroidGeneratorParser.g:2951:2: rule__Button__Group_4_1__0__Impl rule__Button__Group_4_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Button__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4_1__0"


    // $ANTLR start "rule__Button__Group_4_1__0__Impl"
    // InternalAndroidGeneratorParser.g:2958:1: rule__Button__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__Button__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2962:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:2963:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:2963:1: ( Comma )
            // InternalAndroidGeneratorParser.g:2964:2: Comma
            {
             before(grammarAccess.getButtonAccess().getCommaKeyword_4_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4_1__0__Impl"


    // $ANTLR start "rule__Button__Group_4_1__1"
    // InternalAndroidGeneratorParser.g:2973:1: rule__Button__Group_4_1__1 : rule__Button__Group_4_1__1__Impl ;
    public final void rule__Button__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2977:1: ( rule__Button__Group_4_1__1__Impl )
            // InternalAndroidGeneratorParser.g:2978:2: rule__Button__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4_1__1"


    // $ANTLR start "rule__Button__Group_4_1__1__Impl"
    // InternalAndroidGeneratorParser.g:2984:1: rule__Button__Group_4_1__1__Impl : ( ( rule__Button__ActionsAssignment_4_1_1 ) ) ;
    public final void rule__Button__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2988:1: ( ( ( rule__Button__ActionsAssignment_4_1_1 ) ) )
            // InternalAndroidGeneratorParser.g:2989:1: ( ( rule__Button__ActionsAssignment_4_1_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2989:1: ( ( rule__Button__ActionsAssignment_4_1_1 ) )
            // InternalAndroidGeneratorParser.g:2990:2: ( rule__Button__ActionsAssignment_4_1_1 )
            {
             before(grammarAccess.getButtonAccess().getActionsAssignment_4_1_1()); 
            // InternalAndroidGeneratorParser.g:2991:2: ( rule__Button__ActionsAssignment_4_1_1 )
            // InternalAndroidGeneratorParser.g:2991:3: rule__Button__ActionsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__ActionsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getActionsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_4_1__1__Impl"


    // $ANTLR start "rule__Toast__Group__0"
    // InternalAndroidGeneratorParser.g:3000:1: rule__Toast__Group__0 : rule__Toast__Group__0__Impl rule__Toast__Group__1 ;
    public final void rule__Toast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3004:1: ( rule__Toast__Group__0__Impl rule__Toast__Group__1 )
            // InternalAndroidGeneratorParser.g:3005:2: rule__Toast__Group__0__Impl rule__Toast__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Toast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Toast__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toast__Group__0"


    // $ANTLR start "rule__Toast__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:3012:1: rule__Toast__Group__0__Impl : ( Toast ) ;
    public final void rule__Toast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3016:1: ( ( Toast ) )
            // InternalAndroidGeneratorParser.g:3017:1: ( Toast )
            {
            // InternalAndroidGeneratorParser.g:3017:1: ( Toast )
            // InternalAndroidGeneratorParser.g:3018:2: Toast
            {
             before(grammarAccess.getToastAccess().getToastKeyword_0()); 
            match(input,Toast,FOLLOW_2); 
             after(grammarAccess.getToastAccess().getToastKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toast__Group__0__Impl"


    // $ANTLR start "rule__Toast__Group__1"
    // InternalAndroidGeneratorParser.g:3027:1: rule__Toast__Group__1 : rule__Toast__Group__1__Impl ;
    public final void rule__Toast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3031:1: ( rule__Toast__Group__1__Impl )
            // InternalAndroidGeneratorParser.g:3032:2: rule__Toast__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Toast__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toast__Group__1"


    // $ANTLR start "rule__Toast__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:3038:1: rule__Toast__Group__1__Impl : ( ( rule__Toast__TextAssignment_1 ) ) ;
    public final void rule__Toast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3042:1: ( ( ( rule__Toast__TextAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:3043:1: ( ( rule__Toast__TextAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3043:1: ( ( rule__Toast__TextAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:3044:2: ( rule__Toast__TextAssignment_1 )
            {
             before(grammarAccess.getToastAccess().getTextAssignment_1()); 
            // InternalAndroidGeneratorParser.g:3045:2: ( rule__Toast__TextAssignment_1 )
            // InternalAndroidGeneratorParser.g:3045:3: rule__Toast__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Toast__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToastAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toast__Group__1__Impl"


    // $ANTLR start "rule__Bundle__Group__0"
    // InternalAndroidGeneratorParser.g:3054:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3058:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // InternalAndroidGeneratorParser.g:3059:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Bundle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bundle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__0"


    // $ANTLR start "rule__Bundle__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:3066:1: rule__Bundle__Group__0__Impl : ( Bundle ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3070:1: ( ( Bundle ) )
            // InternalAndroidGeneratorParser.g:3071:1: ( Bundle )
            {
            // InternalAndroidGeneratorParser.g:3071:1: ( Bundle )
            // InternalAndroidGeneratorParser.g:3072:2: Bundle
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,Bundle,FOLLOW_2); 
             after(grammarAccess.getBundleAccess().getBundleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__0__Impl"


    // $ANTLR start "rule__Bundle__Group__1"
    // InternalAndroidGeneratorParser.g:3081:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3085:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // InternalAndroidGeneratorParser.g:3086:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Bundle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bundle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__1"


    // $ANTLR start "rule__Bundle__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:3093:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__BundleRecipientAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3097:1: ( ( ( rule__Bundle__BundleRecipientAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:3098:1: ( ( rule__Bundle__BundleRecipientAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3098:1: ( ( rule__Bundle__BundleRecipientAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:3099:2: ( rule__Bundle__BundleRecipientAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientAssignment_1()); 
            // InternalAndroidGeneratorParser.g:3100:2: ( rule__Bundle__BundleRecipientAssignment_1 )
            // InternalAndroidGeneratorParser.g:3100:3: rule__Bundle__BundleRecipientAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__BundleRecipientAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBundleAccess().getBundleRecipientAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__1__Impl"


    // $ANTLR start "rule__Bundle__Group__2"
    // InternalAndroidGeneratorParser.g:3108:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3112:1: ( rule__Bundle__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:3113:2: rule__Bundle__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__2"


    // $ANTLR start "rule__Bundle__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:3119:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__HolderAssignment_2 )? ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3123:1: ( ( ( rule__Bundle__HolderAssignment_2 )? ) )
            // InternalAndroidGeneratorParser.g:3124:1: ( ( rule__Bundle__HolderAssignment_2 )? )
            {
            // InternalAndroidGeneratorParser.g:3124:1: ( ( rule__Bundle__HolderAssignment_2 )? )
            // InternalAndroidGeneratorParser.g:3125:2: ( rule__Bundle__HolderAssignment_2 )?
            {
             before(grammarAccess.getBundleAccess().getHolderAssignment_2()); 
            // InternalAndroidGeneratorParser.g:3126:2: ( rule__Bundle__HolderAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Holder) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:3126:3: rule__Bundle__HolderAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bundle__HolderAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBundleAccess().getHolderAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group__2__Impl"


    // $ANTLR start "rule__Holder__Group__0"
    // InternalAndroidGeneratorParser.g:3135:1: rule__Holder__Group__0 : rule__Holder__Group__0__Impl rule__Holder__Group__1 ;
    public final void rule__Holder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3139:1: ( rule__Holder__Group__0__Impl rule__Holder__Group__1 )
            // InternalAndroidGeneratorParser.g:3140:2: rule__Holder__Group__0__Impl rule__Holder__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Holder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Holder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group__0"


    // $ANTLR start "rule__Holder__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:3147:1: rule__Holder__Group__0__Impl : ( Holder ) ;
    public final void rule__Holder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3151:1: ( ( Holder ) )
            // InternalAndroidGeneratorParser.g:3152:1: ( Holder )
            {
            // InternalAndroidGeneratorParser.g:3152:1: ( Holder )
            // InternalAndroidGeneratorParser.g:3153:2: Holder
            {
             before(grammarAccess.getHolderAccess().getHolderKeyword_0()); 
            match(input,Holder,FOLLOW_2); 
             after(grammarAccess.getHolderAccess().getHolderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group__0__Impl"


    // $ANTLR start "rule__Holder__Group__1"
    // InternalAndroidGeneratorParser.g:3162:1: rule__Holder__Group__1 : rule__Holder__Group__1__Impl rule__Holder__Group__2 ;
    public final void rule__Holder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3166:1: ( rule__Holder__Group__1__Impl rule__Holder__Group__2 )
            // InternalAndroidGeneratorParser.g:3167:2: rule__Holder__Group__1__Impl rule__Holder__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Holder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Holder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group__1"


    // $ANTLR start "rule__Holder__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:3174:1: rule__Holder__Group__1__Impl : ( ( rule__Holder__HolAssignment_1 ) ) ;
    public final void rule__Holder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3178:1: ( ( ( rule__Holder__HolAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:3179:1: ( ( rule__Holder__HolAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3179:1: ( ( rule__Holder__HolAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:3180:2: ( rule__Holder__HolAssignment_1 )
            {
             before(grammarAccess.getHolderAccess().getHolAssignment_1()); 
            // InternalAndroidGeneratorParser.g:3181:2: ( rule__Holder__HolAssignment_1 )
            // InternalAndroidGeneratorParser.g:3181:3: rule__Holder__HolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Holder__HolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHolderAccess().getHolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group__1__Impl"


    // $ANTLR start "rule__Holder__Group__2"
    // InternalAndroidGeneratorParser.g:3189:1: rule__Holder__Group__2 : rule__Holder__Group__2__Impl ;
    public final void rule__Holder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3193:1: ( rule__Holder__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:3194:2: rule__Holder__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Holder__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group__2"


    // $ANTLR start "rule__Holder__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:3200:1: rule__Holder__Group__2__Impl : ( ( rule__Holder__Group_2__0 )* ) ;
    public final void rule__Holder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3204:1: ( ( ( rule__Holder__Group_2__0 )* ) )
            // InternalAndroidGeneratorParser.g:3205:1: ( ( rule__Holder__Group_2__0 )* )
            {
            // InternalAndroidGeneratorParser.g:3205:1: ( ( rule__Holder__Group_2__0 )* )
            // InternalAndroidGeneratorParser.g:3206:2: ( rule__Holder__Group_2__0 )*
            {
             before(grammarAccess.getHolderAccess().getGroup_2()); 
            // InternalAndroidGeneratorParser.g:3207:2: ( rule__Holder__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==RULE_ID) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:3207:3: rule__Holder__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Holder__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getHolderAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group__2__Impl"


    // $ANTLR start "rule__Holder__Group_2__0"
    // InternalAndroidGeneratorParser.g:3216:1: rule__Holder__Group_2__0 : rule__Holder__Group_2__0__Impl rule__Holder__Group_2__1 ;
    public final void rule__Holder__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3220:1: ( rule__Holder__Group_2__0__Impl rule__Holder__Group_2__1 )
            // InternalAndroidGeneratorParser.g:3221:2: rule__Holder__Group_2__0__Impl rule__Holder__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Holder__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Holder__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group_2__0"


    // $ANTLR start "rule__Holder__Group_2__0__Impl"
    // InternalAndroidGeneratorParser.g:3228:1: rule__Holder__Group_2__0__Impl : ( Comma ) ;
    public final void rule__Holder__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3232:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:3233:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:3233:1: ( Comma )
            // InternalAndroidGeneratorParser.g:3234:2: Comma
            {
             before(grammarAccess.getHolderAccess().getCommaKeyword_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getHolderAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group_2__0__Impl"


    // $ANTLR start "rule__Holder__Group_2__1"
    // InternalAndroidGeneratorParser.g:3243:1: rule__Holder__Group_2__1 : rule__Holder__Group_2__1__Impl ;
    public final void rule__Holder__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3247:1: ( rule__Holder__Group_2__1__Impl )
            // InternalAndroidGeneratorParser.g:3248:2: rule__Holder__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Holder__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group_2__1"


    // $ANTLR start "rule__Holder__Group_2__1__Impl"
    // InternalAndroidGeneratorParser.g:3254:1: rule__Holder__Group_2__1__Impl : ( ( rule__Holder__HolAssignment_2_1 ) ) ;
    public final void rule__Holder__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3258:1: ( ( ( rule__Holder__HolAssignment_2_1 ) ) )
            // InternalAndroidGeneratorParser.g:3259:1: ( ( rule__Holder__HolAssignment_2_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3259:1: ( ( rule__Holder__HolAssignment_2_1 ) )
            // InternalAndroidGeneratorParser.g:3260:2: ( rule__Holder__HolAssignment_2_1 )
            {
             before(grammarAccess.getHolderAccess().getHolAssignment_2_1()); 
            // InternalAndroidGeneratorParser.g:3261:2: ( rule__Holder__HolAssignment_2_1 )
            // InternalAndroidGeneratorParser.g:3261:3: rule__Holder__HolAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Holder__HolAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHolderAccess().getHolAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__Group_2__1__Impl"


    // $ANTLR start "rule__FilterQuery__Group__0"
    // InternalAndroidGeneratorParser.g:3270:1: rule__FilterQuery__Group__0 : rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 ;
    public final void rule__FilterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3274:1: ( rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 )
            // InternalAndroidGeneratorParser.g:3275:2: rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__FilterQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterQuery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__Group__0"


    // $ANTLR start "rule__FilterQuery__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:3282:1: rule__FilterQuery__Group__0__Impl : ( () ) ;
    public final void rule__FilterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3286:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3287:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3287:1: ( () )
            // InternalAndroidGeneratorParser.g:3288:2: ()
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryAction_0()); 
            // InternalAndroidGeneratorParser.g:3289:2: ()
            // InternalAndroidGeneratorParser.g:3289:3: 
            {
            }

             after(grammarAccess.getFilterQueryAccess().getFilterQueryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__Group__0__Impl"


    // $ANTLR start "rule__FilterQuery__Group__1"
    // InternalAndroidGeneratorParser.g:3297:1: rule__FilterQuery__Group__1 : rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 ;
    public final void rule__FilterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3301:1: ( rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 )
            // InternalAndroidGeneratorParser.g:3302:2: rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FilterQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterQuery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__Group__1"


    // $ANTLR start "rule__FilterQuery__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:3309:1: rule__FilterQuery__Group__1__Impl : ( FilterQuery ) ;
    public final void rule__FilterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3313:1: ( ( FilterQuery ) )
            // InternalAndroidGeneratorParser.g:3314:1: ( FilterQuery )
            {
            // InternalAndroidGeneratorParser.g:3314:1: ( FilterQuery )
            // InternalAndroidGeneratorParser.g:3315:2: FilterQuery
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1()); 
            match(input,FilterQuery,FOLLOW_2); 
             after(grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__Group__1__Impl"


    // $ANTLR start "rule__FilterQuery__Group__2"
    // InternalAndroidGeneratorParser.g:3324:1: rule__FilterQuery__Group__2 : rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 ;
    public final void rule__FilterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3328:1: ( rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 )
            // InternalAndroidGeneratorParser.g:3329:2: rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__FilterQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterQuery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__Group__2"


    // $ANTLR start "rule__FilterQuery__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:3336:1: rule__FilterQuery__Group__2__Impl : ( ( rule__FilterQuery__NameAssignment_2 ) ) ;
    public final void rule__FilterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3340:1: ( ( ( rule__FilterQuery__NameAssignment_2 ) ) )
            // InternalAndroidGeneratorParser.g:3341:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            {
            // InternalAndroidGeneratorParser.g:3341:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            // InternalAndroidGeneratorParser.g:3342:2: ( rule__FilterQuery__NameAssignment_2 )
            {
             before(grammarAccess.getFilterQueryAccess().getNameAssignment_2()); 
            // InternalAndroidGeneratorParser.g:3343:2: ( rule__FilterQuery__NameAssignment_2 )
            // InternalAndroidGeneratorParser.g:3343:3: rule__FilterQuery__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterQuery__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterQueryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__Group__2__Impl"


    // $ANTLR start "rule__FilterQuery__Group__3"
    // InternalAndroidGeneratorParser.g:3351:1: rule__FilterQuery__Group__3 : rule__FilterQuery__Group__3__Impl ;
    public final void rule__FilterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3355:1: ( rule__FilterQuery__Group__3__Impl )
            // InternalAndroidGeneratorParser.g:3356:2: rule__FilterQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterQuery__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__Group__3"


    // $ANTLR start "rule__FilterQuery__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:3362:1: rule__FilterQuery__Group__3__Impl : ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) ;
    public final void rule__FilterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3366:1: ( ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) )
            // InternalAndroidGeneratorParser.g:3367:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            {
            // InternalAndroidGeneratorParser.g:3367:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            // InternalAndroidGeneratorParser.g:3368:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            {
             before(grammarAccess.getFilterQueryAccess().getFilterAttributesAssignment_3()); 
            // InternalAndroidGeneratorParser.g:3369:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            // InternalAndroidGeneratorParser.g:3369:3: rule__FilterQuery__FilterAttributesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FilterQuery__FilterAttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFilterQueryAccess().getFilterAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__Group__3__Impl"


    // $ANTLR start "rule__Distance__Group__0"
    // InternalAndroidGeneratorParser.g:3378:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3382:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // InternalAndroidGeneratorParser.g:3383:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Distance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Distance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__0"


    // $ANTLR start "rule__Distance__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:3390:1: rule__Distance__Group__0__Impl : ( Dist ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3394:1: ( ( Dist ) )
            // InternalAndroidGeneratorParser.g:3395:1: ( Dist )
            {
            // InternalAndroidGeneratorParser.g:3395:1: ( Dist )
            // InternalAndroidGeneratorParser.g:3396:2: Dist
            {
             before(grammarAccess.getDistanceAccess().getDistKeyword_0()); 
            match(input,Dist,FOLLOW_2); 
             after(grammarAccess.getDistanceAccess().getDistKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__0__Impl"


    // $ANTLR start "rule__Distance__Group__1"
    // InternalAndroidGeneratorParser.g:3405:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl rule__Distance__Group__2 ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3409:1: ( rule__Distance__Group__1__Impl rule__Distance__Group__2 )
            // InternalAndroidGeneratorParser.g:3410:2: rule__Distance__Group__1__Impl rule__Distance__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Distance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Distance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__1"


    // $ANTLR start "rule__Distance__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:3417:1: rule__Distance__Group__1__Impl : ( Colon ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3421:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:3422:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:3422:1: ( Colon )
            // InternalAndroidGeneratorParser.g:3423:2: Colon
            {
             before(grammarAccess.getDistanceAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getDistanceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__1__Impl"


    // $ANTLR start "rule__Distance__Group__2"
    // InternalAndroidGeneratorParser.g:3432:1: rule__Distance__Group__2 : rule__Distance__Group__2__Impl rule__Distance__Group__3 ;
    public final void rule__Distance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3436:1: ( rule__Distance__Group__2__Impl rule__Distance__Group__3 )
            // InternalAndroidGeneratorParser.g:3437:2: rule__Distance__Group__2__Impl rule__Distance__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Distance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Distance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__2"


    // $ANTLR start "rule__Distance__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:3444:1: rule__Distance__Group__2__Impl : ( ( rule__Distance__UnitAssignment_2 ) ) ;
    public final void rule__Distance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3448:1: ( ( ( rule__Distance__UnitAssignment_2 ) ) )
            // InternalAndroidGeneratorParser.g:3449:1: ( ( rule__Distance__UnitAssignment_2 ) )
            {
            // InternalAndroidGeneratorParser.g:3449:1: ( ( rule__Distance__UnitAssignment_2 ) )
            // InternalAndroidGeneratorParser.g:3450:2: ( rule__Distance__UnitAssignment_2 )
            {
             before(grammarAccess.getDistanceAccess().getUnitAssignment_2()); 
            // InternalAndroidGeneratorParser.g:3451:2: ( rule__Distance__UnitAssignment_2 )
            // InternalAndroidGeneratorParser.g:3451:3: rule__Distance__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Distance__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getUnitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__2__Impl"


    // $ANTLR start "rule__Distance__Group__3"
    // InternalAndroidGeneratorParser.g:3459:1: rule__Distance__Group__3 : rule__Distance__Group__3__Impl rule__Distance__Group__4 ;
    public final void rule__Distance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3463:1: ( rule__Distance__Group__3__Impl rule__Distance__Group__4 )
            // InternalAndroidGeneratorParser.g:3464:2: rule__Distance__Group__3__Impl rule__Distance__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Distance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Distance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__3"


    // $ANTLR start "rule__Distance__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:3471:1: rule__Distance__Group__3__Impl : ( ( rule__Distance__OperatorAssignment_3 ) ) ;
    public final void rule__Distance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3475:1: ( ( ( rule__Distance__OperatorAssignment_3 ) ) )
            // InternalAndroidGeneratorParser.g:3476:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            {
            // InternalAndroidGeneratorParser.g:3476:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            // InternalAndroidGeneratorParser.g:3477:2: ( rule__Distance__OperatorAssignment_3 )
            {
             before(grammarAccess.getDistanceAccess().getOperatorAssignment_3()); 
            // InternalAndroidGeneratorParser.g:3478:2: ( rule__Distance__OperatorAssignment_3 )
            // InternalAndroidGeneratorParser.g:3478:3: rule__Distance__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Distance__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__3__Impl"


    // $ANTLR start "rule__Distance__Group__4"
    // InternalAndroidGeneratorParser.g:3486:1: rule__Distance__Group__4 : rule__Distance__Group__4__Impl ;
    public final void rule__Distance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3490:1: ( rule__Distance__Group__4__Impl )
            // InternalAndroidGeneratorParser.g:3491:2: rule__Distance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Distance__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__4"


    // $ANTLR start "rule__Distance__Group__4__Impl"
    // InternalAndroidGeneratorParser.g:3497:1: rule__Distance__Group__4__Impl : ( ( rule__Distance__ResultsAssignment_4 ) ) ;
    public final void rule__Distance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3501:1: ( ( ( rule__Distance__ResultsAssignment_4 ) ) )
            // InternalAndroidGeneratorParser.g:3502:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            {
            // InternalAndroidGeneratorParser.g:3502:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            // InternalAndroidGeneratorParser.g:3503:2: ( rule__Distance__ResultsAssignment_4 )
            {
             before(grammarAccess.getDistanceAccess().getResultsAssignment_4()); 
            // InternalAndroidGeneratorParser.g:3504:2: ( rule__Distance__ResultsAssignment_4 )
            // InternalAndroidGeneratorParser.g:3504:3: rule__Distance__ResultsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Distance__ResultsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getResultsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Group__4__Impl"


    // $ANTLR start "rule__Operator__Group_0__0"
    // InternalAndroidGeneratorParser.g:3513:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
    public final void rule__Operator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3517:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
            // InternalAndroidGeneratorParser.g:3518:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Operator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_0__0"


    // $ANTLR start "rule__Operator__Group_0__0__Impl"
    // InternalAndroidGeneratorParser.g:3525:1: rule__Operator__Group_0__0__Impl : ( () ) ;
    public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3529:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3530:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3530:1: ( () )
            // InternalAndroidGeneratorParser.g:3531:2: ()
            {
             before(grammarAccess.getOperatorAccess().getLessAction_0_0()); 
            // InternalAndroidGeneratorParser.g:3532:2: ()
            // InternalAndroidGeneratorParser.g:3532:3: 
            {
            }

             after(grammarAccess.getOperatorAccess().getLessAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_0__0__Impl"


    // $ANTLR start "rule__Operator__Group_0__1"
    // InternalAndroidGeneratorParser.g:3540:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl ;
    public final void rule__Operator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3544:1: ( rule__Operator__Group_0__1__Impl )
            // InternalAndroidGeneratorParser.g:3545:2: rule__Operator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_0__1"


    // $ANTLR start "rule__Operator__Group_0__1__Impl"
    // InternalAndroidGeneratorParser.g:3551:1: rule__Operator__Group_0__1__Impl : ( GreaterThanSign ) ;
    public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3555:1: ( ( GreaterThanSign ) )
            // InternalAndroidGeneratorParser.g:3556:1: ( GreaterThanSign )
            {
            // InternalAndroidGeneratorParser.g:3556:1: ( GreaterThanSign )
            // InternalAndroidGeneratorParser.g:3557:2: GreaterThanSign
            {
             before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,GreaterThanSign,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_0__1__Impl"


    // $ANTLR start "rule__Operator__Group_1__0"
    // InternalAndroidGeneratorParser.g:3567:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3571:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalAndroidGeneratorParser.g:3572:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Operator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_1__0"


    // $ANTLR start "rule__Operator__Group_1__0__Impl"
    // InternalAndroidGeneratorParser.g:3579:1: rule__Operator__Group_1__0__Impl : ( () ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3583:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3584:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3584:1: ( () )
            // InternalAndroidGeneratorParser.g:3585:2: ()
            {
             before(grammarAccess.getOperatorAccess().getMoreAction_1_0()); 
            // InternalAndroidGeneratorParser.g:3586:2: ()
            // InternalAndroidGeneratorParser.g:3586:3: 
            {
            }

             after(grammarAccess.getOperatorAccess().getMoreAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_1__0__Impl"


    // $ANTLR start "rule__Operator__Group_1__1"
    // InternalAndroidGeneratorParser.g:3594:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3598:1: ( rule__Operator__Group_1__1__Impl )
            // InternalAndroidGeneratorParser.g:3599:2: rule__Operator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_1__1"


    // $ANTLR start "rule__Operator__Group_1__1__Impl"
    // InternalAndroidGeneratorParser.g:3605:1: rule__Operator__Group_1__1__Impl : ( LessThanSign ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3609:1: ( ( LessThanSign ) )
            // InternalAndroidGeneratorParser.g:3610:1: ( LessThanSign )
            {
            // InternalAndroidGeneratorParser.g:3610:1: ( LessThanSign )
            // InternalAndroidGeneratorParser.g:3611:2: LessThanSign
            {
             before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1()); 
            match(input,LessThanSign,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_1__1__Impl"


    // $ANTLR start "rule__Operator__Group_2__0"
    // InternalAndroidGeneratorParser.g:3621:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3625:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalAndroidGeneratorParser.g:3626:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Operator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__0"


    // $ANTLR start "rule__Operator__Group_2__0__Impl"
    // InternalAndroidGeneratorParser.g:3633:1: rule__Operator__Group_2__0__Impl : ( () ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3637:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3638:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3638:1: ( () )
            // InternalAndroidGeneratorParser.g:3639:2: ()
            {
             before(grammarAccess.getOperatorAccess().getEqualAction_2_0()); 
            // InternalAndroidGeneratorParser.g:3640:2: ()
            // InternalAndroidGeneratorParser.g:3640:3: 
            {
            }

             after(grammarAccess.getOperatorAccess().getEqualAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__0__Impl"


    // $ANTLR start "rule__Operator__Group_2__1"
    // InternalAndroidGeneratorParser.g:3648:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3652:1: ( rule__Operator__Group_2__1__Impl )
            // InternalAndroidGeneratorParser.g:3653:2: rule__Operator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__1"


    // $ANTLR start "rule__Operator__Group_2__1__Impl"
    // InternalAndroidGeneratorParser.g:3659:1: rule__Operator__Group_2__1__Impl : ( EqualsSign ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3663:1: ( ( EqualsSign ) )
            // InternalAndroidGeneratorParser.g:3664:1: ( EqualsSign )
            {
            // InternalAndroidGeneratorParser.g:3664:1: ( EqualsSign )
            // InternalAndroidGeneratorParser.g:3665:2: EqualsSign
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__1__Impl"


    // $ANTLR start "rule__Unit__Group_0__0"
    // InternalAndroidGeneratorParser.g:3675:1: rule__Unit__Group_0__0 : rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 ;
    public final void rule__Unit__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3679:1: ( rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 )
            // InternalAndroidGeneratorParser.g:3680:2: rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1
            {
            pushFollow(FOLLOW_34);
            rule__Unit__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group_0__0"


    // $ANTLR start "rule__Unit__Group_0__0__Impl"
    // InternalAndroidGeneratorParser.g:3687:1: rule__Unit__Group_0__0__Impl : ( () ) ;
    public final void rule__Unit__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3691:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3692:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3692:1: ( () )
            // InternalAndroidGeneratorParser.g:3693:2: ()
            {
             before(grammarAccess.getUnitAccess().getMetersAction_0_0()); 
            // InternalAndroidGeneratorParser.g:3694:2: ()
            // InternalAndroidGeneratorParser.g:3694:3: 
            {
            }

             after(grammarAccess.getUnitAccess().getMetersAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group_0__0__Impl"


    // $ANTLR start "rule__Unit__Group_0__1"
    // InternalAndroidGeneratorParser.g:3702:1: rule__Unit__Group_0__1 : rule__Unit__Group_0__1__Impl ;
    public final void rule__Unit__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3706:1: ( rule__Unit__Group_0__1__Impl )
            // InternalAndroidGeneratorParser.g:3707:2: rule__Unit__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group_0__1"


    // $ANTLR start "rule__Unit__Group_0__1__Impl"
    // InternalAndroidGeneratorParser.g:3713:1: rule__Unit__Group_0__1__Impl : ( M ) ;
    public final void rule__Unit__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3717:1: ( ( M ) )
            // InternalAndroidGeneratorParser.g:3718:1: ( M )
            {
            // InternalAndroidGeneratorParser.g:3718:1: ( M )
            // InternalAndroidGeneratorParser.g:3719:2: M
            {
             before(grammarAccess.getUnitAccess().getMKeyword_0_1()); 
            match(input,M,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getMKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group_0__1__Impl"


    // $ANTLR start "rule__Unit__Group_1__0"
    // InternalAndroidGeneratorParser.g:3729:1: rule__Unit__Group_1__0 : rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 ;
    public final void rule__Unit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3733:1: ( rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 )
            // InternalAndroidGeneratorParser.g:3734:2: rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Unit__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unit__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group_1__0"


    // $ANTLR start "rule__Unit__Group_1__0__Impl"
    // InternalAndroidGeneratorParser.g:3741:1: rule__Unit__Group_1__0__Impl : ( () ) ;
    public final void rule__Unit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3745:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3746:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3746:1: ( () )
            // InternalAndroidGeneratorParser.g:3747:2: ()
            {
             before(grammarAccess.getUnitAccess().getImperialAction_1_0()); 
            // InternalAndroidGeneratorParser.g:3748:2: ()
            // InternalAndroidGeneratorParser.g:3748:3: 
            {
            }

             after(grammarAccess.getUnitAccess().getImperialAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group_1__0__Impl"


    // $ANTLR start "rule__Unit__Group_1__1"
    // InternalAndroidGeneratorParser.g:3756:1: rule__Unit__Group_1__1 : rule__Unit__Group_1__1__Impl ;
    public final void rule__Unit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3760:1: ( rule__Unit__Group_1__1__Impl )
            // InternalAndroidGeneratorParser.g:3761:2: rule__Unit__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group_1__1"


    // $ANTLR start "rule__Unit__Group_1__1__Impl"
    // InternalAndroidGeneratorParser.g:3767:1: rule__Unit__Group_1__1__Impl : ( F ) ;
    public final void rule__Unit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3771:1: ( ( F ) )
            // InternalAndroidGeneratorParser.g:3772:1: ( F )
            {
            // InternalAndroidGeneratorParser.g:3772:1: ( F )
            // InternalAndroidGeneratorParser.g:3773:2: F
            {
             before(grammarAccess.getUnitAccess().getFKeyword_1_1()); 
            match(input,F,FOLLOW_2); 
             after(grammarAccess.getUnitAccess().getFKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Group_1__1__Impl"


    // $ANTLR start "rule__AndroidAppProject__ApplicationsAssignment"
    // InternalAndroidGeneratorParser.g:3783:1: rule__AndroidAppProject__ApplicationsAssignment : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3787:1: ( ( ruleApplication ) )
            // InternalAndroidGeneratorParser.g:3788:2: ( ruleApplication )
            {
            // InternalAndroidGeneratorParser.g:3788:2: ( ruleApplication )
            // InternalAndroidGeneratorParser.g:3789:3: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__ApplicationsAssignment"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // InternalAndroidGeneratorParser.g:3798:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3802:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:3803:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:3803:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:3804:3: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__AttributesAssignment_2"
    // InternalAndroidGeneratorParser.g:3813:1: rule__Application__AttributesAssignment_2 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3817:1: ( ( ruleApplicationAttribute ) )
            // InternalAndroidGeneratorParser.g:3818:2: ( ruleApplicationAttribute )
            {
            // InternalAndroidGeneratorParser.g:3818:2: ( ruleApplicationAttribute )
            // InternalAndroidGeneratorParser.g:3819:3: ruleApplicationAttribute
            {
             before(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleApplicationAttribute();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__AttributesAssignment_2"


    // $ANTLR start "rule__ApplicationVersion__ResultAssignment_4"
    // InternalAndroidGeneratorParser.g:3828:1: rule__ApplicationVersion__ResultAssignment_4 : ( ruleNumber ) ;
    public final void rule__ApplicationVersion__ResultAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3832:1: ( ( ruleNumber ) )
            // InternalAndroidGeneratorParser.g:3833:2: ( ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:3833:2: ( ruleNumber )
            // InternalAndroidGeneratorParser.g:3834:3: ruleNumber
            {
             before(grammarAccess.getApplicationVersionAccess().getResultNumberParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getApplicationVersionAccess().getResultNumberParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__ResultAssignment_4"


    // $ANTLR start "rule__ApplicationVersion__TargetsdkAssignment_5"
    // InternalAndroidGeneratorParser.g:3843:1: rule__ApplicationVersion__TargetsdkAssignment_5 : ( ruleTargetSDK ) ;
    public final void rule__ApplicationVersion__TargetsdkAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3847:1: ( ( ruleTargetSDK ) )
            // InternalAndroidGeneratorParser.g:3848:2: ( ruleTargetSDK )
            {
            // InternalAndroidGeneratorParser.g:3848:2: ( ruleTargetSDK )
            // InternalAndroidGeneratorParser.g:3849:3: ruleTargetSDK
            {
             before(grammarAccess.getApplicationVersionAccess().getTargetsdkTargetSDKParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetSDK();

            state._fsp--;

             after(grammarAccess.getApplicationVersionAccess().getTargetsdkTargetSDKParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__TargetsdkAssignment_5"


    // $ANTLR start "rule__TargetSDK__ResultAssignment_3"
    // InternalAndroidGeneratorParser.g:3858:1: rule__TargetSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__TargetSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3862:1: ( ( ruleNumber ) )
            // InternalAndroidGeneratorParser.g:3863:2: ( ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:3863:2: ( ruleNumber )
            // InternalAndroidGeneratorParser.g:3864:3: ruleNumber
            {
             before(grammarAccess.getTargetSDKAccess().getResultNumberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getTargetSDKAccess().getResultNumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__ResultAssignment_3"


    // $ANTLR start "rule__TargetSDK__MinsdkAssignment_4"
    // InternalAndroidGeneratorParser.g:3873:1: rule__TargetSDK__MinsdkAssignment_4 : ( ruleMinSDK ) ;
    public final void rule__TargetSDK__MinsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3877:1: ( ( ruleMinSDK ) )
            // InternalAndroidGeneratorParser.g:3878:2: ( ruleMinSDK )
            {
            // InternalAndroidGeneratorParser.g:3878:2: ( ruleMinSDK )
            // InternalAndroidGeneratorParser.g:3879:3: ruleMinSDK
            {
             before(grammarAccess.getTargetSDKAccess().getMinsdkMinSDKParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMinSDK();

            state._fsp--;

             after(grammarAccess.getTargetSDKAccess().getMinsdkMinSDKParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetSDK__MinsdkAssignment_4"


    // $ANTLR start "rule__MinSDK__ResultAssignment_3"
    // InternalAndroidGeneratorParser.g:3888:1: rule__MinSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__MinSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3892:1: ( ( ruleNumber ) )
            // InternalAndroidGeneratorParser.g:3893:2: ( ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:3893:2: ( ruleNumber )
            // InternalAndroidGeneratorParser.g:3894:3: ruleNumber
            {
             before(grammarAccess.getMinSDKAccess().getResultNumberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getMinSDKAccess().getResultNumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinSDK__ResultAssignment_3"


    // $ANTLR start "rule__ApplicationPermissionList__PermissionsAssignment_1"
    // InternalAndroidGeneratorParser.g:3903:1: rule__ApplicationPermissionList__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3907:1: ( ( rulePermission ) )
            // InternalAndroidGeneratorParser.g:3908:2: ( rulePermission )
            {
            // InternalAndroidGeneratorParser.g:3908:2: ( rulePermission )
            // InternalAndroidGeneratorParser.g:3909:3: rulePermission
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__PermissionsAssignment_1"


    // $ANTLR start "rule__ApplicationPermissionList__PermissionsAssignment_2_1"
    // InternalAndroidGeneratorParser.g:3918:1: rule__ApplicationPermissionList__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3922:1: ( ( rulePermission ) )
            // InternalAndroidGeneratorParser.g:3923:2: ( rulePermission )
            {
            // InternalAndroidGeneratorParser.g:3923:2: ( rulePermission )
            // InternalAndroidGeneratorParser.g:3924:3: rulePermission
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationPermissionList__PermissionsAssignment_2_1"


    // $ANTLR start "rule__Permission__NameAssignment"
    // InternalAndroidGeneratorParser.g:3933:1: rule__Permission__NameAssignment : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Permission__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3937:1: ( ( RULE_PACKAGE_NAME ) )
            // InternalAndroidGeneratorParser.g:3938:2: ( RULE_PACKAGE_NAME )
            {
            // InternalAndroidGeneratorParser.g:3938:2: ( RULE_PACKAGE_NAME )
            // InternalAndroidGeneratorParser.g:3939:3: RULE_PACKAGE_NAME
            {
             before(grammarAccess.getPermissionAccess().getNamePACKAGE_NAMETerminalRuleCall_0()); 
            match(input,RULE_PACKAGE_NAME,FOLLOW_2); 
             after(grammarAccess.getPermissionAccess().getNamePACKAGE_NAMETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__NameAssignment"


    // $ANTLR start "rule__ApplicationElementList__ElementsAssignment_3"
    // InternalAndroidGeneratorParser.g:3948:1: rule__ApplicationElementList__ElementsAssignment_3 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3952:1: ( ( ruleApplicationElement ) )
            // InternalAndroidGeneratorParser.g:3953:2: ( ruleApplicationElement )
            {
            // InternalAndroidGeneratorParser.g:3953:2: ( ruleApplicationElement )
            // InternalAndroidGeneratorParser.g:3954:3: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__ElementsAssignment_3"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalAndroidGeneratorParser.g:3963:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3967:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:3968:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:3968:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:3969:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Fragment__NameAssignment_1"
    // InternalAndroidGeneratorParser.g:3978:1: rule__Fragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3982:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:3983:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:3983:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:3984:3: RULE_ID
            {
             before(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__NameAssignment_1"


    // $ANTLR start "rule__Fragment__FragmentAttributesAssignment_2"
    // InternalAndroidGeneratorParser.g:3993:1: rule__Fragment__FragmentAttributesAssignment_2 : ( ruleFragmentLayoutAttributes ) ;
    public final void rule__Fragment__FragmentAttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3997:1: ( ( ruleFragmentLayoutAttributes ) )
            // InternalAndroidGeneratorParser.g:3998:2: ( ruleFragmentLayoutAttributes )
            {
            // InternalAndroidGeneratorParser.g:3998:2: ( ruleFragmentLayoutAttributes )
            // InternalAndroidGeneratorParser.g:3999:3: ruleFragmentLayoutAttributes
            {
             before(grammarAccess.getFragmentAccess().getFragmentAttributesFragmentLayoutAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFragmentLayoutAttributes();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getFragmentAttributesFragmentLayoutAttributesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__FragmentAttributesAssignment_2"


    // $ANTLR start "rule__FragmentLayoutAttributes__LayoutElementsAssignment_1"
    // InternalAndroidGeneratorParser.g:4008:1: rule__FragmentLayoutAttributes__LayoutElementsAssignment_1 : ( ruleLayoutElement ) ;
    public final void rule__FragmentLayoutAttributes__LayoutElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4012:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGeneratorParser.g:4013:2: ( ruleLayoutElement )
            {
            // InternalAndroidGeneratorParser.g:4013:2: ( ruleLayoutElement )
            // InternalAndroidGeneratorParser.g:4014:3: ruleLayoutElement
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__LayoutElementsAssignment_1"


    // $ANTLR start "rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1"
    // InternalAndroidGeneratorParser.g:4023:1: rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1 : ( ruleLayoutElement ) ;
    public final void rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4027:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGeneratorParser.g:4028:2: ( ruleLayoutElement )
            {
            // InternalAndroidGeneratorParser.g:4028:2: ( ruleLayoutElement )
            // InternalAndroidGeneratorParser.g:4029:3: ruleLayoutElement
            {
             before(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getFragmentLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentLayoutAttributes__LayoutElementsAssignment_2_1"


    // $ANTLR start "rule__TypeMap__FragmenttypeattributeAssignment_2"
    // InternalAndroidGeneratorParser.g:4038:1: rule__TypeMap__FragmenttypeattributeAssignment_2 : ( ruleFragmentTypeAttributes ) ;
    public final void rule__TypeMap__FragmenttypeattributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4042:1: ( ( ruleFragmentTypeAttributes ) )
            // InternalAndroidGeneratorParser.g:4043:2: ( ruleFragmentTypeAttributes )
            {
            // InternalAndroidGeneratorParser.g:4043:2: ( ruleFragmentTypeAttributes )
            // InternalAndroidGeneratorParser.g:4044:3: ruleFragmentTypeAttributes
            {
             before(grammarAccess.getTypeMapAccess().getFragmenttypeattributeFragmentTypeAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFragmentTypeAttributes();

            state._fsp--;

             after(grammarAccess.getTypeMapAccess().getFragmenttypeattributeFragmentTypeAttributesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMap__FragmenttypeattributeAssignment_2"


    // $ANTLR start "rule__FragmentTypeAttributes__FilterAssignment"
    // InternalAndroidGeneratorParser.g:4053:1: rule__FragmentTypeAttributes__FilterAssignment : ( ruleFilterQuery ) ;
    public final void rule__FragmentTypeAttributes__FilterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4057:1: ( ( ruleFilterQuery ) )
            // InternalAndroidGeneratorParser.g:4058:2: ( ruleFilterQuery )
            {
            // InternalAndroidGeneratorParser.g:4058:2: ( ruleFilterQuery )
            // InternalAndroidGeneratorParser.g:4059:3: ruleFilterQuery
            {
             before(grammarAccess.getFragmentTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterQuery();

            state._fsp--;

             after(grammarAccess.getFragmentTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FragmentTypeAttributes__FilterAssignment"


    // $ANTLR start "rule__EditText__NameAssignment_1"
    // InternalAndroidGeneratorParser.g:4068:1: rule__EditText__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EditText__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4072:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4073:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4073:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4074:3: RULE_ID
            {
             before(grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__NameAssignment_1"


    // $ANTLR start "rule__Spinner__NameAssignment_1"
    // InternalAndroidGeneratorParser.g:4083:1: rule__Spinner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Spinner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4087:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4088:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4088:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4089:3: RULE_ID
            {
             before(grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__NameAssignment_1"


    // $ANTLR start "rule__Spinner__SpinnerconAssignment_2_2"
    // InternalAndroidGeneratorParser.g:4098:1: rule__Spinner__SpinnerconAssignment_2_2 : ( ruleSpinnerCon ) ;
    public final void rule__Spinner__SpinnerconAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4102:1: ( ( ruleSpinnerCon ) )
            // InternalAndroidGeneratorParser.g:4103:2: ( ruleSpinnerCon )
            {
            // InternalAndroidGeneratorParser.g:4103:2: ( ruleSpinnerCon )
            // InternalAndroidGeneratorParser.g:4104:3: ruleSpinnerCon
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerconSpinnerConParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSpinnerCon();

            state._fsp--;

             after(grammarAccess.getSpinnerAccess().getSpinnerconSpinnerConParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__SpinnerconAssignment_2_2"


    // $ANTLR start "rule__Spinner__SpinnerconAssignment_2_3_1"
    // InternalAndroidGeneratorParser.g:4113:1: rule__Spinner__SpinnerconAssignment_2_3_1 : ( ruleSpinnerCon ) ;
    public final void rule__Spinner__SpinnerconAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4117:1: ( ( ruleSpinnerCon ) )
            // InternalAndroidGeneratorParser.g:4118:2: ( ruleSpinnerCon )
            {
            // InternalAndroidGeneratorParser.g:4118:2: ( ruleSpinnerCon )
            // InternalAndroidGeneratorParser.g:4119:3: ruleSpinnerCon
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerconSpinnerConParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpinnerCon();

            state._fsp--;

             after(grammarAccess.getSpinnerAccess().getSpinnerconSpinnerConParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__SpinnerconAssignment_2_3_1"


    // $ANTLR start "rule__SpinnerCon__TextAssignment"
    // InternalAndroidGeneratorParser.g:4128:1: rule__SpinnerCon__TextAssignment : ( RULE_STRING ) ;
    public final void rule__SpinnerCon__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4132:1: ( ( RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:4133:2: ( RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:4133:2: ( RULE_STRING )
            // InternalAndroidGeneratorParser.g:4134:3: RULE_STRING
            {
             before(grammarAccess.getSpinnerConAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSpinnerConAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpinnerCon__TextAssignment"


    // $ANTLR start "rule__TextView__NameAssignment_1"
    // InternalAndroidGeneratorParser.g:4143:1: rule__TextView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4147:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4148:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4148:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4149:3: RULE_ID
            {
             before(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__NameAssignment_1"


    // $ANTLR start "rule__TextView__TextAssignment_4"
    // InternalAndroidGeneratorParser.g:4158:1: rule__TextView__TextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TextView__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4162:1: ( ( RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:4163:2: ( RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:4163:2: ( RULE_STRING )
            // InternalAndroidGeneratorParser.g:4164:3: RULE_STRING
            {
             before(grammarAccess.getTextViewAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getTextSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__TextAssignment_4"


    // $ANTLR start "rule__Button__NameAssignment_2"
    // InternalAndroidGeneratorParser.g:4173:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4177:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4178:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4178:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4179:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__NameAssignment_2"


    // $ANTLR start "rule__Button__ActionsAssignment_4_0"
    // InternalAndroidGeneratorParser.g:4188:1: rule__Button__ActionsAssignment_4_0 : ( ruleButtonActions ) ;
    public final void rule__Button__ActionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4192:1: ( ( ruleButtonActions ) )
            // InternalAndroidGeneratorParser.g:4193:2: ( ruleButtonActions )
            {
            // InternalAndroidGeneratorParser.g:4193:2: ( ruleButtonActions )
            // InternalAndroidGeneratorParser.g:4194:3: ruleButtonActions
            {
             before(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleButtonActions();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ActionsAssignment_4_0"


    // $ANTLR start "rule__Button__ActionsAssignment_4_1_1"
    // InternalAndroidGeneratorParser.g:4203:1: rule__Button__ActionsAssignment_4_1_1 : ( ruleButtonActions ) ;
    public final void rule__Button__ActionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4207:1: ( ( ruleButtonActions ) )
            // InternalAndroidGeneratorParser.g:4208:2: ( ruleButtonActions )
            {
            // InternalAndroidGeneratorParser.g:4208:2: ( ruleButtonActions )
            // InternalAndroidGeneratorParser.g:4209:3: ruleButtonActions
            {
             before(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleButtonActions();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ActionsAssignment_4_1_1"


    // $ANTLR start "rule__Toast__TextAssignment_1"
    // InternalAndroidGeneratorParser.g:4218:1: rule__Toast__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Toast__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4222:1: ( ( RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:4223:2: ( RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:4223:2: ( RULE_STRING )
            // InternalAndroidGeneratorParser.g:4224:3: RULE_STRING
            {
             before(grammarAccess.getToastAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getToastAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Toast__TextAssignment_1"


    // $ANTLR start "rule__Bundle__BundleRecipientAssignment_1"
    // InternalAndroidGeneratorParser.g:4233:1: rule__Bundle__BundleRecipientAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bundle__BundleRecipientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4237:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:4238:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGeneratorParser.g:4238:2: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4239:3: ( RULE_ID )
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_1_0()); 
            // InternalAndroidGeneratorParser.g:4240:3: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4241:4: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientFragmentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBundleAccess().getBundleRecipientFragmentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__BundleRecipientAssignment_1"


    // $ANTLR start "rule__Bundle__HolderAssignment_2"
    // InternalAndroidGeneratorParser.g:4252:1: rule__Bundle__HolderAssignment_2 : ( ruleHolder ) ;
    public final void rule__Bundle__HolderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4256:1: ( ( ruleHolder ) )
            // InternalAndroidGeneratorParser.g:4257:2: ( ruleHolder )
            {
            // InternalAndroidGeneratorParser.g:4257:2: ( ruleHolder )
            // InternalAndroidGeneratorParser.g:4258:3: ruleHolder
            {
             before(grammarAccess.getBundleAccess().getHolderHolderParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHolder();

            state._fsp--;

             after(grammarAccess.getBundleAccess().getHolderHolderParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__HolderAssignment_2"


    // $ANTLR start "rule__Holder__HolAssignment_1"
    // InternalAndroidGeneratorParser.g:4267:1: rule__Holder__HolAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Holder__HolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4271:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:4272:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGeneratorParser.g:4272:2: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4273:3: ( RULE_ID )
            {
             before(grammarAccess.getHolderAccess().getHolDataholdersCrossReference_1_0()); 
            // InternalAndroidGeneratorParser.g:4274:3: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4275:4: RULE_ID
            {
             before(grammarAccess.getHolderAccess().getHolDataholdersIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHolderAccess().getHolDataholdersIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getHolderAccess().getHolDataholdersCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__HolAssignment_1"


    // $ANTLR start "rule__Holder__HolAssignment_2_1"
    // InternalAndroidGeneratorParser.g:4286:1: rule__Holder__HolAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Holder__HolAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4290:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:4291:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGeneratorParser.g:4291:2: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4292:3: ( RULE_ID )
            {
             before(grammarAccess.getHolderAccess().getHolDataholdersCrossReference_2_1_0()); 
            // InternalAndroidGeneratorParser.g:4293:3: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4294:4: RULE_ID
            {
             before(grammarAccess.getHolderAccess().getHolDataholdersIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHolderAccess().getHolDataholdersIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getHolderAccess().getHolDataholdersCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Holder__HolAssignment_2_1"


    // $ANTLR start "rule__FilterQuery__NameAssignment_2"
    // InternalAndroidGeneratorParser.g:4305:1: rule__FilterQuery__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FilterQuery__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4309:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4310:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4310:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4311:3: RULE_ID
            {
             before(grammarAccess.getFilterQueryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterQueryAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__NameAssignment_2"


    // $ANTLR start "rule__FilterQuery__FilterAttributesAssignment_3"
    // InternalAndroidGeneratorParser.g:4320:1: rule__FilterQuery__FilterAttributesAssignment_3 : ( ruleFilterAttributes ) ;
    public final void rule__FilterQuery__FilterAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4324:1: ( ( ruleFilterAttributes ) )
            // InternalAndroidGeneratorParser.g:4325:2: ( ruleFilterAttributes )
            {
            // InternalAndroidGeneratorParser.g:4325:2: ( ruleFilterAttributes )
            // InternalAndroidGeneratorParser.g:4326:3: ruleFilterAttributes
            {
             before(grammarAccess.getFilterQueryAccess().getFilterAttributesFilterAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterAttributes();

            state._fsp--;

             after(grammarAccess.getFilterQueryAccess().getFilterAttributesFilterAttributesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterQuery__FilterAttributesAssignment_3"


    // $ANTLR start "rule__FilterAttributes__DistanceAssignment"
    // InternalAndroidGeneratorParser.g:4335:1: rule__FilterAttributes__DistanceAssignment : ( ruleDistance ) ;
    public final void rule__FilterAttributes__DistanceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4339:1: ( ( ruleDistance ) )
            // InternalAndroidGeneratorParser.g:4340:2: ( ruleDistance )
            {
            // InternalAndroidGeneratorParser.g:4340:2: ( ruleDistance )
            // InternalAndroidGeneratorParser.g:4341:3: ruleDistance
            {
             before(grammarAccess.getFilterAttributesAccess().getDistanceDistanceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getFilterAttributesAccess().getDistanceDistanceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterAttributes__DistanceAssignment"


    // $ANTLR start "rule__Distance__UnitAssignment_2"
    // InternalAndroidGeneratorParser.g:4350:1: rule__Distance__UnitAssignment_2 : ( ruleUnit ) ;
    public final void rule__Distance__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4354:1: ( ( ruleUnit ) )
            // InternalAndroidGeneratorParser.g:4355:2: ( ruleUnit )
            {
            // InternalAndroidGeneratorParser.g:4355:2: ( ruleUnit )
            // InternalAndroidGeneratorParser.g:4356:3: ruleUnit
            {
             before(grammarAccess.getDistanceAccess().getUnitUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getDistanceAccess().getUnitUnitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__UnitAssignment_2"


    // $ANTLR start "rule__Distance__OperatorAssignment_3"
    // InternalAndroidGeneratorParser.g:4365:1: rule__Distance__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__Distance__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4369:1: ( ( ruleOperator ) )
            // InternalAndroidGeneratorParser.g:4370:2: ( ruleOperator )
            {
            // InternalAndroidGeneratorParser.g:4370:2: ( ruleOperator )
            // InternalAndroidGeneratorParser.g:4371:3: ruleOperator
            {
             before(grammarAccess.getDistanceAccess().getOperatorOperatorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getDistanceAccess().getOperatorOperatorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__OperatorAssignment_3"


    // $ANTLR start "rule__Distance__ResultsAssignment_4"
    // InternalAndroidGeneratorParser.g:4380:1: rule__Distance__ResultsAssignment_4 : ( ruleNumber ) ;
    public final void rule__Distance__ResultsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4384:1: ( ( ruleNumber ) )
            // InternalAndroidGeneratorParser.g:4385:2: ( ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:4385:2: ( ruleNumber )
            // InternalAndroidGeneratorParser.g:4386:3: ruleNumber
            {
             before(grammarAccess.getDistanceAccess().getResultsNumberParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getDistanceAccess().getResultsNumberParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__ResultsAssignment_4"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalAndroidGeneratorParser.g:4395:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4399:1: ( ( RULE_INT ) )
            // InternalAndroidGeneratorParser.g:4400:2: ( RULE_INT )
            {
            // InternalAndroidGeneratorParser.g:4400:2: ( RULE_INT )
            // InternalAndroidGeneratorParser.g:4401:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000240L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000242L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100080400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080402L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000829900L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100110000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});

}