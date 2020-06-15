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

                if ( (LA2_0==14||(LA2_0>=18 && LA2_0<=19)) ) {
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
    // InternalAndroidGenerator.g:194:1: ruleApplicationAttribute returns [EObject current=null] : (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList ) ;
    public final EObject ruleApplicationAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicationVersion_0 = null;

        EObject this_ApplicationPermissionList_1 = null;

        EObject this_ApplicationElementList_2 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:200:2: ( (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList ) )
            // InternalAndroidGenerator.g:201:2: (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList )
            {
            // InternalAndroidGenerator.g:201:2: (this_ApplicationVersion_0= ruleApplicationVersion | this_ApplicationPermissionList_1= ruleApplicationPermissionList | this_ApplicationElementList_2= ruleApplicationElementList )
            int alt3=3;
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
    // InternalAndroidGenerator.g:232:1: entryRuleApplicationVersion returns [EObject current=null] : iv_ruleApplicationVersion= ruleApplicationVersion EOF ;
    public final EObject entryRuleApplicationVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationVersion = null;


        try {
            // InternalAndroidGenerator.g:232:59: (iv_ruleApplicationVersion= ruleApplicationVersion EOF )
            // InternalAndroidGenerator.g:233:2: iv_ruleApplicationVersion= ruleApplicationVersion EOF
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
    // InternalAndroidGenerator.g:239:1: ruleApplicationVersion returns [EObject current=null] : ( () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )? ) ;
    public final EObject ruleApplicationVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;

        EObject lv_targetsdk_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:245:2: ( ( () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )? ) )
            // InternalAndroidGenerator.g:246:2: ( () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )? )
            {
            // InternalAndroidGenerator.g:246:2: ( () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )? )
            // InternalAndroidGenerator.g:247:3: () otherlv_1= 'Android-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_targetsdk_4_0= ruleTargetSDK ) )?
            {
            // InternalAndroidGenerator.g:247:3: ()
            // InternalAndroidGenerator.g:248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationVersionAccess().getApplicationVersionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationVersionAccess().getAndroidSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationVersionAccess().getColonKeyword_2());
            		
            // InternalAndroidGenerator.g:262:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGenerator.g:263:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGenerator.g:263:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGenerator.g:264:5: lv_result_3_0= ruleNumber
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

            // InternalAndroidGenerator.g:281:3: ( (lv_targetsdk_4_0= ruleTargetSDK ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAndroidGenerator.g:282:4: (lv_targetsdk_4_0= ruleTargetSDK )
                    {
                    // InternalAndroidGenerator.g:282:4: (lv_targetsdk_4_0= ruleTargetSDK )
                    // InternalAndroidGenerator.g:283:5: lv_targetsdk_4_0= ruleTargetSDK
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
    // InternalAndroidGenerator.g:304:1: entryRuleTargetSDK returns [EObject current=null] : iv_ruleTargetSDK= ruleTargetSDK EOF ;
    public final EObject entryRuleTargetSDK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetSDK = null;


        try {
            // InternalAndroidGenerator.g:304:50: (iv_ruleTargetSDK= ruleTargetSDK EOF )
            // InternalAndroidGenerator.g:305:2: iv_ruleTargetSDK= ruleTargetSDK EOF
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
    // InternalAndroidGenerator.g:311:1: ruleTargetSDK returns [EObject current=null] : ( () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? ) ;
    public final EObject ruleTargetSDK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;

        EObject lv_minsdk_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:317:2: ( ( () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? ) )
            // InternalAndroidGenerator.g:318:2: ( () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? )
            {
            // InternalAndroidGenerator.g:318:2: ( () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )? )
            // InternalAndroidGenerator.g:319:3: () otherlv_1= 'Target-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ( (lv_minsdk_4_0= ruleMinSDK ) )?
            {
            // InternalAndroidGenerator.g:319:3: ()
            // InternalAndroidGenerator.g:320:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetSDKAccess().getTargetSDKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetSDKAccess().getTargetSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTargetSDKAccess().getColonKeyword_2());
            		
            // InternalAndroidGenerator.g:334:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGenerator.g:335:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGenerator.g:335:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGenerator.g:336:5: lv_result_3_0= ruleNumber
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

            // InternalAndroidGenerator.g:353:3: ( (lv_minsdk_4_0= ruleMinSDK ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAndroidGenerator.g:354:4: (lv_minsdk_4_0= ruleMinSDK )
                    {
                    // InternalAndroidGenerator.g:354:4: (lv_minsdk_4_0= ruleMinSDK )
                    // InternalAndroidGenerator.g:355:5: lv_minsdk_4_0= ruleMinSDK
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
    // InternalAndroidGenerator.g:376:1: entryRuleMinSDK returns [EObject current=null] : iv_ruleMinSDK= ruleMinSDK EOF ;
    public final EObject entryRuleMinSDK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinSDK = null;


        try {
            // InternalAndroidGenerator.g:376:47: (iv_ruleMinSDK= ruleMinSDK EOF )
            // InternalAndroidGenerator.g:377:2: iv_ruleMinSDK= ruleMinSDK EOF
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
    // InternalAndroidGenerator.g:383:1: ruleMinSDK returns [EObject current=null] : ( () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ) ;
    public final EObject ruleMinSDK() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_result_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:389:2: ( ( () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) ) )
            // InternalAndroidGenerator.g:390:2: ( () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) )
            {
            // InternalAndroidGenerator.g:390:2: ( () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) ) )
            // InternalAndroidGenerator.g:391:3: () otherlv_1= 'Minimum-SDK' otherlv_2= ':' ( (lv_result_3_0= ruleNumber ) )
            {
            // InternalAndroidGenerator.g:391:3: ()
            // InternalAndroidGenerator.g:392:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinSDKAccess().getMinSDKAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMinSDKAccess().getMinimumSDKKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMinSDKAccess().getColonKeyword_2());
            		
            // InternalAndroidGenerator.g:406:3: ( (lv_result_3_0= ruleNumber ) )
            // InternalAndroidGenerator.g:407:4: (lv_result_3_0= ruleNumber )
            {
            // InternalAndroidGenerator.g:407:4: (lv_result_3_0= ruleNumber )
            // InternalAndroidGenerator.g:408:5: lv_result_3_0= ruleNumber
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
    // InternalAndroidGenerator.g:429:1: entryRuleApplicationPermissionList returns [EObject current=null] : iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF ;
    public final EObject entryRuleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationPermissionList = null;


        try {
            // InternalAndroidGenerator.g:429:66: (iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF )
            // InternalAndroidGenerator.g:430:2: iv_ruleApplicationPermissionList= ruleApplicationPermissionList EOF
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
    // InternalAndroidGenerator.g:436:1: ruleApplicationPermissionList returns [EObject current=null] : (otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* ) ;
    public final EObject ruleApplicationPermissionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_permissions_1_0 = null;

        EObject lv_permissions_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:442:2: ( (otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* ) )
            // InternalAndroidGenerator.g:443:2: (otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* )
            {
            // InternalAndroidGenerator.g:443:2: (otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* )
            // InternalAndroidGenerator.g:444:3: otherlv_0= 'permissions' ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationPermissionListAccess().getPermissionsKeyword_0());
            		
            // InternalAndroidGenerator.g:448:3: ( (lv_permissions_1_0= rulePermission ) )
            // InternalAndroidGenerator.g:449:4: (lv_permissions_1_0= rulePermission )
            {
            // InternalAndroidGenerator.g:449:4: (lv_permissions_1_0= rulePermission )
            // InternalAndroidGenerator.g:450:5: lv_permissions_1_0= rulePermission
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

            // InternalAndroidGenerator.g:467:3: (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )*
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
            	    // InternalAndroidGenerator.g:468:4: otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getApplicationPermissionListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAndroidGenerator.g:472:4: ( (lv_permissions_3_0= rulePermission ) )
            	    // InternalAndroidGenerator.g:473:5: (lv_permissions_3_0= rulePermission )
            	    {
            	    // InternalAndroidGenerator.g:473:5: (lv_permissions_3_0= rulePermission )
            	    // InternalAndroidGenerator.g:474:6: lv_permissions_3_0= rulePermission
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
    // InternalAndroidGenerator.g:496:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // InternalAndroidGenerator.g:496:51: (iv_rulePermission= rulePermission EOF )
            // InternalAndroidGenerator.g:497:2: iv_rulePermission= rulePermission EOF
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
    // InternalAndroidGenerator.g:503:1: rulePermission returns [EObject current=null] : ( (lv_name_0_0= RULE_PACKAGE_NAME ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:509:2: ( ( (lv_name_0_0= RULE_PACKAGE_NAME ) ) )
            // InternalAndroidGenerator.g:510:2: ( (lv_name_0_0= RULE_PACKAGE_NAME ) )
            {
            // InternalAndroidGenerator.g:510:2: ( (lv_name_0_0= RULE_PACKAGE_NAME ) )
            // InternalAndroidGenerator.g:511:3: (lv_name_0_0= RULE_PACKAGE_NAME )
            {
            // InternalAndroidGenerator.g:511:3: (lv_name_0_0= RULE_PACKAGE_NAME )
            // InternalAndroidGenerator.g:512:4: lv_name_0_0= RULE_PACKAGE_NAME
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
    // InternalAndroidGenerator.g:531:1: entryRuleApplicationElementList returns [EObject current=null] : iv_ruleApplicationElementList= ruleApplicationElementList EOF ;
    public final EObject entryRuleApplicationElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElementList = null;


        try {
            // InternalAndroidGenerator.g:531:63: (iv_ruleApplicationElementList= ruleApplicationElementList EOF )
            // InternalAndroidGenerator.g:532:2: iv_ruleApplicationElementList= ruleApplicationElementList EOF
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
    // InternalAndroidGenerator.g:538:1: ruleApplicationElementList returns [EObject current=null] : ( () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )* ) ;
    public final EObject ruleApplicationElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:544:2: ( ( () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )* ) )
            // InternalAndroidGenerator.g:545:2: ( () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )* )
            {
            // InternalAndroidGenerator.g:545:2: ( () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )* )
            // InternalAndroidGenerator.g:546:3: () otherlv_1= 'elements' ( (lv_elements_2_0= ruleApplicationElement ) )*
            {
            // InternalAndroidGenerator.g:546:3: ()
            // InternalAndroidGenerator.g:547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationElementListAccess().getApplicationElementListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationElementListAccess().getElementsKeyword_1());
            		
            // InternalAndroidGenerator.g:557:3: ( (lv_elements_2_0= ruleApplicationElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAndroidGenerator.g:558:4: (lv_elements_2_0= ruleApplicationElement )
            	    {
            	    // InternalAndroidGenerator.g:558:4: (lv_elements_2_0= ruleApplicationElement )
            	    // InternalAndroidGenerator.g:559:5: lv_elements_2_0= ruleApplicationElement
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


    // $ANTLR start "entryRuleApplicationElement"
    // InternalAndroidGenerator.g:580:1: entryRuleApplicationElement returns [EObject current=null] : iv_ruleApplicationElement= ruleApplicationElement EOF ;
    public final EObject entryRuleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationElement = null;


        try {
            // InternalAndroidGenerator.g:580:59: (iv_ruleApplicationElement= ruleApplicationElement EOF )
            // InternalAndroidGenerator.g:581:2: iv_ruleApplicationElement= ruleApplicationElement EOF
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
    // InternalAndroidGenerator.g:587:1: ruleApplicationElement returns [EObject current=null] : (this_Fragment_0= ruleFragment | this_Model_1= ruleModel ) ;
    public final EObject ruleApplicationElement() throws RecognitionException {
        EObject current = null;

        EObject this_Fragment_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:593:2: ( (this_Fragment_0= ruleFragment | this_Model_1= ruleModel ) )
            // InternalAndroidGenerator.g:594:2: (this_Fragment_0= ruleFragment | this_Model_1= ruleModel )
            {
            // InternalAndroidGenerator.g:594:2: (this_Fragment_0= ruleFragment | this_Model_1= ruleModel )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAndroidGenerator.g:595:3: this_Fragment_0= ruleFragment
                    {

                    			newCompositeNode(grammarAccess.getApplicationElementAccess().getFragmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fragment_0=ruleFragment();

                    state._fsp--;


                    			current = this_Fragment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:604:3: this_Model_1= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getApplicationElementAccess().getModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    			current = this_Model_1;
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
    // InternalAndroidGenerator.g:616:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAndroidGenerator.g:616:46: (iv_ruleModel= ruleModel EOF )
            // InternalAndroidGenerator.g:617:2: iv_ruleModel= ruleModel EOF
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
    // InternalAndroidGenerator.g:623:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:629:2: ( (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:630:2: (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:630:2: (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAndroidGenerator.g:631:3: otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalAndroidGenerator.g:635:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAndroidGenerator.g:636:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:636:4: (lv_name_1_0= RULE_ID )
            // InternalAndroidGenerator.g:637:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFragment"
    // InternalAndroidGenerator.g:657:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalAndroidGenerator.g:657:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalAndroidGenerator.g:658:2: iv_ruleFragment= ruleFragment EOF
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
    // InternalAndroidGenerator.g:664:1: ruleFragment returns [EObject current=null] : ( () otherlv_1= 'Fragment' ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )? ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_activityAttributes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:670:2: ( ( () otherlv_1= 'Fragment' ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )? ) )
            // InternalAndroidGenerator.g:671:2: ( () otherlv_1= 'Fragment' ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )? )
            {
            // InternalAndroidGenerator.g:671:2: ( () otherlv_1= 'Fragment' ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )? )
            // InternalAndroidGenerator.g:672:3: () otherlv_1= 'Fragment' ( (lv_name_2_0= RULE_ID ) ) ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )?
            {
            // InternalAndroidGenerator.g:672:3: ()
            // InternalAndroidGenerator.g:673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFragmentAccess().getFragmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getFragmentKeyword_1());
            		
            // InternalAndroidGenerator.g:683:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGenerator.g:684:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:684:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGenerator.g:685:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAndroidGenerator.g:701:3: ( (lv_activityAttributes_3_0= ruleActivityLayoutAttributes ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=22 && LA9_0<=26)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAndroidGenerator.g:702:4: (lv_activityAttributes_3_0= ruleActivityLayoutAttributes )
                    {
                    // InternalAndroidGenerator.g:702:4: (lv_activityAttributes_3_0= ruleActivityLayoutAttributes )
                    // InternalAndroidGenerator.g:703:5: lv_activityAttributes_3_0= ruleActivityLayoutAttributes
                    {

                    					newCompositeNode(grammarAccess.getFragmentAccess().getActivityAttributesActivityLayoutAttributesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_activityAttributes_3_0=ruleActivityLayoutAttributes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFragmentRule());
                    					}
                    					add(
                    						current,
                    						"activityAttributes",
                    						lv_activityAttributes_3_0,
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


    // $ANTLR start "entryRuleActivityLayoutAttributes"
    // InternalAndroidGenerator.g:724:1: entryRuleActivityLayoutAttributes returns [EObject current=null] : iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF ;
    public final EObject entryRuleActivityLayoutAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityLayoutAttributes = null;


        try {
            // InternalAndroidGenerator.g:724:65: (iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF )
            // InternalAndroidGenerator.g:725:2: iv_ruleActivityLayoutAttributes= ruleActivityLayoutAttributes EOF
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
    // InternalAndroidGenerator.g:731:1: ruleActivityLayoutAttributes returns [EObject current=null] : ( ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )* ) ;
    public final EObject ruleActivityLayoutAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_layoutElements_0_0 = null;

        EObject lv_layoutElements_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:737:2: ( ( ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )* ) )
            // InternalAndroidGenerator.g:738:2: ( ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )* )
            {
            // InternalAndroidGenerator.g:738:2: ( ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )* )
            // InternalAndroidGenerator.g:739:3: ( (lv_layoutElements_0_0= ruleLayoutElement ) ) (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )*
            {
            // InternalAndroidGenerator.g:739:3: ( (lv_layoutElements_0_0= ruleLayoutElement ) )
            // InternalAndroidGenerator.g:740:4: (lv_layoutElements_0_0= ruleLayoutElement )
            {
            // InternalAndroidGenerator.g:740:4: (lv_layoutElements_0_0= ruleLayoutElement )
            // InternalAndroidGenerator.g:741:5: lv_layoutElements_0_0= ruleLayoutElement
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

            // InternalAndroidGenerator.g:758:3: (otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>=22 && LA10_1<=26)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalAndroidGenerator.g:759:4: otherlv_1= ',' ( (lv_layoutElements_2_0= ruleLayoutElement ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getActivityLayoutAttributesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAndroidGenerator.g:763:4: ( (lv_layoutElements_2_0= ruleLayoutElement ) )
            	    // InternalAndroidGenerator.g:764:5: (lv_layoutElements_2_0= ruleLayoutElement )
            	    {
            	    // InternalAndroidGenerator.g:764:5: (lv_layoutElements_2_0= ruleLayoutElement )
            	    // InternalAndroidGenerator.g:765:6: lv_layoutElements_2_0= ruleLayoutElement
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
            	    break loop10;
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
    // InternalAndroidGenerator.g:787:1: entryRuleLayoutElement returns [EObject current=null] : iv_ruleLayoutElement= ruleLayoutElement EOF ;
    public final EObject entryRuleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElement = null;


        try {
            // InternalAndroidGenerator.g:787:54: (iv_ruleLayoutElement= ruleLayoutElement EOF )
            // InternalAndroidGenerator.g:788:2: iv_ruleLayoutElement= ruleLayoutElement EOF
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
    // InternalAndroidGenerator.g:794:1: ruleLayoutElement returns [EObject current=null] : (this_Button_0= ruleButton | this_EditText_1= ruleEditText | this_Spinner_2= ruleSpinner | this_TypeMap_3= ruleTypeMap | this_TypeSetting_4= ruleTypeSetting ) ;
    public final EObject ruleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_EditText_1 = null;

        EObject this_Spinner_2 = null;

        EObject this_TypeMap_3 = null;

        EObject this_TypeSetting_4 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:800:2: ( (this_Button_0= ruleButton | this_EditText_1= ruleEditText | this_Spinner_2= ruleSpinner | this_TypeMap_3= ruleTypeMap | this_TypeSetting_4= ruleTypeSetting ) )
            // InternalAndroidGenerator.g:801:2: (this_Button_0= ruleButton | this_EditText_1= ruleEditText | this_Spinner_2= ruleSpinner | this_TypeMap_3= ruleTypeMap | this_TypeSetting_4= ruleTypeSetting )
            {
            // InternalAndroidGenerator.g:801:2: (this_Button_0= ruleButton | this_EditText_1= ruleEditText | this_Spinner_2= ruleSpinner | this_TypeMap_3= ruleTypeMap | this_TypeSetting_4= ruleTypeSetting )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAndroidGenerator.g:802:3: this_Button_0= ruleButton
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
                    // InternalAndroidGenerator.g:811:3: this_EditText_1= ruleEditText
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getEditTextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EditText_1=ruleEditText();

                    state._fsp--;


                    			current = this_EditText_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAndroidGenerator.g:820:3: this_Spinner_2= ruleSpinner
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getSpinnerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Spinner_2=ruleSpinner();

                    state._fsp--;


                    			current = this_Spinner_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAndroidGenerator.g:829:3: this_TypeMap_3= ruleTypeMap
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getTypeMapParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeMap_3=ruleTypeMap();

                    state._fsp--;


                    			current = this_TypeMap_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAndroidGenerator.g:838:3: this_TypeSetting_4= ruleTypeSetting
                    {

                    			newCompositeNode(grammarAccess.getLayoutElementAccess().getTypeSettingParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeSetting_4=ruleTypeSetting();

                    state._fsp--;


                    			current = this_TypeSetting_4;
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


    // $ANTLR start "entryRuleTypeMap"
    // InternalAndroidGenerator.g:850:1: entryRuleTypeMap returns [EObject current=null] : iv_ruleTypeMap= ruleTypeMap EOF ;
    public final EObject entryRuleTypeMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMap = null;


        try {
            // InternalAndroidGenerator.g:850:48: (iv_ruleTypeMap= ruleTypeMap EOF )
            // InternalAndroidGenerator.g:851:2: iv_ruleTypeMap= ruleTypeMap EOF
            {
             newCompositeNode(grammarAccess.getTypeMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeMap=ruleTypeMap();

            state._fsp--;

             current =iv_ruleTypeMap; 
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
    // $ANTLR end "entryRuleTypeMap"


    // $ANTLR start "ruleTypeMap"
    // InternalAndroidGenerator.g:857:1: ruleTypeMap returns [EObject current=null] : ( () otherlv_1= 'Map' ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )? ) ;
    public final EObject ruleTypeMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_activitytypeattribute_2_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:863:2: ( ( () otherlv_1= 'Map' ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )? ) )
            // InternalAndroidGenerator.g:864:2: ( () otherlv_1= 'Map' ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )? )
            {
            // InternalAndroidGenerator.g:864:2: ( () otherlv_1= 'Map' ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )? )
            // InternalAndroidGenerator.g:865:3: () otherlv_1= 'Map' ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )?
            {
            // InternalAndroidGenerator.g:865:3: ()
            // InternalAndroidGenerator.g:866:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeMapAccess().getTypeMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeMapAccess().getMapKeyword_1());
            		
            // InternalAndroidGenerator.g:876:3: ( (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAndroidGenerator.g:877:4: (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes )
                    {
                    // InternalAndroidGenerator.g:877:4: (lv_activitytypeattribute_2_0= ruleActivityTypeAttributes )
                    // InternalAndroidGenerator.g:878:5: lv_activitytypeattribute_2_0= ruleActivityTypeAttributes
                    {

                    					newCompositeNode(grammarAccess.getTypeMapAccess().getActivitytypeattributeActivityTypeAttributesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_activitytypeattribute_2_0=ruleActivityTypeAttributes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeMapRule());
                    					}
                    					set(
                    						current,
                    						"activitytypeattribute",
                    						lv_activitytypeattribute_2_0,
                    						"org.xtext.example.mdsd.AndroidGenerator.ActivityTypeAttributes");
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
    // $ANTLR end "ruleTypeMap"


    // $ANTLR start "entryRuleTypeSetting"
    // InternalAndroidGenerator.g:899:1: entryRuleTypeSetting returns [EObject current=null] : iv_ruleTypeSetting= ruleTypeSetting EOF ;
    public final EObject entryRuleTypeSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSetting = null;


        try {
            // InternalAndroidGenerator.g:899:52: (iv_ruleTypeSetting= ruleTypeSetting EOF )
            // InternalAndroidGenerator.g:900:2: iv_ruleTypeSetting= ruleTypeSetting EOF
            {
             newCompositeNode(grammarAccess.getTypeSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSetting=ruleTypeSetting();

            state._fsp--;

             current =iv_ruleTypeSetting; 
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
    // $ANTLR end "entryRuleTypeSetting"


    // $ANTLR start "ruleTypeSetting"
    // InternalAndroidGenerator.g:906:1: ruleTypeSetting returns [EObject current=null] : ( () otherlv_1= 'Settings' ) ;
    public final EObject ruleTypeSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:912:2: ( ( () otherlv_1= 'Settings' ) )
            // InternalAndroidGenerator.g:913:2: ( () otherlv_1= 'Settings' )
            {
            // InternalAndroidGenerator.g:913:2: ( () otherlv_1= 'Settings' )
            // InternalAndroidGenerator.g:914:3: () otherlv_1= 'Settings'
            {
            // InternalAndroidGenerator.g:914:3: ()
            // InternalAndroidGenerator.g:915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeSettingAccess().getTypeSettingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeSettingAccess().getSettingsKeyword_1());
            		

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
    // $ANTLR end "ruleTypeSetting"


    // $ANTLR start "entryRuleActivityTypeAttributes"
    // InternalAndroidGenerator.g:929:1: entryRuleActivityTypeAttributes returns [EObject current=null] : iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF ;
    public final EObject entryRuleActivityTypeAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityTypeAttributes = null;


        try {
            // InternalAndroidGenerator.g:929:63: (iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF )
            // InternalAndroidGenerator.g:930:2: iv_ruleActivityTypeAttributes= ruleActivityTypeAttributes EOF
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
    // InternalAndroidGenerator.g:936:1: ruleActivityTypeAttributes returns [EObject current=null] : ( (lv_filter_0_0= ruleFilterQuery ) ) ;
    public final EObject ruleActivityTypeAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_filter_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:942:2: ( ( (lv_filter_0_0= ruleFilterQuery ) ) )
            // InternalAndroidGenerator.g:943:2: ( (lv_filter_0_0= ruleFilterQuery ) )
            {
            // InternalAndroidGenerator.g:943:2: ( (lv_filter_0_0= ruleFilterQuery ) )
            // InternalAndroidGenerator.g:944:3: (lv_filter_0_0= ruleFilterQuery )
            {
            // InternalAndroidGenerator.g:944:3: (lv_filter_0_0= ruleFilterQuery )
            // InternalAndroidGenerator.g:945:4: lv_filter_0_0= ruleFilterQuery
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


    // $ANTLR start "entryRuleEditText"
    // InternalAndroidGenerator.g:965:1: entryRuleEditText returns [EObject current=null] : iv_ruleEditText= ruleEditText EOF ;
    public final EObject entryRuleEditText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditText = null;


        try {
            // InternalAndroidGenerator.g:965:49: (iv_ruleEditText= ruleEditText EOF )
            // InternalAndroidGenerator.g:966:2: iv_ruleEditText= ruleEditText EOF
            {
             newCompositeNode(grammarAccess.getEditTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditText=ruleEditText();

            state._fsp--;

             current =iv_ruleEditText; 
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
    // $ANTLR end "entryRuleEditText"


    // $ANTLR start "ruleEditText"
    // InternalAndroidGenerator.g:972:1: ruleEditText returns [EObject current=null] : ( () otherlv_1= 'EditText' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEditText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:978:2: ( ( () otherlv_1= 'EditText' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:979:2: ( () otherlv_1= 'EditText' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:979:2: ( () otherlv_1= 'EditText' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalAndroidGenerator.g:980:3: () otherlv_1= 'EditText' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalAndroidGenerator.g:980:3: ()
            // InternalAndroidGenerator.g:981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEditTextAccess().getEditTextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEditTextAccess().getEditTextKeyword_1());
            		
            // InternalAndroidGenerator.g:991:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGenerator.g:992:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:992:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGenerator.g:993:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEditTextAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEditTextRule());
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
    // $ANTLR end "ruleEditText"


    // $ANTLR start "entryRuleSpinner"
    // InternalAndroidGenerator.g:1013:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // InternalAndroidGenerator.g:1013:48: (iv_ruleSpinner= ruleSpinner EOF )
            // InternalAndroidGenerator.g:1014:2: iv_ruleSpinner= ruleSpinner EOF
            {
             newCompositeNode(grammarAccess.getSpinnerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinner=ruleSpinner();

            state._fsp--;

             current =iv_ruleSpinner; 
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
    // $ANTLR end "entryRuleSpinner"


    // $ANTLR start "ruleSpinner"
    // InternalAndroidGenerator.g:1020:1: ruleSpinner returns [EObject current=null] : ( () otherlv_1= 'Spinner' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1026:2: ( ( () otherlv_1= 'Spinner' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:1027:2: ( () otherlv_1= 'Spinner' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:1027:2: ( () otherlv_1= 'Spinner' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalAndroidGenerator.g:1028:3: () otherlv_1= 'Spinner' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalAndroidGenerator.g:1028:3: ()
            // InternalAndroidGenerator.g:1029:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpinnerAccess().getSpinnerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSpinnerAccess().getSpinnerKeyword_1());
            		
            // InternalAndroidGenerator.g:1039:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGenerator.g:1040:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:1040:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGenerator.g:1041:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpinnerRule());
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
    // $ANTLR end "ruleSpinner"


    // $ANTLR start "entryRuleButton"
    // InternalAndroidGenerator.g:1061:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalAndroidGenerator.g:1061:47: (iv_ruleButton= ruleButton EOF )
            // InternalAndroidGenerator.g:1062:2: iv_ruleButton= ruleButton EOF
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
    // InternalAndroidGenerator.g:1068:1: ruleButton returns [EObject current=null] : ( () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_actions_3_0= ruleButtonActions ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) ) )* )? ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_actions_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1074:2: ( ( () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_actions_3_0= ruleButtonActions ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) ) )* )? ) )
            // InternalAndroidGenerator.g:1075:2: ( () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_actions_3_0= ruleButtonActions ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) ) )* )? )
            {
            // InternalAndroidGenerator.g:1075:2: ( () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_actions_3_0= ruleButtonActions ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) ) )* )? )
            // InternalAndroidGenerator.g:1076:3: () otherlv_1= 'Button' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_actions_3_0= ruleButtonActions ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) ) )* )?
            {
            // InternalAndroidGenerator.g:1076:3: ()
            // InternalAndroidGenerator.g:1077:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
            		
            // InternalAndroidGenerator.g:1087:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGenerator.g:1088:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:1088:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGenerator.g:1089:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalAndroidGenerator.g:1105:3: ( ( (lv_actions_3_0= ruleButtonActions ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=27 && LA14_0<=28)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAndroidGenerator.g:1106:4: ( (lv_actions_3_0= ruleButtonActions ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) ) )*
                    {
                    // InternalAndroidGenerator.g:1106:4: ( (lv_actions_3_0= ruleButtonActions ) )
                    // InternalAndroidGenerator.g:1107:5: (lv_actions_3_0= ruleButtonActions )
                    {
                    // InternalAndroidGenerator.g:1107:5: (lv_actions_3_0= ruleButtonActions )
                    // InternalAndroidGenerator.g:1108:6: lv_actions_3_0= ruleButtonActions
                    {

                    						newCompositeNode(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_actions_3_0=ruleButtonActions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getButtonRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_3_0,
                    							"org.xtext.example.mdsd.AndroidGenerator.ButtonActions");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAndroidGenerator.g:1125:4: (otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==12) ) {
                            int LA13_1 = input.LA(2);

                            if ( ((LA13_1>=27 && LA13_1<=28)) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAndroidGenerator.g:1126:5: otherlv_4= ',' ( (lv_actions_5_0= ruleButtonActions ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_17); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalAndroidGenerator.g:1130:5: ( (lv_actions_5_0= ruleButtonActions ) )
                    	    // InternalAndroidGenerator.g:1131:6: (lv_actions_5_0= ruleButtonActions )
                    	    {
                    	    // InternalAndroidGenerator.g:1131:6: (lv_actions_5_0= ruleButtonActions )
                    	    // InternalAndroidGenerator.g:1132:7: lv_actions_5_0= ruleButtonActions
                    	    {

                    	    							newCompositeNode(grammarAccess.getButtonAccess().getActionsButtonActionsParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_3);
                    	    lv_actions_5_0=ruleButtonActions();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getButtonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_5_0,
                    	    								"org.xtext.example.mdsd.AndroidGenerator.ButtonActions");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonActions"
    // InternalAndroidGenerator.g:1155:1: entryRuleButtonActions returns [EObject current=null] : iv_ruleButtonActions= ruleButtonActions EOF ;
    public final EObject entryRuleButtonActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonActions = null;


        try {
            // InternalAndroidGenerator.g:1155:54: (iv_ruleButtonActions= ruleButtonActions EOF )
            // InternalAndroidGenerator.g:1156:2: iv_ruleButtonActions= ruleButtonActions EOF
            {
             newCompositeNode(grammarAccess.getButtonActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonActions=ruleButtonActions();

            state._fsp--;

             current =iv_ruleButtonActions; 
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
    // $ANTLR end "entryRuleButtonActions"


    // $ANTLR start "ruleButtonActions"
    // InternalAndroidGenerator.g:1162:1: ruleButtonActions returns [EObject current=null] : (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle ) ;
    public final EObject ruleButtonActions() throws RecognitionException {
        EObject current = null;

        EObject this_Toast_0 = null;

        EObject this_Bundle_1 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1168:2: ( (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle ) )
            // InternalAndroidGenerator.g:1169:2: (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle )
            {
            // InternalAndroidGenerator.g:1169:2: (this_Toast_0= ruleToast | this_Bundle_1= ruleBundle )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAndroidGenerator.g:1170:3: this_Toast_0= ruleToast
                    {

                    			newCompositeNode(grammarAccess.getButtonActionsAccess().getToastParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Toast_0=ruleToast();

                    state._fsp--;


                    			current = this_Toast_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:1179:3: this_Bundle_1= ruleBundle
                    {

                    			newCompositeNode(grammarAccess.getButtonActionsAccess().getBundleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bundle_1=ruleBundle();

                    state._fsp--;


                    			current = this_Bundle_1;
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
    // $ANTLR end "ruleButtonActions"


    // $ANTLR start "entryRuleToast"
    // InternalAndroidGenerator.g:1191:1: entryRuleToast returns [EObject current=null] : iv_ruleToast= ruleToast EOF ;
    public final EObject entryRuleToast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToast = null;


        try {
            // InternalAndroidGenerator.g:1191:46: (iv_ruleToast= ruleToast EOF )
            // InternalAndroidGenerator.g:1192:2: iv_ruleToast= ruleToast EOF
            {
             newCompositeNode(grammarAccess.getToastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToast=ruleToast();

            state._fsp--;

             current =iv_ruleToast; 
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
    // $ANTLR end "entryRuleToast"


    // $ANTLR start "ruleToast"
    // InternalAndroidGenerator.g:1198:1: ruleToast returns [EObject current=null] : (otherlv_0= 'Toast' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleToast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1204:2: ( (otherlv_0= 'Toast' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalAndroidGenerator.g:1205:2: (otherlv_0= 'Toast' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalAndroidGenerator.g:1205:2: (otherlv_0= 'Toast' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalAndroidGenerator.g:1206:3: otherlv_0= 'Toast' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getToastAccess().getToastKeyword_0());
            		
            // InternalAndroidGenerator.g:1210:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalAndroidGenerator.g:1211:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalAndroidGenerator.g:1211:4: (lv_text_1_0= RULE_STRING )
            // InternalAndroidGenerator.g:1212:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getToastAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToastRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleToast"


    // $ANTLR start "entryRuleBundle"
    // InternalAndroidGenerator.g:1232:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // InternalAndroidGenerator.g:1232:47: (iv_ruleBundle= ruleBundle EOF )
            // InternalAndroidGenerator.g:1233:2: iv_ruleBundle= ruleBundle EOF
            {
             newCompositeNode(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBundle=ruleBundle();

            state._fsp--;

             current =iv_ruleBundle; 
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
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // InternalAndroidGenerator.g:1239:1: ruleBundle returns [EObject current=null] : (otherlv_0= 'Bundle' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1245:2: ( (otherlv_0= 'Bundle' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAndroidGenerator.g:1246:2: (otherlv_0= 'Bundle' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAndroidGenerator.g:1246:2: (otherlv_0= 'Bundle' ( (otherlv_1= RULE_ID ) ) )
            // InternalAndroidGenerator.g:1247:3: otherlv_0= 'Bundle' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBundleAccess().getBundleKeyword_0());
            		
            // InternalAndroidGenerator.g:1251:3: ( (otherlv_1= RULE_ID ) )
            // InternalAndroidGenerator.g:1252:4: (otherlv_1= RULE_ID )
            {
            // InternalAndroidGenerator.g:1252:4: (otherlv_1= RULE_ID )
            // InternalAndroidGenerator.g:1253:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBundleRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getBundleAccess().getBundleRecipientFragmentCrossReference_1_0());
            				

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
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleFilterQuery"
    // InternalAndroidGenerator.g:1268:1: entryRuleFilterQuery returns [EObject current=null] : iv_ruleFilterQuery= ruleFilterQuery EOF ;
    public final EObject entryRuleFilterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterQuery = null;


        try {
            // InternalAndroidGenerator.g:1268:52: (iv_ruleFilterQuery= ruleFilterQuery EOF )
            // InternalAndroidGenerator.g:1269:2: iv_ruleFilterQuery= ruleFilterQuery EOF
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
    // InternalAndroidGenerator.g:1275:1: ruleFilterQuery returns [EObject current=null] : ( () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) ) ;
    public final EObject ruleFilterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_filterAttributes_3_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1281:2: ( ( () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) ) )
            // InternalAndroidGenerator.g:1282:2: ( () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) )
            {
            // InternalAndroidGenerator.g:1282:2: ( () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) ) )
            // InternalAndroidGenerator.g:1283:3: () otherlv_1= 'FilterQuery' ( (lv_name_2_0= RULE_ID ) ) ( (lv_filterAttributes_3_0= ruleFilterAttributes ) )
            {
            // InternalAndroidGenerator.g:1283:3: ()
            // InternalAndroidGenerator.g:1284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterQueryAccess().getFilterQueryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterQueryAccess().getFilterQueryKeyword_1());
            		
            // InternalAndroidGenerator.g:1294:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAndroidGenerator.g:1295:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAndroidGenerator.g:1295:4: (lv_name_2_0= RULE_ID )
            // InternalAndroidGenerator.g:1296:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalAndroidGenerator.g:1312:3: ( (lv_filterAttributes_3_0= ruleFilterAttributes ) )
            // InternalAndroidGenerator.g:1313:4: (lv_filterAttributes_3_0= ruleFilterAttributes )
            {
            // InternalAndroidGenerator.g:1313:4: (lv_filterAttributes_3_0= ruleFilterAttributes )
            // InternalAndroidGenerator.g:1314:5: lv_filterAttributes_3_0= ruleFilterAttributes
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
    // InternalAndroidGenerator.g:1335:1: entryRuleFilterAttributes returns [EObject current=null] : iv_ruleFilterAttributes= ruleFilterAttributes EOF ;
    public final EObject entryRuleFilterAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterAttributes = null;


        try {
            // InternalAndroidGenerator.g:1335:57: (iv_ruleFilterAttributes= ruleFilterAttributes EOF )
            // InternalAndroidGenerator.g:1336:2: iv_ruleFilterAttributes= ruleFilterAttributes EOF
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
    // InternalAndroidGenerator.g:1342:1: ruleFilterAttributes returns [EObject current=null] : ( (lv_distance_0_0= ruleDistance ) ) ;
    public final EObject ruleFilterAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_distance_0_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1348:2: ( ( (lv_distance_0_0= ruleDistance ) ) )
            // InternalAndroidGenerator.g:1349:2: ( (lv_distance_0_0= ruleDistance ) )
            {
            // InternalAndroidGenerator.g:1349:2: ( (lv_distance_0_0= ruleDistance ) )
            // InternalAndroidGenerator.g:1350:3: (lv_distance_0_0= ruleDistance )
            {
            // InternalAndroidGenerator.g:1350:3: (lv_distance_0_0= ruleDistance )
            // InternalAndroidGenerator.g:1351:4: lv_distance_0_0= ruleDistance
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
    // InternalAndroidGenerator.g:1371:1: entryRuleDistance returns [EObject current=null] : iv_ruleDistance= ruleDistance EOF ;
    public final EObject entryRuleDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistance = null;


        try {
            // InternalAndroidGenerator.g:1371:49: (iv_ruleDistance= ruleDistance EOF )
            // InternalAndroidGenerator.g:1372:2: iv_ruleDistance= ruleDistance EOF
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
    // InternalAndroidGenerator.g:1378:1: ruleDistance returns [EObject current=null] : (otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) ) ;
    public final EObject ruleDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_unit_2_0 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_results_4_0 = null;



        	enterRule();

        try {
            // InternalAndroidGenerator.g:1384:2: ( (otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) ) )
            // InternalAndroidGenerator.g:1385:2: (otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) )
            {
            // InternalAndroidGenerator.g:1385:2: (otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) ) )
            // InternalAndroidGenerator.g:1386:3: otherlv_0= 'Distance' otherlv_1= ':' ( (lv_unit_2_0= ruleUnit ) ) ( (lv_operator_3_0= ruleOperator ) ) ( (lv_results_4_0= ruleNumber ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDistanceAccess().getDistanceKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceAccess().getColonKeyword_1());
            		
            // InternalAndroidGenerator.g:1394:3: ( (lv_unit_2_0= ruleUnit ) )
            // InternalAndroidGenerator.g:1395:4: (lv_unit_2_0= ruleUnit )
            {
            // InternalAndroidGenerator.g:1395:4: (lv_unit_2_0= ruleUnit )
            // InternalAndroidGenerator.g:1396:5: lv_unit_2_0= ruleUnit
            {

            					newCompositeNode(grammarAccess.getDistanceAccess().getUnitUnitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalAndroidGenerator.g:1413:3: ( (lv_operator_3_0= ruleOperator ) )
            // InternalAndroidGenerator.g:1414:4: (lv_operator_3_0= ruleOperator )
            {
            // InternalAndroidGenerator.g:1414:4: (lv_operator_3_0= ruleOperator )
            // InternalAndroidGenerator.g:1415:5: lv_operator_3_0= ruleOperator
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

            // InternalAndroidGenerator.g:1432:3: ( (lv_results_4_0= ruleNumber ) )
            // InternalAndroidGenerator.g:1433:4: (lv_results_4_0= ruleNumber )
            {
            // InternalAndroidGenerator.g:1433:4: (lv_results_4_0= ruleNumber )
            // InternalAndroidGenerator.g:1434:5: lv_results_4_0= ruleNumber
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
    // InternalAndroidGenerator.g:1455:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalAndroidGenerator.g:1455:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalAndroidGenerator.g:1456:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalAndroidGenerator.g:1462:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1468:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAndroidGenerator.g:1469:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAndroidGenerator.g:1469:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAndroidGenerator.g:1470:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAndroidGenerator.g:1470:3: (lv_value_0_0= RULE_INT )
            // InternalAndroidGenerator.g:1471:4: lv_value_0_0= RULE_INT
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
    // InternalAndroidGenerator.g:1490:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalAndroidGenerator.g:1490:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalAndroidGenerator.g:1491:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalAndroidGenerator.g:1497:1: ruleOperator returns [EObject current=null] : ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '=' ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1503:2: ( ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '=' ) ) )
            // InternalAndroidGenerator.g:1504:2: ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '=' ) )
            {
            // InternalAndroidGenerator.g:1504:2: ( ( () otherlv_1= '>' ) | ( () otherlv_3= '<' ) | ( () otherlv_5= '=' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAndroidGenerator.g:1505:3: ( () otherlv_1= '>' )
                    {
                    // InternalAndroidGenerator.g:1505:3: ( () otherlv_1= '>' )
                    // InternalAndroidGenerator.g:1506:4: () otherlv_1= '>'
                    {
                    // InternalAndroidGenerator.g:1506:4: ()
                    // InternalAndroidGenerator.g:1507:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getLessAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:1519:3: ( () otherlv_3= '<' )
                    {
                    // InternalAndroidGenerator.g:1519:3: ( () otherlv_3= '<' )
                    // InternalAndroidGenerator.g:1520:4: () otherlv_3= '<'
                    {
                    // InternalAndroidGenerator.g:1520:4: ()
                    // InternalAndroidGenerator.g:1521:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getMoreAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getLessThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAndroidGenerator.g:1533:3: ( () otherlv_5= '=' )
                    {
                    // InternalAndroidGenerator.g:1533:3: ( () otherlv_5= '=' )
                    // InternalAndroidGenerator.g:1534:4: () otherlv_5= '='
                    {
                    // InternalAndroidGenerator.g:1534:4: ()
                    // InternalAndroidGenerator.g:1535:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperatorAccess().getEqualAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalAndroidGenerator.g:1550:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // InternalAndroidGenerator.g:1550:45: (iv_ruleUnit= ruleUnit EOF )
            // InternalAndroidGenerator.g:1551:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalAndroidGenerator.g:1557:1: ruleUnit returns [EObject current=null] : ( ( () otherlv_1= 'm' ) | ( () otherlv_3= 'f' ) ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAndroidGenerator.g:1563:2: ( ( ( () otherlv_1= 'm' ) | ( () otherlv_3= 'f' ) ) )
            // InternalAndroidGenerator.g:1564:2: ( ( () otherlv_1= 'm' ) | ( () otherlv_3= 'f' ) )
            {
            // InternalAndroidGenerator.g:1564:2: ( ( () otherlv_1= 'm' ) | ( () otherlv_3= 'f' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAndroidGenerator.g:1565:3: ( () otherlv_1= 'm' )
                    {
                    // InternalAndroidGenerator.g:1565:3: ( () otherlv_1= 'm' )
                    // InternalAndroidGenerator.g:1566:4: () otherlv_1= 'm'
                    {
                    // InternalAndroidGenerator.g:1566:4: ()
                    // InternalAndroidGenerator.g:1567:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnitAccess().getMetersAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getUnitAccess().getMKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAndroidGenerator.g:1579:3: ( () otherlv_3= 'f' )
                    {
                    // InternalAndroidGenerator.g:1579:3: ( () otherlv_3= 'f' )
                    // InternalAndroidGenerator.g:1580:4: () otherlv_3= 'f'
                    {
                    // InternalAndroidGenerator.g:1580:4: ()
                    // InternalAndroidGenerator.g:1581:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnitAccess().getImperialAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000C4002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000380000000L});

}