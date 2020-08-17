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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AndroidSDK", "FilterQuery", "MinimumSDK", "Permissions", "TargetSDK", "Distance", "EditText", "Fragment", "Settings", "Textview", "Elements", "Content", "Spinner", "Content_1", "Bundle", "Button", "Holder", "Model", "Toast", "App", "Map", "Comma", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "F", "M", "RULE_ID", "RULE_PACKAGE_NAME", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    		tokenNameToValue.put("Model", "'Model'");
    		tokenNameToValue.put("Toast", "'Toast'");
    		tokenNameToValue.put("Bundle", "'Bundle'");
    		tokenNameToValue.put("Button", "'Button'");
    		tokenNameToValue.put("Holder", "'Holder'");
    		tokenNameToValue.put("Content", "'Content'");
    		tokenNameToValue.put("Spinner", "'Spinner'");
    		tokenNameToValue.put("Content_1", "'content'");
    		tokenNameToValue.put("Distance", "'Distance'");
    		tokenNameToValue.put("EditText", "'EditText'");
    		tokenNameToValue.put("Fragment", "'Fragment'");
    		tokenNameToValue.put("Settings", "'Settings'");
    		tokenNameToValue.put("Textview", "'Textview'");
    		tokenNameToValue.put("Elements", "'elements'");
    		tokenNameToValue.put("TargetSDK", "'Target-SDK'");
    		tokenNameToValue.put("AndroidSDK", "'Android-SDK'");
    		tokenNameToValue.put("FilterQuery", "'FilterQuery'");
    		tokenNameToValue.put("MinimumSDK", "'Minimum-SDK'");
    		tokenNameToValue.put("Permissions", "'permissions'");
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
    // InternalAndroidGeneratorParser.g:83:1: entryRuleAndroidAppProject : ruleAndroidAppProject EOF ;
    public final void entryRuleAndroidAppProject() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:84:1: ( ruleAndroidAppProject EOF )
            // InternalAndroidGeneratorParser.g:85:1: ruleAndroidAppProject EOF
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
    // InternalAndroidGeneratorParser.g:92:1: ruleAndroidAppProject : ( ( rule__AndroidAppProject__ApplicationsAssignment )* ) ;
    public final void ruleAndroidAppProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:96:2: ( ( ( rule__AndroidAppProject__ApplicationsAssignment )* ) )
            // InternalAndroidGeneratorParser.g:97:2: ( ( rule__AndroidAppProject__ApplicationsAssignment )* )
            {
            // InternalAndroidGeneratorParser.g:97:2: ( ( rule__AndroidAppProject__ApplicationsAssignment )* )
            // InternalAndroidGeneratorParser.g:98:3: ( rule__AndroidAppProject__ApplicationsAssignment )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment()); 
            // InternalAndroidGeneratorParser.g:99:3: ( rule__AndroidAppProject__ApplicationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==App) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:99:4: rule__AndroidAppProject__ApplicationsAssignment
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
    // InternalAndroidGeneratorParser.g:108:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:109:1: ( ruleApplication EOF )
            // InternalAndroidGeneratorParser.g:110:1: ruleApplication EOF
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
    // InternalAndroidGeneratorParser.g:117:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:121:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:122:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:122:2: ( ( rule__Application__Group__0 ) )
            // InternalAndroidGeneratorParser.g:123:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:124:3: ( rule__Application__Group__0 )
            // InternalAndroidGeneratorParser.g:124:4: rule__Application__Group__0
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
    // InternalAndroidGeneratorParser.g:133:1: entryRuleApplicationAttribute : ruleApplicationAttribute EOF ;
    public final void entryRuleApplicationAttribute() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:134:1: ( ruleApplicationAttribute EOF )
            // InternalAndroidGeneratorParser.g:135:1: ruleApplicationAttribute EOF
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
    // InternalAndroidGeneratorParser.g:142:1: ruleApplicationAttribute : ( ( rule__ApplicationAttribute__Alternatives ) ) ;
    public final void ruleApplicationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:146:2: ( ( ( rule__ApplicationAttribute__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:147:2: ( ( rule__ApplicationAttribute__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:147:2: ( ( rule__ApplicationAttribute__Alternatives ) )
            // InternalAndroidGeneratorParser.g:148:3: ( rule__ApplicationAttribute__Alternatives )
            {
             before(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:149:3: ( rule__ApplicationAttribute__Alternatives )
            // InternalAndroidGeneratorParser.g:149:4: rule__ApplicationAttribute__Alternatives
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
    // InternalAndroidGeneratorParser.g:158:1: entryRuleApplicationVersion : ruleApplicationVersion EOF ;
    public final void entryRuleApplicationVersion() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:159:1: ( ruleApplicationVersion EOF )
            // InternalAndroidGeneratorParser.g:160:1: ruleApplicationVersion EOF
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
    // InternalAndroidGeneratorParser.g:167:1: ruleApplicationVersion : ( ( rule__ApplicationVersion__Group__0 ) ) ;
    public final void ruleApplicationVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:171:2: ( ( ( rule__ApplicationVersion__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:172:2: ( ( rule__ApplicationVersion__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:172:2: ( ( rule__ApplicationVersion__Group__0 ) )
            // InternalAndroidGeneratorParser.g:173:3: ( rule__ApplicationVersion__Group__0 )
            {
             before(grammarAccess.getApplicationVersionAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:174:3: ( rule__ApplicationVersion__Group__0 )
            // InternalAndroidGeneratorParser.g:174:4: rule__ApplicationVersion__Group__0
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
    // InternalAndroidGeneratorParser.g:183:1: entryRuleTargetSDK : ruleTargetSDK EOF ;
    public final void entryRuleTargetSDK() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:184:1: ( ruleTargetSDK EOF )
            // InternalAndroidGeneratorParser.g:185:1: ruleTargetSDK EOF
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
    // InternalAndroidGeneratorParser.g:192:1: ruleTargetSDK : ( ( rule__TargetSDK__Group__0 ) ) ;
    public final void ruleTargetSDK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:196:2: ( ( ( rule__TargetSDK__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:197:2: ( ( rule__TargetSDK__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:197:2: ( ( rule__TargetSDK__Group__0 ) )
            // InternalAndroidGeneratorParser.g:198:3: ( rule__TargetSDK__Group__0 )
            {
             before(grammarAccess.getTargetSDKAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:199:3: ( rule__TargetSDK__Group__0 )
            // InternalAndroidGeneratorParser.g:199:4: rule__TargetSDK__Group__0
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
    // InternalAndroidGeneratorParser.g:208:1: entryRuleMinSDK : ruleMinSDK EOF ;
    public final void entryRuleMinSDK() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:209:1: ( ruleMinSDK EOF )
            // InternalAndroidGeneratorParser.g:210:1: ruleMinSDK EOF
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
    // InternalAndroidGeneratorParser.g:217:1: ruleMinSDK : ( ( rule__MinSDK__Group__0 ) ) ;
    public final void ruleMinSDK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:221:2: ( ( ( rule__MinSDK__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:222:2: ( ( rule__MinSDK__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:222:2: ( ( rule__MinSDK__Group__0 ) )
            // InternalAndroidGeneratorParser.g:223:3: ( rule__MinSDK__Group__0 )
            {
             before(grammarAccess.getMinSDKAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:224:3: ( rule__MinSDK__Group__0 )
            // InternalAndroidGeneratorParser.g:224:4: rule__MinSDK__Group__0
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
    // InternalAndroidGeneratorParser.g:233:1: entryRuleApplicationPermissionList : ruleApplicationPermissionList EOF ;
    public final void entryRuleApplicationPermissionList() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:234:1: ( ruleApplicationPermissionList EOF )
            // InternalAndroidGeneratorParser.g:235:1: ruleApplicationPermissionList EOF
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
    // InternalAndroidGeneratorParser.g:242:1: ruleApplicationPermissionList : ( ( rule__ApplicationPermissionList__Group__0 ) ) ;
    public final void ruleApplicationPermissionList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:246:2: ( ( ( rule__ApplicationPermissionList__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:247:2: ( ( rule__ApplicationPermissionList__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:247:2: ( ( rule__ApplicationPermissionList__Group__0 ) )
            // InternalAndroidGeneratorParser.g:248:3: ( rule__ApplicationPermissionList__Group__0 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:249:3: ( rule__ApplicationPermissionList__Group__0 )
            // InternalAndroidGeneratorParser.g:249:4: rule__ApplicationPermissionList__Group__0
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
    // InternalAndroidGeneratorParser.g:258:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:259:1: ( rulePermission EOF )
            // InternalAndroidGeneratorParser.g:260:1: rulePermission EOF
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
    // InternalAndroidGeneratorParser.g:267:1: rulePermission : ( ( rule__Permission__NameAssignment ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:271:2: ( ( ( rule__Permission__NameAssignment ) ) )
            // InternalAndroidGeneratorParser.g:272:2: ( ( rule__Permission__NameAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:272:2: ( ( rule__Permission__NameAssignment ) )
            // InternalAndroidGeneratorParser.g:273:3: ( rule__Permission__NameAssignment )
            {
             before(grammarAccess.getPermissionAccess().getNameAssignment()); 
            // InternalAndroidGeneratorParser.g:274:3: ( rule__Permission__NameAssignment )
            // InternalAndroidGeneratorParser.g:274:4: rule__Permission__NameAssignment
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
    // InternalAndroidGeneratorParser.g:283:1: entryRuleApplicationElementList : ruleApplicationElementList EOF ;
    public final void entryRuleApplicationElementList() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:284:1: ( ruleApplicationElementList EOF )
            // InternalAndroidGeneratorParser.g:285:1: ruleApplicationElementList EOF
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
    // InternalAndroidGeneratorParser.g:292:1: ruleApplicationElementList : ( ( rule__ApplicationElementList__Group__0 ) ) ;
    public final void ruleApplicationElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:296:2: ( ( ( rule__ApplicationElementList__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:297:2: ( ( rule__ApplicationElementList__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:297:2: ( ( rule__ApplicationElementList__Group__0 ) )
            // InternalAndroidGeneratorParser.g:298:3: ( rule__ApplicationElementList__Group__0 )
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:299:3: ( rule__ApplicationElementList__Group__0 )
            // InternalAndroidGeneratorParser.g:299:4: rule__ApplicationElementList__Group__0
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
    // InternalAndroidGeneratorParser.g:308:1: entryRuleApplicationElement : ruleApplicationElement EOF ;
    public final void entryRuleApplicationElement() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:309:1: ( ruleApplicationElement EOF )
            // InternalAndroidGeneratorParser.g:310:1: ruleApplicationElement EOF
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
    // InternalAndroidGeneratorParser.g:317:1: ruleApplicationElement : ( ( rule__ApplicationElement__Alternatives ) ) ;
    public final void ruleApplicationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:321:2: ( ( ( rule__ApplicationElement__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:322:2: ( ( rule__ApplicationElement__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:322:2: ( ( rule__ApplicationElement__Alternatives ) )
            // InternalAndroidGeneratorParser.g:323:3: ( rule__ApplicationElement__Alternatives )
            {
             before(grammarAccess.getApplicationElementAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:324:3: ( rule__ApplicationElement__Alternatives )
            // InternalAndroidGeneratorParser.g:324:4: rule__ApplicationElement__Alternatives
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
    // InternalAndroidGeneratorParser.g:333:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:334:1: ( ruleModel EOF )
            // InternalAndroidGeneratorParser.g:335:1: ruleModel EOF
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
    // InternalAndroidGeneratorParser.g:342:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:346:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:347:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:347:2: ( ( rule__Model__Group__0 ) )
            // InternalAndroidGeneratorParser.g:348:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:349:3: ( rule__Model__Group__0 )
            // InternalAndroidGeneratorParser.g:349:4: rule__Model__Group__0
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
    // InternalAndroidGeneratorParser.g:358:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:359:1: ( ruleFragment EOF )
            // InternalAndroidGeneratorParser.g:360:1: ruleFragment EOF
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
    // InternalAndroidGeneratorParser.g:367:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:371:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:372:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:372:2: ( ( rule__Fragment__Group__0 ) )
            // InternalAndroidGeneratorParser.g:373:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:374:3: ( rule__Fragment__Group__0 )
            // InternalAndroidGeneratorParser.g:374:4: rule__Fragment__Group__0
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


    // $ANTLR start "entryRuleActivityLayoutAttributes"
    // InternalAndroidGeneratorParser.g:383:1: entryRuleActivityLayoutAttributes : ruleActivityLayoutAttributes EOF ;
    public final void entryRuleActivityLayoutAttributes() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:384:1: ( ruleActivityLayoutAttributes EOF )
            // InternalAndroidGeneratorParser.g:385:1: ruleActivityLayoutAttributes EOF
            {
             before(grammarAccess.getActivityLayoutAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityLayoutAttributes();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributesRule()); 
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
    // $ANTLR end "entryRuleActivityLayoutAttributes"


    // $ANTLR start "ruleActivityLayoutAttributes"
    // InternalAndroidGeneratorParser.g:392:1: ruleActivityLayoutAttributes : ( ( rule__ActivityLayoutAttributes__Group__0 ) ) ;
    public final void ruleActivityLayoutAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:396:2: ( ( ( rule__ActivityLayoutAttributes__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:397:2: ( ( rule__ActivityLayoutAttributes__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:397:2: ( ( rule__ActivityLayoutAttributes__Group__0 ) )
            // InternalAndroidGeneratorParser.g:398:3: ( rule__ActivityLayoutAttributes__Group__0 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:399:3: ( rule__ActivityLayoutAttributes__Group__0 )
            // InternalAndroidGeneratorParser.g:399:4: rule__ActivityLayoutAttributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityLayoutAttributes"


    // $ANTLR start "entryRuleLayoutElement"
    // InternalAndroidGeneratorParser.g:408:1: entryRuleLayoutElement : ruleLayoutElement EOF ;
    public final void entryRuleLayoutElement() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:409:1: ( ruleLayoutElement EOF )
            // InternalAndroidGeneratorParser.g:410:1: ruleLayoutElement EOF
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
    // InternalAndroidGeneratorParser.g:417:1: ruleLayoutElement : ( ( rule__LayoutElement__Alternatives ) ) ;
    public final void ruleLayoutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:421:2: ( ( ( rule__LayoutElement__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:422:2: ( ( rule__LayoutElement__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:422:2: ( ( rule__LayoutElement__Alternatives ) )
            // InternalAndroidGeneratorParser.g:423:3: ( rule__LayoutElement__Alternatives )
            {
             before(grammarAccess.getLayoutElementAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:424:3: ( rule__LayoutElement__Alternatives )
            // InternalAndroidGeneratorParser.g:424:4: rule__LayoutElement__Alternatives
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
    // InternalAndroidGeneratorParser.g:433:1: entryRuleDataholders : ruleDataholders EOF ;
    public final void entryRuleDataholders() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:434:1: ( ruleDataholders EOF )
            // InternalAndroidGeneratorParser.g:435:1: ruleDataholders EOF
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
    // InternalAndroidGeneratorParser.g:442:1: ruleDataholders : ( ( rule__Dataholders__Alternatives ) ) ;
    public final void ruleDataholders() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:446:2: ( ( ( rule__Dataholders__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:447:2: ( ( rule__Dataholders__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:447:2: ( ( rule__Dataholders__Alternatives ) )
            // InternalAndroidGeneratorParser.g:448:3: ( rule__Dataholders__Alternatives )
            {
             before(grammarAccess.getDataholdersAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:449:3: ( rule__Dataholders__Alternatives )
            // InternalAndroidGeneratorParser.g:449:4: rule__Dataholders__Alternatives
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
    // InternalAndroidGeneratorParser.g:458:1: entryRuleTypeMap : ruleTypeMap EOF ;
    public final void entryRuleTypeMap() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:459:1: ( ruleTypeMap EOF )
            // InternalAndroidGeneratorParser.g:460:1: ruleTypeMap EOF
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
    // InternalAndroidGeneratorParser.g:467:1: ruleTypeMap : ( ( rule__TypeMap__Group__0 ) ) ;
    public final void ruleTypeMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:471:2: ( ( ( rule__TypeMap__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:472:2: ( ( rule__TypeMap__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:472:2: ( ( rule__TypeMap__Group__0 ) )
            // InternalAndroidGeneratorParser.g:473:3: ( rule__TypeMap__Group__0 )
            {
             before(grammarAccess.getTypeMapAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:474:3: ( rule__TypeMap__Group__0 )
            // InternalAndroidGeneratorParser.g:474:4: rule__TypeMap__Group__0
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
    // InternalAndroidGeneratorParser.g:483:1: entryRuleTypeSetting : ruleTypeSetting EOF ;
    public final void entryRuleTypeSetting() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:484:1: ( ruleTypeSetting EOF )
            // InternalAndroidGeneratorParser.g:485:1: ruleTypeSetting EOF
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
    // InternalAndroidGeneratorParser.g:492:1: ruleTypeSetting : ( ( rule__TypeSetting__Group__0 ) ) ;
    public final void ruleTypeSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:496:2: ( ( ( rule__TypeSetting__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:497:2: ( ( rule__TypeSetting__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:497:2: ( ( rule__TypeSetting__Group__0 ) )
            // InternalAndroidGeneratorParser.g:498:3: ( rule__TypeSetting__Group__0 )
            {
             before(grammarAccess.getTypeSettingAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:499:3: ( rule__TypeSetting__Group__0 )
            // InternalAndroidGeneratorParser.g:499:4: rule__TypeSetting__Group__0
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


    // $ANTLR start "entryRuleActivityTypeAttributes"
    // InternalAndroidGeneratorParser.g:508:1: entryRuleActivityTypeAttributes : ruleActivityTypeAttributes EOF ;
    public final void entryRuleActivityTypeAttributes() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:509:1: ( ruleActivityTypeAttributes EOF )
            // InternalAndroidGeneratorParser.g:510:1: ruleActivityTypeAttributes EOF
            {
             before(grammarAccess.getActivityTypeAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityTypeAttributes();

            state._fsp--;

             after(grammarAccess.getActivityTypeAttributesRule()); 
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
    // $ANTLR end "entryRuleActivityTypeAttributes"


    // $ANTLR start "ruleActivityTypeAttributes"
    // InternalAndroidGeneratorParser.g:517:1: ruleActivityTypeAttributes : ( ( rule__ActivityTypeAttributes__FilterAssignment ) ) ;
    public final void ruleActivityTypeAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:521:2: ( ( ( rule__ActivityTypeAttributes__FilterAssignment ) ) )
            // InternalAndroidGeneratorParser.g:522:2: ( ( rule__ActivityTypeAttributes__FilterAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:522:2: ( ( rule__ActivityTypeAttributes__FilterAssignment ) )
            // InternalAndroidGeneratorParser.g:523:3: ( rule__ActivityTypeAttributes__FilterAssignment )
            {
             before(grammarAccess.getActivityTypeAttributesAccess().getFilterAssignment()); 
            // InternalAndroidGeneratorParser.g:524:3: ( rule__ActivityTypeAttributes__FilterAssignment )
            // InternalAndroidGeneratorParser.g:524:4: rule__ActivityTypeAttributes__FilterAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ActivityTypeAttributes__FilterAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActivityTypeAttributesAccess().getFilterAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityTypeAttributes"


    // $ANTLR start "entryRuleEditText"
    // InternalAndroidGeneratorParser.g:533:1: entryRuleEditText : ruleEditText EOF ;
    public final void entryRuleEditText() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:534:1: ( ruleEditText EOF )
            // InternalAndroidGeneratorParser.g:535:1: ruleEditText EOF
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
    // InternalAndroidGeneratorParser.g:542:1: ruleEditText : ( ( rule__EditText__Group__0 ) ) ;
    public final void ruleEditText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:546:2: ( ( ( rule__EditText__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:547:2: ( ( rule__EditText__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:547:2: ( ( rule__EditText__Group__0 ) )
            // InternalAndroidGeneratorParser.g:548:3: ( rule__EditText__Group__0 )
            {
             before(grammarAccess.getEditTextAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:549:3: ( rule__EditText__Group__0 )
            // InternalAndroidGeneratorParser.g:549:4: rule__EditText__Group__0
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
    // InternalAndroidGeneratorParser.g:558:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:559:1: ( ruleSpinner EOF )
            // InternalAndroidGeneratorParser.g:560:1: ruleSpinner EOF
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
    // InternalAndroidGeneratorParser.g:567:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:571:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:572:2: ( ( rule__Spinner__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:572:2: ( ( rule__Spinner__Group__0 ) )
            // InternalAndroidGeneratorParser.g:573:3: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:574:3: ( rule__Spinner__Group__0 )
            // InternalAndroidGeneratorParser.g:574:4: rule__Spinner__Group__0
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
    // InternalAndroidGeneratorParser.g:583:1: entryRuleSpinnerCon : ruleSpinnerCon EOF ;
    public final void entryRuleSpinnerCon() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:584:1: ( ruleSpinnerCon EOF )
            // InternalAndroidGeneratorParser.g:585:1: ruleSpinnerCon EOF
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
    // InternalAndroidGeneratorParser.g:592:1: ruleSpinnerCon : ( ( rule__SpinnerCon__TextAssignment ) ) ;
    public final void ruleSpinnerCon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:596:2: ( ( ( rule__SpinnerCon__TextAssignment ) ) )
            // InternalAndroidGeneratorParser.g:597:2: ( ( rule__SpinnerCon__TextAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:597:2: ( ( rule__SpinnerCon__TextAssignment ) )
            // InternalAndroidGeneratorParser.g:598:3: ( rule__SpinnerCon__TextAssignment )
            {
             before(grammarAccess.getSpinnerConAccess().getTextAssignment()); 
            // InternalAndroidGeneratorParser.g:599:3: ( rule__SpinnerCon__TextAssignment )
            // InternalAndroidGeneratorParser.g:599:4: rule__SpinnerCon__TextAssignment
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
    // InternalAndroidGeneratorParser.g:608:1: entryRuleTextView : ruleTextView EOF ;
    public final void entryRuleTextView() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:609:1: ( ruleTextView EOF )
            // InternalAndroidGeneratorParser.g:610:1: ruleTextView EOF
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
    // InternalAndroidGeneratorParser.g:617:1: ruleTextView : ( ( rule__TextView__Group__0 ) ) ;
    public final void ruleTextView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:621:2: ( ( ( rule__TextView__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:622:2: ( ( rule__TextView__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:622:2: ( ( rule__TextView__Group__0 ) )
            // InternalAndroidGeneratorParser.g:623:3: ( rule__TextView__Group__0 )
            {
             before(grammarAccess.getTextViewAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:624:3: ( rule__TextView__Group__0 )
            // InternalAndroidGeneratorParser.g:624:4: rule__TextView__Group__0
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
    // InternalAndroidGeneratorParser.g:633:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:634:1: ( ruleButton EOF )
            // InternalAndroidGeneratorParser.g:635:1: ruleButton EOF
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
    // InternalAndroidGeneratorParser.g:642:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:646:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:647:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:647:2: ( ( rule__Button__Group__0 ) )
            // InternalAndroidGeneratorParser.g:648:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:649:3: ( rule__Button__Group__0 )
            // InternalAndroidGeneratorParser.g:649:4: rule__Button__Group__0
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
    // InternalAndroidGeneratorParser.g:658:1: entryRuleButtonActions : ruleButtonActions EOF ;
    public final void entryRuleButtonActions() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:659:1: ( ruleButtonActions EOF )
            // InternalAndroidGeneratorParser.g:660:1: ruleButtonActions EOF
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
    // InternalAndroidGeneratorParser.g:667:1: ruleButtonActions : ( ( rule__ButtonActions__Alternatives ) ) ;
    public final void ruleButtonActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:671:2: ( ( ( rule__ButtonActions__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:672:2: ( ( rule__ButtonActions__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:672:2: ( ( rule__ButtonActions__Alternatives ) )
            // InternalAndroidGeneratorParser.g:673:3: ( rule__ButtonActions__Alternatives )
            {
             before(grammarAccess.getButtonActionsAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:674:3: ( rule__ButtonActions__Alternatives )
            // InternalAndroidGeneratorParser.g:674:4: rule__ButtonActions__Alternatives
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
    // InternalAndroidGeneratorParser.g:683:1: entryRuleToast : ruleToast EOF ;
    public final void entryRuleToast() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:684:1: ( ruleToast EOF )
            // InternalAndroidGeneratorParser.g:685:1: ruleToast EOF
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
    // InternalAndroidGeneratorParser.g:692:1: ruleToast : ( ( rule__Toast__Group__0 ) ) ;
    public final void ruleToast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:696:2: ( ( ( rule__Toast__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:697:2: ( ( rule__Toast__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:697:2: ( ( rule__Toast__Group__0 ) )
            // InternalAndroidGeneratorParser.g:698:3: ( rule__Toast__Group__0 )
            {
             before(grammarAccess.getToastAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:699:3: ( rule__Toast__Group__0 )
            // InternalAndroidGeneratorParser.g:699:4: rule__Toast__Group__0
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
    // InternalAndroidGeneratorParser.g:708:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:709:1: ( ruleBundle EOF )
            // InternalAndroidGeneratorParser.g:710:1: ruleBundle EOF
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
    // InternalAndroidGeneratorParser.g:717:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:721:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:722:2: ( ( rule__Bundle__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:722:2: ( ( rule__Bundle__Group__0 ) )
            // InternalAndroidGeneratorParser.g:723:3: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:724:3: ( rule__Bundle__Group__0 )
            // InternalAndroidGeneratorParser.g:724:4: rule__Bundle__Group__0
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
    // InternalAndroidGeneratorParser.g:733:1: entryRuleHolder : ruleHolder EOF ;
    public final void entryRuleHolder() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:734:1: ( ruleHolder EOF )
            // InternalAndroidGeneratorParser.g:735:1: ruleHolder EOF
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
    // InternalAndroidGeneratorParser.g:742:1: ruleHolder : ( ( rule__Holder__Group__0 ) ) ;
    public final void ruleHolder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:746:2: ( ( ( rule__Holder__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:747:2: ( ( rule__Holder__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:747:2: ( ( rule__Holder__Group__0 ) )
            // InternalAndroidGeneratorParser.g:748:3: ( rule__Holder__Group__0 )
            {
             before(grammarAccess.getHolderAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:749:3: ( rule__Holder__Group__0 )
            // InternalAndroidGeneratorParser.g:749:4: rule__Holder__Group__0
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
    // InternalAndroidGeneratorParser.g:758:1: entryRuleFilterQuery : ruleFilterQuery EOF ;
    public final void entryRuleFilterQuery() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:759:1: ( ruleFilterQuery EOF )
            // InternalAndroidGeneratorParser.g:760:1: ruleFilterQuery EOF
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
    // InternalAndroidGeneratorParser.g:767:1: ruleFilterQuery : ( ( rule__FilterQuery__Group__0 ) ) ;
    public final void ruleFilterQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:771:2: ( ( ( rule__FilterQuery__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:772:2: ( ( rule__FilterQuery__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:772:2: ( ( rule__FilterQuery__Group__0 ) )
            // InternalAndroidGeneratorParser.g:773:3: ( rule__FilterQuery__Group__0 )
            {
             before(grammarAccess.getFilterQueryAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:774:3: ( rule__FilterQuery__Group__0 )
            // InternalAndroidGeneratorParser.g:774:4: rule__FilterQuery__Group__0
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
    // InternalAndroidGeneratorParser.g:783:1: entryRuleFilterAttributes : ruleFilterAttributes EOF ;
    public final void entryRuleFilterAttributes() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:784:1: ( ruleFilterAttributes EOF )
            // InternalAndroidGeneratorParser.g:785:1: ruleFilterAttributes EOF
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
    // InternalAndroidGeneratorParser.g:792:1: ruleFilterAttributes : ( ( rule__FilterAttributes__DistanceAssignment ) ) ;
    public final void ruleFilterAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:796:2: ( ( ( rule__FilterAttributes__DistanceAssignment ) ) )
            // InternalAndroidGeneratorParser.g:797:2: ( ( rule__FilterAttributes__DistanceAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:797:2: ( ( rule__FilterAttributes__DistanceAssignment ) )
            // InternalAndroidGeneratorParser.g:798:3: ( rule__FilterAttributes__DistanceAssignment )
            {
             before(grammarAccess.getFilterAttributesAccess().getDistanceAssignment()); 
            // InternalAndroidGeneratorParser.g:799:3: ( rule__FilterAttributes__DistanceAssignment )
            // InternalAndroidGeneratorParser.g:799:4: rule__FilterAttributes__DistanceAssignment
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
    // InternalAndroidGeneratorParser.g:808:1: entryRuleDistance : ruleDistance EOF ;
    public final void entryRuleDistance() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:809:1: ( ruleDistance EOF )
            // InternalAndroidGeneratorParser.g:810:1: ruleDistance EOF
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
    // InternalAndroidGeneratorParser.g:817:1: ruleDistance : ( ( rule__Distance__Group__0 ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:821:2: ( ( ( rule__Distance__Group__0 ) ) )
            // InternalAndroidGeneratorParser.g:822:2: ( ( rule__Distance__Group__0 ) )
            {
            // InternalAndroidGeneratorParser.g:822:2: ( ( rule__Distance__Group__0 ) )
            // InternalAndroidGeneratorParser.g:823:3: ( rule__Distance__Group__0 )
            {
             before(grammarAccess.getDistanceAccess().getGroup()); 
            // InternalAndroidGeneratorParser.g:824:3: ( rule__Distance__Group__0 )
            // InternalAndroidGeneratorParser.g:824:4: rule__Distance__Group__0
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
    // InternalAndroidGeneratorParser.g:833:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:834:1: ( ruleNumber EOF )
            // InternalAndroidGeneratorParser.g:835:1: ruleNumber EOF
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
    // InternalAndroidGeneratorParser.g:842:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:846:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalAndroidGeneratorParser.g:847:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalAndroidGeneratorParser.g:847:2: ( ( rule__Number__ValueAssignment ) )
            // InternalAndroidGeneratorParser.g:848:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalAndroidGeneratorParser.g:849:3: ( rule__Number__ValueAssignment )
            // InternalAndroidGeneratorParser.g:849:4: rule__Number__ValueAssignment
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
    // InternalAndroidGeneratorParser.g:858:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:859:1: ( ruleOperator EOF )
            // InternalAndroidGeneratorParser.g:860:1: ruleOperator EOF
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
    // InternalAndroidGeneratorParser.g:867:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:871:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:872:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:872:2: ( ( rule__Operator__Alternatives ) )
            // InternalAndroidGeneratorParser.g:873:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:874:3: ( rule__Operator__Alternatives )
            // InternalAndroidGeneratorParser.g:874:4: rule__Operator__Alternatives
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
    // InternalAndroidGeneratorParser.g:883:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalAndroidGeneratorParser.g:884:1: ( ruleUnit EOF )
            // InternalAndroidGeneratorParser.g:885:1: ruleUnit EOF
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
    // InternalAndroidGeneratorParser.g:892:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:896:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalAndroidGeneratorParser.g:897:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalAndroidGeneratorParser.g:897:2: ( ( rule__Unit__Alternatives ) )
            // InternalAndroidGeneratorParser.g:898:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalAndroidGeneratorParser.g:899:3: ( rule__Unit__Alternatives )
            // InternalAndroidGeneratorParser.g:899:4: rule__Unit__Alternatives
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
    // InternalAndroidGeneratorParser.g:907:1: rule__ApplicationAttribute__Alternatives : ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:911:1: ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) )
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
                    // InternalAndroidGeneratorParser.g:912:2: ( ruleApplicationVersion )
                    {
                    // InternalAndroidGeneratorParser.g:912:2: ( ruleApplicationVersion )
                    // InternalAndroidGeneratorParser.g:913:3: ruleApplicationVersion
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
                    // InternalAndroidGeneratorParser.g:918:2: ( ruleApplicationPermissionList )
                    {
                    // InternalAndroidGeneratorParser.g:918:2: ( ruleApplicationPermissionList )
                    // InternalAndroidGeneratorParser.g:919:3: ruleApplicationPermissionList
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
                    // InternalAndroidGeneratorParser.g:924:2: ( ruleApplicationElementList )
                    {
                    // InternalAndroidGeneratorParser.g:924:2: ( ruleApplicationElementList )
                    // InternalAndroidGeneratorParser.g:925:3: ruleApplicationElementList
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
    // InternalAndroidGeneratorParser.g:934:1: rule__ApplicationElement__Alternatives : ( ( ruleFragment ) | ( ruleModel ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:938:1: ( ( ruleFragment ) | ( ruleModel ) )
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
                    // InternalAndroidGeneratorParser.g:939:2: ( ruleFragment )
                    {
                    // InternalAndroidGeneratorParser.g:939:2: ( ruleFragment )
                    // InternalAndroidGeneratorParser.g:940:3: ruleFragment
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
                    // InternalAndroidGeneratorParser.g:945:2: ( ruleModel )
                    {
                    // InternalAndroidGeneratorParser.g:945:2: ( ruleModel )
                    // InternalAndroidGeneratorParser.g:946:3: ruleModel
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
    // InternalAndroidGeneratorParser.g:955:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleDataholders ) | ( ruleTypeMap ) | ( ruleTypeSetting ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:959:1: ( ( ruleButton ) | ( ruleDataholders ) | ( ruleTypeMap ) | ( ruleTypeSetting ) )
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
                    // InternalAndroidGeneratorParser.g:960:2: ( ruleButton )
                    {
                    // InternalAndroidGeneratorParser.g:960:2: ( ruleButton )
                    // InternalAndroidGeneratorParser.g:961:3: ruleButton
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
                    // InternalAndroidGeneratorParser.g:966:2: ( ruleDataholders )
                    {
                    // InternalAndroidGeneratorParser.g:966:2: ( ruleDataholders )
                    // InternalAndroidGeneratorParser.g:967:3: ruleDataholders
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
                    // InternalAndroidGeneratorParser.g:972:2: ( ruleTypeMap )
                    {
                    // InternalAndroidGeneratorParser.g:972:2: ( ruleTypeMap )
                    // InternalAndroidGeneratorParser.g:973:3: ruleTypeMap
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
                    // InternalAndroidGeneratorParser.g:978:2: ( ruleTypeSetting )
                    {
                    // InternalAndroidGeneratorParser.g:978:2: ( ruleTypeSetting )
                    // InternalAndroidGeneratorParser.g:979:3: ruleTypeSetting
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
    // InternalAndroidGeneratorParser.g:988:1: rule__Dataholders__Alternatives : ( ( ruleEditText ) | ( ruleSpinner ) | ( ruleTextView ) );
    public final void rule__Dataholders__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:992:1: ( ( ruleEditText ) | ( ruleSpinner ) | ( ruleTextView ) )
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
                    // InternalAndroidGeneratorParser.g:993:2: ( ruleEditText )
                    {
                    // InternalAndroidGeneratorParser.g:993:2: ( ruleEditText )
                    // InternalAndroidGeneratorParser.g:994:3: ruleEditText
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
                    // InternalAndroidGeneratorParser.g:999:2: ( ruleSpinner )
                    {
                    // InternalAndroidGeneratorParser.g:999:2: ( ruleSpinner )
                    // InternalAndroidGeneratorParser.g:1000:3: ruleSpinner
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
                    // InternalAndroidGeneratorParser.g:1005:2: ( ruleTextView )
                    {
                    // InternalAndroidGeneratorParser.g:1005:2: ( ruleTextView )
                    // InternalAndroidGeneratorParser.g:1006:3: ruleTextView
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
    // InternalAndroidGeneratorParser.g:1015:1: rule__ButtonActions__Alternatives : ( ( ruleToast ) | ( ruleBundle ) );
    public final void rule__ButtonActions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1019:1: ( ( ruleToast ) | ( ruleBundle ) )
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
                    // InternalAndroidGeneratorParser.g:1020:2: ( ruleToast )
                    {
                    // InternalAndroidGeneratorParser.g:1020:2: ( ruleToast )
                    // InternalAndroidGeneratorParser.g:1021:3: ruleToast
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
                    // InternalAndroidGeneratorParser.g:1026:2: ( ruleBundle )
                    {
                    // InternalAndroidGeneratorParser.g:1026:2: ( ruleBundle )
                    // InternalAndroidGeneratorParser.g:1027:3: ruleBundle
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
    // InternalAndroidGeneratorParser.g:1036:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1040:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) )
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
                    // InternalAndroidGeneratorParser.g:1041:2: ( ( rule__Operator__Group_0__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1041:2: ( ( rule__Operator__Group_0__0 ) )
                    // InternalAndroidGeneratorParser.g:1042:3: ( rule__Operator__Group_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_0()); 
                    // InternalAndroidGeneratorParser.g:1043:3: ( rule__Operator__Group_0__0 )
                    // InternalAndroidGeneratorParser.g:1043:4: rule__Operator__Group_0__0
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
                    // InternalAndroidGeneratorParser.g:1047:2: ( ( rule__Operator__Group_1__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1047:2: ( ( rule__Operator__Group_1__0 ) )
                    // InternalAndroidGeneratorParser.g:1048:3: ( rule__Operator__Group_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_1()); 
                    // InternalAndroidGeneratorParser.g:1049:3: ( rule__Operator__Group_1__0 )
                    // InternalAndroidGeneratorParser.g:1049:4: rule__Operator__Group_1__0
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
                    // InternalAndroidGeneratorParser.g:1053:2: ( ( rule__Operator__Group_2__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1053:2: ( ( rule__Operator__Group_2__0 ) )
                    // InternalAndroidGeneratorParser.g:1054:3: ( rule__Operator__Group_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_2()); 
                    // InternalAndroidGeneratorParser.g:1055:3: ( rule__Operator__Group_2__0 )
                    // InternalAndroidGeneratorParser.g:1055:4: rule__Operator__Group_2__0
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
    // InternalAndroidGeneratorParser.g:1063:1: rule__Unit__Alternatives : ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1067:1: ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) )
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
                    // InternalAndroidGeneratorParser.g:1068:2: ( ( rule__Unit__Group_0__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1068:2: ( ( rule__Unit__Group_0__0 ) )
                    // InternalAndroidGeneratorParser.g:1069:3: ( rule__Unit__Group_0__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_0()); 
                    // InternalAndroidGeneratorParser.g:1070:3: ( rule__Unit__Group_0__0 )
                    // InternalAndroidGeneratorParser.g:1070:4: rule__Unit__Group_0__0
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
                    // InternalAndroidGeneratorParser.g:1074:2: ( ( rule__Unit__Group_1__0 ) )
                    {
                    // InternalAndroidGeneratorParser.g:1074:2: ( ( rule__Unit__Group_1__0 ) )
                    // InternalAndroidGeneratorParser.g:1075:3: ( rule__Unit__Group_1__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_1()); 
                    // InternalAndroidGeneratorParser.g:1076:3: ( rule__Unit__Group_1__0 )
                    // InternalAndroidGeneratorParser.g:1076:4: rule__Unit__Group_1__0
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
    // InternalAndroidGeneratorParser.g:1084:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1088:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalAndroidGeneratorParser.g:1089:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalAndroidGeneratorParser.g:1096:1: rule__Application__Group__0__Impl : ( App ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1100:1: ( ( App ) )
            // InternalAndroidGeneratorParser.g:1101:1: ( App )
            {
            // InternalAndroidGeneratorParser.g:1101:1: ( App )
            // InternalAndroidGeneratorParser.g:1102:2: App
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
    // InternalAndroidGeneratorParser.g:1111:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1115:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalAndroidGeneratorParser.g:1116:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalAndroidGeneratorParser.g:1123:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1127:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:1128:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1128:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:1129:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:1130:2: ( rule__Application__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:1130:3: rule__Application__NameAssignment_1
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
    // InternalAndroidGeneratorParser.g:1138:1: rule__Application__Group__2 : rule__Application__Group__2__Impl ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1142:1: ( rule__Application__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:1143:2: rule__Application__Group__2__Impl
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
    // InternalAndroidGeneratorParser.g:1149:1: rule__Application__Group__2__Impl : ( ( rule__Application__AttributesAssignment_2 )* ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1153:1: ( ( ( rule__Application__AttributesAssignment_2 )* ) )
            // InternalAndroidGeneratorParser.g:1154:1: ( ( rule__Application__AttributesAssignment_2 )* )
            {
            // InternalAndroidGeneratorParser.g:1154:1: ( ( rule__Application__AttributesAssignment_2 )* )
            // InternalAndroidGeneratorParser.g:1155:2: ( rule__Application__AttributesAssignment_2 )*
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_2()); 
            // InternalAndroidGeneratorParser.g:1156:2: ( rule__Application__AttributesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Permissions||LA9_0==Elements||LA9_0==RULE_BEGIN) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:1156:3: rule__Application__AttributesAssignment_2
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
    // InternalAndroidGeneratorParser.g:1165:1: rule__ApplicationVersion__Group__0 : rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 ;
    public final void rule__ApplicationVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1169:1: ( rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 )
            // InternalAndroidGeneratorParser.g:1170:2: rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1
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
    // InternalAndroidGeneratorParser.g:1177:1: rule__ApplicationVersion__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1181:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1182:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1182:1: ( () )
            // InternalAndroidGeneratorParser.g:1183:2: ()
            {
             before(grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0()); 
            // InternalAndroidGeneratorParser.g:1184:2: ()
            // InternalAndroidGeneratorParser.g:1184:3: 
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
    // InternalAndroidGeneratorParser.g:1192:1: rule__ApplicationVersion__Group__1 : rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 ;
    public final void rule__ApplicationVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1196:1: ( rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 )
            // InternalAndroidGeneratorParser.g:1197:2: rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2
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
    // InternalAndroidGeneratorParser.g:1204:1: rule__ApplicationVersion__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__ApplicationVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1208:1: ( ( RULE_BEGIN ) )
            // InternalAndroidGeneratorParser.g:1209:1: ( RULE_BEGIN )
            {
            // InternalAndroidGeneratorParser.g:1209:1: ( RULE_BEGIN )
            // InternalAndroidGeneratorParser.g:1210:2: RULE_BEGIN
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
    // InternalAndroidGeneratorParser.g:1219:1: rule__ApplicationVersion__Group__2 : rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 ;
    public final void rule__ApplicationVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1223:1: ( rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 )
            // InternalAndroidGeneratorParser.g:1224:2: rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3
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
    // InternalAndroidGeneratorParser.g:1231:1: rule__ApplicationVersion__Group__2__Impl : ( AndroidSDK ) ;
    public final void rule__ApplicationVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1235:1: ( ( AndroidSDK ) )
            // InternalAndroidGeneratorParser.g:1236:1: ( AndroidSDK )
            {
            // InternalAndroidGeneratorParser.g:1236:1: ( AndroidSDK )
            // InternalAndroidGeneratorParser.g:1237:2: AndroidSDK
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
    // InternalAndroidGeneratorParser.g:1246:1: rule__ApplicationVersion__Group__3 : rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 ;
    public final void rule__ApplicationVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1250:1: ( rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 )
            // InternalAndroidGeneratorParser.g:1251:2: rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4
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
    // InternalAndroidGeneratorParser.g:1258:1: rule__ApplicationVersion__Group__3__Impl : ( Colon ) ;
    public final void rule__ApplicationVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1262:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:1263:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:1263:1: ( Colon )
            // InternalAndroidGeneratorParser.g:1264:2: Colon
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
    // InternalAndroidGeneratorParser.g:1273:1: rule__ApplicationVersion__Group__4 : rule__ApplicationVersion__Group__4__Impl rule__ApplicationVersion__Group__5 ;
    public final void rule__ApplicationVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1277:1: ( rule__ApplicationVersion__Group__4__Impl rule__ApplicationVersion__Group__5 )
            // InternalAndroidGeneratorParser.g:1278:2: rule__ApplicationVersion__Group__4__Impl rule__ApplicationVersion__Group__5
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
    // InternalAndroidGeneratorParser.g:1285:1: rule__ApplicationVersion__Group__4__Impl : ( ( rule__ApplicationVersion__ResultAssignment_4 ) ) ;
    public final void rule__ApplicationVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1289:1: ( ( ( rule__ApplicationVersion__ResultAssignment_4 ) ) )
            // InternalAndroidGeneratorParser.g:1290:1: ( ( rule__ApplicationVersion__ResultAssignment_4 ) )
            {
            // InternalAndroidGeneratorParser.g:1290:1: ( ( rule__ApplicationVersion__ResultAssignment_4 ) )
            // InternalAndroidGeneratorParser.g:1291:2: ( rule__ApplicationVersion__ResultAssignment_4 )
            {
             before(grammarAccess.getApplicationVersionAccess().getResultAssignment_4()); 
            // InternalAndroidGeneratorParser.g:1292:2: ( rule__ApplicationVersion__ResultAssignment_4 )
            // InternalAndroidGeneratorParser.g:1292:3: rule__ApplicationVersion__ResultAssignment_4
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
    // InternalAndroidGeneratorParser.g:1300:1: rule__ApplicationVersion__Group__5 : rule__ApplicationVersion__Group__5__Impl rule__ApplicationVersion__Group__6 ;
    public final void rule__ApplicationVersion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1304:1: ( rule__ApplicationVersion__Group__5__Impl rule__ApplicationVersion__Group__6 )
            // InternalAndroidGeneratorParser.g:1305:2: rule__ApplicationVersion__Group__5__Impl rule__ApplicationVersion__Group__6
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
    // InternalAndroidGeneratorParser.g:1312:1: rule__ApplicationVersion__Group__5__Impl : ( ( rule__ApplicationVersion__TargetsdkAssignment_5 )? ) ;
    public final void rule__ApplicationVersion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1316:1: ( ( ( rule__ApplicationVersion__TargetsdkAssignment_5 )? ) )
            // InternalAndroidGeneratorParser.g:1317:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_5 )? )
            {
            // InternalAndroidGeneratorParser.g:1317:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_5 )? )
            // InternalAndroidGeneratorParser.g:1318:2: ( rule__ApplicationVersion__TargetsdkAssignment_5 )?
            {
             before(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_5()); 
            // InternalAndroidGeneratorParser.g:1319:2: ( rule__ApplicationVersion__TargetsdkAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TargetSDK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1319:3: rule__ApplicationVersion__TargetsdkAssignment_5
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
    // InternalAndroidGeneratorParser.g:1327:1: rule__ApplicationVersion__Group__6 : rule__ApplicationVersion__Group__6__Impl ;
    public final void rule__ApplicationVersion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1331:1: ( rule__ApplicationVersion__Group__6__Impl )
            // InternalAndroidGeneratorParser.g:1332:2: rule__ApplicationVersion__Group__6__Impl
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
    // InternalAndroidGeneratorParser.g:1338:1: rule__ApplicationVersion__Group__6__Impl : ( RULE_END ) ;
    public final void rule__ApplicationVersion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1342:1: ( ( RULE_END ) )
            // InternalAndroidGeneratorParser.g:1343:1: ( RULE_END )
            {
            // InternalAndroidGeneratorParser.g:1343:1: ( RULE_END )
            // InternalAndroidGeneratorParser.g:1344:2: RULE_END
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
    // InternalAndroidGeneratorParser.g:1354:1: rule__TargetSDK__Group__0 : rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 ;
    public final void rule__TargetSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1358:1: ( rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 )
            // InternalAndroidGeneratorParser.g:1359:2: rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1
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
    // InternalAndroidGeneratorParser.g:1366:1: rule__TargetSDK__Group__0__Impl : ( () ) ;
    public final void rule__TargetSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1370:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1371:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1371:1: ( () )
            // InternalAndroidGeneratorParser.g:1372:2: ()
            {
             before(grammarAccess.getTargetSDKAccess().getTargetSDKAction_0()); 
            // InternalAndroidGeneratorParser.g:1373:2: ()
            // InternalAndroidGeneratorParser.g:1373:3: 
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
    // InternalAndroidGeneratorParser.g:1381:1: rule__TargetSDK__Group__1 : rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 ;
    public final void rule__TargetSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1385:1: ( rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 )
            // InternalAndroidGeneratorParser.g:1386:2: rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2
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
    // InternalAndroidGeneratorParser.g:1393:1: rule__TargetSDK__Group__1__Impl : ( TargetSDK ) ;
    public final void rule__TargetSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1397:1: ( ( TargetSDK ) )
            // InternalAndroidGeneratorParser.g:1398:1: ( TargetSDK )
            {
            // InternalAndroidGeneratorParser.g:1398:1: ( TargetSDK )
            // InternalAndroidGeneratorParser.g:1399:2: TargetSDK
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
    // InternalAndroidGeneratorParser.g:1408:1: rule__TargetSDK__Group__2 : rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 ;
    public final void rule__TargetSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1412:1: ( rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 )
            // InternalAndroidGeneratorParser.g:1413:2: rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3
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
    // InternalAndroidGeneratorParser.g:1420:1: rule__TargetSDK__Group__2__Impl : ( Colon ) ;
    public final void rule__TargetSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1424:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:1425:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:1425:1: ( Colon )
            // InternalAndroidGeneratorParser.g:1426:2: Colon
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
    // InternalAndroidGeneratorParser.g:1435:1: rule__TargetSDK__Group__3 : rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 ;
    public final void rule__TargetSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1439:1: ( rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 )
            // InternalAndroidGeneratorParser.g:1440:2: rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4
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
    // InternalAndroidGeneratorParser.g:1447:1: rule__TargetSDK__Group__3__Impl : ( ( rule__TargetSDK__ResultAssignment_3 ) ) ;
    public final void rule__TargetSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1451:1: ( ( ( rule__TargetSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGeneratorParser.g:1452:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGeneratorParser.g:1452:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            // InternalAndroidGeneratorParser.g:1453:2: ( rule__TargetSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getTargetSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGeneratorParser.g:1454:2: ( rule__TargetSDK__ResultAssignment_3 )
            // InternalAndroidGeneratorParser.g:1454:3: rule__TargetSDK__ResultAssignment_3
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
    // InternalAndroidGeneratorParser.g:1462:1: rule__TargetSDK__Group__4 : rule__TargetSDK__Group__4__Impl ;
    public final void rule__TargetSDK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1466:1: ( rule__TargetSDK__Group__4__Impl )
            // InternalAndroidGeneratorParser.g:1467:2: rule__TargetSDK__Group__4__Impl
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
    // InternalAndroidGeneratorParser.g:1473:1: rule__TargetSDK__Group__4__Impl : ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) ;
    public final void rule__TargetSDK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1477:1: ( ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) )
            // InternalAndroidGeneratorParser.g:1478:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            {
            // InternalAndroidGeneratorParser.g:1478:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            // InternalAndroidGeneratorParser.g:1479:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            {
             before(grammarAccess.getTargetSDKAccess().getMinsdkAssignment_4()); 
            // InternalAndroidGeneratorParser.g:1480:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==MinimumSDK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:1480:3: rule__TargetSDK__MinsdkAssignment_4
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
    // InternalAndroidGeneratorParser.g:1489:1: rule__MinSDK__Group__0 : rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 ;
    public final void rule__MinSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1493:1: ( rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 )
            // InternalAndroidGeneratorParser.g:1494:2: rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1
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
    // InternalAndroidGeneratorParser.g:1501:1: rule__MinSDK__Group__0__Impl : ( () ) ;
    public final void rule__MinSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1505:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1506:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1506:1: ( () )
            // InternalAndroidGeneratorParser.g:1507:2: ()
            {
             before(grammarAccess.getMinSDKAccess().getMinSDKAction_0()); 
            // InternalAndroidGeneratorParser.g:1508:2: ()
            // InternalAndroidGeneratorParser.g:1508:3: 
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
    // InternalAndroidGeneratorParser.g:1516:1: rule__MinSDK__Group__1 : rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 ;
    public final void rule__MinSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1520:1: ( rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 )
            // InternalAndroidGeneratorParser.g:1521:2: rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2
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
    // InternalAndroidGeneratorParser.g:1528:1: rule__MinSDK__Group__1__Impl : ( MinimumSDK ) ;
    public final void rule__MinSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1532:1: ( ( MinimumSDK ) )
            // InternalAndroidGeneratorParser.g:1533:1: ( MinimumSDK )
            {
            // InternalAndroidGeneratorParser.g:1533:1: ( MinimumSDK )
            // InternalAndroidGeneratorParser.g:1534:2: MinimumSDK
            {
             before(grammarAccess.getMinSDKAccess().getMinimumSDKKeyword_1()); 
            match(input,MinimumSDK,FOLLOW_2); 
             after(grammarAccess.getMinSDKAccess().getMinimumSDKKeyword_1()); 

            }


            }

        }
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
    // InternalAndroidGeneratorParser.g:1543:1: rule__MinSDK__Group__2 : rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 ;
    public final void rule__MinSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1547:1: ( rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 )
            // InternalAndroidGeneratorParser.g:1548:2: rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3
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
    // InternalAndroidGeneratorParser.g:1555:1: rule__MinSDK__Group__2__Impl : ( Colon ) ;
    public final void rule__MinSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1559:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:1560:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:1560:1: ( Colon )
            // InternalAndroidGeneratorParser.g:1561:2: Colon
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
    // InternalAndroidGeneratorParser.g:1570:1: rule__MinSDK__Group__3 : rule__MinSDK__Group__3__Impl ;
    public final void rule__MinSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1574:1: ( rule__MinSDK__Group__3__Impl )
            // InternalAndroidGeneratorParser.g:1575:2: rule__MinSDK__Group__3__Impl
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
    // InternalAndroidGeneratorParser.g:1581:1: rule__MinSDK__Group__3__Impl : ( ( rule__MinSDK__ResultAssignment_3 ) ) ;
    public final void rule__MinSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1585:1: ( ( ( rule__MinSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGeneratorParser.g:1586:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGeneratorParser.g:1586:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            // InternalAndroidGeneratorParser.g:1587:2: ( rule__MinSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getMinSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGeneratorParser.g:1588:2: ( rule__MinSDK__ResultAssignment_3 )
            // InternalAndroidGeneratorParser.g:1588:3: rule__MinSDK__ResultAssignment_3
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
    // InternalAndroidGeneratorParser.g:1597:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1601:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // InternalAndroidGeneratorParser.g:1602:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
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
    // InternalAndroidGeneratorParser.g:1609:1: rule__ApplicationPermissionList__Group__0__Impl : ( Permissions ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1613:1: ( ( Permissions ) )
            // InternalAndroidGeneratorParser.g:1614:1: ( Permissions )
            {
            // InternalAndroidGeneratorParser.g:1614:1: ( Permissions )
            // InternalAndroidGeneratorParser.g:1615:2: Permissions
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
    // InternalAndroidGeneratorParser.g:1624:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1628:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // InternalAndroidGeneratorParser.g:1629:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
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
    // InternalAndroidGeneratorParser.g:1636:1: rule__ApplicationPermissionList__Group__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1640:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:1641:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1641:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:1642:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_1()); 
            // InternalAndroidGeneratorParser.g:1643:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            // InternalAndroidGeneratorParser.g:1643:3: rule__ApplicationPermissionList__PermissionsAssignment_1
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
    // InternalAndroidGeneratorParser.g:1651:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1655:1: ( rule__ApplicationPermissionList__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:1656:2: rule__ApplicationPermissionList__Group__2__Impl
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
    // InternalAndroidGeneratorParser.g:1662:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__Group_2__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1666:1: ( ( ( rule__ApplicationPermissionList__Group_2__0 )* ) )
            // InternalAndroidGeneratorParser.g:1667:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            {
            // InternalAndroidGeneratorParser.g:1667:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            // InternalAndroidGeneratorParser.g:1668:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_2()); 
            // InternalAndroidGeneratorParser.g:1669:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:1669:3: rule__ApplicationPermissionList__Group_2__0
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
    // InternalAndroidGeneratorParser.g:1678:1: rule__ApplicationPermissionList__Group_2__0 : rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 ;
    public final void rule__ApplicationPermissionList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1682:1: ( rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 )
            // InternalAndroidGeneratorParser.g:1683:2: rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1
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
    // InternalAndroidGeneratorParser.g:1690:1: rule__ApplicationPermissionList__Group_2__0__Impl : ( Comma ) ;
    public final void rule__ApplicationPermissionList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1694:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:1695:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:1695:1: ( Comma )
            // InternalAndroidGeneratorParser.g:1696:2: Comma
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
    // InternalAndroidGeneratorParser.g:1705:1: rule__ApplicationPermissionList__Group_2__1 : rule__ApplicationPermissionList__Group_2__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1709:1: ( rule__ApplicationPermissionList__Group_2__1__Impl )
            // InternalAndroidGeneratorParser.g:1710:2: rule__ApplicationPermissionList__Group_2__1__Impl
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
    // InternalAndroidGeneratorParser.g:1716:1: rule__ApplicationPermissionList__Group_2__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1720:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) )
            // InternalAndroidGeneratorParser.g:1721:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1721:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            // InternalAndroidGeneratorParser.g:1722:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2_1()); 
            // InternalAndroidGeneratorParser.g:1723:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            // InternalAndroidGeneratorParser.g:1723:3: rule__ApplicationPermissionList__PermissionsAssignment_2_1
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
    // InternalAndroidGeneratorParser.g:1732:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1736:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // InternalAndroidGeneratorParser.g:1737:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
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
    // InternalAndroidGeneratorParser.g:1744:1: rule__ApplicationElementList__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1748:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1749:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1749:1: ( () )
            // InternalAndroidGeneratorParser.g:1750:2: ()
            {
             before(grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0()); 
            // InternalAndroidGeneratorParser.g:1751:2: ()
            // InternalAndroidGeneratorParser.g:1751:3: 
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
    // InternalAndroidGeneratorParser.g:1759:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1763:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // InternalAndroidGeneratorParser.g:1764:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
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
    // InternalAndroidGeneratorParser.g:1771:1: rule__ApplicationElementList__Group__1__Impl : ( Elements ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1775:1: ( ( Elements ) )
            // InternalAndroidGeneratorParser.g:1776:1: ( Elements )
            {
            // InternalAndroidGeneratorParser.g:1776:1: ( Elements )
            // InternalAndroidGeneratorParser.g:1777:2: Elements
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
    // InternalAndroidGeneratorParser.g:1786:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1790:1: ( rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3 )
            // InternalAndroidGeneratorParser.g:1791:2: rule__ApplicationElementList__Group__2__Impl rule__ApplicationElementList__Group__3
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
    // InternalAndroidGeneratorParser.g:1798:1: rule__ApplicationElementList__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1802:1: ( ( RULE_BEGIN ) )
            // InternalAndroidGeneratorParser.g:1803:1: ( RULE_BEGIN )
            {
            // InternalAndroidGeneratorParser.g:1803:1: ( RULE_BEGIN )
            // InternalAndroidGeneratorParser.g:1804:2: RULE_BEGIN
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
    // InternalAndroidGeneratorParser.g:1813:1: rule__ApplicationElementList__Group__3 : rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 ;
    public final void rule__ApplicationElementList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1817:1: ( rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4 )
            // InternalAndroidGeneratorParser.g:1818:2: rule__ApplicationElementList__Group__3__Impl rule__ApplicationElementList__Group__4
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
    // InternalAndroidGeneratorParser.g:1825:1: rule__ApplicationElementList__Group__3__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_3 )* ) ;
    public final void rule__ApplicationElementList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1829:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_3 )* ) )
            // InternalAndroidGeneratorParser.g:1830:1: ( ( rule__ApplicationElementList__ElementsAssignment_3 )* )
            {
            // InternalAndroidGeneratorParser.g:1830:1: ( ( rule__ApplicationElementList__ElementsAssignment_3 )* )
            // InternalAndroidGeneratorParser.g:1831:2: ( rule__ApplicationElementList__ElementsAssignment_3 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_3()); 
            // InternalAndroidGeneratorParser.g:1832:2: ( rule__ApplicationElementList__ElementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Fragment||LA13_0==Model) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:1832:3: rule__ApplicationElementList__ElementsAssignment_3
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
    // InternalAndroidGeneratorParser.g:1840:1: rule__ApplicationElementList__Group__4 : rule__ApplicationElementList__Group__4__Impl ;
    public final void rule__ApplicationElementList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1844:1: ( rule__ApplicationElementList__Group__4__Impl )
            // InternalAndroidGeneratorParser.g:1845:2: rule__ApplicationElementList__Group__4__Impl
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
    // InternalAndroidGeneratorParser.g:1851:1: rule__ApplicationElementList__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ApplicationElementList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1855:1: ( ( RULE_END ) )
            // InternalAndroidGeneratorParser.g:1856:1: ( RULE_END )
            {
            // InternalAndroidGeneratorParser.g:1856:1: ( RULE_END )
            // InternalAndroidGeneratorParser.g:1857:2: RULE_END
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
    // InternalAndroidGeneratorParser.g:1867:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1871:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAndroidGeneratorParser.g:1872:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAndroidGeneratorParser.g:1879:1: rule__Model__Group__0__Impl : ( Model ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1883:1: ( ( Model ) )
            // InternalAndroidGeneratorParser.g:1884:1: ( Model )
            {
            // InternalAndroidGeneratorParser.g:1884:1: ( Model )
            // InternalAndroidGeneratorParser.g:1885:2: Model
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
    // InternalAndroidGeneratorParser.g:1894:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1898:1: ( rule__Model__Group__1__Impl )
            // InternalAndroidGeneratorParser.g:1899:2: rule__Model__Group__1__Impl
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
    // InternalAndroidGeneratorParser.g:1905:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1909:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:1910:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:1910:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:1911:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:1912:2: ( rule__Model__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:1912:3: rule__Model__NameAssignment_1
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
    // InternalAndroidGeneratorParser.g:1921:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1925:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalAndroidGeneratorParser.g:1926:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAndroidGeneratorParser.g:1933:1: rule__Fragment__Group__0__Impl : ( () ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1937:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:1938:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:1938:1: ( () )
            // InternalAndroidGeneratorParser.g:1939:2: ()
            {
             before(grammarAccess.getFragmentAccess().getFragmentAction_0()); 
            // InternalAndroidGeneratorParser.g:1940:2: ()
            // InternalAndroidGeneratorParser.g:1940:3: 
            {
            }

             after(grammarAccess.getFragmentAccess().getFragmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__0__Impl"


    // $ANTLR start "rule__Fragment__Group__1"
    // InternalAndroidGeneratorParser.g:1948:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1952:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalAndroidGeneratorParser.g:1953:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalAndroidGeneratorParser.g:1960:1: rule__Fragment__Group__1__Impl : ( Fragment ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1964:1: ( ( Fragment ) )
            // InternalAndroidGeneratorParser.g:1965:1: ( Fragment )
            {
            // InternalAndroidGeneratorParser.g:1965:1: ( Fragment )
            // InternalAndroidGeneratorParser.g:1966:2: Fragment
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_1()); 
            match(input,Fragment,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getFragmentKeyword_1()); 

            }


            }

        }
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
    // InternalAndroidGeneratorParser.g:1975:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1979:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalAndroidGeneratorParser.g:1980:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Fragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAndroidGeneratorParser.g:1987:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__NameAssignment_2 ) ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:1991:1: ( ( ( rule__Fragment__NameAssignment_2 ) ) )
            // InternalAndroidGeneratorParser.g:1992:1: ( ( rule__Fragment__NameAssignment_2 ) )
            {
            // InternalAndroidGeneratorParser.g:1992:1: ( ( rule__Fragment__NameAssignment_2 ) )
            // InternalAndroidGeneratorParser.g:1993:2: ( rule__Fragment__NameAssignment_2 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_2()); 
            // InternalAndroidGeneratorParser.g:1994:2: ( rule__Fragment__NameAssignment_2 )
            // InternalAndroidGeneratorParser.g:1994:3: rule__Fragment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fragment__Group__3"
    // InternalAndroidGeneratorParser.g:2002:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2006:1: ( rule__Fragment__Group__3__Impl )
            // InternalAndroidGeneratorParser.g:2007:2: rule__Fragment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__3"


    // $ANTLR start "rule__Fragment__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:2013:1: rule__Fragment__Group__3__Impl : ( ( rule__Fragment__ActivityAttributesAssignment_3 )? ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2017:1: ( ( ( rule__Fragment__ActivityAttributesAssignment_3 )? ) )
            // InternalAndroidGeneratorParser.g:2018:1: ( ( rule__Fragment__ActivityAttributesAssignment_3 )? )
            {
            // InternalAndroidGeneratorParser.g:2018:1: ( ( rule__Fragment__ActivityAttributesAssignment_3 )? )
            // InternalAndroidGeneratorParser.g:2019:2: ( rule__Fragment__ActivityAttributesAssignment_3 )?
            {
             before(grammarAccess.getFragmentAccess().getActivityAttributesAssignment_3()); 
            // InternalAndroidGeneratorParser.g:2020:2: ( rule__Fragment__ActivityAttributesAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BEGIN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:2020:3: rule__Fragment__ActivityAttributesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fragment__ActivityAttributesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentAccess().getActivityAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__3__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__0"
    // InternalAndroidGeneratorParser.g:2029:1: rule__ActivityLayoutAttributes__Group__0 : rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 ;
    public final void rule__ActivityLayoutAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2033:1: ( rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 )
            // InternalAndroidGeneratorParser.g:2034:2: rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ActivityLayoutAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group__0"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__0__Impl"
    // InternalAndroidGeneratorParser.g:2041:1: rule__ActivityLayoutAttributes__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ActivityLayoutAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2045:1: ( ( RULE_BEGIN ) )
            // InternalAndroidGeneratorParser.g:2046:1: ( RULE_BEGIN )
            {
            // InternalAndroidGeneratorParser.g:2046:1: ( RULE_BEGIN )
            // InternalAndroidGeneratorParser.g:2047:2: RULE_BEGIN
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getBEGINTerminalRuleCall_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getActivityLayoutAttributesAccess().getBEGINTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group__0__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__1"
    // InternalAndroidGeneratorParser.g:2056:1: rule__ActivityLayoutAttributes__Group__1 : rule__ActivityLayoutAttributes__Group__1__Impl rule__ActivityLayoutAttributes__Group__2 ;
    public final void rule__ActivityLayoutAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2060:1: ( rule__ActivityLayoutAttributes__Group__1__Impl rule__ActivityLayoutAttributes__Group__2 )
            // InternalAndroidGeneratorParser.g:2061:2: rule__ActivityLayoutAttributes__Group__1__Impl rule__ActivityLayoutAttributes__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ActivityLayoutAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group__1"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__1__Impl"
    // InternalAndroidGeneratorParser.g:2068:1: rule__ActivityLayoutAttributes__Group__1__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2072:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:2073:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2073:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:2074:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_1()); 
            // InternalAndroidGeneratorParser.g:2075:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1 )
            // InternalAndroidGeneratorParser.g:2075:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__LayoutElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group__1__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__2"
    // InternalAndroidGeneratorParser.g:2083:1: rule__ActivityLayoutAttributes__Group__2 : rule__ActivityLayoutAttributes__Group__2__Impl rule__ActivityLayoutAttributes__Group__3 ;
    public final void rule__ActivityLayoutAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2087:1: ( rule__ActivityLayoutAttributes__Group__2__Impl rule__ActivityLayoutAttributes__Group__3 )
            // InternalAndroidGeneratorParser.g:2088:2: rule__ActivityLayoutAttributes__Group__2__Impl rule__ActivityLayoutAttributes__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ActivityLayoutAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group__2"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__2__Impl"
    // InternalAndroidGeneratorParser.g:2095:1: rule__ActivityLayoutAttributes__Group__2__Impl : ( ( rule__ActivityLayoutAttributes__Group_2__0 )* ) ;
    public final void rule__ActivityLayoutAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2099:1: ( ( ( rule__ActivityLayoutAttributes__Group_2__0 )* ) )
            // InternalAndroidGeneratorParser.g:2100:1: ( ( rule__ActivityLayoutAttributes__Group_2__0 )* )
            {
            // InternalAndroidGeneratorParser.g:2100:1: ( ( rule__ActivityLayoutAttributes__Group_2__0 )* )
            // InternalAndroidGeneratorParser.g:2101:2: ( rule__ActivityLayoutAttributes__Group_2__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getGroup_2()); 
            // InternalAndroidGeneratorParser.g:2102:2: ( rule__ActivityLayoutAttributes__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:2102:3: rule__ActivityLayoutAttributes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ActivityLayoutAttributes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getActivityLayoutAttributesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group__2__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__3"
    // InternalAndroidGeneratorParser.g:2110:1: rule__ActivityLayoutAttributes__Group__3 : rule__ActivityLayoutAttributes__Group__3__Impl ;
    public final void rule__ActivityLayoutAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2114:1: ( rule__ActivityLayoutAttributes__Group__3__Impl )
            // InternalAndroidGeneratorParser.g:2115:2: rule__ActivityLayoutAttributes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group__3"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__3__Impl"
    // InternalAndroidGeneratorParser.g:2121:1: rule__ActivityLayoutAttributes__Group__3__Impl : ( RULE_END ) ;
    public final void rule__ActivityLayoutAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2125:1: ( ( RULE_END ) )
            // InternalAndroidGeneratorParser.g:2126:1: ( RULE_END )
            {
            // InternalAndroidGeneratorParser.g:2126:1: ( RULE_END )
            // InternalAndroidGeneratorParser.g:2127:2: RULE_END
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getENDTerminalRuleCall_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getActivityLayoutAttributesAccess().getENDTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group__3__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group_2__0"
    // InternalAndroidGeneratorParser.g:2137:1: rule__ActivityLayoutAttributes__Group_2__0 : rule__ActivityLayoutAttributes__Group_2__0__Impl rule__ActivityLayoutAttributes__Group_2__1 ;
    public final void rule__ActivityLayoutAttributes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2141:1: ( rule__ActivityLayoutAttributes__Group_2__0__Impl rule__ActivityLayoutAttributes__Group_2__1 )
            // InternalAndroidGeneratorParser.g:2142:2: rule__ActivityLayoutAttributes__Group_2__0__Impl rule__ActivityLayoutAttributes__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__ActivityLayoutAttributes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group_2__0"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group_2__0__Impl"
    // InternalAndroidGeneratorParser.g:2149:1: rule__ActivityLayoutAttributes__Group_2__0__Impl : ( Comma ) ;
    public final void rule__ActivityLayoutAttributes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2153:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:2154:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:2154:1: ( Comma )
            // InternalAndroidGeneratorParser.g:2155:2: Comma
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getCommaKeyword_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getActivityLayoutAttributesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group_2__0__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group_2__1"
    // InternalAndroidGeneratorParser.g:2164:1: rule__ActivityLayoutAttributes__Group_2__1 : rule__ActivityLayoutAttributes__Group_2__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2168:1: ( rule__ActivityLayoutAttributes__Group_2__1__Impl )
            // InternalAndroidGeneratorParser.g:2169:2: rule__ActivityLayoutAttributes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group_2__1"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group_2__1__Impl"
    // InternalAndroidGeneratorParser.g:2175:1: rule__ActivityLayoutAttributes__Group_2__1__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2179:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1 ) ) )
            // InternalAndroidGeneratorParser.g:2180:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2180:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1 ) )
            // InternalAndroidGeneratorParser.g:2181:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_2_1()); 
            // InternalAndroidGeneratorParser.g:2182:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1 )
            // InternalAndroidGeneratorParser.g:2182:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group_2__1__Impl"


    // $ANTLR start "rule__TypeMap__Group__0"
    // InternalAndroidGeneratorParser.g:2191:1: rule__TypeMap__Group__0 : rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1 ;
    public final void rule__TypeMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2195:1: ( rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1 )
            // InternalAndroidGeneratorParser.g:2196:2: rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAndroidGeneratorParser.g:2203:1: rule__TypeMap__Group__0__Impl : ( () ) ;
    public final void rule__TypeMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2207:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:2208:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:2208:1: ( () )
            // InternalAndroidGeneratorParser.g:2209:2: ()
            {
             before(grammarAccess.getTypeMapAccess().getTypeMapAction_0()); 
            // InternalAndroidGeneratorParser.g:2210:2: ()
            // InternalAndroidGeneratorParser.g:2210:3: 
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
    // InternalAndroidGeneratorParser.g:2218:1: rule__TypeMap__Group__1 : rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2 ;
    public final void rule__TypeMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2222:1: ( rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2 )
            // InternalAndroidGeneratorParser.g:2223:2: rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalAndroidGeneratorParser.g:2230:1: rule__TypeMap__Group__1__Impl : ( Map ) ;
    public final void rule__TypeMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2234:1: ( ( Map ) )
            // InternalAndroidGeneratorParser.g:2235:1: ( Map )
            {
            // InternalAndroidGeneratorParser.g:2235:1: ( Map )
            // InternalAndroidGeneratorParser.g:2236:2: Map
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
    // InternalAndroidGeneratorParser.g:2245:1: rule__TypeMap__Group__2 : rule__TypeMap__Group__2__Impl ;
    public final void rule__TypeMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2249:1: ( rule__TypeMap__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:2250:2: rule__TypeMap__Group__2__Impl
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
    // InternalAndroidGeneratorParser.g:2256:1: rule__TypeMap__Group__2__Impl : ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? ) ;
    public final void rule__TypeMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2260:1: ( ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? ) )
            // InternalAndroidGeneratorParser.g:2261:1: ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? )
            {
            // InternalAndroidGeneratorParser.g:2261:1: ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? )
            // InternalAndroidGeneratorParser.g:2262:2: ( rule__TypeMap__ActivitytypeattributeAssignment_2 )?
            {
             before(grammarAccess.getTypeMapAccess().getActivitytypeattributeAssignment_2()); 
            // InternalAndroidGeneratorParser.g:2263:2: ( rule__TypeMap__ActivitytypeattributeAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FilterQuery) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:2263:3: rule__TypeMap__ActivitytypeattributeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeMap__ActivitytypeattributeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMapAccess().getActivitytypeattributeAssignment_2()); 

            }


            }

        }
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
    // InternalAndroidGeneratorParser.g:2272:1: rule__TypeSetting__Group__0 : rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1 ;
    public final void rule__TypeSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2276:1: ( rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1 )
            // InternalAndroidGeneratorParser.g:2277:2: rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAndroidGeneratorParser.g:2284:1: rule__TypeSetting__Group__0__Impl : ( () ) ;
    public final void rule__TypeSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2288:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:2289:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:2289:1: ( () )
            // InternalAndroidGeneratorParser.g:2290:2: ()
            {
             before(grammarAccess.getTypeSettingAccess().getTypeSettingAction_0()); 
            // InternalAndroidGeneratorParser.g:2291:2: ()
            // InternalAndroidGeneratorParser.g:2291:3: 
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
    // InternalAndroidGeneratorParser.g:2299:1: rule__TypeSetting__Group__1 : rule__TypeSetting__Group__1__Impl ;
    public final void rule__TypeSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2303:1: ( rule__TypeSetting__Group__1__Impl )
            // InternalAndroidGeneratorParser.g:2304:2: rule__TypeSetting__Group__1__Impl
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
    // InternalAndroidGeneratorParser.g:2310:1: rule__TypeSetting__Group__1__Impl : ( Settings ) ;
    public final void rule__TypeSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2314:1: ( ( Settings ) )
            // InternalAndroidGeneratorParser.g:2315:1: ( Settings )
            {
            // InternalAndroidGeneratorParser.g:2315:1: ( Settings )
            // InternalAndroidGeneratorParser.g:2316:2: Settings
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
    // InternalAndroidGeneratorParser.g:2326:1: rule__EditText__Group__0 : rule__EditText__Group__0__Impl rule__EditText__Group__1 ;
    public final void rule__EditText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2330:1: ( rule__EditText__Group__0__Impl rule__EditText__Group__1 )
            // InternalAndroidGeneratorParser.g:2331:2: rule__EditText__Group__0__Impl rule__EditText__Group__1
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
    // InternalAndroidGeneratorParser.g:2338:1: rule__EditText__Group__0__Impl : ( EditText ) ;
    public final void rule__EditText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2342:1: ( ( EditText ) )
            // InternalAndroidGeneratorParser.g:2343:1: ( EditText )
            {
            // InternalAndroidGeneratorParser.g:2343:1: ( EditText )
            // InternalAndroidGeneratorParser.g:2344:2: EditText
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
    // InternalAndroidGeneratorParser.g:2353:1: rule__EditText__Group__1 : rule__EditText__Group__1__Impl ;
    public final void rule__EditText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2357:1: ( rule__EditText__Group__1__Impl )
            // InternalAndroidGeneratorParser.g:2358:2: rule__EditText__Group__1__Impl
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
    // InternalAndroidGeneratorParser.g:2364:1: rule__EditText__Group__1__Impl : ( ( rule__EditText__NameAssignment_1 ) ) ;
    public final void rule__EditText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2368:1: ( ( ( rule__EditText__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:2369:1: ( ( rule__EditText__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2369:1: ( ( rule__EditText__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:2370:2: ( rule__EditText__NameAssignment_1 )
            {
             before(grammarAccess.getEditTextAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:2371:2: ( rule__EditText__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:2371:3: rule__EditText__NameAssignment_1
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
    // InternalAndroidGeneratorParser.g:2380:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2384:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // InternalAndroidGeneratorParser.g:2385:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
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
    // InternalAndroidGeneratorParser.g:2392:1: rule__Spinner__Group__0__Impl : ( Spinner ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2396:1: ( ( Spinner ) )
            // InternalAndroidGeneratorParser.g:2397:1: ( Spinner )
            {
            // InternalAndroidGeneratorParser.g:2397:1: ( Spinner )
            // InternalAndroidGeneratorParser.g:2398:2: Spinner
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
    // InternalAndroidGeneratorParser.g:2407:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl rule__Spinner__Group__2 ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2411:1: ( rule__Spinner__Group__1__Impl rule__Spinner__Group__2 )
            // InternalAndroidGeneratorParser.g:2412:2: rule__Spinner__Group__1__Impl rule__Spinner__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalAndroidGeneratorParser.g:2419:1: rule__Spinner__Group__1__Impl : ( ( rule__Spinner__NameAssignment_1 ) ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2423:1: ( ( ( rule__Spinner__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:2424:1: ( ( rule__Spinner__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2424:1: ( ( rule__Spinner__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:2425:2: ( rule__Spinner__NameAssignment_1 )
            {
             before(grammarAccess.getSpinnerAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:2426:2: ( rule__Spinner__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:2426:3: rule__Spinner__NameAssignment_1
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
    // InternalAndroidGeneratorParser.g:2434:1: rule__Spinner__Group__2 : rule__Spinner__Group__2__Impl ;
    public final void rule__Spinner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2438:1: ( rule__Spinner__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:2439:2: rule__Spinner__Group__2__Impl
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
    // InternalAndroidGeneratorParser.g:2445:1: rule__Spinner__Group__2__Impl : ( ( rule__Spinner__Group_2__0 )? ) ;
    public final void rule__Spinner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2449:1: ( ( ( rule__Spinner__Group_2__0 )? ) )
            // InternalAndroidGeneratorParser.g:2450:1: ( ( rule__Spinner__Group_2__0 )? )
            {
            // InternalAndroidGeneratorParser.g:2450:1: ( ( rule__Spinner__Group_2__0 )? )
            // InternalAndroidGeneratorParser.g:2451:2: ( rule__Spinner__Group_2__0 )?
            {
             before(grammarAccess.getSpinnerAccess().getGroup_2()); 
            // InternalAndroidGeneratorParser.g:2452:2: ( rule__Spinner__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Content) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:2452:3: rule__Spinner__Group_2__0
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
    // InternalAndroidGeneratorParser.g:2461:1: rule__Spinner__Group_2__0 : rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1 ;
    public final void rule__Spinner__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2465:1: ( rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1 )
            // InternalAndroidGeneratorParser.g:2466:2: rule__Spinner__Group_2__0__Impl rule__Spinner__Group_2__1
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
    // InternalAndroidGeneratorParser.g:2473:1: rule__Spinner__Group_2__0__Impl : ( Content ) ;
    public final void rule__Spinner__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2477:1: ( ( Content ) )
            // InternalAndroidGeneratorParser.g:2478:1: ( Content )
            {
            // InternalAndroidGeneratorParser.g:2478:1: ( Content )
            // InternalAndroidGeneratorParser.g:2479:2: Content
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
    // InternalAndroidGeneratorParser.g:2488:1: rule__Spinner__Group_2__1 : rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2 ;
    public final void rule__Spinner__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2492:1: ( rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2 )
            // InternalAndroidGeneratorParser.g:2493:2: rule__Spinner__Group_2__1__Impl rule__Spinner__Group_2__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalAndroidGeneratorParser.g:2500:1: rule__Spinner__Group_2__1__Impl : ( Colon ) ;
    public final void rule__Spinner__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2504:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:2505:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:2505:1: ( Colon )
            // InternalAndroidGeneratorParser.g:2506:2: Colon
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
    // InternalAndroidGeneratorParser.g:2515:1: rule__Spinner__Group_2__2 : rule__Spinner__Group_2__2__Impl rule__Spinner__Group_2__3 ;
    public final void rule__Spinner__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2519:1: ( rule__Spinner__Group_2__2__Impl rule__Spinner__Group_2__3 )
            // InternalAndroidGeneratorParser.g:2520:2: rule__Spinner__Group_2__2__Impl rule__Spinner__Group_2__3
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
    // InternalAndroidGeneratorParser.g:2527:1: rule__Spinner__Group_2__2__Impl : ( ( rule__Spinner__SpinnerconAssignment_2_2 ) ) ;
    public final void rule__Spinner__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2531:1: ( ( ( rule__Spinner__SpinnerconAssignment_2_2 ) ) )
            // InternalAndroidGeneratorParser.g:2532:1: ( ( rule__Spinner__SpinnerconAssignment_2_2 ) )
            {
            // InternalAndroidGeneratorParser.g:2532:1: ( ( rule__Spinner__SpinnerconAssignment_2_2 ) )
            // InternalAndroidGeneratorParser.g:2533:2: ( rule__Spinner__SpinnerconAssignment_2_2 )
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerconAssignment_2_2()); 
            // InternalAndroidGeneratorParser.g:2534:2: ( rule__Spinner__SpinnerconAssignment_2_2 )
            // InternalAndroidGeneratorParser.g:2534:3: rule__Spinner__SpinnerconAssignment_2_2
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
    // InternalAndroidGeneratorParser.g:2542:1: rule__Spinner__Group_2__3 : rule__Spinner__Group_2__3__Impl ;
    public final void rule__Spinner__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2546:1: ( rule__Spinner__Group_2__3__Impl )
            // InternalAndroidGeneratorParser.g:2547:2: rule__Spinner__Group_2__3__Impl
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
    // InternalAndroidGeneratorParser.g:2553:1: rule__Spinner__Group_2__3__Impl : ( ( rule__Spinner__Group_2_3__0 )* ) ;
    public final void rule__Spinner__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2557:1: ( ( ( rule__Spinner__Group_2_3__0 )* ) )
            // InternalAndroidGeneratorParser.g:2558:1: ( ( rule__Spinner__Group_2_3__0 )* )
            {
            // InternalAndroidGeneratorParser.g:2558:1: ( ( rule__Spinner__Group_2_3__0 )* )
            // InternalAndroidGeneratorParser.g:2559:2: ( rule__Spinner__Group_2_3__0 )*
            {
             before(grammarAccess.getSpinnerAccess().getGroup_2_3()); 
            // InternalAndroidGeneratorParser.g:2560:2: ( rule__Spinner__Group_2_3__0 )*
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
            	    // InternalAndroidGeneratorParser.g:2560:3: rule__Spinner__Group_2_3__0
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
    // InternalAndroidGeneratorParser.g:2569:1: rule__Spinner__Group_2_3__0 : rule__Spinner__Group_2_3__0__Impl rule__Spinner__Group_2_3__1 ;
    public final void rule__Spinner__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2573:1: ( rule__Spinner__Group_2_3__0__Impl rule__Spinner__Group_2_3__1 )
            // InternalAndroidGeneratorParser.g:2574:2: rule__Spinner__Group_2_3__0__Impl rule__Spinner__Group_2_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAndroidGeneratorParser.g:2581:1: rule__Spinner__Group_2_3__0__Impl : ( Comma ) ;
    public final void rule__Spinner__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2585:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:2586:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:2586:1: ( Comma )
            // InternalAndroidGeneratorParser.g:2587:2: Comma
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
    // InternalAndroidGeneratorParser.g:2596:1: rule__Spinner__Group_2_3__1 : rule__Spinner__Group_2_3__1__Impl ;
    public final void rule__Spinner__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2600:1: ( rule__Spinner__Group_2_3__1__Impl )
            // InternalAndroidGeneratorParser.g:2601:2: rule__Spinner__Group_2_3__1__Impl
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
    // InternalAndroidGeneratorParser.g:2607:1: rule__Spinner__Group_2_3__1__Impl : ( ( rule__Spinner__SpinnerconAssignment_2_3_1 ) ) ;
    public final void rule__Spinner__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2611:1: ( ( ( rule__Spinner__SpinnerconAssignment_2_3_1 ) ) )
            // InternalAndroidGeneratorParser.g:2612:1: ( ( rule__Spinner__SpinnerconAssignment_2_3_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2612:1: ( ( rule__Spinner__SpinnerconAssignment_2_3_1 ) )
            // InternalAndroidGeneratorParser.g:2613:2: ( rule__Spinner__SpinnerconAssignment_2_3_1 )
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerconAssignment_2_3_1()); 
            // InternalAndroidGeneratorParser.g:2614:2: ( rule__Spinner__SpinnerconAssignment_2_3_1 )
            // InternalAndroidGeneratorParser.g:2614:3: rule__Spinner__SpinnerconAssignment_2_3_1
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
    // InternalAndroidGeneratorParser.g:2623:1: rule__TextView__Group__0 : rule__TextView__Group__0__Impl rule__TextView__Group__1 ;
    public final void rule__TextView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2627:1: ( rule__TextView__Group__0__Impl rule__TextView__Group__1 )
            // InternalAndroidGeneratorParser.g:2628:2: rule__TextView__Group__0__Impl rule__TextView__Group__1
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
    // InternalAndroidGeneratorParser.g:2635:1: rule__TextView__Group__0__Impl : ( Textview ) ;
    public final void rule__TextView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2639:1: ( ( Textview ) )
            // InternalAndroidGeneratorParser.g:2640:1: ( Textview )
            {
            // InternalAndroidGeneratorParser.g:2640:1: ( Textview )
            // InternalAndroidGeneratorParser.g:2641:2: Textview
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
    // InternalAndroidGeneratorParser.g:2650:1: rule__TextView__Group__1 : rule__TextView__Group__1__Impl rule__TextView__Group__2 ;
    public final void rule__TextView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2654:1: ( rule__TextView__Group__1__Impl rule__TextView__Group__2 )
            // InternalAndroidGeneratorParser.g:2655:2: rule__TextView__Group__1__Impl rule__TextView__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalAndroidGeneratorParser.g:2662:1: rule__TextView__Group__1__Impl : ( ( rule__TextView__NameAssignment_1 ) ) ;
    public final void rule__TextView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2666:1: ( ( ( rule__TextView__NameAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:2667:1: ( ( rule__TextView__NameAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:2667:1: ( ( rule__TextView__NameAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:2668:2: ( rule__TextView__NameAssignment_1 )
            {
             before(grammarAccess.getTextViewAccess().getNameAssignment_1()); 
            // InternalAndroidGeneratorParser.g:2669:2: ( rule__TextView__NameAssignment_1 )
            // InternalAndroidGeneratorParser.g:2669:3: rule__TextView__NameAssignment_1
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
    // InternalAndroidGeneratorParser.g:2677:1: rule__TextView__Group__2 : rule__TextView__Group__2__Impl rule__TextView__Group__3 ;
    public final void rule__TextView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2681:1: ( rule__TextView__Group__2__Impl rule__TextView__Group__3 )
            // InternalAndroidGeneratorParser.g:2682:2: rule__TextView__Group__2__Impl rule__TextView__Group__3
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
    // InternalAndroidGeneratorParser.g:2689:1: rule__TextView__Group__2__Impl : ( Content_1 ) ;
    public final void rule__TextView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2693:1: ( ( Content_1 ) )
            // InternalAndroidGeneratorParser.g:2694:1: ( Content_1 )
            {
            // InternalAndroidGeneratorParser.g:2694:1: ( Content_1 )
            // InternalAndroidGeneratorParser.g:2695:2: Content_1
            {
             before(grammarAccess.getTextViewAccess().getContentKeyword_2()); 
            match(input,Content_1,FOLLOW_2); 
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
    // InternalAndroidGeneratorParser.g:2704:1: rule__TextView__Group__3 : rule__TextView__Group__3__Impl rule__TextView__Group__4 ;
    public final void rule__TextView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2708:1: ( rule__TextView__Group__3__Impl rule__TextView__Group__4 )
            // InternalAndroidGeneratorParser.g:2709:2: rule__TextView__Group__3__Impl rule__TextView__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalAndroidGeneratorParser.g:2716:1: rule__TextView__Group__3__Impl : ( Colon ) ;
    public final void rule__TextView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2720:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:2721:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:2721:1: ( Colon )
            // InternalAndroidGeneratorParser.g:2722:2: Colon
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
    // InternalAndroidGeneratorParser.g:2731:1: rule__TextView__Group__4 : rule__TextView__Group__4__Impl ;
    public final void rule__TextView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2735:1: ( rule__TextView__Group__4__Impl )
            // InternalAndroidGeneratorParser.g:2736:2: rule__TextView__Group__4__Impl
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
    // InternalAndroidGeneratorParser.g:2742:1: rule__TextView__Group__4__Impl : ( ( rule__TextView__TextAssignment_4 ) ) ;
    public final void rule__TextView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2746:1: ( ( ( rule__TextView__TextAssignment_4 ) ) )
            // InternalAndroidGeneratorParser.g:2747:1: ( ( rule__TextView__TextAssignment_4 ) )
            {
            // InternalAndroidGeneratorParser.g:2747:1: ( ( rule__TextView__TextAssignment_4 ) )
            // InternalAndroidGeneratorParser.g:2748:2: ( rule__TextView__TextAssignment_4 )
            {
             before(grammarAccess.getTextViewAccess().getTextAssignment_4()); 
            // InternalAndroidGeneratorParser.g:2749:2: ( rule__TextView__TextAssignment_4 )
            // InternalAndroidGeneratorParser.g:2749:3: rule__TextView__TextAssignment_4
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
    // InternalAndroidGeneratorParser.g:2758:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2762:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalAndroidGeneratorParser.g:2763:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAndroidGeneratorParser.g:2770:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2774:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:2775:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:2775:1: ( () )
            // InternalAndroidGeneratorParser.g:2776:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalAndroidGeneratorParser.g:2777:2: ()
            // InternalAndroidGeneratorParser.g:2777:3: 
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
    // InternalAndroidGeneratorParser.g:2785:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2789:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalAndroidGeneratorParser.g:2790:2: rule__Button__Group__1__Impl rule__Button__Group__2
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
    // InternalAndroidGeneratorParser.g:2797:1: rule__Button__Group__1__Impl : ( Button ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2801:1: ( ( Button ) )
            // InternalAndroidGeneratorParser.g:2802:1: ( Button )
            {
            // InternalAndroidGeneratorParser.g:2802:1: ( Button )
            // InternalAndroidGeneratorParser.g:2803:2: Button
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
    // InternalAndroidGeneratorParser.g:2812:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2816:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalAndroidGeneratorParser.g:2817:2: rule__Button__Group__2__Impl rule__Button__Group__3
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
    // InternalAndroidGeneratorParser.g:2824:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2828:1: ( ( ( rule__Button__NameAssignment_2 ) ) )
            // InternalAndroidGeneratorParser.g:2829:1: ( ( rule__Button__NameAssignment_2 ) )
            {
            // InternalAndroidGeneratorParser.g:2829:1: ( ( rule__Button__NameAssignment_2 ) )
            // InternalAndroidGeneratorParser.g:2830:2: ( rule__Button__NameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalAndroidGeneratorParser.g:2831:2: ( rule__Button__NameAssignment_2 )
            // InternalAndroidGeneratorParser.g:2831:3: rule__Button__NameAssignment_2
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
    // InternalAndroidGeneratorParser.g:2839:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2843:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalAndroidGeneratorParser.g:2844:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalAndroidGeneratorParser.g:2851:1: rule__Button__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2855:1: ( ( RULE_BEGIN ) )
            // InternalAndroidGeneratorParser.g:2856:1: ( RULE_BEGIN )
            {
            // InternalAndroidGeneratorParser.g:2856:1: ( RULE_BEGIN )
            // InternalAndroidGeneratorParser.g:2857:2: RULE_BEGIN
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
    // InternalAndroidGeneratorParser.g:2866:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2870:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // InternalAndroidGeneratorParser.g:2871:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalAndroidGeneratorParser.g:2878:1: rule__Button__Group__4__Impl : ( ( rule__Button__Group_4__0 )? ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2882:1: ( ( ( rule__Button__Group_4__0 )? ) )
            // InternalAndroidGeneratorParser.g:2883:1: ( ( rule__Button__Group_4__0 )? )
            {
            // InternalAndroidGeneratorParser.g:2883:1: ( ( rule__Button__Group_4__0 )? )
            // InternalAndroidGeneratorParser.g:2884:2: ( rule__Button__Group_4__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_4()); 
            // InternalAndroidGeneratorParser.g:2885:2: ( rule__Button__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Bundle||LA19_0==Toast) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:2885:3: rule__Button__Group_4__0
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
    // InternalAndroidGeneratorParser.g:2893:1: rule__Button__Group__5 : rule__Button__Group__5__Impl ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2897:1: ( rule__Button__Group__5__Impl )
            // InternalAndroidGeneratorParser.g:2898:2: rule__Button__Group__5__Impl
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
    // InternalAndroidGeneratorParser.g:2904:1: rule__Button__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2908:1: ( ( RULE_END ) )
            // InternalAndroidGeneratorParser.g:2909:1: ( RULE_END )
            {
            // InternalAndroidGeneratorParser.g:2909:1: ( RULE_END )
            // InternalAndroidGeneratorParser.g:2910:2: RULE_END
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
    // InternalAndroidGeneratorParser.g:2920:1: rule__Button__Group_4__0 : rule__Button__Group_4__0__Impl rule__Button__Group_4__1 ;
    public final void rule__Button__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2924:1: ( rule__Button__Group_4__0__Impl rule__Button__Group_4__1 )
            // InternalAndroidGeneratorParser.g:2925:2: rule__Button__Group_4__0__Impl rule__Button__Group_4__1
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
    // InternalAndroidGeneratorParser.g:2932:1: rule__Button__Group_4__0__Impl : ( ( rule__Button__ActionsAssignment_4_0 ) ) ;
    public final void rule__Button__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2936:1: ( ( ( rule__Button__ActionsAssignment_4_0 ) ) )
            // InternalAndroidGeneratorParser.g:2937:1: ( ( rule__Button__ActionsAssignment_4_0 ) )
            {
            // InternalAndroidGeneratorParser.g:2937:1: ( ( rule__Button__ActionsAssignment_4_0 ) )
            // InternalAndroidGeneratorParser.g:2938:2: ( rule__Button__ActionsAssignment_4_0 )
            {
             before(grammarAccess.getButtonAccess().getActionsAssignment_4_0()); 
            // InternalAndroidGeneratorParser.g:2939:2: ( rule__Button__ActionsAssignment_4_0 )
            // InternalAndroidGeneratorParser.g:2939:3: rule__Button__ActionsAssignment_4_0
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
    // InternalAndroidGeneratorParser.g:2947:1: rule__Button__Group_4__1 : rule__Button__Group_4__1__Impl ;
    public final void rule__Button__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2951:1: ( rule__Button__Group_4__1__Impl )
            // InternalAndroidGeneratorParser.g:2952:2: rule__Button__Group_4__1__Impl
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
    // InternalAndroidGeneratorParser.g:2958:1: rule__Button__Group_4__1__Impl : ( ( rule__Button__Group_4_1__0 )* ) ;
    public final void rule__Button__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2962:1: ( ( ( rule__Button__Group_4_1__0 )* ) )
            // InternalAndroidGeneratorParser.g:2963:1: ( ( rule__Button__Group_4_1__0 )* )
            {
            // InternalAndroidGeneratorParser.g:2963:1: ( ( rule__Button__Group_4_1__0 )* )
            // InternalAndroidGeneratorParser.g:2964:2: ( rule__Button__Group_4_1__0 )*
            {
             before(grammarAccess.getButtonAccess().getGroup_4_1()); 
            // InternalAndroidGeneratorParser.g:2965:2: ( rule__Button__Group_4_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAndroidGeneratorParser.g:2965:3: rule__Button__Group_4_1__0
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
    // InternalAndroidGeneratorParser.g:2974:1: rule__Button__Group_4_1__0 : rule__Button__Group_4_1__0__Impl rule__Button__Group_4_1__1 ;
    public final void rule__Button__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2978:1: ( rule__Button__Group_4_1__0__Impl rule__Button__Group_4_1__1 )
            // InternalAndroidGeneratorParser.g:2979:2: rule__Button__Group_4_1__0__Impl rule__Button__Group_4_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAndroidGeneratorParser.g:2986:1: rule__Button__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__Button__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:2990:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:2991:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:2991:1: ( Comma )
            // InternalAndroidGeneratorParser.g:2992:2: Comma
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
    // InternalAndroidGeneratorParser.g:3001:1: rule__Button__Group_4_1__1 : rule__Button__Group_4_1__1__Impl ;
    public final void rule__Button__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3005:1: ( rule__Button__Group_4_1__1__Impl )
            // InternalAndroidGeneratorParser.g:3006:2: rule__Button__Group_4_1__1__Impl
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
    // InternalAndroidGeneratorParser.g:3012:1: rule__Button__Group_4_1__1__Impl : ( ( rule__Button__ActionsAssignment_4_1_1 ) ) ;
    public final void rule__Button__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3016:1: ( ( ( rule__Button__ActionsAssignment_4_1_1 ) ) )
            // InternalAndroidGeneratorParser.g:3017:1: ( ( rule__Button__ActionsAssignment_4_1_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3017:1: ( ( rule__Button__ActionsAssignment_4_1_1 ) )
            // InternalAndroidGeneratorParser.g:3018:2: ( rule__Button__ActionsAssignment_4_1_1 )
            {
             before(grammarAccess.getButtonAccess().getActionsAssignment_4_1_1()); 
            // InternalAndroidGeneratorParser.g:3019:2: ( rule__Button__ActionsAssignment_4_1_1 )
            // InternalAndroidGeneratorParser.g:3019:3: rule__Button__ActionsAssignment_4_1_1
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
    // InternalAndroidGeneratorParser.g:3028:1: rule__Toast__Group__0 : rule__Toast__Group__0__Impl rule__Toast__Group__1 ;
    public final void rule__Toast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3032:1: ( rule__Toast__Group__0__Impl rule__Toast__Group__1 )
            // InternalAndroidGeneratorParser.g:3033:2: rule__Toast__Group__0__Impl rule__Toast__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAndroidGeneratorParser.g:3040:1: rule__Toast__Group__0__Impl : ( Toast ) ;
    public final void rule__Toast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3044:1: ( ( Toast ) )
            // InternalAndroidGeneratorParser.g:3045:1: ( Toast )
            {
            // InternalAndroidGeneratorParser.g:3045:1: ( Toast )
            // InternalAndroidGeneratorParser.g:3046:2: Toast
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
    // InternalAndroidGeneratorParser.g:3055:1: rule__Toast__Group__1 : rule__Toast__Group__1__Impl ;
    public final void rule__Toast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3059:1: ( rule__Toast__Group__1__Impl )
            // InternalAndroidGeneratorParser.g:3060:2: rule__Toast__Group__1__Impl
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
    // InternalAndroidGeneratorParser.g:3066:1: rule__Toast__Group__1__Impl : ( ( rule__Toast__TextAssignment_1 ) ) ;
    public final void rule__Toast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3070:1: ( ( ( rule__Toast__TextAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:3071:1: ( ( rule__Toast__TextAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3071:1: ( ( rule__Toast__TextAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:3072:2: ( rule__Toast__TextAssignment_1 )
            {
             before(grammarAccess.getToastAccess().getTextAssignment_1()); 
            // InternalAndroidGeneratorParser.g:3073:2: ( rule__Toast__TextAssignment_1 )
            // InternalAndroidGeneratorParser.g:3073:3: rule__Toast__TextAssignment_1
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
    // InternalAndroidGeneratorParser.g:3082:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3086:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // InternalAndroidGeneratorParser.g:3087:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
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
    // InternalAndroidGeneratorParser.g:3094:1: rule__Bundle__Group__0__Impl : ( Bundle ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3098:1: ( ( Bundle ) )
            // InternalAndroidGeneratorParser.g:3099:1: ( Bundle )
            {
            // InternalAndroidGeneratorParser.g:3099:1: ( Bundle )
            // InternalAndroidGeneratorParser.g:3100:2: Bundle
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
    // InternalAndroidGeneratorParser.g:3109:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3113:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // InternalAndroidGeneratorParser.g:3114:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalAndroidGeneratorParser.g:3121:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__BundleRecipientAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3125:1: ( ( ( rule__Bundle__BundleRecipientAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:3126:1: ( ( rule__Bundle__BundleRecipientAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3126:1: ( ( rule__Bundle__BundleRecipientAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:3127:2: ( rule__Bundle__BundleRecipientAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientAssignment_1()); 
            // InternalAndroidGeneratorParser.g:3128:2: ( rule__Bundle__BundleRecipientAssignment_1 )
            // InternalAndroidGeneratorParser.g:3128:3: rule__Bundle__BundleRecipientAssignment_1
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
    // InternalAndroidGeneratorParser.g:3136:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3140:1: ( rule__Bundle__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:3141:2: rule__Bundle__Group__2__Impl
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
    // InternalAndroidGeneratorParser.g:3147:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__HolderAssignment_2 )? ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3151:1: ( ( ( rule__Bundle__HolderAssignment_2 )? ) )
            // InternalAndroidGeneratorParser.g:3152:1: ( ( rule__Bundle__HolderAssignment_2 )? )
            {
            // InternalAndroidGeneratorParser.g:3152:1: ( ( rule__Bundle__HolderAssignment_2 )? )
            // InternalAndroidGeneratorParser.g:3153:2: ( rule__Bundle__HolderAssignment_2 )?
            {
             before(grammarAccess.getBundleAccess().getHolderAssignment_2()); 
            // InternalAndroidGeneratorParser.g:3154:2: ( rule__Bundle__HolderAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Holder) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAndroidGeneratorParser.g:3154:3: rule__Bundle__HolderAssignment_2
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
    // InternalAndroidGeneratorParser.g:3163:1: rule__Holder__Group__0 : rule__Holder__Group__0__Impl rule__Holder__Group__1 ;
    public final void rule__Holder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3167:1: ( rule__Holder__Group__0__Impl rule__Holder__Group__1 )
            // InternalAndroidGeneratorParser.g:3168:2: rule__Holder__Group__0__Impl rule__Holder__Group__1
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
    // InternalAndroidGeneratorParser.g:3175:1: rule__Holder__Group__0__Impl : ( Holder ) ;
    public final void rule__Holder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3179:1: ( ( Holder ) )
            // InternalAndroidGeneratorParser.g:3180:1: ( Holder )
            {
            // InternalAndroidGeneratorParser.g:3180:1: ( Holder )
            // InternalAndroidGeneratorParser.g:3181:2: Holder
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
    // InternalAndroidGeneratorParser.g:3190:1: rule__Holder__Group__1 : rule__Holder__Group__1__Impl rule__Holder__Group__2 ;
    public final void rule__Holder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3194:1: ( rule__Holder__Group__1__Impl rule__Holder__Group__2 )
            // InternalAndroidGeneratorParser.g:3195:2: rule__Holder__Group__1__Impl rule__Holder__Group__2
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
    // InternalAndroidGeneratorParser.g:3202:1: rule__Holder__Group__1__Impl : ( ( rule__Holder__HolAssignment_1 ) ) ;
    public final void rule__Holder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3206:1: ( ( ( rule__Holder__HolAssignment_1 ) ) )
            // InternalAndroidGeneratorParser.g:3207:1: ( ( rule__Holder__HolAssignment_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3207:1: ( ( rule__Holder__HolAssignment_1 ) )
            // InternalAndroidGeneratorParser.g:3208:2: ( rule__Holder__HolAssignment_1 )
            {
             before(grammarAccess.getHolderAccess().getHolAssignment_1()); 
            // InternalAndroidGeneratorParser.g:3209:2: ( rule__Holder__HolAssignment_1 )
            // InternalAndroidGeneratorParser.g:3209:3: rule__Holder__HolAssignment_1
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
    // InternalAndroidGeneratorParser.g:3217:1: rule__Holder__Group__2 : rule__Holder__Group__2__Impl ;
    public final void rule__Holder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3221:1: ( rule__Holder__Group__2__Impl )
            // InternalAndroidGeneratorParser.g:3222:2: rule__Holder__Group__2__Impl
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
    // InternalAndroidGeneratorParser.g:3228:1: rule__Holder__Group__2__Impl : ( ( rule__Holder__Group_2__0 )* ) ;
    public final void rule__Holder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3232:1: ( ( ( rule__Holder__Group_2__0 )* ) )
            // InternalAndroidGeneratorParser.g:3233:1: ( ( rule__Holder__Group_2__0 )* )
            {
            // InternalAndroidGeneratorParser.g:3233:1: ( ( rule__Holder__Group_2__0 )* )
            // InternalAndroidGeneratorParser.g:3234:2: ( rule__Holder__Group_2__0 )*
            {
             before(grammarAccess.getHolderAccess().getGroup_2()); 
            // InternalAndroidGeneratorParser.g:3235:2: ( rule__Holder__Group_2__0 )*
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
            	    // InternalAndroidGeneratorParser.g:3235:3: rule__Holder__Group_2__0
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
    // InternalAndroidGeneratorParser.g:3244:1: rule__Holder__Group_2__0 : rule__Holder__Group_2__0__Impl rule__Holder__Group_2__1 ;
    public final void rule__Holder__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3248:1: ( rule__Holder__Group_2__0__Impl rule__Holder__Group_2__1 )
            // InternalAndroidGeneratorParser.g:3249:2: rule__Holder__Group_2__0__Impl rule__Holder__Group_2__1
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
    // InternalAndroidGeneratorParser.g:3256:1: rule__Holder__Group_2__0__Impl : ( Comma ) ;
    public final void rule__Holder__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3260:1: ( ( Comma ) )
            // InternalAndroidGeneratorParser.g:3261:1: ( Comma )
            {
            // InternalAndroidGeneratorParser.g:3261:1: ( Comma )
            // InternalAndroidGeneratorParser.g:3262:2: Comma
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
    // InternalAndroidGeneratorParser.g:3271:1: rule__Holder__Group_2__1 : rule__Holder__Group_2__1__Impl ;
    public final void rule__Holder__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3275:1: ( rule__Holder__Group_2__1__Impl )
            // InternalAndroidGeneratorParser.g:3276:2: rule__Holder__Group_2__1__Impl
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
    // InternalAndroidGeneratorParser.g:3282:1: rule__Holder__Group_2__1__Impl : ( ( rule__Holder__HolAssignment_2_1 ) ) ;
    public final void rule__Holder__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3286:1: ( ( ( rule__Holder__HolAssignment_2_1 ) ) )
            // InternalAndroidGeneratorParser.g:3287:1: ( ( rule__Holder__HolAssignment_2_1 ) )
            {
            // InternalAndroidGeneratorParser.g:3287:1: ( ( rule__Holder__HolAssignment_2_1 ) )
            // InternalAndroidGeneratorParser.g:3288:2: ( rule__Holder__HolAssignment_2_1 )
            {
             before(grammarAccess.getHolderAccess().getHolAssignment_2_1()); 
            // InternalAndroidGeneratorParser.g:3289:2: ( rule__Holder__HolAssignment_2_1 )
            // InternalAndroidGeneratorParser.g:3289:3: rule__Holder__HolAssignment_2_1
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
    // InternalAndroidGeneratorParser.g:3298:1: rule__FilterQuery__Group__0 : rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 ;
    public final void rule__FilterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3302:1: ( rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 )
            // InternalAndroidGeneratorParser.g:3303:2: rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAndroidGeneratorParser.g:3310:1: rule__FilterQuery__Group__0__Impl : ( () ) ;
    public final void rule__FilterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3314:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3315:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3315:1: ( () )
            // InternalAndroidGeneratorParser.g:3316:2: ()
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryAction_0()); 
            // InternalAndroidGeneratorParser.g:3317:2: ()
            // InternalAndroidGeneratorParser.g:3317:3: 
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
    // InternalAndroidGeneratorParser.g:3325:1: rule__FilterQuery__Group__1 : rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 ;
    public final void rule__FilterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3329:1: ( rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 )
            // InternalAndroidGeneratorParser.g:3330:2: rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2
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
    // InternalAndroidGeneratorParser.g:3337:1: rule__FilterQuery__Group__1__Impl : ( FilterQuery ) ;
    public final void rule__FilterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3341:1: ( ( FilterQuery ) )
            // InternalAndroidGeneratorParser.g:3342:1: ( FilterQuery )
            {
            // InternalAndroidGeneratorParser.g:3342:1: ( FilterQuery )
            // InternalAndroidGeneratorParser.g:3343:2: FilterQuery
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
    // InternalAndroidGeneratorParser.g:3352:1: rule__FilterQuery__Group__2 : rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 ;
    public final void rule__FilterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3356:1: ( rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 )
            // InternalAndroidGeneratorParser.g:3357:2: rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalAndroidGeneratorParser.g:3364:1: rule__FilterQuery__Group__2__Impl : ( ( rule__FilterQuery__NameAssignment_2 ) ) ;
    public final void rule__FilterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3368:1: ( ( ( rule__FilterQuery__NameAssignment_2 ) ) )
            // InternalAndroidGeneratorParser.g:3369:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            {
            // InternalAndroidGeneratorParser.g:3369:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            // InternalAndroidGeneratorParser.g:3370:2: ( rule__FilterQuery__NameAssignment_2 )
            {
             before(grammarAccess.getFilterQueryAccess().getNameAssignment_2()); 
            // InternalAndroidGeneratorParser.g:3371:2: ( rule__FilterQuery__NameAssignment_2 )
            // InternalAndroidGeneratorParser.g:3371:3: rule__FilterQuery__NameAssignment_2
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
    // InternalAndroidGeneratorParser.g:3379:1: rule__FilterQuery__Group__3 : rule__FilterQuery__Group__3__Impl ;
    public final void rule__FilterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3383:1: ( rule__FilterQuery__Group__3__Impl )
            // InternalAndroidGeneratorParser.g:3384:2: rule__FilterQuery__Group__3__Impl
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
    // InternalAndroidGeneratorParser.g:3390:1: rule__FilterQuery__Group__3__Impl : ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) ;
    public final void rule__FilterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3394:1: ( ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) )
            // InternalAndroidGeneratorParser.g:3395:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            {
            // InternalAndroidGeneratorParser.g:3395:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            // InternalAndroidGeneratorParser.g:3396:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            {
             before(grammarAccess.getFilterQueryAccess().getFilterAttributesAssignment_3()); 
            // InternalAndroidGeneratorParser.g:3397:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            // InternalAndroidGeneratorParser.g:3397:3: rule__FilterQuery__FilterAttributesAssignment_3
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
    // InternalAndroidGeneratorParser.g:3406:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3410:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // InternalAndroidGeneratorParser.g:3411:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
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
    // InternalAndroidGeneratorParser.g:3418:1: rule__Distance__Group__0__Impl : ( Distance ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3422:1: ( ( Distance ) )
            // InternalAndroidGeneratorParser.g:3423:1: ( Distance )
            {
            // InternalAndroidGeneratorParser.g:3423:1: ( Distance )
            // InternalAndroidGeneratorParser.g:3424:2: Distance
            {
             before(grammarAccess.getDistanceAccess().getDistanceKeyword_0()); 
            match(input,Distance,FOLLOW_2); 
             after(grammarAccess.getDistanceAccess().getDistanceKeyword_0()); 

            }


            }

        }
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
    // InternalAndroidGeneratorParser.g:3433:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl rule__Distance__Group__2 ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3437:1: ( rule__Distance__Group__1__Impl rule__Distance__Group__2 )
            // InternalAndroidGeneratorParser.g:3438:2: rule__Distance__Group__1__Impl rule__Distance__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAndroidGeneratorParser.g:3445:1: rule__Distance__Group__1__Impl : ( Colon ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3449:1: ( ( Colon ) )
            // InternalAndroidGeneratorParser.g:3450:1: ( Colon )
            {
            // InternalAndroidGeneratorParser.g:3450:1: ( Colon )
            // InternalAndroidGeneratorParser.g:3451:2: Colon
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
    // InternalAndroidGeneratorParser.g:3460:1: rule__Distance__Group__2 : rule__Distance__Group__2__Impl rule__Distance__Group__3 ;
    public final void rule__Distance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3464:1: ( rule__Distance__Group__2__Impl rule__Distance__Group__3 )
            // InternalAndroidGeneratorParser.g:3465:2: rule__Distance__Group__2__Impl rule__Distance__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalAndroidGeneratorParser.g:3472:1: rule__Distance__Group__2__Impl : ( ( rule__Distance__UnitAssignment_2 ) ) ;
    public final void rule__Distance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3476:1: ( ( ( rule__Distance__UnitAssignment_2 ) ) )
            // InternalAndroidGeneratorParser.g:3477:1: ( ( rule__Distance__UnitAssignment_2 ) )
            {
            // InternalAndroidGeneratorParser.g:3477:1: ( ( rule__Distance__UnitAssignment_2 ) )
            // InternalAndroidGeneratorParser.g:3478:2: ( rule__Distance__UnitAssignment_2 )
            {
             before(grammarAccess.getDistanceAccess().getUnitAssignment_2()); 
            // InternalAndroidGeneratorParser.g:3479:2: ( rule__Distance__UnitAssignment_2 )
            // InternalAndroidGeneratorParser.g:3479:3: rule__Distance__UnitAssignment_2
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
    // InternalAndroidGeneratorParser.g:3487:1: rule__Distance__Group__3 : rule__Distance__Group__3__Impl rule__Distance__Group__4 ;
    public final void rule__Distance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3491:1: ( rule__Distance__Group__3__Impl rule__Distance__Group__4 )
            // InternalAndroidGeneratorParser.g:3492:2: rule__Distance__Group__3__Impl rule__Distance__Group__4
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
    // InternalAndroidGeneratorParser.g:3499:1: rule__Distance__Group__3__Impl : ( ( rule__Distance__OperatorAssignment_3 ) ) ;
    public final void rule__Distance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3503:1: ( ( ( rule__Distance__OperatorAssignment_3 ) ) )
            // InternalAndroidGeneratorParser.g:3504:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            {
            // InternalAndroidGeneratorParser.g:3504:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            // InternalAndroidGeneratorParser.g:3505:2: ( rule__Distance__OperatorAssignment_3 )
            {
             before(grammarAccess.getDistanceAccess().getOperatorAssignment_3()); 
            // InternalAndroidGeneratorParser.g:3506:2: ( rule__Distance__OperatorAssignment_3 )
            // InternalAndroidGeneratorParser.g:3506:3: rule__Distance__OperatorAssignment_3
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
    // InternalAndroidGeneratorParser.g:3514:1: rule__Distance__Group__4 : rule__Distance__Group__4__Impl ;
    public final void rule__Distance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3518:1: ( rule__Distance__Group__4__Impl )
            // InternalAndroidGeneratorParser.g:3519:2: rule__Distance__Group__4__Impl
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
    // InternalAndroidGeneratorParser.g:3525:1: rule__Distance__Group__4__Impl : ( ( rule__Distance__ResultsAssignment_4 ) ) ;
    public final void rule__Distance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3529:1: ( ( ( rule__Distance__ResultsAssignment_4 ) ) )
            // InternalAndroidGeneratorParser.g:3530:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            {
            // InternalAndroidGeneratorParser.g:3530:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            // InternalAndroidGeneratorParser.g:3531:2: ( rule__Distance__ResultsAssignment_4 )
            {
             before(grammarAccess.getDistanceAccess().getResultsAssignment_4()); 
            // InternalAndroidGeneratorParser.g:3532:2: ( rule__Distance__ResultsAssignment_4 )
            // InternalAndroidGeneratorParser.g:3532:3: rule__Distance__ResultsAssignment_4
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
    // InternalAndroidGeneratorParser.g:3541:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
    public final void rule__Operator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3545:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
            // InternalAndroidGeneratorParser.g:3546:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAndroidGeneratorParser.g:3553:1: rule__Operator__Group_0__0__Impl : ( () ) ;
    public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3557:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3558:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3558:1: ( () )
            // InternalAndroidGeneratorParser.g:3559:2: ()
            {
             before(grammarAccess.getOperatorAccess().getLessAction_0_0()); 
            // InternalAndroidGeneratorParser.g:3560:2: ()
            // InternalAndroidGeneratorParser.g:3560:3: 
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
    // InternalAndroidGeneratorParser.g:3568:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl ;
    public final void rule__Operator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3572:1: ( rule__Operator__Group_0__1__Impl )
            // InternalAndroidGeneratorParser.g:3573:2: rule__Operator__Group_0__1__Impl
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
    // InternalAndroidGeneratorParser.g:3579:1: rule__Operator__Group_0__1__Impl : ( GreaterThanSign ) ;
    public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3583:1: ( ( GreaterThanSign ) )
            // InternalAndroidGeneratorParser.g:3584:1: ( GreaterThanSign )
            {
            // InternalAndroidGeneratorParser.g:3584:1: ( GreaterThanSign )
            // InternalAndroidGeneratorParser.g:3585:2: GreaterThanSign
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
    // InternalAndroidGeneratorParser.g:3595:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3599:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalAndroidGeneratorParser.g:3600:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAndroidGeneratorParser.g:3607:1: rule__Operator__Group_1__0__Impl : ( () ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3611:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3612:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3612:1: ( () )
            // InternalAndroidGeneratorParser.g:3613:2: ()
            {
             before(grammarAccess.getOperatorAccess().getMoreAction_1_0()); 
            // InternalAndroidGeneratorParser.g:3614:2: ()
            // InternalAndroidGeneratorParser.g:3614:3: 
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
    // InternalAndroidGeneratorParser.g:3622:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3626:1: ( rule__Operator__Group_1__1__Impl )
            // InternalAndroidGeneratorParser.g:3627:2: rule__Operator__Group_1__1__Impl
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
    // InternalAndroidGeneratorParser.g:3633:1: rule__Operator__Group_1__1__Impl : ( LessThanSign ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3637:1: ( ( LessThanSign ) )
            // InternalAndroidGeneratorParser.g:3638:1: ( LessThanSign )
            {
            // InternalAndroidGeneratorParser.g:3638:1: ( LessThanSign )
            // InternalAndroidGeneratorParser.g:3639:2: LessThanSign
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
    // InternalAndroidGeneratorParser.g:3649:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3653:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalAndroidGeneratorParser.g:3654:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAndroidGeneratorParser.g:3661:1: rule__Operator__Group_2__0__Impl : ( () ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3665:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3666:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3666:1: ( () )
            // InternalAndroidGeneratorParser.g:3667:2: ()
            {
             before(grammarAccess.getOperatorAccess().getEqualAction_2_0()); 
            // InternalAndroidGeneratorParser.g:3668:2: ()
            // InternalAndroidGeneratorParser.g:3668:3: 
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
    // InternalAndroidGeneratorParser.g:3676:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3680:1: ( rule__Operator__Group_2__1__Impl )
            // InternalAndroidGeneratorParser.g:3681:2: rule__Operator__Group_2__1__Impl
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
    // InternalAndroidGeneratorParser.g:3687:1: rule__Operator__Group_2__1__Impl : ( EqualsSign ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3691:1: ( ( EqualsSign ) )
            // InternalAndroidGeneratorParser.g:3692:1: ( EqualsSign )
            {
            // InternalAndroidGeneratorParser.g:3692:1: ( EqualsSign )
            // InternalAndroidGeneratorParser.g:3693:2: EqualsSign
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
    // InternalAndroidGeneratorParser.g:3703:1: rule__Unit__Group_0__0 : rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 ;
    public final void rule__Unit__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3707:1: ( rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 )
            // InternalAndroidGeneratorParser.g:3708:2: rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAndroidGeneratorParser.g:3715:1: rule__Unit__Group_0__0__Impl : ( () ) ;
    public final void rule__Unit__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3719:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3720:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3720:1: ( () )
            // InternalAndroidGeneratorParser.g:3721:2: ()
            {
             before(grammarAccess.getUnitAccess().getMetersAction_0_0()); 
            // InternalAndroidGeneratorParser.g:3722:2: ()
            // InternalAndroidGeneratorParser.g:3722:3: 
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
    // InternalAndroidGeneratorParser.g:3730:1: rule__Unit__Group_0__1 : rule__Unit__Group_0__1__Impl ;
    public final void rule__Unit__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3734:1: ( rule__Unit__Group_0__1__Impl )
            // InternalAndroidGeneratorParser.g:3735:2: rule__Unit__Group_0__1__Impl
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
    // InternalAndroidGeneratorParser.g:3741:1: rule__Unit__Group_0__1__Impl : ( M ) ;
    public final void rule__Unit__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3745:1: ( ( M ) )
            // InternalAndroidGeneratorParser.g:3746:1: ( M )
            {
            // InternalAndroidGeneratorParser.g:3746:1: ( M )
            // InternalAndroidGeneratorParser.g:3747:2: M
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
    // InternalAndroidGeneratorParser.g:3757:1: rule__Unit__Group_1__0 : rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 ;
    public final void rule__Unit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3761:1: ( rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 )
            // InternalAndroidGeneratorParser.g:3762:2: rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAndroidGeneratorParser.g:3769:1: rule__Unit__Group_1__0__Impl : ( () ) ;
    public final void rule__Unit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3773:1: ( ( () ) )
            // InternalAndroidGeneratorParser.g:3774:1: ( () )
            {
            // InternalAndroidGeneratorParser.g:3774:1: ( () )
            // InternalAndroidGeneratorParser.g:3775:2: ()
            {
             before(grammarAccess.getUnitAccess().getImperialAction_1_0()); 
            // InternalAndroidGeneratorParser.g:3776:2: ()
            // InternalAndroidGeneratorParser.g:3776:3: 
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
    // InternalAndroidGeneratorParser.g:3784:1: rule__Unit__Group_1__1 : rule__Unit__Group_1__1__Impl ;
    public final void rule__Unit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3788:1: ( rule__Unit__Group_1__1__Impl )
            // InternalAndroidGeneratorParser.g:3789:2: rule__Unit__Group_1__1__Impl
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
    // InternalAndroidGeneratorParser.g:3795:1: rule__Unit__Group_1__1__Impl : ( F ) ;
    public final void rule__Unit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3799:1: ( ( F ) )
            // InternalAndroidGeneratorParser.g:3800:1: ( F )
            {
            // InternalAndroidGeneratorParser.g:3800:1: ( F )
            // InternalAndroidGeneratorParser.g:3801:2: F
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
    // InternalAndroidGeneratorParser.g:3811:1: rule__AndroidAppProject__ApplicationsAssignment : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3815:1: ( ( ruleApplication ) )
            // InternalAndroidGeneratorParser.g:3816:2: ( ruleApplication )
            {
            // InternalAndroidGeneratorParser.g:3816:2: ( ruleApplication )
            // InternalAndroidGeneratorParser.g:3817:3: ruleApplication
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
    // InternalAndroidGeneratorParser.g:3826:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3830:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:3831:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:3831:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:3832:3: RULE_ID
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
    // InternalAndroidGeneratorParser.g:3841:1: rule__Application__AttributesAssignment_2 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3845:1: ( ( ruleApplicationAttribute ) )
            // InternalAndroidGeneratorParser.g:3846:2: ( ruleApplicationAttribute )
            {
            // InternalAndroidGeneratorParser.g:3846:2: ( ruleApplicationAttribute )
            // InternalAndroidGeneratorParser.g:3847:3: ruleApplicationAttribute
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
    // InternalAndroidGeneratorParser.g:3856:1: rule__ApplicationVersion__ResultAssignment_4 : ( ruleNumber ) ;
    public final void rule__ApplicationVersion__ResultAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3860:1: ( ( ruleNumber ) )
            // InternalAndroidGeneratorParser.g:3861:2: ( ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:3861:2: ( ruleNumber )
            // InternalAndroidGeneratorParser.g:3862:3: ruleNumber
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
    // InternalAndroidGeneratorParser.g:3871:1: rule__ApplicationVersion__TargetsdkAssignment_5 : ( ruleTargetSDK ) ;
    public final void rule__ApplicationVersion__TargetsdkAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3875:1: ( ( ruleTargetSDK ) )
            // InternalAndroidGeneratorParser.g:3876:2: ( ruleTargetSDK )
            {
            // InternalAndroidGeneratorParser.g:3876:2: ( ruleTargetSDK )
            // InternalAndroidGeneratorParser.g:3877:3: ruleTargetSDK
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
    // InternalAndroidGeneratorParser.g:3886:1: rule__TargetSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__TargetSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3890:1: ( ( ruleNumber ) )
            // InternalAndroidGeneratorParser.g:3891:2: ( ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:3891:2: ( ruleNumber )
            // InternalAndroidGeneratorParser.g:3892:3: ruleNumber
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
    // InternalAndroidGeneratorParser.g:3901:1: rule__TargetSDK__MinsdkAssignment_4 : ( ruleMinSDK ) ;
    public final void rule__TargetSDK__MinsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3905:1: ( ( ruleMinSDK ) )
            // InternalAndroidGeneratorParser.g:3906:2: ( ruleMinSDK )
            {
            // InternalAndroidGeneratorParser.g:3906:2: ( ruleMinSDK )
            // InternalAndroidGeneratorParser.g:3907:3: ruleMinSDK
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
    // InternalAndroidGeneratorParser.g:3916:1: rule__MinSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__MinSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3920:1: ( ( ruleNumber ) )
            // InternalAndroidGeneratorParser.g:3921:2: ( ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:3921:2: ( ruleNumber )
            // InternalAndroidGeneratorParser.g:3922:3: ruleNumber
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
    // InternalAndroidGeneratorParser.g:3931:1: rule__ApplicationPermissionList__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3935:1: ( ( rulePermission ) )
            // InternalAndroidGeneratorParser.g:3936:2: ( rulePermission )
            {
            // InternalAndroidGeneratorParser.g:3936:2: ( rulePermission )
            // InternalAndroidGeneratorParser.g:3937:3: rulePermission
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
    // InternalAndroidGeneratorParser.g:3946:1: rule__ApplicationPermissionList__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3950:1: ( ( rulePermission ) )
            // InternalAndroidGeneratorParser.g:3951:2: ( rulePermission )
            {
            // InternalAndroidGeneratorParser.g:3951:2: ( rulePermission )
            // InternalAndroidGeneratorParser.g:3952:3: rulePermission
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
    // InternalAndroidGeneratorParser.g:3961:1: rule__Permission__NameAssignment : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Permission__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3965:1: ( ( RULE_PACKAGE_NAME ) )
            // InternalAndroidGeneratorParser.g:3966:2: ( RULE_PACKAGE_NAME )
            {
            // InternalAndroidGeneratorParser.g:3966:2: ( RULE_PACKAGE_NAME )
            // InternalAndroidGeneratorParser.g:3967:3: RULE_PACKAGE_NAME
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
    // InternalAndroidGeneratorParser.g:3976:1: rule__ApplicationElementList__ElementsAssignment_3 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3980:1: ( ( ruleApplicationElement ) )
            // InternalAndroidGeneratorParser.g:3981:2: ( ruleApplicationElement )
            {
            // InternalAndroidGeneratorParser.g:3981:2: ( ruleApplicationElement )
            // InternalAndroidGeneratorParser.g:3982:3: ruleApplicationElement
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
    // InternalAndroidGeneratorParser.g:3991:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:3995:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:3996:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:3996:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:3997:3: RULE_ID
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


    // $ANTLR start "rule__Fragment__NameAssignment_2"
    // InternalAndroidGeneratorParser.g:4006:1: rule__Fragment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4010:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4011:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4011:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4012:3: RULE_ID
            {
             before(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__NameAssignment_2"


    // $ANTLR start "rule__Fragment__ActivityAttributesAssignment_3"
    // InternalAndroidGeneratorParser.g:4021:1: rule__Fragment__ActivityAttributesAssignment_3 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Fragment__ActivityAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4025:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGeneratorParser.g:4026:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGeneratorParser.g:4026:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGeneratorParser.g:4027:3: ruleActivityLayoutAttributes
            {
             before(grammarAccess.getFragmentAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityLayoutAttributes();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__ActivityAttributesAssignment_3"


    // $ANTLR start "rule__ActivityLayoutAttributes__LayoutElementsAssignment_1"
    // InternalAndroidGeneratorParser.g:4036:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4040:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGeneratorParser.g:4041:2: ( ruleLayoutElement )
            {
            // InternalAndroidGeneratorParser.g:4041:2: ( ruleLayoutElement )
            // InternalAndroidGeneratorParser.g:4042:3: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__LayoutElementsAssignment_1"


    // $ANTLR start "rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1"
    // InternalAndroidGeneratorParser.g:4051:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4055:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGeneratorParser.g:4056:2: ( ruleLayoutElement )
            {
            // InternalAndroidGeneratorParser.g:4056:2: ( ruleLayoutElement )
            // InternalAndroidGeneratorParser.g:4057:3: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__LayoutElementsAssignment_2_1"


    // $ANTLR start "rule__TypeMap__ActivitytypeattributeAssignment_2"
    // InternalAndroidGeneratorParser.g:4066:1: rule__TypeMap__ActivitytypeattributeAssignment_2 : ( ruleActivityTypeAttributes ) ;
    public final void rule__TypeMap__ActivitytypeattributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4070:1: ( ( ruleActivityTypeAttributes ) )
            // InternalAndroidGeneratorParser.g:4071:2: ( ruleActivityTypeAttributes )
            {
            // InternalAndroidGeneratorParser.g:4071:2: ( ruleActivityTypeAttributes )
            // InternalAndroidGeneratorParser.g:4072:3: ruleActivityTypeAttributes
            {
             before(grammarAccess.getTypeMapAccess().getActivitytypeattributeActivityTypeAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityTypeAttributes();

            state._fsp--;

             after(grammarAccess.getTypeMapAccess().getActivitytypeattributeActivityTypeAttributesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMap__ActivitytypeattributeAssignment_2"


    // $ANTLR start "rule__ActivityTypeAttributes__FilterAssignment"
    // InternalAndroidGeneratorParser.g:4081:1: rule__ActivityTypeAttributes__FilterAssignment : ( ruleFilterQuery ) ;
    public final void rule__ActivityTypeAttributes__FilterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4085:1: ( ( ruleFilterQuery ) )
            // InternalAndroidGeneratorParser.g:4086:2: ( ruleFilterQuery )
            {
            // InternalAndroidGeneratorParser.g:4086:2: ( ruleFilterQuery )
            // InternalAndroidGeneratorParser.g:4087:3: ruleFilterQuery
            {
             before(grammarAccess.getActivityTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterQuery();

            state._fsp--;

             after(grammarAccess.getActivityTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityTypeAttributes__FilterAssignment"


    // $ANTLR start "rule__EditText__NameAssignment_1"
    // InternalAndroidGeneratorParser.g:4096:1: rule__EditText__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EditText__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4100:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4101:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4101:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4102:3: RULE_ID
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
    // InternalAndroidGeneratorParser.g:4111:1: rule__Spinner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Spinner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4115:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4116:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4116:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4117:3: RULE_ID
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
    // InternalAndroidGeneratorParser.g:4126:1: rule__Spinner__SpinnerconAssignment_2_2 : ( ruleSpinnerCon ) ;
    public final void rule__Spinner__SpinnerconAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4130:1: ( ( ruleSpinnerCon ) )
            // InternalAndroidGeneratorParser.g:4131:2: ( ruleSpinnerCon )
            {
            // InternalAndroidGeneratorParser.g:4131:2: ( ruleSpinnerCon )
            // InternalAndroidGeneratorParser.g:4132:3: ruleSpinnerCon
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
    // InternalAndroidGeneratorParser.g:4141:1: rule__Spinner__SpinnerconAssignment_2_3_1 : ( ruleSpinnerCon ) ;
    public final void rule__Spinner__SpinnerconAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4145:1: ( ( ruleSpinnerCon ) )
            // InternalAndroidGeneratorParser.g:4146:2: ( ruleSpinnerCon )
            {
            // InternalAndroidGeneratorParser.g:4146:2: ( ruleSpinnerCon )
            // InternalAndroidGeneratorParser.g:4147:3: ruleSpinnerCon
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
    // InternalAndroidGeneratorParser.g:4156:1: rule__SpinnerCon__TextAssignment : ( RULE_STRING ) ;
    public final void rule__SpinnerCon__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4160:1: ( ( RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:4161:2: ( RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:4161:2: ( RULE_STRING )
            // InternalAndroidGeneratorParser.g:4162:3: RULE_STRING
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
    // InternalAndroidGeneratorParser.g:4171:1: rule__TextView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TextView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4175:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4176:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4176:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4177:3: RULE_ID
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
    // InternalAndroidGeneratorParser.g:4186:1: rule__TextView__TextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TextView__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4190:1: ( ( RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:4191:2: ( RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:4191:2: ( RULE_STRING )
            // InternalAndroidGeneratorParser.g:4192:3: RULE_STRING
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
    // InternalAndroidGeneratorParser.g:4201:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4205:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4206:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4206:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4207:3: RULE_ID
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
    // InternalAndroidGeneratorParser.g:4216:1: rule__Button__ActionsAssignment_4_0 : ( ruleButtonActions ) ;
    public final void rule__Button__ActionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4220:1: ( ( ruleButtonActions ) )
            // InternalAndroidGeneratorParser.g:4221:2: ( ruleButtonActions )
            {
            // InternalAndroidGeneratorParser.g:4221:2: ( ruleButtonActions )
            // InternalAndroidGeneratorParser.g:4222:3: ruleButtonActions
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
    // InternalAndroidGeneratorParser.g:4231:1: rule__Button__ActionsAssignment_4_1_1 : ( ruleButtonActions ) ;
    public final void rule__Button__ActionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4235:1: ( ( ruleButtonActions ) )
            // InternalAndroidGeneratorParser.g:4236:2: ( ruleButtonActions )
            {
            // InternalAndroidGeneratorParser.g:4236:2: ( ruleButtonActions )
            // InternalAndroidGeneratorParser.g:4237:3: ruleButtonActions
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
    // InternalAndroidGeneratorParser.g:4246:1: rule__Toast__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Toast__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4250:1: ( ( RULE_STRING ) )
            // InternalAndroidGeneratorParser.g:4251:2: ( RULE_STRING )
            {
            // InternalAndroidGeneratorParser.g:4251:2: ( RULE_STRING )
            // InternalAndroidGeneratorParser.g:4252:3: RULE_STRING
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
    // InternalAndroidGeneratorParser.g:4261:1: rule__Bundle__BundleRecipientAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bundle__BundleRecipientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4265:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:4266:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGeneratorParser.g:4266:2: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4267:3: ( RULE_ID )
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_1_0()); 
            // InternalAndroidGeneratorParser.g:4268:3: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4269:4: RULE_ID
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
    // InternalAndroidGeneratorParser.g:4280:1: rule__Bundle__HolderAssignment_2 : ( ruleHolder ) ;
    public final void rule__Bundle__HolderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4284:1: ( ( ruleHolder ) )
            // InternalAndroidGeneratorParser.g:4285:2: ( ruleHolder )
            {
            // InternalAndroidGeneratorParser.g:4285:2: ( ruleHolder )
            // InternalAndroidGeneratorParser.g:4286:3: ruleHolder
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
    // InternalAndroidGeneratorParser.g:4295:1: rule__Holder__HolAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Holder__HolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4299:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:4300:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGeneratorParser.g:4300:2: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4301:3: ( RULE_ID )
            {
             before(grammarAccess.getHolderAccess().getHolDataholdersCrossReference_1_0()); 
            // InternalAndroidGeneratorParser.g:4302:3: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4303:4: RULE_ID
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
    // InternalAndroidGeneratorParser.g:4314:1: rule__Holder__HolAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Holder__HolAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4318:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGeneratorParser.g:4319:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGeneratorParser.g:4319:2: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4320:3: ( RULE_ID )
            {
             before(grammarAccess.getHolderAccess().getHolDataholdersCrossReference_2_1_0()); 
            // InternalAndroidGeneratorParser.g:4321:3: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4322:4: RULE_ID
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
    // InternalAndroidGeneratorParser.g:4333:1: rule__FilterQuery__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FilterQuery__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4337:1: ( ( RULE_ID ) )
            // InternalAndroidGeneratorParser.g:4338:2: ( RULE_ID )
            {
            // InternalAndroidGeneratorParser.g:4338:2: ( RULE_ID )
            // InternalAndroidGeneratorParser.g:4339:3: RULE_ID
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
    // InternalAndroidGeneratorParser.g:4348:1: rule__FilterQuery__FilterAttributesAssignment_3 : ( ruleFilterAttributes ) ;
    public final void rule__FilterQuery__FilterAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4352:1: ( ( ruleFilterAttributes ) )
            // InternalAndroidGeneratorParser.g:4353:2: ( ruleFilterAttributes )
            {
            // InternalAndroidGeneratorParser.g:4353:2: ( ruleFilterAttributes )
            // InternalAndroidGeneratorParser.g:4354:3: ruleFilterAttributes
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
    // InternalAndroidGeneratorParser.g:4363:1: rule__FilterAttributes__DistanceAssignment : ( ruleDistance ) ;
    public final void rule__FilterAttributes__DistanceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4367:1: ( ( ruleDistance ) )
            // InternalAndroidGeneratorParser.g:4368:2: ( ruleDistance )
            {
            // InternalAndroidGeneratorParser.g:4368:2: ( ruleDistance )
            // InternalAndroidGeneratorParser.g:4369:3: ruleDistance
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
    // InternalAndroidGeneratorParser.g:4378:1: rule__Distance__UnitAssignment_2 : ( ruleUnit ) ;
    public final void rule__Distance__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4382:1: ( ( ruleUnit ) )
            // InternalAndroidGeneratorParser.g:4383:2: ( ruleUnit )
            {
            // InternalAndroidGeneratorParser.g:4383:2: ( ruleUnit )
            // InternalAndroidGeneratorParser.g:4384:3: ruleUnit
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
    // InternalAndroidGeneratorParser.g:4393:1: rule__Distance__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__Distance__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4397:1: ( ( ruleOperator ) )
            // InternalAndroidGeneratorParser.g:4398:2: ( ruleOperator )
            {
            // InternalAndroidGeneratorParser.g:4398:2: ( ruleOperator )
            // InternalAndroidGeneratorParser.g:4399:3: ruleOperator
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
    // InternalAndroidGeneratorParser.g:4408:1: rule__Distance__ResultsAssignment_4 : ( ruleNumber ) ;
    public final void rule__Distance__ResultsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4412:1: ( ( ruleNumber ) )
            // InternalAndroidGeneratorParser.g:4413:2: ( ruleNumber )
            {
            // InternalAndroidGeneratorParser.g:4413:2: ( ruleNumber )
            // InternalAndroidGeneratorParser.g:4414:3: ruleNumber
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
    // InternalAndroidGeneratorParser.g:4423:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGeneratorParser.g:4427:1: ( ( RULE_INT ) )
            // InternalAndroidGeneratorParser.g:4428:2: ( RULE_INT )
            {
            // InternalAndroidGeneratorParser.g:4428:2: ( RULE_INT )
            // InternalAndroidGeneratorParser.g:4429:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400004080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400004082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800200800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001093400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800440000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L});

}