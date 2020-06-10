package org.xtext.example.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mdsd.services.AndroidGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidGeneratorParser extends AbstractInternalAntlrParser {
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

        public InternalAndroidGeneratorParser(TokenStream input, AndroidGeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AndroidAppProject";
       	}

       	@Override
       	protected AndroidGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAndroidAppProject"
    // InternalAndroidGenerator.g:64:1: entryRuleAndroidAppProject returns [EObject current=null] : iv_ruleAndroidAppProject= ruleAndroidAppProject EOF ;
    public final EObject entryRuleAndroidAppProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidAppProject = null;


        try {
            // InternalAndroidGenerator.g:64:58: (iv_ruleAndroidAppProject= ruleAndroidAppProject EOF )
            // InternalAndroidGenerator.g:65:2: iv_ruleAndroidAppProject= ruleAndroidAppProject EOF
            {
             newCompositeNode(grammarAccess.getAndroidAppProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndroidAppProject=ruleAndroidAppProject();

            state._fsp--;

             current =iv_ruleAndroidAppProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndroidAppProject"


    // $ANTLR start "ruleAndroidAppProject"
    // InternalAndroidGenerator.g:71:1: ruleAndroidAppProject returns [EObject current=null] : ( ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )* ) ;
    public final EObject ruleAndroidAppProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_applications_0_0 = null;

        EObject lv_applications_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:77:2: ( ( ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )* ) )
            // InternalAndroidGenerator.g:78:2: ( ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )* )
            {
            // InternalAndroidGenerator.g:78:2: ( ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )* )
            // InternalAndroidGenerator.g:79:3: ( (lv_applications_0_0= ruleApplication ) ) (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )*
            {
            // InternalAndroidGenerator.g:79:3: ( (lv_applications_0_0= ruleApplication ) )
            // InternalAndroidGenerator.g:80:4: (lv_applications_0_0= ruleApplication )
            {
            // InternalAndroidGenerator.g:80:4: (lv_applications_0_0= ruleApplication )
            // InternalAndroidGenerator.g:81:5: lv_applications_0_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_applications_0_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndroidAppProjectRule());
            					}
            					add(
            						current,
            						"applications",
            						lv_applications_0_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGenerator.g:98:3: (otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAndroidGenerator.g:99:4: otherlv_1= ',' ( (lv_applications_2_0= ruleApplication ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndroidAppProjectAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAndroidGenerator.g:103:4: ( (lv_applications_2_0= ruleApplication ) )
            	    // InternalAndroidGenerator.g:104:5: (lv_applications_2_0= ruleApplication )
            	    {
            	    // InternalAndroidGenerator.g:104:5: (lv_applications_2_0= ruleApplication )
            	    // InternalAndroidGenerator.g:105:6: lv_applications_2_0= ruleApplication
            	    {

            	    						newCompositeNode(grammarAccess.getAndroidAppProjectAccess().getApplicationsApplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_applications_2_0=ruleApplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndroidAppProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"applications",
            	    							lv_applications_2_0,
            	    							"org.xtext.example.mdsd.AndroidGenerator.Application");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndroidAppProject"


    // $ANTLR start "entryRuleApplication"
    // InternalAndroidGenerator.g:127:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalAndroidGenerator.g:127:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalAndroidGenerator.g:128:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalAndroidGenerator.g:134:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )* ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:140:2: ( (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )* ) )
            // InternalAndroidGenerator.g:141:2: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )* )
            {
            // InternalAndroidGenerator.g:141:2: (otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )* )
            // InternalAndroidGenerator.g:142:3: otherlv_0= 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleApplicationAttribute ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalAndroidGenerator.g:146:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGenerator.g:147:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:147:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGenerator.g:148:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAndroidGenerator.g:164:3: ( (lv_attributes_2_0= ruleApplicationAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||(LA2_0>=18 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAndroidGenerator.g:165:4: (lv_attributes_2_0= ruleApplicationAttribute )
            	    {
            	    // InternalAndroidGenerator.g:165:4: (lv_attributes_2_0= ruleApplicationAttribute )
            	    // InternalAndroidGenerator.g:166:5: lv_attributes_2_0= ruleApplicationAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getAttributesApplicationAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_2_0=ruleApplicationAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_2_0,
            	    						"org.xtext.example.mdsd.AndroidGenerator.ApplicationAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleApplicationAttribute"
    // InternalAndroidGenerator.g:187:1: entryRuleApplicationAttribute returns [EObject current=null] : iv_ruleApplicationAttribute= ruleApplicationAttribute EOF ;
    public final EObject entryRuleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationAttribute = null;


        try {
            // InternalAndroidGenerator.g:187:61: (iv_ruleApplicationAttribute= ruleApplicationAttribute EOF )
            // InternalAndroidGenerator.g:188:2: iv_ruleApplicationAttribute= ruleApplicationAttribute EOF
            {
             newCompositeNode(grammarAccess.getApplicationAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationAttribute=ruleApplicationAttribute();

            state._fsp--;

             current =iv_ruleApplicationAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationAttribute"


    // $ANTLR start "ruleApplicationAttribute"
    // InternalAndroidGenerator.g:194:1: ruleApplicationAttribute returns [EObject current=null] : (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList | this_ApplicationMainActivity_3= ruleApplicationMainActivity ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicationVersion_0 = null;

        EObject this_ApplicationPermissionList_1 = null;

        EObject this_ApplicationElementList_2 = null;

        EObject this_ApplicationMainActivity_3 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:200:2: ( (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList | this_ApplicationMainActivity_3= ruleApplicationMainActivity ) )
            // InternalAndroidGenerator.g:201:2: (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList | this_ApplicationMainActivity_3= ruleApplicationMainActivity )
            {
            // InternalAndroidGenerator.g:201:2: (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList | this_ApplicationMainActivity_3= ruleApplicationMainActivity )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
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
                    // InternalAndroidGenerator.g:202:3: this_ApplicationVersion_0= ruleApplicationVersion
                    {

                    			newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationVersionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicationVersion_0=ruleApplicationVersion();

                    state._fsp--;


                    			current = this_ApplicationVersion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:211:3: this_ApplicationPermissionList_1= ruleApplicationPermissionList
                    {

                    			newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationPermissionListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicationPermissionList_1=ruleApplicationPermissionList();

                    state._fsp--;


                    			current = this_ApplicationPermissionList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAndroidGenerator.g:220:3: this_ApplicationElementList_2= ruleApplicationElementList
                    {

                    			newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationElementListParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicationElementList_2=ruleApplicationElementList();

                    state._fsp--;


                    			current = this_ApplicationElementList_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAndroidGenerator.g:229:3: this_ApplicationMainActivity_3= ruleApplicationMainActivity
                    {

                    			newCompositeNode(grammarAccess.getApplicationAttributeAccess().getApplicationMainActivityParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicationMainActivity_3=ruleApplicationMainActivity();

                    state._fsp--;


                    			current = this_ApplicationMainActivity_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationAttribute"


    // $ANTLR start "entryRuleApplicationVersion"
    // InternalAndroidGenerator.g:241:1: entryRuleApplicationVersion returns [EObject current=null] : iv_ruleApplicationVersion= ruleApplicationVersion EOF ;
    public final EObject entryRuleApplicationVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationVersion = null;


        try {
            // InternalAndroidGenerator.g:241:59: (iv_ruleApplicationVersion= ruleApplicationVersion EOF )
            // InternalAndroidGenerator.g:242:2: iv_ruleApplicationVersion= ruleApplicationVersion EOF
            {
             newCompositeNode(grammarAccess.getApplicationVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationVersion=ruleApplicationVersion();

            state._fsp--;

             current =iv_ruleApplicationVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationVersion"


    // $ANTLR start "ruleApplicationVersion"
    // InternalAndroidGenerator.g:248:1: ruleApplicationVersion returns [EObject current=null] : ( () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )? ) ;
    public final EObject ruleApplicationVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;

        EObject lv_targetsdk_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:254:2: ( ( () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )? ) )
            // InternalAndroidGenerator.g:255:2: ( () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )? )
            {
            // InternalAndroidGenerator.g:255:2: ( () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )? )
            // InternalAndroidGenerator.g:256:3: () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )?
            {
            // InternalAndroidGenerator.g:256:3: ()
            // InternalAndroidGenerator.g:257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationVersionAccess().getColonKeyword_2());
            		
            // InternalAndroidGenerator.g:271:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGenerator.g:272:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGenerator.g:272:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGenerator.g:273:5: lv_result_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getApplicationVersionAccess().getResultNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_result_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationVersionRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_3_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGenerator.g:290:3: ( (lv_targetsdk_4_0= ruleTargetSDK ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAndroidGenerator.g:291:4: (lv_targetsdk_4_0= ruleTargetSDK )
                    {
                    // InternalAndroidGenerator.g:291:4: (lv_targetsdk_4_0= ruleTargetSDK )
                    // InternalAndroidGenerator.g:292:5: lv_targetsdk_4_0= ruleTargetSDK
                    {

                    					newCompositeNode(grammarAccess.getApplicationVersionAccess().getTargetsdkTargetSDKParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_targetsdk_4_0=ruleTargetSDK();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationVersionRule());
                    					}
                    					set(
                    						current,
                    						"targetsdk",
                    						lv_targetsdk_4_0,
                    						"org.xtext.example.mdsd.AndroidGenerator.TargetSDK");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationVersion"


    // $ANTLR start "entryRuleTargetSDK"
    // InternalAndroidGenerator.g:313:1: entryRuleTargetSDK returns [EObject current=null] : iv_ruleTargetSDK= ruleTargetSDK EOF ;
    public final EObject entryRuleTargetSDK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetSDK = null;


        try {
            // InternalAndroidGenerator.g:313:50: (iv_ruleTargetSDK= ruleTargetSDK EOF )
            // InternalAndroidGenerator.g:314:2: iv_ruleTargetSDK= ruleTargetSDK EOF
            {
             newCompositeNode(grammarAccess.getTargetSDKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetSDK=ruleTargetSDK();

            state._fsp--;

             current =iv_ruleTargetSDK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetSDK"


    // $ANTLR start "ruleTargetSDK"
    // InternalAndroidGenerator.g:320:1: ruleTargetSDK returns [EObject current=null] : ( () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? ) ;
    public final EObject ruleTargetSDK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;

        EObject lv_minsdk_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:326:2: ( ( () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? ) )
            // InternalAndroidGenerator.g:327:2: ( () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? )
            {
            // InternalAndroidGenerator.g:327:2: ( () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? )
            // InternalAndroidGenerator.g:328:3: () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )?
            {
            // InternalAndroidGenerator.g:328:3: ()
            // InternalAndroidGenerator.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetSDKAccess().getTargetSDKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetSDKAccess().getTargetSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetSDKAccess().getColonKeyword_2());
            		
            // InternalAndroidGenerator.g:343:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGenerator.g:344:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGenerator.g:344:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGenerator.g:345:5: lv_result_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getTargetSDKAccess().getResultNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_result_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetSDKRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_3_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGenerator.g:362:3: ( (lv_minsdk_4_0= ruleMinSDK ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAndroidGenerator.g:363:4: (lv_minsdk_4_0= ruleMinSDK )
                    {
                    // InternalAndroidGenerator.g:363:4: (lv_minsdk_4_0= ruleMinSDK )
                    // InternalAndroidGenerator.g:364:5: lv_minsdk_4_0= ruleMinSDK
                    {

                    					newCompositeNode(grammarAccess.getTargetSDKAccess().getMinsdkMinSDKParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_minsdk_4_0=ruleMinSDK();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTargetSDKRule());
                    					}
                    					set(
                    						current,
                    						"minsdk",
                    						lv_minsdk_4_0,
                    						"org.xtext.example.mdsd.AndroidGenerator.MinSDK");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetSDK"


    // $ANTLR start "entryRuleMinSDK"
    // InternalAndroidGenerator.g:385:1: entryRuleMinSDK returns [EObject current=null] : iv_ruleMinSDK= ruleMinSDK EOF ;
    public final EObject entryRuleMinSDK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSDK = null;


        try {
            // InternalAndroidGenerator.g:385:47: (iv_ruleMinSDK= ruleMinSDK EOF )
            // InternalAndroidGenerator.g:386:2: iv_ruleMinSDK= ruleMinSDK EOF
            {
             newCompositeNode(grammarAccess.getMinSDKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinSDK=ruleMinSDK();

            state._fsp--;

             current =iv_ruleMinSDK; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinSDK"


    // $ANTLR start "ruleMinSDK"
    // InternalAndroidGenerator.g:392:1: ruleMinSDK returns [EObject current=null] : ( () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ) ;
    public final EObject ruleMinSDK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:398:2: ( ( () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ) )
            // InternalAndroidGenerator.g:399:2: ( () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) )
            {
            // InternalAndroidGenerator.g:399:2: ( () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) )
            // InternalAndroidGenerator.g:400:3: () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) )
            {
            // InternalAndroidGenerator.g:400:3: ()
            // InternalAndroidGenerator.g:401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinSDKAccess().getMinSDKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMinSDKAccess().getMinimumSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMinSDKAccess().getColonKeyword_2());
            		
            // InternalAndroidGenerator.g:415:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGenerator.g:416:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGenerator.g:416:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGenerator.g:417:5: lv_result_3_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getMinSDKAccess().getResultNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_result_3_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinSDKRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_3_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinSDK"


    // $ANTLR start "entryRuleApplicationPermissionList"
    // InternalAndroidGenerator.g:438:1: entryRuleApplicationPermissionList returns [EObject current=null] : iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF ;
    public final EObject entryRuleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationPermissionList = null;


        try {
            // InternalAndroidGenerator.g:438:66: (iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF )
            // InternalAndroidGenerator.g:439:2: iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF
            {
             newCompositeNode(grammarAccess.getApplicationPermissionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationPermissionList=ruleApplicationPermissionList();

            state._fsp--;

             current =iv_ruleApplicationPermissionList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationPermissionList"


    // $ANTLR start "ruleApplicationPermissionList"
    // InternalAndroidGenerator.g:445:1: ruleApplicationPermissionList returns [EObject current=null] : (otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* ) ;
    public final EObject ruleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_permissions_1_0 = null;

        EObject lv_permissions_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:451:2: ( (otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* ) )
            // InternalAndroidGenerator.g:452:2: (otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* )
            {
            // InternalAndroidGenerator.g:452:2: (otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* )
            // InternalAndroidGenerator.g:453:3: otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
            		
            // InternalAndroidGenerator.g:457:3: ( (lv_permissions_1_0= rulePermission ) )
            // InternalAndroidGenerator.g:458:4: (lv_permissions_1_0= rulePermission )
            {
            // InternalAndroidGenerator.g:458:4: (lv_permissions_1_0= rulePermission )
            // InternalAndroidGenerator.g:459:5: lv_permissions_1_0= rulePermission
            {

            					newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_permissions_1_0=rulePermission();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
            					}
            					add(
            						current,
            						"permissions",
            						lv_permissions_1_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Permission");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGenerator.g:476:3: (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_PACKAGE_NAME) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalAndroidGenerator.g:477:4: otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAndroidGenerator.g:481:4: ( (lv_permissions_3_0= rulePermission ) )
            	    // InternalAndroidGenerator.g:482:5: (lv_permissions_3_0= rulePermission )
            	    {
            	    // InternalAndroidGenerator.g:482:5: (lv_permissions_3_0= rulePermission )
            	    // InternalAndroidGenerator.g:483:6: lv_permissions_3_0= rulePermission
            	    {

            	    						newCompositeNode(grammarAccess.getApplicationPermissionListAccess().getPermissionsPermissionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_permissions_3_0=rulePermission();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getApplicationPermissionListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"permissions",
            	    							lv_permissions_3_0,
            	    							"org.xtext.example.mdsd.AndroidGenerator.Permission");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationPermissionList"


    // $ANTLR start "entryRulePermission"
    // InternalAndroidGenerator.g:505:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // InternalAndroidGenerator.g:505:51: (iv_rulePermission= rulePermission EOF )
            // InternalAndroidGenerator.g:506:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // InternalAndroidGenerator.g:512:1: rulePermission returns [EObject current=null] : ( (lv_name_0_0= RULE_PACKAGE_NAME ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:518:2: ( ( (lv_name_0_0= RULE_PACKAGE_NAME ) ) )
            // InternalAndroidGenerator.g:519:2: ( (lv_name_0_0= RULE_PACKAGE_NAME ) )
            {
            // InternalAndroidGenerator.g:519:2: ( (lv_name_0_0= RULE_PACKAGE_NAME ) )
            // InternalAndroidGenerator.g:520:3: (lv_name_0_0= RULE_PACKAGE_NAME )
            {
            // InternalAndroidGenerator.g:520:3: (lv_name_0_0= RULE_PACKAGE_NAME )
            // InternalAndroidGenerator.g:521:4: lv_name_0_0= RULE_PACKAGE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_PACKAGE_NAME,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPermissionAccess().getNamePACKAGE_NAMETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPermissionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mdsd.AndroidGenerator.PACKAGE_NAME");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleApplicationElementList"
    // InternalAndroidGenerator.g:540:1: entryRuleApplicationElementList returns [EObject current=null] : iv_ruleApplicationElementList= ruleApplicationElementList EOF ;
    public final EObject entryRuleApplicationElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElementList = null;


        try {
            // InternalAndroidGenerator.g:540:63: (iv_ruleApplicationElementList= ruleApplicationElementList EOF )
            // InternalAndroidGenerator.g:541:2: iv_ruleApplicationElementList= ruleApplicationElementList EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationElementList=ruleApplicationElementList();

            state._fsp--;

             current =iv_ruleApplicationElementList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationElementList"


    // $ANTLR start "ruleApplicationElementList"
    // InternalAndroidGenerator.g:547:1: ruleApplicationElementList returns [EObject current=null] : ( () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )* ) ;
    public final EObject ruleApplicationElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:553:2: ( ( () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )* ) )
            // InternalAndroidGenerator.g:554:2: ( () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )* )
            {
            // InternalAndroidGenerator.g:554:2: ( () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )* )
            // InternalAndroidGenerator.g:555:3: () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )*
            {
            // InternalAndroidGenerator.g:555:3: ()
            // InternalAndroidGenerator.g:556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getElementsKeyword_1());
            		
            // InternalAndroidGenerator.g:566:3: ( (lv_elements_2_0= ruleApplicationElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAndroidGenerator.g:567:4: (lv_elements_2_0= ruleApplicationElement )
            	    {
            	    // InternalAndroidGenerator.g:567:4: (lv_elements_2_0= ruleApplicationElement )
            	    // InternalAndroidGenerator.g:568:5: lv_elements_2_0= ruleApplicationElement
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationElementListAccess().getElementsApplicationElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_elements_2_0=ruleApplicationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationElementListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.example.mdsd.AndroidGenerator.ApplicationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationElementList"


    // $ANTLR start "entryRuleApplicationMainActivity"
    // InternalAndroidGenerator.g:589:1: entryRuleApplicationMainActivity returns [EObject current=null] : iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF ;
    public final EObject entryRuleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationMainActivity = null;


        try {
            // InternalAndroidGenerator.g:589:64: (iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF )
            // InternalAndroidGenerator.g:590:2: iv_ruleApplicationMainActivity= ruleApplicationMainActivity EOF
            {
             newCompositeNode(grammarAccess.getApplicationMainActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationMainActivity=ruleApplicationMainActivity();

            state._fsp--;

             current =iv_ruleApplicationMainActivity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationMainActivity"


    // $ANTLR start "ruleApplicationMainActivity"
    // InternalAndroidGenerator.g:596:1: ruleApplicationMainActivity returns [EObject current=null] : (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleApplicationMainActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:602:2: ( (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:603:2: (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:603:2: (otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) ) )
            // InternalAndroidGenerator.g:604:3: otherlv_0= 'main-activity' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationMainActivityAccess().getMainActivityKeyword_0());
            		
            // InternalAndroidGenerator.g:608:3: ( (otherlv_1= RULE_ID ) )
            // InternalAndroidGenerator.g:609:4: (otherlv_1= RULE_ID )
            {
            // InternalAndroidGenerator.g:609:4: (otherlv_1= RULE_ID )
            // InternalAndroidGenerator.g:610:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationMainActivityRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationMainActivity"


    // $ANTLR start "entryRuleApplicationElement"
    // InternalAndroidGenerator.g:625:1: entryRuleApplicationElement returns [EObject current=null] : iv_ruleApplicationElement= ruleApplicationElement EOF ;
    public final EObject entryRuleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElement = null;


        try {
            // InternalAndroidGenerator.g:625:59: (iv_ruleApplicationElement= ruleApplicationElement EOF )
            // InternalAndroidGenerator.g:626:2: iv_ruleApplicationElement= ruleApplicationElement EOF
            {
             newCompositeNode(grammarAccess.getApplicationElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationElement=ruleApplicationElement();

            state._fsp--;

             current =iv_ruleApplicationElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationElement"


    // $ANTLR start "ruleApplicationElement"
    // InternalAndroidGenerator.g:632:1: ruleApplicationElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_Fragment_1= ruleFragment | this_Model_2= ruleModel ) ;
    public final EObject ruleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_Fragment_1 = null;

        EObject this_Model_2 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:638:2: ( (this_Activity_0= ruleActivity | this_Fragment_1= ruleFragment | this_Model_2= ruleModel ) )
            // InternalAndroidGenerator.g:639:2: (this_Activity_0= ruleActivity | this_Fragment_1= ruleFragment | this_Model_2= ruleModel )
            {
            // InternalAndroidGenerator.g:639:2: (this_Activity_0= ruleActivity | this_Fragment_1= ruleFragment | this_Model_2= ruleModel )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAndroidGenerator.g:640:3: this_Activity_0= ruleActivity
                    {

                    			newCompositeNode(grammarAccess.getApplicationElementAccess().getActivityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Activity_0=ruleActivity();

                    state._fsp--;


                    			current = this_Activity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:649:3: this_Fragment_1= ruleFragment
                    {

                    			newCompositeNode(grammarAccess.getApplicationElementAccess().getFragmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fragment_1=ruleFragment();

                    state._fsp--;


                    			current = this_Fragment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAndroidGenerator.g:658:3: this_Model_2= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getApplicationElementAccess().getModelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_2=ruleModel();

                    state._fsp--;


                    			current = this_Model_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationElement"


    // $ANTLR start "entryRuleModel"
    // InternalAndroidGenerator.g:670:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAndroidGenerator.g:670:46: (iv_ruleModel= ruleModel EOF )
            // InternalAndroidGenerator.g:671:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAndroidGenerator.g:677:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_modellist_5_0= ruleModelList ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        EObject lv_activityType_3_0 = null;

        EObject lv_modellist_5_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:683:2: ( ( () otherlv_1= 'Model' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_modellist_5_0= ruleModelList ) )? ) )
            // InternalAndroidGenerator.g:684:2: ( () otherlv_1= 'Model' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_modellist_5_0= ruleModelList ) )? )
            {
            // InternalAndroidGenerator.g:684:2: ( () otherlv_1= 'Model' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_modellist_5_0= ruleModelList ) )? )
            // InternalAndroidGenerator.g:685:3: () otherlv_1= 'Model' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_modellist_5_0= ruleModelList ) )?
            {
            // InternalAndroidGenerator.g:685:3: ()
            // InternalAndroidGenerator.g:686:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalAndroidGenerator.g:696:3: (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAndroidGenerator.g:697:4: otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getColonKeyword_2_0());
                    			
                    // InternalAndroidGenerator.g:701:4: ( (lv_activityType_3_0= ruleActivityType ) )
                    // InternalAndroidGenerator.g:702:5: (lv_activityType_3_0= ruleActivityType )
                    {
                    // InternalAndroidGenerator.g:702:5: (lv_activityType_3_0= ruleActivityType )
                    // InternalAndroidGenerator.g:703:6: lv_activityType_3_0= ruleActivityType
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getActivityTypeActivityTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_activityType_3_0=ruleActivityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"activityType",
                    							lv_activityType_3_0,
                    							"org.xtext.example.mdsd.AndroidGenerator.ActivityType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAndroidGenerator.g:721:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAndroidGenerator.g:722:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:722:4: (lv_name_4_0= RULE_ID )
            // InternalAndroidGenerator.g:723:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_4_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAndroidGenerator.g:739:3: ( (lv_modellist_5_0= ruleModelList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAndroidGenerator.g:740:4: (lv_modellist_5_0= ruleModelList )
                    {
                    // InternalAndroidGenerator.g:740:4: (lv_modellist_5_0= ruleModelList )
                    // InternalAndroidGenerator.g:741:5: lv_modellist_5_0= ruleModelList
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getModellistModelListParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_modellist_5_0=ruleModelList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"modellist",
                    						lv_modellist_5_0,
                    						"org.xtext.example.mdsd.AndroidGenerator.ModelList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelList"
    // InternalAndroidGenerator.g:762:1: entryRuleModelList returns [EObject current=null] : iv_ruleModelList= ruleModelList EOF ;
    public final EObject entryRuleModelList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelList = null;


        try {
            // InternalAndroidGenerator.g:762:50: (iv_ruleModelList= ruleModelList EOF )
            // InternalAndroidGenerator.g:763:2: iv_ruleModelList= ruleModelList EOF
            {
             newCompositeNode(grammarAccess.getModelListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelList=ruleModelList();

            state._fsp--;

             current =iv_ruleModelList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelList"


    // $ANTLR start "ruleModelList"
    // InternalAndroidGenerator.g:769:1: ruleModelList returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) otherlv_1= ':' ( (lv_getset_2_0= ruleGetSet ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleType ) ) otherlv_5= ':' ( (lv_getset_6_0= ruleGetSet ) ) )* ) ;
    public final EObject ruleModelList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_getset_2_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_getset_6_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:775:2: ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= ':' ( (lv_getset_2_0= ruleGetSet ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleType ) ) otherlv_5= ':' ( (lv_getset_6_0= ruleGetSet ) ) )* ) )
            // InternalAndroidGenerator.g:776:2: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= ':' ( (lv_getset_2_0= ruleGetSet ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleType ) ) otherlv_5= ':' ( (lv_getset_6_0= ruleGetSet ) ) )* )
            {
            // InternalAndroidGenerator.g:776:2: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= ':' ( (lv_getset_2_0= ruleGetSet ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleType ) ) otherlv_5= ':' ( (lv_getset_6_0= ruleGetSet ) ) )* )
            // InternalAndroidGenerator.g:777:3: ( (lv_type_0_0= ruleType ) ) otherlv_1= ':' ( (lv_getset_2_0= ruleGetSet ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleType ) ) otherlv_5= ':' ( (lv_getset_6_0= ruleGetSet ) ) )*
            {
            // InternalAndroidGenerator.g:777:3: ( (lv_type_0_0= ruleType ) )
            // InternalAndroidGenerator.g:778:4: (lv_type_0_0= ruleType )
            {
            // InternalAndroidGenerator.g:778:4: (lv_type_0_0= ruleType )
            // InternalAndroidGenerator.g:779:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getModelListAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelListRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getModelListAccess().getColonKeyword_1());
            		
            // InternalAndroidGenerator.g:800:3: ( (lv_getset_2_0= ruleGetSet ) )
            // InternalAndroidGenerator.g:801:4: (lv_getset_2_0= ruleGetSet )
            {
            // InternalAndroidGenerator.g:801:4: (lv_getset_2_0= ruleGetSet )
            // InternalAndroidGenerator.g:802:5: lv_getset_2_0= ruleGetSet
            {

            					newCompositeNode(grammarAccess.getModelListAccess().getGetsetGetSetParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_getset_2_0=ruleGetSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelListRule());
            					}
            					add(
            						current,
            						"getset",
            						lv_getset_2_0,
            						"org.xtext.example.mdsd.AndroidGenerator.GetSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGenerator.g:819:3: (otherlv_3= ',' ( (lv_type_4_0= ruleType ) ) otherlv_5= ':' ( (lv_getset_6_0= ruleGetSet ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalAndroidGenerator.g:820:4: otherlv_3= ',' ( (lv_type_4_0= ruleType ) ) otherlv_5= ':' ( (lv_getset_6_0= ruleGetSet ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getModelListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAndroidGenerator.g:824:4: ( (lv_type_4_0= ruleType ) )
            	    // InternalAndroidGenerator.g:825:5: (lv_type_4_0= ruleType )
            	    {
            	    // InternalAndroidGenerator.g:825:5: (lv_type_4_0= ruleType )
            	    // InternalAndroidGenerator.g:826:6: lv_type_4_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getModelListAccess().getTypeTypeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_type_4_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"type",
            	    							lv_type_4_0,
            	    							"org.xtext.example.mdsd.AndroidGenerator.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModelListAccess().getColonKeyword_3_2());
            	    			
            	    // InternalAndroidGenerator.g:847:4: ( (lv_getset_6_0= ruleGetSet ) )
            	    // InternalAndroidGenerator.g:848:5: (lv_getset_6_0= ruleGetSet )
            	    {
            	    // InternalAndroidGenerator.g:848:5: (lv_getset_6_0= ruleGetSet )
            	    // InternalAndroidGenerator.g:849:6: lv_getset_6_0= ruleGetSet
            	    {

            	    						newCompositeNode(grammarAccess.getModelListAccess().getGetsetGetSetParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_getset_6_0=ruleGetSet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"getset",
            	    							lv_getset_6_0,
            	    							"org.xtext.example.mdsd.AndroidGenerator.GetSet");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelList"


    // $ANTLR start "entryRuleGetSet"
    // InternalAndroidGenerator.g:871:1: entryRuleGetSet returns [EObject current=null] : iv_ruleGetSet= ruleGetSet EOF ;
    public final EObject entryRuleGetSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetSet = null;


        try {
            // InternalAndroidGenerator.g:871:47: (iv_ruleGetSet= ruleGetSet EOF )
            // InternalAndroidGenerator.g:872:2: iv_ruleGetSet= ruleGetSet EOF
            {
             newCompositeNode(grammarAccess.getGetSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetSet=ruleGetSet();

            state._fsp--;

             current =iv_ruleGetSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetSet"


    // $ANTLR start "ruleGetSet"
    // InternalAndroidGenerator.g:878:1: ruleGetSet returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGetSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:884:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:885:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:885:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAndroidGenerator.g:886:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAndroidGenerator.g:886:3: ()
            // InternalAndroidGenerator.g:887:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGetSetAccess().getGetSetAction_0(),
            					current);
            			

            }

            // InternalAndroidGenerator.g:893:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGenerator.g:894:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:894:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGenerator.g:895:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGetSetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetSet"


    // $ANTLR start "entryRuleType"
    // InternalAndroidGenerator.g:915:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAndroidGenerator.g:915:45: (iv_ruleType= ruleType EOF )
            // InternalAndroidGenerator.g:916:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAndroidGenerator.g:922:1: ruleType returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:928:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:929:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:929:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAndroidGenerator.g:930:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAndroidGenerator.g:930:3: ()
            // InternalAndroidGenerator.g:931:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeAccess().getTypeAction_0(),
            					current);
            			

            }

            // InternalAndroidGenerator.g:937:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGenerator.g:938:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:938:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGenerator.g:939:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFragment"
    // InternalAndroidGenerator.g:959:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalAndroidGenerator.g:959:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalAndroidGenerator.g:960:2: iv_ruleFragment= ruleFragment EOF
            {
             newCompositeNode(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragment=ruleFragment();

            state._fsp--;

             current =iv_ruleFragment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalAndroidGenerator.g:966:1: ruleFragment returns [EObject current=null] : ( () otherlv_1= 'Fragment' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityAttributes_5_0= ruleActivityLayoutAttributes ) )? ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        EObject lv_activityType_3_0 = null;

        EObject lv_activityAttributes_5_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:972:2: ( ( () otherlv_1= 'Fragment' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityAttributes_5_0= ruleActivityLayoutAttributes ) )? ) )
            // InternalAndroidGenerator.g:973:2: ( () otherlv_1= 'Fragment' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityAttributes_5_0= ruleActivityLayoutAttributes ) )? )
            {
            // InternalAndroidGenerator.g:973:2: ( () otherlv_1= 'Fragment' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityAttributes_5_0= ruleActivityLayoutAttributes ) )? )
            // InternalAndroidGenerator.g:974:3: () otherlv_1= 'Fragment' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityAttributes_5_0= ruleActivityLayoutAttributes ) )?
            {
            // InternalAndroidGenerator.g:974:3: ()
            // InternalAndroidGenerator.g:975:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFragmentAccess().getFragmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getFragmentKeyword_1());
            		
            // InternalAndroidGenerator.g:985:3: (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAndroidGenerator.g:986:4: otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getFragmentAccess().getColonKeyword_2_0());
                    			
                    // InternalAndroidGenerator.g:990:4: ( (lv_activityType_3_0= ruleActivityType ) )
                    // InternalAndroidGenerator.g:991:5: (lv_activityType_3_0= ruleActivityType )
                    {
                    // InternalAndroidGenerator.g:991:5: (lv_activityType_3_0= ruleActivityType )
                    // InternalAndroidGenerator.g:992:6: lv_activityType_3_0= ruleActivityType
                    {

                    						newCompositeNode(grammarAccess.getFragmentAccess().getActivityTypeActivityTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_activityType_3_0=ruleActivityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFragmentRule());
                    						}
                    						set(
                    							current,
                    							"activityType",
                    							lv_activityType_3_0,
                    							"org.xtext.example.mdsd.AndroidGenerator.ActivityType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAndroidGenerator.g:1010:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalAndroidGenerator.g:1011:4: (lv_name_4_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:1011:4: (lv_name_4_0= RULE_ID )
            // InternalAndroidGenerator.g:1012:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAndroidGenerator.g:1028:3: ( (lv_activityAttributes_5_0= ruleActivityLayoutAttributes ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAndroidGenerator.g:1029:4: (lv_activityAttributes_5_0= ruleActivityLayoutAttributes )
                    {
                    // InternalAndroidGenerator.g:1029:4: (lv_activityAttributes_5_0= ruleActivityLayoutAttributes )
                    // InternalAndroidGenerator.g:1030:5: lv_activityAttributes_5_0= ruleActivityLayoutAttributes
                    {

                    					newCompositeNode(grammarAccess.getFragmentAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_activityAttributes_5_0=ruleActivityLayoutAttributes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFragmentRule());
                    					}
                    					add(
                    						current,
                    						"activityAttributes",
                    						lv_activityAttributes_5_0,
                    						"org.xtext.example.mdsd.AndroidGenerator.ActivityLayoutAttributes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleActivity"
    // InternalAndroidGenerator.g:1051:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalAndroidGenerator.g:1051:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalAndroidGenerator.g:1052:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalAndroidGenerator.g:1058:1: ruleActivity returns [EObject current=null] : ( ( () otherlv_1= 'Activity' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )* )? ) | ( () otherlv_8= 'Activity' ( (lv_name_9_0= RULE_ID ) ) ( (lv_activityAttributes_10_0= ruleActivityLayoutAttributes ) )* ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        EObject lv_activityType_3_0 = null;

        EObject lv_activityTypeAttributes_5_0 = null;

        EObject lv_activityAttributes_6_0 = null;

        EObject lv_activityAttributes_10_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1064:2: ( ( ( () otherlv_1= 'Activity' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )* )? ) | ( () otherlv_8= 'Activity' ( (lv_name_9_0= RULE_ID ) ) ( (lv_activityAttributes_10_0= ruleActivityLayoutAttributes ) )* ) ) )
            // InternalAndroidGenerator.g:1065:2: ( ( () otherlv_1= 'Activity' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )* )? ) | ( () otherlv_8= 'Activity' ( (lv_name_9_0= RULE_ID ) ) ( (lv_activityAttributes_10_0= ruleActivityLayoutAttributes ) )* ) )
            {
            // InternalAndroidGenerator.g:1065:2: ( ( () otherlv_1= 'Activity' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )* )? ) | ( () otherlv_8= 'Activity' ( (lv_name_9_0= RULE_ID ) ) ( (lv_activityAttributes_10_0= ruleActivityLayoutAttributes ) )* ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ID) ) {
                    alt17=2;
                }
                else if ( (LA17_1==EOF||LA17_1==12||(LA17_1>=14 && LA17_1<=15)||(LA17_1>=18 && LA17_1<=23)) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGenerator.g:1066:3: ( () otherlv_1= 'Activity' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )* )? )
                    {
                    // InternalAndroidGenerator.g:1066:3: ( () otherlv_1= 'Activity' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )* )? )
                    // InternalAndroidGenerator.g:1067:4: () otherlv_1= 'Activity' (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )* )?
                    {
                    // InternalAndroidGenerator.g:1067:4: ()
                    // InternalAndroidGenerator.g:1068:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getActivityAccess().getActivityAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_0_1());
                    			
                    // InternalAndroidGenerator.g:1078:4: (otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==15) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAndroidGenerator.g:1079:5: otherlv_2= ':' ( (lv_activityType_3_0= ruleActivityType ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) ) ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )*
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_14); 

                            					newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getColonKeyword_0_2_0());
                            				
                            // InternalAndroidGenerator.g:1083:5: ( (lv_activityType_3_0= ruleActivityType ) )
                            // InternalAndroidGenerator.g:1084:6: (lv_activityType_3_0= ruleActivityType )
                            {
                            // InternalAndroidGenerator.g:1084:6: (lv_activityType_3_0= ruleActivityType )
                            // InternalAndroidGenerator.g:1085:7: lv_activityType_3_0= ruleActivityType
                            {

                            							newCompositeNode(grammarAccess.getActivityAccess().getActivityTypeActivityTypeParserRuleCall_0_2_1_0());
                            						
                            pushFollow(FOLLOW_5);
                            lv_activityType_3_0=ruleActivityType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActivityRule());
                            							}
                            							set(
                            								current,
                            								"activityType",
                            								lv_activityType_3_0,
                            								"org.xtext.example.mdsd.AndroidGenerator.ActivityType");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalAndroidGenerator.g:1102:5: ( (lv_name_4_0= RULE_ID ) )
                            // InternalAndroidGenerator.g:1103:6: (lv_name_4_0= RULE_ID )
                            {
                            // InternalAndroidGenerator.g:1103:6: (lv_name_4_0= RULE_ID )
                            // InternalAndroidGenerator.g:1104:7: lv_name_4_0= RULE_ID
                            {
                            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                            							newLeafNode(lv_name_4_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_0_2_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getActivityRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_4_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            // InternalAndroidGenerator.g:1120:5: ( (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes ) )
                            // InternalAndroidGenerator.g:1121:6: (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes )
                            {
                            // InternalAndroidGenerator.g:1121:6: (lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes )
                            // InternalAndroidGenerator.g:1122:7: lv_activityTypeAttributes_5_0= ruleActivityTypeAttributes
                            {

                            							newCompositeNode(grammarAccess.getActivityAccess().getActivityTypeAttributesActivityTypeAttributesParserRuleCall_0_2_3_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_activityTypeAttributes_5_0=ruleActivityTypeAttributes();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActivityRule());
                            							}
                            							set(
                            								current,
                            								"activityTypeAttributes",
                            								lv_activityTypeAttributes_5_0,
                            								"org.xtext.example.mdsd.AndroidGenerator.ActivityTypeAttributes");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalAndroidGenerator.g:1139:5: ( (lv_activityAttributes_6_0= ruleActivityLayoutAttributes ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( ((LA14_0>=26 && LA14_0<=27)) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalAndroidGenerator.g:1140:6: (lv_activityAttributes_6_0= ruleActivityLayoutAttributes )
                            	    {
                            	    // InternalAndroidGenerator.g:1140:6: (lv_activityAttributes_6_0= ruleActivityLayoutAttributes )
                            	    // InternalAndroidGenerator.g:1141:7: lv_activityAttributes_6_0= ruleActivityLayoutAttributes
                            	    {

                            	    							newCompositeNode(grammarAccess.getActivityAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_0_2_4_0());
                            	    						
                            	    pushFollow(FOLLOW_16);
                            	    lv_activityAttributes_6_0=ruleActivityLayoutAttributes();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"activityAttributes",
                            	    								lv_activityAttributes_6_0,
                            	    								"org.xtext.example.mdsd.AndroidGenerator.ActivityLayoutAttributes");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:1161:3: ( () otherlv_8= 'Activity' ( (lv_name_9_0= RULE_ID ) ) ( (lv_activityAttributes_10_0= ruleActivityLayoutAttributes ) )* )
                    {
                    // InternalAndroidGenerator.g:1161:3: ( () otherlv_8= 'Activity' ( (lv_name_9_0= RULE_ID ) ) ( (lv_activityAttributes_10_0= ruleActivityLayoutAttributes ) )* )
                    // InternalAndroidGenerator.g:1162:4: () otherlv_8= 'Activity' ( (lv_name_9_0= RULE_ID ) ) ( (lv_activityAttributes_10_0= ruleActivityLayoutAttributes ) )*
                    {
                    // InternalAndroidGenerator.g:1162:4: ()
                    // InternalAndroidGenerator.g:1163:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getActivityAccess().getActivityAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getActivityKeyword_1_1());
                    			
                    // InternalAndroidGenerator.g:1173:4: ( (lv_name_9_0= RULE_ID ) )
                    // InternalAndroidGenerator.g:1174:5: (lv_name_9_0= RULE_ID )
                    {
                    // InternalAndroidGenerator.g:1174:5: (lv_name_9_0= RULE_ID )
                    // InternalAndroidGenerator.g:1175:6: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalAndroidGenerator.g:1191:4: ( (lv_activityAttributes_10_0= ruleActivityLayoutAttributes ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=26 && LA16_0<=27)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalAndroidGenerator.g:1192:5: (lv_activityAttributes_10_0= ruleActivityLayoutAttributes )
                    	    {
                    	    // InternalAndroidGenerator.g:1192:5: (lv_activityAttributes_10_0= ruleActivityLayoutAttributes )
                    	    // InternalAndroidGenerator.g:1193:6: lv_activityAttributes_10_0= ruleActivityLayoutAttributes
                    	    {

                    	    						newCompositeNode(grammarAccess.getActivityAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_activityAttributes_10_0=ruleActivityLayoutAttributes();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"activityAttributes",
                    	    							lv_activityAttributes_10_0,
                    	    							"org.xtext.example.mdsd.AndroidGenerator.ActivityLayoutAttributes");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleActivityTypeAttributes"
    // InternalAndroidGenerator.g:1215:1: entryRuleActivityTypeAttributes returns [EObject current=null] : iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF ;
    public final EObject entryRuleActivityTypeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityTypeAttributes = null;


        try {
            // InternalAndroidGenerator.g:1215:63: (iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF )
            // InternalAndroidGenerator.g:1216:2: iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF
            {
             newCompositeNode(grammarAccess.getActivityTypeAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityTypeAttributes=ruleActivityTypeAttributes();

            state._fsp--;

             current =iv_ruleActivityTypeAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityTypeAttributes"


    // $ANTLR start "ruleActivityTypeAttributes"
    // InternalAndroidGenerator.g:1222:1: ruleActivityTypeAttributes returns [EObject current=null] : ( (lv_filter_0_0= ruleFilterQuery ) ) ;
    public final EObject ruleActivityTypeAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_filter_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1228:2: ( ( (lv_filter_0_0= ruleFilterQuery ) ) )
            // InternalAndroidGenerator.g:1229:2: ( (lv_filter_0_0= ruleFilterQuery ) )
            {
            // InternalAndroidGenerator.g:1229:2: ( (lv_filter_0_0= ruleFilterQuery ) )
            // InternalAndroidGenerator.g:1230:3: (lv_filter_0_0= ruleFilterQuery )
            {
            // InternalAndroidGenerator.g:1230:3: (lv_filter_0_0= ruleFilterQuery )
            // InternalAndroidGenerator.g:1231:4: lv_filter_0_0= ruleFilterQuery
            {

            				newCompositeNode(grammarAccess.getActivityTypeAttributesAccess().getFilterFilterQueryParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_filter_0_0=ruleFilterQuery();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getActivityTypeAttributesRule());
            				}
            				set(
            					current,
            					"filter",
            					lv_filter_0_0,
            					"org.xtext.example.mdsd.AndroidGenerator.FilterQuery");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityTypeAttributes"


    // $ANTLR start "entryRuleActivityType"
    // InternalAndroidGenerator.g:1251:1: entryRuleActivityType returns [EObject current=null] : iv_ruleActivityType= ruleActivityType EOF ;
    public final EObject entryRuleActivityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityType = null;


        try {
            // InternalAndroidGenerator.g:1251:53: (iv_ruleActivityType= ruleActivityType EOF )
            // InternalAndroidGenerator.g:1252:2: iv_ruleActivityType= ruleActivityType EOF
            {
             newCompositeNode(grammarAccess.getActivityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityType=ruleActivityType();

            state._fsp--;

             current =iv_ruleActivityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityType"


    // $ANTLR start "ruleActivityType"
    // InternalAndroidGenerator.g:1258:1: ruleActivityType returns [EObject current=null] : ( ( () otherlv_1= 'Maps' ) | ( () otherlv_3= 'Settings' ) ) ;
    public final EObject ruleActivityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1264:2: ( ( ( () otherlv_1= 'Maps' ) | ( () otherlv_3= 'Settings' ) ) )
            // InternalAndroidGenerator.g:1265:2: ( ( () otherlv_1= 'Maps' ) | ( () otherlv_3= 'Settings' ) )
            {
            // InternalAndroidGenerator.g:1265:2: ( ( () otherlv_1= 'Maps' ) | ( () otherlv_3= 'Settings' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAndroidGenerator.g:1266:3: ( () otherlv_1= 'Maps' )
                    {
                    // InternalAndroidGenerator.g:1266:3: ( () otherlv_1= 'Maps' )
                    // InternalAndroidGenerator.g:1267:4: () otherlv_1= 'Maps'
                    {
                    // InternalAndroidGenerator.g:1267:4: ()
                    // InternalAndroidGenerator.g:1268:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getActivityTypeAccess().getTypeMapAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getActivityTypeAccess().getMapsKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:1280:3: ( () otherlv_3= 'Settings' )
                    {
                    // InternalAndroidGenerator.g:1280:3: ( () otherlv_3= 'Settings' )
                    // InternalAndroidGenerator.g:1281:4: () otherlv_3= 'Settings'
                    {
                    // InternalAndroidGenerator.g:1281:4: ()
                    // InternalAndroidGenerator.g:1282:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getActivityTypeAccess().getTypeSettingAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getActivityTypeAccess().getSettingsKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityType"


    // $ANTLR start "entryRuleActivityLayoutAttributes"
    // InternalAndroidGenerator.g:1297:1: entryRuleActivityLayoutAttributes returns [EObject current=null] : iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF ;
    public final EObject entryRuleActivityLayoutAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityLayoutAttributes = null;


        try {
            // InternalAndroidGenerator.g:1297:65: (iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF )
            // InternalAndroidGenerator.g:1298:2: iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF
            {
             newCompositeNode(grammarAccess.getActivityLayoutAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityLayoutAttributes=ruleActivityLayoutAttributes();

            state._fsp--;

             current =iv_ruleActivityLayoutAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityLayoutAttributes"


    // $ANTLR start "ruleActivityLayoutAttributes"
    // InternalAndroidGenerator.g:1304:1: ruleActivityLayoutAttributes returns [EObject current=null] : ( ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )* ) ;
    public final EObject ruleActivityLayoutAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_layoutElements_0_0 = null;

        EObject lv_layoutElements_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1310:2: ( ( ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )* ) )
            // InternalAndroidGenerator.g:1311:2: ( ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )* )
            {
            // InternalAndroidGenerator.g:1311:2: ( ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )* )
            // InternalAndroidGenerator.g:1312:3: ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )*
            {
            // InternalAndroidGenerator.g:1312:3: ( (lv_layoutElements_0_0= ruleLayoutElement ) )
            // InternalAndroidGenerator.g:1313:4: (lv_layoutElements_0_0= ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:1313:4: (lv_layoutElements_0_0= ruleLayoutElement )
            // InternalAndroidGenerator.g:1314:5: lv_layoutElements_0_0= ruleLayoutElement
            {

            					newCompositeNode(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_layoutElements_0_0=ruleLayoutElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityLayoutAttributesRule());
            					}
            					add(
            						current,
            						"layoutElements",
            						lv_layoutElements_0_0,
            						"org.xtext.example.mdsd.AndroidGenerator.LayoutElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGenerator.g:1331:3: (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    int LA19_1 = input.LA(2);

                    if ( ((LA19_1>=26 && LA19_1<=27)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalAndroidGenerator.g:1332:4: otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_19); 

            	    				newLeafNode(otherlv_1, grammarAccess.getActivityLayoutAttributesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAndroidGenerator.g:1336:4: ( (lv_layoutElements_2_0= ruleLayoutElement ) )
            	    // InternalAndroidGenerator.g:1337:5: (lv_layoutElements_2_0= ruleLayoutElement )
            	    {
            	    // InternalAndroidGenerator.g:1337:5: (lv_layoutElements_2_0= ruleLayoutElement )
            	    // InternalAndroidGenerator.g:1338:6: lv_layoutElements_2_0= ruleLayoutElement
            	    {

            	    						newCompositeNode(grammarAccess.getActivityLayoutAttributesAccess().getLayoutElementsLayoutElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_layoutElements_2_0=ruleLayoutElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActivityLayoutAttributesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"layoutElements",
            	    							lv_layoutElements_2_0,
            	    							"org.xtext.example.mdsd.AndroidGenerator.LayoutElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityLayoutAttributes"


    // $ANTLR start "entryRuleLayoutElement"
    // InternalAndroidGenerator.g:1360:1: entryRuleLayoutElement returns [EObject current=null] : iv_ruleLayoutElement= ruleLayoutElement EOF ;
    public final EObject entryRuleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElement = null;


        try {
            // InternalAndroidGenerator.g:1360:54: (iv_ruleLayoutElement= ruleLayoutElement EOF )
            // InternalAndroidGenerator.g:1361:2: iv_ruleLayoutElement= ruleLayoutElement EOF
            {
             newCompositeNode(grammarAccess.getLayoutElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutElement=ruleLayoutElement();

            state._fsp--;

             current =iv_ruleLayoutElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayoutElement"


    // $ANTLR start "ruleLayoutElement"
    // InternalAndroidGenerator.g:1367:1: ruleLayoutElement returns [EObject current=null] : (this_Button_0= ruleButton | this_TextView_1= ruleTextView ) ;
    public final EObject ruleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_TextView_1 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1373:2: ( (this_Button_0= ruleButton | this_TextView_1= ruleTextView ) )
            // InternalAndroidGenerator.g:1374:2: (this_Button_0= ruleButton | this_TextView_1= ruleTextView )
            {
            // InternalAndroidGenerator.g:1374:2: (this_Button_0= ruleButton | this_TextView_1= ruleTextView )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            else if ( (LA20_0==26) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAndroidGenerator.g:1375:3: this_Button_0= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getButtonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_0=ruleButton();

                    state._fsp--;


                    			current = this_Button_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:1384:3: this_TextView_1= ruleTextView
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getTextViewParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextView_1=ruleTextView();

                    state._fsp--;


                    			current = this_TextView_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutElement"


    // $ANTLR start "entryRuleTextView"
    // InternalAndroidGenerator.g:1396:1: entryRuleTextView returns [EObject current=null] : iv_ruleTextView= ruleTextView EOF ;
    public final EObject entryRuleTextView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextView = null;


        try {
            // InternalAndroidGenerator.g:1396:49: (iv_ruleTextView= ruleTextView EOF )
            // InternalAndroidGenerator.g:1397:2: iv_ruleTextView= ruleTextView EOF
            {
             newCompositeNode(grammarAccess.getTextViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextView=ruleTextView();

            state._fsp--;

             current =iv_ruleTextView; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextView"


    // $ANTLR start "ruleTextView"
    // InternalAndroidGenerator.g:1403:1: ruleTextView returns [EObject current=null] : ( () otherlv_1= 'TextView' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTextView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1409:2: ( ( () otherlv_1= 'TextView' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:1410:2: ( () otherlv_1= 'TextView' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:1410:2: ( () otherlv_1= 'TextView' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalAndroidGenerator.g:1411:3: () otherlv_1= 'TextView' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalAndroidGenerator.g:1411:3: ()
            // InternalAndroidGenerator.g:1412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextViewAccess().getTextViewAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTextViewAccess().getTextViewKeyword_1());
            		
            // InternalAndroidGenerator.g:1422:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGenerator.g:1423:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:1423:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGenerator.g:1424:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTextViewAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextView"


    // $ANTLR start "entryRuleButton"
    // InternalAndroidGenerator.g:1444:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalAndroidGenerator.g:1444:47: (iv_ruleButton= ruleButton EOF )
            // InternalAndroidGenerator.g:1445:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalAndroidGenerator.g:1451:1: ruleButton returns [EObject current=null] : ( () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1457:2: ( ( () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:1458:2: ( () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:1458:2: ( () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalAndroidGenerator.g:1459:3: () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalAndroidGenerator.g:1459:3: ()
            // InternalAndroidGenerator.g:1460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
            		
            // InternalAndroidGenerator.g:1470:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGenerator.g:1471:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:1471:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGenerator.g:1472:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleFilterQuery"
    // InternalAndroidGenerator.g:1492:1: entryRuleFilterQuery returns [EObject current=null] : iv_ruleFilterQuery= ruleFilterQuery EOF ;
    public final EObject entryRuleFilterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterQuery = null;


        try {
            // InternalAndroidGenerator.g:1492:52: (iv_ruleFilterQuery= ruleFilterQuery EOF )
            // InternalAndroidGenerator.g:1493:2: iv_ruleFilterQuery= ruleFilterQuery EOF
            {
             newCompositeNode(grammarAccess.getFilterQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterQuery=ruleFilterQuery();

            state._fsp--;

             current =iv_ruleFilterQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterQuery"


    // $ANTLR start "ruleFilterQuery"
    // InternalAndroidGenerator.g:1499:1: ruleFilterQuery returns [EObject current=null] : ( () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) ) ;
    public final EObject ruleFilterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_filterAttributes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1505:2: ( ( () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) ) )
            // InternalAndroidGenerator.g:1506:2: ( () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) )
            {
            // InternalAndroidGenerator.g:1506:2: ( () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) )
            // InternalAndroidGenerator.g:1507:3: () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) )
            {
            // InternalAndroidGenerator.g:1507:3: ()
            // InternalAndroidGenerator.g:1508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterQueryAccess().getFilterQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1());
            		
            // InternalAndroidGenerator.g:1518:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGenerator.g:1519:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:1519:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGenerator.g:1520:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFilterQueryAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAndroidGenerator.g:1536:3: ( (lv_filterAttributes_3_0= ruleFilterAttributes ) )
            // InternalAndroidGenerator.g:1537:4: (lv_filterAttributes_3_0= ruleFilterAttributes )
            {
            // InternalAndroidGenerator.g:1537:4: (lv_filterAttributes_3_0= ruleFilterAttributes )
            // InternalAndroidGenerator.g:1538:5: lv_filterAttributes_3_0= ruleFilterAttributes
            {

            					newCompositeNode(grammarAccess.getFilterQueryAccess().getFilterAttributesFilterAttributesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_filterAttributes_3_0=ruleFilterAttributes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterQueryRule());
            					}
            					set(
            						current,
            						"filterAttributes",
            						lv_filterAttributes_3_0,
            						"org.xtext.example.mdsd.AndroidGenerator.FilterAttributes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterQuery"


    // $ANTLR start "entryRuleFilterAttributes"
    // InternalAndroidGenerator.g:1559:1: entryRuleFilterAttributes returns [EObject current=null] : iv_ruleFilterAttributes= ruleFilterAttributes EOF ;
    public final EObject entryRuleFilterAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterAttributes = null;


        try {
            // InternalAndroidGenerator.g:1559:57: (iv_ruleFilterAttributes= ruleFilterAttributes EOF )
            // InternalAndroidGenerator.g:1560:2: iv_ruleFilterAttributes= ruleFilterAttributes EOF
            {
             newCompositeNode(grammarAccess.getFilterAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterAttributes=ruleFilterAttributes();

            state._fsp--;

             current =iv_ruleFilterAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterAttributes"


    // $ANTLR start "ruleFilterAttributes"
    // InternalAndroidGenerator.g:1566:1: ruleFilterAttributes returns [EObject current=null] : ( (lv_distance_0_0= ruleDistance ) ) ;
    public final EObject ruleFilterAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_distance_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1572:2: ( ( (lv_distance_0_0= ruleDistance ) ) )
            // InternalAndroidGenerator.g:1573:2: ( (lv_distance_0_0= ruleDistance ) )
            {
            // InternalAndroidGenerator.g:1573:2: ( (lv_distance_0_0= ruleDistance ) )
            // InternalAndroidGenerator.g:1574:3: (lv_distance_0_0= ruleDistance )
            {
            // InternalAndroidGenerator.g:1574:3: (lv_distance_0_0= ruleDistance )
            // InternalAndroidGenerator.g:1575:4: lv_distance_0_0= ruleDistance
            {

            				newCompositeNode(grammarAccess.getFilterAttributesAccess().getDistanceDistanceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_distance_0_0=ruleDistance();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFilterAttributesRule());
            				}
            				set(
            					current,
            					"distance",
            					lv_distance_0_0,
            					"org.xtext.example.mdsd.AndroidGenerator.Distance");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterAttributes"


    // $ANTLR start "entryRuleDistance"
    // InternalAndroidGenerator.g:1595:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalAndroidGenerator.g:1595:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalAndroidGenerator.g:1596:2: iv_ruleDistance= ruleDistance EOF
            {
             newCompositeNode(grammarAccess.getDistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistance=ruleDistance();

            state._fsp--;

             current =iv_ruleDistance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistance"


    // $ANTLR start "ruleDistance"
    // InternalAndroidGenerator.g:1602:1: ruleDistance returns [EObject current=null] : (otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_unit_2_0 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_results_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1608:2: ( (otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) ) )
            // InternalAndroidGenerator.g:1609:2: (otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) )
            {
            // InternalAndroidGenerator.g:1609:2: (otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) )
            // InternalAndroidGenerator.g:1610:3: otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceAccess().getDistanceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getColonKeyword_1());
            		
            // InternalAndroidGenerator.g:1618:3: ( (lv_unit_2_0= ruleUnit ) )
            // InternalAndroidGenerator.g:1619:4: (lv_unit_2_0= ruleUnit )
            {
            // InternalAndroidGenerator.g:1619:4: (lv_unit_2_0= ruleUnit )
            // InternalAndroidGenerator.g:1620:5: lv_unit_2_0= ruleUnit
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getUnitUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_unit_2_0=ruleUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Unit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGenerator.g:1637:3: ( (lv_operator_3_0= ruleOperator ) )
            // InternalAndroidGenerator.g:1638:4: (lv_operator_3_0= ruleOperator )
            {
            // InternalAndroidGenerator.g:1638:4: (lv_operator_3_0= ruleOperator )
            // InternalAndroidGenerator.g:1639:5: lv_operator_3_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getOperatorOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_operator_3_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAndroidGenerator.g:1656:3: ( (lv_results_4_0= ruleNumber ) )
            // InternalAndroidGenerator.g:1657:4: (lv_results_4_0= ruleNumber )
            {
            // InternalAndroidGenerator.g:1657:4: (lv_results_4_0= ruleNumber )
            // InternalAndroidGenerator.g:1658:5: lv_results_4_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getResultsNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_results_4_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceRule());
            					}
            					set(
            						current,
            						"results",
            						lv_results_4_0,
            						"org.xtext.example.mdsd.AndroidGenerator.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistance"


    // $ANTLR start "entryRuleNumber"
    // InternalAndroidGenerator.g:1679:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalAndroidGenerator.g:1679:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalAndroidGenerator.g:1680:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalAndroidGenerator.g:1686:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1692:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAndroidGenerator.g:1693:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAndroidGenerator.g:1693:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAndroidGenerator.g:1694:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAndroidGenerator.g:1694:3: (lv_value_0_0= RULE_INT )
            // InternalAndroidGenerator.g:1695:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleOperator"
    // InternalAndroidGenerator.g:1714:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalAndroidGenerator.g:1714:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalAndroidGenerator.g:1715:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalAndroidGenerator.g:1721:1: ruleOperator returns [EObject current=null] : ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '=' ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1727:2: ( ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '=' ) ) )
            // InternalAndroidGenerator.g:1728:2: ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '=' ) )
            {
            // InternalAndroidGenerator.g:1728:2: ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '=' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAndroidGenerator.g:1729:3: ( () otherlv_1= '>' )
                    {
                    // InternalAndroidGenerator.g:1729:3: ( () otherlv_1= '>' )
                    // InternalAndroidGenerator.g:1730:4: () otherlv_1= '>'
                    {
                    // InternalAndroidGenerator.g:1730:4: ()
                    // InternalAndroidGenerator.g:1731:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getLessAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:1743:3: ( () otherlv_3= '<' )
                    {
                    // InternalAndroidGenerator.g:1743:3: ( () otherlv_3= '<' )
                    // InternalAndroidGenerator.g:1744:4: () otherlv_3= '<'
                    {
                    // InternalAndroidGenerator.g:1744:4: ()
                    // InternalAndroidGenerator.g:1745:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getMoreAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGenerator.g:1757:3: ( () otherlv_5= '=' )
                    {
                    // InternalAndroidGenerator.g:1757:3: ( () otherlv_5= '=' )
                    // InternalAndroidGenerator.g:1758:4: () otherlv_5= '='
                    {
                    // InternalAndroidGenerator.g:1758:4: ()
                    // InternalAndroidGenerator.g:1759:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getEqualAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperatorAccess().getEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleUnit"
    // InternalAndroidGenerator.g:1774:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalAndroidGenerator.g:1774:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalAndroidGenerator.g:1775:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalAndroidGenerator.g:1781:1: ruleUnit returns [EObject current=null] : ( ( () otherlv_1= 'm' ) | ( () otherlv_3= 'f' ) ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1787:2: ( ( ( () otherlv_1= 'm' ) | ( () otherlv_3= 'f' ) ) )
            // InternalAndroidGenerator.g:1788:2: ( ( () otherlv_1= 'm' ) | ( () otherlv_3= 'f' ) )
            {
            // InternalAndroidGenerator.g:1788:2: ( ( () otherlv_1= 'm' ) | ( () otherlv_3= 'f' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            else if ( (LA22_0==34) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAndroidGenerator.g:1789:3: ( () otherlv_1= 'm' )
                    {
                    // InternalAndroidGenerator.g:1789:3: ( () otherlv_1= 'm' )
                    // InternalAndroidGenerator.g:1790:4: () otherlv_1= 'm'
                    {
                    // InternalAndroidGenerator.g:1790:4: ()
                    // InternalAndroidGenerator.g:1791:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnitAccess().getMetersAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnitAccess().getMKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:1803:3: ( () otherlv_3= 'f' )
                    {
                    // InternalAndroidGenerator.g:1803:3: ( () otherlv_3= 'f' )
                    // InternalAndroidGenerator.g:1804:4: () otherlv_3= 'f'
                    {
                    // InternalAndroidGenerator.g:1804:4: ()
                    // InternalAndroidGenerator.g:1805:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnitAccess().getImperialAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnitAccess().getFKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C4002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001C0000000L});

}