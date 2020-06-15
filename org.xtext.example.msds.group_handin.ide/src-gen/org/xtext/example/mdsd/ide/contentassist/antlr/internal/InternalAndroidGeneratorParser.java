package org.xtext.example.mdsd.ide.contentassist.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PACKAGE_NAME", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'Application'", "'Android-SDK'", "':'", "'Target-SDK'", "'Minimum-SDK'", "'permissions'", "'elements'", "'Model'", "'Fragment'", "'Map'", "'Settings'", "'EditText'", "'Spinner'", "'Button'", "'Toast'", "'Bundle'", "'FilterQuery'", "'Distance'", "'>'", "'<'", "'='", "'m'", "'f'"
    };
    public static final int RULE_PACKAGE_NAME=5;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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


        public InternalAndroidGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAndroidGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAndroidGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAndroidGenerator.g"; }


    	private AndroidGeneratorGrammarAccess grammarAccess;

    	public void setGrammarAccess(AndroidGeneratorGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAndroidAppProject"
    // InternalAndroidGenerator.g:53:1: entryRuleAndroidAppProject : ruleAndroidAppProject EOF ;
    public final void entryRuleAndroidAppProject() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:54:1: ( ruleAndroidAppProject EOF )
            // InternalAndroidGenerator.g:55:1: ruleAndroidAppProject EOF
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
    // InternalAndroidGenerator.g:62:1: ruleAndroidAppProject : ( ( rule__AndroidAppProject__Group__0 ) ) ;
    public final void ruleAndroidAppProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:66:2: ( ( ( rule__AndroidAppProject__Group__0 ) ) )
            // InternalAndroidGenerator.g:67:2: ( ( rule__AndroidAppProject__Group__0 ) )
            {
            // InternalAndroidGenerator.g:67:2: ( ( rule__AndroidAppProject__Group__0 ) )
            // InternalAndroidGenerator.g:68:3: ( rule__AndroidAppProject__Group__0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup()); 
            // InternalAndroidGenerator.g:69:3: ( rule__AndroidAppProject__Group__0 )
            // InternalAndroidGenerator.g:69:4: rule__AndroidAppProject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndroidAppProject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getGroup()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:78:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:79:1: ( ruleApplication EOF )
            // InternalAndroidGenerator.g:80:1: ruleApplication EOF
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
    // InternalAndroidGenerator.g:87:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:91:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalAndroidGenerator.g:92:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalAndroidGenerator.g:92:2: ( ( rule__Application__Group__0 ) )
            // InternalAndroidGenerator.g:93:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalAndroidGenerator.g:94:3: ( rule__Application__Group__0 )
            // InternalAndroidGenerator.g:94:4: rule__Application__Group__0
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
    // InternalAndroidGenerator.g:103:1: entryRuleApplicationAttribute : ruleApplicationAttribute EOF ;
    public final void entryRuleApplicationAttribute() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:104:1: ( ruleApplicationAttribute EOF )
            // InternalAndroidGenerator.g:105:1: ruleApplicationAttribute EOF
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
    // InternalAndroidGenerator.g:112:1: ruleApplicationAttribute : ( ( rule__ApplicationAttribute__Alternatives ) ) ;
    public final void ruleApplicationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:116:2: ( ( ( rule__ApplicationAttribute__Alternatives ) ) )
            // InternalAndroidGenerator.g:117:2: ( ( rule__ApplicationAttribute__Alternatives ) )
            {
            // InternalAndroidGenerator.g:117:2: ( ( rule__ApplicationAttribute__Alternatives ) )
            // InternalAndroidGenerator.g:118:3: ( rule__ApplicationAttribute__Alternatives )
            {
             before(grammarAccess.getApplicationAttributeAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:119:3: ( rule__ApplicationAttribute__Alternatives )
            // InternalAndroidGenerator.g:119:4: rule__ApplicationAttribute__Alternatives
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
    // InternalAndroidGenerator.g:128:1: entryRuleApplicationVersion : ruleApplicationVersion EOF ;
    public final void entryRuleApplicationVersion() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:129:1: ( ruleApplicationVersion EOF )
            // InternalAndroidGenerator.g:130:1: ruleApplicationVersion EOF
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
    // InternalAndroidGenerator.g:137:1: ruleApplicationVersion : ( ( rule__ApplicationVersion__Group__0 ) ) ;
    public final void ruleApplicationVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:141:2: ( ( ( rule__ApplicationVersion__Group__0 ) ) )
            // InternalAndroidGenerator.g:142:2: ( ( rule__ApplicationVersion__Group__0 ) )
            {
            // InternalAndroidGenerator.g:142:2: ( ( rule__ApplicationVersion__Group__0 ) )
            // InternalAndroidGenerator.g:143:3: ( rule__ApplicationVersion__Group__0 )
            {
             before(grammarAccess.getApplicationVersionAccess().getGroup()); 
            // InternalAndroidGenerator.g:144:3: ( rule__ApplicationVersion__Group__0 )
            // InternalAndroidGenerator.g:144:4: rule__ApplicationVersion__Group__0
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
    // InternalAndroidGenerator.g:153:1: entryRuleTargetSDK : ruleTargetSDK EOF ;
    public final void entryRuleTargetSDK() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:154:1: ( ruleTargetSDK EOF )
            // InternalAndroidGenerator.g:155:1: ruleTargetSDK EOF
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
    // InternalAndroidGenerator.g:162:1: ruleTargetSDK : ( ( rule__TargetSDK__Group__0 ) ) ;
    public final void ruleTargetSDK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:166:2: ( ( ( rule__TargetSDK__Group__0 ) ) )
            // InternalAndroidGenerator.g:167:2: ( ( rule__TargetSDK__Group__0 ) )
            {
            // InternalAndroidGenerator.g:167:2: ( ( rule__TargetSDK__Group__0 ) )
            // InternalAndroidGenerator.g:168:3: ( rule__TargetSDK__Group__0 )
            {
             before(grammarAccess.getTargetSDKAccess().getGroup()); 
            // InternalAndroidGenerator.g:169:3: ( rule__TargetSDK__Group__0 )
            // InternalAndroidGenerator.g:169:4: rule__TargetSDK__Group__0
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
    // InternalAndroidGenerator.g:178:1: entryRuleMinSDK : ruleMinSDK EOF ;
    public final void entryRuleMinSDK() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:179:1: ( ruleMinSDK EOF )
            // InternalAndroidGenerator.g:180:1: ruleMinSDK EOF
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
    // InternalAndroidGenerator.g:187:1: ruleMinSDK : ( ( rule__MinSDK__Group__0 ) ) ;
    public final void ruleMinSDK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:191:2: ( ( ( rule__MinSDK__Group__0 ) ) )
            // InternalAndroidGenerator.g:192:2: ( ( rule__MinSDK__Group__0 ) )
            {
            // InternalAndroidGenerator.g:192:2: ( ( rule__MinSDK__Group__0 ) )
            // InternalAndroidGenerator.g:193:3: ( rule__MinSDK__Group__0 )
            {
             before(grammarAccess.getMinSDKAccess().getGroup()); 
            // InternalAndroidGenerator.g:194:3: ( rule__MinSDK__Group__0 )
            // InternalAndroidGenerator.g:194:4: rule__MinSDK__Group__0
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
    // InternalAndroidGenerator.g:203:1: entryRuleApplicationPermissionList : ruleApplicationPermissionList EOF ;
    public final void entryRuleApplicationPermissionList() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:204:1: ( ruleApplicationPermissionList EOF )
            // InternalAndroidGenerator.g:205:1: ruleApplicationPermissionList EOF
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
    // InternalAndroidGenerator.g:212:1: ruleApplicationPermissionList : ( ( rule__ApplicationPermissionList__Group__0 ) ) ;
    public final void ruleApplicationPermissionList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:216:2: ( ( ( rule__ApplicationPermissionList__Group__0 ) ) )
            // InternalAndroidGenerator.g:217:2: ( ( rule__ApplicationPermissionList__Group__0 ) )
            {
            // InternalAndroidGenerator.g:217:2: ( ( rule__ApplicationPermissionList__Group__0 ) )
            // InternalAndroidGenerator.g:218:3: ( rule__ApplicationPermissionList__Group__0 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup()); 
            // InternalAndroidGenerator.g:219:3: ( rule__ApplicationPermissionList__Group__0 )
            // InternalAndroidGenerator.g:219:4: rule__ApplicationPermissionList__Group__0
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
    // InternalAndroidGenerator.g:228:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:229:1: ( rulePermission EOF )
            // InternalAndroidGenerator.g:230:1: rulePermission EOF
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
    // InternalAndroidGenerator.g:237:1: rulePermission : ( ( rule__Permission__NameAssignment ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:241:2: ( ( ( rule__Permission__NameAssignment ) ) )
            // InternalAndroidGenerator.g:242:2: ( ( rule__Permission__NameAssignment ) )
            {
            // InternalAndroidGenerator.g:242:2: ( ( rule__Permission__NameAssignment ) )
            // InternalAndroidGenerator.g:243:3: ( rule__Permission__NameAssignment )
            {
             before(grammarAccess.getPermissionAccess().getNameAssignment()); 
            // InternalAndroidGenerator.g:244:3: ( rule__Permission__NameAssignment )
            // InternalAndroidGenerator.g:244:4: rule__Permission__NameAssignment
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
    // InternalAndroidGenerator.g:253:1: entryRuleApplicationElementList : ruleApplicationElementList EOF ;
    public final void entryRuleApplicationElementList() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:254:1: ( ruleApplicationElementList EOF )
            // InternalAndroidGenerator.g:255:1: ruleApplicationElementList EOF
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
    // InternalAndroidGenerator.g:262:1: ruleApplicationElementList : ( ( rule__ApplicationElementList__Group__0 ) ) ;
    public final void ruleApplicationElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:266:2: ( ( ( rule__ApplicationElementList__Group__0 ) ) )
            // InternalAndroidGenerator.g:267:2: ( ( rule__ApplicationElementList__Group__0 ) )
            {
            // InternalAndroidGenerator.g:267:2: ( ( rule__ApplicationElementList__Group__0 ) )
            // InternalAndroidGenerator.g:268:3: ( rule__ApplicationElementList__Group__0 )
            {
             before(grammarAccess.getApplicationElementListAccess().getGroup()); 
            // InternalAndroidGenerator.g:269:3: ( rule__ApplicationElementList__Group__0 )
            // InternalAndroidGenerator.g:269:4: rule__ApplicationElementList__Group__0
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
    // InternalAndroidGenerator.g:278:1: entryRuleApplicationElement : ruleApplicationElement EOF ;
    public final void entryRuleApplicationElement() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:279:1: ( ruleApplicationElement EOF )
            // InternalAndroidGenerator.g:280:1: ruleApplicationElement EOF
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
    // InternalAndroidGenerator.g:287:1: ruleApplicationElement : ( ( rule__ApplicationElement__Alternatives ) ) ;
    public final void ruleApplicationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:291:2: ( ( ( rule__ApplicationElement__Alternatives ) ) )
            // InternalAndroidGenerator.g:292:2: ( ( rule__ApplicationElement__Alternatives ) )
            {
            // InternalAndroidGenerator.g:292:2: ( ( rule__ApplicationElement__Alternatives ) )
            // InternalAndroidGenerator.g:293:3: ( rule__ApplicationElement__Alternatives )
            {
             before(grammarAccess.getApplicationElementAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:294:3: ( rule__ApplicationElement__Alternatives )
            // InternalAndroidGenerator.g:294:4: rule__ApplicationElement__Alternatives
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
    // InternalAndroidGenerator.g:303:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:304:1: ( ruleModel EOF )
            // InternalAndroidGenerator.g:305:1: ruleModel EOF
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
    // InternalAndroidGenerator.g:312:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:316:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAndroidGenerator.g:317:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAndroidGenerator.g:317:2: ( ( rule__Model__Group__0 ) )
            // InternalAndroidGenerator.g:318:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAndroidGenerator.g:319:3: ( rule__Model__Group__0 )
            // InternalAndroidGenerator.g:319:4: rule__Model__Group__0
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
    // InternalAndroidGenerator.g:328:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:329:1: ( ruleFragment EOF )
            // InternalAndroidGenerator.g:330:1: ruleFragment EOF
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
    // InternalAndroidGenerator.g:337:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:341:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalAndroidGenerator.g:342:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalAndroidGenerator.g:342:2: ( ( rule__Fragment__Group__0 ) )
            // InternalAndroidGenerator.g:343:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalAndroidGenerator.g:344:3: ( rule__Fragment__Group__0 )
            // InternalAndroidGenerator.g:344:4: rule__Fragment__Group__0
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
    // InternalAndroidGenerator.g:353:1: entryRuleActivityLayoutAttributes : ruleActivityLayoutAttributes EOF ;
    public final void entryRuleActivityLayoutAttributes() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:354:1: ( ruleActivityLayoutAttributes EOF )
            // InternalAndroidGenerator.g:355:1: ruleActivityLayoutAttributes EOF
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
    // InternalAndroidGenerator.g:362:1: ruleActivityLayoutAttributes : ( ( rule__ActivityLayoutAttributes__Group__0 ) ) ;
    public final void ruleActivityLayoutAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:366:2: ( ( ( rule__ActivityLayoutAttributes__Group__0 ) ) )
            // InternalAndroidGenerator.g:367:2: ( ( rule__ActivityLayoutAttributes__Group__0 ) )
            {
            // InternalAndroidGenerator.g:367:2: ( ( rule__ActivityLayoutAttributes__Group__0 ) )
            // InternalAndroidGenerator.g:368:3: ( rule__ActivityLayoutAttributes__Group__0 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getGroup()); 
            // InternalAndroidGenerator.g:369:3: ( rule__ActivityLayoutAttributes__Group__0 )
            // InternalAndroidGenerator.g:369:4: rule__ActivityLayoutAttributes__Group__0
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
    // InternalAndroidGenerator.g:378:1: entryRuleLayoutElement : ruleLayoutElement EOF ;
    public final void entryRuleLayoutElement() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:379:1: ( ruleLayoutElement EOF )
            // InternalAndroidGenerator.g:380:1: ruleLayoutElement EOF
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
    // InternalAndroidGenerator.g:387:1: ruleLayoutElement : ( ( rule__LayoutElement__Alternatives ) ) ;
    public final void ruleLayoutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:391:2: ( ( ( rule__LayoutElement__Alternatives ) ) )
            // InternalAndroidGenerator.g:392:2: ( ( rule__LayoutElement__Alternatives ) )
            {
            // InternalAndroidGenerator.g:392:2: ( ( rule__LayoutElement__Alternatives ) )
            // InternalAndroidGenerator.g:393:3: ( rule__LayoutElement__Alternatives )
            {
             before(grammarAccess.getLayoutElementAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:394:3: ( rule__LayoutElement__Alternatives )
            // InternalAndroidGenerator.g:394:4: rule__LayoutElement__Alternatives
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


    // $ANTLR start "entryRuleTypeMap"
    // InternalAndroidGenerator.g:403:1: entryRuleTypeMap : ruleTypeMap EOF ;
    public final void entryRuleTypeMap() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:404:1: ( ruleTypeMap EOF )
            // InternalAndroidGenerator.g:405:1: ruleTypeMap EOF
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
    // InternalAndroidGenerator.g:412:1: ruleTypeMap : ( ( rule__TypeMap__Group__0 ) ) ;
    public final void ruleTypeMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:416:2: ( ( ( rule__TypeMap__Group__0 ) ) )
            // InternalAndroidGenerator.g:417:2: ( ( rule__TypeMap__Group__0 ) )
            {
            // InternalAndroidGenerator.g:417:2: ( ( rule__TypeMap__Group__0 ) )
            // InternalAndroidGenerator.g:418:3: ( rule__TypeMap__Group__0 )
            {
             before(grammarAccess.getTypeMapAccess().getGroup()); 
            // InternalAndroidGenerator.g:419:3: ( rule__TypeMap__Group__0 )
            // InternalAndroidGenerator.g:419:4: rule__TypeMap__Group__0
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
    // InternalAndroidGenerator.g:428:1: entryRuleTypeSetting : ruleTypeSetting EOF ;
    public final void entryRuleTypeSetting() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:429:1: ( ruleTypeSetting EOF )
            // InternalAndroidGenerator.g:430:1: ruleTypeSetting EOF
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
    // InternalAndroidGenerator.g:437:1: ruleTypeSetting : ( ( rule__TypeSetting__Group__0 ) ) ;
    public final void ruleTypeSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:441:2: ( ( ( rule__TypeSetting__Group__0 ) ) )
            // InternalAndroidGenerator.g:442:2: ( ( rule__TypeSetting__Group__0 ) )
            {
            // InternalAndroidGenerator.g:442:2: ( ( rule__TypeSetting__Group__0 ) )
            // InternalAndroidGenerator.g:443:3: ( rule__TypeSetting__Group__0 )
            {
             before(grammarAccess.getTypeSettingAccess().getGroup()); 
            // InternalAndroidGenerator.g:444:3: ( rule__TypeSetting__Group__0 )
            // InternalAndroidGenerator.g:444:4: rule__TypeSetting__Group__0
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
    // InternalAndroidGenerator.g:453:1: entryRuleActivityTypeAttributes : ruleActivityTypeAttributes EOF ;
    public final void entryRuleActivityTypeAttributes() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:454:1: ( ruleActivityTypeAttributes EOF )
            // InternalAndroidGenerator.g:455:1: ruleActivityTypeAttributes EOF
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
    // InternalAndroidGenerator.g:462:1: ruleActivityTypeAttributes : ( ( rule__ActivityTypeAttributes__FilterAssignment ) ) ;
    public final void ruleActivityTypeAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:466:2: ( ( ( rule__ActivityTypeAttributes__FilterAssignment ) ) )
            // InternalAndroidGenerator.g:467:2: ( ( rule__ActivityTypeAttributes__FilterAssignment ) )
            {
            // InternalAndroidGenerator.g:467:2: ( ( rule__ActivityTypeAttributes__FilterAssignment ) )
            // InternalAndroidGenerator.g:468:3: ( rule__ActivityTypeAttributes__FilterAssignment )
            {
             before(grammarAccess.getActivityTypeAttributesAccess().getFilterAssignment()); 
            // InternalAndroidGenerator.g:469:3: ( rule__ActivityTypeAttributes__FilterAssignment )
            // InternalAndroidGenerator.g:469:4: rule__ActivityTypeAttributes__FilterAssignment
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
    // InternalAndroidGenerator.g:478:1: entryRuleEditText : ruleEditText EOF ;
    public final void entryRuleEditText() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:479:1: ( ruleEditText EOF )
            // InternalAndroidGenerator.g:480:1: ruleEditText EOF
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
    // InternalAndroidGenerator.g:487:1: ruleEditText : ( ( rule__EditText__Group__0 ) ) ;
    public final void ruleEditText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:491:2: ( ( ( rule__EditText__Group__0 ) ) )
            // InternalAndroidGenerator.g:492:2: ( ( rule__EditText__Group__0 ) )
            {
            // InternalAndroidGenerator.g:492:2: ( ( rule__EditText__Group__0 ) )
            // InternalAndroidGenerator.g:493:3: ( rule__EditText__Group__0 )
            {
             before(grammarAccess.getEditTextAccess().getGroup()); 
            // InternalAndroidGenerator.g:494:3: ( rule__EditText__Group__0 )
            // InternalAndroidGenerator.g:494:4: rule__EditText__Group__0
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
    // InternalAndroidGenerator.g:503:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:504:1: ( ruleSpinner EOF )
            // InternalAndroidGenerator.g:505:1: ruleSpinner EOF
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
    // InternalAndroidGenerator.g:512:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:516:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // InternalAndroidGenerator.g:517:2: ( ( rule__Spinner__Group__0 ) )
            {
            // InternalAndroidGenerator.g:517:2: ( ( rule__Spinner__Group__0 ) )
            // InternalAndroidGenerator.g:518:3: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // InternalAndroidGenerator.g:519:3: ( rule__Spinner__Group__0 )
            // InternalAndroidGenerator.g:519:4: rule__Spinner__Group__0
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


    // $ANTLR start "entryRuleButton"
    // InternalAndroidGenerator.g:528:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:529:1: ( ruleButton EOF )
            // InternalAndroidGenerator.g:530:1: ruleButton EOF
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
    // InternalAndroidGenerator.g:537:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:541:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalAndroidGenerator.g:542:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalAndroidGenerator.g:542:2: ( ( rule__Button__Group__0 ) )
            // InternalAndroidGenerator.g:543:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalAndroidGenerator.g:544:3: ( rule__Button__Group__0 )
            // InternalAndroidGenerator.g:544:4: rule__Button__Group__0
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
    // InternalAndroidGenerator.g:553:1: entryRuleButtonActions : ruleButtonActions EOF ;
    public final void entryRuleButtonActions() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:554:1: ( ruleButtonActions EOF )
            // InternalAndroidGenerator.g:555:1: ruleButtonActions EOF
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
    // InternalAndroidGenerator.g:562:1: ruleButtonActions : ( ( rule__ButtonActions__Alternatives ) ) ;
    public final void ruleButtonActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:566:2: ( ( ( rule__ButtonActions__Alternatives ) ) )
            // InternalAndroidGenerator.g:567:2: ( ( rule__ButtonActions__Alternatives ) )
            {
            // InternalAndroidGenerator.g:567:2: ( ( rule__ButtonActions__Alternatives ) )
            // InternalAndroidGenerator.g:568:3: ( rule__ButtonActions__Alternatives )
            {
             before(grammarAccess.getButtonActionsAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:569:3: ( rule__ButtonActions__Alternatives )
            // InternalAndroidGenerator.g:569:4: rule__ButtonActions__Alternatives
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
    // InternalAndroidGenerator.g:578:1: entryRuleToast : ruleToast EOF ;
    public final void entryRuleToast() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:579:1: ( ruleToast EOF )
            // InternalAndroidGenerator.g:580:1: ruleToast EOF
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
    // InternalAndroidGenerator.g:587:1: ruleToast : ( ( rule__Toast__Group__0 ) ) ;
    public final void ruleToast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:591:2: ( ( ( rule__Toast__Group__0 ) ) )
            // InternalAndroidGenerator.g:592:2: ( ( rule__Toast__Group__0 ) )
            {
            // InternalAndroidGenerator.g:592:2: ( ( rule__Toast__Group__0 ) )
            // InternalAndroidGenerator.g:593:3: ( rule__Toast__Group__0 )
            {
             before(grammarAccess.getToastAccess().getGroup()); 
            // InternalAndroidGenerator.g:594:3: ( rule__Toast__Group__0 )
            // InternalAndroidGenerator.g:594:4: rule__Toast__Group__0
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
    // InternalAndroidGenerator.g:603:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:604:1: ( ruleBundle EOF )
            // InternalAndroidGenerator.g:605:1: ruleBundle EOF
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
    // InternalAndroidGenerator.g:612:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:616:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // InternalAndroidGenerator.g:617:2: ( ( rule__Bundle__Group__0 ) )
            {
            // InternalAndroidGenerator.g:617:2: ( ( rule__Bundle__Group__0 ) )
            // InternalAndroidGenerator.g:618:3: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // InternalAndroidGenerator.g:619:3: ( rule__Bundle__Group__0 )
            // InternalAndroidGenerator.g:619:4: rule__Bundle__Group__0
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


    // $ANTLR start "entryRuleFilterQuery"
    // InternalAndroidGenerator.g:628:1: entryRuleFilterQuery : ruleFilterQuery EOF ;
    public final void entryRuleFilterQuery() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:629:1: ( ruleFilterQuery EOF )
            // InternalAndroidGenerator.g:630:1: ruleFilterQuery EOF
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
    // InternalAndroidGenerator.g:637:1: ruleFilterQuery : ( ( rule__FilterQuery__Group__0 ) ) ;
    public final void ruleFilterQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:641:2: ( ( ( rule__FilterQuery__Group__0 ) ) )
            // InternalAndroidGenerator.g:642:2: ( ( rule__FilterQuery__Group__0 ) )
            {
            // InternalAndroidGenerator.g:642:2: ( ( rule__FilterQuery__Group__0 ) )
            // InternalAndroidGenerator.g:643:3: ( rule__FilterQuery__Group__0 )
            {
             before(grammarAccess.getFilterQueryAccess().getGroup()); 
            // InternalAndroidGenerator.g:644:3: ( rule__FilterQuery__Group__0 )
            // InternalAndroidGenerator.g:644:4: rule__FilterQuery__Group__0
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
    // InternalAndroidGenerator.g:653:1: entryRuleFilterAttributes : ruleFilterAttributes EOF ;
    public final void entryRuleFilterAttributes() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:654:1: ( ruleFilterAttributes EOF )
            // InternalAndroidGenerator.g:655:1: ruleFilterAttributes EOF
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
    // InternalAndroidGenerator.g:662:1: ruleFilterAttributes : ( ( rule__FilterAttributes__DistanceAssignment ) ) ;
    public final void ruleFilterAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:666:2: ( ( ( rule__FilterAttributes__DistanceAssignment ) ) )
            // InternalAndroidGenerator.g:667:2: ( ( rule__FilterAttributes__DistanceAssignment ) )
            {
            // InternalAndroidGenerator.g:667:2: ( ( rule__FilterAttributes__DistanceAssignment ) )
            // InternalAndroidGenerator.g:668:3: ( rule__FilterAttributes__DistanceAssignment )
            {
             before(grammarAccess.getFilterAttributesAccess().getDistanceAssignment()); 
            // InternalAndroidGenerator.g:669:3: ( rule__FilterAttributes__DistanceAssignment )
            // InternalAndroidGenerator.g:669:4: rule__FilterAttributes__DistanceAssignment
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
    // InternalAndroidGenerator.g:678:1: entryRuleDistance : ruleDistance EOF ;
    public final void entryRuleDistance() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:679:1: ( ruleDistance EOF )
            // InternalAndroidGenerator.g:680:1: ruleDistance EOF
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
    // InternalAndroidGenerator.g:687:1: ruleDistance : ( ( rule__Distance__Group__0 ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:691:2: ( ( ( rule__Distance__Group__0 ) ) )
            // InternalAndroidGenerator.g:692:2: ( ( rule__Distance__Group__0 ) )
            {
            // InternalAndroidGenerator.g:692:2: ( ( rule__Distance__Group__0 ) )
            // InternalAndroidGenerator.g:693:3: ( rule__Distance__Group__0 )
            {
             before(grammarAccess.getDistanceAccess().getGroup()); 
            // InternalAndroidGenerator.g:694:3: ( rule__Distance__Group__0 )
            // InternalAndroidGenerator.g:694:4: rule__Distance__Group__0
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
    // InternalAndroidGenerator.g:703:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:704:1: ( ruleNumber EOF )
            // InternalAndroidGenerator.g:705:1: ruleNumber EOF
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
    // InternalAndroidGenerator.g:712:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:716:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalAndroidGenerator.g:717:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalAndroidGenerator.g:717:2: ( ( rule__Number__ValueAssignment ) )
            // InternalAndroidGenerator.g:718:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalAndroidGenerator.g:719:3: ( rule__Number__ValueAssignment )
            // InternalAndroidGenerator.g:719:4: rule__Number__ValueAssignment
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
    // InternalAndroidGenerator.g:728:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:729:1: ( ruleOperator EOF )
            // InternalAndroidGenerator.g:730:1: ruleOperator EOF
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
    // InternalAndroidGenerator.g:737:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:741:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalAndroidGenerator.g:742:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalAndroidGenerator.g:742:2: ( ( rule__Operator__Alternatives ) )
            // InternalAndroidGenerator.g:743:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:744:3: ( rule__Operator__Alternatives )
            // InternalAndroidGenerator.g:744:4: rule__Operator__Alternatives
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
    // InternalAndroidGenerator.g:753:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:754:1: ( ruleUnit EOF )
            // InternalAndroidGenerator.g:755:1: ruleUnit EOF
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
    // InternalAndroidGenerator.g:762:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:766:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalAndroidGenerator.g:767:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalAndroidGenerator.g:767:2: ( ( rule__Unit__Alternatives ) )
            // InternalAndroidGenerator.g:768:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:769:3: ( rule__Unit__Alternatives )
            // InternalAndroidGenerator.g:769:4: rule__Unit__Alternatives
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
    // InternalAndroidGenerator.g:777:1: rule__ApplicationAttribute__Alternatives : ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:781:1: ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAndroidGenerator.g:782:2: ( ruleApplicationVersion )
                    {
                    // InternalAndroidGenerator.g:782:2: ( ruleApplicationVersion )
                    // InternalAndroidGenerator.g:783:3: ruleApplicationVersion
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
                    // InternalAndroidGenerator.g:788:2: ( ruleApplicationPermissionList )
                    {
                    // InternalAndroidGenerator.g:788:2: ( ruleApplicationPermissionList )
                    // InternalAndroidGenerator.g:789:3: ruleApplicationPermissionList
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
                    // InternalAndroidGenerator.g:794:2: ( ruleApplicationElementList )
                    {
                    // InternalAndroidGenerator.g:794:2: ( ruleApplicationElementList )
                    // InternalAndroidGenerator.g:795:3: ruleApplicationElementList
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
    // InternalAndroidGenerator.g:804:1: rule__ApplicationElement__Alternatives : ( ( ruleFragment ) | ( ruleModel ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:808:1: ( ( ruleFragment ) | ( ruleModel ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAndroidGenerator.g:809:2: ( ruleFragment )
                    {
                    // InternalAndroidGenerator.g:809:2: ( ruleFragment )
                    // InternalAndroidGenerator.g:810:3: ruleFragment
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
                    // InternalAndroidGenerator.g:815:2: ( ruleModel )
                    {
                    // InternalAndroidGenerator.g:815:2: ( ruleModel )
                    // InternalAndroidGenerator.g:816:3: ruleModel
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
    // InternalAndroidGenerator.g:825:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleEditText ) | ( ruleSpinner ) | ( ruleTypeMap ) | ( ruleTypeSetting ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:829:1: ( ( ruleButton ) | ( ruleEditText ) | ( ruleSpinner ) | ( ruleTypeMap ) | ( ruleTypeSetting ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAndroidGenerator.g:830:2: ( ruleButton )
                    {
                    // InternalAndroidGenerator.g:830:2: ( ruleButton )
                    // InternalAndroidGenerator.g:831:3: ruleButton
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
                    // InternalAndroidGenerator.g:836:2: ( ruleEditText )
                    {
                    // InternalAndroidGenerator.g:836:2: ( ruleEditText )
                    // InternalAndroidGenerator.g:837:3: ruleEditText
                    {
                     before(grammarAccess.getLayoutElementAccess().getEditTextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEditText();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getEditTextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGenerator.g:842:2: ( ruleSpinner )
                    {
                    // InternalAndroidGenerator.g:842:2: ( ruleSpinner )
                    // InternalAndroidGenerator.g:843:3: ruleSpinner
                    {
                     before(grammarAccess.getLayoutElementAccess().getSpinnerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSpinner();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getSpinnerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAndroidGenerator.g:848:2: ( ruleTypeMap )
                    {
                    // InternalAndroidGenerator.g:848:2: ( ruleTypeMap )
                    // InternalAndroidGenerator.g:849:3: ruleTypeMap
                    {
                     before(grammarAccess.getLayoutElementAccess().getTypeMapParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeMap();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getTypeMapParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAndroidGenerator.g:854:2: ( ruleTypeSetting )
                    {
                    // InternalAndroidGenerator.g:854:2: ( ruleTypeSetting )
                    // InternalAndroidGenerator.g:855:3: ruleTypeSetting
                    {
                     before(grammarAccess.getLayoutElementAccess().getTypeSettingParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeSetting();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getTypeSettingParserRuleCall_4()); 

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


    // $ANTLR start "rule__ButtonActions__Alternatives"
    // InternalAndroidGenerator.g:864:1: rule__ButtonActions__Alternatives : ( ( ruleToast ) | ( ruleBundle ) );
    public final void rule__ButtonActions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:868:1: ( ( ruleToast ) | ( ruleBundle ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAndroidGenerator.g:869:2: ( ruleToast )
                    {
                    // InternalAndroidGenerator.g:869:2: ( ruleToast )
                    // InternalAndroidGenerator.g:870:3: ruleToast
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
                    // InternalAndroidGenerator.g:875:2: ( ruleBundle )
                    {
                    // InternalAndroidGenerator.g:875:2: ( ruleBundle )
                    // InternalAndroidGenerator.g:876:3: ruleBundle
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
    // InternalAndroidGenerator.g:885:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:889:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
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
                    // InternalAndroidGenerator.g:890:2: ( ( rule__Operator__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:890:2: ( ( rule__Operator__Group_0__0 ) )
                    // InternalAndroidGenerator.g:891:3: ( rule__Operator__Group_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:892:3: ( rule__Operator__Group_0__0 )
                    // InternalAndroidGenerator.g:892:4: rule__Operator__Group_0__0
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
                    // InternalAndroidGenerator.g:896:2: ( ( rule__Operator__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:896:2: ( ( rule__Operator__Group_1__0 ) )
                    // InternalAndroidGenerator.g:897:3: ( rule__Operator__Group_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:898:3: ( rule__Operator__Group_1__0 )
                    // InternalAndroidGenerator.g:898:4: rule__Operator__Group_1__0
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
                    // InternalAndroidGenerator.g:902:2: ( ( rule__Operator__Group_2__0 ) )
                    {
                    // InternalAndroidGenerator.g:902:2: ( ( rule__Operator__Group_2__0 ) )
                    // InternalAndroidGenerator.g:903:3: ( rule__Operator__Group_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_2()); 
                    // InternalAndroidGenerator.g:904:3: ( rule__Operator__Group_2__0 )
                    // InternalAndroidGenerator.g:904:4: rule__Operator__Group_2__0
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
    // InternalAndroidGenerator.g:912:1: rule__Unit__Alternatives : ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:916:1: ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAndroidGenerator.g:917:2: ( ( rule__Unit__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:917:2: ( ( rule__Unit__Group_0__0 ) )
                    // InternalAndroidGenerator.g:918:3: ( rule__Unit__Group_0__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:919:3: ( rule__Unit__Group_0__0 )
                    // InternalAndroidGenerator.g:919:4: rule__Unit__Group_0__0
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
                    // InternalAndroidGenerator.g:923:2: ( ( rule__Unit__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:923:2: ( ( rule__Unit__Group_1__0 ) )
                    // InternalAndroidGenerator.g:924:3: ( rule__Unit__Group_1__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:925:3: ( rule__Unit__Group_1__0 )
                    // InternalAndroidGenerator.g:925:4: rule__Unit__Group_1__0
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


    // $ANTLR start "rule__AndroidAppProject__Group__0"
    // InternalAndroidGenerator.g:933:1: rule__AndroidAppProject__Group__0 : rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 ;
    public final void rule__AndroidAppProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:937:1: ( rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 )
            // InternalAndroidGenerator.g:938:2: rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AndroidAppProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndroidAppProject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group__0"


    // $ANTLR start "rule__AndroidAppProject__Group__0__Impl"
    // InternalAndroidGenerator.g:945:1: rule__AndroidAppProject__Group__0__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) ;
    public final void rule__AndroidAppProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:949:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) )
            // InternalAndroidGenerator.g:950:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:950:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            // InternalAndroidGenerator.g:951:2: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 
            // InternalAndroidGenerator.g:952:2: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            // InternalAndroidGenerator.g:952:3: rule__AndroidAppProject__ApplicationsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AndroidAppProject__ApplicationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group__0__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group__1"
    // InternalAndroidGenerator.g:960:1: rule__AndroidAppProject__Group__1 : rule__AndroidAppProject__Group__1__Impl ;
    public final void rule__AndroidAppProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:964:1: ( rule__AndroidAppProject__Group__1__Impl )
            // InternalAndroidGenerator.g:965:2: rule__AndroidAppProject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndroidAppProject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group__1"


    // $ANTLR start "rule__AndroidAppProject__Group__1__Impl"
    // InternalAndroidGenerator.g:971:1: rule__AndroidAppProject__Group__1__Impl : ( ( rule__AndroidAppProject__Group_1__0 )* ) ;
    public final void rule__AndroidAppProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:975:1: ( ( ( rule__AndroidAppProject__Group_1__0 )* ) )
            // InternalAndroidGenerator.g:976:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            {
            // InternalAndroidGenerator.g:976:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            // InternalAndroidGenerator.g:977:2: ( rule__AndroidAppProject__Group_1__0 )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:978:2: ( rule__AndroidAppProject__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAndroidGenerator.g:978:3: rule__AndroidAppProject__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__AndroidAppProject__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group__1__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group_1__0"
    // InternalAndroidGenerator.g:987:1: rule__AndroidAppProject__Group_1__0 : rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 ;
    public final void rule__AndroidAppProject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:991:1: ( rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 )
            // InternalAndroidGenerator.g:992:2: rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__AndroidAppProject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndroidAppProject__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group_1__0"


    // $ANTLR start "rule__AndroidAppProject__Group_1__0__Impl"
    // InternalAndroidGenerator.g:999:1: rule__AndroidAppProject__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AndroidAppProject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1003:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:1004:1: ( ',' )
            {
            // InternalAndroidGenerator.g:1004:1: ( ',' )
            // InternalAndroidGenerator.g:1005:2: ','
            {
             before(grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group_1__0__Impl"


    // $ANTLR start "rule__AndroidAppProject__Group_1__1"
    // InternalAndroidGenerator.g:1014:1: rule__AndroidAppProject__Group_1__1 : rule__AndroidAppProject__Group_1__1__Impl ;
    public final void rule__AndroidAppProject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1018:1: ( rule__AndroidAppProject__Group_1__1__Impl )
            // InternalAndroidGenerator.g:1019:2: rule__AndroidAppProject__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndroidAppProject__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group_1__1"


    // $ANTLR start "rule__AndroidAppProject__Group_1__1__Impl"
    // InternalAndroidGenerator.g:1025:1: rule__AndroidAppProject__Group_1__1__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) ;
    public final void rule__AndroidAppProject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1029:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:1030:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:1030:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            // InternalAndroidGenerator.g:1031:2: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 
            // InternalAndroidGenerator.g:1032:2: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            // InternalAndroidGenerator.g:1032:3: rule__AndroidAppProject__ApplicationsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndroidAppProject__ApplicationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__Group_1__1__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // InternalAndroidGenerator.g:1041:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1045:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalAndroidGenerator.g:1046:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:1053:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1057:1: ( ( 'Application' ) )
            // InternalAndroidGenerator.g:1058:1: ( 'Application' )
            {
            // InternalAndroidGenerator.g:1058:1: ( 'Application' )
            // InternalAndroidGenerator.g:1059:2: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:1068:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1072:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalAndroidGenerator.g:1073:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalAndroidGenerator.g:1080:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1084:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1085:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1085:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:1086:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:1087:2: ( rule__Application__NameAssignment_1 )
            // InternalAndroidGenerator.g:1087:3: rule__Application__NameAssignment_1
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
    // InternalAndroidGenerator.g:1095:1: rule__Application__Group__2 : rule__Application__Group__2__Impl ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1099:1: ( rule__Application__Group__2__Impl )
            // InternalAndroidGenerator.g:1100:2: rule__Application__Group__2__Impl
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
    // InternalAndroidGenerator.g:1106:1: rule__Application__Group__2__Impl : ( ( rule__Application__AttributesAssignment_2 )* ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1110:1: ( ( ( rule__Application__AttributesAssignment_2 )* ) )
            // InternalAndroidGenerator.g:1111:1: ( ( rule__Application__AttributesAssignment_2 )* )
            {
            // InternalAndroidGenerator.g:1111:1: ( ( rule__Application__AttributesAssignment_2 )* )
            // InternalAndroidGenerator.g:1112:2: ( rule__Application__AttributesAssignment_2 )*
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_2()); 
            // InternalAndroidGenerator.g:1113:2: ( rule__Application__AttributesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14||(LA8_0>=18 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1113:3: rule__Application__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Application__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAndroidGenerator.g:1122:1: rule__ApplicationVersion__Group__0 : rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 ;
    public final void rule__ApplicationVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1126:1: ( rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 )
            // InternalAndroidGenerator.g:1127:2: rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalAndroidGenerator.g:1134:1: rule__ApplicationVersion__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1138:1: ( ( () ) )
            // InternalAndroidGenerator.g:1139:1: ( () )
            {
            // InternalAndroidGenerator.g:1139:1: ( () )
            // InternalAndroidGenerator.g:1140:2: ()
            {
             before(grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0()); 
            // InternalAndroidGenerator.g:1141:2: ()
            // InternalAndroidGenerator.g:1141:3: 
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
    // InternalAndroidGenerator.g:1149:1: rule__ApplicationVersion__Group__1 : rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 ;
    public final void rule__ApplicationVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1153:1: ( rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 )
            // InternalAndroidGenerator.g:1154:2: rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalAndroidGenerator.g:1161:1: rule__ApplicationVersion__Group__1__Impl : ( 'Android-SDK' ) ;
    public final void rule__ApplicationVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1165:1: ( ( 'Android-SDK' ) )
            // InternalAndroidGenerator.g:1166:1: ( 'Android-SDK' )
            {
            // InternalAndroidGenerator.g:1166:1: ( 'Android-SDK' )
            // InternalAndroidGenerator.g:1167:2: 'Android-SDK'
            {
             before(grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_1()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:1176:1: rule__ApplicationVersion__Group__2 : rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 ;
    public final void rule__ApplicationVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1180:1: ( rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 )
            // InternalAndroidGenerator.g:1181:2: rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalAndroidGenerator.g:1188:1: rule__ApplicationVersion__Group__2__Impl : ( ':' ) ;
    public final void rule__ApplicationVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1192:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1193:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1193:1: ( ':' )
            // InternalAndroidGenerator.g:1194:2: ':'
            {
             before(grammarAccess.getApplicationVersionAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getApplicationVersionAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:1203:1: rule__ApplicationVersion__Group__3 : rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 ;
    public final void rule__ApplicationVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1207:1: ( rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 )
            // InternalAndroidGenerator.g:1208:2: rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAndroidGenerator.g:1215:1: rule__ApplicationVersion__Group__3__Impl : ( ( rule__ApplicationVersion__ResultAssignment_3 ) ) ;
    public final void rule__ApplicationVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1219:1: ( ( ( rule__ApplicationVersion__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1220:1: ( ( rule__ApplicationVersion__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1220:1: ( ( rule__ApplicationVersion__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1221:2: ( rule__ApplicationVersion__ResultAssignment_3 )
            {
             before(grammarAccess.getApplicationVersionAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1222:2: ( rule__ApplicationVersion__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1222:3: rule__ApplicationVersion__ResultAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__ResultAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationVersionAccess().getResultAssignment_3()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:1230:1: rule__ApplicationVersion__Group__4 : rule__ApplicationVersion__Group__4__Impl ;
    public final void rule__ApplicationVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1234:1: ( rule__ApplicationVersion__Group__4__Impl )
            // InternalAndroidGenerator.g:1235:2: rule__ApplicationVersion__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationVersion__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:1241:1: rule__ApplicationVersion__Group__4__Impl : ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? ) ;
    public final void rule__ApplicationVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1245:1: ( ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1246:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1246:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? )
            // InternalAndroidGenerator.g:1247:2: ( rule__ApplicationVersion__TargetsdkAssignment_4 )?
            {
             before(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_4()); 
            // InternalAndroidGenerator.g:1248:2: ( rule__ApplicationVersion__TargetsdkAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAndroidGenerator.g:1248:3: rule__ApplicationVersion__TargetsdkAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationVersion__TargetsdkAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__TargetSDK__Group__0"
    // InternalAndroidGenerator.g:1257:1: rule__TargetSDK__Group__0 : rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 ;
    public final void rule__TargetSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1261:1: ( rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 )
            // InternalAndroidGenerator.g:1262:2: rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1
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
    // InternalAndroidGenerator.g:1269:1: rule__TargetSDK__Group__0__Impl : ( () ) ;
    public final void rule__TargetSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1273:1: ( ( () ) )
            // InternalAndroidGenerator.g:1274:1: ( () )
            {
            // InternalAndroidGenerator.g:1274:1: ( () )
            // InternalAndroidGenerator.g:1275:2: ()
            {
             before(grammarAccess.getTargetSDKAccess().getTargetSDKAction_0()); 
            // InternalAndroidGenerator.g:1276:2: ()
            // InternalAndroidGenerator.g:1276:3: 
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
    // InternalAndroidGenerator.g:1284:1: rule__TargetSDK__Group__1 : rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 ;
    public final void rule__TargetSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1288:1: ( rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 )
            // InternalAndroidGenerator.g:1289:2: rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalAndroidGenerator.g:1296:1: rule__TargetSDK__Group__1__Impl : ( 'Target-SDK' ) ;
    public final void rule__TargetSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1300:1: ( ( 'Target-SDK' ) )
            // InternalAndroidGenerator.g:1301:1: ( 'Target-SDK' )
            {
            // InternalAndroidGenerator.g:1301:1: ( 'Target-SDK' )
            // InternalAndroidGenerator.g:1302:2: 'Target-SDK'
            {
             before(grammarAccess.getTargetSDKAccess().getTargetSDKKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1311:1: rule__TargetSDK__Group__2 : rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 ;
    public final void rule__TargetSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1315:1: ( rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 )
            // InternalAndroidGenerator.g:1316:2: rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalAndroidGenerator.g:1323:1: rule__TargetSDK__Group__2__Impl : ( ':' ) ;
    public final void rule__TargetSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1327:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1328:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1328:1: ( ':' )
            // InternalAndroidGenerator.g:1329:2: ':'
            {
             before(grammarAccess.getTargetSDKAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1338:1: rule__TargetSDK__Group__3 : rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 ;
    public final void rule__TargetSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1342:1: ( rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 )
            // InternalAndroidGenerator.g:1343:2: rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4
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
    // InternalAndroidGenerator.g:1350:1: rule__TargetSDK__Group__3__Impl : ( ( rule__TargetSDK__ResultAssignment_3 ) ) ;
    public final void rule__TargetSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1354:1: ( ( ( rule__TargetSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1355:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1355:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1356:2: ( rule__TargetSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getTargetSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1357:2: ( rule__TargetSDK__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1357:3: rule__TargetSDK__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1365:1: rule__TargetSDK__Group__4 : rule__TargetSDK__Group__4__Impl ;
    public final void rule__TargetSDK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1369:1: ( rule__TargetSDK__Group__4__Impl )
            // InternalAndroidGenerator.g:1370:2: rule__TargetSDK__Group__4__Impl
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
    // InternalAndroidGenerator.g:1376:1: rule__TargetSDK__Group__4__Impl : ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) ;
    public final void rule__TargetSDK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1380:1: ( ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1381:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1381:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            // InternalAndroidGenerator.g:1382:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            {
             before(grammarAccess.getTargetSDKAccess().getMinsdkAssignment_4()); 
            // InternalAndroidGenerator.g:1383:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAndroidGenerator.g:1383:3: rule__TargetSDK__MinsdkAssignment_4
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
    // InternalAndroidGenerator.g:1392:1: rule__MinSDK__Group__0 : rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 ;
    public final void rule__MinSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1396:1: ( rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 )
            // InternalAndroidGenerator.g:1397:2: rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1
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
    // InternalAndroidGenerator.g:1404:1: rule__MinSDK__Group__0__Impl : ( () ) ;
    public final void rule__MinSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1408:1: ( ( () ) )
            // InternalAndroidGenerator.g:1409:1: ( () )
            {
            // InternalAndroidGenerator.g:1409:1: ( () )
            // InternalAndroidGenerator.g:1410:2: ()
            {
             before(grammarAccess.getMinSDKAccess().getMinSDKAction_0()); 
            // InternalAndroidGenerator.g:1411:2: ()
            // InternalAndroidGenerator.g:1411:3: 
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
    // InternalAndroidGenerator.g:1419:1: rule__MinSDK__Group__1 : rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 ;
    public final void rule__MinSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1423:1: ( rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 )
            // InternalAndroidGenerator.g:1424:2: rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalAndroidGenerator.g:1431:1: rule__MinSDK__Group__1__Impl : ( 'Minimum-SDK' ) ;
    public final void rule__MinSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1435:1: ( ( 'Minimum-SDK' ) )
            // InternalAndroidGenerator.g:1436:1: ( 'Minimum-SDK' )
            {
            // InternalAndroidGenerator.g:1436:1: ( 'Minimum-SDK' )
            // InternalAndroidGenerator.g:1437:2: 'Minimum-SDK'
            {
             before(grammarAccess.getMinSDKAccess().getMinimumSDKKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1446:1: rule__MinSDK__Group__2 : rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 ;
    public final void rule__MinSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1450:1: ( rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 )
            // InternalAndroidGenerator.g:1451:2: rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalAndroidGenerator.g:1458:1: rule__MinSDK__Group__2__Impl : ( ':' ) ;
    public final void rule__MinSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1462:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1463:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1463:1: ( ':' )
            // InternalAndroidGenerator.g:1464:2: ':'
            {
             before(grammarAccess.getMinSDKAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1473:1: rule__MinSDK__Group__3 : rule__MinSDK__Group__3__Impl ;
    public final void rule__MinSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1477:1: ( rule__MinSDK__Group__3__Impl )
            // InternalAndroidGenerator.g:1478:2: rule__MinSDK__Group__3__Impl
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
    // InternalAndroidGenerator.g:1484:1: rule__MinSDK__Group__3__Impl : ( ( rule__MinSDK__ResultAssignment_3 ) ) ;
    public final void rule__MinSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1488:1: ( ( ( rule__MinSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1489:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1489:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1490:2: ( rule__MinSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getMinSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1491:2: ( rule__MinSDK__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1491:3: rule__MinSDK__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1500:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1504:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // InternalAndroidGenerator.g:1505:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
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
    // InternalAndroidGenerator.g:1512:1: rule__ApplicationPermissionList__Group__0__Impl : ( 'permissions' ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1516:1: ( ( 'permissions' ) )
            // InternalAndroidGenerator.g:1517:1: ( 'permissions' )
            {
            // InternalAndroidGenerator.g:1517:1: ( 'permissions' )
            // InternalAndroidGenerator.g:1518:2: 'permissions'
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1527:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1531:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // InternalAndroidGenerator.g:1532:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalAndroidGenerator.g:1539:1: rule__ApplicationPermissionList__Group__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1543:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1544:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1544:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            // InternalAndroidGenerator.g:1545:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_1()); 
            // InternalAndroidGenerator.g:1546:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            // InternalAndroidGenerator.g:1546:3: rule__ApplicationPermissionList__PermissionsAssignment_1
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
    // InternalAndroidGenerator.g:1554:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1558:1: ( rule__ApplicationPermissionList__Group__2__Impl )
            // InternalAndroidGenerator.g:1559:2: rule__ApplicationPermissionList__Group__2__Impl
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
    // InternalAndroidGenerator.g:1565:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__Group_2__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1569:1: ( ( ( rule__ApplicationPermissionList__Group_2__0 )* ) )
            // InternalAndroidGenerator.g:1570:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            {
            // InternalAndroidGenerator.g:1570:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            // InternalAndroidGenerator.g:1571:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_2()); 
            // InternalAndroidGenerator.g:1572:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_PACKAGE_NAME) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1572:3: rule__ApplicationPermissionList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ApplicationPermissionList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalAndroidGenerator.g:1581:1: rule__ApplicationPermissionList__Group_2__0 : rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 ;
    public final void rule__ApplicationPermissionList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1585:1: ( rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 )
            // InternalAndroidGenerator.g:1586:2: rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1
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
    // InternalAndroidGenerator.g:1593:1: rule__ApplicationPermissionList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ApplicationPermissionList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1597:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:1598:1: ( ',' )
            {
            // InternalAndroidGenerator.g:1598:1: ( ',' )
            // InternalAndroidGenerator.g:1599:2: ','
            {
             before(grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1608:1: rule__ApplicationPermissionList__Group_2__1 : rule__ApplicationPermissionList__Group_2__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1612:1: ( rule__ApplicationPermissionList__Group_2__1__Impl )
            // InternalAndroidGenerator.g:1613:2: rule__ApplicationPermissionList__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:1619:1: rule__ApplicationPermissionList__Group_2__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1623:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) )
            // InternalAndroidGenerator.g:1624:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            {
            // InternalAndroidGenerator.g:1624:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            // InternalAndroidGenerator.g:1625:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2_1()); 
            // InternalAndroidGenerator.g:1626:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            // InternalAndroidGenerator.g:1626:3: rule__ApplicationPermissionList__PermissionsAssignment_2_1
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
    // InternalAndroidGenerator.g:1635:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1639:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // InternalAndroidGenerator.g:1640:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAndroidGenerator.g:1647:1: rule__ApplicationElementList__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1651:1: ( ( () ) )
            // InternalAndroidGenerator.g:1652:1: ( () )
            {
            // InternalAndroidGenerator.g:1652:1: ( () )
            // InternalAndroidGenerator.g:1653:2: ()
            {
             before(grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0()); 
            // InternalAndroidGenerator.g:1654:2: ()
            // InternalAndroidGenerator.g:1654:3: 
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
    // InternalAndroidGenerator.g:1662:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1666:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // InternalAndroidGenerator.g:1667:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalAndroidGenerator.g:1674:1: rule__ApplicationElementList__Group__1__Impl : ( 'elements' ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1678:1: ( ( 'elements' ) )
            // InternalAndroidGenerator.g:1679:1: ( 'elements' )
            {
            // InternalAndroidGenerator.g:1679:1: ( 'elements' )
            // InternalAndroidGenerator.g:1680:2: 'elements'
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1689:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1693:1: ( rule__ApplicationElementList__Group__2__Impl )
            // InternalAndroidGenerator.g:1694:2: rule__ApplicationElementList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationElementList__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:1700:1: rule__ApplicationElementList__Group__2__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_2 )* ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1704:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_2 )* ) )
            // InternalAndroidGenerator.g:1705:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 )* )
            {
            // InternalAndroidGenerator.g:1705:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 )* )
            // InternalAndroidGenerator.g:1706:2: ( rule__ApplicationElementList__ElementsAssignment_2 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 
            // InternalAndroidGenerator.g:1707:2: ( rule__ApplicationElementList__ElementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=20 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1707:3: rule__ApplicationElementList__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ApplicationElementList__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalAndroidGenerator.g:1716:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1720:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAndroidGenerator.g:1721:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:1728:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1732:1: ( ( 'Model' ) )
            // InternalAndroidGenerator.g:1733:1: ( 'Model' )
            {
            // InternalAndroidGenerator.g:1733:1: ( 'Model' )
            // InternalAndroidGenerator.g:1734:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1743:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1747:1: ( rule__Model__Group__1__Impl )
            // InternalAndroidGenerator.g:1748:2: rule__Model__Group__1__Impl
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
    // InternalAndroidGenerator.g:1754:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1758:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1759:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1759:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:1760:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:1761:2: ( rule__Model__NameAssignment_1 )
            // InternalAndroidGenerator.g:1761:3: rule__Model__NameAssignment_1
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
    // InternalAndroidGenerator.g:1770:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1774:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalAndroidGenerator.g:1775:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalAndroidGenerator.g:1782:1: rule__Fragment__Group__0__Impl : ( () ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1786:1: ( ( () ) )
            // InternalAndroidGenerator.g:1787:1: ( () )
            {
            // InternalAndroidGenerator.g:1787:1: ( () )
            // InternalAndroidGenerator.g:1788:2: ()
            {
             before(grammarAccess.getFragmentAccess().getFragmentAction_0()); 
            // InternalAndroidGenerator.g:1789:2: ()
            // InternalAndroidGenerator.g:1789:3: 
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
    // InternalAndroidGenerator.g:1797:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1801:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalAndroidGenerator.g:1802:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:1809:1: rule__Fragment__Group__1__Impl : ( 'Fragment' ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1813:1: ( ( 'Fragment' ) )
            // InternalAndroidGenerator.g:1814:1: ( 'Fragment' )
            {
            // InternalAndroidGenerator.g:1814:1: ( 'Fragment' )
            // InternalAndroidGenerator.g:1815:2: 'Fragment'
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:1824:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1828:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalAndroidGenerator.g:1829:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAndroidGenerator.g:1836:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__NameAssignment_2 ) ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1840:1: ( ( ( rule__Fragment__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:1841:1: ( ( rule__Fragment__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:1841:1: ( ( rule__Fragment__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:1842:2: ( rule__Fragment__NameAssignment_2 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:1843:2: ( rule__Fragment__NameAssignment_2 )
            // InternalAndroidGenerator.g:1843:3: rule__Fragment__NameAssignment_2
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
    // InternalAndroidGenerator.g:1851:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1855:1: ( rule__Fragment__Group__3__Impl )
            // InternalAndroidGenerator.g:1856:2: rule__Fragment__Group__3__Impl
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
    // InternalAndroidGenerator.g:1862:1: rule__Fragment__Group__3__Impl : ( ( rule__Fragment__ActivityAttributesAssignment_3 )? ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1866:1: ( ( ( rule__Fragment__ActivityAttributesAssignment_3 )? ) )
            // InternalAndroidGenerator.g:1867:1: ( ( rule__Fragment__ActivityAttributesAssignment_3 )? )
            {
            // InternalAndroidGenerator.g:1867:1: ( ( rule__Fragment__ActivityAttributesAssignment_3 )? )
            // InternalAndroidGenerator.g:1868:2: ( rule__Fragment__ActivityAttributesAssignment_3 )?
            {
             before(grammarAccess.getFragmentAccess().getActivityAttributesAssignment_3()); 
            // InternalAndroidGenerator.g:1869:2: ( rule__Fragment__ActivityAttributesAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=22 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAndroidGenerator.g:1869:3: rule__Fragment__ActivityAttributesAssignment_3
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
    // InternalAndroidGenerator.g:1878:1: rule__ActivityLayoutAttributes__Group__0 : rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 ;
    public final void rule__ActivityLayoutAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1882:1: ( rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 )
            // InternalAndroidGenerator.g:1883:2: rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAndroidGenerator.g:1890:1: rule__ActivityLayoutAttributes__Group__0__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1894:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) ) )
            // InternalAndroidGenerator.g:1895:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:1895:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) )
            // InternalAndroidGenerator.g:1896:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_0()); 
            // InternalAndroidGenerator.g:1897:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 )
            // InternalAndroidGenerator.g:1897:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__LayoutElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_0()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:1905:1: rule__ActivityLayoutAttributes__Group__1 : rule__ActivityLayoutAttributes__Group__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1909:1: ( rule__ActivityLayoutAttributes__Group__1__Impl )
            // InternalAndroidGenerator.g:1910:2: rule__ActivityLayoutAttributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:1916:1: rule__ActivityLayoutAttributes__Group__1__Impl : ( ( rule__ActivityLayoutAttributes__Group_1__0 )* ) ;
    public final void rule__ActivityLayoutAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1920:1: ( ( ( rule__ActivityLayoutAttributes__Group_1__0 )* ) )
            // InternalAndroidGenerator.g:1921:1: ( ( rule__ActivityLayoutAttributes__Group_1__0 )* )
            {
            // InternalAndroidGenerator.g:1921:1: ( ( rule__ActivityLayoutAttributes__Group_1__0 )* )
            // InternalAndroidGenerator.g:1922:2: ( rule__ActivityLayoutAttributes__Group_1__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:1923:2: ( rule__ActivityLayoutAttributes__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    int LA14_2 = input.LA(2);

                    if ( ((LA14_2>=22 && LA14_2<=26)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1923:3: rule__ActivityLayoutAttributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ActivityLayoutAttributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActivityLayoutAttributesAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ActivityLayoutAttributes__Group_1__0"
    // InternalAndroidGenerator.g:1932:1: rule__ActivityLayoutAttributes__Group_1__0 : rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1 ;
    public final void rule__ActivityLayoutAttributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1936:1: ( rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1 )
            // InternalAndroidGenerator.g:1937:2: rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__ActivityLayoutAttributes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group_1__0"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group_1__0__Impl"
    // InternalAndroidGenerator.g:1944:1: rule__ActivityLayoutAttributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ActivityLayoutAttributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1948:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:1949:1: ( ',' )
            {
            // InternalAndroidGenerator.g:1949:1: ( ',' )
            // InternalAndroidGenerator.g:1950:2: ','
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getCommaKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityLayoutAttributesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group_1__0__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group_1__1"
    // InternalAndroidGenerator.g:1959:1: rule__ActivityLayoutAttributes__Group_1__1 : rule__ActivityLayoutAttributes__Group_1__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1963:1: ( rule__ActivityLayoutAttributes__Group_1__1__Impl )
            // InternalAndroidGenerator.g:1964:2: rule__ActivityLayoutAttributes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group_1__1"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group_1__1__Impl"
    // InternalAndroidGenerator.g:1970:1: rule__ActivityLayoutAttributes__Group_1__1__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1974:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:1975:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:1975:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) )
            // InternalAndroidGenerator.g:1976:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_1_1()); 
            // InternalAndroidGenerator.g:1977:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 )
            // InternalAndroidGenerator.g:1977:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__Group_1__1__Impl"


    // $ANTLR start "rule__TypeMap__Group__0"
    // InternalAndroidGenerator.g:1986:1: rule__TypeMap__Group__0 : rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1 ;
    public final void rule__TypeMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1990:1: ( rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1 )
            // InternalAndroidGenerator.g:1991:2: rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAndroidGenerator.g:1998:1: rule__TypeMap__Group__0__Impl : ( () ) ;
    public final void rule__TypeMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2002:1: ( ( () ) )
            // InternalAndroidGenerator.g:2003:1: ( () )
            {
            // InternalAndroidGenerator.g:2003:1: ( () )
            // InternalAndroidGenerator.g:2004:2: ()
            {
             before(grammarAccess.getTypeMapAccess().getTypeMapAction_0()); 
            // InternalAndroidGenerator.g:2005:2: ()
            // InternalAndroidGenerator.g:2005:3: 
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
    // InternalAndroidGenerator.g:2013:1: rule__TypeMap__Group__1 : rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2 ;
    public final void rule__TypeMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2017:1: ( rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2 )
            // InternalAndroidGenerator.g:2018:2: rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAndroidGenerator.g:2025:1: rule__TypeMap__Group__1__Impl : ( 'Map' ) ;
    public final void rule__TypeMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2029:1: ( ( 'Map' ) )
            // InternalAndroidGenerator.g:2030:1: ( 'Map' )
            {
            // InternalAndroidGenerator.g:2030:1: ( 'Map' )
            // InternalAndroidGenerator.g:2031:2: 'Map'
            {
             before(grammarAccess.getTypeMapAccess().getMapKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2040:1: rule__TypeMap__Group__2 : rule__TypeMap__Group__2__Impl ;
    public final void rule__TypeMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2044:1: ( rule__TypeMap__Group__2__Impl )
            // InternalAndroidGenerator.g:2045:2: rule__TypeMap__Group__2__Impl
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
    // InternalAndroidGenerator.g:2051:1: rule__TypeMap__Group__2__Impl : ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? ) ;
    public final void rule__TypeMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2055:1: ( ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? ) )
            // InternalAndroidGenerator.g:2056:1: ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? )
            {
            // InternalAndroidGenerator.g:2056:1: ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? )
            // InternalAndroidGenerator.g:2057:2: ( rule__TypeMap__ActivitytypeattributeAssignment_2 )?
            {
             before(grammarAccess.getTypeMapAccess().getActivitytypeattributeAssignment_2()); 
            // InternalAndroidGenerator.g:2058:2: ( rule__TypeMap__ActivitytypeattributeAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAndroidGenerator.g:2058:3: rule__TypeMap__ActivitytypeattributeAssignment_2
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
    // InternalAndroidGenerator.g:2067:1: rule__TypeSetting__Group__0 : rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1 ;
    public final void rule__TypeSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2071:1: ( rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1 )
            // InternalAndroidGenerator.g:2072:2: rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalAndroidGenerator.g:2079:1: rule__TypeSetting__Group__0__Impl : ( () ) ;
    public final void rule__TypeSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2083:1: ( ( () ) )
            // InternalAndroidGenerator.g:2084:1: ( () )
            {
            // InternalAndroidGenerator.g:2084:1: ( () )
            // InternalAndroidGenerator.g:2085:2: ()
            {
             before(grammarAccess.getTypeSettingAccess().getTypeSettingAction_0()); 
            // InternalAndroidGenerator.g:2086:2: ()
            // InternalAndroidGenerator.g:2086:3: 
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
    // InternalAndroidGenerator.g:2094:1: rule__TypeSetting__Group__1 : rule__TypeSetting__Group__1__Impl ;
    public final void rule__TypeSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2098:1: ( rule__TypeSetting__Group__1__Impl )
            // InternalAndroidGenerator.g:2099:2: rule__TypeSetting__Group__1__Impl
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
    // InternalAndroidGenerator.g:2105:1: rule__TypeSetting__Group__1__Impl : ( 'Settings' ) ;
    public final void rule__TypeSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2109:1: ( ( 'Settings' ) )
            // InternalAndroidGenerator.g:2110:1: ( 'Settings' )
            {
            // InternalAndroidGenerator.g:2110:1: ( 'Settings' )
            // InternalAndroidGenerator.g:2111:2: 'Settings'
            {
             before(grammarAccess.getTypeSettingAccess().getSettingsKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2121:1: rule__EditText__Group__0 : rule__EditText__Group__0__Impl rule__EditText__Group__1 ;
    public final void rule__EditText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2125:1: ( rule__EditText__Group__0__Impl rule__EditText__Group__1 )
            // InternalAndroidGenerator.g:2126:2: rule__EditText__Group__0__Impl rule__EditText__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAndroidGenerator.g:2133:1: rule__EditText__Group__0__Impl : ( () ) ;
    public final void rule__EditText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2137:1: ( ( () ) )
            // InternalAndroidGenerator.g:2138:1: ( () )
            {
            // InternalAndroidGenerator.g:2138:1: ( () )
            // InternalAndroidGenerator.g:2139:2: ()
            {
             before(grammarAccess.getEditTextAccess().getEditTextAction_0()); 
            // InternalAndroidGenerator.g:2140:2: ()
            // InternalAndroidGenerator.g:2140:3: 
            {
            }

             after(grammarAccess.getEditTextAccess().getEditTextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__Group__0__Impl"


    // $ANTLR start "rule__EditText__Group__1"
    // InternalAndroidGenerator.g:2148:1: rule__EditText__Group__1 : rule__EditText__Group__1__Impl rule__EditText__Group__2 ;
    public final void rule__EditText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2152:1: ( rule__EditText__Group__1__Impl rule__EditText__Group__2 )
            // InternalAndroidGenerator.g:2153:2: rule__EditText__Group__1__Impl rule__EditText__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EditText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditText__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:2160:1: rule__EditText__Group__1__Impl : ( 'EditText' ) ;
    public final void rule__EditText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2164:1: ( ( 'EditText' ) )
            // InternalAndroidGenerator.g:2165:1: ( 'EditText' )
            {
            // InternalAndroidGenerator.g:2165:1: ( 'EditText' )
            // InternalAndroidGenerator.g:2166:2: 'EditText'
            {
             before(grammarAccess.getEditTextAccess().getEditTextKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEditTextAccess().getEditTextKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EditText__Group__2"
    // InternalAndroidGenerator.g:2175:1: rule__EditText__Group__2 : rule__EditText__Group__2__Impl ;
    public final void rule__EditText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2179:1: ( rule__EditText__Group__2__Impl )
            // InternalAndroidGenerator.g:2180:2: rule__EditText__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EditText__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__Group__2"


    // $ANTLR start "rule__EditText__Group__2__Impl"
    // InternalAndroidGenerator.g:2186:1: rule__EditText__Group__2__Impl : ( ( rule__EditText__NameAssignment_2 ) ) ;
    public final void rule__EditText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2190:1: ( ( ( rule__EditText__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2191:1: ( ( rule__EditText__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2191:1: ( ( rule__EditText__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2192:2: ( rule__EditText__NameAssignment_2 )
            {
             before(grammarAccess.getEditTextAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2193:2: ( rule__EditText__NameAssignment_2 )
            // InternalAndroidGenerator.g:2193:3: rule__EditText__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EditText__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEditTextAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__Group__2__Impl"


    // $ANTLR start "rule__Spinner__Group__0"
    // InternalAndroidGenerator.g:2202:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2206:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // InternalAndroidGenerator.g:2207:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAndroidGenerator.g:2214:1: rule__Spinner__Group__0__Impl : ( () ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2218:1: ( ( () ) )
            // InternalAndroidGenerator.g:2219:1: ( () )
            {
            // InternalAndroidGenerator.g:2219:1: ( () )
            // InternalAndroidGenerator.g:2220:2: ()
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerAction_0()); 
            // InternalAndroidGenerator.g:2221:2: ()
            // InternalAndroidGenerator.g:2221:3: 
            {
            }

             after(grammarAccess.getSpinnerAccess().getSpinnerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__0__Impl"


    // $ANTLR start "rule__Spinner__Group__1"
    // InternalAndroidGenerator.g:2229:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl rule__Spinner__Group__2 ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2233:1: ( rule__Spinner__Group__1__Impl rule__Spinner__Group__2 )
            // InternalAndroidGenerator.g:2234:2: rule__Spinner__Group__1__Impl rule__Spinner__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:2241:1: rule__Spinner__Group__1__Impl : ( 'Spinner' ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2245:1: ( ( 'Spinner' ) )
            // InternalAndroidGenerator.g:2246:1: ( 'Spinner' )
            {
            // InternalAndroidGenerator.g:2246:1: ( 'Spinner' )
            // InternalAndroidGenerator.g:2247:2: 'Spinner'
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getSpinnerKeyword_1()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:2256:1: rule__Spinner__Group__2 : rule__Spinner__Group__2__Impl ;
    public final void rule__Spinner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2260:1: ( rule__Spinner__Group__2__Impl )
            // InternalAndroidGenerator.g:2261:2: rule__Spinner__Group__2__Impl
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
    // InternalAndroidGenerator.g:2267:1: rule__Spinner__Group__2__Impl : ( ( rule__Spinner__NameAssignment_2 ) ) ;
    public final void rule__Spinner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2271:1: ( ( ( rule__Spinner__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2272:1: ( ( rule__Spinner__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2272:1: ( ( rule__Spinner__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2273:2: ( rule__Spinner__NameAssignment_2 )
            {
             before(grammarAccess.getSpinnerAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2274:2: ( rule__Spinner__NameAssignment_2 )
            // InternalAndroidGenerator.g:2274:3: rule__Spinner__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Button__Group__0"
    // InternalAndroidGenerator.g:2283:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2287:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalAndroidGenerator.g:2288:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAndroidGenerator.g:2295:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2299:1: ( ( () ) )
            // InternalAndroidGenerator.g:2300:1: ( () )
            {
            // InternalAndroidGenerator.g:2300:1: ( () )
            // InternalAndroidGenerator.g:2301:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalAndroidGenerator.g:2302:2: ()
            // InternalAndroidGenerator.g:2302:3: 
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
    // InternalAndroidGenerator.g:2310:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2314:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalAndroidGenerator.g:2315:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:2322:1: rule__Button__Group__1__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2326:1: ( ( 'Button' ) )
            // InternalAndroidGenerator.g:2327:1: ( 'Button' )
            {
            // InternalAndroidGenerator.g:2327:1: ( 'Button' )
            // InternalAndroidGenerator.g:2328:2: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2337:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2341:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalAndroidGenerator.g:2342:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAndroidGenerator.g:2349:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2353:1: ( ( ( rule__Button__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2354:1: ( ( rule__Button__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2354:1: ( ( rule__Button__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2355:2: ( rule__Button__NameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2356:2: ( rule__Button__NameAssignment_2 )
            // InternalAndroidGenerator.g:2356:3: rule__Button__NameAssignment_2
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
    // InternalAndroidGenerator.g:2364:1: rule__Button__Group__3 : rule__Button__Group__3__Impl ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2368:1: ( rule__Button__Group__3__Impl )
            // InternalAndroidGenerator.g:2369:2: rule__Button__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:2375:1: rule__Button__Group__3__Impl : ( ( rule__Button__Group_3__0 )? ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2379:1: ( ( ( rule__Button__Group_3__0 )? ) )
            // InternalAndroidGenerator.g:2380:1: ( ( rule__Button__Group_3__0 )? )
            {
            // InternalAndroidGenerator.g:2380:1: ( ( rule__Button__Group_3__0 )? )
            // InternalAndroidGenerator.g:2381:2: ( rule__Button__Group_3__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_3()); 
            // InternalAndroidGenerator.g:2382:2: ( rule__Button__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=27 && LA16_0<=28)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAndroidGenerator.g:2382:3: rule__Button__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Button__Group_3__0"
    // InternalAndroidGenerator.g:2391:1: rule__Button__Group_3__0 : rule__Button__Group_3__0__Impl rule__Button__Group_3__1 ;
    public final void rule__Button__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2395:1: ( rule__Button__Group_3__0__Impl rule__Button__Group_3__1 )
            // InternalAndroidGenerator.g:2396:2: rule__Button__Group_3__0__Impl rule__Button__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Button__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3__0"


    // $ANTLR start "rule__Button__Group_3__0__Impl"
    // InternalAndroidGenerator.g:2403:1: rule__Button__Group_3__0__Impl : ( ( rule__Button__ActionsAssignment_3_0 ) ) ;
    public final void rule__Button__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2407:1: ( ( ( rule__Button__ActionsAssignment_3_0 ) ) )
            // InternalAndroidGenerator.g:2408:1: ( ( rule__Button__ActionsAssignment_3_0 ) )
            {
            // InternalAndroidGenerator.g:2408:1: ( ( rule__Button__ActionsAssignment_3_0 ) )
            // InternalAndroidGenerator.g:2409:2: ( rule__Button__ActionsAssignment_3_0 )
            {
             before(grammarAccess.getButtonAccess().getActionsAssignment_3_0()); 
            // InternalAndroidGenerator.g:2410:2: ( rule__Button__ActionsAssignment_3_0 )
            // InternalAndroidGenerator.g:2410:3: rule__Button__ActionsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Button__ActionsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getActionsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3__0__Impl"


    // $ANTLR start "rule__Button__Group_3__1"
    // InternalAndroidGenerator.g:2418:1: rule__Button__Group_3__1 : rule__Button__Group_3__1__Impl ;
    public final void rule__Button__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2422:1: ( rule__Button__Group_3__1__Impl )
            // InternalAndroidGenerator.g:2423:2: rule__Button__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3__1"


    // $ANTLR start "rule__Button__Group_3__1__Impl"
    // InternalAndroidGenerator.g:2429:1: rule__Button__Group_3__1__Impl : ( ( rule__Button__Group_3_1__0 )* ) ;
    public final void rule__Button__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2433:1: ( ( ( rule__Button__Group_3_1__0 )* ) )
            // InternalAndroidGenerator.g:2434:1: ( ( rule__Button__Group_3_1__0 )* )
            {
            // InternalAndroidGenerator.g:2434:1: ( ( rule__Button__Group_3_1__0 )* )
            // InternalAndroidGenerator.g:2435:2: ( rule__Button__Group_3_1__0 )*
            {
             before(grammarAccess.getButtonAccess().getGroup_3_1()); 
            // InternalAndroidGenerator.g:2436:2: ( rule__Button__Group_3_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    int LA17_2 = input.LA(2);

                    if ( ((LA17_2>=27 && LA17_2<=28)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2436:3: rule__Button__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Button__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getButtonAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3__1__Impl"


    // $ANTLR start "rule__Button__Group_3_1__0"
    // InternalAndroidGenerator.g:2445:1: rule__Button__Group_3_1__0 : rule__Button__Group_3_1__0__Impl rule__Button__Group_3_1__1 ;
    public final void rule__Button__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2449:1: ( rule__Button__Group_3_1__0__Impl rule__Button__Group_3_1__1 )
            // InternalAndroidGenerator.g:2450:2: rule__Button__Group_3_1__0__Impl rule__Button__Group_3_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Button__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3_1__0"


    // $ANTLR start "rule__Button__Group_3_1__0__Impl"
    // InternalAndroidGenerator.g:2457:1: rule__Button__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Button__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2461:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:2462:1: ( ',' )
            {
            // InternalAndroidGenerator.g:2462:1: ( ',' )
            // InternalAndroidGenerator.g:2463:2: ','
            {
             before(grammarAccess.getButtonAccess().getCommaKeyword_3_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3_1__0__Impl"


    // $ANTLR start "rule__Button__Group_3_1__1"
    // InternalAndroidGenerator.g:2472:1: rule__Button__Group_3_1__1 : rule__Button__Group_3_1__1__Impl ;
    public final void rule__Button__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2476:1: ( rule__Button__Group_3_1__1__Impl )
            // InternalAndroidGenerator.g:2477:2: rule__Button__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3_1__1"


    // $ANTLR start "rule__Button__Group_3_1__1__Impl"
    // InternalAndroidGenerator.g:2483:1: rule__Button__Group_3_1__1__Impl : ( ( rule__Button__ActionsAssignment_3_1_1 ) ) ;
    public final void rule__Button__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2487:1: ( ( ( rule__Button__ActionsAssignment_3_1_1 ) ) )
            // InternalAndroidGenerator.g:2488:1: ( ( rule__Button__ActionsAssignment_3_1_1 ) )
            {
            // InternalAndroidGenerator.g:2488:1: ( ( rule__Button__ActionsAssignment_3_1_1 ) )
            // InternalAndroidGenerator.g:2489:2: ( rule__Button__ActionsAssignment_3_1_1 )
            {
             before(grammarAccess.getButtonAccess().getActionsAssignment_3_1_1()); 
            // InternalAndroidGenerator.g:2490:2: ( rule__Button__ActionsAssignment_3_1_1 )
            // InternalAndroidGenerator.g:2490:3: rule__Button__ActionsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__ActionsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getActionsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3_1__1__Impl"


    // $ANTLR start "rule__Toast__Group__0"
    // InternalAndroidGenerator.g:2499:1: rule__Toast__Group__0 : rule__Toast__Group__0__Impl rule__Toast__Group__1 ;
    public final void rule__Toast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2503:1: ( rule__Toast__Group__0__Impl rule__Toast__Group__1 )
            // InternalAndroidGenerator.g:2504:2: rule__Toast__Group__0__Impl rule__Toast__Group__1
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
    // InternalAndroidGenerator.g:2511:1: rule__Toast__Group__0__Impl : ( 'Toast' ) ;
    public final void rule__Toast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2515:1: ( ( 'Toast' ) )
            // InternalAndroidGenerator.g:2516:1: ( 'Toast' )
            {
            // InternalAndroidGenerator.g:2516:1: ( 'Toast' )
            // InternalAndroidGenerator.g:2517:2: 'Toast'
            {
             before(grammarAccess.getToastAccess().getToastKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2526:1: rule__Toast__Group__1 : rule__Toast__Group__1__Impl ;
    public final void rule__Toast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2530:1: ( rule__Toast__Group__1__Impl )
            // InternalAndroidGenerator.g:2531:2: rule__Toast__Group__1__Impl
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
    // InternalAndroidGenerator.g:2537:1: rule__Toast__Group__1__Impl : ( ( rule__Toast__TextAssignment_1 ) ) ;
    public final void rule__Toast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2541:1: ( ( ( rule__Toast__TextAssignment_1 ) ) )
            // InternalAndroidGenerator.g:2542:1: ( ( rule__Toast__TextAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:2542:1: ( ( rule__Toast__TextAssignment_1 ) )
            // InternalAndroidGenerator.g:2543:2: ( rule__Toast__TextAssignment_1 )
            {
             before(grammarAccess.getToastAccess().getTextAssignment_1()); 
            // InternalAndroidGenerator.g:2544:2: ( rule__Toast__TextAssignment_1 )
            // InternalAndroidGenerator.g:2544:3: rule__Toast__TextAssignment_1
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
    // InternalAndroidGenerator.g:2553:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2557:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // InternalAndroidGenerator.g:2558:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:2565:1: rule__Bundle__Group__0__Impl : ( 'Bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2569:1: ( ( 'Bundle' ) )
            // InternalAndroidGenerator.g:2570:1: ( 'Bundle' )
            {
            // InternalAndroidGenerator.g:2570:1: ( 'Bundle' )
            // InternalAndroidGenerator.g:2571:2: 'Bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2580:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2584:1: ( rule__Bundle__Group__1__Impl )
            // InternalAndroidGenerator.g:2585:2: rule__Bundle__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:2591:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__BundleRecipientAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2595:1: ( ( ( rule__Bundle__BundleRecipientAssignment_1 ) ) )
            // InternalAndroidGenerator.g:2596:1: ( ( rule__Bundle__BundleRecipientAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:2596:1: ( ( rule__Bundle__BundleRecipientAssignment_1 ) )
            // InternalAndroidGenerator.g:2597:2: ( rule__Bundle__BundleRecipientAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientAssignment_1()); 
            // InternalAndroidGenerator.g:2598:2: ( rule__Bundle__BundleRecipientAssignment_1 )
            // InternalAndroidGenerator.g:2598:3: rule__Bundle__BundleRecipientAssignment_1
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


    // $ANTLR start "rule__FilterQuery__Group__0"
    // InternalAndroidGenerator.g:2607:1: rule__FilterQuery__Group__0 : rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 ;
    public final void rule__FilterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2611:1: ( rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 )
            // InternalAndroidGenerator.g:2612:2: rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAndroidGenerator.g:2619:1: rule__FilterQuery__Group__0__Impl : ( () ) ;
    public final void rule__FilterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2623:1: ( ( () ) )
            // InternalAndroidGenerator.g:2624:1: ( () )
            {
            // InternalAndroidGenerator.g:2624:1: ( () )
            // InternalAndroidGenerator.g:2625:2: ()
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryAction_0()); 
            // InternalAndroidGenerator.g:2626:2: ()
            // InternalAndroidGenerator.g:2626:3: 
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
    // InternalAndroidGenerator.g:2634:1: rule__FilterQuery__Group__1 : rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 ;
    public final void rule__FilterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2638:1: ( rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 )
            // InternalAndroidGenerator.g:2639:2: rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:2646:1: rule__FilterQuery__Group__1__Impl : ( 'FilterQuery' ) ;
    public final void rule__FilterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2650:1: ( ( 'FilterQuery' ) )
            // InternalAndroidGenerator.g:2651:1: ( 'FilterQuery' )
            {
            // InternalAndroidGenerator.g:2651:1: ( 'FilterQuery' )
            // InternalAndroidGenerator.g:2652:2: 'FilterQuery'
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2661:1: rule__FilterQuery__Group__2 : rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 ;
    public final void rule__FilterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2665:1: ( rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 )
            // InternalAndroidGenerator.g:2666:2: rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalAndroidGenerator.g:2673:1: rule__FilterQuery__Group__2__Impl : ( ( rule__FilterQuery__NameAssignment_2 ) ) ;
    public final void rule__FilterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2677:1: ( ( ( rule__FilterQuery__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2678:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2678:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2679:2: ( rule__FilterQuery__NameAssignment_2 )
            {
             before(grammarAccess.getFilterQueryAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2680:2: ( rule__FilterQuery__NameAssignment_2 )
            // InternalAndroidGenerator.g:2680:3: rule__FilterQuery__NameAssignment_2
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
    // InternalAndroidGenerator.g:2688:1: rule__FilterQuery__Group__3 : rule__FilterQuery__Group__3__Impl ;
    public final void rule__FilterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2692:1: ( rule__FilterQuery__Group__3__Impl )
            // InternalAndroidGenerator.g:2693:2: rule__FilterQuery__Group__3__Impl
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
    // InternalAndroidGenerator.g:2699:1: rule__FilterQuery__Group__3__Impl : ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) ;
    public final void rule__FilterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2703:1: ( ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) )
            // InternalAndroidGenerator.g:2704:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:2704:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            // InternalAndroidGenerator.g:2705:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            {
             before(grammarAccess.getFilterQueryAccess().getFilterAttributesAssignment_3()); 
            // InternalAndroidGenerator.g:2706:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            // InternalAndroidGenerator.g:2706:3: rule__FilterQuery__FilterAttributesAssignment_3
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
    // InternalAndroidGenerator.g:2715:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2719:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // InternalAndroidGenerator.g:2720:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAndroidGenerator.g:2727:1: rule__Distance__Group__0__Impl : ( 'Distance' ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2731:1: ( ( 'Distance' ) )
            // InternalAndroidGenerator.g:2732:1: ( 'Distance' )
            {
            // InternalAndroidGenerator.g:2732:1: ( 'Distance' )
            // InternalAndroidGenerator.g:2733:2: 'Distance'
            {
             before(grammarAccess.getDistanceAccess().getDistanceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2742:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl rule__Distance__Group__2 ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2746:1: ( rule__Distance__Group__1__Impl rule__Distance__Group__2 )
            // InternalAndroidGenerator.g:2747:2: rule__Distance__Group__1__Impl rule__Distance__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAndroidGenerator.g:2754:1: rule__Distance__Group__1__Impl : ( ':' ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2758:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:2759:1: ( ':' )
            {
            // InternalAndroidGenerator.g:2759:1: ( ':' )
            // InternalAndroidGenerator.g:2760:2: ':'
            {
             before(grammarAccess.getDistanceAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2769:1: rule__Distance__Group__2 : rule__Distance__Group__2__Impl rule__Distance__Group__3 ;
    public final void rule__Distance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2773:1: ( rule__Distance__Group__2__Impl rule__Distance__Group__3 )
            // InternalAndroidGenerator.g:2774:2: rule__Distance__Group__2__Impl rule__Distance__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalAndroidGenerator.g:2781:1: rule__Distance__Group__2__Impl : ( ( rule__Distance__UnitAssignment_2 ) ) ;
    public final void rule__Distance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2785:1: ( ( ( rule__Distance__UnitAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2786:1: ( ( rule__Distance__UnitAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2786:1: ( ( rule__Distance__UnitAssignment_2 ) )
            // InternalAndroidGenerator.g:2787:2: ( rule__Distance__UnitAssignment_2 )
            {
             before(grammarAccess.getDistanceAccess().getUnitAssignment_2()); 
            // InternalAndroidGenerator.g:2788:2: ( rule__Distance__UnitAssignment_2 )
            // InternalAndroidGenerator.g:2788:3: rule__Distance__UnitAssignment_2
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
    // InternalAndroidGenerator.g:2796:1: rule__Distance__Group__3 : rule__Distance__Group__3__Impl rule__Distance__Group__4 ;
    public final void rule__Distance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2800:1: ( rule__Distance__Group__3__Impl rule__Distance__Group__4 )
            // InternalAndroidGenerator.g:2801:2: rule__Distance__Group__3__Impl rule__Distance__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalAndroidGenerator.g:2808:1: rule__Distance__Group__3__Impl : ( ( rule__Distance__OperatorAssignment_3 ) ) ;
    public final void rule__Distance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2812:1: ( ( ( rule__Distance__OperatorAssignment_3 ) ) )
            // InternalAndroidGenerator.g:2813:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:2813:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            // InternalAndroidGenerator.g:2814:2: ( rule__Distance__OperatorAssignment_3 )
            {
             before(grammarAccess.getDistanceAccess().getOperatorAssignment_3()); 
            // InternalAndroidGenerator.g:2815:2: ( rule__Distance__OperatorAssignment_3 )
            // InternalAndroidGenerator.g:2815:3: rule__Distance__OperatorAssignment_3
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
    // InternalAndroidGenerator.g:2823:1: rule__Distance__Group__4 : rule__Distance__Group__4__Impl ;
    public final void rule__Distance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2827:1: ( rule__Distance__Group__4__Impl )
            // InternalAndroidGenerator.g:2828:2: rule__Distance__Group__4__Impl
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
    // InternalAndroidGenerator.g:2834:1: rule__Distance__Group__4__Impl : ( ( rule__Distance__ResultsAssignment_4 ) ) ;
    public final void rule__Distance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2838:1: ( ( ( rule__Distance__ResultsAssignment_4 ) ) )
            // InternalAndroidGenerator.g:2839:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            {
            // InternalAndroidGenerator.g:2839:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            // InternalAndroidGenerator.g:2840:2: ( rule__Distance__ResultsAssignment_4 )
            {
             before(grammarAccess.getDistanceAccess().getResultsAssignment_4()); 
            // InternalAndroidGenerator.g:2841:2: ( rule__Distance__ResultsAssignment_4 )
            // InternalAndroidGenerator.g:2841:3: rule__Distance__ResultsAssignment_4
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
    // InternalAndroidGenerator.g:2850:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
    public final void rule__Operator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2854:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
            // InternalAndroidGenerator.g:2855:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAndroidGenerator.g:2862:1: rule__Operator__Group_0__0__Impl : ( () ) ;
    public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2866:1: ( ( () ) )
            // InternalAndroidGenerator.g:2867:1: ( () )
            {
            // InternalAndroidGenerator.g:2867:1: ( () )
            // InternalAndroidGenerator.g:2868:2: ()
            {
             before(grammarAccess.getOperatorAccess().getLessAction_0_0()); 
            // InternalAndroidGenerator.g:2869:2: ()
            // InternalAndroidGenerator.g:2869:3: 
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
    // InternalAndroidGenerator.g:2877:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl ;
    public final void rule__Operator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2881:1: ( rule__Operator__Group_0__1__Impl )
            // InternalAndroidGenerator.g:2882:2: rule__Operator__Group_0__1__Impl
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
    // InternalAndroidGenerator.g:2888:1: rule__Operator__Group_0__1__Impl : ( '>' ) ;
    public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2892:1: ( ( '>' ) )
            // InternalAndroidGenerator.g:2893:1: ( '>' )
            {
            // InternalAndroidGenerator.g:2893:1: ( '>' )
            // InternalAndroidGenerator.g:2894:2: '>'
            {
             before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2904:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2908:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalAndroidGenerator.g:2909:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAndroidGenerator.g:2916:1: rule__Operator__Group_1__0__Impl : ( () ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2920:1: ( ( () ) )
            // InternalAndroidGenerator.g:2921:1: ( () )
            {
            // InternalAndroidGenerator.g:2921:1: ( () )
            // InternalAndroidGenerator.g:2922:2: ()
            {
             before(grammarAccess.getOperatorAccess().getMoreAction_1_0()); 
            // InternalAndroidGenerator.g:2923:2: ()
            // InternalAndroidGenerator.g:2923:3: 
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
    // InternalAndroidGenerator.g:2931:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2935:1: ( rule__Operator__Group_1__1__Impl )
            // InternalAndroidGenerator.g:2936:2: rule__Operator__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:2942:1: rule__Operator__Group_1__1__Impl : ( '<' ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2946:1: ( ( '<' ) )
            // InternalAndroidGenerator.g:2947:1: ( '<' )
            {
            // InternalAndroidGenerator.g:2947:1: ( '<' )
            // InternalAndroidGenerator.g:2948:2: '<'
            {
             before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2958:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2962:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalAndroidGenerator.g:2963:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAndroidGenerator.g:2970:1: rule__Operator__Group_2__0__Impl : ( () ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2974:1: ( ( () ) )
            // InternalAndroidGenerator.g:2975:1: ( () )
            {
            // InternalAndroidGenerator.g:2975:1: ( () )
            // InternalAndroidGenerator.g:2976:2: ()
            {
             before(grammarAccess.getOperatorAccess().getEqualAction_2_0()); 
            // InternalAndroidGenerator.g:2977:2: ()
            // InternalAndroidGenerator.g:2977:3: 
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
    // InternalAndroidGenerator.g:2985:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2989:1: ( rule__Operator__Group_2__1__Impl )
            // InternalAndroidGenerator.g:2990:2: rule__Operator__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:2996:1: rule__Operator__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3000:1: ( ( '=' ) )
            // InternalAndroidGenerator.g:3001:1: ( '=' )
            {
            // InternalAndroidGenerator.g:3001:1: ( '=' )
            // InternalAndroidGenerator.g:3002:2: '='
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3012:1: rule__Unit__Group_0__0 : rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 ;
    public final void rule__Unit__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3016:1: ( rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 )
            // InternalAndroidGenerator.g:3017:2: rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAndroidGenerator.g:3024:1: rule__Unit__Group_0__0__Impl : ( () ) ;
    public final void rule__Unit__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3028:1: ( ( () ) )
            // InternalAndroidGenerator.g:3029:1: ( () )
            {
            // InternalAndroidGenerator.g:3029:1: ( () )
            // InternalAndroidGenerator.g:3030:2: ()
            {
             before(grammarAccess.getUnitAccess().getMetersAction_0_0()); 
            // InternalAndroidGenerator.g:3031:2: ()
            // InternalAndroidGenerator.g:3031:3: 
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
    // InternalAndroidGenerator.g:3039:1: rule__Unit__Group_0__1 : rule__Unit__Group_0__1__Impl ;
    public final void rule__Unit__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3043:1: ( rule__Unit__Group_0__1__Impl )
            // InternalAndroidGenerator.g:3044:2: rule__Unit__Group_0__1__Impl
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
    // InternalAndroidGenerator.g:3050:1: rule__Unit__Group_0__1__Impl : ( 'm' ) ;
    public final void rule__Unit__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3054:1: ( ( 'm' ) )
            // InternalAndroidGenerator.g:3055:1: ( 'm' )
            {
            // InternalAndroidGenerator.g:3055:1: ( 'm' )
            // InternalAndroidGenerator.g:3056:2: 'm'
            {
             before(grammarAccess.getUnitAccess().getMKeyword_0_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3066:1: rule__Unit__Group_1__0 : rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 ;
    public final void rule__Unit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3070:1: ( rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 )
            // InternalAndroidGenerator.g:3071:2: rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAndroidGenerator.g:3078:1: rule__Unit__Group_1__0__Impl : ( () ) ;
    public final void rule__Unit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3082:1: ( ( () ) )
            // InternalAndroidGenerator.g:3083:1: ( () )
            {
            // InternalAndroidGenerator.g:3083:1: ( () )
            // InternalAndroidGenerator.g:3084:2: ()
            {
             before(grammarAccess.getUnitAccess().getImperialAction_1_0()); 
            // InternalAndroidGenerator.g:3085:2: ()
            // InternalAndroidGenerator.g:3085:3: 
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
    // InternalAndroidGenerator.g:3093:1: rule__Unit__Group_1__1 : rule__Unit__Group_1__1__Impl ;
    public final void rule__Unit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3097:1: ( rule__Unit__Group_1__1__Impl )
            // InternalAndroidGenerator.g:3098:2: rule__Unit__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:3104:1: rule__Unit__Group_1__1__Impl : ( 'f' ) ;
    public final void rule__Unit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3108:1: ( ( 'f' ) )
            // InternalAndroidGenerator.g:3109:1: ( 'f' )
            {
            // InternalAndroidGenerator.g:3109:1: ( 'f' )
            // InternalAndroidGenerator.g:3110:2: 'f'
            {
             before(grammarAccess.getUnitAccess().getFKeyword_1_1()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__AndroidAppProject__ApplicationsAssignment_0"
    // InternalAndroidGenerator.g:3120:1: rule__AndroidAppProject__ApplicationsAssignment_0 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3124:1: ( ( ruleApplication ) )
            // InternalAndroidGenerator.g:3125:2: ( ruleApplication )
            {
            // InternalAndroidGenerator.g:3125:2: ( ruleApplication )
            // InternalAndroidGenerator.g:3126:3: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__ApplicationsAssignment_0"


    // $ANTLR start "rule__AndroidAppProject__ApplicationsAssignment_1_1"
    // InternalAndroidGenerator.g:3135:1: rule__AndroidAppProject__ApplicationsAssignment_1_1 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3139:1: ( ( ruleApplication ) )
            // InternalAndroidGenerator.g:3140:2: ( ruleApplication )
            {
            // InternalAndroidGenerator.g:3140:2: ( ruleApplication )
            // InternalAndroidGenerator.g:3141:3: ruleApplication
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndroidAppProject__ApplicationsAssignment_1_1"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // InternalAndroidGenerator.g:3150:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3154:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3155:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3155:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3156:3: RULE_ID
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
    // InternalAndroidGenerator.g:3165:1: rule__Application__AttributesAssignment_2 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3169:1: ( ( ruleApplicationAttribute ) )
            // InternalAndroidGenerator.g:3170:2: ( ruleApplicationAttribute )
            {
            // InternalAndroidGenerator.g:3170:2: ( ruleApplicationAttribute )
            // InternalAndroidGenerator.g:3171:3: ruleApplicationAttribute
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


    // $ANTLR start "rule__ApplicationVersion__ResultAssignment_3"
    // InternalAndroidGenerator.g:3180:1: rule__ApplicationVersion__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__ApplicationVersion__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3184:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3185:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3185:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3186:3: ruleNumber
            {
             before(grammarAccess.getApplicationVersionAccess().getResultNumberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getApplicationVersionAccess().getResultNumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__ResultAssignment_3"


    // $ANTLR start "rule__ApplicationVersion__TargetsdkAssignment_4"
    // InternalAndroidGenerator.g:3195:1: rule__ApplicationVersion__TargetsdkAssignment_4 : ( ruleTargetSDK ) ;
    public final void rule__ApplicationVersion__TargetsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3199:1: ( ( ruleTargetSDK ) )
            // InternalAndroidGenerator.g:3200:2: ( ruleTargetSDK )
            {
            // InternalAndroidGenerator.g:3200:2: ( ruleTargetSDK )
            // InternalAndroidGenerator.g:3201:3: ruleTargetSDK
            {
             before(grammarAccess.getApplicationVersionAccess().getTargetsdkTargetSDKParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetSDK();

            state._fsp--;

             after(grammarAccess.getApplicationVersionAccess().getTargetsdkTargetSDKParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationVersion__TargetsdkAssignment_4"


    // $ANTLR start "rule__TargetSDK__ResultAssignment_3"
    // InternalAndroidGenerator.g:3210:1: rule__TargetSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__TargetSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3214:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3215:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3215:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3216:3: ruleNumber
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
    // InternalAndroidGenerator.g:3225:1: rule__TargetSDK__MinsdkAssignment_4 : ( ruleMinSDK ) ;
    public final void rule__TargetSDK__MinsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3229:1: ( ( ruleMinSDK ) )
            // InternalAndroidGenerator.g:3230:2: ( ruleMinSDK )
            {
            // InternalAndroidGenerator.g:3230:2: ( ruleMinSDK )
            // InternalAndroidGenerator.g:3231:3: ruleMinSDK
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
    // InternalAndroidGenerator.g:3240:1: rule__MinSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__MinSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3244:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3245:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3245:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3246:3: ruleNumber
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
    // InternalAndroidGenerator.g:3255:1: rule__ApplicationPermissionList__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3259:1: ( ( rulePermission ) )
            // InternalAndroidGenerator.g:3260:2: ( rulePermission )
            {
            // InternalAndroidGenerator.g:3260:2: ( rulePermission )
            // InternalAndroidGenerator.g:3261:3: rulePermission
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
    // InternalAndroidGenerator.g:3270:1: rule__ApplicationPermissionList__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3274:1: ( ( rulePermission ) )
            // InternalAndroidGenerator.g:3275:2: ( rulePermission )
            {
            // InternalAndroidGenerator.g:3275:2: ( rulePermission )
            // InternalAndroidGenerator.g:3276:3: rulePermission
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
    // InternalAndroidGenerator.g:3285:1: rule__Permission__NameAssignment : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Permission__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3289:1: ( ( RULE_PACKAGE_NAME ) )
            // InternalAndroidGenerator.g:3290:2: ( RULE_PACKAGE_NAME )
            {
            // InternalAndroidGenerator.g:3290:2: ( RULE_PACKAGE_NAME )
            // InternalAndroidGenerator.g:3291:3: RULE_PACKAGE_NAME
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


    // $ANTLR start "rule__ApplicationElementList__ElementsAssignment_2"
    // InternalAndroidGenerator.g:3300:1: rule__ApplicationElementList__ElementsAssignment_2 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3304:1: ( ( ruleApplicationElement ) )
            // InternalAndroidGenerator.g:3305:2: ( ruleApplicationElement )
            {
            // InternalAndroidGenerator.g:3305:2: ( ruleApplicationElement )
            // InternalAndroidGenerator.g:3306:3: ruleApplicationElement
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleApplicationElement();

            state._fsp--;

             after(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationElementList__ElementsAssignment_2"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalAndroidGenerator.g:3315:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3319:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3320:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3320:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3321:3: RULE_ID
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
    // InternalAndroidGenerator.g:3330:1: rule__Fragment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3334:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3335:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3335:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3336:3: RULE_ID
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
    // InternalAndroidGenerator.g:3345:1: rule__Fragment__ActivityAttributesAssignment_3 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Fragment__ActivityAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3349:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGenerator.g:3350:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGenerator.g:3350:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGenerator.g:3351:3: ruleActivityLayoutAttributes
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


    // $ANTLR start "rule__ActivityLayoutAttributes__LayoutElementsAssignment_0"
    // InternalAndroidGenerator.g:3360:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3364:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGenerator.g:3365:2: ( ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:3365:2: ( ruleLayoutElement )
            // InternalAndroidGenerator.g:3366:3: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__LayoutElementsAssignment_0"


    // $ANTLR start "rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1"
    // InternalAndroidGenerator.g:3375:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3379:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGenerator.g:3380:2: ( ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:3380:2: ( ruleLayoutElement )
            // InternalAndroidGenerator.g:3381:3: ruleLayoutElement
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutElement();

            state._fsp--;

             after(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1"


    // $ANTLR start "rule__TypeMap__ActivitytypeattributeAssignment_2"
    // InternalAndroidGenerator.g:3390:1: rule__TypeMap__ActivitytypeattributeAssignment_2 : ( ruleActivityTypeAttributes ) ;
    public final void rule__TypeMap__ActivitytypeattributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3394:1: ( ( ruleActivityTypeAttributes ) )
            // InternalAndroidGenerator.g:3395:2: ( ruleActivityTypeAttributes )
            {
            // InternalAndroidGenerator.g:3395:2: ( ruleActivityTypeAttributes )
            // InternalAndroidGenerator.g:3396:3: ruleActivityTypeAttributes
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
    // InternalAndroidGenerator.g:3405:1: rule__ActivityTypeAttributes__FilterAssignment : ( ruleFilterQuery ) ;
    public final void rule__ActivityTypeAttributes__FilterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3409:1: ( ( ruleFilterQuery ) )
            // InternalAndroidGenerator.g:3410:2: ( ruleFilterQuery )
            {
            // InternalAndroidGenerator.g:3410:2: ( ruleFilterQuery )
            // InternalAndroidGenerator.g:3411:3: ruleFilterQuery
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


    // $ANTLR start "rule__EditText__NameAssignment_2"
    // InternalAndroidGenerator.g:3420:1: rule__EditText__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EditText__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3424:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3425:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3425:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3426:3: RULE_ID
            {
             before(grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditText__NameAssignment_2"


    // $ANTLR start "rule__Spinner__NameAssignment_2"
    // InternalAndroidGenerator.g:3435:1: rule__Spinner__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Spinner__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3439:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3440:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3440:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3441:3: RULE_ID
            {
             before(grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__NameAssignment_2"


    // $ANTLR start "rule__Button__NameAssignment_2"
    // InternalAndroidGenerator.g:3450:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3454:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3455:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3455:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3456:3: RULE_ID
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


    // $ANTLR start "rule__Button__ActionsAssignment_3_0"
    // InternalAndroidGenerator.g:3465:1: rule__Button__ActionsAssignment_3_0 : ( ruleButtonActions ) ;
    public final void rule__Button__ActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3469:1: ( ( ruleButtonActions ) )
            // InternalAndroidGenerator.g:3470:2: ( ruleButtonActions )
            {
            // InternalAndroidGenerator.g:3470:2: ( ruleButtonActions )
            // InternalAndroidGenerator.g:3471:3: ruleButtonActions
            {
             before(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleButtonActions();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ActionsAssignment_3_0"


    // $ANTLR start "rule__Button__ActionsAssignment_3_1_1"
    // InternalAndroidGenerator.g:3480:1: rule__Button__ActionsAssignment_3_1_1 : ( ruleButtonActions ) ;
    public final void rule__Button__ActionsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3484:1: ( ( ruleButtonActions ) )
            // InternalAndroidGenerator.g:3485:2: ( ruleButtonActions )
            {
            // InternalAndroidGenerator.g:3485:2: ( ruleButtonActions )
            // InternalAndroidGenerator.g:3486:3: ruleButtonActions
            {
             before(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleButtonActions();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ActionsAssignment_3_1_1"


    // $ANTLR start "rule__Toast__TextAssignment_1"
    // InternalAndroidGenerator.g:3495:1: rule__Toast__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Toast__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3499:1: ( ( RULE_STRING ) )
            // InternalAndroidGenerator.g:3500:2: ( RULE_STRING )
            {
            // InternalAndroidGenerator.g:3500:2: ( RULE_STRING )
            // InternalAndroidGenerator.g:3501:3: RULE_STRING
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
    // InternalAndroidGenerator.g:3510:1: rule__Bundle__BundleRecipientAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bundle__BundleRecipientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3514:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGenerator.g:3515:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGenerator.g:3515:2: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3516:3: ( RULE_ID )
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_1_0()); 
            // InternalAndroidGenerator.g:3517:3: ( RULE_ID )
            // InternalAndroidGenerator.g:3518:4: RULE_ID
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


    // $ANTLR start "rule__FilterQuery__NameAssignment_2"
    // InternalAndroidGenerator.g:3529:1: rule__FilterQuery__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FilterQuery__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3533:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3534:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3534:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3535:3: RULE_ID
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
    // InternalAndroidGenerator.g:3544:1: rule__FilterQuery__FilterAttributesAssignment_3 : ( ruleFilterAttributes ) ;
    public final void rule__FilterQuery__FilterAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3548:1: ( ( ruleFilterAttributes ) )
            // InternalAndroidGenerator.g:3549:2: ( ruleFilterAttributes )
            {
            // InternalAndroidGenerator.g:3549:2: ( ruleFilterAttributes )
            // InternalAndroidGenerator.g:3550:3: ruleFilterAttributes
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
    // InternalAndroidGenerator.g:3559:1: rule__FilterAttributes__DistanceAssignment : ( ruleDistance ) ;
    public final void rule__FilterAttributes__DistanceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3563:1: ( ( ruleDistance ) )
            // InternalAndroidGenerator.g:3564:2: ( ruleDistance )
            {
            // InternalAndroidGenerator.g:3564:2: ( ruleDistance )
            // InternalAndroidGenerator.g:3565:3: ruleDistance
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
    // InternalAndroidGenerator.g:3574:1: rule__Distance__UnitAssignment_2 : ( ruleUnit ) ;
    public final void rule__Distance__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3578:1: ( ( ruleUnit ) )
            // InternalAndroidGenerator.g:3579:2: ( ruleUnit )
            {
            // InternalAndroidGenerator.g:3579:2: ( ruleUnit )
            // InternalAndroidGenerator.g:3580:3: ruleUnit
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
    // InternalAndroidGenerator.g:3589:1: rule__Distance__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__Distance__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3593:1: ( ( ruleOperator ) )
            // InternalAndroidGenerator.g:3594:2: ( ruleOperator )
            {
            // InternalAndroidGenerator.g:3594:2: ( ruleOperator )
            // InternalAndroidGenerator.g:3595:3: ruleOperator
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
    // InternalAndroidGenerator.g:3604:1: rule__Distance__ResultsAssignment_4 : ( ruleNumber ) ;
    public final void rule__Distance__ResultsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3608:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3609:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3609:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3610:3: ruleNumber
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
    // InternalAndroidGenerator.g:3619:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3623:1: ( ( RULE_INT ) )
            // InternalAndroidGenerator.g:3624:2: ( RULE_INT )
            {
            // InternalAndroidGenerator.g:3624:2: ( RULE_INT )
            // InternalAndroidGenerator.g:3625:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C4002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});

}