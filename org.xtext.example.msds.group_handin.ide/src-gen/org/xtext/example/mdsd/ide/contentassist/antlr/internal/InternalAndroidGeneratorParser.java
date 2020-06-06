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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PACKAGE_NAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'Application'", "'Android-SDK'", "':'", "'Target-SDK'", "'Minimum-SDK'", "'permissions'", "'elements'", "'main-activity'", "'Model'", "'Fragment'", "'Activity'", "'Maps'", "'TextView'", "'Button'", "'FilterQuery'", "'Distance'", "'>'", "'<'", "'='", "'m'", "'f'"
    };
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


    // $ANTLR start "entryRuleApplicationMainActivity"
    // InternalAndroidGenerator.g:278:1: entryRuleApplicationMainActivity : ruleApplicationMainActivity EOF ;
    public final void entryRuleApplicationMainActivity() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:279:1: ( ruleApplicationMainActivity EOF )
            // InternalAndroidGenerator.g:280:1: ruleApplicationMainActivity EOF
            {
             before(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationMainActivity();

            state._fsp--;

             after(grammarAccess.getApplicationMainActivityRule()); 
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
    // $ANTLR end "entryRuleApplicationMainActivity"


    // $ANTLR start "ruleApplicationMainActivity"
    // InternalAndroidGenerator.g:287:1: ruleApplicationMainActivity : ( ( rule__ApplicationMainActivity__Group__0 ) ) ;
    public final void ruleApplicationMainActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:291:2: ( ( ( rule__ApplicationMainActivity__Group__0 ) ) )
            // InternalAndroidGenerator.g:292:2: ( ( rule__ApplicationMainActivity__Group__0 ) )
            {
            // InternalAndroidGenerator.g:292:2: ( ( rule__ApplicationMainActivity__Group__0 ) )
            // InternalAndroidGenerator.g:293:3: ( rule__ApplicationMainActivity__Group__0 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getGroup()); 
            // InternalAndroidGenerator.g:294:3: ( rule__ApplicationMainActivity__Group__0 )
            // InternalAndroidGenerator.g:294:4: rule__ApplicationMainActivity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationMainActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMainActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationMainActivity"


    // $ANTLR start "entryRuleApplicationElement"
    // InternalAndroidGenerator.g:303:1: entryRuleApplicationElement : ruleApplicationElement EOF ;
    public final void entryRuleApplicationElement() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:304:1: ( ruleApplicationElement EOF )
            // InternalAndroidGenerator.g:305:1: ruleApplicationElement EOF
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
    // InternalAndroidGenerator.g:312:1: ruleApplicationElement : ( ( rule__ApplicationElement__Alternatives ) ) ;
    public final void ruleApplicationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:316:2: ( ( ( rule__ApplicationElement__Alternatives ) ) )
            // InternalAndroidGenerator.g:317:2: ( ( rule__ApplicationElement__Alternatives ) )
            {
            // InternalAndroidGenerator.g:317:2: ( ( rule__ApplicationElement__Alternatives ) )
            // InternalAndroidGenerator.g:318:3: ( rule__ApplicationElement__Alternatives )
            {
             before(grammarAccess.getApplicationElementAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:319:3: ( rule__ApplicationElement__Alternatives )
            // InternalAndroidGenerator.g:319:4: rule__ApplicationElement__Alternatives
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
    // InternalAndroidGenerator.g:328:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:329:1: ( ruleModel EOF )
            // InternalAndroidGenerator.g:330:1: ruleModel EOF
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
    // InternalAndroidGenerator.g:337:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:341:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAndroidGenerator.g:342:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAndroidGenerator.g:342:2: ( ( rule__Model__Group__0 ) )
            // InternalAndroidGenerator.g:343:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAndroidGenerator.g:344:3: ( rule__Model__Group__0 )
            // InternalAndroidGenerator.g:344:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleModelList"
    // InternalAndroidGenerator.g:353:1: entryRuleModelList : ruleModelList EOF ;
    public final void entryRuleModelList() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:354:1: ( ruleModelList EOF )
            // InternalAndroidGenerator.g:355:1: ruleModelList EOF
            {
             before(grammarAccess.getModelListRule()); 
            pushFollow(FOLLOW_1);
            ruleModelList();

            state._fsp--;

             after(grammarAccess.getModelListRule()); 
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
    // $ANTLR end "entryRuleModelList"


    // $ANTLR start "ruleModelList"
    // InternalAndroidGenerator.g:362:1: ruleModelList : ( ( rule__ModelList__Group__0 ) ) ;
    public final void ruleModelList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:366:2: ( ( ( rule__ModelList__Group__0 ) ) )
            // InternalAndroidGenerator.g:367:2: ( ( rule__ModelList__Group__0 ) )
            {
            // InternalAndroidGenerator.g:367:2: ( ( rule__ModelList__Group__0 ) )
            // InternalAndroidGenerator.g:368:3: ( rule__ModelList__Group__0 )
            {
             before(grammarAccess.getModelListAccess().getGroup()); 
            // InternalAndroidGenerator.g:369:3: ( rule__ModelList__Group__0 )
            // InternalAndroidGenerator.g:369:4: rule__ModelList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelList"


    // $ANTLR start "entryRuleGetSet"
    // InternalAndroidGenerator.g:378:1: entryRuleGetSet : ruleGetSet EOF ;
    public final void entryRuleGetSet() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:379:1: ( ruleGetSet EOF )
            // InternalAndroidGenerator.g:380:1: ruleGetSet EOF
            {
             before(grammarAccess.getGetSetRule()); 
            pushFollow(FOLLOW_1);
            ruleGetSet();

            state._fsp--;

             after(grammarAccess.getGetSetRule()); 
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
    // $ANTLR end "entryRuleGetSet"


    // $ANTLR start "ruleGetSet"
    // InternalAndroidGenerator.g:387:1: ruleGetSet : ( ( rule__GetSet__Group__0 ) ) ;
    public final void ruleGetSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:391:2: ( ( ( rule__GetSet__Group__0 ) ) )
            // InternalAndroidGenerator.g:392:2: ( ( rule__GetSet__Group__0 ) )
            {
            // InternalAndroidGenerator.g:392:2: ( ( rule__GetSet__Group__0 ) )
            // InternalAndroidGenerator.g:393:3: ( rule__GetSet__Group__0 )
            {
             before(grammarAccess.getGetSetAccess().getGroup()); 
            // InternalAndroidGenerator.g:394:3: ( rule__GetSet__Group__0 )
            // InternalAndroidGenerator.g:394:4: rule__GetSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetSet"


    // $ANTLR start "entryRuleType"
    // InternalAndroidGenerator.g:403:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:404:1: ( ruleType EOF )
            // InternalAndroidGenerator.g:405:1: ruleType EOF
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
    // InternalAndroidGenerator.g:412:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:416:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalAndroidGenerator.g:417:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalAndroidGenerator.g:417:2: ( ( rule__Type__Group__0 ) )
            // InternalAndroidGenerator.g:418:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalAndroidGenerator.g:419:3: ( rule__Type__Group__0 )
            // InternalAndroidGenerator.g:419:4: rule__Type__Group__0
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


    // $ANTLR start "entryRuleFragment"
    // InternalAndroidGenerator.g:428:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:429:1: ( ruleFragment EOF )
            // InternalAndroidGenerator.g:430:1: ruleFragment EOF
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
    // InternalAndroidGenerator.g:437:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:441:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalAndroidGenerator.g:442:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalAndroidGenerator.g:442:2: ( ( rule__Fragment__Group__0 ) )
            // InternalAndroidGenerator.g:443:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalAndroidGenerator.g:444:3: ( rule__Fragment__Group__0 )
            // InternalAndroidGenerator.g:444:4: rule__Fragment__Group__0
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


    // $ANTLR start "entryRuleActivity"
    // InternalAndroidGenerator.g:453:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:454:1: ( ruleActivity EOF )
            // InternalAndroidGenerator.g:455:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalAndroidGenerator.g:462:1: ruleActivity : ( ( rule__Activity__Alternatives ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:466:2: ( ( ( rule__Activity__Alternatives ) ) )
            // InternalAndroidGenerator.g:467:2: ( ( rule__Activity__Alternatives ) )
            {
            // InternalAndroidGenerator.g:467:2: ( ( rule__Activity__Alternatives ) )
            // InternalAndroidGenerator.g:468:3: ( rule__Activity__Alternatives )
            {
             before(grammarAccess.getActivityAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:469:3: ( rule__Activity__Alternatives )
            // InternalAndroidGenerator.g:469:4: rule__Activity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleActivityTypeAttributes"
    // InternalAndroidGenerator.g:478:1: entryRuleActivityTypeAttributes : ruleActivityTypeAttributes EOF ;
    public final void entryRuleActivityTypeAttributes() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:479:1: ( ruleActivityTypeAttributes EOF )
            // InternalAndroidGenerator.g:480:1: ruleActivityTypeAttributes EOF
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
    // InternalAndroidGenerator.g:487:1: ruleActivityTypeAttributes : ( ( rule__ActivityTypeAttributes__FilterAssignment ) ) ;
    public final void ruleActivityTypeAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:491:2: ( ( ( rule__ActivityTypeAttributes__FilterAssignment ) ) )
            // InternalAndroidGenerator.g:492:2: ( ( rule__ActivityTypeAttributes__FilterAssignment ) )
            {
            // InternalAndroidGenerator.g:492:2: ( ( rule__ActivityTypeAttributes__FilterAssignment ) )
            // InternalAndroidGenerator.g:493:3: ( rule__ActivityTypeAttributes__FilterAssignment )
            {
             before(grammarAccess.getActivityTypeAttributesAccess().getFilterAssignment()); 
            // InternalAndroidGenerator.g:494:3: ( rule__ActivityTypeAttributes__FilterAssignment )
            // InternalAndroidGenerator.g:494:4: rule__ActivityTypeAttributes__FilterAssignment
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


    // $ANTLR start "entryRuleActivityType"
    // InternalAndroidGenerator.g:503:1: entryRuleActivityType : ruleActivityType EOF ;
    public final void entryRuleActivityType() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:504:1: ( ruleActivityType EOF )
            // InternalAndroidGenerator.g:505:1: ruleActivityType EOF
            {
             before(grammarAccess.getActivityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityType();

            state._fsp--;

             after(grammarAccess.getActivityTypeRule()); 
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
    // $ANTLR end "entryRuleActivityType"


    // $ANTLR start "ruleActivityType"
    // InternalAndroidGenerator.g:512:1: ruleActivityType : ( ( rule__ActivityType__Group__0 ) ) ;
    public final void ruleActivityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:516:2: ( ( ( rule__ActivityType__Group__0 ) ) )
            // InternalAndroidGenerator.g:517:2: ( ( rule__ActivityType__Group__0 ) )
            {
            // InternalAndroidGenerator.g:517:2: ( ( rule__ActivityType__Group__0 ) )
            // InternalAndroidGenerator.g:518:3: ( rule__ActivityType__Group__0 )
            {
             before(grammarAccess.getActivityTypeAccess().getGroup()); 
            // InternalAndroidGenerator.g:519:3: ( rule__ActivityType__Group__0 )
            // InternalAndroidGenerator.g:519:4: rule__ActivityType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityType"


    // $ANTLR start "entryRuleActivityLayoutAttributes"
    // InternalAndroidGenerator.g:528:1: entryRuleActivityLayoutAttributes : ruleActivityLayoutAttributes EOF ;
    public final void entryRuleActivityLayoutAttributes() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:529:1: ( ruleActivityLayoutAttributes EOF )
            // InternalAndroidGenerator.g:530:1: ruleActivityLayoutAttributes EOF
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
    // InternalAndroidGenerator.g:537:1: ruleActivityLayoutAttributes : ( ( rule__ActivityLayoutAttributes__Group__0 ) ) ;
    public final void ruleActivityLayoutAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:541:2: ( ( ( rule__ActivityLayoutAttributes__Group__0 ) ) )
            // InternalAndroidGenerator.g:542:2: ( ( rule__ActivityLayoutAttributes__Group__0 ) )
            {
            // InternalAndroidGenerator.g:542:2: ( ( rule__ActivityLayoutAttributes__Group__0 ) )
            // InternalAndroidGenerator.g:543:3: ( rule__ActivityLayoutAttributes__Group__0 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getGroup()); 
            // InternalAndroidGenerator.g:544:3: ( rule__ActivityLayoutAttributes__Group__0 )
            // InternalAndroidGenerator.g:544:4: rule__ActivityLayoutAttributes__Group__0
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
    // InternalAndroidGenerator.g:553:1: entryRuleLayoutElement : ruleLayoutElement EOF ;
    public final void entryRuleLayoutElement() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:554:1: ( ruleLayoutElement EOF )
            // InternalAndroidGenerator.g:555:1: ruleLayoutElement EOF
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
    // InternalAndroidGenerator.g:562:1: ruleLayoutElement : ( ( rule__LayoutElement__Alternatives ) ) ;
    public final void ruleLayoutElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:566:2: ( ( ( rule__LayoutElement__Alternatives ) ) )
            // InternalAndroidGenerator.g:567:2: ( ( rule__LayoutElement__Alternatives ) )
            {
            // InternalAndroidGenerator.g:567:2: ( ( rule__LayoutElement__Alternatives ) )
            // InternalAndroidGenerator.g:568:3: ( rule__LayoutElement__Alternatives )
            {
             before(grammarAccess.getLayoutElementAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:569:3: ( rule__LayoutElement__Alternatives )
            // InternalAndroidGenerator.g:569:4: rule__LayoutElement__Alternatives
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


    // $ANTLR start "entryRuleTextView"
    // InternalAndroidGenerator.g:578:1: entryRuleTextView : ruleTextView EOF ;
    public final void entryRuleTextView() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:579:1: ( ruleTextView EOF )
            // InternalAndroidGenerator.g:580:1: ruleTextView EOF
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
    // InternalAndroidGenerator.g:587:1: ruleTextView : ( ( rule__TextView__Group__0 ) ) ;
    public final void ruleTextView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:591:2: ( ( ( rule__TextView__Group__0 ) ) )
            // InternalAndroidGenerator.g:592:2: ( ( rule__TextView__Group__0 ) )
            {
            // InternalAndroidGenerator.g:592:2: ( ( rule__TextView__Group__0 ) )
            // InternalAndroidGenerator.g:593:3: ( rule__TextView__Group__0 )
            {
             before(grammarAccess.getTextViewAccess().getGroup()); 
            // InternalAndroidGenerator.g:594:3: ( rule__TextView__Group__0 )
            // InternalAndroidGenerator.g:594:4: rule__TextView__Group__0
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
    // InternalAndroidGenerator.g:603:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:604:1: ( ruleButton EOF )
            // InternalAndroidGenerator.g:605:1: ruleButton EOF
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
    // InternalAndroidGenerator.g:612:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:616:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalAndroidGenerator.g:617:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalAndroidGenerator.g:617:2: ( ( rule__Button__Group__0 ) )
            // InternalAndroidGenerator.g:618:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalAndroidGenerator.g:619:3: ( rule__Button__Group__0 )
            // InternalAndroidGenerator.g:619:4: rule__Button__Group__0
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
    // InternalAndroidGenerator.g:777:1: rule__ApplicationAttribute__Alternatives : ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:781:1: ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) | ( ruleApplicationMainActivity ) )
            int alt1=4;
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
            case 20:
                {
                alt1=4;
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
                case 4 :
                    // InternalAndroidGenerator.g:800:2: ( ruleApplicationMainActivity )
                    {
                    // InternalAndroidGenerator.g:800:2: ( ruleApplicationMainActivity )
                    // InternalAndroidGenerator.g:801:3: ruleApplicationMainActivity
                    {
                     before(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicationMainActivity();

                    state._fsp--;

                     after(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_3()); 

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
    // InternalAndroidGenerator.g:810:1: rule__ApplicationElement__Alternatives : ( ( ruleActivity ) | ( ruleFragment ) | ( ruleModel ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:814:1: ( ( ruleActivity ) | ( ruleFragment ) | ( ruleModel ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 21:
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
                    // InternalAndroidGenerator.g:815:2: ( ruleActivity )
                    {
                    // InternalAndroidGenerator.g:815:2: ( ruleActivity )
                    // InternalAndroidGenerator.g:816:3: ruleActivity
                    {
                     before(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:821:2: ( ruleFragment )
                    {
                    // InternalAndroidGenerator.g:821:2: ( ruleFragment )
                    // InternalAndroidGenerator.g:822:3: ruleFragment
                    {
                     before(grammarAccess.getApplicationElementAccess().getFragmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFragment();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getFragmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGenerator.g:827:2: ( ruleModel )
                    {
                    // InternalAndroidGenerator.g:827:2: ( ruleModel )
                    // InternalAndroidGenerator.g:828:3: ruleModel
                    {
                     before(grammarAccess.getApplicationElementAccess().getModelParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleModel();

                    state._fsp--;

                     after(grammarAccess.getApplicationElementAccess().getModelParserRuleCall_2()); 

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


    // $ANTLR start "rule__Activity__Alternatives"
    // InternalAndroidGenerator.g:837:1: rule__Activity__Alternatives : ( ( ( rule__Activity__Group_0__0 ) ) | ( ( rule__Activity__Group_1__0 ) ) );
    public final void rule__Activity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:841:1: ( ( ( rule__Activity__Group_0__0 ) ) | ( ( rule__Activity__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==12||(LA3_1>=14 && LA3_1<=15)||(LA3_1>=18 && LA3_1<=23)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAndroidGenerator.g:842:2: ( ( rule__Activity__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:842:2: ( ( rule__Activity__Group_0__0 ) )
                    // InternalAndroidGenerator.g:843:3: ( rule__Activity__Group_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:844:3: ( rule__Activity__Group_0__0 )
                    // InternalAndroidGenerator.g:844:4: rule__Activity__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:848:2: ( ( rule__Activity__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:848:2: ( ( rule__Activity__Group_1__0 ) )
                    // InternalAndroidGenerator.g:849:3: ( rule__Activity__Group_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:850:3: ( rule__Activity__Group_1__0 )
                    // InternalAndroidGenerator.g:850:4: rule__Activity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Activity__Alternatives"


    // $ANTLR start "rule__LayoutElement__Alternatives"
    // InternalAndroidGenerator.g:858:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleTextView ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:862:1: ( ( ruleButton ) | ( ruleTextView ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAndroidGenerator.g:863:2: ( ruleButton )
                    {
                    // InternalAndroidGenerator.g:863:2: ( ruleButton )
                    // InternalAndroidGenerator.g:864:3: ruleButton
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
                    // InternalAndroidGenerator.g:869:2: ( ruleTextView )
                    {
                    // InternalAndroidGenerator.g:869:2: ( ruleTextView )
                    // InternalAndroidGenerator.g:870:3: ruleTextView
                    {
                     before(grammarAccess.getLayoutElementAccess().getTextViewParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextView();

                    state._fsp--;

                     after(grammarAccess.getLayoutElementAccess().getTextViewParserRuleCall_1()); 

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


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalAndroidGenerator.g:879:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:883:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
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
                    // InternalAndroidGenerator.g:884:2: ( ( rule__Operator__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:884:2: ( ( rule__Operator__Group_0__0 ) )
                    // InternalAndroidGenerator.g:885:3: ( rule__Operator__Group_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:886:3: ( rule__Operator__Group_0__0 )
                    // InternalAndroidGenerator.g:886:4: rule__Operator__Group_0__0
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
                    // InternalAndroidGenerator.g:890:2: ( ( rule__Operator__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:890:2: ( ( rule__Operator__Group_1__0 ) )
                    // InternalAndroidGenerator.g:891:3: ( rule__Operator__Group_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:892:3: ( rule__Operator__Group_1__0 )
                    // InternalAndroidGenerator.g:892:4: rule__Operator__Group_1__0
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
                    // InternalAndroidGenerator.g:896:2: ( ( rule__Operator__Group_2__0 ) )
                    {
                    // InternalAndroidGenerator.g:896:2: ( ( rule__Operator__Group_2__0 ) )
                    // InternalAndroidGenerator.g:897:3: ( rule__Operator__Group_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_2()); 
                    // InternalAndroidGenerator.g:898:3: ( rule__Operator__Group_2__0 )
                    // InternalAndroidGenerator.g:898:4: rule__Operator__Group_2__0
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
    // InternalAndroidGenerator.g:906:1: rule__Unit__Alternatives : ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:910:1: ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAndroidGenerator.g:911:2: ( ( rule__Unit__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:911:2: ( ( rule__Unit__Group_0__0 ) )
                    // InternalAndroidGenerator.g:912:3: ( rule__Unit__Group_0__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:913:3: ( rule__Unit__Group_0__0 )
                    // InternalAndroidGenerator.g:913:4: rule__Unit__Group_0__0
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
                    // InternalAndroidGenerator.g:917:2: ( ( rule__Unit__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:917:2: ( ( rule__Unit__Group_1__0 ) )
                    // InternalAndroidGenerator.g:918:3: ( rule__Unit__Group_1__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:919:3: ( rule__Unit__Group_1__0 )
                    // InternalAndroidGenerator.g:919:4: rule__Unit__Group_1__0
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
    // InternalAndroidGenerator.g:927:1: rule__AndroidAppProject__Group__0 : rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 ;
    public final void rule__AndroidAppProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:931:1: ( rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 )
            // InternalAndroidGenerator.g:932:2: rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1
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
    // InternalAndroidGenerator.g:939:1: rule__AndroidAppProject__Group__0__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) ;
    public final void rule__AndroidAppProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:943:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) )
            // InternalAndroidGenerator.g:944:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:944:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            // InternalAndroidGenerator.g:945:2: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 
            // InternalAndroidGenerator.g:946:2: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            // InternalAndroidGenerator.g:946:3: rule__AndroidAppProject__ApplicationsAssignment_0
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
    // InternalAndroidGenerator.g:954:1: rule__AndroidAppProject__Group__1 : rule__AndroidAppProject__Group__1__Impl ;
    public final void rule__AndroidAppProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:958:1: ( rule__AndroidAppProject__Group__1__Impl )
            // InternalAndroidGenerator.g:959:2: rule__AndroidAppProject__Group__1__Impl
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
    // InternalAndroidGenerator.g:965:1: rule__AndroidAppProject__Group__1__Impl : ( ( rule__AndroidAppProject__Group_1__0 )* ) ;
    public final void rule__AndroidAppProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:969:1: ( ( ( rule__AndroidAppProject__Group_1__0 )* ) )
            // InternalAndroidGenerator.g:970:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            {
            // InternalAndroidGenerator.g:970:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            // InternalAndroidGenerator.g:971:2: ( rule__AndroidAppProject__Group_1__0 )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:972:2: ( rule__AndroidAppProject__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAndroidGenerator.g:972:3: rule__AndroidAppProject__Group_1__0
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
    // InternalAndroidGenerator.g:981:1: rule__AndroidAppProject__Group_1__0 : rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 ;
    public final void rule__AndroidAppProject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:985:1: ( rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 )
            // InternalAndroidGenerator.g:986:2: rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1
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
    // InternalAndroidGenerator.g:993:1: rule__AndroidAppProject__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AndroidAppProject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:997:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:998:1: ( ',' )
            {
            // InternalAndroidGenerator.g:998:1: ( ',' )
            // InternalAndroidGenerator.g:999:2: ','
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
    // InternalAndroidGenerator.g:1008:1: rule__AndroidAppProject__Group_1__1 : rule__AndroidAppProject__Group_1__1__Impl ;
    public final void rule__AndroidAppProject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1012:1: ( rule__AndroidAppProject__Group_1__1__Impl )
            // InternalAndroidGenerator.g:1013:2: rule__AndroidAppProject__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:1019:1: rule__AndroidAppProject__Group_1__1__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) ;
    public final void rule__AndroidAppProject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1023:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:1024:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:1024:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            // InternalAndroidGenerator.g:1025:2: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 
            // InternalAndroidGenerator.g:1026:2: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            // InternalAndroidGenerator.g:1026:3: rule__AndroidAppProject__ApplicationsAssignment_1_1
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
    // InternalAndroidGenerator.g:1035:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1039:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalAndroidGenerator.g:1040:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalAndroidGenerator.g:1047:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1051:1: ( ( 'Application' ) )
            // InternalAndroidGenerator.g:1052:1: ( 'Application' )
            {
            // InternalAndroidGenerator.g:1052:1: ( 'Application' )
            // InternalAndroidGenerator.g:1053:2: 'Application'
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
    // InternalAndroidGenerator.g:1062:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1066:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalAndroidGenerator.g:1067:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalAndroidGenerator.g:1074:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1078:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1079:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1079:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:1080:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:1081:2: ( rule__Application__NameAssignment_1 )
            // InternalAndroidGenerator.g:1081:3: rule__Application__NameAssignment_1
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
    // InternalAndroidGenerator.g:1089:1: rule__Application__Group__2 : rule__Application__Group__2__Impl ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1093:1: ( rule__Application__Group__2__Impl )
            // InternalAndroidGenerator.g:1094:2: rule__Application__Group__2__Impl
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
    // InternalAndroidGenerator.g:1100:1: rule__Application__Group__2__Impl : ( ( rule__Application__AttributesAssignment_2 )* ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1104:1: ( ( ( rule__Application__AttributesAssignment_2 )* ) )
            // InternalAndroidGenerator.g:1105:1: ( ( rule__Application__AttributesAssignment_2 )* )
            {
            // InternalAndroidGenerator.g:1105:1: ( ( rule__Application__AttributesAssignment_2 )* )
            // InternalAndroidGenerator.g:1106:2: ( rule__Application__AttributesAssignment_2 )*
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_2()); 
            // InternalAndroidGenerator.g:1107:2: ( rule__Application__AttributesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14||(LA8_0>=18 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1107:3: rule__Application__AttributesAssignment_2
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
    // InternalAndroidGenerator.g:1116:1: rule__ApplicationVersion__Group__0 : rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 ;
    public final void rule__ApplicationVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1120:1: ( rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 )
            // InternalAndroidGenerator.g:1121:2: rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1
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
    // InternalAndroidGenerator.g:1128:1: rule__ApplicationVersion__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1132:1: ( ( () ) )
            // InternalAndroidGenerator.g:1133:1: ( () )
            {
            // InternalAndroidGenerator.g:1133:1: ( () )
            // InternalAndroidGenerator.g:1134:2: ()
            {
             before(grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0()); 
            // InternalAndroidGenerator.g:1135:2: ()
            // InternalAndroidGenerator.g:1135:3: 
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
    // InternalAndroidGenerator.g:1143:1: rule__ApplicationVersion__Group__1 : rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 ;
    public final void rule__ApplicationVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1147:1: ( rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 )
            // InternalAndroidGenerator.g:1148:2: rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2
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
    // InternalAndroidGenerator.g:1155:1: rule__ApplicationVersion__Group__1__Impl : ( 'Android-SDK' ) ;
    public final void rule__ApplicationVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1159:1: ( ( 'Android-SDK' ) )
            // InternalAndroidGenerator.g:1160:1: ( 'Android-SDK' )
            {
            // InternalAndroidGenerator.g:1160:1: ( 'Android-SDK' )
            // InternalAndroidGenerator.g:1161:2: 'Android-SDK'
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
    // InternalAndroidGenerator.g:1170:1: rule__ApplicationVersion__Group__2 : rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 ;
    public final void rule__ApplicationVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1174:1: ( rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 )
            // InternalAndroidGenerator.g:1175:2: rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3
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
    // InternalAndroidGenerator.g:1182:1: rule__ApplicationVersion__Group__2__Impl : ( ':' ) ;
    public final void rule__ApplicationVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1186:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1187:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1187:1: ( ':' )
            // InternalAndroidGenerator.g:1188:2: ':'
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
    // InternalAndroidGenerator.g:1197:1: rule__ApplicationVersion__Group__3 : rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 ;
    public final void rule__ApplicationVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1201:1: ( rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 )
            // InternalAndroidGenerator.g:1202:2: rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4
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
    // InternalAndroidGenerator.g:1209:1: rule__ApplicationVersion__Group__3__Impl : ( ( rule__ApplicationVersion__ResultAssignment_3 ) ) ;
    public final void rule__ApplicationVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1213:1: ( ( ( rule__ApplicationVersion__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1214:1: ( ( rule__ApplicationVersion__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1214:1: ( ( rule__ApplicationVersion__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1215:2: ( rule__ApplicationVersion__ResultAssignment_3 )
            {
             before(grammarAccess.getApplicationVersionAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1216:2: ( rule__ApplicationVersion__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1216:3: rule__ApplicationVersion__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1224:1: rule__ApplicationVersion__Group__4 : rule__ApplicationVersion__Group__4__Impl ;
    public final void rule__ApplicationVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1228:1: ( rule__ApplicationVersion__Group__4__Impl )
            // InternalAndroidGenerator.g:1229:2: rule__ApplicationVersion__Group__4__Impl
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
    // InternalAndroidGenerator.g:1235:1: rule__ApplicationVersion__Group__4__Impl : ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? ) ;
    public final void rule__ApplicationVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1239:1: ( ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1240:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1240:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? )
            // InternalAndroidGenerator.g:1241:2: ( rule__ApplicationVersion__TargetsdkAssignment_4 )?
            {
             before(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_4()); 
            // InternalAndroidGenerator.g:1242:2: ( rule__ApplicationVersion__TargetsdkAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAndroidGenerator.g:1242:3: rule__ApplicationVersion__TargetsdkAssignment_4
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
    // InternalAndroidGenerator.g:1251:1: rule__TargetSDK__Group__0 : rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 ;
    public final void rule__TargetSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1255:1: ( rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 )
            // InternalAndroidGenerator.g:1256:2: rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1
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
    // InternalAndroidGenerator.g:1263:1: rule__TargetSDK__Group__0__Impl : ( () ) ;
    public final void rule__TargetSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1267:1: ( ( () ) )
            // InternalAndroidGenerator.g:1268:1: ( () )
            {
            // InternalAndroidGenerator.g:1268:1: ( () )
            // InternalAndroidGenerator.g:1269:2: ()
            {
             before(grammarAccess.getTargetSDKAccess().getTargetSDKAction_0()); 
            // InternalAndroidGenerator.g:1270:2: ()
            // InternalAndroidGenerator.g:1270:3: 
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
    // InternalAndroidGenerator.g:1278:1: rule__TargetSDK__Group__1 : rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 ;
    public final void rule__TargetSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1282:1: ( rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 )
            // InternalAndroidGenerator.g:1283:2: rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2
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
    // InternalAndroidGenerator.g:1290:1: rule__TargetSDK__Group__1__Impl : ( 'Target-SDK' ) ;
    public final void rule__TargetSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1294:1: ( ( 'Target-SDK' ) )
            // InternalAndroidGenerator.g:1295:1: ( 'Target-SDK' )
            {
            // InternalAndroidGenerator.g:1295:1: ( 'Target-SDK' )
            // InternalAndroidGenerator.g:1296:2: 'Target-SDK'
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
    // InternalAndroidGenerator.g:1305:1: rule__TargetSDK__Group__2 : rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 ;
    public final void rule__TargetSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1309:1: ( rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 )
            // InternalAndroidGenerator.g:1310:2: rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3
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
    // InternalAndroidGenerator.g:1317:1: rule__TargetSDK__Group__2__Impl : ( ':' ) ;
    public final void rule__TargetSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1321:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1322:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1322:1: ( ':' )
            // InternalAndroidGenerator.g:1323:2: ':'
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
    // InternalAndroidGenerator.g:1332:1: rule__TargetSDK__Group__3 : rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 ;
    public final void rule__TargetSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1336:1: ( rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 )
            // InternalAndroidGenerator.g:1337:2: rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4
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
    // InternalAndroidGenerator.g:1344:1: rule__TargetSDK__Group__3__Impl : ( ( rule__TargetSDK__ResultAssignment_3 ) ) ;
    public final void rule__TargetSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1348:1: ( ( ( rule__TargetSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1349:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1349:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1350:2: ( rule__TargetSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getTargetSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1351:2: ( rule__TargetSDK__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1351:3: rule__TargetSDK__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1359:1: rule__TargetSDK__Group__4 : rule__TargetSDK__Group__4__Impl ;
    public final void rule__TargetSDK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1363:1: ( rule__TargetSDK__Group__4__Impl )
            // InternalAndroidGenerator.g:1364:2: rule__TargetSDK__Group__4__Impl
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
    // InternalAndroidGenerator.g:1370:1: rule__TargetSDK__Group__4__Impl : ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) ;
    public final void rule__TargetSDK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1374:1: ( ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1375:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1375:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            // InternalAndroidGenerator.g:1376:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            {
             before(grammarAccess.getTargetSDKAccess().getMinsdkAssignment_4()); 
            // InternalAndroidGenerator.g:1377:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAndroidGenerator.g:1377:3: rule__TargetSDK__MinsdkAssignment_4
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
    // InternalAndroidGenerator.g:1386:1: rule__MinSDK__Group__0 : rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 ;
    public final void rule__MinSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1390:1: ( rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 )
            // InternalAndroidGenerator.g:1391:2: rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1
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
    // InternalAndroidGenerator.g:1398:1: rule__MinSDK__Group__0__Impl : ( () ) ;
    public final void rule__MinSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1402:1: ( ( () ) )
            // InternalAndroidGenerator.g:1403:1: ( () )
            {
            // InternalAndroidGenerator.g:1403:1: ( () )
            // InternalAndroidGenerator.g:1404:2: ()
            {
             before(grammarAccess.getMinSDKAccess().getMinSDKAction_0()); 
            // InternalAndroidGenerator.g:1405:2: ()
            // InternalAndroidGenerator.g:1405:3: 
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
    // InternalAndroidGenerator.g:1413:1: rule__MinSDK__Group__1 : rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 ;
    public final void rule__MinSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1417:1: ( rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 )
            // InternalAndroidGenerator.g:1418:2: rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2
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
    // InternalAndroidGenerator.g:1425:1: rule__MinSDK__Group__1__Impl : ( 'Minimum-SDK' ) ;
    public final void rule__MinSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1429:1: ( ( 'Minimum-SDK' ) )
            // InternalAndroidGenerator.g:1430:1: ( 'Minimum-SDK' )
            {
            // InternalAndroidGenerator.g:1430:1: ( 'Minimum-SDK' )
            // InternalAndroidGenerator.g:1431:2: 'Minimum-SDK'
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
    // InternalAndroidGenerator.g:1440:1: rule__MinSDK__Group__2 : rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 ;
    public final void rule__MinSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1444:1: ( rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 )
            // InternalAndroidGenerator.g:1445:2: rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3
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
    // InternalAndroidGenerator.g:1452:1: rule__MinSDK__Group__2__Impl : ( ':' ) ;
    public final void rule__MinSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1456:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1457:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1457:1: ( ':' )
            // InternalAndroidGenerator.g:1458:2: ':'
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
    // InternalAndroidGenerator.g:1467:1: rule__MinSDK__Group__3 : rule__MinSDK__Group__3__Impl ;
    public final void rule__MinSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1471:1: ( rule__MinSDK__Group__3__Impl )
            // InternalAndroidGenerator.g:1472:2: rule__MinSDK__Group__3__Impl
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
    // InternalAndroidGenerator.g:1478:1: rule__MinSDK__Group__3__Impl : ( ( rule__MinSDK__ResultAssignment_3 ) ) ;
    public final void rule__MinSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1482:1: ( ( ( rule__MinSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1483:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1483:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1484:2: ( rule__MinSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getMinSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1485:2: ( rule__MinSDK__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1485:3: rule__MinSDK__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1494:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1498:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // InternalAndroidGenerator.g:1499:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
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
    // InternalAndroidGenerator.g:1506:1: rule__ApplicationPermissionList__Group__0__Impl : ( 'permissions' ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1510:1: ( ( 'permissions' ) )
            // InternalAndroidGenerator.g:1511:1: ( 'permissions' )
            {
            // InternalAndroidGenerator.g:1511:1: ( 'permissions' )
            // InternalAndroidGenerator.g:1512:2: 'permissions'
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
    // InternalAndroidGenerator.g:1521:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1525:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // InternalAndroidGenerator.g:1526:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
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
    // InternalAndroidGenerator.g:1533:1: rule__ApplicationPermissionList__Group__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1537:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1538:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1538:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            // InternalAndroidGenerator.g:1539:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_1()); 
            // InternalAndroidGenerator.g:1540:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            // InternalAndroidGenerator.g:1540:3: rule__ApplicationPermissionList__PermissionsAssignment_1
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
    // InternalAndroidGenerator.g:1548:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1552:1: ( rule__ApplicationPermissionList__Group__2__Impl )
            // InternalAndroidGenerator.g:1553:2: rule__ApplicationPermissionList__Group__2__Impl
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
    // InternalAndroidGenerator.g:1559:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__Group_2__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1563:1: ( ( ( rule__ApplicationPermissionList__Group_2__0 )* ) )
            // InternalAndroidGenerator.g:1564:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            {
            // InternalAndroidGenerator.g:1564:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            // InternalAndroidGenerator.g:1565:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_2()); 
            // InternalAndroidGenerator.g:1566:2: ( rule__ApplicationPermissionList__Group_2__0 )*
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
            	    // InternalAndroidGenerator.g:1566:3: rule__ApplicationPermissionList__Group_2__0
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
    // InternalAndroidGenerator.g:1575:1: rule__ApplicationPermissionList__Group_2__0 : rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 ;
    public final void rule__ApplicationPermissionList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1579:1: ( rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 )
            // InternalAndroidGenerator.g:1580:2: rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1
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
    // InternalAndroidGenerator.g:1587:1: rule__ApplicationPermissionList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ApplicationPermissionList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1591:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:1592:1: ( ',' )
            {
            // InternalAndroidGenerator.g:1592:1: ( ',' )
            // InternalAndroidGenerator.g:1593:2: ','
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
    // InternalAndroidGenerator.g:1602:1: rule__ApplicationPermissionList__Group_2__1 : rule__ApplicationPermissionList__Group_2__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1606:1: ( rule__ApplicationPermissionList__Group_2__1__Impl )
            // InternalAndroidGenerator.g:1607:2: rule__ApplicationPermissionList__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:1613:1: rule__ApplicationPermissionList__Group_2__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1617:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) )
            // InternalAndroidGenerator.g:1618:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            {
            // InternalAndroidGenerator.g:1618:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            // InternalAndroidGenerator.g:1619:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2_1()); 
            // InternalAndroidGenerator.g:1620:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            // InternalAndroidGenerator.g:1620:3: rule__ApplicationPermissionList__PermissionsAssignment_2_1
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
    // InternalAndroidGenerator.g:1629:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1633:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // InternalAndroidGenerator.g:1634:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAndroidGenerator.g:1641:1: rule__ApplicationElementList__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1645:1: ( ( () ) )
            // InternalAndroidGenerator.g:1646:1: ( () )
            {
            // InternalAndroidGenerator.g:1646:1: ( () )
            // InternalAndroidGenerator.g:1647:2: ()
            {
             before(grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0()); 
            // InternalAndroidGenerator.g:1648:2: ()
            // InternalAndroidGenerator.g:1648:3: 
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
    // InternalAndroidGenerator.g:1656:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1660:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // InternalAndroidGenerator.g:1661:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalAndroidGenerator.g:1668:1: rule__ApplicationElementList__Group__1__Impl : ( 'elements' ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1672:1: ( ( 'elements' ) )
            // InternalAndroidGenerator.g:1673:1: ( 'elements' )
            {
            // InternalAndroidGenerator.g:1673:1: ( 'elements' )
            // InternalAndroidGenerator.g:1674:2: 'elements'
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
    // InternalAndroidGenerator.g:1683:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1687:1: ( rule__ApplicationElementList__Group__2__Impl )
            // InternalAndroidGenerator.g:1688:2: rule__ApplicationElementList__Group__2__Impl
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
    // InternalAndroidGenerator.g:1694:1: rule__ApplicationElementList__Group__2__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_2 )* ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1698:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_2 )* ) )
            // InternalAndroidGenerator.g:1699:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 )* )
            {
            // InternalAndroidGenerator.g:1699:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 )* )
            // InternalAndroidGenerator.g:1700:2: ( rule__ApplicationElementList__ElementsAssignment_2 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 
            // InternalAndroidGenerator.g:1701:2: ( rule__ApplicationElementList__ElementsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=21 && LA12_0<=23)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1701:3: rule__ApplicationElementList__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
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


    // $ANTLR start "rule__ApplicationMainActivity__Group__0"
    // InternalAndroidGenerator.g:1710:1: rule__ApplicationMainActivity__Group__0 : rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 ;
    public final void rule__ApplicationMainActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1714:1: ( rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 )
            // InternalAndroidGenerator.g:1715:2: rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ApplicationMainActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationMainActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__Group__0"


    // $ANTLR start "rule__ApplicationMainActivity__Group__0__Impl"
    // InternalAndroidGenerator.g:1722:1: rule__ApplicationMainActivity__Group__0__Impl : ( 'main-activity' ) ;
    public final void rule__ApplicationMainActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1726:1: ( ( 'main-activity' ) )
            // InternalAndroidGenerator.g:1727:1: ( 'main-activity' )
            {
            // InternalAndroidGenerator.g:1727:1: ( 'main-activity' )
            // InternalAndroidGenerator.g:1728:2: 'main-activity'
            {
             before(grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__Group__0__Impl"


    // $ANTLR start "rule__ApplicationMainActivity__Group__1"
    // InternalAndroidGenerator.g:1737:1: rule__ApplicationMainActivity__Group__1 : rule__ApplicationMainActivity__Group__1__Impl ;
    public final void rule__ApplicationMainActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1741:1: ( rule__ApplicationMainActivity__Group__1__Impl )
            // InternalAndroidGenerator.g:1742:2: rule__ApplicationMainActivity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationMainActivity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__Group__1"


    // $ANTLR start "rule__ApplicationMainActivity__Group__1__Impl"
    // InternalAndroidGenerator.g:1748:1: rule__ApplicationMainActivity__Group__1__Impl : ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) ;
    public final void rule__ApplicationMainActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1752:1: ( ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1753:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1753:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            // InternalAndroidGenerator.g:1754:2: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 
            // InternalAndroidGenerator.g:1755:2: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            // InternalAndroidGenerator.g:1755:3: rule__ApplicationMainActivity__LauncherActivityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationMainActivity__LauncherActivityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAndroidGenerator.g:1764:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1768:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAndroidGenerator.g:1769:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAndroidGenerator.g:1776:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1780:1: ( ( () ) )
            // InternalAndroidGenerator.g:1781:1: ( () )
            {
            // InternalAndroidGenerator.g:1781:1: ( () )
            // InternalAndroidGenerator.g:1782:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalAndroidGenerator.g:1783:2: ()
            // InternalAndroidGenerator.g:1783:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAndroidGenerator.g:1791:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1795:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAndroidGenerator.g:1796:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAndroidGenerator.g:1803:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1807:1: ( ( 'Model' ) )
            // InternalAndroidGenerator.g:1808:1: ( 'Model' )
            {
            // InternalAndroidGenerator.g:1808:1: ( 'Model' )
            // InternalAndroidGenerator.g:1809:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:1818:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1822:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAndroidGenerator.g:1823:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:1830:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1834:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalAndroidGenerator.g:1835:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalAndroidGenerator.g:1835:1: ( ( rule__Model__Group_2__0 )? )
            // InternalAndroidGenerator.g:1836:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalAndroidGenerator.g:1837:2: ( rule__Model__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAndroidGenerator.g:1837:3: rule__Model__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__3"
    // InternalAndroidGenerator.g:1845:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1849:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalAndroidGenerator.g:1850:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalAndroidGenerator.g:1857:1: rule__Model__Group__3__Impl : ( ( rule__Model__NameAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1861:1: ( ( ( rule__Model__NameAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1862:1: ( ( rule__Model__NameAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1862:1: ( ( rule__Model__NameAssignment_3 ) )
            // InternalAndroidGenerator.g:1863:2: ( rule__Model__NameAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_3()); 
            // InternalAndroidGenerator.g:1864:2: ( rule__Model__NameAssignment_3 )
            // InternalAndroidGenerator.g:1864:3: rule__Model__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalAndroidGenerator.g:1872:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1876:1: ( rule__Model__Group__4__Impl )
            // InternalAndroidGenerator.g:1877:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalAndroidGenerator.g:1883:1: rule__Model__Group__4__Impl : ( ( rule__Model__ModellistAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1887:1: ( ( ( rule__Model__ModellistAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1888:1: ( ( rule__Model__ModellistAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1888:1: ( ( rule__Model__ModellistAssignment_4 )? )
            // InternalAndroidGenerator.g:1889:2: ( rule__Model__ModellistAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getModellistAssignment_4()); 
            // InternalAndroidGenerator.g:1890:2: ( rule__Model__ModellistAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAndroidGenerator.g:1890:3: rule__Model__ModellistAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ModellistAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getModellistAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalAndroidGenerator.g:1899:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1903:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalAndroidGenerator.g:1904:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalAndroidGenerator.g:1911:1: rule__Model__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1915:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1916:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1916:1: ( ':' )
            // InternalAndroidGenerator.g:1917:2: ':'
            {
             before(grammarAccess.getModelAccess().getColonKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalAndroidGenerator.g:1926:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1930:1: ( rule__Model__Group_2__1__Impl )
            // InternalAndroidGenerator.g:1931:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalAndroidGenerator.g:1937:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__ActivityTypeAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1941:1: ( ( ( rule__Model__ActivityTypeAssignment_2_1 ) ) )
            // InternalAndroidGenerator.g:1942:1: ( ( rule__Model__ActivityTypeAssignment_2_1 ) )
            {
            // InternalAndroidGenerator.g:1942:1: ( ( rule__Model__ActivityTypeAssignment_2_1 ) )
            // InternalAndroidGenerator.g:1943:2: ( rule__Model__ActivityTypeAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getActivityTypeAssignment_2_1()); 
            // InternalAndroidGenerator.g:1944:2: ( rule__Model__ActivityTypeAssignment_2_1 )
            // InternalAndroidGenerator.g:1944:3: rule__Model__ActivityTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ActivityTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getActivityTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__ModelList__Group__0"
    // InternalAndroidGenerator.g:1953:1: rule__ModelList__Group__0 : rule__ModelList__Group__0__Impl rule__ModelList__Group__1 ;
    public final void rule__ModelList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1957:1: ( rule__ModelList__Group__0__Impl rule__ModelList__Group__1 )
            // InternalAndroidGenerator.g:1958:2: rule__ModelList__Group__0__Impl rule__ModelList__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ModelList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group__0"


    // $ANTLR start "rule__ModelList__Group__0__Impl"
    // InternalAndroidGenerator.g:1965:1: rule__ModelList__Group__0__Impl : ( ( rule__ModelList__TypeAssignment_0 ) ) ;
    public final void rule__ModelList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1969:1: ( ( ( rule__ModelList__TypeAssignment_0 ) ) )
            // InternalAndroidGenerator.g:1970:1: ( ( rule__ModelList__TypeAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:1970:1: ( ( rule__ModelList__TypeAssignment_0 ) )
            // InternalAndroidGenerator.g:1971:2: ( rule__ModelList__TypeAssignment_0 )
            {
             before(grammarAccess.getModelListAccess().getTypeAssignment_0()); 
            // InternalAndroidGenerator.g:1972:2: ( rule__ModelList__TypeAssignment_0 )
            // InternalAndroidGenerator.g:1972:3: rule__ModelList__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelListAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group__0__Impl"


    // $ANTLR start "rule__ModelList__Group__1"
    // InternalAndroidGenerator.g:1980:1: rule__ModelList__Group__1 : rule__ModelList__Group__1__Impl rule__ModelList__Group__2 ;
    public final void rule__ModelList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1984:1: ( rule__ModelList__Group__1__Impl rule__ModelList__Group__2 )
            // InternalAndroidGenerator.g:1985:2: rule__ModelList__Group__1__Impl rule__ModelList__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ModelList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group__1"


    // $ANTLR start "rule__ModelList__Group__1__Impl"
    // InternalAndroidGenerator.g:1992:1: rule__ModelList__Group__1__Impl : ( ':' ) ;
    public final void rule__ModelList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1996:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1997:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1997:1: ( ':' )
            // InternalAndroidGenerator.g:1998:2: ':'
            {
             before(grammarAccess.getModelListAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelListAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group__1__Impl"


    // $ANTLR start "rule__ModelList__Group__2"
    // InternalAndroidGenerator.g:2007:1: rule__ModelList__Group__2 : rule__ModelList__Group__2__Impl rule__ModelList__Group__3 ;
    public final void rule__ModelList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2011:1: ( rule__ModelList__Group__2__Impl rule__ModelList__Group__3 )
            // InternalAndroidGenerator.g:2012:2: rule__ModelList__Group__2__Impl rule__ModelList__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ModelList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group__2"


    // $ANTLR start "rule__ModelList__Group__2__Impl"
    // InternalAndroidGenerator.g:2019:1: rule__ModelList__Group__2__Impl : ( ( rule__ModelList__GetsetAssignment_2 ) ) ;
    public final void rule__ModelList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2023:1: ( ( ( rule__ModelList__GetsetAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2024:1: ( ( rule__ModelList__GetsetAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2024:1: ( ( rule__ModelList__GetsetAssignment_2 ) )
            // InternalAndroidGenerator.g:2025:2: ( rule__ModelList__GetsetAssignment_2 )
            {
             before(grammarAccess.getModelListAccess().getGetsetAssignment_2()); 
            // InternalAndroidGenerator.g:2026:2: ( rule__ModelList__GetsetAssignment_2 )
            // InternalAndroidGenerator.g:2026:3: rule__ModelList__GetsetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__GetsetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelListAccess().getGetsetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group__2__Impl"


    // $ANTLR start "rule__ModelList__Group__3"
    // InternalAndroidGenerator.g:2034:1: rule__ModelList__Group__3 : rule__ModelList__Group__3__Impl ;
    public final void rule__ModelList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2038:1: ( rule__ModelList__Group__3__Impl )
            // InternalAndroidGenerator.g:2039:2: rule__ModelList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group__3"


    // $ANTLR start "rule__ModelList__Group__3__Impl"
    // InternalAndroidGenerator.g:2045:1: rule__ModelList__Group__3__Impl : ( ( rule__ModelList__Group_3__0 )* ) ;
    public final void rule__ModelList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2049:1: ( ( ( rule__ModelList__Group_3__0 )* ) )
            // InternalAndroidGenerator.g:2050:1: ( ( rule__ModelList__Group_3__0 )* )
            {
            // InternalAndroidGenerator.g:2050:1: ( ( rule__ModelList__Group_3__0 )* )
            // InternalAndroidGenerator.g:2051:2: ( rule__ModelList__Group_3__0 )*
            {
             before(grammarAccess.getModelListAccess().getGroup_3()); 
            // InternalAndroidGenerator.g:2052:2: ( rule__ModelList__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2052:3: rule__ModelList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ModelList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group__3__Impl"


    // $ANTLR start "rule__ModelList__Group_3__0"
    // InternalAndroidGenerator.g:2061:1: rule__ModelList__Group_3__0 : rule__ModelList__Group_3__0__Impl rule__ModelList__Group_3__1 ;
    public final void rule__ModelList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2065:1: ( rule__ModelList__Group_3__0__Impl rule__ModelList__Group_3__1 )
            // InternalAndroidGenerator.g:2066:2: rule__ModelList__Group_3__0__Impl rule__ModelList__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ModelList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_3__0"


    // $ANTLR start "rule__ModelList__Group_3__0__Impl"
    // InternalAndroidGenerator.g:2073:1: rule__ModelList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModelList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2077:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:2078:1: ( ',' )
            {
            // InternalAndroidGenerator.g:2078:1: ( ',' )
            // InternalAndroidGenerator.g:2079:2: ','
            {
             before(grammarAccess.getModelListAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_3__0__Impl"


    // $ANTLR start "rule__ModelList__Group_3__1"
    // InternalAndroidGenerator.g:2088:1: rule__ModelList__Group_3__1 : rule__ModelList__Group_3__1__Impl rule__ModelList__Group_3__2 ;
    public final void rule__ModelList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2092:1: ( rule__ModelList__Group_3__1__Impl rule__ModelList__Group_3__2 )
            // InternalAndroidGenerator.g:2093:2: rule__ModelList__Group_3__1__Impl rule__ModelList__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__ModelList__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelList__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_3__1"


    // $ANTLR start "rule__ModelList__Group_3__1__Impl"
    // InternalAndroidGenerator.g:2100:1: rule__ModelList__Group_3__1__Impl : ( ( rule__ModelList__TypeAssignment_3_1 ) ) ;
    public final void rule__ModelList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2104:1: ( ( ( rule__ModelList__TypeAssignment_3_1 ) ) )
            // InternalAndroidGenerator.g:2105:1: ( ( rule__ModelList__TypeAssignment_3_1 ) )
            {
            // InternalAndroidGenerator.g:2105:1: ( ( rule__ModelList__TypeAssignment_3_1 ) )
            // InternalAndroidGenerator.g:2106:2: ( rule__ModelList__TypeAssignment_3_1 )
            {
             before(grammarAccess.getModelListAccess().getTypeAssignment_3_1()); 
            // InternalAndroidGenerator.g:2107:2: ( rule__ModelList__TypeAssignment_3_1 )
            // InternalAndroidGenerator.g:2107:3: rule__ModelList__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelListAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_3__1__Impl"


    // $ANTLR start "rule__ModelList__Group_3__2"
    // InternalAndroidGenerator.g:2115:1: rule__ModelList__Group_3__2 : rule__ModelList__Group_3__2__Impl rule__ModelList__Group_3__3 ;
    public final void rule__ModelList__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2119:1: ( rule__ModelList__Group_3__2__Impl rule__ModelList__Group_3__3 )
            // InternalAndroidGenerator.g:2120:2: rule__ModelList__Group_3__2__Impl rule__ModelList__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__ModelList__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelList__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_3__2"


    // $ANTLR start "rule__ModelList__Group_3__2__Impl"
    // InternalAndroidGenerator.g:2127:1: rule__ModelList__Group_3__2__Impl : ( ':' ) ;
    public final void rule__ModelList__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2131:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:2132:1: ( ':' )
            {
            // InternalAndroidGenerator.g:2132:1: ( ':' )
            // InternalAndroidGenerator.g:2133:2: ':'
            {
             before(grammarAccess.getModelListAccess().getColonKeyword_3_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelListAccess().getColonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_3__2__Impl"


    // $ANTLR start "rule__ModelList__Group_3__3"
    // InternalAndroidGenerator.g:2142:1: rule__ModelList__Group_3__3 : rule__ModelList__Group_3__3__Impl ;
    public final void rule__ModelList__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2146:1: ( rule__ModelList__Group_3__3__Impl )
            // InternalAndroidGenerator.g:2147:2: rule__ModelList__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_3__3"


    // $ANTLR start "rule__ModelList__Group_3__3__Impl"
    // InternalAndroidGenerator.g:2153:1: rule__ModelList__Group_3__3__Impl : ( ( rule__ModelList__GetsetAssignment_3_3 ) ) ;
    public final void rule__ModelList__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2157:1: ( ( ( rule__ModelList__GetsetAssignment_3_3 ) ) )
            // InternalAndroidGenerator.g:2158:1: ( ( rule__ModelList__GetsetAssignment_3_3 ) )
            {
            // InternalAndroidGenerator.g:2158:1: ( ( rule__ModelList__GetsetAssignment_3_3 ) )
            // InternalAndroidGenerator.g:2159:2: ( rule__ModelList__GetsetAssignment_3_3 )
            {
             before(grammarAccess.getModelListAccess().getGetsetAssignment_3_3()); 
            // InternalAndroidGenerator.g:2160:2: ( rule__ModelList__GetsetAssignment_3_3 )
            // InternalAndroidGenerator.g:2160:3: rule__ModelList__GetsetAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__ModelList__GetsetAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getModelListAccess().getGetsetAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__Group_3__3__Impl"


    // $ANTLR start "rule__GetSet__Group__0"
    // InternalAndroidGenerator.g:2169:1: rule__GetSet__Group__0 : rule__GetSet__Group__0__Impl rule__GetSet__Group__1 ;
    public final void rule__GetSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2173:1: ( rule__GetSet__Group__0__Impl rule__GetSet__Group__1 )
            // InternalAndroidGenerator.g:2174:2: rule__GetSet__Group__0__Impl rule__GetSet__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__GetSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetSet__Group__0"


    // $ANTLR start "rule__GetSet__Group__0__Impl"
    // InternalAndroidGenerator.g:2181:1: rule__GetSet__Group__0__Impl : ( () ) ;
    public final void rule__GetSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2185:1: ( ( () ) )
            // InternalAndroidGenerator.g:2186:1: ( () )
            {
            // InternalAndroidGenerator.g:2186:1: ( () )
            // InternalAndroidGenerator.g:2187:2: ()
            {
             before(grammarAccess.getGetSetAccess().getGetSetAction_0()); 
            // InternalAndroidGenerator.g:2188:2: ()
            // InternalAndroidGenerator.g:2188:3: 
            {
            }

             after(grammarAccess.getGetSetAccess().getGetSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetSet__Group__0__Impl"


    // $ANTLR start "rule__GetSet__Group__1"
    // InternalAndroidGenerator.g:2196:1: rule__GetSet__Group__1 : rule__GetSet__Group__1__Impl ;
    public final void rule__GetSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2200:1: ( rule__GetSet__Group__1__Impl )
            // InternalAndroidGenerator.g:2201:2: rule__GetSet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetSet__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetSet__Group__1"


    // $ANTLR start "rule__GetSet__Group__1__Impl"
    // InternalAndroidGenerator.g:2207:1: rule__GetSet__Group__1__Impl : ( ( rule__GetSet__NameAssignment_1 ) ) ;
    public final void rule__GetSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2211:1: ( ( ( rule__GetSet__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:2212:1: ( ( rule__GetSet__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:2212:1: ( ( rule__GetSet__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:2213:2: ( rule__GetSet__NameAssignment_1 )
            {
             before(grammarAccess.getGetSetAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:2214:2: ( rule__GetSet__NameAssignment_1 )
            // InternalAndroidGenerator.g:2214:3: rule__GetSet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GetSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGetSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetSet__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalAndroidGenerator.g:2223:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2227:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalAndroidGenerator.g:2228:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:2235:1: rule__Type__Group__0__Impl : ( () ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2239:1: ( ( () ) )
            // InternalAndroidGenerator.g:2240:1: ( () )
            {
            // InternalAndroidGenerator.g:2240:1: ( () )
            // InternalAndroidGenerator.g:2241:2: ()
            {
             before(grammarAccess.getTypeAccess().getTypeAction_0()); 
            // InternalAndroidGenerator.g:2242:2: ()
            // InternalAndroidGenerator.g:2242:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalAndroidGenerator.g:2250:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2254:1: ( rule__Type__Group__1__Impl )
            // InternalAndroidGenerator.g:2255:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:2261:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2265:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:2266:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:2266:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:2267:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:2268:2: ( rule__Type__NameAssignment_1 )
            // InternalAndroidGenerator.g:2268:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fragment__Group__0"
    // InternalAndroidGenerator.g:2277:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2281:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalAndroidGenerator.g:2282:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalAndroidGenerator.g:2289:1: rule__Fragment__Group__0__Impl : ( 'Fragment' ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2293:1: ( ( 'Fragment' ) )
            // InternalAndroidGenerator.g:2294:1: ( 'Fragment' )
            {
            // InternalAndroidGenerator.g:2294:1: ( 'Fragment' )
            // InternalAndroidGenerator.g:2295:2: 'Fragment'
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2304:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2308:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalAndroidGenerator.g:2309:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAndroidGenerator.g:2316:1: rule__Fragment__Group__1__Impl : ( ( rule__Fragment__Group_1__0 )? ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2320:1: ( ( ( rule__Fragment__Group_1__0 )? ) )
            // InternalAndroidGenerator.g:2321:1: ( ( rule__Fragment__Group_1__0 )? )
            {
            // InternalAndroidGenerator.g:2321:1: ( ( rule__Fragment__Group_1__0 )? )
            // InternalAndroidGenerator.g:2322:2: ( rule__Fragment__Group_1__0 )?
            {
             before(grammarAccess.getFragmentAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:2323:2: ( rule__Fragment__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAndroidGenerator.g:2323:3: rule__Fragment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fragment__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:2331:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2335:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalAndroidGenerator.g:2336:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalAndroidGenerator.g:2343:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__NameAssignment_2 ) ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2347:1: ( ( ( rule__Fragment__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2348:1: ( ( rule__Fragment__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2348:1: ( ( rule__Fragment__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2349:2: ( rule__Fragment__NameAssignment_2 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2350:2: ( rule__Fragment__NameAssignment_2 )
            // InternalAndroidGenerator.g:2350:3: rule__Fragment__NameAssignment_2
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
    // InternalAndroidGenerator.g:2358:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2362:1: ( rule__Fragment__Group__3__Impl )
            // InternalAndroidGenerator.g:2363:2: rule__Fragment__Group__3__Impl
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
    // InternalAndroidGenerator.g:2369:1: rule__Fragment__Group__3__Impl : ( ( rule__Fragment__ActivityAttributesAssignment_3 )? ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2373:1: ( ( ( rule__Fragment__ActivityAttributesAssignment_3 )? ) )
            // InternalAndroidGenerator.g:2374:1: ( ( rule__Fragment__ActivityAttributesAssignment_3 )? )
            {
            // InternalAndroidGenerator.g:2374:1: ( ( rule__Fragment__ActivityAttributesAssignment_3 )? )
            // InternalAndroidGenerator.g:2375:2: ( rule__Fragment__ActivityAttributesAssignment_3 )?
            {
             before(grammarAccess.getFragmentAccess().getActivityAttributesAssignment_3()); 
            // InternalAndroidGenerator.g:2376:2: ( rule__Fragment__ActivityAttributesAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=25 && LA17_0<=26)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGenerator.g:2376:3: rule__Fragment__ActivityAttributesAssignment_3
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


    // $ANTLR start "rule__Fragment__Group_1__0"
    // InternalAndroidGenerator.g:2385:1: rule__Fragment__Group_1__0 : rule__Fragment__Group_1__0__Impl rule__Fragment__Group_1__1 ;
    public final void rule__Fragment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2389:1: ( rule__Fragment__Group_1__0__Impl rule__Fragment__Group_1__1 )
            // InternalAndroidGenerator.g:2390:2: rule__Fragment__Group_1__0__Impl rule__Fragment__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Fragment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group_1__0"


    // $ANTLR start "rule__Fragment__Group_1__0__Impl"
    // InternalAndroidGenerator.g:2397:1: rule__Fragment__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Fragment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2401:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:2402:1: ( ':' )
            {
            // InternalAndroidGenerator.g:2402:1: ( ':' )
            // InternalAndroidGenerator.g:2403:2: ':'
            {
             before(grammarAccess.getFragmentAccess().getColonKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getColonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group_1__0__Impl"


    // $ANTLR start "rule__Fragment__Group_1__1"
    // InternalAndroidGenerator.g:2412:1: rule__Fragment__Group_1__1 : rule__Fragment__Group_1__1__Impl ;
    public final void rule__Fragment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2416:1: ( rule__Fragment__Group_1__1__Impl )
            // InternalAndroidGenerator.g:2417:2: rule__Fragment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group_1__1"


    // $ANTLR start "rule__Fragment__Group_1__1__Impl"
    // InternalAndroidGenerator.g:2423:1: rule__Fragment__Group_1__1__Impl : ( ( rule__Fragment__ActivityTypeAssignment_1_1 ) ) ;
    public final void rule__Fragment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2427:1: ( ( ( rule__Fragment__ActivityTypeAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:2428:1: ( ( rule__Fragment__ActivityTypeAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:2428:1: ( ( rule__Fragment__ActivityTypeAssignment_1_1 ) )
            // InternalAndroidGenerator.g:2429:2: ( rule__Fragment__ActivityTypeAssignment_1_1 )
            {
             before(grammarAccess.getFragmentAccess().getActivityTypeAssignment_1_1()); 
            // InternalAndroidGenerator.g:2430:2: ( rule__Fragment__ActivityTypeAssignment_1_1 )
            // InternalAndroidGenerator.g:2430:3: rule__Fragment__ActivityTypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__ActivityTypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getActivityTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_0__0"
    // InternalAndroidGenerator.g:2439:1: rule__Activity__Group_0__0 : rule__Activity__Group_0__0__Impl rule__Activity__Group_0__1 ;
    public final void rule__Activity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2443:1: ( rule__Activity__Group_0__0__Impl rule__Activity__Group_0__1 )
            // InternalAndroidGenerator.g:2444:2: rule__Activity__Group_0__0__Impl rule__Activity__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Activity__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0__0"


    // $ANTLR start "rule__Activity__Group_0__0__Impl"
    // InternalAndroidGenerator.g:2451:1: rule__Activity__Group_0__0__Impl : ( () ) ;
    public final void rule__Activity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2455:1: ( ( () ) )
            // InternalAndroidGenerator.g:2456:1: ( () )
            {
            // InternalAndroidGenerator.g:2456:1: ( () )
            // InternalAndroidGenerator.g:2457:2: ()
            {
             before(grammarAccess.getActivityAccess().getActivityAction_0_0()); 
            // InternalAndroidGenerator.g:2458:2: ()
            // InternalAndroidGenerator.g:2458:3: 
            {
            }

             after(grammarAccess.getActivityAccess().getActivityAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_0__1"
    // InternalAndroidGenerator.g:2466:1: rule__Activity__Group_0__1 : rule__Activity__Group_0__1__Impl rule__Activity__Group_0__2 ;
    public final void rule__Activity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2470:1: ( rule__Activity__Group_0__1__Impl rule__Activity__Group_0__2 )
            // InternalAndroidGenerator.g:2471:2: rule__Activity__Group_0__1__Impl rule__Activity__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Activity__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0__1"


    // $ANTLR start "rule__Activity__Group_0__1__Impl"
    // InternalAndroidGenerator.g:2478:1: rule__Activity__Group_0__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2482:1: ( ( 'Activity' ) )
            // InternalAndroidGenerator.g:2483:1: ( 'Activity' )
            {
            // InternalAndroidGenerator.g:2483:1: ( 'Activity' )
            // InternalAndroidGenerator.g:2484:2: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_0__2"
    // InternalAndroidGenerator.g:2493:1: rule__Activity__Group_0__2 : rule__Activity__Group_0__2__Impl ;
    public final void rule__Activity__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2497:1: ( rule__Activity__Group_0__2__Impl )
            // InternalAndroidGenerator.g:2498:2: rule__Activity__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0__2"


    // $ANTLR start "rule__Activity__Group_0__2__Impl"
    // InternalAndroidGenerator.g:2504:1: rule__Activity__Group_0__2__Impl : ( ( rule__Activity__Group_0_2__0 )? ) ;
    public final void rule__Activity__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2508:1: ( ( ( rule__Activity__Group_0_2__0 )? ) )
            // InternalAndroidGenerator.g:2509:1: ( ( rule__Activity__Group_0_2__0 )? )
            {
            // InternalAndroidGenerator.g:2509:1: ( ( rule__Activity__Group_0_2__0 )? )
            // InternalAndroidGenerator.g:2510:2: ( rule__Activity__Group_0_2__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_0_2()); 
            // InternalAndroidGenerator.g:2511:2: ( rule__Activity__Group_0_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAndroidGenerator.g:2511:3: rule__Activity__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_0_2__0"
    // InternalAndroidGenerator.g:2520:1: rule__Activity__Group_0_2__0 : rule__Activity__Group_0_2__0__Impl rule__Activity__Group_0_2__1 ;
    public final void rule__Activity__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2524:1: ( rule__Activity__Group_0_2__0__Impl rule__Activity__Group_0_2__1 )
            // InternalAndroidGenerator.g:2525:2: rule__Activity__Group_0_2__0__Impl rule__Activity__Group_0_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Activity__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__0"


    // $ANTLR start "rule__Activity__Group_0_2__0__Impl"
    // InternalAndroidGenerator.g:2532:1: rule__Activity__Group_0_2__0__Impl : ( ':' ) ;
    public final void rule__Activity__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2536:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:2537:1: ( ':' )
            {
            // InternalAndroidGenerator.g:2537:1: ( ':' )
            // InternalAndroidGenerator.g:2538:2: ':'
            {
             before(grammarAccess.getActivityAccess().getColonKeyword_0_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getColonKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_0_2__1"
    // InternalAndroidGenerator.g:2547:1: rule__Activity__Group_0_2__1 : rule__Activity__Group_0_2__1__Impl rule__Activity__Group_0_2__2 ;
    public final void rule__Activity__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2551:1: ( rule__Activity__Group_0_2__1__Impl rule__Activity__Group_0_2__2 )
            // InternalAndroidGenerator.g:2552:2: rule__Activity__Group_0_2__1__Impl rule__Activity__Group_0_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Activity__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__1"


    // $ANTLR start "rule__Activity__Group_0_2__1__Impl"
    // InternalAndroidGenerator.g:2559:1: rule__Activity__Group_0_2__1__Impl : ( ( rule__Activity__ActivityTypeAssignment_0_2_1 ) ) ;
    public final void rule__Activity__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2563:1: ( ( ( rule__Activity__ActivityTypeAssignment_0_2_1 ) ) )
            // InternalAndroidGenerator.g:2564:1: ( ( rule__Activity__ActivityTypeAssignment_0_2_1 ) )
            {
            // InternalAndroidGenerator.g:2564:1: ( ( rule__Activity__ActivityTypeAssignment_0_2_1 ) )
            // InternalAndroidGenerator.g:2565:2: ( rule__Activity__ActivityTypeAssignment_0_2_1 )
            {
             before(grammarAccess.getActivityAccess().getActivityTypeAssignment_0_2_1()); 
            // InternalAndroidGenerator.g:2566:2: ( rule__Activity__ActivityTypeAssignment_0_2_1 )
            // InternalAndroidGenerator.g:2566:3: rule__Activity__ActivityTypeAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__ActivityTypeAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getActivityTypeAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_0_2__2"
    // InternalAndroidGenerator.g:2574:1: rule__Activity__Group_0_2__2 : rule__Activity__Group_0_2__2__Impl rule__Activity__Group_0_2__3 ;
    public final void rule__Activity__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2578:1: ( rule__Activity__Group_0_2__2__Impl rule__Activity__Group_0_2__3 )
            // InternalAndroidGenerator.g:2579:2: rule__Activity__Group_0_2__2__Impl rule__Activity__Group_0_2__3
            {
            pushFollow(FOLLOW_22);
            rule__Activity__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__2"


    // $ANTLR start "rule__Activity__Group_0_2__2__Impl"
    // InternalAndroidGenerator.g:2586:1: rule__Activity__Group_0_2__2__Impl : ( ( rule__Activity__NameAssignment_0_2_2 ) ) ;
    public final void rule__Activity__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2590:1: ( ( ( rule__Activity__NameAssignment_0_2_2 ) ) )
            // InternalAndroidGenerator.g:2591:1: ( ( rule__Activity__NameAssignment_0_2_2 ) )
            {
            // InternalAndroidGenerator.g:2591:1: ( ( rule__Activity__NameAssignment_0_2_2 ) )
            // InternalAndroidGenerator.g:2592:2: ( rule__Activity__NameAssignment_0_2_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_0_2_2()); 
            // InternalAndroidGenerator.g:2593:2: ( rule__Activity__NameAssignment_0_2_2 )
            // InternalAndroidGenerator.g:2593:3: rule__Activity__NameAssignment_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity__NameAssignment_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__2__Impl"


    // $ANTLR start "rule__Activity__Group_0_2__3"
    // InternalAndroidGenerator.g:2601:1: rule__Activity__Group_0_2__3 : rule__Activity__Group_0_2__3__Impl rule__Activity__Group_0_2__4 ;
    public final void rule__Activity__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2605:1: ( rule__Activity__Group_0_2__3__Impl rule__Activity__Group_0_2__4 )
            // InternalAndroidGenerator.g:2606:2: rule__Activity__Group_0_2__3__Impl rule__Activity__Group_0_2__4
            {
            pushFollow(FOLLOW_20);
            rule__Activity__Group_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__3"


    // $ANTLR start "rule__Activity__Group_0_2__3__Impl"
    // InternalAndroidGenerator.g:2613:1: rule__Activity__Group_0_2__3__Impl : ( ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 ) ) ;
    public final void rule__Activity__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2617:1: ( ( ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 ) ) )
            // InternalAndroidGenerator.g:2618:1: ( ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 ) )
            {
            // InternalAndroidGenerator.g:2618:1: ( ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 ) )
            // InternalAndroidGenerator.g:2619:2: ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 )
            {
             before(grammarAccess.getActivityAccess().getActivityTypeAttributesAssignment_0_2_3()); 
            // InternalAndroidGenerator.g:2620:2: ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 )
            // InternalAndroidGenerator.g:2620:3: rule__Activity__ActivityTypeAttributesAssignment_0_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Activity__ActivityTypeAttributesAssignment_0_2_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getActivityTypeAttributesAssignment_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__3__Impl"


    // $ANTLR start "rule__Activity__Group_0_2__4"
    // InternalAndroidGenerator.g:2628:1: rule__Activity__Group_0_2__4 : rule__Activity__Group_0_2__4__Impl ;
    public final void rule__Activity__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2632:1: ( rule__Activity__Group_0_2__4__Impl )
            // InternalAndroidGenerator.g:2633:2: rule__Activity__Group_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__4"


    // $ANTLR start "rule__Activity__Group_0_2__4__Impl"
    // InternalAndroidGenerator.g:2639:1: rule__Activity__Group_0_2__4__Impl : ( ( rule__Activity__ActivityAttributesAssignment_0_2_4 )* ) ;
    public final void rule__Activity__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2643:1: ( ( ( rule__Activity__ActivityAttributesAssignment_0_2_4 )* ) )
            // InternalAndroidGenerator.g:2644:1: ( ( rule__Activity__ActivityAttributesAssignment_0_2_4 )* )
            {
            // InternalAndroidGenerator.g:2644:1: ( ( rule__Activity__ActivityAttributesAssignment_0_2_4 )* )
            // InternalAndroidGenerator.g:2645:2: ( rule__Activity__ActivityAttributesAssignment_0_2_4 )*
            {
             before(grammarAccess.getActivityAccess().getActivityAttributesAssignment_0_2_4()); 
            // InternalAndroidGenerator.g:2646:2: ( rule__Activity__ActivityAttributesAssignment_0_2_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=25 && LA19_0<=26)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2646:3: rule__Activity__ActivityAttributesAssignment_0_2_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Activity__ActivityAttributesAssignment_0_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getActivityAttributesAssignment_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_0_2__4__Impl"


    // $ANTLR start "rule__Activity__Group_1__0"
    // InternalAndroidGenerator.g:2655:1: rule__Activity__Group_1__0 : rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1 ;
    public final void rule__Activity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2659:1: ( rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1 )
            // InternalAndroidGenerator.g:2660:2: rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Activity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__0"


    // $ANTLR start "rule__Activity__Group_1__0__Impl"
    // InternalAndroidGenerator.g:2667:1: rule__Activity__Group_1__0__Impl : ( () ) ;
    public final void rule__Activity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2671:1: ( ( () ) )
            // InternalAndroidGenerator.g:2672:1: ( () )
            {
            // InternalAndroidGenerator.g:2672:1: ( () )
            // InternalAndroidGenerator.g:2673:2: ()
            {
             before(grammarAccess.getActivityAccess().getActivityAction_1_0()); 
            // InternalAndroidGenerator.g:2674:2: ()
            // InternalAndroidGenerator.g:2674:3: 
            {
            }

             after(grammarAccess.getActivityAccess().getActivityAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_1__1"
    // InternalAndroidGenerator.g:2682:1: rule__Activity__Group_1__1 : rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2 ;
    public final void rule__Activity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2686:1: ( rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2 )
            // InternalAndroidGenerator.g:2687:2: rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Activity__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__1"


    // $ANTLR start "rule__Activity__Group_1__1__Impl"
    // InternalAndroidGenerator.g:2694:1: rule__Activity__Group_1__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2698:1: ( ( 'Activity' ) )
            // InternalAndroidGenerator.g:2699:1: ( 'Activity' )
            {
            // InternalAndroidGenerator.g:2699:1: ( 'Activity' )
            // InternalAndroidGenerator.g:2700:2: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_1__2"
    // InternalAndroidGenerator.g:2709:1: rule__Activity__Group_1__2 : rule__Activity__Group_1__2__Impl rule__Activity__Group_1__3 ;
    public final void rule__Activity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2713:1: ( rule__Activity__Group_1__2__Impl rule__Activity__Group_1__3 )
            // InternalAndroidGenerator.g:2714:2: rule__Activity__Group_1__2__Impl rule__Activity__Group_1__3
            {
            pushFollow(FOLLOW_20);
            rule__Activity__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__2"


    // $ANTLR start "rule__Activity__Group_1__2__Impl"
    // InternalAndroidGenerator.g:2721:1: rule__Activity__Group_1__2__Impl : ( ( rule__Activity__NameAssignment_1_2 ) ) ;
    public final void rule__Activity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2725:1: ( ( ( rule__Activity__NameAssignment_1_2 ) ) )
            // InternalAndroidGenerator.g:2726:1: ( ( rule__Activity__NameAssignment_1_2 ) )
            {
            // InternalAndroidGenerator.g:2726:1: ( ( rule__Activity__NameAssignment_1_2 ) )
            // InternalAndroidGenerator.g:2727:2: ( rule__Activity__NameAssignment_1_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1_2()); 
            // InternalAndroidGenerator.g:2728:2: ( rule__Activity__NameAssignment_1_2 )
            // InternalAndroidGenerator.g:2728:3: rule__Activity__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_1__3"
    // InternalAndroidGenerator.g:2736:1: rule__Activity__Group_1__3 : rule__Activity__Group_1__3__Impl ;
    public final void rule__Activity__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2740:1: ( rule__Activity__Group_1__3__Impl )
            // InternalAndroidGenerator.g:2741:2: rule__Activity__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__3"


    // $ANTLR start "rule__Activity__Group_1__3__Impl"
    // InternalAndroidGenerator.g:2747:1: rule__Activity__Group_1__3__Impl : ( ( rule__Activity__ActivityAttributesAssignment_1_3 )* ) ;
    public final void rule__Activity__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2751:1: ( ( ( rule__Activity__ActivityAttributesAssignment_1_3 )* ) )
            // InternalAndroidGenerator.g:2752:1: ( ( rule__Activity__ActivityAttributesAssignment_1_3 )* )
            {
            // InternalAndroidGenerator.g:2752:1: ( ( rule__Activity__ActivityAttributesAssignment_1_3 )* )
            // InternalAndroidGenerator.g:2753:2: ( rule__Activity__ActivityAttributesAssignment_1_3 )*
            {
             before(grammarAccess.getActivityAccess().getActivityAttributesAssignment_1_3()); 
            // InternalAndroidGenerator.g:2754:2: ( rule__Activity__ActivityAttributesAssignment_1_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2754:3: rule__Activity__ActivityAttributesAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Activity__ActivityAttributesAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getActivityAttributesAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group_1__3__Impl"


    // $ANTLR start "rule__ActivityType__Group__0"
    // InternalAndroidGenerator.g:2763:1: rule__ActivityType__Group__0 : rule__ActivityType__Group__0__Impl rule__ActivityType__Group__1 ;
    public final void rule__ActivityType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2767:1: ( rule__ActivityType__Group__0__Impl rule__ActivityType__Group__1 )
            // InternalAndroidGenerator.g:2768:2: rule__ActivityType__Group__0__Impl rule__ActivityType__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ActivityType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group__0"


    // $ANTLR start "rule__ActivityType__Group__0__Impl"
    // InternalAndroidGenerator.g:2775:1: rule__ActivityType__Group__0__Impl : ( () ) ;
    public final void rule__ActivityType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2779:1: ( ( () ) )
            // InternalAndroidGenerator.g:2780:1: ( () )
            {
            // InternalAndroidGenerator.g:2780:1: ( () )
            // InternalAndroidGenerator.g:2781:2: ()
            {
             before(grammarAccess.getActivityTypeAccess().getTypeMapAction_0()); 
            // InternalAndroidGenerator.g:2782:2: ()
            // InternalAndroidGenerator.g:2782:3: 
            {
            }

             after(grammarAccess.getActivityTypeAccess().getTypeMapAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group__0__Impl"


    // $ANTLR start "rule__ActivityType__Group__1"
    // InternalAndroidGenerator.g:2790:1: rule__ActivityType__Group__1 : rule__ActivityType__Group__1__Impl ;
    public final void rule__ActivityType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2794:1: ( rule__ActivityType__Group__1__Impl )
            // InternalAndroidGenerator.g:2795:2: rule__ActivityType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group__1"


    // $ANTLR start "rule__ActivityType__Group__1__Impl"
    // InternalAndroidGenerator.g:2801:1: rule__ActivityType__Group__1__Impl : ( 'Maps' ) ;
    public final void rule__ActivityType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2805:1: ( ( 'Maps' ) )
            // InternalAndroidGenerator.g:2806:1: ( 'Maps' )
            {
            // InternalAndroidGenerator.g:2806:1: ( 'Maps' )
            // InternalAndroidGenerator.g:2807:2: 'Maps'
            {
             before(grammarAccess.getActivityTypeAccess().getMapsKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivityTypeAccess().getMapsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group__1__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__0"
    // InternalAndroidGenerator.g:2817:1: rule__ActivityLayoutAttributes__Group__0 : rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 ;
    public final void rule__ActivityLayoutAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2821:1: ( rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 )
            // InternalAndroidGenerator.g:2822:2: rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1
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
    // InternalAndroidGenerator.g:2829:1: rule__ActivityLayoutAttributes__Group__0__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2833:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) ) )
            // InternalAndroidGenerator.g:2834:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:2834:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) )
            // InternalAndroidGenerator.g:2835:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_0()); 
            // InternalAndroidGenerator.g:2836:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 )
            // InternalAndroidGenerator.g:2836:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_0
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
    // InternalAndroidGenerator.g:2844:1: rule__ActivityLayoutAttributes__Group__1 : rule__ActivityLayoutAttributes__Group__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2848:1: ( rule__ActivityLayoutAttributes__Group__1__Impl )
            // InternalAndroidGenerator.g:2849:2: rule__ActivityLayoutAttributes__Group__1__Impl
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
    // InternalAndroidGenerator.g:2855:1: rule__ActivityLayoutAttributes__Group__1__Impl : ( ( rule__ActivityLayoutAttributes__Group_1__0 )* ) ;
    public final void rule__ActivityLayoutAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2859:1: ( ( ( rule__ActivityLayoutAttributes__Group_1__0 )* ) )
            // InternalAndroidGenerator.g:2860:1: ( ( rule__ActivityLayoutAttributes__Group_1__0 )* )
            {
            // InternalAndroidGenerator.g:2860:1: ( ( rule__ActivityLayoutAttributes__Group_1__0 )* )
            // InternalAndroidGenerator.g:2861:2: ( rule__ActivityLayoutAttributes__Group_1__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:2862:2: ( rule__ActivityLayoutAttributes__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12) ) {
                    int LA21_2 = input.LA(2);

                    if ( ((LA21_2>=25 && LA21_2<=26)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2862:3: rule__ActivityLayoutAttributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ActivityLayoutAttributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalAndroidGenerator.g:2871:1: rule__ActivityLayoutAttributes__Group_1__0 : rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1 ;
    public final void rule__ActivityLayoutAttributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2875:1: ( rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1 )
            // InternalAndroidGenerator.g:2876:2: rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAndroidGenerator.g:2883:1: rule__ActivityLayoutAttributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ActivityLayoutAttributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2887:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:2888:1: ( ',' )
            {
            // InternalAndroidGenerator.g:2888:1: ( ',' )
            // InternalAndroidGenerator.g:2889:2: ','
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
    // InternalAndroidGenerator.g:2898:1: rule__ActivityLayoutAttributes__Group_1__1 : rule__ActivityLayoutAttributes__Group_1__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2902:1: ( rule__ActivityLayoutAttributes__Group_1__1__Impl )
            // InternalAndroidGenerator.g:2903:2: rule__ActivityLayoutAttributes__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:2909:1: rule__ActivityLayoutAttributes__Group_1__1__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2913:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:2914:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:2914:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) )
            // InternalAndroidGenerator.g:2915:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_1_1()); 
            // InternalAndroidGenerator.g:2916:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 )
            // InternalAndroidGenerator.g:2916:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1
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


    // $ANTLR start "rule__TextView__Group__0"
    // InternalAndroidGenerator.g:2925:1: rule__TextView__Group__0 : rule__TextView__Group__0__Impl rule__TextView__Group__1 ;
    public final void rule__TextView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2929:1: ( rule__TextView__Group__0__Impl rule__TextView__Group__1 )
            // InternalAndroidGenerator.g:2930:2: rule__TextView__Group__0__Impl rule__TextView__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAndroidGenerator.g:2937:1: rule__TextView__Group__0__Impl : ( () ) ;
    public final void rule__TextView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2941:1: ( ( () ) )
            // InternalAndroidGenerator.g:2942:1: ( () )
            {
            // InternalAndroidGenerator.g:2942:1: ( () )
            // InternalAndroidGenerator.g:2943:2: ()
            {
             before(grammarAccess.getTextViewAccess().getTextViewAction_0()); 
            // InternalAndroidGenerator.g:2944:2: ()
            // InternalAndroidGenerator.g:2944:3: 
            {
            }

             after(grammarAccess.getTextViewAccess().getTextViewAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__Group__0__Impl"


    // $ANTLR start "rule__TextView__Group__1"
    // InternalAndroidGenerator.g:2952:1: rule__TextView__Group__1 : rule__TextView__Group__1__Impl rule__TextView__Group__2 ;
    public final void rule__TextView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2956:1: ( rule__TextView__Group__1__Impl rule__TextView__Group__2 )
            // InternalAndroidGenerator.g:2957:2: rule__TextView__Group__1__Impl rule__TextView__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalAndroidGenerator.g:2964:1: rule__TextView__Group__1__Impl : ( 'TextView' ) ;
    public final void rule__TextView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2968:1: ( ( 'TextView' ) )
            // InternalAndroidGenerator.g:2969:1: ( 'TextView' )
            {
            // InternalAndroidGenerator.g:2969:1: ( 'TextView' )
            // InternalAndroidGenerator.g:2970:2: 'TextView'
            {
             before(grammarAccess.getTextViewAccess().getTextViewKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getTextViewKeyword_1()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:2979:1: rule__TextView__Group__2 : rule__TextView__Group__2__Impl ;
    public final void rule__TextView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2983:1: ( rule__TextView__Group__2__Impl )
            // InternalAndroidGenerator.g:2984:2: rule__TextView__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextView__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:2990:1: rule__TextView__Group__2__Impl : ( ( rule__TextView__NameAssignment_2 ) ) ;
    public final void rule__TextView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2994:1: ( ( ( rule__TextView__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2995:1: ( ( rule__TextView__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2995:1: ( ( rule__TextView__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2996:2: ( rule__TextView__NameAssignment_2 )
            {
             before(grammarAccess.getTextViewAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2997:2: ( rule__TextView__NameAssignment_2 )
            // InternalAndroidGenerator.g:2997:3: rule__TextView__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TextView__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextViewAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Button__Group__0"
    // InternalAndroidGenerator.g:3006:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3010:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalAndroidGenerator.g:3011:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAndroidGenerator.g:3018:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3022:1: ( ( () ) )
            // InternalAndroidGenerator.g:3023:1: ( () )
            {
            // InternalAndroidGenerator.g:3023:1: ( () )
            // InternalAndroidGenerator.g:3024:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalAndroidGenerator.g:3025:2: ()
            // InternalAndroidGenerator.g:3025:3: 
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
    // InternalAndroidGenerator.g:3033:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3037:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalAndroidGenerator.g:3038:2: rule__Button__Group__1__Impl rule__Button__Group__2
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
    // InternalAndroidGenerator.g:3045:1: rule__Button__Group__1__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3049:1: ( ( 'Button' ) )
            // InternalAndroidGenerator.g:3050:1: ( 'Button' )
            {
            // InternalAndroidGenerator.g:3050:1: ( 'Button' )
            // InternalAndroidGenerator.g:3051:2: 'Button'
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
    // InternalAndroidGenerator.g:3060:1: rule__Button__Group__2 : rule__Button__Group__2__Impl ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3064:1: ( rule__Button__Group__2__Impl )
            // InternalAndroidGenerator.g:3065:2: rule__Button__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:3071:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3075:1: ( ( ( rule__Button__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3076:1: ( ( rule__Button__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3076:1: ( ( rule__Button__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:3077:2: ( rule__Button__NameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:3078:2: ( rule__Button__NameAssignment_2 )
            // InternalAndroidGenerator.g:3078:3: rule__Button__NameAssignment_2
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


    // $ANTLR start "rule__FilterQuery__Group__0"
    // InternalAndroidGenerator.g:3087:1: rule__FilterQuery__Group__0 : rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 ;
    public final void rule__FilterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3091:1: ( rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 )
            // InternalAndroidGenerator.g:3092:2: rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1
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
    // InternalAndroidGenerator.g:3099:1: rule__FilterQuery__Group__0__Impl : ( () ) ;
    public final void rule__FilterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3103:1: ( ( () ) )
            // InternalAndroidGenerator.g:3104:1: ( () )
            {
            // InternalAndroidGenerator.g:3104:1: ( () )
            // InternalAndroidGenerator.g:3105:2: ()
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryAction_0()); 
            // InternalAndroidGenerator.g:3106:2: ()
            // InternalAndroidGenerator.g:3106:3: 
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
    // InternalAndroidGenerator.g:3114:1: rule__FilterQuery__Group__1 : rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 ;
    public final void rule__FilterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3118:1: ( rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 )
            // InternalAndroidGenerator.g:3119:2: rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2
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
    // InternalAndroidGenerator.g:3126:1: rule__FilterQuery__Group__1__Impl : ( 'FilterQuery' ) ;
    public final void rule__FilterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3130:1: ( ( 'FilterQuery' ) )
            // InternalAndroidGenerator.g:3131:1: ( 'FilterQuery' )
            {
            // InternalAndroidGenerator.g:3131:1: ( 'FilterQuery' )
            // InternalAndroidGenerator.g:3132:2: 'FilterQuery'
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3141:1: rule__FilterQuery__Group__2 : rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 ;
    public final void rule__FilterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3145:1: ( rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 )
            // InternalAndroidGenerator.g:3146:2: rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalAndroidGenerator.g:3153:1: rule__FilterQuery__Group__2__Impl : ( ( rule__FilterQuery__NameAssignment_2 ) ) ;
    public final void rule__FilterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3157:1: ( ( ( rule__FilterQuery__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3158:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3158:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:3159:2: ( rule__FilterQuery__NameAssignment_2 )
            {
             before(grammarAccess.getFilterQueryAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:3160:2: ( rule__FilterQuery__NameAssignment_2 )
            // InternalAndroidGenerator.g:3160:3: rule__FilterQuery__NameAssignment_2
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
    // InternalAndroidGenerator.g:3168:1: rule__FilterQuery__Group__3 : rule__FilterQuery__Group__3__Impl ;
    public final void rule__FilterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3172:1: ( rule__FilterQuery__Group__3__Impl )
            // InternalAndroidGenerator.g:3173:2: rule__FilterQuery__Group__3__Impl
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
    // InternalAndroidGenerator.g:3179:1: rule__FilterQuery__Group__3__Impl : ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) ;
    public final void rule__FilterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3183:1: ( ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) )
            // InternalAndroidGenerator.g:3184:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:3184:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            // InternalAndroidGenerator.g:3185:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            {
             before(grammarAccess.getFilterQueryAccess().getFilterAttributesAssignment_3()); 
            // InternalAndroidGenerator.g:3186:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            // InternalAndroidGenerator.g:3186:3: rule__FilterQuery__FilterAttributesAssignment_3
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
    // InternalAndroidGenerator.g:3195:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3199:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // InternalAndroidGenerator.g:3200:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
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
    // InternalAndroidGenerator.g:3207:1: rule__Distance__Group__0__Impl : ( 'Distance' ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3211:1: ( ( 'Distance' ) )
            // InternalAndroidGenerator.g:3212:1: ( 'Distance' )
            {
            // InternalAndroidGenerator.g:3212:1: ( 'Distance' )
            // InternalAndroidGenerator.g:3213:2: 'Distance'
            {
             before(grammarAccess.getDistanceAccess().getDistanceKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3222:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl rule__Distance__Group__2 ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3226:1: ( rule__Distance__Group__1__Impl rule__Distance__Group__2 )
            // InternalAndroidGenerator.g:3227:2: rule__Distance__Group__1__Impl rule__Distance__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalAndroidGenerator.g:3234:1: rule__Distance__Group__1__Impl : ( ':' ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3238:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:3239:1: ( ':' )
            {
            // InternalAndroidGenerator.g:3239:1: ( ':' )
            // InternalAndroidGenerator.g:3240:2: ':'
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
    // InternalAndroidGenerator.g:3249:1: rule__Distance__Group__2 : rule__Distance__Group__2__Impl rule__Distance__Group__3 ;
    public final void rule__Distance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3253:1: ( rule__Distance__Group__2__Impl rule__Distance__Group__3 )
            // InternalAndroidGenerator.g:3254:2: rule__Distance__Group__2__Impl rule__Distance__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalAndroidGenerator.g:3261:1: rule__Distance__Group__2__Impl : ( ( rule__Distance__UnitAssignment_2 ) ) ;
    public final void rule__Distance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3265:1: ( ( ( rule__Distance__UnitAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3266:1: ( ( rule__Distance__UnitAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3266:1: ( ( rule__Distance__UnitAssignment_2 ) )
            // InternalAndroidGenerator.g:3267:2: ( rule__Distance__UnitAssignment_2 )
            {
             before(grammarAccess.getDistanceAccess().getUnitAssignment_2()); 
            // InternalAndroidGenerator.g:3268:2: ( rule__Distance__UnitAssignment_2 )
            // InternalAndroidGenerator.g:3268:3: rule__Distance__UnitAssignment_2
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
    // InternalAndroidGenerator.g:3276:1: rule__Distance__Group__3 : rule__Distance__Group__3__Impl rule__Distance__Group__4 ;
    public final void rule__Distance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3280:1: ( rule__Distance__Group__3__Impl rule__Distance__Group__4 )
            // InternalAndroidGenerator.g:3281:2: rule__Distance__Group__3__Impl rule__Distance__Group__4
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
    // InternalAndroidGenerator.g:3288:1: rule__Distance__Group__3__Impl : ( ( rule__Distance__OperatorAssignment_3 ) ) ;
    public final void rule__Distance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3292:1: ( ( ( rule__Distance__OperatorAssignment_3 ) ) )
            // InternalAndroidGenerator.g:3293:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:3293:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            // InternalAndroidGenerator.g:3294:2: ( rule__Distance__OperatorAssignment_3 )
            {
             before(grammarAccess.getDistanceAccess().getOperatorAssignment_3()); 
            // InternalAndroidGenerator.g:3295:2: ( rule__Distance__OperatorAssignment_3 )
            // InternalAndroidGenerator.g:3295:3: rule__Distance__OperatorAssignment_3
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
    // InternalAndroidGenerator.g:3303:1: rule__Distance__Group__4 : rule__Distance__Group__4__Impl ;
    public final void rule__Distance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3307:1: ( rule__Distance__Group__4__Impl )
            // InternalAndroidGenerator.g:3308:2: rule__Distance__Group__4__Impl
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
    // InternalAndroidGenerator.g:3314:1: rule__Distance__Group__4__Impl : ( ( rule__Distance__ResultsAssignment_4 ) ) ;
    public final void rule__Distance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3318:1: ( ( ( rule__Distance__ResultsAssignment_4 ) ) )
            // InternalAndroidGenerator.g:3319:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            {
            // InternalAndroidGenerator.g:3319:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            // InternalAndroidGenerator.g:3320:2: ( rule__Distance__ResultsAssignment_4 )
            {
             before(grammarAccess.getDistanceAccess().getResultsAssignment_4()); 
            // InternalAndroidGenerator.g:3321:2: ( rule__Distance__ResultsAssignment_4 )
            // InternalAndroidGenerator.g:3321:3: rule__Distance__ResultsAssignment_4
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
    // InternalAndroidGenerator.g:3330:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
    public final void rule__Operator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3334:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
            // InternalAndroidGenerator.g:3335:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAndroidGenerator.g:3342:1: rule__Operator__Group_0__0__Impl : ( () ) ;
    public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3346:1: ( ( () ) )
            // InternalAndroidGenerator.g:3347:1: ( () )
            {
            // InternalAndroidGenerator.g:3347:1: ( () )
            // InternalAndroidGenerator.g:3348:2: ()
            {
             before(grammarAccess.getOperatorAccess().getLessAction_0_0()); 
            // InternalAndroidGenerator.g:3349:2: ()
            // InternalAndroidGenerator.g:3349:3: 
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
    // InternalAndroidGenerator.g:3357:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl ;
    public final void rule__Operator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3361:1: ( rule__Operator__Group_0__1__Impl )
            // InternalAndroidGenerator.g:3362:2: rule__Operator__Group_0__1__Impl
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
    // InternalAndroidGenerator.g:3368:1: rule__Operator__Group_0__1__Impl : ( '>' ) ;
    public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3372:1: ( ( '>' ) )
            // InternalAndroidGenerator.g:3373:1: ( '>' )
            {
            // InternalAndroidGenerator.g:3373:1: ( '>' )
            // InternalAndroidGenerator.g:3374:2: '>'
            {
             before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3384:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3388:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalAndroidGenerator.g:3389:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAndroidGenerator.g:3396:1: rule__Operator__Group_1__0__Impl : ( () ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3400:1: ( ( () ) )
            // InternalAndroidGenerator.g:3401:1: ( () )
            {
            // InternalAndroidGenerator.g:3401:1: ( () )
            // InternalAndroidGenerator.g:3402:2: ()
            {
             before(grammarAccess.getOperatorAccess().getMoreAction_1_0()); 
            // InternalAndroidGenerator.g:3403:2: ()
            // InternalAndroidGenerator.g:3403:3: 
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
    // InternalAndroidGenerator.g:3411:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3415:1: ( rule__Operator__Group_1__1__Impl )
            // InternalAndroidGenerator.g:3416:2: rule__Operator__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:3422:1: rule__Operator__Group_1__1__Impl : ( '<' ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3426:1: ( ( '<' ) )
            // InternalAndroidGenerator.g:3427:1: ( '<' )
            {
            // InternalAndroidGenerator.g:3427:1: ( '<' )
            // InternalAndroidGenerator.g:3428:2: '<'
            {
             before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3438:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3442:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalAndroidGenerator.g:3443:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAndroidGenerator.g:3450:1: rule__Operator__Group_2__0__Impl : ( () ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3454:1: ( ( () ) )
            // InternalAndroidGenerator.g:3455:1: ( () )
            {
            // InternalAndroidGenerator.g:3455:1: ( () )
            // InternalAndroidGenerator.g:3456:2: ()
            {
             before(grammarAccess.getOperatorAccess().getEqualAction_2_0()); 
            // InternalAndroidGenerator.g:3457:2: ()
            // InternalAndroidGenerator.g:3457:3: 
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
    // InternalAndroidGenerator.g:3465:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3469:1: ( rule__Operator__Group_2__1__Impl )
            // InternalAndroidGenerator.g:3470:2: rule__Operator__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:3476:1: rule__Operator__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3480:1: ( ( '=' ) )
            // InternalAndroidGenerator.g:3481:1: ( '=' )
            {
            // InternalAndroidGenerator.g:3481:1: ( '=' )
            // InternalAndroidGenerator.g:3482:2: '='
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3492:1: rule__Unit__Group_0__0 : rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 ;
    public final void rule__Unit__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3496:1: ( rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 )
            // InternalAndroidGenerator.g:3497:2: rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAndroidGenerator.g:3504:1: rule__Unit__Group_0__0__Impl : ( () ) ;
    public final void rule__Unit__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3508:1: ( ( () ) )
            // InternalAndroidGenerator.g:3509:1: ( () )
            {
            // InternalAndroidGenerator.g:3509:1: ( () )
            // InternalAndroidGenerator.g:3510:2: ()
            {
             before(grammarAccess.getUnitAccess().getMetersAction_0_0()); 
            // InternalAndroidGenerator.g:3511:2: ()
            // InternalAndroidGenerator.g:3511:3: 
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
    // InternalAndroidGenerator.g:3519:1: rule__Unit__Group_0__1 : rule__Unit__Group_0__1__Impl ;
    public final void rule__Unit__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3523:1: ( rule__Unit__Group_0__1__Impl )
            // InternalAndroidGenerator.g:3524:2: rule__Unit__Group_0__1__Impl
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
    // InternalAndroidGenerator.g:3530:1: rule__Unit__Group_0__1__Impl : ( 'm' ) ;
    public final void rule__Unit__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3534:1: ( ( 'm' ) )
            // InternalAndroidGenerator.g:3535:1: ( 'm' )
            {
            // InternalAndroidGenerator.g:3535:1: ( 'm' )
            // InternalAndroidGenerator.g:3536:2: 'm'
            {
             before(grammarAccess.getUnitAccess().getMKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3546:1: rule__Unit__Group_1__0 : rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 ;
    public final void rule__Unit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3550:1: ( rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 )
            // InternalAndroidGenerator.g:3551:2: rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAndroidGenerator.g:3558:1: rule__Unit__Group_1__0__Impl : ( () ) ;
    public final void rule__Unit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3562:1: ( ( () ) )
            // InternalAndroidGenerator.g:3563:1: ( () )
            {
            // InternalAndroidGenerator.g:3563:1: ( () )
            // InternalAndroidGenerator.g:3564:2: ()
            {
             before(grammarAccess.getUnitAccess().getImperialAction_1_0()); 
            // InternalAndroidGenerator.g:3565:2: ()
            // InternalAndroidGenerator.g:3565:3: 
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
    // InternalAndroidGenerator.g:3573:1: rule__Unit__Group_1__1 : rule__Unit__Group_1__1__Impl ;
    public final void rule__Unit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3577:1: ( rule__Unit__Group_1__1__Impl )
            // InternalAndroidGenerator.g:3578:2: rule__Unit__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:3584:1: rule__Unit__Group_1__1__Impl : ( 'f' ) ;
    public final void rule__Unit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3588:1: ( ( 'f' ) )
            // InternalAndroidGenerator.g:3589:1: ( 'f' )
            {
            // InternalAndroidGenerator.g:3589:1: ( 'f' )
            // InternalAndroidGenerator.g:3590:2: 'f'
            {
             before(grammarAccess.getUnitAccess().getFKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3600:1: rule__AndroidAppProject__ApplicationsAssignment_0 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3604:1: ( ( ruleApplication ) )
            // InternalAndroidGenerator.g:3605:2: ( ruleApplication )
            {
            // InternalAndroidGenerator.g:3605:2: ( ruleApplication )
            // InternalAndroidGenerator.g:3606:3: ruleApplication
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
    // InternalAndroidGenerator.g:3615:1: rule__AndroidAppProject__ApplicationsAssignment_1_1 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3619:1: ( ( ruleApplication ) )
            // InternalAndroidGenerator.g:3620:2: ( ruleApplication )
            {
            // InternalAndroidGenerator.g:3620:2: ( ruleApplication )
            // InternalAndroidGenerator.g:3621:3: ruleApplication
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
    // InternalAndroidGenerator.g:3630:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3634:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3635:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3635:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3636:3: RULE_ID
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
    // InternalAndroidGenerator.g:3645:1: rule__Application__AttributesAssignment_2 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3649:1: ( ( ruleApplicationAttribute ) )
            // InternalAndroidGenerator.g:3650:2: ( ruleApplicationAttribute )
            {
            // InternalAndroidGenerator.g:3650:2: ( ruleApplicationAttribute )
            // InternalAndroidGenerator.g:3651:3: ruleApplicationAttribute
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
    // InternalAndroidGenerator.g:3660:1: rule__ApplicationVersion__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__ApplicationVersion__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3664:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3665:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3665:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3666:3: ruleNumber
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
    // InternalAndroidGenerator.g:3675:1: rule__ApplicationVersion__TargetsdkAssignment_4 : ( ruleTargetSDK ) ;
    public final void rule__ApplicationVersion__TargetsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3679:1: ( ( ruleTargetSDK ) )
            // InternalAndroidGenerator.g:3680:2: ( ruleTargetSDK )
            {
            // InternalAndroidGenerator.g:3680:2: ( ruleTargetSDK )
            // InternalAndroidGenerator.g:3681:3: ruleTargetSDK
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
    // InternalAndroidGenerator.g:3690:1: rule__TargetSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__TargetSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3694:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3695:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3695:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3696:3: ruleNumber
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
    // InternalAndroidGenerator.g:3705:1: rule__TargetSDK__MinsdkAssignment_4 : ( ruleMinSDK ) ;
    public final void rule__TargetSDK__MinsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3709:1: ( ( ruleMinSDK ) )
            // InternalAndroidGenerator.g:3710:2: ( ruleMinSDK )
            {
            // InternalAndroidGenerator.g:3710:2: ( ruleMinSDK )
            // InternalAndroidGenerator.g:3711:3: ruleMinSDK
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
    // InternalAndroidGenerator.g:3720:1: rule__MinSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__MinSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3724:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3725:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3725:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3726:3: ruleNumber
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
    // InternalAndroidGenerator.g:3735:1: rule__ApplicationPermissionList__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3739:1: ( ( rulePermission ) )
            // InternalAndroidGenerator.g:3740:2: ( rulePermission )
            {
            // InternalAndroidGenerator.g:3740:2: ( rulePermission )
            // InternalAndroidGenerator.g:3741:3: rulePermission
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
    // InternalAndroidGenerator.g:3750:1: rule__ApplicationPermissionList__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3754:1: ( ( rulePermission ) )
            // InternalAndroidGenerator.g:3755:2: ( rulePermission )
            {
            // InternalAndroidGenerator.g:3755:2: ( rulePermission )
            // InternalAndroidGenerator.g:3756:3: rulePermission
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
    // InternalAndroidGenerator.g:3765:1: rule__Permission__NameAssignment : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Permission__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3769:1: ( ( RULE_PACKAGE_NAME ) )
            // InternalAndroidGenerator.g:3770:2: ( RULE_PACKAGE_NAME )
            {
            // InternalAndroidGenerator.g:3770:2: ( RULE_PACKAGE_NAME )
            // InternalAndroidGenerator.g:3771:3: RULE_PACKAGE_NAME
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
    // InternalAndroidGenerator.g:3780:1: rule__ApplicationElementList__ElementsAssignment_2 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3784:1: ( ( ruleApplicationElement ) )
            // InternalAndroidGenerator.g:3785:2: ( ruleApplicationElement )
            {
            // InternalAndroidGenerator.g:3785:2: ( ruleApplicationElement )
            // InternalAndroidGenerator.g:3786:3: ruleApplicationElement
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


    // $ANTLR start "rule__ApplicationMainActivity__LauncherActivityAssignment_1"
    // InternalAndroidGenerator.g:3795:1: rule__ApplicationMainActivity__LauncherActivityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationMainActivity__LauncherActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3799:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGenerator.g:3800:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGenerator.g:3800:2: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3801:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0()); 
            // InternalAndroidGenerator.g:3802:3: ( RULE_ID )
            // InternalAndroidGenerator.g:3803:4: RULE_ID
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationMainActivity__LauncherActivityAssignment_1"


    // $ANTLR start "rule__Model__ActivityTypeAssignment_2_1"
    // InternalAndroidGenerator.g:3814:1: rule__Model__ActivityTypeAssignment_2_1 : ( ruleActivityType ) ;
    public final void rule__Model__ActivityTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3818:1: ( ( ruleActivityType ) )
            // InternalAndroidGenerator.g:3819:2: ( ruleActivityType )
            {
            // InternalAndroidGenerator.g:3819:2: ( ruleActivityType )
            // InternalAndroidGenerator.g:3820:3: ruleActivityType
            {
             before(grammarAccess.getModelAccess().getActivityTypeActivityTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActivityTypeActivityTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ActivityTypeAssignment_2_1"


    // $ANTLR start "rule__Model__NameAssignment_3"
    // InternalAndroidGenerator.g:3829:1: rule__Model__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3833:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3834:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3834:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3835:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_3"


    // $ANTLR start "rule__Model__ModellistAssignment_4"
    // InternalAndroidGenerator.g:3844:1: rule__Model__ModellistAssignment_4 : ( ruleModelList ) ;
    public final void rule__Model__ModellistAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3848:1: ( ( ruleModelList ) )
            // InternalAndroidGenerator.g:3849:2: ( ruleModelList )
            {
            // InternalAndroidGenerator.g:3849:2: ( ruleModelList )
            // InternalAndroidGenerator.g:3850:3: ruleModelList
            {
             before(grammarAccess.getModelAccess().getModellistModelListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleModelList();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModellistModelListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModellistAssignment_4"


    // $ANTLR start "rule__ModelList__TypeAssignment_0"
    // InternalAndroidGenerator.g:3859:1: rule__ModelList__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__ModelList__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3863:1: ( ( ruleType ) )
            // InternalAndroidGenerator.g:3864:2: ( ruleType )
            {
            // InternalAndroidGenerator.g:3864:2: ( ruleType )
            // InternalAndroidGenerator.g:3865:3: ruleType
            {
             before(grammarAccess.getModelListAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelListAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__TypeAssignment_0"


    // $ANTLR start "rule__ModelList__GetsetAssignment_2"
    // InternalAndroidGenerator.g:3874:1: rule__ModelList__GetsetAssignment_2 : ( ruleGetSet ) ;
    public final void rule__ModelList__GetsetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3878:1: ( ( ruleGetSet ) )
            // InternalAndroidGenerator.g:3879:2: ( ruleGetSet )
            {
            // InternalAndroidGenerator.g:3879:2: ( ruleGetSet )
            // InternalAndroidGenerator.g:3880:3: ruleGetSet
            {
             before(grammarAccess.getModelListAccess().getGetsetGetSetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGetSet();

            state._fsp--;

             after(grammarAccess.getModelListAccess().getGetsetGetSetParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__GetsetAssignment_2"


    // $ANTLR start "rule__ModelList__TypeAssignment_3_1"
    // InternalAndroidGenerator.g:3889:1: rule__ModelList__TypeAssignment_3_1 : ( ruleType ) ;
    public final void rule__ModelList__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3893:1: ( ( ruleType ) )
            // InternalAndroidGenerator.g:3894:2: ( ruleType )
            {
            // InternalAndroidGenerator.g:3894:2: ( ruleType )
            // InternalAndroidGenerator.g:3895:3: ruleType
            {
             before(grammarAccess.getModelListAccess().getTypeTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelListAccess().getTypeTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__TypeAssignment_3_1"


    // $ANTLR start "rule__ModelList__GetsetAssignment_3_3"
    // InternalAndroidGenerator.g:3904:1: rule__ModelList__GetsetAssignment_3_3 : ( ruleGetSet ) ;
    public final void rule__ModelList__GetsetAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3908:1: ( ( ruleGetSet ) )
            // InternalAndroidGenerator.g:3909:2: ( ruleGetSet )
            {
            // InternalAndroidGenerator.g:3909:2: ( ruleGetSet )
            // InternalAndroidGenerator.g:3910:3: ruleGetSet
            {
             before(grammarAccess.getModelListAccess().getGetsetGetSetParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGetSet();

            state._fsp--;

             after(grammarAccess.getModelListAccess().getGetsetGetSetParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelList__GetsetAssignment_3_3"


    // $ANTLR start "rule__GetSet__NameAssignment_1"
    // InternalAndroidGenerator.g:3919:1: rule__GetSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GetSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3923:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3924:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3924:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3925:3: RULE_ID
            {
             before(grammarAccess.getGetSetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetSetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetSet__NameAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalAndroidGenerator.g:3934:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3938:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3939:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3939:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3940:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Fragment__ActivityTypeAssignment_1_1"
    // InternalAndroidGenerator.g:3949:1: rule__Fragment__ActivityTypeAssignment_1_1 : ( ruleActivityType ) ;
    public final void rule__Fragment__ActivityTypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3953:1: ( ( ruleActivityType ) )
            // InternalAndroidGenerator.g:3954:2: ( ruleActivityType )
            {
            // InternalAndroidGenerator.g:3954:2: ( ruleActivityType )
            // InternalAndroidGenerator.g:3955:3: ruleActivityType
            {
             before(grammarAccess.getFragmentAccess().getActivityTypeActivityTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityType();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getActivityTypeActivityTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__ActivityTypeAssignment_1_1"


    // $ANTLR start "rule__Fragment__NameAssignment_2"
    // InternalAndroidGenerator.g:3964:1: rule__Fragment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3968:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3969:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3969:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3970:3: RULE_ID
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
    // InternalAndroidGenerator.g:3979:1: rule__Fragment__ActivityAttributesAssignment_3 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Fragment__ActivityAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3983:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGenerator.g:3984:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGenerator.g:3984:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGenerator.g:3985:3: ruleActivityLayoutAttributes
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


    // $ANTLR start "rule__Activity__ActivityTypeAssignment_0_2_1"
    // InternalAndroidGenerator.g:3994:1: rule__Activity__ActivityTypeAssignment_0_2_1 : ( ruleActivityType ) ;
    public final void rule__Activity__ActivityTypeAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3998:1: ( ( ruleActivityType ) )
            // InternalAndroidGenerator.g:3999:2: ( ruleActivityType )
            {
            // InternalAndroidGenerator.g:3999:2: ( ruleActivityType )
            // InternalAndroidGenerator.g:4000:3: ruleActivityType
            {
             before(grammarAccess.getActivityAccess().getActivityTypeActivityTypeParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityType();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getActivityTypeActivityTypeParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ActivityTypeAssignment_0_2_1"


    // $ANTLR start "rule__Activity__NameAssignment_0_2_2"
    // InternalAndroidGenerator.g:4009:1: rule__Activity__NameAssignment_0_2_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4013:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4014:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4014:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4015:3: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_0_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_0_2_2"


    // $ANTLR start "rule__Activity__ActivityTypeAttributesAssignment_0_2_3"
    // InternalAndroidGenerator.g:4024:1: rule__Activity__ActivityTypeAttributesAssignment_0_2_3 : ( ruleActivityTypeAttributes ) ;
    public final void rule__Activity__ActivityTypeAttributesAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4028:1: ( ( ruleActivityTypeAttributes ) )
            // InternalAndroidGenerator.g:4029:2: ( ruleActivityTypeAttributes )
            {
            // InternalAndroidGenerator.g:4029:2: ( ruleActivityTypeAttributes )
            // InternalAndroidGenerator.g:4030:3: ruleActivityTypeAttributes
            {
             before(grammarAccess.getActivityAccess().getActivityTypeAttributesActivityTypeAttributesParserRuleCall_0_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityTypeAttributes();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getActivityTypeAttributesActivityTypeAttributesParserRuleCall_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ActivityTypeAttributesAssignment_0_2_3"


    // $ANTLR start "rule__Activity__ActivityAttributesAssignment_0_2_4"
    // InternalAndroidGenerator.g:4039:1: rule__Activity__ActivityAttributesAssignment_0_2_4 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Activity__ActivityAttributesAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4043:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGenerator.g:4044:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGenerator.g:4044:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGenerator.g:4045:3: ruleActivityLayoutAttributes
            {
             before(grammarAccess.getActivityAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_0_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityLayoutAttributes();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_0_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ActivityAttributesAssignment_0_2_4"


    // $ANTLR start "rule__Activity__NameAssignment_1_2"
    // InternalAndroidGenerator.g:4054:1: rule__Activity__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4058:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4059:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4059:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4060:3: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1_2"


    // $ANTLR start "rule__Activity__ActivityAttributesAssignment_1_3"
    // InternalAndroidGenerator.g:4069:1: rule__Activity__ActivityAttributesAssignment_1_3 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Activity__ActivityAttributesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4073:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGenerator.g:4074:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGenerator.g:4074:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGenerator.g:4075:3: ruleActivityLayoutAttributes
            {
             before(grammarAccess.getActivityAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityLayoutAttributes();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ActivityAttributesAssignment_1_3"


    // $ANTLR start "rule__ActivityTypeAttributes__FilterAssignment"
    // InternalAndroidGenerator.g:4084:1: rule__ActivityTypeAttributes__FilterAssignment : ( ruleFilterQuery ) ;
    public final void rule__ActivityTypeAttributes__FilterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4088:1: ( ( ruleFilterQuery ) )
            // InternalAndroidGenerator.g:4089:2: ( ruleFilterQuery )
            {
            // InternalAndroidGenerator.g:4089:2: ( ruleFilterQuery )
            // InternalAndroidGenerator.g:4090:3: ruleFilterQuery
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


    // $ANTLR start "rule__ActivityLayoutAttributes__LayoutElementsAssignment_0"
    // InternalAndroidGenerator.g:4099:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4103:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGenerator.g:4104:2: ( ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:4104:2: ( ruleLayoutElement )
            // InternalAndroidGenerator.g:4105:3: ruleLayoutElement
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
    // InternalAndroidGenerator.g:4114:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4118:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGenerator.g:4119:2: ( ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:4119:2: ( ruleLayoutElement )
            // InternalAndroidGenerator.g:4120:3: ruleLayoutElement
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


    // $ANTLR start "rule__TextView__NameAssignment_2"
    // InternalAndroidGenerator.g:4129:1: rule__TextView__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TextView__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4133:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4134:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4134:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4135:3: RULE_ID
            {
             before(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextView__NameAssignment_2"


    // $ANTLR start "rule__Button__NameAssignment_2"
    // InternalAndroidGenerator.g:4144:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4148:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4149:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4149:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4150:3: RULE_ID
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


    // $ANTLR start "rule__FilterQuery__NameAssignment_2"
    // InternalAndroidGenerator.g:4159:1: rule__FilterQuery__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FilterQuery__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4163:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4164:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4164:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4165:3: RULE_ID
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
    // InternalAndroidGenerator.g:4174:1: rule__FilterQuery__FilterAttributesAssignment_3 : ( ruleFilterAttributes ) ;
    public final void rule__FilterQuery__FilterAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4178:1: ( ( ruleFilterAttributes ) )
            // InternalAndroidGenerator.g:4179:2: ( ruleFilterAttributes )
            {
            // InternalAndroidGenerator.g:4179:2: ( ruleFilterAttributes )
            // InternalAndroidGenerator.g:4180:3: ruleFilterAttributes
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
    // InternalAndroidGenerator.g:4189:1: rule__FilterAttributes__DistanceAssignment : ( ruleDistance ) ;
    public final void rule__FilterAttributes__DistanceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4193:1: ( ( ruleDistance ) )
            // InternalAndroidGenerator.g:4194:2: ( ruleDistance )
            {
            // InternalAndroidGenerator.g:4194:2: ( ruleDistance )
            // InternalAndroidGenerator.g:4195:3: ruleDistance
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
    // InternalAndroidGenerator.g:4204:1: rule__Distance__UnitAssignment_2 : ( ruleUnit ) ;
    public final void rule__Distance__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4208:1: ( ( ruleUnit ) )
            // InternalAndroidGenerator.g:4209:2: ( ruleUnit )
            {
            // InternalAndroidGenerator.g:4209:2: ( ruleUnit )
            // InternalAndroidGenerator.g:4210:3: ruleUnit
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
    // InternalAndroidGenerator.g:4219:1: rule__Distance__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__Distance__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4223:1: ( ( ruleOperator ) )
            // InternalAndroidGenerator.g:4224:2: ( ruleOperator )
            {
            // InternalAndroidGenerator.g:4224:2: ( ruleOperator )
            // InternalAndroidGenerator.g:4225:3: ruleOperator
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
    // InternalAndroidGenerator.g:4234:1: rule__Distance__ResultsAssignment_4 : ( ruleNumber ) ;
    public final void rule__Distance__ResultsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4238:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:4239:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:4239:2: ( ruleNumber )
            // InternalAndroidGenerator.g:4240:3: ruleNumber
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
    // InternalAndroidGenerator.g:4249:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4253:1: ( ( RULE_INT ) )
            // InternalAndroidGenerator.g:4254:2: ( RULE_INT )
            {
            // InternalAndroidGenerator.g:4254:2: ( RULE_INT )
            // InternalAndroidGenerator.g:4255:3: RULE_INT
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C4002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});

}