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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PACKAGE_NAME", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'Application'", "'Android-SDK'", "':'", "'Target-SDK'", "'Minimum-SDK'", "'permissions'", "'elements'", "'Model'", "'Fragment'", "'Map'", "'Settings'", "'EditText'", "'Spinner'", "'Textfield'", "'Button'", "'Toast'", "'Bundle'", "'Holder'", "'FilterQuery'", "'Distance'", "'>'", "'<'", "'='", "'m'", "'f'"
    };
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


    // $ANTLR start "entryRuleDataholders"
    // InternalAndroidGenerator.g:403:1: entryRuleDataholders : ruleDataholders EOF ;
    public final void entryRuleDataholders() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:404:1: ( ruleDataholders EOF )
            // InternalAndroidGenerator.g:405:1: ruleDataholders EOF
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
    // InternalAndroidGenerator.g:412:1: ruleDataholders : ( ( rule__Dataholders__Alternatives ) ) ;
    public final void ruleDataholders() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:416:2: ( ( ( rule__Dataholders__Alternatives ) ) )
            // InternalAndroidGenerator.g:417:2: ( ( rule__Dataholders__Alternatives ) )
            {
            // InternalAndroidGenerator.g:417:2: ( ( rule__Dataholders__Alternatives ) )
            // InternalAndroidGenerator.g:418:3: ( rule__Dataholders__Alternatives )
            {
             before(grammarAccess.getDataholdersAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:419:3: ( rule__Dataholders__Alternatives )
            // InternalAndroidGenerator.g:419:4: rule__Dataholders__Alternatives
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
    // InternalAndroidGenerator.g:428:1: entryRuleTypeMap : ruleTypeMap EOF ;
    public final void entryRuleTypeMap() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:429:1: ( ruleTypeMap EOF )
            // InternalAndroidGenerator.g:430:1: ruleTypeMap EOF
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
    // InternalAndroidGenerator.g:437:1: ruleTypeMap : ( ( rule__TypeMap__Group__0 ) ) ;
    public final void ruleTypeMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:441:2: ( ( ( rule__TypeMap__Group__0 ) ) )
            // InternalAndroidGenerator.g:442:2: ( ( rule__TypeMap__Group__0 ) )
            {
            // InternalAndroidGenerator.g:442:2: ( ( rule__TypeMap__Group__0 ) )
            // InternalAndroidGenerator.g:443:3: ( rule__TypeMap__Group__0 )
            {
             before(grammarAccess.getTypeMapAccess().getGroup()); 
            // InternalAndroidGenerator.g:444:3: ( rule__TypeMap__Group__0 )
            // InternalAndroidGenerator.g:444:4: rule__TypeMap__Group__0
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
    // InternalAndroidGenerator.g:453:1: entryRuleTypeSetting : ruleTypeSetting EOF ;
    public final void entryRuleTypeSetting() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:454:1: ( ruleTypeSetting EOF )
            // InternalAndroidGenerator.g:455:1: ruleTypeSetting EOF
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
    // InternalAndroidGenerator.g:462:1: ruleTypeSetting : ( ( rule__TypeSetting__Group__0 ) ) ;
    public final void ruleTypeSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:466:2: ( ( ( rule__TypeSetting__Group__0 ) ) )
            // InternalAndroidGenerator.g:467:2: ( ( rule__TypeSetting__Group__0 ) )
            {
            // InternalAndroidGenerator.g:467:2: ( ( rule__TypeSetting__Group__0 ) )
            // InternalAndroidGenerator.g:468:3: ( rule__TypeSetting__Group__0 )
            {
             before(grammarAccess.getTypeSettingAccess().getGroup()); 
            // InternalAndroidGenerator.g:469:3: ( rule__TypeSetting__Group__0 )
            // InternalAndroidGenerator.g:469:4: rule__TypeSetting__Group__0
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


    // $ANTLR start "entryRuleEditText"
    // InternalAndroidGenerator.g:503:1: entryRuleEditText : ruleEditText EOF ;
    public final void entryRuleEditText() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:504:1: ( ruleEditText EOF )
            // InternalAndroidGenerator.g:505:1: ruleEditText EOF
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
    // InternalAndroidGenerator.g:512:1: ruleEditText : ( ( rule__EditText__Group__0 ) ) ;
    public final void ruleEditText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:516:2: ( ( ( rule__EditText__Group__0 ) ) )
            // InternalAndroidGenerator.g:517:2: ( ( rule__EditText__Group__0 ) )
            {
            // InternalAndroidGenerator.g:517:2: ( ( rule__EditText__Group__0 ) )
            // InternalAndroidGenerator.g:518:3: ( rule__EditText__Group__0 )
            {
             before(grammarAccess.getEditTextAccess().getGroup()); 
            // InternalAndroidGenerator.g:519:3: ( rule__EditText__Group__0 )
            // InternalAndroidGenerator.g:519:4: rule__EditText__Group__0
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
    // InternalAndroidGenerator.g:528:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:529:1: ( ruleSpinner EOF )
            // InternalAndroidGenerator.g:530:1: ruleSpinner EOF
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
    // InternalAndroidGenerator.g:537:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:541:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // InternalAndroidGenerator.g:542:2: ( ( rule__Spinner__Group__0 ) )
            {
            // InternalAndroidGenerator.g:542:2: ( ( rule__Spinner__Group__0 ) )
            // InternalAndroidGenerator.g:543:3: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // InternalAndroidGenerator.g:544:3: ( rule__Spinner__Group__0 )
            // InternalAndroidGenerator.g:544:4: rule__Spinner__Group__0
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


    // $ANTLR start "entryRuleTextfield"
    // InternalAndroidGenerator.g:553:1: entryRuleTextfield : ruleTextfield EOF ;
    public final void entryRuleTextfield() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:554:1: ( ruleTextfield EOF )
            // InternalAndroidGenerator.g:555:1: ruleTextfield EOF
            {
             before(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_1);
            ruleTextfield();

            state._fsp--;

             after(grammarAccess.getTextfieldRule()); 
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
    // $ANTLR end "entryRuleTextfield"


    // $ANTLR start "ruleTextfield"
    // InternalAndroidGenerator.g:562:1: ruleTextfield : ( ( rule__Textfield__Group__0 ) ) ;
    public final void ruleTextfield() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:566:2: ( ( ( rule__Textfield__Group__0 ) ) )
            // InternalAndroidGenerator.g:567:2: ( ( rule__Textfield__Group__0 ) )
            {
            // InternalAndroidGenerator.g:567:2: ( ( rule__Textfield__Group__0 ) )
            // InternalAndroidGenerator.g:568:3: ( rule__Textfield__Group__0 )
            {
             before(grammarAccess.getTextfieldAccess().getGroup()); 
            // InternalAndroidGenerator.g:569:3: ( rule__Textfield__Group__0 )
            // InternalAndroidGenerator.g:569:4: rule__Textfield__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Textfield__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextfield"


    // $ANTLR start "entryRuleButton"
    // InternalAndroidGenerator.g:578:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:579:1: ( ruleButton EOF )
            // InternalAndroidGenerator.g:580:1: ruleButton EOF
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
    // InternalAndroidGenerator.g:587:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:591:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalAndroidGenerator.g:592:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalAndroidGenerator.g:592:2: ( ( rule__Button__Group__0 ) )
            // InternalAndroidGenerator.g:593:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalAndroidGenerator.g:594:3: ( rule__Button__Group__0 )
            // InternalAndroidGenerator.g:594:4: rule__Button__Group__0
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
    // InternalAndroidGenerator.g:603:1: entryRuleButtonActions : ruleButtonActions EOF ;
    public final void entryRuleButtonActions() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:604:1: ( ruleButtonActions EOF )
            // InternalAndroidGenerator.g:605:1: ruleButtonActions EOF
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
    // InternalAndroidGenerator.g:612:1: ruleButtonActions : ( ( rule__ButtonActions__Alternatives ) ) ;
    public final void ruleButtonActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:616:2: ( ( ( rule__ButtonActions__Alternatives ) ) )
            // InternalAndroidGenerator.g:617:2: ( ( rule__ButtonActions__Alternatives ) )
            {
            // InternalAndroidGenerator.g:617:2: ( ( rule__ButtonActions__Alternatives ) )
            // InternalAndroidGenerator.g:618:3: ( rule__ButtonActions__Alternatives )
            {
             before(grammarAccess.getButtonActionsAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:619:3: ( rule__ButtonActions__Alternatives )
            // InternalAndroidGenerator.g:619:4: rule__ButtonActions__Alternatives
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
    // InternalAndroidGenerator.g:628:1: entryRuleToast : ruleToast EOF ;
    public final void entryRuleToast() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:629:1: ( ruleToast EOF )
            // InternalAndroidGenerator.g:630:1: ruleToast EOF
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
    // InternalAndroidGenerator.g:637:1: ruleToast : ( ( rule__Toast__Group__0 ) ) ;
    public final void ruleToast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:641:2: ( ( ( rule__Toast__Group__0 ) ) )
            // InternalAndroidGenerator.g:642:2: ( ( rule__Toast__Group__0 ) )
            {
            // InternalAndroidGenerator.g:642:2: ( ( rule__Toast__Group__0 ) )
            // InternalAndroidGenerator.g:643:3: ( rule__Toast__Group__0 )
            {
             before(grammarAccess.getToastAccess().getGroup()); 
            // InternalAndroidGenerator.g:644:3: ( rule__Toast__Group__0 )
            // InternalAndroidGenerator.g:644:4: rule__Toast__Group__0
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
    // InternalAndroidGenerator.g:653:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:654:1: ( ruleBundle EOF )
            // InternalAndroidGenerator.g:655:1: ruleBundle EOF
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
    // InternalAndroidGenerator.g:662:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:666:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // InternalAndroidGenerator.g:667:2: ( ( rule__Bundle__Group__0 ) )
            {
            // InternalAndroidGenerator.g:667:2: ( ( rule__Bundle__Group__0 ) )
            // InternalAndroidGenerator.g:668:3: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // InternalAndroidGenerator.g:669:3: ( rule__Bundle__Group__0 )
            // InternalAndroidGenerator.g:669:4: rule__Bundle__Group__0
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
    // InternalAndroidGenerator.g:678:1: entryRuleFilterQuery : ruleFilterQuery EOF ;
    public final void entryRuleFilterQuery() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:679:1: ( ruleFilterQuery EOF )
            // InternalAndroidGenerator.g:680:1: ruleFilterQuery EOF
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
    // InternalAndroidGenerator.g:687:1: ruleFilterQuery : ( ( rule__FilterQuery__Group__0 ) ) ;
    public final void ruleFilterQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:691:2: ( ( ( rule__FilterQuery__Group__0 ) ) )
            // InternalAndroidGenerator.g:692:2: ( ( rule__FilterQuery__Group__0 ) )
            {
            // InternalAndroidGenerator.g:692:2: ( ( rule__FilterQuery__Group__0 ) )
            // InternalAndroidGenerator.g:693:3: ( rule__FilterQuery__Group__0 )
            {
             before(grammarAccess.getFilterQueryAccess().getGroup()); 
            // InternalAndroidGenerator.g:694:3: ( rule__FilterQuery__Group__0 )
            // InternalAndroidGenerator.g:694:4: rule__FilterQuery__Group__0
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
    // InternalAndroidGenerator.g:703:1: entryRuleFilterAttributes : ruleFilterAttributes EOF ;
    public final void entryRuleFilterAttributes() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:704:1: ( ruleFilterAttributes EOF )
            // InternalAndroidGenerator.g:705:1: ruleFilterAttributes EOF
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
    // InternalAndroidGenerator.g:712:1: ruleFilterAttributes : ( ( rule__FilterAttributes__DistanceAssignment ) ) ;
    public final void ruleFilterAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:716:2: ( ( ( rule__FilterAttributes__DistanceAssignment ) ) )
            // InternalAndroidGenerator.g:717:2: ( ( rule__FilterAttributes__DistanceAssignment ) )
            {
            // InternalAndroidGenerator.g:717:2: ( ( rule__FilterAttributes__DistanceAssignment ) )
            // InternalAndroidGenerator.g:718:3: ( rule__FilterAttributes__DistanceAssignment )
            {
             before(grammarAccess.getFilterAttributesAccess().getDistanceAssignment()); 
            // InternalAndroidGenerator.g:719:3: ( rule__FilterAttributes__DistanceAssignment )
            // InternalAndroidGenerator.g:719:4: rule__FilterAttributes__DistanceAssignment
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
    // InternalAndroidGenerator.g:728:1: entryRuleDistance : ruleDistance EOF ;
    public final void entryRuleDistance() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:729:1: ( ruleDistance EOF )
            // InternalAndroidGenerator.g:730:1: ruleDistance EOF
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
    // InternalAndroidGenerator.g:737:1: ruleDistance : ( ( rule__Distance__Group__0 ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:741:2: ( ( ( rule__Distance__Group__0 ) ) )
            // InternalAndroidGenerator.g:742:2: ( ( rule__Distance__Group__0 ) )
            {
            // InternalAndroidGenerator.g:742:2: ( ( rule__Distance__Group__0 ) )
            // InternalAndroidGenerator.g:743:3: ( rule__Distance__Group__0 )
            {
             before(grammarAccess.getDistanceAccess().getGroup()); 
            // InternalAndroidGenerator.g:744:3: ( rule__Distance__Group__0 )
            // InternalAndroidGenerator.g:744:4: rule__Distance__Group__0
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
    // InternalAndroidGenerator.g:753:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:754:1: ( ruleNumber EOF )
            // InternalAndroidGenerator.g:755:1: ruleNumber EOF
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
    // InternalAndroidGenerator.g:762:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:766:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalAndroidGenerator.g:767:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalAndroidGenerator.g:767:2: ( ( rule__Number__ValueAssignment ) )
            // InternalAndroidGenerator.g:768:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalAndroidGenerator.g:769:3: ( rule__Number__ValueAssignment )
            // InternalAndroidGenerator.g:769:4: rule__Number__ValueAssignment
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
    // InternalAndroidGenerator.g:778:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:779:1: ( ruleOperator EOF )
            // InternalAndroidGenerator.g:780:1: ruleOperator EOF
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
    // InternalAndroidGenerator.g:787:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:791:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalAndroidGenerator.g:792:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalAndroidGenerator.g:792:2: ( ( rule__Operator__Alternatives ) )
            // InternalAndroidGenerator.g:793:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:794:3: ( rule__Operator__Alternatives )
            // InternalAndroidGenerator.g:794:4: rule__Operator__Alternatives
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
    // InternalAndroidGenerator.g:803:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalAndroidGenerator.g:804:1: ( ruleUnit EOF )
            // InternalAndroidGenerator.g:805:1: ruleUnit EOF
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
    // InternalAndroidGenerator.g:812:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:816:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalAndroidGenerator.g:817:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalAndroidGenerator.g:817:2: ( ( rule__Unit__Alternatives ) )
            // InternalAndroidGenerator.g:818:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalAndroidGenerator.g:819:3: ( rule__Unit__Alternatives )
            // InternalAndroidGenerator.g:819:4: rule__Unit__Alternatives
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
    // InternalAndroidGenerator.g:827:1: rule__ApplicationAttribute__Alternatives : ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) );
    public final void rule__ApplicationAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:831:1: ( ( ruleApplicationVersion ) | ( ruleApplicationPermissionList ) | ( ruleApplicationElementList ) )
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
                    // InternalAndroidGenerator.g:832:2: ( ruleApplicationVersion )
                    {
                    // InternalAndroidGenerator.g:832:2: ( ruleApplicationVersion )
                    // InternalAndroidGenerator.g:833:3: ruleApplicationVersion
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
                    // InternalAndroidGenerator.g:838:2: ( ruleApplicationPermissionList )
                    {
                    // InternalAndroidGenerator.g:838:2: ( ruleApplicationPermissionList )
                    // InternalAndroidGenerator.g:839:3: ruleApplicationPermissionList
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
                    // InternalAndroidGenerator.g:844:2: ( ruleApplicationElementList )
                    {
                    // InternalAndroidGenerator.g:844:2: ( ruleApplicationElementList )
                    // InternalAndroidGenerator.g:845:3: ruleApplicationElementList
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
    // InternalAndroidGenerator.g:854:1: rule__ApplicationElement__Alternatives : ( ( ruleFragment ) | ( ruleModel ) );
    public final void rule__ApplicationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:858:1: ( ( ruleFragment ) | ( ruleModel ) )
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
                    // InternalAndroidGenerator.g:859:2: ( ruleFragment )
                    {
                    // InternalAndroidGenerator.g:859:2: ( ruleFragment )
                    // InternalAndroidGenerator.g:860:3: ruleFragment
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
                    // InternalAndroidGenerator.g:865:2: ( ruleModel )
                    {
                    // InternalAndroidGenerator.g:865:2: ( ruleModel )
                    // InternalAndroidGenerator.g:866:3: ruleModel
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
    // InternalAndroidGenerator.g:875:1: rule__LayoutElement__Alternatives : ( ( ruleButton ) | ( ruleDataholders ) | ( ruleTypeMap ) | ( ruleTypeSetting ) );
    public final void rule__LayoutElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:879:1: ( ( ruleButton ) | ( ruleDataholders ) | ( ruleTypeMap ) | ( ruleTypeSetting ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 24:
            case 25:
            case 26:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAndroidGenerator.g:880:2: ( ruleButton )
                    {
                    // InternalAndroidGenerator.g:880:2: ( ruleButton )
                    // InternalAndroidGenerator.g:881:3: ruleButton
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
                    // InternalAndroidGenerator.g:886:2: ( ruleDataholders )
                    {
                    // InternalAndroidGenerator.g:886:2: ( ruleDataholders )
                    // InternalAndroidGenerator.g:887:3: ruleDataholders
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
                    // InternalAndroidGenerator.g:892:2: ( ruleTypeMap )
                    {
                    // InternalAndroidGenerator.g:892:2: ( ruleTypeMap )
                    // InternalAndroidGenerator.g:893:3: ruleTypeMap
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
                    // InternalAndroidGenerator.g:898:2: ( ruleTypeSetting )
                    {
                    // InternalAndroidGenerator.g:898:2: ( ruleTypeSetting )
                    // InternalAndroidGenerator.g:899:3: ruleTypeSetting
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
    // InternalAndroidGenerator.g:908:1: rule__Dataholders__Alternatives : ( ( ruleEditText ) | ( ruleSpinner ) | ( ruleTextfield ) );
    public final void rule__Dataholders__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:912:1: ( ( ruleEditText ) | ( ruleSpinner ) | ( ruleTextfield ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAndroidGenerator.g:913:2: ( ruleEditText )
                    {
                    // InternalAndroidGenerator.g:913:2: ( ruleEditText )
                    // InternalAndroidGenerator.g:914:3: ruleEditText
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
                    // InternalAndroidGenerator.g:919:2: ( ruleSpinner )
                    {
                    // InternalAndroidGenerator.g:919:2: ( ruleSpinner )
                    // InternalAndroidGenerator.g:920:3: ruleSpinner
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
                    // InternalAndroidGenerator.g:925:2: ( ruleTextfield )
                    {
                    // InternalAndroidGenerator.g:925:2: ( ruleTextfield )
                    // InternalAndroidGenerator.g:926:3: ruleTextfield
                    {
                     before(grammarAccess.getDataholdersAccess().getTextfieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTextfield();

                    state._fsp--;

                     after(grammarAccess.getDataholdersAccess().getTextfieldParserRuleCall_2()); 

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
    // InternalAndroidGenerator.g:935:1: rule__ButtonActions__Alternatives : ( ( ruleToast ) | ( ruleBundle ) );
    public final void rule__ButtonActions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:939:1: ( ( ruleToast ) | ( ruleBundle ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAndroidGenerator.g:940:2: ( ruleToast )
                    {
                    // InternalAndroidGenerator.g:940:2: ( ruleToast )
                    // InternalAndroidGenerator.g:941:3: ruleToast
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
                    // InternalAndroidGenerator.g:946:2: ( ruleBundle )
                    {
                    // InternalAndroidGenerator.g:946:2: ( ruleBundle )
                    // InternalAndroidGenerator.g:947:3: ruleBundle
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
    // InternalAndroidGenerator.g:956:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:960:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 35:
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
                    // InternalAndroidGenerator.g:961:2: ( ( rule__Operator__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:961:2: ( ( rule__Operator__Group_0__0 ) )
                    // InternalAndroidGenerator.g:962:3: ( rule__Operator__Group_0__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:963:3: ( rule__Operator__Group_0__0 )
                    // InternalAndroidGenerator.g:963:4: rule__Operator__Group_0__0
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
                    // InternalAndroidGenerator.g:967:2: ( ( rule__Operator__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:967:2: ( ( rule__Operator__Group_1__0 ) )
                    // InternalAndroidGenerator.g:968:3: ( rule__Operator__Group_1__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:969:3: ( rule__Operator__Group_1__0 )
                    // InternalAndroidGenerator.g:969:4: rule__Operator__Group_1__0
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
                    // InternalAndroidGenerator.g:973:2: ( ( rule__Operator__Group_2__0 ) )
                    {
                    // InternalAndroidGenerator.g:973:2: ( ( rule__Operator__Group_2__0 ) )
                    // InternalAndroidGenerator.g:974:3: ( rule__Operator__Group_2__0 )
                    {
                     before(grammarAccess.getOperatorAccess().getGroup_2()); 
                    // InternalAndroidGenerator.g:975:3: ( rule__Operator__Group_2__0 )
                    // InternalAndroidGenerator.g:975:4: rule__Operator__Group_2__0
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
    // InternalAndroidGenerator.g:983:1: rule__Unit__Alternatives : ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:987:1: ( ( ( rule__Unit__Group_0__0 ) ) | ( ( rule__Unit__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAndroidGenerator.g:988:2: ( ( rule__Unit__Group_0__0 ) )
                    {
                    // InternalAndroidGenerator.g:988:2: ( ( rule__Unit__Group_0__0 ) )
                    // InternalAndroidGenerator.g:989:3: ( rule__Unit__Group_0__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_0()); 
                    // InternalAndroidGenerator.g:990:3: ( rule__Unit__Group_0__0 )
                    // InternalAndroidGenerator.g:990:4: rule__Unit__Group_0__0
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
                    // InternalAndroidGenerator.g:994:2: ( ( rule__Unit__Group_1__0 ) )
                    {
                    // InternalAndroidGenerator.g:994:2: ( ( rule__Unit__Group_1__0 ) )
                    // InternalAndroidGenerator.g:995:3: ( rule__Unit__Group_1__0 )
                    {
                     before(grammarAccess.getUnitAccess().getGroup_1()); 
                    // InternalAndroidGenerator.g:996:3: ( rule__Unit__Group_1__0 )
                    // InternalAndroidGenerator.g:996:4: rule__Unit__Group_1__0
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
    // InternalAndroidGenerator.g:1004:1: rule__AndroidAppProject__Group__0 : rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 ;
    public final void rule__AndroidAppProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1008:1: ( rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1 )
            // InternalAndroidGenerator.g:1009:2: rule__AndroidAppProject__Group__0__Impl rule__AndroidAppProject__Group__1
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
    // InternalAndroidGenerator.g:1016:1: rule__AndroidAppProject__Group__0__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) ;
    public final void rule__AndroidAppProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1020:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) ) )
            // InternalAndroidGenerator.g:1021:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:1021:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_0 ) )
            // InternalAndroidGenerator.g:1022:2: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_0()); 
            // InternalAndroidGenerator.g:1023:2: ( rule__AndroidAppProject__ApplicationsAssignment_0 )
            // InternalAndroidGenerator.g:1023:3: rule__AndroidAppProject__ApplicationsAssignment_0
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
    // InternalAndroidGenerator.g:1031:1: rule__AndroidAppProject__Group__1 : rule__AndroidAppProject__Group__1__Impl ;
    public final void rule__AndroidAppProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1035:1: ( rule__AndroidAppProject__Group__1__Impl )
            // InternalAndroidGenerator.g:1036:2: rule__AndroidAppProject__Group__1__Impl
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
    // InternalAndroidGenerator.g:1042:1: rule__AndroidAppProject__Group__1__Impl : ( ( rule__AndroidAppProject__Group_1__0 )* ) ;
    public final void rule__AndroidAppProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1046:1: ( ( ( rule__AndroidAppProject__Group_1__0 )* ) )
            // InternalAndroidGenerator.g:1047:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            {
            // InternalAndroidGenerator.g:1047:1: ( ( rule__AndroidAppProject__Group_1__0 )* )
            // InternalAndroidGenerator.g:1048:2: ( rule__AndroidAppProject__Group_1__0 )*
            {
             before(grammarAccess.getAndroidAppProjectAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:1049:2: ( rule__AndroidAppProject__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1049:3: rule__AndroidAppProject__Group_1__0
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
    // InternalAndroidGenerator.g:1058:1: rule__AndroidAppProject__Group_1__0 : rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 ;
    public final void rule__AndroidAppProject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1062:1: ( rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1 )
            // InternalAndroidGenerator.g:1063:2: rule__AndroidAppProject__Group_1__0__Impl rule__AndroidAppProject__Group_1__1
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
    // InternalAndroidGenerator.g:1070:1: rule__AndroidAppProject__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AndroidAppProject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1074:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:1075:1: ( ',' )
            {
            // InternalAndroidGenerator.g:1075:1: ( ',' )
            // InternalAndroidGenerator.g:1076:2: ','
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
    // InternalAndroidGenerator.g:1085:1: rule__AndroidAppProject__Group_1__1 : rule__AndroidAppProject__Group_1__1__Impl ;
    public final void rule__AndroidAppProject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1089:1: ( rule__AndroidAppProject__Group_1__1__Impl )
            // InternalAndroidGenerator.g:1090:2: rule__AndroidAppProject__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:1096:1: rule__AndroidAppProject__Group_1__1__Impl : ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) ;
    public final void rule__AndroidAppProject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1100:1: ( ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:1101:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:1101:1: ( ( rule__AndroidAppProject__ApplicationsAssignment_1_1 ) )
            // InternalAndroidGenerator.g:1102:2: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            {
             before(grammarAccess.getAndroidAppProjectAccess().getApplicationsAssignment_1_1()); 
            // InternalAndroidGenerator.g:1103:2: ( rule__AndroidAppProject__ApplicationsAssignment_1_1 )
            // InternalAndroidGenerator.g:1103:3: rule__AndroidAppProject__ApplicationsAssignment_1_1
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
    // InternalAndroidGenerator.g:1112:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1116:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalAndroidGenerator.g:1117:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalAndroidGenerator.g:1124:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1128:1: ( ( 'Application' ) )
            // InternalAndroidGenerator.g:1129:1: ( 'Application' )
            {
            // InternalAndroidGenerator.g:1129:1: ( 'Application' )
            // InternalAndroidGenerator.g:1130:2: 'Application'
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
    // InternalAndroidGenerator.g:1139:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1143:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalAndroidGenerator.g:1144:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalAndroidGenerator.g:1151:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1155:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1156:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1156:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:1157:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:1158:2: ( rule__Application__NameAssignment_1 )
            // InternalAndroidGenerator.g:1158:3: rule__Application__NameAssignment_1
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
    // InternalAndroidGenerator.g:1166:1: rule__Application__Group__2 : rule__Application__Group__2__Impl ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1170:1: ( rule__Application__Group__2__Impl )
            // InternalAndroidGenerator.g:1171:2: rule__Application__Group__2__Impl
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
    // InternalAndroidGenerator.g:1177:1: rule__Application__Group__2__Impl : ( ( rule__Application__AttributesAssignment_2 )* ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1181:1: ( ( ( rule__Application__AttributesAssignment_2 )* ) )
            // InternalAndroidGenerator.g:1182:1: ( ( rule__Application__AttributesAssignment_2 )* )
            {
            // InternalAndroidGenerator.g:1182:1: ( ( rule__Application__AttributesAssignment_2 )* )
            // InternalAndroidGenerator.g:1183:2: ( rule__Application__AttributesAssignment_2 )*
            {
             before(grammarAccess.getApplicationAccess().getAttributesAssignment_2()); 
            // InternalAndroidGenerator.g:1184:2: ( rule__Application__AttributesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14||(LA9_0>=18 && LA9_0<=19)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1184:3: rule__Application__AttributesAssignment_2
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
    // InternalAndroidGenerator.g:1193:1: rule__ApplicationVersion__Group__0 : rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 ;
    public final void rule__ApplicationVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1197:1: ( rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1 )
            // InternalAndroidGenerator.g:1198:2: rule__ApplicationVersion__Group__0__Impl rule__ApplicationVersion__Group__1
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
    // InternalAndroidGenerator.g:1205:1: rule__ApplicationVersion__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1209:1: ( ( () ) )
            // InternalAndroidGenerator.g:1210:1: ( () )
            {
            // InternalAndroidGenerator.g:1210:1: ( () )
            // InternalAndroidGenerator.g:1211:2: ()
            {
             before(grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0()); 
            // InternalAndroidGenerator.g:1212:2: ()
            // InternalAndroidGenerator.g:1212:3: 
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
    // InternalAndroidGenerator.g:1220:1: rule__ApplicationVersion__Group__1 : rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 ;
    public final void rule__ApplicationVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1224:1: ( rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2 )
            // InternalAndroidGenerator.g:1225:2: rule__ApplicationVersion__Group__1__Impl rule__ApplicationVersion__Group__2
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
    // InternalAndroidGenerator.g:1232:1: rule__ApplicationVersion__Group__1__Impl : ( 'Android-SDK' ) ;
    public final void rule__ApplicationVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1236:1: ( ( 'Android-SDK' ) )
            // InternalAndroidGenerator.g:1237:1: ( 'Android-SDK' )
            {
            // InternalAndroidGenerator.g:1237:1: ( 'Android-SDK' )
            // InternalAndroidGenerator.g:1238:2: 'Android-SDK'
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
    // InternalAndroidGenerator.g:1247:1: rule__ApplicationVersion__Group__2 : rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 ;
    public final void rule__ApplicationVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1251:1: ( rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3 )
            // InternalAndroidGenerator.g:1252:2: rule__ApplicationVersion__Group__2__Impl rule__ApplicationVersion__Group__3
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
    // InternalAndroidGenerator.g:1259:1: rule__ApplicationVersion__Group__2__Impl : ( ':' ) ;
    public final void rule__ApplicationVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1263:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1264:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1264:1: ( ':' )
            // InternalAndroidGenerator.g:1265:2: ':'
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
    // InternalAndroidGenerator.g:1274:1: rule__ApplicationVersion__Group__3 : rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 ;
    public final void rule__ApplicationVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1278:1: ( rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4 )
            // InternalAndroidGenerator.g:1279:2: rule__ApplicationVersion__Group__3__Impl rule__ApplicationVersion__Group__4
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
    // InternalAndroidGenerator.g:1286:1: rule__ApplicationVersion__Group__3__Impl : ( ( rule__ApplicationVersion__ResultAssignment_3 ) ) ;
    public final void rule__ApplicationVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1290:1: ( ( ( rule__ApplicationVersion__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1291:1: ( ( rule__ApplicationVersion__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1291:1: ( ( rule__ApplicationVersion__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1292:2: ( rule__ApplicationVersion__ResultAssignment_3 )
            {
             before(grammarAccess.getApplicationVersionAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1293:2: ( rule__ApplicationVersion__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1293:3: rule__ApplicationVersion__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1301:1: rule__ApplicationVersion__Group__4 : rule__ApplicationVersion__Group__4__Impl ;
    public final void rule__ApplicationVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1305:1: ( rule__ApplicationVersion__Group__4__Impl )
            // InternalAndroidGenerator.g:1306:2: rule__ApplicationVersion__Group__4__Impl
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
    // InternalAndroidGenerator.g:1312:1: rule__ApplicationVersion__Group__4__Impl : ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? ) ;
    public final void rule__ApplicationVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1316:1: ( ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1317:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1317:1: ( ( rule__ApplicationVersion__TargetsdkAssignment_4 )? )
            // InternalAndroidGenerator.g:1318:2: ( rule__ApplicationVersion__TargetsdkAssignment_4 )?
            {
             before(grammarAccess.getApplicationVersionAccess().getTargetsdkAssignment_4()); 
            // InternalAndroidGenerator.g:1319:2: ( rule__ApplicationVersion__TargetsdkAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAndroidGenerator.g:1319:3: rule__ApplicationVersion__TargetsdkAssignment_4
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
    // InternalAndroidGenerator.g:1328:1: rule__TargetSDK__Group__0 : rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 ;
    public final void rule__TargetSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1332:1: ( rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1 )
            // InternalAndroidGenerator.g:1333:2: rule__TargetSDK__Group__0__Impl rule__TargetSDK__Group__1
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
    // InternalAndroidGenerator.g:1340:1: rule__TargetSDK__Group__0__Impl : ( () ) ;
    public final void rule__TargetSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1344:1: ( ( () ) )
            // InternalAndroidGenerator.g:1345:1: ( () )
            {
            // InternalAndroidGenerator.g:1345:1: ( () )
            // InternalAndroidGenerator.g:1346:2: ()
            {
             before(grammarAccess.getTargetSDKAccess().getTargetSDKAction_0()); 
            // InternalAndroidGenerator.g:1347:2: ()
            // InternalAndroidGenerator.g:1347:3: 
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
    // InternalAndroidGenerator.g:1355:1: rule__TargetSDK__Group__1 : rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 ;
    public final void rule__TargetSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1359:1: ( rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2 )
            // InternalAndroidGenerator.g:1360:2: rule__TargetSDK__Group__1__Impl rule__TargetSDK__Group__2
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
    // InternalAndroidGenerator.g:1367:1: rule__TargetSDK__Group__1__Impl : ( 'Target-SDK' ) ;
    public final void rule__TargetSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1371:1: ( ( 'Target-SDK' ) )
            // InternalAndroidGenerator.g:1372:1: ( 'Target-SDK' )
            {
            // InternalAndroidGenerator.g:1372:1: ( 'Target-SDK' )
            // InternalAndroidGenerator.g:1373:2: 'Target-SDK'
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
    // InternalAndroidGenerator.g:1382:1: rule__TargetSDK__Group__2 : rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 ;
    public final void rule__TargetSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1386:1: ( rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3 )
            // InternalAndroidGenerator.g:1387:2: rule__TargetSDK__Group__2__Impl rule__TargetSDK__Group__3
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
    // InternalAndroidGenerator.g:1394:1: rule__TargetSDK__Group__2__Impl : ( ':' ) ;
    public final void rule__TargetSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1398:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1399:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1399:1: ( ':' )
            // InternalAndroidGenerator.g:1400:2: ':'
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
    // InternalAndroidGenerator.g:1409:1: rule__TargetSDK__Group__3 : rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 ;
    public final void rule__TargetSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1413:1: ( rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4 )
            // InternalAndroidGenerator.g:1414:2: rule__TargetSDK__Group__3__Impl rule__TargetSDK__Group__4
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
    // InternalAndroidGenerator.g:1421:1: rule__TargetSDK__Group__3__Impl : ( ( rule__TargetSDK__ResultAssignment_3 ) ) ;
    public final void rule__TargetSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1425:1: ( ( ( rule__TargetSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1426:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1426:1: ( ( rule__TargetSDK__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1427:2: ( rule__TargetSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getTargetSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1428:2: ( rule__TargetSDK__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1428:3: rule__TargetSDK__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1436:1: rule__TargetSDK__Group__4 : rule__TargetSDK__Group__4__Impl ;
    public final void rule__TargetSDK__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1440:1: ( rule__TargetSDK__Group__4__Impl )
            // InternalAndroidGenerator.g:1441:2: rule__TargetSDK__Group__4__Impl
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
    // InternalAndroidGenerator.g:1447:1: rule__TargetSDK__Group__4__Impl : ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) ;
    public final void rule__TargetSDK__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1451:1: ( ( ( rule__TargetSDK__MinsdkAssignment_4 )? ) )
            // InternalAndroidGenerator.g:1452:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            {
            // InternalAndroidGenerator.g:1452:1: ( ( rule__TargetSDK__MinsdkAssignment_4 )? )
            // InternalAndroidGenerator.g:1453:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            {
             before(grammarAccess.getTargetSDKAccess().getMinsdkAssignment_4()); 
            // InternalAndroidGenerator.g:1454:2: ( rule__TargetSDK__MinsdkAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAndroidGenerator.g:1454:3: rule__TargetSDK__MinsdkAssignment_4
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
    // InternalAndroidGenerator.g:1463:1: rule__MinSDK__Group__0 : rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 ;
    public final void rule__MinSDK__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1467:1: ( rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1 )
            // InternalAndroidGenerator.g:1468:2: rule__MinSDK__Group__0__Impl rule__MinSDK__Group__1
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
    // InternalAndroidGenerator.g:1475:1: rule__MinSDK__Group__0__Impl : ( () ) ;
    public final void rule__MinSDK__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1479:1: ( ( () ) )
            // InternalAndroidGenerator.g:1480:1: ( () )
            {
            // InternalAndroidGenerator.g:1480:1: ( () )
            // InternalAndroidGenerator.g:1481:2: ()
            {
             before(grammarAccess.getMinSDKAccess().getMinSDKAction_0()); 
            // InternalAndroidGenerator.g:1482:2: ()
            // InternalAndroidGenerator.g:1482:3: 
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
    // InternalAndroidGenerator.g:1490:1: rule__MinSDK__Group__1 : rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 ;
    public final void rule__MinSDK__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1494:1: ( rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2 )
            // InternalAndroidGenerator.g:1495:2: rule__MinSDK__Group__1__Impl rule__MinSDK__Group__2
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
    // InternalAndroidGenerator.g:1502:1: rule__MinSDK__Group__1__Impl : ( 'Minimum-SDK' ) ;
    public final void rule__MinSDK__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1506:1: ( ( 'Minimum-SDK' ) )
            // InternalAndroidGenerator.g:1507:1: ( 'Minimum-SDK' )
            {
            // InternalAndroidGenerator.g:1507:1: ( 'Minimum-SDK' )
            // InternalAndroidGenerator.g:1508:2: 'Minimum-SDK'
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
    // InternalAndroidGenerator.g:1517:1: rule__MinSDK__Group__2 : rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 ;
    public final void rule__MinSDK__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1521:1: ( rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3 )
            // InternalAndroidGenerator.g:1522:2: rule__MinSDK__Group__2__Impl rule__MinSDK__Group__3
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
    // InternalAndroidGenerator.g:1529:1: rule__MinSDK__Group__2__Impl : ( ':' ) ;
    public final void rule__MinSDK__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1533:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:1534:1: ( ':' )
            {
            // InternalAndroidGenerator.g:1534:1: ( ':' )
            // InternalAndroidGenerator.g:1535:2: ':'
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
    // InternalAndroidGenerator.g:1544:1: rule__MinSDK__Group__3 : rule__MinSDK__Group__3__Impl ;
    public final void rule__MinSDK__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1548:1: ( rule__MinSDK__Group__3__Impl )
            // InternalAndroidGenerator.g:1549:2: rule__MinSDK__Group__3__Impl
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
    // InternalAndroidGenerator.g:1555:1: rule__MinSDK__Group__3__Impl : ( ( rule__MinSDK__ResultAssignment_3 ) ) ;
    public final void rule__MinSDK__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1559:1: ( ( ( rule__MinSDK__ResultAssignment_3 ) ) )
            // InternalAndroidGenerator.g:1560:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:1560:1: ( ( rule__MinSDK__ResultAssignment_3 ) )
            // InternalAndroidGenerator.g:1561:2: ( rule__MinSDK__ResultAssignment_3 )
            {
             before(grammarAccess.getMinSDKAccess().getResultAssignment_3()); 
            // InternalAndroidGenerator.g:1562:2: ( rule__MinSDK__ResultAssignment_3 )
            // InternalAndroidGenerator.g:1562:3: rule__MinSDK__ResultAssignment_3
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
    // InternalAndroidGenerator.g:1571:1: rule__ApplicationPermissionList__Group__0 : rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 ;
    public final void rule__ApplicationPermissionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1575:1: ( rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1 )
            // InternalAndroidGenerator.g:1576:2: rule__ApplicationPermissionList__Group__0__Impl rule__ApplicationPermissionList__Group__1
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
    // InternalAndroidGenerator.g:1583:1: rule__ApplicationPermissionList__Group__0__Impl : ( 'permissions' ) ;
    public final void rule__ApplicationPermissionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1587:1: ( ( 'permissions' ) )
            // InternalAndroidGenerator.g:1588:1: ( 'permissions' )
            {
            // InternalAndroidGenerator.g:1588:1: ( 'permissions' )
            // InternalAndroidGenerator.g:1589:2: 'permissions'
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
    // InternalAndroidGenerator.g:1598:1: rule__ApplicationPermissionList__Group__1 : rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 ;
    public final void rule__ApplicationPermissionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1602:1: ( rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2 )
            // InternalAndroidGenerator.g:1603:2: rule__ApplicationPermissionList__Group__1__Impl rule__ApplicationPermissionList__Group__2
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
    // InternalAndroidGenerator.g:1610:1: rule__ApplicationPermissionList__Group__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1614:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1615:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1615:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_1 ) )
            // InternalAndroidGenerator.g:1616:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_1()); 
            // InternalAndroidGenerator.g:1617:2: ( rule__ApplicationPermissionList__PermissionsAssignment_1 )
            // InternalAndroidGenerator.g:1617:3: rule__ApplicationPermissionList__PermissionsAssignment_1
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
    // InternalAndroidGenerator.g:1625:1: rule__ApplicationPermissionList__Group__2 : rule__ApplicationPermissionList__Group__2__Impl ;
    public final void rule__ApplicationPermissionList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1629:1: ( rule__ApplicationPermissionList__Group__2__Impl )
            // InternalAndroidGenerator.g:1630:2: rule__ApplicationPermissionList__Group__2__Impl
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
    // InternalAndroidGenerator.g:1636:1: rule__ApplicationPermissionList__Group__2__Impl : ( ( rule__ApplicationPermissionList__Group_2__0 )* ) ;
    public final void rule__ApplicationPermissionList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1640:1: ( ( ( rule__ApplicationPermissionList__Group_2__0 )* ) )
            // InternalAndroidGenerator.g:1641:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            {
            // InternalAndroidGenerator.g:1641:1: ( ( rule__ApplicationPermissionList__Group_2__0 )* )
            // InternalAndroidGenerator.g:1642:2: ( rule__ApplicationPermissionList__Group_2__0 )*
            {
             before(grammarAccess.getApplicationPermissionListAccess().getGroup_2()); 
            // InternalAndroidGenerator.g:1643:2: ( rule__ApplicationPermissionList__Group_2__0 )*
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
            	    // InternalAndroidGenerator.g:1643:3: rule__ApplicationPermissionList__Group_2__0
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
    // InternalAndroidGenerator.g:1652:1: rule__ApplicationPermissionList__Group_2__0 : rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 ;
    public final void rule__ApplicationPermissionList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1656:1: ( rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1 )
            // InternalAndroidGenerator.g:1657:2: rule__ApplicationPermissionList__Group_2__0__Impl rule__ApplicationPermissionList__Group_2__1
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
    // InternalAndroidGenerator.g:1664:1: rule__ApplicationPermissionList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ApplicationPermissionList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1668:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:1669:1: ( ',' )
            {
            // InternalAndroidGenerator.g:1669:1: ( ',' )
            // InternalAndroidGenerator.g:1670:2: ','
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
    // InternalAndroidGenerator.g:1679:1: rule__ApplicationPermissionList__Group_2__1 : rule__ApplicationPermissionList__Group_2__1__Impl ;
    public final void rule__ApplicationPermissionList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1683:1: ( rule__ApplicationPermissionList__Group_2__1__Impl )
            // InternalAndroidGenerator.g:1684:2: rule__ApplicationPermissionList__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:1690:1: rule__ApplicationPermissionList__Group_2__1__Impl : ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) ;
    public final void rule__ApplicationPermissionList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1694:1: ( ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) ) )
            // InternalAndroidGenerator.g:1695:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            {
            // InternalAndroidGenerator.g:1695:1: ( ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 ) )
            // InternalAndroidGenerator.g:1696:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getApplicationPermissionListAccess().getPermissionsAssignment_2_1()); 
            // InternalAndroidGenerator.g:1697:2: ( rule__ApplicationPermissionList__PermissionsAssignment_2_1 )
            // InternalAndroidGenerator.g:1697:3: rule__ApplicationPermissionList__PermissionsAssignment_2_1
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
    // InternalAndroidGenerator.g:1706:1: rule__ApplicationElementList__Group__0 : rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 ;
    public final void rule__ApplicationElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1710:1: ( rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1 )
            // InternalAndroidGenerator.g:1711:2: rule__ApplicationElementList__Group__0__Impl rule__ApplicationElementList__Group__1
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
    // InternalAndroidGenerator.g:1718:1: rule__ApplicationElementList__Group__0__Impl : ( () ) ;
    public final void rule__ApplicationElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1722:1: ( ( () ) )
            // InternalAndroidGenerator.g:1723:1: ( () )
            {
            // InternalAndroidGenerator.g:1723:1: ( () )
            // InternalAndroidGenerator.g:1724:2: ()
            {
             before(grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0()); 
            // InternalAndroidGenerator.g:1725:2: ()
            // InternalAndroidGenerator.g:1725:3: 
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
    // InternalAndroidGenerator.g:1733:1: rule__ApplicationElementList__Group__1 : rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 ;
    public final void rule__ApplicationElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1737:1: ( rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2 )
            // InternalAndroidGenerator.g:1738:2: rule__ApplicationElementList__Group__1__Impl rule__ApplicationElementList__Group__2
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
    // InternalAndroidGenerator.g:1745:1: rule__ApplicationElementList__Group__1__Impl : ( 'elements' ) ;
    public final void rule__ApplicationElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1749:1: ( ( 'elements' ) )
            // InternalAndroidGenerator.g:1750:1: ( 'elements' )
            {
            // InternalAndroidGenerator.g:1750:1: ( 'elements' )
            // InternalAndroidGenerator.g:1751:2: 'elements'
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
    // InternalAndroidGenerator.g:1760:1: rule__ApplicationElementList__Group__2 : rule__ApplicationElementList__Group__2__Impl ;
    public final void rule__ApplicationElementList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1764:1: ( rule__ApplicationElementList__Group__2__Impl )
            // InternalAndroidGenerator.g:1765:2: rule__ApplicationElementList__Group__2__Impl
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
    // InternalAndroidGenerator.g:1771:1: rule__ApplicationElementList__Group__2__Impl : ( ( rule__ApplicationElementList__ElementsAssignment_2 )* ) ;
    public final void rule__ApplicationElementList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1775:1: ( ( ( rule__ApplicationElementList__ElementsAssignment_2 )* ) )
            // InternalAndroidGenerator.g:1776:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 )* )
            {
            // InternalAndroidGenerator.g:1776:1: ( ( rule__ApplicationElementList__ElementsAssignment_2 )* )
            // InternalAndroidGenerator.g:1777:2: ( rule__ApplicationElementList__ElementsAssignment_2 )*
            {
             before(grammarAccess.getApplicationElementListAccess().getElementsAssignment_2()); 
            // InternalAndroidGenerator.g:1778:2: ( rule__ApplicationElementList__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=20 && LA13_0<=21)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1778:3: rule__ApplicationElementList__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalAndroidGenerator.g:1787:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1791:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAndroidGenerator.g:1792:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAndroidGenerator.g:1799:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1803:1: ( ( 'Model' ) )
            // InternalAndroidGenerator.g:1804:1: ( 'Model' )
            {
            // InternalAndroidGenerator.g:1804:1: ( 'Model' )
            // InternalAndroidGenerator.g:1805:2: 'Model'
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
    // InternalAndroidGenerator.g:1814:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1818:1: ( rule__Model__Group__1__Impl )
            // InternalAndroidGenerator.g:1819:2: rule__Model__Group__1__Impl
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
    // InternalAndroidGenerator.g:1825:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1829:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalAndroidGenerator.g:1830:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:1830:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalAndroidGenerator.g:1831:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalAndroidGenerator.g:1832:2: ( rule__Model__NameAssignment_1 )
            // InternalAndroidGenerator.g:1832:3: rule__Model__NameAssignment_1
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
    // InternalAndroidGenerator.g:1841:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1845:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalAndroidGenerator.g:1846:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
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
    // InternalAndroidGenerator.g:1853:1: rule__Fragment__Group__0__Impl : ( () ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1857:1: ( ( () ) )
            // InternalAndroidGenerator.g:1858:1: ( () )
            {
            // InternalAndroidGenerator.g:1858:1: ( () )
            // InternalAndroidGenerator.g:1859:2: ()
            {
             before(grammarAccess.getFragmentAccess().getFragmentAction_0()); 
            // InternalAndroidGenerator.g:1860:2: ()
            // InternalAndroidGenerator.g:1860:3: 
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
    // InternalAndroidGenerator.g:1868:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1872:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalAndroidGenerator.g:1873:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
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
    // InternalAndroidGenerator.g:1880:1: rule__Fragment__Group__1__Impl : ( 'Fragment' ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1884:1: ( ( 'Fragment' ) )
            // InternalAndroidGenerator.g:1885:1: ( 'Fragment' )
            {
            // InternalAndroidGenerator.g:1885:1: ( 'Fragment' )
            // InternalAndroidGenerator.g:1886:2: 'Fragment'
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
    // InternalAndroidGenerator.g:1895:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1899:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalAndroidGenerator.g:1900:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
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
    // InternalAndroidGenerator.g:1907:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__NameAssignment_2 ) ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1911:1: ( ( ( rule__Fragment__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:1912:1: ( ( rule__Fragment__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:1912:1: ( ( rule__Fragment__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:1913:2: ( rule__Fragment__NameAssignment_2 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:1914:2: ( rule__Fragment__NameAssignment_2 )
            // InternalAndroidGenerator.g:1914:3: rule__Fragment__NameAssignment_2
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
    // InternalAndroidGenerator.g:1922:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1926:1: ( rule__Fragment__Group__3__Impl )
            // InternalAndroidGenerator.g:1927:2: rule__Fragment__Group__3__Impl
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
    // InternalAndroidGenerator.g:1933:1: rule__Fragment__Group__3__Impl : ( ( rule__Fragment__ActivityAttributesAssignment_3 )? ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1937:1: ( ( ( rule__Fragment__ActivityAttributesAssignment_3 )? ) )
            // InternalAndroidGenerator.g:1938:1: ( ( rule__Fragment__ActivityAttributesAssignment_3 )? )
            {
            // InternalAndroidGenerator.g:1938:1: ( ( rule__Fragment__ActivityAttributesAssignment_3 )? )
            // InternalAndroidGenerator.g:1939:2: ( rule__Fragment__ActivityAttributesAssignment_3 )?
            {
             before(grammarAccess.getFragmentAccess().getActivityAttributesAssignment_3()); 
            // InternalAndroidGenerator.g:1940:2: ( rule__Fragment__ActivityAttributesAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=22 && LA14_0<=27)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAndroidGenerator.g:1940:3: rule__Fragment__ActivityAttributesAssignment_3
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
    // InternalAndroidGenerator.g:1949:1: rule__ActivityLayoutAttributes__Group__0 : rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 ;
    public final void rule__ActivityLayoutAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1953:1: ( rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1 )
            // InternalAndroidGenerator.g:1954:2: rule__ActivityLayoutAttributes__Group__0__Impl rule__ActivityLayoutAttributes__Group__1
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
    // InternalAndroidGenerator.g:1961:1: rule__ActivityLayoutAttributes__Group__0__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1965:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) ) )
            // InternalAndroidGenerator.g:1966:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) )
            {
            // InternalAndroidGenerator.g:1966:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 ) )
            // InternalAndroidGenerator.g:1967:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_0()); 
            // InternalAndroidGenerator.g:1968:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 )
            // InternalAndroidGenerator.g:1968:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_0
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
    // InternalAndroidGenerator.g:1976:1: rule__ActivityLayoutAttributes__Group__1 : rule__ActivityLayoutAttributes__Group__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1980:1: ( rule__ActivityLayoutAttributes__Group__1__Impl )
            // InternalAndroidGenerator.g:1981:2: rule__ActivityLayoutAttributes__Group__1__Impl
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
    // InternalAndroidGenerator.g:1987:1: rule__ActivityLayoutAttributes__Group__1__Impl : ( ( rule__ActivityLayoutAttributes__Group_1__0 )* ) ;
    public final void rule__ActivityLayoutAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:1991:1: ( ( ( rule__ActivityLayoutAttributes__Group_1__0 )* ) )
            // InternalAndroidGenerator.g:1992:1: ( ( rule__ActivityLayoutAttributes__Group_1__0 )* )
            {
            // InternalAndroidGenerator.g:1992:1: ( ( rule__ActivityLayoutAttributes__Group_1__0 )* )
            // InternalAndroidGenerator.g:1993:2: ( rule__ActivityLayoutAttributes__Group_1__0 )*
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getGroup_1()); 
            // InternalAndroidGenerator.g:1994:2: ( rule__ActivityLayoutAttributes__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=22 && LA15_2<=27)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1994:3: rule__ActivityLayoutAttributes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ActivityLayoutAttributes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalAndroidGenerator.g:2003:1: rule__ActivityLayoutAttributes__Group_1__0 : rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1 ;
    public final void rule__ActivityLayoutAttributes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2007:1: ( rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1 )
            // InternalAndroidGenerator.g:2008:2: rule__ActivityLayoutAttributes__Group_1__0__Impl rule__ActivityLayoutAttributes__Group_1__1
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
    // InternalAndroidGenerator.g:2015:1: rule__ActivityLayoutAttributes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ActivityLayoutAttributes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2019:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:2020:1: ( ',' )
            {
            // InternalAndroidGenerator.g:2020:1: ( ',' )
            // InternalAndroidGenerator.g:2021:2: ','
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
    // InternalAndroidGenerator.g:2030:1: rule__ActivityLayoutAttributes__Group_1__1 : rule__ActivityLayoutAttributes__Group_1__1__Impl ;
    public final void rule__ActivityLayoutAttributes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2034:1: ( rule__ActivityLayoutAttributes__Group_1__1__Impl )
            // InternalAndroidGenerator.g:2035:2: rule__ActivityLayoutAttributes__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:2041:1: rule__ActivityLayoutAttributes__Group_1__1__Impl : ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) ) ;
    public final void rule__ActivityLayoutAttributes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2045:1: ( ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) ) )
            // InternalAndroidGenerator.g:2046:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) )
            {
            // InternalAndroidGenerator.g:2046:1: ( ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 ) )
            // InternalAndroidGenerator.g:2047:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 )
            {
             before(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsAssignment_1_1()); 
            // InternalAndroidGenerator.g:2048:2: ( rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 )
            // InternalAndroidGenerator.g:2048:3: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1
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
    // InternalAndroidGenerator.g:2057:1: rule__TypeMap__Group__0 : rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1 ;
    public final void rule__TypeMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2061:1: ( rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1 )
            // InternalAndroidGenerator.g:2062:2: rule__TypeMap__Group__0__Impl rule__TypeMap__Group__1
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
    // InternalAndroidGenerator.g:2069:1: rule__TypeMap__Group__0__Impl : ( () ) ;
    public final void rule__TypeMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2073:1: ( ( () ) )
            // InternalAndroidGenerator.g:2074:1: ( () )
            {
            // InternalAndroidGenerator.g:2074:1: ( () )
            // InternalAndroidGenerator.g:2075:2: ()
            {
             before(grammarAccess.getTypeMapAccess().getTypeMapAction_0()); 
            // InternalAndroidGenerator.g:2076:2: ()
            // InternalAndroidGenerator.g:2076:3: 
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
    // InternalAndroidGenerator.g:2084:1: rule__TypeMap__Group__1 : rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2 ;
    public final void rule__TypeMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2088:1: ( rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2 )
            // InternalAndroidGenerator.g:2089:2: rule__TypeMap__Group__1__Impl rule__TypeMap__Group__2
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
    // InternalAndroidGenerator.g:2096:1: rule__TypeMap__Group__1__Impl : ( 'Map' ) ;
    public final void rule__TypeMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2100:1: ( ( 'Map' ) )
            // InternalAndroidGenerator.g:2101:1: ( 'Map' )
            {
            // InternalAndroidGenerator.g:2101:1: ( 'Map' )
            // InternalAndroidGenerator.g:2102:2: 'Map'
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
    // InternalAndroidGenerator.g:2111:1: rule__TypeMap__Group__2 : rule__TypeMap__Group__2__Impl ;
    public final void rule__TypeMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2115:1: ( rule__TypeMap__Group__2__Impl )
            // InternalAndroidGenerator.g:2116:2: rule__TypeMap__Group__2__Impl
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
    // InternalAndroidGenerator.g:2122:1: rule__TypeMap__Group__2__Impl : ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? ) ;
    public final void rule__TypeMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2126:1: ( ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? ) )
            // InternalAndroidGenerator.g:2127:1: ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? )
            {
            // InternalAndroidGenerator.g:2127:1: ( ( rule__TypeMap__ActivitytypeattributeAssignment_2 )? )
            // InternalAndroidGenerator.g:2128:2: ( rule__TypeMap__ActivitytypeattributeAssignment_2 )?
            {
             before(grammarAccess.getTypeMapAccess().getActivitytypeattributeAssignment_2()); 
            // InternalAndroidGenerator.g:2129:2: ( rule__TypeMap__ActivitytypeattributeAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAndroidGenerator.g:2129:3: rule__TypeMap__ActivitytypeattributeAssignment_2
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
    // InternalAndroidGenerator.g:2138:1: rule__TypeSetting__Group__0 : rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1 ;
    public final void rule__TypeSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2142:1: ( rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1 )
            // InternalAndroidGenerator.g:2143:2: rule__TypeSetting__Group__0__Impl rule__TypeSetting__Group__1
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
    // InternalAndroidGenerator.g:2150:1: rule__TypeSetting__Group__0__Impl : ( () ) ;
    public final void rule__TypeSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2154:1: ( ( () ) )
            // InternalAndroidGenerator.g:2155:1: ( () )
            {
            // InternalAndroidGenerator.g:2155:1: ( () )
            // InternalAndroidGenerator.g:2156:2: ()
            {
             before(grammarAccess.getTypeSettingAccess().getTypeSettingAction_0()); 
            // InternalAndroidGenerator.g:2157:2: ()
            // InternalAndroidGenerator.g:2157:3: 
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
    // InternalAndroidGenerator.g:2165:1: rule__TypeSetting__Group__1 : rule__TypeSetting__Group__1__Impl ;
    public final void rule__TypeSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2169:1: ( rule__TypeSetting__Group__1__Impl )
            // InternalAndroidGenerator.g:2170:2: rule__TypeSetting__Group__1__Impl
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
    // InternalAndroidGenerator.g:2176:1: rule__TypeSetting__Group__1__Impl : ( 'Settings' ) ;
    public final void rule__TypeSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2180:1: ( ( 'Settings' ) )
            // InternalAndroidGenerator.g:2181:1: ( 'Settings' )
            {
            // InternalAndroidGenerator.g:2181:1: ( 'Settings' )
            // InternalAndroidGenerator.g:2182:2: 'Settings'
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
    // InternalAndroidGenerator.g:2192:1: rule__EditText__Group__0 : rule__EditText__Group__0__Impl rule__EditText__Group__1 ;
    public final void rule__EditText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2196:1: ( rule__EditText__Group__0__Impl rule__EditText__Group__1 )
            // InternalAndroidGenerator.g:2197:2: rule__EditText__Group__0__Impl rule__EditText__Group__1
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
    // InternalAndroidGenerator.g:2204:1: rule__EditText__Group__0__Impl : ( () ) ;
    public final void rule__EditText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2208:1: ( ( () ) )
            // InternalAndroidGenerator.g:2209:1: ( () )
            {
            // InternalAndroidGenerator.g:2209:1: ( () )
            // InternalAndroidGenerator.g:2210:2: ()
            {
             before(grammarAccess.getEditTextAccess().getEditTextAction_0()); 
            // InternalAndroidGenerator.g:2211:2: ()
            // InternalAndroidGenerator.g:2211:3: 
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
    // InternalAndroidGenerator.g:2219:1: rule__EditText__Group__1 : rule__EditText__Group__1__Impl rule__EditText__Group__2 ;
    public final void rule__EditText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2223:1: ( rule__EditText__Group__1__Impl rule__EditText__Group__2 )
            // InternalAndroidGenerator.g:2224:2: rule__EditText__Group__1__Impl rule__EditText__Group__2
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
    // InternalAndroidGenerator.g:2231:1: rule__EditText__Group__1__Impl : ( 'EditText' ) ;
    public final void rule__EditText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2235:1: ( ( 'EditText' ) )
            // InternalAndroidGenerator.g:2236:1: ( 'EditText' )
            {
            // InternalAndroidGenerator.g:2236:1: ( 'EditText' )
            // InternalAndroidGenerator.g:2237:2: 'EditText'
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
    // InternalAndroidGenerator.g:2246:1: rule__EditText__Group__2 : rule__EditText__Group__2__Impl ;
    public final void rule__EditText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2250:1: ( rule__EditText__Group__2__Impl )
            // InternalAndroidGenerator.g:2251:2: rule__EditText__Group__2__Impl
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
    // InternalAndroidGenerator.g:2257:1: rule__EditText__Group__2__Impl : ( ( rule__EditText__NameAssignment_2 ) ) ;
    public final void rule__EditText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2261:1: ( ( ( rule__EditText__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2262:1: ( ( rule__EditText__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2262:1: ( ( rule__EditText__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2263:2: ( rule__EditText__NameAssignment_2 )
            {
             before(grammarAccess.getEditTextAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2264:2: ( rule__EditText__NameAssignment_2 )
            // InternalAndroidGenerator.g:2264:3: rule__EditText__NameAssignment_2
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
    // InternalAndroidGenerator.g:2273:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2277:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // InternalAndroidGenerator.g:2278:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
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
    // InternalAndroidGenerator.g:2285:1: rule__Spinner__Group__0__Impl : ( () ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2289:1: ( ( () ) )
            // InternalAndroidGenerator.g:2290:1: ( () )
            {
            // InternalAndroidGenerator.g:2290:1: ( () )
            // InternalAndroidGenerator.g:2291:2: ()
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerAction_0()); 
            // InternalAndroidGenerator.g:2292:2: ()
            // InternalAndroidGenerator.g:2292:3: 
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
    // InternalAndroidGenerator.g:2300:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl rule__Spinner__Group__2 ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2304:1: ( rule__Spinner__Group__1__Impl rule__Spinner__Group__2 )
            // InternalAndroidGenerator.g:2305:2: rule__Spinner__Group__1__Impl rule__Spinner__Group__2
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
    // InternalAndroidGenerator.g:2312:1: rule__Spinner__Group__1__Impl : ( 'Spinner' ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2316:1: ( ( 'Spinner' ) )
            // InternalAndroidGenerator.g:2317:1: ( 'Spinner' )
            {
            // InternalAndroidGenerator.g:2317:1: ( 'Spinner' )
            // InternalAndroidGenerator.g:2318:2: 'Spinner'
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
    // InternalAndroidGenerator.g:2327:1: rule__Spinner__Group__2 : rule__Spinner__Group__2__Impl ;
    public final void rule__Spinner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2331:1: ( rule__Spinner__Group__2__Impl )
            // InternalAndroidGenerator.g:2332:2: rule__Spinner__Group__2__Impl
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
    // InternalAndroidGenerator.g:2338:1: rule__Spinner__Group__2__Impl : ( ( rule__Spinner__NameAssignment_2 ) ) ;
    public final void rule__Spinner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2342:1: ( ( ( rule__Spinner__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2343:1: ( ( rule__Spinner__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2343:1: ( ( rule__Spinner__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2344:2: ( rule__Spinner__NameAssignment_2 )
            {
             before(grammarAccess.getSpinnerAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2345:2: ( rule__Spinner__NameAssignment_2 )
            // InternalAndroidGenerator.g:2345:3: rule__Spinner__NameAssignment_2
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


    // $ANTLR start "rule__Textfield__Group__0"
    // InternalAndroidGenerator.g:2354:1: rule__Textfield__Group__0 : rule__Textfield__Group__0__Impl rule__Textfield__Group__1 ;
    public final void rule__Textfield__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2358:1: ( rule__Textfield__Group__0__Impl rule__Textfield__Group__1 )
            // InternalAndroidGenerator.g:2359:2: rule__Textfield__Group__0__Impl rule__Textfield__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Textfield__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Textfield__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__0"


    // $ANTLR start "rule__Textfield__Group__0__Impl"
    // InternalAndroidGenerator.g:2366:1: rule__Textfield__Group__0__Impl : ( () ) ;
    public final void rule__Textfield__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2370:1: ( ( () ) )
            // InternalAndroidGenerator.g:2371:1: ( () )
            {
            // InternalAndroidGenerator.g:2371:1: ( () )
            // InternalAndroidGenerator.g:2372:2: ()
            {
             before(grammarAccess.getTextfieldAccess().getTextfieldAction_0()); 
            // InternalAndroidGenerator.g:2373:2: ()
            // InternalAndroidGenerator.g:2373:3: 
            {
            }

             after(grammarAccess.getTextfieldAccess().getTextfieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__0__Impl"


    // $ANTLR start "rule__Textfield__Group__1"
    // InternalAndroidGenerator.g:2381:1: rule__Textfield__Group__1 : rule__Textfield__Group__1__Impl rule__Textfield__Group__2 ;
    public final void rule__Textfield__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2385:1: ( rule__Textfield__Group__1__Impl rule__Textfield__Group__2 )
            // InternalAndroidGenerator.g:2386:2: rule__Textfield__Group__1__Impl rule__Textfield__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Textfield__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Textfield__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__1"


    // $ANTLR start "rule__Textfield__Group__1__Impl"
    // InternalAndroidGenerator.g:2393:1: rule__Textfield__Group__1__Impl : ( 'Textfield' ) ;
    public final void rule__Textfield__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2397:1: ( ( 'Textfield' ) )
            // InternalAndroidGenerator.g:2398:1: ( 'Textfield' )
            {
            // InternalAndroidGenerator.g:2398:1: ( 'Textfield' )
            // InternalAndroidGenerator.g:2399:2: 'Textfield'
            {
             before(grammarAccess.getTextfieldAccess().getTextfieldKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTextfieldAccess().getTextfieldKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__1__Impl"


    // $ANTLR start "rule__Textfield__Group__2"
    // InternalAndroidGenerator.g:2408:1: rule__Textfield__Group__2 : rule__Textfield__Group__2__Impl ;
    public final void rule__Textfield__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2412:1: ( rule__Textfield__Group__2__Impl )
            // InternalAndroidGenerator.g:2413:2: rule__Textfield__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Textfield__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__2"


    // $ANTLR start "rule__Textfield__Group__2__Impl"
    // InternalAndroidGenerator.g:2419:1: rule__Textfield__Group__2__Impl : ( ( rule__Textfield__NameAssignment_2 ) ) ;
    public final void rule__Textfield__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2423:1: ( ( ( rule__Textfield__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2424:1: ( ( rule__Textfield__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2424:1: ( ( rule__Textfield__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2425:2: ( rule__Textfield__NameAssignment_2 )
            {
             before(grammarAccess.getTextfieldAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2426:2: ( rule__Textfield__NameAssignment_2 )
            // InternalAndroidGenerator.g:2426:3: rule__Textfield__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Textfield__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextfieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalAndroidGenerator.g:2435:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2439:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalAndroidGenerator.g:2440:2: rule__Button__Group__0__Impl rule__Button__Group__1
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
    // InternalAndroidGenerator.g:2447:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2451:1: ( ( () ) )
            // InternalAndroidGenerator.g:2452:1: ( () )
            {
            // InternalAndroidGenerator.g:2452:1: ( () )
            // InternalAndroidGenerator.g:2453:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalAndroidGenerator.g:2454:2: ()
            // InternalAndroidGenerator.g:2454:3: 
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
    // InternalAndroidGenerator.g:2462:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2466:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalAndroidGenerator.g:2467:2: rule__Button__Group__1__Impl rule__Button__Group__2
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
    // InternalAndroidGenerator.g:2474:1: rule__Button__Group__1__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2478:1: ( ( 'Button' ) )
            // InternalAndroidGenerator.g:2479:1: ( 'Button' )
            {
            // InternalAndroidGenerator.g:2479:1: ( 'Button' )
            // InternalAndroidGenerator.g:2480:2: 'Button'
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
    // InternalAndroidGenerator.g:2489:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2493:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalAndroidGenerator.g:2494:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalAndroidGenerator.g:2501:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2505:1: ( ( ( rule__Button__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:2506:1: ( ( rule__Button__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:2506:1: ( ( rule__Button__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:2507:2: ( rule__Button__NameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:2508:2: ( rule__Button__NameAssignment_2 )
            // InternalAndroidGenerator.g:2508:3: rule__Button__NameAssignment_2
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
    // InternalAndroidGenerator.g:2516:1: rule__Button__Group__3 : rule__Button__Group__3__Impl ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2520:1: ( rule__Button__Group__3__Impl )
            // InternalAndroidGenerator.g:2521:2: rule__Button__Group__3__Impl
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
    // InternalAndroidGenerator.g:2527:1: rule__Button__Group__3__Impl : ( ( rule__Button__Group_3__0 )? ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2531:1: ( ( ( rule__Button__Group_3__0 )? ) )
            // InternalAndroidGenerator.g:2532:1: ( ( rule__Button__Group_3__0 )? )
            {
            // InternalAndroidGenerator.g:2532:1: ( ( rule__Button__Group_3__0 )? )
            // InternalAndroidGenerator.g:2533:2: ( rule__Button__Group_3__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_3()); 
            // InternalAndroidGenerator.g:2534:2: ( rule__Button__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=28 && LA17_0<=29)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGenerator.g:2534:3: rule__Button__Group_3__0
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
    // InternalAndroidGenerator.g:2543:1: rule__Button__Group_3__0 : rule__Button__Group_3__0__Impl rule__Button__Group_3__1 ;
    public final void rule__Button__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2547:1: ( rule__Button__Group_3__0__Impl rule__Button__Group_3__1 )
            // InternalAndroidGenerator.g:2548:2: rule__Button__Group_3__0__Impl rule__Button__Group_3__1
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
    // InternalAndroidGenerator.g:2555:1: rule__Button__Group_3__0__Impl : ( ( rule__Button__ActionsAssignment_3_0 ) ) ;
    public final void rule__Button__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2559:1: ( ( ( rule__Button__ActionsAssignment_3_0 ) ) )
            // InternalAndroidGenerator.g:2560:1: ( ( rule__Button__ActionsAssignment_3_0 ) )
            {
            // InternalAndroidGenerator.g:2560:1: ( ( rule__Button__ActionsAssignment_3_0 ) )
            // InternalAndroidGenerator.g:2561:2: ( rule__Button__ActionsAssignment_3_0 )
            {
             before(grammarAccess.getButtonAccess().getActionsAssignment_3_0()); 
            // InternalAndroidGenerator.g:2562:2: ( rule__Button__ActionsAssignment_3_0 )
            // InternalAndroidGenerator.g:2562:3: rule__Button__ActionsAssignment_3_0
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
    // InternalAndroidGenerator.g:2570:1: rule__Button__Group_3__1 : rule__Button__Group_3__1__Impl ;
    public final void rule__Button__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2574:1: ( rule__Button__Group_3__1__Impl )
            // InternalAndroidGenerator.g:2575:2: rule__Button__Group_3__1__Impl
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
    // InternalAndroidGenerator.g:2581:1: rule__Button__Group_3__1__Impl : ( ( rule__Button__Group_3_1__0 )* ) ;
    public final void rule__Button__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2585:1: ( ( ( rule__Button__Group_3_1__0 )* ) )
            // InternalAndroidGenerator.g:2586:1: ( ( rule__Button__Group_3_1__0 )* )
            {
            // InternalAndroidGenerator.g:2586:1: ( ( rule__Button__Group_3_1__0 )* )
            // InternalAndroidGenerator.g:2587:2: ( rule__Button__Group_3_1__0 )*
            {
             before(grammarAccess.getButtonAccess().getGroup_3_1()); 
            // InternalAndroidGenerator.g:2588:2: ( rule__Button__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==12) ) {
                    int LA18_2 = input.LA(2);

                    if ( ((LA18_2>=28 && LA18_2<=29)) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2588:3: rule__Button__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Button__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAndroidGenerator.g:2597:1: rule__Button__Group_3_1__0 : rule__Button__Group_3_1__0__Impl rule__Button__Group_3_1__1 ;
    public final void rule__Button__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2601:1: ( rule__Button__Group_3_1__0__Impl rule__Button__Group_3_1__1 )
            // InternalAndroidGenerator.g:2602:2: rule__Button__Group_3_1__0__Impl rule__Button__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAndroidGenerator.g:2609:1: rule__Button__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Button__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2613:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:2614:1: ( ',' )
            {
            // InternalAndroidGenerator.g:2614:1: ( ',' )
            // InternalAndroidGenerator.g:2615:2: ','
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
    // InternalAndroidGenerator.g:2624:1: rule__Button__Group_3_1__1 : rule__Button__Group_3_1__1__Impl ;
    public final void rule__Button__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2628:1: ( rule__Button__Group_3_1__1__Impl )
            // InternalAndroidGenerator.g:2629:2: rule__Button__Group_3_1__1__Impl
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
    // InternalAndroidGenerator.g:2635:1: rule__Button__Group_3_1__1__Impl : ( ( rule__Button__ActionsAssignment_3_1_1 ) ) ;
    public final void rule__Button__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2639:1: ( ( ( rule__Button__ActionsAssignment_3_1_1 ) ) )
            // InternalAndroidGenerator.g:2640:1: ( ( rule__Button__ActionsAssignment_3_1_1 ) )
            {
            // InternalAndroidGenerator.g:2640:1: ( ( rule__Button__ActionsAssignment_3_1_1 ) )
            // InternalAndroidGenerator.g:2641:2: ( rule__Button__ActionsAssignment_3_1_1 )
            {
             before(grammarAccess.getButtonAccess().getActionsAssignment_3_1_1()); 
            // InternalAndroidGenerator.g:2642:2: ( rule__Button__ActionsAssignment_3_1_1 )
            // InternalAndroidGenerator.g:2642:3: rule__Button__ActionsAssignment_3_1_1
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
    // InternalAndroidGenerator.g:2651:1: rule__Toast__Group__0 : rule__Toast__Group__0__Impl rule__Toast__Group__1 ;
    public final void rule__Toast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2655:1: ( rule__Toast__Group__0__Impl rule__Toast__Group__1 )
            // InternalAndroidGenerator.g:2656:2: rule__Toast__Group__0__Impl rule__Toast__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAndroidGenerator.g:2663:1: rule__Toast__Group__0__Impl : ( 'Toast' ) ;
    public final void rule__Toast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2667:1: ( ( 'Toast' ) )
            // InternalAndroidGenerator.g:2668:1: ( 'Toast' )
            {
            // InternalAndroidGenerator.g:2668:1: ( 'Toast' )
            // InternalAndroidGenerator.g:2669:2: 'Toast'
            {
             before(grammarAccess.getToastAccess().getToastKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2678:1: rule__Toast__Group__1 : rule__Toast__Group__1__Impl ;
    public final void rule__Toast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2682:1: ( rule__Toast__Group__1__Impl )
            // InternalAndroidGenerator.g:2683:2: rule__Toast__Group__1__Impl
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
    // InternalAndroidGenerator.g:2689:1: rule__Toast__Group__1__Impl : ( ( rule__Toast__TextAssignment_1 ) ) ;
    public final void rule__Toast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2693:1: ( ( ( rule__Toast__TextAssignment_1 ) ) )
            // InternalAndroidGenerator.g:2694:1: ( ( rule__Toast__TextAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:2694:1: ( ( rule__Toast__TextAssignment_1 ) )
            // InternalAndroidGenerator.g:2695:2: ( rule__Toast__TextAssignment_1 )
            {
             before(grammarAccess.getToastAccess().getTextAssignment_1()); 
            // InternalAndroidGenerator.g:2696:2: ( rule__Toast__TextAssignment_1 )
            // InternalAndroidGenerator.g:2696:3: rule__Toast__TextAssignment_1
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
    // InternalAndroidGenerator.g:2705:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2709:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // InternalAndroidGenerator.g:2710:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
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
    // InternalAndroidGenerator.g:2717:1: rule__Bundle__Group__0__Impl : ( 'Bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2721:1: ( ( 'Bundle' ) )
            // InternalAndroidGenerator.g:2722:1: ( 'Bundle' )
            {
            // InternalAndroidGenerator.g:2722:1: ( 'Bundle' )
            // InternalAndroidGenerator.g:2723:2: 'Bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:2732:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2736:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // InternalAndroidGenerator.g:2737:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAndroidGenerator.g:2744:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__BundleRecipientAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2748:1: ( ( ( rule__Bundle__BundleRecipientAssignment_1 ) ) )
            // InternalAndroidGenerator.g:2749:1: ( ( rule__Bundle__BundleRecipientAssignment_1 ) )
            {
            // InternalAndroidGenerator.g:2749:1: ( ( rule__Bundle__BundleRecipientAssignment_1 ) )
            // InternalAndroidGenerator.g:2750:2: ( rule__Bundle__BundleRecipientAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientAssignment_1()); 
            // InternalAndroidGenerator.g:2751:2: ( rule__Bundle__BundleRecipientAssignment_1 )
            // InternalAndroidGenerator.g:2751:3: rule__Bundle__BundleRecipientAssignment_1
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
    // InternalAndroidGenerator.g:2759:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2763:1: ( rule__Bundle__Group__2__Impl )
            // InternalAndroidGenerator.g:2764:2: rule__Bundle__Group__2__Impl
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
    // InternalAndroidGenerator.g:2770:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__Group_2__0 )? ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2774:1: ( ( ( rule__Bundle__Group_2__0 )? ) )
            // InternalAndroidGenerator.g:2775:1: ( ( rule__Bundle__Group_2__0 )? )
            {
            // InternalAndroidGenerator.g:2775:1: ( ( rule__Bundle__Group_2__0 )? )
            // InternalAndroidGenerator.g:2776:2: ( rule__Bundle__Group_2__0 )?
            {
             before(grammarAccess.getBundleAccess().getGroup_2()); 
            // InternalAndroidGenerator.g:2777:2: ( rule__Bundle__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAndroidGenerator.g:2777:3: rule__Bundle__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bundle__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBundleAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Bundle__Group_2__0"
    // InternalAndroidGenerator.g:2786:1: rule__Bundle__Group_2__0 : rule__Bundle__Group_2__0__Impl rule__Bundle__Group_2__1 ;
    public final void rule__Bundle__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2790:1: ( rule__Bundle__Group_2__0__Impl rule__Bundle__Group_2__1 )
            // InternalAndroidGenerator.g:2791:2: rule__Bundle__Group_2__0__Impl rule__Bundle__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Bundle__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bundle__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2__0"


    // $ANTLR start "rule__Bundle__Group_2__0__Impl"
    // InternalAndroidGenerator.g:2798:1: rule__Bundle__Group_2__0__Impl : ( 'Holder' ) ;
    public final void rule__Bundle__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2802:1: ( ( 'Holder' ) )
            // InternalAndroidGenerator.g:2803:1: ( 'Holder' )
            {
            // InternalAndroidGenerator.g:2803:1: ( 'Holder' )
            // InternalAndroidGenerator.g:2804:2: 'Holder'
            {
             before(grammarAccess.getBundleAccess().getHolderKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBundleAccess().getHolderKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2__0__Impl"


    // $ANTLR start "rule__Bundle__Group_2__1"
    // InternalAndroidGenerator.g:2813:1: rule__Bundle__Group_2__1 : rule__Bundle__Group_2__1__Impl ;
    public final void rule__Bundle__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2817:1: ( rule__Bundle__Group_2__1__Impl )
            // InternalAndroidGenerator.g:2818:2: rule__Bundle__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2__1"


    // $ANTLR start "rule__Bundle__Group_2__1__Impl"
    // InternalAndroidGenerator.g:2824:1: rule__Bundle__Group_2__1__Impl : ( ( rule__Bundle__Group_2_1__0 )? ) ;
    public final void rule__Bundle__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2828:1: ( ( ( rule__Bundle__Group_2_1__0 )? ) )
            // InternalAndroidGenerator.g:2829:1: ( ( rule__Bundle__Group_2_1__0 )? )
            {
            // InternalAndroidGenerator.g:2829:1: ( ( rule__Bundle__Group_2_1__0 )? )
            // InternalAndroidGenerator.g:2830:2: ( rule__Bundle__Group_2_1__0 )?
            {
             before(grammarAccess.getBundleAccess().getGroup_2_1()); 
            // InternalAndroidGenerator.g:2831:2: ( rule__Bundle__Group_2_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAndroidGenerator.g:2831:3: rule__Bundle__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bundle__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBundleAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2__1__Impl"


    // $ANTLR start "rule__Bundle__Group_2_1__0"
    // InternalAndroidGenerator.g:2840:1: rule__Bundle__Group_2_1__0 : rule__Bundle__Group_2_1__0__Impl rule__Bundle__Group_2_1__1 ;
    public final void rule__Bundle__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2844:1: ( rule__Bundle__Group_2_1__0__Impl rule__Bundle__Group_2_1__1 )
            // InternalAndroidGenerator.g:2845:2: rule__Bundle__Group_2_1__0__Impl rule__Bundle__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Bundle__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bundle__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2_1__0"


    // $ANTLR start "rule__Bundle__Group_2_1__0__Impl"
    // InternalAndroidGenerator.g:2852:1: rule__Bundle__Group_2_1__0__Impl : ( ( rule__Bundle__HolderAssignment_2_1_0 ) ) ;
    public final void rule__Bundle__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2856:1: ( ( ( rule__Bundle__HolderAssignment_2_1_0 ) ) )
            // InternalAndroidGenerator.g:2857:1: ( ( rule__Bundle__HolderAssignment_2_1_0 ) )
            {
            // InternalAndroidGenerator.g:2857:1: ( ( rule__Bundle__HolderAssignment_2_1_0 ) )
            // InternalAndroidGenerator.g:2858:2: ( rule__Bundle__HolderAssignment_2_1_0 )
            {
             before(grammarAccess.getBundleAccess().getHolderAssignment_2_1_0()); 
            // InternalAndroidGenerator.g:2859:2: ( rule__Bundle__HolderAssignment_2_1_0 )
            // InternalAndroidGenerator.g:2859:3: rule__Bundle__HolderAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__HolderAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBundleAccess().getHolderAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2_1__0__Impl"


    // $ANTLR start "rule__Bundle__Group_2_1__1"
    // InternalAndroidGenerator.g:2867:1: rule__Bundle__Group_2_1__1 : rule__Bundle__Group_2_1__1__Impl ;
    public final void rule__Bundle__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2871:1: ( rule__Bundle__Group_2_1__1__Impl )
            // InternalAndroidGenerator.g:2872:2: rule__Bundle__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2_1__1"


    // $ANTLR start "rule__Bundle__Group_2_1__1__Impl"
    // InternalAndroidGenerator.g:2878:1: rule__Bundle__Group_2_1__1__Impl : ( ( rule__Bundle__Group_2_1_1__0 )* ) ;
    public final void rule__Bundle__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2882:1: ( ( ( rule__Bundle__Group_2_1_1__0 )* ) )
            // InternalAndroidGenerator.g:2883:1: ( ( rule__Bundle__Group_2_1_1__0 )* )
            {
            // InternalAndroidGenerator.g:2883:1: ( ( rule__Bundle__Group_2_1_1__0 )* )
            // InternalAndroidGenerator.g:2884:2: ( rule__Bundle__Group_2_1_1__0 )*
            {
             before(grammarAccess.getBundleAccess().getGroup_2_1_1()); 
            // InternalAndroidGenerator.g:2885:2: ( rule__Bundle__Group_2_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_ID) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalAndroidGenerator.g:2885:3: rule__Bundle__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Bundle__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2_1__1__Impl"


    // $ANTLR start "rule__Bundle__Group_2_1_1__0"
    // InternalAndroidGenerator.g:2894:1: rule__Bundle__Group_2_1_1__0 : rule__Bundle__Group_2_1_1__0__Impl rule__Bundle__Group_2_1_1__1 ;
    public final void rule__Bundle__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2898:1: ( rule__Bundle__Group_2_1_1__0__Impl rule__Bundle__Group_2_1_1__1 )
            // InternalAndroidGenerator.g:2899:2: rule__Bundle__Group_2_1_1__0__Impl rule__Bundle__Group_2_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Bundle__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bundle__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2_1_1__0"


    // $ANTLR start "rule__Bundle__Group_2_1_1__0__Impl"
    // InternalAndroidGenerator.g:2906:1: rule__Bundle__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Bundle__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2910:1: ( ( ',' ) )
            // InternalAndroidGenerator.g:2911:1: ( ',' )
            {
            // InternalAndroidGenerator.g:2911:1: ( ',' )
            // InternalAndroidGenerator.g:2912:2: ','
            {
             before(grammarAccess.getBundleAccess().getCommaKeyword_2_1_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBundleAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Bundle__Group_2_1_1__1"
    // InternalAndroidGenerator.g:2921:1: rule__Bundle__Group_2_1_1__1 : rule__Bundle__Group_2_1_1__1__Impl ;
    public final void rule__Bundle__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2925:1: ( rule__Bundle__Group_2_1_1__1__Impl )
            // InternalAndroidGenerator.g:2926:2: rule__Bundle__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2_1_1__1"


    // $ANTLR start "rule__Bundle__Group_2_1_1__1__Impl"
    // InternalAndroidGenerator.g:2932:1: rule__Bundle__Group_2_1_1__1__Impl : ( ( rule__Bundle__HolderAssignment_2_1_1_1 ) ) ;
    public final void rule__Bundle__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2936:1: ( ( ( rule__Bundle__HolderAssignment_2_1_1_1 ) ) )
            // InternalAndroidGenerator.g:2937:1: ( ( rule__Bundle__HolderAssignment_2_1_1_1 ) )
            {
            // InternalAndroidGenerator.g:2937:1: ( ( rule__Bundle__HolderAssignment_2_1_1_1 ) )
            // InternalAndroidGenerator.g:2938:2: ( rule__Bundle__HolderAssignment_2_1_1_1 )
            {
             before(grammarAccess.getBundleAccess().getHolderAssignment_2_1_1_1()); 
            // InternalAndroidGenerator.g:2939:2: ( rule__Bundle__HolderAssignment_2_1_1_1 )
            // InternalAndroidGenerator.g:2939:3: rule__Bundle__HolderAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Bundle__HolderAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBundleAccess().getHolderAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__FilterQuery__Group__0"
    // InternalAndroidGenerator.g:2948:1: rule__FilterQuery__Group__0 : rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 ;
    public final void rule__FilterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2952:1: ( rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1 )
            // InternalAndroidGenerator.g:2953:2: rule__FilterQuery__Group__0__Impl rule__FilterQuery__Group__1
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
    // InternalAndroidGenerator.g:2960:1: rule__FilterQuery__Group__0__Impl : ( () ) ;
    public final void rule__FilterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2964:1: ( ( () ) )
            // InternalAndroidGenerator.g:2965:1: ( () )
            {
            // InternalAndroidGenerator.g:2965:1: ( () )
            // InternalAndroidGenerator.g:2966:2: ()
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryAction_0()); 
            // InternalAndroidGenerator.g:2967:2: ()
            // InternalAndroidGenerator.g:2967:3: 
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
    // InternalAndroidGenerator.g:2975:1: rule__FilterQuery__Group__1 : rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 ;
    public final void rule__FilterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2979:1: ( rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2 )
            // InternalAndroidGenerator.g:2980:2: rule__FilterQuery__Group__1__Impl rule__FilterQuery__Group__2
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
    // InternalAndroidGenerator.g:2987:1: rule__FilterQuery__Group__1__Impl : ( 'FilterQuery' ) ;
    public final void rule__FilterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:2991:1: ( ( 'FilterQuery' ) )
            // InternalAndroidGenerator.g:2992:1: ( 'FilterQuery' )
            {
            // InternalAndroidGenerator.g:2992:1: ( 'FilterQuery' )
            // InternalAndroidGenerator.g:2993:2: 'FilterQuery'
            {
             before(grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3002:1: rule__FilterQuery__Group__2 : rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 ;
    public final void rule__FilterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3006:1: ( rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3 )
            // InternalAndroidGenerator.g:3007:2: rule__FilterQuery__Group__2__Impl rule__FilterQuery__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalAndroidGenerator.g:3014:1: rule__FilterQuery__Group__2__Impl : ( ( rule__FilterQuery__NameAssignment_2 ) ) ;
    public final void rule__FilterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3018:1: ( ( ( rule__FilterQuery__NameAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3019:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3019:1: ( ( rule__FilterQuery__NameAssignment_2 ) )
            // InternalAndroidGenerator.g:3020:2: ( rule__FilterQuery__NameAssignment_2 )
            {
             before(grammarAccess.getFilterQueryAccess().getNameAssignment_2()); 
            // InternalAndroidGenerator.g:3021:2: ( rule__FilterQuery__NameAssignment_2 )
            // InternalAndroidGenerator.g:3021:3: rule__FilterQuery__NameAssignment_2
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
    // InternalAndroidGenerator.g:3029:1: rule__FilterQuery__Group__3 : rule__FilterQuery__Group__3__Impl ;
    public final void rule__FilterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3033:1: ( rule__FilterQuery__Group__3__Impl )
            // InternalAndroidGenerator.g:3034:2: rule__FilterQuery__Group__3__Impl
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
    // InternalAndroidGenerator.g:3040:1: rule__FilterQuery__Group__3__Impl : ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) ;
    public final void rule__FilterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3044:1: ( ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) ) )
            // InternalAndroidGenerator.g:3045:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:3045:1: ( ( rule__FilterQuery__FilterAttributesAssignment_3 ) )
            // InternalAndroidGenerator.g:3046:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            {
             before(grammarAccess.getFilterQueryAccess().getFilterAttributesAssignment_3()); 
            // InternalAndroidGenerator.g:3047:2: ( rule__FilterQuery__FilterAttributesAssignment_3 )
            // InternalAndroidGenerator.g:3047:3: rule__FilterQuery__FilterAttributesAssignment_3
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
    // InternalAndroidGenerator.g:3056:1: rule__Distance__Group__0 : rule__Distance__Group__0__Impl rule__Distance__Group__1 ;
    public final void rule__Distance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3060:1: ( rule__Distance__Group__0__Impl rule__Distance__Group__1 )
            // InternalAndroidGenerator.g:3061:2: rule__Distance__Group__0__Impl rule__Distance__Group__1
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
    // InternalAndroidGenerator.g:3068:1: rule__Distance__Group__0__Impl : ( 'Distance' ) ;
    public final void rule__Distance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3072:1: ( ( 'Distance' ) )
            // InternalAndroidGenerator.g:3073:1: ( 'Distance' )
            {
            // InternalAndroidGenerator.g:3073:1: ( 'Distance' )
            // InternalAndroidGenerator.g:3074:2: 'Distance'
            {
             before(grammarAccess.getDistanceAccess().getDistanceKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3083:1: rule__Distance__Group__1 : rule__Distance__Group__1__Impl rule__Distance__Group__2 ;
    public final void rule__Distance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3087:1: ( rule__Distance__Group__1__Impl rule__Distance__Group__2 )
            // InternalAndroidGenerator.g:3088:2: rule__Distance__Group__1__Impl rule__Distance__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalAndroidGenerator.g:3095:1: rule__Distance__Group__1__Impl : ( ':' ) ;
    public final void rule__Distance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3099:1: ( ( ':' ) )
            // InternalAndroidGenerator.g:3100:1: ( ':' )
            {
            // InternalAndroidGenerator.g:3100:1: ( ':' )
            // InternalAndroidGenerator.g:3101:2: ':'
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
    // InternalAndroidGenerator.g:3110:1: rule__Distance__Group__2 : rule__Distance__Group__2__Impl rule__Distance__Group__3 ;
    public final void rule__Distance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3114:1: ( rule__Distance__Group__2__Impl rule__Distance__Group__3 )
            // InternalAndroidGenerator.g:3115:2: rule__Distance__Group__2__Impl rule__Distance__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalAndroidGenerator.g:3122:1: rule__Distance__Group__2__Impl : ( ( rule__Distance__UnitAssignment_2 ) ) ;
    public final void rule__Distance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3126:1: ( ( ( rule__Distance__UnitAssignment_2 ) ) )
            // InternalAndroidGenerator.g:3127:1: ( ( rule__Distance__UnitAssignment_2 ) )
            {
            // InternalAndroidGenerator.g:3127:1: ( ( rule__Distance__UnitAssignment_2 ) )
            // InternalAndroidGenerator.g:3128:2: ( rule__Distance__UnitAssignment_2 )
            {
             before(grammarAccess.getDistanceAccess().getUnitAssignment_2()); 
            // InternalAndroidGenerator.g:3129:2: ( rule__Distance__UnitAssignment_2 )
            // InternalAndroidGenerator.g:3129:3: rule__Distance__UnitAssignment_2
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
    // InternalAndroidGenerator.g:3137:1: rule__Distance__Group__3 : rule__Distance__Group__3__Impl rule__Distance__Group__4 ;
    public final void rule__Distance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3141:1: ( rule__Distance__Group__3__Impl rule__Distance__Group__4 )
            // InternalAndroidGenerator.g:3142:2: rule__Distance__Group__3__Impl rule__Distance__Group__4
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
    // InternalAndroidGenerator.g:3149:1: rule__Distance__Group__3__Impl : ( ( rule__Distance__OperatorAssignment_3 ) ) ;
    public final void rule__Distance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3153:1: ( ( ( rule__Distance__OperatorAssignment_3 ) ) )
            // InternalAndroidGenerator.g:3154:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            {
            // InternalAndroidGenerator.g:3154:1: ( ( rule__Distance__OperatorAssignment_3 ) )
            // InternalAndroidGenerator.g:3155:2: ( rule__Distance__OperatorAssignment_3 )
            {
             before(grammarAccess.getDistanceAccess().getOperatorAssignment_3()); 
            // InternalAndroidGenerator.g:3156:2: ( rule__Distance__OperatorAssignment_3 )
            // InternalAndroidGenerator.g:3156:3: rule__Distance__OperatorAssignment_3
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
    // InternalAndroidGenerator.g:3164:1: rule__Distance__Group__4 : rule__Distance__Group__4__Impl ;
    public final void rule__Distance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3168:1: ( rule__Distance__Group__4__Impl )
            // InternalAndroidGenerator.g:3169:2: rule__Distance__Group__4__Impl
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
    // InternalAndroidGenerator.g:3175:1: rule__Distance__Group__4__Impl : ( ( rule__Distance__ResultsAssignment_4 ) ) ;
    public final void rule__Distance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3179:1: ( ( ( rule__Distance__ResultsAssignment_4 ) ) )
            // InternalAndroidGenerator.g:3180:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            {
            // InternalAndroidGenerator.g:3180:1: ( ( rule__Distance__ResultsAssignment_4 ) )
            // InternalAndroidGenerator.g:3181:2: ( rule__Distance__ResultsAssignment_4 )
            {
             before(grammarAccess.getDistanceAccess().getResultsAssignment_4()); 
            // InternalAndroidGenerator.g:3182:2: ( rule__Distance__ResultsAssignment_4 )
            // InternalAndroidGenerator.g:3182:3: rule__Distance__ResultsAssignment_4
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
    // InternalAndroidGenerator.g:3191:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
    public final void rule__Operator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3195:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
            // InternalAndroidGenerator.g:3196:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAndroidGenerator.g:3203:1: rule__Operator__Group_0__0__Impl : ( () ) ;
    public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3207:1: ( ( () ) )
            // InternalAndroidGenerator.g:3208:1: ( () )
            {
            // InternalAndroidGenerator.g:3208:1: ( () )
            // InternalAndroidGenerator.g:3209:2: ()
            {
             before(grammarAccess.getOperatorAccess().getLessAction_0_0()); 
            // InternalAndroidGenerator.g:3210:2: ()
            // InternalAndroidGenerator.g:3210:3: 
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
    // InternalAndroidGenerator.g:3218:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl ;
    public final void rule__Operator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3222:1: ( rule__Operator__Group_0__1__Impl )
            // InternalAndroidGenerator.g:3223:2: rule__Operator__Group_0__1__Impl
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
    // InternalAndroidGenerator.g:3229:1: rule__Operator__Group_0__1__Impl : ( '>' ) ;
    public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3233:1: ( ( '>' ) )
            // InternalAndroidGenerator.g:3234:1: ( '>' )
            {
            // InternalAndroidGenerator.g:3234:1: ( '>' )
            // InternalAndroidGenerator.g:3235:2: '>'
            {
             before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3245:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3249:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalAndroidGenerator.g:3250:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAndroidGenerator.g:3257:1: rule__Operator__Group_1__0__Impl : ( () ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3261:1: ( ( () ) )
            // InternalAndroidGenerator.g:3262:1: ( () )
            {
            // InternalAndroidGenerator.g:3262:1: ( () )
            // InternalAndroidGenerator.g:3263:2: ()
            {
             before(grammarAccess.getOperatorAccess().getMoreAction_1_0()); 
            // InternalAndroidGenerator.g:3264:2: ()
            // InternalAndroidGenerator.g:3264:3: 
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
    // InternalAndroidGenerator.g:3272:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3276:1: ( rule__Operator__Group_1__1__Impl )
            // InternalAndroidGenerator.g:3277:2: rule__Operator__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:3283:1: rule__Operator__Group_1__1__Impl : ( '<' ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3287:1: ( ( '<' ) )
            // InternalAndroidGenerator.g:3288:1: ( '<' )
            {
            // InternalAndroidGenerator.g:3288:1: ( '<' )
            // InternalAndroidGenerator.g:3289:2: '<'
            {
             before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3299:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3303:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalAndroidGenerator.g:3304:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAndroidGenerator.g:3311:1: rule__Operator__Group_2__0__Impl : ( () ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3315:1: ( ( () ) )
            // InternalAndroidGenerator.g:3316:1: ( () )
            {
            // InternalAndroidGenerator.g:3316:1: ( () )
            // InternalAndroidGenerator.g:3317:2: ()
            {
             before(grammarAccess.getOperatorAccess().getEqualAction_2_0()); 
            // InternalAndroidGenerator.g:3318:2: ()
            // InternalAndroidGenerator.g:3318:3: 
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
    // InternalAndroidGenerator.g:3326:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3330:1: ( rule__Operator__Group_2__1__Impl )
            // InternalAndroidGenerator.g:3331:2: rule__Operator__Group_2__1__Impl
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
    // InternalAndroidGenerator.g:3337:1: rule__Operator__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3341:1: ( ( '=' ) )
            // InternalAndroidGenerator.g:3342:1: ( '=' )
            {
            // InternalAndroidGenerator.g:3342:1: ( '=' )
            // InternalAndroidGenerator.g:3343:2: '='
            {
             before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3353:1: rule__Unit__Group_0__0 : rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 ;
    public final void rule__Unit__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3357:1: ( rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1 )
            // InternalAndroidGenerator.g:3358:2: rule__Unit__Group_0__0__Impl rule__Unit__Group_0__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAndroidGenerator.g:3365:1: rule__Unit__Group_0__0__Impl : ( () ) ;
    public final void rule__Unit__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3369:1: ( ( () ) )
            // InternalAndroidGenerator.g:3370:1: ( () )
            {
            // InternalAndroidGenerator.g:3370:1: ( () )
            // InternalAndroidGenerator.g:3371:2: ()
            {
             before(grammarAccess.getUnitAccess().getMetersAction_0_0()); 
            // InternalAndroidGenerator.g:3372:2: ()
            // InternalAndroidGenerator.g:3372:3: 
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
    // InternalAndroidGenerator.g:3380:1: rule__Unit__Group_0__1 : rule__Unit__Group_0__1__Impl ;
    public final void rule__Unit__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3384:1: ( rule__Unit__Group_0__1__Impl )
            // InternalAndroidGenerator.g:3385:2: rule__Unit__Group_0__1__Impl
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
    // InternalAndroidGenerator.g:3391:1: rule__Unit__Group_0__1__Impl : ( 'm' ) ;
    public final void rule__Unit__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3395:1: ( ( 'm' ) )
            // InternalAndroidGenerator.g:3396:1: ( 'm' )
            {
            // InternalAndroidGenerator.g:3396:1: ( 'm' )
            // InternalAndroidGenerator.g:3397:2: 'm'
            {
             before(grammarAccess.getUnitAccess().getMKeyword_0_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3407:1: rule__Unit__Group_1__0 : rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 ;
    public final void rule__Unit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3411:1: ( rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1 )
            // InternalAndroidGenerator.g:3412:2: rule__Unit__Group_1__0__Impl rule__Unit__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAndroidGenerator.g:3419:1: rule__Unit__Group_1__0__Impl : ( () ) ;
    public final void rule__Unit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3423:1: ( ( () ) )
            // InternalAndroidGenerator.g:3424:1: ( () )
            {
            // InternalAndroidGenerator.g:3424:1: ( () )
            // InternalAndroidGenerator.g:3425:2: ()
            {
             before(grammarAccess.getUnitAccess().getImperialAction_1_0()); 
            // InternalAndroidGenerator.g:3426:2: ()
            // InternalAndroidGenerator.g:3426:3: 
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
    // InternalAndroidGenerator.g:3434:1: rule__Unit__Group_1__1 : rule__Unit__Group_1__1__Impl ;
    public final void rule__Unit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3438:1: ( rule__Unit__Group_1__1__Impl )
            // InternalAndroidGenerator.g:3439:2: rule__Unit__Group_1__1__Impl
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
    // InternalAndroidGenerator.g:3445:1: rule__Unit__Group_1__1__Impl : ( 'f' ) ;
    public final void rule__Unit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3449:1: ( ( 'f' ) )
            // InternalAndroidGenerator.g:3450:1: ( 'f' )
            {
            // InternalAndroidGenerator.g:3450:1: ( 'f' )
            // InternalAndroidGenerator.g:3451:2: 'f'
            {
             before(grammarAccess.getUnitAccess().getFKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAndroidGenerator.g:3461:1: rule__AndroidAppProject__ApplicationsAssignment_0 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3465:1: ( ( ruleApplication ) )
            // InternalAndroidGenerator.g:3466:2: ( ruleApplication )
            {
            // InternalAndroidGenerator.g:3466:2: ( ruleApplication )
            // InternalAndroidGenerator.g:3467:3: ruleApplication
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
    // InternalAndroidGenerator.g:3476:1: rule__AndroidAppProject__ApplicationsAssignment_1_1 : ( ruleApplication ) ;
    public final void rule__AndroidAppProject__ApplicationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3480:1: ( ( ruleApplication ) )
            // InternalAndroidGenerator.g:3481:2: ( ruleApplication )
            {
            // InternalAndroidGenerator.g:3481:2: ( ruleApplication )
            // InternalAndroidGenerator.g:3482:3: ruleApplication
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
    // InternalAndroidGenerator.g:3491:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3495:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3496:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3496:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3497:3: RULE_ID
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
    // InternalAndroidGenerator.g:3506:1: rule__Application__AttributesAssignment_2 : ( ruleApplicationAttribute ) ;
    public final void rule__Application__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3510:1: ( ( ruleApplicationAttribute ) )
            // InternalAndroidGenerator.g:3511:2: ( ruleApplicationAttribute )
            {
            // InternalAndroidGenerator.g:3511:2: ( ruleApplicationAttribute )
            // InternalAndroidGenerator.g:3512:3: ruleApplicationAttribute
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
    // InternalAndroidGenerator.g:3521:1: rule__ApplicationVersion__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__ApplicationVersion__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3525:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3526:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3526:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3527:3: ruleNumber
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
    // InternalAndroidGenerator.g:3536:1: rule__ApplicationVersion__TargetsdkAssignment_4 : ( ruleTargetSDK ) ;
    public final void rule__ApplicationVersion__TargetsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3540:1: ( ( ruleTargetSDK ) )
            // InternalAndroidGenerator.g:3541:2: ( ruleTargetSDK )
            {
            // InternalAndroidGenerator.g:3541:2: ( ruleTargetSDK )
            // InternalAndroidGenerator.g:3542:3: ruleTargetSDK
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
    // InternalAndroidGenerator.g:3551:1: rule__TargetSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__TargetSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3555:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3556:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3556:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3557:3: ruleNumber
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
    // InternalAndroidGenerator.g:3566:1: rule__TargetSDK__MinsdkAssignment_4 : ( ruleMinSDK ) ;
    public final void rule__TargetSDK__MinsdkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3570:1: ( ( ruleMinSDK ) )
            // InternalAndroidGenerator.g:3571:2: ( ruleMinSDK )
            {
            // InternalAndroidGenerator.g:3571:2: ( ruleMinSDK )
            // InternalAndroidGenerator.g:3572:3: ruleMinSDK
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
    // InternalAndroidGenerator.g:3581:1: rule__MinSDK__ResultAssignment_3 : ( ruleNumber ) ;
    public final void rule__MinSDK__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3585:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:3586:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:3586:2: ( ruleNumber )
            // InternalAndroidGenerator.g:3587:3: ruleNumber
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
    // InternalAndroidGenerator.g:3596:1: rule__ApplicationPermissionList__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3600:1: ( ( rulePermission ) )
            // InternalAndroidGenerator.g:3601:2: ( rulePermission )
            {
            // InternalAndroidGenerator.g:3601:2: ( rulePermission )
            // InternalAndroidGenerator.g:3602:3: rulePermission
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
    // InternalAndroidGenerator.g:3611:1: rule__ApplicationPermissionList__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__ApplicationPermissionList__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3615:1: ( ( rulePermission ) )
            // InternalAndroidGenerator.g:3616:2: ( rulePermission )
            {
            // InternalAndroidGenerator.g:3616:2: ( rulePermission )
            // InternalAndroidGenerator.g:3617:3: rulePermission
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
    // InternalAndroidGenerator.g:3626:1: rule__Permission__NameAssignment : ( RULE_PACKAGE_NAME ) ;
    public final void rule__Permission__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3630:1: ( ( RULE_PACKAGE_NAME ) )
            // InternalAndroidGenerator.g:3631:2: ( RULE_PACKAGE_NAME )
            {
            // InternalAndroidGenerator.g:3631:2: ( RULE_PACKAGE_NAME )
            // InternalAndroidGenerator.g:3632:3: RULE_PACKAGE_NAME
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
    // InternalAndroidGenerator.g:3641:1: rule__ApplicationElementList__ElementsAssignment_2 : ( ruleApplicationElement ) ;
    public final void rule__ApplicationElementList__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3645:1: ( ( ruleApplicationElement ) )
            // InternalAndroidGenerator.g:3646:2: ( ruleApplicationElement )
            {
            // InternalAndroidGenerator.g:3646:2: ( ruleApplicationElement )
            // InternalAndroidGenerator.g:3647:3: ruleApplicationElement
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
    // InternalAndroidGenerator.g:3656:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3660:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3661:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3661:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3662:3: RULE_ID
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
    // InternalAndroidGenerator.g:3671:1: rule__Fragment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3675:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3676:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3676:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3677:3: RULE_ID
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
    // InternalAndroidGenerator.g:3686:1: rule__Fragment__ActivityAttributesAssignment_3 : ( ruleActivityLayoutAttributes ) ;
    public final void rule__Fragment__ActivityAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3690:1: ( ( ruleActivityLayoutAttributes ) )
            // InternalAndroidGenerator.g:3691:2: ( ruleActivityLayoutAttributes )
            {
            // InternalAndroidGenerator.g:3691:2: ( ruleActivityLayoutAttributes )
            // InternalAndroidGenerator.g:3692:3: ruleActivityLayoutAttributes
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
    // InternalAndroidGenerator.g:3701:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_0 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3705:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGenerator.g:3706:2: ( ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:3706:2: ( ruleLayoutElement )
            // InternalAndroidGenerator.g:3707:3: ruleLayoutElement
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
    // InternalAndroidGenerator.g:3716:1: rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1 : ( ruleLayoutElement ) ;
    public final void rule__ActivityLayoutAttributes__LayoutElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3720:1: ( ( ruleLayoutElement ) )
            // InternalAndroidGenerator.g:3721:2: ( ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:3721:2: ( ruleLayoutElement )
            // InternalAndroidGenerator.g:3722:3: ruleLayoutElement
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
    // InternalAndroidGenerator.g:3731:1: rule__TypeMap__ActivitytypeattributeAssignment_2 : ( ruleActivityTypeAttributes ) ;
    public final void rule__TypeMap__ActivitytypeattributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3735:1: ( ( ruleActivityTypeAttributes ) )
            // InternalAndroidGenerator.g:3736:2: ( ruleActivityTypeAttributes )
            {
            // InternalAndroidGenerator.g:3736:2: ( ruleActivityTypeAttributes )
            // InternalAndroidGenerator.g:3737:3: ruleActivityTypeAttributes
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
    // InternalAndroidGenerator.g:3746:1: rule__ActivityTypeAttributes__FilterAssignment : ( ruleFilterQuery ) ;
    public final void rule__ActivityTypeAttributes__FilterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3750:1: ( ( ruleFilterQuery ) )
            // InternalAndroidGenerator.g:3751:2: ( ruleFilterQuery )
            {
            // InternalAndroidGenerator.g:3751:2: ( ruleFilterQuery )
            // InternalAndroidGenerator.g:3752:3: ruleFilterQuery
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
    // InternalAndroidGenerator.g:3761:1: rule__EditText__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EditText__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3765:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3766:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3766:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3767:3: RULE_ID
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
    // InternalAndroidGenerator.g:3776:1: rule__Spinner__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Spinner__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3780:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3781:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3781:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3782:3: RULE_ID
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


    // $ANTLR start "rule__Textfield__NameAssignment_2"
    // InternalAndroidGenerator.g:3791:1: rule__Textfield__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Textfield__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3795:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3796:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3796:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3797:3: RULE_ID
            {
             before(grammarAccess.getTextfieldAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextfieldAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Textfield__NameAssignment_2"


    // $ANTLR start "rule__Button__NameAssignment_2"
    // InternalAndroidGenerator.g:3806:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3810:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3811:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3811:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3812:3: RULE_ID
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
    // InternalAndroidGenerator.g:3821:1: rule__Button__ActionsAssignment_3_0 : ( ruleButtonActions ) ;
    public final void rule__Button__ActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3825:1: ( ( ruleButtonActions ) )
            // InternalAndroidGenerator.g:3826:2: ( ruleButtonActions )
            {
            // InternalAndroidGenerator.g:3826:2: ( ruleButtonActions )
            // InternalAndroidGenerator.g:3827:3: ruleButtonActions
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
    // InternalAndroidGenerator.g:3836:1: rule__Button__ActionsAssignment_3_1_1 : ( ruleButtonActions ) ;
    public final void rule__Button__ActionsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3840:1: ( ( ruleButtonActions ) )
            // InternalAndroidGenerator.g:3841:2: ( ruleButtonActions )
            {
            // InternalAndroidGenerator.g:3841:2: ( ruleButtonActions )
            // InternalAndroidGenerator.g:3842:3: ruleButtonActions
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
    // InternalAndroidGenerator.g:3851:1: rule__Toast__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Toast__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3855:1: ( ( RULE_STRING ) )
            // InternalAndroidGenerator.g:3856:2: ( RULE_STRING )
            {
            // InternalAndroidGenerator.g:3856:2: ( RULE_STRING )
            // InternalAndroidGenerator.g:3857:3: RULE_STRING
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
    // InternalAndroidGenerator.g:3866:1: rule__Bundle__BundleRecipientAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bundle__BundleRecipientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3870:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGenerator.g:3871:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGenerator.g:3871:2: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3872:3: ( RULE_ID )
            {
             before(grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_1_0()); 
            // InternalAndroidGenerator.g:3873:3: ( RULE_ID )
            // InternalAndroidGenerator.g:3874:4: RULE_ID
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


    // $ANTLR start "rule__Bundle__HolderAssignment_2_1_0"
    // InternalAndroidGenerator.g:3885:1: rule__Bundle__HolderAssignment_2_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Bundle__HolderAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3889:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGenerator.g:3890:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGenerator.g:3890:2: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3891:3: ( RULE_ID )
            {
             before(grammarAccess.getBundleAccess().getHolderDataholdersCrossReference_2_1_0_0()); 
            // InternalAndroidGenerator.g:3892:3: ( RULE_ID )
            // InternalAndroidGenerator.g:3893:4: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getHolderDataholdersIDTerminalRuleCall_2_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBundleAccess().getHolderDataholdersIDTerminalRuleCall_2_1_0_0_1()); 

            }

             after(grammarAccess.getBundleAccess().getHolderDataholdersCrossReference_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__HolderAssignment_2_1_0"


    // $ANTLR start "rule__Bundle__HolderAssignment_2_1_1_1"
    // InternalAndroidGenerator.g:3904:1: rule__Bundle__HolderAssignment_2_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bundle__HolderAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3908:1: ( ( ( RULE_ID ) ) )
            // InternalAndroidGenerator.g:3909:2: ( ( RULE_ID ) )
            {
            // InternalAndroidGenerator.g:3909:2: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3910:3: ( RULE_ID )
            {
             before(grammarAccess.getBundleAccess().getHolderDataholdersCrossReference_2_1_1_1_0()); 
            // InternalAndroidGenerator.g:3911:3: ( RULE_ID )
            // InternalAndroidGenerator.g:3912:4: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getHolderDataholdersIDTerminalRuleCall_2_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBundleAccess().getHolderDataholdersIDTerminalRuleCall_2_1_1_1_0_1()); 

            }

             after(grammarAccess.getBundleAccess().getHolderDataholdersCrossReference_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bundle__HolderAssignment_2_1_1_1"


    // $ANTLR start "rule__FilterQuery__NameAssignment_2"
    // InternalAndroidGenerator.g:3923:1: rule__FilterQuery__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FilterQuery__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3927:1: ( ( RULE_ID ) )
            // InternalAndroidGenerator.g:3928:2: ( RULE_ID )
            {
            // InternalAndroidGenerator.g:3928:2: ( RULE_ID )
            // InternalAndroidGenerator.g:3929:3: RULE_ID
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
    // InternalAndroidGenerator.g:3938:1: rule__FilterQuery__FilterAttributesAssignment_3 : ( ruleFilterAttributes ) ;
    public final void rule__FilterQuery__FilterAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3942:1: ( ( ruleFilterAttributes ) )
            // InternalAndroidGenerator.g:3943:2: ( ruleFilterAttributes )
            {
            // InternalAndroidGenerator.g:3943:2: ( ruleFilterAttributes )
            // InternalAndroidGenerator.g:3944:3: ruleFilterAttributes
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
    // InternalAndroidGenerator.g:3953:1: rule__FilterAttributes__DistanceAssignment : ( ruleDistance ) ;
    public final void rule__FilterAttributes__DistanceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3957:1: ( ( ruleDistance ) )
            // InternalAndroidGenerator.g:3958:2: ( ruleDistance )
            {
            // InternalAndroidGenerator.g:3958:2: ( ruleDistance )
            // InternalAndroidGenerator.g:3959:3: ruleDistance
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
    // InternalAndroidGenerator.g:3968:1: rule__Distance__UnitAssignment_2 : ( ruleUnit ) ;
    public final void rule__Distance__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3972:1: ( ( ruleUnit ) )
            // InternalAndroidGenerator.g:3973:2: ( ruleUnit )
            {
            // InternalAndroidGenerator.g:3973:2: ( ruleUnit )
            // InternalAndroidGenerator.g:3974:3: ruleUnit
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
    // InternalAndroidGenerator.g:3983:1: rule__Distance__OperatorAssignment_3 : ( ruleOperator ) ;
    public final void rule__Distance__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:3987:1: ( ( ruleOperator ) )
            // InternalAndroidGenerator.g:3988:2: ( ruleOperator )
            {
            // InternalAndroidGenerator.g:3988:2: ( ruleOperator )
            // InternalAndroidGenerator.g:3989:3: ruleOperator
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
    // InternalAndroidGenerator.g:3998:1: rule__Distance__ResultsAssignment_4 : ( ruleNumber ) ;
    public final void rule__Distance__ResultsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4002:1: ( ( ruleNumber ) )
            // InternalAndroidGenerator.g:4003:2: ( ruleNumber )
            {
            // InternalAndroidGenerator.g:4003:2: ( ruleNumber )
            // InternalAndroidGenerator.g:4004:3: ruleNumber
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
    // InternalAndroidGenerator.g:4013:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAndroidGenerator.g:4017:1: ( ( RULE_INT ) )
            // InternalAndroidGenerator.g:4018:2: ( RULE_INT )
            {
            // InternalAndroidGenerator.g:4018:2: ( RULE_INT )
            // InternalAndroidGenerator.g:4019:3: RULE_INT
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});

}