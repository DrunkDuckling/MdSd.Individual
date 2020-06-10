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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PACKAGE_NAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'Application'", "'Android-SDK'", "':'", "'Target-SDK'", "'Minimum-SDK'", "'permissions'", "'elements'", "'main-activity'", "'Model'", "'Fragment'", "'Activity'", "'Maps'", "'Settings'", "'TextView'", "'Button'", "'FilterQuery'", "'Distance'", "'>'", "'<'", "'='", "'m'", "'f'"
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
    public static final int T__34=34;
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
    // InternalAndroidGenerator.g:512:1: ruleActivityType : ( ( rule__ActivityType__Alternatives ) ) ;
    public final void ruleActivityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:516:2: ( ( ( rule__ActivityType__Alternatives ) ) )
            // InternalAndroidGenerator.g:517:2: ( ( rule__ActivityType__Alternatives ) )
            {
            // InternalAndroidGenerator.g:517:2: ( ( rule__ActivityType__Alternatives ) )
            // InternalAndroidGenerator.g:518:3: ( rule__ActivityType__Alternatives )
            {
             before(grammarAccess.getActivityTypeAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:519:3: ( rule__ActivityType__Alternatives )
            // InternalAndroidGenerator.g:519:4: rule__ActivityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActivityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityTypeAccess().getAlternatives()); 

            }


            }

        }
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

                if ( (LA3_1==EOF||LA3_1==12||(LA3_1>=14 && LA3_1<=15)||(LA3_1>=18 && LA3_1<=23)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
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


    // $ANTLR start "rule__ActivityType__Alternatives"
    // InternalAndroidGenerator.g:858:1: rule__ActivityType__Alternatives : ( ( ( rule__ActivityType__Group_0__0 ) ) | ( ( rule__ActivityType__Group_1__0 ) ) );
    public final void rule__ActivityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:862:1: ( ( ( rule__ActivityType__Group_0__0 ) ) | ( ( rule__ActivityType__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
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
                    // InternalAndroidGenerator.g:863:2: ( ( rule__ActivityType__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:863:2: ( ( rule__ActivityType__Group_0__0 ) )
                    // InternalAndroidGenerator.g:864:3: ( rule__ActivityType__Group_0__0 )
                    {
                     before(grammarAccess.getActivityTypeAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:865:3: ( rule__ActivityType__Group_0__0 )
                    // InternalAndroidGenerator.g:865:4: rule__ActivityType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:869:2: ( ( rule__ActivityType__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:869:2: ( ( rule__ActivityType__Group_1__0 ) )
                    // InternalAndroidGenerator.g:870:3: ( rule__ActivityType__Group_1__0 )
                    {
                     before(grammarAccess.getActivityTypeAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:871:3: ( rule__ActivityType__Group_1__0 )
                    // InternalAndroidGenerator.g:871:4: rule__ActivityType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ActivityType__Alternatives"


    // $ANTLR start "rule__LayoutElement__Alternatives"
    // InternalAndroidGenerator.g:879:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleTextView ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:883:1: ( ( ruleButton ) | ( ruleTextView ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAndroidGenerator.g:884:2: ( ruleButton )
                    {
                    // InternalAndroidGenerator.g:884:2: ( ruleButton )
                    // InternalAndroidGenerator.g:885:3: ruleButton
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
                    // InternalAndroidGenerator.g:890:2: ( ruleTextView )
                    {
                    // InternalAndroidGenerator.g:890:2: ( ruleTextView )
                    // InternalAndroidGenerator.g:891:3: ruleTextView
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
    // InternalAndroidGenerator.g:900:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:904:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 32:
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
                    // InternalAndroidGenerator.g:905:2: ( ( rule__Operator__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:905:2: ( ( rule__Operator__Group_0__0 ) )
                    // InternalAndroidGenerator.g:906:3: ( rule__Operator__Group_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:907:3: ( rule__Operator__Group_0__0 )
                    // InternalAndroidGenerator.g:907:4: rule__Operator__Group_0__0
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
                    // InternalAndroidGenerator.g:911:2: ( ( rule__Operator__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:911:2: ( ( rule__Operator__Group_1__0 ) )
                    // InternalAndroidGenerator.g:912:3: ( rule__Operator__Group_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:913:3: ( rule__Operator__Group_1__0 )
                    // InternalAndroidGenerator.g:913:4: rule__Operator__Group_1__0
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
                    // InternalAndroidGenerator.g:917:2: ( ( rule__Operator__Group_2__0 ) )
                    {
                    // InternalAndroidGenerator.g:917:2: ( ( rule__Operator__Group_2__0 ) )
                    // InternalAndroidGenerator.g:918:3: ( rule__Operator__Group_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_2()); 
                    // InternalAndroidGenerator.g:919:3: ( rule__Operator__Group_2__0 )
                    // InternalAndroidGenerator.g:919:4: rule__Operator__Group_2__0
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
    // InternalAndroidGenerator.g:927:1: rule__Unit__Alternatives : ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:931:1: ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAndroidGenerator.g:932:2: ( ( rule__Unit__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:932:2: ( ( rule__Unit__Group_0__0 ) )
                    // InternalAndroidGenerator.g:933:3: ( rule__Unit__Group_0__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:934:3: ( rule__Unit__Group_0__0 )
                    // InternalAndroidGenerator.g:934:4: rule__Unit__Group_0__0
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
                    // InternalAndroidGenerator.g:938:2: ( ( rule__Unit__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:938:2: ( ( rule__Unit__Group_1__0 ) )
                    // InternalAndroidGenerator.g:939:3: ( rule__Unit__Group_1__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:940:3: ( rule__Unit__Group_1__0 )
                    // InternalAndroidGenerator.g:940:4: rule__Unit__Group_1__0
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
    // InternalAndroidGenerator.g:948:1: rule__AndroidAppProject__Group__0 : rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 ;
    public final void rule__AndroidAppProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:952:1: ( rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 )
            // InternalAndroidGenerator.g:953:2: rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1
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
    // InternalAndroidGenerator.g:960:1: rule__AndroidAppProject__Group__0__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) ;
    public final void rule__AndroidAppProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:964:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) )
            // InternalAndroidGenerator.g:965:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:965:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            // InternalAndroidGenerator.g:966:2: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 
            // InternalAndroidGenerator.g:967:2: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            // InternalAndroidGenerator.g:967:3: rule__AndroidAppProject__ApplicationsAssignment_0
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
    // InternalAndroidGenerator.g:975:1: rule__AndroidAppProject__Group__1 : rule__AndroidAppProject__Group__1__Impl ;
    public final void rule__AndroidAppProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:979:1: ( rule__AndroidAppProject__Group__1__Impl )
            // InternalAndroidGenerator.g:980:2: rule__AndroidAppProject__Group__1__Impl
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
    // InternalAndroidGenerator.g:986:1: rule__AndroidAppProject__Group__1__Impl : ( ( rule__AndroidAppProject__Group_1__0 )* ) ;
    public final void rule__AndroidAppProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:990:1: ( ( ( rule__AndroidAppProject__Group_1__0 )* ) )
            // InternalAndroidGenerator.g:991:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            {
            // InternalAndroidGenerator.g:991:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            // InternalAndroidGenerator.g:992:2: ( rule__AndroidAppProject__Group_1__0 )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:993:2: ( rule__AndroidAppProject__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAndroidGenerator.g:993:3: rule__AndroidAppProject__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__AndroidAppProject__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAndroidGenerator.g:1002:1: rule__AndroidAppProject__Group_1__0 : rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 ;
    public final void rule__AndroidAppProject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1006:1: ( rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 )
            // InternalAndroidGenerator.g:1007:2: rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1
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
    // InternalAndroidGenerator.g:1014:1: rule__AndroidAppProject__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AndroidAppProject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1018:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:1019:1: ( ',' )
            {
            // InternalAndroidGenerator.g:1019:1: ( ',' )
            // InternalAndroidGenerator.g:1020:2: ','
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
    // InternalAndroidGenerator.g:1029:1: rule__AndroidAppProject__Group_1__1 : rule__AndroidAppProject__Group_1__1__Impl ;
    public final void rule__AndroidAppProject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1033:1: ( rule__AndroidAppProject__Group_1__1__Impl )
            // InternalAndroidGenerator.g:1034:2: rule__AndroidAppProject__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:1040:1: rule__AndroidAppProject__Group_1__1__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) ;
    public final void rule__AndroidAppProject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1044:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:1045:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:1045:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            // InternalAndroidGenerator.g:1046:2: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 
            // InternalAndroidGenerator.g:1047:2: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            // InternalAndroidGenerator.g:1047:3: rule__AndroidAppProject__ApplicationsAssignment_1_1
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
    // InternalAndroidGenerator.g:1056:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1060:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalAndroidGenerator.g:1061:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalAndroidGenerator.g:1068:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1072:1: ( ( 'Application' ) )
            // InternalAndroidGenerator.g:1073:1: ( 'Application' )
            {
            // InternalAndroidGenerator.g:1073:1: ( 'Application' )
            // InternalAndroidGenerator.g:1074:2: 'Application'
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
    // InternalAndroidGenerator.g:1083:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1087:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalAndroidGenerator.g:1088:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalAndroidGenerator.g:1095:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1099:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1100:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1100:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:1101:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:1102:2: ( rule__Application__NameAssignment_1 )
            // InternalAndroidGenerator.g:1102:3: rule__Application__NameAssignment_1
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
    // InternalAndroidGenerator.g:1110:1: rule__Application__Group__2 : rule__Application__Group__2__Impl ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1114:1: ( rule__Application__Group__2__Impl )
            // InternalAndroidGenerator.g:1115:2: rule__Application__Group__2__Impl
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
    // InternalAndroidGenerator.g:1121:1: rule__Application__Group__2__Impl : ( ( rule__Application__AttributesAssignment_2 )* ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1125:1: ( ( ( rule__Application__AttributesAssignment_2 )* ) )
            // InternalAndroidGenerator.g:1126:1: ( ( rule__Application__AttributesAssignment_2 )* )
            {
            // InternalAndroidGenerator.g:1126:1: ( ( rule__Application__AttributesAssignment_2 )* )
            // InternalAndroidGenerator.g:1127:2: ( rule__Application__AttributesAssignment_2 )*
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_2()); 
            // InternalAndroidGenerator.g:1128:2: ( rule__Application__AttributesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14||(LA9_0>=18 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1128:3: rule__Application__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalAndroidGenerator.g:1137:1: rule__ApplicationVersion__Group__0 : rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 ;
    public final void rule__ApplicationVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1141:1: ( rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 )
            // InternalAndroidGenerator.g:1142:2: rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1
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
    // InternalAndroidGenerator.g:1149:1: rule__ApplicationVersion__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1153:1: ( ( () ) )
            // InternalAndroidGenerator.g:1154:1: ( () )
            {
            // InternalAndroidGenerator.g:1154:1: ( () )
            // InternalAndroidGenerator.g:1155:2: ()
            {
             before(grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0()); 
            // InternalAndroidGenerator.g:1156:2: ()
            // InternalAndroidGenerator.g:1156:3: 
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
    // InternalAndroidGenerator.g:1164:1: rule__ApplicationVersion__Group__1 : rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 ;
    public final void rule__ApplicationVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1168:1: ( rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 )
            // InternalAndroidGenerator.g:1169:2: rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2
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
    // InternalAndroidGenerator.g:1176:1: rule__ApplicationVersion__Group__1__Impl : ( 'Android-SDK' ) ;
    public final void rule__ApplicationVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1180:1: ( ( 'Android-SDK' ) )
            // InternalAndroidGenerator.g:1181:1: ( 'Android-SDK' )
            {
            // InternalAndroidGenerator.g:1181:1: ( 'Android-SDK' )
            // InternalAndroidGenerator.g:1182:2: 'Android-SDK'
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
    // InternalAndroidGenerator.g:1191:1: rule__ApplicationVersion__Group__2 : rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 ;
    public final void rule__ApplicationVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1195:1: ( rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 )
            // InternalAndroidGenerator.g:1196:2: rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3
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
    // InternalAndroidGenerator.g:1203:1: rule__ApplicationVersion__Group__2__Impl : ( ':' ) ;
    public final void rule__ApplicationVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1207:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1208:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1208:1: ( ':' )
            // InternalAndroidGenerator.g:1209:2: ':'
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
    // InternalAndroidGenerator.g:1218:1: rule__ApplicationVersion__Group__3 : rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 ;
    public final void rule__ApplicationVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1222:1: ( rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 )
            // InternalAndroidGenerator.g:1223:2: rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4
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
    // InternalAndroidGenerator.g:1230:1: rule__ApplicationVersion__Group__3__Impl : ( ( rule__ApplicationVersion__ResultAssignment_3 ) ) ;
    public final void rule__ApplicationVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1234:1: ( ( ( rule__ApplicationVersion__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1235:1: ( ( rule__ApplicationVersion__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1235:1: ( ( rule__ApplicationVersion__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1236:2: ( rule__ApplicationVersion__ResultAssignment_3 )
            {
             before(grammarAccess.getApplicationVersionAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1237:2: ( rule__ApplicationVersion__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1237:3: rule__ApplicationVersion__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1245:1: rule__ApplicationVersion__Group__4 : rule__ApplicationVersion__Group__4__Impl ;
    public final void rule__ApplicationVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1249:1: ( rule__ApplicationVersion__Group__4__Impl )
            // InternalAndroidGenerator.g:1250:2: rule__ApplicationVersion__Group__4__Impl
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
    // InternalAndroidGenerator.g:1256:1: rule__ApplicationVersion__Group__4__Impl : ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? ) ;
    public final void rule__ApplicationVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1260:1: ( ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1261:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1261:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? )
            // InternalAndroidGenerator.g:1262:2: ( rule__ApplicationVersion__TargetsdkAssignment_4 )?
            {
             before(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_4()); 
            // InternalAndroidGenerator.g:1263:2: ( rule__ApplicationVersion__TargetsdkAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAndroidGenerator.g:1263:3: rule__ApplicationVersion__TargetsdkAssignment_4
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
    // InternalAndroidGenerator.g:1272:1: rule__TargetSDK__Group__0 : rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 ;
    public final void rule__TargetSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1276:1: ( rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 )
            // InternalAndroidGenerator.g:1277:2: rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1
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
    // InternalAndroidGenerator.g:1284:1: rule__TargetSDK__Group__0__Impl : ( () ) ;
    public final void rule__TargetSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1288:1: ( ( () ) )
            // InternalAndroidGenerator.g:1289:1: ( () )
            {
            // InternalAndroidGenerator.g:1289:1: ( () )
            // InternalAndroidGenerator.g:1290:2: ()
            {
             before(grammarAccess.getTargetSDKAccess().getTargetSDKAction_0()); 
            // InternalAndroidGenerator.g:1291:2: ()
            // InternalAndroidGenerator.g:1291:3: 
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
    // InternalAndroidGenerator.g:1299:1: rule__TargetSDK__Group__1 : rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 ;
    public final void rule__TargetSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1303:1: ( rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 )
            // InternalAndroidGenerator.g:1304:2: rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2
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
    // InternalAndroidGenerator.g:1311:1: rule__TargetSDK__Group__1__Impl : ( 'Target-SDK' ) ;
    public final void rule__TargetSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1315:1: ( ( 'Target-SDK' ) )
            // InternalAndroidGenerator.g:1316:1: ( 'Target-SDK' )
            {
            // InternalAndroidGenerator.g:1316:1: ( 'Target-SDK' )
            // InternalAndroidGenerator.g:1317:2: 'Target-SDK'
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
    // InternalAndroidGenerator.g:1326:1: rule__TargetSDK__Group__2 : rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 ;
    public final void rule__TargetSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1330:1: ( rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 )
            // InternalAndroidGenerator.g:1331:2: rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3
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
    // InternalAndroidGenerator.g:1338:1: rule__TargetSDK__Group__2__Impl : ( ':' ) ;
    public final void rule__TargetSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1342:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1343:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1343:1: ( ':' )
            // InternalAndroidGenerator.g:1344:2: ':'
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
    // InternalAndroidGenerator.g:1353:1: rule__TargetSDK__Group__3 : rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 ;
    public final void rule__TargetSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1357:1: ( rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 )
            // InternalAndroidGenerator.g:1358:2: rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4
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
    // InternalAndroidGenerator.g:1365:1: rule__TargetSDK__Group__3__Impl : ( ( rule__TargetSDK__ResultAssignment_3 ) ) ;
    public final void rule__TargetSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1369:1: ( ( ( rule__TargetSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1370:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1370:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1371:2: ( rule__TargetSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getTargetSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1372:2: ( rule__TargetSDK__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1372:3: rule__TargetSDK__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1380:1: rule__TargetSDK__Group__4 : rule__TargetSDK__Group__4__Impl ;
    public final void rule__TargetSDK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1384:1: ( rule__TargetSDK__Group__4__Impl )
            // InternalAndroidGenerator.g:1385:2: rule__TargetSDK__Group__4__Impl
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
    // InternalAndroidGenerator.g:1391:1: rule__TargetSDK__Group__4__Impl : ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) ;
    public final void rule__TargetSDK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1395:1: ( ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1396:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1396:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            // InternalAndroidGenerator.g:1397:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            {
             before(grammarAccess.getTargetSDKAccess().getMinsdkAssignment_4()); 
            // InternalAndroidGenerator.g:1398:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAndroidGenerator.g:1398:3: rule__TargetSDK__MinsdkAssignment_4
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
    // InternalAndroidGenerator.g:1407:1: rule__MinSDK__Group__0 : rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 ;
    public final void rule__MinSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1411:1: ( rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 )
            // InternalAndroidGenerator.g:1412:2: rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1
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
    // InternalAndroidGenerator.g:1419:1: rule__MinSDK__Group__0__Impl : ( () ) ;
    public final void rule__MinSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1423:1: ( ( () ) )
            // InternalAndroidGenerator.g:1424:1: ( () )
            {
            // InternalAndroidGenerator.g:1424:1: ( () )
            // InternalAndroidGenerator.g:1425:2: ()
            {
             before(grammarAccess.getMinSDKAccess().getMinSDKAction_0()); 
            // InternalAndroidGenerator.g:1426:2: ()
            // InternalAndroidGenerator.g:1426:3: 
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
    // InternalAndroidGenerator.g:1434:1: rule__MinSDK__Group__1 : rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 ;
    public final void rule__MinSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1438:1: ( rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 )
            // InternalAndroidGenerator.g:1439:2: rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2
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
    // InternalAndroidGenerator.g:1446:1: rule__MinSDK__Group__1__Impl : ( 'Minimum-SDK' ) ;
    public final void rule__MinSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1450:1: ( ( 'Minimum-SDK' ) )
            // InternalAndroidGenerator.g:1451:1: ( 'Minimum-SDK' )
            {
            // InternalAndroidGenerator.g:1451:1: ( 'Minimum-SDK' )
            // InternalAndroidGenerator.g:1452:2: 'Minimum-SDK'
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
    // InternalAndroidGenerator.g:1461:1: rule__MinSDK__Group__2 : rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 ;
    public final void rule__MinSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1465:1: ( rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 )
            // InternalAndroidGenerator.g:1466:2: rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3
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
    // InternalAndroidGenerator.g:1473:1: rule__MinSDK__Group__2__Impl : ( ':' ) ;
    public final void rule__MinSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1477:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1478:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1478:1: ( ':' )
            // InternalAndroidGenerator.g:1479:2: ':'
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
    // InternalAndroidGenerator.g:1488:1: rule__MinSDK__Group__3 : rule__MinSDK__Group__3__Impl ;
    public final void rule__MinSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1492:1: ( rule__MinSDK__Group__3__Impl )
            // InternalAndroidGenerator.g:1493:2: rule__MinSDK__Group__3__Impl
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
    // InternalAndroidGenerator.g:1499:1: rule__MinSDK__Group__3__Impl : ( ( rule__MinSDK__ResultAssignment_3 ) ) ;
    public final void rule__MinSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1503:1: ( ( ( rule__MinSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1504:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1504:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1505:2: ( rule__MinSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getMinSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1506:2: ( rule__MinSDK__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1506:3: rule__MinSDK__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1515:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1519:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // InternalAndroidGenerator.g:1520:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
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
    // InternalAndroidGenerator.g:1527:1: rule__ApplicationPermissionList__Group__0__Impl : ( 'permissions' ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1531:1: ( ( 'permissions' ) )
            // InternalAndroidGenerator.g:1532:1: ( 'permissions' )
            {
            // InternalAndroidGenerator.g:1532:1: ( 'permissions' )
            // InternalAndroidGenerator.g:1533:2: 'permissions'
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
    // InternalAndroidGenerator.g:1542:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1546:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // InternalAndroidGenerator.g:1547:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
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
    // InternalAndroidGenerator.g:1554:1: rule__ApplicationPermissionList__Group__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1558:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1559:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1559:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            // InternalAndroidGenerator.g:1560:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_1()); 
            // InternalAndroidGenerator.g:1561:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            // InternalAndroidGenerator.g:1561:3: rule__ApplicationPermissionList__PermissionsAssignment_1
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
    // InternalAndroidGenerator.g:1569:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1573:1: ( rule__ApplicationPermissionList__Group__2__Impl )
            // InternalAndroidGenerator.g:1574:2: rule__ApplicationPermissionList__Group__2__Impl
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
    // InternalAndroidGenerator.g:1580:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__Group_2__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1584:1: ( ( ( rule__ApplicationPermissionList__Group_2__0 )* ) )
            // InternalAndroidGenerator.g:1585:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            {
            // InternalAndroidGenerator.g:1585:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            // InternalAndroidGenerator.g:1586:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_2()); 
            // InternalAndroidGenerator.g:1587:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_PACKAGE_NAME) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1587:3: rule__ApplicationPermissionList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalAndroidGenerator.g:1596:1: rule__ApplicationPermissionList__Group_2__0 : rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 ;
    public final void rule__ApplicationPermissionList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1600:1: ( rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 )
            // InternalAndroidGenerator.g:1601:2: rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1
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
    // InternalAndroidGenerator.g:1608:1: rule__ApplicationPermissionList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ApplicationPermissionList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1612:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:1613:1: ( ',' )
            {
            // InternalAndroidGenerator.g:1613:1: ( ',' )
            // InternalAndroidGenerator.g:1614:2: ','
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
    // InternalAndroidGenerator.g:1623:1: rule__ApplicationPermissionList__Group_2__1 : rule__ApplicationPermissionList__Group_2__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1627:1: ( rule__ApplicationPermissionList__Group_2__1__Impl )
            // InternalAndroidGenerator.g:1628:2: rule__ApplicationPermissionList__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:1634:1: rule__ApplicationPermissionList__Group_2__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1638:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) )
            // InternalAndroidGenerator.g:1639:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            {
            // InternalAndroidGenerator.g:1639:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            // InternalAndroidGenerator.g:1640:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2_1()); 
            // InternalAndroidGenerator.g:1641:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            // InternalAndroidGenerator.g:1641:3: rule__ApplicationPermissionList__PermissionsAssignment_2_1
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
    // InternalAndroidGenerator.g:1650:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1654:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // InternalAndroidGenerator.g:1655:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
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
    // InternalAndroidGenerator.g:1662:1: rule__ApplicationElementList__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1666:1: ( ( () ) )
            // InternalAndroidGenerator.g:1667:1: ( () )
            {
            // InternalAndroidGenerator.g:1667:1: ( () )
            // InternalAndroidGenerator.g:1668:2: ()
            {
             before(grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0()); 
            // InternalAndroidGenerator.g:1669:2: ()
            // InternalAndroidGenerator.g:1669:3: 
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
    // InternalAndroidGenerator.g:1677:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1681:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // InternalAndroidGenerator.g:1682:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
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
    // InternalAndroidGenerator.g:1689:1: rule__ApplicationElementList__Group__1__Impl : ( 'elements' ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1693:1: ( ( 'elements' ) )
            // InternalAndroidGenerator.g:1694:1: ( 'elements' )
            {
            // InternalAndroidGenerator.g:1694:1: ( 'elements' )
            // InternalAndroidGenerator.g:1695:2: 'elements'
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
    // InternalAndroidGenerator.g:1704:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1708:1: ( rule__ApplicationElementList__Group__2__Impl )
            // InternalAndroidGenerator.g:1709:2: rule__ApplicationElementList__Group__2__Impl
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
    // InternalAndroidGenerator.g:1715:1: rule__ApplicationElementList__Group__2__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_2 )* ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1719:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_2 )* ) )
            // InternalAndroidGenerator.g:1720:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 )* )
            {
            // InternalAndroidGenerator.g:1720:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 )* )
            // InternalAndroidGenerator.g:1721:2: ( rule__ApplicationElementList__ElementsAssignment_2 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 
            // InternalAndroidGenerator.g:1722:2: ( rule__ApplicationElementList__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=21 && LA13_0<=23)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1722:3: rule__ApplicationElementList__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ApplicationElementList__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalAndroidGenerator.g:1731:1: rule__ApplicationMainActivity__Group__0 : rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 ;
    public final void rule__ApplicationMainActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1735:1: ( rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1 )
            // InternalAndroidGenerator.g:1736:2: rule__ApplicationMainActivity__Group__0__Impl rule__ApplicationMainActivity__Group__1
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
    // InternalAndroidGenerator.g:1743:1: rule__ApplicationMainActivity__Group__0__Impl : ( 'main-activity' ) ;
    public final void rule__ApplicationMainActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1747:1: ( ( 'main-activity' ) )
            // InternalAndroidGenerator.g:1748:1: ( 'main-activity' )
            {
            // InternalAndroidGenerator.g:1748:1: ( 'main-activity' )
            // InternalAndroidGenerator.g:1749:2: 'main-activity'
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
    // InternalAndroidGenerator.g:1758:1: rule__ApplicationMainActivity__Group__1 : rule__ApplicationMainActivity__Group__1__Impl ;
    public final void rule__ApplicationMainActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1762:1: ( rule__ApplicationMainActivity__Group__1__Impl )
            // InternalAndroidGenerator.g:1763:2: rule__ApplicationMainActivity__Group__1__Impl
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
    // InternalAndroidGenerator.g:1769:1: rule__ApplicationMainActivity__Group__1__Impl : ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) ;
    public final void rule__ApplicationMainActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1773:1: ( ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1774:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1774:1: ( ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 ) )
            // InternalAndroidGenerator.g:1775:2: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityAssignment_1()); 
            // InternalAndroidGenerator.g:1776:2: ( rule__ApplicationMainActivity__LauncherActivityAssignment_1 )
            // InternalAndroidGenerator.g:1776:3: rule__ApplicationMainActivity__LauncherActivityAssignment_1
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
    // InternalAndroidGenerator.g:1785:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1789:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAndroidGenerator.g:1790:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAndroidGenerator.g:1797:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1801:1: ( ( () ) )
            // InternalAndroidGenerator.g:1802:1: ( () )
            {
            // InternalAndroidGenerator.g:1802:1: ( () )
            // InternalAndroidGenerator.g:1803:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalAndroidGenerator.g:1804:2: ()
            // InternalAndroidGenerator.g:1804:3: 
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
    // InternalAndroidGenerator.g:1812:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1816:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAndroidGenerator.g:1817:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAndroidGenerator.g:1824:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1828:1: ( ( 'Model' ) )
            // InternalAndroidGenerator.g:1829:1: ( 'Model' )
            {
            // InternalAndroidGenerator.g:1829:1: ( 'Model' )
            // InternalAndroidGenerator.g:1830:2: 'Model'
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
    // InternalAndroidGenerator.g:1839:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1843:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAndroidGenerator.g:1844:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalAndroidGenerator.g:1851:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1855:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalAndroidGenerator.g:1856:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalAndroidGenerator.g:1856:1: ( ( rule__Model__Group_2__0 )? )
            // InternalAndroidGenerator.g:1857:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalAndroidGenerator.g:1858:2: ( rule__Model__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAndroidGenerator.g:1858:3: rule__Model__Group_2__0
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
    // InternalAndroidGenerator.g:1866:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1870:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalAndroidGenerator.g:1871:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalAndroidGenerator.g:1878:1: rule__Model__Group__3__Impl : ( ( rule__Model__NameAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1882:1: ( ( ( rule__Model__NameAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1883:1: ( ( rule__Model__NameAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1883:1: ( ( rule__Model__NameAssignment_3 ) )
            // InternalAndroidGenerator.g:1884:2: ( rule__Model__NameAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_3()); 
            // InternalAndroidGenerator.g:1885:2: ( rule__Model__NameAssignment_3 )
            // InternalAndroidGenerator.g:1885:3: rule__Model__NameAssignment_3
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
    // InternalAndroidGenerator.g:1893:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1897:1: ( rule__Model__Group__4__Impl )
            // InternalAndroidGenerator.g:1898:2: rule__Model__Group__4__Impl
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
    // InternalAndroidGenerator.g:1904:1: rule__Model__Group__4__Impl : ( ( rule__Model__ModellistAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1908:1: ( ( ( rule__Model__ModellistAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1909:1: ( ( rule__Model__ModellistAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1909:1: ( ( rule__Model__ModellistAssignment_4 )? )
            // InternalAndroidGenerator.g:1910:2: ( rule__Model__ModellistAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getModellistAssignment_4()); 
            // InternalAndroidGenerator.g:1911:2: ( rule__Model__ModellistAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAndroidGenerator.g:1911:3: rule__Model__ModellistAssignment_4
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
    // InternalAndroidGenerator.g:1920:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1924:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalAndroidGenerator.g:1925:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
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
    // InternalAndroidGenerator.g:1932:1: rule__Model__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1936:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1937:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1937:1: ( ':' )
            // InternalAndroidGenerator.g:1938:2: ':'
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
    // InternalAndroidGenerator.g:1947:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1951:1: ( rule__Model__Group_2__1__Impl )
            // InternalAndroidGenerator.g:1952:2: rule__Model__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:1958:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__ActivityTypeAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1962:1: ( ( ( rule__Model__ActivityTypeAssignment_2_1 ) ) )
            // InternalAndroidGenerator.g:1963:1: ( ( rule__Model__ActivityTypeAssignment_2_1 ) )
            {
            // InternalAndroidGenerator.g:1963:1: ( ( rule__Model__ActivityTypeAssignment_2_1 ) )
            // InternalAndroidGenerator.g:1964:2: ( rule__Model__ActivityTypeAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getActivityTypeAssignment_2_1()); 
            // InternalAndroidGenerator.g:1965:2: ( rule__Model__ActivityTypeAssignment_2_1 )
            // InternalAndroidGenerator.g:1965:3: rule__Model__ActivityTypeAssignment_2_1
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
    // InternalAndroidGenerator.g:1974:1: rule__ModelList__Group__0 : rule__ModelList__Group__0__Impl rule__ModelList__Group__1 ;
    public final void rule__ModelList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1978:1: ( rule__ModelList__Group__0__Impl rule__ModelList__Group__1 )
            // InternalAndroidGenerator.g:1979:2: rule__ModelList__Group__0__Impl rule__ModelList__Group__1
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
    // InternalAndroidGenerator.g:1986:1: rule__ModelList__Group__0__Impl : ( ( rule__ModelList__TypeAssignment_0 ) ) ;
    public final void rule__ModelList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1990:1: ( ( ( rule__ModelList__TypeAssignment_0 ) ) )
            // InternalAndroidGenerator.g:1991:1: ( ( rule__ModelList__TypeAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:1991:1: ( ( rule__ModelList__TypeAssignment_0 ) )
            // InternalAndroidGenerator.g:1992:2: ( rule__ModelList__TypeAssignment_0 )
            {
             before(grammarAccess.getModelListAccess().getTypeAssignment_0()); 
            // InternalAndroidGenerator.g:1993:2: ( rule__ModelList__TypeAssignment_0 )
            // InternalAndroidGenerator.g:1993:3: rule__ModelList__TypeAssignment_0
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
    // InternalAndroidGenerator.g:2001:1: rule__ModelList__Group__1 : rule__ModelList__Group__1__Impl rule__ModelList__Group__2 ;
    public final void rule__ModelList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2005:1: ( rule__ModelList__Group__1__Impl rule__ModelList__Group__2 )
            // InternalAndroidGenerator.g:2006:2: rule__ModelList__Group__1__Impl rule__ModelList__Group__2
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
    // InternalAndroidGenerator.g:2013:1: rule__ModelList__Group__1__Impl : ( ':' ) ;
    public final void rule__ModelList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2017:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:2018:1: ( ':' )
            {
            // InternalAndroidGenerator.g:2018:1: ( ':' )
            // InternalAndroidGenerator.g:2019:2: ':'
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
    // InternalAndroidGenerator.g:2028:1: rule__ModelList__Group__2 : rule__ModelList__Group__2__Impl rule__ModelList__Group__3 ;
    public final void rule__ModelList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2032:1: ( rule__ModelList__Group__2__Impl rule__ModelList__Group__3 )
            // InternalAndroidGenerator.g:2033:2: rule__ModelList__Group__2__Impl rule__ModelList__Group__3
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
    // InternalAndroidGenerator.g:2040:1: rule__ModelList__Group__2__Impl : ( ( rule__ModelList__GetsetAssignment_2 ) ) ;
    public final void rule__ModelList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2044:1: ( ( ( rule__ModelList__GetsetAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2045:1: ( ( rule__ModelList__GetsetAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2045:1: ( ( rule__ModelList__GetsetAssignment_2 ) )
            // InternalAndroidGenerator.g:2046:2: ( rule__ModelList__GetsetAssignment_2 )
            {
             before(grammarAccess.getModelListAccess().getGetsetAssignment_2()); 
            // InternalAndroidGenerator.g:2047:2: ( rule__ModelList__GetsetAssignment_2 )
            // InternalAndroidGenerator.g:2047:3: rule__ModelList__GetsetAssignment_2
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
    // InternalAndroidGenerator.g:2055:1: rule__ModelList__Group__3 : rule__ModelList__Group__3__Impl ;
    public final void rule__ModelList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2059:1: ( rule__ModelList__Group__3__Impl )
            // InternalAndroidGenerator.g:2060:2: rule__ModelList__Group__3__Impl
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
    // InternalAndroidGenerator.g:2066:1: rule__ModelList__Group__3__Impl : ( ( rule__ModelList__Group_3__0 )* ) ;
    public final void rule__ModelList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2070:1: ( ( ( rule__ModelList__Group_3__0 )* ) )
            // InternalAndroidGenerator.g:2071:1: ( ( rule__ModelList__Group_3__0 )* )
            {
            // InternalAndroidGenerator.g:2071:1: ( ( rule__ModelList__Group_3__0 )* )
            // InternalAndroidGenerator.g:2072:2: ( rule__ModelList__Group_3__0 )*
            {
             before(grammarAccess.getModelListAccess().getGroup_3()); 
            // InternalAndroidGenerator.g:2073:2: ( rule__ModelList__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==12) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_ID) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2073:3: rule__ModelList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ModelList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAndroidGenerator.g:2082:1: rule__ModelList__Group_3__0 : rule__ModelList__Group_3__0__Impl rule__ModelList__Group_3__1 ;
    public final void rule__ModelList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2086:1: ( rule__ModelList__Group_3__0__Impl rule__ModelList__Group_3__1 )
            // InternalAndroidGenerator.g:2087:2: rule__ModelList__Group_3__0__Impl rule__ModelList__Group_3__1
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
    // InternalAndroidGenerator.g:2094:1: rule__ModelList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ModelList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2098:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:2099:1: ( ',' )
            {
            // InternalAndroidGenerator.g:2099:1: ( ',' )
            // InternalAndroidGenerator.g:2100:2: ','
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
    // InternalAndroidGenerator.g:2109:1: rule__ModelList__Group_3__1 : rule__ModelList__Group_3__1__Impl rule__ModelList__Group_3__2 ;
    public final void rule__ModelList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2113:1: ( rule__ModelList__Group_3__1__Impl rule__ModelList__Group_3__2 )
            // InternalAndroidGenerator.g:2114:2: rule__ModelList__Group_3__1__Impl rule__ModelList__Group_3__2
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
    // InternalAndroidGenerator.g:2121:1: rule__ModelList__Group_3__1__Impl : ( ( rule__ModelList__TypeAssignment_3_1 ) ) ;
    public final void rule__ModelList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2125:1: ( ( ( rule__ModelList__TypeAssignment_3_1 ) ) )
            // InternalAndroidGenerator.g:2126:1: ( ( rule__ModelList__TypeAssignment_3_1 ) )
            {
            // InternalAndroidGenerator.g:2126:1: ( ( rule__ModelList__TypeAssignment_3_1 ) )
            // InternalAndroidGenerator.g:2127:2: ( rule__ModelList__TypeAssignment_3_1 )
            {
             before(grammarAccess.getModelListAccess().getTypeAssignment_3_1()); 
            // InternalAndroidGenerator.g:2128:2: ( rule__ModelList__TypeAssignment_3_1 )
            // InternalAndroidGenerator.g:2128:3: rule__ModelList__TypeAssignment_3_1
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
    // InternalAndroidGenerator.g:2136:1: rule__ModelList__Group_3__2 : rule__ModelList__Group_3__2__Impl rule__ModelList__Group_3__3 ;
    public final void rule__ModelList__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2140:1: ( rule__ModelList__Group_3__2__Impl rule__ModelList__Group_3__3 )
            // InternalAndroidGenerator.g:2141:2: rule__ModelList__Group_3__2__Impl rule__ModelList__Group_3__3
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
    // InternalAndroidGenerator.g:2148:1: rule__ModelList__Group_3__2__Impl : ( ':' ) ;
    public final void rule__ModelList__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2152:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:2153:1: ( ':' )
            {
            // InternalAndroidGenerator.g:2153:1: ( ':' )
            // InternalAndroidGenerator.g:2154:2: ':'
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
    // InternalAndroidGenerator.g:2163:1: rule__ModelList__Group_3__3 : rule__ModelList__Group_3__3__Impl ;
    public final void rule__ModelList__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2167:1: ( rule__ModelList__Group_3__3__Impl )
            // InternalAndroidGenerator.g:2168:2: rule__ModelList__Group_3__3__Impl
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
    // InternalAndroidGenerator.g:2174:1: rule__ModelList__Group_3__3__Impl : ( ( rule__ModelList__GetsetAssignment_3_3 ) ) ;
    public final void rule__ModelList__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2178:1: ( ( ( rule__ModelList__GetsetAssignment_3_3 ) ) )
            // InternalAndroidGenerator.g:2179:1: ( ( rule__ModelList__GetsetAssignment_3_3 ) )
            {
            // InternalAndroidGenerator.g:2179:1: ( ( rule__ModelList__GetsetAssignment_3_3 ) )
            // InternalAndroidGenerator.g:2180:2: ( rule__ModelList__GetsetAssignment_3_3 )
            {
             before(grammarAccess.getModelListAccess().getGetsetAssignment_3_3()); 
            // InternalAndroidGenerator.g:2181:2: ( rule__ModelList__GetsetAssignment_3_3 )
            // InternalAndroidGenerator.g:2181:3: rule__ModelList__GetsetAssignment_3_3
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
    // InternalAndroidGenerator.g:2190:1: rule__GetSet__Group__0 : rule__GetSet__Group__0__Impl rule__GetSet__Group__1 ;
    public final void rule__GetSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2194:1: ( rule__GetSet__Group__0__Impl rule__GetSet__Group__1 )
            // InternalAndroidGenerator.g:2195:2: rule__GetSet__Group__0__Impl rule__GetSet__Group__1
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
    // InternalAndroidGenerator.g:2202:1: rule__GetSet__Group__0__Impl : ( () ) ;
    public final void rule__GetSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2206:1: ( ( () ) )
            // InternalAndroidGenerator.g:2207:1: ( () )
            {
            // InternalAndroidGenerator.g:2207:1: ( () )
            // InternalAndroidGenerator.g:2208:2: ()
            {
             before(grammarAccess.getGetSetAccess().getGetSetAction_0()); 
            // InternalAndroidGenerator.g:2209:2: ()
            // InternalAndroidGenerator.g:2209:3: 
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
    // InternalAndroidGenerator.g:2217:1: rule__GetSet__Group__1 : rule__GetSet__Group__1__Impl ;
    public final void rule__GetSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2221:1: ( rule__GetSet__Group__1__Impl )
            // InternalAndroidGenerator.g:2222:2: rule__GetSet__Group__1__Impl
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
    // InternalAndroidGenerator.g:2228:1: rule__GetSet__Group__1__Impl : ( ( rule__GetSet__NameAssignment_1 ) ) ;
    public final void rule__GetSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2232:1: ( ( ( rule__GetSet__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:2233:1: ( ( rule__GetSet__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:2233:1: ( ( rule__GetSet__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:2234:2: ( rule__GetSet__NameAssignment_1 )
            {
             before(grammarAccess.getGetSetAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:2235:2: ( rule__GetSet__NameAssignment_1 )
            // InternalAndroidGenerator.g:2235:3: rule__GetSet__NameAssignment_1
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
    // InternalAndroidGenerator.g:2244:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2248:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalAndroidGenerator.g:2249:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalAndroidGenerator.g:2256:1: rule__Type__Group__0__Impl : ( () ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2260:1: ( ( () ) )
            // InternalAndroidGenerator.g:2261:1: ( () )
            {
            // InternalAndroidGenerator.g:2261:1: ( () )
            // InternalAndroidGenerator.g:2262:2: ()
            {
             before(grammarAccess.getTypeAccess().getTypeAction_0()); 
            // InternalAndroidGenerator.g:2263:2: ()
            // InternalAndroidGenerator.g:2263:3: 
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
    // InternalAndroidGenerator.g:2271:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2275:1: ( rule__Type__Group__1__Impl )
            // InternalAndroidGenerator.g:2276:2: rule__Type__Group__1__Impl
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
    // InternalAndroidGenerator.g:2282:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2286:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:2287:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:2287:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:2288:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:2289:2: ( rule__Type__NameAssignment_1 )
            // InternalAndroidGenerator.g:2289:3: rule__Type__NameAssignment_1
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
    // InternalAndroidGenerator.g:2298:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2302:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalAndroidGenerator.g:2303:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAndroidGenerator.g:2310:1: rule__Fragment__Group__0__Impl : ( () ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2314:1: ( ( () ) )
            // InternalAndroidGenerator.g:2315:1: ( () )
            {
            // InternalAndroidGenerator.g:2315:1: ( () )
            // InternalAndroidGenerator.g:2316:2: ()
            {
             before(grammarAccess.getFragmentAccess().getFragmentAction_0()); 
            // InternalAndroidGenerator.g:2317:2: ()
            // InternalAndroidGenerator.g:2317:3: 
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
    // InternalAndroidGenerator.g:2325:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2329:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalAndroidGenerator.g:2330:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
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
    // InternalAndroidGenerator.g:2337:1: rule__Fragment__Group__1__Impl : ( 'Fragment' ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2341:1: ( ( 'Fragment' ) )
            // InternalAndroidGenerator.g:2342:1: ( 'Fragment' )
            {
            // InternalAndroidGenerator.g:2342:1: ( 'Fragment' )
            // InternalAndroidGenerator.g:2343:2: 'Fragment'
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2352:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2356:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalAndroidGenerator.g:2357:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
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
    // InternalAndroidGenerator.g:2364:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__Group_2__0 )? ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2368:1: ( ( ( rule__Fragment__Group_2__0 )? ) )
            // InternalAndroidGenerator.g:2369:1: ( ( rule__Fragment__Group_2__0 )? )
            {
            // InternalAndroidGenerator.g:2369:1: ( ( rule__Fragment__Group_2__0 )? )
            // InternalAndroidGenerator.g:2370:2: ( rule__Fragment__Group_2__0 )?
            {
             before(grammarAccess.getFragmentAccess().getGroup_2()); 
            // InternalAndroidGenerator.g:2371:2: ( rule__Fragment__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGenerator.g:2371:3: rule__Fragment__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fragment__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalAndroidGenerator.g:2379:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl rule__Fragment__Group__4 ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2383:1: ( rule__Fragment__Group__3__Impl rule__Fragment__Group__4 )
            // InternalAndroidGenerator.g:2384:2: rule__Fragment__Group__3__Impl rule__Fragment__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Fragment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAndroidGenerator.g:2391:1: rule__Fragment__Group__3__Impl : ( ( rule__Fragment__NameAssignment_3 ) ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2395:1: ( ( ( rule__Fragment__NameAssignment_3 ) ) )
            // InternalAndroidGenerator.g:2396:1: ( ( rule__Fragment__NameAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:2396:1: ( ( rule__Fragment__NameAssignment_3 ) )
            // InternalAndroidGenerator.g:2397:2: ( rule__Fragment__NameAssignment_3 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_3()); 
            // InternalAndroidGenerator.g:2398:2: ( rule__Fragment__NameAssignment_3 )
            // InternalAndroidGenerator.g:2398:3: rule__Fragment__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fragment__Group__4"
    // InternalAndroidGenerator.g:2406:1: rule__Fragment__Group__4 : rule__Fragment__Group__4__Impl ;
    public final void rule__Fragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2410:1: ( rule__Fragment__Group__4__Impl )
            // InternalAndroidGenerator.g:2411:2: rule__Fragment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__4"


    // $ANTLR start "rule__Fragment__Group__4__Impl"
    // InternalAndroidGenerator.g:2417:1: rule__Fragment__Group__4__Impl : ( ( rule__Fragment__ActivityAttributesAssignment_4 )? ) ;
    public final void rule__Fragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2421:1: ( ( ( rule__Fragment__ActivityAttributesAssignment_4 )? ) )
            // InternalAndroidGenerator.g:2422:1: ( ( rule__Fragment__ActivityAttributesAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:2422:1: ( ( rule__Fragment__ActivityAttributesAssignment_4 )? )
            // InternalAndroidGenerator.g:2423:2: ( rule__Fragment__ActivityAttributesAssignment_4 )?
            {
             before(grammarAccess.getFragmentAccess().getActivityAttributesAssignment_4()); 
            // InternalAndroidGenerator.g:2424:2: ( rule__Fragment__ActivityAttributesAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=26 && LA18_0<=27)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAndroidGenerator.g:2424:3: rule__Fragment__ActivityAttributesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fragment__ActivityAttributesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentAccess().getActivityAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group__4__Impl"


    // $ANTLR start "rule__Fragment__Group_2__0"
    // InternalAndroidGenerator.g:2433:1: rule__Fragment__Group_2__0 : rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1 ;
    public final void rule__Fragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2437:1: ( rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1 )
            // InternalAndroidGenerator.g:2438:2: rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Fragment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group_2__0"


    // $ANTLR start "rule__Fragment__Group_2__0__Impl"
    // InternalAndroidGenerator.g:2445:1: rule__Fragment__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Fragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2449:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:2450:1: ( ':' )
            {
            // InternalAndroidGenerator.g:2450:1: ( ':' )
            // InternalAndroidGenerator.g:2451:2: ':'
            {
             before(grammarAccess.getFragmentAccess().getColonKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group_2__0__Impl"


    // $ANTLR start "rule__Fragment__Group_2__1"
    // InternalAndroidGenerator.g:2460:1: rule__Fragment__Group_2__1 : rule__Fragment__Group_2__1__Impl ;
    public final void rule__Fragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2464:1: ( rule__Fragment__Group_2__1__Impl )
            // InternalAndroidGenerator.g:2465:2: rule__Fragment__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group_2__1"


    // $ANTLR start "rule__Fragment__Group_2__1__Impl"
    // InternalAndroidGenerator.g:2471:1: rule__Fragment__Group_2__1__Impl : ( ( rule__Fragment__ActivityTypeAssignment_2_1 ) ) ;
    public final void rule__Fragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2475:1: ( ( ( rule__Fragment__ActivityTypeAssignment_2_1 ) ) )
            // InternalAndroidGenerator.g:2476:1: ( ( rule__Fragment__ActivityTypeAssignment_2_1 ) )
            {
            // InternalAndroidGenerator.g:2476:1: ( ( rule__Fragment__ActivityTypeAssignment_2_1 ) )
            // InternalAndroidGenerator.g:2477:2: ( rule__Fragment__ActivityTypeAssignment_2_1 )
            {
             before(grammarAccess.getFragmentAccess().getActivityTypeAssignment_2_1()); 
            // InternalAndroidGenerator.g:2478:2: ( rule__Fragment__ActivityTypeAssignment_2_1 )
            // InternalAndroidGenerator.g:2478:3: rule__Fragment__ActivityTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__ActivityTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getActivityTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__Group_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_0__0"
    // InternalAndroidGenerator.g:2487:1: rule__Activity__Group_0__0 : rule__Activity__Group_0__0__Impl rule__Activity__Group_0__1 ;
    public final void rule__Activity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2491:1: ( rule__Activity__Group_0__0__Impl rule__Activity__Group_0__1 )
            // InternalAndroidGenerator.g:2492:2: rule__Activity__Group_0__0__Impl rule__Activity__Group_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAndroidGenerator.g:2499:1: rule__Activity__Group_0__0__Impl : ( () ) ;
    public final void rule__Activity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2503:1: ( ( () ) )
            // InternalAndroidGenerator.g:2504:1: ( () )
            {
            // InternalAndroidGenerator.g:2504:1: ( () )
            // InternalAndroidGenerator.g:2505:2: ()
            {
             before(grammarAccess.getActivityAccess().getActivityAction_0_0()); 
            // InternalAndroidGenerator.g:2506:2: ()
            // InternalAndroidGenerator.g:2506:3: 
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
    // InternalAndroidGenerator.g:2514:1: rule__Activity__Group_0__1 : rule__Activity__Group_0__1__Impl rule__Activity__Group_0__2 ;
    public final void rule__Activity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2518:1: ( rule__Activity__Group_0__1__Impl rule__Activity__Group_0__2 )
            // InternalAndroidGenerator.g:2519:2: rule__Activity__Group_0__1__Impl rule__Activity__Group_0__2
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
    // InternalAndroidGenerator.g:2526:1: rule__Activity__Group_0__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2530:1: ( ( 'Activity' ) )
            // InternalAndroidGenerator.g:2531:1: ( 'Activity' )
            {
            // InternalAndroidGenerator.g:2531:1: ( 'Activity' )
            // InternalAndroidGenerator.g:2532:2: 'Activity'
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
    // InternalAndroidGenerator.g:2541:1: rule__Activity__Group_0__2 : rule__Activity__Group_0__2__Impl ;
    public final void rule__Activity__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2545:1: ( rule__Activity__Group_0__2__Impl )
            // InternalAndroidGenerator.g:2546:2: rule__Activity__Group_0__2__Impl
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
    // InternalAndroidGenerator.g:2552:1: rule__Activity__Group_0__2__Impl : ( ( rule__Activity__Group_0_2__0 )? ) ;
    public final void rule__Activity__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2556:1: ( ( ( rule__Activity__Group_0_2__0 )? ) )
            // InternalAndroidGenerator.g:2557:1: ( ( rule__Activity__Group_0_2__0 )? )
            {
            // InternalAndroidGenerator.g:2557:1: ( ( rule__Activity__Group_0_2__0 )? )
            // InternalAndroidGenerator.g:2558:2: ( rule__Activity__Group_0_2__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_0_2()); 
            // InternalAndroidGenerator.g:2559:2: ( rule__Activity__Group_0_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAndroidGenerator.g:2559:3: rule__Activity__Group_0_2__0
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
    // InternalAndroidGenerator.g:2568:1: rule__Activity__Group_0_2__0 : rule__Activity__Group_0_2__0__Impl rule__Activity__Group_0_2__1 ;
    public final void rule__Activity__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2572:1: ( rule__Activity__Group_0_2__0__Impl rule__Activity__Group_0_2__1 )
            // InternalAndroidGenerator.g:2573:2: rule__Activity__Group_0_2__0__Impl rule__Activity__Group_0_2__1
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
    // InternalAndroidGenerator.g:2580:1: rule__Activity__Group_0_2__0__Impl : ( ':' ) ;
    public final void rule__Activity__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2584:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:2585:1: ( ':' )
            {
            // InternalAndroidGenerator.g:2585:1: ( ':' )
            // InternalAndroidGenerator.g:2586:2: ':'
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
    // InternalAndroidGenerator.g:2595:1: rule__Activity__Group_0_2__1 : rule__Activity__Group_0_2__1__Impl rule__Activity__Group_0_2__2 ;
    public final void rule__Activity__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2599:1: ( rule__Activity__Group_0_2__1__Impl rule__Activity__Group_0_2__2 )
            // InternalAndroidGenerator.g:2600:2: rule__Activity__Group_0_2__1__Impl rule__Activity__Group_0_2__2
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
    // InternalAndroidGenerator.g:2607:1: rule__Activity__Group_0_2__1__Impl : ( ( rule__Activity__ActivityTypeAssignment_0_2_1 ) ) ;
    public final void rule__Activity__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2611:1: ( ( ( rule__Activity__ActivityTypeAssignment_0_2_1 ) ) )
            // InternalAndroidGenerator.g:2612:1: ( ( rule__Activity__ActivityTypeAssignment_0_2_1 ) )
            {
            // InternalAndroidGenerator.g:2612:1: ( ( rule__Activity__ActivityTypeAssignment_0_2_1 ) )
            // InternalAndroidGenerator.g:2613:2: ( rule__Activity__ActivityTypeAssignment_0_2_1 )
            {
             before(grammarAccess.getActivityAccess().getActivityTypeAssignment_0_2_1()); 
            // InternalAndroidGenerator.g:2614:2: ( rule__Activity__ActivityTypeAssignment_0_2_1 )
            // InternalAndroidGenerator.g:2614:3: rule__Activity__ActivityTypeAssignment_0_2_1
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
    // InternalAndroidGenerator.g:2622:1: rule__Activity__Group_0_2__2 : rule__Activity__Group_0_2__2__Impl rule__Activity__Group_0_2__3 ;
    public final void rule__Activity__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2626:1: ( rule__Activity__Group_0_2__2__Impl rule__Activity__Group_0_2__3 )
            // InternalAndroidGenerator.g:2627:2: rule__Activity__Group_0_2__2__Impl rule__Activity__Group_0_2__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalAndroidGenerator.g:2634:1: rule__Activity__Group_0_2__2__Impl : ( ( rule__Activity__NameAssignment_0_2_2 ) ) ;
    public final void rule__Activity__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2638:1: ( ( ( rule__Activity__NameAssignment_0_2_2 ) ) )
            // InternalAndroidGenerator.g:2639:1: ( ( rule__Activity__NameAssignment_0_2_2 ) )
            {
            // InternalAndroidGenerator.g:2639:1: ( ( rule__Activity__NameAssignment_0_2_2 ) )
            // InternalAndroidGenerator.g:2640:2: ( rule__Activity__NameAssignment_0_2_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_0_2_2()); 
            // InternalAndroidGenerator.g:2641:2: ( rule__Activity__NameAssignment_0_2_2 )
            // InternalAndroidGenerator.g:2641:3: rule__Activity__NameAssignment_0_2_2
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
    // InternalAndroidGenerator.g:2649:1: rule__Activity__Group_0_2__3 : rule__Activity__Group_0_2__3__Impl rule__Activity__Group_0_2__4 ;
    public final void rule__Activity__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2653:1: ( rule__Activity__Group_0_2__3__Impl rule__Activity__Group_0_2__4 )
            // InternalAndroidGenerator.g:2654:2: rule__Activity__Group_0_2__3__Impl rule__Activity__Group_0_2__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalAndroidGenerator.g:2661:1: rule__Activity__Group_0_2__3__Impl : ( ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 ) ) ;
    public final void rule__Activity__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2665:1: ( ( ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 ) ) )
            // InternalAndroidGenerator.g:2666:1: ( ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 ) )
            {
            // InternalAndroidGenerator.g:2666:1: ( ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 ) )
            // InternalAndroidGenerator.g:2667:2: ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 )
            {
             before(grammarAccess.getActivityAccess().getActivityTypeAttributesAssignment_0_2_3()); 
            // InternalAndroidGenerator.g:2668:2: ( rule__Activity__ActivityTypeAttributesAssignment_0_2_3 )
            // InternalAndroidGenerator.g:2668:3: rule__Activity__ActivityTypeAttributesAssignment_0_2_3
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
    // InternalAndroidGenerator.g:2676:1: rule__Activity__Group_0_2__4 : rule__Activity__Group_0_2__4__Impl ;
    public final void rule__Activity__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2680:1: ( rule__Activity__Group_0_2__4__Impl )
            // InternalAndroidGenerator.g:2681:2: rule__Activity__Group_0_2__4__Impl
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
    // InternalAndroidGenerator.g:2687:1: rule__Activity__Group_0_2__4__Impl : ( ( rule__Activity__ActivityAttributesAssignment_0_2_4 )* ) ;
    public final void rule__Activity__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2691:1: ( ( ( rule__Activity__ActivityAttributesAssignment_0_2_4 )* ) )
            // InternalAndroidGenerator.g:2692:1: ( ( rule__Activity__ActivityAttributesAssignment_0_2_4 )* )
            {
            // InternalAndroidGenerator.g:2692:1: ( ( rule__Activity__ActivityAttributesAssignment_0_2_4 )* )
            // InternalAndroidGenerator.g:2693:2: ( rule__Activity__ActivityAttributesAssignment_0_2_4 )*
            {
             before(grammarAccess.getActivityAccess().getActivityAttributesAssignment_0_2_4()); 
            // InternalAndroidGenerator.g:2694:2: ( rule__Activity__ActivityAttributesAssignment_0_2_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=26 && LA20_0<=27)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2694:3: rule__Activity__ActivityAttributesAssignment_0_2_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Activity__ActivityAttributesAssignment_0_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalAndroidGenerator.g:2703:1: rule__Activity__Group_1__0 : rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1 ;
    public final void rule__Activity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2707:1: ( rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1 )
            // InternalAndroidGenerator.g:2708:2: rule__Activity__Group_1__0__Impl rule__Activity__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAndroidGenerator.g:2715:1: rule__Activity__Group_1__0__Impl : ( () ) ;
    public final void rule__Activity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2719:1: ( ( () ) )
            // InternalAndroidGenerator.g:2720:1: ( () )
            {
            // InternalAndroidGenerator.g:2720:1: ( () )
            // InternalAndroidGenerator.g:2721:2: ()
            {
             before(grammarAccess.getActivityAccess().getActivityAction_1_0()); 
            // InternalAndroidGenerator.g:2722:2: ()
            // InternalAndroidGenerator.g:2722:3: 
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
    // InternalAndroidGenerator.g:2730:1: rule__Activity__Group_1__1 : rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2 ;
    public final void rule__Activity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2734:1: ( rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2 )
            // InternalAndroidGenerator.g:2735:2: rule__Activity__Group_1__1__Impl rule__Activity__Group_1__2
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
    // InternalAndroidGenerator.g:2742:1: rule__Activity__Group_1__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2746:1: ( ( 'Activity' ) )
            // InternalAndroidGenerator.g:2747:1: ( 'Activity' )
            {
            // InternalAndroidGenerator.g:2747:1: ( 'Activity' )
            // InternalAndroidGenerator.g:2748:2: 'Activity'
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
    // InternalAndroidGenerator.g:2757:1: rule__Activity__Group_1__2 : rule__Activity__Group_1__2__Impl rule__Activity__Group_1__3 ;
    public final void rule__Activity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2761:1: ( rule__Activity__Group_1__2__Impl rule__Activity__Group_1__3 )
            // InternalAndroidGenerator.g:2762:2: rule__Activity__Group_1__2__Impl rule__Activity__Group_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalAndroidGenerator.g:2769:1: rule__Activity__Group_1__2__Impl : ( ( rule__Activity__NameAssignment_1_2 ) ) ;
    public final void rule__Activity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2773:1: ( ( ( rule__Activity__NameAssignment_1_2 ) ) )
            // InternalAndroidGenerator.g:2774:1: ( ( rule__Activity__NameAssignment_1_2 ) )
            {
            // InternalAndroidGenerator.g:2774:1: ( ( rule__Activity__NameAssignment_1_2 ) )
            // InternalAndroidGenerator.g:2775:2: ( rule__Activity__NameAssignment_1_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1_2()); 
            // InternalAndroidGenerator.g:2776:2: ( rule__Activity__NameAssignment_1_2 )
            // InternalAndroidGenerator.g:2776:3: rule__Activity__NameAssignment_1_2
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
    // InternalAndroidGenerator.g:2784:1: rule__Activity__Group_1__3 : rule__Activity__Group_1__3__Impl ;
    public final void rule__Activity__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2788:1: ( rule__Activity__Group_1__3__Impl )
            // InternalAndroidGenerator.g:2789:2: rule__Activity__Group_1__3__Impl
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
    // InternalAndroidGenerator.g:2795:1: rule__Activity__Group_1__3__Impl : ( ( rule__Activity__ActivityAttributesAssignment_1_3 )* ) ;
    public final void rule__Activity__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2799:1: ( ( ( rule__Activity__ActivityAttributesAssignment_1_3 )* ) )
            // InternalAndroidGenerator.g:2800:1: ( ( rule__Activity__ActivityAttributesAssignment_1_3 )* )
            {
            // InternalAndroidGenerator.g:2800:1: ( ( rule__Activity__ActivityAttributesAssignment_1_3 )* )
            // InternalAndroidGenerator.g:2801:2: ( rule__Activity__ActivityAttributesAssignment_1_3 )*
            {
             before(grammarAccess.getActivityAccess().getActivityAttributesAssignment_1_3()); 
            // InternalAndroidGenerator.g:2802:2: ( rule__Activity__ActivityAttributesAssignment_1_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=26 && LA21_0<=27)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2802:3: rule__Activity__ActivityAttributesAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Activity__ActivityAttributesAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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


    // $ANTLR start "rule__ActivityType__Group_0__0"
    // InternalAndroidGenerator.g:2811:1: rule__ActivityType__Group_0__0 : rule__ActivityType__Group_0__0__Impl rule__ActivityType__Group_0__1 ;
    public final void rule__ActivityType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2815:1: ( rule__ActivityType__Group_0__0__Impl rule__ActivityType__Group_0__1 )
            // InternalAndroidGenerator.g:2816:2: rule__ActivityType__Group_0__0__Impl rule__ActivityType__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__ActivityType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group_0__0"


    // $ANTLR start "rule__ActivityType__Group_0__0__Impl"
    // InternalAndroidGenerator.g:2823:1: rule__ActivityType__Group_0__0__Impl : ( () ) ;
    public final void rule__ActivityType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2827:1: ( ( () ) )
            // InternalAndroidGenerator.g:2828:1: ( () )
            {
            // InternalAndroidGenerator.g:2828:1: ( () )
            // InternalAndroidGenerator.g:2829:2: ()
            {
             before(grammarAccess.getActivityTypeAccess().getTypeMapAction_0_0()); 
            // InternalAndroidGenerator.g:2830:2: ()
            // InternalAndroidGenerator.g:2830:3: 
            {
            }

             after(grammarAccess.getActivityTypeAccess().getTypeMapAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group_0__0__Impl"


    // $ANTLR start "rule__ActivityType__Group_0__1"
    // InternalAndroidGenerator.g:2838:1: rule__ActivityType__Group_0__1 : rule__ActivityType__Group_0__1__Impl ;
    public final void rule__ActivityType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2842:1: ( rule__ActivityType__Group_0__1__Impl )
            // InternalAndroidGenerator.g:2843:2: rule__ActivityType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group_0__1"


    // $ANTLR start "rule__ActivityType__Group_0__1__Impl"
    // InternalAndroidGenerator.g:2849:1: rule__ActivityType__Group_0__1__Impl : ( 'Maps' ) ;
    public final void rule__ActivityType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2853:1: ( ( 'Maps' ) )
            // InternalAndroidGenerator.g:2854:1: ( 'Maps' )
            {
            // InternalAndroidGenerator.g:2854:1: ( 'Maps' )
            // InternalAndroidGenerator.g:2855:2: 'Maps'
            {
             before(grammarAccess.getActivityTypeAccess().getMapsKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivityTypeAccess().getMapsKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group_0__1__Impl"


    // $ANTLR start "rule__ActivityType__Group_1__0"
    // InternalAndroidGenerator.g:2865:1: rule__ActivityType__Group_1__0 : rule__ActivityType__Group_1__0__Impl rule__ActivityType__Group_1__1 ;
    public final void rule__ActivityType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2869:1: ( rule__ActivityType__Group_1__0__Impl rule__ActivityType__Group_1__1 )
            // InternalAndroidGenerator.g:2870:2: rule__ActivityType__Group_1__0__Impl rule__ActivityType__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__ActivityType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group_1__0"


    // $ANTLR start "rule__ActivityType__Group_1__0__Impl"
    // InternalAndroidGenerator.g:2877:1: rule__ActivityType__Group_1__0__Impl : ( () ) ;
    public final void rule__ActivityType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2881:1: ( ( () ) )
            // InternalAndroidGenerator.g:2882:1: ( () )
            {
            // InternalAndroidGenerator.g:2882:1: ( () )
            // InternalAndroidGenerator.g:2883:2: ()
            {
             before(grammarAccess.getActivityTypeAccess().getTypeSettingAction_1_0()); 
            // InternalAndroidGenerator.g:2884:2: ()
            // InternalAndroidGenerator.g:2884:3: 
            {
            }

             after(grammarAccess.getActivityTypeAccess().getTypeSettingAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group_1__0__Impl"


    // $ANTLR start "rule__ActivityType__Group_1__1"
    // InternalAndroidGenerator.g:2892:1: rule__ActivityType__Group_1__1 : rule__ActivityType__Group_1__1__Impl ;
    public final void rule__ActivityType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2896:1: ( rule__ActivityType__Group_1__1__Impl )
            // InternalAndroidGenerator.g:2897:2: rule__ActivityType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group_1__1"


    // $ANTLR start "rule__ActivityType__Group_1__1__Impl"
    // InternalAndroidGenerator.g:2903:1: rule__ActivityType__Group_1__1__Impl : ( 'Settings' ) ;
    public final void rule__ActivityType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2907:1: ( ( 'Settings' ) )
            // InternalAndroidGenerator.g:2908:1: ( 'Settings' )
            {
            // InternalAndroidGenerator.g:2908:1: ( 'Settings' )
            // InternalAndroidGenerator.g:2909:2: 'Settings'
            {
             before(grammarAccess.getActivityTypeAccess().getSettingsKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActivityTypeAccess().getSettingsKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityType__Group_1__1__Impl"


    // $ANTLR start "rule__ActivityLayoutAttributes__Group__0"
    // InternalAndroidGenerator.g:2919:1: rule__ActivityLayoutAttributes__Group__0 : rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 ;
    public final void rule__ActivityLayoutAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2923:1: ( rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 )
            // InternalAndroidGenerator.g:2924:2: rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1
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
    // InternalAndroidGenerator.g:2931:1: rule__ActivityLayoutAttributes__Group__0__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2935:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) ) )
            // InternalAndroidGenerator.g:2936:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:2936:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) )
            // InternalAndroidGenerator.g:2937:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_0()); 
            // InternalAndroidGenerator.g:2938:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 )
            // InternalAndroidGenerator.g:2938:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_0
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
    // InternalAndroidGenerator.g:2946:1: rule__ActivityLayoutAttributes__Group__1 : rule__ActivityLayoutAttributes__Group__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2950:1: ( rule__ActivityLayoutAttributes__Group__1__Impl )
            // InternalAndroidGenerator.g:2951:2: rule__ActivityLayoutAttributes__Group__1__Impl
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
    // InternalAndroidGenerator.g:2957:1: rule__ActivityLayoutAttributes__Group__1__Impl : ( ( rule__ActivityLayoutAttributes__Group_1__0 )* ) ;
    public final void rule__ActivityLayoutAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2961:1: ( ( ( rule__ActivityLayoutAttributes__Group_1__0 )* ) )
            // InternalAndroidGenerator.g:2962:1: ( ( rule__ActivityLayoutAttributes__Group_1__0 )* )
            {
            // InternalAndroidGenerator.g:2962:1: ( ( rule__ActivityLayoutAttributes__Group_1__0 )* )
            // InternalAndroidGenerator.g:2963:2: ( rule__ActivityLayoutAttributes__Group_1__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:2964:2: ( rule__ActivityLayoutAttributes__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==12) ) {
                    int LA22_2 = input.LA(2);

                    if ( ((LA22_2>=26 && LA22_2<=27)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2964:3: rule__ActivityLayoutAttributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ActivityLayoutAttributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalAndroidGenerator.g:2973:1: rule__ActivityLayoutAttributes__Group_1__0 : rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1 ;
    public final void rule__ActivityLayoutAttributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2977:1: ( rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1 )
            // InternalAndroidGenerator.g:2978:2: rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAndroidGenerator.g:2985:1: rule__ActivityLayoutAttributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ActivityLayoutAttributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2989:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:2990:1: ( ',' )
            {
            // InternalAndroidGenerator.g:2990:1: ( ',' )
            // InternalAndroidGenerator.g:2991:2: ','
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
    // InternalAndroidGenerator.g:3000:1: rule__ActivityLayoutAttributes__Group_1__1 : rule__ActivityLayoutAttributes__Group_1__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3004:1: ( rule__ActivityLayoutAttributes__Group_1__1__Impl )
            // InternalAndroidGenerator.g:3005:2: rule__ActivityLayoutAttributes__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:3011:1: rule__ActivityLayoutAttributes__Group_1__1__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3015:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:3016:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:3016:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) )
            // InternalAndroidGenerator.g:3017:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_1_1()); 
            // InternalAndroidGenerator.g:3018:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 )
            // InternalAndroidGenerator.g:3018:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1
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
    // InternalAndroidGenerator.g:3027:1: rule__TextView__Group__0 : rule__TextView__Group__0__Impl rule__TextView__Group__1 ;
    public final void rule__TextView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3031:1: ( rule__TextView__Group__0__Impl rule__TextView__Group__1 )
            // InternalAndroidGenerator.g:3032:2: rule__TextView__Group__0__Impl rule__TextView__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAndroidGenerator.g:3039:1: rule__TextView__Group__0__Impl : ( () ) ;
    public final void rule__TextView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3043:1: ( ( () ) )
            // InternalAndroidGenerator.g:3044:1: ( () )
            {
            // InternalAndroidGenerator.g:3044:1: ( () )
            // InternalAndroidGenerator.g:3045:2: ()
            {
             before(grammarAccess.getTextViewAccess().getTextViewAction_0()); 
            // InternalAndroidGenerator.g:3046:2: ()
            // InternalAndroidGenerator.g:3046:3: 
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
    // InternalAndroidGenerator.g:3054:1: rule__TextView__Group__1 : rule__TextView__Group__1__Impl rule__TextView__Group__2 ;
    public final void rule__TextView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3058:1: ( rule__TextView__Group__1__Impl rule__TextView__Group__2 )
            // InternalAndroidGenerator.g:3059:2: rule__TextView__Group__1__Impl rule__TextView__Group__2
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
    // InternalAndroidGenerator.g:3066:1: rule__TextView__Group__1__Impl : ( 'TextView' ) ;
    public final void rule__TextView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3070:1: ( ( 'TextView' ) )
            // InternalAndroidGenerator.g:3071:1: ( 'TextView' )
            {
            // InternalAndroidGenerator.g:3071:1: ( 'TextView' )
            // InternalAndroidGenerator.g:3072:2: 'TextView'
            {
             before(grammarAccess.getTextViewAccess().getTextViewKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3081:1: rule__TextView__Group__2 : rule__TextView__Group__2__Impl ;
    public final void rule__TextView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3085:1: ( rule__TextView__Group__2__Impl )
            // InternalAndroidGenerator.g:3086:2: rule__TextView__Group__2__Impl
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
    // InternalAndroidGenerator.g:3092:1: rule__TextView__Group__2__Impl : ( ( rule__TextView__NameAssignment_2 ) ) ;
    public final void rule__TextView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3096:1: ( ( ( rule__TextView__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3097:1: ( ( rule__TextView__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3097:1: ( ( rule__TextView__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:3098:2: ( rule__TextView__NameAssignment_2 )
            {
             before(grammarAccess.getTextViewAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:3099:2: ( rule__TextView__NameAssignment_2 )
            // InternalAndroidGenerator.g:3099:3: rule__TextView__NameAssignment_2
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
    // InternalAndroidGenerator.g:3108:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3112:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalAndroidGenerator.g:3113:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAndroidGenerator.g:3120:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3124:1: ( ( () ) )
            // InternalAndroidGenerator.g:3125:1: ( () )
            {
            // InternalAndroidGenerator.g:3125:1: ( () )
            // InternalAndroidGenerator.g:3126:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalAndroidGenerator.g:3127:2: ()
            // InternalAndroidGenerator.g:3127:3: 
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
    // InternalAndroidGenerator.g:3135:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3139:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalAndroidGenerator.g:3140:2: rule__Button__Group__1__Impl rule__Button__Group__2
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
    // InternalAndroidGenerator.g:3147:1: rule__Button__Group__1__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3151:1: ( ( 'Button' ) )
            // InternalAndroidGenerator.g:3152:1: ( 'Button' )
            {
            // InternalAndroidGenerator.g:3152:1: ( 'Button' )
            // InternalAndroidGenerator.g:3153:2: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3162:1: rule__Button__Group__2 : rule__Button__Group__2__Impl ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3166:1: ( rule__Button__Group__2__Impl )
            // InternalAndroidGenerator.g:3167:2: rule__Button__Group__2__Impl
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
    // InternalAndroidGenerator.g:3173:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3177:1: ( ( ( rule__Button__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3178:1: ( ( rule__Button__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3178:1: ( ( rule__Button__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:3179:2: ( rule__Button__NameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:3180:2: ( rule__Button__NameAssignment_2 )
            // InternalAndroidGenerator.g:3180:3: rule__Button__NameAssignment_2
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
    // InternalAndroidGenerator.g:3189:1: rule__FilterQuery__Group__0 : rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 ;
    public final void rule__FilterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3193:1: ( rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 )
            // InternalAndroidGenerator.g:3194:2: rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1
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
    // InternalAndroidGenerator.g:3201:1: rule__FilterQuery__Group__0__Impl : ( () ) ;
    public final void rule__FilterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3205:1: ( ( () ) )
            // InternalAndroidGenerator.g:3206:1: ( () )
            {
            // InternalAndroidGenerator.g:3206:1: ( () )
            // InternalAndroidGenerator.g:3207:2: ()
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryAction_0()); 
            // InternalAndroidGenerator.g:3208:2: ()
            // InternalAndroidGenerator.g:3208:3: 
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
    // InternalAndroidGenerator.g:3216:1: rule__FilterQuery__Group__1 : rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 ;
    public final void rule__FilterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3220:1: ( rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 )
            // InternalAndroidGenerator.g:3221:2: rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2
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
    // InternalAndroidGenerator.g:3228:1: rule__FilterQuery__Group__1__Impl : ( 'FilterQuery' ) ;
    public final void rule__FilterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3232:1: ( ( 'FilterQuery' ) )
            // InternalAndroidGenerator.g:3233:1: ( 'FilterQuery' )
            {
            // InternalAndroidGenerator.g:3233:1: ( 'FilterQuery' )
            // InternalAndroidGenerator.g:3234:2: 'FilterQuery'
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3243:1: rule__FilterQuery__Group__2 : rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 ;
    public final void rule__FilterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3247:1: ( rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 )
            // InternalAndroidGenerator.g:3248:2: rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalAndroidGenerator.g:3255:1: rule__FilterQuery__Group__2__Impl : ( ( rule__FilterQuery__NameAssignment_2 ) ) ;
    public final void rule__FilterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3259:1: ( ( ( rule__FilterQuery__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3260:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3260:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:3261:2: ( rule__FilterQuery__NameAssignment_2 )
            {
             before(grammarAccess.getFilterQueryAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:3262:2: ( rule__FilterQuery__NameAssignment_2 )
            // InternalAndroidGenerator.g:3262:3: rule__FilterQuery__NameAssignment_2
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
    // InternalAndroidGenerator.g:3270:1: rule__FilterQuery__Group__3 : rule__FilterQuery__Group__3__Impl ;
    public final void rule__FilterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3274:1: ( rule__FilterQuery__Group__3__Impl )
            // InternalAndroidGenerator.g:3275:2: rule__FilterQuery__Group__3__Impl
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
    // InternalAndroidGenerator.g:3281:1: rule__FilterQuery__Group__3__Impl : ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) ;
    public final void rule__FilterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3285:1: ( ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) )
            // InternalAndroidGenerator.g:3286:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:3286:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            // InternalAndroidGenerator.g:3287:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            {
             before(grammarAccess.getFilterQueryAccess().getFilterAttributesAssignment_3()); 
            // InternalAndroidGenerator.g:3288:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            // InternalAndroidGenerator.g:3288:3: rule__FilterQuery__FilterAttributesAssignment_3
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
    // InternalAndroidGenerator.g:3297:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3301:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // InternalAndroidGenerator.g:3302:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
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
    // InternalAndroidGenerator.g:3309:1: rule__Distance__Group__0__Impl : ( 'Distance' ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3313:1: ( ( 'Distance' ) )
            // InternalAndroidGenerator.g:3314:1: ( 'Distance' )
            {
            // InternalAndroidGenerator.g:3314:1: ( 'Distance' )
            // InternalAndroidGenerator.g:3315:2: 'Distance'
            {
             before(grammarAccess.getDistanceAccess().getDistanceKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3324:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl rule__Distance__Group__2 ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3328:1: ( rule__Distance__Group__1__Impl rule__Distance__Group__2 )
            // InternalAndroidGenerator.g:3329:2: rule__Distance__Group__1__Impl rule__Distance__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAndroidGenerator.g:3336:1: rule__Distance__Group__1__Impl : ( ':' ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3340:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:3341:1: ( ':' )
            {
            // InternalAndroidGenerator.g:3341:1: ( ':' )
            // InternalAndroidGenerator.g:3342:2: ':'
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
    // InternalAndroidGenerator.g:3351:1: rule__Distance__Group__2 : rule__Distance__Group__2__Impl rule__Distance__Group__3 ;
    public final void rule__Distance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3355:1: ( rule__Distance__Group__2__Impl rule__Distance__Group__3 )
            // InternalAndroidGenerator.g:3356:2: rule__Distance__Group__2__Impl rule__Distance__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalAndroidGenerator.g:3363:1: rule__Distance__Group__2__Impl : ( ( rule__Distance__UnitAssignment_2 ) ) ;
    public final void rule__Distance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3367:1: ( ( ( rule__Distance__UnitAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3368:1: ( ( rule__Distance__UnitAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3368:1: ( ( rule__Distance__UnitAssignment_2 ) )
            // InternalAndroidGenerator.g:3369:2: ( rule__Distance__UnitAssignment_2 )
            {
             before(grammarAccess.getDistanceAccess().getUnitAssignment_2()); 
            // InternalAndroidGenerator.g:3370:2: ( rule__Distance__UnitAssignment_2 )
            // InternalAndroidGenerator.g:3370:3: rule__Distance__UnitAssignment_2
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
    // InternalAndroidGenerator.g:3378:1: rule__Distance__Group__3 : rule__Distance__Group__3__Impl rule__Distance__Group__4 ;
    public final void rule__Distance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3382:1: ( rule__Distance__Group__3__Impl rule__Distance__Group__4 )
            // InternalAndroidGenerator.g:3383:2: rule__Distance__Group__3__Impl rule__Distance__Group__4
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
    // InternalAndroidGenerator.g:3390:1: rule__Distance__Group__3__Impl : ( ( rule__Distance__OperatorAssignment_3 ) ) ;
    public final void rule__Distance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3394:1: ( ( ( rule__Distance__OperatorAssignment_3 ) ) )
            // InternalAndroidGenerator.g:3395:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:3395:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            // InternalAndroidGenerator.g:3396:2: ( rule__Distance__OperatorAssignment_3 )
            {
             before(grammarAccess.getDistanceAccess().getOperatorAssignment_3()); 
            // InternalAndroidGenerator.g:3397:2: ( rule__Distance__OperatorAssignment_3 )
            // InternalAndroidGenerator.g:3397:3: rule__Distance__OperatorAssignment_3
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
    // InternalAndroidGenerator.g:3405:1: rule__Distance__Group__4 : rule__Distance__Group__4__Impl ;
    public final void rule__Distance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3409:1: ( rule__Distance__Group__4__Impl )
            // InternalAndroidGenerator.g:3410:2: rule__Distance__Group__4__Impl
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
    // InternalAndroidGenerator.g:3416:1: rule__Distance__Group__4__Impl : ( ( rule__Distance__ResultsAssignment_4 ) ) ;
    public final void rule__Distance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3420:1: ( ( ( rule__Distance__ResultsAssignment_4 ) ) )
            // InternalAndroidGenerator.g:3421:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            {
            // InternalAndroidGenerator.g:3421:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            // InternalAndroidGenerator.g:3422:2: ( rule__Distance__ResultsAssignment_4 )
            {
             before(grammarAccess.getDistanceAccess().getResultsAssignment_4()); 
            // InternalAndroidGenerator.g:3423:2: ( rule__Distance__ResultsAssignment_4 )
            // InternalAndroidGenerator.g:3423:3: rule__Distance__ResultsAssignment_4
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
    // InternalAndroidGenerator.g:3432:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
    public final void rule__Operator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3436:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
            // InternalAndroidGenerator.g:3437:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAndroidGenerator.g:3444:1: rule__Operator__Group_0__0__Impl : ( () ) ;
    public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3448:1: ( ( () ) )
            // InternalAndroidGenerator.g:3449:1: ( () )
            {
            // InternalAndroidGenerator.g:3449:1: ( () )
            // InternalAndroidGenerator.g:3450:2: ()
            {
             before(grammarAccess.getOperatorAccess().getLessAction_0_0()); 
            // InternalAndroidGenerator.g:3451:2: ()
            // InternalAndroidGenerator.g:3451:3: 
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
    // InternalAndroidGenerator.g:3459:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl ;
    public final void rule__Operator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3463:1: ( rule__Operator__Group_0__1__Impl )
            // InternalAndroidGenerator.g:3464:2: rule__Operator__Group_0__1__Impl
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
    // InternalAndroidGenerator.g:3470:1: rule__Operator__Group_0__1__Impl : ( '>' ) ;
    public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3474:1: ( ( '>' ) )
            // InternalAndroidGenerator.g:3475:1: ( '>' )
            {
            // InternalAndroidGenerator.g:3475:1: ( '>' )
            // InternalAndroidGenerator.g:3476:2: '>'
            {
             before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3486:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3490:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalAndroidGenerator.g:3491:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAndroidGenerator.g:3498:1: rule__Operator__Group_1__0__Impl : ( () ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3502:1: ( ( () ) )
            // InternalAndroidGenerator.g:3503:1: ( () )
            {
            // InternalAndroidGenerator.g:3503:1: ( () )
            // InternalAndroidGenerator.g:3504:2: ()
            {
             before(grammarAccess.getOperatorAccess().getMoreAction_1_0()); 
            // InternalAndroidGenerator.g:3505:2: ()
            // InternalAndroidGenerator.g:3505:3: 
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
    // InternalAndroidGenerator.g:3513:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3517:1: ( rule__Operator__Group_1__1__Impl )
            // InternalAndroidGenerator.g:3518:2: rule__Operator__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:3524:1: rule__Operator__Group_1__1__Impl : ( '<' ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3528:1: ( ( '<' ) )
            // InternalAndroidGenerator.g:3529:1: ( '<' )
            {
            // InternalAndroidGenerator.g:3529:1: ( '<' )
            // InternalAndroidGenerator.g:3530:2: '<'
            {
             before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3540:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3544:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalAndroidGenerator.g:3545:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAndroidGenerator.g:3552:1: rule__Operator__Group_2__0__Impl : ( () ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3556:1: ( ( () ) )
            // InternalAndroidGenerator.g:3557:1: ( () )
            {
            // InternalAndroidGenerator.g:3557:1: ( () )
            // InternalAndroidGenerator.g:3558:2: ()
            {
             before(grammarAccess.getOperatorAccess().getEqualAction_2_0()); 
            // InternalAndroidGenerator.g:3559:2: ()
            // InternalAndroidGenerator.g:3559:3: 
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
    // InternalAndroidGenerator.g:3567:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3571:1: ( rule__Operator__Group_2__1__Impl )
            // InternalAndroidGenerator.g:3572:2: rule__Operator__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:3578:1: rule__Operator__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3582:1: ( ( '=' ) )
            // InternalAndroidGenerator.g:3583:1: ( '=' )
            {
            // InternalAndroidGenerator.g:3583:1: ( '=' )
            // InternalAndroidGenerator.g:3584:2: '='
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3594:1: rule__Unit__Group_0__0 : rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 ;
    public final void rule__Unit__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3598:1: ( rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 )
            // InternalAndroidGenerator.g:3599:2: rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAndroidGenerator.g:3606:1: rule__Unit__Group_0__0__Impl : ( () ) ;
    public final void rule__Unit__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3610:1: ( ( () ) )
            // InternalAndroidGenerator.g:3611:1: ( () )
            {
            // InternalAndroidGenerator.g:3611:1: ( () )
            // InternalAndroidGenerator.g:3612:2: ()
            {
             before(grammarAccess.getUnitAccess().getMetersAction_0_0()); 
            // InternalAndroidGenerator.g:3613:2: ()
            // InternalAndroidGenerator.g:3613:3: 
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
    // InternalAndroidGenerator.g:3621:1: rule__Unit__Group_0__1 : rule__Unit__Group_0__1__Impl ;
    public final void rule__Unit__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3625:1: ( rule__Unit__Group_0__1__Impl )
            // InternalAndroidGenerator.g:3626:2: rule__Unit__Group_0__1__Impl
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
    // InternalAndroidGenerator.g:3632:1: rule__Unit__Group_0__1__Impl : ( 'm' ) ;
    public final void rule__Unit__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3636:1: ( ( 'm' ) )
            // InternalAndroidGenerator.g:3637:1: ( 'm' )
            {
            // InternalAndroidGenerator.g:3637:1: ( 'm' )
            // InternalAndroidGenerator.g:3638:2: 'm'
            {
             before(grammarAccess.getUnitAccess().getMKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3648:1: rule__Unit__Group_1__0 : rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 ;
    public final void rule__Unit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3652:1: ( rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 )
            // InternalAndroidGenerator.g:3653:2: rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAndroidGenerator.g:3660:1: rule__Unit__Group_1__0__Impl : ( () ) ;
    public final void rule__Unit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3664:1: ( ( () ) )
            // InternalAndroidGenerator.g:3665:1: ( () )
            {
            // InternalAndroidGenerator.g:3665:1: ( () )
            // InternalAndroidGenerator.g:3666:2: ()
            {
             before(grammarAccess.getUnitAccess().getImperialAction_1_0()); 
            // InternalAndroidGenerator.g:3667:2: ()
            // InternalAndroidGenerator.g:3667:3: 
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
    // InternalAndroidGenerator.g:3675:1: rule__Unit__Group_1__1 : rule__Unit__Group_1__1__Impl ;
    public final void rule__Unit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3679:1: ( rule__Unit__Group_1__1__Impl )
            // InternalAndroidGenerator.g:3680:2: rule__Unit__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:3686:1: rule__Unit__Group_1__1__Impl : ( 'f' ) ;
    public final void rule__Unit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3690:1: ( ( 'f' ) )
            // InternalAndroidGenerator.g:3691:1: ( 'f' )
            {
            // InternalAndroidGenerator.g:3691:1: ( 'f' )
            // InternalAndroidGenerator.g:3692:2: 'f'
            {
             before(grammarAccess.getUnitAccess().getFKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3702:1: rule__AndroidAppProject__ApplicationsAssignment_0 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3706:1: ( ( ruleApplication ) )
            // InternalAndroidGenerator.g:3707:2: ( ruleApplication )
            {
            // InternalAndroidGenerator.g:3707:2: ( ruleApplication )
            // InternalAndroidGenerator.g:3708:3: ruleApplication
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
    // InternalAndroidGenerator.g:3717:1: rule__AndroidAppProject__ApplicationsAssignment_1_1 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3721:1: ( ( ruleApplication ) )
            // InternalAndroidGenerator.g:3722:2: ( ruleApplication )
            {
            // InternalAndroidGenerator.g:3722:2: ( ruleApplication )
            // InternalAndroidGenerator.g:3723:3: ruleApplication
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
    // InternalAndroidGenerator.g:3732:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3736:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3737:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3737:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3738:3: RULE_ID
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
    // InternalAndroidGenerator.g:3747:1: rule__Application__AttributesAssignment_2 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3751:1: ( ( ruleApplicationAttribute ) )
            // InternalAndroidGenerator.g:3752:2: ( ruleApplicationAttribute )
            {
            // InternalAndroidGenerator.g:3752:2: ( ruleApplicationAttribute )
            // InternalAndroidGenerator.g:3753:3: ruleApplicationAttribute
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
    // InternalAndroidGenerator.g:3762:1: rule__ApplicationVersion__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__ApplicationVersion__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3766:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3767:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3767:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3768:3: ruleNumber
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
    // InternalAndroidGenerator.g:3777:1: rule__ApplicationVersion__TargetsdkAssignment_4 : ( ruleTargetSDK ) ;
    public final void rule__ApplicationVersion__TargetsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3781:1: ( ( ruleTargetSDK ) )
            // InternalAndroidGenerator.g:3782:2: ( ruleTargetSDK )
            {
            // InternalAndroidGenerator.g:3782:2: ( ruleTargetSDK )
            // InternalAndroidGenerator.g:3783:3: ruleTargetSDK
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
    // InternalAndroidGenerator.g:3792:1: rule__TargetSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__TargetSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3796:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3797:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3797:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3798:3: ruleNumber
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
    // InternalAndroidGenerator.g:3807:1: rule__TargetSDK__MinsdkAssignment_4 : ( ruleMinSDK ) ;
    public final void rule__TargetSDK__MinsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3811:1: ( ( ruleMinSDK ) )
            // InternalAndroidGenerator.g:3812:2: ( ruleMinSDK )
            {
            // InternalAndroidGenerator.g:3812:2: ( ruleMinSDK )
            // InternalAndroidGenerator.g:3813:3: ruleMinSDK
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
    // InternalAndroidGenerator.g:3822:1: rule__MinSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__MinSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3826:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3827:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3827:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3828:3: ruleNumber
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
    // InternalAndroidGenerator.g:3837:1: rule__ApplicationPermissionList__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3841:1: ( ( rulePermission ) )
            // InternalAndroidGenerator.g:3842:2: ( rulePermission )
            {
            // InternalAndroidGenerator.g:3842:2: ( rulePermission )
            // InternalAndroidGenerator.g:3843:3: rulePermission
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
    // InternalAndroidGenerator.g:3852:1: rule__ApplicationPermissionList__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3856:1: ( ( rulePermission ) )
            // InternalAndroidGenerator.g:3857:2: ( rulePermission )
            {
            // InternalAndroidGenerator.g:3857:2: ( rulePermission )
            // InternalAndroidGenerator.g:3858:3: rulePermission
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
    // InternalAndroidGenerator.g:3867:1: rule__Permission__NameAssignment : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Permission__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3871:1: ( ( RULE_PACKAGE_NAME ) )
            // InternalAndroidGenerator.g:3872:2: ( RULE_PACKAGE_NAME )
            {
            // InternalAndroidGenerator.g:3872:2: ( RULE_PACKAGE_NAME )
            // InternalAndroidGenerator.g:3873:3: RULE_PACKAGE_NAME
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
    // InternalAndroidGenerator.g:3882:1: rule__ApplicationElementList__ElementsAssignment_2 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3886:1: ( ( ruleApplicationElement ) )
            // InternalAndroidGenerator.g:3887:2: ( ruleApplicationElement )
            {
            // InternalAndroidGenerator.g:3887:2: ( ruleApplicationElement )
            // InternalAndroidGenerator.g:3888:3: ruleApplicationElement
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
    // InternalAndroidGenerator.g:3897:1: rule__ApplicationMainActivity__LauncherActivityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationMainActivity__LauncherActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3901:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGenerator.g:3902:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGenerator.g:3902:2: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3903:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0()); 
            // InternalAndroidGenerator.g:3904:3: ( RULE_ID )
            // InternalAndroidGenerator.g:3905:4: RULE_ID
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
    // InternalAndroidGenerator.g:3916:1: rule__Model__ActivityTypeAssignment_2_1 : ( ruleActivityType ) ;
    public final void rule__Model__ActivityTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3920:1: ( ( ruleActivityType ) )
            // InternalAndroidGenerator.g:3921:2: ( ruleActivityType )
            {
            // InternalAndroidGenerator.g:3921:2: ( ruleActivityType )
            // InternalAndroidGenerator.g:3922:3: ruleActivityType
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
    // InternalAndroidGenerator.g:3931:1: rule__Model__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3935:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3936:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3936:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3937:3: RULE_ID
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
    // InternalAndroidGenerator.g:3946:1: rule__Model__ModellistAssignment_4 : ( ruleModelList ) ;
    public final void rule__Model__ModellistAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3950:1: ( ( ruleModelList ) )
            // InternalAndroidGenerator.g:3951:2: ( ruleModelList )
            {
            // InternalAndroidGenerator.g:3951:2: ( ruleModelList )
            // InternalAndroidGenerator.g:3952:3: ruleModelList
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
    // InternalAndroidGenerator.g:3961:1: rule__ModelList__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__ModelList__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3965:1: ( ( ruleType ) )
            // InternalAndroidGenerator.g:3966:2: ( ruleType )
            {
            // InternalAndroidGenerator.g:3966:2: ( ruleType )
            // InternalAndroidGenerator.g:3967:3: ruleType
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
    // InternalAndroidGenerator.g:3976:1: rule__ModelList__GetsetAssignment_2 : ( ruleGetSet ) ;
    public final void rule__ModelList__GetsetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3980:1: ( ( ruleGetSet ) )
            // InternalAndroidGenerator.g:3981:2: ( ruleGetSet )
            {
            // InternalAndroidGenerator.g:3981:2: ( ruleGetSet )
            // InternalAndroidGenerator.g:3982:3: ruleGetSet
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
    // InternalAndroidGenerator.g:3991:1: rule__ModelList__TypeAssignment_3_1 : ( ruleType ) ;
    public final void rule__ModelList__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3995:1: ( ( ruleType ) )
            // InternalAndroidGenerator.g:3996:2: ( ruleType )
            {
            // InternalAndroidGenerator.g:3996:2: ( ruleType )
            // InternalAndroidGenerator.g:3997:3: ruleType
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
    // InternalAndroidGenerator.g:4006:1: rule__ModelList__GetsetAssignment_3_3 : ( ruleGetSet ) ;
    public final void rule__ModelList__GetsetAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4010:1: ( ( ruleGetSet ) )
            // InternalAndroidGenerator.g:4011:2: ( ruleGetSet )
            {
            // InternalAndroidGenerator.g:4011:2: ( ruleGetSet )
            // InternalAndroidGenerator.g:4012:3: ruleGetSet
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
    // InternalAndroidGenerator.g:4021:1: rule__GetSet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GetSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4025:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4026:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4026:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4027:3: RULE_ID
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
    // InternalAndroidGenerator.g:4036:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4040:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4041:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4041:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4042:3: RULE_ID
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


    // $ANTLR start "rule__Fragment__ActivityTypeAssignment_2_1"
    // InternalAndroidGenerator.g:4051:1: rule__Fragment__ActivityTypeAssignment_2_1 : ( ruleActivityType ) ;
    public final void rule__Fragment__ActivityTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4055:1: ( ( ruleActivityType ) )
            // InternalAndroidGenerator.g:4056:2: ( ruleActivityType )
            {
            // InternalAndroidGenerator.g:4056:2: ( ruleActivityType )
            // InternalAndroidGenerator.g:4057:3: ruleActivityType
            {
             before(grammarAccess.getFragmentAccess().getActivityTypeActivityTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityType();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getActivityTypeActivityTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__ActivityTypeAssignment_2_1"


    // $ANTLR start "rule__Fragment__NameAssignment_3"
    // InternalAndroidGenerator.g:4066:1: rule__Fragment__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4070:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4071:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4071:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4072:3: RULE_ID
            {
             before(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__NameAssignment_3"


    // $ANTLR start "rule__Fragment__ActivityAttributesAssignment_4"
    // InternalAndroidGenerator.g:4081:1: rule__Fragment__ActivityAttributesAssignment_4 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Fragment__ActivityAttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4085:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGenerator.g:4086:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGenerator.g:4086:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGenerator.g:4087:3: ruleActivityLayoutAttributes
            {
             before(grammarAccess.getFragmentAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityLayoutAttributes();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fragment__ActivityAttributesAssignment_4"


    // $ANTLR start "rule__Activity__ActivityTypeAssignment_0_2_1"
    // InternalAndroidGenerator.g:4096:1: rule__Activity__ActivityTypeAssignment_0_2_1 : ( ruleActivityType ) ;
    public final void rule__Activity__ActivityTypeAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4100:1: ( ( ruleActivityType ) )
            // InternalAndroidGenerator.g:4101:2: ( ruleActivityType )
            {
            // InternalAndroidGenerator.g:4101:2: ( ruleActivityType )
            // InternalAndroidGenerator.g:4102:3: ruleActivityType
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
    // InternalAndroidGenerator.g:4111:1: rule__Activity__NameAssignment_0_2_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4115:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4116:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4116:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4117:3: RULE_ID
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
    // InternalAndroidGenerator.g:4126:1: rule__Activity__ActivityTypeAttributesAssignment_0_2_3 : ( ruleActivityTypeAttributes ) ;
    public final void rule__Activity__ActivityTypeAttributesAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4130:1: ( ( ruleActivityTypeAttributes ) )
            // InternalAndroidGenerator.g:4131:2: ( ruleActivityTypeAttributes )
            {
            // InternalAndroidGenerator.g:4131:2: ( ruleActivityTypeAttributes )
            // InternalAndroidGenerator.g:4132:3: ruleActivityTypeAttributes
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
    // InternalAndroidGenerator.g:4141:1: rule__Activity__ActivityAttributesAssignment_0_2_4 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Activity__ActivityAttributesAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4145:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGenerator.g:4146:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGenerator.g:4146:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGenerator.g:4147:3: ruleActivityLayoutAttributes
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
    // InternalAndroidGenerator.g:4156:1: rule__Activity__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4160:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4161:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4161:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4162:3: RULE_ID
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
    // InternalAndroidGenerator.g:4171:1: rule__Activity__ActivityAttributesAssignment_1_3 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Activity__ActivityAttributesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4175:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGenerator.g:4176:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGenerator.g:4176:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGenerator.g:4177:3: ruleActivityLayoutAttributes
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
    // InternalAndroidGenerator.g:4186:1: rule__ActivityTypeAttributes__FilterAssignment : ( ruleFilterQuery ) ;
    public final void rule__ActivityTypeAttributes__FilterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4190:1: ( ( ruleFilterQuery ) )
            // InternalAndroidGenerator.g:4191:2: ( ruleFilterQuery )
            {
            // InternalAndroidGenerator.g:4191:2: ( ruleFilterQuery )
            // InternalAndroidGenerator.g:4192:3: ruleFilterQuery
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
    // InternalAndroidGenerator.g:4201:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4205:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGenerator.g:4206:2: ( ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:4206:2: ( ruleLayoutElement )
            // InternalAndroidGenerator.g:4207:3: ruleLayoutElement
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
    // InternalAndroidGenerator.g:4216:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4220:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGenerator.g:4221:2: ( ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:4221:2: ( ruleLayoutElement )
            // InternalAndroidGenerator.g:4222:3: ruleLayoutElement
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
    // InternalAndroidGenerator.g:4231:1: rule__TextView__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TextView__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4235:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4236:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4236:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4237:3: RULE_ID
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
    // InternalAndroidGenerator.g:4246:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4250:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4251:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4251:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4252:3: RULE_ID
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
    // InternalAndroidGenerator.g:4261:1: rule__FilterQuery__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FilterQuery__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4265:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:4266:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:4266:2: ( RULE_ID )
            // InternalAndroidGenerator.g:4267:3: RULE_ID
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
    // InternalAndroidGenerator.g:4276:1: rule__FilterQuery__FilterAttributesAssignment_3 : ( ruleFilterAttributes ) ;
    public final void rule__FilterQuery__FilterAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4280:1: ( ( ruleFilterAttributes ) )
            // InternalAndroidGenerator.g:4281:2: ( ruleFilterAttributes )
            {
            // InternalAndroidGenerator.g:4281:2: ( ruleFilterAttributes )
            // InternalAndroidGenerator.g:4282:3: ruleFilterAttributes
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
    // InternalAndroidGenerator.g:4291:1: rule__FilterAttributes__DistanceAssignment : ( ruleDistance ) ;
    public final void rule__FilterAttributes__DistanceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4295:1: ( ( ruleDistance ) )
            // InternalAndroidGenerator.g:4296:2: ( ruleDistance )
            {
            // InternalAndroidGenerator.g:4296:2: ( ruleDistance )
            // InternalAndroidGenerator.g:4297:3: ruleDistance
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
    // InternalAndroidGenerator.g:4306:1: rule__Distance__UnitAssignment_2 : ( ruleUnit ) ;
    public final void rule__Distance__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4310:1: ( ( ruleUnit ) )
            // InternalAndroidGenerator.g:4311:2: ( ruleUnit )
            {
            // InternalAndroidGenerator.g:4311:2: ( ruleUnit )
            // InternalAndroidGenerator.g:4312:3: ruleUnit
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
    // InternalAndroidGenerator.g:4321:1: rule__Distance__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__Distance__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4325:1: ( ( ruleOperator ) )
            // InternalAndroidGenerator.g:4326:2: ( ruleOperator )
            {
            // InternalAndroidGenerator.g:4326:2: ( ruleOperator )
            // InternalAndroidGenerator.g:4327:3: ruleOperator
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
    // InternalAndroidGenerator.g:4336:1: rule__Distance__ResultsAssignment_4 : ( ruleNumber ) ;
    public final void rule__Distance__ResultsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4340:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:4341:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:4341:2: ( ruleNumber )
            // InternalAndroidGenerator.g:4342:3: ruleNumber
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
    // InternalAndroidGenerator.g:4351:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4355:1: ( ( RULE_INT ) )
            // InternalAndroidGenerator.g:4356:2: ( RULE_INT )
            {
            // InternalAndroidGenerator.g:4356:2: ( RULE_INT )
            // InternalAndroidGenerator.g:4357:3: RULE_INT
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});

}